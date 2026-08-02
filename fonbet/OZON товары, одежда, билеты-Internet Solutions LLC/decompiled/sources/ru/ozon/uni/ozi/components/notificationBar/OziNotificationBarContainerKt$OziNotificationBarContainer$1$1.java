package ru.ozon.uni.ozi.components.notificationBar;

import S0.M;
import S0.N;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS0/N;", "LS0/M;", "invoke", "(LS0/N;)LS0/M;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class OziNotificationBarContainerKt$OziNotificationBarContainer$1$1 extends AbstractC7737t implements Function1<N, M> {
    final /* synthetic */ Function0<Unit> $onDismiss;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OziNotificationBarContainerKt$OziNotificationBarContainer$1$1(Function0<Unit> function0) {
        super(1);
        this.$onDismiss = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final M invoke(N DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final Function0<Unit> function0 = this.$onDismiss;
        return new M() { // from class: ru.ozon.uni.ozi.components.notificationBar.OziNotificationBarContainerKt$OziNotificationBarContainer$1$1$invoke$$inlined$onDispose$1
            @Override // S0.M
            public void dispose() {
                Function0 function02 = Function0.this;
                if (function02 != null) {
                    function02.invoke();
                }
            }
        };
    }
}
