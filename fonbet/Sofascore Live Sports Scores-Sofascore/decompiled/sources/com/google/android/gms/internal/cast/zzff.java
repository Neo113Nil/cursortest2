package com.google.android.gms.internal.cast;

import android.os.Parcelable;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzff {
    public static ApiMetadata a() {
        int i = zzfc.a;
        Parcelable.Creator<ComplianceOptions> creator = ComplianceOptions.CREATOR;
        ComplianceOptions a = new ComplianceOptions.Builder().a();
        Parcelable.Creator<ApiMetadata> creator2 = ApiMetadata.CREATOR;
        ApiMetadata.Builder builder = new ApiMetadata.Builder();
        builder.a = a;
        return builder.a();
    }
}
