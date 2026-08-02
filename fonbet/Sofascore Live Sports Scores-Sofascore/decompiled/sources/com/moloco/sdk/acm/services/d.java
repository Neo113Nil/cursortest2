package com.moloco.sdk.acm.services;

import android.content.Context;
import android.os.PowerManager;
import com.facebook.internal.t;
import com.moloco.sdk.acm.eventprocessing.f;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.e;
import com.moloco.sdk.internal.h;
import com.moloco.sdk.internal.ilrd.i;
import com.moloco.sdk.internal.ilrd.j;
import com.moloco.sdk.internal.ortb.model.y;
import com.moloco.sdk.internal.publisher.d0;
import com.moloco.sdk.internal.publisher.g;
import com.moloco.sdk.internal.publisher.nativead.model.n;
import com.moloco.sdk.internal.services.s;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y0;
import defpackage.ar3;
import defpackage.e1d;
import defpackage.fc6;
import defpackage.fsf;
import defpackage.k13;
import defpackage.kif;
import defpackage.o13;
import defpackage.sub;
import defpackage.tub;
import defpackage.un0;
import defpackage.weh;
import defpackage.yda;
import defpackage.yf4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x01e7, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) != false) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        e eVar;
        String str;
        String str2;
        int i = this.a;
        int i2 = 6;
        kif kifVar = weh.a;
        int i3 = 3;
        char c = 1;
        char c2 = 1;
        char c3 = 1;
        String str3 = 0;
        str3 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                Object systemService = ((Context) ((t) obj).b).getSystemService("power");
                systemService.getClass();
                return (PowerManager) systemService;
            case 1:
                eVar = (e) obj;
                try {
                    Object invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, "debug.moloco.internal_logging");
                    invoke.getClass();
                    str = (String) invoke;
                    try {
                        break;
                    } catch (Exception unused) {
                        break;
                    }
                } catch (Exception unused2) {
                    break;
                }
            case 2:
                return Boolean.valueOf(((h) obj).a.p());
            case 3:
                i iVar = ((j) obj).b;
                return (iVar == null || (str2 = iVar.a) == null) ? fc6.C() : str2;
            case 4:
                g gVar = (g) obj;
                if (gVar.e) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "RewardedInterstitialAdShowListenerImpl", "onCloseOrSkipButtonShown called - granting reward as skip button is now available (feature flag enabled)", null, false, 12, null);
                    gVar.a(MolocoAdKt.createAdInfo$default(gVar.d, null, null, 6, null));
                } else {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "RewardedInterstitialAdShowListenerImpl", "onCloseOrSkipButtonShown called - skip button shown but reward requires user click (feature flag disabled)", null, false, 12, null);
                }
                return Unit.a;
            case 5:
                return ((y) obj).d.d;
            case 6:
                String str4 = ((y) ((f) obj).b).c;
                if (str4 != null) {
                    return new d0(str4);
                }
                return null;
            case 7:
                n nVar = (n) obj;
                return tub.k(tub.k(tub.k(nVar.a, nVar.b), nVar.c), nVar.d);
            case 8:
                return Boolean.valueOf(((s) obj).a.getResources().getConfiguration().smallestScreenWidthDp >= 600);
            case 9:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.f.d((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.f) obj);
            case 10:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h hVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h) obj;
                return un0.K(new yf4(hVar.h, hVar.f.g, new ar3(i3, str3, 4), c == true ? 1 : 0), hVar.e, kifVar, Boolean.FALSE);
            case 11:
                k kVar = (k) obj;
                return un0.K(new yf4(kVar.k, kVar.i.l(), new ar3(i3, str3, 5), c2 == true ? 1 : 0), kVar.d, kifVar, Boolean.FALSE);
            case 12:
                fsf fsfVar = (fsf) obj;
                yda ydaVar = (yda) fsfVar.a;
                if (ydaVar != null) {
                    ydaVar.e(null);
                }
                fsfVar.a = null;
                return Unit.a;
            case 13:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c) obj;
                cVar.c = null;
                cVar.d = null;
                cVar.e = null;
                return Unit.a;
            case 14:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.b bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.b) obj;
                return un0.K(new yf4(bVar.g, bVar.d.g, new ar3(i3, str3, i2), c3 == true ? 1 : 0), bVar.b, kifVar, Boolean.FALSE);
            case 15:
                Set set = (Set) ((com.facebook.login.i) obj).b;
                ArrayList arrayList = new ArrayList();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    o13.v(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a) it.next()).a(), arrayList);
                }
                int c4 = sub.c(k13.r(arrayList, 10));
                if (c4 < 16) {
                    c4 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(c4);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    String str5 = (String) next;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : set) {
                        if (((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a) obj2).a().contains(str5)) {
                            arrayList2.add(obj2);
                        }
                    }
                    linkedHashMap.put(next, arrayList2);
                }
                return linkedHashMap;
            case 16:
                ((Function1) obj).invoke("https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html");
                return Unit.a;
            case 17:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g gVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g) obj;
                ((com.moloco.sdk.internal.ilrd.n) gVar2.k).b((com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g) gVar2.j);
                gVar2.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a.a);
                return Unit.a;
            case 18:
                Boolean bool = (Boolean) ((e1d) obj).getValue();
                bool.getClass();
                return bool;
            default:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i adShowListener = ((y0) obj).getAdShowListener();
                if (adShowListener != null) {
                    adShowListener.b();
                }
                return Unit.a;
        }
        str3 = str;
        eVar.a = Boolean.parseBoolean(str3);
        return Unit.a;
        eVar.a = Boolean.parseBoolean(str3);
        return Unit.a;
    }
}
