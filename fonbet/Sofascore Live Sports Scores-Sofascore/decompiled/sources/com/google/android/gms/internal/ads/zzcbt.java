package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.IOUtils;
import defpackage.bnn;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class zzcbt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcbt> CREATOR = new zzcbu();
    public ParcelFileDescriptor a;
    public Parcelable b = null;
    public boolean c = true;

    public zzcbt(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        ParcelFileDescriptor[] createPipe;
        if (this.a == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.b.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                ParcelFileDescriptor parcelFileDescriptor = null;
                try {
                    createPipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
                } catch (IOException e) {
                    e = e;
                    autoCloseOutputStream = null;
                }
                try {
                    zzcgj.a.execute(new bnn(4, autoCloseOutputStream, marshall));
                    parcelFileDescriptor = createPipe[0];
                } catch (IOException e2) {
                    e = e2;
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzg("Error transporting the ad response", e);
                    com.google.android.gms.ads.internal.zzt.zzh().d("LargeParcelTeleporter.pipeData.2", e);
                    IOUtils.a(autoCloseOutputStream);
                    this.a = parcelFileDescriptor;
                    int s = SafeParcelWriter.s(parcel, 20293);
                    SafeParcelWriter.l(parcel, 2, this.a, i, false);
                    SafeParcelWriter.t(parcel, s);
                }
                this.a = parcelFileDescriptor;
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        int s2 = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.l(parcel, 2, this.a, i, false);
        SafeParcelWriter.t(parcel, s2);
    }
}
