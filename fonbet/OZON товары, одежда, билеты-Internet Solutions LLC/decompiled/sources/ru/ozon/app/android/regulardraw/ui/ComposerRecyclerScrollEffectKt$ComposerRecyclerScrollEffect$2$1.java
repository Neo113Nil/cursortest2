package ru.ozon.app.android.regulardraw.ui;

import S0.A1;
import S0.M;
import S0.N;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS0/N;", "LS0/M;", "invoke", "(LS0/N;)LS0/M;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class ComposerRecyclerScrollEffectKt$ComposerRecyclerScrollEffect$2$1 extends AbstractC7737t implements Function1<N, M> {
    final /* synthetic */ RecyclerView $composerRecycler;
    final /* synthetic */ A1<Function0<Unit>> $currentOnScrollDown$delegate;
    final /* synthetic */ A1<Function0<Unit>> $currentOnScrollUp$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ComposerRecyclerScrollEffectKt$ComposerRecyclerScrollEffect$2$1(RecyclerView recyclerView, A1<? extends Function0<Unit>> a12, A1<? extends Function0<Unit>> a13) {
        super(1);
        this.$composerRecycler = recyclerView;
        this.$currentOnScrollDown$delegate = a12;
        this.$currentOnScrollUp$delegate = a13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.recyclerview.widget.RecyclerView$t, ru.ozon.app.android.regulardraw.ui.ComposerRecyclerScrollEffectKt$ComposerRecyclerScrollEffect$2$1$listener$1] */
    @Override // kotlin.jvm.functions.Function1
    public final M invoke(N DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final A1<Function0<Unit>> a12 = this.$currentOnScrollDown$delegate;
        final A1<Function0<Unit>> a13 = this.$currentOnScrollUp$delegate;
        final ?? r32 = new RecyclerView.t() { // from class: ru.ozon.app.android.regulardraw.ui.ComposerRecyclerScrollEffectKt$ComposerRecyclerScrollEffect$2$1$listener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (dy > 0) {
                    ComposerRecyclerScrollEffectKt.ComposerRecyclerScrollEffect$lambda$1(a12).invoke();
                } else if (dy < 0) {
                    ComposerRecyclerScrollEffectKt.ComposerRecyclerScrollEffect$lambda$2(a13).invoke();
                }
            }
        };
        RecyclerView recyclerView = this.$composerRecycler;
        if (recyclerView != 0) {
            recyclerView.addOnScrollListener(r32);
        }
        final RecyclerView recyclerView2 = this.$composerRecycler;
        return new M() { // from class: ru.ozon.app.android.regulardraw.ui.ComposerRecyclerScrollEffectKt$ComposerRecyclerScrollEffect$2$1$invoke$$inlined$onDispose$1
            @Override // S0.M
            public void dispose() {
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3 != null) {
                    recyclerView3.removeOnScrollListener(r32);
                }
            }
        };
    }
}
