package com.vk.movika.sdk.android.defaultplayer.container;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.View;
import com.vk.movika.sdk.android.defaultplayer.control.k;
import com.vk.movika.sdk.android.defaultplayer.view.b;
import com.vk.movika.sdk.base.model.LayoutParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.brm0;
import xsna.drm0;
import xsna.epx;
import xsna.go9;
import xsna.j8y;
import xsna.q1t;

/* loaded from: classes3.dex */
public final class b extends g {
    public final com.vk.movika.sdk.base.model.f i;
    public final com.vk.movika.sdk.base.interactive.a j;
    public final com.vk.movika.sdk.android.defaultplayer.control.b k;
    public final com.vk.movika.sdk.android.defaultplayer.interactive.c l;
    public final com.vk.movika.sdk.android.defaultplayer.layout.b m;
    public final ArrayList n;

    public b(com.vk.movika.sdk.base.model.f fVar, com.vk.movika.sdk.base.interactive.a aVar, com.vk.movika.sdk.android.defaultplayer.layout.a aVar2, com.vk.movika.sdk.android.defaultplayer.control.b bVar, boolean z, boolean z2, com.vk.movika.sdk.android.defaultplayer.control.c cVar, com.vk.movika.sdk.android.defaultplayer.interactive.c cVar2) {
        super(z, z2);
        com.vk.movika.sdk.android.defaultplayer.control.a kVar;
        LayoutParams layoutParams;
        this.i = fVar;
        this.j = aVar;
        this.k = bVar;
        this.l = cVar2;
        String str = fVar.e.a;
        Context context = aVar2.a;
        if (!drm0.p0(str).toString().toLowerCase(Locale.US).equals("relative")) {
            throw new IllegalArgumentException("Unsupported layout type ".concat(str));
        }
        this.m = new com.vk.movika.sdk.android.defaultplayer.layout.b(context);
        this.n = new ArrayList();
        Iterator it = fVar.g.iterator();
        while (it.hasNext()) {
            com.vk.movika.sdk.base.model.g gVar = (com.vk.movika.sdk.base.model.g) it.next();
            com.vk.movika.sdk.android.defaultplayer.control.b bVar2 = this.k;
            bVar2.getClass();
            String obj = drm0.p0(gVar.c).toString();
            if (brm0.w(obj, "Button", true) || brm0.w(obj, "Text", true)) {
                j8y j8yVar = bVar2.e;
                Context context2 = bVar2.a;
                q1t q1tVar = bVar2.b;
                kVar = new k(j8yVar, context2, gVar, q1tVar != null ? (Typeface) q1tVar.b : null, bVar2.c, bVar2.d);
            } else {
                if (!brm0.w(obj, "Area", true)) {
                    throw new IllegalArgumentException(go9.b("Unsupported type of control ", obj));
                }
                kVar = new com.vk.movika.sdk.android.defaultplayer.control.f(bVar2.e, bVar2.a, gVar, bVar2.c);
            }
            String str2 = gVar.c;
            LayoutParams layoutParams2 = gVar.e;
            if (epx.f(str2, "Area")) {
                com.vk.movika.sdk.android.defaultplayer.layout.b bVar3 = this.m;
                View u0 = kVar.u0();
                if (layoutParams2 != null) {
                    Double d = layoutParams2.a;
                    double doubleValue = d != null ? d.doubleValue() : ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                    com.vk.movika.sdk.android.defaultplayer.control.g.Companion.getClass();
                    RectF rectF = com.vk.movika.sdk.android.defaultplayer.control.g.d;
                    Double valueOf = Double.valueOf(doubleValue + rectF.left);
                    Double d2 = layoutParams2.b;
                    Double valueOf2 = Double.valueOf((d2 != null ? d2.doubleValue() : ConnectivityTracker.DEFAULT_UPLINK_BITRATE) + rectF.top);
                    Double d3 = layoutParams2.c;
                    Double valueOf3 = Double.valueOf((d3 != null ? d3.doubleValue() : ConnectivityTracker.DEFAULT_UPLINK_BITRATE) + rectF.right);
                    Double d4 = layoutParams2.d;
                    layoutParams = new LayoutParams(valueOf, valueOf2, valueOf3, Double.valueOf((d4 != null ? d4.doubleValue() : ConnectivityTracker.DEFAULT_UPLINK_BITRATE) + rectF.bottom), layoutParams2.e, layoutParams2.f);
                } else {
                    layoutParams = null;
                }
                com.vk.movika.sdk.android.defaultplayer.view.b bVar4 = bVar3.a;
                if (u0 != null) {
                    if (layoutParams == null) {
                        bVar4.addView(u0);
                    } else {
                        Double d5 = layoutParams.a;
                        double doubleValue2 = d5 != null ? d5.doubleValue() : ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                        Double d6 = layoutParams.b;
                        double doubleValue3 = d6 != null ? d6.doubleValue() : ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                        Double d7 = layoutParams.c;
                        double doubleValue4 = d7 != null ? d7.doubleValue() : 1.0d;
                        Double d8 = layoutParams.d;
                        b.a aVar3 = new b.a(doubleValue2, doubleValue3, doubleValue4, d8 != null ? d8.doubleValue() : 1.0d);
                        Double d9 = layoutParams.e;
                        if (d9 != null) {
                            u0.setRotation(-((float) Math.toDegrees(d9.doubleValue())));
                        }
                        bVar4.addView(u0, aVar3);
                    }
                }
            }
            this.m.a(kVar, layoutParams2);
            this.n.add(kVar);
            if (this.a && com.vk.movika.sdk.base.utils.d.c(this.i) && kVar.r0()) {
                kVar.w0(this.l);
            }
            kVar.x0(this.h);
            kVar.A0(new a(this, gVar));
        }
    }
}
