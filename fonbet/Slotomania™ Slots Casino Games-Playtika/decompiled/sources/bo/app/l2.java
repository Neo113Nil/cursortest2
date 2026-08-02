package bo.app;

import com.braze.Constants;
import com.braze.models.IPutIntoJson;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\bg\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0016\u0010\f\u001a\u0004\u0018\u00010\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lbo/app/l2;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "", "o", "()Z", "isAlwaysEligible", Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, "isOnlyEligibleOnce", "", "q", "()Ljava/lang/Integer;", "reEligibilityTime", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public interface l2 extends IPutIntoJson<JSONObject> {
    boolean o();

    Integer q();

    boolean s();
}
