package ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import u0.InterfaceC9895d;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class MatchShoppingCardsViewKt$ScreenLayout$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC6511n<InterfaceC9895d, InterfaceC3967k, Integer, Unit> $cardsDeck;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $dislikeButton;
    final /* synthetic */ boolean $hasCards;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $header;
    final /* synthetic */ boolean $isTeensModeEnabled;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $likeButton;
    final /* synthetic */ e $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MatchShoppingCardsViewKt$ScreenLayout$2(boolean z11, boolean z12, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, InterfaceC6511n<? super InterfaceC9895d, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n, Function2<? super InterfaceC3967k, ? super Integer, Unit> function22, Function2<? super InterfaceC3967k, ? super Integer, Unit> function23, e eVar, int i11, int i12) {
        super(2);
        this.$hasCards = z11;
        this.$isTeensModeEnabled = z12;
        this.$header = function2;
        this.$cardsDeck = interfaceC6511n;
        this.$likeButton = function22;
        this.$dislikeButton = function23;
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
        MatchShoppingCardsViewKt.ScreenLayout(this.$hasCards, this.$isTeensModeEnabled, this.$header, this.$cardsDeck, this.$likeButton, this.$dislikeButton, this.$modifier, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
