package c;

import com.surt.guardian.utils.Logger;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* loaded from: classes.dex */
public final class O0 implements Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2446i f26480a;

    public O0(C2446i c2446i) {
        this.f26480a = c2446i;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException e10) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e10, "e");
        Logger.f41582a.a("TelemetryClient", "Telemetry request failed (ignored): " + e10.getMessage());
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        response.close();
        Logger.f41582a.a("TelemetryClient", "Telemetry sent: " + this.f26480a.d());
    }
}
