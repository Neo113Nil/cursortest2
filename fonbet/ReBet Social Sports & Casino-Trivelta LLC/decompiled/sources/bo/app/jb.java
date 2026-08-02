package bo.app;

import com.braze.models.IPutIntoJson;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class jb implements IPutIntoJson, l9 {

    /* renamed from: a, reason: collision with root package name */
    public final long f25621a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f25622b;

    public jb(long j10, boolean z10) {
        this.f25621a = j10;
        this.f25622b = z10;
    }

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("config_time", this.f25621a);
        return jSONObject;
    }

    @Override // bo.app.l9
    public final boolean isEmpty() {
        return !this.f25622b;
    }
}
