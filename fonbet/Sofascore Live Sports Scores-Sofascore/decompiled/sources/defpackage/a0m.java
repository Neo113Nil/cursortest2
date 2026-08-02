package defpackage;

import com.blaze.blazesdk.data_source.BlazeAdvancedOrderType;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.data_source.BlazeOrderType;
import com.blaze.blazesdk.data_source.BlazeWidgetLabel;
import com.ironsource.U3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a0m extends hoi implements Function1 {
    public int r;
    public final /* synthetic */ BlazeDataSourceType s;
    public final /* synthetic */ Map t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0m(BlazeDataSourceType blazeDataSourceType, Map map, rq3 rq3Var) {
        super(1, rq3Var);
        this.s = blazeDataSourceType;
        this.t = map;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new a0m(this.s, this.t, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new a0m(this.s, this.t, (rq3) obj).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Object storiesByLabel;
        List<String> playerIds$blazesdk_release;
        List<String> teamIds$blazesdk_release;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            vsl vslVar = tsl.d;
            if (vslVar == null) {
                return null;
            }
            BlazeDataSourceType blazeDataSourceType = this.s;
            BlazeDataSourceType.Labels labels = (BlazeDataSourceType.Labels) blazeDataSourceType;
            if (labels.getMaxItems() != null) {
                str = String.valueOf(labels.getMaxItems());
                str2 = null;
            } else {
                str = null;
                str2 = null;
            }
            String stringRepresentation$blazesdk_release = blazeDataSourceType.getStringRepresentation$blazesdk_release();
            BlazeDataSourceType.Labels labels2 = (BlazeDataSourceType.Labels) blazeDataSourceType;
            List<BlazeWidgetLabel> labelsPriority = labels2.getLabelsPriority();
            if (labelsPriority != null) {
                ArrayList arrayList = new ArrayList(k13.r(labelsPriority, 10));
                Iterator<T> it = labelsPriority.iterator();
                while (it.hasNext()) {
                    arrayList.add(((BlazeWidgetLabel) it.next()).getStringLabelExpression());
                }
                str3 = arrayList.toString();
            } else {
                str3 = str2;
            }
            BlazeOrderType orderType = labels2.getOrderType();
            String value = orderType != null ? orderType.getValue() : str2;
            BlazeAdvancedOrderType advancedOrderType = labels2.getAdvancedOrderType();
            Boolean valueOf = advancedOrderType != null ? Boolean.valueOf(advancedOrderType instanceof BlazeAdvancedOrderType.LiveFirst) : str2;
            BlazeDataSourcePersonalizedType personalizedType = labels2.getPersonalizedType();
            String f0 = (personalizedType == null || !(personalizedType instanceof BlazeDataSourcePersonalizedType.Ids) || (teamIds$blazesdk_release = ((BlazeDataSourcePersonalizedType.Ids) personalizedType).getTeamIds$blazesdk_release()) == null) ? str2 : CollectionsKt.f0(teamIds$blazesdk_release, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, null, 62);
            BlazeDataSourcePersonalizedType personalizedType2 = labels2.getPersonalizedType();
            String f02 = (personalizedType2 == null || !(personalizedType2 instanceof BlazeDataSourcePersonalizedType.Ids) || (playerIds$blazesdk_release = ((BlazeDataSourcePersonalizedType.Ids) personalizedType2).getPlayerIds$blazesdk_release()) == null) ? str2 : CollectionsKt.f0(playerIds$blazesdk_release, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, null, 62);
            BlazeDataSourcePersonalizedType personalizedType3 = labels2.getPersonalizedType();
            String stringLabelExpression = (personalizedType3 == null || !(personalizedType3 instanceof BlazeDataSourcePersonalizedType.Labels)) ? str2 : ((BlazeDataSourcePersonalizedType.Labels) personalizedType3).getLabelsFilter().getStringLabelExpression();
            BlazeDataSourcePersonalizedType personalizedType4 = labels2.getPersonalizedType();
            if (personalizedType4 != null) {
                String q = personalizedType4 instanceof BlazeDataSourcePersonalizedType.Labels ? lnb.q(new StringBuilder(U3.j.d), CollectionsKt.f0(((BlazeDataSourcePersonalizedType.Labels) personalizedType4).getLabelsPriority(), BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, new pcl(22), 30), ']') : str2;
                str5 = f0;
                str4 = q;
            } else {
                String str6 = f0;
                str4 = str2;
                str5 = str6;
            }
            Map<String, String> m = o3a.m(this.t);
            if (m.isEmpty()) {
                m = lm5.a;
                m.getClass();
            }
            this.r = 1;
            storiesByLabel = vslVar.getStoriesByLabel(str, stringRepresentation$blazesdk_release, str3, f02, str5, stringLabelExpression, str4, value, valueOf, m, this);
            if (storiesByLabel == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            storiesByLabel = obj;
        }
        return (c2g) storiesByLabel;
    }
}
