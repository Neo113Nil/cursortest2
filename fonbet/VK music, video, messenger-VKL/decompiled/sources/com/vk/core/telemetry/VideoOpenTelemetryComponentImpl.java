package com.vk.core.telemetry;

import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import okhttp3.Interceptor;
import xsna.acp0;
import xsna.c8m;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.hpf0;
import xsna.i8n0;
import xsna.nwy;
import xsna.prq0;
import xsna.pwj0;
import xsna.qcy;
import xsna.qdh0;

/* compiled from: VideoOpenTelemetryComponentImpl.kt */
/* loaded from: classes17.dex */
public final class VideoOpenTelemetryComponentImpl implements VideoOpenTelemetryComponent {
    public static final /* synthetic */ qcy<Object>[] f;
    public final AuthBridgeComponent a;
    public final nwy b = new nwy(new qdh0(5));
    public final nwy c = new nwy(new acp0(this, 7));
    public final nwy d = new nwy(new i8n0(this, 10));
    public final nwy e = new nwy(new prq0(this, 15));

    /* compiled from: VideoOpenTelemetryComponentImpl.kt */
    public static final class a implements c8m<VideoOpenTelemetryComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new VideoOpenTelemetryComponentImpl((AuthBridgeComponent) g8mVar.a(fpf0.a(AuthBridgeComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VideoOpenTelemetryComponentImpl.class, "isTracingEnabled", "isTracingEnabled()Z", 0);
        hpf0 hpf0Var = fpf0.a;
        f = new qcy[]{propertyReference1Impl, fp.c(0, VideoOpenTelemetryComponentImpl.class, "openTelemetryInterceptor", "getOpenTelemetryInterceptor()Lokhttp3/Interceptor;", hpf0Var), ep.a(0, VideoOpenTelemetryComponentImpl.class, "telemetryCollector", "getTelemetryCollector()Lcom/vk/core/telemetry/TelemetryCollector;", hpf0Var), ep.a(0, VideoOpenTelemetryComponentImpl.class, "spanContext", "getSpanContext()Lcom/vk/core/telemetry/SpanContext;", hpf0Var)};
    }

    public VideoOpenTelemetryComponentImpl(AuthBridgeComponent authBridgeComponent) {
        this.a = authBridgeComponent;
    }

    @Override // com.vk.core.telemetry.VideoOpenTelemetryComponent
    public final Interceptor Nc() {
        qcy<Object> qcyVar = f[1];
        return (Interceptor) this.c.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.core.telemetry.VideoOpenTelemetryComponent
    public final boolean Ya() {
        qcy<Object> qcyVar = f[0];
        return ((Boolean) this.b.c()).booleanValue();
    }

    @Override // com.vk.core.telemetry.VideoOpenTelemetryComponent
    public final com.vk.core.telemetry.a i() {
        qcy<Object> qcyVar = f[3];
        return (com.vk.core.telemetry.a) this.e.c();
    }

    @Override // com.vk.core.telemetry.VideoOpenTelemetryComponent
    public final b x6() {
        qcy<Object> qcyVar = f[2];
        return (b) this.d.c();
    }
}
