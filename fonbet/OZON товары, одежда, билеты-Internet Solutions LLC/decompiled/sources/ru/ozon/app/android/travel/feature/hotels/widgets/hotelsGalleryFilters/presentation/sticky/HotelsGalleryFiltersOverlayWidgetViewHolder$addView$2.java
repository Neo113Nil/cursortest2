package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.sticky;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Sc.s;
import Wc.a;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.HotelsGalleryFiltersViewModel;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.sticky.HotelsGalleryFiltersOverlayWidgetViewHolder$addView$2", f = "HotelsGalleryFiltersOverlayWidgetViewHolder.kt", l = {134}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsGalleryFiltersOverlayWidgetViewHolder$addView$2 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ HotelsGalleryFiltersOverlayWidgetViewHolder this$0;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "stickyVisible", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.sticky.HotelsGalleryFiltersOverlayWidgetViewHolder$addView$2$1", f = "HotelsGalleryFiltersOverlayWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.sticky.HotelsGalleryFiltersOverlayWidgetViewHolder$addView$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<Boolean, d<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ HotelsGalleryFiltersOverlayWidgetViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(HotelsGalleryFiltersOverlayWidgetViewHolder hotelsGalleryFiltersOverlayWidgetViewHolder, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = hotelsGalleryFiltersOverlayWidgetViewHolder;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, dVar);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Unit> dVar) {
            return invoke(bool.booleanValue(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            HotelsGalleryFiltersViewModel hotelsGalleryFiltersViewModel;
            HotelsGalleryFiltersAnimator hotelsGalleryFiltersAnimator;
            boolean shouldAnimateAppearance;
            HotelsGalleryFiltersAnimator hotelsGalleryFiltersAnimator2;
            HotelsGalleryFiltersAnimator hotelsGalleryFiltersAnimator3;
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            boolean z11 = this.Z$0;
            hotelsGalleryFiltersViewModel = this.this$0.viewModel;
            if (hotelsGalleryFiltersViewModel.isRefreshing().getValue().booleanValue()) {
                return Unit.f71690a;
            }
            if (z11) {
                shouldAnimateAppearance = this.this$0.shouldAnimateAppearance();
                if (shouldAnimateAppearance) {
                    hotelsGalleryFiltersAnimator3 = this.this$0.animator;
                    HotelsGalleryFiltersAnimator.animateAppearance$default(hotelsGalleryFiltersAnimator3, false, 1, null);
                } else {
                    hotelsGalleryFiltersAnimator2 = this.this$0.animator;
                    hotelsGalleryFiltersAnimator2.animateAppearance(true);
                }
            } else {
                hotelsGalleryFiltersAnimator = this.this$0.animator;
                hotelsGalleryFiltersAnimator.animateDisappearance();
            }
            return Unit.f71690a;
        }

        public final Object invoke(boolean z11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(Boolean.valueOf(z11), dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsGalleryFiltersOverlayWidgetViewHolder$addView$2(HotelsGalleryFiltersOverlayWidgetViewHolder hotelsGalleryFiltersOverlayWidgetViewHolder, d<? super HotelsGalleryFiltersOverlayWidgetViewHolder$addView$2> dVar) {
        super(2, dVar);
        this.this$0 = hotelsGalleryFiltersOverlayWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HotelsGalleryFiltersOverlayWidgetViewHolder$addView$2(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        HotelsGalleryFiltersViewModel hotelsGalleryFiltersViewModel;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            hotelsGalleryFiltersViewModel = this.this$0.viewModel;
            InterfaceC2395h a11 = C5427n.a(hotelsGalleryFiltersViewModel.getStickyVisibleState(), this.this$0.getLifecycle(), AbstractC5434v.b.STARTED);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (C2399j.h(a11, anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((HotelsGalleryFiltersOverlayWidgetViewHolder$addView$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
