package ru.ozon.app.android.ui.session.biometry;

import androidx.lifecycle.P;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\b\u0010\u0007R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/ui/session/biometry/BiometricAuthViewModel;", "", "", "analyticTag", "deeplink", "", "onBiometryAuthAccepted", "(Ljava/lang/String;Ljava/lang/String;)V", "onBiometryAuthDeclined", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/ui/session/biometry/BiometricAction;", "getBiometricActions", "()Landroidx/lifecycle/P;", "biometricActions", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface BiometricAuthViewModel {
    @NotNull
    P<BiometricAction> getBiometricActions();

    void onBiometryAuthAccepted(@NotNull String analyticTag, String deeplink);

    void onBiometryAuthDeclined(@NotNull String analyticTag, String deeplink);
}
