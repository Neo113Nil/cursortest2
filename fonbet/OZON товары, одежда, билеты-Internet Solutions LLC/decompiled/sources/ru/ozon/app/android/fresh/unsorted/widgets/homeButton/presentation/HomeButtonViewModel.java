package ru.ozon.app.android.fresh.unsorted.widgets.homeButton.presentation;

import Ae.E0;
import Ae.InterfaceC2397i;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Sc.C4005g;
import Sc.o;
import Sc.s;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.widgets.homeButton.presentation.ButtonState;
import ru.ozon.app.android.fresh.unsorted.widgets.homeButton.presentation.ScrollLogic;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0011\u0010 \u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/homeButton/presentation/HomeButtonViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "position", "", "setBottomPosition", "(I)V", "Lru/ozon/app/android/fresh/unsorted/widgets/homeButton/presentation/ButtonState;", "state", "updateButtonState", "(Lru/ozon/app/android/fresh/unsorted/widgets/homeButton/presentation/ButtonState;)V", "Lru/ozon/app/android/fresh/unsorted/widgets/homeButton/presentation/ScrollLogic;", "event", "updateScrollState", "(Lru/ozon/app/android/fresh/unsorted/widgets/homeButton/presentation/ScrollLogic;)V", "LAe/w0;", "scrollState", "LAe/w0;", "LAe/x0;", "_buttonState", "LAe/x0;", "LAe/M0;", "buttonState", "LAe/M0;", "getButtonState", "()LAe/M0;", "_bottomPosition", "I", "getBottomPosition", "()I", "bottomPosition", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HomeButtonViewModel extends w0 {
    private int _bottomPosition;

    @NotNull
    private final x0<ButtonState> _buttonState;

    @NotNull
    private final M0<ButtonState> buttonState;

    @NotNull
    private final Ae.w0<ScrollLogic> scrollState = E0.b(0, 0, null, 7);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.fresh.unsorted.widgets.homeButton.presentation.HomeButtonViewModel$1", f = "HomeButtonViewModel.kt", l = {AppUpdateInfo.Factory.DAYS_BETWEEN_30}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.homeButton.presentation.HomeButtonViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return HomeButtonViewModel.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                Ae.w0 w0Var = HomeButtonViewModel.this.scrollState;
                final HomeButtonViewModel homeButtonViewModel = HomeButtonViewModel.this;
                InterfaceC2397i interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.homeButton.presentation.HomeButtonViewModel.1.1
                    @Override // Ae.InterfaceC2397i
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((ScrollLogic) obj2, (d<? super Unit>) dVar);
                    }

                    public final Object emit(ScrollLogic scrollLogic, d<? super Unit> dVar) {
                        if (!(scrollLogic instanceof ScrollLogic.PDP)) {
                            if (!(scrollLogic instanceof ScrollLogic.Default)) {
                                throw new o();
                            }
                            if (((ScrollLogic.Default) scrollLogic).getIsBelow()) {
                                if (Intrinsics.d(HomeButtonViewModel.this.getButtonState().getValue(), ButtonState.Showed.INSTANCE)) {
                                    return Unit.f71690a;
                                }
                                Object emit = HomeButtonViewModel.this._buttonState.emit(ButtonState.Show.INSTANCE, dVar);
                                return emit == Wc.a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
                            }
                            if (Intrinsics.d(HomeButtonViewModel.this.getButtonState().getValue(), ButtonState.Hidden.INSTANCE)) {
                                return Unit.f71690a;
                            }
                            Object emit2 = HomeButtonViewModel.this._buttonState.emit(ButtonState.Hide.INSTANCE, dVar);
                            return emit2 == Wc.a.COROUTINE_SUSPENDED ? emit2 : Unit.f71690a;
                        }
                        ScrollLogic.PDP pdp = (ScrollLogic.PDP) scrollLogic;
                        if (!pdp.getIsBelow()) {
                            if (Intrinsics.d(HomeButtonViewModel.this.getButtonState().getValue(), ButtonState.Hidden.INSTANCE)) {
                                return Unit.f71690a;
                            }
                            Object emit3 = HomeButtonViewModel.this._buttonState.emit(ButtonState.Hide.INSTANCE, dVar);
                            return emit3 == Wc.a.COROUTINE_SUSPENDED ? emit3 : Unit.f71690a;
                        }
                        if (pdp.getIsBelow() && pdp.getDy() < -5) {
                            if (Intrinsics.d(HomeButtonViewModel.this.getButtonState().getValue(), ButtonState.Showed.INSTANCE)) {
                                return Unit.f71690a;
                            }
                            Object emit4 = HomeButtonViewModel.this._buttonState.emit(ButtonState.Show.INSTANCE, dVar);
                            return emit4 == Wc.a.COROUTINE_SUSPENDED ? emit4 : Unit.f71690a;
                        }
                        if (!pdp.getIsBelow() || pdp.getDy() <= 5) {
                            return Unit.f71690a;
                        }
                        if (Intrinsics.d(HomeButtonViewModel.this.getButtonState().getValue(), ButtonState.Hidden.INSTANCE)) {
                            return Unit.f71690a;
                        }
                        Object emit5 = HomeButtonViewModel.this._buttonState.emit(ButtonState.Hide.INSTANCE, dVar);
                        return emit5 == Wc.a.COROUTINE_SUSPENDED ? emit5 : Unit.f71690a;
                    }
                };
                this.label = 1;
                if (w0Var.collect(interfaceC2397i, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            throw new C4005g();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    public HomeButtonViewModel() {
        x0<ButtonState> a11 = O0.a(ButtonState.Hidden.INSTANCE);
        this._buttonState = a11;
        this.buttonState = a11;
        this._bottomPosition = -1;
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new AnonymousClass1(null), 3);
    }

    /* renamed from: getBottomPosition, reason: from getter */
    public final int get_bottomPosition() {
        return this._bottomPosition;
    }

    @NotNull
    public final M0<ButtonState> getButtonState() {
        return this.buttonState;
    }

    public final void setBottomPosition(int position) {
        this._bottomPosition = position;
    }

    public final void updateButtonState(@NotNull ButtonState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new HomeButtonViewModel$updateButtonState$1(this, state, null), 3);
    }

    public final void updateScrollState(@NotNull ScrollLogic event) {
        Intrinsics.checkNotNullParameter(event, "event");
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new HomeButtonViewModel$updateScrollState$1(this, event, null), 3);
    }
}
