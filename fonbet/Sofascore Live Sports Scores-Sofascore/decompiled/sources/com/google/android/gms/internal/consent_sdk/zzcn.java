package com.google.android.gms.internal.consent_sdk;

import android.util.JsonReader;
import defpackage.is8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcn {
    public String a;
    public String b;
    public String c;
    public List d;
    public List e;
    public String f;
    public int g = 1;
    public int h;

    public zzcn() {
        List list = Collections.EMPTY_LIST;
        this.d = list;
        this.e = list;
        this.h = 1;
    }

    public static zzcn a(JsonReader jsonReader) {
        int i;
        zzcn zzcnVar = new zzcn();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int i2 = 3;
            switch (nextName.hashCode()) {
                case -2001388947:
                    if (nextName.equals("consent_signal")) {
                        String nextString = jsonReader.nextString();
                        switch (nextString.hashCode()) {
                            case -2058725357:
                                if (!nextString.equals("CONSENT_SIGNAL_COLLECT_CONSENT")) {
                                    is8.e("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                    break;
                                } else {
                                    i2 = 5;
                                    zzcnVar.g = i2;
                                }
                            case -1969035850:
                                if (!nextString.equals("CONSENT_SIGNAL_ERROR")) {
                                    is8.e("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                    break;
                                } else {
                                    i2 = 7;
                                    zzcnVar.g = i2;
                                }
                            case -1263695752:
                                if (!nextString.equals("CONSENT_SIGNAL_UNKNOWN")) {
                                    is8.e("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                    break;
                                } else {
                                    i2 = 1;
                                    zzcnVar.g = i2;
                                }
                            case -954325659:
                                if (!nextString.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                                    is8.e("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                    break;
                                }
                                zzcnVar.g = i2;
                            case -918677260:
                                if (!nextString.equals("CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION")) {
                                    is8.e("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                    break;
                                } else {
                                    i2 = 8;
                                    zzcnVar.g = i2;
                                }
                            case 429411856:
                                if (!nextString.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                                    is8.e("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                    break;
                                } else {
                                    i2 = 4;
                                    zzcnVar.g = i2;
                                }
                            case 467888915:
                                if (!nextString.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                                    is8.e("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                    break;
                                } else {
                                    i2 = 2;
                                    zzcnVar.g = i2;
                                }
                            case 1725474845:
                                if (!nextString.equals("CONSENT_SIGNAL_NOT_REQUIRED")) {
                                    is8.e("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                    break;
                                } else {
                                    i2 = 6;
                                    zzcnVar.g = i2;
                                }
                            default:
                                is8.e("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.ConsentSignalfrom: ".concat(nextString));
                                break;
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                case -1938755376:
                    if (nextName.equals("error_message")) {
                        zzcnVar.c = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                case -1851537225:
                    if (nextName.equals("consent_form_base_url")) {
                        zzcnVar.b = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                case -1734348803:
                    if (nextName.equals("client_side_pingback_url")) {
                        zzcnVar.f = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                case -1324537865:
                    if (nextName.equals("privacy_options_required")) {
                        String nextString2 = jsonReader.nextString();
                        int hashCode = nextString2.hashCode();
                        if (hashCode == -1888946261) {
                            if (!nextString2.equals("NOT_REQUIRED")) {
                                is8.e("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(nextString2));
                            }
                            zzcnVar.h = i2;
                        } else if (hashCode != 389487519) {
                            if (hashCode == 433141802 && nextString2.equals("UNKNOWN")) {
                                i2 = 1;
                                zzcnVar.h = i2;
                            }
                            is8.e("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(nextString2));
                            break;
                        } else if (nextString2.equals("REQUIRED")) {
                            i2 = 2;
                            zzcnVar.h = i2;
                        } else {
                            is8.e("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.PrivacyOptionsRequirementStatusfrom: ".concat(nextString2));
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -1161803523:
                    if (nextName.equals("actions")) {
                        zzcnVar.e = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            zzcm zzcmVar = new zzcm();
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                String nextName2 = jsonReader.nextName();
                                int hashCode2 = nextName2.hashCode();
                                if (hashCode2 != -2105551094) {
                                    if (hashCode2 == 1583758243 && nextName2.equals("action_type")) {
                                        String nextString3 = jsonReader.nextString();
                                        int hashCode3 = nextString3.hashCode();
                                        if (hashCode3 != 64208429) {
                                            if (hashCode3 != 82862015) {
                                                if (hashCode3 == 1856333582 && nextString3.equals("UNKNOWN_ACTION_TYPE")) {
                                                    i = 1;
                                                    zzcmVar.b = i;
                                                }
                                                is8.e("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(nextString3));
                                                break;
                                            } else if (nextString3.equals("WRITE")) {
                                                i = 2;
                                                zzcmVar.b = i;
                                            } else {
                                                is8.e("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(nextString3));
                                            }
                                        } else if (nextString3.equals("CLEAR")) {
                                            i = 3;
                                            zzcmVar.b = i;
                                        } else {
                                            is8.e("Failed to parse contentads.contributor.direct.serving.appswitchboard.proto.ApplicationGdprResponse.Action.ActionTypefrom: ".concat(nextString3));
                                        }
                                    }
                                    jsonReader.skipValue();
                                } else if (nextName2.equals("args_json")) {
                                    zzcmVar.a = jsonReader.nextString();
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            zzcnVar.e.add(zzcmVar);
                        }
                        jsonReader.endArray();
                    } else {
                        jsonReader.skipValue();
                    }
                    break;
                case -986806987:
                    if (nextName.equals("request_info_keys")) {
                        zzcnVar.d = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            zzcnVar.d.add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                    } else {
                        jsonReader.skipValue();
                    }
                case -790907624:
                    if (nextName.equals("consent_form_payload")) {
                        zzcnVar.a = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                default:
                    jsonReader.skipValue();
            }
            return null;
        }
        jsonReader.endObject();
        return zzcnVar;
    }
}
