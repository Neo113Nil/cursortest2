package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class t0l {
    public final String a;
    public final s0l b;

    public t0l(String str, s0l s0lVar) {
        if (str.isEmpty() || str.charAt(0) != '/') {
            a70.p("Path should start with a slash '/'.");
            throw null;
        }
        if (!str.endsWith("/")) {
            a70.p("Path should end with a slash '/'");
            throw null;
        }
        this.a = str;
        this.b = s0lVar;
    }
}
