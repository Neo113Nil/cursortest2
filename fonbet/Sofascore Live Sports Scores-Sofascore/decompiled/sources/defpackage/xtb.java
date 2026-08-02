package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xtb {
    public static vtb a(Object obj, Object obj2) {
        vtb vtbVar = (vtb) obj;
        vtb vtbVar2 = (vtb) obj2;
        if (!vtbVar2.isEmpty()) {
            if (!vtbVar.a) {
                vtbVar = vtbVar.i();
            }
            vtbVar.g();
            if (!vtbVar2.isEmpty()) {
                vtbVar.putAll(vtbVar2);
            }
        }
        return vtbVar;
    }
}
