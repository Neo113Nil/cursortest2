package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kd2 extends dd2 {
    public static kd2 q(String str) {
        kd2 kd2Var = new kd2(str.toCharArray());
        kd2Var.b = 0L;
        kd2Var.p(str.length() - 1);
        return kd2Var;
    }

    @Override // defpackage.dd2
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof kd2) && e().equals(((kd2) obj).e())) {
            return true;
        }
        return super.equals(obj);
    }
}
