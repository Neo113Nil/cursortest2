package ru.ozon.app.android.pikazon.internal;

import Ae.M0;
import Ud0.a;
import Yd0.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR*\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pikazon/internal/PikazonLimbLPApiDelegateImpl;", "", "", "cdnChooserEnabled", "disabledWarmUp", "<init>", "(ZZ)V", "LAe/M0;", "LUd0/a;", "getConfigFlow", "()LAe/M0;", "", "warmUpPikazonAfterModify", "()V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Z", "getCdnChooserEnabled", "()Z", "setCdnChooserEnabled", "(Z)V", "getDisabledWarmUp", "setDisabledWarmUp", "Lru/ozon/app/android/pikazon/internal/PikazonLPLibraryImpl;", "_pikazonLimbApi", "Lru/ozon/app/android/pikazon/internal/PikazonLPLibraryImpl;", "getPikazonLimbApi", "()Ljava/lang/Object;", "pikazonLimbApi", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PikazonLimbLPApiDelegateImpl {
    private boolean disabledWarmUp;
    private boolean cdnChooserEnabled;

    @NotNull
    private final PikazonLPLibraryImpl _pikazonLimbApi = new PikazonLPLibraryImpl(this.disabledWarmUp, this.cdnChooserEnabled);

    public PikazonLimbLPApiDelegateImpl(boolean z11, boolean z12) {
        setCdnChooserEnabled(z11);
        setDisabledWarmUp(z12);
    }

    public final M0<a> getConfigFlow() {
        b input;
        if (!this.cdnChooserEnabled || (input = this._pikazonLimbApi.getInput()) == null) {
            return null;
        }
        return input.a();
    }

    @NotNull
    public final Object getPikazonLimbApi() {
        return this._pikazonLimbApi;
    }

    public final void setCdnChooserEnabled(boolean z11) {
        this.cdnChooserEnabled = z11;
        this._pikazonLimbApi.setCdnChooserEnabled$lib_release(z11);
    }

    public final void setDisabledWarmUp(boolean z11) {
        this.disabledWarmUp = z11;
        this._pikazonLimbApi.setDisabledWarmUp$lib_release(z11);
    }

    public final void warmUpPikazonAfterModify() {
        if (PikazonLPLibraryImpl.INSTANCE.getLibStarted()) {
            this._pikazonLimbApi.warmUpPikazon();
        }
    }
}
