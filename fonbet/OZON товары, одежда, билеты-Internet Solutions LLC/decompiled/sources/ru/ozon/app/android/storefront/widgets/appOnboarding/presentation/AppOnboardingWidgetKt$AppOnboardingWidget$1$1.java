package ru.ozon.app.android.storefront.widgets.appOnboarding.presentation;

import fd.InterfaceC6511n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AppOnboardingWidgetKt$AppOnboardingWidget$1$1 extends AbstractC7737t implements InterfaceC6511n<AtomActionDTO, Map<String, ? extends TokenizedTrackingInfo>, Integer, Unit> {
    public static final AppOnboardingWidgetKt$AppOnboardingWidget$1$1 INSTANCE = new AppOnboardingWidgetKt$AppOnboardingWidget$1$1();

    AppOnboardingWidgetKt$AppOnboardingWidget$1$1() {
        super(3);
    }

    public final void invoke(AtomActionDTO aa2, Map<String, TokenizedTrackingInfo> map, int i11) {
        Intrinsics.checkNotNullParameter(aa2, "aa");
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(AtomActionDTO atomActionDTO, Map<String, ? extends TokenizedTrackingInfo> map, Integer num) {
        invoke(atomActionDTO, (Map<String, TokenizedTrackingInfo>) map, num.intValue());
        return Unit.f71690a;
    }
}
