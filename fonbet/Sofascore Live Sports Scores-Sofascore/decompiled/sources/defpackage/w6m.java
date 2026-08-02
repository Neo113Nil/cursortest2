package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.data_source.BlazeWidgetLabel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class w6m extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ BlazeDataSourceType s;
    public final /* synthetic */ Map t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6m(BlazeDataSourceType blazeDataSourceType, Map map, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = blazeDataSourceType;
        this.t = map;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new w6m(this.s, this.t, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new w6m(this.s, this.t, (rq3) obj).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            vsl vslVar = tsl.d;
            if (vslVar == null) {
                return null;
            }
            BlazeDataSourceType.Search search = (BlazeDataSourceType.Search) this.s;
            String searchText = search.getSearchText();
            Integer maxItems = search.getMaxItems();
            String num = maxItems != null ? maxItems.toString() : null;
            BlazeWidgetLabel blazeWidgetLabel = search.getBlazeWidgetLabel();
            String stringLabelExpression = blazeWidgetLabel != null ? blazeWidgetLabel.getStringLabelExpression() : null;
            Map<String, String> m = o3a.m(this.t);
            if (m.isEmpty()) {
                m = lm5.a;
                m.getClass();
            }
            this.r = 1;
            obj = vslVar.getStoriesBySearch(searchText, num, stringLabelExpression, m, this);
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
