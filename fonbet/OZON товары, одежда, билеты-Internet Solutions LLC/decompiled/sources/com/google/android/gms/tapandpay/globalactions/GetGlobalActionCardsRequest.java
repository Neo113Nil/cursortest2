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
@SafeParcelable.Class(creator = "GetGlobalActionCardsRequestCreator")
/* loaded from: classes9.dex */
public final class GetGlobalActionCardsRequest extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<GetGlobalActionCardsRequest> CREATOR = new zzb();

    @SafeParcelable.Field(getter = "getMaxCards", id = 1)
    private int zza;

    @SafeParcelable.Field(getter = "getCardWidthPx", id = 2)
    private int zzb;

    @SafeParcelable.Field(getter = "getCardHeightPx", id = 3)
    private int zzc;

    @ShowFirstParty
    public static final class Builder {
        private final GetGlobalActionCardsRequest zza;

        public Builder() {
            this.zza = new GetGlobalActionCardsRequest(null);
        }

        @RecentlyNonNull
        public GetGlobalActionCardsRequest build() {
            return this.zza;
        }

        @RecentlyNonNull
        public Builder setCardHeightPx(int i11) {
            this.zza.zzc = i11;
            return this;
        }

        @RecentlyNonNull
        public Builder setCardWidthPx(int i11) {
            this.zza.zzb = i11;
            return this;
        }

        @RecentlyNonNull
        public Builder setMaxCards(int i11) {
            this.zza.zza = i11;
            return this;
        }

        public Builder(@RecentlyNonNull GetGlobalActionCardsRequest getGlobalActionCardsRequest) {
            GetGlobalActionCardsRequest getGlobalActionCardsRequest2 = new GetGlobalActionCardsRequest(null);
            this.zza = getGlobalActionCardsRequest2;
            getGlobalActionCardsRequest2.zza = getGlobalActionCardsRequest.zza;
            getGlobalActionCardsRequest2.zzb = getGlobalActionCardsRequest.zzb;
            getGlobalActionCardsRequest2.zzc = getGlobalActionCardsRequest.zzc;
        }
    }

    private GetGlobalActionCardsRequest() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetGlobalActionCardsRequest) {
            GetGlobalActionCardsRequest getGlobalActionCardsRequest = (GetGlobalActionCardsRequest) obj;
            if (Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(getGlobalActionCardsRequest.zza)) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(getGlobalActionCardsRequest.zzb)) && Objects.equal(Integer.valueOf(this.zzc), Integer.valueOf(getGlobalActionCardsRequest.zzc))) {
                return true;
            }
        }
        return false;
    }

    public int getCardHeightPx() {
        return this.zzc;
    }

    public int getCardWidthPx() {
        return this.zzb;
    }

    public int getMaxCards() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getMaxCards());
        SafeParcelWriter.writeInt(parcel, 2, getCardWidthPx());
        SafeParcelWriter.writeInt(parcel, 3, getCardHeightPx());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    GetGlobalActionCardsRequest(@SafeParcelable.Param(id = 1) int i11, @SafeParcelable.Param(id = 2) int i12, @SafeParcelable.Param(id = 3) int i13) {
        this.zza = i11;
        this.zzb = i12;
        this.zzc = i13;
    }

    /* synthetic */ GetGlobalActionCardsRequest(zza zzaVar) {
    }
}
