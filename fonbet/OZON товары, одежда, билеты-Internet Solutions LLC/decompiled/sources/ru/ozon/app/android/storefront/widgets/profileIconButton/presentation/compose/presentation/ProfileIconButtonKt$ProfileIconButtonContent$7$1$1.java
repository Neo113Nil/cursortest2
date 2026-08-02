package ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.compose.presentation;

import B1.B;
import S0.InterfaceC3978p0;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.storefront.widgets.profileIconButton.data.IconTooltipDto;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.compose.presentation.ProfileIconButtonKt$ProfileIconButtonContent$7$1$1", f = "ProfileIconButton.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ProfileIconButtonKt$ProfileIconButtonContent$7$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $activeTooltipKey;
    final /* synthetic */ boolean $isActive;
    final /* synthetic */ boolean $isReady;
    final /* synthetic */ Function1<ActiveTooltip, Unit> $onTooltipRequest;
    final /* synthetic */ Function1<String, Unit> $onTooltipShown;
    final /* synthetic */ Function1<String, Boolean> $shouldShowTooltip;
    final /* synthetic */ IconTooltipDto $tooltip;
    final /* synthetic */ InterfaceC3978p0<B> $tooltipAnchorCoordinates$delegate;
    final /* synthetic */ String $tooltipKey;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ProfileIconButtonKt$ProfileIconButtonContent$7$1$1(boolean z11, boolean z12, Function1<? super ActiveTooltip, Unit> function1, String str, Function1<? super String, Boolean> function12, String str2, IconTooltipDto iconTooltipDto, Function1<? super String, Unit> function13, InterfaceC3978p0<B> interfaceC3978p0, d<? super ProfileIconButtonKt$ProfileIconButtonContent$7$1$1> dVar) {
        super(2, dVar);
        this.$isReady = z11;
        this.$isActive = z12;
        this.$onTooltipRequest = function1;
        this.$activeTooltipKey = str;
        this.$shouldShowTooltip = function12;
        this.$tooltipKey = str2;
        this.$tooltip = iconTooltipDto;
        this.$onTooltipShown = function13;
        this.$tooltipAnchorCoordinates$delegate = interfaceC3978p0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ProfileIconButtonKt$ProfileIconButtonContent$7$1$1(this.$isReady, this.$isActive, this.$onTooltipRequest, this.$activeTooltipKey, this.$shouldShowTooltip, this.$tooltipKey, this.$tooltip, this.$onTooltipShown, this.$tooltipAnchorCoordinates$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        B ProfileIconButtonContent$lambda$14;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        if (!this.$isReady) {
            if (this.$isActive) {
                this.$onTooltipRequest.invoke(null);
            }
            return Unit.f71690a;
        }
        if (this.$isActive || (this.$activeTooltipKey == null && this.$shouldShowTooltip.invoke(this.$tooltipKey).booleanValue())) {
            Function1<ActiveTooltip, Unit> function1 = this.$onTooltipRequest;
            String str = this.$tooltipKey;
            IconTooltipDto iconTooltipDto = this.$tooltip;
            ProfileIconButtonContent$lambda$14 = ProfileIconButtonKt.ProfileIconButtonContent$lambda$14(this.$tooltipAnchorCoordinates$delegate);
            function1.invoke(new ActiveTooltip(str, iconTooltipDto, ProfileIconButtonContent$lambda$14));
            if (!this.$isActive) {
                this.$onTooltipShown.invoke(this.$tooltipKey);
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ProfileIconButtonKt$ProfileIconButtonContent$7$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
