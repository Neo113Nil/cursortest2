package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.fragment;

import A00.a;
import Sc.s;
import Wc.a;
import android.widget.FrameLayout;
import i10.C6997c;
import i10.k;
import j10.InterfaceC7238a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.issue.PageIssueMapperExtKt;
import ru.ozon.app.android.travel.feature.avia.databinding.FragmentAviaSearchResultBinding;
import ru.ozon.app.android.uikit.screenstate.ScreenStateViewWidget;
import ru.ozon.composer.ui.widget.l;
import z00.f;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Li10/c;", "Lru/ozon/composer/ui/widget/l;", "composerState", "", "<anonymous>", "(Li10/c;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.fragment.AviaSearchResultFragment$observeComposerState$1", f = "AviaSearchResultFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class AviaSearchResultFragment$observeComposerState$1 extends j implements Function2<C6997c<l>, d<? super Unit>, Object> {
    final /* synthetic */ InterfaceC7238a<l> $composerStore;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AviaSearchResultFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaSearchResultFragment$observeComposerState$1(AviaSearchResultFragment aviaSearchResultFragment, InterfaceC7238a<l> interfaceC7238a, d<? super AviaSearchResultFragment$observeComposerState$1> dVar) {
        super(2, dVar);
        this.this$0 = aviaSearchResultFragment;
        this.$composerStore = interfaceC7238a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AviaSearchResultFragment$observeComposerState$1 aviaSearchResultFragment$observeComposerState$1 = new AviaSearchResultFragment$observeComposerState$1(this.this$0, this.$composerStore, dVar);
        aviaSearchResultFragment$observeComposerState$1.L$0 = obj;
        return aviaSearchResultFragment$observeComposerState$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C6997c<l> c6997c, d<? super Unit> dVar) {
        return ((AviaSearchResultFragment$observeComposerState$1) create(c6997c, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        FragmentAviaSearchResultBinding binding;
        FragmentAviaSearchResultBinding binding2;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        C6997c c6997c = (C6997c) this.L$0;
        k.a e11 = c6997c.e();
        List a11 = e11 != null ? e11.a() : null;
        if (a11 == null || a11.isEmpty()) {
            binding = this.this$0.getBinding();
            ScreenStateViewWidget screenStateViewWidget = binding.aviaSearchResultScreenStateView;
            f c11 = c6997c.o().c();
            screenStateViewWidget.showState(c11 != null ? PageIssueMapperExtKt.asScreenState$default(c11, false, 1, null) : null);
            this.$composerStore.c(new a.C2372m(false));
        }
        binding2 = this.this$0.getBinding();
        FrameLayout constraintLayout = binding2.aviaSearchResultProgressView.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        constraintLayout.setVisibility(c6997c.o().b().c() ? 0 : 8);
        return Unit.f71690a;
    }
}
