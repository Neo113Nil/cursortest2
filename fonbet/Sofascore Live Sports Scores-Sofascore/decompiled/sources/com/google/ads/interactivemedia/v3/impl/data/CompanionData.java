package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.NonNull;
import com.google.ads.interactivemedia.v3.impl.data.AdViewData;
import com.ironsource.U3;
import defpackage.bf3;
import defpackage.q1p;
import defpackage.wt3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q1p(zza = AutoValue_CompanionData.class)
/* loaded from: classes2.dex */
public abstract class CompanionData {
    private String companionId = "";

    @NonNull
    public static CompanionData create(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull AdViewData.Type type) {
        CompanionData create = create(str2, str3, str4, type, 0.0d);
        create.companionId = str;
        return create;
    }

    @NonNull
    public abstract String clickThroughUrl();

    @NonNull
    public String companionId() {
        return this.companionId;
    }

    public abstract double companionScaleTolerance();

    @NonNull
    public abstract String size();

    @NonNull
    public abstract String src();

    @NonNull
    public final String toString() {
        String companionId = companionId();
        String size = size();
        String src = src();
        String clickThroughUrl = clickThroughUrl();
        String valueOf = String.valueOf(type());
        double companionScaleTolerance = companionScaleTolerance();
        int length = String.valueOf(companionId).length();
        int length2 = String.valueOf(size).length();
        int length3 = String.valueOf(src).length();
        int length4 = String.valueOf(clickThroughUrl).length();
        StringBuilder sb = new StringBuilder(length + 34 + length2 + 6 + length3 + 18 + length4 + 7 + valueOf.length() + 26 + String.valueOf(companionScaleTolerance).length() + 1);
        bf3.v(sb, "CompanionData [companionId=", companionId, ", size=", size);
        bf3.v(sb, ", src=", src, ", clickThroughUrl=", clickThroughUrl);
        wt3.A(", type=", valueOf, sb, ", companionScaleTolerance=");
        sb.append(companionScaleTolerance);
        sb.append(U3.j.e);
        return sb.toString();
    }

    @NonNull
    public abstract AdViewData.Type type();

    private static CompanionData create(String str, String str2, String str3, AdViewData.Type type, double d) {
        return new AutoValue_CompanionData(str, str2, str3, type, d);
    }

    @NonNull
    public static CompanionData create(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull AdViewData.Type type, double d) {
        CompanionData create = create(str2, str3, str4, type, d);
        create.companionId = str;
        return create;
    }
}
