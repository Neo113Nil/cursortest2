package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class sdp implements nap {
    @Override // defpackage.nap
    public final map a(h9p h9pVar, z6n z6nVar) {
        Class cls = z6nVar.a;
        if (!Enum.class.isAssignableFrom(cls) || cls == Enum.class) {
            return null;
        }
        if (!cls.isEnum()) {
            cls = cls.getSuperclass();
        }
        return new udp(cls);
    }
}
