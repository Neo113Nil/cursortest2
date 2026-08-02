package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.ads.nativeAd.MediaView;
import defpackage.aeh;
import defpackage.b1d;
import defpackage.beh;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.ku3;
import defpackage.sq3;
import defpackage.xw3;
import defpackage.z45;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.yc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3909yc {
    public final C3906y9 a;
    public AbstractC3640o2 b;
    public final MediaView c;
    public final F6 d;
    public final b1d e;

    public C3909yc(Context context, ku3 ku3Var, C3906y9 c3906y9) {
        context.getClass();
        ku3Var.getClass();
        this.a = c3906y9;
        aeh b = beh.b(0, 0, null, 7);
        this.c = new MediaView(context);
        this.d = new F6(context, ku3Var, b, c3906y9);
        this.e = b;
    }

    public final Object a(G6 g6, sq3 sq3Var) {
        C3906y9 c3906y9 = this.a;
        if (c3906y9 != null) {
            c3906y9.a("MediaViewManager", "load called - experienceModel: " + g6);
        }
        if (this.b != null) {
            return this.c;
        }
        hs4 hs4Var = z45.a;
        return xw3.R(hq4.c, new C3883xc(this, g6, null), sq3Var);
    }
}
