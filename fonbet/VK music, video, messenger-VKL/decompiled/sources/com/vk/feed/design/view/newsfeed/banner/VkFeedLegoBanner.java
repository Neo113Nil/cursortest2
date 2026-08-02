package com.vk.feed.design.view.newsfeed.banner;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.picture.VkImage;
import com.vk.feed.design.view.newsfeed.banner.after.VkFeedLegoBannerAfterView;
import com.vk.feed.design.view.newsfeed.banner.before.VkFeedLegoBannerBeforeView;
import com.vk.feed.design.view.newsfeed.banner.middle.VkFeedLegoBannerMiddleView;
import com.vkontakte.android.R;
import xsna.an10;
import xsna.asp;
import xsna.avj;
import xsna.cut0;
import xsna.f4m;
import xsna.gzs;
import xsna.hbh0;
import xsna.rlw;
import xsna.ro;
import xsna.s3q0;
import xsna.too0;
import xsna.v6d;
import xsna.x7g;
import xsna.zrp;

/* compiled from: VkFeedLegoBanner.kt */
/* loaded from: classes18.dex */
public final class VkFeedLegoBanner extends ConstraintLayout implements too0 {
    public static final /* synthetic */ int F = 0;
    public VkImage A;
    public final VkFeedLegoBannerBeforeView B;
    public final VkFeedLegoBannerMiddleView C;
    public final VkFeedLegoBannerAfterView D;
    public final View E;
    public BackgroundMode t;
    public rlw u;
    public cut0 v;
    public b w;
    public a x;
    public gzs<s3q0> y;
    public final GradientDrawable z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkFeedLegoBanner.kt */
    public static final class BackgroundMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BackgroundMode[] $VALUES;
        public static final BackgroundMode Dark;
        public static final BackgroundMode Light;

        static {
            BackgroundMode backgroundMode = new BackgroundMode("Light", 0);
            Light = backgroundMode;
            BackgroundMode backgroundMode2 = new BackgroundMode("Dark", 1);
            Dark = backgroundMode2;
            BackgroundMode[] backgroundModeArr = {backgroundMode, backgroundMode2};
            $VALUES = backgroundModeArr;
            $ENTRIES = new asp(backgroundModeArr);
        }

        public BackgroundMode() {
            throw null;
        }

        public static BackgroundMode valueOf(String str) {
            return (BackgroundMode) Enum.valueOf(BackgroundMode.class, str);
        }

        public static BackgroundMode[] values() {
            return (BackgroundMode[]) $VALUES.clone();
        }
    }

    /* compiled from: VkFeedLegoBanner.kt */
    public interface a {

        /* compiled from: VkFeedLegoBanner.kt */
        /* renamed from: com.vk.feed.design.view.newsfeed.banner.VkFeedLegoBanner$a$a, reason: collision with other inner class name */
        public static final class C1040a implements a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1040a)) {
                    return false;
                }
                ((C1040a) obj).getClass();
                return true;
            }

            public final int hashCode() {
                return 0;
            }

            public final String toString() {
                return "Dismiss(onClick=null, contentDescription=null, icon=null, iconTint=null)";
            }
        }
    }

    /* compiled from: VkFeedLegoBanner.kt */
    public interface b {

        /* compiled from: VkFeedLegoBanner.kt */
        public static final class a implements b {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                ((a) obj).getClass();
                return true;
            }

            public final int hashCode() {
                Integer.hashCode(0);
                throw null;
            }

            public final String toString() {
                return "Image(contentSize=0, image=null, scaleType=null)";
            }
        }

        /* compiled from: VkFeedLegoBanner.kt */
        /* renamed from: com.vk.feed.design.view.newsfeed.banner.VkFeedLegoBanner$b$b, reason: collision with other inner class name */
        public static final class C1041b implements b {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1041b)) {
                    return false;
                }
                ((C1041b) obj).getClass();
                return true;
            }

            public final int hashCode() {
                Integer.hashCode(0);
                throw null;
            }

            public final String toString() {
                return "Picture(contentSize=0, image=null, radius=null)";
            }
        }
    }

    /* compiled from: VkFeedLegoBanner.kt */
    public static final class c {
    }

    /* compiled from: VkFeedLegoBanner.kt */
    public static final class d {

        /* compiled from: VkFeedLegoBanner.kt */
        public interface a {

            /* compiled from: VkFeedLegoBanner.kt */
            /* renamed from: com.vk.feed.design.view.newsfeed.banner.VkFeedLegoBanner$d$a$a, reason: collision with other inner class name */
            public static final class C1042a implements a {
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1042a)) {
                        return false;
                    }
                    throw null;
                }

                public final int hashCode() {
                    throw null;
                }

                public final String toString() {
                    throw null;
                }
            }
        }
    }

    public VkFeedLegoBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.t = BackgroundMode.Light;
        this.z = new GradientDrawable();
        LayoutInflater.from(context).inflate(R.layout.feed_lego_banner, (ViewGroup) this, true);
        this.B = (VkFeedLegoBannerBeforeView) findViewById(R.id.feed_lego_banner_before);
        this.C = (VkFeedLegoBannerMiddleView) findViewById(R.id.feed_lego_banner_middle);
        this.D = (VkFeedLegoBannerAfterView) findViewById(R.id.feed_lego_banner_after);
        View findViewById = findViewById(R.id.feed_lego_banner_background);
        this.E = findViewById;
        setOutlineProvider(new avj(hbh0.b(20, context)));
        setClipToOutline(true);
        findViewById.setImportantForAccessibility(2);
        P4();
    }

    @Override // xsna.too0
    public final void Ng() {
        VkImage vkImage = this.A;
        if (vkImage != null) {
            vkImage.invalidate();
        }
        this.B.Ng();
        this.C.Ng();
    }

    public final void P4() {
        float b2 = hbh0.b(20, getContext());
        int b3 = an10.b(hbh0.a(getContext(), 0.5f));
        GradientDrawable gradientDrawable = this.z;
        gradientDrawable.setCornerRadius(b2);
        cut0 cut0Var = this.v;
        if (cut0Var == null) {
            cut0Var = new x7g(R.attr.vk_ui_background_secondary);
        }
        gradientDrawable.setColor(cut0Var.b(getContext()));
        gradientDrawable.setStroke(b3, cut0.a.a(new x7g(R.attr.vk_ui_field_border_alpha), getContext()));
        this.E.setBackground(gradientDrawable);
        setOutlineProvider(new avj(b2));
        VkImage vkImage = this.A;
        if (vkImage != null) {
            vkImage.setOutlineProvider(new avj(b2));
        }
        Q4();
    }

    public final void Q4() {
        RippleDrawable rippleDrawable = null;
        if (this.y != null) {
            float b2 = hbh0.b(20, getContext());
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(b2);
            gradientDrawable.setColor(-1);
            cut0 cut0Var = this.v;
            if (cut0Var == null) {
                cut0Var = new x7g(R.attr.vk_ui_background_secondary);
            }
            rippleDrawable = new RippleDrawable(ro.c(cut0Var.b(getContext()), null), null, gradientDrawable);
        }
        setForeground(rippleDrawable);
    }

    public final a getAfter() {
        return this.x;
    }

    public final cut0 getBackgroundColor() {
        return this.v;
    }

    public final rlw getBackgroundImage() {
        return this.u;
    }

    public final BackgroundMode getBackgroundMode() {
        return this.t;
    }

    public final b getBefore() {
        return this.w;
    }

    public final d getMiddle() {
        return null;
    }

    public final gzs<s3q0> getOnClick() {
        return this.y;
    }

    public final void setAfter(a aVar) {
        this.x = aVar;
        VkFeedLegoBannerAfterView vkFeedLegoBannerAfterView = this.D;
        if (aVar == null) {
            f4m.j(vkFeedLegoBannerAfterView);
        } else {
            vkFeedLegoBannerAfterView.a(aVar);
            vkFeedLegoBannerAfterView.setVisibility(0);
        }
    }

    public final void setBackgroundColor(cut0 cut0Var) {
        this.v = cut0Var;
        P4();
    }

    public final void setBackgroundImage(rlw rlwVar) {
        this.u = rlwVar;
        if (rlwVar == null) {
            VkImage vkImage = this.A;
            if (vkImage != null) {
                vkImage.o0(null, null);
            }
            VkImage vkImage2 = this.A;
            if (vkImage2 != null) {
                f4m.j(vkImage2);
                return;
            }
            return;
        }
        VkImage vkImage3 = this.A;
        if (vkImage3 == null) {
            vkImage3 = new VkImage(getContext(), null, 6, 0);
            vkImage3.setClipToOutline(true);
            vkImage3.setScaleType(ImageView.ScaleType.FIT_CENTER);
            f4m.j(vkImage3);
            vkImage3.setOutlineProvider(new avj(hbh0.b(20, vkImage3.getContext())));
            this.A = vkImage3;
            ConstraintLayout.b bVar = new ConstraintLayout.b(0, 0);
            bVar.t = 0;
            bVar.i = 0;
            bVar.v = 0;
            bVar.l = 0;
            s3q0 s3q0Var = s3q0.a;
            addView(vkImage3, 1, bVar);
        }
        vkImage3.p0(rlwVar);
        vkImage3.setVisibility(0);
    }

    public final void setBackgroundMode(BackgroundMode backgroundMode) {
        this.t = backgroundMode;
        VkFeedLegoBannerMiddleView vkFeedLegoBannerMiddleView = this.C;
        vkFeedLegoBannerMiddleView.b = backgroundMode;
        vkFeedLegoBannerMiddleView.a();
    }

    public final void setBefore(b bVar) {
        this.w = bVar;
        VkFeedLegoBannerBeforeView vkFeedLegoBannerBeforeView = this.B;
        if (bVar == null) {
            f4m.j(vkFeedLegoBannerBeforeView);
        } else {
            vkFeedLegoBannerBeforeView.a(bVar);
            vkFeedLegoBannerBeforeView.setVisibility(0);
        }
    }

    public final void setMiddle(d dVar) {
        f4m.j(this.C);
    }

    public final void setOnClick(gzs<s3q0> gzsVar) {
        this.y = gzsVar;
        setClickable(gzsVar != null);
        setFocusable(gzsVar != null);
        Q4();
        setOnClickListener(gzsVar != null ? new v6d(gzsVar, 7) : null);
    }
}
