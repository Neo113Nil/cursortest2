package javazoom.jl.converter;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.IOException;
import java.io.RandomAccessFile;
import kotlin.UShort;

/* loaded from: classes9.dex */
public class RiffFile {
    public static final int DDC_FAILURE = 1;
    public static final int DDC_FILE_ERROR = 3;
    public static final int DDC_INVALID_CALL = 4;
    public static final int DDC_INVALID_FILE = 6;
    public static final int DDC_OUT_OF_MEMORY = 2;
    public static final int DDC_SUCCESS = 0;
    public static final int DDC_USER_ABORT = 5;
    public static final int RFM_READ = 2;
    public static final int RFM_UNKNOWN = 0;
    public static final int RFM_WRITE = 1;
    protected RandomAccessFile file = null;
    protected int fmode = 0;
    private RiffChunkHeader riff_header;

    class RiffChunkHeader {
        public int ckID = 0;
        public int ckSize = 0;

        public RiffChunkHeader() {
        }
    }

    public RiffFile() {
        RiffChunkHeader riffChunkHeader = new RiffChunkHeader();
        this.riff_header = riffChunkHeader;
        riffChunkHeader.ckID = FourCC("RIFF");
        this.riff_header.ckSize = 0;
    }

    public int CurrentFileMode() {
        return this.fmode;
    }

    public int Open(String str, int i) {
        int Close = this.fmode != 0 ? Close() : 0;
        if (Close != 0) {
            return Close;
        }
        if (i == 1) {
            try {
                this.file = new RandomAccessFile(str, "rw");
                try {
                    byte b = (byte) ((this.riff_header.ckID >>> 24) & 255);
                    byte b2 = (byte) ((this.riff_header.ckID >>> 16) & 255);
                    byte b3 = (byte) ((this.riff_header.ckID >>> 8) & 255);
                    byte b4 = (byte) (this.riff_header.ckID & 255);
                    byte b5 = (byte) ((this.riff_header.ckSize >>> 24) & 255);
                    this.file.write(new byte[]{b, b2, b3, b4, (byte) (this.riff_header.ckSize & 255), (byte) ((this.riff_header.ckSize >>> 8) & 255), (byte) ((this.riff_header.ckSize >>> 16) & 255), b5}, 0, 8);
                    this.fmode = 1;
                    return Close;
                } catch (IOException unused) {
                    this.file.close();
                    this.fmode = 0;
                    return Close;
                }
            } catch (IOException unused2) {
                this.fmode = 0;
            }
        } else {
            if (i != 2) {
                return 4;
            }
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(str, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR);
                this.file = randomAccessFile;
                try {
                    byte[] bArr = new byte[8];
                    randomAccessFile.read(bArr, 0, 8);
                    this.fmode = 2;
                    this.riff_header.ckID = ((bArr[2] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | ((bArr[1] << 16) & 16711680) | ((bArr[0] << 24) & ViewCompat.MEASURED_STATE_MASK) | (bArr[3] & 255);
                    this.riff_header.ckSize = (bArr[7] & 255) | ((bArr[6] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | ((bArr[5] << 16) & 16711680) | ((bArr[4] << 24) & ViewCompat.MEASURED_STATE_MASK);
                } catch (IOException unused3) {
                    this.file.close();
                    this.fmode = 0;
                }
                return Close;
            } catch (IOException unused4) {
                this.fmode = 0;
            }
        }
        return 3;
    }

    public int Write(byte[] bArr, int i) {
        if (this.fmode != 1) {
            return 4;
        }
        try {
            this.file.write(bArr, 0, i);
            this.fmode = 1;
            this.riff_header.ckSize += i;
            return 0;
        } catch (IOException unused) {
            return 3;
        }
    }

    public int Write(short[] sArr, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3 += 2) {
            short s = sArr[i2];
            bArr[i3] = (byte) (s & 255);
            i2++;
            bArr[i3 + 1] = (byte) ((s >>> 8) & 255);
        }
        if (this.fmode != 1) {
            return 4;
        }
        try {
            this.file.write(bArr, 0, i);
            this.fmode = 1;
            this.riff_header.ckSize += i;
            return 0;
        } catch (IOException unused) {
            return 3;
        }
    }

    public int Write(RiffChunkHeader riffChunkHeader, int i) {
        byte b = (byte) ((riffChunkHeader.ckID >>> 24) & 255);
        byte b2 = (byte) ((riffChunkHeader.ckID >>> 16) & 255);
        byte b3 = (byte) ((riffChunkHeader.ckID >>> 8) & 255);
        byte b4 = (byte) (riffChunkHeader.ckID & 255);
        byte b5 = (byte) ((riffChunkHeader.ckSize >>> 24) & 255);
        byte[] bArr = {b, b2, b3, b4, (byte) (riffChunkHeader.ckSize & 255), (byte) ((riffChunkHeader.ckSize >>> 8) & 255), (byte) ((riffChunkHeader.ckSize >>> 16) & 255), b5};
        if (this.fmode != 1) {
            return 4;
        }
        try {
            this.file.write(bArr, 0, i);
            this.fmode = 1;
            this.riff_header.ckSize += i;
            return 0;
        } catch (IOException unused) {
            return 3;
        }
    }

    public int Write(short s, int i) {
        short s2 = (short) (((s << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | ((s >>> 8) & 255));
        if (this.fmode != 1) {
            return 4;
        }
        try {
            this.file.writeShort(s2);
            this.fmode = 1;
            this.riff_header.ckSize += i;
            return 0;
        } catch (IOException unused) {
            return 3;
        }
    }

    public int Write(int i, int i2) {
        short s = (short) ((i >>> 16) & 65535);
        short s2 = (short) (i & 65535);
        int i3 = ((((short) (((s2 << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | ((s2 >>> 8) & 255))) << 16) & (-65536)) | (((short) (((s << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | ((s >>> 8) & 255))) & UShort.MAX_VALUE);
        if (this.fmode != 1) {
            return 4;
        }
        try {
            this.file.writeInt(i3);
            this.fmode = 1;
            this.riff_header.ckSize += i2;
            return 0;
        } catch (IOException unused) {
            return 3;
        }
    }

    public int Read(byte[] bArr, int i) {
        try {
            this.file.read(bArr, 0, i);
            return 0;
        } catch (IOException unused) {
            return 3;
        }
    }

    public int Expect(String str, int i) {
        int i2 = 0;
        while (true) {
            int i3 = i - 1;
            if (i == 0) {
                return 0;
            }
            try {
                int i4 = i2 + 1;
                if (this.file.readByte() != str.charAt(i2)) {
                    return 3;
                }
                i = i3;
                i2 = i4;
            } catch (IOException unused) {
                return 3;
            }
        }
    }

    public int Close() {
        int i = this.fmode;
        int i2 = 3;
        if (i == 1) {
            this.file.seek(0L);
            this.file.write(new byte[]{(byte) ((this.riff_header.ckID >>> 24) & 255), (byte) ((this.riff_header.ckID >>> 16) & 255), (byte) ((this.riff_header.ckID >>> 8) & 255), (byte) (this.riff_header.ckID & 255), (byte) (this.riff_header.ckSize & 255), (byte) ((this.riff_header.ckSize >>> 8) & 255), (byte) ((this.riff_header.ckSize >>> 16) & 255), (byte) ((this.riff_header.ckSize >>> 24) & 255)}, 0, 8);
            this.file.close();
        } else {
            if (i == 2) {
                this.file.close();
            }
            i2 = 0;
            this.file = null;
            this.fmode = 0;
            return i2;
        }
        i2 = 0;
        this.file = null;
        this.fmode = 0;
        return i2;
    }

    public long CurrentFilePosition() {
        try {
            return this.file.getFilePointer();
        } catch (IOException unused) {
            return -1L;
        }
    }

    public int Backpatch(long j, RiffChunkHeader riffChunkHeader, int i) {
        RandomAccessFile randomAccessFile = this.file;
        if (randomAccessFile == null) {
            return 4;
        }
        try {
            randomAccessFile.seek(j);
            return Write(riffChunkHeader, i);
        } catch (IOException unused) {
            return 3;
        }
    }

    public int Backpatch(long j, byte[] bArr, int i) {
        RandomAccessFile randomAccessFile = this.file;
        if (randomAccessFile == null) {
            return 4;
        }
        try {
            randomAccessFile.seek(j);
            return Write(bArr, i);
        } catch (IOException unused) {
            return 3;
        }
    }

    protected int Seek(long j) {
        try {
            this.file.seek(j);
            return 0;
        } catch (IOException unused) {
            return 3;
        }
    }

    private String DDCRET_String(int i) {
        switch (i) {
            case 0:
                return "DDC_SUCCESS";
            case 1:
                return "DDC_FAILURE";
            case 2:
                return "DDC_OUT_OF_MEMORY";
            case 3:
                return "DDC_FILE_ERROR";
            case 4:
                return "DDC_INVALID_CALL";
            case 5:
                return "DDC_USER_ABORT";
            case 6:
                return "DDC_INVALID_FILE";
            default:
                return "Unknown Error";
        }
    }

    public static int FourCC(String str) {
        byte[] bArr = {32, 32, 32, 32};
        str.getBytes(0, 4, bArr, 0);
        return ((bArr[0] << 24) & ViewCompat.MEASURED_STATE_MASK) | ((bArr[1] << 16) & 16711680) | ((bArr[2] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | (bArr[3] & 255);
    }
}
