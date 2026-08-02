package ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.ui.widgetStates;

import D1.InterfaceC2801g;
import E0.C2942q;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import Sc.o;
import Tg.b;
import U7.i;
import WZ.t;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.lifecycle.AbstractC5434v;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.data.model.TopAuthorDTO;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.data.model.TopAuthorPaddings;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.TopAuthorWidgetViewState;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.ui.utlis.ComposeUtilsKt;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.ui.view.TopAuthorHeaderKt;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.ui.view.author.InitialTopAuthorCellListKt;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.ui.view.author.TopAuthorBZOScoreKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\b\u0010\t\u001a5\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$TopAuthor;", "state", "Lkotlin/Function1;", "LWZ/t;", "", "onView", "LTg/b;", "actionHandler", "TopAuthorWidgetState", "(Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$TopAuthor;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "Landroidx/compose/ui/e;", "modifier", "TopAuthorWidgetContent", "(Landroidx/compose/ui/e;Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState$TopAuthor;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TopAuthorWidgetStateKt {
    public static final void TopAuthorWidgetContent(e eVar, @NotNull TopAuthorWidgetViewState.TopAuthor state, @NotNull Function1<? super b, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        e eVar2;
        int i13;
        C3969l c3969l;
        C3969l c3969l2;
        e b11;
        Paddings bottomPadding;
        Paddings topPadding;
        Paddings rightPadding;
        Paddings leftPadding;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(2129729206);
        int u02 = u11.u0();
        int i14 = i12 & 1;
        if (i14 != 0) {
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
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            e eVar3 = i14 != 0 ? e.f40358c0 : eVar2;
            e u12 = a0.u(a0.e(eVar3, 1.0f), 3);
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.g(), u11, 48);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, u12);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            u11.o(-1354538508);
            if (state.getContent().isEmpty()) {
                u11.p0(u02);
                J0 m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new TopAuthorWidgetStateKt$TopAuthorWidgetContent$1$1(eVar3, state, actionHandler, i11, i12));
                    return;
                }
                return;
            }
            eVar2 = eVar3;
            u11.o(1757422325);
            for (TopAuthorDTO.TopAuthorContent topAuthorContent : state.getContent()) {
                if (topAuthorContent instanceof TopAuthorDTO.TopAuthorContent.TopAuthor) {
                    u11.o(-1598704238);
                    TopAuthorDTO.TopAuthorContent.TopAuthor topAuthor = (TopAuthorDTO.TopAuthorContent.TopAuthor) topAuthorContent;
                    c3969l2 = u11;
                    TopAuthorHeaderKt.TopAuthorHeader(null, topAuthor.getTitle(), topAuthor.getCell(), state.getAction(), actionHandler, c3969l2, (CellDTO.$stable << 6) | (AtomAction.$stable << 9) | ((i13 << 6) & 57344), 1);
                    c3969l2.k();
                } else {
                    c3969l2 = u11;
                    if (topAuthorContent instanceof TopAuthorDTO.TopAuthorContent.Separator) {
                        c3969l2.o(-1598693850);
                        e e11 = a0.e(e.f40358c0, 1.0f);
                        TopAuthorDTO.TopAuthorContent.Separator separator = (TopAuthorDTO.TopAuthorContent.Separator) topAuthorContent;
                        TopAuthorPaddings paddings = separator.getPaddings();
                        float m1867getDpD9Ej5fM = (paddings == null || (leftPadding = paddings.getLeftPadding()) == null) ? 0 : leftPadding.m1867getDpD9Ej5fM();
                        TopAuthorPaddings paddings2 = separator.getPaddings();
                        float m1867getDpD9Ej5fM2 = (paddings2 == null || (rightPadding = paddings2.getRightPadding()) == null) ? 0 : rightPadding.m1867getDpD9Ej5fM();
                        TopAuthorPaddings paddings3 = separator.getPaddings();
                        float m1867getDpD9Ej5fM3 = (paddings3 == null || (topPadding = paddings3.getTopPadding()) == null) ? 0 : topPadding.m1867getDpD9Ej5fM();
                        TopAuthorPaddings paddings4 = separator.getPaddings();
                        e f11 = a0.f(T.i(e11, m1867getDpD9Ej5fM, m1867getDpD9Ej5fM3, m1867getDpD9Ej5fM2, (paddings4 == null || (bottomPadding = paddings4.getBottomPadding()) == null) ? 0 : bottomPadding.m1867getDpD9Ej5fM()), separator.getHeight());
                        C7807Z c7807z = TokenParserKt.tokenToColor(separator.getBackgroundColor(), c3969l2, 0);
                        b11 = androidx.compose.foundation.e.b(f11, c7807z != null ? c7807z.w() : C7807Z.f72258l, y0.a());
                        C5185h.a(b11, c3969l2, 0);
                        c3969l2.k();
                    } else if (topAuthorContent instanceof TopAuthorDTO.TopAuthorContent.Scores) {
                        c3969l2.o(-1598670147);
                        e f12 = T.f(a0.e(e.f40358c0, 1.0f), 8);
                        int i15 = C5179b.f39454h;
                        Y b12 = X.b(C5179b.o(6, InterfaceC6250b.a.g()), InterfaceC6250b.a.l(), c3969l2, 6);
                        int I12 = c3969l2.I();
                        A0 d12 = c3969l2.d();
                        e f13 = c.f(c3969l2, f12);
                        Function0 a13 = g.a(InterfaceC2801g.f5440U, c3969l2);
                        if (c3969l2.t()) {
                            c3969l2.H(a13);
                        } else {
                            c3969l2.e();
                        }
                        Function2 h11 = Cm.e.h(c3969l2, b12, c3969l2, d12);
                        if (c3969l2.t() || !Intrinsics.d(c3969l2.C(), Integer.valueOf(I12))) {
                            a.d(I12, c3969l2, I12, h11);
                        }
                        i.b(c3969l2, f13, 1143595735);
                        List<TopAuthorDTO.TopAuthorContent.Scores.Score> items = ((TopAuthorDTO.TopAuthorContent.Scores) topAuthorContent).getItems();
                        int size = items.size();
                        for (int i16 = 0; i16 < size; i16++) {
                            TopAuthorDTO.TopAuthorContent.Scores.Score score = items.get(i16);
                            e.a aVar = e.f40358c0;
                            if (1.0f <= 0.0d) {
                                throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
                            }
                            float f14 = Float.MAX_VALUE;
                            if (1.0f <= Float.MAX_VALUE) {
                                f14 = 1.0f;
                            }
                            TopAuthorBZOScoreKt.TopAuthorBZOScore(new LayoutWeightElement(f14, true), score, c3969l2, IconDTO.$stable << 3, 0);
                        }
                        c3969l2.k();
                        c3969l2.f();
                        c3969l2.k();
                    } else {
                        if (!(topAuthorContent instanceof TopAuthorDTO.TopAuthorContent.InitialTopAuthor)) {
                            c3969l2.o(-1598705493);
                            c3969l2.k();
                            throw new o();
                        }
                        c3969l2.o(1981467598);
                        InitialTopAuthorCellListKt.InitialTopAuthorCellList(T.j(e.f40358c0, 0.0f, 16, 0.0f, 0.0f, 13), (TopAuthorDTO.TopAuthorContent.InitialTopAuthor) topAuthorContent, actionHandler, c3969l2, (i13 & 896) | 6, 0);
                        c3969l2 = c3969l2;
                        c3969l2.k();
                    }
                }
                u11 = c3969l2;
            }
            c3969l = u11;
            c3969l.k();
            c3969l.k();
            c3969l.f();
        }
        e eVar4 = eVar2;
        J0 m03 = c3969l.m0();
        if (m03 != null) {
            m03.G(new TopAuthorWidgetStateKt$TopAuthorWidgetContent$2(eVar4, state, actionHandler, i11, i12));
        }
    }

    public static final void TopAuthorWidgetState(@NotNull TopAuthorWidgetViewState.TopAuthor state, Function1<? super t, Unit> function1, @NotNull Function1<? super b, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(2089828934);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(state) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(function1) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(actionHandler) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                u11.o(-1547014901);
                Object C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = TopAuthorWidgetStateKt$TopAuthorWidgetState$1$1.INSTANCE;
                    u11.x(C11);
                }
                function1 = (Function1) C11;
                u11.k();
            }
            t tracking = state.getTracking();
            u11.o(-1547012529);
            if (tracking != null) {
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(-353867190);
                boolean F11 = ((i13 & 112) == 32) | u11.F(tracking);
                Object C12 = u11.C();
                if (F11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new TopAuthorWidgetStateKt$TopAuthorWidgetState$2$1$1(function1, tracking);
                    u11.x(C12);
                }
                u11.k();
                e3.i.a(aVar, null, (Function0) C12, u11, 6);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            int i15 = (i13 << 3) & 112;
            TopAuthorWidgetContent(ComposeUtilsKt.topAuthorHorizontalPaddings(ComposeUtilsKt.topAuthorVerticalPaddings(ComposeUtilsKt.topAuthorWidgetBackground(e.f40358c0, state, u11, 6 | i15), state.getPaddings(), u11, 0), state.getPaddings(), u11, 0), state, actionHandler, u11, i15 | (i13 & 896), 0);
        }
        Function1<? super t, Unit> function12 = function1;
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new TopAuthorWidgetStateKt$TopAuthorWidgetState$3(state, function12, actionHandler, i11, i12));
        }
    }
}
