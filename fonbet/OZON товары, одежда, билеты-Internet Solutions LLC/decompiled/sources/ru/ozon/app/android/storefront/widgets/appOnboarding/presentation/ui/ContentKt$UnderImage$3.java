package ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.ui;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingVI;
import y0.b0;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ContentKt$UnderImage$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $imageSize;
    final /* synthetic */ b0 $pagerState;
    final /* synthetic */ AppOnboardingVI.Content.UnderImage $underImage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContentKt$UnderImage$3(AppOnboardingVI.Content.UnderImage underImage, b0 b0Var, int i11, int i12) {
        super(2);
        this.$underImage = underImage;
        this.$pagerState = b0Var;
        this.$imageSize = i11;
        this.$$changed = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        ContentKt.UnderImage(this.$underImage, this.$pagerState, this.$imageSize, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
