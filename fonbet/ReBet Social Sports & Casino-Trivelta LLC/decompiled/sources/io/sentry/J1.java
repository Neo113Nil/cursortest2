package io.sentry;

import java.net.URI;
import java.util.HashMap;
import zendesk.core.Constants;

/* loaded from: classes3.dex */
public final class J1 {

    /* renamed from: a, reason: collision with root package name */
    public final C4858w f50402a;

    /* renamed from: b, reason: collision with root package name */
    public final String f50403b;

    public J1(F3 f32) {
        io.sentry.util.w.c(f32, "options is required");
        this.f50402a = f32.retrieveParsedDsn();
        this.f50403b = f32.getSentryClientName();
    }

    public I1 a() {
        String str;
        URI g10 = this.f50402a.g();
        String uri = g10.resolve(g10.getPath() + "/envelope/").toString();
        String e10 = this.f50402a.e();
        String f10 = this.f50402a.f();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Sentry sentry_version=7,sentry_client=");
        sb2.append(this.f50403b);
        sb2.append(",sentry_key=");
        sb2.append(e10);
        if (f10 == null || f10.length() <= 0) {
            str = "";
        } else {
            str = ",sentry_secret=" + f10;
        }
        sb2.append(str);
        String sb3 = sb2.toString();
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.USER_AGENT_HEADER_KEY, this.f50403b);
        hashMap.put("X-Sentry-Auth", sb3);
        return new I1(uri, hashMap);
    }
}
