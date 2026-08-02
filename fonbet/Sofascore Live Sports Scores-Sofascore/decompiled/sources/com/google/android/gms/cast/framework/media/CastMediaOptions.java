package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public class CastMediaOptions extends AbstractSafeParcelable {
    public final String a;
    public final String b;
    public final zzd c;
    public final NotificationOptions d;
    public final boolean e;
    public final boolean f;
    public static final Logger g = new Logger("CastMediaOptions", null);

    @NonNull
    public static final Parcelable.Creator<CastMediaOptions> CREATOR = new zza();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder {
        public NotificationOptions a;
        public boolean b;

        public Builder() {
            NotificationOptions.Builder builder = new NotificationOptions.Builder();
            this.a = new NotificationOptions(builder.a, builder.b, builder.p, null, builder.c, builder.d, builder.e, builder.f, builder.g, builder.h, builder.i, builder.j, builder.k, builder.l, builder.m, builder.n, builder.o, NotificationOptions.Builder.a("notificationImageSizeDimenResId"), NotificationOptions.Builder.a("castingToDeviceStringResId"), NotificationOptions.Builder.a("stopLiveStreamStringResId"), NotificationOptions.Builder.a("pauseStringResId"), NotificationOptions.Builder.a("playStringResId"), NotificationOptions.Builder.a("skipNextStringResId"), NotificationOptions.Builder.a("skipPrevStringResId"), NotificationOptions.Builder.a("forwardStringResId"), NotificationOptions.Builder.a("forward10StringResId"), NotificationOptions.Builder.a("forward30StringResId"), NotificationOptions.Builder.a("rewindStringResId"), NotificationOptions.Builder.a("rewind10StringResId"), NotificationOptions.Builder.a("rewind30StringResId"), NotificationOptions.Builder.a("disconnectStringResId"), null, false, false);
            this.b = true;
        }
    }

    public CastMediaOptions(String str, String str2, IBinder iBinder, NotificationOptions notificationOptions, boolean z, boolean z2) {
        zzd zzbVar;
        this.a = str;
        this.b = str2;
        if (iBinder == null) {
            zzbVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            zzbVar = queryLocalInterface instanceof zzd ? (zzd) queryLocalInterface : new zzb(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker");
        }
        this.c = zzbVar;
        this.d = notificationOptions;
        this.e = z;
        this.f = z2;
    }

    public final ImagePicker Y0() {
        zzd zzdVar = this.c;
        if (zzdVar == null) {
            return null;
        }
        try {
            return (ImagePicker) ObjectWrapper.Z1(zzdVar.zzf());
        } catch (RemoteException unused) {
            g.b("Unable to call %s on %s.", "getWrappedClientObject", "zzd");
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.m(parcel, 2, this.a, false);
        SafeParcelWriter.m(parcel, 3, this.b, false);
        zzd zzdVar = this.c;
        SafeParcelWriter.f(parcel, 4, zzdVar == null ? null : zzdVar.asBinder());
        SafeParcelWriter.l(parcel, 5, this.d, i, false);
        SafeParcelWriter.r(parcel, 6, 4);
        parcel.writeInt(this.e ? 1 : 0);
        SafeParcelWriter.r(parcel, 7, 4);
        parcel.writeInt(this.f ? 1 : 0);
        SafeParcelWriter.t(parcel, s);
    }
}
