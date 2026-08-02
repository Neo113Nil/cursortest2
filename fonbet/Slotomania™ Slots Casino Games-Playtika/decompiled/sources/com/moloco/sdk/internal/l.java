package com.moloco.sdk.internal;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C2829i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C2830j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C2831k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C2832l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C2836p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class l {
    public static final C2829i a(com.moloco.sdk.internal.ortb.model.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        com.moloco.sdk.internal.ortb.model.n appName = lVar.getAppName();
        String e = appName != null ? appName.e() : null;
        String ctaUrl = lVar.getCtaUrl();
        String ctaTrackingUrl = lVar.getCtaTrackingUrl();
        String impressionTrackingUrl = lVar.getImpressionTrackingUrl();
        String skipToDecTrackingUrl = lVar.getSkipToDecTrackingUrl();
        com.moloco.sdk.internal.ortb.model.n appName2 = lVar.getAppName();
        Integer c = appName2 != null ? appName2.c() : null;
        com.moloco.sdk.internal.ortb.model.p decCta = lVar.getDecCta();
        C2832l a = decCta != null ? a(decCta) : null;
        com.moloco.sdk.internal.ortb.model.m decAppIcon = lVar.getDecAppIcon();
        C2830j a2 = decAppIcon != null ? a(decAppIcon) : null;
        com.moloco.sdk.internal.ortb.model.q decRating = lVar.getDecRating();
        return new C2829i(e, ctaUrl, ctaTrackingUrl, impressionTrackingUrl, skipToDecTrackingUrl, c, a, a2, decRating != null ? a(decRating) : null);
    }

    public static final C2832l a(com.moloco.sdk.internal.ortb.model.p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Integer t = pVar.t();
        String n = pVar.n();
        Integer l = pVar.l();
        Integer p = pVar.p();
        com.moloco.sdk.internal.ortb.model.o j = pVar.j();
        return new C2832l(t, n, l, p, j != null ? a(j) : null, pVar.r(), pVar.h());
    }

    public static final C2830j a(com.moloco.sdk.internal.ortb.model.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Integer h = mVar.h();
        String d = mVar.d();
        com.moloco.sdk.internal.ortb.model.o f = mVar.f();
        return new C2830j(h, d, f != null ? a(f) : null);
    }

    public static final C2836p a(com.moloco.sdk.internal.ortb.model.q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Float l = qVar.l();
        String j = qVar.j();
        if (j == null) {
            j = "#FFFFFF00";
        }
        String str = j;
        String f = qVar.f();
        if (f == null) {
            f = "#FF888888";
        }
        String str2 = f;
        Integer n = qVar.n();
        int intValue = n != null ? n.intValue() : 12;
        Integer h = qVar.h();
        return new C2836p(l, str, str2, intValue, h != null ? h.intValue() : 9);
    }

    public static final C2831k a(com.moloco.sdk.internal.ortb.model.o oVar) {
        List list;
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        List<com.moloco.sdk.internal.ortb.model.t> f = oVar.f();
        if (f != null) {
            list = new ArrayList(CollectionsKt.collectionSizeOrDefault(f, 10));
            Iterator<T> it = f.iterator();
            while (it.hasNext()) {
                list.add(((com.moloco.sdk.internal.ortb.model.t) it.next()).b());
            }
        } else {
            list = null;
        }
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        return new C2831k(oVar.d(), list);
    }
}
