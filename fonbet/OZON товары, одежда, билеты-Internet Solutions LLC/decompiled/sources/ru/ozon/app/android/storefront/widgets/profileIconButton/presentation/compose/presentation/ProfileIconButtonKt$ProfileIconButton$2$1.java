package ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.compose.presentation;

import S0.InterfaceC3978p0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/storefront/widgets/profileIconButton/presentation/compose/presentation/ActiveTooltip;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProfileIconButtonKt$ProfileIconButton$2$1 extends AbstractC7737t implements Function1<ActiveTooltip, Unit> {
    final /* synthetic */ InterfaceC3978p0<ActiveTooltip> $activeTooltip$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileIconButtonKt$ProfileIconButton$2$1(InterfaceC3978p0<ActiveTooltip> interfaceC3978p0) {
        super(1);
        this.$activeTooltip$delegate = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ActiveTooltip activeTooltip) {
        invoke2(activeTooltip);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ActiveTooltip activeTooltip) {
        this.$activeTooltip$delegate.setValue(activeTooltip);
    }
}
