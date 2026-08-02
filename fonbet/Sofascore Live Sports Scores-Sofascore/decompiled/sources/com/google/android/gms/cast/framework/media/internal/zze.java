package com.google.android.gms.cast.framework.media.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.internal.cast.zzc;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zze extends com.google.android.gms.internal.cast.zza implements zzg {
    @Override // com.google.android.gms.cast.framework.media.internal.zzg
    public final Bitmap b0(Uri uri) {
        Parcel J = J();
        zzc.b(J, uri);
        Parcel S1 = S1(J, 1);
        Bitmap bitmap = (Bitmap) zzc.a(S1, Bitmap.CREATOR);
        S1.recycle();
        return bitmap;
    }
}
