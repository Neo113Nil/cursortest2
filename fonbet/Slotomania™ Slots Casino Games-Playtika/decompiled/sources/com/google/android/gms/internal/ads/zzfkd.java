package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzfkd {
    public final List zza;
    public final zzfjw zzb;
    public final List zzc;
    public final Bundle zzd;

    zzfkd(JsonReader jsonReader, Bundle bundle) throws IllegalStateException, IOException, JSONException, NumberFormatException, AssertionError {
        this.zzd = bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcN)).booleanValue() && bundle != null) {
            bundle.putLong(zzdyi.SERVER_RESPONSE_PARSE_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        List emptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        zzfjw zzfjwVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("responses".equals(nextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(nextName2)) {
                        emptyList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            emptyList.add(new zzfjt(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (nextName2.equals("common")) {
                        zzfjwVar = new zzfjw(jsonReader);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcO)).booleanValue() && bundle != null) {
                            bundle.putLong(zzdyi.NORMALIZATION_AD_RESPONSE_START.zza(), zzfjwVar.zzs);
                            bundle.putLong(zzdyi.NORMALIZATION_AD_RESPONSE_END.zza(), zzfjwVar.zzt);
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (nextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String str = null;
                    JSONObject jSONObject = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        if ("name".equals(nextName3)) {
                            str = jsonReader.nextString();
                        } else if ("info".equals(nextName3)) {
                            jSONObject = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (str != null) {
                        arrayList.add(new zzfkc(str, jSONObject));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.zzc = arrayList;
        this.zza = emptyList;
        this.zzb = zzfjwVar == null ? new zzfjw(new JsonReader(new StringReader(JsonUtils.EMPTY_JSON))) : zzfjwVar;
    }

    public static zzfkd zza(Reader reader, Bundle bundle) throws zzfjx {
        try {
            try {
                return new zzfkd(new JsonReader(reader), bundle);
            } finally {
                IOUtils.closeQuietly(reader);
            }
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e) {
            throw new zzfjx("unable to parse ServerResponse", e);
        }
    }
}
