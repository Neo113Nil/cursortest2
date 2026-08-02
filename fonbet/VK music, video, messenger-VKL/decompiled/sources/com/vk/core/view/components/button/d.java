package com.vk.core.view.components.button;

import android.content.Context;
import android.graphics.Canvas;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.skeleton.VkSkeleton;
import com.vk.core.view.shimmer.ThemableShimmer;
import kotlin.NoWhenBranchMatchedException;
import xsna.an10;
import xsna.hbh0;
import xsna.vjv0;

/* compiled from: VkButtonSkeleton.kt */
/* loaded from: classes17.dex */
public final class d extends FrameLayout implements vjv0 {
    public final VkSkeleton b;
    public boolean c;

    /* compiled from: VkButtonSkeleton.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkButton.Mode.values().length];
            try {
                iArr[VkButton.Mode.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkButton.Mode.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkButton.Mode.Outline.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VkButton.Mode.Tertiary.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VkButton.Mode.Link.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public d(Context context) {
        super(context, null, 0);
        VkSkeleton vkSkeleton = new VkSkeleton(context, null, 0, 14, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
        layoutParams.gravity = 17;
        vkSkeleton.setLayoutParams(layoutParams);
        this.b = vkSkeleton;
        this.c = true;
        super.addView(vkSkeleton);
    }

    private final void setSkeletonLayoutParams(VkButton vkButton) {
        int measuredWidth;
        int measuredHeight;
        int i = a.$EnumSwitchMapping$0[vkButton.getMode().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            measuredWidth = vkButton.getMeasuredWidth();
            measuredHeight = vkButton.getMeasuredHeight();
        } else {
            if (i != 4 && i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            measuredWidth = (getMeasuredWidth() - vkButton.getPaddingLeft()) - vkButton.getPaddingRight();
            int b = hbh0.b(80, getContext());
            if (measuredWidth > b) {
                measuredWidth = b;
            }
            if (measuredWidth < 0) {
                measuredWidth = 0;
            }
            Context context = getContext();
            int i2 = b.$EnumSwitchMapping$0[vkButton.getSize().ordinal()];
            if (i2 == 1) {
                measuredHeight = an10.b(TypedValue.applyDimension(2, 8, context.getResources().getDisplayMetrics()));
            } else {
                if (i2 != 2 && i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                measuredHeight = an10.b(TypedValue.applyDimension(2, 12, context.getResources().getDisplayMetrics()));
            }
        }
        VkSkeleton vkSkeleton = this.b;
        ViewGroup.LayoutParams layoutParams = vkSkeleton.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = measuredWidth;
        }
        ViewGroup.LayoutParams layoutParams2 = vkSkeleton.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = measuredHeight;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, 0);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if ((view instanceof VkSkeleton) || !this.c) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    public com.vk.core.view.components.skeleton.a getArea() {
        return this.b.getArea();
    }

    public final VkButton getButton() {
        if (getChildCount() != 0) {
            View childAt = getChildAt(0);
            if (childAt instanceof VkButton) {
                return (VkButton) childAt;
            }
        }
        return null;
    }

    public boolean getShimmerManagedExternally() {
        return this.b.getShimmerManagedExternally();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        VkButton button = getButton();
        if (button != null) {
            setSkeletonLayoutParams(button);
        }
        measureChildWithMargins(this.b, i, 0, i2, 0);
    }

    @Override // xsna.vjv0
    public void setArea(com.vk.core.view.components.skeleton.a aVar) {
        this.b.setArea(aVar);
    }

    @Override // xsna.vjv0
    public void setShimmer(ThemableShimmer themableShimmer) {
        this.b.setShimmer(themableShimmer);
    }

    @Override // xsna.vjv0
    public void setShimmerManagedExternally(boolean z) {
        this.b.setShimmerManagedExternally(z);
    }

    public final void setSkeletonEnabled(boolean z) {
        this.c = z;
        this.b.setVisibility(z ? 0 : 8);
    }
}
