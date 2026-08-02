package com.vk.core.view.components.segmented.control;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.google.android.material.tabs.TabLayout;
import com.vk.core.view.components.tabs.b;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.dma0;
import xsna.e3m;
import xsna.f4m;
import xsna.gpo0;
import xsna.hbh0;
import xsna.i35;
import xsna.izs;
import xsna.s3q0;
import xsna.zrp;

/* compiled from: VkSegmentedControl.kt */
/* loaded from: classes17.dex */
public final class VkSegmentedControl extends com.vk.core.view.components.tabs.b {
    public static final /* synthetic */ int B0 = 0;
    public izs<? super Integer, s3q0> A0;
    public final GradientDrawable x0;
    public final b y0;
    public SegmentSize z0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkSegmentedControl.kt */
    public static final class SegmentSize {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SegmentSize[] $VALUES;
        public static final SegmentSize Large;
        public static final SegmentSize Medium;

        static {
            SegmentSize segmentSize = new SegmentSize("Medium", 0);
            Medium = segmentSize;
            SegmentSize segmentSize2 = new SegmentSize("Large", 1);
            Large = segmentSize2;
            SegmentSize[] segmentSizeArr = {segmentSize, segmentSize2};
            $VALUES = segmentSizeArr;
            $ENTRIES = new asp(segmentSizeArr);
        }

        public SegmentSize() {
            throw null;
        }

        public static SegmentSize valueOf(String str) {
            return (SegmentSize) Enum.valueOf(SegmentSize.class, str);
        }

        public static SegmentSize[] values() {
            return (SegmentSize[]) $VALUES.clone();
        }
    }

    /* compiled from: VkSegmentedControl.kt */
    public static final class b extends b.AbstractC0865b {
        public final CardView b;

        public b(Context context) {
            super(context, null, 0);
            LayoutInflater.from(context).inflate(R.layout.ds_internal_segmented_control_indicator, (ViewGroup) this, true);
            setClipToPadding(false);
            setClipChildren(false);
            CardView cardView = (CardView) findViewById(R.id.segment_indicator_card);
            this.b = cardView;
            cardView.setOutlineSpotShadowColor(context.getColor(R.color.vk_black_alpha24));
            cardView.setElevation(e3m.a(R.dimen.vk_ui_elevation_one, context));
            getContext();
            cardView.setForeground(getContext().getDrawable(R.drawable.ds_internal_segmented_control_background));
        }

        @Override // xsna.too0
        public final void Ng() {
            getContext();
            this.b.setForeground(getContext().getDrawable(R.drawable.ds_internal_segmented_control_background));
        }

        public final CardView getCardView$foundation_release() {
            return this.b;
        }
    }

    public VkSegmentedControl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void B() {
        setTabIconTint(i35.l(this));
        int d = gpo0.d(R.attr.vk_ui_background_secondary, this);
        GradientDrawable gradientDrawable = this.x0;
        gradientDrawable.setColor(d);
        gradientDrawable.setCornerRadius(hbh0.a(getContext(), 8.0f));
    }

    @Override // com.vk.core.view.components.tabs.VkTabLayout, xsna.too0
    public final void Ng() {
        B();
    }

    public final izs<Integer, s3q0> getOnSelectTabPosition() {
        return this.A0;
    }

    public final SegmentSize getSegmentSize() {
        return this.z0;
    }

    @Override // com.vk.core.view.components.tabs.VkTabLayout, com.google.android.material.tabs.TabLayout, android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int b2;
        SegmentSize segmentSize = this.z0;
        Context context = getContext();
        int i3 = com.vk.core.view.components.segmented.control.a.$EnumSwitchMapping$0[segmentSize.ordinal()];
        if (i3 == 1) {
            b2 = hbh0.b(32, context);
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            b2 = hbh0.b(40, context);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((hbh0.b(2, getContext()) * 2) + b2, 1073741824));
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setAlpha(z ? 1.0f : 0.64f);
    }

    public final void setOnSelectTabPosition(izs<? super Integer, s3q0> izsVar) {
        this.A0 = izsVar;
    }

    public final void setSegmentSize(SegmentSize segmentSize) {
        int b2;
        this.z0 = segmentSize;
        CardView cardView$foundation_release = getIndicator().getCardView$foundation_release();
        SegmentSize segmentSize2 = this.z0;
        Context context = getContext();
        int i = com.vk.core.view.components.segmented.control.a.$EnumSwitchMapping$0[segmentSize2.ordinal()];
        if (i == 1) {
            b2 = hbh0.b(32, context);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            b2 = hbh0.b(40, context);
        }
        f4m.k(b2, cardView$foundation_release);
    }

    public VkSegmentedControl(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        int b2;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.x0 = gradientDrawable;
        this.y0 = new b(context);
        this.z0 = SegmentSize.Medium;
        A();
        f(new a());
        setTabMode(1);
        setTabRippleColor(null);
        setBackground(gradientDrawable);
        CardView cardView$foundation_release = getIndicator().getCardView$foundation_release();
        int i2 = com.vk.core.view.components.segmented.control.a.$EnumSwitchMapping$0[this.z0.ordinal()];
        if (i2 == 1) {
            b2 = hbh0.b(32, context);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            b2 = hbh0.b(40, context);
        }
        f4m.k(b2, cardView$foundation_release);
        FrameLayout frameLayoutWrapper = getFrameLayoutWrapper();
        f4m.w(hbh0.b(2, context), frameLayoutWrapper);
        f4m.x(hbh0.b(2, context), frameLayoutWrapper);
        frameLayoutWrapper.setClipToPadding(false);
        frameLayoutWrapper.setClipChildren(false);
        getContainer().setClipChildren(false);
        getContainer().setClipToPadding(false);
        setClipToOutline(true);
        setCustomTabView(new dma0(context, 2));
        B();
    }

    @Override // com.vk.core.view.components.tabs.b
    public b getIndicator() {
        return this.y0;
    }

    /* compiled from: VkSegmentedControl.kt */
    public static final class a implements TabLayout.d {
        public a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void Wd(TabLayout.g gVar) {
            izs<Integer, s3q0> onSelectTabPosition = VkSegmentedControl.this.getOnSelectTabPosition();
            if (onSelectTabPosition != null) {
                onSelectTabPosition.invoke(Integer.valueOf(gVar.e));
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void hl(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void za(TabLayout.g gVar) {
        }
    }
}
