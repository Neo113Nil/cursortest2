package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbva {
    public final zzbum a;

    public zzbva(Context context, VersionInfoParcel versionInfoParcel, String str, zzfrj zzfrjVar) {
        this.a = new zzbum(context, versionInfoParcel, str, zzfrjVar);
    }

    public final zzbve a(String str, zzbut zzbutVar, zzbus zzbusVar) {
        return new zzbve(this.a, str, zzbutVar, zzbusVar);
    }
}
