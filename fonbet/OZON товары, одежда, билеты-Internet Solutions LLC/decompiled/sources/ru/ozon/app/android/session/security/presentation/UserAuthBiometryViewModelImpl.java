package ru.ozon.app.android.session.security.presentation;

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

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/session/security/presentation/UserAuthBiometryViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/session/security/presentation/UserAuthBiometryViewModel;", "LFb0/a;", "biometryAuth", "<init>", "(LFb0/a;)V", "", "checked", "", "analyticsTag", "", "onToggleChecked", "(ZLjava/lang/String;)V", "LFb0/a;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/session/security/presentation/UserAuthBiometryEvent;", "eventsLiveData", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getEventsLiveData", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UserAuthBiometryViewModelImpl extends w0 implements UserAuthBiometryViewModel {

    @NotNull
    private final a biometryAuth;

    @NotNull
    private final SingleLiveEvent<UserAuthBiometryEvent> eventsLiveData;

    public UserAuthBiometryViewModelImpl(@NotNull a biometryAuth) {
        Intrinsics.checkNotNullParameter(biometryAuth, "biometryAuth");
        this.biometryAuth = biometryAuth;
        this.eventsLiveData = new SingleLiveEvent<>();
    }

    @Override // ru.ozon.app.android.session.security.presentation.UserAuthBiometryViewModel
    public void onToggleChecked(boolean checked, @NotNull String analyticsTag) {
        Intrinsics.checkNotNullParameter(analyticsTag, "analyticsTag");
        C6788a a11 = x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, b.f10879b, null, new UserAuthBiometryViewModelImpl$onToggleChecked$1(this, checked, analyticsTag, null), 2);
    }

    @Override // ru.ozon.app.android.session.security.presentation.UserAuthBiometryViewModel
    @NotNull
    public SingleLiveEvent<UserAuthBiometryEvent> getEventsLiveData() {
        return this.eventsLiveData;
    }
}
