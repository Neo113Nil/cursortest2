package com.reactnativecompressor.Utils;

import com.facebook.react.bridge.ReadableMap;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UploaderHelper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"convertReadableMapToUploaderOptions", "Lcom/reactnativecompressor/Utils/UploaderOptions;", "options", "Lcom/facebook/react/bridge/ReadableMap;", "react-native-compressor_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UploaderHelperKt {
    public static final UploaderOptions convertReadableMapToUploaderOptions(ReadableMap options) {
        UploadType uploadType;
        Intrinsics.checkNotNullParameter(options, "options");
        ReadableMap map = options.getMap("headers");
        HashMap<String, Object> hashMap = map != null ? map.toHashMap() : null;
        HashMap<String, Object> hashMap2 = hashMap instanceof Map ? hashMap : null;
        String string = options.getString("httpMethod");
        if (string == null) {
            string = "POST";
        }
        HttpMethod valueOf = HttpMethod.valueOf(string);
        int i = options.getInt("uploadType");
        if (i == UploadType.BINARY_CONTENT.getValue()) {
            uploadType = UploadType.BINARY_CONTENT;
        } else {
            uploadType = i == UploadType.MULTIPART.getValue() ? UploadType.MULTIPART : UploadType.BINARY_CONTENT;
        }
        UploadType uploadType2 = uploadType;
        String string2 = options.getString("fieldName");
        if (string2 == null) {
            string2 = "file";
        }
        String str = string2;
        String string3 = options.getString("mimeType");
        String str2 = string3 == null ? "" : string3;
        ReadableMap map2 = options.getMap("parameters");
        HashMap<String, Object> hashMap3 = map2 != null ? map2.toHashMap() : null;
        HashMap<String, Object> hashMap4 = hashMap3 instanceof Map ? hashMap3 : null;
        String string4 = options.getString("uuid");
        String str3 = string4 == null ? "" : string4;
        String string5 = options.getString("url");
        return new UploaderOptions(hashMap2, valueOf, uploadType2, str, str2, hashMap4, str3, string5 == null ? "" : string5);
    }
}
