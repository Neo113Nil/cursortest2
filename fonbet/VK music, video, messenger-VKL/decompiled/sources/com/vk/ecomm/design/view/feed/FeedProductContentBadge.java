package com.vk.ecomm.design.view.feed;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.core.tool.view.vkblur.VkBlurView;
import com.vk.core.view.components.text.VkFadeText;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.avj;
import xsna.bi0;
import xsna.dko;
import xsna.eko;
import xsna.epx;
import xsna.f4m;
import xsna.gko;
import xsna.hbh0;
import xsna.iwt0;
import xsna.krv0;
import xsna.thl0;
import xsna.vev0;

/* compiled from: FeedProductContentBadge.kt */
/* loaded from: classes18.dex */
public final class FeedProductContentBadge extends FrameLayout {
    public static final /* synthetic */ int q = 0;
    public c b;
    public d c;
    public a d;
    public b e;
    public final VkBlurView f;
    public final FrameLayout g;
    public final View h;
    public final ImageView i;
    public final View j;
    public final View k;
    public final VkFadeText l;
    public final View m;
    public final View n;
    public final TextView o;
    public final int p;

    /* compiled from: FeedProductContentBadge.kt */
    public interface a {

        /* compiled from: FeedProductContentBadge.kt */
        /* renamed from: com.vk.ecomm.design.view.feed.FeedProductContentBadge$a$a, reason: collision with other inner class name */
        public static final class C0937a implements a {
            public final CharSequence a;

            public C0937a(CharSequence charSequence) {
                this.a = charSequence;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0937a) && this.a.equals(((C0937a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode() * 31;
            }

            public final String toString() {
                return "Subtitle(subtitle=" + ((Object) this.a) + ", subtitleColor=null)";
            }
        }
    }

    /* compiled from: FeedProductContentBadge.kt */
    public interface b {

        /* compiled from: FeedProductContentBadge.kt */
        public static final class a implements b {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 789353261;
            }

            public final String toString() {
                return "OverlaySecondary";
            }
        }
    }

    /* compiled from: FeedProductContentBadge.kt */
    public interface c {

        /* compiled from: FeedProductContentBadge.kt */
        public static final class a implements c {
            public final dko a;

            public a(dko dkoVar) {
                this.a = dkoVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.a.equals(((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode() * 31;
            }

            public final String toString() {
                return "Icon(icon=" + this.a + ", iconTint=null)";
            }
        }
    }

    /* compiled from: FeedProductContentBadge.kt */
    public interface d {

        /* compiled from: FeedProductContentBadge.kt */
        public static final class a implements d {
            public final CharSequence a;

            public a(CharSequence charSequence) {
                this.a = charSequence;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return thl0.a(new StringBuilder("Text(text="), this.a, ')');
            }
        }
    }

    public FeedProductContentBadge(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.c = new d.a("");
        this.e = b.a.a;
        this.p = (int) vev0.d;
        LayoutInflater.from(context).inflate(R.layout.feed_product_content_badge, (ViewGroup) this, true);
        this.f = (VkBlurView) findViewById(R.id.badge_blur_background);
        this.g = (FrameLayout) findViewById(R.id.badge_blur_stroke);
        this.h = findViewById(R.id.content);
        this.i = (ImageView) findViewById(R.id.before_icon);
        this.j = findViewById(R.id.gap_before_middle);
        this.k = findViewById(R.id.gap_middle_after);
        this.l = (VkFadeText) findViewById(R.id.title);
        this.m = findViewById(R.id.after_divider);
        this.n = findViewById(R.id.gap_divider_subtitle);
        this.o = (TextView) findViewById(R.id.subtitle);
    }

    public final void a() {
        int i = 0;
        boolean z = this.i.getVisibility() == 0;
        boolean z2 = this.l.getVisibility() == 0;
        boolean z3 = this.o.getVisibility() == 0;
        boolean z4 = z && z2;
        View view = this.j;
        f4m.E(view, z4);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int i2 = this.p;
        layoutParams.width = (z && z2) ? i2 : 0;
        view.setLayoutParams(layoutParams);
        boolean z5 = z2 && z3;
        View view2 = this.k;
        f4m.E(view2, z5);
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        if (z2 && z3) {
            i = i2;
        }
        layoutParams2.width = i;
        view2.setLayoutParams(layoutParams2);
    }

    public final a getAfter() {
        return this.d;
    }

    public final b getAppearance() {
        return this.e;
    }

    public final c getBefore() {
        return this.b;
    }

    public final d getMiddle() {
        return this.c;
    }

    public final void setAfter(a aVar) {
        this.d = aVar;
        View view = this.m;
        f4m.j(view);
        TextView textView = this.o;
        f4m.j(textView);
        a aVar2 = this.d;
        if (aVar2 == null) {
            return;
        }
        if (!(aVar2 instanceof a.C0937a)) {
            throw new NoWhenBranchMatchedException();
        }
        view.setVisibility(0);
        textView.setVisibility(0);
        textView.setText(((a.C0937a) aVar2).a);
        a();
    }

    public final void setAfterSubtitle(CharSequence charSequence) {
        setAfter(new a.C0937a(charSequence));
    }

    public final void setAppearance(b bVar) {
        this.e = bVar;
    }

    public final void setBefore(c cVar) {
        this.b = cVar;
        ImageView imageView = this.i;
        f4m.j(imageView);
        c cVar2 = this.b;
        if (cVar2 != null) {
            if (!(cVar2 instanceof c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            imageView.setVisibility(0);
            imageView.setImageDrawable(((c.a) cVar2).a.a(getContext()));
        }
        a();
    }

    public final void setBeforeIcon(int i) {
        setBefore(new c.a(new gko(i)));
    }

    public final void setMiddle(d dVar) {
        this.c = dVar;
        VkFadeText vkFadeText = this.l;
        f4m.j(vkFadeText);
        d dVar2 = this.c;
        if (!(dVar2 instanceof d.a)) {
            throw new NoWhenBranchMatchedException();
        }
        vkFadeText.setVisibility(0);
        vkFadeText.setMaxTextLines(1);
        vkFadeText.setText(((d.a) dVar2).a);
        a();
    }

    public final void setMiddleText(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        setMiddle(new d.a(charSequence));
    }

    public final void setupBlur(VkBlurContentView vkBlurContentView) {
        if (!(this.e instanceof b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        int l = krv0.l(R.attr.vk_ui_overlay_secondary);
        int l2 = krv0.l(R.attr.vk_ui_stroke_contrast_secondary_alpha);
        VkBlurView vkBlurView = this.f;
        vkBlurView.setBlurRadius(20.0f);
        vkBlurView.setupWithContent(vkBlurContentView);
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(l);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
        float f = vev0.a;
        vkBlurView.setOutlineProvider(new avj(f));
        iwt0.a(vkBlurView, new bi0(17, vkBlurView, bitmapShader));
        vkBlurView.setVisibility(0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        FrameLayout frameLayout = this.g;
        gradientDrawable.setStroke(hbh0.b(1, frameLayout.getContext()), l2);
        frameLayout.setBackground(gradientDrawable);
        frameLayout.setOutlineProvider(new avj(f));
        frameLayout.setVisibility(0);
    }

    public final void setMiddleText(int i) {
        setMiddle(new d.a(getContext().getString(i)));
    }

    public final void setBeforeIcon(Drawable drawable) {
        setBefore(new c.a(new eko(drawable)));
    }
}
