package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c9p {
    public static final c9p d = new c9p("", "", false);
    public final String a;
    public final String b;
    public final boolean c;

    static {
        new c9p("\n", "  ", true);
    }

    public c9p(String str, String str2, boolean z) {
        if (!str.matches("[\r\n]*")) {
            a70.p("Only combinations of \\n and \\r are allowed in newline.");
            throw null;
        }
        if (!str2.matches("[ \t]*")) {
            a70.p("Only combinations of spaces and tabs are allowed in indent.");
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = z;
    }
}
