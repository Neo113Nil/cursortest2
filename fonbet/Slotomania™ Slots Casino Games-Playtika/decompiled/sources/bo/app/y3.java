package bo.app;

import com.braze.models.IPutIntoJson;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0004\u001a\u00020\u0002H\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lbo/app/y3;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONArray;", "Lbo/app/g2;", "v", "Lorg/json/JSONObject;", "userObject", "Lorg/json/JSONObject;", "w", "()Lorg/json/JSONObject;", "", "e", "()Z", "isEmpty", "<init>", "(Lorg/json/JSONObject;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class y3 implements IPutIntoJson<JSONArray>, g2 {
    private final JSONObject b;
    private final JSONArray c;

    public y3(JSONObject userObject) {
        Intrinsics.checkNotNullParameter(userObject, "userObject");
        this.b = userObject;
        this.c = new JSONArray().put(userObject);
    }

    @Override // bo.app.g2
    public boolean e() {
        return this.b.length() == 0 || (this.b.length() == 1 && this.b.has("user_id"));
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public JSONArray getJsonObject() {
        JSONArray jsonArrayForJsonPut = this.c;
        Intrinsics.checkNotNullExpressionValue(jsonArrayForJsonPut, "jsonArrayForJsonPut");
        return jsonArrayForJsonPut;
    }

    /* renamed from: w, reason: from getter */
    public final JSONObject getB() {
        return this.b;
    }
}
