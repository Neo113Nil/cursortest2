package k60;

import com.squareup.moshi.Moshi;
import g30.InterfaceC6618a;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.mpay.MirPayAvailableResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;
import ta0.InterfaceC9791a;

/* loaded from: classes3.dex */
public final class i implements U50.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC9791a f70966a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Moshi f70967b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC6618a f70968c;

    public i(@NotNull Moshi moshi, @NotNull InterfaceC6618a fintechAnalyticInteractor, @NotNull InterfaceC9791a mirPayWalletManager) {
        Intrinsics.checkNotNullParameter(mirPayWalletManager, "mirPayWalletManager");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.f70966a = mirPayWalletManager;
        this.f70967b = moshi;
        this.f70968c = fintechAnalyticInteractor;
    }

    public static Unit a(i iVar, String str, U50.j jVar, sa0.d status) {
        String str2;
        Intrinsics.checkNotNullParameter(status, "status");
        boolean z11 = status == sa0.d.SUCCESS;
        iVar.f70968c.V1(str, z11);
        try {
            str2 = iVar.f70967b.c(MirPayAvailableResult.class).toJson(new MirPayAvailableResult(z11, status == sa0.d.NEED_UPDATE));
        } catch (Throwable th2) {
            th2.printStackTrace();
            str2 = "";
        }
        jVar.invoke(new NativeResult.Success(str2));
        iVar.f70966a.closeConnection();
        return Unit.f71690a;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "is_available";
    }

    @Override // U50.a
    public final void handle(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        final String str;
        String str2;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            str = new JSONObject(parameterJson).getString("bank_id");
        } catch (Exception unused) {
            str = null;
        }
        if (str == null || str.length() == 0) {
            ((U50.j) callback).invoke(new NativeResult.Error("Ошибка парсинга Json'а", null, 2, null));
            return;
        }
        InterfaceC9791a interfaceC9791a = this.f70966a;
        if (interfaceC9791a.j()) {
            final U50.j jVar = (U50.j) callback;
            interfaceC9791a.d(str, new Function1() { // from class: k60.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return i.a(i.this, str, jVar, (sa0.d) obj);
                }
            });
            return;
        }
        this.f70968c.V1(str, false);
        try {
            str2 = this.f70967b.c(MirPayAvailableResult.class).toJson(new MirPayAvailableResult(false, false));
        } catch (Throwable th2) {
            th2.printStackTrace();
            str2 = "";
        }
        ((U50.j) callback).invoke(new NativeResult.Success(str2));
    }
}
