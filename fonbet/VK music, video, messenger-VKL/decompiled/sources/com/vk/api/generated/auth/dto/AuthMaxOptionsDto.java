package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: AuthMaxOptionsDto.kt */
/* loaded from: classes14.dex */
public final class AuthMaxOptionsDto implements Parcelable {
    public static final Parcelable.Creator<AuthMaxOptionsDto> CREATOR = new a();

    @pmi0("experiment_group")
    private final Integer experimentGroup;

    @pmi0("is_need_show_max_button")
    private final Boolean isNeedShowMaxButton;

    @pmi0("timeout")
    private final Integer timeout;

    /* compiled from: AuthMaxOptionsDto.kt */
    public static final class a implements Parcelable.Creator<AuthMaxOptionsDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthMaxOptionsDto createFromParcel(Parcel parcel) {
            Boolean bool = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AuthMaxOptionsDto(valueOf, valueOf2, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthMaxOptionsDto[] newArray(int i) {
            return new AuthMaxOptionsDto[i];
        }
    }

    public AuthMaxOptionsDto() {
        this(null, null, null, 7, null);
    }

    public final Integer d() {
        return this.experimentGroup;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.timeout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthMaxOptionsDto)) {
            return false;
        }
        AuthMaxOptionsDto authMaxOptionsDto = (AuthMaxOptionsDto) obj;
        return epx.f(this.timeout, authMaxOptionsDto.timeout) && epx.f(this.experimentGroup, authMaxOptionsDto.experimentGroup) && epx.f(this.isNeedShowMaxButton, authMaxOptionsDto.isNeedShowMaxButton);
    }

    public final Boolean f() {
        return this.isNeedShowMaxButton;
    }

    public final int hashCode() {
        Integer num = this.timeout;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.experimentGroup;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.isNeedShowMaxButton;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthMaxOptionsDto(timeout=");
        sb.append(this.timeout);
        sb.append(", experimentGroup=");
        sb.append(this.experimentGroup);
        sb.append(", isNeedShowMaxButton=");
        return tn.a(sb, this.isNeedShowMaxButton, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.timeout;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.experimentGroup;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Boolean bool = this.isNeedShowMaxButton;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public AuthMaxOptionsDto(Integer num, Integer num2, Boolean bool) {
        this.timeout = num;
        this.experimentGroup = num2;
        this.isNeedShowMaxButton = bool;
    }

    public /* synthetic */ AuthMaxOptionsDto(Integer num, Integer num2, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : bool);
    }
}
