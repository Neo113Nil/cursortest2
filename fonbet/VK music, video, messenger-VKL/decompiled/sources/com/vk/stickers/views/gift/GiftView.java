package com.vk.stickers.views.gift;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.gift.GiftAnimation;
import com.vk.dto.common.gift.GiftBackground;
import com.vk.dto.common.gift.GiftBaseUrlConfig;
import com.vk.dto.common.gift.GiftRarity;
import com.vk.dto.common.gift.GiftTheme;
import com.vk.dto.common.gift.GiftType;
import com.vk.dto.common.id.UserId;
import com.vk.dto.gift.Gift;
import com.vk.imageloader.view.VKImageView;
import com.vk.stickers.R$styleable;
import com.vk.stickers.views.RLottieImageView;
import com.vk.stickers.views.particles.ParticleView;
import com.vkontakte.android.R;
import java.util.Iterator;
import xsna.amt;
import xsna.asp;
import xsna.awt0;
import xsna.bpn0;
import xsna.c7r0;
import xsna.dhr0;
import xsna.drm0;
import xsna.e3m;
import xsna.f4m;
import xsna.gzs;
import xsna.haq;
import xsna.hg1;
import xsna.iah0;
import xsna.iaq;
import xsna.khp0;
import xsna.kzt;
import xsna.lav;
import xsna.ll90;
import xsna.lxz;
import xsna.lzt;
import xsna.ml90;
import xsna.nwk;
import xsna.o7z;
import xsna.p3h;
import xsna.s3q0;
import xsna.sux;
import xsna.tye0;
import xsna.zrp;

/* compiled from: GiftView.kt */
/* loaded from: classes6.dex */
public final class GiftView extends khp0 {
    public static final int A = (int) iah0.b(31.5f);
    public static final int B = iah0.a(14);
    public final CardView l;
    public final VKImageView m;
    public final ParticleView n;
    public final RLottieImageView o;
    public final ImageView p;
    public final VKImageView q;
    public final FrameLayout r;
    public final ImageView s;
    public final AnimatedGiftView t;
    public Gift u;
    public UserId v;
    public int w;
    public int x;
    public gzs<s3q0> y;
    public AnimationType z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GiftView.kt */
    public static final class AnimationType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AnimationType[] $VALUES;
        public static final AnimationType ALL;
        public static final a Companion;
        public static final AnimationType NONE;
        public static final AnimationType PRIMARY;
        public static final AnimationType SECONDARY;
        private final int value;

        /* compiled from: GiftView.kt */
        public static final class a {
        }

        static {
            AnimationType animationType = new AnimationType("NONE", 0, 0);
            NONE = animationType;
            AnimationType animationType2 = new AnimationType("PRIMARY", 1, 1);
            PRIMARY = animationType2;
            AnimationType animationType3 = new AnimationType("SECONDARY", 2, 2);
            SECONDARY = animationType3;
            AnimationType animationType4 = new AnimationType("ALL", 3, 3);
            ALL = animationType4;
            AnimationType[] animationTypeArr = {animationType, animationType2, animationType3, animationType4};
            $VALUES = animationTypeArr;
            $ENTRIES = new asp(animationTypeArr);
            Companion = new a();
        }

        public AnimationType(String str, int i, int i2) {
            this.value = i2;
        }

        public static zrp<AnimationType> h() {
            return $ENTRIES;
        }

        public static AnimationType valueOf(String str) {
            return (AnimationType) Enum.valueOf(AnimationType.class, str);
        }

        public static AnimationType[] values() {
            return (AnimationType[]) $VALUES.clone();
        }

        public final int i() {
            return this.value;
        }
    }

    /* compiled from: GiftView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[GiftType.values().length];
            try {
                iArr[GiftType.GIFT_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AnimationType.values().length];
            try {
                iArr2[AnimationType.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[AnimationType.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AnimationType.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public GiftView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Object obj;
        this.v = UserId.d;
        this.y = new p3h(this, 22);
        this.z = AnimationType.NONE;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a, 0, 0);
            int i = obtainStyledAttributes.getInt(0, 0);
            AnimationType.Companion.getClass();
            Iterator<E> it = AnimationType.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((AnimationType) obj).i() == i) {
                        break;
                    }
                }
            }
            AnimationType animationType = (AnimationType) obj;
            setAnimationType(animationType == null ? AnimationType.NONE : animationType);
            obtainStyledAttributes.recycle();
        }
        View.inflate(context, R.layout.gift_view_layout, this);
        this.l = (CardView) findViewById(R.id.gift_card_view);
        this.m = (VKImageView) findViewById(R.id.limited_gift_background);
        this.n = (ParticleView) findViewById(R.id.background_stars_animation);
        this.o = (RLottieImageView) findViewById(R.id.secondary_animation);
        this.p = (ImageView) findViewById(R.id.limited_gift_glass);
        this.q = (VKImageView) findViewById(R.id.gift);
        this.r = (FrameLayout) findViewById(R.id.limited_gift_icon_container);
        this.s = (ImageView) findViewById(R.id.limited_gift_icon);
        this.t = (AnimatedGiftView) findViewById(R.id.animated_gift);
        setClipToPadding(false);
    }

    public static void f(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.setMargins(i, i, i, i);
        view.setLayoutParams(marginLayoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final void c(Gift gift, UserId userId, int i, int i2, boolean z) {
        ?? r6;
        String str;
        int intValue;
        Image image;
        Integer valueOf;
        this.u = gift;
        this.v = userId;
        this.w = i;
        this.x = i2;
        String d = gift.d(dhr0.M());
        CardView cardView = this.l;
        if (d != null) {
            cardView.setCardElevation(iah0.b(2.0f));
            cardView.setCardBackgroundColor(Color.parseColor(d));
        } else {
            cardView.setCardElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            cardView.setCardBackgroundColor(0);
        }
        GiftRarity giftRarity = gift.l;
        VKImageView vKImageView = this.q;
        AnimatedGiftView animatedGiftView = this.t;
        ImageView imageView = this.p;
        RLottieImageView rLottieImageView = this.o;
        ParticleView particleView = this.n;
        VKImageView vKImageView2 = this.m;
        ImageView imageView2 = this.s;
        FrameLayout frameLayout = this.r;
        if (giftRarity != null) {
            cardView.setCardElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            boolean M = dhr0.M();
            GiftRarity giftRarity2 = gift.l;
            if (giftRarity2 != null) {
                String str2 = giftRarity2.h;
                if (str2 != null) {
                    valueOf = Integer.valueOf(Color.parseColor(str2));
                } else {
                    GiftRarity.Type type = giftRarity2.c;
                    int i3 = type == null ? -1 : o7z.$EnumSwitchMapping$0[type.ordinal()];
                    Integer valueOf2 = i3 != 1 ? i3 != 2 ? i3 != 3 ? null : Integer.valueOf(R.attr.vk_ui_accent_raspberry_pink) : Integer.valueOf(R.attr.vk_ui_accent_purple) : Integer.valueOf(R.attr.vk_ui_accent_green);
                    valueOf = valueOf2 != null ? Integer.valueOf(e3m.f(valueOf2.intValue(), getContext())) : null;
                }
                Drawable background = frameLayout.getBackground();
                GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
                if (gradientDrawable == null || valueOf == null) {
                    frameLayout.setVisibility(4);
                } else {
                    gradientDrawable.setColor(valueOf.intValue());
                    awt0.u(frameLayout, true);
                }
                GiftRarity giftRarity3 = gift.l;
                GiftRarity.Type type2 = giftRarity3 != null ? giftRarity3.c : null;
                int i4 = type2 == null ? -1 : o7z.$EnumSwitchMapping$0[type2.ordinal()];
                Integer valueOf3 = i4 != 1 ? i4 != 2 ? i4 != 3 ? null : Integer.valueOf(R.drawable.vk_icon_crown_16) : Integer.valueOf(R.drawable.vk_icon_diamond_16) : Integer.valueOf(R.drawable.vk_icon_sparkle_16);
                if (valueOf3 != null) {
                    int intValue2 = valueOf3.intValue();
                    awt0.u(frameLayout, true);
                    awt0.u(imageView2, true);
                    imageView2.setImageResource(intValue2);
                    int measuredWidth = (int) (getMeasuredWidth() * 0.18f);
                    ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                    layoutParams.width = measuredWidth;
                    layoutParams.height = measuredWidth;
                    frameLayout.setLayoutParams(layoutParams);
                }
            }
            String d2 = gift.d(M);
            GiftTheme giftTheme = M ? GiftTheme.DARK : GiftTheme.LIGHT;
            Iterator<GiftBackground> it = gift.k.iterator();
            while (true) {
                if (!it.hasNext()) {
                    Iterator<GiftBackground> it2 = gift.k.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            image = null;
                            break;
                        }
                        GiftBackground next = it2.next();
                        if (next.d == GiftTheme.UNKNOWN) {
                            image = next.c;
                            break;
                        }
                    }
                } else {
                    GiftBackground next2 = it.next();
                    if (next2.d == giftTheme) {
                        image = next2.c;
                        break;
                    }
                }
            }
            if (d2 == null && image == null) {
                vKImageView2.setVisibility(4);
            } else {
                if (d2 != null) {
                    Drawable background2 = vKImageView2.getBackground();
                    GradientDrawable gradientDrawable2 = background2 instanceof GradientDrawable ? (GradientDrawable) background2 : null;
                    if (gradientDrawable2 != null) {
                        gradientDrawable2.setColor(Color.parseColor(d2));
                    }
                }
                if (image != null) {
                    ImageSize Cb = image.Cb(vKImageView2.getLayoutParams().width, true, false);
                    vKImageView2.load(Cb != null ? Cb.d.d : null);
                }
                awt0.u(vKImageView2, true);
            }
            int i5 = a.$EnumSwitchMapping$1[this.z.ordinal()];
            if (i5 == 1) {
                rLottieImageView.setVisibility(4);
                d();
            } else if (i5 == 2) {
                particleView.setVisibility(4);
                awt0.u(rLottieImageView, true);
                e(gift, M);
            } else if (i5 != 3) {
                particleView.setVisibility(4);
                rLottieImageView.setVisibility(4);
            } else {
                awt0.u(particleView, true);
                awt0.u(rLottieImageView, true);
                d();
                e(gift, M);
            }
            awt0.u(imageView, true);
            int i6 = B;
            f(i6, vKImageView);
            f(i6, animatedGiftView);
            if (vKImageView.isImageLoaded()) {
                g();
            } else {
                vKImageView.setOnLoadCallback(new lzt(this));
            }
        } else {
            vKImageView2.setVisibility(4);
            frameLayout.setVisibility(4);
            imageView2.setVisibility(4);
            particleView.setVisibility(4);
            rLottieImageView.setVisibility(4);
            imageView.setVisibility(4);
            vKImageView.setOnLoadCallback(null);
            f(0, vKImageView);
            f(0, animatedGiftView);
        }
        awt0.u(vKImageView, true);
        if (!z || gift.m == null) {
            r6 = 0;
            vKImageView.setOnLoadCallback(null);
            f(0, vKImageView);
            vKImageView.load(gift.f);
        } else {
            GiftType giftType = gift.n;
            if ((giftType == null ? -1 : a.$EnumSwitchMapping$0[giftType.ordinal()]) == 1) {
                GiftBaseUrlConfig giftBaseUrlConfig = gift.m;
                if (giftBaseUrlConfig != null) {
                    StringBuilder sb = new StringBuilder(drm0.s0(giftBaseUrlConfig.b, '/'));
                    sb.append("/rectangle/512x330.webp");
                    Integer num = giftBaseUrlConfig.c;
                    if (num != null && (intValue = num.intValue()) > 0) {
                        sb.append("?version=");
                        sb.append(intValue);
                    }
                    str = sb.toString();
                } else {
                    str = null;
                }
                cardView.setCardElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                int i7 = A;
                f4m.t(i7, vKImageView);
                f4m.q(i7, vKImageView);
                vKImageView.load(str);
                vKImageView.setOnLoadCallback(new kzt(this, gift));
                r6 = 0;
            } else {
                vKImageView.setOnLoadCallback(null);
                r6 = 0;
                f(0, vKImageView);
                vKImageView.load(gift.f);
            }
        }
        if (!gift.V0()) {
            animatedGiftView.setVisibility(4);
        } else {
            animatedGiftView.setVisibility(r6);
            animatedGiftView.a(gift, r6, new nwk(this, 10));
        }
    }

    public final void d() {
        this.n.setAnimationType(new haq(new ml90(new tye0(524024), new ll90(523902), new iaq(4), 24)));
    }

    public final void e(Gift gift, boolean z) {
        GiftAnimation giftAnimation;
        String a2;
        GiftRarity giftRarity = gift.l;
        if (giftRarity == null || (giftAnimation = giftRarity.k) == null || (a2 = giftAnimation.a(z)) == null) {
            return;
        }
        RLottieImageView rLottieImageView = this.o;
        rLottieImageView.getClass();
        bpn0 bpn0Var = c7r0.a;
        hg1.b(rLottieImageView, c7r0.i(a2).r0(io.reactivex.rxjava3.schedulers.a.b()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new amt(new lxz(rLottieImageView, 24), 27), new lav(new sux(20), 26)));
    }

    public final void g() {
        Gift gift = this.u;
        if ((gift != null ? gift.l : null) == null || this.z != AnimationType.PRIMARY) {
            return;
        }
        ParticleView particleView = this.n;
        particleView.setVisibility(0);
        particleView.m = false;
        particleView.w.cancel();
        particleView.removeCallbacks(particleView.t);
        particleView.i();
    }

    @Override // xsna.khp0
    public gzs<s3q0> getVisibilityListener() {
        return this.y;
    }

    public final void setAnimationType(AnimationType animationType) {
        this.z = animationType;
    }

    @Override // xsna.khp0
    public void setVisibilityListener(gzs<s3q0> gzsVar) {
        this.y = gzsVar;
    }
}
