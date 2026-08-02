package bo.app;

import com.braze.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lbo/app/h4;", "Lbo/app/j;", "Lbo/app/e1;", "eventType", "Lorg/json/JSONObject;", "eventData", "<init>", "(Lbo/app/e1;Lorg/json/JSONObject;)V", Constants.BRAZE_PUSH_CONTENT_KEY, "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class h4 extends j {
    public static final a j = new a(null);

    private h4(e1 e1Var, JSONObject jSONObject) {
        super(e1Var, jSONObject, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ h4(e1 e1Var, JSONObject jSONObject, DefaultConstructorMarker defaultConstructorMarker) {
        this(e1Var, jSONObject);
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\n"}, d2 = {"Lbo/app/h4$a;", "", "", "campaignId", "Lbo/app/h4;", Constants.BRAZE_PUSH_CONTENT_KEY, "Lbo/app/x1;", "event", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final h4 a(String campaignId) {
            Intrinsics.checkNotNullParameter(campaignId, "campaignId");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY, campaignId);
            return new h4(e1.PUSH_CLICKED, jSONObject, null);
        }

        @JvmStatic
        public final String a(x1 event) {
            Intrinsics.checkNotNullParameter(event, "event");
            String string = event.getC().getString(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY);
            Intrinsics.checkNotNullExpressionValue(string, "event.data.getString(IBrazeEvent.DATA_CAMPAIGN_ID)");
            return string;
        }
    }
}
