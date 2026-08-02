package io.sentry;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class L2 implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private String f66684a;

    /* renamed from: b, reason: collision with root package name */
    private Object f66685b;

    /* renamed from: c, reason: collision with root package name */
    private HashMap f66686c;

    public static final class a implements InterfaceC7174n0<L2> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final L2 a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            interfaceC7131c1.beginObject();
            String str = null;
            Object obj = null;
            HashMap hashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                if (nextName.equals("type")) {
                    str = interfaceC7131c1.k0();
                } else if (nextName.equals(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
                    obj = interfaceC7131c1.U1();
                } else {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    interfaceC7131c1.Q0(iLogger, hashMap, nextName);
                }
            }
            interfaceC7131c1.endObject();
            if (str != null) {
                L2 l22 = new L2(str, obj);
                l22.a(hashMap);
                return l22;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"type\"");
            iLogger.a(I2.ERROR, "Missing required field \"type\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public L2(@NotNull String str, Object obj) {
        this.f66684a = str;
        if (obj == null || !str.equals("string")) {
            this.f66685b = obj;
        } else {
            this.f66685b = obj.toString();
        }
    }

    public final void a(Map<String, Object> map) {
        this.f66686c = (HashMap) map;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        c7212v0.g("type");
        c7212v0.m(iLogger, this.f66684a);
        c7212v0.g(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c7212v0.m(iLogger, this.f66685b);
        HashMap hashMap = this.f66686c;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                I1.w.e(this.f66686c, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }
}
