package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a95 extends m2g implements Function2 {
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ mme u;
    public final /* synthetic */ yyf v;
    public final /* synthetic */ yyf w;
    public final /* synthetic */ t1d x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a95(mme mmeVar, yyf yyfVar, yyf yyfVar2, t1d t1dVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.u = mmeVar;
        this.v = yyfVar;
        this.w = yyfVar2;
        this.x = t1dVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        a95 a95Var = new a95(this.u, this.v, this.w, this.x, rq3Var);
        a95Var.t = obj;
        return a95Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a95) create((noi) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0084 A[Catch: CancellationException -> 0x0019, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:8:0x0015, B:9:0x007c, B:11:0x0084, B:13:0x0091, B:15:0x009d, B:17:0x00a0, B:20:0x00a3, B:24:0x00a9, B:28:0x0027, B:29:0x0055, B:31:0x0059, B:36:0x002f, B:37:0x0046, B:41:0x003b), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9 A[Catch: CancellationException -> 0x0019, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:8:0x0015, B:9:0x007c, B:11:0x0084, B:13:0x0091, B:15:0x009d, B:17:0x00a0, B:20:0x00a3, B:24:0x00a9, B:28:0x0027, B:29:0x0055, B:31:0x0059, B:36:0x002f, B:37:0x0046, B:41:0x003b), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059 A[Catch: CancellationException -> 0x0019, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:8:0x0015, B:9:0x007c, B:11:0x0084, B:13:0x0091, B:15:0x009d, B:17:0x00a0, B:20:0x00a3, B:24:0x00a9, B:28:0x0027, B:29:0x0055, B:31:0x0059, B:36:0x002f, B:37:0x0046, B:41:0x003b), top: B:2:0x0009 }] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noi noiVar;
        mze mzeVar;
        noi noiVar2;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        yyf yyfVar = this.w;
        try {
            if (i == 0) {
                y6a.M(obj);
                noiVar = (noi) this.t;
                this.t = noiVar;
                this.s = 1;
                obj = rti.b(noiVar, this, 2);
                if (obj == lu3Var) {
                    return lu3Var;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        noiVar = (noi) this.t;
                        y6a.M(obj);
                        mzeVar = (mze) obj;
                        if (mzeVar != null) {
                            this.u.invoke(new dnd(mzeVar.c));
                            long j = mzeVar.a;
                            kz3 kz3Var = new kz3(this.x, 12);
                            this.t = noiVar;
                            this.s = 3;
                            obj = e95.f(noiVar, j, kz3Var, this);
                            if (obj != lu3Var) {
                                noiVar2 = noiVar;
                                if (((Boolean) obj).booleanValue()) {
                                }
                            }
                            return lu3Var;
                        }
                        return Unit.a;
                    }
                    if (i != 3) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    noiVar2 = (noi) this.t;
                    y6a.M(obj);
                    if (((Boolean) obj).booleanValue()) {
                        yyfVar.invoke();
                    } else {
                        List list = noiVar2.f.s.a;
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            mze mzeVar2 = (mze) list.get(i2);
                            if (qea.m(mzeVar2)) {
                                mzeVar2.a();
                            }
                        }
                        this.v.invoke();
                    }
                    return Unit.a;
                }
                noiVar = (noi) this.t;
                y6a.M(obj);
            }
            long j2 = ((mze) obj).a;
            this.t = noiVar;
            this.s = 2;
            obj = e95.c(noiVar, j2, this);
            if (obj == lu3Var) {
                return lu3Var;
            }
            mzeVar = (mze) obj;
            if (mzeVar != null) {
            }
            return Unit.a;
        } catch (CancellationException e) {
            yyfVar.invoke();
            throw e;
        }
    }
}
