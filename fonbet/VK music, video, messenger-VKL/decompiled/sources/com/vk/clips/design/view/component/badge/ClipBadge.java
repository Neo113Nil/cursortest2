package com.vk.clips.design.view.component.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vk.clips.design.view.component.badge.a;
import com.vk.clips.design.view.component.badge.b;
import com.vk.clips.design.view.component.badge.c;
import com.vk.core.ui.themes.VKReplacerView;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.awt0;
import xsna.bz5;
import xsna.c5g;
import xsna.cpy;
import xsna.cut0;
import xsna.epx;
import xsna.ey2;
import xsna.f4m;
import xsna.ful0;
import xsna.gcd0;
import xsna.iah0;
import xsna.j5g;
import xsna.o42;
import xsna.s3q0;
import xsna.tlo0;
import xsna.vut0;
import xsna.wut0;
import xsna.x7g;
import xsna.zrp;

/* compiled from: ClipBadge.kt */
/* loaded from: classes16.dex */
public final class ClipBadge extends LinearLayout {
    public VKReplacerView b;
    public VkText c;
    public VKReplacerView d;
    public VKReplacerView e;
    public vut0 f;
    public vut0 g;
    public vut0 h;
    public Drawable i;
    public com.vk.clips.design.view.component.badge.a j;
    public com.vk.clips.design.view.component.badge.b k;
    public c.b l;
    public c.a m;
    public BadgeMode n;
    public a o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipBadge.kt */
    public static final class BadgeMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BadgeMode[] $VALUES;
        public static final BadgeMode INTERACTIVE;
        public static final BadgeMode STATIC;
        public static final BadgeMode STATIC_FADE_END;

        static {
            BadgeMode badgeMode = new BadgeMode("INTERACTIVE", 0);
            INTERACTIVE = badgeMode;
            BadgeMode badgeMode2 = new BadgeMode("STATIC", 1);
            STATIC = badgeMode2;
            BadgeMode badgeMode3 = new BadgeMode("STATIC_FADE_END", 2);
            STATIC_FADE_END = badgeMode3;
            BadgeMode[] badgeModeArr = {badgeMode, badgeMode2, badgeMode3};
            $VALUES = badgeModeArr;
            $ENTRIES = new asp(badgeModeArr);
        }

        public BadgeMode() {
            throw null;
        }

        public static BadgeMode valueOf(String str) {
            return (BadgeMode) Enum.valueOf(BadgeMode.class, str);
        }

        public static BadgeMode[] values() {
            return (BadgeMode[]) $VALUES.clone();
        }
    }

    /* compiled from: ClipBadge.kt */
    public interface a {

        /* compiled from: ClipBadge.kt */
        /* renamed from: com.vk.clips.design.view.component.badge.ClipBadge$a$a, reason: collision with other inner class name */
        public static final class C0567a implements a {
            public final ArrayList a;
            public final cut0 b;

            public C0567a(ArrayList arrayList, cut0 cut0Var) {
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TR_BL;
                this.a = arrayList;
                this.b = cut0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0567a)) {
                    return false;
                }
                C0567a c0567a = (C0567a) obj;
                if (!this.a.equals(c0567a.a) || !this.b.equals(c0567a.b)) {
                    return false;
                }
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TR_BL;
                return true;
            }

            public final int hashCode() {
                return GradientDrawable.Orientation.TR_BL.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                return "Gradient(backgroundColors=" + this.a + ", foregroundColor=" + this.b + ", orientation=" + GradientDrawable.Orientation.TR_BL + ')';
            }
        }

        /* compiled from: ClipBadge.kt */
        public static final class b implements a {
            public final cut0 a;
            public final cut0 b;
            public final cut0 c;

            public b(cut0 cut0Var, cut0 cut0Var2, cut0 cut0Var3) {
                this.a = cut0Var;
                this.b = cut0Var2;
                this.c = cut0Var3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                return "Highlight(backgroundColor=" + this.a + ", foregroundColor=" + this.b + ", highlightColor=" + this.c + ')';
            }
        }

        /* compiled from: ClipBadge.kt */
        public static final class c implements a {
            public static final c c = new c(new x7g(R.attr.vk_ui_background_contrast_secondary_alpha), new x7g(R.attr.vk_ui_overlay_primary));
            public final cut0 a;
            public final cut0 b;

            public c(cut0 cut0Var, cut0 cut0Var2) {
                this.a = cut0Var;
                this.b = cut0Var2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Solid(backgroundColor=" + this.a + ", foregroundColor=" + this.b + ')';
            }
        }
    }

    /* compiled from: ClipBadge.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BadgeMode.values().length];
            try {
                iArr[BadgeMode.INTERACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BadgeMode.STATIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BadgeMode.STATIC_FADE_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ClipBadge(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final RippleDrawable getForegroundDrawable() {
        ColorStateList valueOf = ColorStateList.valueOf(0);
        GradientDrawable a2 = ful0.a(0);
        a2.setCornerRadius(iah0.a(8));
        s3q0 s3q0Var = s3q0.a;
        return new RippleDrawable(valueOf, null, a2);
    }

    public final VKReplacerView a() {
        VKReplacerView vKReplacerView = this.b;
        if (vKReplacerView != null) {
            return vKReplacerView;
        }
        VKReplacerView vKReplacerView2 = new VKReplacerView(getContext(), null, 6);
        this.b = vKReplacerView2;
        vKReplacerView2.setId(R.id.clips_badge_left_group);
        f4m.j(vKReplacerView2.getView());
        LinearLayout.LayoutParams b2 = cpy.b(-1, -2, 0, 0, 0, 0, 60);
        b2.gravity = 17;
        addView(vKReplacerView2, 0, b2);
        return vKReplacerView2;
    }

    public final VKReplacerView b() {
        VKReplacerView vKReplacerView = this.e;
        if (vKReplacerView != null) {
            return vKReplacerView;
        }
        VKReplacerView vKReplacerView2 = new VKReplacerView(getContext(), null, 6);
        this.e = vKReplacerView2;
        vKReplacerView2.setId(R.id.clips_badge_right_extra_group);
        f4m.j(vKReplacerView2.getView());
        LinearLayout.LayoutParams b2 = cpy.b(-2, -2, 0, 0, 0, 0, 60);
        b2.gravity = 17;
        addView(vKReplacerView2, getChildCount(), b2);
        return vKReplacerView2;
    }

    public final VKReplacerView c() {
        int childCount;
        VKReplacerView vKReplacerView = this.d;
        if (vKReplacerView == null) {
            vKReplacerView = new VKReplacerView(getContext(), null, 6);
            this.d = vKReplacerView;
            vKReplacerView.setId(R.id.clips_badge_right_main_group);
            f4m.j(vKReplacerView.getView());
            LinearLayout.LayoutParams b2 = cpy.b(-2, -2, 0, 0, 0, 0, 60);
            b2.gravity = 17;
            VKReplacerView vKReplacerView2 = this.e;
            if (vKReplacerView2 != null) {
                childCount = indexOfChild(vKReplacerView2.getView()) - 1;
                if (childCount < 0) {
                    childCount = 0;
                }
            } else {
                childCount = getChildCount();
            }
            addView(vKReplacerView, childCount, b2);
        }
        return vKReplacerView;
    }

    public final Drawable d(cut0 cut0Var) {
        ColorStateList c = cut0Var.c(getContext());
        if (Build.VERSION.SDK_INT >= 29) {
            return o42.b(c);
        }
        if (!c.isStateful()) {
            return new ColorDrawable(c.getDefaultColor());
        }
        ColorDrawable colorDrawable = new ColorDrawable(-1);
        colorDrawable.setTintList(c);
        return colorDrawable;
    }

    public final void e() {
        Drawable layerDrawable;
        cut0 cut0Var;
        a aVar = this.o;
        RippleDrawable foregroundDrawable = getForegroundDrawable();
        boolean z = aVar instanceof a.C0567a;
        if (z) {
            a.C0567a c0567a = (a.C0567a) aVar;
            c0567a.getClass();
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TR_BL;
            ArrayList arrayList = c0567a.a;
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(((cut0) it.next()).b(getContext())));
            }
            GradientDrawable gradientDrawable = new GradientDrawable(orientation, j5g.N0(arrayList2));
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(iah0.a(8));
            layerDrawable = gradientDrawable;
        } else if (aVar instanceof a.b) {
            setLayerType(1, null);
            a.b bVar = (a.b) aVar;
            layerDrawable = new LayerDrawable(new Drawable[]{d(bVar.a), new bz5(bVar.c.b(getContext()))});
        } else {
            if (!(aVar instanceof a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            layerDrawable = d(((a.c) aVar).a);
        }
        this.i = layerDrawable;
        if (aVar instanceof a.c) {
            cut0Var = ((a.c) aVar).b;
        } else if (z) {
            cut0Var = ((a.C0567a) aVar).b;
        } else {
            if (!(aVar instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            cut0Var = ((a.b) aVar).b;
        }
        foregroundDrawable.setColor(cut0Var.c(getContext()));
        setBackground(this.i);
        setForeground(foregroundDrawable);
    }

    public final void f() {
        VkText vkText = this.c;
        if (vkText == null) {
            return;
        }
        int i = b.$EnumSwitchMapping$0[this.n.ordinal()];
        if (i == 1) {
            vkText.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            vkText.setMarqueeRepeatLimit(-1);
            vkText.setFadingEdgeLength(iah0.a(24));
            vkText.setSelected(true);
            vkText.setHorizontallyScrolling(true);
            vkText.setHorizontalFadingEdgeEnabled(true);
            return;
        }
        if (i == 2) {
            vkText.setEllipsize(TextUtils.TruncateAt.END);
            vkText.setMarqueeRepeatLimit(0);
            vkText.setFadingEdgeLength(iah0.a(0));
            vkText.setSelected(false);
            vkText.setHorizontallyScrolling(false);
            vkText.setHorizontalFadingEdgeEnabled(false);
            return;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        vkText.setEllipsize(null);
        vkText.setMarqueeRepeatLimit(0);
        vkText.setFadingEdgeLength(iah0.a(24));
        vkText.setSelected(false);
        vkText.setHorizontallyScrolling(true);
        vkText.setHorizontalFadingEdgeEnabled(true);
    }

    public final void g() {
        boolean z = this.j != null;
        boolean z2 = this.k != null;
        boolean z3 = this.l != null;
        boolean z4 = this.m != null;
        VKReplacerView vKReplacerView = this.b;
        if (vKReplacerView != null) {
            ViewGroup.LayoutParams layoutParams = vKReplacerView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart(iah0.a((z2 || z3 || z4) ? 2 : 8));
            layoutParams2.setMarginEnd(z2 ? iah0.a(0) : (z3 || z4) ? iah0.a(2) : iah0.a(8));
            vKReplacerView.setLayoutParams(layoutParams2);
        }
        VkText vkText = this.c;
        if (vkText != null) {
            ViewGroup.LayoutParams layoutParams3 = vkText.getLayoutParams();
            if (layoutParams3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
            layoutParams4.setMarginStart(iah0.a(z ? 2 : 8));
            layoutParams4.setMarginEnd(iah0.a((z3 || z4) ? 2 : 8));
            float f = 4;
            layoutParams4.topMargin = iah0.a(f);
            layoutParams4.bottomMargin = iah0.a(f);
            vkText.setLayoutParams(layoutParams4);
        }
        VKReplacerView vKReplacerView2 = this.d;
        if (vKReplacerView2 != null) {
            ViewGroup.LayoutParams layoutParams5 = vKReplacerView2.getLayoutParams();
            if (layoutParams5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
            layoutParams6.setMarginStart(z2 ? iah0.a(0) : z ? iah0.a(2) : iah0.a(8));
            layoutParams6.setMarginEnd(iah0.a((z || z2 || z4) ? 2 : 8));
            vKReplacerView2.setLayoutParams(layoutParams6);
        }
        VKReplacerView vKReplacerView3 = this.e;
        if (vKReplacerView3 != null) {
            ViewGroup.LayoutParams layoutParams7 = vKReplacerView3.getLayoutParams();
            if (layoutParams7 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) layoutParams7;
            layoutParams8.setMarginStart(z2 ? iah0.a(0) : (z || z3) ? iah0.a(2) : iah0.a(8));
            layoutParams8.setMarginEnd(iah0.a((z || z2 || z3) ? 2 : 8));
            vKReplacerView3.setLayoutParams(layoutParams8);
        }
    }

    public final a getAppearance() {
        return this.o;
    }

    @Override // android.view.View
    public final com.vk.clips.design.view.component.badge.a getLeft() {
        return this.j;
    }

    public final com.vk.clips.design.view.component.badge.b getMiddle() {
        return this.k;
    }

    public final BadgeMode getMode() {
        return this.n;
    }

    public final c.a getRightExtra() {
        return this.m;
    }

    public final c.b getRightMain() {
        return this.l;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(iah0.a(22), 1073741824));
    }

    public final void setAppearance(a aVar) {
        if (epx.f(this.o, aVar)) {
            return;
        }
        this.o = aVar;
        e();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setAlpha(z ? 1.0f : 0.64f);
    }

    public final void setLeft(com.vk.clips.design.view.component.badge.a aVar) {
        if (epx.f(this.j, aVar)) {
            return;
        }
        this.j = aVar;
        VKReplacerView a2 = a();
        awt0.v(a2.getView(), aVar != null);
        if (aVar instanceof a.C0568a) {
            a.C0568a c0568a = (a.C0568a) aVar;
            f4m.z(c0568a.a.getWidth(), c0568a.a.getHeight(), a2);
            vut0 vut0Var = this.f;
            if (vut0Var != null) {
                vut0Var.c(c0568a.b);
                s3q0 s3q0Var = s3q0.a;
            }
        } else {
            vut0 vut0Var2 = this.f;
            if (vut0Var2 != null) {
                vut0Var2.c(null);
                s3q0 s3q0Var2 = s3q0.a;
            }
        }
        g();
    }

    public final void setLeftView(wut0 wut0Var) {
        VKReplacerView a2 = a();
        if (wut0Var == null) {
            this.f = null;
            s3q0 s3q0Var = s3q0.a;
        } else {
            vut0 create = wut0Var.create(a2.getContext());
            this.f = create;
            s3q0 s3q0Var2 = s3q0.a;
            a2.a(create.getView());
        }
    }

    public final void setMiddle(com.vk.clips.design.view.component.badge.b bVar) {
        if (epx.f(this.k, bVar)) {
            return;
        }
        this.k = bVar;
        VkText vkText = this.c;
        if (vkText == null) {
            vkText = new VkText(getContext(), null, 6, 0);
            this.c = vkText;
            vkText.setId(R.id.clips_badge_middle_group);
            f4m.j(vkText);
            vkText.setTextAppearance(R.style.VkUiTypography_Caption1Medium);
            vkText.setIncludeFontPadding(false);
            vkText.setSingleLine(true);
            vkText.setGravity(8388627);
            LinearLayout.LayoutParams b2 = cpy.b(-1, -2, 0, 0, 0, 0, 60);
            b2.weight = 1.0f;
            VKReplacerView vKReplacerView = this.b;
            addView(vkText, vKReplacerView != null ? indexOfChild(vKReplacerView.getView()) + 1 : 0, b2);
        }
        awt0.v(vkText, bVar != null);
        if (bVar instanceof b.a) {
            b.a aVar = (b.a) bVar;
            ey2.i(vkText, aVar.a.a(vkText.getContext()));
            cut0 cut0Var = aVar.b;
            if (cut0Var != null) {
                vkText.setTextColor(cut0Var.b(vkText.getContext()));
            }
            vkText.setMaxWidth(aVar.c);
            tlo0 tlo0Var = aVar.d;
            vkText.setContentDescription(tlo0Var != null ? tlo0Var.a(vkText.getContext()) : null);
            f();
        }
        s3q0 s3q0Var = s3q0.a;
        g();
    }

    public final void setMode(BadgeMode badgeMode) {
        if (this.n != badgeMode) {
            this.n = badgeMode;
            f();
        }
    }

    public final void setRightExtra(c.a aVar) {
        if (epx.f(this.m, aVar)) {
            return;
        }
        this.m = aVar;
        VKReplacerView b2 = b();
        awt0.v(b2.getView(), aVar != null);
        if (aVar instanceof c.a.C0569a) {
            c.a.C0569a c0569a = (c.a.C0569a) aVar;
            f4m.z(c0569a.b.getWidth(), c0569a.b.getHeight(), b2);
            vut0 vut0Var = this.h;
            if (vut0Var != null) {
                vut0Var.c(c0569a.a);
                s3q0 s3q0Var = s3q0.a;
            }
        } else {
            vut0 vut0Var2 = this.h;
            if (vut0Var2 != null) {
                vut0Var2.c(aVar != null ? aVar.a() : null);
                s3q0 s3q0Var2 = s3q0.a;
            }
        }
        g();
    }

    public final void setRightExtraView(wut0 wut0Var) {
        VKReplacerView b2 = b();
        if (wut0Var == null) {
            this.h = null;
            s3q0 s3q0Var = s3q0.a;
        } else {
            vut0 create = wut0Var.create(b2.getContext());
            this.h = create;
            s3q0 s3q0Var2 = s3q0.a;
            b2.a(create.getView());
        }
    }

    public final void setRightMain(c.b bVar) {
        if (epx.f(this.l, bVar)) {
            return;
        }
        this.l = bVar;
        awt0.v(c().getView(), bVar != null);
        if (bVar instanceof c.b.C0570b) {
            throw null;
        }
        vut0 vut0Var = this.g;
        if (vut0Var != null) {
            vut0Var.c(bVar != null ? bVar.a() : null);
            s3q0 s3q0Var = s3q0.a;
        }
        g();
    }

    public final void setRightView(wut0 wut0Var) {
        VKReplacerView c = c();
        if (wut0Var == null) {
            this.g = null;
            s3q0 s3q0Var = s3q0.a;
        } else {
            vut0 create = wut0Var.create(c.getContext());
            this.g = create;
            s3q0 s3q0Var2 = s3q0.a;
            c.a(create.getView());
        }
    }

    public ClipBadge(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.n = BadgeMode.STATIC;
        this.o = a.c.c;
        setOrientation(0);
        setGravity(16);
        setBackground(this.i);
        setForeground(getForegroundDrawable());
        e();
        gcd0.d(this, 6, iah0.b(8.0f));
    }
}
