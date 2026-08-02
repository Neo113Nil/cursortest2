package pd;

import hg.d1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j implements hg.h {

    /* renamed from: b, reason: collision with root package name */
    public static final j f21771b = new j(0);

    /* renamed from: c, reason: collision with root package name */
    public static final j f21772c = new j(1);

    /* renamed from: d, reason: collision with root package name */
    public static final j f21773d = new j(2);

    /* renamed from: e, reason: collision with root package name */
    public static final j f21774e = new j(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21775a;

    public /* synthetic */ j(int i5) {
        this.f21775a = i5;
    }

    @Override // hg.h
    public final Object d(Object obj, Continuation continuation) {
        switch (this.f21775a) {
            case 0:
                long longValue = ((Number) obj).longValue();
                d1 d1Var = da.r.f8346d;
                Long valueOf = Long.valueOf(longValue);
                d1Var.getClass();
                d1Var.k(null, valueOf);
                break;
            case 1:
                long longValue2 = ((Number) obj).longValue();
                d1 d1Var2 = da.r.f8347e;
                Long valueOf2 = Long.valueOf(longValue2);
                d1Var2.getClass();
                d1Var2.k(null, valueOf2);
                break;
            case 2:
                long longValue3 = ((Number) obj).longValue();
                d1 d1Var3 = da.r.f8345c;
                Long valueOf3 = Long.valueOf(longValue3);
                d1Var3.getClass();
                d1Var3.k(null, valueOf3);
                break;
            default:
                long longValue4 = ((Number) obj).longValue();
                d1 d1Var4 = da.r.f8348f;
                Long valueOf4 = Long.valueOf(longValue4);
                d1Var4.getClass();
                d1Var4.k(null, valueOf4);
                break;
        }
        return Unit.f19194a;
    }
}
