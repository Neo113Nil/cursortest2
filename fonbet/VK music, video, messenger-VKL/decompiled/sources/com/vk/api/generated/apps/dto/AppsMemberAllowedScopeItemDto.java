package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import defpackage.q0;
import xsna.epx;
import xsna.pmi0;

/* compiled from: AppsMemberAllowedScopeItemDto.kt */
/* loaded from: classes14.dex */
public final class AppsMemberAllowedScopeItemDto implements Parcelable {
    public static final Parcelable.Creator<AppsMemberAllowedScopeItemDto> CREATOR = new a();

    @pmi0("allowed")
    private final boolean allowed;

    @pmi0(CommonConstant.ReqAccessTokenParam.SCOPE_LABEL)
    private final String scope;

    /* compiled from: AppsMemberAllowedScopeItemDto.kt */
    public static final class a implements Parcelable.Creator<AppsMemberAllowedScopeItemDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMemberAllowedScopeItemDto createFromParcel(Parcel parcel) {
            return new AppsMemberAllowedScopeItemDto(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMemberAllowedScopeItemDto[] newArray(int i) {
            return new AppsMemberAllowedScopeItemDto[i];
        }
    }

    public AppsMemberAllowedScopeItemDto(String str, boolean z) {
        this.scope = str;
        this.allowed = z;
    }

    public final boolean d() {
        return this.allowed;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.scope;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsMemberAllowedScopeItemDto)) {
            return false;
        }
        AppsMemberAllowedScopeItemDto appsMemberAllowedScopeItemDto = (AppsMemberAllowedScopeItemDto) obj;
        return epx.f(this.scope, appsMemberAllowedScopeItemDto.scope) && this.allowed == appsMemberAllowedScopeItemDto.allowed;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.allowed) + (this.scope.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsMemberAllowedScopeItemDto(scope=");
        sb.append(this.scope);
        sb.append(", allowed=");
        return q0.a(sb, this.allowed, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.scope);
        parcel.writeInt(this.allowed ? 1 : 0);
    }
}
