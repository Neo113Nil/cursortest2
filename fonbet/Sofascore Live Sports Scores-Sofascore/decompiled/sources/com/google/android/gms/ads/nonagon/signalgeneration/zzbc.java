package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.util.JsonReader;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzcbv;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbc {
    public final long a;
    public final long b;
    public final String zza;
    public String zzb;

    @Nullable
    public zzcbv zzc;
    public Bundle zzd = new Bundle();

    public zzbc(JsonReader jsonReader, @Nullable zzcbv zzcbvVar) throws IOException {
        Bundle bundle;
        this.a = -1L;
        this.b = -1L;
        this.zzc = zzcbvVar;
        HashMap hashMap = new HashMap();
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName = nextName == null ? "" : nextName;
            switch (nextName.hashCode()) {
                case -1573145462:
                    if (nextName.equals("start_time")) {
                        this.a = jsonReader.nextLong();
                        break;
                    } else {
                        jsonReader.skipValue();
                        break;
                    }
                case -995427962:
                    if (nextName.equals("params")) {
                        str = jsonReader.nextString();
                        break;
                    } else {
                        jsonReader.skipValue();
                        break;
                    }
                case -271442291:
                    if (nextName.equals("signal_dictionary")) {
                        hashMap = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            hashMap.put(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                        break;
                    } else {
                        jsonReader.skipValue();
                        break;
                    }
                case 1725551537:
                    if (nextName.equals("end_time")) {
                        this.b = jsonReader.nextLong();
                        break;
                    } else {
                        jsonReader.skipValue();
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        this.zza = str;
        jsonReader.endObject();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.zzd.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.S2)).booleanValue() || zzcbvVar == null || (bundle = zzcbvVar.m) == null) {
            return;
        }
        bundle.putLong("get-signals-sdkcore-start", this.a);
        bundle.putLong("get-signals-sdkcore-end", this.b);
    }
}
