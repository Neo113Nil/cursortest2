package ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.ui.utlis;

import S0.InterfaceC3967k;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.draw.c;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.data.model.TopAuthorPaddings;
import ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.presentation.TopAuthorWidgetViewState;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.Paddings;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\t\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0004\b\t\u0010\b\u001a1\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/e;", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState;", "viewState", "topAuthorWidgetBackground", "(Landroidx/compose/ui/e;Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/presentation/TopAuthorWidgetViewState;LS0/k;I)Landroidx/compose/ui/e;", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorPaddings;", "paddings", "topAuthorVerticalPaddings", "(Landroidx/compose/ui/e;Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorPaddings;LS0/k;I)Landroidx/compose/ui/e;", "topAuthorHorizontalPaddings", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lkotlin/Function1;", "", "actionHandler", "clickableAtomAction", "(Landroidx/compose/ui/e;Lru/ozon/uni/atoms/af/AtomAction;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/e;", "Ll1/Z;", "color", "topRadialGradient-4WTKRHQ", "(Landroidx/compose/ui/e;J)Landroidx/compose/ui/e;", "topRadialGradient", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposeUtilsKt {
    @NotNull
    public static final e clickableAtomAction(@NotNull e eVar, AtomAction atomAction, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        return i.b(eVar, null, null, false, null, null, new ComposeUtilsKt$clickableAtomAction$1(atomAction, actionHandler), 28);
    }

    @NotNull
    public static final e topAuthorHorizontalPaddings(@NotNull e eVar, TopAuthorPaddings topAuthorPaddings, InterfaceC3967k interfaceC3967k, int i11) {
        Paddings rightPadding;
        Paddings leftPadding;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        interfaceC3967k.o(-454600174);
        e j11 = T.j(eVar, (topAuthorPaddings == null || (leftPadding = topAuthorPaddings.getLeftPadding()) == null) ? 0 : leftPadding.m1867getDpD9Ej5fM(), 0.0f, (topAuthorPaddings == null || (rightPadding = topAuthorPaddings.getRightPadding()) == null) ? 0 : rightPadding.m1867getDpD9Ej5fM(), 0.0f, 10);
        interfaceC3967k.k();
        return j11;
    }

    @NotNull
    public static final e topAuthorVerticalPaddings(@NotNull e eVar, TopAuthorPaddings topAuthorPaddings, InterfaceC3967k interfaceC3967k, int i11) {
        Paddings bottomPadding;
        Paddings topPadding;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        interfaceC3967k.o(-328051420);
        e j11 = T.j(eVar, 0.0f, (topAuthorPaddings == null || (topPadding = topAuthorPaddings.getTopPadding()) == null) ? 0 : topPadding.m1867getDpD9Ej5fM(), 0.0f, (topAuthorPaddings == null || (bottomPadding = topAuthorPaddings.getBottomPadding()) == null) ? 0 : bottomPadding.m1867getDpD9Ej5fM(), 5);
        interfaceC3967k.k();
        return j11;
    }

    @NotNull
    public static final e topAuthorWidgetBackground(@NotNull e eVar, @NotNull TopAuthorWidgetViewState viewState, InterfaceC3967k interfaceC3967k, int i11) {
        e b11;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        interfaceC3967k.o(115821762);
        int i12 = (i11 >> 3) & 14;
        b11 = androidx.compose.foundation.e.b(a0.u(a0.e(eVar, 1.0f), 3), viewState.mo1521backgroundColorWaAFU9c(interfaceC3967k, i12), y0.a());
        e m1525topRadialGradient4WTKRHQ = m1525topRadialGradient4WTKRHQ(b11, viewState.mo1522topGradientColorWaAFU9c(interfaceC3967k, i12));
        interfaceC3967k.k();
        return m1525topRadialGradient4WTKRHQ;
    }

    /* renamed from: topRadialGradient-4WTKRHQ, reason: not valid java name */
    private static final e m1525topRadialGradient4WTKRHQ(e eVar, long j11) {
        return c.b(eVar, new ComposeUtilsKt$topRadialGradient$1(j11));
    }
}
