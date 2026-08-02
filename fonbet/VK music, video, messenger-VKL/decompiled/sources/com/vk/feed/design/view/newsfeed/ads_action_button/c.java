package com.vk.feed.design.view.newsfeed.ads_action_button;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vk.feed.design.view.newsfeed.ads_action_button.VkFeedActionCellButton$Content$Middle;
import com.vk.feed.design.view.newsfeed.ads_action_button.a;
import com.vk.feed.design.view.newsfeed.ads_action_button.b;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.awt0;
import xsna.bwt0;
import xsna.cut0;
import xsna.dko;
import xsna.e3m;
import xsna.epx;
import xsna.f4m;
import xsna.iah0;
import xsna.krv0;
import xsna.msy;
import xsna.pis0;
import xsna.s3q0;
import xsna.tlo0;
import xsna.xdj0;

/* compiled from: VkFeedActionCellButton.kt */
/* loaded from: classes18.dex */
public final class c extends ConstraintLayout {
    public final VkImageSimple A;
    public final VkButton B;
    public final VkImageSimple C;
    public final View D;
    public final View E;
    public final Object F;
    public com.vk.feed.design.view.newsfeed.ads_action_button.a t;
    public VkFeedActionCellButton$Content$Middle u;
    public b v;
    public boolean w;
    public boolean x;
    public final VkImageSimple y;
    public final VkText z;

    /* compiled from: VkFeedActionCellButton.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkFeedActionCellButton$Content$Middle.Label.TruncateMode.values().length];
            try {
                iArr[VkFeedActionCellButton$Content$Middle.Label.TruncateMode.INTERACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkFeedActionCellButton$Content$Middle.Label.TruncateMode.STATIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public c(Context context) {
        super(context, null, 0);
        this.F = msy.a(LazyThreadSafetyMode.NONE, new pis0(this, 12));
        LayoutInflater.from(context).inflate(R.layout.feed_ads_action_cell_button, (ViewGroup) this, true);
        setMinimumHeight(iah0.a(44));
        bwt0.Z(R.attr.vk_ui_background_secondary, this);
        this.y = (VkImageSimple) findViewById(R.id.action_cell_start_icon);
        this.z = (VkText) findViewById(R.id.action_cell_label);
        this.A = (VkImageSimple) findViewById(R.id.action_cell_label_trailing_icon);
        this.B = (VkButton) findViewById(R.id.action_cell_end_button);
        this.C = (VkImageSimple) findViewById(R.id.action_cell_end_icon);
        this.D = findViewById(R.id.action_cell_shine);
        this.E = findViewById(R.id.action_cell_divider);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final xdj0 getShineAnimator() {
        return (xdj0) this.F.getValue();
    }

    public final void P4() {
        int i;
        Context context = getContext();
        VkFeedActionCellButton$Content$Middle vkFeedActionCellButton$Content$Middle = this.u;
        VkFeedActionCellButton$Content$Middle.Label label = vkFeedActionCellButton$Content$Middle instanceof VkFeedActionCellButton$Content$Middle.Label ? (VkFeedActionCellButton$Content$Middle.Label) vkFeedActionCellButton$Content$Middle : null;
        if ((label != null ? label.c : null) != null) {
            i = R.dimen.action_cell_label_margin_with_label_trailing_icon;
        } else {
            b bVar = this.v;
            i = bVar instanceof b.a ? R.dimen.action_cell_label_margin_with_right_button : bVar instanceof b.C1039b ? R.dimen.action_cell_label_margin_with_right_icon : R.dimen.action_cell_label_margin_default;
        }
        f4m.r(e3m.a(i, context), this.z);
    }

    public final void Q4() {
        Context context = getContext();
        b bVar = this.v;
        f4m.r(e3m.a(bVar instanceof b.a ? R.dimen.action_cell_label_margin_with_right_button : bVar instanceof b.C1039b ? R.dimen.action_cell_label_margin_with_right_icon : R.dimen.action_cell_label_margin_default, context), this.A);
    }

    @Override // android.view.View
    public final com.vk.feed.design.view.newsfeed.ads_action_button.a getLeft() {
        return this.t;
    }

    public final VkFeedActionCellButton$Content$Middle getMiddle() {
        return this.u;
    }

    @Override // android.view.View
    public final b getRight() {
        return this.v;
    }

    public final boolean getWithDivider() {
        return this.w;
    }

    public final boolean getWithShine() {
        return this.x;
    }

    public final void setLeft(com.vk.feed.design.view.newsfeed.ads_action_button.a aVar) {
        if (epx.f(this.t, aVar)) {
            return;
        }
        this.t = aVar;
        boolean z = aVar != null;
        VkImageSimple vkImageSimple = this.y;
        awt0.v(vkImageSimple, z);
        if (aVar instanceof a.C1038a) {
            a.C1038a c1038a = (a.C1038a) aVar;
            vkImageSimple.setImageDrawable(c1038a.a.a(getContext()));
            cut0 cut0Var = c1038a.b;
            bwt0.o0(vkImageSimple, cut0Var != null ? cut0Var.b(getContext()) : krv0.m(R.attr.vk_ui_icon_secondary, getContext()));
            tlo0 tlo0Var = c1038a.c;
            vkImageSimple.setContentDescription(tlo0Var != null ? tlo0Var.a(getContext()) : null);
        }
    }

    public final void setMiddle(VkFeedActionCellButton$Content$Middle vkFeedActionCellButton$Content$Middle) {
        if (epx.f(this.u, vkFeedActionCellButton$Content$Middle)) {
            return;
        }
        this.u = vkFeedActionCellButton$Content$Middle;
        if (vkFeedActionCellButton$Content$Middle instanceof VkFeedActionCellButton$Content$Middle.Label) {
            VkFeedActionCellButton$Content$Middle.Label label = (VkFeedActionCellButton$Content$Middle.Label) vkFeedActionCellButton$Content$Middle;
            CharSequence a2 = label.a.a(getContext());
            VkText vkText = this.z;
            vkText.setText(a2);
            cut0 cut0Var = label.b;
            vkText.setTextColor(cut0Var != null ? cut0Var.b(getContext()) : krv0.m(R.attr.vk_ui_text_primary, getContext()));
            tlo0 tlo0Var = label.f;
            vkText.setContentDescription(tlo0Var != null ? tlo0Var.a(getContext()) : null);
            VkFeedActionCellButton$Content$Middle.Label.TruncateMode truncateMode = label.e;
            if (truncateMode == null) {
                truncateMode = VkFeedActionCellButton$Content$Middle.Label.TruncateMode.STATIC;
            }
            int i = a.$EnumSwitchMapping$0[truncateMode.ordinal()];
            if (i == 1) {
                vkText.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                vkText.setMarqueeRepeatLimit(-1);
                vkText.setFadingEdgeLength(iah0.a(14));
                vkText.setSelected(true);
                vkText.setHorizontallyScrolling(true);
                vkText.setHorizontalFadingEdgeEnabled(true);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                vkText.setEllipsize(TextUtils.TruncateAt.END);
                vkText.setMarqueeRepeatLimit(0);
                vkText.setFadingEdgeLength(iah0.a(0));
                vkText.setSelected(false);
                vkText.setHorizontallyScrolling(false);
                vkText.setHorizontalFadingEdgeEnabled(false);
            }
            dko dkoVar = label.c;
            Drawable a3 = dkoVar != null ? dkoVar.a(getContext()) : null;
            boolean z = a3 != null;
            VkImageSimple vkImageSimple = this.A;
            awt0.v(vkImageSimple, z);
            if (a3 != null) {
                vkImageSimple.setImageDrawable(a3);
                cut0 cut0Var2 = label.d;
                bwt0.o0(vkImageSimple, cut0Var2 != null ? cut0Var2.b(getContext()) : krv0.m(R.attr.vk_ui_icon_primary, getContext()));
            }
            P4();
            Q4();
        }
    }

    public final void setRight(b bVar) {
        if (epx.f(this.v, bVar)) {
            return;
        }
        this.v = bVar;
        boolean z = bVar instanceof b.a;
        VkImageSimple vkImageSimple = this.C;
        VkButton vkButton = this.B;
        if (z) {
            f4m.j(vkImageSimple);
            vkButton.setVisibility(0);
            b.a aVar = (b.a) bVar;
            vkButton.setText(tlo0.b.a(aVar.a, getContext()));
            VkButton.Mode mode = aVar.b;
            if (mode == null) {
                mode = VkButton.Mode.Primary;
            }
            vkButton.setMode(mode);
            vkButton.setAppearance(VkButton.Appearance.Overlay);
            vkButton.setContentDescription(null);
        } else if (bVar instanceof b.C1039b) {
            f4m.j(vkButton);
            vkImageSimple.setVisibility(0);
            b.C1039b c1039b = (b.C1039b) bVar;
            vkImageSimple.setImageDrawable(c1039b.a.a(getContext()));
            cut0 cut0Var = c1039b.b;
            bwt0.o0(vkImageSimple, cut0Var != null ? cut0Var.b(getContext()) : krv0.m(R.attr.vk_ui_icon_secondary, getContext()));
            tlo0 tlo0Var = c1039b.c;
            vkImageSimple.setContentDescription(tlo0Var != null ? tlo0Var.a(getContext()) : null);
        } else {
            f4m.j(vkButton);
            f4m.j(vkImageSimple);
        }
        s3q0 s3q0Var = s3q0.a;
        P4();
        Q4();
    }

    public final void setWithDivider(boolean z) {
        if (this.w != z) {
            this.w = z;
            awt0.v(this.E, z);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void setWithShine(boolean z) {
        if (this.x == z) {
            return;
        }
        this.x = z;
        xdj0 shineAnimator = getShineAnimator();
        View view = shineAnimator.a;
        ?? r2 = shineAnimator.d;
        if (shineAnimator.b) {
            shineAnimator.b = false;
            ((TranslateAnimation) r2.getValue()).setStartOffset(0L);
            ((TranslateAnimation) r2.getValue()).setAnimationListener(null);
            f4m.j(view);
            view.clearAnimation();
        }
        if (z) {
            xdj0 shineAnimator2 = getShineAnimator();
            View view2 = shineAnimator2.a;
            ?? r1 = shineAnimator2.d;
            if (shineAnimator2.b) {
                return;
            }
            shineAnimator2.b = true;
            ((TranslateAnimation) r1.getValue()).setStartOffset(0L);
            ((TranslateAnimation) r1.getValue()).setAnimationListener(shineAnimator2.c);
            view2.setVisibility(0);
            view2.startAnimation((TranslateAnimation) r1.getValue());
        }
    }
}
