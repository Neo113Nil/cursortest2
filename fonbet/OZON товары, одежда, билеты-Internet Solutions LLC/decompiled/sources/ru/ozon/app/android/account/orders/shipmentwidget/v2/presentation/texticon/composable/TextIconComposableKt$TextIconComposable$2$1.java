package ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.texticon.composable;

import S0.InterfaceC3978p0;
import S0.M;
import S0.N;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.texticon.viewItem.TextIconVO;
import ru.ozon.app.android.utils.timer.OneSecondTimer;
import ru.ozon.app.android.utils.timer.TimerManager;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS0/N;", "LS0/M;", "invoke", "(LS0/N;)LS0/M;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class TextIconComposableKt$TextIconComposable$2$1 extends AbstractC7737t implements Function1<N, M> {
    final /* synthetic */ InterfaceC7851b $controller;
    final /* synthetic */ TextIconVO $item;
    final /* synthetic */ boolean $staticTimer;
    final /* synthetic */ InterfaceC3978p0<String> $tick$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextIconComposableKt$TextIconComposable$2$1(TextIconVO textIconVO, boolean z11, InterfaceC3978p0<String> interfaceC3978p0, InterfaceC7851b interfaceC7851b) {
        super(1);
        this.$item = textIconVO;
        this.$staticTimer = z11;
        this.$tick$delegate = interfaceC3978p0;
        this.$controller = interfaceC7851b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final M invoke(N DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        if (this.$item.getTimeLeft() == null) {
            return new M() { // from class: ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.texticon.composable.TextIconComposableKt$TextIconComposable$2$1$invoke$$inlined$onDispose$1
                @Override // S0.M
                public void dispose() {
                }
            };
        }
        final TimerManager build = new OneSecondTimer.Builder().onTick(new TextIconComposableKt$TextIconComposable$2$1$timer$1(this.$tick$delegate)).onComplete(new TextIconComposableKt$TextIconComposable$2$1$timer$2(this.$controller)).build();
        build.startTimer(this.$item.getTimeLeft().getMillis());
        if (this.$staticTimer) {
            build.stopTimer();
        }
        return new M() { // from class: ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.texticon.composable.TextIconComposableKt$TextIconComposable$2$1$invoke$$inlined$onDispose$2
            @Override // S0.M
            public void dispose() {
                TimerManager.this.stopTimer();
            }
        };
    }
}
