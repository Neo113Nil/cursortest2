package m1;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import okio.Segment;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class b extends InputStream implements DataInput {

    /* renamed from: a, reason: collision with root package name */
    public final DataInputStream f20139a;

    /* renamed from: b, reason: collision with root package name */
    public int f20140b;

    /* renamed from: c, reason: collision with root package name */
    public ByteOrder f20141c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f20142d;

    /* renamed from: e, reason: collision with root package name */
    public final int f20143e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(byte[] bArr) {
        this(r0, 0);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.f20143e = bArr.length;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f20139a.available();
    }

    public final void c(int i5) {
        int i10 = 0;
        while (i10 < i5) {
            int i11 = i5 - i10;
            DataInputStream dataInputStream = this.f20139a;
            int skip = (int) dataInputStream.skip(i11);
            if (skip <= 0) {
                if (this.f20142d == null) {
                    this.f20142d = new byte[Segment.SIZE];
                }
                skip = dataInputStream.read(this.f20142d, 0, Math.min(Segment.SIZE, i11));
                if (skip == -1) {
                    throw new EOFException(d9.e.f(i5, "Reached EOF while skipping ", " bytes."));
                }
            }
            i10 += skip;
        }
        this.f20140b += i10;
    }

    @Override // java.io.InputStream
    public final void mark(int i5) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f20140b++;
        return this.f20139a.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f20140b++;
        return this.f20139a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.f20140b++;
        int read = this.f20139a.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f20140b += 2;
        return this.f20139a.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i5, int i10) {
        this.f20140b += i10;
        this.f20139a.readFully(bArr, i5, i10);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.f20140b += 4;
        DataInputStream dataInputStream = this.f20139a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f20141c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new IOException("Invalid byte order: " + this.f20141c);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        long j;
        long j6;
        this.f20140b += 8;
        DataInputStream dataInputStream = this.f20139a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f20141c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            j = (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8);
            j6 = read;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                throw new IOException("Invalid byte order: " + this.f20141c);
            }
            j = (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8);
            j6 = read8;
        }
        return j + j6;
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.f20140b += 2;
        DataInputStream dataInputStream = this.f20139a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f20141c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((read2 << 8) + read);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((read << 8) + read2);
        }
        throw new IOException("Invalid byte order: " + this.f20141c);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f20140b += 2;
        return this.f20139a.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f20140b++;
        return this.f20139a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.f20140b += 2;
        DataInputStream dataInputStream = this.f20139a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f20141c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 8) + read2;
        }
        throw new IOException("Invalid byte order: " + this.f20141c);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i5) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i5, int i10) {
        int read = this.f20139a.read(bArr, i5, i10);
        this.f20140b += read;
        return read;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.f20140b += bArr.length;
        this.f20139a.readFully(bArr);
    }

    public b(InputStream inputStream, int i5) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f20139a = dataInputStream;
        dataInputStream.mark(0);
        this.f20140b = 0;
        this.f20141c = byteOrder;
        this.f20143e = inputStream instanceof b ? ((b) inputStream).f20143e : -1;
    }
}
