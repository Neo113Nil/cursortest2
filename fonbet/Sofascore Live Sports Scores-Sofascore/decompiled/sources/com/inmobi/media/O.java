package com.inmobi.media;

import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import defpackage.k13;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class O implements Runnable {
    public final /* synthetic */ U a;

    public O(U u) {
        this.a = u;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f;
        M6 m6;
        M a = U.a(this.a);
        U u = this.a;
        u.getClass();
        ArrayList arrayList = null;
        if (a == null) {
            m6 = new M6(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null);
        } else {
            RectF rectF = a.a;
            if (rectF.isEmpty()) {
                m6 = new M6(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null);
            } else {
                float measuredHeight = u.a.getMeasuredHeight() * u.a.getMeasuredWidth();
                if (measuredHeight <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    m6 = new M6(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    int[] iArr = new int[2];
                    u.a.getLocationInWindow(iArr);
                    float f2 = iArr[0];
                    float f3 = iArr[1];
                    Float valueOf = Float.valueOf(f2);
                    Float valueOf2 = Float.valueOf(f3);
                    float floatValue = valueOf.floatValue();
                    float floatValue2 = valueOf2.floatValue();
                    Iterator it = a.b.iterator();
                    while (it.hasNext()) {
                        RectF rectF2 = (RectF) it.next();
                        arrayList2.add(new RectF(rectF2.left - floatValue, rectF2.top - floatValue2, rectF2.right - floatValue, rectF2.bottom - floatValue2));
                    }
                    ArrayList arrayList3 = a.b;
                    if (arrayList3.isEmpty()) {
                        f = 0.0f;
                    } else {
                        Iterator it2 = arrayList3.iterator();
                        f = 0.0f;
                        while (it2.hasNext()) {
                            RectF rectF3 = (RectF) it2.next();
                            f += rectF3.height() * rectF3.width();
                        }
                    }
                    float min = Math.min(f, measuredHeight);
                    RectF rectF4 = new RectF(rectF);
                    float width = rectF4.width();
                    float height = rectF4.height();
                    float a2 = N3.a(Math.min((Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((width <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || height <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? 0.0f : Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width * height)) - min) / measuredHeight) * 100.0f, 100.0f));
                    N6 n6 = new N6(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, N3.a(rectF.left / R5.b())), Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, N3.a(rectF.top / R5.b())), Math.max(0, N3.b(rectF.width() / R5.b())), Math.max(0, N3.b(rectF.height() / R5.b())));
                    if (!arrayList2.isEmpty()) {
                        ArrayList arrayList4 = new ArrayList(k13.r(arrayList2, 10));
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            RectF rectF5 = (RectF) it3.next();
                            arrayList4.add(new N6(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, N3.a(rectF5.left / R5.b())), Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, N3.a(rectF5.top / R5.b())), Math.max(0, N3.b(rectF5.width() / R5.b())), Math.max(0, N3.b(N3.b(rectF5.height()) / R5.b()))));
                        }
                        arrayList = new ArrayList(CollectionsKt.H0(arrayList4, new P()));
                    }
                    m6 = new M6(a2, n6, arrayList);
                }
            }
        }
        U u2 = this.a;
        if (m6.equals(u2.h)) {
            return;
        }
        ((C3552ki) u2.d).a(m6);
        u2.h = m6;
    }
}
