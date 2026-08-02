package ru.ozon.app.android.cml.delivery.widgets.inputCurtain.presentation;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.O0;
import Ae.x0;
import androidx.lifecycle.w0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.common.ext.OzonTextInputLayoutExtKt;
import ru.ozon.app.android.cml.delivery.molecules.input.data.InputMoleculeDTO;
import xe.C10727i;
import ze.C11115c;
import ze.h;
import ze.k;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00148\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/inputCurtain/presentation/InputCurtainViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "setExecutingAction", "(Z)V", "Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO$InputStatus;", "status", "", "message", "price", "updateState", "(Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO$InputStatus;Ljava/lang/String;Ljava/lang/String;)V", "Lze/h;", "Lru/ozon/app/android/cml/delivery/widgets/inputCurtain/presentation/InputCurtainUpdate;", "_inputCurtainUpdate", "Lze/h;", "LAe/h;", "inputCurtainUpdate", "LAe/h;", "getInputCurtainUpdate", "()LAe/h;", "LAe/x0;", "_executingAction", "LAe/x0;", "executingAction", "getExecutingAction", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InputCurtainViewModel extends w0 {

    @NotNull
    private final x0<Boolean> _executingAction;

    @NotNull
    private final h<InputCurtainUpdate> _inputCurtainUpdate;

    @NotNull
    private final InterfaceC2395h<Boolean> executingAction;

    @NotNull
    private final InterfaceC2395h<InputCurtainUpdate> inputCurtainUpdate;

    public InputCurtainViewModel() {
        C11115c a11 = k.a(0, 7, null);
        this._inputCurtainUpdate = a11;
        this.inputCurtainUpdate = C2399j.H(a11);
        x0<Boolean> a12 = O0.a(Boolean.FALSE);
        this._executingAction = a12;
        this.executingAction = C2399j.b(a12);
    }

    @NotNull
    public final InterfaceC2395h<Boolean> getExecutingAction() {
        return this.executingAction;
    }

    @NotNull
    public final InterfaceC2395h<InputCurtainUpdate> getInputCurtainUpdate() {
        return this.inputCurtainUpdate;
    }

    public final void setExecutingAction(boolean value) {
        this._executingAction.setValue(Boolean.valueOf(value));
    }

    public final void updateState(@NotNull InputMoleculeDTO.InputStatus status, @NotNull String message, @NotNull String price) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(price, "price");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new InputCurtainViewModel$updateState$1(this, new InputCurtainUpdate(OzonTextInputLayoutExtKt.toOzonTextInputLayoutStatus(status), message, OzonTextInputLayoutExtKt.toOzonColor(status), price), null), 3);
    }
}
