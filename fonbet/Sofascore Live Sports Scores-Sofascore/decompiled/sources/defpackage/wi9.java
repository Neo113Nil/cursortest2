package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wi9 extends RuntimeException {
    public final int a;
    public final String b;
    public final transient c2g c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wi9(c2g c2gVar) {
        super(r0.toString());
        StringBuilder sb = new StringBuilder("HTTP ");
        d2g d2gVar = c2gVar.a;
        int i = d2gVar.d;
        sb.append(i);
        sb.append(" ");
        String str = d2gVar.c;
        sb.append(str);
        this.a = i;
        this.b = str;
        this.c = c2gVar;
    }
}
