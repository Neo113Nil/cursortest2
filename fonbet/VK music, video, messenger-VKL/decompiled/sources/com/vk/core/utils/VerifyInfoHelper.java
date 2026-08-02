package com.vk.core.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.apps.BuildInfo;
import com.vk.core.utils.a;
import com.vk.dto.common.VerifyInfo;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.asp;
import xsna.baf0;
import xsna.cn70;
import xsna.dhr0;
import xsna.e1m0;
import xsna.e3m;
import xsna.f4m;
import xsna.f7q0;
import xsna.fd90;
import xsna.gwd0;
import xsna.m33;
import xsna.msy;
import xsna.tqf0;
import xsna.w0o0;
import xsna.zrp;

/* compiled from: VerifyInfoHelper.kt */
/* loaded from: classes17.dex */
public final class VerifyInfoHelper {
    public static final VerifyInfoHelper a = new VerifyInfoHelper();
    public static final Object b;
    public static final Object c;
    public static final Object d;
    public static final Object e;
    public static final Object f;
    public static final Object g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VerifyInfoHelper.kt */
    public static final class ColorTheme {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ColorTheme[] $VALUES;
        public static final ColorTheme light;
        public static final ColorTheme normal;
        public static final ColorTheme ultraLight;
        public static final ColorTheme white;

        static {
            ColorTheme colorTheme = new ColorTheme("white", 0);
            white = colorTheme;
            ColorTheme colorTheme2 = new ColorTheme("normal", 1);
            normal = colorTheme2;
            ColorTheme colorTheme3 = new ColorTheme("light", 2);
            light = colorTheme3;
            ColorTheme colorTheme4 = new ColorTheme("ultraLight", 3);
            ultraLight = colorTheme4;
            ColorTheme[] colorThemeArr = {colorTheme, colorTheme2, colorTheme3, colorTheme4};
            $VALUES = colorThemeArr;
            $ENTRIES = new asp(colorThemeArr);
        }

        public ColorTheme() {
            throw null;
        }

        public static ColorTheme valueOf(String str) {
            return (ColorTheme) Enum.valueOf(ColorTheme.class, str);
        }

        public static ColorTheme[] values() {
            return (ColorTheme[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VerifyInfoHelper.kt */
    public static final class VerifiedIconDisplayMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VerifiedIconDisplayMode[] $VALUES;
        public static final VerifiedIconDisplayMode DEFAULT;
        public static final VerifiedIconDisplayMode OVERLAY;

        static {
            VerifiedIconDisplayMode verifiedIconDisplayMode = new VerifiedIconDisplayMode("DEFAULT", 0);
            DEFAULT = verifiedIconDisplayMode;
            VerifiedIconDisplayMode verifiedIconDisplayMode2 = new VerifiedIconDisplayMode("OVERLAY", 1);
            OVERLAY = verifiedIconDisplayMode2;
            VerifiedIconDisplayMode[] verifiedIconDisplayModeArr = {verifiedIconDisplayMode, verifiedIconDisplayMode2};
            $VALUES = verifiedIconDisplayModeArr;
            $ENTRIES = new asp(verifiedIconDisplayModeArr);
        }

        public VerifiedIconDisplayMode() {
            throw null;
        }

        public static VerifiedIconDisplayMode valueOf(String str) {
            return (VerifiedIconDisplayMode) Enum.valueOf(VerifiedIconDisplayMode.class, str);
        }

        public static VerifiedIconDisplayMode[] values() {
            return (VerifiedIconDisplayMode[]) $VALUES.clone();
        }
    }

    /* compiled from: VerifyInfoHelper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ColorTheme.values().length];
            try {
                iArr[ColorTheme.normal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ColorTheme.light.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ColorTheme.ultraLight.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ColorTheme.white.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        e1m0 e1m0Var = new e1m0(6);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        b = msy.a(lazyThreadSafetyMode, e1m0Var);
        c = msy.a(lazyThreadSafetyMode, new w0o0(5));
        d = msy.a(lazyThreadSafetyMode, new fd90(15));
        e = msy.a(lazyThreadSafetyMode, new tqf0(6));
        f = msy.a(lazyThreadSafetyMode, new f7q0(3));
        g = msy.a(lazyThreadSafetyMode, new gwd0(12));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlin.Lazy] */
    public static int a(ColorTheme colorTheme) {
        int i = a.$EnumSwitchMapping$0[colorTheme.ordinal()];
        ?? r1 = d;
        if (i == 1) {
            return ((Number) r1.getValue()).intValue();
        }
        if (i == 2) {
            return ((Number) r1.getValue()).intValue();
        }
        if (i == 3) {
            return ((Number) f.getValue()).intValue();
        }
        if (i == 4) {
            return ((Number) e.getValue()).intValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, kotlin.Lazy] */
    public static int b(ColorTheme colorTheme) {
        if (BuildInfo.q()) {
            return ((Number) g.getValue()).intValue();
        }
        ColorTheme colorTheme2 = ColorTheme.normal;
        ?? r1 = c;
        return colorTheme == colorTheme2 ? ((Number) r1.getValue()).intValue() : colorTheme == ColorTheme.light ? ((Number) b.getValue()).intValue() : colorTheme == ColorTheme.ultraLight ? ((Number) f.getValue()).intValue() : colorTheme == ColorTheme.white ? ((Number) e.getValue()).intValue() : ((Number) r1.getValue()).intValue();
    }

    public static String c(Context context, VerifyInfo verifyInfo) {
        return verifyInfo == null ? "" : verifyInfo.c ? context.getString(R.string.talkback_community_trending) : verifyInfo.b ? context.getString(R.string.talkback_community_verified) : "";
    }

    public static baf0 f(Context context, ColorTheme colorTheme, VerifyInfo verifyInfo) {
        Pair pair;
        Pair pair2;
        Object obj = com.vk.core.utils.a.a;
        Integer valueOf = Integer.valueOf(R.drawable.verified_12);
        if (verifyInfo.c) {
            pair2 = new Pair(Integer.valueOf(R.drawable.vk_icon_fire_12), Integer.valueOf(a(colorTheme)));
        } else {
            if (verifyInfo.b) {
                pair = new Pair(valueOf, Integer.valueOf(b(colorTheme)));
            } else {
                if (!verifyInfo.Db()) {
                    return null;
                }
                pair = new Pair(valueOf, Integer.valueOf(dhr0.t.c(R.attr.vk_ui_icon_secondary)));
            }
            pair2 = pair;
        }
        int intValue = ((Number) pair2.d()).intValue();
        return new baf0(m33.a(intValue, context), ((Number) pair2.g()).intValue());
    }

    public static LayerDrawable g(Context context, VerifyInfo verifyInfo) {
        Pair pair;
        Object obj = com.vk.core.utils.a.a;
        Integer valueOf = Integer.valueOf(R.drawable.vk_icon_verified_alt_12);
        if (verifyInfo.b) {
            pair = new Pair(valueOf, Integer.valueOf(e3m.f(R.attr.vk_ui_icon_accent_themed, context)));
        } else {
            if (!verifyInfo.d) {
                return null;
            }
            pair = new Pair(valueOf, Integer.valueOf(e3m.f(R.attr.vk_ui_icon_tertiary, context)));
        }
        baf0 baf0Var = new baf0(m33.a(((Number) pair.d()).intValue(), context), ((Number) pair.g()).intValue());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{com.vk.core.utils.a.h(cn70.b(12), cn70.b(12)), new baf0(m33.a(R.drawable.bg_white_circle, context), e3m.f(R.attr.vk_ui_background_content, context)), baf0Var});
        layerDrawable.setLayerGravity(0, 17);
        layerDrawable.setLayerGravity(1, 17);
        layerDrawable.setLayerGravity(2, 17);
        layerDrawable.setLayerSize(0, cn70.b(12), cn70.b(12));
        layerDrawable.setLayerSize(1, cn70.b(12), cn70.b(12));
        layerDrawable.setLayerSize(2, cn70.b(8), cn70.b(8));
        return layerDrawable;
    }

    public static Drawable h(VerifyInfoHelper verifyInfoHelper, VerifyInfo verifyInfo, Context context, ColorTheme colorTheme, int i) {
        if ((i & 4) != 0) {
            colorTheme = ColorTheme.normal;
        }
        boolean z = (i & 16) != 0;
        Object obj = com.vk.core.utils.a.a;
        a.b b2 = com.vk.core.utils.a.b(context, verifyInfo, colorTheme, false, z);
        if (b2 != null) {
            return b2.a;
        }
        return null;
    }

    public static Drawable i(Context context, VerifyInfo verifyInfo) {
        return com.vk.core.utils.a.f(context, verifyInfo, false, true, null, false, 32);
    }

    public static Drawable j(VerifyInfoHelper verifyInfoHelper, Context context, VerifyInfo verifyInfo, boolean z, ColorTheme colorTheme, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            colorTheme = ColorTheme.normal;
        }
        return com.vk.core.utils.a.f(context, verifyInfo, false, z2, colorTheme, false, 76);
    }

    public static void k(ImageView imageView, boolean z, VerifyInfo verifyInfo, boolean z2, boolean z3, int i) {
        boolean z4 = (i & 8) != 0 ? false : z2;
        boolean z5 = (i & 16) != 0;
        boolean z6 = (i & 32) != 0 ? false : z3;
        if (imageView == null || verifyInfo == null) {
            if (imageView != null) {
                f4m.j(imageView);
            }
        } else {
            Drawable d2 = a.d(imageView.getContext(), z, verifyInfo, z4, z5, z6);
            if (d2 == null) {
                f4m.j(imageView);
            } else {
                imageView.setImageDrawable(d2);
                imageView.setVisibility(0);
            }
        }
    }

    public final Drawable d(Context context, boolean z, VerifyInfo verifyInfo, boolean z2, boolean z3, boolean z4) {
        Context context2;
        VerifyInfo verifyInfo2;
        boolean z5;
        Drawable j;
        if (verifyInfo == null || (!verifyInfo.Cb() && !verifyInfo.e && !verifyInfo.f && !verifyInfo.g)) {
            return null;
        }
        if (z) {
            context2 = context;
            verifyInfo2 = verifyInfo;
            z5 = z4;
            j = com.vk.core.utils.a.f(context2, verifyInfo2, z2, z3, null, z5, 32);
        } else {
            context2 = context;
            verifyInfo2 = verifyInfo;
            z5 = z4;
            j = j(this, context2, verifyInfo2, z3, null, 8);
        }
        if (j != null) {
            return j;
        }
        if (z5) {
            Object obj = com.vk.core.utils.a.a;
            ColorTheme colorTheme = ColorTheme.normal;
            if (!z) {
                return com.vk.core.utils.a.a(context2, colorTheme, verifyInfo2);
            }
            if (dhr0.M()) {
                if (verifyInfo2.e) {
                    return m33.a(R.drawable.vk_icon_crown_verified_dark_24, context2);
                }
                if (verifyInfo2.f) {
                    return com.vk.core.utils.a.i(R.attr.vk_ui_icon_secondary, context2);
                }
            } else {
                if (verifyInfo2.e) {
                    return m33.a(R.drawable.vk_icon_crown_verified_light_24, context2);
                }
                if (verifyInfo2.f) {
                    return com.vk.core.utils.a.i(R.attr.vk_ui_icon_secondary, context2);
                }
            }
            return null;
        }
        return null;
    }

    public final void l(TextView textView, VerifyInfo verifyInfo, boolean z, ColorTheme colorTheme) {
        if (verifyInfo == null || !verifyInfo.Cb()) {
            return;
        }
        Context context = textView.getContext();
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, context != null ? z ? f(context, colorTheme, verifyInfo) : h(this, verifyInfo, context, colorTheme, 24) : null, (Drawable) null);
    }
}
