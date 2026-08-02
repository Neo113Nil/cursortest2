package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.moloco.sdk.internal.MolocoLogger;
import defpackage.a70;
import defpackage.ak9;
import defpackage.aq4;
import defpackage.bf3;
import defpackage.fsf;
import defpackage.hk9;
import defpackage.hs4;
import defpackage.i5h;
import defpackage.ij9;
import defpackage.k13;
import defpackage.km5;
import defpackage.lu3;
import defpackage.ml4;
import defpackage.mqi;
import defpackage.n8k;
import defpackage.nj2;
import defpackage.o13;
import defpackage.oh0;
import defpackage.pj2;
import defpackage.pm0;
import defpackage.rd0;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.sxb;
import defpackage.vdf;
import defpackage.vh9;
import defpackage.w21;
import defpackage.wba;
import defpackage.wf2;
import defpackage.wj9;
import defpackage.xd5;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.yj9;
import defpackage.ypa;
import defpackage.z45;
import defpackage.zzl;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class u {
    public final z a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.k b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j c;
    public final f1 d;
    public final com.moloco.sdk.internal.services.b0 e;
    public final vh9 f;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q g;

    public u(z zVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.k kVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j jVar, f1 f1Var, com.moloco.sdk.internal.services.b0 b0Var, vh9 vh9Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q qVar) {
        zVar.getClass();
        kVar.getClass();
        jVar.getClass();
        f1Var.getClass();
        b0Var.getClass();
        vh9Var.getClass();
        this.a = zVar;
        this.b = kVar;
        this.c = jVar;
        this.d = f1Var;
        this.e = b0Var;
        this.f = vh9Var;
        this.g = qVar;
    }

    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b a(List list, com.moloco.sdk.common_adapter_internal.a aVar) {
        List list2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i iVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i) obj;
            String str = iVar.c;
            if (str == null || StringsKt.R(str)) {
                if (!iVar.f.isEmpty()) {
                    arrayList.add(obj);
                }
            }
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i iVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i) CollectionsKt.firstOrNull(CollectionsKt.H0(arrayList, new a(Integer.valueOf(aVar.a), Integer.valueOf(aVar.b))));
        if (iVar2 == null) {
            return null;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i0 i0Var = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i0) CollectionsKt.Y(CollectionsKt.H0(iVar2.f, x.a));
        Integer num = iVar2.a;
        int intValue = num != null ? num.intValue() : 0;
        Integer num2 = iVar2.b;
        int intValue2 = num2 != null ? num2.intValue() : 0;
        com.moloco.sdk.internal.publisher.nativead.model.g gVar = iVar2.d;
        String str2 = gVar != null ? gVar.a : null;
        if (gVar == null || (list2 = gVar.b) == null) {
            list2 = km5.a;
        }
        List list3 = list2;
        List list4 = iVar2.e;
        ArrayList arrayList2 = new ArrayList(k13.r(list4, 10));
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b0) it.next()).b);
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b(i0Var, intValue, intValue2, str2, list3, arrayList2);
    }

    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.h b(List list) {
        List list2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String str = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q) obj).c;
            if (str == null || StringsKt.R(str)) {
                arrayList.add(obj);
            }
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q qVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q) CollectionsKt.firstOrNull(CollectionsKt.H0(arrayList, x.b));
        if (qVar == null) {
            return null;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i0 i0Var = qVar.h;
        Integer num = qVar.a;
        int intValue = num != null ? num.intValue() : 0;
        Integer num2 = qVar.b;
        int intValue2 = num2 != null ? num2.intValue() : 0;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r rVar = qVar.f;
        String str2 = rVar != null ? rVar.a : null;
        if (rVar == null || (list2 = rVar.b) == null) {
            list2 = km5.a;
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.h(i0Var, intValue, intValue2, str2, list2, qVar.g, qVar.e, qVar.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b bVar, f fVar, double d, com.moloco.sdk.common_adapter_internal.a aVar, boolean z, String str, sq3 sq3Var) {
        o oVar;
        int i;
        u uVar;
        int i2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b bVar2;
        boolean z2;
        f fVar2;
        ArrayList arrayList;
        String str2;
        double d2;
        com.moloco.sdk.common_adapter_internal.a aVar2;
        com.moloco.sdk.internal.l0 l0Var;
        if (sq3Var instanceof o) {
            oVar = (o) sq3Var;
            int i3 = oVar.C;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oVar.C = i3 - Integer.MIN_VALUE;
                Object obj = oVar.A;
                lu3 lu3Var = lu3.a;
                i = oVar.C;
                if (i != 0) {
                    y6a.M(obj);
                    MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                    MolocoLogger.info$default(molocoLogger, "VastAdLoaderImpl", "Loading wrapper vast ad: ".concat(bVar.a), null, false, 12, null);
                    int i4 = fVar != null ? fVar.a + 1 : 0;
                    ArrayList e = x.e(fVar != null ? fVar.d.b : null, bVar.d);
                    if (i4 > 4 || ((fVar != null && fVar.b.contains(bVar.a)) || !(fVar == null || fVar.c))) {
                        x.j(this.d, e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e0.WrapperLimit, 12);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k kVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.e;
                        MolocoLogger.error$default(molocoLogger, "VastAdLoaderImpl", "Failed to load wrapper vast ad: " + kVar, null, false, 12, null);
                        return new com.moloco.sdk.internal.j0(kVar);
                    }
                    oVar.r = this;
                    oVar.s = bVar;
                    oVar.t = fVar;
                    oVar.u = aVar;
                    oVar.v = str;
                    oVar.w = e;
                    oVar.x = d;
                    oVar.y = z;
                    oVar.z = i4;
                    oVar.C = 1;
                    Object d3 = d(bVar, e, oVar);
                    if (d3 != lu3Var) {
                        uVar = this;
                        i2 = i4;
                        obj = d3;
                        bVar2 = bVar;
                        z2 = z;
                        fVar2 = fVar;
                        arrayList = e;
                        str2 = str;
                        d2 = d;
                        aVar2 = aVar;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = oVar.z;
                z2 = oVar.y;
                d2 = oVar.x;
                arrayList = oVar.w;
                str2 = oVar.v;
                aVar2 = oVar.u;
                fVar2 = oVar.t;
                bVar2 = oVar.s;
                uVar = oVar.r;
                y6a.M(obj);
                l0Var = (com.moloco.sdk.internal.l0) obj;
                if (!(l0Var instanceof com.moloco.sdk.internal.j0)) {
                    MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
                    uVar.getClass();
                    StringBuilder sb = new StringBuilder("Failed to load wrapper vast ad: ");
                    Object obj2 = ((com.moloco.sdk.internal.j0) l0Var).a;
                    sb.append(obj2);
                    MolocoLogger.error$default(molocoLogger2, "VastAdLoaderImpl", sb.toString(), null, false, 12, null);
                    return new com.moloco.sdk.internal.j0(obj2);
                }
                if (!(l0Var instanceof com.moloco.sdk.internal.k0)) {
                    zzl.b();
                    return null;
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d0 d0Var = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d0) ((com.moloco.sdk.internal.k0) l0Var).a;
                ArrayList e2 = x.e(fVar2 != null ? fVar2.d.a : null, bVar2.c);
                ArrayList e3 = x.e(fVar2 != null ? fVar2.d.c : null, kotlin.collections.a.c(bVar2.e));
                Set set = fVar2 != null ? fVar2.b : null;
                String str3 = bVar2.a;
                boolean z3 = z2;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (set != null) {
                    o13.v(set, linkedHashSet);
                }
                linkedHashSet.add(str3);
                Boolean bool = bVar2.b;
                f fVar3 = new f(i2, linkedHashSet, bool != null ? bool.booleanValue() : true, new d(e2, arrayList, e3));
                oVar.r = null;
                oVar.s = null;
                oVar.t = null;
                oVar.u = null;
                oVar.v = null;
                oVar.w = null;
                oVar.C = 2;
                Object g = uVar.g(d0Var, fVar3, d2, aVar2, z3, str2, oVar);
                return g == lu3Var ? lu3Var : g;
            }
        }
        oVar = new o(this, sq3Var);
        Object obj3 = oVar.A;
        lu3 lu3Var2 = lu3.a;
        i = oVar.C;
        if (i != 0) {
        }
        l0Var = (com.moloco.sdk.internal.l0) obj3;
        if (!(l0Var instanceof com.moloco.sdk.internal.j0)) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x002c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005f  */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.u] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v21, types: [com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.u] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b bVar, ArrayList arrayList, sq3 sq3Var) {
        h hVar;
        lu3 lu3Var;
        int i;
        ArrayList arrayList2;
        Object obj;
        List list;
        u uVar;
        List list2;
        u uVar2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d0 d0Var;
        Object L;
        ?? r1 = this;
        if (sq3Var instanceof h) {
            hVar = (h) sq3Var;
            int i2 = hVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = hVar.t;
                lu3Var = lu3.a;
                i = hVar.v;
                if (i == 0) {
                    try {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    a70.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                list2 = hVar.s;
                                uVar2 = hVar.r;
                                y6a.M(obj2);
                                com.moloco.sdk.internal.k0 k0Var = !(obj2 instanceof com.moloco.sdk.internal.k0) ? (com.moloco.sdk.internal.k0) obj2 : null;
                                d0Var = k0Var != null ? (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d0) k0Var.a : null;
                                if (d0Var == null) {
                                    return new com.moloco.sdk.internal.k0(d0Var);
                                }
                                uVar2.j(list2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e0.XmlParsing);
                                MolocoLogger.error$default(MolocoLogger.INSTANCE, "VastAdLoaderImpl", "Failed to create VAST object from XML", null, false, 12, null);
                                return new com.moloco.sdk.internal.j0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.b);
                            }
                            list = hVar.s;
                            uVar = hVar.r;
                            y6a.M(obj2);
                            try {
                                String str = (String) obj2;
                                z zVar = uVar.a;
                                hVar.r = uVar;
                                hVar.s = list;
                                hVar.v = 3;
                                obj2 = zVar.a(str, hVar);
                                if (obj2 != lu3Var) {
                                    list2 = list;
                                    uVar2 = uVar;
                                    if (!(obj2 instanceof com.moloco.sdk.internal.k0)) {
                                    }
                                    if (k0Var != null) {
                                    }
                                    if (d0Var == null) {
                                    }
                                }
                                return lu3Var;
                            } catch (hk9 e) {
                                e = e;
                                hk9 hk9Var = e;
                                uVar.j(list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e0.WrapperTimeout);
                                MolocoLogger.error$default(MolocoLogger.INSTANCE, "VastAdLoaderImpl", "Fetching wrapper vast tag url timed out", hk9Var, false, 8, null);
                                return new com.moloco.sdk.internal.j0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.f);
                            } catch (Exception e2) {
                                e = e2;
                                Exception exc = e;
                                uVar.j(list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e0.Wrapper);
                                MolocoLogger.error$default(MolocoLogger.INSTANCE, "VastAdLoaderImpl", "Fetching wrapper vast tag url fetch error", exc, false, 8, null);
                                return new com.moloco.sdk.internal.j0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.g);
                            }
                        }
                        ?? r12 = hVar.s;
                        u uVar3 = hVar.r;
                        y6a.M(obj2);
                        obj = obj2;
                        arrayList2 = r12;
                        r1 = uVar3;
                    } catch (hk9 e3) {
                        e = e3;
                        arrayList2 = r1;
                        r1 = "Fetching wrapper vast tag url: ";
                        uVar = r1;
                        list = arrayList2;
                        hk9 hk9Var2 = e;
                        uVar.j(list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e0.WrapperTimeout);
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, "VastAdLoaderImpl", "Fetching wrapper vast tag url timed out", hk9Var2, false, 8, null);
                        return new com.moloco.sdk.internal.j0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.f);
                    } catch (Exception e4) {
                        e = e4;
                        arrayList2 = r1;
                        r1 = "Fetching wrapper vast tag url: ";
                        uVar = r1;
                        list = arrayList2;
                        Exception exc2 = e;
                        uVar.j(list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e0.Wrapper);
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, "VastAdLoaderImpl", "Fetching wrapper vast tag url fetch error", exc2, false, 8, null);
                        return new com.moloco.sdk.internal.j0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.g);
                    }
                } else {
                    y6a.M(obj2);
                    try {
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, "VastAdLoaderImpl", "Fetching wrapper vast tag url: ".concat(bVar.a), null, false, 12, null);
                        vh9 vh9Var = r1.f;
                        String str2 = bVar.a;
                        yj9 yj9Var = new yj9();
                        pm0 pm0Var = ak9.a;
                        n8k.b(yj9Var.a, str2);
                        com.facebook.appevents.n.i(yj9Var, 5000L);
                        yj9Var.d(ij9.b);
                        wj9 wj9Var = new wj9(yj9Var, vh9Var);
                        hVar.r = r1;
                        arrayList2 = arrayList;
                        try {
                            hVar.s = arrayList2;
                            hVar.v = 1;
                            obj = wj9Var.i(hVar);
                            r1 = r1;
                            if (obj == lu3Var) {
                                return lu3Var;
                            }
                        } catch (hk9 e5) {
                            e = e5;
                            uVar = r1;
                            list = arrayList2;
                            hk9 hk9Var22 = e;
                            uVar.j(list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e0.WrapperTimeout);
                            MolocoLogger.error$default(MolocoLogger.INSTANCE, "VastAdLoaderImpl", "Fetching wrapper vast tag url timed out", hk9Var22, false, 8, null);
                            return new com.moloco.sdk.internal.j0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.f);
                        } catch (Exception e6) {
                            e = e6;
                            uVar = r1;
                            list = arrayList2;
                            Exception exc22 = e;
                            uVar.j(list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e0.Wrapper);
                            MolocoLogger.error$default(MolocoLogger.INSTANCE, "VastAdLoaderImpl", "Fetching wrapper vast tag url fetch error", exc22, false, 8, null);
                            return new com.moloco.sdk.internal.j0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.g);
                        }
                    } catch (hk9 e7) {
                        e = e7;
                        arrayList2 = arrayList;
                        uVar = r1;
                        list = arrayList2;
                        hk9 hk9Var222 = e;
                        uVar.j(list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e0.WrapperTimeout);
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, "VastAdLoaderImpl", "Fetching wrapper vast tag url timed out", hk9Var222, false, 8, null);
                        return new com.moloco.sdk.internal.j0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.f);
                    } catch (Exception e8) {
                        e = e8;
                        arrayList2 = arrayList;
                        uVar = r1;
                        list = arrayList2;
                        Exception exc222 = e;
                        uVar.j(list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e0.Wrapper);
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, "VastAdLoaderImpl", "Fetching wrapper vast tag url fetch error", exc222, false, 8, null);
                        return new com.moloco.sdk.internal.j0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.g);
                    }
                }
                hVar.r = r1;
                hVar.s = arrayList2;
                hVar.v = 2;
                L = ml4.L((aq4) obj, Charsets.UTF_8, hVar);
                if (L != lu3Var) {
                    uVar = r1;
                    list = arrayList2;
                    obj2 = L;
                    String str3 = (String) obj2;
                    z zVar2 = uVar.a;
                    hVar.r = uVar;
                    hVar.s = list;
                    hVar.v = 3;
                    obj2 = zVar2.a(str3, hVar);
                    if (obj2 != lu3Var) {
                    }
                }
                return lu3Var;
            }
        }
        hVar = new h(r1, sq3Var);
        Object obj22 = hVar.t;
        lu3Var = lu3.a;
        i = hVar.v;
        if (i == 0) {
        }
        hVar.r = r1;
        hVar.s = arrayList2;
        hVar.v = 2;
        L = ml4.L((aq4) obj, Charsets.UTF_8, hVar);
        if (L != lu3Var) {
        }
        return lu3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x01f3, code lost:
    
        r21 = r3;
        r4 = r28;
        r6 = r6;
        r3 = r11;
        r7 = r25;
        r8 = r8;
        r10 = r10;
        r11 = r29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r13v13, types: [joa] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0171 -> B:10:0x017c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t tVar, d dVar, double d, com.moloco.sdk.common_adapter_internal.a aVar, boolean z, String str, sq3 sq3Var) {
        i iVar;
        int i;
        List list;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b bVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar2;
        List list2;
        i iVar3;
        mqi b;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k kVar;
        Iterator it;
        double d2;
        com.moloco.sdk.common_adapter_internal.a aVar2;
        boolean z2;
        String str2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j jVar;
        u uVar = this;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t tVar2 = tVar;
        d dVar2 = dVar;
        if (sq3Var instanceof i) {
            iVar = (i) sq3Var;
            int i2 = iVar.H;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.H = i2 - Integer.MIN_VALUE;
                Object obj = iVar.F;
                lu3 lu3Var = lu3.a;
                i = iVar.H;
                if (i == 0) {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z3 = iVar.E;
                    double d3 = iVar.D;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j jVar2 = iVar.C;
                    Iterator it2 = iVar.B;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k kVar2 = iVar.A;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b bVar2 = iVar.z;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar4 = iVar.y;
                    ?? r13 = iVar.x;
                    List list3 = iVar.w;
                    String str3 = iVar.v;
                    list = null;
                    com.moloco.sdk.common_adapter_internal.a aVar3 = iVar.u;
                    d dVar3 = iVar.t;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t tVar3 = iVar.s;
                    uVar = iVar.r;
                    y6a.M(obj);
                    boolean z4 = z3;
                    double d4 = d3;
                    i iVar5 = iVar;
                    lu3 lu3Var2 = lu3Var;
                    tVar2 = tVar3;
                    mqi mqiVar = r13;
                    com.moloco.sdk.internal.l0 l0Var = (com.moloco.sdk.internal.l0) obj;
                    if (l0Var instanceof com.moloco.sdk.internal.j0) {
                        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                        uVar.getClass();
                        StringBuilder sb = new StringBuilder("Failed to prepare RenderLinear: ");
                        Object obj2 = ((com.moloco.sdk.internal.j0) l0Var).a;
                        sb.append(obj2);
                        MolocoLogger.error$default(molocoLogger, "VastAdLoaderImpl", sb.toString(), null, false, 12, null);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k kVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k) obj2;
                        jVar = jVar2;
                        aVar2 = aVar3;
                        str2 = str3;
                        iVar3 = iVar5;
                        b = mqiVar;
                        bVar = bVar2;
                        it = it2;
                        list2 = list3;
                        iVar2 = iVar4;
                        kVar = kVar3;
                    } else {
                        if (!(l0Var instanceof com.moloco.sdk.internal.k0)) {
                            zzl.b();
                            return list;
                        }
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar6 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i) ((com.moloco.sdk.internal.k0) l0Var).a;
                        jVar = jVar2;
                        aVar2 = aVar3;
                        kVar = kVar2;
                        str2 = str3;
                        iVar3 = iVar5;
                        b = mqiVar;
                        bVar = bVar2;
                        it = it2;
                        list2 = list3;
                        iVar2 = iVar6;
                    }
                    dVar2 = dVar3;
                    z2 = z4;
                    if (bVar == null) {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.m mVar = jVar.e;
                        if (mVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k) {
                            List list4 = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k) mVar).a;
                            uVar.getClass();
                            bVar = a(list4, aVar2);
                        }
                    }
                    lu3Var = lu3Var2;
                    d2 = d4;
                    while (it.hasNext()) {
                        Iterator it3 = it;
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j jVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j) it.next();
                        if (iVar2 != null && bVar != null) {
                            break;
                        }
                        lu3 lu3Var3 = lu3Var;
                        String str4 = jVar3.d;
                        boolean z5 = str4 == null || StringsKt.R(str4);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.m mVar2 = jVar3.e;
                        if (z5) {
                            z4 = z2;
                            if (iVar2 == null && (mVar2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l)) {
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u uVar2 = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l) mVar2).a;
                                ArrayList arrayList = ((e) b.getValue()).a;
                                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a aVar4 = ((e) b.getValue()).b;
                                Long l = uVar2.b;
                                iVar3.r = uVar;
                                iVar3.s = tVar2;
                                iVar3.t = dVar2;
                                iVar3.u = aVar2;
                                iVar3.v = str2;
                                iVar3.w = list2;
                                iVar3.x = b;
                                iVar3.y = iVar2;
                                iVar3.z = bVar;
                                iVar3.A = kVar;
                                u uVar3 = uVar;
                                iVar3.B = it3;
                                iVar3.C = jVar3;
                                iVar3.D = d2;
                                iVar3.E = z4;
                                iVar3.H = 1;
                                d4 = d2;
                                com.moloco.sdk.common_adapter_internal.a aVar5 = aVar2;
                                String str5 = str2;
                                iVar5 = iVar3;
                                obj = uVar3.f(uVar2, arrayList, aVar4, list2, d4, l, aVar5, z4, str5, iVar5);
                                uVar = uVar3;
                                aVar3 = aVar5;
                                lu3Var2 = lu3Var3;
                                if (obj == lu3Var2) {
                                    return lu3Var2;
                                }
                                dVar3 = dVar2;
                                jVar2 = jVar3;
                                kVar2 = kVar;
                                bVar2 = bVar;
                                iVar4 = iVar2;
                                mqiVar = b;
                                str3 = str5;
                                list3 = list2;
                                it2 = it3;
                                com.moloco.sdk.internal.l0 l0Var2 = (com.moloco.sdk.internal.l0) obj;
                                if (l0Var2 instanceof com.moloco.sdk.internal.j0) {
                                }
                                dVar2 = dVar3;
                                z2 = z4;
                                if (bVar == null) {
                                }
                                lu3Var = lu3Var2;
                                d2 = d4;
                                while (it.hasNext()) {
                                }
                            } else {
                                d4 = d2;
                                lu3Var2 = lu3Var3;
                                aVar2 = aVar2;
                                jVar = jVar3;
                                z2 = z4;
                                str2 = str2;
                                iVar3 = iVar3;
                                it = it3;
                                if (bVar == null) {
                                }
                                lu3Var = lu3Var2;
                                d2 = d4;
                                while (it.hasNext()) {
                                }
                            }
                        } else {
                            it = it3;
                            lu3Var = lu3Var3;
                        }
                    }
                    com.moloco.sdk.common_adapter_internal.a aVar6 = aVar2;
                    if (iVar2 != null) {
                        uVar.j(list2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e0.LinearFileNotFound);
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, "VastAdLoaderImpl", "Failed to load linear: " + kVar, null, false, 12, null);
                        return new com.moloco.sdk.internal.j0(kVar);
                    }
                    MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
                    uVar.getClass();
                    MolocoLogger.info$default(molocoLogger2, "VastAdLoaderImpl", "RenderAd loaded successfully.", null, false, 12, null);
                    if (iVar2.g == null) {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.h hVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.h) i5h.j(i5h.o(new oh0(new sxb(((e) b.getValue()).c), 1), new com.appsflyer.internal.a(uVar)));
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y yVar = iVar2.a;
                        File file = iVar2.b;
                        Integer num = iVar2.c;
                        String str6 = iVar2.d;
                        String str7 = iVar2.e;
                        vdf vdfVar = iVar2.f;
                        str6.getClass();
                        iVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i(yVar, file, num, str6, str7, vdfVar, hVar);
                    }
                    if (bVar == null) {
                        bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b) i5h.j(i5h.o(new oh0(new sxb(((e) b.getValue()).d), 1), new com.moloco.sdk.acm.db.e(uVar, aVar6)));
                    }
                    ArrayList e = x.e(dVar2 != null ? dVar2.a : list, tVar2.a);
                    ArrayList arrayList2 = new ArrayList(k13.r(e, 10));
                    Iterator it4 = e.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s) it4.next()).a);
                    }
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "VastAdLoaderImpl", "Returning RenderAd", null, false, 12, null);
                    return new com.moloco.sdk.internal.k0(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a(iVar2, bVar, arrayList2, list2, null));
                }
                list = null;
                y6a.M(obj);
                MolocoLogger molocoLogger3 = MolocoLogger.INSTANCE;
                MolocoLogger.info$default(molocoLogger3, "VastAdLoaderImpl", "Trying to load RenderAd", null, false, 12, null);
                List list5 = dVar2 != null ? dVar2.b : null;
                List list6 = tVar2.b;
                List list7 = tVar2.c;
                ArrayList e2 = x.e(list5, list6);
                if (list7.isEmpty()) {
                    x.j(uVar.d, e2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e0.Linear, 12);
                    MolocoLogger.error$default(molocoLogger3, "VastAdLoaderImpl", "No creatives in InLine", null, false, 12, null);
                    return new com.moloco.sdk.internal.j0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.h);
                }
                bVar = null;
                iVar2 = null;
                list2 = e2;
                iVar3 = iVar;
                b = ypa.b(new com.moloco.sdk.internal.b(5, uVar, dVar2));
                kVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.i;
                it = list7.iterator();
                d2 = d;
                aVar2 = aVar;
                z2 = z;
                str2 = str;
                while (it.hasNext()) {
                }
                com.moloco.sdk.common_adapter_internal.a aVar62 = aVar2;
                if (iVar2 != null) {
                }
            }
        }
        iVar = new i(uVar, sq3Var);
        Object obj3 = iVar.F;
        lu3 lu3Var4 = lu3.a;
        i = iVar.H;
        if (i == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r11v7, types: [km5] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [wf2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u uVar, ArrayList arrayList, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a aVar, List list, double d, Long l, com.moloco.sdk.common_adapter_internal.a aVar2, boolean z, String str, sq3 sq3Var) {
        s sVar;
        int i;
        ArrayList arrayList2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a aVar3;
        Object obj;
        fsf fsfVar;
        u uVar2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u uVar3;
        Pair pair;
        List list2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j0 j0Var;
        if (sq3Var instanceof s) {
            sVar = (s) sq3Var;
            int i2 = sVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sVar.y = i2 - Integer.MIN_VALUE;
                s sVar2 = sVar;
                Object obj2 = sVar2.w;
                lu3 lu3Var = lu3.a;
                i = sVar2.y;
                if (i != 0) {
                    y6a.M(obj2);
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "VastAdLoaderImpl", "Preparing InLine RenderLinear with target linear size: " + d, null, false, 12, null);
                    List list3 = uVar.c;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : list3) {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v vVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v) obj3;
                        String str2 = vVar.i;
                        if (str2 == null || StringsKt.R(str2)) {
                            if (vVar.b) {
                                String lowerCase = vVar.c.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                                if (lowerCase.equals(MimeTypes.VIDEO_MP4) || lowerCase.equals(MimeTypes.VIDEO_H263) || lowerCase.equals("video/webm")) {
                                    arrayList3.add(obj3);
                                }
                            }
                        }
                    }
                    List H0 = CollectionsKt.H0(arrayList3, new b(d, l, new Integer(aVar2.a), new Integer(aVar2.b)));
                    if (H0.isEmpty()) {
                        j(list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e0.LinearNotSupportedMedia);
                        return new com.moloco.sdk.internal.j0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.j);
                    }
                    fsf fsfVar2 = new fsf();
                    fsfVar2.a = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.E;
                    ?? wf2Var = new wf2(H0, 4);
                    r rVar = new r(wf2Var instanceof nj2 ? (nj2) wf2Var : new pj2(wf2Var), z, this, str, fsfVar2);
                    sVar2.r = this;
                    sVar2.s = uVar;
                    arrayList2 = arrayList;
                    sVar2.t = arrayList2;
                    aVar3 = aVar;
                    sVar2.u = aVar3;
                    sVar2.v = fsfVar2;
                    sVar2.y = 1;
                    Object A = rd0.A(rVar, sVar2);
                    if (A == lu3Var) {
                        return lu3Var;
                    }
                    obj = A;
                    fsfVar = fsfVar2;
                    uVar2 = this;
                    uVar3 = uVar;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fsfVar = sVar2.v;
                    aVar3 = sVar2.u;
                    ArrayList arrayList4 = sVar2.t;
                    uVar3 = sVar2.s;
                    uVar2 = sVar2.r;
                    y6a.M(obj2);
                    obj = obj2;
                    arrayList2 = arrayList4;
                }
                pair = (Pair) obj;
                if (pair != null) {
                    com.moloco.sdk.internal.j0 j0Var2 = new com.moloco.sdk.internal.j0(fsfVar.a);
                    MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                    uVar2.getClass();
                    MolocoLogger.error$default(molocoLogger, "VastAdLoaderImpl", "Failed to load media file: " + fsfVar.a, null, false, 12, null);
                    return j0Var2;
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v vVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v) pair.a;
                File file = (File) pair.b;
                MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
                uVar2.getClass();
                MolocoLogger.info$default(molocoLogger2, "VastAdLoaderImpl", "Found a RenderLinear MediaFile: " + file.getAbsolutePath() + " for url: " + vVar2.a, null, false, 12, null);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a aVar4 = uVar3.e;
                String str3 = (aVar4 == null || (j0Var = aVar4.a) == null) ? null : j0Var.a;
                ArrayList e = x.e(uVar3.d, arrayList2);
                ArrayList e2 = x.e(aVar4 != null ? aVar4.b : null, aVar3 != null ? aVar3.b : null);
                x.e(aVar4 != null ? aVar4.c : null, aVar3 != null ? aVar3.c : null);
                StringBuilder sb = new StringBuilder("Returning RenderLinear for url: ");
                sb.append(vVar2.a);
                sb.append(", with bitrate: ");
                MolocoLogger.info$default(molocoLogger2, "VastAdLoaderImpl", bf3.n(sb, vVar2.f, ' '), null, false, 12, null);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y yVar = uVar3.a;
                Integer num = vVar2.f;
                String str4 = vVar2.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = e.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c0 c0Var = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b0) next).a;
                    Object obj4 = linkedHashMap.get(c0Var);
                    if (obj4 == null) {
                        obj4 = new ArrayList();
                        linkedHashMap.put(c0Var, obj4);
                    }
                    ((List) obj4).add(next);
                }
                ArrayList arrayList5 = new ArrayList(k13.r(e2, 10));
                Iterator it2 = e2.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j0) it2.next()).a);
                }
                List f = x.f(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c0.a);
                List f2 = x.f(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c0.b);
                List f3 = x.f(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c0.c);
                List f4 = x.f(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c0.d);
                List f5 = x.f(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c0.e);
                List f6 = x.f(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c0.f);
                List f7 = x.f(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c0.g);
                List f8 = x.f(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c0.h);
                List f9 = x.f(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c0.i);
                List f10 = x.f(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c0.k);
                List f11 = x.f(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c0.j);
                List f12 = x.f(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c0.m);
                List f13 = x.f(linkedHashMap, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c0.l);
                List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b0> list4 = (List) linkedHashMap.get(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c0.n);
                if (list4 != null) {
                    list2 = new ArrayList();
                    for (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b0 b0Var : list4) {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y yVar2 = b0Var.c;
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar = yVar2 == null ? null : new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j(b0Var.b, yVar2);
                        if (jVar != null) {
                            list2.add(jVar);
                        }
                    }
                } else {
                    list2 = km5.a;
                }
                return new com.moloco.sdk.internal.k0(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i(yVar, file, num, str4, str3, new vdf(arrayList5, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, list2), b(uVar3.f)));
            }
        }
        sVar = new s(this, sq3Var);
        s sVar22 = sVar;
        Object obj22 = sVar22.w;
        lu3 lu3Var2 = lu3.a;
        i = sVar22.y;
        if (i != 0) {
        }
        pair = (Pair) obj;
        if (pair != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d0 d0Var, f fVar, double d, com.moloco.sdk.common_adapter_internal.a aVar, boolean z, String str, sq3 sq3Var) {
        n nVar;
        int i;
        u uVar;
        fsf fsfVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar2;
        if (sq3Var instanceof n) {
            nVar = (n) sq3Var;
            int i2 = nVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.v = i2 - Integer.MIN_VALUE;
                n nVar2 = nVar;
                Object obj = nVar2.t;
                lu3 lu3Var = lu3.a;
                i = nVar2.v;
                f fVar2 = null;
                if (i != 0) {
                    y6a.M(obj);
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "VastAdLoaderImpl", "Loading vast ad with wrapperChainParams: " + fVar, null, false, 12, null);
                    List list = fVar != null ? fVar.d.b : null;
                    String str2 = d0Var.b;
                    List list2 = d0Var.a;
                    if (str2 != null) {
                        List c = kotlin.collections.a.c(str2);
                        ArrayList arrayList = new ArrayList();
                        if (list != null) {
                            o13.v(list, arrayList);
                        }
                        if (c != null) {
                            o13.v(c, arrayList);
                        }
                        list = arrayList;
                    } else if (list == null) {
                        list = km5.a;
                    }
                    if (list2.isEmpty()) {
                        j(list, fVar != null ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e0.WrapperNoAds : null);
                        return new com.moloco.sdk.internal.j0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.d);
                    }
                    if (fVar != null) {
                        d dVar = fVar.d;
                        List list3 = dVar.a;
                        List list4 = dVar.c;
                        list.getClass();
                        fVar2 = new f(fVar.a, fVar.b, fVar.c, new d(list3, list, list4));
                    }
                    f fVar3 = fVar2;
                    fsf fsfVar2 = new fsf();
                    fsfVar2.a = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.F;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list2) {
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c) obj2;
                        if (cVar.a == null || new IntRange(0, 1, 1).d(cVar.a.intValue())) {
                            arrayList2.add(obj2);
                        }
                    }
                    wf2 wf2Var = new wf2(CollectionsKt.H0(arrayList2, new m(0)), 4);
                    l lVar = new l(wf2Var instanceof nj2 ? (nj2) wf2Var : new pj2(wf2Var), this, fVar3, d, aVar, z, str, fsfVar2);
                    nVar2.r = this;
                    nVar2.s = fsfVar2;
                    nVar2.v = 1;
                    obj = rd0.A(lVar, nVar2);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                    uVar = this;
                    fsfVar = fsfVar2;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fsfVar = nVar2.s;
                    uVar = nVar2.r;
                    y6a.M(obj);
                }
                aVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) obj;
                if (aVar2 == null) {
                    return new com.moloco.sdk.internal.k0(aVar2);
                }
                com.moloco.sdk.internal.j0 j0Var = new com.moloco.sdk.internal.j0(fsfVar.a);
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                uVar.getClass();
                MolocoLogger.error$default(molocoLogger, "VastAdLoaderImpl", "Failed to load linear: " + fsfVar.a, null, false, 12, null);
                return j0Var;
            }
        }
        nVar = new n(this, sq3Var);
        n nVar22 = nVar;
        Object obj3 = nVar22.t;
        lu3 lu3Var2 = lu3.a;
        i = nVar22.v;
        f fVar22 = null;
        if (i != 0) {
        }
        aVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) obj3;
        if (aVar2 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar, long j, sq3 sq3Var) {
        t tVar;
        int i;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h hVar;
        u uVar = this;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar2 = aVar;
        if (sq3Var instanceof t) {
            tVar = (t) sq3Var;
            int i2 = tVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tVar.v = i2 - Integer.MIN_VALUE;
                Object obj = tVar.t;
                lu3 lu3Var = lu3.a;
                i = tVar.v;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "VastAdLoaderImpl", "Waiting for " + ((Object) xd5.l(j)) + " to load the vast media file: " + uVar.c, null, false, 12, null);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a aVar3 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a(uVar, aVar2, rq3Var, 6);
                    tVar.r = uVar;
                    tVar.s = aVar2;
                    tVar.v = 1;
                    obj = wba.W(j, aVar3, tVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar4 = tVar.s;
                    u uVar2 = tVar.r;
                    y6a.M(obj);
                    aVar2 = aVar4;
                    uVar = uVar2;
                }
                hVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h) obj;
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                uVar.getClass();
                MolocoLogger.info$default(molocoLogger, "VastAdLoaderImpl", "Either timeout occurred or media file streaming had terminal status", null, false, 12, null);
                MolocoLogger.info$default(molocoLogger, "VastAdLoaderImpl", "Stream status: " + hVar + " on timeout", null, false, 12, null);
                if (hVar != null) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar = aVar2.a;
                    Integer num = iVar.c;
                    File file = iVar.b;
                    if (!file.exists() || file.length() == 0) {
                        MolocoLogger.error$default(molocoLogger, "VastAdLoaderImpl", file.getAbsolutePath() + " does not exist or is empty", null, false, 12, null);
                        MolocoLogger.error$default(molocoLogger, "VastAdLoaderImpl", "Failed to start streaming media file, reporting timeout error", null, false, 12, null);
                        return new com.moloco.sdk.internal.j0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.x);
                    }
                    MolocoLogger.info$default(molocoLogger, "VastAdLoaderImpl", "Local vast media resource exists and has some content. Checking for bitrate information", null, false, 12, null);
                    if (num == null) {
                        MolocoLogger.info$default(molocoLogger, "VastAdLoaderImpl", "VAST ad playable duration cannot be determined due to no bitrate information", null, false, 12, null);
                        return new com.moloco.sdk.internal.j0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.z);
                    }
                    MolocoLogger.info$default(molocoLogger, "VastAdLoaderImpl", "Checking for playability of VAST ad with bitrate: " + num, null, false, 12, null);
                    double length = ((double) (file.length() * 8)) / ((double) (num.intValue() * 1000));
                    MolocoLogger.info$default(molocoLogger, "VastAdLoaderImpl", "VAST ad has playable duration: " + length + " seconds", null, false, 12, null);
                    if (length < uVar.b.c) {
                        MolocoLogger.error$default(molocoLogger, "VastAdLoaderImpl", "VAST does not have enough playable duration, so failing ", null, false, 12, null);
                        return new com.moloco.sdk.internal.j0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.y);
                    }
                } else {
                    if (hVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d) {
                        MolocoLogger.info$default(molocoLogger, "VastAdLoaderImpl", "Streamed entire file successfully", null, false, 12, null);
                        return new com.moloco.sdk.internal.k0(aVar2);
                    }
                    if (hVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e) {
                        MolocoLogger.info$default(molocoLogger, "VastAdLoaderImpl", "Failed to stream file", null, false, 12, null);
                        return new com.moloco.sdk.internal.j0(x.a(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e) hVar).a));
                    }
                }
                MolocoLogger.info$default(molocoLogger, "VastAdLoaderImpl", "Media file partially exists and ready for streaming", null, false, 12, null);
                return new com.moloco.sdk.internal.k0(aVar2);
            }
        }
        tVar = new t(uVar, sq3Var);
        Object obj2 = tVar.t;
        lu3 lu3Var2 = lu3.a;
        i = tVar.v;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        hVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h) obj2;
        MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
        uVar.getClass();
        MolocoLogger.info$default(molocoLogger2, "VastAdLoaderImpl", "Either timeout occurred or media file streaming had terminal status", null, false, 12, null);
        MolocoLogger.info$default(molocoLogger2, "VastAdLoaderImpl", "Stream status: " + hVar + " on timeout", null, false, 12, null);
        if (hVar != null) {
        }
        MolocoLogger.info$default(molocoLogger2, "VastAdLoaderImpl", "Media file partially exists and ready for streaming", null, false, 12, null);
        return new com.moloco.sdk.internal.k0(aVar2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ae, code lost:
    
        if (r1 == r3) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(String str, String str2, boolean z, sq3 sq3Var) {
        g gVar;
        int i;
        u uVar;
        String str3;
        boolean z2;
        com.moloco.sdk.internal.l0 l0Var;
        if (sq3Var instanceof g) {
            gVar = (g) sq3Var;
            int i2 = gVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.w = i2 - Integer.MIN_VALUE;
                Object obj = gVar.u;
                lu3 lu3Var = lu3.a;
                i = gVar.w;
                if (i != 0) {
                    y6a.M(obj);
                    gVar.r = this;
                    gVar.s = str2;
                    gVar.t = z;
                    gVar.w = 1;
                    Object a = this.a.a(str, gVar);
                    if (a != lu3Var) {
                        uVar = this;
                        str3 = str2;
                        z2 = z;
                        obj = a;
                    }
                    return lu3Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    com.moloco.sdk.internal.l0 l0Var2 = (com.moloco.sdk.internal.l0) obj;
                    if (l0Var2 instanceof com.moloco.sdk.internal.j0) {
                        return new com.moloco.sdk.internal.j0(((com.moloco.sdk.internal.j0) l0Var2).a);
                    }
                    if (l0Var2 instanceof com.moloco.sdk.internal.k0) {
                        return new com.moloco.sdk.internal.k0(((com.moloco.sdk.internal.k0) l0Var2).a);
                    }
                    zzl.b();
                    return null;
                }
                boolean z3 = gVar.t;
                String str4 = gVar.s;
                u uVar2 = gVar.r;
                y6a.M(obj);
                z2 = z3;
                str3 = str4;
                uVar = uVar2;
                l0Var = (com.moloco.sdk.internal.l0) obj;
                if (!(l0Var instanceof com.moloco.sdk.internal.j0)) {
                    MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                    uVar.getClass();
                    StringBuilder sb = new StringBuilder("Failed to parse vast XML: ");
                    Object obj2 = ((com.moloco.sdk.internal.j0) l0Var).a;
                    sb.append(obj2);
                    MolocoLogger.error$default(molocoLogger, "VastAdLoaderImpl", sb.toString(), null, false, 12, null);
                    return new com.moloco.sdk.internal.j0(obj2);
                }
                if (!(l0Var instanceof com.moloco.sdk.internal.k0)) {
                    zzl.b();
                    return null;
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d0 d0Var = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d0) ((com.moloco.sdk.internal.k0) l0Var).a;
                hs4 hs4Var = z45.a;
                w21 w21Var = new w21(uVar, d0Var, z2, str3, (rq3) null);
                gVar.r = null;
                gVar.s = null;
                gVar.w = 2;
                obj = xw3.R(hs4Var, w21Var, gVar);
            }
        }
        gVar = new g(this, sq3Var);
        Object obj3 = gVar.u;
        lu3 lu3Var2 = lu3.a;
        i = gVar.w;
        if (i != 0) {
        }
        l0Var = (com.moloco.sdk.internal.l0) obj3;
        if (!(l0Var instanceof com.moloco.sdk.internal.j0)) {
        }
    }

    public final void j(List list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e0 e0Var) {
        x.j(this.d, list, e0Var, 12);
    }
}
