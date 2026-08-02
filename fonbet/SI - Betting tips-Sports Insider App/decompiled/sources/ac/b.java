package ac;

import eg.r;
import io.appmetrica.analytics.StartupParamsCallback;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements StartupParamsCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f122a;

    public b(r rVar) {
        this.f122a = rVar;
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onReceive(StartupParamsCallback.Result result) {
        this.f122a.Q(result != null ? result.deviceIdHash : null);
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onRequestError(StartupParamsCallback.Reason reason, StartupParamsCallback.Result result) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f122a.Q(null);
    }
}
