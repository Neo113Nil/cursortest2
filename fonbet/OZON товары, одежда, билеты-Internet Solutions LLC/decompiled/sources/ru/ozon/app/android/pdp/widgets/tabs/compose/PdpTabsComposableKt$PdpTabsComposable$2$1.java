package ru.ozon.app.android.pdp.widgets.tabs.compose;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.widgets.tabs.presentation.PdpTabsVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class PdpTabsComposableKt$PdpTabsComposable$2$1 extends AbstractC7737t implements Function1<PdpTabsVO.Tab, Unit> {
    public static final PdpTabsComposableKt$PdpTabsComposable$2$1 INSTANCE = new PdpTabsComposableKt$PdpTabsComposable$2$1();

    PdpTabsComposableKt$PdpTabsComposable$2$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PdpTabsVO.Tab it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PdpTabsVO.Tab tab) {
        invoke2(tab);
        return Unit.f71690a;
    }
}
