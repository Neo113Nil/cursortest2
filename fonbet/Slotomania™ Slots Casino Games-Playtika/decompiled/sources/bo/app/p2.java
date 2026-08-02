package bo.app;

import com.braze.Constants;
import com.braze.models.IPutIntoJson;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Lbo/app/p2;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "", "c", "()J", "startTime", "h", SDKConstants.PARAM_END_TIME, "", "u", "()I", "priority", "g", "delayInSeconds", Constants.BRAZE_PUSH_CONTENT_KEY, "timeoutInMilliseconds", "Lbo/app/l2;", Constants.BRAZE_PUSH_TITLE_KEY, "()Lbo/app/l2;", "reEligibilityConfig", "l", "minSecondsSinceLastTrigger", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public interface p2 extends IPutIntoJson<JSONObject> {
    int a();

    long c();

    int g();

    long h();

    int l();

    l2 t();

    int u();
}
