package com.google.android.gms.ads.internal.util.client;

import android.util.JsonWriter;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final /* synthetic */ class zzi implements zzk {
    public final /* synthetic */ String a;

    @Override // com.google.android.gms.ads.internal.util.client.zzk
    public final /* synthetic */ void zza(JsonWriter jsonWriter) {
        Object obj = zzl.b;
        jsonWriter.name("params").beginObject();
        String str = this.a;
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }
}
