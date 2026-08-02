package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.data_source.BlazeOrderType;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class f0m extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ BlazeDataSourceType.Ids s;
    public final /* synthetic */ Map t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0m(BlazeDataSourceType.Ids ids, Map map, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = ids;
        this.t = map;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new f0m(this.s, this.t, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new f0m(this.s, this.t, (rq3) obj).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            qom.b.getClass();
            vsl vslVar = tsl.d;
            if (vslVar == null) {
                return null;
            }
            BlazeDataSourceType.Ids ids = this.s;
            BlazeOrderType orderType = ids.getOrderType();
            String value = orderType != null ? orderType.getValue() : null;
            String stringRepresentation$blazesdk_release = ids.getStringRepresentation$blazesdk_release();
            Map<String, String> m = o3a.m(this.t);
            if (m.isEmpty()) {
                m = lm5.a;
                m.getClass();
            }
            this.r = 1;
            obj = vslVar.getVideosByIds(value, stringRepresentation$blazesdk_release, m, this);
            if (obj == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return (c2g) obj;
    }
}
