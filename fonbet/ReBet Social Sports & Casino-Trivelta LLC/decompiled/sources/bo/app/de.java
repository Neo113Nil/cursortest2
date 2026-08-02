package bo.app;

import com.braze.models.IPutIntoJson;
import com.braze.support.DateTimeUtils;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class de implements IPutIntoJson {

    /* renamed from: a, reason: collision with root package name */
    public final String f25397a;

    /* renamed from: b, reason: collision with root package name */
    public final long f25398b;

    public de(String log) {
        Intrinsics.checkNotNullParameter(log, "log");
        long nowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        Intrinsics.checkNotNullParameter(log, "log");
        this.f25397a = log;
        this.f25398b = nowInMilliseconds;
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getJsonObject() {
        return new JSONObject().put("log", this.f25397a).put("time", this.f25398b);
    }
}
