package javazoom.jl.decoder;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* loaded from: classes9.dex */
public final class Bitstream implements BitstreamErrors {
    private static final int BUFFER_INT_SIZE = 433;
    static byte INITIAL_SYNC = 0;
    static byte STRICT_SYNC = 1;
    private int bitindex;
    private boolean firstframe;
    private int framesize;
    private boolean single_ch_mode;
    private final PushbackInputStream source;
    private int syncword;
    private int wordpointer;
    private final int[] framebuffer = new int[BUFFER_INT_SIZE];
    private byte[] frame_bytes = new byte[1732];
    private int header_pos = 0;
    private final int[] bitmask = {0, 1, 3, 7, 15, 31, 63, 127, 255, 511, AnalyticsListener.EVENT_DRM_KEYS_LOADED, 2047, 4095, 8191, 16383, 32767, 65535, 131071};
    private final Header header = new Header();
    private final byte[] syncbuf = new byte[4];
    private Crc16[] crc = new Crc16[1];
    private byte[] rawid3v2 = null;

    public Bitstream(InputStream inputStream) {
        this.firstframe = true;
        if (inputStream == null) {
            throw new NullPointerException("in");
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        loadID3v2(bufferedInputStream);
        this.firstframe = true;
        this.source = new PushbackInputStream(bufferedInputStream, 1732);
        closeFrame();
    }

    public int header_pos() {
        return this.header_pos;
    }

    private void loadID3v2(InputStream inputStream) {
        int i = -1;
        try {
            inputStream.mark(10);
            i = readID3v2Header(inputStream);
            this.header_pos = i;
        } catch (IOException unused) {
        } catch (Throwable th) {
            try {
                inputStream.reset();
            } catch (IOException unused2) {
            }
            throw th;
        }
        try {
            inputStream.reset();
        } catch (IOException unused3) {
        }
        if (i > 0) {
            try {
                byte[] bArr = new byte[i];
                this.rawid3v2 = bArr;
                inputStream.read(bArr, 0, bArr.length);
            } catch (IOException unused4) {
            }
        }
    }

    private int readID3v2Header(InputStream inputStream) throws IOException {
        int i;
        byte[] bArr = new byte[4];
        inputStream.read(bArr, 0, 3);
        if (bArr[0] == 73 && bArr[1] == 68 && bArr[2] == 51) {
            inputStream.read(bArr, 0, 3);
            byte b = bArr[0];
            byte b2 = bArr[1];
            inputStream.read(bArr, 0, 4);
            i = (bArr[0] << 21) + (bArr[1] << 14) + (bArr[2] << 7) + bArr[3];
        } else {
            i = -10;
        }
        return i + 10;
    }

    public InputStream getRawID3v2() {
        if (this.rawid3v2 == null) {
            return null;
        }
        return new ByteArrayInputStream(this.rawid3v2);
    }

    public void close() throws BitstreamException {
        try {
            this.source.close();
        } catch (IOException e) {
            throw newBitstreamException(258, e);
        }
    }

    public Header readFrame() throws BitstreamException {
        Header header;
        try {
            header = readNextFrame();
            try {
                if (this.firstframe) {
                    header.parseVBR(this.frame_bytes);
                    this.firstframe = false;
                }
                return header;
            } catch (BitstreamException e) {
                e = e;
                if (e.getErrorCode() == 261) {
                    try {
                        closeFrame();
                        return readNextFrame();
                    } catch (BitstreamException e2) {
                        if (e2.getErrorCode() == 260) {
                            return header;
                        }
                        throw newBitstreamException(e2.getErrorCode(), e2);
                    }
                }
                if (e.getErrorCode() == 260) {
                    return header;
                }
                throw newBitstreamException(e.getErrorCode(), e);
            }
        } catch (BitstreamException e3) {
            e = e3;
            header = null;
        }
    }

    private Header readNextFrame() throws BitstreamException {
        if (this.framesize == -1) {
            nextFrame();
        }
        return this.header;
    }

    private void nextFrame() throws BitstreamException {
        this.header.read_header(this, this.crc);
    }

    public void unreadFrame() throws BitstreamException {
        int i;
        if (this.wordpointer == -1 && this.bitindex == -1 && (i = this.framesize) > 0) {
            try {
                this.source.unread(this.frame_bytes, 0, i);
            } catch (IOException unused) {
                throw newBitstreamException(258);
            }
        }
    }

    public void closeFrame() {
        this.framesize = -1;
        this.wordpointer = -1;
        this.bitindex = -1;
    }

    public boolean isSyncCurrentPosition(int i) throws BitstreamException {
        int readBytes = readBytes(this.syncbuf, 0, 4);
        byte[] bArr = this.syncbuf;
        int i2 = ((bArr[0] << 24) & ViewCompat.MEASURED_STATE_MASK) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | (bArr[3] & 255);
        try {
            this.source.unread(bArr, 0, readBytes);
        } catch (IOException unused) {
        }
        if (readBytes == 0) {
            return true;
        }
        if (readBytes != 4) {
            return false;
        }
        return isSyncMark(i2, i, this.syncword);
    }

    public int readBits(int i) {
        return get_bits(i);
    }

    public int readCheckedBits(int i) {
        return get_bits(i);
    }

    protected BitstreamException newBitstreamException(int i) {
        return new BitstreamException(i, (Throwable) null);
    }

    protected BitstreamException newBitstreamException(int i, Throwable th) {
        return new BitstreamException(i, th);
    }

    int syncHeader(byte b) throws BitstreamException {
        if (readBytes(this.syncbuf, 0, 3) != 3) {
            throw newBitstreamException(BitstreamErrors.STREAM_EOF, null);
        }
        byte[] bArr = this.syncbuf;
        int i = (bArr[2] & 255) | ((bArr[0] << 16) & 16711680) | ((bArr[1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
        do {
            int i2 = i << 8;
            if (readBytes(this.syncbuf, 3, 1) != 1) {
                throw newBitstreamException(BitstreamErrors.STREAM_EOF, null);
            }
            i = i2 | (this.syncbuf[3] & 255);
        } while (!isSyncMark(i, b, this.syncword));
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0021, code lost:
    
        if (((r4 & 192) == 192) == r3.single_ch_mode) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if ((r4 & (-2097152)) == (-2097152)) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isSyncMark(int i, int i2, int i3) {
        boolean z;
        if (i2 != INITIAL_SYNC) {
            if (((-521216) & i) == i3) {
            }
            z = false;
        }
        if (z) {
            z = ((i >>> 10) & 3) != 3;
        }
        if (z) {
            z = ((i >>> 17) & 3) != 0;
        }
        return z ? ((i >>> 19) & 3) != 1 : z;
    }

    int read_frame_data(int i) throws BitstreamException {
        int readFully = readFully(this.frame_bytes, 0, i);
        this.framesize = i;
        this.wordpointer = -1;
        this.bitindex = -1;
        return readFully;
    }

    void parse_frame() throws BitstreamException {
        byte[] bArr = this.frame_bytes;
        int i = this.framesize;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = i2 + 1;
            int i5 = i2 + 2;
            int i6 = i2 + 3;
            this.framebuffer[i3] = ((bArr[i2] << 24) & ViewCompat.MEASURED_STATE_MASK) | (((i4 < i ? bArr[i4] : (byte) 0) << 16) & 16711680) | (((i5 < i ? bArr[i5] : (byte) 0) << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | ((i6 < i ? bArr[i6] : (byte) 0) & 255);
            i2 += 4;
            i3++;
        }
        this.wordpointer = 0;
        this.bitindex = 0;
    }

    public int get_bits(int i) {
        int i2 = this.bitindex;
        int i3 = i2 + i;
        if (this.wordpointer < 0) {
            this.wordpointer = 0;
        }
        if (i3 <= 32) {
            int[] iArr = this.framebuffer;
            int i4 = this.wordpointer;
            int i5 = (iArr[i4] >>> (32 - i3)) & this.bitmask[i];
            int i6 = i2 + i;
            this.bitindex = i6;
            if (i6 == 32) {
                this.bitindex = 0;
                this.wordpointer = i4 + 1;
            }
            return i5;
        }
        int[] iArr2 = this.framebuffer;
        int i7 = this.wordpointer;
        int i8 = iArr2[i7] & 65535;
        int i9 = i7 + 1;
        this.wordpointer = i9;
        int i10 = this.bitmask[i] & (((((iArr2[i9] & (-65536)) >>> 16) & 65535) | ((-65536) & (i8 << 16))) >>> (48 - i3));
        this.bitindex = i3 - 32;
        return i10;
    }

    void set_syncword(int i) {
        this.syncword = i & (-193);
        this.single_ch_mode = (i & 192) == 192;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0011, code lost:
    
        r7 = r6 + 1;
        r5[r6] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0015, code lost:
    
        r6 = r7;
        r7 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000d, code lost:
    
        r2 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x000f, code lost:
    
        if (r7 <= 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int readFully(byte[] bArr, int i, int i2) throws BitstreamException {
        int i3 = 0;
        while (true) {
            if (i2 <= 0) {
                break;
            }
            try {
                int read = this.source.read(bArr, i, i2);
                if (read == -1) {
                    break;
                }
                i3 += read;
                i += read;
                i2 -= read;
            } catch (IOException e) {
                throw newBitstreamException(258, e);
            }
        }
        return i3;
    }

    private int readBytes(byte[] bArr, int i, int i2) throws BitstreamException {
        int i3 = 0;
        while (i2 > 0) {
            try {
                int read = this.source.read(bArr, i, i2);
                if (read == -1) {
                    break;
                }
                i3 += read;
                i += read;
                i2 -= read;
            } catch (IOException e) {
                throw newBitstreamException(258, e);
            }
        }
        return i3;
    }
}
