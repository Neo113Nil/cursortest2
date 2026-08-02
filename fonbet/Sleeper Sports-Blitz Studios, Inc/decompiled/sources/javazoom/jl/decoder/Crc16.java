package javazoom.jl.decoder;

/* loaded from: classes9.dex */
public final class Crc16 {
    private static short polynomial = -32763;
    private short crc = -1;

    public void add_bits(int i, int i2) {
        int i3 = 1 << (i2 - 1);
        do {
            short s = this.crc;
            if (((32768 & s) == 0) ^ ((i & i3) == 0)) {
                this.crc = (short) (((short) (s << 1)) ^ polynomial);
            } else {
                this.crc = (short) (s << 1);
            }
            i3 >>>= 1;
        } while (i3 != 0);
    }

    public short checksum() {
        short s = this.crc;
        this.crc = (short) -1;
        return s;
    }
}
