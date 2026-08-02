package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class vgo extends tgo {
    public static final int b = Integer.numberOfLeadingZeros(31);
    public static final vgo c = new vgo("CharMatcher.whitespace()");

    @Override // com.google.android.gms.internal.ads.zzgty
    public final boolean a(char c2) {
        return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c2) >>> b) == c2;
    }
}
