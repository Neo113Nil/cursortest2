package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.media.ads.network.common.model.AdSet;
import defpackage.a70;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.y6a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class S0 {
    public final C3906y9 a;

    public S0(C3906y9 c3906y9) {
        this.a = c3906y9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f9, code lost:
    
        if (a(r0, r14) == r4) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0075, code lost:
    
        if (r2 == r4) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x00d3 -> B:46:0x0095). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x00d5 -> B:46:0x0095). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x00bf -> B:46:0x0095). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x00c1 -> B:46:0x0095). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Function1 function1, sq3 sq3Var) {
        R0 r0;
        int i;
        AdResponse adResponse;
        AdSet adSet;
        Function1 function12;
        AdResponse adResponse2;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        int i2;
        AdResponse adResponse3;
        Iterator it;
        int i3;
        Xg pubContent;
        long j;
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads2;
        long j2;
        Function1 function13 = function1;
        if (sq3Var instanceof R0) {
            r0 = (R0) sq3Var;
            int i4 = r0.h;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                r0.h = i4 - Integer.MIN_VALUE;
                Object obj = r0.f;
                lu3 lu3Var = lu3.a;
                i = r0.h;
                if (i != 0) {
                    y6a.M(obj);
                    function13.invoke(Yf.a);
                    V0 v0 = V0.a;
                    r0.a = function13;
                    r0.h = 1;
                    obj = v0.a(str, r0);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            adResponse2 = (AdResponse) r0.a;
                            y6a.M(obj);
                            AdSet adSet2 = (AdSet) CollectionsKt.firstOrNull(adResponse2.getAdSets());
                            if (adSet2 != null) {
                                long expiry = adSet2.getExpiry();
                                Long valueOf = Long.valueOf(expiry);
                                if (expiry <= 0) {
                                    valueOf = null;
                                }
                                if (valueOf != null) {
                                    j = valueOf.longValue();
                                    if (adSet2 != null && (ads2 = adSet2.getAds()) != null) {
                                        for (com.inmobi.media.ads.network.common.model.Ad ad : ads2) {
                                            Long expiry2 = ad.getExpiry();
                                            if (expiry2 != null) {
                                                if (expiry2.longValue() <= 0) {
                                                    expiry2 = null;
                                                }
                                                if (expiry2 != null) {
                                                    j2 = expiry2.longValue();
                                                    ad.setExpiryTimestampInMillis(j2 != -1 ? -1L : TimeUnit.SECONDS.toMillis(j2) + ad.getInsertionTimestampInMillis());
                                                }
                                            }
                                            j2 = j;
                                            ad.setExpiryTimestampInMillis(j2 != -1 ? -1L : TimeUnit.SECONDS.toMillis(j2) + ad.getInsertionTimestampInMillis());
                                        }
                                    }
                                    return adResponse2;
                                }
                            }
                            j = -1;
                            if (adSet2 != null) {
                                while (r1.hasNext()) {
                                }
                            }
                            return adResponse2;
                        }
                        i3 = r0.e;
                        i2 = r0.d;
                        it = r0.c;
                        adResponse3 = r0.b;
                        function12 = (Function1) r0.a;
                        try {
                            y6a.M(obj);
                        } catch (ClassCastException e) {
                            C3906y9 c3906y9 = this.a;
                            if (c3906y9 != null) {
                                c3906y9.a("AdResponseManager", "Error parsing pub content: " + i3, e);
                            }
                        } catch (IllegalArgumentException e2) {
                            C3906y9 c3906y92 = this.a;
                            if (c3906y92 != null) {
                                c3906y92.a("AdResponseManager", "Error parsing pub content: " + i3, e2);
                            }
                        }
                        do {
                            i3 = i2;
                            if (it.hasNext()) {
                                adResponse2 = adResponse3;
                                r0.a = adResponse2;
                                r0.b = null;
                                r0.c = null;
                                r0.h = 3;
                            } else {
                                Object next = it.next();
                                i2 = i3 + 1;
                                if (i3 < 0) {
                                    kotlin.collections.b.q();
                                    throw null;
                                }
                                pubContent = ((com.inmobi.media.ads.network.common.model.Ad) next).getPubContent();
                                r0.a = function12;
                                r0.b = adResponse3;
                                r0.c = it;
                                r0.d = i2;
                                r0.e = i3;
                                r0.h = 2;
                            }
                        } while (pubContent.a(r0) != lu3Var);
                        return lu3Var;
                    }
                    function13 = (Function1) r0.a;
                    y6a.M(obj);
                }
                adResponse = (AdResponse) obj;
                adSet = (AdSet) CollectionsKt.firstOrNull(adResponse.getAdSets());
                if (adSet == null && (ads = adSet.getAds()) != null) {
                    i2 = 0;
                    function12 = function13;
                    adResponse3 = adResponse;
                    it = ads.iterator();
                    do {
                        i3 = i2;
                        if (it.hasNext()) {
                        }
                    } while (pubContent.a(r0) != lu3Var);
                    return lu3Var;
                }
                function12 = function13;
                adResponse2 = adResponse;
                r0.a = adResponse2;
                r0.b = null;
                r0.c = null;
                r0.h = 3;
            }
        }
        r0 = new R0(this, sq3Var);
        Object obj2 = r0.f;
        lu3 lu3Var2 = lu3.a;
        i = r0.h;
        if (i != 0) {
        }
        adResponse = (AdResponse) obj2;
        adSet = (AdSet) CollectionsKt.firstOrNull(adResponse.getAdSets());
        if (adSet == null) {
        }
        function12 = function13;
        adResponse2 = adResponse;
        r0.a = adResponse2;
        r0.b = null;
        r0.c = null;
        r0.h = 3;
    }

    public abstract Object a(rq3 rq3Var);

    public abstract Unit a(AdResponse adResponse, Function1 function1);

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Function1 function1, sq3 sq3Var) {
        Q0 q0;
        int i;
        if (sq3Var instanceof Q0) {
            q0 = (Q0) sq3Var;
            int i2 = q0.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q0.d = i2 - Integer.MIN_VALUE;
                Object obj = q0.b;
                Object obj2 = lu3.a;
                i = q0.d;
                if (i != 0) {
                    y6a.M(obj);
                    function1.invoke(C3778tb.a);
                    q0.a = function1;
                    q0.d = 1;
                    obj = a(q0);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return obj;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function1 = q0.a;
                    y6a.M(obj);
                }
                q0.a = null;
                q0.d = 2;
                Object a = a((String) obj, function1, q0);
                return a != obj2 ? obj2 : a;
            }
        }
        q0 = new Q0(this, sq3Var);
        Object obj3 = q0.b;
        Object obj22 = lu3.a;
        i = q0.d;
        if (i != 0) {
        }
        q0.a = null;
        q0.d = 2;
        Object a2 = a((String) obj3, function1, q0);
        if (a2 != obj22) {
        }
    }
}
