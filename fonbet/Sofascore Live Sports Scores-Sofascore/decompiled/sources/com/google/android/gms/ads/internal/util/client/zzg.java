package com.google.android.gms.ads.internal.util.client;

import android.util.JsonWriter;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final /* synthetic */ class zzg implements zzk {
    public final /* synthetic */ int a;
    public final /* synthetic */ Map b;

    public /* synthetic */ zzg(int i, Map map) {
        this.a = i;
        this.b = map;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzk
    public final /* synthetic */ void zza(JsonWriter jsonWriter) {
        Object obj = zzl.b;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value(this.a);
        jsonWriter.endObject();
        zzl.a(jsonWriter, this.b);
        jsonWriter.endObject();
    }
}
