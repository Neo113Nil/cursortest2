package javazoom.jl.decoder;

/* loaded from: classes9.dex */
final class BitReserve {
    private static final int BUFSIZE = 32768;
    private static final int BUFSIZE_MASK = 32767;
    private int buf_bit_idx;
    private final int[] buf = new int[32768];
    private int offset = 0;
    private int totbit = 0;
    private int buf_byte_idx = 0;

    BitReserve() {
    }

    public int hsstell() {
        return this.totbit;
    }

    public int hgetbits(int i) {
        int i2;
        this.totbit += i;
        int i3 = this.buf_byte_idx;
        if (i3 + i >= 32768) {
            i2 = 0;
            while (true) {
                int i4 = i - 1;
                if (i <= 0) {
                    break;
                }
                i2 = (this.buf[i3] != 0 ? 1 : 0) | (i2 << 1);
                i3 = (i3 + 1) & 32767;
                i = i4;
            }
        } else {
            i2 = 0;
            while (true) {
                int i5 = i - 1;
                if (i <= 0) {
                    break;
                }
                int i6 = i3 + 1;
                i2 = (i2 << 1) | (this.buf[i3] != 0 ? 1 : 0);
                i = i5;
                i3 = i6;
            }
        }
        this.buf_byte_idx = i3;
        return i2;
    }

    public int hget1bit() {
        this.totbit++;
        int[] iArr = this.buf;
        int i = this.buf_byte_idx;
        int i2 = iArr[i];
        this.buf_byte_idx = (i + 1) & 32767;
        return i2;
    }

    public void hputbuf(int i) {
        int i2 = this.offset;
        int[] iArr = this.buf;
        iArr[i2] = i & 128;
        iArr[i2 + 1] = i & 64;
        iArr[i2 + 2] = i & 32;
        iArr[i2 + 3] = i & 16;
        iArr[i2 + 4] = i & 8;
        iArr[i2 + 5] = i & 4;
        int i3 = i2 + 7;
        iArr[i2 + 6] = i & 2;
        int i4 = i2 + 8;
        iArr[i3] = i & 1;
        if (i4 == 32768) {
            this.offset = 0;
        } else {
            this.offset = i4;
        }
    }

    public void rewindNbits(int i) {
        this.totbit -= i;
        int i2 = this.buf_byte_idx - i;
        this.buf_byte_idx = i2;
        if (i2 < 0) {
            this.buf_byte_idx = i2 + 32768;
        }
    }

    public void rewindNbytes(int i) {
        int i2 = i << 3;
        this.totbit -= i2;
        int i3 = this.buf_byte_idx - i2;
        this.buf_byte_idx = i3;
        if (i3 < 0) {
            this.buf_byte_idx = i3 + 32768;
        }
    }
}
