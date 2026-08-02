package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import android.graphics.Bitmap;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;
import defpackage.av8;
import defpackage.eqf;
import defpackage.of3;
import defpackage.tc3;
import defpackage.yqo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class b implements t {
    public final String a;

    public b(String str) {
        this.a = str;
    }

    public final void a(final tc3 tc3Var, of3 of3Var, final int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(412679763);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (av8Var.g(tc3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(this) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && av8Var.D()) {
            av8Var.W();
        } else {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.s.n(this.a, yqo.y(586795374, av8Var, new com.moloco.sdk.internal.publisher.nativead.ui.d(tc3Var, i3)), av8Var, 48);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int i4 = i | 1;
                    b.this.a(tc3Var, (of3) obj, i4);
                    return Unit.a;
                }
            };
        }
    }

    public final void b(View view) {
        view.getClass();
        Bitmap f = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.s.f(this.a);
        if (f == null) {
            return;
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(f1.e(null).getResources(), f);
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        bitmapDrawable.setTileModeXY(tileMode, tileMode);
        bitmapDrawable.setTargetDensity(f1.e(null).getResources().getDisplayMetrics());
        view.setForeground(bitmapDrawable);
        view.setClickable(false);
        view.setFocusable(false);
        view.setContentDescription("Watermark Overlay");
        view.setTag("Watermark Overlay");
    }
}
