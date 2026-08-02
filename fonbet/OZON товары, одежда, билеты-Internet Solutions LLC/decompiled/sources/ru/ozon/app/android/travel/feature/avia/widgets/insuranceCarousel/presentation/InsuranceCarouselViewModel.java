package ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.presentation;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Sc.o;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.insuranceCarousel.presentation.InsuranceCarouselViewModelAction;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/presentation/InsuranceCarouselViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "lastSelectedIndex", "", "onSaveLastSelectedIndex", "(I)V", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "onSaveScrollState", "(II)V", "Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/presentation/InsuranceCarouselViewModelAction;", "action", "onAction", "(Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/presentation/InsuranceCarouselViewModelAction;)V", "LAe/x0;", "Lru/ozon/app/android/travel/feature/avia/widgets/insuranceCarousel/presentation/InsuranceCarouselScrollState;", "_state", "LAe/x0;", "LAe/M0;", "state", "LAe/M0;", "getState", "()LAe/M0;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class InsuranceCarouselViewModel extends w0 {

    @NotNull
    private final x0<InsuranceCarouselScrollState> _state;

    @NotNull
    private final M0<InsuranceCarouselScrollState> state;

    public InsuranceCarouselViewModel() {
        x0<InsuranceCarouselScrollState> a11 = O0.a(InsuranceCarouselScrollState.INSTANCE.initial());
        this._state = a11;
        this.state = C2399j.b(a11);
    }

    private final void onSaveLastSelectedIndex(int lastSelectedIndex) {
        this._state.setValue(new InsuranceCarouselScrollState(lastSelectedIndex, this._state.getValue().getFirstVisibleItemIndex(), this._state.getValue().getFirstVisibleItemScrollOffset()));
    }

    private final void onSaveScrollState(int firstVisibleItemIndex, int firstVisibleItemScrollOffset) {
        this._state.setValue(new InsuranceCarouselScrollState(this._state.getValue().getLastSelectedIndex(), firstVisibleItemIndex, firstVisibleItemScrollOffset));
    }

    @NotNull
    public final M0<InsuranceCarouselScrollState> getState() {
        return this.state;
    }

    public final void onAction(@NotNull InsuranceCarouselViewModelAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof InsuranceCarouselViewModelAction.OnSaveLastSelectedIndex) {
            onSaveLastSelectedIndex(((InsuranceCarouselViewModelAction.OnSaveLastSelectedIndex) action).getIndex());
        } else {
            if (!(action instanceof InsuranceCarouselViewModelAction.OnSaveScrollState)) {
                throw new o();
            }
            InsuranceCarouselViewModelAction.OnSaveScrollState onSaveScrollState = (InsuranceCarouselViewModelAction.OnSaveScrollState) action;
            onSaveScrollState(onSaveScrollState.getFirstVisibleItemIndex(), onSaveScrollState.getFirstVisibleItemScrollOffset());
        }
    }
}
