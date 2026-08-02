package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzn {
    public Bundle a = new Bundle();
    public List b = new ArrayList();
    public boolean c = false;
    public int d = -1;
    public final Bundle e = new Bundle();
    public final Bundle f = new Bundle();
    public final ArrayList g = new ArrayList();
    public int h = -1;
    public String i = null;
    public final ArrayList j = new ArrayList();
    public int k = 60000;
    public final int l = RequestConfiguration.PublisherPrivacyPersonalizationState.DEFAULT.getValue();
    public long m = 0;

    public final zzm zza() {
        return new zzm(8, -1L, this.a, -1, this.b, this.c, this.d, false, null, null, null, null, this.e, this.f, this.g, null, null, false, null, this.h, this.i, this.j, this.k, null, this.l, this.m, 0L, -1);
    }

    public final zzn zzb(Bundle bundle) {
        this.a = bundle;
        return this;
    }

    public final zzn zzc(List list) {
        this.b = list;
        return this;
    }

    public final zzn zzd(boolean z) {
        this.c = z;
        return this;
    }

    public final zzn zze(int i) {
        this.d = i;
        return this;
    }

    public final zzn zzf(int i) {
        this.h = i;
        return this;
    }

    public final zzn zzg(String str) {
        this.i = str;
        return this;
    }

    public final zzn zzh(int i) {
        this.k = i;
        return this;
    }

    public final zzn zzi(long j) {
        this.m = j;
        return this;
    }
}
