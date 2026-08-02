package defpackage;

import com.blaze.blazesdk.players.BlazeVideoManager;
import com.blaze.blazesdk.players.a;
import com.google.gson.Gson;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wjm extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ a s;
    public final /* synthetic */ n4m t;
    public final /* synthetic */ Function2 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wjm(a aVar, n4m n4mVar, Function2 function2, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = aVar;
        this.t = n4mVar;
        this.u = function2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new wjm(this.s, this.t, this.u, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((wjm) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
        return lu3.a;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        boolean c;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i != 0 && i != 1 && i != 2) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        while (true) {
            a aVar = this.s;
            if (aVar.b.getDuration() >= 0) {
                n4m n4mVar = aVar.c;
                String str = n4mVar != null ? n4mVar.a : null;
                n4m n4mVar2 = this.t;
                if (Intrinsics.c(str, n4mVar2.a)) {
                    if (((Boolean) aVar.k.getValue()).booleanValue()) {
                        h6c e = aVar.b.e();
                        if (e == null) {
                            c = false;
                        } else {
                            BlazeVideoManager.MediaItemIdMetadata.INSTANCE.getClass();
                            Object fromJson = new Gson().fromJson(e.a, (Class<Object>) BlazeVideoManager.MediaItemIdMetadata.class);
                            fromJson.getClass();
                            c = Intrinsics.c(((BlazeVideoManager.MediaItemIdMetadata) fromJson).getPlayableId(), n4mVar2.a);
                        }
                        if (!c) {
                            this.r = 1;
                            if (n4o.y(10L, this) == lu3Var) {
                                break;
                            }
                        }
                    }
                    this.u.invoke(new Long(aVar.b.getCurrentPosition()), new Long(aVar.b.getDuration()));
                }
            }
            this.r = 2;
            if (n4o.y(10L, this) == lu3Var) {
                break;
            }
        }
        return lu3Var;
    }
}
