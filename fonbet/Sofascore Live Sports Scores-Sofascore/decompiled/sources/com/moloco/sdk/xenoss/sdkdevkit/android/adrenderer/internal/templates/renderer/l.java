package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.moloco.sdk.internal.MolocoLogger;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lnb;
import defpackage.lu3;
import defpackage.me4;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class l extends hoi implements Function2 {
    public final /* synthetic */ Bitmap r;
    public final /* synthetic */ float s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Bitmap bitmap, float f, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = bitmap;
        this.s = f;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new l(this.r, this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        Bitmap bitmap = this.r;
        int height = bitmap.getHeight() * bitmap.getWidth();
        int[] iArr = new int[height];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i >= height) {
                break;
            }
            int i5 = iArr[i];
            int alpha = Color.alpha(i5);
            boolean z = alpha >= 200;
            if (z) {
                i3++;
            } else if (alpha < 50) {
                i4++;
            }
            if (z && Color.red(i5) < 10 && Color.green(i5) < 10 && Color.blue(i5) < 10) {
                i2++;
            }
            i++;
        }
        float f = i2 / height;
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder s = lnb.s(height, i3, "Pixel breakdown: total=", ", opaque=", ", transparent=");
        me4.q(s, i4, ", opaqueBlack=", i2, ", opaqueBlackRatio=");
        s.append(f);
        MolocoLogger.info$default(molocoLogger, "WebViewRenderingChecker", s.toString(), null, false, 12, null);
        return Boolean.valueOf(f >= this.s);
    }
}
