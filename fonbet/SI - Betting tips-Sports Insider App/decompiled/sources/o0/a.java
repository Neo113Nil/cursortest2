package o0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f21060e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f21061a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21062b;

    /* renamed from: c, reason: collision with root package name */
    public int f21063c;

    /* renamed from: d, reason: collision with root package name */
    public char f21064d;

    static {
        for (int i5 = 0; i5 < 1792; i5++) {
            f21060e[i5] = Character.getDirectionality(i5);
        }
    }

    public a(CharSequence charSequence) {
        this.f21061a = charSequence;
        this.f21062b = charSequence.length();
    }

    public final byte a() {
        int i5 = this.f21063c - 1;
        CharSequence charSequence = this.f21061a;
        char charAt = charSequence.charAt(i5);
        this.f21064d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f21063c);
            this.f21063c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f21063c--;
        char c2 = this.f21064d;
        return c2 < 1792 ? f21060e[c2] : Character.getDirectionality(c2);
    }
}
