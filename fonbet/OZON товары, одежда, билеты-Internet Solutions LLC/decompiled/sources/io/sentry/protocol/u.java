package io.sentry.protocol;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.C7212v0;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class u implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private String f68327a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private String f68328b;

    /* renamed from: c, reason: collision with root package name */
    private HashMap f68329c;

    public static final class a implements InterfaceC7174n0<u> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final u a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            interfaceC7131c1.beginObject();
            String str = null;
            String str2 = null;
            HashMap hashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                if (nextName.equals(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                    str = interfaceC7131c1.nextString();
                } else if (nextName.equals("version")) {
                    str2 = interfaceC7131c1.nextString();
                } else {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    interfaceC7131c1.Q0(iLogger, hashMap, nextName);
                }
            }
            interfaceC7131c1.endObject();
            if (str == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"name\"");
                iLogger.a(I2.ERROR, "Missing required field \"name\"", illegalStateException);
                throw illegalStateException;
            }
            if (str2 != null) {
                u uVar = new u(str, str2);
                uVar.c(hashMap);
                return uVar;
            }
            IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"version\"");
            iLogger.a(I2.ERROR, "Missing required field \"version\"", illegalStateException2);
            throw illegalStateException2;
        }
    }

    public u(@NotNull String str, @NotNull String str2) {
        this.f68327a = str;
        this.f68328b = str2;
    }

    @NotNull
    public final String a() {
        return this.f68327a;
    }

    @NotNull
    public final String b() {
        return this.f68328b;
    }

    public final void c(Map<String, Object> map) {
        this.f68329c = (HashMap) map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (Objects.equals(this.f68327a, uVar.f68327a) && Objects.equals(this.f68328b, uVar.f68328b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f68327a, this.f68328b);
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        c7212v0.g(AppMeasurementSdk.ConditionalUserProperty.NAME);
        c7212v0.p(this.f68327a);
        c7212v0.g("version");
        c7212v0.p(this.f68328b);
        HashMap hashMap = this.f68329c;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                I1.w.e(this.f68329c, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }
}
