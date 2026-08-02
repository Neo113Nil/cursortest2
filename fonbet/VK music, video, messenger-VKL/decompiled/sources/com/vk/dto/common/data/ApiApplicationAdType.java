package com.vk.dto.common.data;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ApiApplicationAdType.kt */
/* loaded from: classes18.dex */
public final class ApiApplicationAdType implements Serializer.StreamParcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ApiApplicationAdType[] $VALUES;
    public static final Serializer.c<ApiApplicationAdType> CREATOR;
    public static final a Companion;
    public static final ApiApplicationAdType INTERSTITIAL;
    public static final ApiApplicationAdType MULTI_INTERSTITIAL;
    public static final ApiApplicationAdType REWARD;
    private final int adTypeCode;

    /* compiled from: ApiApplicationAdType.kt */
    public static final class a {
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ApiApplicationAdType> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ApiApplicationAdType a(Serializer serializer) {
            int u = serializer.u();
            ApiApplicationAdType apiApplicationAdType = ApiApplicationAdType.REWARD;
            if (u == apiApplicationAdType.i()) {
                return apiApplicationAdType;
            }
            ApiApplicationAdType apiApplicationAdType2 = ApiApplicationAdType.MULTI_INTERSTITIAL;
            return u == apiApplicationAdType2.i() ? apiApplicationAdType2 : ApiApplicationAdType.INTERSTITIAL;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApiApplicationAdType[i];
        }
    }

    static {
        ApiApplicationAdType apiApplicationAdType = new ApiApplicationAdType("INTERSTITIAL", 0, 0);
        INTERSTITIAL = apiApplicationAdType;
        ApiApplicationAdType apiApplicationAdType2 = new ApiApplicationAdType("REWARD", 1, 1);
        REWARD = apiApplicationAdType2;
        ApiApplicationAdType apiApplicationAdType3 = new ApiApplicationAdType("MULTI_INTERSTITIAL", 2, 2);
        MULTI_INTERSTITIAL = apiApplicationAdType3;
        ApiApplicationAdType[] apiApplicationAdTypeArr = {apiApplicationAdType, apiApplicationAdType2, apiApplicationAdType3};
        $VALUES = apiApplicationAdTypeArr;
        $ENTRIES = new asp(apiApplicationAdTypeArr);
        Companion = new a();
        CREATOR = new b();
    }

    public ApiApplicationAdType(String str, int i, int i2) {
        this.adTypeCode = i2;
    }

    public static ApiApplicationAdType valueOf(String str) {
        return (ApiApplicationAdType) Enum.valueOf(ApiApplicationAdType.class, str);
    }

    public static ApiApplicationAdType[] values() {
        return (ApiApplicationAdType[]) $VALUES.clone();
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.adTypeCode);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int i() {
        return this.adTypeCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
