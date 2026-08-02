package f60;

import Ae.C0;
import S80.b;
import U50.d;
import U50.j;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* renamed from: f60.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6441b implements U50.a, d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final S80.b f62943a;

    public C6441b(@NotNull S80.b fintechNavigation, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings) {
        Intrinsics.checkNotNullParameter(fintechNavigation, "fintechNavigation");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        this.f62943a = fintechNavigation;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "navigate";
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
        try {
            JSONObject jSONObject = new JSONObject(parameterJson);
            C0 m02 = this.f62943a.m0();
            String string = jSONObject.getString("moduleManifestPath");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            JSONObject jSONObject2 = jSONObject.getJSONObject("parameters");
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(...)");
            m02.tryEmit(new b.a(jSONObject2, string, jSONObject.optString("source")));
            NativeResult.Success.INSTANCE.getClass();
            return NativeResult.Success.DEFAULT;
        } catch (Exception e11) {
            L80.a.b("FeNativeNavigateInterface", "error = " + e11);
            return new NativeResult.Error("Ошибка при переходе в js", null, 2, null);
        }
    }
}
