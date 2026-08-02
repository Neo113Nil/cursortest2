package ru.ozon.app.android.common.serviceCarousel.presentation;

import Sc.s;
import Wc.a;
import android.view.Window;
import androidx.fragment.app.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.common.serviceCarousel.presentation.ServiceCarouselViewHolder$setupOnBoardingForItem$$inlined$untouchableScope$1", f = "ServiceCarouselViewHolder.kt", l = {225, 225}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class ServiceCarouselViewHolder$setupOnBoardingForItem$$inlined$untouchableScope$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ int $itemIndex$inlined;
    final /* synthetic */ OnBoardingDTO $onboardingDTO$inlined;
    final /* synthetic */ RecyclerView $this_setupOnBoardingForItem$inlined;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ServiceCarouselViewHolder this$0;
    final /* synthetic */ ServiceCarouselViewHolder this$0$inline_fun;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.common.serviceCarousel.presentation.ServiceCarouselViewHolder$setupOnBoardingForItem$$inlined$untouchableScope$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends AbstractC7737t implements Function1<Boolean, Unit> {
        final /* synthetic */ Window $window;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Window window) {
            super(1);
            this.$window = window;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.f71690a;
        }

        public final void invoke(boolean z11) {
            Window window = this.$window;
            if (window != null) {
                window.clearFlags(16);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceCarouselViewHolder$setupOnBoardingForItem$$inlined$untouchableScope$1(ServiceCarouselViewHolder serviceCarouselViewHolder, d dVar, RecyclerView recyclerView, int i11, ServiceCarouselViewHolder serviceCarouselViewHolder2, OnBoardingDTO onBoardingDTO) {
        super(2, dVar);
        this.this$0$inline_fun = serviceCarouselViewHolder;
        this.$this_setupOnBoardingForItem$inlined = recyclerView;
        this.$itemIndex$inlined = i11;
        this.this$0 = serviceCarouselViewHolder2;
        this.$onboardingDTO$inlined = onBoardingDTO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ServiceCarouselViewHolder$setupOnBoardingForItem$$inlined$untouchableScope$1(this.this$0$inline_fun, dVar, this.$this_setupOnBoardingForItem$inlined, this.$itemIndex$inlined, this.this$0, this.$onboardingDTO$inlined);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ComposerReferences composerReferences;
        Window window;
        OnBoardingDelegate onBoardingDelegate;
        Window window2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            composerReferences = this.this$0$inline_fun.references;
            r a11 = composerReferences.getContainer().a();
            Window window3 = a11 != null ? a11.getWindow() : null;
            if (window3 != null) {
                try {
                    window3.setFlags(16, 16);
                } catch (Throwable th2) {
                    th = th2;
                    this.L$0 = th;
                    this.L$1 = window3;
                    this.label = 2;
                    if (Y.b(1000L, this) != aVar) {
                        window = window3;
                    }
                }
            }
            RecyclerView.o layoutManager = this.$this_setupOnBoardingForItem$inlined.getLayoutManager();
            Intrinsics.g(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int findLastCompletelyVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition();
            final int i12 = this.$itemIndex$inlined;
            if (findLastCompletelyVisibleItemPosition < i12) {
                final ServiceCarouselViewHolder serviceCarouselViewHolder = this.this$0;
                final RecyclerView recyclerView = this.$this_setupOnBoardingForItem$inlined;
                final OnBoardingDTO onBoardingDTO = this.$onboardingDTO$inlined;
                RecyclerView.t tVar = new RecyclerView.t() { // from class: ru.ozon.app.android.common.serviceCarousel.presentation.ServiceCarouselViewHolder$setupOnBoardingForItem$2$scrollSettledListener$1
                    @Override // androidx.recyclerview.widget.RecyclerView.t
                    public void onScrollStateChanged(RecyclerView recyclerView2, int newState) {
                        Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                        if (newState == 0) {
                            ServiceCarouselViewHolder.this.showOnBoardingForItem(recyclerView, onBoardingDTO, i12);
                            recyclerView.removeOnScrollListener(this);
                        }
                    }
                };
                this.$this_setupOnBoardingForItem$inlined.smoothScrollToPosition(this.$itemIndex$inlined);
                this.$this_setupOnBoardingForItem$inlined.addOnScrollListener(tVar);
            } else {
                this.this$0.showOnBoardingForItem(this.$this_setupOnBoardingForItem$inlined, this.$onboardingDTO$inlined, i12);
            }
            onBoardingDelegate = this.this$0$inline_fun.onBoardingDelegate;
            if (onBoardingDelegate != null) {
                onBoardingDelegate.setOnShownListener(new AnonymousClass1(window3));
            }
            this.L$0 = window3;
            this.label = 1;
            if (Y.b(1000L, this) != aVar) {
                window2 = window3;
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            window = (Window) this.L$1;
            th = (Throwable) this.L$0;
            s.b(obj);
            if (window != null) {
                window.clearFlags(16);
            }
            throw th;
        }
        window2 = (Window) this.L$0;
        s.b(obj);
        if (window2 != null) {
            window2.clearFlags(16);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ServiceCarouselViewHolder$setupOnBoardingForItem$$inlined$untouchableScope$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
