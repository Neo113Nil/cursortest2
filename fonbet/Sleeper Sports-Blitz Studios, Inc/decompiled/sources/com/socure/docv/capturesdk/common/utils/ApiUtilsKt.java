package com.socure.docv.capturesdk.common.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* compiled from: ApiUtils.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\u0002¨\u0006\b"}, d2 = {"toMetricRequestBody", "Lokhttp3/MultipartBody$Part;", "", "toMultipartBodyData", "", "name", "toTextPlainBody", "Lokhttp3/RequestBody;", "capturesdk_productionRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ApiUtilsKt {
    public static final MultipartBody.Part toMultipartBodyData(byte[] bArr, String name) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        return MultipartBody.Part.INSTANCE.createFormData(name, name, RequestBody.INSTANCE.create(bArr, MediaType.INSTANCE.parse("image/jpeg"), 0, bArr.length));
    }

    public static final RequestBody toTextPlainBody(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return RequestBody.INSTANCE.create(str, MediaType.INSTANCE.parse("text/plain"));
    }

    public static final MultipartBody.Part toMetricRequestBody(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return MultipartBody.Part.INSTANCE.createFormData(ApiConstant.DOCUMENT_TYPE_DOC_METRICS, ApiConstant.DOCUMENT_TYPE_DOC_METRICS_FILE_NAME, RequestBody.INSTANCE.create(str, MediaType.INSTANCE.parse("application/json")));
    }
}
