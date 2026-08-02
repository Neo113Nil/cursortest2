package com.moloco.sdk.acm.db;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.o;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.u;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y0;
import defpackage.a10;
import defpackage.b4h;
import defpackage.cv5;
import defpackage.dk9;
import defpackage.h5a;
import defpackage.ha5;
import defpackage.he3;
import defpackage.i3l;
import defpackage.jy0;
import defpackage.njh;
import defpackage.ud3;
import defpackage.xw3;
import defpackage.y3h;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(u uVar, com.moloco.sdk.common_adapter_internal.a aVar) {
        this.a = 9;
        this.b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 3;
        int i3 = 26;
        int i4 = 2;
        boolean z = true;
        int i5 = 4;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                j jVar = (j) obj2;
                jVar.getClass();
                break;
            case 1:
                String str = (String) obj2;
                b4h b4hVar = (b4h) obj;
                b4hVar.getClass();
                y3h.e(b4hVar, str);
                y3h.l(b4hVar, str);
                break;
            case 2:
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) obj;
                dVar.getClass();
                ((n) obj2).a(dVar);
                break;
            case 3:
                ((Long) obj).getClass();
                break;
            case 4:
                a10 a10Var = (a10) obj2;
                ha5 ha5Var = (ha5) obj;
                ha5Var.getClass();
                Bitmap bitmap = a10Var.a;
                float width = bitmap.getWidth();
                float height = bitmap.getHeight();
                float f = njh.f(ha5Var.n());
                float d = njh.d(ha5Var.n());
                for (float f2 = 0.0f; f2 < f; f2 += width) {
                    for (float f3 = 0.0f; f3 < d; f3 += height) {
                        ha5.x(ha5Var, a10Var, h5a.q(f2, f3), null, 60);
                    }
                }
                break;
            case 5:
                String str2 = (String) obj;
                str2.getClass();
                o oVar = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c) obj2).e;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.f.a.getClass();
                xw3.L(oVar.b, null, null, new i3l(oVar, p.b, null, 29), 3);
                k kVar = oVar.d;
                if (kVar != null) {
                    kVar.a(str2);
                }
                break;
            case 6:
                dk9 dk9Var = (dk9) obj;
                dk9Var.getClass();
                dk9Var.c = new he3(i4, new com.moloco.sdk.publisher.b(i2));
                dk9Var.b = new cv5(z, i5);
                ud3 ud3Var = new ud3(i3);
                dk9Var.f = 10;
                dk9Var.a = ud3Var;
                dk9Var.e = new com.moloco.sdk.publisher.b((com.moloco.sdk.internal.publisher.nativead.n) obj2, i5);
                break;
            case 7:
                dk9 dk9Var2 = (dk9) obj;
                dk9Var2.getClass();
                dk9Var2.c = new he3(i4, new com.moloco.sdk.publisher.b(5));
                dk9Var2.b = new cv5(z, i5);
                ud3 ud3Var2 = new ud3(i3);
                dk9Var2.f = 10;
                dk9Var2.a = ud3Var2;
                dk9Var2.e = new com.moloco.sdk.publisher.b((com.facebook.login.i) obj2, 6);
                break;
            case 8:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.j jVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.j) obj;
                jVar2.getClass();
                ((Function1) obj2).invoke(jVar2);
                break;
            case 9:
                List list = (List) obj;
                list.getClass();
                break;
            case 10:
                Context context = (Context) obj;
                context.getClass();
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.addView((View) obj2, new ViewGroup.LayoutParams(-1, -1));
                break;
            case 11:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.a aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.blur.a) obj2;
                ((Context) obj).getClass();
                break;
            case 12:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e eVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e) obj2;
                if (((Boolean) obj).booleanValue()) {
                    jy0 jy0Var = eVar.C;
                    if (Integer.compareUnsigned(jy0Var.a, 0) > 0) {
                        jy0Var.a(jy0Var.a & 4294967295L);
                    }
                } else {
                    eVar.a();
                }
                break;
            default:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) obj;
                dVar2.getClass();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i adShowListener = ((y0) obj2).getAdShowListener();
                if (adShowListener != null) {
                    adShowListener.a(f1.f(dVar2));
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ e(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
