package ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.ui.widgetStates;

import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import Tg.b;
import WZ.t;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.lifecycle.AbstractC5434v;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.i;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.TopAuthorWidgetViewState;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.ui.utlis.ComposeUtilsKt;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.ui.view.TopAuthorHeaderKt;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.ui.view.counter.CirclesCounterViewKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aU\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aI\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$Counter;", "state", "Lkotlin/Function1;", "LWZ/t;", "", "onView", "LTg/b;", "actionHandler", "", "lineAnimationProgress", "circleAnimationProgress", "CounterWidgetState", "(Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$Counter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FFLS0/k;II)V", "Landroidx/compose/ui/e;", "modifier", "CounterWidgetStateContent", "(Landroidx/compose/ui/e;Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$Counter;Lkotlin/jvm/functions/Function1;FFLS0/k;II)V", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CounterWidgetStateKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CounterWidgetState(@NotNull TopAuthorWidgetViewState.Counter state, Function1<? super t, Unit> function1, @NotNull Function1<? super b, Unit> actionHandler, float f7, float f11, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Function1<? super t, Unit> function12;
        int i14;
        float f12;
        int i15;
        float f13;
        t tracking;
        boolean F11;
        Object C11;
        C3969l c3969l;
        float f14;
        float f15;
        J0 m02;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(-1787098974);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(state) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i16 = i12 & 2;
        if (i16 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            function12 = function1;
            i13 |= u11.F(function12) ? 32 : 16;
            if ((i12 & 4) == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                i13 |= u11.F(actionHandler) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            i14 = i12 & 8;
            if (i14 == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                f12 = f7;
                i13 |= u11.q(f12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                i15 = i12 & 16;
                if (i15 != 0) {
                    i13 |= 24576;
                } else if ((i11 & 24576) == 0) {
                    f13 = f11;
                    i13 |= u11.q(f13) ? 16384 : 8192;
                    if ((i13 & 9363) == 9362 || !u11.b()) {
                        if (i16 != 0) {
                            u11.o(1988172175);
                            Object C12 = u11.C();
                            if (C12 == InterfaceC3967k.a.a()) {
                                C12 = CounterWidgetStateKt$CounterWidgetState$1$1.INSTANCE;
                                u11.x(C12);
                            }
                            u11.k();
                            function12 = (Function1) C12;
                        }
                        if (i14 != 0) {
                            f12 = 1.0f;
                        }
                        float f16 = i15 == 0 ? 1.0f : f13;
                        tracking = state.getTracking();
                        u11.o(1988177107);
                        if (tracking != null) {
                            AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                            u11.o(-684942642);
                            boolean F12 = ((i13 & 112) == 32) | u11.F(tracking);
                            Object C13 = u11.C();
                            if (F12 || C13 == InterfaceC3967k.a.a()) {
                                C13 = new CounterWidgetStateKt$CounterWidgetState$2$1$1(function12, tracking);
                                u11.x(C13);
                            }
                            u11.k();
                            i.a(aVar, null, (Function0) C13, u11, 6);
                            Unit unit = Unit.f71690a;
                        }
                        u11.k();
                        int i17 = (i13 << 3) & 112;
                        e eVar = ComposeUtilsKt.topAuthorVerticalPaddings(ComposeUtilsKt.topAuthorWidgetBackground(e.f40358c0, state, u11, 6 | i17), state.getPaddings(), u11, 0);
                        u11.o(1988194805);
                        int i18 = i13 & 896;
                        F11 = u11.F(state) | (i18 == 256);
                        C11 = u11.C();
                        if (!F11 || C11 == InterfaceC3967k.a.a()) {
                            C11 = new CounterWidgetStateKt$CounterWidgetState$3$1(state, actionHandler);
                            u11.x(C11);
                        }
                        u11.k();
                        float f17 = f12;
                        CounterWidgetStateContent(androidx.compose.foundation.i.b(eVar, null, null, false, null, null, (Function0) C11, 28), state, actionHandler, f17, f16, u11, i17 | i18 | (i13 & 7168) | (57344 & i13), 0);
                        c3969l = u11;
                        f14 = f16;
                        f15 = f17;
                    } else {
                        u11.j();
                        c3969l = u11;
                        f15 = f12;
                        f14 = f13;
                    }
                    Function1<? super t, Unit> function13 = function12;
                    m02 = c3969l.m0();
                    if (m02 == null) {
                        m02.G(new CounterWidgetStateKt$CounterWidgetState$4(state, function13, actionHandler, f15, f14, i11, i12));
                        return;
                    }
                    return;
                }
                f13 = f11;
                if ((i13 & 9363) == 9362) {
                }
                if (i16 != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 == 0) {
                }
                tracking = state.getTracking();
                u11.o(1988177107);
                if (tracking != null) {
                }
                u11.k();
                int i172 = (i13 << 3) & 112;
                e eVar2 = ComposeUtilsKt.topAuthorVerticalPaddings(ComposeUtilsKt.topAuthorWidgetBackground(e.f40358c0, state, u11, 6 | i172), state.getPaddings(), u11, 0);
                u11.o(1988194805);
                int i182 = i13 & 896;
                F11 = u11.F(state) | (i182 == 256);
                C11 = u11.C();
                if (!F11) {
                }
                C11 = new CounterWidgetStateKt$CounterWidgetState$3$1(state, actionHandler);
                u11.x(C11);
                u11.k();
                float f172 = f12;
                CounterWidgetStateContent(androidx.compose.foundation.i.b(eVar2, null, null, false, null, null, (Function0) C11, 28), state, actionHandler, f172, f16, u11, i172 | i182 | (i13 & 7168) | (57344 & i13), 0);
                c3969l = u11;
                f14 = f16;
                f15 = f172;
                Function1<? super t, Unit> function132 = function12;
                m02 = c3969l.m0();
                if (m02 == null) {
                }
            }
            f12 = f7;
            i15 = i12 & 16;
            if (i15 != 0) {
            }
            f13 = f11;
            if ((i13 & 9363) == 9362) {
            }
            if (i16 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 == 0) {
            }
            tracking = state.getTracking();
            u11.o(1988177107);
            if (tracking != null) {
            }
            u11.k();
            int i1722 = (i13 << 3) & 112;
            e eVar22 = ComposeUtilsKt.topAuthorVerticalPaddings(ComposeUtilsKt.topAuthorWidgetBackground(e.f40358c0, state, u11, 6 | i1722), state.getPaddings(), u11, 0);
            u11.o(1988194805);
            int i1822 = i13 & 896;
            F11 = u11.F(state) | (i1822 == 256);
            C11 = u11.C();
            if (!F11) {
            }
            C11 = new CounterWidgetStateKt$CounterWidgetState$3$1(state, actionHandler);
            u11.x(C11);
            u11.k();
            float f1722 = f12;
            CounterWidgetStateContent(androidx.compose.foundation.i.b(eVar22, null, null, false, null, null, (Function0) C11, 28), state, actionHandler, f1722, f16, u11, i1722 | i1822 | (i13 & 7168) | (57344 & i13), 0);
            c3969l = u11;
            f14 = f16;
            f15 = f1722;
            Function1<? super t, Unit> function1322 = function12;
            m02 = c3969l.m0();
            if (m02 == null) {
            }
        }
        function12 = function1;
        if ((i12 & 4) == 0) {
        }
        i14 = i12 & 8;
        if (i14 == 0) {
        }
        f12 = f7;
        i15 = i12 & 16;
        if (i15 != 0) {
        }
        f13 = f11;
        if ((i13 & 9363) == 9362) {
        }
        if (i16 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 == 0) {
        }
        tracking = state.getTracking();
        u11.o(1988177107);
        if (tracking != null) {
        }
        u11.k();
        int i17222 = (i13 << 3) & 112;
        e eVar222 = ComposeUtilsKt.topAuthorVerticalPaddings(ComposeUtilsKt.topAuthorWidgetBackground(e.f40358c0, state, u11, 6 | i17222), state.getPaddings(), u11, 0);
        u11.o(1988194805);
        int i18222 = i13 & 896;
        F11 = u11.F(state) | (i18222 == 256);
        C11 = u11.C();
        if (!F11) {
        }
        C11 = new CounterWidgetStateKt$CounterWidgetState$3$1(state, actionHandler);
        u11.x(C11);
        u11.k();
        float f17222 = f12;
        CounterWidgetStateContent(androidx.compose.foundation.i.b(eVar222, null, null, false, null, null, (Function0) C11, 28), state, actionHandler, f17222, f16, u11, i17222 | i18222 | (i13 & 7168) | (57344 & i13), 0);
        c3969l = u11;
        f14 = f16;
        f15 = f17222;
        Function1<? super t, Unit> function13222 = function12;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CounterWidgetStateContent(e eVar, @NotNull TopAuthorWidgetViewState.Counter state, @NotNull Function1<? super b, Unit> actionHandler, float f7, float f11, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        e eVar2;
        int i13;
        float f12;
        int i14;
        float f13;
        int i15;
        float f14;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(-1503362771);
        int i16 = i12 & 1;
        if (i16 != 0) {
            i13 = i11 | 6;
            eVar2 = eVar;
        } else if ((i11 & 6) == 0) {
            eVar2 = eVar;
            i13 = (u11.n(eVar2) ? 4 : 2) | i11;
        } else {
            eVar2 = eVar;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(state) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(actionHandler) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i17 = i12 & 8;
        if (i17 != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            f12 = f7;
            i13 |= u11.q(f12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            i14 = i12 & 16;
            if (i14 == 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                f13 = f11;
                i13 |= u11.q(f13) ? 16384 : 8192;
                i15 = i13;
                if ((i15 & 9363) == 9362 || !u11.b()) {
                    if (i16 != 0) {
                        eVar2 = e.f40358c0;
                    }
                    float f15 = i17 != 0 ? 1.0f : f12;
                    if (i14 != 0) {
                        f13 = 1.0f;
                    }
                    if (state.getCounterDTO() == null) {
                        J0 m02 = u11.m0();
                        if (m02 != null) {
                            m02.G(new CounterWidgetStateKt$CounterWidgetStateContent$1(eVar2, state, actionHandler, f15, f13, i11, i12));
                            return;
                        }
                        return;
                    }
                    e eVar3 = eVar2;
                    float f16 = f15;
                    Pair<e, Integer> counterPaddings = state.getCounterPaddings();
                    e a11 = counterPaddings.a();
                    int intValue = counterPaddings.b().intValue();
                    C5194q a12 = C5193p.a(C5179b.g(), InterfaceC6250b.a.g(), u11, 48);
                    int I11 = u11.I();
                    A0 d11 = u11.d();
                    e f17 = c.f(u11, eVar3);
                    Function0 a13 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                        u11.H(a13);
                    } else {
                        u11.e();
                    }
                    Function2 g10 = K00.b.g(u11, a12, u11, d11);
                    if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                        a.d(I11, u11, I11, g10);
                    }
                    F1.b(u11, f17, InterfaceC2801g.a.f());
                    TextDTO title = state.getCounterDTO().getTitle();
                    CellDTO cell = state.getCounterDTO().getCell();
                    e.a aVar = e.f40358c0;
                    TopAuthorHeaderKt.TopAuthorHeader(ComposeUtilsKt.topAuthorHorizontalPaddings(aVar, state.getPaddings(), u11, 6), title, cell, state.getAction(), actionHandler, u11, ((i15 << 6) & 57344) | (CellDTO.$stable << 6) | (AtomAction.$stable << 9), 0);
                    float f18 = 20;
                    float f19 = intValue;
                    CirclesCounterViewKt.CirclesCounterView(T.j(a11, f19, f18, f19, 0.0f, 8), state.getCounterDTO().getCirclesConfig(), f16, f13, u11, (i15 >> 3) & 8064, 0);
                    TextDTO titleFooter = state.getCounterDTO().getTitleFooter();
                    u11.o(-1217280982);
                    if (titleFooter != null) {
                        DsTextAtomKt.DsTextAtom(titleFooter, T.j(aVar, 0.0f, f18, 0.0f, 0.0f, 13).l0(new HorizontalAlignElement(InterfaceC6250b.a.g())), u11, 0, 0);
                    }
                    u11.k();
                    u11.f();
                    eVar2 = eVar3;
                    f14 = f16;
                } else {
                    u11.j();
                    f14 = f12;
                }
                float f21 = f13;
                J0 m03 = u11.m0();
                if (m03 != null) {
                    m03.G(new CounterWidgetStateKt$CounterWidgetStateContent$3(eVar2, state, actionHandler, f14, f21, i11, i12));
                    return;
                }
                return;
            }
            f13 = f11;
            i15 = i13;
            if ((i15 & 9363) == 9362) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            if (i14 != 0) {
            }
            if (state.getCounterDTO() == null) {
            }
        }
        f12 = f7;
        i14 = i12 & 16;
        if (i14 == 0) {
        }
        f13 = f11;
        i15 = i13;
        if ((i15 & 9363) == 9362) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        if (i14 != 0) {
        }
        if (state.getCounterDTO() == null) {
        }
    }
}
