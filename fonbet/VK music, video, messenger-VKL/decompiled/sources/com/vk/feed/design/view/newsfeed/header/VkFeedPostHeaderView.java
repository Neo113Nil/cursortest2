package com.vk.feed.design.view.newsfeed.header;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.text.links.VkLinkedText;
import com.vk.feed.core.models.Description;
import com.vk.feed.core.models.Text;
import com.vk.feed.design.view.newsfeed.header.VkFeedPostHeaderView;
import com.vk.feed.design.view.newsfeed.header.avatar.VkFeedHeaderAvatarView;
import com.vk.feed.design.view.newsfeed.header.avatar.VkFeedHeaderAvatarViewV2;
import com.vk.feed.design.view.newsfeed.header.description.VkFeedNewsfeedHeaderDescriptionLayout;
import com.vk.feed.design.view.newsfeed.header.subtitle.VkFeedPostHeaderSubtitleTextView;
import com.vk.feed.design.view.newsfeed.header.type.VkFeedHeaderDisplayModeType;
import com.vk.feed.design.view.newsfeed.header.type.VkFeedHeaderIconSizeType;
import com.vk.feed.tool.view.newsfeed.music.RunningLineTextView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.anj;
import xsna.bvu0;
import xsna.bwt0;
import xsna.cn70;
import xsna.cvu0;
import xsna.e3m;
import xsna.eni0;
import xsna.ep30;
import xsna.epx;
import xsna.f4m;
import xsna.far0;
import xsna.fvu0;
import xsna.his0;
import xsna.jjc;
import xsna.ndu0;
import xsna.odu0;
import xsna.p7q0;
import xsna.s3q0;
import xsna.tml0;
import xsna.vep;
import xsna.vtu0;
import xsna.w9r0;
import xsna.zjt;

/* compiled from: VkFeedPostHeaderView.kt */
/* loaded from: classes18.dex */
public final class VkFeedPostHeaderView extends ConstraintLayout {
    public static final /* synthetic */ int S = 0;
    public final VkText A;
    public final ViewGroup B;
    public final VkFeedNewsfeedHeaderDescriptionLayout C;
    public final ViewGroup D;
    public final ViewGroup E;
    public final VkImageSimple F;
    public final VkImageSimple G;
    public final SpannableStringBuilder H;
    public final Rect I;
    public final Rect J;
    public p7q0 K;
    public VkFeedHeaderDisplayModeType L;
    public cvu0 M;
    public bvu0 N;
    public VkFeedPostHeaderSubtitleTextView.a O;
    public final c P;
    public final GradientDrawable Q;
    public boolean R;
    public final VkFeedHeaderAvatarView t;
    public final VkFeedHeaderAvatarViewV2 u;
    public final VkText v;
    public final VkImage w;
    public final VkImageSimple x;
    public final View y;
    public final VkLinkedText z;

    /* compiled from: VkFeedPostHeaderView.kt */
    public final class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cvu0 cvu0Var;
            VkFeedPostHeaderView vkFeedPostHeaderView = VkFeedPostHeaderView.this;
            VkImageSimple vkImageSimple = vkFeedPostHeaderView.G;
            if (epx.f(view, vkFeedPostHeaderView.t) || epx.f(view, vkFeedPostHeaderView.u)) {
                zjt zjtVar = vkFeedPostHeaderView.t;
                if (zjtVar == null) {
                    zjtVar = vkFeedPostHeaderView.u;
                }
                if (zjtVar == null || (cvu0Var = vkFeedPostHeaderView.M) == null) {
                    return;
                }
                cvu0Var.a(zjtVar);
                return;
            }
            if (jjc.b() || view == null) {
                return;
            }
            if (view.equals(vkFeedPostHeaderView)) {
                cvu0 cvu0Var2 = vkFeedPostHeaderView.M;
                if (cvu0Var2 != null) {
                    cvu0Var2.f();
                    return;
                }
                return;
            }
            if (view.equals(vkImageSimple)) {
                cvu0 cvu0Var3 = vkFeedPostHeaderView.M;
                if (cvu0Var3 != null) {
                    cvu0Var3.e(vkImageSimple);
                    return;
                }
                return;
            }
            if (view.equals(vkFeedPostHeaderView.w)) {
                cvu0 cvu0Var4 = vkFeedPostHeaderView.M;
                if (cvu0Var4 != null) {
                    cvu0Var4.g();
                    return;
                }
                return;
            }
            if (view.equals(vkFeedPostHeaderView.x)) {
                cvu0 cvu0Var5 = vkFeedPostHeaderView.M;
                if (cvu0Var5 != null) {
                    cvu0Var5.d();
                    return;
                }
                return;
            }
            if (view.equals(vkFeedPostHeaderView.F)) {
                cvu0 cvu0Var6 = vkFeedPostHeaderView.M;
                if (cvu0Var6 != null) {
                    cvu0Var6.b();
                    return;
                }
                return;
            }
            cvu0 cvu0Var7 = vkFeedPostHeaderView.M;
            if (cvu0Var7 != null) {
                cvu0Var7.c();
            }
        }
    }

    /* compiled from: VkFeedPostHeaderView.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkFeedHeaderDisplayModeType.values().length];
            try {
                iArr[VkFeedHeaderDisplayModeType.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkFeedHeaderDisplayModeType.OVERLAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: VkFeedPostHeaderView.kt */
    public final class c implements p7q0.a {
        public c() {
        }

        @Override // xsna.p7q0.a
        public final float a(MotionEvent motionEvent) {
            return motionEvent.getX() - VkFeedPostHeaderView.this.I.left;
        }

        @Override // xsna.p7q0.a
        public final float getY() {
            Rect rect = VkFeedPostHeaderView.this.I;
            return rect.centerY() - rect.top;
        }
    }

    public VkFeedPostHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.H = new SpannableStringBuilder();
        this.I = new Rect();
        this.J = new Rect();
        this.L = VkFeedHeaderDisplayModeType.DEFAULT;
        this.P = new c();
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.Q = gradientDrawable;
        LayoutInflater.from(context).inflate(R.layout.feed_post_header_view_v2, (ViewGroup) this, true);
        VkFeedHeaderAvatarView vkFeedHeaderAvatarView = (VkFeedHeaderAvatarView) findViewById(R.id.post_header_photo);
        this.t = vkFeedHeaderAvatarView;
        if (vkFeedHeaderAvatarView != null) {
            vkFeedHeaderAvatarView.setEmptyImagePlaceholder(R.drawable.user_placeholder);
        }
        VkFeedHeaderAvatarViewV2 vkFeedHeaderAvatarViewV2 = (VkFeedHeaderAvatarViewV2) findViewById(R.id.post_header_photo_v2);
        this.u = vkFeedHeaderAvatarViewV2;
        if (vkFeedHeaderAvatarViewV2 != null) {
            vkFeedHeaderAvatarViewV2.setEmptyImagePlaceholder(R.drawable.user_placeholder_square);
        }
        this.v = (VkText) findViewById(R.id.post_header_title);
        VkImage vkImage = (VkImage) findViewById(R.id.post_header_status);
        this.w = vkImage;
        VkImageSimple vkImageSimple = (VkImageSimple) findViewById(R.id.icon);
        this.x = vkImageSimple;
        this.y = findViewById(R.id.post_header_pin);
        this.A = (VkText) findViewById(R.id.post_header_label);
        this.z = (VkLinkedText) findViewById(R.id.post_info_view);
        this.D = (ViewGroup) findViewById(R.id.container_subscribe_button);
        this.E = (ViewGroup) findViewById(R.id.container_subscribe_avatar_button);
        VkImageSimple vkImageSimple2 = (VkImageSimple) findViewById(R.id.post_header_icon);
        this.F = vkImageSimple2;
        VkImageSimple vkImageSimple3 = (VkImageSimple) findViewById(R.id.post_header_options);
        this.G = vkImageSimple3;
        this.B = (ViewGroup) findViewById(R.id.post_header_title_container);
        this.C = (VkFeedNewsfeedHeaderDescriptionLayout) findViewById(R.id.post_header_subtitle_container);
        a aVar = new a();
        setOnClickListener(aVar);
        vkImageSimple2.setOnClickListener(aVar);
        vkImageSimple3.setOnClickListener(aVar);
        vkImage.setOnClickListener(aVar);
        if (vkFeedHeaderAvatarView != null) {
            vkFeedHeaderAvatarView.setOnClickListener(aVar);
        }
        if (vkFeedHeaderAvatarViewV2 != null) {
            vkFeedHeaderAvatarViewV2.setOnClickListener(aVar);
        }
        vkImageSimple.setOnClickListener(aVar);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        gradientDrawable.setColors(new int[]{0, e3m.f(R.attr.vk_ui_background_content, getContext())});
    }

    private final int getOverlayDescriptionColorId() {
        return R.color.vk_white_alpha60;
    }

    private final int getOverlayTextPrimaryColorId() {
        return R.color.vk_white;
    }

    public final View P4(VkFeedNewsfeedHeaderDescriptionLayout vkFeedNewsfeedHeaderDescriptionLayout, int i, final Description description) {
        ViewGroup viewGroup = this.C;
        int i2 = 1;
        if (description == null || !description.h) {
            View childAt = vkFeedNewsfeedHeaderDescriptionLayout.getChildAt(i);
            VkFeedPostHeaderSubtitleTextView vkFeedPostHeaderSubtitleTextView = childAt instanceof VkFeedPostHeaderSubtitleTextView ? (VkFeedPostHeaderSubtitleTextView) childAt : null;
            if (vkFeedPostHeaderSubtitleTextView == null) {
                vkFeedPostHeaderSubtitleTextView = (VkFeedPostHeaderSubtitleTextView) LayoutInflater.from(vkFeedNewsfeedHeaderDescriptionLayout.getContext()).inflate(R.layout.feed_post_header_subtitle_v2, viewGroup, false);
                viewGroup.addView(vkFeedPostHeaderSubtitleTextView);
            }
            VkFeedHeaderDisplayModeType vkFeedHeaderDisplayModeType = this.L;
            vkFeedPostHeaderSubtitleTextView.setOverlayMode(vkFeedHeaderDisplayModeType == VkFeedHeaderDisplayModeType.OVERLAY);
            int i3 = b.$EnumSwitchMapping$0[vkFeedHeaderDisplayModeType.ordinal()];
            if (i3 == 1) {
                vkFeedPostHeaderSubtitleTextView.setTextColor(e3m.f(R.attr.vk_ui_text_secondary, vkFeedPostHeaderSubtitleTextView.getContext()));
                vkFeedPostHeaderSubtitleTextView.setSubtitleTextColorResId(null);
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                his0.x(vkFeedPostHeaderSubtitleTextView, getOverlayDescriptionColorId());
                vkFeedPostHeaderSubtitleTextView.setSubtitleTextColorResId(Integer.valueOf(getOverlayDescriptionColorId()));
            }
            vkFeedPostHeaderSubtitleTextView.setDescriptionClickListener(this.N);
            vkFeedPostHeaderSubtitleTextView.setClipToEdge(this.R);
            vkFeedPostHeaderSubtitleTextView.setSingleLine(true);
            vkFeedPostHeaderSubtitleTextView.setMaxTextLines(1);
            vkFeedPostHeaderSubtitleTextView.setExternalSourcesProvider(this.O);
            return vkFeedPostHeaderSubtitleTextView;
        }
        int i4 = description.i ? R.drawable.vk_icon_flash_16 : R.drawable.vk_icon_lego_equalizer_16;
        View childAt2 = vkFeedNewsfeedHeaderDescriptionLayout.getChildAt(i);
        if (childAt2 instanceof LinearLayout) {
            LinearLayout linearLayout = (LinearLayout) childAt2;
            View childAt3 = linearLayout.getChildAt(0);
            AppCompatImageView appCompatImageView = childAt3 instanceof AppCompatImageView ? (AppCompatImageView) childAt3 : null;
            if (appCompatImageView != null) {
                appCompatImageView.setImageResource(i4);
            }
            linearLayout.setOnClickListener(new ep30(this, description, (LinearLayout) childAt2, i2));
            return childAt2;
        }
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(vkFeedNewsfeedHeaderDescriptionLayout.getContext());
        appCompatImageView2.setImageResource(i4);
        VkFeedHeaderDisplayModeType vkFeedHeaderDisplayModeType2 = this.L;
        VkFeedHeaderDisplayModeType vkFeedHeaderDisplayModeType3 = VkFeedHeaderDisplayModeType.OVERLAY;
        appCompatImageView2.setImageTintList(vkFeedHeaderDisplayModeType2 == vkFeedHeaderDisplayModeType3 ? ColorStateList.valueOf(appCompatImageView2.getContext().getColor(getOverlayDescriptionColorId())) : e3m.c(R.attr.vk_ui_text_secondary, appCompatImageView2.getContext()));
        RunningLineTextView runningLineTextView = new RunningLineTextView(vkFeedNewsfeedHeaderDescriptionLayout.getContext(), null, 6, 0);
        runningLineTextView.setId(R.id.post_header_subtitle);
        runningLineTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        runningLineTextView.setSingleLine(true);
        runningLineTextView.setEllipsize(null);
        runningLineTextView.setTextAppearance(e3m.g(R.attr.vk_ui_typography_paragraph_semi_bold, runningLineTextView.getContext()));
        runningLineTextView.setTextColor(this.L == vkFeedHeaderDisplayModeType3 ? runningLineTextView.getContext().getColor(getOverlayDescriptionColorId()) : e3m.f(R.attr.vk_ui_text_secondary, runningLineTextView.getContext()));
        final bvu0 bvu0Var = this.N;
        final LinearLayout linearLayout2 = new LinearLayout(vkFeedNewsfeedHeaderDescriptionLayout.getContext());
        linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.addView(appCompatImageView2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(cn70.b(4));
        s3q0 s3q0Var = s3q0.a;
        linearLayout2.addView(runningLineTextView, layoutParams);
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: xsna.gvu0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5 = VkFeedPostHeaderView.S;
                bvu0 bvu0Var2 = bvu0.this;
                if (bvu0Var2 != null) {
                    bvu0Var2.b(description, linearLayout2);
                }
            }
        });
        viewGroup.addView(linearLayout2, i);
        return linearLayout2;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        VkText vkText;
        Layout layout;
        super.dispatchDraw(canvas);
        if (!this.R || (layout = (vkText = this.v).getLayout()) == null || !bwt0.K(vkText) || layout.getLineWidth(0) <= vkText.getMeasuredWidth()) {
            return;
        }
        ViewGroup viewGroup = this.B;
        int right = vkText.getRight() + viewGroup.getLeft();
        int b2 = right - cn70.b(36);
        int top = viewGroup.getTop();
        int bottom = viewGroup.getBottom();
        GradientDrawable gradientDrawable = this.Q;
        gradientDrawable.setBounds(b2, top, right, bottom);
        gradientDrawable.draw(canvas);
    }

    public final ViewGroup getContainerSubscribeAvatarButton() {
        return this.E;
    }

    public final ViewGroup getContainerSubscribeButton() {
        return this.D;
    }

    public final boolean getOptionsIsVisible() {
        return bwt0.K(this.G);
    }

    public final View getSubscriptionAnchor() {
        return this.G;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        VkFeedNewsfeedHeaderDescriptionLayout vkFeedNewsfeedHeaderDescriptionLayout = this.C;
        if (!bwt0.K(vkFeedNewsfeedHeaderDescriptionLayout)) {
            setTouchDelegate(null);
            return;
        }
        Rect rect = this.I;
        vkFeedNewsfeedHeaderDescriptionLayout.getHitRect(rect);
        Rect rect2 = this.J;
        rect2.set(rect);
        rect2.top = 0;
        rect2.bottom = getMeasuredHeight();
        p7q0 p7q0Var = this.K;
        if (p7q0Var == null) {
            p7q0 p7q0Var2 = new p7q0(rect2, vkFeedNewsfeedHeaderDescriptionLayout, this.P);
            this.K = p7q0Var2;
            setTouchDelegate(p7q0Var2);
            return;
        }
        Rect rect3 = p7q0Var.d;
        Rect rect4 = p7q0Var.a;
        if (!epx.f(rect4, rect2)) {
            p7q0Var.g = null;
        }
        rect4.set(rect2);
        rect3.set(rect2);
        int i5 = -p7q0Var.f;
        rect3.inset(i5, i5);
    }

    public final void setAvatarContentDescription(CharSequence charSequence) {
        VkFeedHeaderAvatarView vkFeedHeaderAvatarView = this.t;
        if (vkFeedHeaderAvatarView != null) {
            vkFeedHeaderAvatarView.setContentDescription(charSequence);
        }
        VkFeedHeaderAvatarViewV2 vkFeedHeaderAvatarViewV2 = this.u;
        if (vkFeedHeaderAvatarViewV2 != null) {
            vkFeedHeaderAvatarViewV2.setContentDescription(charSequence);
        }
    }

    public final void setAvatarImportantForAccessibility(int i) {
        VkFeedHeaderAvatarView vkFeedHeaderAvatarView = this.t;
        if (vkFeedHeaderAvatarView != null) {
            vkFeedHeaderAvatarView.setImportantForAccessibility(i);
        }
        VkFeedHeaderAvatarViewV2 vkFeedHeaderAvatarViewV2 = this.u;
        if (vkFeedHeaderAvatarViewV2 != null) {
            vkFeedHeaderAvatarViewV2.setImportantForAccessibility(i);
        }
    }

    public final void setAvatarState(vtu0 vtu0Var) {
        VkFeedHeaderAvatarView vkFeedHeaderAvatarView = this.t;
        if (vkFeedHeaderAvatarView != null) {
            vkFeedHeaderAvatarView.e1(vtu0Var);
        }
        VkFeedHeaderAvatarViewV2 vkFeedHeaderAvatarViewV2 = this.u;
        if (vkFeedHeaderAvatarViewV2 != null) {
            vkFeedHeaderAvatarViewV2.setFixedSize(vtu0Var.e);
            vkFeedHeaderAvatarViewV2.setBorder(vtu0Var.f ? new ndu0() : vtu0Var.c ? new odu0() : vep.a);
            vkFeedHeaderAvatarViewV2.o0(vtu0Var.a, null);
        }
    }

    public final void setBadgeText(String str) {
        this.A.setText(str);
    }

    public final void setBadgeTextColor(int i) {
        this.A.setTextColor(i);
    }

    public final void setContainerSubscribeButtonPaddingEnd(int i) {
        f4m.w(i, this.D);
    }

    public final void setDateText(CharSequence charSequence) {
        VkLinkedText vkLinkedText = this.z;
        boolean z = false;
        vkLinkedText.setVisibility(0);
        if (charSequence != null && charSequence.length() != 0) {
            vkLinkedText.setText(charSequence);
            z = true;
        }
        bwt0.p0(vkLinkedText, z);
    }

    public final void setDescriptionClickListener(bvu0 bvu0Var) {
        this.N = bvu0Var;
    }

    public final void setDisplayMode(VkFeedHeaderDisplayModeType vkFeedHeaderDisplayModeType) {
        if (vkFeedHeaderDisplayModeType == this.L) {
            return;
        }
        this.L = vkFeedHeaderDisplayModeType;
        int i = b.$EnumSwitchMapping$0[vkFeedHeaderDisplayModeType.ordinal()];
        VkLinkedText vkLinkedText = this.z;
        VkText vkText = this.v;
        if (i == 1) {
            vkText.setTextColor(e3m.f(R.attr.vk_ui_text_primary, getContext()));
            vkLinkedText.setTextColor(e3m.f(R.attr.vk_ui_text_secondary, getContext()));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            his0.x(vkText, getOverlayTextPrimaryColorId());
            his0.x(vkLinkedText, getOverlayDescriptionColorId());
        }
    }

    public final void setExternalSourcesProvider(VkFeedPostHeaderSubtitleTextView.a aVar) {
        this.O = aVar;
    }

    public final void setHasLiveBadge(boolean z) {
        VkFeedHeaderAvatarViewV2 vkFeedHeaderAvatarViewV2 = this.u;
        VkFeedHeaderAvatarView vkFeedHeaderAvatarView = this.t;
        if (!z) {
            if (vkFeedHeaderAvatarView != null) {
                far0 far0Var = vkFeedHeaderAvatarView.m;
                far0Var.h.clear();
                far0Var.a.invalidate();
            }
            if (vkFeedHeaderAvatarViewV2 != null) {
                vkFeedHeaderAvatarViewV2.S0();
                return;
            }
            return;
        }
        if (vkFeedHeaderAvatarView != null) {
            com.vk.core.view.components.avatar.badge.b bVar = new com.vk.core.view.components.avatar.badge.b(null, true, null, new eni0(15), 11);
            far0 far0Var2 = vkFeedHeaderAvatarView.m;
            far0Var2.h.add(bVar);
            far0Var2.a.invalidate();
        }
        if (vkFeedHeaderAvatarViewV2 != null) {
            vkFeedHeaderAvatarViewV2.Q0(new com.vk.core.view.components.avatar.badge.b(null, true, null, new tml0(7), 11));
        }
    }

    public final void setHeaderIconContentDescription(String str) {
        this.F.setContentDescription(str);
    }

    public final void setHeaderIconImageTintList(ColorStateList colorStateList) {
        this.F.setImageTintList(colorStateList);
    }

    public final void setHeaderIconResId(int i) {
        this.F.setImageResource(i);
    }

    public final void setHeaderIconVisible(boolean z) {
        bwt0.p0(this.F, z);
    }

    public final void setHeaderListener(cvu0 cvu0Var) {
        this.M = cvu0Var;
    }

    public final void setImageStatusUrl(String str) {
        this.w.o0(str, null);
    }

    public final void setIsAvatarClickable(boolean z) {
        VkFeedHeaderAvatarView vkFeedHeaderAvatarView = this.t;
        if (vkFeedHeaderAvatarView != null) {
            vkFeedHeaderAvatarView.setClickable(z);
        }
        VkFeedHeaderAvatarViewV2 vkFeedHeaderAvatarViewV2 = this.u;
        if (vkFeedHeaderAvatarViewV2 != null) {
            vkFeedHeaderAvatarViewV2.setClickable(z);
        }
    }

    public final void setIsAvatarFocusable(boolean z) {
        VkFeedHeaderAvatarView vkFeedHeaderAvatarView = this.t;
        if (vkFeedHeaderAvatarView != null) {
            vkFeedHeaderAvatarView.setFocusable(z);
        }
        VkFeedHeaderAvatarViewV2 vkFeedHeaderAvatarViewV2 = this.u;
        if (vkFeedHeaderAvatarViewV2 != null) {
            vkFeedHeaderAvatarViewV2.setFocusable(z);
        }
    }

    public final void setIsBadgeVisible(boolean z) {
        bwt0.p0(this.A, z);
    }

    public final void setIsHeaderClickable(boolean z) {
        setClickable(z);
    }

    public final void setIsImageStatusVisible(boolean z) {
        bwt0.p0(this.w, z);
    }

    public final void setIsPinVisible(boolean z) {
        bwt0.p0(this.y, z);
    }

    public final void setIsVerifiedVisible(boolean z) {
        bwt0.p0(this.x, z);
    }

    public final void setOptionsImageResource(int i) {
        this.G.setImageResource(i);
    }

    public final void setOptionsImageTintList(ColorStateList colorStateList) {
        this.G.setImageTintList(colorStateList);
    }

    public final void setOptionsIsVisible(boolean z) {
        bwt0.p0(this.G, z);
    }

    public final void setPhotoCutout(w9r0 w9r0Var) {
        VkFeedHeaderAvatarView vkFeedHeaderAvatarView = this.t;
        if (vkFeedHeaderAvatarView != null) {
            vkFeedHeaderAvatarView.setAvatarCutout(w9r0Var);
        }
        VkFeedHeaderAvatarViewV2 vkFeedHeaderAvatarViewV2 = this.u;
        if (vkFeedHeaderAvatarViewV2 != null) {
            vkFeedHeaderAvatarViewV2.setAvatarCutout(w9r0Var);
        }
    }

    public final void setPinBackgroundResource(int i) {
        this.y.setBackgroundResource(i);
    }

    public final void setPinBackgroundTintList(int i) {
        this.y.setBackgroundTintList(anj.b(i, getContext()));
    }

    public final void setSubtitle(fvu0 fvu0Var) {
        Object obj;
        Object obj2;
        Text text;
        SpannableStringBuilder spannableStringBuilder = this.H;
        spannableStringBuilder.clear();
        ArrayList<Description> arrayList = fvu0Var.b;
        boolean isEmpty = arrayList.isEmpty();
        boolean z = false;
        VkFeedNewsfeedHeaderDescriptionLayout vkFeedNewsfeedHeaderDescriptionLayout = this.C;
        if (isEmpty) {
            bwt0.p0(vkFeedNewsfeedHeaderDescriptionLayout, false);
            return;
        }
        int childCount = vkFeedNewsfeedHeaderDescriptionLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            bwt0.p0(vkFeedNewsfeedHeaderDescriptionLayout.getChildAt(i), false);
        }
        bwt0.p0(vkFeedNewsfeedHeaderDescriptionLayout, true);
        Iterator<T> it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Description) obj).h) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        View P4 = P4(vkFeedNewsfeedHeaderDescriptionLayout, 0, (Description) obj);
        if (P4 instanceof VkFeedPostHeaderSubtitleTextView) {
            ((VkFeedPostHeaderSubtitleTextView) P4).setDescriptions(arrayList);
        } else if (P4 instanceof LinearLayout) {
            Iterator<T> it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj2 = it2.next();
                    if (((Description) obj2).h) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            Description description = (Description) obj2;
            String str = (description == null || (text = description.b) == null) ? null : text.b;
            RunningLineTextView runningLineTextView = (RunningLineTextView) P4.findViewById(R.id.post_header_subtitle);
            if (runningLineTextView != null) {
                runningLineTextView.setText(str);
            }
            if (runningLineTextView != null) {
                runningLineTextView.b();
            }
        }
        bwt0.p0(P4, true);
        Iterator<Description> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Description next = it3.next();
            Text text2 = next.b;
            String str2 = next.f;
            if (z) {
                spannableStringBuilder.append((CharSequence) " ");
            }
            if (str2 == null || str2.length() == 0) {
                String str3 = text2 != null ? text2.b : null;
                if (str3 != null && str3.length() != 0) {
                    spannableStringBuilder.append((CharSequence) (text2 != null ? text2.b : null));
                }
            } else {
                spannableStringBuilder.append((CharSequence) str2);
            }
            z = true;
        }
        vkFeedNewsfeedHeaderDescriptionLayout.setContentDescription(spannableStringBuilder.toString());
    }

    public final void setSubtitleContentDescription(String str) {
        this.C.setContentDescription(str);
    }

    public final void setSubtitleForEachIsVisible(boolean z) {
        VkFeedNewsfeedHeaderDescriptionLayout vkFeedNewsfeedHeaderDescriptionLayout = this.C;
        int childCount = vkFeedNewsfeedHeaderDescriptionLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            bwt0.p0(vkFeedNewsfeedHeaderDescriptionLayout.getChildAt(i), z);
        }
    }

    public final void setSubtitleIsVisible(boolean z) {
        bwt0.p0(this.C, z);
    }

    public final void setTitleText(CharSequence charSequence) {
        this.v.setText(charSequence);
    }

    public final void setVerifiedContentDescription(CharSequence charSequence) {
        this.x.setContentDescription(charSequence);
    }

    public final void setVerifiedDrawableSize(VkFeedHeaderIconSizeType vkFeedHeaderIconSizeType) {
        VkFeedHeaderIconSizeType vkFeedHeaderIconSizeType2 = VkFeedHeaderIconSizeType.DP_12;
        VkImageSimple vkImageSimple = this.x;
        if (vkFeedHeaderIconSizeType == vkFeedHeaderIconSizeType2) {
            f4m.s(cn70.b(8), vkImageSimple);
            vkImageSimple.setPaddingRelative(cn70.b(0), cn70.b(2), cn70.b(4), cn70.b(2));
        } else {
            f4m.s(cn70.b(4), vkImageSimple);
            vkImageSimple.setPadding(0, 0, 0, 0);
        }
    }

    public final void setVerifiedImageDrawable(Drawable drawable) {
        this.x.setImageDrawable(drawable);
    }

    public final void setupTitleAndSubtitleViews(boolean z) {
        TextUtils.TruncateAt truncateAt = z ? null : TextUtils.TruncateAt.END;
        VkText vkText = this.v;
        vkText.setEllipsize(truncateAt);
        vkText.setSingleLine(true);
        this.R = z;
    }
}
