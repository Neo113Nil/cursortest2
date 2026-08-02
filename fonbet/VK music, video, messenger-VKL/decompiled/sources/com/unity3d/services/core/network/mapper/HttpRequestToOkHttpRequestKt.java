package com.unity3d.services.core.network.mapper;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.core.network.model.HttpRequest;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import okhttp3.k;
import okhttp3.m;
import okhttp3.p;
import okhttp3.t;
import xsna.drm0;
import xsna.j5g;

/* compiled from: HttpRequestToOkHttpRequest.kt */
/* loaded from: classes14.dex */
public final class HttpRequestToOkHttpRequestKt {
    private static final t generateOkHttpBody(Object obj) {
        m mVar = null;
        if (obj instanceof byte[]) {
            Pattern pattern = m.e;
            try {
                mVar = m.a.a("text/plain;charset=utf-8");
            } catch (IllegalArgumentException unused) {
            }
            return t.create(mVar, (byte[]) obj);
        }
        if (obj instanceof String) {
            Pattern pattern2 = m.e;
            try {
                mVar = m.a.a("text/plain;charset=utf-8");
            } catch (IllegalArgumentException unused2) {
            }
            return t.create(mVar, (String) obj);
        }
        Pattern pattern3 = m.e;
        try {
            mVar = m.a.a("text/plain;charset=utf-8");
        } catch (IllegalArgumentException unused3) {
        }
        return t.create(mVar, "");
    }

    private static final k generateOkHttpHeaders(HttpRequest httpRequest) {
        k.a aVar = new k.a();
        for (Map.Entry<String, List<String>> entry : httpRequest.getHeaders().entrySet()) {
            aVar.b(entry.getKey(), j5g.g0(entry.getValue(), StringUtils.COMMA, null, null, 0, null, 62));
        }
        return aVar.e();
    }

    private static final t generateOkHttpProtobufBody(Object obj) {
        m mVar = null;
        if (obj instanceof byte[]) {
            Pattern pattern = m.e;
            try {
                mVar = m.a.a(CommonGatewayClient.HEADER_PROTOBUF);
            } catch (IllegalArgumentException unused) {
            }
            return t.create(mVar, (byte[]) obj);
        }
        if (obj instanceof String) {
            Pattern pattern2 = m.e;
            try {
                mVar = m.a.a(CommonGatewayClient.HEADER_PROTOBUF);
            } catch (IllegalArgumentException unused2) {
            }
            return t.create(mVar, (String) obj);
        }
        Pattern pattern3 = m.e;
        try {
            mVar = m.a.a(CommonGatewayClient.HEADER_PROTOBUF);
        } catch (IllegalArgumentException unused3) {
        }
        return t.create(mVar, "");
    }

    public static final p toOkHttpProtoRequest(HttpRequest httpRequest) {
        p.a aVar = new p.a();
        aVar.i(drm0.W(drm0.q0(httpRequest.getBaseURL(), '/') + '/' + drm0.q0(httpRequest.getPath(), '/'), DomExceptionUtils.SEPARATOR));
        String obj = httpRequest.getMethod().toString();
        Object body = httpRequest.getBody();
        aVar.f(obj, body != null ? generateOkHttpProtobufBody(body) : null);
        aVar.c = generateOkHttpHeaders(httpRequest).d();
        return aVar.b();
    }

    public static final p toOkHttpRequest(HttpRequest httpRequest) {
        p.a aVar = new p.a();
        aVar.i(drm0.W(drm0.q0(httpRequest.getBaseURL(), '/') + '/' + drm0.q0(httpRequest.getPath(), '/'), DomExceptionUtils.SEPARATOR));
        String obj = httpRequest.getMethod().toString();
        Object body = httpRequest.getBody();
        aVar.f(obj, body != null ? generateOkHttpBody(body) : null);
        aVar.c = generateOkHttpHeaders(httpRequest).d();
        return aVar.b();
    }
}
