package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xaj {
    public static final x3f f = new x3f(4);
    public final jwj a;
    public final dfj b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public xaj(jwj jwjVar, dfj dfjVar, boolean z, boolean z2, boolean z3) {
        this.a = jwjVar;
        this.b = dfjVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NonMeasureInputs(textFieldState=");
        sb.append(this.a);
        sb.append(", textStyle=");
        sb.append(this.b);
        sb.append(", singleLine=");
        sb.append(this.c);
        sb.append(", softWrap=");
        sb.append(this.d);
        sb.append(", isKeyboardTypePhone=");
        return lnb.r(sb, this.e, ')');
    }
}
