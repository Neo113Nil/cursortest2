package com.vk.core.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.dto.common.VerifyInfo;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import kotlin.LazyThreadSafetyMode;
import xsna.baf0;
import xsna.cn70;
import xsna.cxu;
import xsna.dhr0;
import xsna.e3m;
import xsna.e43;
import xsna.ltb0;
import xsna.m33;
import xsna.msy;
import xsna.pkd0;
import xsna.vu5;
import xsna.x1z;

/* compiled from: VerifiedIconHelper.kt */
/* loaded from: classes17.dex */
public final class a {
    public static final Object a;
    public static final Object b;

    /* compiled from: VerifiedIconHelper.kt */
    /* renamed from: com.vk.core.utils.a$a, reason: collision with other inner class name */
    public static final class C0794a {
        public final int a;
        public final int b;

        public C0794a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0794a)) {
                return false;
            }
            C0794a c0794a = (C0794a) obj;
            return this.a == c0794a.a && this.b == c0794a.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DrawableResWithTint(res=");
            sb.append(this.a);
            sb.append(", tint=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: VerifiedIconHelper.kt */
    public static final class b {
        public final baf0 a;
        public final boolean b;

        public b(baf0 baf0Var, boolean z) {
            this.a = baf0Var;
            this.b = z;
        }
    }

    static {
        pkd0 pkd0Var = new pkd0(10);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        a = msy.a(lazyThreadSafetyMode, pkd0Var);
        b = msy.a(lazyThreadSafetyMode, new ltb0(10));
    }

    public static baf0 a(Context context, VerifyInfoHelper.ColorTheme colorTheme, VerifyInfo verifyInfo) {
        if (verifyInfo.e) {
            Drawable a2 = m33.a(R.drawable.vk_icon_crown_verified_16, context);
            VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
            return new baf0(a2, VerifyInfoHelper.b(colorTheme));
        }
        if (verifyInfo.f) {
            return new baf0(m33.a(R.drawable.vk_icon_verified_16, context), dhr0.t.c(R.attr.vk_ui_icon_secondary));
        }
        return null;
    }

    public static b b(Context context, VerifyInfo verifyInfo, VerifyInfoHelper.ColorTheme colorTheme, boolean z, boolean z2) {
        return c(context, verifyInfo.b || verifyInfo.g, z2 && verifyInfo.c, verifyInfo.Db(), colorTheme, z);
    }

    public static b c(Context context, boolean z, boolean z2, boolean z3, VerifyInfoHelper.ColorTheme colorTheme, boolean z4) {
        Integer valueOf = Integer.valueOf(R.drawable.vk_icon_verified_16);
        cxu cxuVar = new cxu(context, 3);
        if (z4 && z2 && (z || z3)) {
            LinkedHashMap linkedHashMap = x1z.a;
            Integer valueOf2 = Integer.valueOf(R.drawable.vk_icon_fire_verified_16);
            VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
            return (b) cxuVar.invoke(valueOf2, Integer.valueOf(VerifyInfoHelper.a(colorTheme)), Boolean.FALSE);
        }
        if (z) {
            LinkedHashMap linkedHashMap2 = x1z.a;
            VerifyInfoHelper verifyInfoHelper2 = VerifyInfoHelper.a;
            return (b) cxuVar.invoke(valueOf, Integer.valueOf(VerifyInfoHelper.b(colorTheme)), Boolean.TRUE);
        }
        if (z3) {
            LinkedHashMap linkedHashMap3 = x1z.a;
            return (b) cxuVar.invoke(valueOf, Integer.valueOf(e3m.f(R.attr.vk_ui_icon_secondary, context)), Boolean.TRUE);
        }
        if (!z2) {
            return null;
        }
        LinkedHashMap linkedHashMap4 = x1z.a;
        Integer valueOf3 = Integer.valueOf(R.drawable.vk_icon_fire_16);
        VerifyInfoHelper verifyInfoHelper3 = VerifyInfoHelper.a;
        return (b) cxuVar.invoke(valueOf3, Integer.valueOf(VerifyInfoHelper.a(colorTheme)), Boolean.FALSE);
    }

    public static /* synthetic */ b d(Context context, VerifyInfo verifyInfo, VerifyInfoHelper.ColorTheme colorTheme, int i) {
        if ((i & 4) != 0) {
            colorTheme = VerifyInfoHelper.ColorTheme.normal;
        }
        return b(context, verifyInfo, colorTheme, (i & 8) == 0, (i & 16) != 0);
    }

    public static C0794a e(VerifyInfo verifyInfo, VerifyInfoHelper.ColorTheme colorTheme) {
        if (verifyInfo.c) {
            VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
            return new C0794a(R.drawable.vk_icon_fire_16, VerifyInfoHelper.a(colorTheme));
        }
        if (verifyInfo.b) {
            VerifyInfoHelper verifyInfoHelper2 = VerifyInfoHelper.a;
            return new C0794a(R.drawable.vk_icon_verified_16, VerifyInfoHelper.b(colorTheme));
        }
        if (verifyInfo.Db()) {
            return new C0794a(R.drawable.vk_icon_verified_16, dhr0.t.c(R.attr.vk_ui_icon_secondary));
        }
        return null;
    }

    public static Drawable f(Context context, VerifyInfo verifyInfo, boolean z, boolean z2, VerifyInfoHelper.ColorTheme colorTheme, boolean z3, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z4 = (i & 8) == 0;
        if ((i & 32) != 0) {
            colorTheme = VerifyInfoHelper.ColorTheme.normal;
        }
        if ((i & 64) != 0) {
            z3 = false;
        }
        if (z4) {
            if (z2 && verifyInfo.c) {
                return m33.a(R.drawable.ic_fire_border_composite_20_xml, context);
            }
            boolean z5 = verifyInfo.b;
            if (z5 && z3) {
                return i(R.attr.vk_ui_icon_accent, context);
            }
            if (z5 && (z || dhr0.M())) {
                return m33.a(R.drawable.verified_badge_dark_24, context);
            }
            if (verifyInfo.b && dhr0.L()) {
                return m33.a(R.drawable.verified_badge_light_24, context);
            }
            if (verifyInfo.Db()) {
                baf0 baf0Var = new baf0(m33.a(R.drawable.vk_icon_verified_20, context), dhr0.t.c(R.attr.vk_ui_icon_secondary));
                Drawable a2 = m33.a(R.drawable.bg_white_circle, context);
                Context context2 = e43.a;
                LayerDrawable layerDrawable = new LayerDrawable(new baf0[]{new baf0(a2, (context2 != null ? context2 : null).getColor(dhr0.M() ? R.color.vk_gray_800 : R.color.vk_white)), baf0Var});
                layerDrawable.setLayerGravity(0, 17);
                layerDrawable.setLayerGravity(1, 17);
                layerDrawable.setLayerSize(0, cn70.b(20), cn70.b(20));
                layerDrawable.setLayerInset(1, cn70.b(6), cn70.b(4), cn70.b(2), cn70.b(4));
                return layerDrawable;
            }
        } else {
            if (z2 && verifyInfo.c) {
                return m33.a(R.drawable.ic_fire_border_composite_20_xml, context);
            }
            if (verifyInfo.b) {
                Drawable a3 = m33.a(R.drawable.vk_icon_verified_16, context);
                VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
                return new baf0(a3, VerifyInfoHelper.b(colorTheme));
            }
            if (verifyInfo.Db()) {
                return new baf0(m33.a(R.drawable.vk_icon_verified_16, context), dhr0.t.c(R.attr.vk_ui_icon_secondary));
            }
        }
        return null;
    }

    public static b g(Context context, VerifyInfo verifyInfo, int i) {
        VerifyInfoHelper.ColorTheme colorTheme = VerifyInfoHelper.ColorTheme.normal;
        b c = c(context, verifyInfo.b, verifyInfo.c, verifyInfo.Db(), colorTheme, (i & 8) == 0);
        if (c != null) {
            return c;
        }
        baf0 a2 = a(context, colorTheme, verifyInfo);
        if (a2 != null) {
            return new b(a2, false);
        }
        return null;
    }

    public static ShapeDrawable h(int i, int i2) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setBounds(0, 0, i, i2);
        shapeDrawable.getPaint().setColor(0);
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        shapeDrawable.getPaint().setShadowLayer(12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, context.getColor(R.color.vk_black_alpha12));
        return shapeDrawable;
    }

    public static LayerDrawable i(int i, Context context) {
        baf0 baf0Var = new baf0(m33.a(R.drawable.vk_icon_verified_20, context), dhr0.t.c(i));
        Drawable a2 = m33.a(R.drawable.bg_white_circle, context);
        Context context2 = e43.a;
        if (context2 == null) {
            context2 = null;
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{h(cn70.b(16), cn70.b(16)), new baf0(a2, context2.getColor(dhr0.M() ? R.color.vk_gray_800 : R.color.vk_white)), baf0Var});
        layerDrawable.setLayerGravity(0, 17);
        layerDrawable.setLayerGravity(1, 17);
        layerDrawable.setLayerGravity(2, 17);
        layerDrawable.setLayerSize(0, cn70.b(16), cn70.b(16));
        layerDrawable.setLayerSize(1, cn70.b(16), cn70.b(16));
        layerDrawable.setLayerSize(2, cn70.b(16), cn70.b(16));
        layerDrawable.setLayerInset(2, cn70.b(6), cn70.b(4), cn70.b(2), cn70.b(4));
        return layerDrawable;
    }
}
