package ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.ui;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingVI;
import u0.InterfaceC9895d;
import y0.b0;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ContentKt$Content$6 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ b0 $pagerState;
    final /* synthetic */ List<AppOnboardingVI.Content.Page> $pages;
    final /* synthetic */ InterfaceC9895d $this_Content;
    final /* synthetic */ Function1<t, Unit> $trackBackSwipe;
    final /* synthetic */ Function1<t, Unit> $trackPageView;
    final /* synthetic */ AppOnboardingVI.Content.UnderImage $underImage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ContentKt$Content$6(InterfaceC9895d interfaceC9895d, List<AppOnboardingVI.Content.Page> list, AppOnboardingVI.Content.UnderImage underImage, b0 b0Var, Function1<? super t, Unit> function1, Function1<? super t, Unit> function12, int i11, int i12) {
        super(2);
        this.$this_Content = interfaceC9895d;
        this.$pages = list;
        this.$underImage = underImage;
        this.$pagerState = b0Var;
        this.$trackBackSwipe = function1;
        this.$trackPageView = function12;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        ContentKt.Content(this.$this_Content, this.$pages, this.$underImage, this.$pagerState, this.$trackBackSwipe, this.$trackPageView, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
