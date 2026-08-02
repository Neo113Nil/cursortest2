package com.google.android.gms.tapandpay.globalactions;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@ShowFirstParty
@SafeParcelable.Class(creator = "GlobalActionCardCreator")
/* loaded from: classes9.dex */
public final class GlobalActionCard extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<GlobalActionCard> CREATOR = new zzf();

    @SafeParcelable.Field(getter = "getCardType", id = 1)
    private int zza;

    @SafeParcelable.Field(getter = "getCardId", id = 2)
    private String zzb;

    @SafeParcelable.Field(getter = "getCardImage", id = 3)
    private Bitmap zzc;

    @SafeParcelable.Field(getter = "getContentDescription", id = 4)
    private String zzd;

    @SafeParcelable.Field(getter = "getMessageText", id = 5)
    private String zze;

    @SafeParcelable.Field(getter = "getDeviceLockedMessageText", id = 8)
    private String zzf;

    @SafeParcelable.Field(getter = "getMessageIcon", id = 6)
    private Bitmap zzg;

    @SafeParcelable.Field(getter = "getPendingIntent", id = 7)
    private PendingIntent zzh;

    @ShowFirstParty
    public static final class Builder {
        private final GlobalActionCard zza;

        public Builder() {
            this.zza = new GlobalActionCard(null);
        }

        @RecentlyNonNull
        public GlobalActionCard build() {
            return this.zza;
        }

        @RecentlyNonNull
        public Builder setCardId(@RecentlyNonNull String str) {
            this.zza.zzb = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setCardImage(@RecentlyNonNull Bitmap bitmap) {
            this.zza.zzc = bitmap;
            return this;
        }

        @RecentlyNonNull
        public Builder setCardType(int i11) {
            this.zza.zza = i11;
            return this;
        }

        @RecentlyNonNull
        public Builder setContentDescription(@RecentlyNonNull String str) {
            this.zza.zzd = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setDeviceLockedMessageText(String str) {
            this.zza.zzf = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setMessageIcon(Bitmap bitmap) {
            this.zza.zzg = bitmap;
            return this;
        }

        @RecentlyNonNull
        public Builder setMessageText(String str) {
            this.zza.zze = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setPendingIntent(@RecentlyNonNull PendingIntent pendingIntent) {
            this.zza.zzh = pendingIntent;
            return this;
        }

        public Builder(@RecentlyNonNull GlobalActionCard globalActionCard) {
            GlobalActionCard globalActionCard2 = new GlobalActionCard(null);
            this.zza = globalActionCard2;
            globalActionCard2.zza = globalActionCard.zza;
            globalActionCard2.zzb = globalActionCard.zzb;
            globalActionCard2.zzc = globalActionCard.zzc;
            globalActionCard2.zzd = globalActionCard.zzd;
            globalActionCard2.zze = globalActionCard.zze;
            globalActionCard2.zzf = globalActionCard.zzf;
            globalActionCard2.zzg = globalActionCard.zzg;
            globalActionCard2.zzh = globalActionCard.zzh;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface CardType {
        public static final int CAR_KEY = 8;
        public static final int CTA = 3;
        public static final int GLOBAL_ACTIONS_DISMISSED = 4;
        public static final int PASS = 1;
        public static final int PAYMENT = 2;
        public static final int STUDENT_ID = 6;
        public static final int TRANSIT = 7;
        public static final int UNKNOWN = 0;
        public static final int VALUABLE = 5;
    }

    private GlobalActionCard() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GlobalActionCard) {
            GlobalActionCard globalActionCard = (GlobalActionCard) obj;
            if (Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(globalActionCard.zza)) && Objects.equal(this.zzb, globalActionCard.zzb) && Objects.equal(this.zzc, globalActionCard.zzc) && Objects.equal(this.zzd, globalActionCard.zzd) && Objects.equal(this.zze, globalActionCard.zze) && Objects.equal(this.zzf, globalActionCard.zzf) && Objects.equal(this.zzg, globalActionCard.zzg) && Objects.equal(this.zzh, globalActionCard.zzh)) {
                return true;
            }
        }
        return false;
    }

    @RecentlyNonNull
    public String getCardId() {
        return this.zzb;
    }

    @RecentlyNonNull
    public Bitmap getCardImage() {
        return this.zzc;
    }

    public int getCardType() {
        return this.zza;
    }

    @RecentlyNonNull
    public String getContentDescription() {
        return this.zzd;
    }

    @RecentlyNullable
    public String getDeviceLockedMessageText() {
        return this.zzf;
    }

    @RecentlyNullable
    public Bitmap getMessageIcon() {
        return this.zzg;
    }

    @RecentlyNullable
    public String getMessageText() {
        return this.zze;
    }

    @RecentlyNonNull
    public PendingIntent getPendingIntent() {
        return this.zzh;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getCardType());
        SafeParcelWriter.writeString(parcel, 2, getCardId(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getCardImage(), i11, false);
        SafeParcelWriter.writeString(parcel, 4, getContentDescription(), false);
        SafeParcelWriter.writeString(parcel, 5, getMessageText(), false);
        SafeParcelWriter.writeParcelable(parcel, 6, getMessageIcon(), i11, false);
        SafeParcelWriter.writeParcelable(parcel, 7, getPendingIntent(), i11, false);
        SafeParcelWriter.writeString(parcel, 8, getDeviceLockedMessageText(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    GlobalActionCard(@SafeParcelable.Param(id = 1) int i11, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) Bitmap bitmap, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 8) String str4, @SafeParcelable.Param(id = 6) Bitmap bitmap2, @SafeParcelable.Param(id = 7) PendingIntent pendingIntent) {
        this.zza = i11;
        this.zzb = str;
        this.zzc = bitmap;
        this.zzd = str2;
        this.zze = str3;
        this.zzf = str4;
        this.zzg = bitmap2;
        this.zzh = pendingIntent;
    }

    /* synthetic */ GlobalActionCard(zze zzeVar) {
    }
}
