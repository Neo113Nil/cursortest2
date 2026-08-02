package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dcb {
    public static t7a a(Object obj, long j) {
        t7a t7aVar = (t7a) vck.h(obj, j);
        if (((mff) t7aVar).a) {
            return t7aVar;
        }
        mff mffVar = (mff) t7aVar;
        int i = mffVar.c;
        mff e = mffVar.e(i == 0 ? 10 : i * 2);
        vck.o(j, obj, e);
        return e;
    }
}
