package ru.ozon.fintech.ui.dots.attacher;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.dots.BaseDotsIndicator;
import ru.ozon.fintech.ui.dots.ExtensionsKt;
import ru.ozon.fintech.ui.dots.OnPageChangeListenerHelper;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00022\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00022\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/fintech/ui/dots/attacher/ViewPager2Attacher;", "Lru/ozon/fintech/ui/dots/attacher/DotsIndicatorAttacher;", "Landroidx/viewpager2/widget/ViewPager2;", "Landroidx/recyclerview/widget/RecyclerView$g;", "<init>", "()V", "attachable", "getAdapterFromAttachable", "(Landroidx/viewpager2/widget/ViewPager2;)Landroidx/recyclerview/widget/RecyclerView$g;", "adapter", "Lkotlin/Function0;", "", "onChanged", "registerAdapterDataChangedObserver", "(Landroidx/viewpager2/widget/ViewPager2;Landroidx/recyclerview/widget/RecyclerView$g;Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/fintech/ui/dots/BaseDotsIndicator$Pager;", "buildPager", "(Landroidx/viewpager2/widget/ViewPager2;Landroidx/recyclerview/widget/RecyclerView$g;)Lru/ozon/fintech/ui/dots/BaseDotsIndicator$Pager;", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ViewPager2Attacher extends DotsIndicatorAttacher<ViewPager2, RecyclerView.g<?>> {
    @Override // ru.ozon.fintech.ui.dots.attacher.DotsIndicatorAttacher
    public /* bridge */ /* synthetic */ void registerAdapterDataChangedObserver(ViewPager2 viewPager2, RecyclerView.g<?> gVar, Function0 function0) {
        registerAdapterDataChangedObserver2(viewPager2, gVar, (Function0<Unit>) function0);
    }

    @Override // ru.ozon.fintech.ui.dots.attacher.DotsIndicatorAttacher
    @NotNull
    public BaseDotsIndicator.Pager buildPager(@NotNull final ViewPager2 attachable, @NotNull RecyclerView.g<?> adapter) {
        Intrinsics.checkNotNullParameter(attachable, "attachable");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        return new BaseDotsIndicator.Pager() { // from class: ru.ozon.fintech.ui.dots.attacher.ViewPager2Attacher$buildPager$1
            private ViewPager2.g onPageChangeCallback;

            @Override // ru.ozon.fintech.ui.dots.BaseDotsIndicator.Pager
            public void addOnPageChangeListener(final OnPageChangeListenerHelper onPageChangeListenerHelper) {
                Intrinsics.checkNotNullParameter(onPageChangeListenerHelper, "onPageChangeListenerHelper");
                ViewPager2.g gVar = new ViewPager2.g() { // from class: ru.ozon.fintech.ui.dots.attacher.ViewPager2Attacher$buildPager$1$addOnPageChangeListener$1
                    @Override // androidx.viewpager2.widget.ViewPager2.g
                    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                        super.onPageScrolled(position, positionOffset, positionOffsetPixels);
                        OnPageChangeListenerHelper.this.onPageScrolled(position, positionOffset);
                    }
                };
                this.onPageChangeCallback = gVar;
                ViewPager2.this.p(gVar);
            }

            @Override // ru.ozon.fintech.ui.dots.BaseDotsIndicator.Pager
            public int getCount() {
                RecyclerView.g e11 = ViewPager2.this.e();
                if (e11 != null) {
                    return e11.getCardsCount();
                }
                return 0;
            }

            @Override // ru.ozon.fintech.ui.dots.BaseDotsIndicator.Pager
            public int getCurrentItem() {
                return ViewPager2.this.f();
            }

            public final ViewPager2.g getOnPageChangeCallback() {
                return this.onPageChangeCallback;
            }

            @Override // ru.ozon.fintech.ui.dots.BaseDotsIndicator.Pager
            public boolean isEmpty() {
                return ExtensionsKt.isEmpty(ViewPager2.this);
            }

            @Override // ru.ozon.fintech.ui.dots.BaseDotsIndicator.Pager
            public boolean isNotEmpty() {
                return ExtensionsKt.isNotEmpty(ViewPager2.this);
            }

            @Override // ru.ozon.fintech.ui.dots.BaseDotsIndicator.Pager
            public void removeOnPageChangeListener() {
                ViewPager2.g gVar = this.onPageChangeCallback;
                if (gVar != null) {
                    ViewPager2.this.A(gVar);
                }
            }

            @Override // ru.ozon.fintech.ui.dots.BaseDotsIndicator.Pager
            public void setCurrentItem(int item, boolean smoothScroll) {
                ViewPager2.this.t(item, smoothScroll);
            }

            public final void setOnPageChangeCallback(ViewPager2.g gVar) {
                this.onPageChangeCallback = gVar;
            }
        };
    }

    @Override // ru.ozon.fintech.ui.dots.attacher.DotsIndicatorAttacher
    public RecyclerView.g<?> getAdapterFromAttachable(@NotNull ViewPager2 attachable) {
        Intrinsics.checkNotNullParameter(attachable, "attachable");
        return attachable.e();
    }

    /* renamed from: registerAdapterDataChangedObserver, reason: avoid collision after fix types in other method */
    public void registerAdapterDataChangedObserver2(@NotNull ViewPager2 attachable, @NotNull RecyclerView.g<?> adapter, @NotNull final Function0<Unit> onChanged) {
        Intrinsics.checkNotNullParameter(attachable, "attachable");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(onChanged, "onChanged");
        adapter.registerAdapterDataObserver(new RecyclerView.i() { // from class: ru.ozon.fintech.ui.dots.attacher.ViewPager2Attacher$registerAdapterDataChangedObserver$1
            @Override // androidx.recyclerview.widget.RecyclerView.i
            public void onChanged() {
                super.onChanged();
                onChanged.invoke();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.i
            public void onItemRangeChanged(int positionStart, int itemCount) {
                super.onItemRangeChanged(positionStart, itemCount);
                onChanged.invoke();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.i
            public void onItemRangeInserted(int positionStart, int itemCount) {
                super.onItemRangeInserted(positionStart, itemCount);
                onChanged.invoke();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.i
            public void onItemRangeMoved(int fromPosition, int toPosition, int itemCount) {
                super.onItemRangeMoved(fromPosition, toPosition, itemCount);
                onChanged.invoke();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.i
            public void onItemRangeRemoved(int positionStart, int itemCount) {
                super.onItemRangeRemoved(positionStart, itemCount);
                onChanged.invoke();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.i
            public void onItemRangeChanged(int positionStart, int itemCount, Object payload) {
                super.onItemRangeChanged(positionStart, itemCount, payload);
                onChanged.invoke();
            }
        });
    }
}
