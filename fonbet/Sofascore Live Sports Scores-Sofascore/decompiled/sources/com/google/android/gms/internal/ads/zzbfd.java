package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbfd {
    public final String a;
    public final JSONObject b;
    public final String c;
    public final String d;
    public final boolean e;

    public zzbfd(String str, VersionInfoParcel versionInfoParcel, String str2, JSONObject jSONObject, boolean z) {
        this.d = versionInfoParcel.afmaVersion;
        this.b = jSONObject;
        this.c = str;
        this.a = str2;
        this.e = z;
    }
}
