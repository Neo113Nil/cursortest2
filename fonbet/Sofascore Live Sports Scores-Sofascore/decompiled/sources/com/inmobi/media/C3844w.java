package com.inmobi.media;

import android.content.Context;
import android.webkit.URLUtil;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.a70;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.hs4;
import defpackage.lu3;
import defpackage.rob;
import defpackage.sq3;
import defpackage.wba;
import defpackage.wv8;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z45;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3844w {
    public final Context a;
    public final Image b;
    public final AdConfig.AdChoiceConfig c;
    public final C3906y9 d;
    public final String e;

    public C3844w(Context context, Image image, AdConfig.AdChoiceConfig adChoiceConfig, C3906y9 c3906y9) {
        context.getClass();
        adChoiceConfig.getClass();
        this.a = context;
        this.b = image;
        this.c = adChoiceConfig;
        this.d = c3906y9;
        this.e = dmi.q("AdChoice-Image-", fc6.C());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (r0 == null) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Ld ld) {
        String url;
        int width;
        Image image;
        int height;
        Image image2 = this.b;
        if (image2 != null && (url = image2.getUrl()) != null) {
            if (!URLUtil.isNetworkUrl(url)) {
                url = null;
            }
        }
        url = this.c.getUrl();
        String str = url;
        Image image3 = this.b;
        if (image3 != null) {
            int width2 = image3.getWidth();
            Integer valueOf = Integer.valueOf(width2);
            if (width2 <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                width = valueOf.intValue();
                int i = width;
                image = this.b;
                if (image != null) {
                    int height2 = image.getHeight();
                    Integer valueOf2 = height2 > 0 ? Integer.valueOf(height2) : null;
                    if (valueOf2 != null) {
                        height = valueOf2.intValue();
                        int i2 = height;
                        int loadTimeout = this.c.getLoadTimeout();
                        if (URLUtil.isNetworkUrl(str)) {
                            hs4 hs4Var = z45.a;
                            return xw3.R(rob.a, new r(this, str, loadTimeout, i, i2, null), ld);
                        }
                        C3906y9 c3906y9 = this.d;
                        if (c3906y9 != null) {
                            wv8.x("Invalid URL: ", str, c3906y9, "AdChoiceViewManager");
                        }
                        throw new C3702qc();
                    }
                }
                height = this.c.getHeight();
                int i22 = height;
                int loadTimeout2 = this.c.getLoadTimeout();
                if (URLUtil.isNetworkUrl(str)) {
                }
            }
        }
        width = this.c.getWidth();
        int i3 = width;
        image = this.b;
        if (image != null) {
        }
        height = this.c.getHeight();
        int i222 = height;
        int loadTimeout22 = this.c.getLoadTimeout();
        if (URLUtil.isNetworkUrl(str)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C3844w c3844w, C3322bk c3322bk, String str, int i, sq3 sq3Var) {
        C3740s c3740s;
        int i2;
        c3844w.getClass();
        if (sq3Var instanceof C3740s) {
            c3740s = (C3740s) sq3Var;
            int i3 = c3740s.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c3740s.c = i3 - Integer.MIN_VALUE;
                Object obj = c3740s.a;
                lu3 lu3Var = lu3.a;
                i2 = c3740s.c;
                if (i2 != 0) {
                    y6a.M(obj);
                    C3818v c3818v = new C3818v(c3844w, str, c3322bk, null);
                    c3740s.c = 1;
                    obj = wba.V(i, c3818v, c3740s);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                Boolean bool = (Boolean) obj;
                return Boolean.valueOf(bool == null ? bool.booleanValue() : false);
            }
        }
        c3740s = new C3740s(c3844w, sq3Var);
        Object obj2 = c3740s.a;
        lu3 lu3Var2 = lu3.a;
        i2 = c3740s.c;
        if (i2 != 0) {
        }
        Boolean bool2 = (Boolean) obj2;
        return Boolean.valueOf(bool2 == null ? bool2.booleanValue() : false);
    }
}
