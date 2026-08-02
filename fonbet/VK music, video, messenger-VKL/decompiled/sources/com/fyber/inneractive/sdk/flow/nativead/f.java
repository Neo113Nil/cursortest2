package com.fyber.inneractive.sdk.flow.nativead;

import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.flow.w0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes12.dex */
public final class f implements com.fyber.inneractive.sdk.flow.nativead.mainasset.c {
    public static final String m = IAlog.a(f.class);
    public static final Object n = new Object();
    public final com.fyber.inneractive.sdk.response.nativead.i c;
    public t0 e;
    public d f;
    public final InneractiveAdRequest h;
    public final com.fyber.inneractive.sdk.config.global.r i;
    public final String j;
    public final com.fyber.inneractive.sdk.response.nativead.j k;
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final ArrayList d = new ArrayList();
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final e l = new e(this);

    public f(com.fyber.inneractive.sdk.config.global.r rVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.nativead.j jVar, com.fyber.inneractive.sdk.response.nativead.i iVar, d dVar, String str) {
        this.i = rVar;
        this.k = jVar;
        this.h = inneractiveAdRequest;
        this.c = iVar;
        this.f = dVar;
        this.j = str;
    }

    public final void a(InneractiveInfrastructureError inneractiveInfrastructureError, String str) {
        IAlog.f("%sonMainAssetLoadFailed: %s", m, str != null ? "Failed to load native main media with message ".concat(str) : "Failed to load native main media");
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.a()) {
                cVar.destroy();
            }
        }
        String description = inneractiveInfrastructureError.description();
        if (this.g.compareAndSet(false, true)) {
            InneractiveInfrastructureError inneractiveInfrastructureError2 = new InneractiveInfrastructureError(InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, com.fyber.inneractive.sdk.flow.i.NATIVE_AD_EMPTY_CONTENT);
            inneractiveInfrastructureError2.setCause(new com.fyber.inneractive.sdk.flow.nativead.mainasset.a(description));
            d dVar = this.f;
            dVar.getClass();
            com.fyber.inneractive.sdk.util.r.a.execute(new com.fyber.inneractive.sdk.flow.e(new com.fyber.inneractive.sdk.flow.f(dVar.b, dVar.a, "send_failed_native_creatives", dVar.g.b()), inneractiveInfrastructureError2));
            dVar.b(inneractiveInfrastructureError2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        boolean z;
        s0 a;
        Iterator it;
        i iVar;
        String str;
        float parseFloat;
        String b;
        String b2;
        synchronized (n) {
            try {
                if (!this.a.isEmpty()) {
                    Iterator it2 = this.a.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((c) it2.next()).a()) {
                                break;
                            }
                        } else if (!this.b.get() && !this.g.get()) {
                            z = false;
                        }
                    }
                }
                z = true;
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        }
        if (z) {
            return;
        }
        IAlog.c("%s : onResourceFinished", m);
        InneractiveAdRequest inneractiveAdRequest = this.h;
        com.fyber.inneractive.sdk.response.nativead.j jVar = this.k;
        if (inneractiveAdRequest != null) {
            a = inneractiveAdRequest.getSelectedUnitConfig();
        } else {
            a = com.fyber.inneractive.sdk.config.a.a(jVar.m);
        }
        com.fyber.inneractive.sdk.config.global.r rVar = this.i;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        com.fyber.inneractive.sdk.response.nativead.i iVar2 = this.c;
        String str2 = q.a;
        ArrayList arrayList3 = new ArrayList();
        if (q.a(iVar2.d) && (b2 = q.b(iVar2.d)) != null) {
            arrayList3.add(b2);
        }
        ArrayList arrayList4 = iVar2.e;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList();
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                com.fyber.inneractive.sdk.response.nativead.g gVar = (com.fyber.inneractive.sdk.response.nativead.g) it3.next();
                if (gVar != null && gVar.a == 1 && gVar.b == 2) {
                    arrayList5.add(gVar.c);
                }
            }
            Iterator it4 = arrayList5.iterator();
            while (it4.hasNext()) {
                String str3 = (String) it4.next();
                if (q.a(str3) && (b = q.b(str3)) != null) {
                    arrayList3.add(b);
                }
            }
        }
        arrayList2.addAll(arrayList3);
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = iVar2.c;
        if (arrayList7 != null && !arrayList7.isEmpty()) {
            arrayList6.addAll(iVar2.c);
        }
        ArrayList arrayList8 = iVar2.e;
        if (arrayList8 != null) {
            ArrayList arrayList9 = new ArrayList();
            Iterator it5 = arrayList8.iterator();
            while (it5.hasNext()) {
                com.fyber.inneractive.sdk.response.nativead.g gVar2 = (com.fyber.inneractive.sdk.response.nativead.g) it5.next();
                if (gVar2 != null && gVar2.a == 1 && gVar2.b == 1) {
                    arrayList9.add(gVar2.c);
                }
            }
            arrayList6.addAll(arrayList9);
        }
        arrayList.addAll(arrayList6);
        t0 t0Var = this.e;
        ArrayList arrayList10 = this.d;
        com.fyber.inneractive.sdk.response.nativead.h hVar = this.c.b;
        i iVar3 = (hVar == null || (TextUtils.isEmpty(hVar.a) && TextUtils.isEmpty(hVar.c) && hVar.b.isEmpty())) ? null : new i(hVar.a, hVar.c, hVar.b);
        if (iVar3 != null) {
            hashMap.put(NativeAdContent.ViewTag.ROOT, iVar3);
        }
        Iterator it6 = this.c.a.iterator();
        Uri uri = null;
        String str4 = null;
        t0 t0Var2 = null;
        Float f = null;
        Float f2 = null;
        Uri uri2 = null;
        String str5 = null;
        String str6 = null;
        while (it6.hasNext()) {
            com.fyber.inneractive.sdk.response.nativead.f fVar = (com.fyber.inneractive.sdk.response.nativead.f) it6.next();
            t0 t0Var3 = t0Var;
            com.fyber.inneractive.sdk.response.nativead.h hVar2 = fVar.f;
            ArrayList arrayList11 = arrayList10;
            if (hVar2 == null || (TextUtils.isEmpty(hVar2.a) && TextUtils.isEmpty(hVar2.c) && hVar2.b.isEmpty())) {
                it = it6;
                iVar = null;
            } else {
                it = it6;
                iVar = new i(hVar2.a, hVar2.c, hVar2.b);
            }
            com.fyber.inneractive.sdk.response.nativead.d dVar = fVar.b;
            if (dVar != null && !TextUtils.isEmpty(dVar.a)) {
                String str7 = fVar.b.a;
                if (iVar != null) {
                    hashMap.put(NativeAdContent.ViewTag.AD_TITLE, iVar);
                }
                str6 = str7;
            } else {
                com.fyber.inneractive.sdk.response.nativead.b bVar = fVar.e;
                if (bVar != null && !TextUtils.isEmpty(bVar.a)) {
                    String str8 = fVar.e.a;
                    int i = fVar.a;
                    if (i != 5) {
                        if (i != 6) {
                            if (i == 7) {
                                str = NativeAdContent.ViewTag.CTA;
                                str4 = str8;
                            }
                            str = null;
                        } else {
                            if (!TextUtils.isEmpty(str8)) {
                                try {
                                    parseFloat = Float.parseFloat(str8);
                                } catch (NumberFormatException unused) {
                                }
                                if (parseFloat >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    Float valueOf = Float.valueOf(parseFloat);
                                    str = NativeAdContent.ViewTag.RATING;
                                    f2 = valueOf;
                                }
                                str = null;
                            }
                            parseFloat = -1.0f;
                            if (parseFloat >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            }
                            str = null;
                        }
                        arrayList10 = arrayList11;
                        it6 = it;
                    } else {
                        str = NativeAdContent.ViewTag.AD_DESCRIPTION;
                        str5 = str8;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        hashMap.put(str, iVar);
                    }
                } else {
                    Iterator it7 = arrayList11.iterator();
                    while (true) {
                        if (it7.hasNext()) {
                            g gVar3 = (g) it7.next();
                            if (gVar3 != null) {
                                int i2 = gVar3.a;
                                Iterator it8 = it7;
                                if (i2 == fVar.a) {
                                    if (i2 == 2) {
                                        uri2 = gVar3.b;
                                        f = com.fyber.inneractive.sdk.util.u.a(uri2);
                                        if (iVar != null) {
                                            hashMap.put(NativeAdContent.ViewTag.MEDIA_VIEW, iVar);
                                        }
                                    } else if (i2 == 4) {
                                        uri = gVar3.b;
                                        if (iVar != null) {
                                            hashMap.put(NativeAdContent.ViewTag.AD_ICON, iVar);
                                        }
                                    }
                                }
                                it7 = it8;
                            }
                        } else {
                            com.fyber.inneractive.sdk.response.nativead.e eVar = fVar.c;
                            if (eVar == null || TextUtils.isEmpty(eVar.a) || t0Var3 == null) {
                                IAlog.c("%s : handleAsset failed: %d: ", m, Integer.valueOf(fVar.a));
                            } else {
                                if (iVar != null) {
                                    hashMap.put(NativeAdContent.ViewTag.MEDIA_VIEW, iVar);
                                }
                                t0Var = t0Var3;
                                t0Var2 = t0Var;
                            }
                        }
                    }
                }
                t0Var = t0Var3;
                arrayList10 = arrayList11;
                it6 = it;
            }
            t0Var = t0Var3;
            arrayList10 = arrayList11;
            it6 = it;
        }
        w0 w0Var = new w0(a, rVar);
        w0Var.g = str6;
        w0Var.h = str5;
        w0Var.i = str4;
        w0Var.j = null;
        w0Var.k = null;
        w0Var.l = uri;
        w0Var.m = uri2;
        w0Var.o = f2;
        w0Var.p = f;
        w0Var.s = t0Var2;
        w0Var.t.putAll(hashMap);
        w0Var.u = new j((i) hashMap.get(NativeAdContent.ViewTag.ROOT));
        w0Var.w.addAll(arrayList);
        w0Var.x.addAll(arrayList2);
        hashMap.clear();
        this.b.set(true);
        w0Var.b = this.k;
        d dVar2 = this.f;
        dVar2.c = w0Var;
        dVar2.f();
    }
}
