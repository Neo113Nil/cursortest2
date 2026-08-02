package com.vungle.ads.internal.model;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vungle.ads.AdConfig;
import com.vungle.ads.TpatError;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.duf;
import defpackage.k13;
import defpackage.lkb;
import defpackage.n13;
import defpackage.p2g;
import defpackage.q79;
import defpackage.qfa;
import defpackage.qq3;
import defpackage.u2g;
import defpackage.uhi;
import defpackage.uye;
import defpackage.w2g;
import defpackage.wf3;
import defpackage.xg0;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class h0 {

    @NotNull
    public static final p Companion = new p();
    public final List a;
    public final v2 b;
    public Long c;
    public ConcurrentHashMap d;
    public Map e;
    public boolean f;
    public AdConfig g;
    public com.vungle.ads.internal.util.s h;
    public String i;
    public final LinkedHashMap j;

    public /* synthetic */ h0(int i, List list, v2 v2Var, Long l, ConcurrentHashMap concurrentHashMap, Map map, boolean z, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = v2Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = new ConcurrentHashMap();
        } else {
            this.d = concurrentHashMap;
        }
        if ((i & 16) == 0) {
            this.e = new HashMap();
        } else {
            this.e = map;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z;
        }
        this.g = null;
        this.h = null;
        if ((i & 64) == 0) {
            this.i = null;
        } else {
            this.i = str;
        }
        this.j = new LinkedHashMap();
    }

    public final boolean A() {
        return Intrinsics.c(F(), IronSourceConstants.EVENTS_NATIVE);
    }

    public final boolean B() {
        Boolean bool;
        i k = k();
        return ((k == null || (bool = k.C) == null) ? false : bool.booleanValue()) && !A();
    }

    public final boolean C() {
        z zVar;
        c0 c0Var;
        Boolean bool;
        i k = k();
        if (k == null || (zVar = k.s) == null || (c0Var = zVar.a) == null || (bool = c0Var.a) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final String D() {
        s i = i();
        if (i != null) {
            return i.a;
        }
        return null;
    }

    public final void E() {
        this.c = Long.valueOf(System.currentTimeMillis());
    }

    public final String F() {
        i k = k();
        if (k != null) {
            return k.t;
        }
        return null;
    }

    public final boolean G() {
        i k = k();
        return (k != null ? Intrinsics.c(k.l(), Boolean.TRUE) : false) && !A();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList a(File file) {
        Pair pair;
        i k;
        v j;
        Map a;
        Pair pair2;
        i k2;
        String m;
        String u2gVar;
        File parentFile;
        file.getClass();
        ArrayList arrayList = new ArrayList();
        if (!A() && (k2 = k()) != null && (m = k2.m()) != null) {
            String str = com.vungle.ads.internal.util.n.a(m) ? m : null;
            if (str != null) {
                try {
                    p2g p2gVar = w2g.b;
                    String path = new URI(str).getPath();
                    path.getClass();
                    List Y = StringsKt.Y(StringsKt.m0(path, '/'), new char[]{'/'});
                    u2gVar = Y.size() >= 2 ? CollectionsKt.f0(CollectionsKt.M0(2, Y), "_", null, null, null, 62) : "index.html";
                } catch (Throwable th) {
                    p2g p2gVar2 = w2g.b;
                    u2gVar = new u2g(th);
                }
                if (u2gVar instanceof u2g) {
                    u2gVar = null;
                }
                String str2 = (String) u2gVar;
                if (str2 != null && (parentFile = file.getParentFile()) != null) {
                    pair = new Pair(str, new File(parentFile, str2));
                    if (pair != null) {
                        String str3 = (String) pair.a;
                        File file2 = (File) pair.b;
                        this.i = file2.getAbsolutePath();
                        if (!file2.exists()) {
                            boolean z = com.vungle.ads.internal.util.u.a;
                            com.vungle.ads.internal.util.t.a("AdPayload", "No cacheable index file found, creating new one: " + file2);
                            String absolutePath = file2.getAbsolutePath();
                            absolutePath.getClass();
                            arrayList.add(new b(str3, absolutePath));
                        }
                    }
                    k = k();
                    if (k != null && (j = k.j()) != null && (a = j.a()) != null) {
                        for (Map.Entry entry : a.entrySet()) {
                            String str4 = (String) entry.getKey();
                            o oVar = (o) entry.getValue();
                            String c = oVar.c();
                            if (c != null && com.vungle.ads.internal.util.n.a(c)) {
                                String absolutePath2 = new File(file, com.vungle.ads.internal.util.n.a(c, oVar.b())).getAbsolutePath();
                                Integer a2 = oVar.a();
                                if (A() || !b()) {
                                    pair2 = new Pair(Boolean.TRUE, null);
                                } else if (B()) {
                                    pair2 = new Pair(Boolean.TRUE, Integer.valueOf(Math.max(0, a2 != null ? a2.intValue() : 0)));
                                } else {
                                    pair2 = new Pair(Boolean.FALSE, null);
                                }
                                boolean booleanValue = ((Boolean) pair2.a).booleanValue();
                                Integer num = (Integer) pair2.b;
                                absolutePath2.getClass();
                                b bVar = new b(str4, c, absolutePath2, booleanValue, num);
                                String b = oVar.b();
                                if (b != null) {
                                    bVar.a(b);
                                }
                                arrayList.add(bVar);
                                if (booleanValue && num != null) {
                                    this.j.put(c, bVar);
                                }
                            }
                        }
                    }
                    if (arrayList.size() > 1) {
                        n13.u(new g0(), arrayList);
                    }
                    return arrayList;
                }
            }
        }
        pair = null;
        if (pair != null) {
        }
        k = k();
        if (k != null) {
            while (r0.hasNext()) {
            }
        }
        if (arrayList.size() > 1) {
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final List b(String str, String str2, String str3) {
        Map k;
        Map k2;
        str.getClass();
        i k3 = k();
        if (k3 != null && (k2 = k3.k()) != null && !k2.containsKey(str)) {
            new TpatError(Sdk.SDKError.Reason.INVALID_TPAT_KEY, com.iab.omid.library.vungle.d.a("Arbitrary tpat key: ", str)).setLogEntry$vungle_ads_release(this.h).logErrorNoReturnValue$vungle_ads_release();
            return null;
        }
        i k4 = k();
        List list = (k4 == null || (k = k4.k()) == null) ? null : (List) k.get(str);
        if (list == null || list.isEmpty()) {
            new TpatError(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, com.iab.omid.library.vungle.d.a("Empty tpat key: ", str)).setLogEntry$vungle_ads_release(this.h).logErrorNoReturnValue$vungle_ads_release();
            return null;
        }
        switch (str.hashCode()) {
            case -2125915830:
                if (str.equals("checkpoint.0")) {
                    ArrayList arrayList = new ArrayList(k13.r(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(a(a(a((String) it.next(), "{{{remote_play}}}", String.valueOf(!this.f)), "{{{carrier}}}", str2), "{{{vol}}}", str3));
                    }
                    return arrayList;
                }
                return list;
            case -747709511:
                if (str.equals("video.length")) {
                    ArrayList arrayList2 = new ArrayList(k13.r(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(a((String) it2.next(), "{{{vlen}}}", str2));
                    }
                    return arrayList2;
                }
                return list;
            case -132489083:
                if (str.equals("ad.loadDuration")) {
                    ArrayList arrayList3 = new ArrayList(k13.r(list, 10));
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(a((String) it3.next(), "{{{time_dl}}}", str2));
                    }
                    return arrayList3;
                }
                return list;
            case 1516630125:
                if (str.equals("ad.close")) {
                    ArrayList arrayList4 = new ArrayList(k13.r(list, 10));
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(a(a((String) it4.next(), "{{{dur}}}", str2), "{{{vol}}}", str3));
                    }
                    return arrayList4;
                }
                return list;
            case 1940309120:
                if (str.equals("deeplink.click")) {
                    ArrayList arrayList5 = new ArrayList(k13.r(list, 10));
                    Iterator it5 = list.iterator();
                    while (it5.hasNext()) {
                        arrayList5.add(a((String) it5.next(), "{{{is_success}}}", str2));
                    }
                    return arrayList5;
                }
                return list;
            default:
                return list;
        }
    }

    public final i c() {
        return k();
    }

    public final int d() {
        f fVar;
        Integer num;
        i k = k();
        if (k == null || (fVar = k.z) == null || (num = fVar.a) == null) {
            return 0;
        }
        return num.intValue();
    }

    public final String e() {
        i k = k();
        if (k != null) {
            return k.w;
        }
        return null;
    }

    public final v2 f() {
        return this.b;
    }

    public final kotlinx.serialization.json.c g() {
        LinkedHashMap s = s();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : s.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            kotlinx.serialization.json.d c = qfa.c(str2);
            c.getClass();
        }
        return new kotlinx.serialization.json.c(linkedHashMap);
    }

    public final String h() {
        i k = k();
        if (k != null) {
            return k.a;
        }
        return null;
    }

    public final s i() {
        List list = this.a;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (s) list.get(0);
    }

    public final AdConfig j() {
        return this.g;
    }

    public final i k() {
        s i = i();
        if (i != null) {
            return i.b;
        }
        return null;
    }

    public final String l() {
        i k = k();
        if (k != null) {
            return k.c;
        }
        return null;
    }

    public final l m() {
        s i = i();
        if (i != null) {
            return i.c;
        }
        return null;
    }

    public final String n() {
        String str;
        i k = k();
        return (k == null || (str = k.v) == null) ? "unknown" : str;
    }

    public final String o() {
        v vVar;
        Map map;
        i k = k();
        if (k == null || (vVar = k.u) == null || (map = vVar.a) == null) {
            return null;
        }
        return (String) map.get("OBSERVED_EXPERIMENTS");
    }

    public final String p() {
        return this.i;
    }

    public final com.vungle.ads.internal.util.s q() {
        return this.h;
    }

    public final List r() {
        l lVar;
        s i = i();
        if (i == null || (lVar = i.c) == null) {
            return null;
        }
        return lVar.c;
    }

    public final LinkedHashMap s() {
        v vVar;
        Map map;
        v vVar2;
        Map map2;
        i k = k();
        if ((k != null ? k.u : null) == null) {
            a70.p("Advertisement does not have MRAID Arguments!");
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        i k2 = k();
        if (k2 != null && (vVar2 = k2.u) != null && (map2 = vVar2.a) != null) {
            linkedHashMap.putAll(map2);
        }
        i k3 = k();
        if (k3 != null && (vVar = k3.u) != null && (map = vVar.b) != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = ((o) entry.getValue()).a;
                if (str != null) {
                    linkedHashMap.put(entry.getKey(), str);
                }
            }
        }
        if (!this.d.isEmpty()) {
            linkedHashMap.putAll(this.d);
        }
        if (!this.e.isEmpty()) {
            linkedHashMap.putAll(this.e);
        }
        return linkedHashMap;
    }

    public final String t() {
        i k = k();
        if (k != null) {
            return k.i;
        }
        return null;
    }

    public final String u() {
        i k = k();
        if (k != null) {
            return k.o;
        }
        return null;
    }

    public final f0 v() {
        i k = k();
        if (k != null) {
            return k.A;
        }
        return null;
    }

    public final List w() {
        l lVar;
        s i = i();
        if (i == null || (lVar = i.c) == null) {
            return null;
        }
        return lVar.b;
    }

    public final boolean x() {
        i k = k();
        if (k == null) {
            return false;
        }
        Long l = this.c;
        if (k.e != null && l != null) {
            if ((System.currentTimeMillis() - l.longValue()) / 1000 > (k.e != null ? Long.valueOf(r10.intValue()) : null).longValue()) {
                return true;
            }
        } else if (k.d != null) {
            if (System.currentTimeMillis() / 1000 > (k.d != null ? Long.valueOf(r10.intValue()) : null).longValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean y() {
        v j;
        Map b;
        String str;
        i k = k();
        return (k == null || (j = k.j()) == null || (b = j.b()) == null || (str = (String) b.get("AD_PODDING")) == null || !str.equalsIgnoreCase("true")) ? false : true;
    }

    public final boolean z() {
        Boolean bool;
        i k = k();
        if (k == null || (bool = k.g) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean b(String str) {
        v j;
        Map a;
        str.getClass();
        if (!A()) {
            i k = k();
            if (Intrinsics.c(k != null ? k.m() : null, str)) {
                return true;
            }
        }
        i k2 = k();
        if (k2 == null || (j = k2.j()) == null || (a = j.a()) == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : a.entrySet()) {
            if (Intrinsics.c(((o) entry.getValue()).c(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return !linkedHashMap.isEmpty();
    }

    public final boolean b() {
        Boolean bool;
        i k = k();
        if (k == null || (bool = k.h) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final int a() {
        f fVar;
        Integer num;
        i k = k();
        if (k == null || (fVar = k.z) == null || (num = fVar.b) == null) {
            return 0;
        }
        return num.intValue();
    }

    public final void a(AdConfig adConfig) {
        this.g = adConfig;
    }

    public final void a(com.vungle.ads.internal.util.s sVar) {
        this.h = sVar;
    }

    public final b a(String str) {
        str.getClass();
        return (b) this.j.get(str);
    }

    public static final void a(h0 h0Var, wf3 wf3Var, uye uyeVar) {
        h0Var.getClass();
        wf3Var.getClass();
        uyeVar.getClass();
        if (wf3Var.o(uyeVar) || h0Var.a != null) {
            wf3Var.h(uyeVar, 0, new xg0(q.a, 0), h0Var.a);
        }
        if (wf3Var.o(uyeVar) || h0Var.b != null) {
            wf3Var.h(uyeVar, 1, u1.a, h0Var.b);
        }
        if (wf3Var.o(uyeVar) || h0Var.c != null) {
            wf3Var.h(uyeVar, 2, lkb.a, h0Var.c);
        }
        if (wf3Var.o(uyeVar) || !Intrinsics.c(h0Var.d, new ConcurrentHashMap())) {
            KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(ConcurrentHashMap.class);
            uhi uhiVar = uhi.a;
            wf3Var.f(uyeVar, 3, new qq3(orCreateKotlinClass, new KSerializer[]{uhiVar, uhiVar}), h0Var.d);
        }
        if (wf3Var.o(uyeVar) || !Intrinsics.c(h0Var.e, new HashMap())) {
            uhi uhiVar2 = uhi.a;
            wf3Var.f(uyeVar, 4, new q79(uhiVar2, uhiVar2, 1), h0Var.e);
        }
        if (wf3Var.o(uyeVar) || h0Var.f) {
            wf3Var.x(uyeVar, 5, h0Var.f);
        }
        if (!wf3Var.o(uyeVar) && h0Var.i == null) {
            return;
        }
        wf3Var.h(uyeVar, 6, uhi.a, h0Var.i);
    }

    public static /* synthetic */ List a(h0 h0Var, String str, String str2, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return h0Var.b(str, str2, null);
    }

    public final void a(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        if (str.length() > 0) {
            this.e.put("INCENTIVIZED_TITLE_TEXT", str);
        }
        if (str2.length() > 0) {
            this.e.put("INCENTIVIZED_BODY_TEXT", str2);
        }
        if (str3.length() > 0) {
            this.e.put("INCENTIVIZED_CONTINUE_TEXT", str3);
        }
        if (str4.length() > 0) {
            this.e.put("INCENTIVIZED_CLOSE_TEXT", str4);
        }
    }

    public final int a(Boolean bool) {
        Integer g;
        int intValue;
        Integer h;
        if (Intrinsics.c(bool, Boolean.TRUE)) {
            i k = k();
            if (k == null || (h = k.h()) == null) {
                return 0;
            }
            intValue = h.intValue();
        } else {
            i k2 = k();
            if (k2 == null || (g = k2.g()) == null) {
                return 0;
            }
            intValue = g.intValue();
        }
        return intValue * 1000;
    }

    public static String a(String str, String str2, String str3) {
        String quote = Pattern.quote(str2);
        quote.getClass();
        Regex regex = new Regex(quote);
        if (str3 == null) {
            str3 = "";
        }
        return regex.replace(str, str3);
    }

    public final synchronized void a(File file, String str) {
        str.getClass();
        file.getClass();
        if (file.exists()) {
            ConcurrentHashMap concurrentHashMap = this.d;
            StringBuilder a = com.iab.omid.library.vungle.internal.l.a("file://");
            a.append(file.getAbsolutePath());
            concurrentHashMap.put(str, a.toString());
        }
    }
}
