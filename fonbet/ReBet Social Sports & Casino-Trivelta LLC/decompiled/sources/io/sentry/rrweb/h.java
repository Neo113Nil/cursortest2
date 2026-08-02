package io.sentry.rrweb;

import com.twilio.voice.EventKeys;
import io.sentry.F3;
import io.sentry.G0;
import io.sentry.H3;
import io.sentry.ILogger;
import io.sentry.InterfaceC4813r1;
import io.sentry.Z1;
import io.sentry.protocol.s;
import io.sentry.rrweb.b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class h extends b implements G0 {

    /* renamed from: c, reason: collision with root package name */
    public String f52666c;

    /* renamed from: d, reason: collision with root package name */
    public Map f52667d;

    /* renamed from: e, reason: collision with root package name */
    public Map f52668e;

    /* renamed from: f, reason: collision with root package name */
    public Map f52669f;

    public h() {
        super(c.Custom);
        this.f52667d = new HashMap();
        this.f52666c = "options";
    }

    private void g(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        interfaceC4813r1.d("tag").e(this.f52666c);
        interfaceC4813r1.d(EventKeys.PAYLOAD);
        h(interfaceC4813r1, iLogger);
        Map map = this.f52669f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52669f.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    private void h(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        Map map = this.f52667d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52667d.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        new b.C0770b().a(this, interfaceC4813r1, iLogger);
        interfaceC4813r1.d(EventKeys.DATA);
        g(interfaceC4813r1, iLogger);
        Map map = this.f52668e;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52668e.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    public h(F3 f32) {
        this();
        String str;
        s sdkVersion = f32.getSdkVersion();
        if (sdkVersion != null) {
            this.f52667d.put("nativeSdkName", sdkVersion.e());
            this.f52667d.put("nativeSdkVersion", sdkVersion.g());
        }
        H3 sessionReplay = f32.getSessionReplay();
        this.f52667d.put("errorSampleRate", sessionReplay.u());
        this.f52667d.put("sessionSampleRate", sessionReplay.z());
        this.f52667d.put("maskAllImages", Boolean.valueOf(sessionReplay.c().contains("android.widget.ImageView")));
        this.f52667d.put("maskAllText", Boolean.valueOf(sessionReplay.c().contains("android.widget.TextView")));
        this.f52667d.put("quality", sessionReplay.v().serializedName());
        this.f52667d.put("maskedViewClasses", sessionReplay.c());
        this.f52667d.put("unmaskedViewClasses", sessionReplay.e());
        if (sessionReplay.w() == Z1.PIXEL_COPY) {
            str = "pixelCopy";
        } else {
            str = "canvas";
        }
        this.f52667d.put("screenshotStrategy", str);
        this.f52667d.put("networkDetailHasUrls", Boolean.valueOf(!sessionReplay.p().isEmpty()));
        if (sessionReplay.p().isEmpty()) {
            return;
        }
        this.f52667d.put("networkDetailAllowUrls", sessionReplay.p());
        this.f52667d.put("networkRequestHeaders", sessionReplay.s());
        this.f52667d.put("networkResponseHeaders", sessionReplay.t());
        this.f52667d.put("networkCaptureBodies", Boolean.valueOf(sessionReplay.D()));
        if (sessionReplay.q().isEmpty()) {
            return;
        }
        this.f52667d.put("networkDetailDenyUrls", sessionReplay.q());
    }
}
