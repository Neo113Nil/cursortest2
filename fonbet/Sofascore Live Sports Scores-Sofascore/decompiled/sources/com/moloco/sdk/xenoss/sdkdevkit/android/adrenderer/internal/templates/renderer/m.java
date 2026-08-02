package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.moloco.sdk.internal.MolocoLogger;
import defpackage.a70;
import defpackage.hs4;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z45;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class m {
    public static final m a = new m();

    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(f fVar, float f, sq3 sq3Var) {
        k kVar;
        int i;
        Bitmap bitmap;
        Throwable th;
        if (sq3Var instanceof k) {
            kVar = (k) sq3Var;
            int i2 = kVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.u = i2 - Integer.MIN_VALUE;
                Object obj = kVar.s;
                lu3 lu3Var = lu3.a;
                i = kVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    int width = fVar.getWidth();
                    int height = fVar.getHeight();
                    if (width <= 0 || height <= 0) {
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, "WebViewRenderingChecker", "Skipping rendering check: WebView has zero size (" + width + 'x' + height + ')', null, false, 12, null);
                        return Boolean.FALSE;
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    createBitmap.getClass();
                    try {
                        fVar.draw(new Canvas(createBitmap));
                        hs4 hs4Var = z45.a;
                        l lVar = new l(createBitmap, f, null);
                        kVar.r = createBitmap;
                        kVar.u = 1;
                        Object R = xw3.R(hs4Var, lVar, kVar);
                        if (R == lu3Var) {
                            return lu3Var;
                        }
                        bitmap = createBitmap;
                        obj = R;
                    } catch (Throwable th2) {
                        bitmap = createBitmap;
                        th = th2;
                        bitmap.recycle();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bitmap = kVar.r;
                    try {
                        y6a.M(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        bitmap.recycle();
                        throw th;
                    }
                }
                Boolean bool = (Boolean) obj;
                bool.getClass();
                bitmap.recycle();
                return bool;
            }
        }
        kVar = new k(this, sq3Var);
        Object obj2 = kVar.s;
        lu3 lu3Var2 = lu3.a;
        i = kVar.u;
        if (i != 0) {
        }
        Boolean bool2 = (Boolean) obj2;
        bool2.getClass();
        bitmap.recycle();
        return bool2;
    }
}
