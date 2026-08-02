package ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.compose.presentation;

import S0.InterfaceC3978p0;
import WZ.l;
import WZ.m;
import WZ.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.ProfileIconButtonVO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProfileIconButtonKt$ProfileIconButton$3$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ InterfaceC3978p0<ActiveTooltip> $activeTooltip$delegate;
    final /* synthetic */ Function0<Unit> $onTooltipDismiss;
    final /* synthetic */ ProfileIconButtonVO $state;
    final /* synthetic */ l $tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileIconButtonKt$ProfileIconButton$3$1(Function0<Unit> function0, InterfaceC3978p0<ActiveTooltip> interfaceC3978p0, ProfileIconButtonVO profileIconButtonVO, l lVar) {
        super(0);
        this.$onTooltipDismiss = function0;
        this.$activeTooltip$delegate = interfaceC3978p0;
        this.$state = profileIconButtonVO;
        this.$tokenizedAnalytics = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ActiveTooltip ProfileIconButton$lambda$1;
        ProfileIconButton$lambda$1 = ProfileIconButtonKt.ProfileIconButton$lambda$1(this.$activeTooltip$delegate);
        if (ProfileIconButton$lambda$1 != null) {
            ProfileIconButtonVO profileIconButtonVO = this.$state;
            l lVar = this.$tokenizedAnalytics;
            Map<String, TokenizedTrackingInfo> trackingInfo = ProfileIconButton$lambda$1.getDto().getTooltipModel().getTrackingInfo();
            if (trackingInfo != null) {
                Long valueOf = Long.valueOf(profileIconButtonVO.getId());
                Intrinsics.checkNotNullParameter(trackingInfo, "<this>");
                m.a(lVar, x.b(trackingInfo, valueOf, null), null);
            }
        }
        this.$onTooltipDismiss.invoke();
    }
}
