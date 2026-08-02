package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.SignalsConfig;
import defpackage.a70;
import defpackage.duf;
import defpackage.fuf;
import defpackage.h2d;
import defpackage.j2d;
import defpackage.joa;
import defpackage.kef;
import defpackage.lu3;
import defpackage.n1k;
import defpackage.sq3;
import defpackage.wel;
import defpackage.xw3;
import defpackage.y6a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.fh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3422fh {
    public static final C3422fh a;
    public static final /* synthetic */ KProperty[] b;
    public static final List c;
    public static Qg d;
    public static final M1 e;
    public static final M1 f;
    public static final h2d g;

    static {
        kef kefVar = new kef(C3422fh.class, "cachedJson", "getCachedJson()Lorg/json/JSONObject;", 0);
        fuf fufVar = duf.a;
        b = new KProperty[]{fufVar.property1(kefVar), fufVar.property1(new kef(C3422fh.class, "impressionDepth", "getImpressionDepth()Lorg/json/JSONObject;", 0))};
        a = new C3422fh();
        c = kotlin.collections.b.j("ban", "int", "rew", "nat");
        e = new M1(new JSONObject(), new wel(20), true, true);
        f = new M1(new JSONObject(), new wel(21), true, true);
        g = new j2d();
    }

    public static final Object b(C3422fh c3422fh, Map map, SignalsConfig.PublisherConfig publisherConfig, C3371dh c3371dh) {
        c3422fh.getClass();
        if (!publisherConfig.getDirect().getEnabled()) {
            Xb.a((byte) 1, "PubSignals", "Direct signals are disabled by InMobi");
            return Unit.a;
        }
        int count = publisherConfig.getDirect().getCount();
        n1k c2 = AbstractC3448gh.c(map, publisherConfig);
        String str = (String) c2.a;
        JSONObject jSONObject = (JSONObject) c2.b;
        String str2 = (String) c2.c;
        if (jSONObject == null) {
            return Unit.a;
        }
        c3422fh.a(str2, "d_i_dep");
        Object a2 = c3422fh.a(AbstractC3448gh.a(c3422fh.b(), str, jSONObject, count), c3371dh);
        return a2 == lu3.a ? a2 : Unit.a;
    }

    public static final Object c(C3422fh c3422fh, Map map, SignalsConfig.PublisherConfig publisherConfig, C3371dh c3371dh) {
        c3422fh.getClass();
        if (!publisherConfig.getObj().getEnabled()) {
            Xb.a((byte) 1, "PubSignals", "Object signals are disabled by InMobi");
            return Unit.a;
        }
        int count = publisherConfig.getObj().getCount();
        n1k b2 = AbstractC3448gh.b(map, publisherConfig);
        String str = (String) b2.a;
        JSONObject jSONObject = (JSONObject) b2.b;
        String str2 = (String) b2.c;
        if (jSONObject == null) {
            return Unit.a;
        }
        c3422fh.a(str2, "o_i_dep");
        Object a2 = c3422fh.a(AbstractC3448gh.a(c3422fh.b(), str, jSONObject, count), c3371dh);
        return a2 == lu3.a ? a2 : Unit.a;
    }

    public static final JSONObject f() {
        a.getClass();
        Context context = AbstractC3424fj.a;
        JSONObject jSONObject = null;
        if (context != null) {
            Qg qg = d;
            if (qg == null) {
                qg = new Qg(context, "pub_signals_store");
                d = qg;
            }
            if (qg == null) {
                Intrinsics.i("prefDao");
                throw null;
            }
            String a2 = qg.a("imp_depth");
            if (a2 != null) {
                jSONObject = new JSONObject(a2);
            }
        }
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060 A[Catch: all -> 0x0089, TRY_LEAVE, TryCatch #0 {all -> 0x0089, blocks: (B:11:0x005c, B:13:0x0060, B:18:0x008b, B:19:0x0090), top: B:10:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b A[Catch: all -> 0x0089, TRY_ENTER, TryCatch #0 {all -> 0x0089, blocks: (B:11:0x005c, B:13:0x0060, B:18:0x008b, B:19:0x0090), top: B:10:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(JSONObject jSONObject, sq3 sq3Var) {
        C3396eh c3396eh;
        int i;
        JSONObject jSONObject2;
        h2d h2dVar;
        Qg qg;
        try {
            if (sq3Var instanceof C3396eh) {
                c3396eh = (C3396eh) sq3Var;
                int i2 = c3396eh.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c3396eh.e = i2 - Integer.MIN_VALUE;
                    Object obj = c3396eh.c;
                    lu3 lu3Var = lu3.a;
                    i = c3396eh.e;
                    if (i != 0) {
                        y6a.M(obj);
                        Context context = AbstractC3424fj.a;
                        if (context != null) {
                            a.getClass();
                            if (d == null) {
                                d = new Qg(context, "pub_signals_store");
                            }
                            h2d h2dVar2 = g;
                            c3396eh.a = jSONObject;
                            c3396eh.b = h2dVar2;
                            c3396eh.e = 1;
                            if (h2dVar2.e(c3396eh) == lu3Var) {
                                return lu3Var;
                            }
                            jSONObject2 = jSONObject;
                            h2dVar = h2dVar2;
                        }
                        return Unit.a;
                    }
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    h2dVar = c3396eh.b;
                    jSONObject2 = c3396eh.a;
                    y6a.M(obj);
                    qg = d;
                    if (qg != null) {
                        Intrinsics.i("prefDao");
                        throw null;
                    }
                    String jSONObject3 = jSONObject2.toString();
                    jSONObject3.getClass();
                    qg.a.a("saved_signals", jSONObject3, true);
                    Unit unit = Unit.a;
                    h2dVar.f(null);
                    M1 m1 = e;
                    m1.c = m1.a.invoke();
                    Xb.a((byte) 2, "PubSignals", "Publisher Signals saved successfully.");
                    jSONObject2.toString();
                    return Unit.a;
                }
            }
            qg = d;
            if (qg != null) {
            }
        } catch (Throwable th) {
            h2dVar.f(null);
            throw th;
        }
        c3396eh = new C3396eh(this, sq3Var);
        Object obj2 = c3396eh.c;
        lu3 lu3Var2 = lu3.a;
        i = c3396eh.e;
        if (i != 0) {
        }
    }

    public final LinkedHashMap d() {
        JSONObject b2 = b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeysAnd = c().getObj().getAllowedKeysAnd();
        Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeys = c().getAuto().getAllowedKeys();
        List<String> list = c;
        SignalsConfig.PublisherConfig c2 = c();
        for (String str : list) {
            AbstractC3448gh.a(AbstractC3448gh.a(AbstractC3448gh.a(linkedHashMap, b2, "obj_", str, AbstractC3448gh.c(allowedKeysAnd)), b2, "auto_", str, AbstractC3448gh.c(allowedKeys)), b2, "dir_", str, c2.getDirect().getAllowedKeys());
        }
        return linkedHashMap;
    }

    public final JSONObject e() {
        JSONObject b2 = b();
        JSONObject jSONObject = new JSONObject();
        Iterator<String> keys = b2.keys();
        keys.getClass();
        while (keys.hasNext()) {
            String next = keys.next();
            next.getClass();
            if (!kotlin.text.c.v(next, "obj_", false) && !kotlin.text.c.v(next, "auto_", false) && !kotlin.text.c.v(next, "dir_", false)) {
                jSONObject.put(next, b2.opt(next));
            }
        }
        for (String str : c) {
            a.getClass();
            if (c().getObj().getEnabled()) {
                Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeysAnd = c().getObj().getAllowedKeysAnd();
                ArrayList arrayList = new ArrayList(allowedKeysAnd.size());
                Iterator<Map.Entry<String, SignalsConfig.PublisherConfig.KeyData>> it = allowedKeysAnd.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getValue().getName());
                }
                AbstractC3448gh.a(jSONObject, b2, str, "obj_", CollectionsKt.W0(arrayList));
            }
            a.getClass();
            if (c().getAuto().getEnabled()) {
                Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeys = c().getAuto().getAllowedKeys();
                ArrayList arrayList2 = new ArrayList(allowedKeys.size());
                Iterator<Map.Entry<String, SignalsConfig.PublisherConfig.KeyData>> it2 = allowedKeys.entrySet().iterator();
                while (it2.hasNext()) {
                    arrayList2.add(it2.next().getValue().getName());
                }
                AbstractC3448gh.a(jSONObject, b2, str, "auto_", CollectionsKt.W0(arrayList2));
            }
            a.getClass();
            if (c().getDirect().getEnabled()) {
                AbstractC3448gh.a(jSONObject, b2, str, "dir_", c().getDirect().getAllowedKeys().keySet());
            }
        }
        for (Pair pair : kotlin.collections.b.j(new Pair(c().getObj(), "o_i_dep"), new Pair(c().getDirect(), "d_i_dep"), new Pair(c().getAuto(), "a_i_dep"))) {
            SignalsConfig.PublisherConfig.BaseInputData baseInputData = (SignalsConfig.PublisherConfig.BaseInputData) pair.a;
            String str2 = (String) pair.b;
            if (baseInputData.getDepth().getEnabled()) {
                C3422fh c3422fh = a;
                c3422fh.getClass();
                JSONArray optJSONArray = ((JSONObject) f.getValue(c3422fh, b[1])).optJSONArray(str2);
                if (optJSONArray == null) {
                    Map map = AbstractC3448gh.a;
                    optJSONArray = new JSONArray();
                    optJSONArray.put(0);
                    optJSONArray.put(0);
                    optJSONArray.put(0);
                    optJSONArray.put(0);
                }
                jSONObject.put(str2, optJSONArray);
            }
        }
        jSONObject.toString();
        return jSONObject;
    }

    public static SignalsConfig.PublisherConfig c() {
        return ((SignalsConfig) AbstractC3435g4.a.a(SignalsConfig.class)).getPublisher();
    }

    public final JSONObject b() {
        return (JSONObject) e.getValue(this, b[0]);
    }

    public static final JSONObject a(C3422fh c3422fh) {
        c3422fh.getClass();
        JSONObject jSONObject = new JSONObject();
        Iterator<String> keys = a.b().keys();
        keys.getClass();
        while (keys.hasNext()) {
            String next = keys.next();
            next.getClass();
            if (kotlin.text.c.v(next, "obj_", false) || kotlin.text.c.v(next, "auto_", false) || kotlin.text.c.v(next, "dir_", false)) {
                jSONObject.put(next, a.b().opt(next));
            }
        }
        return jSONObject;
    }

    public static final Object a(C3422fh c3422fh, Map map, SignalsConfig.PublisherConfig publisherConfig, C3371dh c3371dh) {
        c3422fh.getClass();
        if (!publisherConfig.getAuto().getEnabled()) {
            return Unit.a;
        }
        int count = publisherConfig.getAuto().getCount();
        n1k a2 = AbstractC3448gh.a(map, publisherConfig);
        String str = (String) a2.a;
        JSONObject jSONObject = (JSONObject) a2.b;
        String str2 = (String) a2.c;
        if (jSONObject == null) {
            return Unit.a;
        }
        c3422fh.a(str2, "a_i_dep");
        Object a3 = c3422fh.a(AbstractC3448gh.a(c3422fh.b(), str, jSONObject, count), c3371dh);
        return a3 == lu3.a ? a3 : Unit.a;
    }

    public static final JSONObject a() {
        a.getClass();
        Context context = AbstractC3424fj.a;
        JSONObject jSONObject = null;
        if (context != null) {
            Qg qg = d;
            if (qg == null) {
                qg = new Qg(context, "pub_signals_store");
                d = qg;
            }
            if (qg != null) {
                String a2 = qg.a("saved_signals");
                if (a2 != null) {
                    jSONObject = new JSONObject(a2);
                }
            } else {
                Intrinsics.i("prefDao");
                throw null;
            }
        }
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public static void a(Map map) {
        map.getClass();
        try {
            SignalsConfig.PublisherConfig c2 = c();
            Map map2 = AbstractC3448gh.a;
            c2.getClass();
            if (!c2.getEnableMCO() && !c2.getEnableAB()) {
                Xb.a((byte) 1, "PubSignals", "Publisher signals are disabled from InMobi");
                return;
            }
            xw3.L(L9.e, null, null, new C3371dh(map, c2, null), 3);
        } catch (Exception e2) {
            joa joaVar = AbstractC3286aa.a;
            AbstractC3286aa.a(new Q2(e2));
            Xb.a((byte) 1, "PubSignals", "Publisher signals could not be saved due to an Internal Error.");
        }
    }

    public static void a(JSONObject jSONObject, String str, JSONArray jSONArray) {
        jSONObject.getClass();
        str.getClass();
        jSONArray.getClass();
        jSONObject.put(str, jSONArray);
        Context context = AbstractC3424fj.a;
        if (context != null) {
            a.getClass();
            if (d == null) {
                d = new Qg(context, "pub_signals_store");
            }
            jSONObject.toString();
            Qg qg = d;
            if (qg != null) {
                String jSONObject2 = jSONObject.toString();
                jSONObject2.getClass();
                jSONObject2.getClass();
                Qa qa = qg.a;
                ConcurrentHashMap concurrentHashMap = Qa.b;
                qa.a("imp_depth", jSONObject2, false);
                M1 m1 = f;
                m1.c = m1.a.invoke();
                return;
            }
            Intrinsics.i("prefDao");
            throw null;
        }
    }

    public final void a(String str, String str2) {
        int i;
        str.getClass();
        str2.getClass();
        M1 m1 = f;
        m1.c = m1.a.invoke();
        JSONObject jSONObject = (JSONObject) m1.getValue(this, b[1]);
        JSONArray optJSONArray = jSONObject.optJSONArray(str2);
        if (optJSONArray == null) {
            Map map = AbstractC3448gh.a;
            optJSONArray = new JSONArray();
            optJSONArray.put(0);
            optJSONArray.put(0);
            optJSONArray.put(0);
            optJSONArray.put(0);
        }
        int hashCode = str.hashCode();
        if (hashCode == 97295) {
            if (str.equals("ban")) {
                i = 0;
            }
            i = -1;
        } else if (hashCode == 104431) {
            if (str.equals("int")) {
                i = 1;
            }
            i = -1;
        } else if (hashCode != 108833) {
            if (hashCode == 112804 && str.equals("rew")) {
                i = 2;
            }
            i = -1;
        } else {
            if (str.equals("nat")) {
                i = 3;
            }
            i = -1;
        }
        if (i != -1) {
            optJSONArray.put(i, optJSONArray.optInt(i, 0) + 1);
            a(jSONObject, str2, optJSONArray);
        }
    }
}
