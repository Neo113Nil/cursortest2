package com.google.android.gms.internal.consent_sdk;

import android.util.JsonReader;
import androidx.annotation.Nullable;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes12.dex */
public final class zzck {

    @Nullable
    public String zza;

    @Nullable
    public String zzb;

    @Nullable
    public String zzc;
    public List zzd;
    public List zze;
    public int zzf = 1;
    public int zzg;

    public zzck() {
        List list = Collections.EMPTY_LIST;
        this.zzd = list;
        this.zze = list;
        this.zzg = 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzck zza(JsonReader jsonReader) throws IOException {
        boolean z;
        String nextString;
        boolean z2;
        char c;
        int i;
        zzck zzckVar = new zzck();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int i2 = 6;
            int i3 = 3;
            switch (nextName.hashCode()) {
                case -2001388947:
                    if (nextName.equals("consent_signal")) {
                        z = false;
                        break;
                    }
                    z = -1;
                    break;
                case -1938755376:
                    if (nextName.equals("error_message")) {
                        z = 3;
                        break;
                    }
                    z = -1;
                    break;
                case -1851537225:
                    if (nextName.equals("consent_form_base_url")) {
                        z = 2;
                        break;
                    }
                    z = -1;
                    break;
                case -1324537865:
                    if (nextName.equals("privacy_options_required")) {
                        z = 6;
                        break;
                    }
                    z = -1;
                    break;
                case -1161803523:
                    if (nextName.equals("actions")) {
                        z = 5;
                        break;
                    }
                    z = -1;
                    break;
                case -986806987:
                    if (nextName.equals("request_info_keys")) {
                        z = 4;
                        break;
                    }
                    z = -1;
                    break;
                case -790907624:
                    if (nextName.equals("consent_form_payload")) {
                        z = true;
                        break;
                    }
                    z = -1;
                    break;
                default:
                    z = -1;
                    break;
            }
            switch (z) {
                case false:
                    nextString = jsonReader.nextString();
                    switch (nextString) {
                        case "CONSENT_SIGNAL_UNKNOWN":
                            i2 = 1;
                            zzckVar.zzf = i2;
                            break;
                        case "CONSENT_SIGNAL_PERSONALIZED_ADS":
                            i2 = 2;
                            zzckVar.zzf = i2;
                            break;
                        case "CONSENT_SIGNAL_NON_PERSONALIZED_ADS":
                            i2 = 3;
                            zzckVar.zzf = i2;
                            break;
                        case "CONSENT_SIGNAL_SUFFICIENT":
                            i2 = 4;
                            zzckVar.zzf = i2;
                            break;
                        case "CONSENT_SIGNAL_COLLECT_CONSENT":
                            i2 = 5;
                            zzckVar.zzf = i2;
                            break;
                        case "CONSENT_SIGNAL_NOT_REQUIRED":
                            zzckVar.zzf = i2;
                            break;
                        case "CONSENT_SIGNAL_ERROR":
                            i2 = 7;
                            zzckVar.zzf = i2;
                            break;
                        case "CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION":
                            i2 = 8;
                            zzckVar.zzf = i2;
                            break;
                        default:
                            throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                    }
                case true:
                    zzckVar.zza = jsonReader.nextString();
                    break;
                case true:
                    zzckVar.zzb = jsonReader.nextString();
                    break;
                case true:
                    zzckVar.zzc = jsonReader.nextString();
                    break;
                case true:
                    zzckVar.zzd = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzckVar.zzd.add(jsonReader.nextString());
                    }
                    jsonReader.endArray();
                    break;
                case true:
                    zzckVar.zze = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzcj zzcjVar = new zzcj();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            int hashCode = nextName2.hashCode();
                            if (hashCode != -2105551094) {
                                if (hashCode == 1583758243 && nextName2.equals("action_type")) {
                                    z2 = false;
                                }
                                z2 = -1;
                            } else {
                                if (nextName2.equals("args_json")) {
                                    z2 = true;
                                }
                                z2 = -1;
                            }
                            if (!z2) {
                                String nextString2 = jsonReader.nextString();
                                int hashCode2 = nextString2.hashCode();
                                if (hashCode2 == 64208429) {
                                    if (nextString2.equals("CLEAR")) {
                                        c = 2;
                                        if (c != 0) {
                                        }
                                        zzcjVar.zzb = i;
                                    }
                                    c = 65535;
                                    if (c != 0) {
                                    }
                                    zzcjVar.zzb = i;
                                } else if (hashCode2 != 82862015) {
                                    if (hashCode2 == 1856333582 && nextString2.equals("UNKNOWN_ACTION_TYPE")) {
                                        c = 0;
                                        if (c != 0) {
                                            i = 1;
                                        } else if (c == 1) {
                                            i = 2;
                                        } else {
                                            if (c != 2) {
                                                throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(nextString2));
                                            }
                                            i = 3;
                                        }
                                        zzcjVar.zzb = i;
                                    }
                                    c = 65535;
                                    if (c != 0) {
                                    }
                                    zzcjVar.zzb = i;
                                } else {
                                    if (nextString2.equals("WRITE")) {
                                        c = 1;
                                        if (c != 0) {
                                        }
                                        zzcjVar.zzb = i;
                                    }
                                    c = 65535;
                                    if (c != 0) {
                                    }
                                    zzcjVar.zzb = i;
                                }
                            } else if (!z2) {
                                jsonReader.skipValue();
                            } else {
                                zzcjVar.zza = jsonReader.nextString();
                            }
                        }
                        jsonReader.endObject();
                        zzckVar.zze.add(zzcjVar);
                    }
                    jsonReader.endArray();
                    break;
                case true:
                    String nextString3 = jsonReader.nextString();
                    int hashCode3 = nextString3.hashCode();
                    if (hashCode3 != -1888946261) {
                        if (hashCode3 != 389487519) {
                            if (hashCode3 == 433141802 && nextString3.equals(GrsBaseInfo.CountryCodeSource.UNKNOWN)) {
                            }
                        } else if (nextString3.equals("REQUIRED")) {
                        }
                    } else if (nextString3.equals("NOT_REQUIRED")) {
                    }
                    if (r6 == 0) {
                        i3 = 1;
                    } else if (r6 == 1) {
                        i3 = 2;
                    } else if (r6 != 2) {
                        throw new IOException("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(nextString3));
                    }
                    zzckVar.zzg = i3;
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return zzckVar;
    }
}
