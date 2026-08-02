package com.vk.id.onetap.compose.button.auth;

import S0.C3991w0;
import S0.D1;
import S0.InterfaceC3978p0;
import S0.n1;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R+\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR+\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR$\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00028@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR$\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00028@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/vk/id/onetap/compose/button/auth/VKIDSmallButtonState;", "Lcom/vk/id/onetap/compose/button/auth/VKIDButtonState;", "", "inProgress", "userIconLoaded", "<init>", "(ZZ)V", "<set-?>", "_userIconLoaded$delegate", "LS0/p0;", "get_userIconLoaded", "()Z", "set_userIconLoaded", "(Z)V", "_userIconLoaded", "_userIconLoading$delegate", "get_userIconLoading", "set_userIconLoading", "_userIconLoading", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getUserIconLoaded$onetap_compose_release", "setUserIconLoaded$onetap_compose_release", "getUserIconLoading$onetap_compose_release", "setUserIconLoading$onetap_compose_release", "userIconLoading", "onetap-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VKIDSmallButtonState extends VKIDButtonState {

    /* renamed from: _userIconLoaded$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC3978p0 _userIconLoaded;

    /* renamed from: _userIconLoading$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC3978p0 _userIconLoading;

    public VKIDSmallButtonState(boolean z11, boolean z12) {
        super(z11, null, null, null, false, false, false, 126, null);
        C3991w0 f7;
        C3991w0 f11;
        f7 = n1.f(Boolean.valueOf(z12), D1.f25195a);
        this._userIconLoaded = f7;
        f11 = n1.f(Boolean.FALSE, D1.f25195a);
        this._userIconLoading = f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean get_userIconLoaded() {
        return ((Boolean) this._userIconLoaded.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean get_userIconLoading() {
        return ((Boolean) this._userIconLoading.getValue()).booleanValue();
    }

    private final void set_userIconLoaded(boolean z11) {
        this._userIconLoaded.setValue(Boolean.valueOf(z11));
    }

    private final void set_userIconLoading(boolean z11) {
        this._userIconLoading.setValue(Boolean.valueOf(z11));
    }

    public final boolean getUserIconLoaded$onetap_compose_release() {
        return get_userIconLoaded();
    }

    public final boolean getUserIconLoading$onetap_compose_release() {
        return get_userIconLoading();
    }

    public final void setUserIconLoaded$onetap_compose_release(boolean z11) {
        if (z11 != get_userIconLoaded()) {
            set_userIconLoaded(z11);
        }
    }

    public final void setUserIconLoading$onetap_compose_release(boolean z11) {
        if (z11 != get_userIconLoading()) {
            set_userIconLoading(z11);
        }
    }
}
