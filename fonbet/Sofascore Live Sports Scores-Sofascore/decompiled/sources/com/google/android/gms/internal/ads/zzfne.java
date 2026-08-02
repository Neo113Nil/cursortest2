package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import defpackage.bsn;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfne implements zzdds {
    public final HashSet a = new HashSet();
    public final Context b;
    public final zzcga c;

    public zzfne(Context context, zzcga zzcgaVar) {
        this.b = context;
        this.c = zzcgaVar;
    }

    public final synchronized void a(HashSet hashSet) {
        HashSet hashSet2 = this.a;
        hashSet2.clear();
        hashSet2.addAll(hashSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle b() {
        String str;
        Bundle bundle;
        Context a;
        int identifier;
        boolean z;
        int i;
        Bundle bundle2;
        zzcga zzcgaVar = this.c;
        Context context = this.b;
        zzcgaVar.getClass();
        HashSet hashSet = new HashSet();
        synchronized (zzcgaVar.a) {
            HashSet hashSet2 = zzcgaVar.e;
            hashSet.addAll(hashSet2);
            hashSet2.clear();
        }
        Bundle bundle3 = new Bundle();
        zzcfx zzcfxVar = zzcgaVar.d;
        zzcfy zzcfyVar = zzcgaVar.c;
        synchronized (zzcfyVar) {
            str = zzcfyVar.b;
        }
        synchronized (zzcfxVar.f) {
            try {
                bundle = new Bundle();
                if (!zzcfxVar.i.zzx()) {
                    bundle.putString("session_id", zzcfxVar.h);
                }
                bundle.putLong("basets", zzcfxVar.b);
                bundle.putLong("currts", zzcfxVar.a);
                bundle.putString("seq_num", str);
                bundle.putInt("preqs", zzcfxVar.c);
                bundle.putInt("preqs_in_session", zzcfxVar.d);
                bundle.putLong("time_in_session", zzcfxVar.e);
                bundle.putInt("pclick", zzcfxVar.j);
                bundle.putInt("pimp", zzcfxVar.k);
                a = zzccf.a(context);
                identifier = a.getResources().getIdentifier("Theme.Translucent", TtmlNode.TAG_STYLE, "android");
            } catch (PackageManager.NameNotFoundException unused) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzi("Fail to fetch AdActivity theme");
                zzo.zzh("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            } finally {
            }
            if (identifier == 0) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzh("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            } else {
                if (identifier == a.getPackageManager().getActivityInfo(new ComponentName(a.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                    z = true;
                    bundle.putBoolean("support_transparent_background", z);
                    synchronized (zzcfxVar.f) {
                        i = zzcfxVar.l;
                    }
                    bundle.putInt("consent_form_action_identifier", i);
                } else {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzh("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                }
            }
            z = false;
            bundle.putBoolean("support_transparent_background", z);
            synchronized (zzcfxVar.f) {
            }
        }
        bundle3.putBundle("app", bundle);
        Bundle bundle4 = new Bundle();
        Iterator it = zzcgaVar.f.iterator();
        if (it.hasNext()) {
            throw null;
        }
        bundle3.putBundle("slots", bundle4);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            zzcfp zzcfpVar = (zzcfp) it2.next();
            synchronized (zzcfpVar.d) {
                try {
                    bundle2 = new Bundle();
                    bundle2.putString("seq_num", zzcfpVar.e);
                    bundle2.putString("slotid", zzcfpVar.f);
                    bundle2.putBoolean("ismediation", false);
                    bundle2.putLong("treq", zzcfpVar.j);
                    bundle2.putLong("tresponse", zzcfpVar.k);
                    bundle2.putLong("timp", zzcfpVar.g);
                    bundle2.putLong("tload", zzcfpVar.h);
                    bundle2.putLong("pcc", zzcfpVar.i);
                    bundle2.putLong("tfetch", -1L);
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    Iterator it3 = zzcfpVar.c.iterator();
                    while (it3.hasNext()) {
                        bsn bsnVar = (bsn) it3.next();
                        bsnVar.getClass();
                        Bundle bundle5 = new Bundle();
                        bundle5.putLong("topen", bsnVar.a);
                        bundle5.putLong("tclose", bsnVar.b);
                        arrayList2.add(bundle5);
                    }
                    bundle2.putParcelableArrayList("tclick", arrayList2);
                } finally {
                }
            }
            arrayList.add(bundle2);
        }
        bundle3.putParcelableArrayList(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, arrayList);
        a(hashSet);
        return bundle3;
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final synchronized void i0(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (zzeVar.zza != 3) {
            zzcga zzcgaVar = this.c;
            HashSet hashSet = this.a;
            synchronized (zzcgaVar.a) {
                zzcgaVar.e.addAll(hashSet);
            }
        }
    }
}
