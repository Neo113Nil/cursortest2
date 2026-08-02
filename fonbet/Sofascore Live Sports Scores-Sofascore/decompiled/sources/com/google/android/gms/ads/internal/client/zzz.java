package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.R;
import com.ironsource.mediationsdk.j;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzz {
    public final AdSize[] a;
    public final String b;

    public zzz(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.AdsAttrs);
        String string = obtainAttributes.getString(R.styleable.AdsAttrs_adSize);
        String string2 = obtainAttributes.getString(R.styleable.AdsAttrs_adSizes);
        boolean isEmpty = TextUtils.isEmpty(string);
        boolean isEmpty2 = TextUtils.isEmpty(string2);
        if (!isEmpty && isEmpty2) {
            this.a = a(string);
        } else {
            if (!isEmpty || isEmpty2) {
                if (isEmpty) {
                    obtainAttributes.recycle();
                    a70.p("Required XML attribute \"adSize\" was missing.");
                    throw null;
                }
                obtainAttributes.recycle();
                a70.p("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
                throw null;
            }
            this.a = a(string2);
        }
        String string3 = obtainAttributes.getString(R.styleable.AdsAttrs_adUnitId);
        this.b = string3;
        obtainAttributes.recycle();
        if (TextUtils.isEmpty(string3)) {
            a70.p("Required XML attribute \"adUnitId\" was missing.");
            throw null;
        }
    }

    public static AdSize[] a(String str) {
        String[] split = str.split("\\s*,\\s*");
        int length = split.length;
        AdSize[] adSizeArr = new AdSize[length];
        for (int i = 0; i < split.length; i++) {
            String trim = split[i].trim();
            if (trim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] split2 = trim.split("[xX]");
                split2[0] = split2[0].trim();
                split2[1] = split2[1].trim();
                try {
                    String str2 = split2[0];
                    int parseInt = "FULL_WIDTH".equals(str2) ? -1 : Integer.parseInt(str2);
                    String str3 = split2[1];
                    adSizeArr[i] = new AdSize(parseInt, "AUTO_HEIGHT".equals(str3) ? -2 : Integer.parseInt(str3));
                } catch (NumberFormatException unused) {
                    a70.p("Could not parse XML attribute \"adSize\": ".concat(trim));
                    return null;
                }
            } else if (j.a.equals(trim)) {
                adSizeArr[i] = AdSize.BANNER;
            } else if ("LARGE_BANNER".equals(trim)) {
                adSizeArr[i] = AdSize.LARGE_BANNER;
            } else if ("FULL_BANNER".equals(trim)) {
                adSizeArr[i] = AdSize.FULL_BANNER;
            } else if (j.d.equals(trim)) {
                adSizeArr[i] = AdSize.LEADERBOARD;
            } else if (j.g.equals(trim)) {
                adSizeArr[i] = AdSize.MEDIUM_RECTANGLE;
            } else if ("SMART_BANNER".equals(trim)) {
                adSizeArr[i] = AdSize.SMART_BANNER;
            } else if ("WIDE_SKYSCRAPER".equals(trim)) {
                adSizeArr[i] = AdSize.WIDE_SKYSCRAPER;
            } else if ("FLUID".equals(trim)) {
                adSizeArr[i] = AdSize.FLUID;
            } else {
                if (!NativeAdContent.ViewTag.AD_ICON.equals(trim)) {
                    a70.p("Could not parse XML attribute \"adSize\": ".concat(trim));
                    return null;
                }
                adSizeArr[i] = AdSize.zza;
            }
        }
        if (length != 0) {
            return adSizeArr;
        }
        a70.p("Could not parse XML attribute \"adSize\": ".concat(str));
        return null;
    }

    public final AdSize[] zza(boolean z) {
        AdSize[] adSizeArr = this.a;
        if (z || adSizeArr.length == 1) {
            return adSizeArr;
        }
        a70.p("The adSizes XML attribute is only allowed on PublisherAdViews.");
        return null;
    }

    public final String zzb() {
        return this.b;
    }
}
