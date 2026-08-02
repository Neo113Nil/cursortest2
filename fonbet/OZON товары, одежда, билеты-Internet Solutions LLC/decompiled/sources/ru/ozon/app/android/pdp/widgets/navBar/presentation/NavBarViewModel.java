package ru.ozon.app.android.pdp.widgets.navBar.presentation;

import A00.a;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Sc.s;
import androidx.lifecycle.w0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\rJ\u0015\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0014¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001f\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070!8\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b\b\u0010#R$\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010\tR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010 R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070!8\u0006¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b(\u0010#R$\u0010)\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R@\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00142\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010&¨\u00062"}, d2 = {"Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarViewModel;", "Landroidx/lifecycle/w0;", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "controller", "<init>", "(Ll10/b;)V", "", "isBackgroundVisible", "()Z", "isVisible", "", "setBackgroundVisibility", "(Z)V", "setBackgroundVisibilityConstantly", "newValue", "setScrollOffsetMode", "", "setLastScrollOffset", "(I)V", "Lkotlin/Pair;", "setTargetScrollViewPos", "(Lkotlin/Pair;)V", "isAlwaysSolid", "Lkotlin/Function0;", "onUpdate", "updateNavBarOverlapSizeIfNeeded", "(ZLkotlin/jvm/functions/Function0;)V", "removeNavbarWidget", "()V", "LAe/x0;", "_isBackgroundVisible", "LAe/x0;", "LAe/M0;", "LAe/M0;", "()LAe/M0;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isBackgroundVisibilityConstant", "Z", "_isScrollOffsetMode", "isScrollOffsetMode", "lastScrollOffset", "I", "getLastScrollOffset", "()I", "targetScrollViewPos", "Lkotlin/Pair;", "getTargetScrollViewPos", "()Lkotlin/Pair;", "isInitialAlwaysSolid", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NavBarViewModel extends w0 {

    @NotNull
    private final x0<Boolean> _isBackgroundVisible;

    @NotNull
    private final x0<Boolean> _isScrollOffsetMode;
    private boolean isBackgroundVisibilityConstant;

    @NotNull
    private final M0<Boolean> isBackgroundVisible;
    private boolean isInitialAlwaysSolid;

    @NotNull
    private final M0<Boolean> isScrollOffsetMode;
    private int lastScrollOffset;
    private Pair<Integer, Integer> targetScrollViewPos;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA00/a;", "it", "", "<anonymous>", "(LA00/a;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.pdp.widgets.navBar.presentation.NavBarViewModel$1", f = "NavBarViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.pdp.widgets.navBar.presentation.NavBarViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<a, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = NavBarViewModel.this.new AnonymousClass1(dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(a aVar, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(aVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            a aVar2 = (a) this.L$0;
            if ((aVar2 instanceof a.u.b) && ((a.u.b) aVar2).j() == null) {
                NavBarViewModel.this.setScrollOffsetMode(false);
            }
            return Unit.f71690a;
        }
    }

    public NavBarViewModel(@NotNull InterfaceC7851b controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        x0<Boolean> a11 = O0.a(null);
        this._isBackgroundVisible = a11;
        this.isBackgroundVisible = C2399j.b(a11);
        x0<Boolean> a12 = O0.a(Boolean.TRUE);
        this._isScrollOffsetMode = a12;
        this.isScrollOffsetMode = C2399j.b(a12);
        C2399j.C(new C2408n0(controller.getEventsFlow(), new AnonymousClass1(null)), androidx.lifecycle.x0.a(this));
    }

    public final int getLastScrollOffset() {
        return this.lastScrollOffset;
    }

    public final Pair<Integer, Integer> getTargetScrollViewPos() {
        return this.targetScrollViewPos;
    }

    /* renamed from: isBackgroundVisibilityConstant, reason: from getter */
    public final boolean getIsBackgroundVisibilityConstant() {
        return this.isBackgroundVisibilityConstant;
    }

    @NotNull
    public final M0<Boolean> isBackgroundVisible() {
        return this.isBackgroundVisible;
    }

    @NotNull
    public final M0<Boolean> isScrollOffsetMode() {
        return this.isScrollOffsetMode;
    }

    public final void removeNavbarWidget() {
        this.isInitialAlwaysSolid = false;
    }

    public final void setBackgroundVisibility(boolean isVisible) {
        if (this.isBackgroundVisibilityConstant) {
            return;
        }
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new NavBarViewModel$setBackgroundVisibility$1(this, isVisible, null), 3);
    }

    public final void setBackgroundVisibilityConstantly(boolean isVisible) {
        this.isBackgroundVisibilityConstant = true;
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new NavBarViewModel$setBackgroundVisibilityConstantly$1(this, isVisible, null), 3);
    }

    public final void setLastScrollOffset(int newValue) {
        this.lastScrollOffset = newValue;
    }

    public final void setScrollOffsetMode(boolean newValue) {
        C10727i.c(androidx.lifecycle.x0.a(this), null, null, new NavBarViewModel$setScrollOffsetMode$1(this, newValue, null), 3);
    }

    public final void setTargetScrollViewPos(@NotNull Pair<Integer, Integer> newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        this.targetScrollViewPos = newValue;
    }

    public final void updateNavBarOverlapSizeIfNeeded(boolean isAlwaysSolid, @NotNull Function0<Unit> onUpdate) {
        Intrinsics.checkNotNullParameter(onUpdate, "onUpdate");
        if (this.isInitialAlwaysSolid != isAlwaysSolid) {
            this.isInitialAlwaysSolid = isAlwaysSolid;
            onUpdate.invoke();
        }
    }

    /* renamed from: isBackgroundVisible, reason: collision with other method in class */
    public final boolean m888isBackgroundVisible() {
        Boolean value = this._isBackgroundVisible.getValue();
        if (value != null) {
            return value.booleanValue();
        }
        return false;
    }
}
