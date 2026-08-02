package com.unity3d.services.core.network.model;

import com.unity3d.ads.core.data.model.OperationType;
import java.io.File;
import java.util.List;
import java.util.Map;
import xsna.epx;
import xsna.jgp;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.v11;
import xsna.vu5;
import xsna.zcl;

/* compiled from: HttpRequest.kt */
/* loaded from: classes14.dex */
public final class HttpRequest {
    public static final Companion Companion = new Companion(null);
    public static final String DEFAULT_SCHEME = "https";
    public static final int DEFAULT_TIMEOUT = 30000;
    private final String baseURL;
    private final Object body;
    private final BodyType bodyType;
    private final int callTimeout;
    private final int connectTimeout;
    private final File downloadDestination;
    private final Map<String, List<String>> headers;
    private final boolean isProtobuf;
    private final RequestType method;
    private final OperationType operationType;
    private final Map<String, String> parameters;
    private final String path;
    private final Integer port;
    private final int priority;
    private final int readTimeout;
    private final String scheme;
    private final int writeTimeout;

    /* compiled from: HttpRequest.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public HttpRequest(String str) {
        this(str, null, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131070, null);
    }

    public static /* synthetic */ HttpRequest copy$default(HttpRequest httpRequest, String str, String str2, RequestType requestType, Object obj, Map map, Map map2, BodyType bodyType, String str3, Integer num, int i, int i2, int i3, int i4, boolean z, OperationType operationType, File file, int i5, int i6, Object obj2) {
        int i7;
        File file2;
        String str4;
        HttpRequest httpRequest2;
        OperationType operationType2;
        String str5;
        RequestType requestType2;
        Object obj3;
        Map map3;
        Map map4;
        BodyType bodyType2;
        String str6;
        Integer num2;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z2;
        String str7 = (i6 & 1) != 0 ? httpRequest.baseURL : str;
        String str8 = (i6 & 2) != 0 ? httpRequest.path : str2;
        RequestType requestType3 = (i6 & 4) != 0 ? httpRequest.method : requestType;
        Object obj4 = (i6 & 8) != 0 ? httpRequest.body : obj;
        Map map5 = (i6 & 16) != 0 ? httpRequest.headers : map;
        Map map6 = (i6 & 32) != 0 ? httpRequest.parameters : map2;
        BodyType bodyType3 = (i6 & 64) != 0 ? httpRequest.bodyType : bodyType;
        String str9 = (i6 & 128) != 0 ? httpRequest.scheme : str3;
        Integer num3 = (i6 & 256) != 0 ? httpRequest.port : num;
        int i12 = (i6 & 512) != 0 ? httpRequest.connectTimeout : i;
        int i13 = (i6 & 1024) != 0 ? httpRequest.readTimeout : i2;
        int i14 = (i6 & 2048) != 0 ? httpRequest.writeTimeout : i3;
        int i15 = (i6 & 4096) != 0 ? httpRequest.callTimeout : i4;
        boolean z3 = (i6 & 8192) != 0 ? httpRequest.isProtobuf : z;
        String str10 = str7;
        OperationType operationType3 = (i6 & 16384) != 0 ? httpRequest.operationType : operationType;
        File file3 = (i6 & 32768) != 0 ? httpRequest.downloadDestination : file;
        if ((i6 & 65536) != 0) {
            file2 = file3;
            i7 = httpRequest.priority;
            operationType2 = operationType3;
            str5 = str8;
            requestType2 = requestType3;
            obj3 = obj4;
            map3 = map5;
            map4 = map6;
            bodyType2 = bodyType3;
            str6 = str9;
            num2 = num3;
            i8 = i12;
            i9 = i13;
            i10 = i14;
            i11 = i15;
            z2 = z3;
            str4 = str10;
            httpRequest2 = httpRequest;
        } else {
            i7 = i5;
            file2 = file3;
            str4 = str10;
            httpRequest2 = httpRequest;
            operationType2 = operationType3;
            str5 = str8;
            requestType2 = requestType3;
            obj3 = obj4;
            map3 = map5;
            map4 = map6;
            bodyType2 = bodyType3;
            str6 = str9;
            num2 = num3;
            i8 = i12;
            i9 = i13;
            i10 = i14;
            i11 = i15;
            z2 = z3;
        }
        return httpRequest2.copy(str4, str5, requestType2, obj3, map3, map4, bodyType2, str6, num2, i8, i9, i10, i11, z2, operationType2, file2, i7);
    }

    public final String component1() {
        return this.baseURL;
    }

    public final int component10() {
        return this.connectTimeout;
    }

    public final int component11() {
        return this.readTimeout;
    }

    public final int component12() {
        return this.writeTimeout;
    }

    public final int component13() {
        return this.callTimeout;
    }

    public final boolean component14() {
        return this.isProtobuf;
    }

    public final OperationType component15() {
        return this.operationType;
    }

    public final File component16() {
        return this.downloadDestination;
    }

    public final int component17() {
        return this.priority;
    }

    public final String component2() {
        return this.path;
    }

    public final RequestType component3() {
        return this.method;
    }

    public final Object component4() {
        return this.body;
    }

    public final Map<String, List<String>> component5() {
        return this.headers;
    }

    public final Map<String, String> component6() {
        return this.parameters;
    }

    public final BodyType component7() {
        return this.bodyType;
    }

    public final String component8() {
        return this.scheme;
    }

    public final Integer component9() {
        return this.port;
    }

    public final HttpRequest copy(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, Integer num, int i, int i2, int i3, int i4, boolean z, OperationType operationType, File file, int i5) {
        return new HttpRequest(str, str2, requestType, obj, map, map2, bodyType, str3, num, i, i2, i3, i4, z, operationType, file, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpRequest)) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) obj;
        return epx.f(this.baseURL, httpRequest.baseURL) && epx.f(this.path, httpRequest.path) && this.method == httpRequest.method && epx.f(this.body, httpRequest.body) && epx.f(this.headers, httpRequest.headers) && epx.f(this.parameters, httpRequest.parameters) && this.bodyType == httpRequest.bodyType && epx.f(this.scheme, httpRequest.scheme) && epx.f(this.port, httpRequest.port) && this.connectTimeout == httpRequest.connectTimeout && this.readTimeout == httpRequest.readTimeout && this.writeTimeout == httpRequest.writeTimeout && this.callTimeout == httpRequest.callTimeout && this.isProtobuf == httpRequest.isProtobuf && this.operationType == httpRequest.operationType && epx.f(this.downloadDestination, httpRequest.downloadDestination) && this.priority == httpRequest.priority;
    }

    public final String getBaseURL() {
        return this.baseURL;
    }

    public final Object getBody() {
        return this.body;
    }

    public final BodyType getBodyType() {
        return this.bodyType;
    }

    public final int getCallTimeout() {
        return this.callTimeout;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final File getDownloadDestination() {
        return this.downloadDestination;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final RequestType getMethod() {
        return this.method;
    }

    public final OperationType getOperationType() {
        return this.operationType;
    }

    public final Map<String, String> getParameters() {
        return this.parameters;
    }

    public final String getPath() {
        return this.path;
    }

    public final Integer getPort() {
        return this.port;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final int getReadTimeout() {
        return this.readTimeout;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    public int hashCode() {
        int hashCode = (this.method.hashCode() + urd0.a(this.baseURL.hashCode() * 31, 31, this.path)) * 31;
        Object obj = this.body;
        int a = urd0.a((this.bodyType.hashCode() + v11.a(v11.a((hashCode + (obj == null ? 0 : obj.hashCode())) * 31, 31, this.headers), 31, this.parameters)) * 31, 31, this.scheme);
        Integer num = this.port;
        int hashCode2 = (this.operationType.hashCode() + qoy.b(shy.a(this.callTimeout, shy.a(this.writeTimeout, shy.a(this.readTimeout, shy.a(this.connectTimeout, (a + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31), 31), 31, this.isProtobuf)) * 31;
        File file = this.downloadDestination;
        return Integer.hashCode(this.priority) + ((hashCode2 + (file != null ? file.hashCode() : 0)) * 31);
    }

    public final boolean isProtobuf() {
        return this.isProtobuf;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HttpRequest(baseURL=");
        sb.append(this.baseURL);
        sb.append(", path=");
        sb.append(this.path);
        sb.append(", method=");
        sb.append(this.method);
        sb.append(", body=");
        sb.append(this.body);
        sb.append(", headers=");
        sb.append(this.headers);
        sb.append(", parameters=");
        sb.append(this.parameters);
        sb.append(", bodyType=");
        sb.append(this.bodyType);
        sb.append(", scheme=");
        sb.append(this.scheme);
        sb.append(", port=");
        sb.append(this.port);
        sb.append(", connectTimeout=");
        sb.append(this.connectTimeout);
        sb.append(", readTimeout=");
        sb.append(this.readTimeout);
        sb.append(", writeTimeout=");
        sb.append(this.writeTimeout);
        sb.append(", callTimeout=");
        sb.append(this.callTimeout);
        sb.append(", isProtobuf=");
        sb.append(this.isProtobuf);
        sb.append(", operationType=");
        sb.append(this.operationType);
        sb.append(", downloadDestination=");
        sb.append(this.downloadDestination);
        sb.append(", priority=");
        return vu5.b(sb, this.priority, ')');
    }

    public HttpRequest(String str, String str2) {
        this(str, str2, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131068, null);
    }

    public HttpRequest(String str, String str2, RequestType requestType) {
        this(str, str2, requestType, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131064, null);
    }

    public HttpRequest(String str, String str2, RequestType requestType, Object obj) {
        this(str, str2, requestType, obj, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131056, null);
    }

    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map) {
        this(str, str2, requestType, obj, map, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131040, null);
    }

    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2) {
        this(str, str2, requestType, obj, map, map2, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131008, null);
    }

    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType) {
        this(str, str2, requestType, obj, map, map2, bodyType, null, null, 0, 0, 0, 0, false, null, null, 0, 130944, null);
    }

    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, null, 0, 0, 0, 0, false, null, null, 0, 130816, null);
    }

    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, Integer num) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, num, 0, 0, 0, 0, false, null, null, 0, 130560, null);
    }

    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, Integer num, int i) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, num, i, 0, 0, 0, false, null, null, 0, 130048, null);
    }

    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, Integer num, int i, int i2) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, num, i, i2, 0, 0, false, null, null, 0, 129024, null);
    }

    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, Integer num, int i, int i2, int i3) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, num, i, i2, i3, 0, false, null, null, 0, 126976, null);
    }

    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, Integer num, int i, int i2, int i3, int i4) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, num, i, i2, i3, i4, false, null, null, 0, 122880, null);
    }

    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, Integer num, int i, int i2, int i3, int i4, boolean z) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, num, i, i2, i3, i4, z, null, null, 0, 114688, null);
    }

    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, Integer num, int i, int i2, int i3, int i4, boolean z, OperationType operationType) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, num, i, i2, i3, i4, z, operationType, null, 0, 98304, null);
    }

    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, Integer num, int i, int i2, int i3, int i4, boolean z, OperationType operationType, File file) {
        this(str, str2, requestType, obj, map, map2, bodyType, str3, num, i, i2, i3, i4, z, operationType, file, 0, 65536, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType, String str3, Integer num, int i, int i2, int i3, int i4, boolean z, OperationType operationType, File file, int i5) {
        this.baseURL = str;
        this.path = str2;
        this.method = requestType;
        this.body = obj;
        this.headers = map;
        this.parameters = map2;
        this.bodyType = bodyType;
        this.scheme = str3;
        this.port = num;
        this.connectTimeout = i;
        this.readTimeout = i2;
        this.writeTimeout = i3;
        this.callTimeout = i4;
        this.isProtobuf = z;
        this.operationType = operationType;
        this.downloadDestination = file;
        this.priority = i5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ HttpRequest(String str, String str2, RequestType requestType, Object obj, Map map, Map map2, BodyType bodyType, String str3, Integer num, int i, int i2, int i3, int i4, boolean z, OperationType operationType, File file, int i5, int i6, zcl zclVar) {
        this(str, r1, r2, r3, r5 != 0 ? r6 : map, (i6 & 32) == 0 ? map2 : r6, (i6 & 64) != 0 ? BodyType.UNKNOWN : bodyType, (i6 & 128) != 0 ? DEFAULT_SCHEME : str3, (i6 & 256) != 0 ? null : num, (i6 & 512) != 0 ? 30000 : i, (i6 & 1024) != 0 ? 30000 : i2, (i6 & 2048) != 0 ? 30000 : i3, (i6 & 4096) == 0 ? i4 : 30000, (i6 & 8192) != 0 ? false : z, (i6 & 16384) != 0 ? OperationType.UNKNOWN : operationType, (i6 & 32768) != 0 ? null : file, (i6 & 65536) != 0 ? 0 : i5);
        String str4 = (i6 & 2) != 0 ? "" : str2;
        RequestType requestType2 = (i6 & 4) != 0 ? RequestType.GET : requestType;
        Object obj2 = (i6 & 8) != 0 ? null : obj;
        int i7 = i6 & 16;
        Map map3 = jgp.b;
    }
}
