package com.unity3d.ads.network.mapper;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.unity3d.ads.network.model.HttpBody;
import com.unity3d.ads.network.model.HttpRequest;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.k;
import okhttp3.m;
import okhttp3.p;
import okhttp3.t;
import xsna.drm0;
import xsna.j5g;

/* compiled from: HttpRequestToOkHttpRequest.kt */
/* loaded from: classes14.dex */
public final class HttpRequestToOkHttpRequestKt {
    private static final t generateOkHttpBody(HttpBody httpBody) {
        m mVar = null;
        if (httpBody instanceof HttpBody.StringBody) {
            Pattern pattern = m.e;
            try {
                mVar = m.a.a("text/plain;charset=utf-8");
            } catch (IllegalArgumentException unused) {
            }
            return t.create(mVar, ((HttpBody.StringBody) httpBody).getContent());
        }
        if (httpBody instanceof HttpBody.ByteArrayBody) {
            Pattern pattern2 = m.e;
            try {
                mVar = m.a.a("text/plain;charset=utf-8");
            } catch (IllegalArgumentException unused2) {
            }
            return t.create(mVar, ((HttpBody.ByteArrayBody) httpBody).getContent());
        }
        if (httpBody instanceof HttpBody.EmptyBody) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final k generateOkHttpHeaders(HttpRequest httpRequest) {
        k.a aVar = new k.a();
        for (Map.Entry<String, List<String>> entry : httpRequest.getHeaders().entrySet()) {
            aVar.b(entry.getKey(), j5g.g0(entry.getValue(), StringUtils.COMMA, null, null, 0, null, 62));
        }
        return aVar.e();
    }

    public static final p toOkHttpRequest(HttpRequest httpRequest) {
        p.a aVar = new p.a();
        aVar.i(drm0.W(drm0.q0(httpRequest.getBaseURL(), '/') + '/' + drm0.q0(httpRequest.getPath(), '/'), DomExceptionUtils.SEPARATOR));
        aVar.f(httpRequest.getMethod().toString(), generateOkHttpBody(httpRequest.getBody()));
        aVar.c = generateOkHttpHeaders(httpRequest).d();
        return aVar.b();
    }
}
