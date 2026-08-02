package com.google.android.gms.tapandpay.globalactions;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@ShowFirstParty
@SafeParcelable.Class(creator = "SelectGlobalActionCardRequestCreator")
/* loaded from: classes9.dex */
public final class SelectGlobalActionCardRequest extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<SelectGlobalActionCardRequest> CREATOR = new zzh();

    @SafeParcelable.Field(getter = "getCardType", id = 2)
    private int zza;

    @SafeParcelable.Field(getter = "getCardId", id = 3)
    private String zzb;

    @SafeParcelable.Field(getter = "getSelectionTimeoutMs", id = 4)
    private int zzc;

    @ShowFirstParty
    public static final class Builder {
        private final SelectGlobalActionCardRequest zza;

        public Builder() {
            this.zza = new SelectGlobalActionCardRequest(null);
        }

        @RecentlyNonNull
        public SelectGlobalActionCardRequest build() {
            return this.zza;
        }

        @RecentlyNonNull
        public Builder setCardId(@RecentlyNonNull String str) {
            this.zza.zzb = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setCardType(int i11) {
            this.zza.zza = i11;
            return this;
        }

        @RecentlyNonNull
        public Builder setSelectionTimeoutMs(int i11) {
            this.zza.zzc = i11;
            return this;
        }

        public Builder(@RecentlyNonNull SelectGlobalActionCardRequest selectGlobalActionCardRequest) {
            SelectGlobalActionCardRequest selectGlobalActionCardRequest2 = new SelectGlobalActionCardRequest(null);
            this.zza = selectGlobalActionCardRequest2;
            selectGlobalActionCardRequest2.zza = selectGlobalActionCardRequest.zza;
            selectGlobalActionCardRequest2.zzb = selectGlobalActionCardRequest.zzb;
            selectGlobalActionCardRequest2.zzc = selectGlobalActionCardRequest.zzc;
        }
    }

    private SelectGlobalActionCardRequest() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SelectGlobalActionCardRequest) {
            SelectGlobalActionCardRequest selectGlobalActionCardRequest = (SelectGlobalActionCardRequest) obj;
            if (Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(selectGlobalActionCardRequest.zza)) && Objects.equal(this.zzb, selectGlobalActionCardRequest.zzb) && Objects.equal(Integer.valueOf(this.zzc), Integer.valueOf(selectGlobalActionCardRequest.zzc))) {
                return true;
            }
        }
        return false;
    }

    @RecentlyNonNull
    public String getCardId() {
        return this.zzb;
    }

    public int getCardType() {
        return this.zza;
    }

    public int getSelectionTimeoutMs() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, getCardType());
        SafeParcelWriter.writeString(parcel, 3, getCardId(), false);
        SafeParcelWriter.writeInt(parcel, 4, getSelectionTimeoutMs());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    SelectGlobalActionCardRequest(@SafeParcelable.Param(id = 2) int i11, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) int i12) {
        this.zza = i11;
        this.zzb = str;
        this.zzc = i12;
    }

    /* synthetic */ SelectGlobalActionCardRequest(zzg zzgVar) {
    }
}
