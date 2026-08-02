package ru.ozon.app.android.pdp.ui.configurators.pdp;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayOnPageRepository;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class PdpConfigurator$onDestroy$2 extends C7735q implements Function1<String, Unit> {
    PdpConfigurator$onDestroy$2(Object obj) {
        super(1, obj, OnBoardingDisplayOnPageRepository.Default.class, "removePageFromCache", "removePageFromCache(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((OnBoardingDisplayOnPageRepository.Default) this.receiver).removePageFromCache(p02);
    }
}
