package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cj2 implements zd8 {
    public static final cj2 a = new cj2();
    public static Boolean b;

    @Override // defpackage.zd8
    public final void b(boolean z) {
        b = Boolean.valueOf(z);
    }

    @Override // defpackage.zd8
    public final boolean e() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw wt3.j("canFocus is read before it is written");
    }
}
