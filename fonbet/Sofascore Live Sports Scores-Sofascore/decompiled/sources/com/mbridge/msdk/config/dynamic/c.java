package com.mbridge.msdk.config.dynamic;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.ironsource.U3;
import com.mbridge.msdk.dycreator.utils.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadService;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.bf3;
import java.lang.ref.SoftReference;
import java.lang.reflect.Field;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class c {
    private static volatile c d;
    private SoftReference<HashMap<String, com.mbridge.msdk.config.dynamic.utils.c>> a;
    private Context b = com.mbridge.msdk.foundation.controller.c.n().d();
    private HashMap<String, com.mbridge.msdk.config.dynamic.utils.c> c;

    private c() {
        d();
    }

    private void d() {
        HashMap<String, com.mbridge.msdk.config.dynamic.utils.c> hashMap = new HashMap<>();
        this.c = hashMap;
        hashMap.put("id", com.mbridge.msdk.config.dynamic.utils.c.id);
        this.c.put("background", com.mbridge.msdk.config.dynamic.utils.c.background);
        this.c.put("visibility", com.mbridge.msdk.config.dynamic.utils.c.visibility);
        this.c.put("contentDescription", com.mbridge.msdk.config.dynamic.utils.c.contentDescription);
        this.c.put("padding", com.mbridge.msdk.config.dynamic.utils.c.padding);
        this.c.put("paddingTop", com.mbridge.msdk.config.dynamic.utils.c.paddingTop);
        this.c.put("paddingBottom", com.mbridge.msdk.config.dynamic.utils.c.paddingBottom);
        this.c.put("paddingLeft", com.mbridge.msdk.config.dynamic.utils.c.paddingLeft);
        this.c.put("paddingRight", com.mbridge.msdk.config.dynamic.utils.c.paddingRight);
        this.c.put("paddingStart", com.mbridge.msdk.config.dynamic.utils.c.paddingStart);
        this.c.put("paddingEnd", com.mbridge.msdk.config.dynamic.utils.c.paddingEnd);
        this.c.put("layout_margin", com.mbridge.msdk.config.dynamic.utils.c.layout_margin);
        this.c.put("layout_marginTop", com.mbridge.msdk.config.dynamic.utils.c.layout_marginTop);
        this.c.put("layout_marginBottom", com.mbridge.msdk.config.dynamic.utils.c.layout_marginBottom);
        this.c.put("layout_marginLeft", com.mbridge.msdk.config.dynamic.utils.c.layout_marginLeft);
        this.c.put("layout_marginRight", com.mbridge.msdk.config.dynamic.utils.c.layout_marginRight);
        this.c.put("layout_marginStart", com.mbridge.msdk.config.dynamic.utils.c.layout_marginStart);
        this.c.put("layout_marginEnd", com.mbridge.msdk.config.dynamic.utils.c.layout_marginEnd);
        this.c.put("alpha", com.mbridge.msdk.config.dynamic.utils.c.alpha);
        this.c.put("rotation", com.mbridge.msdk.config.dynamic.utils.c.rotation);
        this.c.put("scaleX", com.mbridge.msdk.config.dynamic.utils.c.scaleX);
        this.c.put("scaleY", com.mbridge.msdk.config.dynamic.utils.c.scaleY);
        this.c.put("translationX", com.mbridge.msdk.config.dynamic.utils.c.translationX);
        this.c.put("translationY", com.mbridge.msdk.config.dynamic.utils.c.translationY);
        this.c.put("tag", com.mbridge.msdk.config.dynamic.utils.c.tag);
        this.c.put("text", com.mbridge.msdk.config.dynamic.utils.c.text);
        this.c.put("textColor", com.mbridge.msdk.config.dynamic.utils.c.textColor);
        this.c.put("textSize", com.mbridge.msdk.config.dynamic.utils.c.textSize);
        this.c.put("textStyle", com.mbridge.msdk.config.dynamic.utils.c.textStyle);
        this.c.put("maxLines", com.mbridge.msdk.config.dynamic.utils.c.maxLines);
        this.c.put("minLines", com.mbridge.msdk.config.dynamic.utils.c.minLines);
        this.c.put("lines", com.mbridge.msdk.config.dynamic.utils.c.lines);
        this.c.put("ellipsize", com.mbridge.msdk.config.dynamic.utils.c.ellipsize);
        this.c.put("gravity", com.mbridge.msdk.config.dynamic.utils.c.gravity);
        this.c.put("drawablePadding", com.mbridge.msdk.config.dynamic.utils.c.drawablePadding);
        this.c.put("drawableStart", com.mbridge.msdk.config.dynamic.utils.c.drawableStart);
        this.c.put("drawableEnd", com.mbridge.msdk.config.dynamic.utils.c.drawableEnd);
        this.c.put("drawableTop", com.mbridge.msdk.config.dynamic.utils.c.drawableTop);
        this.c.put("drawableBottom", com.mbridge.msdk.config.dynamic.utils.c.drawableBottom);
        this.c.put("singleLine", com.mbridge.msdk.config.dynamic.utils.c.singleLine);
        this.c.put("marqueeRepeatLimit", com.mbridge.msdk.config.dynamic.utils.c.marqueeRepeatLimit);
        this.c.put("includeFontPadding", com.mbridge.msdk.config.dynamic.utils.c.includeFontPadding);
        this.c.put("lineSpacingExtra", com.mbridge.msdk.config.dynamic.utils.c.lineSpacingExtra);
        this.c.put("lineSpacingMultiplier", com.mbridge.msdk.config.dynamic.utils.c.lineSpacingMultiplier);
        this.c.put("hint", com.mbridge.msdk.config.dynamic.utils.c.hint);
        this.c.put("inputType", com.mbridge.msdk.config.dynamic.utils.c.inputType);
        this.c.put("maxLength", com.mbridge.msdk.config.dynamic.utils.c.maxLength);
        this.c.put("textIsSelectable", com.mbridge.msdk.config.dynamic.utils.c.textIsSelectable);
        this.c.put("cursorVisible", com.mbridge.msdk.config.dynamic.utils.c.cursorVisible);
        this.c.put("backgroundTint", com.mbridge.msdk.config.dynamic.utils.c.backgroundTint);
        this.c.put("allCaps", com.mbridge.msdk.config.dynamic.utils.c.allCaps);
        this.c.put("src", com.mbridge.msdk.config.dynamic.utils.c.src);
        this.c.put("scaleType", com.mbridge.msdk.config.dynamic.utils.c.scaleType);
        this.c.put("adjustViewBounds", com.mbridge.msdk.config.dynamic.utils.c.adjustViewBounds);
        this.c.put("maxWidth", com.mbridge.msdk.config.dynamic.utils.c.maxWidth);
        this.c.put("maxHeight", com.mbridge.msdk.config.dynamic.utils.c.maxHeight);
        this.c.put("tint", com.mbridge.msdk.config.dynamic.utils.c.tint);
        this.c.put("divider", com.mbridge.msdk.config.dynamic.utils.c.divider);
        this.c.put("dividerHeight", com.mbridge.msdk.config.dynamic.utils.c.dividerHeight);
        this.c.put("scrollbars", com.mbridge.msdk.config.dynamic.utils.c.scrollbars);
        this.c.put("listSelector", com.mbridge.msdk.config.dynamic.utils.c.listSelector);
        this.c.put("stackFromBottom", com.mbridge.msdk.config.dynamic.utils.c.stackFromBottom);
        this.c.put("transcriptMode", com.mbridge.msdk.config.dynamic.utils.c.transcriptMode);
        this.c.put("numColumns", com.mbridge.msdk.config.dynamic.utils.c.numColumns);
        this.c.put("verticalSpacing", com.mbridge.msdk.config.dynamic.utils.c.verticalSpacing);
        this.c.put("horizontalSpacing", com.mbridge.msdk.config.dynamic.utils.c.horizontalSpacing);
        this.c.put("stretchMode", com.mbridge.msdk.config.dynamic.utils.c.stretchMode);
        this.c.put("columnWidth", com.mbridge.msdk.config.dynamic.utils.c.columnWidth);
        this.c.put("fillViewport", com.mbridge.msdk.config.dynamic.utils.c.fillViewport);
        this.c.put("scrollbarStyle", com.mbridge.msdk.config.dynamic.utils.c.scrollbarStyle);
        this.c.put(U3.i.n, com.mbridge.msdk.config.dynamic.utils.c.orientation);
        this.c.put("weightSum", com.mbridge.msdk.config.dynamic.utils.c.weightSum);
        this.c.put("baselineAligned", com.mbridge.msdk.config.dynamic.utils.c.baselineAligned);
        this.c.put("measureWithLargestChild", com.mbridge.msdk.config.dynamic.utils.c.measureWithLargestChild);
        this.c.put("ignoreGravity", com.mbridge.msdk.config.dynamic.utils.c.ignoreGravity);
        this.c.put(DownloadService.KEY_FOREGROUND, com.mbridge.msdk.config.dynamic.utils.c.foreground);
        this.c.put("foregroundGravity", com.mbridge.msdk.config.dynamic.utils.c.foregroundGravity);
        this.c.put("measureAllChildren", com.mbridge.msdk.config.dynamic.utils.c.measureAllChildren);
        this.c.put(TtmlNode.TAG_STYLE, com.mbridge.msdk.config.dynamic.utils.c.style);
        this.c.put(NotificationCompat.CATEGORY_PROGRESS, com.mbridge.msdk.config.dynamic.utils.c.progress);
        this.c.put(InneractiveMediationNameConsts.MAX, com.mbridge.msdk.config.dynamic.utils.c.max);
        this.c.put("progressDrawable", com.mbridge.msdk.config.dynamic.utils.c.progressDrawable);
    }

    public int a(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            int indexOf = str.indexOf("d");
            int indexOf2 = str.indexOf("s");
            if (indexOf == -1) {
                indexOf = indexOf2;
            }
            int parseInt = Integer.parseInt(str.substring(0, indexOf));
            if (str.contains("d")) {
                return e.a(this.b, parseInt);
            }
            str.contains("s");
            return parseInt;
        }
    }

    public HashMap b() {
        SoftReference<HashMap<String, com.mbridge.msdk.config.dynamic.utils.c>> softReference = this.a;
        if (softReference == null || softReference.get() == null) {
            HashMap hashMap = new HashMap(45);
            hashMap.put("layout_width", com.mbridge.msdk.config.dynamic.utils.c.layout_width);
            hashMap.put("layout_height", com.mbridge.msdk.config.dynamic.utils.c.layout_height);
            hashMap.put(U3.i.n, com.mbridge.msdk.config.dynamic.utils.c.orientation);
            hashMap.put("layout_centerHorizontal", com.mbridge.msdk.config.dynamic.utils.c.layout_centerHorizontal);
            hashMap.put("layout_centerVertical", com.mbridge.msdk.config.dynamic.utils.c.layout_centerVertical);
            hashMap.put("layout_marginLeft", com.mbridge.msdk.config.dynamic.utils.c.layout_marginLeft);
            hashMap.put("layout_marginRight", com.mbridge.msdk.config.dynamic.utils.c.layout_marginRight);
            hashMap.put("layout_margin", com.mbridge.msdk.config.dynamic.utils.c.layout_margin);
            hashMap.put("layout_gravity", com.mbridge.msdk.config.dynamic.utils.c.layout_gravity);
            hashMap.put("layout_alignParentRight", com.mbridge.msdk.config.dynamic.utils.c.layout_alignParentRight);
            hashMap.put("layout_weight", com.mbridge.msdk.config.dynamic.utils.c.layout_weight);
            hashMap.put("contentDescription", com.mbridge.msdk.config.dynamic.utils.c.contentDescription);
            hashMap.put("gravity", com.mbridge.msdk.config.dynamic.utils.c.gravity);
            hashMap.put("id", com.mbridge.msdk.config.dynamic.utils.c.id);
            hashMap.put("layout_below", com.mbridge.msdk.config.dynamic.utils.c.layout_below);
            hashMap.put("layout_above", com.mbridge.msdk.config.dynamic.utils.c.layout_above);
            hashMap.put("layout_toLeftOf", com.mbridge.msdk.config.dynamic.utils.c.layout_toLeftOf);
            hashMap.put("layout_toRightOf", com.mbridge.msdk.config.dynamic.utils.c.layout_toRightOf);
            hashMap.put("layout_toEndOf", com.mbridge.msdk.config.dynamic.utils.c.layout_toEndOf);
            hashMap.put("background", com.mbridge.msdk.config.dynamic.utils.c.background);
            hashMap.put("layout_marginTop", com.mbridge.msdk.config.dynamic.utils.c.layout_marginTop);
            hashMap.put("layout_marginBottom", com.mbridge.msdk.config.dynamic.utils.c.layout_marginBottom);
            hashMap.put("layout_marginStart", com.mbridge.msdk.config.dynamic.utils.c.layout_marginStart);
            hashMap.put("layout_marginEnd", com.mbridge.msdk.config.dynamic.utils.c.layout_marginEnd);
            hashMap.put("layout_alignParentBottom", com.mbridge.msdk.config.dynamic.utils.c.layout_alignParentBottom);
            hashMap.put("layout_alignParentTop", com.mbridge.msdk.config.dynamic.utils.c.layout_alignParentTop);
            hashMap.put("layout_alignParentLeft", com.mbridge.msdk.config.dynamic.utils.c.layout_alignParentLeft);
            hashMap.put("layout_alignWithParentIfMissing", com.mbridge.msdk.config.dynamic.utils.c.layout_alignWithParentIfMissing);
            hashMap.put("layout_alignTop", com.mbridge.msdk.config.dynamic.utils.c.layout_alignTop);
            hashMap.put("layout_alignBottom", com.mbridge.msdk.config.dynamic.utils.c.layout_alignBottom);
            hashMap.put("layout_alignLeft", com.mbridge.msdk.config.dynamic.utils.c.layout_alignLeft);
            hashMap.put("layout_alignRight", com.mbridge.msdk.config.dynamic.utils.c.layout_alignRight);
            hashMap.put("layout_centerInParent", com.mbridge.msdk.config.dynamic.utils.c.layout_centerInParent);
            hashMap.put("layout_alignParentEnd", com.mbridge.msdk.config.dynamic.utils.c.layout_alignParentEnd);
            this.a = new SoftReference<>(hashMap);
        }
        return this.a.get();
    }

    public int c(String str) {
        int i;
        try {
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            int i2 = 0;
            for (String str2 : str.split("\\|")) {
                String lowerCase = str2.toLowerCase();
                switch (lowerCase.hashCode()) {
                    case -1633016142:
                        if (lowerCase.equals("fill_vertical")) {
                            i = 112;
                            i2 |= i;
                        }
                    case -1383228885:
                        if (lowerCase.equals("bottom")) {
                            i = 80;
                            i2 |= i;
                        }
                    case -1364013995:
                        if (lowerCase.equals(TtmlNode.CENTER)) {
                            i = 17;
                            i2 |= i;
                        }
                    case -483365792:
                        if (lowerCase.equals("fill_horizontal")) {
                            i = 7;
                            i2 |= i;
                        }
                    case -348726240:
                        if (lowerCase.equals("center_vertical")) {
                            i = 16;
                            i2 |= i;
                        }
                    case 100571:
                        if (lowerCase.equals(TtmlNode.END)) {
                            i = 8388613;
                            i2 |= i;
                        }
                    case 115029:
                        if (lowerCase.equals(PlayerKt.E_SPORTS_TOP)) {
                            i = 48;
                            i2 |= i;
                        }
                    case 3143043:
                        if (lowerCase.equals("fill")) {
                            i = Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
                            i2 |= i;
                        }
                    case 3317767:
                        if (lowerCase.equals("left")) {
                            i = 3;
                            i2 |= i;
                        }
                    case 108511772:
                        if (lowerCase.equals("right")) {
                            i = 5;
                            i2 |= i;
                        }
                    case 109757538:
                        if (lowerCase.equals("start")) {
                            i = 8388611;
                            i2 |= i;
                        }
                    case 1063616078:
                        if (lowerCase.equals("center_horizontal")) {
                            i = 1;
                            i2 |= i;
                        }
                    default:
                }
            }
            return i2;
        } catch (Exception e) {
            q0.b("ComponentResource", e.getMessage());
            return 0;
        }
    }

    public int e(String str) {
        try {
            if (!TextUtils.isEmpty(str) && str.startsWith("#")) {
                return Color.parseColor(str);
            }
            return 0;
        } catch (Exception e) {
            q0.b("ComponentResource", e.getMessage());
            return 0;
        }
    }

    public static c a() {
        if (d == null) {
            synchronized (c.class) {
                try {
                    if (d == null) {
                        d = new c();
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public int a(String str, String str2) {
        if (this.b == null) {
            return 0;
        }
        try {
            Context d2 = com.mbridge.msdk.foundation.controller.c.n().d();
            String i = com.mbridge.msdk.foundation.controller.c.n().i();
            if (TextUtils.isEmpty(i)) {
                i = this.b.getPackageName();
            }
            return d2.getResources().getIdentifier(str2, str, i);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public View a(String str, ViewGroup viewGroup, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (this.b != null) {
            try {
                return new b(this.b, aVar).a(str, viewGroup);
            } catch (Exception e) {
                q0.b("ComponentResource", e.getMessage());
            }
        }
        return null;
    }

    public HashMap<String, com.mbridge.msdk.config.dynamic.utils.c> c() {
        return this.c;
    }

    public int b(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("@color/")) {
            return 0;
        }
        return this.b.getResources().getColor(a("color", str.substring(7)));
    }

    public int d(String str) {
        if (this.b == null) {
            return 0;
        }
        String i = com.mbridge.msdk.foundation.controller.c.n().i();
        if (TextUtils.isEmpty(i)) {
            i = this.b.getPackageName();
        }
        StringBuilder p = bf3.p(i, ".R$");
        String[] split = str.split("\\.");
        p.append(split[1]);
        try {
            Class<?> cls = Class.forName(p.toString());
            Object newInstance = cls.newInstance();
            Field declaredField = cls.getDeclaredField(split[2]);
            declaredField.setAccessible(true);
            return ((Integer) declaredField.get(newInstance)).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
