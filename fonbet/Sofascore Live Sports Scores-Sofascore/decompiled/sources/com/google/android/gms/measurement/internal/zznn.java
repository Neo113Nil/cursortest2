package com.google.android.gms.measurement.internal;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import defpackage.bzo;
import defpackage.lmo;
import defpackage.p0p;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zznn extends p0p {
    public final HashMap e;
    public final zzhe f;
    public final zzhe g;
    public final zzhe h;
    public final zzhe i;
    public final zzhe j;
    public final zzhe k;

    public zznn(zzpg zzpgVar) {
        super(zzpgVar);
        this.e = new HashMap();
        lmo lmoVar = ((zzic) this.b).e;
        zzic.k(lmoVar);
        this.f = new zzhe(lmoVar, "last_delete_stale", 0L);
        lmo lmoVar2 = ((zzic) this.b).e;
        zzic.k(lmoVar2);
        this.g = new zzhe(lmoVar2, "last_delete_stale_batch", 0L);
        lmo lmoVar3 = ((zzic) this.b).e;
        zzic.k(lmoVar3);
        this.h = new zzhe(lmoVar3, "backoff", 0L);
        lmo lmoVar4 = ((zzic) this.b).e;
        zzic.k(lmoVar4);
        this.i = new zzhe(lmoVar4, "last_upload", 0L);
        lmo lmoVar5 = ((zzic) this.b).e;
        zzic.k(lmoVar5);
        this.j = new zzhe(lmoVar5, "last_upload_attempt", 0L);
        lmo lmoVar6 = ((zzic) this.b).e;
        zzic.k(lmoVar6);
        this.k = new zzhe(lmoVar6, "midnight_offset", 0L);
    }

    public final Pair U(zzr zzrVar, zzjl zzjlVar) {
        String str = zzrVar.a;
        Preconditions.f(str);
        return (zzjlVar.i(zzjk.AD_STORAGE) && zzrVar.n) ? V(str) : new Pair("", Boolean.FALSE);
    }

    public final Pair V(String str) {
        bzo bzoVar;
        AdvertisingIdClient.Info info;
        Q();
        zzic zzicVar = (zzic) this.b;
        DefaultClock defaultClock = zzicVar.k;
        zzal zzalVar = zzicVar.d;
        defaultClock.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = this.e;
        bzo bzoVar2 = (bzo) hashMap.get(str);
        if (bzoVar2 != null && elapsedRealtime < bzoVar2.c) {
            return new Pair(bzoVar2.a, Boolean.valueOf(bzoVar2.b));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long Y = zzalVar.Y(str, zzfy.b) + elapsedRealtime;
        try {
            try {
                info = AdvertisingIdClient.getAdvertisingIdInfo(zzicVar.a);
            } catch (PackageManager.NameNotFoundException unused) {
                if (bzoVar2 != null && elapsedRealtime < bzoVar2.c + zzalVar.Y(str, zzfy.c)) {
                    return new Pair(bzoVar2.a, Boolean.valueOf(bzoVar2.b));
                }
                info = null;
            }
        } catch (Exception e) {
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.n.b(e, "Unable to get advertising id");
            bzoVar = new bzo(Y, false, "");
        }
        if (info == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String id = info.getId();
        bzoVar = id != null ? new bzo(Y, info.isLimitAdTrackingEnabled(), id) : new bzo(Y, info.isLimitAdTrackingEnabled(), "");
        hashMap.put(str, bzoVar);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(bzoVar.a, Boolean.valueOf(bzoVar.b));
    }

    public final String W(zzr zzrVar, zzjl zzjlVar) {
        String str = zzrVar.a;
        Preconditions.f(str);
        if (!zzjlVar.i(zzjk.AD_STORAGE) || !zzrVar.n) {
            return "";
        }
        Q();
        String str2 = (String) V(str).first;
        MessageDigest j0 = zzpp.j0();
        if (j0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, j0.digest(str2.getBytes())));
    }

    @Override // defpackage.p0p
    public final void T() {
    }
}
