package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.ioo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzc extends com.google.android.gms.internal.cast.zzb implements zzd {
    public zzc() {
        super("com.google.android.gms.cast.framework.media.IImagePicker");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            MediaMetadata mediaMetadata = (MediaMetadata) com.google.android.gms.internal.cast.zzc.a(parcel, MediaMetadata.CREATOR);
            parcel.readInt();
            com.google.android.gms.internal.cast.zzc.d(parcel);
            ((ioo) this).a.getClass();
            WebImage a = ImagePicker.a(mediaMetadata);
            parcel2.writeNoException();
            if (a == null) {
                parcel2.writeInt(0);
                return true;
            }
            parcel2.writeInt(1);
            a.writeToParcel(parcel2, 1);
            return true;
        }
        if (i == 2) {
            IObjectWrapper zzf = ((ioo) this).zzf();
            parcel2.writeNoException();
            com.google.android.gms.internal.cast.zzc.c(parcel2, zzf);
            return true;
        }
        if (i == 3) {
            parcel2.writeNoException();
            parcel2.writeInt(12451000);
            return true;
        }
        if (i != 4) {
            return false;
        }
        MediaMetadata mediaMetadata2 = (MediaMetadata) com.google.android.gms.internal.cast.zzc.a(parcel, MediaMetadata.CREATOR);
        ImageHints imageHints = (ImageHints) com.google.android.gms.internal.cast.zzc.a(parcel, ImageHints.CREATOR);
        com.google.android.gms.internal.cast.zzc.d(parcel);
        ((ioo) this).a.getClass();
        int i2 = imageHints.a;
        WebImage a2 = ImagePicker.a(mediaMetadata2);
        parcel2.writeNoException();
        if (a2 == null) {
            parcel2.writeInt(0);
            return true;
        }
        parcel2.writeInt(1);
        a2.writeToParcel(parcel2, 1);
        return true;
    }
}
