package bo.app;

import com.braze.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0010"}, d2 = {"Lbo/app/i4;", "Lbo/app/j;", "", "x", "()Ljava/lang/String;", "campaignId", "Lbo/app/e1;", "eventType", "Lorg/json/JSONObject;", "eventData", "", "timestamp", "<init>", "(Lbo/app/e1;Lorg/json/JSONObject;D)V", "", "(Ljava/lang/String;J)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class i4 extends j {
    private i4(e1 e1Var, JSONObject jSONObject, double d) {
        super(e1Var, jSONObject, d, (String) null, 8, (DefaultConstructorMarker) null);
    }

    public final String x() {
        String string = getC().getString(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY);
        Intrinsics.checkNotNullExpressionValue(string, "data.getString(IBrazeEvent.DATA_CAMPAIGN_ID)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i4(String campaignId, long j) {
        this(r0, r4, j);
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        e1 e1Var = e1.PUSH_DELIVERY_EVENT;
        JSONObject put = new JSONObject().put(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY, campaignId);
        Intrinsics.checkNotNullExpressionValue(put, "JSONObject().put(IBrazeE…_CAMPAIGN_ID, campaignId)");
    }
}
