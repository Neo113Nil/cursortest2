package bo.app;

import com.braze.Constants;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0011\b\u0014\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lbo/app/t6;", "Lbo/app/r6;", "", "", "remoteAssetToLocalAssetPaths", "", Constants.BRAZE_PUSH_CONTENT_KEY, "y", "()Ljava/util/Map;", "remoteAssetToLocalAssetMap", "Lorg/json/JSONObject;", "json", "<init>", "(Lorg/json/JSONObject;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public abstract class t6 extends r6 {
    private Map<String, String> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected t6(JSONObject json) {
        super(json);
        Intrinsics.checkNotNullParameter(json, "json");
        this.h = new LinkedHashMap();
    }

    @Override // bo.app.y2
    public void a(Map<String, String> remoteAssetToLocalAssetPaths) {
        Intrinsics.checkNotNullParameter(remoteAssetToLocalAssetPaths, "remoteAssetToLocalAssetPaths");
        this.h = new HashMap(remoteAssetToLocalAssetPaths);
    }

    public Map<String, String> y() {
        return MapsKt.toMap(this.h);
    }
}
