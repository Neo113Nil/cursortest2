package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import android.util.Xml;
import defpackage.a70;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.lu3;
import defpackage.luj;
import defpackage.n4o;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z45;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class z {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064 A[Catch: all -> 0x002a, TryCatch #3 {all -> 0x002a, blocks: (B:12:0x0026, B:13:0x0060, B:15:0x0064, B:19:0x006a), top: B:11:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #3 {all -> 0x002a, blocks: (B:12:0x0026, B:13:0x0060, B:15:0x0064, B:19:0x006a), top: B:11:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, sq3 sq3Var) {
        y yVar;
        int i;
        StringReader stringReader;
        Throwable th;
        try {
            if (sq3Var instanceof y) {
                yVar = (y) sq3Var;
                int i2 = yVar.u;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    yVar.u = i2 - Integer.MIN_VALUE;
                    Object obj = yVar.s;
                    lu3 lu3Var = lu3.a;
                    i = yVar.u;
                    rq3 rq3Var = null;
                    if (i != 0) {
                        y6a.M(obj);
                        StringReader stringReader2 = new StringReader(str);
                        try {
                            XmlPullParser newPullParser = Xml.newPullParser();
                            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
                            newPullParser.setInput(stringReader2);
                            yVar.r = stringReader2;
                            yVar.u = 1;
                            hs4 hs4Var = z45.a;
                            Object R = xw3.R(hq4.c, new luj(newPullParser, rq3Var, 24), yVar);
                            if (R == lu3Var) {
                                return lu3Var;
                            }
                            stringReader = stringReader2;
                            obj = R;
                        } catch (Throwable th2) {
                            stringReader = stringReader2;
                            th = th2;
                            throw th;
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        stringReader = yVar.r;
                        try {
                            y6a.M(obj);
                        } catch (Throwable th3) {
                            th = th3;
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                n4o.x(stringReader, th);
                                throw th4;
                            }
                        }
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d0 d0Var = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d0) obj;
                    Object k0Var = d0Var == null ? new com.moloco.sdk.internal.k0(d0Var) : new com.moloco.sdk.internal.j0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.c);
                    n4o.x(stringReader, null);
                    return k0Var;
                }
            }
            if (i != 0) {
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d0 d0Var2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d0) obj;
            if (d0Var2 == null) {
            }
            n4o.x(stringReader, null);
            return k0Var;
        } catch (Exception unused) {
            return new com.moloco.sdk.internal.j0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.b);
        }
        yVar = new y(this, sq3Var);
        Object obj2 = yVar.s;
        lu3 lu3Var2 = lu3.a;
        i = yVar.u;
        rq3 rq3Var2 = null;
    }
}
