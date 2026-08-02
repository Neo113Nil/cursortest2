package m60;

import com.squareup.moshi.Moshi;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.navigation.models.TabInfoData;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public final class z implements U50.a, U50.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Moshi f74606a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Pair<String, String>> f74607b;

    public z(@NotNull Moshi moshi, @NotNull Function0<Pair<String, String>> tabInfoCallback) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(tabInfoCallback, "tabInfoCallback");
        this.f74606a = moshi;
        this.f74607b = tabInfoCallback;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "tab_info";
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
        String str;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Pair<String, String> invoke = this.f74607b.invoke();
        try {
            str = this.f74606a.c(TabInfoData.class).toJson(new TabInfoData(invoke.e(), invoke.f()));
        } catch (Throwable th2) {
            th2.printStackTrace();
            str = "";
        }
        return new NativeResult.Success(str);
    }
}
