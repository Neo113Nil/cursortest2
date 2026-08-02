package com.google.android.gms.tapandpay.globalactions;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@ShowFirstParty
@SafeParcelable.Class(creator = "GetGlobalActionCardsResponseCreator")
/* loaded from: classes9.dex */
public final class GetGlobalActionCardsResponse extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<GetGlobalActionCardsResponse> CREATOR = new zzd();

    @SafeParcelable.Field(getter = "getCards", id = 1)
    private GlobalActionCard[] zza;

    @SafeParcelable.Field(getter = "getSelectedIndex", id = 2)
    private int zzb;

    @ShowFirstParty
    public static final class Builder {
        private final GetGlobalActionCardsResponse zza;

        public Builder() {
            this.zza = new GetGlobalActionCardsResponse(null);
        }

        @RecentlyNonNull
        public GetGlobalActionCardsResponse build() {
            return this.zza;
        }

        @RecentlyNonNull
        public Builder setCards(@RecentlyNonNull GlobalActionCard[] globalActionCardArr) {
            this.zza.zza = globalActionCardArr;
            return this;
        }

        @RecentlyNonNull
        public Builder setSelectedIndex(int i11) {
            this.zza.zzb = i11;
            return this;
        }

        public Builder(@RecentlyNonNull GetGlobalActionCardsResponse getGlobalActionCardsResponse) {
            GetGlobalActionCardsResponse getGlobalActionCardsResponse2 = new GetGlobalActionCardsResponse(null);
            this.zza = getGlobalActionCardsResponse2;
            getGlobalActionCardsResponse2.zza = getGlobalActionCardsResponse.zza;
            getGlobalActionCardsResponse2.zzb = getGlobalActionCardsResponse.zzb;
        }
    }

    private GetGlobalActionCardsResponse() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetGlobalActionCardsResponse) {
            GetGlobalActionCardsResponse getGlobalActionCardsResponse = (GetGlobalActionCardsResponse) obj;
            if (Arrays.equals(this.zza, getGlobalActionCardsResponse.zza) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(getGlobalActionCardsResponse.zzb))) {
                return true;
            }
        }
        return false;
    }

    @RecentlyNonNull
    public GlobalActionCard[] getCards() {
        return this.zza;
    }

    public int getSelectedIndex() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.zza)), Integer.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 1, getCards(), i11, false);
        SafeParcelWriter.writeInt(parcel, 2, getSelectedIndex());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* synthetic */ GetGlobalActionCardsResponse(zzc zzcVar) {
    }

    @SafeParcelable.Constructor
    GetGlobalActionCardsResponse(@SafeParcelable.Param(id = 1) GlobalActionCard[] globalActionCardArr, @SafeParcelable.Param(id = 2) int i11) {
        this.zza = globalActionCardArr;
        this.zzb = i11;
    }
}
