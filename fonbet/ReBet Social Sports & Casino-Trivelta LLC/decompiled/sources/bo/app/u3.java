package bo.app;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class u3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f26099a;

    /* renamed from: b, reason: collision with root package name */
    public final long f26100b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f26101c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONArray f26102d;

    public u3(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.f26099a = jsonObject.optLong("last_card_updated_at", -1L);
        this.f26100b = jsonObject.optLong("last_full_sync_at", -1L);
        this.f26101c = jsonObject.optBoolean("full_sync", false);
        this.f26102d = jsonObject.optJSONArray("cards");
    }

    public u3(String serializedCardJson) {
        Intrinsics.checkNotNullParameter(serializedCardJson, "serializedCardJson");
        this.f26101c = false;
        this.f26099a = -1L;
        this.f26100b = -1L;
        this.f26102d = new JSONArray().put(new JSONObject(serializedCardJson));
    }
}
