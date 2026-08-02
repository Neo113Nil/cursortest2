package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeaderV2;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import WZ.t;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ViewIntent;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewFormHeaderV2ComposableKt$ReviewFormHeaderV2Composable$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function1<AtomAction, Unit> $onAction;
    final /* synthetic */ Function1<ViewIntent.OnBackPressed, Unit> $onBackPressed;
    final /* synthetic */ Function1<Float, Unit> $onRatingClick;
    final /* synthetic */ Function1<t, Unit> $onWidgetBecomeVisible;
    final /* synthetic */ ReviewFormHeaderV2VO $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReviewFormHeaderV2ComposableKt$ReviewFormHeaderV2Composable$3(ReviewFormHeaderV2VO reviewFormHeaderV2VO, Function1<? super Float, Unit> function1, Function1<? super ViewIntent.OnBackPressed, Unit> function12, Function1<? super t, Unit> function13, Function1<? super AtomAction, Unit> function14, e eVar, int i11, int i12) {
        super(2);
        this.$state = reviewFormHeaderV2VO;
        this.$onRatingClick = function1;
        this.$onBackPressed = function12;
        this.$onWidgetBecomeVisible = function13;
        this.$onAction = function14;
        this.$modifier = eVar;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        ReviewFormHeaderV2ComposableKt.ReviewFormHeaderV2Composable(this.$state, this.$onRatingClick, this.$onBackPressed, this.$onWidgetBecomeVisible, this.$onAction, this.$modifier, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
