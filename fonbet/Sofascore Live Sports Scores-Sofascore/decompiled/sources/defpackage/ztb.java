package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ztb {
    public static wtb a(Object obj, Object obj2) {
        wtb wtbVar = (wtb) obj;
        wtb wtbVar2 = (wtb) obj2;
        if (!wtbVar2.isEmpty()) {
            if (!wtbVar.a) {
                wtbVar = wtbVar.i();
            }
            wtbVar.g();
            if (!wtbVar2.isEmpty()) {
                wtbVar.putAll(wtbVar2);
            }
        }
        return wtbVar;
    }
}
