package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.zzbp;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfln {
    public final List a;
    public final zzflg b;
    public final ArrayList c;
    public final Bundle d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public zzfln(JsonReader jsonReader, Bundle bundle) {
        this.d = bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.S2)).booleanValue() && bundle != null) {
            bundle.putLong("server-response-parse-start", com.google.android.gms.ads.internal.zzt.zzk().a());
        }
        ?? r0 = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        zzflg zzflgVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("responses".equals(nextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(nextName2)) {
                        r0 = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            r0.add(new zzfld(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (nextName2.equals("common")) {
                        zzflgVar = new zzflg(jsonReader);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.T2)).booleanValue() && bundle != null) {
                            bundle.putLong("normalize-ad-response-start", zzflgVar.s);
                            bundle.putLong("normalize-ad-response-end", zzflgVar.t);
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
                            jSONObject = zzbp.zzd(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (str != null) {
                        arrayList.add(new zzflm(str, jSONObject));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.c = arrayList;
        this.a = r0;
        this.b = zzflgVar == null ? new zzflg(new JsonReader(new StringReader("{}"))) : zzflgVar;
    }

    public static zzfln a(Reader reader, Bundle bundle) {
        try {
            try {
                return new zzfln(new JsonReader(reader), bundle);
            } finally {
                IOUtils.a(reader);
            }
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e) {
            throw new zzflh("unable to parse ServerResponse", e);
        }
    }
}
