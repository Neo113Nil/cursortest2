package com.moloco.sdk.internal.publisher.nativead;

import android.view.ViewParent;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.publisher.v0;
import com.moloco.sdk.internal.services.r;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.publisher.NativeAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o;
import defpackage.ad2;
import defpackage.dy9;
import defpackage.g9i;
import defpackage.hs4;
import defpackage.rob;
import defpackage.s9a;
import defpackage.xw3;
import defpackage.z45;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class d implements NativeAd, v0 {
    public final String a;
    public final m b;
    public final a c;
    public final r d;
    public final com.moloco.sdk.internal.services.events.c e;
    public final t0 f;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k g;
    public final dy9 h;
    public final com.moloco.sdk.acm.recorder.c i;
    public NativeAd.InteractionListener j;
    public final AdFormatType k;
    public final ad2 l;
    public final com.moloco.sdk.acm.h m;
    public com.moloco.sdk.acm.eventprocessing.f n;
    public g9i o;

    public d(String str, m mVar, a aVar, r rVar, com.moloco.sdk.internal.services.events.c cVar, t0 t0Var, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k kVar, dy9 dy9Var, com.moloco.sdk.acm.recorder.c cVar2) {
        str.getClass();
        this.a = str;
        this.b = mVar;
        this.c = aVar;
        this.d = rVar;
        this.e = cVar;
        this.f = t0Var;
        this.g = kVar;
        this.h = dy9Var;
        this.i = cVar2;
        this.k = AdFormatType.NATIVE;
        hs4 hs4Var = z45.a;
        this.l = s9a.c(rob.a);
        com.moloco.sdk.internal.client_metrics_data.c[] cVarArr = com.moloco.sdk.internal.client_metrics_data.c.b;
        this.m = cVar2.c("load_ad_time");
    }

    @Override // com.moloco.sdk.internal.publisher.v0
    public final void a(long j, long j2) {
        this.h.a(j, j2);
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public final void destroy() {
        s9a.o(this.l, null);
        a aVar = this.c;
        ViewParent viewParent = aVar.l;
        o oVar = viewParent != null ? (o) viewParent : null;
        if (oVar != null) {
            oVar.destroy();
        }
        aVar.l = null;
        this.j = null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd
    public final NativeAd.Assets getAssets() {
        return this.c;
    }

    @Override // com.moloco.sdk.publisher.NativeAd
    public final NativeAd.InteractionListener getInteractionListener() {
        return this.j;
    }

    @Override // com.moloco.sdk.publisher.NativeAd
    public final void handleGeneralAdClick() {
        NativeAd.InteractionListener interactionListener = this.j;
        if (interactionListener != null) {
            interactionListener.onGeneralClickHandled();
        }
        com.moloco.sdk.acm.eventprocessing.f fVar = this.n;
        if (fVar != null) {
            com.moloco.sdk.internal.publisher.nativead.model.g gVar = ((com.moloco.sdk.internal.publisher.nativead.model.h) fVar.c).b;
            if (gVar != null) {
                n nVar = (n) fVar.f;
                List<String> list = gVar.b;
                LinkedHashSet linkedHashSet = (LinkedHashSet) nVar.d;
                list.getClass();
                for (String str : list) {
                    if (!linkedHashSet.contains(str)) {
                        ((com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k) nVar.c).a(str);
                        linkedHashSet.add(str);
                    }
                }
                ((t0) fVar.d).a(gVar.a);
            }
            ((com.moloco.sdk.internal.publisher.b) fVar.e).onAdClicked(MolocoAdKt.createAdInfo$default((String) fVar.a, null, null, 6, null));
        }
    }

    @Override // com.moloco.sdk.publisher.NativeAd
    public final void handleImpression() {
        NativeAd.InteractionListener interactionListener = this.j;
        if (interactionListener != null) {
            interactionListener.onImpressionHandled();
        }
        com.moloco.sdk.acm.eventprocessing.f fVar = this.n;
        if (fVar != null) {
            n nVar = (n) fVar.f;
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k kVar = (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k) nVar.c;
            List list = (List) nVar.a;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    kVar.a((String) it.next());
                }
            }
            nVar.a = null;
            List<com.moloco.sdk.internal.publisher.nativead.model.f> list2 = (List) nVar.b;
            if (list2 != null) {
                for (com.moloco.sdk.internal.publisher.nativead.model.f fVar2 : list2) {
                    String str = fVar2.c;
                    if (str != null && fVar2.a == 1 && fVar2.b == 1) {
                        kVar.a(str);
                    }
                }
            }
            nVar.b = null;
            ((com.moloco.sdk.internal.publisher.b) fVar.e).c(MolocoAdKt.createAdInfo$default((String) fVar.a, null, null, 6, null), null);
        }
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public final boolean isLoaded() {
        return this.c.i != null;
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public final synchronized void load(String str, AdLoad.Listener listener) {
        str.getClass();
        g9i g9iVar = this.o;
        if (g9iVar != null && g9iVar.isActive()) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "NativeAdImpl", "load() called while another load operation is in progress. Ignoring this call.", null, false, 12, null);
        } else if (isLoaded()) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "NativeAdImpl", "load() called but ad is already loaded. Ignoring this call.", null, false, 12, null);
        } else {
            this.o = xw3.L(this.l, null, null, new c(this, listener, str, null), 3);
        }
    }

    @Override // com.moloco.sdk.publisher.NativeAd
    public final void setInteractionListener(NativeAd.InteractionListener interactionListener) {
        this.j = interactionListener;
    }
}
