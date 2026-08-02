package com.vk.knet.cornet;

import Qa.AbstractC3855a;
import Qa.c;
import Sc.o;
import U7.m;
import Wa.e;
import android.content.Context;
import bd.h;
import bd.q;
import com.vk.knet.cornet.b;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.chromium.net.i;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f60685a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC3855a f60686b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f60687c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f60688d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f60689e;

    /* renamed from: f, reason: collision with root package name */
    private c f60690f;

    /* renamed from: g, reason: collision with root package name */
    private String f60691g;

    public a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f60685a = context;
    }

    @NotNull
    public final i a() {
        boolean z11;
        Object remove;
        boolean z12 = this.f60687c;
        Context context = this.f60685a;
        if (z12) {
            File file = new File(context.getFilesDir(), "network_internal/cronet/prefs/local_prefs.json");
            if (file.exists()) {
                try {
                    Charset charset = Charsets.UTF_8;
                    JSONObject jSONObject = new JSONObject(q.d(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), 8192)));
                    JSONObject optJSONObject = jSONObject.optJSONObject("net");
                    if (optJSONObject != null) {
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("http_server_properties");
                        if (optJSONObject2 == null || (remove = optJSONObject2.remove("broken_alternative_services")) == null) {
                            z11 = false;
                        } else {
                            e.b(m.b(remove, "Startup QUIC executor found broken hosts: "));
                            z11 = true;
                        }
                        Object remove2 = optJSONObject.remove("broken_alternative_services");
                        if (remove2 != null) {
                            e.b(m.b(remove2, "Startup QUIC executor found broken hosts: "));
                            z11 = true;
                        }
                        if (z11) {
                            String jSONObject2 = jSONObject.toString();
                            Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
                            h.o(file, jSONObject2, charset);
                        }
                    }
                } catch (Throwable th2) {
                    e.b(th2);
                    try {
                        file.delete();
                    } catch (Throwable th3) {
                        e.b(th3);
                    }
                }
            }
        }
        i.a aVar = new i.a(context);
        AbstractC3855a abstractC3855a = this.f60686b;
        if (abstractC3855a != null) {
            if (abstractC3855a instanceof AbstractC3855a.C0457a) {
                try {
                    if (!((AbstractC3855a.C0457a) abstractC3855a).a().exists()) {
                        ((AbstractC3855a.C0457a) abstractC3855a).a().mkdirs();
                    }
                    aVar.i(((AbstractC3855a.C0457a) abstractC3855a).a().getAbsolutePath());
                    aVar.f(2, ((AbstractC3855a.C0457a) abstractC3855a).b());
                } catch (Exception unused) {
                    Unit unit = Unit.f71690a;
                }
            } else if (abstractC3855a instanceof AbstractC3855a.c) {
                aVar.f(1, 0L);
            } else if (!(abstractC3855a instanceof AbstractC3855a.b)) {
                throw new o();
            }
        }
        aVar.e(this.f60688d);
        aVar.b(this.f60689e);
        String str = this.f60691g;
        if (str != null) {
            aVar.j(str);
        }
        c cVar = this.f60690f;
        boolean z13 = cVar != null;
        e.a(b.a.CLIENT_BUILDER, "[cronet] QuicOptions - " + cVar);
        aVar.g(z13);
        if (cVar != null) {
            Iterator<T> it = cVar.e().iterator();
            while (it.hasNext()) {
                aVar.d(443, 443, ((Ja.a) it.next()).a());
            }
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("max_server_configs_stored_in_properties", cVar.g());
            jSONObject4.put("idle_connection_timeout_seconds", cVar.f());
            jSONObject4.put("reduced_ping_timeout_seconds", cVar.i());
            jSONObject4.put("close_sessions_on_ip_change", cVar.b());
            jSONObject4.put("goaway_sessions_on_ip_change", cVar.d());
            jSONObject4.put("migrate_sessions_on_network_change_v2", false);
            jSONObject4.put("migrate_sessions_early_v2", false);
            jSONObject4.put("migrate_idle_sessions", false);
            jSONObject4.put("origins_to_force_quic_on", cVar.h());
            jSONObject4.put("enable_socket_recv_optimization", cVar.h());
            jSONObject4.put("disable_tls_zero_rtt", cVar.c());
            jSONObject4.put("retry_on_alternate_network_before_handshake", cVar.j());
            Iterator<T> it2 = cVar.a().entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                jSONObject4.put((String) entry.getKey(), entry.getValue().toString());
            }
            Unit unit2 = Unit.f71690a;
            jSONObject3.put("QUIC", jSONObject4);
            aVar.h(jSONObject3.toString());
        }
        i a11 = aVar.a();
        Intrinsics.checkNotNullExpressionValue(a11, "build(...)");
        return a11;
    }

    @NotNull
    public final void b() {
        this.f60689e = true;
    }

    @NotNull
    public final void c(@NotNull AbstractC3855a cache) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.f60686b = cache;
    }

    @NotNull
    public final void d() {
        this.f60687c = true;
    }

    @NotNull
    public final void e() {
        this.f60688d = true;
    }

    @NotNull
    public final void f(@NotNull c options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f60690f = options;
    }

    @NotNull
    public final void g(@NotNull String userAgent) {
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        this.f60691g = userAgent;
    }
}
