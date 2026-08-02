package m60;

import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* renamed from: m60.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8096a implements U50.a, U50.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<String, Boolean> f74504a;

    /* JADX WARN: Multi-variable type inference failed */
    public C8096a(@NotNull Function1<? super String, Boolean> canGoCallback) {
        Intrinsics.checkNotNullParameter(canGoCallback, "canGoCallback");
        this.f74504a = canGoCallback;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "attempt_native_navigation";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((U50.j) callback).invoke(handleSync(weakReference, parameterJson));
    }

    @Override // U50.d
    @NotNull
    public final NativeResult handleSync(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson) {
        String string;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        boolean z11 = false;
        try {
            string = new JSONObject(parameterJson).getString("path");
        } catch (Exception e11) {
            L80.a.c("AttemptNativeNavigationInterface", null, e11);
        }
        if (string != null && string.length() != 0) {
            z11 = this.f74504a.invoke(string).booleanValue();
            NativeResult.Success.Companion companion = NativeResult.Success.INSTANCE;
            Boolean valueOf = Boolean.valueOf(z11);
            companion.getClass();
            return NativeResult.Success.Companion.a(valueOf, "is_native_nav_performed");
        }
        L80.a.b("AttemptNativeNavigationInterface", "Url from " + parameterJson + " is null or empty");
        NativeResult.Success.Companion companion2 = NativeResult.Success.INSTANCE;
        Boolean valueOf2 = Boolean.valueOf(z11);
        companion2.getClass();
        return NativeResult.Success.Companion.a(valueOf2, "is_native_nav_performed");
    }
}
