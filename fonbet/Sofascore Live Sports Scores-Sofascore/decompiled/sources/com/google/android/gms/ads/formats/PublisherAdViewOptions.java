package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzck;
import com.google.android.gms.ads.internal.client.zzcl;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@Deprecated
/* loaded from: classes3.dex */
public final class PublisherAdViewOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new zzf();
    public final boolean a;
    public final zzcl b;
    public final IBinder c;

    public PublisherAdViewOptions(boolean z, IBinder iBinder, IBinder iBinder2) {
        this.a = z;
        this.b = iBinder != null ? zzck.zzc(iBinder) : null;
        this.c = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        zzcl zzclVar = this.b;
        SafeParcelWriter.f(parcel, 2, zzclVar == null ? null : zzclVar.asBinder());
        SafeParcelWriter.f(parcel, 3, this.c);
        SafeParcelWriter.t(parcel, s);
    }

    public final boolean zza() {
        return this.a;
    }

    @Nullable
    public final zzcl zzb() {
        return this.b;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Deprecated
    public static final class Builder {
        @NonNull
        @KeepForSdk
        public Builder setShouldDelayBannerRenderingListener(@NonNull ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
            return this;
        }
    }
}
