package bo.app;

import com.braze.Constants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB!\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lbo/app/e4;", "Lbo/app/j;", "", "isNoneActionType", "Z", "x", "()Z", "Lbo/app/e1;", "eventType", "Lorg/json/JSONObject;", "eventData", "", SDKConstants.PARAM_GAME_REQUESTS_ACTION_TYPE, "<init>", "(Lbo/app/e1;Lorg/json/JSONObject;Ljava/lang/String;)V", Constants.BRAZE_PUSH_CONTENT_KEY, "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class e4 extends j {
    public static final a k = new a(null);
    private final boolean j;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0007¨\u0006\n"}, d2 = {"Lbo/app/e4$a;", "", "", "campaignId", "actionId", SDKConstants.PARAM_GAME_REQUESTS_ACTION_TYPE, "Lbo/app/x1;", Constants.BRAZE_PUSH_CONTENT_KEY, "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final x1 a(String campaignId, String actionId, String actionType) {
            Intrinsics.checkNotNullParameter(campaignId, "campaignId");
            Intrinsics.checkNotNullParameter(actionId, "actionId");
            Intrinsics.checkNotNullParameter(actionType, "actionType");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY, campaignId);
            jSONObject.put(Constants.BRAZE_PUSH_CONTENT_KEY, actionId);
            return new e4(e1.PUSH_ACTION_BUTTON_CLICKED, jSONObject, actionType, null);
        }
    }

    private e4(e1 e1Var, JSONObject jSONObject, String str) {
        super(e1Var, jSONObject, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
        this.j = Intrinsics.areEqual(str, Constants.BRAZE_PUSH_ACTION_TYPE_NONE);
    }

    public /* synthetic */ e4(e1 e1Var, JSONObject jSONObject, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(e1Var, jSONObject, str);
    }

    /* renamed from: x, reason: from getter */
    public final boolean getJ() {
        return this.j;
    }
}
