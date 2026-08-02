package ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.view;

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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.view.ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$2$1", f = "ProfileIconButtonTooltip.kt", l = {88, 89}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Integer $autohideDelaySeconds;
    final /* synthetic */ boolean $isVisible;
    final /* synthetic */ Function0<Unit> $onDismissRequest;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$2$1(boolean z11, Integer num, Function0<Unit> function0, d<? super ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$2$1> dVar) {
        super(2, dVar);
        this.$isVisible = z11;
        this.$autohideDelaySeconds = num;
        this.$onDismissRequest = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$2$1(this.$isVisible, this.$autohideDelaySeconds, this.$onDismissRequest, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (xe.Y.b(r3, r7) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        if (xe.Y.b(1200, r7) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            if (!this.$isVisible || this.$autohideDelaySeconds == null) {
                return Unit.f71690a;
            }
            this.label = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                Function0<Unit> function0 = this.$onDismissRequest;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.f71690a;
            }
            s.b(obj);
        }
        long intValue = this.$autohideDelaySeconds.intValue() * 1000;
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ProfileIconButtonTooltipKt$ProfileIconButtonTooltip$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
