package ru.ozon.app.android.storefront.widgets.cms.banner.presentation;

import Bl0.C2652m;
import GZ.g;
import S0.InterfaceC3967k;
import Tg.b;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BannerComposableKt$BannerComposable$5 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function1<b, Unit> $actionHandler;
    final /* synthetic */ BannerVI $item;
    final /* synthetic */ e $modifier;
    final /* synthetic */ g $router;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BannerComposableKt$BannerComposable$5(BannerVI bannerVI, g gVar, Function1<? super b, Unit> function1, e eVar, int i11, int i12) {
        super(2);
        this.$item = bannerVI;
        this.$router = gVar;
        this.$actionHandler = function1;
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
        BannerComposableKt.BannerComposable(this.$item, this.$router, this.$actionHandler, this.$modifier, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
