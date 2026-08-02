package ru.ozon.app.android.session.security.presentation;

import androidx.lifecycle.P;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/session/security/presentation/UserAuthBiometryViewModel;", "", "", "checked", "", "analyticsTag", "", "onToggleChecked", "(ZLjava/lang/String;)V", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/session/security/presentation/UserAuthBiometryEvent;", "getEventsLiveData", "()Landroidx/lifecycle/P;", "eventsLiveData", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface UserAuthBiometryViewModel {
    @NotNull
    P<UserAuthBiometryEvent> getEventsLiveData();

    void onToggleChecked(boolean checked, @NotNull String analyticsTag);
}
