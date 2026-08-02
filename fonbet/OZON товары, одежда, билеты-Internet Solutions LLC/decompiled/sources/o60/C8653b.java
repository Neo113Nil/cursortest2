package o60;

import H30.q;
import U50.d;
import com.squareup.moshi.Moshi;
import java.lang.ref.WeakReference;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.offline.RefreshOfflineCacheRequest;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* renamed from: o60.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8653b implements d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Moshi f77778a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final d70.d f77779b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Q90.c f77780c;

    public C8653b(@NotNull Moshi moshi, @NotNull d70.d offlineManager, @NotNull Q90.c featureToggles) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(offlineManager, "offlineManager");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        this.f77778a = moshi;
        this.f77779b = offlineManager;
        this.f77780c = featureToggles;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "refresh_cache";
    }

    @Override // U50.d
    @NotNull
    public final NativeResult handleSync(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson) {
        NativeResult.Success success;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        if (!Tl.a.f(this.f77780c, S90.c.MOB_OFFLINE)) {
            return new NativeResult.Error("Offline feature is disabled by MOB_OFFLINE flag", NativeResult.Error.a.IS_NOT_AVAILABLE);
        }
        RefreshOfflineCacheRequest refreshOfflineCacheRequest = (RefreshOfflineCacheRequest) q.a(this.f77778a, parameterJson, RefreshOfflineCacheRequest.class);
        L80.a.a("RefreshOfflineCacheBridgeInterface", "start refresh offline cache");
        d70.d dVar = this.f77779b;
        if (refreshOfflineCacheRequest != null) {
            String upperCase = refreshOfflineCacheRequest.getStorage().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            dVar.j(W60.a.valueOf(upperCase));
        } else {
            dVar.j(null);
        }
        NativeResult.Success.INSTANCE.getClass();
        success = NativeResult.Success.DEFAULT_WITH_SUCCESS;
        return success;
    }
}
