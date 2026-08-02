package com.vk.im.design.view.pagination.pin;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.core.tool.view.vkblur.VkBlurView;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.im.design.view.pagination.ImPaginationSegment;
import com.vk.im.design.view.pagination.pin.ImMultiPinView;
import com.vk.im.design.view.pagination.pin.b;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.abg0;
import xsna.an10;
import xsna.avj;
import xsna.b04;
import xsna.bcr0;
import xsna.bhh;
import xsna.bv9;
import xsna.bwt0;
import xsna.dhr0;
import xsna.e43;
import xsna.haw;
import xsna.hbh0;
import xsna.j5g;
import xsna.p7r;
import xsna.t9w;

/* compiled from: ImMultiPinView.kt */
/* loaded from: classes2.dex */
public final class ImMultiPinView extends LinearLayout implements b {
    public static final /* synthetic */ int o = 0;
    public final VkBlurView b;
    public final ViewPager2 c;
    public final ImPaginationSegment d;
    public final VkImageSimple e;
    public final View f;
    public final haw g;
    public final e h;
    public boolean i;
    public boolean j;
    public List<? extends ImPinItem> k;
    public Integer l;
    public final b04 m;
    public b.a n;

    public ImMultiPinView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        e eVar = new e(new t9w(0, this, ImMultiPinView.class, "onClickPin", "onClickPin()V", 0));
        this.h = eVar;
        this.i = true;
        this.k = EmptyList.b;
        this.m = new b04(this, 6);
        View.inflate(context, R.layout.im_multi_pin_view, this);
        this.b = (VkBlurView) findViewById(R.id.blur_view);
        View findViewById = findViewById(R.id.pin_container);
        this.f = findViewById;
        setupBackground(findViewById);
        ViewPager2 viewPager2 = (ViewPager2) findViewById(R.id.view_pager);
        viewPager2.setAdapter(eVar);
        viewPager2.setOffscreenPageLimit(1);
        viewPager2.setOrientation(1);
        viewPager2.setUserInputEnabled(false);
        this.c = viewPager2;
        ImPaginationSegment imPaginationSegment = (ImPaginationSegment) findViewById(R.id.pagination_segment);
        this.d = imPaginationSegment;
        this.e = (VkImageSimple) findViewById(R.id.pin_icon);
        this.g = new haw(viewPager2, imPaginationSegment);
        setSoundEffectsEnabled(false);
        setOnClickListener(new p7r(1));
    }

    public static final void a(ImMultiPinView imMultiPinView) {
        ViewPager2 viewPager2 = imMultiPinView.c;
        View view = imMultiPinView.f;
        view.setPressed(true);
        view.drawableHotspotChanged(view.getWidth() / 2.0f, view.getHeight() / 2.0f);
        view.postDelayed(new bv9(imMultiPinView, 3), 250L);
        imMultiPinView.j = true;
        b04 b04Var = imMultiPinView.m;
        imMultiPinView.removeCallbacks(b04Var);
        imMultiPinView.postDelayed(b04Var, 1000L);
        b.a clickListener = imMultiPinView.getClickListener();
        if (clickListener != null) {
            clickListener.a(viewPager2.getCurrentItem());
        }
        int h = viewPager2.getCurrentItem() == 0 ? e43.h(imMultiPinView.h.h.f) : viewPager2.getCurrentItem() - 1;
        imMultiPinView.setViewPagerCurrentItemSmooth(h);
        imMultiPinView.g.b(h);
    }

    private final void setPinIconVisibility(boolean z) {
        VkImageSimple vkImageSimple = this.e;
        if (z) {
            vkImageSimple.setImageDrawable(dhr0.u.b(R.drawable.vk_icon_lego_list_pin_outline_20, R.attr.vk_ui_icon_contrast));
        } else {
            vkImageSimple.setImageDrawable(null);
        }
        vkImageSimple.setVisibility(z ? 0 : 8);
    }

    private final void setViewPagerCurrentItemSmooth(int i) {
        ImPinItem imPinItem = (ImPinItem) j5g.b0(i, this.k);
        this.l = imPinItem != null ? Integer.valueOf(imPinItem.getId()) : null;
        b(this.c, i);
    }

    private final void setupBackground(View view) {
        abg0 abg0Var = dhr0.u;
        int c = abg0Var.c(R.attr.vk_ui_stroke_contrast_secondary_alpha);
        float a = hbh0.a(getContext(), 12.0f);
        int b = an10.b(hbh0.a(getContext(), 1.0f));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(0);
        gradientDrawable.setCornerRadius(a);
        gradientDrawable.setStroke(b, c);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setColor(-1);
        gradientDrawable2.setCornerRadius(a);
        int c2 = abg0Var.c(R.attr.vk_ui_icon_contrast);
        view.setBackground(new RippleDrawable(ColorStateList.valueOf(Color.argb(an10.b(30.599998f), Color.red(c2), Color.green(c2), Color.blue(c2))), gradientDrawable, gradientDrawable2));
    }

    public final void b(final ViewPager2 viewPager2, final int i) {
        View childAt = viewPager2.getChildAt(0);
        final RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView == null) {
            viewPager2.post(new Runnable() { // from class: xsna.q9w
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = ImMultiPinView.o;
                    ImMultiPinView.this.b(viewPager2, i);
                }
            });
            return;
        }
        int height = (viewPager2.getHeight() - viewPager2.getPaddingTop()) - viewPager2.getPaddingBottom();
        if (height <= 0) {
            viewPager2.post(new Runnable() { // from class: xsna.r9w
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = ImMultiPinView.o;
                    ImMultiPinView.this.b(viewPager2, i);
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
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.s9w
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = ImMultiPinView.o;
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
        return this.n;
    }

    public bcr0<ImageView> getImageControllerFactory() {
        return this.h.k;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.g.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.g.c = false;
    }

    @Override // com.vk.im.design.view.pagination.pin.b
    public void setClickListener(b.a aVar) {
        this.n = aVar;
    }

    @Override // com.vk.im.design.view.pagination.pin.b
    public void setCurrentItem(int i) {
        ImPinItem imPinItem;
        if (this.j) {
            return;
        }
        boolean z = this.i;
        haw hawVar = this.g;
        if (z) {
            this.i = false;
            this.c.e(i, false);
            hawVar.b(i);
            return;
        }
        ImPinItem imPinItem2 = (ImPinItem) j5g.b0(i, this.k);
        int id = imPinItem2 != null ? imPinItem2.getId() : 0;
        Integer num = this.l;
        if (num == null || num.intValue() != id) {
            Integer num2 = this.l;
            if (id >= (num2 != null ? num2.intValue() : 0) || (imPinItem = (ImPinItem) j5g.k0(this.k)) == null || id != imPinItem.getId()) {
                setViewPagerCurrentItemSmooth(i);
            }
        }
        hawVar.b(i);
    }

    @Override // com.vk.im.design.view.pagination.pin.b
    public void setImageControllerFactory(bcr0<? extends ImageView> bcr0Var) {
        this.h.k = bcr0Var;
    }

    @Override // com.vk.im.design.view.pagination.pin.b
    public void setIndicatorColor(int i) {
        this.d.setIndicatorColor(i);
    }

    @Override // com.vk.im.design.view.pagination.pin.b
    public void setItemList(List<? extends ImPinItem> list) {
        this.k = list;
        this.h.setItems(list);
        boolean z = list.size() >= 2;
        int size = list.size();
        ImPaginationSegment imPaginationSegment = this.d;
        imPaginationSegment.setItemCount(size);
        imPaginationSegment.setVisibility(z ? 0 : 8);
    }

    public void setupBlurContent(VkBlurContentView vkBlurContentView) {
        float a = hbh0.a(getContext(), 12.0f);
        VkBlurView vkBlurView = this.b;
        vkBlurView.setBlurRadius(48.0f);
        vkBlurView.setupWithContent(vkBlurContentView);
        vkBlurView.setOutlineProvider(new avj(a));
        bwt0.S(vkBlurView, new bhh(26, vkBlurView, this));
        vkBlurView.setVisibility(0);
    }

    @Override // com.vk.im.design.view.pagination.pin.b
    public View getView() {
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSetPressed(boolean z) {
    }
}
