package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.tc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0504tc implements F8 {

    /* renamed from: a, reason: collision with root package name */
    public final Qg f14673a;

    /* renamed from: b, reason: collision with root package name */
    public final We f14674b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14675c = "activation_unlock_event_sending";

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f14676d;

    public C0504tc(@NotNull Qg qg2, @NotNull C0372o4 c0372o4, @NotNull We we2) {
        this.f14673a = qg2;
        this.f14674b = we2;
        this.f14676d = new AtomicBoolean(we2.a(false) || a(c0372o4));
    }

    public final void a(String str) {
        try {
            Qj qj = AbstractC0387oj.f14425a;
            String str2 = this.f14675c;
            JSONObject put = new JSONObject().put(AdRevenueConstants.SOURCE_KEY, str).put("framework", FrameworkDetector.framework());
            M9 i5 = C0353na.I.i();
            Bundle applicationMetaData = i5.f12579d.getApplicationMetaData(i5.f12576a);
            JSONObject put2 = put.put("appmetrica_plugin_id", applicationMetaData != null ? applicationMetaData.getString("io.appmetrica.analytics.plugin_id") : null);
            C0338mk c0338mk = C0353na.I.D;
            String jSONObject = put2.put("activation_offset", TimeUnit.SECONDS.convert(c0338mk.f14280a.currentTimeMillis() - c0338mk.f14281b, TimeUnit.MILLISECONDS)).toString();
            qj.getClass();
            qj.a(new Oj(str2, jSONObject));
        } catch (Throwable unused) {
        }
    }

    @Override // io.appmetrica.analytics.impl.F8
    public final boolean b() {
        String str;
        if (!this.f14676d.get() && (str = ((C0285kh) this.f14673a.a()).f14133m) != null && !Intrinsics.areEqual(str, "629a824d-c717-4ba5-bc0f-3f3968554d01") && this.f14676d.compareAndSet(false, true)) {
            this.f14674b.b(true);
            a("activation");
        }
        return this.f14676d.get();
    }

    public final void a() {
        if (this.f14676d.compareAndSet(false, true)) {
            this.f14674b.b(true);
            a("timer");
        }
    }

    public static boolean a(C0372o4 c0372o4) {
        String str = c0372o4.f14381a;
        return (str == null || Intrinsics.areEqual(str, "629a824d-c717-4ba5-bc0f-3f3968554d01")) ? false : true;
    }
}
