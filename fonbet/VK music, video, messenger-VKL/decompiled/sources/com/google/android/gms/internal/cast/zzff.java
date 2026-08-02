package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.Parcelable;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzff {
    public static ApiMetadata zza(Context context) {
        zzfc.zza();
        ComplianceOptions complianceOptions = new ComplianceOptions(-1, -1, 0, true);
        Parcelable.Creator<ApiMetadata> creator = ApiMetadata.CREATOR;
        ApiMetadata apiMetadata = new ApiMetadata(complianceOptions, false);
        apiMetadata.d = false;
        return apiMetadata;
    }
}
