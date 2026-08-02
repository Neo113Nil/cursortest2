package com.unity3d.services.core.network.mapper;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.core.network.model.HttpRequest;
import defpackage.bea;
import defpackage.ef0;
import defpackage.pzf;
import defpackage.q89;
import defpackage.qzf;
import defpackage.vha;
import defpackage.yzf;
import defpackage.zdc;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\u000b\u001a\u00020\n*\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f\u001a\u0011\u0010\r\u001a\u00020\n*\u00020\u0006¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"", "body", "Lyzf;", "generateOkHttpBody", "(Ljava/lang/Object;)Lyzf;", "generateOkHttpProtobufBody", "Lcom/unity3d/services/core/network/model/HttpRequest;", "Lq89;", "generateOkHttpHeaders", "(Lcom/unity3d/services/core/network/model/HttpRequest;)Lq89;", "Lqzf;", "toOkHttpRequest", "(Lcom/unity3d/services/core/network/model/HttpRequest;)Lqzf;", "toOkHttpProtoRequest", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpRequestToOkHttpRequestKt {
    private static final yzf generateOkHttpBody(Object obj) {
        zdc zdcVar = null;
        if (obj instanceof byte[]) {
            Regex regex = zdc.e;
            try {
                zdcVar = bea.v("text/plain;charset=utf-8");
            } catch (IllegalArgumentException unused) {
            }
            yzf create = yzf.create(zdcVar, (byte[]) obj);
            create.getClass();
            return create;
        }
        if (obj instanceof String) {
            Regex regex2 = zdc.e;
            try {
                zdcVar = bea.v("text/plain;charset=utf-8");
            } catch (IllegalArgumentException unused2) {
            }
            yzf create2 = yzf.create(zdcVar, (String) obj);
            create2.getClass();
            return create2;
        }
        Regex regex3 = zdc.e;
        try {
            zdcVar = bea.v("text/plain;charset=utf-8");
        } catch (IllegalArgumentException unused3) {
        }
        yzf create3 = yzf.create(zdcVar, "");
        create3.getClass();
        return create3;
    }

    private static final q89 generateOkHttpHeaders(HttpRequest httpRequest) {
        ef0 ef0Var = new ef0(1);
        for (Map.Entry<String, List<String>> entry : httpRequest.getHeaders().entrySet()) {
            ef0Var.b(entry.getKey(), CollectionsKt.f0(entry.getValue(), BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, null, 62));
        }
        return vha.i(ef0Var);
    }

    private static final yzf generateOkHttpProtobufBody(Object obj) {
        zdc zdcVar = null;
        if (obj instanceof byte[]) {
            Regex regex = zdc.e;
            try {
                zdcVar = bea.v(CommonGatewayClient.HEADER_PROTOBUF);
            } catch (IllegalArgumentException unused) {
            }
            yzf create = yzf.create(zdcVar, (byte[]) obj);
            create.getClass();
            return create;
        }
        if (obj instanceof String) {
            Regex regex2 = zdc.e;
            try {
                zdcVar = bea.v(CommonGatewayClient.HEADER_PROTOBUF);
            } catch (IllegalArgumentException unused2) {
            }
            yzf create2 = yzf.create(zdcVar, (String) obj);
            create2.getClass();
            return create2;
        }
        Regex regex3 = zdc.e;
        try {
            zdcVar = bea.v(CommonGatewayClient.HEADER_PROTOBUF);
        } catch (IllegalArgumentException unused3) {
        }
        yzf create3 = yzf.create(zdcVar, "");
        create3.getClass();
        return create3;
    }

    @NotNull
    public static final qzf toOkHttpProtoRequest(@NotNull HttpRequest httpRequest) {
        httpRequest.getClass();
        pzf pzfVar = new pzf();
        pzfVar.f(StringsKt.W(StringsKt.m0(httpRequest.getBaseURL(), '/') + '/' + StringsKt.m0(httpRequest.getPath(), '/'), "/"));
        String obj = httpRequest.getMethod().toString();
        Object body = httpRequest.getBody();
        pzfVar.e(obj, body != null ? generateOkHttpProtobufBody(body) : null);
        pzfVar.d(generateOkHttpHeaders(httpRequest));
        return new qzf(pzfVar);
    }

    @NotNull
    public static final qzf toOkHttpRequest(@NotNull HttpRequest httpRequest) {
        httpRequest.getClass();
        pzf pzfVar = new pzf();
        pzfVar.f(StringsKt.W(StringsKt.m0(httpRequest.getBaseURL(), '/') + '/' + StringsKt.m0(httpRequest.getPath(), '/'), "/"));
        String obj = httpRequest.getMethod().toString();
        Object body = httpRequest.getBody();
        pzfVar.e(obj, body != null ? generateOkHttpBody(body) : null);
        pzfVar.d(generateOkHttpHeaders(httpRequest));
        return new qzf(pzfVar);
    }
}
