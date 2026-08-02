package ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.presentation;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import M4.c;
import android.os.Bundle;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.presentation.AviaCheckTariffsPriceDetailsViewModel;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffsPriceDetails/presentation/AviaCheckTariffsPriceDetailsViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "LM4/c;", "savedStateRegistry", "", "init", "(LM4/c;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffsPriceDetails/presentation/AviaCheckTariffsPriceDetailsVO;", "data", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffsPriceDetails/presentation/AviaCheckTariffsPriceDetailsVO;)V", "LAe/x0;", "_state", "LAe/x0;", "LAe/M0;", "state", "LAe/M0;", "getState", "()LAe/M0;", "Companion", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaCheckTariffsPriceDetailsViewModel extends w0 {

    @NotNull
    private final x0<AviaCheckTariffsPriceDetailsVO> _state;

    @NotNull
    private final M0<AviaCheckTariffsPriceDetailsVO> state;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffsPriceDetails/presentation/AviaCheckTariffsPriceDetailsViewModel$Companion;", "", "<init>", "()V", "EXTRA_BUNDLE", "", "EXTRA_STATE", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AviaCheckTariffsPriceDetailsViewModel() {
        x0<AviaCheckTariffsPriceDetailsVO> a11 = O0.a(null);
        this._state = a11;
        this.state = C2399j.b(a11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle init$lambda$1(AviaCheckTariffsPriceDetailsViewModel aviaCheckTariffsPriceDetailsViewModel) {
        Bundle bundle = new Bundle(1);
        AviaCheckTariffsPriceDetailsVO value = aviaCheckTariffsPriceDetailsViewModel._state.getValue();
        if (value != null) {
            bundle.putParcelable("ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.presentation.EXTRA_STATE", value);
        }
        return bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (r15 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bind(@NotNull AviaCheckTariffsPriceDetailsVO data) {
        AviaCheckTariffsPriceDetailsVO aviaCheckTariffsPriceDetailsVO;
        AviaCheckTariffsPriceDetailsVO aviaCheckTariffsPriceDetailsVO2;
        Intrinsics.checkNotNullParameter(data, "data");
        x0<AviaCheckTariffsPriceDetailsVO> x0Var = this._state;
        AviaCheckTariffsPriceDetailsVO value = x0Var.getValue();
        if (value != null) {
            aviaCheckTariffsPriceDetailsVO = data;
            aviaCheckTariffsPriceDetailsVO2 = AviaCheckTariffsPriceDetailsVO.copy$default(aviaCheckTariffsPriceDetailsVO, 0L, null, null, null, null, null, false, data.getShouldShowContinueButton() || value.getShouldShowContinueButton(), 127, null);
        } else {
            aviaCheckTariffsPriceDetailsVO = data;
        }
        aviaCheckTariffsPriceDetailsVO2 = aviaCheckTariffsPriceDetailsVO;
        x0Var.setValue(aviaCheckTariffsPriceDetailsVO2);
    }

    @NotNull
    public final M0<AviaCheckTariffsPriceDetailsVO> getState() {
        return this.state;
    }

    public final void init(@NotNull c savedStateRegistry) {
        AviaCheckTariffsPriceDetailsVO aviaCheckTariffsPriceDetailsVO;
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Bundle b11 = savedStateRegistry.b("ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.presentation.EXTRA_BUNDLE");
        if (b11 != null && (aviaCheckTariffsPriceDetailsVO = (AviaCheckTariffsPriceDetailsVO) b11.getParcelable("ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.presentation.EXTRA_STATE")) != null) {
            this._state.setValue(aviaCheckTariffsPriceDetailsVO);
        }
        savedStateRegistry.i("ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.presentation.EXTRA_BUNDLE");
        savedStateRegistry.g("ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.presentation.EXTRA_BUNDLE", new c.b() { // from class: sM.b
            @Override // M4.c.b
            public final Bundle saveState() {
                Bundle init$lambda$1;
                init$lambda$1 = AviaCheckTariffsPriceDetailsViewModel.init$lambda$1(AviaCheckTariffsPriceDetailsViewModel.this);
                return init$lambda$1;
            }
        });
    }
}
