package bo.app;

import com.braze.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JP\u0010\u000b\u001a \u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004j\u0002`\u00060\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004j\u0002`\u00062\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lbo/app/i2;", "", "Lbo/app/a5;", "requestTarget", "", "", "Lcom/braze/communication/HttpHeaders;", "requestHeaders", "Lorg/json/JSONObject;", "payload", "Lkotlin/Pair;", Constants.BRAZE_PUSH_CONTENT_KEY, "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public interface i2 {
    Pair<JSONObject, Map<String, String>> a(a5 requestTarget, Map<String, String> requestHeaders, JSONObject payload);
}
