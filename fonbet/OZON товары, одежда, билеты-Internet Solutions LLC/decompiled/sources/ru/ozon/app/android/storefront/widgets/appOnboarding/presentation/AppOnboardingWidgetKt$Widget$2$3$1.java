package ru.ozon.app.android.storefront.widgets.appOnboarding.presentation;

import fd.InterfaceC6511n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import y0.b0;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AppOnboardingWidgetKt$Widget$2$3$1 extends AbstractC7737t implements Function2<AtomActionDTO, Map<String, ? extends TokenizedTrackingInfo>, Unit> {
    final /* synthetic */ InterfaceC6511n<AtomActionDTO, Map<String, TokenizedTrackingInfo>, Integer, Unit> $onSkipClick;
    final /* synthetic */ b0 $pagerState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AppOnboardingWidgetKt$Widget$2$3$1(InterfaceC6511n<? super AtomActionDTO, ? super Map<String, TokenizedTrackingInfo>, ? super Integer, Unit> interfaceC6511n, b0 b0Var) {
        super(2);
        this.$onSkipClick = interfaceC6511n;
        this.$pagerState = b0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(AtomActionDTO atomActionDTO, Map<String, ? extends TokenizedTrackingInfo> map) {
        invoke2(atomActionDTO, (Map<String, TokenizedTrackingInfo>) map);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomActionDTO action, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.$onSkipClick.invoke(action, map, Integer.valueOf(this.$pagerState.r() + 1));
    }
}
