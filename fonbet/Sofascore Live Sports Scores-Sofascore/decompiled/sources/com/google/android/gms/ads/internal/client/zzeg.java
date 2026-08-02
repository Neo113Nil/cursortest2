package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeg {
    public String g;
    public String i;
    public String j;
    public boolean l;
    public String m;
    public long o;
    public final HashSet a = new HashSet();
    public final Bundle b = new Bundle();
    public final HashMap c = new HashMap();
    public final HashSet d = new HashSet();
    public final Bundle e = new Bundle();
    public final HashSet f = new HashSet();
    public final ArrayList h = new ArrayList();
    public int k = -1;
    public int n = 60000;

    public final void zza(String str) {
        this.a.add(str);
    }

    public final void zzb(Bundle bundle) {
        this.b.putAll(bundle);
    }

    public final void zzc(Class cls, @Nullable Bundle bundle) {
        this.b.putBundle(cls.getName(), bundle);
    }

    public final void zzd(Class cls, Bundle bundle) {
        Bundle bundle2 = this.b;
        if (bundle2.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            bundle2.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        Bundle bundle3 = bundle2.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        Preconditions.i(bundle3);
        bundle3.putBundle(cls.getName(), bundle);
    }

    public final void zze(String str) {
        this.d.add(str);
    }

    public final void zzf(String str) {
        this.d.remove(AdRequest.DEVICE_ID_EMULATOR);
    }

    public final void zzg(String str) {
        this.g = str;
    }

    public final void zzh(List list) {
        ArrayList arrayList = this.h;
        arrayList.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (TextUtils.isEmpty(str)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("neighboring content URL should not be null or empty");
            } else {
                arrayList.add(str);
            }
        }
    }

    public final void zzi(String str) {
        this.i = str;
    }

    public final void zzj(String str) {
        this.j = str;
    }

    @Deprecated
    public final void zzk(boolean z) {
        this.k = z ? 1 : 0;
    }

    public final void zzl(String str, String str2) {
        this.e.putString(str, str2);
    }

    public final void zzm(String str) {
        this.f.add(str);
    }

    @Deprecated
    public final void zzn(boolean z) {
        this.l = z;
    }

    public final void zzo(String str) {
        this.m = str;
    }

    public final void zzp(int i) {
        this.n = i;
    }

    public final void zzq(long j) {
        this.o = j;
    }
}
