package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface zli {
    void h(byte[] bArr, int i, int i2, yli yliVar, wn3 wn3Var);

    default lli j(int i, int i2, byte[] bArr) {
        zu9 s = hv9.s();
        h(bArr, 0, i2, yli.c, new imf(s, 19));
        return new r74(s.g());
    }

    int l();

    default void reset() {
    }
}
