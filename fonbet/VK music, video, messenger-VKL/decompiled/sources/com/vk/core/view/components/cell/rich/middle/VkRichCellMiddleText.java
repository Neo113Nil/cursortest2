package com.vk.core.view.components.cell.rich.middle;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Size;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.core.tool.view.GapLinearLayout;
import com.vk.core.view.components.text.VkFadeText;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import xsna.ey2;
import xsna.f4m;
import xsna.gpo0;
import xsna.gzs;
import xsna.hbh0;
import xsna.ngv0;
import xsna.s3q0;
import xsna.tlo0;
import xsna.too0;
import xsna.z01;

/* compiled from: VkRichCellMiddleText.kt */
/* loaded from: classes17.dex */
public final class VkRichCellMiddleText extends GapLinearLayout implements too0 {
    public static final /* synthetic */ int i = 0;
    public final VkFadeText d;
    public AppCompatImageView e;
    public AppCompatImageView f;
    public AppCompatImageView g;
    public AppCompatImageView h;

    /* compiled from: VkRichCellMiddleText.kt */
    public static final /* synthetic */ class a extends MutablePropertyReference0Impl {
        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
        public final Object get() {
            return ((VkRichCellMiddleText) this.receiver).g;
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
        public final void set(Object obj) {
            ((VkRichCellMiddleText) this.receiver).g = (AppCompatImageView) obj;
        }
    }

    /* compiled from: VkRichCellMiddleText.kt */
    public static final /* synthetic */ class b extends MutablePropertyReference0Impl {
        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
        public final Object get() {
            return ((VkRichCellMiddleText) this.receiver).h;
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
        public final void set(Object obj) {
            ((VkRichCellMiddleText) this.receiver).h = (AppCompatImageView) obj;
        }
    }

    /* compiled from: VkRichCellMiddleText.kt */
    public static final /* synthetic */ class c extends MutablePropertyReference0Impl {
        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
        public final Object get() {
            return ((VkRichCellMiddleText) this.receiver).e;
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
        public final void set(Object obj) {
            ((VkRichCellMiddleText) this.receiver).e = (AppCompatImageView) obj;
        }
    }

    /* compiled from: VkRichCellMiddleText.kt */
    public static final /* synthetic */ class d extends MutablePropertyReference0Impl {
        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
        public final Object get() {
            return ((VkRichCellMiddleText) this.receiver).f;
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
        public final void set(Object obj) {
            ((VkRichCellMiddleText) this.receiver).f = (AppCompatImageView) obj;
        }
    }

    public VkRichCellMiddleText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        VkFadeText vkFadeText = new VkFadeText(context, null, 6, 0);
        this.d = vkFadeText;
        setOrientation(0);
        vkFadeText.setEllipsize(TextUtils.TruncateAt.END);
        vkFadeText.setIncludeFontPadding(false);
        addView(vkFadeText, new LinearLayout.LayoutParams(-2, -2, 1.0f));
        Ng();
    }

    public static void d(AppCompatImageView appCompatImageView, ngv0.a aVar, int i2) {
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        Size size = aVar.d;
        layoutParams.width = size != null ? size.getWidth() : i2;
        Size size2 = aVar.d;
        if (size2 != null) {
            i2 = size2.getHeight();
        }
        layoutParams.height = i2;
        appCompatImageView.setLayoutParams(layoutParams);
        appCompatImageView.setVisibility(0);
        appCompatImageView.setImageDrawable(aVar.a.a(appCompatImageView.getContext()));
        tlo0 tlo0Var = aVar.c;
        appCompatImageView.setContentDescription(tlo0Var != null ? tlo0Var.a(appCompatImageView.getContext()) : null);
        gpo0.g(appCompatImageView, aVar.b);
    }

    private final AppCompatImageView getOrCreateIconAfter1() {
        a aVar = new a(this, VkRichCellMiddleText.class, "iconAfter1", "getIconAfter1()Landroidx/appcompat/widget/AppCompatImageView;", 0);
        AppCompatImageView appCompatImageView = (AppCompatImageView) aVar.get();
        if (appCompatImageView != null) {
            return appCompatImageView;
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(getContext());
        appCompatImageView2.setId(R.id.ds_internal_rich_cell_middle_text_icon_after_1);
        addView(appCompatImageView2, indexOfChild(this.d) + 1);
        aVar.set(appCompatImageView2);
        return appCompatImageView2;
    }

    private final AppCompatImageView getOrCreateIconAfter2() {
        b bVar = new b(this, VkRichCellMiddleText.class, "iconAfter2", "getIconAfter2()Landroidx/appcompat/widget/AppCompatImageView;", 0);
        AppCompatImageView appCompatImageView = (AppCompatImageView) bVar.get();
        if (appCompatImageView != null) {
            return appCompatImageView;
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(getContext());
        appCompatImageView2.setId(R.id.ds_internal_rich_cell_middle_text_icon_after_2);
        addView(appCompatImageView2, getChildCount());
        bVar.set(appCompatImageView2);
        return appCompatImageView2;
    }

    private final AppCompatImageView getOrCreateIconBefore1() {
        c cVar = new c(this, VkRichCellMiddleText.class, "iconBefore1", "getIconBefore1()Landroidx/appcompat/widget/AppCompatImageView;", 0);
        AppCompatImageView appCompatImageView = (AppCompatImageView) cVar.get();
        if (appCompatImageView != null) {
            return appCompatImageView;
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(getContext());
        appCompatImageView2.setId(R.id.ds_internal_rich_cell_middle_text_icon_before_1);
        addView(appCompatImageView2, 0);
        cVar.set(appCompatImageView2);
        return appCompatImageView2;
    }

    private final AppCompatImageView getOrCreateIconBefore2() {
        d dVar = new d(this, VkRichCellMiddleText.class, "iconBefore2", "getIconBefore2()Landroidx/appcompat/widget/AppCompatImageView;", 0);
        AppCompatImageView appCompatImageView = (AppCompatImageView) dVar.get();
        if (appCompatImageView != null) {
            return appCompatImageView;
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(getContext());
        appCompatImageView2.setId(R.id.ds_internal_rich_cell_middle_text_icon_before_2);
        addView(appCompatImageView2, indexOfChild(this.d));
        dVar.set(appCompatImageView2);
        return appCompatImageView2;
    }

    @Override // xsna.too0
    public final void Ng() {
        getContext();
        this.d.setFade(false);
    }

    public final void b(ngv0 ngv0Var, int i2) {
        if (ngv0Var instanceof ngv0.a) {
            d(getOrCreateIconAfter1(), (ngv0.a) ngv0Var, i2);
            AppCompatImageView appCompatImageView = this.h;
            if (appCompatImageView != null) {
                f4m.j(appCompatImageView);
                return;
            }
            return;
        }
        if (ngv0Var instanceof ngv0.b) {
            ngv0.b bVar = (ngv0.b) ngv0Var;
            d(getOrCreateIconAfter1(), bVar.a, i2);
            d(getOrCreateIconAfter2(), bVar.b, i2);
        } else {
            if (ngv0Var != null) {
                throw new NoWhenBranchMatchedException();
            }
            AppCompatImageView appCompatImageView2 = this.g;
            if (appCompatImageView2 != null) {
                f4m.j(appCompatImageView2);
            }
            AppCompatImageView appCompatImageView3 = this.h;
            if (appCompatImageView3 != null) {
                f4m.j(appCompatImageView3);
            }
        }
    }

    public final void c(ngv0 ngv0Var, int i2) {
        if (ngv0Var instanceof ngv0.a) {
            d(getOrCreateIconBefore1(), (ngv0.a) ngv0Var, i2);
            AppCompatImageView appCompatImageView = this.f;
            if (appCompatImageView != null) {
                f4m.j(appCompatImageView);
                return;
            }
            return;
        }
        if (ngv0Var instanceof ngv0.b) {
            ngv0.b bVar = (ngv0.b) ngv0Var;
            d(getOrCreateIconBefore1(), bVar.a, i2);
            d(getOrCreateIconBefore2(), bVar.b, i2);
        } else {
            if (ngv0Var != null) {
                throw new NoWhenBranchMatchedException();
            }
            AppCompatImageView appCompatImageView2 = this.e;
            if (appCompatImageView2 != null) {
                f4m.j(appCompatImageView2);
            }
            AppCompatImageView appCompatImageView3 = this.f;
            if (appCompatImageView3 != null) {
                f4m.j(appCompatImageView3);
            }
        }
    }

    public final VkFadeText getTextView() {
        return this.d;
    }

    public final void setAfterForSubtitle(ngv0 ngv0Var) {
        b(ngv0Var, hbh0.b(12, getContext()));
    }

    public final void setAfterForTitle(ngv0 ngv0Var) {
        b(ngv0Var, hbh0.b(16, getContext()));
    }

    public final void setBeforeForSubtitle(ngv0 ngv0Var) {
        c(ngv0Var, hbh0.b(12, getContext()));
    }

    public final void setBeforeForTitle(ngv0 ngv0Var) {
        c(ngv0Var, hbh0.b(16, getContext()));
    }

    public final void setEllipsize(TextUtils.TruncateAt truncateAt) {
        this.d.setEllipsize(truncateAt);
    }

    public final void setMaxLines(int i2) {
        this.d.setMaxTextLines(i2);
    }

    public final void setTextAppearance(int i2) {
        this.d.setTextAppearance(i2);
    }

    public final void setTextClickListener(gzs<s3q0> gzsVar) {
        VkFadeText vkFadeText = this.d;
        if (gzsVar != null) {
            vkFadeText.setOnClickListener(new z01(gzsVar, 7));
        } else {
            vkFadeText.setOnClickListener(null);
            vkFadeText.setClickable(false);
        }
    }

    public final void setTextColor(int i2) {
        this.d.setTextColor(i2);
    }

    public final void setTextOrHide(CharSequence charSequence) {
        ey2.i(this.d, charSequence);
    }
}
