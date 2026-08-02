package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.data_source.BlazeOrderType;
import com.blaze.blazesdk.data_source.BlazeWidgetLabel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lvl extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ BlazeDataSourceType.Labels s;
    public final /* synthetic */ Map t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvl(BlazeDataSourceType.Labels labels, Map map, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = labels;
        this.t = map;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new lvl(this.s, this.t, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new lvl(this.s, this.t, (rq3) obj).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        String str;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            gum.b.getClass();
            vsl vslVar = tsl.d;
            if (vslVar == null) {
                return null;
            }
            BlazeDataSourceType.Labels labels = this.s;
            String valueOf = labels.getMaxItems() != null ? String.valueOf(labels.getMaxItems()) : null;
            String stringRepresentation$blazesdk_release = labels.getStringRepresentation$blazesdk_release();
            List<BlazeWidgetLabel> labelsPriority = labels.getLabelsPriority();
            if (labelsPriority != null) {
                ArrayList arrayList = new ArrayList(k13.r(labelsPriority, 10));
                Iterator<T> it = labelsPriority.iterator();
                while (it.hasNext()) {
                    arrayList.add(((BlazeWidgetLabel) it.next()).getStringLabelExpression());
                }
                str = arrayList.toString();
            } else {
                str = null;
            }
            BlazeOrderType orderType = labels.getOrderType();
            String value = orderType != null ? orderType.getValue() : null;
            Map<String, String> m = o3a.m(this.t);
            if (m.isEmpty()) {
                m = lm5.a;
                m.getClass();
            }
            this.r = 1;
            obj = vslVar.getMomentsByLabel(valueOf, stringRepresentation$blazesdk_release, str, value, m, this);
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
