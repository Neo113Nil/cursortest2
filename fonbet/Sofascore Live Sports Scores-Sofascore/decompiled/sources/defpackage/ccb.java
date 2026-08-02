package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ccb {
    public static s7a a(Object obj, long j) {
        s7a s7aVar = (s7a) tck.h(obj, j);
        if (((lff) s7aVar).a) {
            return s7aVar;
        }
        lff lffVar = (lff) s7aVar;
        int i = lffVar.c;
        lff e = lffVar.e(i == 0 ? 10 : i * 2);
        tck.o(j, obj, e);
        return e;
    }
}
