package ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.ui.widgetStates;

import Pk0.h;
import S0.A1;
import S0.C3969l;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import Tg.b;
import WZ.t;
import a00.C4911f;
import a1.c;
import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.C5191n;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e3.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m0.C7980b;
import m0.C7984d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.TopAuthorAnimationStateViewModel;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.TopAuthorWidgetViewState;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aI\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aI\u0010\f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\f\u0010\u000b¨\u0006\u000f²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$TopAuthorWithAnimation;", "state", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorAnimationStateViewModel;", "viewModel", "Lkotlin/Function1;", "LWZ/t;", "", "onView", "LTg/b;", "actionHandler", "TopAuthorAnimationState", "(Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$TopAuthorWithAnimation;Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorAnimationStateViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "TopAuthorAnimationStateContent", "Landroidx/lifecycle/v$b;", "lifecycleState", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TopAuthorAnimationStateKt {
    public static final void TopAuthorAnimationState(@NotNull TopAuthorWidgetViewState.TopAuthorWithAnimation state, @NotNull TopAuthorAnimationStateViewModel viewModel, Function1<? super t, Unit> function1, @NotNull Function1<? super b, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Function1<? super t, Unit> function12;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(-485659593);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(state) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((2 & i12) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(viewModel) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= u11.F(actionHandler) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i13 & 1171) == 1170 && u11.b()) {
            u11.j();
            function12 = function1;
        } else {
            if (i14 != 0) {
                u11.o(-632331149);
                Object C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = TopAuthorAnimationStateKt$TopAuthorAnimationState$1$1.INSTANCE;
                    u11.x(C11);
                }
                function1 = (Function1) C11;
                u11.k();
            }
            t tracking = state.getTracking();
            u11.o(-632328777);
            if (tracking != null) {
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(-1324173902);
                boolean F11 = u11.F(tracking) | ((i13 & 896) == 256);
                Object C12 = u11.C();
                if (F11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new TopAuthorAnimationStateKt$TopAuthorAnimationState$2$1$1(function1, tracking);
                    u11.x(C12);
                }
                u11.k();
                i.a(aVar, null, (Function0) C12, u11, 6);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            Function1<? super t, Unit> function13 = function1;
            TopAuthorAnimationStateContent(state, viewModel, function13, actionHandler, u11, i13 & 8190, 0);
            function12 = function13;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new TopAuthorAnimationStateKt$TopAuthorAnimationState$3(state, viewModel, function12, actionHandler, i11, i12));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0071  */
    @SuppressLint({"UnusedBoxWithConstraintsScope"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TopAuthorAnimationStateContent(@NotNull TopAuthorWidgetViewState.TopAuthorWithAnimation state, @NotNull TopAuthorAnimationStateViewModel viewModel, Function1<? super t, Unit> function1, @NotNull Function1<? super b, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Function1<? super t, Unit> function12;
        Function1<? super t, Unit> function13;
        Object C11;
        Object b11;
        Object b12;
        boolean z11;
        Object C12;
        boolean z12;
        Object C13;
        C3969l c3969l;
        Function1<? super t, Unit> function14;
        J0 m02;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(157498354);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(state) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(viewModel) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            function12 = function1;
            i13 |= u11.F(function12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            if ((i12 & 8) == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                i13 |= u11.F(actionHandler) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            }
            if ((i13 & 1171) == 1170 || !u11.b()) {
                if (i14 == 0) {
                    u11.o(208342474);
                    Object C14 = u11.C();
                    if (C14 == InterfaceC3967k.a.a()) {
                        C14 = TopAuthorAnimationStateKt$TopAuthorAnimationStateContent$1$1.INSTANCE;
                        u11.x(C14);
                    }
                    u11.k();
                    function13 = (Function1) C14;
                } else {
                    function13 = function12;
                }
                u11.o(208345155);
                C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = C7984d.a(0.0f);
                    u11.x(C11);
                }
                C7980b c7980b = (C7980b) C11;
                b11 = h.b(u11, 208347139);
                if (b11 == InterfaceC3967k.a.a()) {
                    b11 = C7984d.a(0.0f);
                    u11.x(b11);
                }
                C7980b c7980b2 = (C7980b) b11;
                b12 = h.b(u11, 208348778);
                if (b12 == InterfaceC3967k.a.a()) {
                    b12 = n1.f(Boolean.FALSE, D1.f25195a);
                    u11.x(b12);
                }
                InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) b12;
                u11.k();
                u11.o(208351314);
                int i15 = i13 & 112;
                z11 = i15 != 32;
                C12 = u11.C();
                if (!z11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new TopAuthorAnimationStateKt$TopAuthorAnimationStateContent$onConfettiFinished$1$1(viewModel);
                    u11.x(C12);
                }
                Function0 function0 = (Function0) C12;
                u11.k();
                boolean z13 = TopAuthorAnimationStateContent$lambda$8(n1.b(((C4911f) u11.m(f.d())).e().getLifecycle().c(), u11)) != AbstractC5434v.b.RESUMED;
                Unit unit = Unit.f71690a;
                u11.o(208361702);
                z12 = i15 == 32;
                C13 = u11.C();
                if (!z12 || C13 == InterfaceC3967k.a.a()) {
                    C13 = new TopAuthorAnimationStateKt$TopAuthorAnimationStateContent$2$1(viewModel, interfaceC3978p0);
                    u11.x(C13);
                }
                u11.k();
                Q.c(unit, (Function1) C13, u11);
                c3969l = u11;
                C5191n.a(null, null, c.c(-692968612, new TopAuthorAnimationStateKt$TopAuthorAnimationStateContent$3(z13, viewModel, c7980b, c7980b2, interfaceC3978p0, function0, state, function13, actionHandler), u11), c3969l, 3072, 7);
                function14 = function13;
            } else {
                u11.j();
                function14 = function12;
                c3969l = u11;
            }
            m02 = c3969l.m0();
            if (m02 == null) {
                m02.G(new TopAuthorAnimationStateKt$TopAuthorAnimationStateContent$4(state, viewModel, function14, actionHandler, i11, i12));
                return;
            }
            return;
        }
        function12 = function1;
        if ((i12 & 8) == 0) {
        }
        if ((i13 & 1171) == 1170) {
        }
        if (i14 == 0) {
        }
        u11.o(208345155);
        C11 = u11.C();
        if (C11 == InterfaceC3967k.a.a()) {
        }
        C7980b c7980b3 = (C7980b) C11;
        b11 = h.b(u11, 208347139);
        if (b11 == InterfaceC3967k.a.a()) {
        }
        C7980b c7980b22 = (C7980b) b11;
        b12 = h.b(u11, 208348778);
        if (b12 == InterfaceC3967k.a.a()) {
        }
        InterfaceC3978p0 interfaceC3978p02 = (InterfaceC3978p0) b12;
        u11.k();
        u11.o(208351314);
        int i152 = i13 & 112;
        if (i152 != 32) {
        }
        C12 = u11.C();
        if (!z11) {
        }
        C12 = new TopAuthorAnimationStateKt$TopAuthorAnimationStateContent$onConfettiFinished$1$1(viewModel);
        u11.x(C12);
        Function0 function02 = (Function0) C12;
        u11.k();
        if (TopAuthorAnimationStateContent$lambda$8(n1.b(((C4911f) u11.m(f.d())).e().getLifecycle().c(), u11)) != AbstractC5434v.b.RESUMED) {
        }
        Unit unit2 = Unit.f71690a;
        u11.o(208361702);
        if (i152 == 32) {
        }
        C13 = u11.C();
        if (!z12) {
        }
        C13 = new TopAuthorAnimationStateKt$TopAuthorAnimationStateContent$2$1(viewModel, interfaceC3978p02);
        u11.x(C13);
        u11.k();
        Q.c(unit2, (Function1) C13, u11);
        c3969l = u11;
        C5191n.a(null, null, c.c(-692968612, new TopAuthorAnimationStateKt$TopAuthorAnimationStateContent$3(z13, viewModel, c7980b3, c7980b22, interfaceC3978p02, function02, state, function13, actionHandler), u11), c3969l, 3072, 7);
        function14 = function13;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    private static final AbstractC5434v.b TopAuthorAnimationStateContent$lambda$8(A1<? extends AbstractC5434v.b> a12) {
        return a12.getValue();
    }
}
