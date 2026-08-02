package k60;

import com.squareup.moshi.Moshi;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;
import ru.ozon.fintech.wallet.manager.domain.mpay.MirPayWalletException;
import ta0.InterfaceC9791a;
import xe.C10727i;

/* loaded from: classes3.dex */
public final class v implements U50.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC9791a f71004a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Moshi f71005b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final R30.a f71006c;

    public v(@NotNull InterfaceC9791a mirPayWalletManager, @NotNull Moshi moshi, @NotNull R30.a coroutineScopes) {
        Intrinsics.checkNotNullParameter(mirPayWalletManager, "mirPayWalletManager");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(coroutineScopes, "coroutineScopes");
        this.f71004a = mirPayWalletManager;
        this.f71005b = moshi;
        this.f71006c = coroutineScopes;
    }

    public static Unit a(v vVar, U50.j jVar) {
        C10727i.c(vVar.f71006c.b(), null, null, new u(vVar, false, jVar, null), 3);
        return Unit.f71690a;
    }

    private final void d(String str, final U50.j jVar) {
        String string = new JSONObject(str).getString("bank_id");
        if (string == null || string.length() == 0) {
            jVar.invoke(new NativeResult.Error("Ошибка парсинга Json'а", null, 2, null));
            return;
        }
        va0.b.a(this.f71004a, string, new Function0() { // from class: k60.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v.a(v.this, jVar);
            }
        }, new A90.e(jVar, 1));
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "get_update_stores";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!this.f71004a.f()) {
            d(parameterJson, (U50.j) callback);
            return;
        }
        try {
            C10727i.c(this.f71006c.b(), null, null, new u(this, true, (U50.j) callback, null), 3);
        } catch (MirPayWalletException e11) {
            if (e11.getType() == MirPayWalletException.a.NO_CONNECTION) {
                d(parameterJson, (U50.j) callback);
            } else {
                ((U50.j) callback).invoke(new NativeResult.Error("Ошибка при получении сторов для обновления", NativeResult.Error.a.IS_NOT_AVAILABLE));
            }
        }
    }
}
