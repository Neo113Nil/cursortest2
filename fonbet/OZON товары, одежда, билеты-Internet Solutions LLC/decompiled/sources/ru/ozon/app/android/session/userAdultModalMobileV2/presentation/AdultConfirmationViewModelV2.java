package ru.ozon.app.android.session.userAdultModalMobileV2.presentation;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import android.os.Bundle;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.userAdultModalMobileV2.presentation.BirthdateStateUi;
import ru.ozon.app.android.session.userAdultModalMobileV2.presentation.models.UserAdultModalV2VO;
import xe.C10727i;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u0003R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/session/userAdultModalMobileV2/presentation/AdultConfirmationViewModelV2;", "Landroidx/lifecycle/w0;", "<init>", "()V", "Landroid/os/Bundle;", "data", "", "setDate", "(Landroid/os/Bundle;)V", "Lru/ozon/app/android/session/userAdultModalMobileV2/presentation/models/UserAdultModalV2VO;", "dto", "setStateVO", "(Lru/ozon/app/android/session/userAdultModalMobileV2/presentation/models/UserAdultModalV2VO;)V", "submitBirthDate", "LAe/x0;", "Lru/ozon/app/android/session/userAdultModalMobileV2/presentation/BirthdateStateUi;", "state", "LAe/x0;", "LAe/M0;", "uiStateScreen", "LAe/M0;", "getUiStateScreen", "()LAe/M0;", "Companion", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AdultConfirmationViewModelV2 extends w0 {

    @NotNull
    private final x0<BirthdateStateUi> state;

    @NotNull
    private final M0<BirthdateStateUi> uiStateScreen;
    public static final int $stable = 8;

    public AdultConfirmationViewModelV2() {
        x0<BirthdateStateUi> a11 = O0.a(BirthdateStateUi.Loading.INSTANCE);
        this.state = a11;
        this.uiStateScreen = C2399j.b(a11);
    }

    @NotNull
    public final M0<BirthdateStateUi> getUiStateScreen() {
        return this.uiStateScreen;
    }

    public final void setDate(Bundle data) {
        if (data == null || data.isEmpty()) {
            return;
        }
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new AdultConfirmationViewModelV2$setDate$1(data, this, null), 3);
    }

    public final void setStateVO(@NotNull UserAdultModalV2VO dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new AdultConfirmationViewModelV2$setStateVO$1(this, dto, null), 3);
    }

    public final void submitBirthDate() {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new AdultConfirmationViewModelV2$submitBirthDate$1(this, null), 3);
    }
}
