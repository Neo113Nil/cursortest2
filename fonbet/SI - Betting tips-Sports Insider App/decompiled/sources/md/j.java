package md;

import com.sports.insider.MyApp;
import eg.c0;
import eg.m0;
import eg.z;
import j$.time.Instant;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import la.j1;
import me.y;
import q4.r;
import s7.t;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20555b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f20556c;

    /* renamed from: d, reason: collision with root package name */
    public int f20557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f20558e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i5, Continuation continuation, m mVar) {
        super(2, continuation);
        this.f20558e = mVar;
        this.f20557d = i5;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f20555b) {
            case 0:
                return new j(this.f20557d, continuation, this.f20558e);
            default:
                return new j(this.f20558e, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f20555b) {
        }
        return ((j) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f5 A[Catch: Exception -> 0x0023, TryCatch #1 {Exception -> 0x0023, blocks: (B:14:0x002e, B:15:0x00d1, B:25:0x00f5, B:26:0x00f0, B:27:0x001e, B:28:0x0033, B:29:0x004e, B:33:0x005e, B:39:0x0082, B:44:0x009d, B:47:0x00b1, B:52:0x00fa, B:54:0x003a), top: B:4:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f0 A[Catch: Exception -> 0x0023, TryCatch #1 {Exception -> 0x0023, blocks: (B:14:0x002e, B:15:0x00d1, B:25:0x00f5, B:26:0x00f0, B:27:0x001e, B:28:0x0033, B:29:0x004e, B:33:0x005e, B:39:0x0082, B:44:0x009d, B:47:0x00b1, B:52:0x00fa, B:54:0x003a), top: B:4:0x0014 }] */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i5;
        Object A;
        int i10 = this.f20555b;
        m mVar = this.f20558e;
        Continuation continuation = null;
        switch (i10) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i11 = this.f20556c;
                try {
                    if (i11 == 0) {
                        h8.b.B(obj);
                        mVar.getClass();
                        j1 g10 = m.g();
                        int i12 = this.f20557d;
                        int epochSecond = (int) Instant.now().getEpochSecond();
                        this.f20556c = 1;
                        g10.getClass();
                        if (j1.b(i12, epochSecond, null, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                } catch (Exception ex) {
                    Intrinsics.checkNotNullParameter(ex, "ex");
                    jg.d dVar = MyApp.f6830c;
                    lg.e eVar = m0.f9201a;
                    c0.t(dVar, lg.d.f20063c, null, new r(ex, continuation, 18), 2);
                }
                return Unit.f19194a;
            default:
                lf.a aVar2 = lf.a.f20034a;
                int i13 = this.f20557d;
                try {
                } catch (Exception e7) {
                    zc.d.b(4, "testPushNotification", e7);
                    m.b(mVar, "Error");
                }
                if (i13 == 0) {
                    h8.b.B(obj);
                    this.f20557d = 1;
                    lg.e eVar2 = m0.f9201a;
                    obj = c0.A(lg.d.f20063c, new f(0, continuation, mVar), this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            if (i13 == 3) {
                                i5 = this.f20556c;
                                h8.b.B(obj);
                                t tVar = new t(16);
                                this.f20556c = i5;
                                this.f20557d = 4;
                                e3.o oVar = e3.o.f8552b;
                                lg.e eVar3 = m0.f9201a;
                                A = c0.A(lg.d.f20063c, new y(tVar, oVar, continuation, 22), this);
                                if (A == aVar2) {
                                    A = Unit.f19194a;
                                }
                                if (A == aVar2) {
                                    A = Unit.f19194a;
                                }
                                if (A == aVar2) {
                                    return aVar2;
                                }
                                return Unit.f19194a;
                            }
                            if (i13 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                int intValue = ((Number) obj).intValue();
                if (200 <= intValue && intValue < 300) {
                    j1 g11 = m.g();
                    int epochSecond2 = (int) Instant.now().getEpochSecond();
                    String d10 = m.d(mVar);
                    this.f20556c = intValue;
                    this.f20557d = 2;
                    g11.getClass();
                    if (j1.b(508, epochSecond2, d10, this) == aVar2) {
                        return aVar2;
                    }
                } else if (intValue == 401) {
                    m.b(mVar, "Unauthorized HTTP" + intValue);
                } else if (500 <= intValue && intValue < 600) {
                    m.b(mVar, "Error HTTP" + intValue);
                } else if (intValue == 418) {
                    j1 g12 = m.g();
                    int epochSecond3 = (int) Instant.now().getEpochSecond();
                    String c2 = m.c(mVar);
                    this.f20556c = intValue;
                    this.f20557d = 3;
                    g12.getClass();
                    if (j1.b(508, epochSecond3, c2, this) == aVar2) {
                        return aVar2;
                    }
                    i5 = intValue;
                    t tVar2 = new t(16);
                    this.f20556c = i5;
                    this.f20557d = 4;
                    e3.o oVar2 = e3.o.f8552b;
                    lg.e eVar32 = m0.f9201a;
                    A = c0.A(lg.d.f20063c, new y(tVar2, oVar2, continuation, 22), this);
                    if (A == aVar2) {
                    }
                    if (A == aVar2) {
                    }
                    if (A == aVar2) {
                    }
                } else {
                    m.b(mVar, "Error HTTP" + intValue);
                }
                return Unit.f19194a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, Continuation continuation) {
        super(2, continuation);
        this.f20558e = mVar;
    }
}
