package com.reactnativecompressor.Utils;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UploaderHelper.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0004HÆ\u0003J\t\u0010#\u001a\u00020\u0004HÆ\u0003Jy\u0010$\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017¨\u0006,"}, d2 = {"Lcom/reactnativecompressor/Utils/UploaderOptions;", "Lcom/reactnativecompressor/Utils/Record;", "headers", "", "", "httpMethod", "Lcom/reactnativecompressor/Utils/HttpMethod;", "uploadType", "Lcom/reactnativecompressor/Utils/UploadType;", "fieldName", "mimeType", "parameters", "uuid", "url", "<init>", "(Ljava/util/Map;Lcom/reactnativecompressor/Utils/HttpMethod;Lcom/reactnativecompressor/Utils/UploadType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "getHeaders", "()Ljava/util/Map;", "getHttpMethod", "()Lcom/reactnativecompressor/Utils/HttpMethod;", "getUploadType", "()Lcom/reactnativecompressor/Utils/UploadType;", "getFieldName", "()Ljava/lang/String;", "getMimeType", "getParameters", "getUuid", "getUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class UploaderOptions implements Record {
    private final String fieldName;
    private final Map<String, String> headers;
    private final HttpMethod httpMethod;
    private final String mimeType;
    private final Map<String, String> parameters;
    private final UploadType uploadType;
    private final String url;
    private final String uuid;

    public static /* synthetic */ UploaderOptions copy$default(UploaderOptions uploaderOptions, Map map, HttpMethod httpMethod, UploadType uploadType, String str, String str2, Map map2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            map = uploaderOptions.headers;
        }
        if ((i & 2) != 0) {
            httpMethod = uploaderOptions.httpMethod;
        }
        if ((i & 4) != 0) {
            uploadType = uploaderOptions.uploadType;
        }
        if ((i & 8) != 0) {
            str = uploaderOptions.fieldName;
        }
        if ((i & 16) != 0) {
            str2 = uploaderOptions.mimeType;
        }
        if ((i & 32) != 0) {
            map2 = uploaderOptions.parameters;
        }
        if ((i & 64) != 0) {
            str3 = uploaderOptions.uuid;
        }
        if ((i & 128) != 0) {
            str4 = uploaderOptions.url;
        }
        String str5 = str3;
        String str6 = str4;
        String str7 = str2;
        Map map3 = map2;
        return uploaderOptions.copy(map, httpMethod, uploadType, str, str7, map3, str5, str6);
    }

    public final Map<String, String> component1() {
        return this.headers;
    }

    /* renamed from: component2, reason: from getter */
    public final HttpMethod getHttpMethod() {
        return this.httpMethod;
    }

    /* renamed from: component3, reason: from getter */
    public final UploadType getUploadType() {
        return this.uploadType;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFieldName() {
        return this.fieldName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    public final Map<String, String> component6() {
        return this.parameters;
    }

    /* renamed from: component7, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* renamed from: component8, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final UploaderOptions copy(Map<String, String> headers, HttpMethod httpMethod, UploadType uploadType, String fieldName, String mimeType, Map<String, String> parameters, String uuid, String url) {
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        Intrinsics.checkNotNullParameter(uploadType, "uploadType");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(url, "url");
        return new UploaderOptions(headers, httpMethod, uploadType, fieldName, mimeType, parameters, uuid, url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploaderOptions)) {
            return false;
        }
        UploaderOptions uploaderOptions = (UploaderOptions) other;
        return Intrinsics.areEqual(this.headers, uploaderOptions.headers) && this.httpMethod == uploaderOptions.httpMethod && this.uploadType == uploaderOptions.uploadType && Intrinsics.areEqual(this.fieldName, uploaderOptions.fieldName) && Intrinsics.areEqual(this.mimeType, uploaderOptions.mimeType) && Intrinsics.areEqual(this.parameters, uploaderOptions.parameters) && Intrinsics.areEqual(this.uuid, uploaderOptions.uuid) && Intrinsics.areEqual(this.url, uploaderOptions.url);
    }

    public int hashCode() {
        Map<String, String> map = this.headers;
        int hashCode = (((((map == null ? 0 : map.hashCode()) * 31) + this.httpMethod.hashCode()) * 31) + this.uploadType.hashCode()) * 31;
        String str = this.fieldName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mimeType;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map2 = this.parameters;
        return ((((hashCode3 + (map2 != null ? map2.hashCode() : 0)) * 31) + this.uuid.hashCode()) * 31) + this.url.hashCode();
    }

    public String toString() {
        return "UploaderOptions(headers=" + this.headers + ", httpMethod=" + this.httpMethod + ", uploadType=" + this.uploadType + ", fieldName=" + this.fieldName + ", mimeType=" + this.mimeType + ", parameters=" + this.parameters + ", uuid=" + this.uuid + ", url=" + this.url + ")";
    }

    public UploaderOptions(Map<String, String> map, HttpMethod httpMethod, UploadType uploadType, String str, String str2, Map<String, String> map2, String uuid, String url) {
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        Intrinsics.checkNotNullParameter(uploadType, "uploadType");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(url, "url");
        this.headers = map;
        this.httpMethod = httpMethod;
        this.uploadType = uploadType;
        this.fieldName = str;
        this.mimeType = str2;
        this.parameters = map2;
        this.uuid = uuid;
        this.url = url;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public /* synthetic */ UploaderOptions(Map map, HttpMethod httpMethod, UploadType uploadType, String str, String str2, Map map2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i & 2) != 0 ? HttpMethod.POST : httpMethod, uploadType, str, str2, map2, str3, str4);
    }

    public final HttpMethod getHttpMethod() {
        return this.httpMethod;
    }

    public final UploadType getUploadType() {
        return this.uploadType;
    }

    public final String getFieldName() {
        return this.fieldName;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final Map<String, String> getParameters() {
        return this.parameters;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final String getUrl() {
        return this.url;
    }
}
