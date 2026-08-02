package com.google.android.gms.analytics.ecommerce;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.analytics.zzd;
import com.google.android.gms.analytics.zzj;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;

@VisibleForTesting
/* loaded from: classes9.dex */
public class Product {
    Map<String, String> zza = new HashMap();

    @RecentlyNonNull
    public Product setBrand(@RecentlyNonNull String str) {
        zzb("br", str);
        return this;
    }

    @RecentlyNonNull
    public Product setCategory(@RecentlyNonNull String str) {
        zzb("ca", str);
        return this;
    }

    @RecentlyNonNull
    public Product setCouponCode(@RecentlyNonNull String str) {
        zzb("cc", str);
        return this;
    }

    @RecentlyNonNull
    public Product setCustomDimension(int i11, @RecentlyNonNull String str) {
        zzb(zzd.zzc(i11), str);
        return this;
    }

    @RecentlyNonNull
    public Product setCustomMetric(int i11, int i12) {
        zzb(zzd.zzf(i11), Integer.toString(i12));
        return this;
    }

    @RecentlyNonNull
    public Product setId(@RecentlyNonNull String str) {
        zzb("id", str);
        return this;
    }

    @RecentlyNonNull
    public Product setName(@RecentlyNonNull String str) {
        zzb("nm", str);
        return this;
    }

    @RecentlyNonNull
    public Product setPosition(int i11) {
        zzb("ps", Integer.toString(i11));
        return this;
    }

    @RecentlyNonNull
    public Product setPrice(double d11) {
        zzb("pr", Double.toString(d11));
        return this;
    }

    @RecentlyNonNull
    public Product setQuantity(int i11) {
        zzb("qt", Integer.toString(i11));
        return this;
    }

    @RecentlyNonNull
    public Product setVariant(@RecentlyNonNull String str) {
        zzb("va", str);
        return this;
    }

    @RecentlyNonNull
    public String toString() {
        return zzj.zzb(this.zza);
    }

    @RecentlyNonNull
    public final Map<String, String> zza(@RecentlyNonNull String str) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : this.zza.entrySet()) {
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf(entry.getKey());
            hashMap.put(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), entry.getValue());
        }
        return hashMap;
    }

    final void zzb(String str, String str2) {
        Preconditions.checkNotNull(str, "Name should be non-null");
        this.zza.put(str, str2);
    }
}
