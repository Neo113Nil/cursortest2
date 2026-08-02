package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class sgo extends rgo {
    public final char a;

    public sgo(char c) {
        this.a = c;
    }

    @Override // com.google.android.gms.internal.ads.zzgty
    public final boolean a(char c) {
        return c == this.a;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i = this.a;
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        String copyValueOf = String.copyValueOf(cArr);
        return wt3.m("CharMatcher.is('", copyValueOf, new StringBuilder(String.valueOf(copyValueOf).length() + 18), "')");
    }
}
