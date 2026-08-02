package e60;

import U50.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* renamed from: e60.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6312b implements U50.a {
    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "reverse";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String string = new JSONObject(parameterJson).getString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        JSONObject jSONObject = new JSONObject();
        Intrinsics.f(string);
        jSONObject.put("reversed_value", h.b0(string).toString());
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        ((j) callback).invoke(new NativeResult.Success(jSONObject2));
    }
}
