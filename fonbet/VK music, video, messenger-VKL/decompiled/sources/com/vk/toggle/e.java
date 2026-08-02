package com.vk.toggle;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.toggle.b;
import com.vk.toggle.data.StartupBackoffMode;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.commons.http.Http;
import xsna.arm0;
import xsna.b260;
import xsna.db3;
import xsna.drm0;
import xsna.eqy;
import xsna.fu2;
import xsna.h360;
import xsna.hiv;
import xsna.izs;
import xsna.mnk0;
import xsna.mu2;
import xsna.nxv;
import xsna.oxv;
import xsna.qxv;
import xsna.s260;
import xsna.v7y0;
import xsna.vbp;
import xsna.yx2;

/* compiled from: NetworkFeaturesHelperImpl.kt */
/* loaded from: classes11.dex */
public final class e implements h360 {
    public final f a;
    public final eqy<b260> b = new eqy<>(new fu2(this, 3), new b(1, b260.o, b260.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/NetConfig;", 0));
    public final eqy<v7y0> c = new eqy<>(new vbp(this, 4), new C1929e(1, v7y0.d, v7y0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/ZstdToggleConfig;", 0));
    public final eqy<mnk0> d = new eqy<>(new nxv(this, 2), new d(1, mnk0.i, mnk0.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/SseConfig;", 0));
    public final eqy<yx2> e = new eqy<>(new oxv(this, 5), new db3(1));
    public final eqy<hiv> f = new eqy<>(new qxv(this, 2), new a(1, hiv.k, hiv.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/HttpCacheConfig;", 0));
    public final eqy<s260> g = new eqy<>(new mu2(this, 5), new c(1, s260.b, s260.a.class, "from", "from(Ljava/lang/String;)Lcom/vk/toggle/data/NetworkCommonExperiment;", 0));

    /* compiled from: NetworkFeaturesHelperImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<String, hiv> {
        /* JADX WARN: Removed duplicated region for block: B:41:0x00fd  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0102 A[Catch: Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:3:0x000f, B:5:0x001c, B:7:0x0028, B:10:0x003e, B:12:0x004e, B:14:0x0056, B:16:0x005e, B:18:0x0066, B:23:0x007b, B:26:0x0089, B:30:0x00ab, B:31:0x00b2, B:36:0x00cc, B:39:0x00da, B:43:0x0102, B:44:0x0108, B:54:0x0064, B:55:0x0054, B:57:0x0025), top: B:2:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
        @Override // xsna.izs
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final hiv invoke(String str) {
            List list;
            List list2;
            int i;
            String str2 = str;
            ((hiv.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                JSONArray optJSONArray = jSONObject.optJSONArray("cacheable_paths");
                Map c = optJSONArray != null ? hiv.a.c(optJSONArray) : hiv.l;
                boolean optBoolean = jSONObject.optBoolean("try_to_cache_all_methods", false);
                String optString = jSONObject.optString("fallback_cache_control");
                String str3 = !drm0.N(optString) ? optString : null;
                int optInt = jSONObject.optInt("version", 1);
                JSONArray optJSONArray2 = jSONObject.optJSONArray("cache_control_overrides");
                if (optJSONArray2 == null || (list = hiv.a.a(optJSONArray2)) == null) {
                    list = hiv.m;
                }
                JSONArray optJSONArray3 = jSONObject.optJSONArray("cache_key_transformers");
                if (optJSONArray3 == null || (list2 = hiv.a.b(optJSONArray3)) == null) {
                    list2 = hiv.n;
                }
                int optInt2 = jSONObject.optInt("http_cache_max_size_in_megabytes", 0);
                Integer valueOf = Integer.valueOf(optInt2);
                boolean z = optInt2 > 0 && optInt2 <= 100;
                if (!z) {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.w, new Object[]{"HttpCacheConfig", "HTTP cache size can't be greater than 100MB but must be greater than 0MB. You set " + optInt2 + "MB. Fallback to 100MB."});
                    }
                }
                if (!z) {
                    valueOf = null;
                }
                int intValue = valueOf != null ? valueOf.intValue() : 100;
                boolean z2 = false;
                boolean optBoolean2 = jSONObject.optBoolean("collect_statistics", false);
                int optInt3 = jSONObject.optInt("statistics_max_size_in_megabytes", 1);
                Integer valueOf2 = Integer.valueOf(optInt3);
                if (optInt3 > 0 && optInt3 <= 3) {
                    z2 = true;
                }
                if (!z2) {
                    L l2 = L.a;
                    l2.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        i = optInt;
                        L.u(l2, L.LogType.w, new Object[]{"HttpCacheConfig", "HTTP cache statistics size can't be greater than 3MB but must be greater than 0MB. You set " + optInt3 + "MB. Fallback to 3MB."});
                        Integer num = !z2 ? valueOf2 : null;
                        return new hiv(c, optBoolean, str3, i, list, list2, intValue, optBoolean2, num == null ? num.intValue() : 3);
                    }
                }
                i = optInt;
                if (!z2) {
                }
                return new hiv(c, optBoolean, str3, i, list, list2, intValue, optBoolean2, num == null ? num.intValue() : 3);
            } catch (Exception e) {
                L.j(e, "HttpCacheConfig");
                return hiv.o;
            }
        }
    }

    /* compiled from: NetworkFeaturesHelperImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<String, b260> {
        @Override // xsna.izs
        public final b260 invoke(String str) {
            String str2;
            String str3 = str;
            ((b260.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str3);
                long optLong = jSONObject.optLong("min_backoff_time", 60000L);
                long optLong2 = jSONObject.optLong("backoff_time", 900000L);
                long optLong3 = jSONObject.optLong("backoff_token_time", 100L);
                long optLong4 = jSONObject.optLong("backoff_token_time_max", 60000L);
                long optLong5 = jSONObject.optLong("backoff_left_bound_limit_time", 3000L);
                long optLong6 = jSONObject.optLong("connect_timeout", 25L);
                long optLong7 = jSONObject.optLong("io_timeout", 25L);
                long optLong8 = jSONObject.optLong("voip_lp_timeout", 20L);
                long optLong9 = jSONObject.optLong("msg_lp_timeout", 25L);
                boolean optBoolean = jSONObject.optBoolean("is_image_executor", false);
                boolean optBoolean2 = jSONObject.optBoolean("is_socket_channel", false);
                boolean optBoolean3 = jSONObject.optBoolean("firebase_error_logging", false);
                JSONObject optJSONObject = jSONObject.optJSONObject("cronet_config");
                if (optJSONObject == null || (str2 = optJSONObject.toString()) == null) {
                    str2 = "";
                }
                return new b260(optLong, optLong2, optLong3, optLong4, optLong5, optLong6, optLong7, optLong8, optLong9, optBoolean, optBoolean2, optBoolean3, str2, jSONObject.optBoolean("is_net_small_stat", false));
            } catch (Exception e) {
                L.i(e);
                return b260.p;
            }
        }
    }

    /* compiled from: NetworkFeaturesHelperImpl.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<String, s260> {
        @Override // xsna.izs
        public final s260 invoke(String str) {
            ((s260.a) this.receiver).getClass();
            Integer m = arm0.m(10, str);
            return (m != null && m.intValue() == 1) ? new s260(true) : new s260(false);
        }
    }

    /* compiled from: NetworkFeaturesHelperImpl.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<String, mnk0> {
        @Override // xsna.izs
        public final mnk0 invoke(String str) {
            String str2 = str;
            ((mnk0.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                return new mnk0(jSONObject.optInt("read_timeout", 25000), jSONObject.optBoolean("sse_enabled", false), jSONObject.optBoolean("sse_quic", false), jSONObject.optBoolean("stat_enabled", false), jSONObject.optInt("two_g_trsh", 15000), jSONObject.optInt("three_g_trsh", 10000), jSONObject.optInt("wifi_trsh", 5000), jSONObject.optBoolean(Http.ContentEncoding.GZIP, false));
            } catch (Exception e) {
                L.i(e);
                return mnk0.j;
            }
        }
    }

    /* compiled from: NetworkFeaturesHelperImpl.kt */
    /* renamed from: com.vk.toggle.e$e, reason: collision with other inner class name */
    public static final /* synthetic */ class C1929e extends FunctionReferenceImpl implements izs<String, v7y0> {
        @Override // xsna.izs
        public final v7y0 invoke(String str) {
            String str2 = str;
            ((v7y0.a) this.receiver).getClass();
            try {
                JSONObject jSONObject = new JSONObject(str2);
                return new v7y0(jSONObject.optBoolean("zstd_enabled", false), jSONObject.optBoolean("stat_enabled", false), "no_dict");
            } catch (Exception e) {
                L.i(e);
                return v7y0.e;
            }
        }
    }

    public e(f fVar) {
        this.a = fVar;
    }

    @Override // xsna.h360
    public final s260 a() {
        return this.g.c();
    }

    @Override // xsna.h360
    public final hiv b() {
        hiv c2 = this.f.c();
        if (c2 != null) {
            return c2;
        }
        hiv.k.getClass();
        return hiv.p;
    }

    @Override // xsna.h360
    public final mnk0 c() {
        mnk0 c2 = this.d.c();
        if (c2 != null) {
            return c2;
        }
        mnk0.i.getClass();
        return mnk0.j;
    }

    @Override // xsna.h360
    public final v7y0 d() {
        v7y0 c2 = this.c.c();
        if (c2 != null) {
            return c2;
        }
        v7y0.d.getClass();
        return v7y0.e;
    }

    @Override // xsna.h360
    public final f e() {
        return this.a;
    }

    @Override // xsna.h360
    public final StartupBackoffMode f() {
        StartupBackoffMode.a aVar = StartupBackoffMode.Companion;
        b.d f = this.a.f();
        Integer b2 = f != null ? f.b() : null;
        aVar.getClass();
        return (b2 != null && b2.intValue() == 0) ? StartupBackoffMode.DO_NOT_WAIT : (b2 != null && b2.intValue() == 1) ? StartupBackoffMode.WAIT_REQUESTS : (b2 != null && b2.intValue() == 2) ? StartupBackoffMode.WAIT_RESPONSES : StartupBackoffMode.DEFAULT;
    }

    @Override // xsna.h360
    public final b260 g() {
        b260 b2 = this.b.b();
        if (b2 != null) {
            return b2;
        }
        b260.o.getClass();
        return b260.p;
    }

    @Override // xsna.h360
    public final yx2 getApiConfig() {
        yx2 c2 = this.e.c();
        if (c2 != null) {
            return c2;
        }
        Set<String> set = yx2.g;
        return yx2.i;
    }
}
