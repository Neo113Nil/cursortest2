package j60;

import U50.d;
import U50.j;
import java.lang.ref.WeakReference;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public final class b implements U50.a, d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final B30.a f69460a;

    public b(@NotNull B30.a biometricAuthManager) {
        Intrinsics.checkNotNullParameter(biometricAuthManager, "biometricAuthManager");
        this.f69460a = biometricAuthManager;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "bio_available_v2";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((j) callback).invoke(handleSync(weakReference, parameterJson));
    }

    @Override // U50.d
    @NotNull
    public final NativeResult handleSync(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        String lowerCase = this.f69460a.a().name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        NativeResult.Success.INSTANCE.getClass();
        return NativeResult.Success.Companion.a(lowerCase, null);
    }
}
