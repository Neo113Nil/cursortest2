package com.vk.api.request.rx.batch;

import com.vk.api.sdk.VKApiConfig;
import com.vk.api.sdk.a;
import com.vk.api.sdk.exceptions.VKApiException;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NotImplementedError;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.ara;
import xsna.asp;
import xsna.av6;
import xsna.bv6;
import xsna.c5g;
import xsna.d4y0;
import xsna.drm0;
import xsna.dz5;
import xsna.fpf0;
import xsna.g5j;
import xsna.har0;
import xsna.iyx;
import xsna.j9y;
import xsna.jgp;
import xsna.k9y;
import xsna.l7r0;
import xsna.ozl;
import xsna.pbr0;
import xsna.pn00;
import xsna.qjg;
import xsna.rsg0;
import xsna.ugs;
import xsna.v6l;
import xsna.vx2;
import xsna.wy2;
import xsna.zp6;
import xsna.zrp;

/* compiled from: BatchRxApiRequest.kt */
@ozl
/* loaded from: classes15.dex */
public abstract class BatchRxApiRequest<T> extends rsg0<T> {
    public final rsg0<? extends Object>[] s;
    public boolean t;
    public FailStrategy u;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BatchRxApiRequest.kt */
    public static final class FailStrategy {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ FailStrategy[] $VALUES;
        public static final FailStrategy DoNotFailOnError;
        public static final FailStrategy FailOnAnyError;

        static {
            FailStrategy failStrategy = new FailStrategy("FailOnAnyError", 0);
            FailOnAnyError = failStrategy;
            FailStrategy failStrategy2 = new FailStrategy("DoNotFailOnError", 1);
            DoNotFailOnError = failStrategy2;
            FailStrategy[] failStrategyArr = {failStrategy, failStrategy2};
            $VALUES = failStrategyArr;
            $ENTRIES = new asp(failStrategyArr);
        }

        public FailStrategy() {
            throw null;
        }

        public static FailStrategy valueOf(String str) {
            return (FailStrategy) Enum.valueOf(FailStrategy.class, str);
        }

        public static FailStrategy[] values() {
            return (FailStrategy[]) $VALUES.clone();
        }
    }

    /* compiled from: BatchRxApiRequest.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0 */
        /* JADX WARN: Type inference failed for: r10v18 */
        /* JADX WARN: Type inference failed for: r10v7, types: [boolean, int] */
        public static bv6[] a(JSONObject jSONObject, rsg0[] rsg0VarArr, FailStrategy failStrategy, boolean z) {
            JSONArray jSONArray;
            VKApiException vKApiException;
            T t;
            Pair pair;
            Object obj;
            k9y k9yVar;
            Pair pair2;
            int i;
            ?? r10 = 0;
            if (!z) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("responses");
                int length = rsg0VarArr.length;
                bv6[] bv6VarArr = new bv6[length];
                for (int i2 = 0; i2 < length; i2++) {
                    bv6VarArr[i2] = new bv6(null, null);
                }
                if (jSONArray2 != null) {
                    int length2 = jSONArray2.length();
                    int i3 = 0;
                    while (i3 < length2) {
                        JSONObject jSONObject2 = jSONArray2.getJSONObject(i3);
                        int parseInt = Integer.parseInt(jSONObject2.getString("id"));
                        JSONObject optJSONObject = jSONObject2.optJSONObject("body");
                        JSONObject optJSONObject2 = jSONObject2.optJSONObject("error");
                        if (optJSONObject2 != null) {
                            jSONArray = jSONArray2;
                            vKApiException = pbr0.c(optJSONObject2, 4, rsg0VarArr[parseInt].b);
                        } else {
                            jSONArray = jSONArray2;
                            vKApiException = null;
                        }
                        if (vKApiException != null && failStrategy == FailStrategy.FailOnAnyError) {
                            throw vKApiException;
                        }
                        if (optJSONObject != null) {
                            try {
                                t = rsg0VarArr[parseInt].a(optJSONObject);
                            } catch (Exception e) {
                                String message = e.getMessage();
                                if (message == null || !drm0.D(message, "Expected BEGIN_OBJECT but was BEGIN_ARRAY", false)) {
                                    throw e;
                                }
                                t = null;
                            }
                        } else {
                            t = null;
                        }
                        bv6VarArr[parseInt] = new bv6(t, vKApiException);
                        i3++;
                        jSONArray2 = jSONArray;
                    }
                }
                int length3 = rsg0VarArr.length;
                int i4 = 0;
                int i5 = 0;
                while (i5 < length3) {
                    rsg0 rsg0Var = rsg0VarArr[i5];
                    int i6 = i4 + 1;
                    if (rsg0Var instanceof g5j) {
                        bv6VarArr[i4] = new bv6(rsg0Var.u(0L), null);
                    }
                    i5++;
                    i4 = i6;
                }
                if (failStrategy == FailStrategy.FailOnAnyError) {
                    for (int i7 = 0; i7 < length; i7++) {
                        bv6 bv6Var = bv6VarArr[i7];
                        if (bv6Var.a == null && bv6Var.b == null) {
                            throw new VKApiException("Batch execution timeout: Not all responses were received");
                        }
                    }
                }
                return bv6VarArr;
            }
            JSONArray jSONArray3 = jSONObject.getJSONArray("responses");
            int length4 = rsg0VarArr.length;
            bv6[] bv6VarArr2 = new bv6[length4];
            for (int i8 = 0; i8 < length4; i8++) {
                bv6VarArr2[i8] = new bv6(null, null);
            }
            j9y i9 = dz5.i(jSONArray3);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            k9y k9yVar2 = i9.a;
            while (k9yVar2.hasNext()) {
                JSONObject jSONObject3 = (JSONObject) k9yVar2.next();
                String string = jSONObject3.getString("id");
                if (drm0.D(string, StringUtils.PROCESS_POSTFIX_DELIMITER, r10)) {
                    k9yVar = k9yVar2;
                    List c0 = drm0.c0(string, new String[]{StringUtils.PROCESS_POSTFIX_DELIMITER}, r10, 6);
                    ArrayList arrayList = new ArrayList(c5g.u(c0, 10));
                    Iterator<T> it = c0.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
                    }
                    pair2 = new Pair(arrayList.get(r10), arrayList.get(1));
                } else {
                    k9yVar = k9yVar2;
                    pair2 = new Pair(Integer.valueOf(Integer.parseInt(string)), null);
                }
                int intValue = ((Number) pair2.d()).intValue();
                Integer num = (Integer) pair2.g();
                if (num != null) {
                    if (linkedHashMap.get(Integer.valueOf(intValue)) == null) {
                        Integer valueOf = Integer.valueOf(intValue);
                        JSONObject jSONObject4 = new JSONObject();
                        i = intValue;
                        jSONObject4.put("responses", new JSONArray());
                        linkedHashMap.put(valueOf, jSONObject4);
                    } else {
                        i = intValue;
                    }
                    JSONArray jSONArray4 = (JSONArray) ((JSONObject) linkedHashMap.get(Integer.valueOf(i))).get("responses");
                    jSONObject3.put("id", num.intValue());
                    jSONArray4.put(jSONObject3);
                } else {
                    linkedHashMap.put(Integer.valueOf(intValue), jSONObject3);
                }
                k9yVar2 = k9yVar;
                r10 = 0;
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                int intValue2 = ((Number) entry.getKey()).intValue();
                JSONObject jSONObject5 = (JSONObject) entry.getValue();
                if (jSONObject5.optJSONArray("responses") != null) {
                    pair = new Pair(jSONObject5, null);
                } else {
                    JSONObject optJSONObject3 = jSONObject5.optJSONObject("body");
                    JSONObject optJSONObject4 = jSONObject5.optJSONObject("error");
                    VKApiException c = optJSONObject4 != null ? pbr0.c(optJSONObject4, 4, rsg0VarArr[intValue2].b) : null;
                    if (c != null && failStrategy == FailStrategy.FailOnAnyError) {
                        throw c;
                    }
                    pair = new Pair(optJSONObject3, c);
                }
                JSONObject jSONObject6 = (JSONObject) pair.d();
                VKApiException vKApiException2 = (VKApiException) pair.g();
                try {
                    rsg0 rsg0Var2 = rsg0VarArr[intValue2];
                    obj = (rsg0Var2 instanceof BatchRxApiRequest ? new h(1, (BatchRxApiRequest) rsg0Var2, BatchRxApiRequest.class, "map", "map(Lorg/json/JSONObject;)Ljava/lang/Object;", 0) : new i(1, rsg0Var2, rsg0.class, "parse", "parse(Lorg/json/JSONObject;)Ljava/lang/Object;", 0)).invoke(jSONObject6);
                } catch (Exception e2) {
                    String message2 = e2.getMessage();
                    if (message2 == null || !drm0.D(message2, "Expected BEGIN_OBJECT but was BEGIN_ARRAY", false)) {
                        throw e2;
                    }
                    obj = null;
                }
                bv6VarArr2[intValue2] = new bv6(obj, vKApiException2);
            }
            int length5 = rsg0VarArr.length;
            int i10 = 0;
            int i11 = 0;
            while (i11 < length5) {
                rsg0 rsg0Var3 = rsg0VarArr[i11];
                int i12 = i10 + 1;
                if (rsg0Var3 instanceof g5j) {
                    bv6VarArr2[i10] = new bv6(rsg0Var3.u(0L), null);
                }
                i11++;
                i10 = i12;
            }
            if (failStrategy != FailStrategy.FailOnAnyError) {
                return bv6VarArr2;
            }
            for (int i13 = 0; i13 < length4; i13++) {
                bv6 bv6Var2 = bv6VarArr2[i13];
                if (bv6Var2.a == null && bv6Var2.b == null) {
                    throw new VKApiException("Batch execution timeout: Not all responses were received");
                }
            }
            return bv6VarArr2;
        }
    }

    public BatchRxApiRequest() {
        throw null;
    }

    public BatchRxApiRequest(rsg0[] rsg0VarArr) {
        super("batch.call");
        this.s = rsg0VarArr;
        this.t = false;
        this.u = FailStrategy.FailOnAnyError;
    }

    public static com.vk.api.sdk.a F0(rsg0 rsg0Var) {
        a.C0374a c0374a = new a.C0374a();
        c0374a.e = rsg0Var.i;
        c0374a.c = rsg0Var.b;
        LinkedHashMap<String, String> linkedHashMap = rsg0Var.j;
        linkedHashMap.put("lang", vx2.d.q());
        String str = rsg0Var.j.get("device_id");
        if (str == null) {
            str = vx2.d.getDeviceId();
        }
        linkedHashMap.put("device_id", str);
        c0374a.f.putAll(linkedHashMap);
        c0374a.b = rsg0Var.e;
        c0374a.d = rsg0Var.k();
        c0374a.m = rsg0Var.f;
        c0374a.n = rsg0Var.g;
        c0374a.o = rsg0Var.h;
        return new com.vk.api.sdk.a(c0374a);
    }

    @Override // xsna.rsg0
    public final void B(String str, String str2) {
        for (rsg0<? extends Object> rsg0Var : this.s) {
            rsg0Var.B(str, str2);
        }
        this.l = str;
        this.m = str2;
    }

    public abstract T H0(JSONObject jSONObject);

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.xz2, xsna.nx2
    public final T f(l7r0 l7r0Var) {
        if (!(l7r0Var instanceof wy2)) {
            throw new NotImplementedError("manager " + qjg.a(fpf0.a(l7r0Var.getClass())) + " cannot execute batch requests");
        }
        VKApiConfig vKApiConfig = l7r0Var.a;
        har0.a aVar = new har0.a();
        aVar.x = jgp.b;
        aVar.c = "batch.call";
        aVar.e = this.i;
        aVar.a = vx2.d.l();
        aVar.d = vx2.d.d();
        aVar.i = this.n;
        aVar.g = this.q;
        aVar.h = this.p;
        aVar.q = this.l;
        aVar.r = this.m;
        aVar.j = l();
        aVar.l = this.d;
        aVar.k = this.c;
        aVar.m = this.f;
        aVar.n = this.g;
        aVar.o = this.h;
        rsg0<? extends Object>[] rsg0VarArr = this.s;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = rsg0VarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            rsg0<? extends Object> rsg0Var = rsg0VarArr[i];
            int i3 = i2 + 1;
            if (!(rsg0Var instanceof g5j)) {
                if (!(rsg0Var instanceof BatchRxApiRequest)) {
                    linkedHashMap.put(String.valueOf(i2), F0(rsg0Var));
                } else {
                    if (!this.t) {
                        throw new IllegalArgumentException("Can't use batch inside batch, please turn on allowNestedBatchRequests flag or re-design your code.");
                    }
                    rsg0<? extends Object>[] rsg0VarArr2 = ((BatchRxApiRequest) rsg0Var).s;
                    int length2 = rsg0VarArr2.length;
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < length2) {
                        rsg0<? extends Object> rsg0Var2 = rsg0VarArr2[i4];
                        int i6 = i5 + 1;
                        if (rsg0Var2 instanceof BatchRxApiRequest) {
                            throw new IllegalStateException("Only one level of nested batch.call request!");
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(i2);
                        sb.append(':');
                        sb.append(i5);
                        linkedHashMap.put(sb.toString(), F0(rsg0Var2));
                        i4++;
                        i5 = i6;
                    }
                }
            }
            i++;
            i2 = i3;
        }
        aVar.x = pn00.n(aVar.x, linkedHashMap);
        wy2 wy2Var = (wy2) l7r0Var;
        har0 har0Var = new har0(aVar);
        VKApiConfig vKApiConfig2 = wy2Var.a;
        Set<String> set = zp6.a;
        v6l v6lVar = wy2Var.j;
        List<String> list = v6lVar != null ? v6lVar.e : null;
        vKApiConfig2.G.invoke();
        zp6.a(har0Var, list);
        long incrementAndGet = wy2.q.incrementAndGet();
        har0Var.x = Long.valueOf(incrementAndGet);
        ara<? extends T> i7 = iyx.i(new d4y0(wy2Var, iyx.i(new av6(wy2Var, incrementAndGet, wy2Var.i(), har0Var), wy2Var.r(), "BatchMethod", har0Var.c)), wy2Var.r(), "XRetry", null);
        if (((Boolean) vKApiConfig2.n.getValue()).booleanValue()) {
            i7 = iyx.i(new ugs(wy2Var, har0Var, i7), wy2Var.r(), "FrequentMethod", null);
        }
        return H0((JSONObject) wy2Var.h(wy2Var.k(har0Var, i7)));
    }
}
