package ru.ozon.app.android.ugc.core.widgets.iconWidget.presentation;

import S0.InterfaceC3978p0;
import S0.M;
import S0.N;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS0/N;", "LS0/M;", "invoke", "(LS0/N;)LS0/M;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class IconComposeWidgetKt$rememberIsScrolledPastStatusBar$1$1 extends AbstractC7737t implements Function1<N, M> {
    final /* synthetic */ RecyclerView $recyclerView;
    final /* synthetic */ StatusBarScrollListener $scrollListener;
    final /* synthetic */ InterfaceC3978p0<Boolean> $scrolledState;
    final /* synthetic */ int $statusBarHeight;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IconComposeWidgetKt$rememberIsScrolledPastStatusBar$1$1(RecyclerView recyclerView, InterfaceC3978p0<Boolean> interfaceC3978p0, int i11, StatusBarScrollListener statusBarScrollListener) {
        super(1);
        this.$recyclerView = recyclerView;
        this.$scrolledState = interfaceC3978p0;
        this.$statusBarHeight = i11;
        this.$scrollListener = statusBarScrollListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1(RecyclerView recyclerView, InterfaceC3978p0 interfaceC3978p0, int i11, StatusBarScrollListener statusBarScrollListener) {
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        interfaceC3978p0.setValue(Boolean.valueOf(computeVerticalScrollOffset >= i11));
        statusBarScrollListener.resetWithInitialOffset(computeVerticalScrollOffset);
        recyclerView.addOnScrollListener(statusBarScrollListener);
    }

    @Override // kotlin.jvm.functions.Function1
    public final M invoke(N DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final RecyclerView recyclerView = this.$recyclerView;
        if (recyclerView == null) {
            return new M() { // from class: ru.ozon.app.android.ugc.core.widgets.iconWidget.presentation.IconComposeWidgetKt$rememberIsScrolledPastStatusBar$1$1$invoke$$inlined$onDispose$1
                @Override // S0.M
                public void dispose() {
                }
            };
        }
        final InterfaceC3978p0<Boolean> interfaceC3978p0 = this.$scrolledState;
        final int i11 = this.$statusBarHeight;
        final StatusBarScrollListener statusBarScrollListener = this.$scrollListener;
        recyclerView.post(new Runnable() { // from class: ru.ozon.app.android.ugc.core.widgets.iconWidget.presentation.a
            @Override // java.lang.Runnable
            public final void run() {
                IconComposeWidgetKt$rememberIsScrolledPastStatusBar$1$1.invoke$lambda$1(RecyclerView.this, interfaceC3978p0, i11, statusBarScrollListener);
            }
        });
        final RecyclerView recyclerView2 = this.$recyclerView;
        final StatusBarScrollListener statusBarScrollListener2 = this.$scrollListener;
        return new M() { // from class: ru.ozon.app.android.ugc.core.widgets.iconWidget.presentation.IconComposeWidgetKt$rememberIsScrolledPastStatusBar$1$1$invoke$$inlined$onDispose$2
            @Override // S0.M
            public void dispose() {
                RecyclerView.this.removeOnScrollListener(statusBarScrollListener2);
            }
        };
    }
}
