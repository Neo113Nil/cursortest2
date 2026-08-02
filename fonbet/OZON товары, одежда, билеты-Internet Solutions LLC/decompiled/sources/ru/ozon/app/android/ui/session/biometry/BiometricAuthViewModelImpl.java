package ru.ozon.app.android.ui.session.biometry;

import Fb0.a;
import He.b;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import h3.C6788a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.C10720e0;
import xe.C10727i;
import xe.J;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/ui/session/biometry/BiometricAuthViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/ui/session/biometry/BiometricAuthViewModel;", "LFb0/a;", "biometryAuth", "<init>", "(LFb0/a;)V", "", "analyticTag", "deeplink", "", "onBiometryAuthAccepted", "(Ljava/lang/String;Ljava/lang/String;)V", "onBiometryAuthDeclined", "LFb0/a;", "Lxe/J;", "exceptionHandler", "Lxe/J;", "Lxe/M;", "safeViewModelScope", "Lxe/M;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/ui/session/biometry/BiometricAction;", "biometricActions", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getBiometricActions", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BiometricAuthViewModelImpl extends w0 implements BiometricAuthViewModel {

    @NotNull
    private final SingleLiveEvent<BiometricAction> biometricActions;

    @NotNull
    private final a biometryAuth;

    @NotNull
    private final J exceptionHandler;

    @NotNull
    private final M safeViewModelScope;

    public BiometricAuthViewModelImpl(@NotNull a biometryAuth) {
        Intrinsics.checkNotNullParameter(biometryAuth, "biometryAuth");
        this.biometryAuth = biometryAuth;
        BiometricAuthViewModelImpl$special$$inlined$CoroutineExceptionHandler$1 biometricAuthViewModelImpl$special$$inlined$CoroutineExceptionHandler$1 = new BiometricAuthViewModelImpl$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0, this);
        this.exceptionHandler = biometricAuthViewModelImpl$special$$inlined$CoroutineExceptionHandler$1;
        C6788a a11 = x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.safeViewModelScope = N.g(N.g(a11, b.f10879b), biometricAuthViewModelImpl$special$$inlined$CoroutineExceptionHandler$1);
        this.biometricActions = new SingleLiveEvent<>();
    }

    @Override // ru.ozon.app.android.ui.session.biometry.BiometricAuthViewModel
    public void onBiometryAuthAccepted(@NotNull String analyticTag, String deeplink) {
        Intrinsics.checkNotNullParameter(analyticTag, "analyticTag");
        C10727i.c(this.safeViewModelScope, null, null, new BiometricAuthViewModelImpl$onBiometryAuthAccepted$1(this, analyticTag, deeplink, null), 3);
    }

    @Override // ru.ozon.app.android.ui.session.biometry.BiometricAuthViewModel
    public void onBiometryAuthDeclined(@NotNull String analyticTag, String deeplink) {
        Intrinsics.checkNotNullParameter(analyticTag, "analyticTag");
        C10727i.c(this.safeViewModelScope, null, null, new BiometricAuthViewModelImpl$onBiometryAuthDeclined$1(this, analyticTag, deeplink, null), 3);
    }

    @Override // ru.ozon.app.android.ui.session.biometry.BiometricAuthViewModel
    @NotNull
    public SingleLiveEvent<BiometricAction> getBiometricActions() {
        return this.biometricActions;
    }
}
