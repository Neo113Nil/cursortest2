package ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.compose.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.compose.presentation.ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$1$1", f = "ProfileIconButtonTooltip.kt", l = {72}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Integer $autohideDelaySeconds;
    final /* synthetic */ boolean $isRichAnimationEnabled;
    final /* synthetic */ boolean $isVisible;
    final /* synthetic */ Function0<Unit> $onDismiss;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$1$1(boolean z11, Integer num, boolean z12, Function0<Unit> function0, d<? super ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$1$1> dVar) {
        super(2, dVar);
        this.$isVisible = z11;
        this.$autohideDelaySeconds = num;
        this.$isRichAnimationEnabled = z12;
        this.$onDismiss = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$1$1(this.$isVisible, this.$autohideDelaySeconds, this.$isRichAnimationEnabled, this.$onDismiss, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            if (!this.$isVisible || (num = this.$autohideDelaySeconds) == null) {
                return Unit.f71690a;
            }
            long intValue = this.$isRichAnimationEnabled ? (num.intValue() * 1000) + 1200 : num.intValue() * 1000;
            this.label = 1;
            if (Y.b(intValue, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        this.$onDismiss.invoke();
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
