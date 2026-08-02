package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class mbn {
    public static final kbn a(Object obj, Object obj2) {
        kbn kbnVar = (kbn) obj;
        kbn kbnVar2 = (kbn) obj2;
        if (!kbnVar2.isEmpty()) {
            if (!kbnVar.a) {
                kbnVar = kbnVar.g();
            }
            kbnVar.i();
            if (!kbnVar2.isEmpty()) {
                kbnVar.putAll(kbnVar2);
            }
        }
        return kbnVar;
    }
}
