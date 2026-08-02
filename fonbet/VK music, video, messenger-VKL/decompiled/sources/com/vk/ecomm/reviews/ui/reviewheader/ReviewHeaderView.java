package com.vk.ecomm.reviews.ui.reviewheader;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tips.Tooltip;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.core.view.components.rating.VkStaticRatingBar;
import com.vk.ecomm.reviews.model.communities.ReviewSourceType;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.bhg0;
import xsna.bwt0;
import xsna.e3m;
import xsna.eig0;
import xsna.ey2;
import xsna.fhb0;
import xsna.gzs;
import xsna.iah0;
import xsna.lfa;
import xsna.m33;
import xsna.m8v0;
import xsna.q130;
import xsna.s3q0;
import xsna.tlo0;
import xsna.uh40;
import xsna.vhg0;
import xsna.whg0;
import xsna.wq20;
import xsna.yka0;
import xsna.zb60;

/* compiled from: ReviewHeaderView.kt */
/* loaded from: classes18.dex */
public final class ReviewHeaderView extends FrameLayout {
    public static final /* synthetic */ int k = 0;
    public final TextView b;
    public final TextView c;
    public final VkStaticRatingBar d;
    public final TextView e;
    public final ImageView f;
    public final ImageView g;
    public final ImageView h;
    public com.vk.core.tips.b i;
    public eig0<bhg0> j;

    /* compiled from: ReviewHeaderView.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<RectF> {
        @Override // xsna.gzs
        public final RectF invoke() {
            return bwt0.G((View) this.receiver);
        }
    }

    public ReviewHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, R.layout.review_header_view, this);
        this.f = (ImageView) findViewById(R.id.review_action_button);
        this.b = (TextView) findViewById(R.id.user_name_tv);
        this.c = (TextView) findViewById(R.id.is_friend_mark_tv);
        this.d = (VkStaticRatingBar) findViewById(R.id.rating_bar);
        this.e = (TextView) findViewById(R.id.rating_description_tv);
        this.g = (ImageView) findViewById(R.id.yclients_badge);
        this.h = (ImageView) findViewById(R.id.pin_iv);
        ImageView imageView = this.f;
        bwt0.i0(imageView == null ? null : imageView, new yka0(this, 8));
        TextView textView = this.b;
        bwt0.i0(textView == null ? null : textView, new q130(this, 23));
        ImageView imageView2 = this.g;
        bwt0.i0(imageView2 != null ? imageView2 : null, new zb60(this, 17));
    }

    public static s3q0 a(ReviewHeaderView reviewHeaderView, vhg0 vhg0Var) {
        reviewHeaderView.setupPinBadge(vhg0Var);
        return s3q0.a;
    }

    private final void setupPinBadge(vhg0 vhg0Var) {
        if (vhg0Var.g) {
            ImageView imageView = this.h;
            if (imageView == null) {
                imageView = null;
            }
            bwt0.p0(imageView, true);
            ImageView imageView2 = this.h;
            if (imageView2 == null) {
                imageView2 = null;
            }
            imageView2.setImageDrawable(m33.a(R.drawable.vk_icon_pin_outline_16, getContext()));
            ImageView imageView3 = this.h;
            m8v0.a.a(imageView3 == null ? null : imageView3, getContext().getString(R.string.pin_review_tooltip_text_for_review_item), null, VkTooltip$MarkerStyle.Style1, VkTooltip$MarkerSize.Size48, null, VkTooltip$BalloonPosition.BottomLeft, VkTooltip$BalloonTilt.Right, new wq20(this, 24), new whg0(this, 0), null, null, null, new uh40(this, 21), null, 0, true, null, null, false, null, false, 16702500);
        }
    }

    public final void b() {
        com.vk.core.tips.b k2;
        Context context = getContext();
        String string = getContext().getString(R.string.review_from_yclients);
        int f = e3m.f(R.attr.vk_ui_background_modal_inverse, getContext());
        ImageView imageView = this.g;
        if (imageView == null) {
            imageView = null;
        }
        Tooltip tooltip = new Tooltip(context, null, string, null, null, null, null, f, e3m.f(R.attr.vk_ui_text_contrast_themed, getContext()), null, 1.0f, 48, 0, false, null, 0, false, null, null, null, null, null, null, new fhb0(this, 5), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, -iah0.a(8), new WeakReference(imageView), null, null, null, 1065349752, 15);
        Context context2 = getContext();
        ImageView imageView2 = this.g;
        k2 = tooltip.k(context2, (r15 & 2) != 0, true, (r15 & 8) != 0, true, false, new b(0, imageView2 == null ? null : imageView2, bwt0.class, "getVisibleRectF", "getVisibleRectF(Landroid/view/View;)Landroid/graphics/RectF;", 1), r3);
        this.i = k2;
        ImageView imageView3 = this.g;
        if (imageView3 == null) {
            imageView3 = null;
        }
        imageView3.addOnAttachStateChangeListener(new a(imageView3, this));
    }

    public final void setData(vhg0 vhg0Var) {
        boolean z = vhg0Var.f;
        Float f = vhg0Var.b;
        tlo0 tlo0Var = vhg0Var.c;
        TextView textView = this.e;
        if (textView == null) {
            textView = null;
        }
        bwt0.p0(textView, tlo0Var != null);
        ImageView imageView = this.f;
        if (imageView == null) {
            imageView = null;
        }
        bwt0.p0(imageView, false);
        ImageView imageView2 = this.g;
        if (imageView2 == null) {
            imageView2 = null;
        }
        bwt0.p0(imageView2, vhg0Var.e == ReviewSourceType.YClients);
        TextView textView2 = this.b;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setText(vhg0Var.a);
        TextView textView3 = this.c;
        if (textView3 == null) {
            textView3 = null;
        }
        bwt0.p0(textView3, vhg0Var.d);
        TextView textView4 = this.e;
        if (textView4 == null) {
            textView4 = null;
        }
        ey2.h(textView4, tlo0Var);
        if (f != null) {
            float floatValue = f.floatValue();
            VkStaticRatingBar vkStaticRatingBar = this.d;
            if (vkStaticRatingBar == null) {
                vkStaticRatingBar = null;
            }
            vkStaticRatingBar.setRating(floatValue);
        }
        TextView textView5 = this.e;
        if (textView5 == null) {
            textView5 = null;
        }
        textView5.setContentDescription(getResources().getString(R.string.market_item_review_description_access));
        VkStaticRatingBar vkStaticRatingBar2 = this.d;
        if (vkStaticRatingBar2 == null) {
            vkStaticRatingBar2 = null;
        }
        vkStaticRatingBar2.setContentDescription(getResources().getString(R.string.reviews_rating_accessibility) + " " + getResources().getString(R.string.rating_view_state_content_accessibility, f, 5));
        ImageView imageView3 = this.h;
        if (imageView3 == null) {
            imageView3 = null;
        }
        bwt0.p0(imageView3, z);
        if (z) {
            ImageView imageView4 = this.h;
            (imageView4 != null ? imageView4 : null).setImageDrawable(m33.a(R.drawable.vk_icon_pin_16, getContext()));
        }
        bwt0.j(this, new lfa(17, this, vhg0Var));
    }

    /* compiled from: ViewExt.kt */
    public static final class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ ReviewHeaderView c;

        public a(ImageView imageView, ReviewHeaderView reviewHeaderView) {
            this.b = imageView;
            this.c = reviewHeaderView;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            this.b.removeOnAttachStateChangeListener(this);
            ReviewHeaderView reviewHeaderView = this.c;
            com.vk.core.tips.b bVar = reviewHeaderView.i;
            if (bVar != null) {
                bVar.b(false);
            }
            reviewHeaderView.i = null;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
