package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class uan {
    public static final ian a(Object obj, long j) {
        ian ianVar = (ian) qdn.i(obj, j);
        if (((m7n) ianVar).a) {
            return ianVar;
        }
        int size = ianVar.size();
        ian f = ianVar.f(size == 0 ? 10 : size + size);
        qdn.j(j, obj, f);
        return f;
    }
}
