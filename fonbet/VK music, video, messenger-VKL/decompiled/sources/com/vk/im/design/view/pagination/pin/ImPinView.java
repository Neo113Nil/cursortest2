package com.vk.im.design.view.pagination.pin;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.im.design.view.pagination.ImPaginationSegment;
import com.vk.im.design.view.pagination.pin.ImPinView;
import com.vk.im.design.view.pagination.pin.b;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.bcr0;
import xsna.e43;
import xsna.haw;
import xsna.j5g;
import xsna.m9b;
import xsna.wc2;

/* compiled from: ImPinView.kt */
/* loaded from: classes2.dex */
public final class ImPinView extends LinearLayout implements b {
    public static final /* synthetic */ int l = 0;
    public final ViewPager2 b;
    public final ImPaginationSegment c;
    public final haw d;
    public final c e;
    public boolean f;
    public boolean g;
    public List<? extends ImPinItem> h;
    public Integer i;
    public final wc2 j;
    public b.a k;

    public ImPinView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        c cVar = new c(new m9b(0, this, ImPinView.class, "onClickPin", "onClickPin()V", 0, 2));
        this.e = cVar;
        this.f = true;
        this.h = EmptyList.b;
        this.j = new wc2(this, 7);
        View.inflate(context, R.layout.im_ui_internal_pin_view, this);
        ViewPager2 viewPager2 = (ViewPager2) findViewById(R.id.view_pager);
        viewPager2.setAdapter(cVar);
        viewPager2.setOffscreenPageLimit(1);
        viewPager2.setOrientation(1);
        viewPager2.setUserInputEnabled(false);
        this.b = viewPager2;
        ImPaginationSegment imPaginationSegment = (ImPaginationSegment) findViewById(R.id.pagination_segment);
        this.c = imPaginationSegment;
        this.d = new haw(viewPager2, imPaginationSegment);
    }

    public static final void a(ImPinView imPinView) {
        ViewPager2 viewPager2 = imPinView.b;
        imPinView.g = true;
        wc2 wc2Var = imPinView.j;
        imPinView.removeCallbacks(wc2Var);
        imPinView.postDelayed(wc2Var, 1000L);
        b.a clickListener = imPinView.getClickListener();
        if (clickListener != null) {
            clickListener.a(viewPager2.getCurrentItem());
        }
        int h = viewPager2.getCurrentItem() == 0 ? e43.h(imPinView.e.h.f) : viewPager2.getCurrentItem() - 1;
        imPinView.setViewPagerCurrentItemSmooth(h);
        imPinView.d.b(h);
    }

    private final void setViewPagerCurrentItemSmooth(int i) {
        ImPinItem imPinItem = (ImPinItem) j5g.b0(i, this.h);
        this.i = imPinItem != null ? Integer.valueOf(imPinItem.getId()) : null;
        b(this.b, i);
    }

    public final void b(final ViewPager2 viewPager2, final int i) {
        View childAt = viewPager2.getChildAt(0);
        final RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView == null) {
            viewPager2.post(new Runnable() { // from class: xsna.iaw
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = ImPinView.l;
                    ImPinView.this.b(viewPager2, i);
                }
            });
            return;
        }
        int height = (viewPager2.getHeight() - viewPager2.getPaddingTop()) - viewPager2.getPaddingBottom();
        if (height <= 0) {
            viewPager2.post(new Runnable() { // from class: xsna.jaw
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = ImPinView.l;
                    ImPinView.this.b(viewPager2, i);
                }
            });
            return;
        }
        int currentItem = (i - viewPager2.getCurrentItem()) * height;
        if (currentItem == 0) {
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, currentItem);
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.kaw
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = ImPinView.l;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                Ref$IntRef ref$IntRef2 = Ref$IntRef.this;
                recyclerView.scrollBy(0, intValue - ref$IntRef2.element);
                ref$IntRef2.element = intValue;
            }
        });
        ofInt.setDuration(200L);
        ofInt.start();
    }

    public b.a getClickListener() {
        return this.k;
    }

    public bcr0<ImageView> getImageControllerFactory() {
        return this.e.k;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.c = false;
    }

    @Override // com.vk.im.design.view.pagination.pin.b
    public void setClickListener(b.a aVar) {
        this.k = aVar;
    }

    @Override // com.vk.im.design.view.pagination.pin.b
    public void setCurrentItem(int i) {
        ImPinItem imPinItem;
        if (this.g) {
            return;
        }
        boolean z = this.f;
        haw hawVar = this.d;
        if (z) {
            this.f = false;
            this.b.e(i, false);
            hawVar.b(i);
            return;
        }
        ImPinItem imPinItem2 = (ImPinItem) j5g.b0(i, this.h);
        int id = imPinItem2 != null ? imPinItem2.getId() : 0;
        Integer num = this.i;
        if (num == null || num.intValue() != id) {
            Integer num2 = this.i;
            if (id >= (num2 != null ? num2.intValue() : 0) || (imPinItem = (ImPinItem) j5g.k0(this.h)) == null || id != imPinItem.getId()) {
                setViewPagerCurrentItemSmooth(i);
            }
        }
        hawVar.b(i);
    }

    @Override // com.vk.im.design.view.pagination.pin.b
    public void setImageControllerFactory(bcr0<? extends ImageView> bcr0Var) {
        this.e.k = bcr0Var;
    }

    @Override // com.vk.im.design.view.pagination.pin.b
    public void setIndicatorColor(int i) {
        this.c.setIndicatorColor(i);
    }

    @Override // com.vk.im.design.view.pagination.pin.b
    public void setItemList(List<? extends ImPinItem> list) {
        this.h = list;
        this.e.setItems(list);
        int size = list.size();
        ImPaginationSegment imPaginationSegment = this.c;
        imPaginationSegment.setItemCount(size);
        imPaginationSegment.setVisibility(list.size() >= 2 ? 0 : 8);
    }

    @Override // com.vk.im.design.view.pagination.pin.b
    public View getView() {
        return this;
    }

    public void setupBlurContent(VkBlurContentView vkBlurContentView) {
    }
}
