package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzdrw {
    private final com.google.android.gms.ads.internal.util.zzbl zza;
    private final Clock zzb;
    private final Executor zzc;

    public zzdrw(com.google.android.gms.ads.internal.util.zzbl zzblVar, Clock clock, Executor executor) {
        this.zza = zzblVar;
        this.zzb = clock;
        this.zzc = executor;
    }

    private final Bitmap zzd(byte[] bArr, double d, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d * 160.0d);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhd)).booleanValue()) {
            options.inJustDecodeBounds = true;
            zze(bArr, options);
            options.inJustDecodeBounds = false;
            int i = options.outWidth * options.outHeight;
            if (i > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i - 1) / ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhe)).intValue())) / 2);
            }
        }
        return zze(bArr, options);
    }

    private final Bitmap zze(byte[] bArr, BitmapFactory.Options options) {
        Clock clock = this.zzb;
        long elapsedRealtime = clock.elapsedRealtime();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long elapsedRealtime2 = clock.elapsedRealtime();
        if (decodeByteArray != null) {
            long j = elapsedRealtime2 - elapsedRealtime;
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            boolean z = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sb = new StringBuilder(String.valueOf(width).length() + 20 + String.valueOf(height).length() + 8 + String.valueOf(allocationByteCount).length() + 7 + String.valueOf(j).length() + 15 + String.valueOf(z).length());
            sb.append("Decoded image w: ");
            sb.append(width);
            sb.append(" h:");
            sb.append(height);
            sb.append(" bytes: ");
            sb.append(allocationByteCount);
            sb.append(" time: ");
            sb.append(j);
            sb.append(" on ui thread: ");
            sb.append(z);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        return decodeByteArray;
    }

    public final ListenableFuture zza(final String str, final double d, final boolean z) {
        return (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhf)).booleanValue() && str != null && str.startsWith("data:")) ? zzhbi.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzdru
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzdrw.this.zzc(str, d, z);
            }
        }, this.zzc) : zzhbi.zzk(this.zza.zza(str), new zzgsn() { // from class: com.google.android.gms.internal.ads.zzdrv
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                return zzdrw.this.zzb(d, z, (zzast) obj);
            }
        }, this.zzc);
    }

    final /* synthetic */ Bitmap zzb(double d, boolean z, zzast zzastVar) {
        return zzd(zzastVar.zzb, d, z);
    }

    final /* synthetic */ Bitmap zzc(String str, double d, boolean z) {
        int indexOf = str.indexOf(",");
        if (indexOf == -1) {
            throw new IllegalArgumentException("Bad data URL: no ',' found for base64 data");
        }
        if (!str.substring(0, indexOf).endsWith(";base64")) {
            throw new IllegalArgumentException("Bad data URL: only base64 is supported");
        }
        int indexOf2 = str.indexOf(":");
        int indexOf3 = str.indexOf(";");
        if (indexOf2 == -1 || !str.substring(indexOf2 + 1, indexOf3).startsWith("image/")) {
            throw new IllegalArgumentException("Bad data URL: only image media is supported");
        }
        return zzd(Base64.decode(str.substring(indexOf + 1), 0), d, z);
    }
}
