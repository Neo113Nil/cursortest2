package com.inmobi.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.URLUtil;
import defpackage.a70;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.lu3;
import defpackage.r69;
import defpackage.rob;
import defpackage.sq3;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z45;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Mj extends AbstractC3306b4 {
    public final Context a;
    public final C3906y9 b;
    public final String c;

    public Mj(Context context, C3906y9 c3906y9) {
        context.getClass();
        this.a = context;
        this.b = c3906y9;
        this.c = dmi.q("Static-Companion-", fc6.C());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (defpackage.xw3.R(r13, r6, r0) != r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        if (r15 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Mj mj, String str, C3322bk c3322bk, sq3 sq3Var) {
        Jj jj;
        int i;
        mj.getClass();
        if (sq3Var instanceof Jj) {
            jj = (Jj) sq3Var;
            int i2 = jj.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jj.e = i2 - Integer.MIN_VALUE;
                Object obj = jj.c;
                lu3 lu3Var = lu3.a;
                i = jj.e;
                if (i != 0) {
                    y6a.M(obj);
                    hs4 hs4Var = z45.a;
                    r69 r69Var = rob.a;
                    Lj lj = new Lj(mj, null);
                    jj.a = str;
                    jj.b = c3322bk;
                    jj.e = 1;
                    obj = xw3.R(r69Var, lj, jj);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c3322bk = jj.b;
                    str = jj.a;
                    y6a.M(obj);
                }
                String str2 = str;
                C3322bk c3322bk2 = c3322bk;
                hs4 hs4Var2 = z45.a;
                hq4 hq4Var = hq4.c;
                Kj kj = new Kj(c3322bk2, mj, str2, (Bitmap.Config) obj, null);
                jj.a = null;
                jj.b = null;
                jj.e = 2;
            }
        }
        jj = new Jj(mj, sq3Var);
        Object obj2 = jj.c;
        lu3 lu3Var2 = lu3.a;
        i = jj.e;
        if (i != 0) {
        }
        String str22 = str;
        C3322bk c3322bk22 = c3322bk;
        hs4 hs4Var22 = z45.a;
        hq4 hq4Var2 = hq4.c;
        Kj kj2 = new Kj(c3322bk22, mj, str22, (Bitmap.Config) obj2, null);
        jj.a = null;
        jj.b = null;
        jj.e = 2;
    }

    public final Object a(Qi qi, R3 r3) {
        if (URLUtil.isNetworkUrl(qi.a)) {
            hs4 hs4Var = z45.a;
            return xw3.R(rob.a, new Ij(this, qi, null), r3);
        }
        throw new C3676pc("Companion Invalid Resource Error");
    }
}
