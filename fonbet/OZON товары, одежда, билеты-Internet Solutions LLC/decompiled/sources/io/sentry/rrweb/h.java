package io.sentry.rrweb;

import io.sentry.C1;
import io.sentry.C7212v0;
import io.sentry.ILogger;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7220x0;
import io.sentry.W2;
import io.sentry.Y2;
import io.sentry.protocol.r;
import java.io.IOException;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class h extends b implements InterfaceC7220x0 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private String f68444c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private HashMap f68445d;

    public h(@NotNull W2 w22) {
        super(c.Custom);
        this.f68445d = new HashMap();
        this.f68444c = "options";
        r sdkVersion = w22.getSdkVersion();
        if (sdkVersion != null) {
            this.f68445d.put("nativeSdkName", sdkVersion.c());
            this.f68445d.put("nativeSdkVersion", sdkVersion.d());
        }
        Y2 sessionReplay = w22.getSessionReplay();
        this.f68445d.put("errorSampleRate", sessionReplay.n());
        this.f68445d.put("sessionSampleRate", sessionReplay.s());
        this.f68445d.put("maskAllImages", Boolean.valueOf(sessionReplay.b().contains("android.widget.ImageView")));
        this.f68445d.put("maskAllText", Boolean.valueOf(sessionReplay.b().contains("android.widget.TextView")));
        this.f68445d.put("quality", sessionReplay.o().serializedName());
        this.f68445d.put("maskedViewClasses", sessionReplay.b());
        this.f68445d.put("unmaskedViewClasses", sessionReplay.c());
        this.f68445d.put("screenshotStrategy", sessionReplay.p() == C1.PIXEL_COPY ? "pixelCopy" : "canvas");
        this.f68445d.put("networkDetailHasUrls", Boolean.valueOf(!sessionReplay.i().isEmpty()));
        if (sessionReplay.i().isEmpty()) {
            return;
        }
        this.f68445d.put("networkDetailAllowUrls", sessionReplay.i());
        this.f68445d.put("networkRequestHeaders", sessionReplay.l());
        this.f68445d.put("networkResponseHeaders", sessionReplay.m());
        this.f68445d.put("networkCaptureBodies", Boolean.valueOf(sessionReplay.v()));
        if (sessionReplay.j().isEmpty()) {
            return;
        }
        this.f68445d.put("networkDetailDenyUrls", sessionReplay.j());
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        c7212v0.g("type");
        c7212v0.m(iLogger, ((b) this).f68420a);
        c7212v0.g("timestamp");
        c7212v0.l(((b) this).f68421b);
        c7212v0.g("data");
        c7212v0.b();
        c7212v0.g("tag");
        c7212v0.p(this.f68444c);
        c7212v0.g("payload");
        c7212v0.b();
        HashMap hashMap = this.f68445d;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                Object obj = hashMap.get(str);
                c7212v0.g(str);
                c7212v0.m(iLogger, obj);
            }
        }
        c7212v0.d();
        c7212v0.d();
        c7212v0.d();
    }
}
