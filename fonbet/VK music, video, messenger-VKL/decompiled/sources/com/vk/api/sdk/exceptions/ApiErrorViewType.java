package com.vk.api.sdk.exceptions;

import android.util.Log;
import java.util.Locale;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import xsna.asp;
import xsna.drm0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ApiErrorViewType.kt */
/* loaded from: classes15.dex */
public final class ApiErrorViewType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ApiErrorViewType[] $VALUES;
    public static final ApiErrorViewType ALERT;
    public static final ApiErrorViewType CUSTOM;
    public static final a Companion;
    private static final ApiErrorViewType DEFAULT_VIEW_TYPE;
    public static final ApiErrorViewType FULLSCREEN;
    public static final ApiErrorViewType INPUT;
    public static final ApiErrorViewType SKIP;
    private static final String TAG = "VkApiErrorViewType";

    /* compiled from: ApiErrorViewType.kt */
    public static final class a {
        public static ApiErrorViewType a(String str) {
            if (drm0.N(str)) {
                return null;
            }
            try {
                return ApiErrorViewType.valueOf(str.toUpperCase(Locale.ROOT));
            } catch (IllegalArgumentException e) {
                Log.e(ApiErrorViewType.TAG, "Unknown error view type: ".concat(str), e);
                return ApiErrorViewType.DEFAULT_VIEW_TYPE;
            }
        }
    }

    static {
        ApiErrorViewType apiErrorViewType = new ApiErrorViewType("INPUT", 0);
        INPUT = apiErrorViewType;
        ApiErrorViewType apiErrorViewType2 = new ApiErrorViewType("FULLSCREEN", 1);
        FULLSCREEN = apiErrorViewType2;
        ApiErrorViewType apiErrorViewType3 = new ApiErrorViewType("ALERT", 2);
        ALERT = apiErrorViewType3;
        ApiErrorViewType apiErrorViewType4 = new ApiErrorViewType("CUSTOM", 3);
        CUSTOM = apiErrorViewType4;
        ApiErrorViewType apiErrorViewType5 = new ApiErrorViewType(BatchApiRequest.FIELD_VALUE_ON_ERROR_SKIP, 4);
        SKIP = apiErrorViewType5;
        ApiErrorViewType[] apiErrorViewTypeArr = {apiErrorViewType, apiErrorViewType2, apiErrorViewType3, apiErrorViewType4, apiErrorViewType5};
        $VALUES = apiErrorViewTypeArr;
        $ENTRIES = new asp(apiErrorViewTypeArr);
        Companion = new a();
        DEFAULT_VIEW_TYPE = apiErrorViewType4;
    }

    public ApiErrorViewType() {
        throw null;
    }

    public static ApiErrorViewType valueOf(String str) {
        return (ApiErrorViewType) Enum.valueOf(ApiErrorViewType.class, str);
    }

    public static ApiErrorViewType[] values() {
        return (ApiErrorViewType[]) $VALUES.clone();
    }
}
