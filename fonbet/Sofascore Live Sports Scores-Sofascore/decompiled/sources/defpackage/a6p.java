package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class a6p {
    public static final u5p a;

    static {
        new v5p("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new v5p("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new x5p("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new x5p("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        a = new u5p(new t5p("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    public abstract void a(StringBuilder sb, byte[] bArr, int i);

    public abstract int b(byte[] bArr, CharSequence charSequence);

    public abstract int c(int i);

    public abstract int d(int i);

    public CharSequence e(CharSequence charSequence) {
        throw null;
    }

    public final byte[] f(String str) {
        try {
            CharSequence e = e(str);
            int d = d(e.length());
            byte[] bArr = new byte[d];
            int b = b(bArr, e);
            if (b == d) {
                return bArr;
            }
            byte[] bArr2 = new byte[b];
            System.arraycopy(bArr, 0, bArr2, 0, b);
            return bArr2;
        } catch (w5p e2) {
            ilg.k(e2);
            return null;
        }
    }
}
