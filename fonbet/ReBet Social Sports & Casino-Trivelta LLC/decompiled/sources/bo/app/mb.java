package bo.app;

import com.braze.models.IPutIntoJson;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class mb implements IPutIntoJson, l9 {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f25755a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONArray f25756b;

    public mb(JSONObject userObject) {
        Intrinsics.checkNotNullParameter(userObject, "userObject");
        this.f25755a = userObject;
        this.f25756b = new JSONArray().put(userObject);
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getJsonObject() {
        JSONArray jsonArrayForJsonPut = this.f25756b;
        Intrinsics.checkNotNullExpressionValue(jsonArrayForJsonPut, "jsonArrayForJsonPut");
        return jsonArrayForJsonPut;
    }

    @Override // bo.app.l9
    public final boolean isEmpty() {
        if (this.f25755a.length() == 0) {
            return true;
        }
        return this.f25755a.length() == 1 && this.f25755a.has("user_id");
    }
}
