package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.fragment;

import Sc.s;
import Wc.a;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.avia.databinding.FragmentAviaSearchResultBinding;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.viewModel.AviaSearchResultViewModel;
import ru.ozon.app.android.travel.molecules.extensions.ViewExtensionsKt;
import ru.ozon.app.android.travel.molecules.view.searchPreloader.SearchPreloaderView;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "isVisible", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AviaSearchResultFragment$observeLiveData$1$5 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ AviaSearchResultViewModel $this_run;
    final /* synthetic */ AviaSearchResultFragment this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.fragment.AviaSearchResultFragment$observeLiveData$1$5$1", f = "AviaSearchResultFragment.kt", l = {299}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.fragment.AviaSearchResultFragment$observeLiveData$1$5$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ AviaSearchResultViewModel $this_run;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AviaSearchResultFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AviaSearchResultFragment aviaSearchResultFragment, AviaSearchResultViewModel aviaSearchResultViewModel, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = aviaSearchResultFragment;
            this.$this_run = aviaSearchResultViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$this_run, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            FragmentAviaSearchResultBinding binding;
            M m11;
            FragmentAviaSearchResultBinding binding2;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                M m12 = (M) this.L$0;
                binding = this.this$0.getBinding();
                SearchPreloaderView aviaSearchResultProgressBarView = binding.aviaSearchResultProgressBarView;
                Intrinsics.checkNotNullExpressionValue(aviaSearchResultProgressBarView, "aviaSearchResultProgressBarView");
                this.L$0 = m12;
                this.label = 1;
                if (ViewExtensionsKt.awaitNextLayout(aviaSearchResultProgressBarView, this) == aVar) {
                    return aVar;
                }
                m11 = m12;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                m11 = (M) this.L$0;
                s.b(obj);
            }
            if (N.f(m11)) {
                AviaSearchResultViewModel aviaSearchResultViewModel = this.$this_run;
                binding2 = this.this$0.getBinding();
                aviaSearchResultViewModel.startPreloaderAnimation(binding2.aviaSearchResultProgressBarView.loaderWidth());
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaSearchResultFragment$observeLiveData$1$5(AviaSearchResultFragment aviaSearchResultFragment, AviaSearchResultViewModel aviaSearchResultViewModel) {
        super(1);
        this.this$0 = aviaSearchResultFragment;
        this.$this_run = aviaSearchResultViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke2(bool);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Boolean bool) {
        FragmentAviaSearchResultBinding binding;
        binding = this.this$0.getBinding();
        SearchPreloaderView aviaSearchResultProgressBarView = binding.aviaSearchResultProgressBarView;
        Intrinsics.checkNotNullExpressionValue(aviaSearchResultProgressBarView, "aviaSearchResultProgressBarView");
        aviaSearchResultProgressBarView.setVisibility(bool.booleanValue() ? 0 : 8);
        if (!bool.booleanValue()) {
            this.$this_run.stopPreloaderAnimation();
            return;
        }
        J viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner), null, null, new AnonymousClass1(this.this$0, this.$this_run, null), 3);
    }
}
