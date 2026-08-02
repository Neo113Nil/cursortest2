package com.google.android.gms.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AbstractAdRequestBuilder;
import com.google.android.gms.ads.internal.client.zzeg;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class AbstractAdRequestBuilder<T extends AbstractAdRequestBuilder<T>> {
    public final zzeg a;

    public AbstractAdRequestBuilder() {
        zzeg zzegVar = new zzeg();
        this.a = zzegVar;
        zzegVar.zze(AdRequest.DEVICE_ID_EMULATOR);
    }

    @NonNull
    @Deprecated
    public T addCustomEventExtrasBundle(@NonNull Class<? extends CustomEvent> cls, @NonNull Bundle bundle) {
        this.a.zzd(cls, bundle);
        return (T) self();
    }

    @NonNull
    public T addCustomTargeting(@NonNull String str, @NonNull List<String> list) {
        if (list != null) {
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2) && str2.contains(BlazeDataSourcePersonalizedType.STRING_SEPARATOR)) {
                    StringBuilder sb = new StringBuilder(str2.length() + 108);
                    sb.append("Value ");
                    sb.append(str2);
                    sb.append(" contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
                    zzo.zzi(sb.toString());
                }
            }
            this.a.zzl(str, TextUtils.join(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, list));
        }
        return (T) self();
    }

    @NonNull
    public T addKeyword(@NonNull String str) {
        this.a.zza(str);
        return (T) self();
    }

    @NonNull
    public T addNetworkExtrasBundle(@NonNull Class<? extends MediationExtrasReceiver> cls, @NonNull Bundle bundle) {
        zzeg zzegVar = this.a;
        zzegVar.zzc(cls, bundle);
        if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            zzegVar.zzf(AdRequest.DEVICE_ID_EMULATOR);
        }
        return (T) self();
    }

    public abstract AbstractAdRequestBuilder self();

    @NonNull
    public T setAdString(@NonNull String str) {
        this.a.zzo(str);
        return (T) self();
    }

    @NonNull
    public T setContentUrl(@NonNull String str) {
        Preconditions.j(str, "Content URL must be non-null.");
        Preconditions.g(str, "Content URL must be non-empty.");
        int length = str.length();
        Preconditions.c(length <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", 512, Integer.valueOf(str.length()));
        this.a.zzg(str);
        return (T) self();
    }

    @NonNull
    public T setHttpTimeoutMillis(int i) {
        this.a.zzp(i);
        return (T) self();
    }

    @NonNull
    public T setNeighboringContentUrls(@NonNull List<String> list) {
        if (list == null) {
            zzo.zzi("neighboring content URLs list should not be null");
            return (T) self();
        }
        this.a.zzh(list);
        return (T) self();
    }

    @NonNull
    public T setPlacementId(long j) {
        this.a.zzq(j);
        return (T) self();
    }

    @NonNull
    public T setRequestAgent(@NonNull String str) {
        this.a.zzj(str);
        return (T) self();
    }

    @NonNull
    public final AbstractAdRequestBuilder zza(@NonNull Bundle bundle) {
        this.a.zzb(bundle);
        return self();
    }

    @NonNull
    @Deprecated
    public final AbstractAdRequestBuilder zzb(@NonNull String str) {
        this.a.zze(str);
        return self();
    }

    @NonNull
    @Deprecated
    public final AbstractAdRequestBuilder zzc(boolean z) {
        this.a.zzk(z);
        return self();
    }

    @NonNull
    @Deprecated
    public final AbstractAdRequestBuilder zzd(boolean z) {
        this.a.zzn(z);
        return self();
    }

    @NonNull
    public T addCustomTargeting(@NonNull String str, @NonNull String str2) {
        if (!TextUtils.isEmpty(str2) && str2.contains(BlazeDataSourcePersonalizedType.STRING_SEPARATOR)) {
            StringBuilder sb = new StringBuilder(str2.length() + 108);
            sb.append("Value ");
            sb.append(str2);
            sb.append(" contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
            zzo.zzi(sb.toString());
        }
        this.a.zzl(str, str2);
        return (T) self();
    }
}
