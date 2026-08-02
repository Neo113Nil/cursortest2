package l60;

import H30.q;
import com.squareup.moshi.Moshi;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.nativecontrol.OtpSmsResult;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.nativecontrol.OtpSmsSessionInfo;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* renamed from: l60.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7887e implements U50.d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final K70.b f72923a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Moshi f72924b;

    public C7887e(@NotNull K70.b otpSmsInteractor, @NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(otpSmsInteractor, "otpSmsInteractor");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f72923a = otpSmsInteractor;
        this.f72924b = moshi;
    }

    @Override // U50.c
    @NotNull
    public final String getInterfaceName() {
        return "get_sms_otp";
    }

    @Override // U50.d
    @NotNull
    public final NativeResult handleSync(WeakReference<FintechWebView> weakReference, @NotNull String parameterJson) {
        String str;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Moshi moshi = this.f72924b;
        OtpSmsSessionInfo otpSmsSessionInfo = (OtpSmsSessionInfo) q.a(moshi, parameterJson, OtpSmsSessionInfo.class);
        if (otpSmsSessionInfo == null) {
            return new NativeResult.Error("Ошибка парсинга Json'а", NativeResult.Error.a.SDK_ERROR);
        }
        String c11 = this.f72923a.c(otpSmsSessionInfo.getSessionInformation());
        if (c11.length() == 0) {
            return new NativeResult.Error("Ошибка парсинга Json'а", NativeResult.Error.a.IS_NOT_AVAILABLE);
        }
        try {
            str = moshi.c(OtpSmsResult.class).toJson(new OtpSmsResult(c11));
        } catch (Throwable th2) {
            th2.printStackTrace();
            str = "";
        }
        return new NativeResult.Success(str);
    }
}
