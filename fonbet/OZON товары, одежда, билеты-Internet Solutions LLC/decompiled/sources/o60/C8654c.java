package o60;

import U50.d;
import d70.d;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* renamed from: o60.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8654c implements d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d70.d f77781a;

    public C8654c(@NotNull d70.d offlineManager) {
        Intrinsics.checkNotNullParameter(offlineManager, "offlineManager");
        this.f77781a = offlineManager;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "start";
    }

    @Override // U50.d
    @NotNull
    public final NativeResult handleSync(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson) {
        NativeResult.Success success;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        d70.d dVar = this.f77781a;
        if (!dVar.i()) {
            L80.a.a("StartOfflineModeBridgeInterface", "Cant start offline mode, feature disabled");
            return new NativeResult.Error("Cant start offline mode, feature disabled", null, 2, null);
        }
        L80.a.a("StartOfflineModeBridgeInterface", "Start offline mode");
        dVar.g(false, d.a.NATIVE_BRIDGE);
        NativeResult.Success.INSTANCE.getClass();
        success = NativeResult.Success.DEFAULT_WITH_SUCCESS;
        return success;
    }
}
