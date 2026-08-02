package com.vk.core.view.components.cell;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SizeF;
import android.view.View;
import android.widget.LinearLayout;
import com.vk.core.view.components.cell.VkCellSkeleton$Left$Main;
import com.vk.core.view.components.cell.d;
import com.vk.core.view.components.skeleton.VkSkeleton;
import com.vk.core.view.components.skeleton.VkTextSkeleton;
import com.vk.core.view.components.skeleton.a;
import com.vk.core.view.shimmer.ThemableShimmer;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import org.chromium.base.version_info.VersionConstants;
import xsna.an10;
import xsna.b3m0;
import xsna.dy0;
import xsna.e3m;
import xsna.fqd;
import xsna.hbh0;
import xsna.izs;
import xsna.msy;
import xsna.s3q0;
import xsna.vf1;
import xsna.vjv0;
import xsna.vle;
import xsna.wle;
import xsna.ykt0;

/* compiled from: VkCellSkeleton.kt */
/* loaded from: classes17.dex */
public final class VkCellSkeleton extends LinearLayout implements vjv0 {
    public static final /* synthetic */ int n = 0;
    public final ThemableShimmer b;
    public c c;
    public e d;
    public com.vk.core.view.components.skeleton.a e;
    public boolean f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;

    public VkCellSkeleton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkSkeleton getLeftExtraView() {
        return (VkSkeleton) this.j.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final LinearLayout getLeftLayout() {
        return (LinearLayout) this.g.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkSkeleton getLeftMainView() {
        return (VkSkeleton) this.i.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkTextSkeleton getMiddleExtraSubtitleView() {
        return (VkTextSkeleton) this.m.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final LinearLayout getMiddleLayout() {
        return (LinearLayout) this.h.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkTextSkeleton getMiddleSubtitleView() {
        return (VkTextSkeleton) this.l.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkTextSkeleton getMiddleTitleView() {
        return (VkTextSkeleton) this.k.getValue();
    }

    public final void a(izs<? super vjv0, s3q0> izsVar) {
        if (findViewById(R.id.ds_internal_cell_skeleton_left_main) != null) {
            izsVar.invoke(getLeftMainView());
        }
        if (findViewById(R.id.ds_internal_cell_skeleton_left_extra) != null) {
            izsVar.invoke(getLeftExtraView());
        }
        if (findViewById(R.id.ds_internal_cell_skeleton_middle_title) != null) {
            izsVar.invoke(getMiddleTitleView());
        }
        if (findViewById(R.id.ds_internal_cell_skeleton_middle_subtitle) != null) {
            izsVar.invoke(getMiddleSubtitleView());
        }
        if (findViewById(R.id.ds_internal_cell_skeleton_middle_extra_subtitle) != null) {
            izsVar.invoke(getMiddleExtraSubtitleView());
        }
    }

    public final void b(VkTextSkeleton vkTextSkeleton, f fVar) {
        String str = fVar.a;
        int i = fVar.b;
        if (str == null) {
            vkTextSkeleton.setLines(Math.max(i, 1));
        } else {
            vkTextSkeleton.setText(str);
            vkTextSkeleton.setMaxLines(Math.max(i, 1));
            vkTextSkeleton.setMinLines(1);
        }
        vkTextSkeleton.setArea(getArea());
        vkTextSkeleton.setSingleLineWidth(fVar.c);
    }

    public com.vk.core.view.components.skeleton.a getArea() {
        return this.e;
    }

    @Override // android.view.View
    public final c getLeft() {
        return this.c;
    }

    public final e getMiddle() {
        return this.d;
    }

    public boolean getShimmerManagedExternally() {
        return this.f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getShimmerManagedExternally()) {
            return;
        }
        this.b.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator;
        super.onDetachedFromWindow();
        if (getShimmerManagedExternally() || (valueAnimator = this.b.u) == null) {
            return;
        }
        valueAnimator.cancel();
        valueAnimator.removeAllUpdateListeners();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (getShimmerManagedExternally()) {
            return;
        }
        ThemableShimmer themableShimmer = this.b;
        if (i == 0) {
            themableShimmer.b();
        } else if (i == 4 || i == 8) {
            themableShimmer.c();
        }
    }

    @Override // xsna.vjv0
    public void setArea(com.vk.core.view.components.skeleton.a aVar) {
        this.e = aVar;
        a(new b3m0(aVar, 20));
    }

    public final void setLeft(c cVar) {
        SizeF sizeF;
        VkSkeleton.a c0862a;
        this.c = cVar;
        if (cVar == null) {
            getLeftLayout().removeAllViews();
            return;
        }
        d dVar = cVar.b;
        VkCellSkeleton$Left$Main vkCellSkeleton$Left$Main = cVar.a;
        boolean z = vkCellSkeleton$Left$Main instanceof VkCellSkeleton$Left$Main.a;
        if (z) {
            int i = a.$EnumSwitchMapping$0[((VkCellSkeleton$Left$Main.a) vkCellSkeleton$Left$Main).a.ordinal()];
            if (i == 1) {
                sizeF = new SizeF(40.0f, 40.0f);
            } else if (i == 2) {
                sizeF = new SizeF(48.0f, 48.0f);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                sizeF = new SizeF(72.0f, 72.0f);
            }
        } else if (vkCellSkeleton$Left$Main instanceof VkCellSkeleton$Left$Main.d) {
            int i2 = a.$EnumSwitchMapping$0[((VkCellSkeleton$Left$Main.d) vkCellSkeleton$Left$Main).a.ordinal()];
            if (i2 == 1) {
                sizeF = new SizeF(24.0f, 24.0f);
            } else if (i2 == 2) {
                sizeF = new SizeF(32.0f, 32.0f);
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                sizeF = new SizeF(36.0f, 36.0f);
            }
        } else if (vkCellSkeleton$Left$Main instanceof VkCellSkeleton$Left$Main.e) {
            int i3 = a.$EnumSwitchMapping$0[((VkCellSkeleton$Left$Main.e) vkCellSkeleton$Left$Main).a.ordinal()];
            if (i3 == 1) {
                sizeF = new SizeF(40.0f, 40.0f);
            } else if (i3 == 2) {
                sizeF = new SizeF(48.0f, 48.0f);
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                sizeF = new SizeF(72.0f, 72.0f);
            }
        } else {
            if (!(vkCellSkeleton$Left$Main instanceof VkCellSkeleton$Left$Main.b)) {
                throw new NoWhenBranchMatchedException();
            }
            VkCellSkeleton$Left$Main.b bVar = (VkCellSkeleton$Left$Main.b) vkCellSkeleton$Left$Main;
            sizeF = new SizeF(bVar.a, bVar.b);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(an10.b(hbh0.a(getContext(), sizeF.getWidth())), an10.b(hbh0.a(getContext(), sizeF.getHeight())));
        layoutParams.setMarginStart(e3m.a(R.dimen.vk_ui_spacing_size_xl, getContext()));
        VkSkeleton leftMainView = getLeftMainView();
        if (z) {
            c0862a = VkSkeleton.a.b.a;
        } else if (vkCellSkeleton$Left$Main instanceof VkCellSkeleton$Left$Main.b) {
            c0862a = new VkSkeleton.a.C0862a(0);
        } else if (vkCellSkeleton$Left$Main instanceof VkCellSkeleton$Left$Main.d) {
            c0862a = VkSkeleton.a.b.a;
        } else {
            if (!(vkCellSkeleton$Left$Main instanceof VkCellSkeleton$Left$Main.e)) {
                throw new NoWhenBranchMatchedException();
            }
            c0862a = new VkSkeleton.a.C0862a(0);
        }
        leftMainView.setType(c0862a);
        getLeftMainView().setArea(getArea());
        if (getLeftLayout().findViewById(R.id.ds_internal_cell_skeleton_left_main) != null) {
            getLeftMainView().setLayoutParams(layoutParams);
        } else {
            getLeftLayout().addView(getLeftMainView(), 0, layoutParams);
        }
        if (dVar == null) {
            if (findViewById(R.id.ds_internal_cell_skeleton_left_extra) != null) {
                getLeftLayout().removeView(getLeftExtraView());
                return;
            }
            return;
        }
        boolean z2 = dVar instanceof d.b;
        if (!z2) {
            throw new NoWhenBranchMatchedException();
        }
        SizeF sizeF2 = new SizeF(24.0f, 24.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(an10.b(hbh0.a(getContext(), sizeF2.getWidth())), an10.b(hbh0.a(getContext(), sizeF2.getHeight())));
        layoutParams2.setMarginStart(e3m.a(R.dimen.vk_ui_spacing_size_xl, getContext()));
        VkSkeleton leftExtraView = getLeftExtraView();
        if (!z2) {
            throw new NoWhenBranchMatchedException();
        }
        leftExtraView.setType(VkSkeleton.a.b.a);
        getLeftExtraView().setArea(getArea());
        if (findViewById(R.id.ds_internal_cell_skeleton_left_extra) != null) {
            getLeftExtraView().setLayoutParams(layoutParams2);
        } else {
            getLeftLayout().addView(getLeftExtraView(), 0, layoutParams2);
        }
    }

    public final void setMiddle(e eVar) {
        this.d = eVar;
        if (eVar == null) {
            getMiddleLayout().removeAllViews();
            return;
        }
        getMiddleLayout().removeAllViews();
        f fVar = eVar.a;
        if (fVar != null) {
            b(getMiddleTitleView(), fVar);
            if (getMiddleTitleView().getSingleLineWidth() <= 0) {
                getMiddleTitleView().setSingleLineWidth(hbh0.b(VersionConstants.PRODUCT_MAJOR_VERSION, getContext()));
            }
            getMiddleLayout().addView(getMiddleTitleView());
        }
        f fVar2 = eVar.b;
        if (fVar2 != null) {
            b(getMiddleSubtitleView(), fVar2);
            if (getMiddleSubtitleView().getSingleLineWidth() <= 0) {
                getMiddleSubtitleView().setSingleLineWidth(hbh0.b(80, getContext()));
            }
            getMiddleLayout().addView(getMiddleSubtitleView());
        }
        f fVar3 = eVar.c;
        if (fVar3 != null) {
            b(getMiddleExtraSubtitleView(), fVar3);
            if (getMiddleExtraSubtitleView().getSingleLineWidth() <= 0) {
                getMiddleExtraSubtitleView().setSingleLineWidth(hbh0.b(64, getContext()));
            }
            getMiddleLayout().addView(getMiddleExtraSubtitleView());
        }
    }

    @Override // xsna.vjv0
    public void setShimmer(ThemableShimmer themableShimmer) {
        a(new ykt0(themableShimmer, 4));
    }

    @Override // xsna.vjv0
    public void setShimmerManagedExternally(boolean z) {
        this.f = z;
    }

    public VkCellSkeleton(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.b = new ThemableShimmer.a(context).a();
        this.e = new a.C0863a(this);
        vle vleVar = new vle(context, 1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.g = msy.a(lazyThreadSafetyMode, vleVar);
        this.h = msy.a(lazyThreadSafetyMode, new wle(context, 2));
        this.i = msy.a(lazyThreadSafetyMode, new dy0(29, context, this));
        this.j = msy.a(lazyThreadSafetyMode, new com.vk.movika.tools.controls.seekbar.f(26, context, this));
        this.k = msy.a(lazyThreadSafetyMode, new com.vk.movika.tools.controls.seekbar.g(21, context, this));
        this.l = msy.a(lazyThreadSafetyMode, new fqd(17, context, this));
        this.m = msy.a(lazyThreadSafetyMode, new vf1(20, context, this));
        setMinimumHeight(hbh0.b(48, context));
        setOrientation(0);
        setGravity(16);
        addView(getLeftLayout());
        addView(getMiddleLayout());
    }
}
