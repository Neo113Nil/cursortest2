package defpackage;

import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class ap5 extends y0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap5(k6g k6gVar, int i) {
        super(k6gVar);
        k6gVar.getClass();
        switch (i) {
            case 1:
                super(k6gVar);
                break;
            default:
                break;
        }
    }

    public xbb B(Object[] objArr) {
        objArr.getClass();
        mni a = a();
        try {
            xbb b = a.b();
            for (Object obj : objArr) {
                v(a, obj);
                b.add(Long.valueOf(a.h0()));
            }
            xbb a2 = a.a(b);
            m(a);
            return a2;
        } catch (Throwable th) {
            m(a);
            throw th;
        }
    }

    public abstract void v(mni mniVar, Object obj);

    public long z(Object obj) {
        mni a = a();
        try {
            v(a, obj);
            return a.h0();
        } finally {
            m(a);
        }
    }
}
