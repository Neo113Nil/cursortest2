package com.google.android.gms.ads.internal.util.client;

import android.util.Base64;
import android.util.JsonWriter;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final /* synthetic */ class zzj implements zzk {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ byte[] d;

    public /* synthetic */ zzj(String str, String str2, Map map, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = bArr;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzk
    public final void zza(JsonWriter jsonWriter) {
        Object obj = zzl.b;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(this.a);
        jsonWriter.name("verb").value(this.b);
        jsonWriter.endObject();
        zzl.a(jsonWriter, this.c);
        byte[] bArr = this.d;
        if (bArr != null) {
            jsonWriter.name("body").value(Base64.encodeToString(bArr, 0));
        }
        jsonWriter.endObject();
    }
}
