package Wh;

import Sh.G;
import Sh.J;

/* loaded from: classes5.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final int f13306a;

    /* renamed from: b, reason: collision with root package name */
    public static final G f13307b;

    /* renamed from: c, reason: collision with root package name */
    public static final G f13308c;

    /* renamed from: d, reason: collision with root package name */
    public static final G f13309d;

    /* renamed from: e, reason: collision with root package name */
    public static final G f13310e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f13311f;

    static {
        int e10;
        int e11;
        e10 = J.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
        f13306a = e10;
        f13307b = new G("PERMIT");
        f13308c = new G("TAKEN");
        f13309d = new G("BROKEN");
        f13310e = new G("CANCELLED");
        e11 = J.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);
        f13311f = e11;
    }

    public static final h a(int i10, int i11) {
        return new k(i10, i11);
    }

    public static /* synthetic */ h b(int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return a(i10, i11);
    }

    public static final m j(long j10, m mVar) {
        return new m(j10, mVar, 0);
    }
}
