package com.fyber.inneractive.sdk.config.remote;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class e {
    public a a;
    public List b = null;
    public String c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ab A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e a(JSONObject jSONObject) {
        a aVar;
        JSONArray jSONArray;
        int i;
        String str;
        String str2;
        String str3;
        ArrayList arrayList;
        int i2;
        String str4;
        g gVar;
        String str5 = null;
        String optString = jSONObject.optString("updateHash", null);
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        e eVar = new e();
        eVar.c = optString;
        JSONObject optJSONObject = jSONObject.optJSONObject(MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        int optInt = optJSONObject == null ? -1 : optJSONObject.optInt("id", -1);
        String str6 = "isActive";
        if (optInt == -1) {
            aVar = null;
        } else {
            aVar = new a();
            aVar.a = String.valueOf(optInt);
            aVar.b = optJSONObject.optString("publisherId", null);
            aVar.c = f.a(optJSONObject.optJSONObject("monitor"));
            aVar.d = j.a(optJSONObject.optJSONObject("video"));
            aVar.e = b.a(optJSONObject.optJSONObject("display"));
            aVar.f = k.a(optJSONObject.optJSONObject("viewability"));
            aVar.g = optJSONObject.optString("isActive", null);
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("native");
            if (optJSONObject2 != null) {
                UnitDisplayType.fromValue(optJSONObject2.optString("unitDisplayType"));
            }
        }
        if (aVar == null) {
            return null;
        }
        eVar.a = aVar;
        ArrayList arrayList2 = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("spots");
        if (optJSONArray != null) {
            int i3 = 0;
            while (i3 < optJSONArray.length()) {
                JSONObject optJSONObject3 = optJSONArray.optJSONObject(i3);
                if (optJSONObject3 != null) {
                    String optString2 = optJSONObject3.optString("id", str5);
                    if (!TextUtils.isEmpty(optString2)) {
                        h hVar = new h();
                        hVar.a = optString2;
                        hVar.b = optJSONObject3.optString(str6, str5);
                        hVar.c = b.a(optJSONObject3.optJSONObject("display"));
                        hVar.d = f.a(optJSONObject3.optJSONObject("monitor"));
                        JSONObject optJSONObject4 = optJSONObject3.optJSONObject("native");
                        if (optJSONObject4 != null) {
                            UnitDisplayType.fromValue(optJSONObject4.optString("unitDisplayType"));
                        }
                        hVar.e = j.a(optJSONObject3.optJSONObject("video"));
                        hVar.f = k.a(optJSONObject3.optJSONObject("viewability"));
                        JSONArray optJSONArray2 = optJSONObject3.optJSONArray("units");
                        if (optJSONArray2 == null || optJSONArray2.length() == 0) {
                            jSONArray = optJSONArray;
                            i = i3;
                            str = str6;
                            str2 = str5;
                            arrayList = new ArrayList();
                        } else {
                            arrayList = new ArrayList();
                            jSONArray = optJSONArray;
                            int i4 = 0;
                            while (i4 < optJSONArray2.length()) {
                                JSONObject optJSONObject5 = optJSONArray2.optJSONObject(i4);
                                int i5 = i4;
                                if (optJSONObject5 != null) {
                                    i iVar = new i();
                                    i2 = i3;
                                    str4 = str6;
                                    iVar.a = optJSONObject5.optString("id", null);
                                    iVar.b = optJSONObject5.optString("spotId", null);
                                    iVar.c = b.a(optJSONObject5.optJSONObject("display"));
                                    iVar.d = f.a(optJSONObject5.optJSONObject("monitor"));
                                    JSONObject optJSONObject6 = optJSONObject5.optJSONObject("native");
                                    if (optJSONObject6 != null) {
                                        g gVar2 = new g();
                                        if (UnitDisplayType.fromValue(optJSONObject6.optString("unitDisplayType")) != null) {
                                            gVar = gVar2;
                                            iVar.e = gVar;
                                            iVar.f = j.a(optJSONObject5.optJSONObject("video"));
                                            iVar.g = k.a(optJSONObject5.optJSONObject("viewability"));
                                            arrayList.add(iVar);
                                        }
                                    }
                                    gVar = null;
                                    iVar.e = gVar;
                                    iVar.f = j.a(optJSONObject5.optJSONObject("video"));
                                    iVar.g = k.a(optJSONObject5.optJSONObject("viewability"));
                                    arrayList.add(iVar);
                                } else {
                                    i2 = i3;
                                    str4 = str6;
                                }
                                i4 = i5 + 1;
                                str6 = str4;
                                i3 = i2;
                            }
                            i = i3;
                            str = str6;
                            str2 = null;
                        }
                        hVar.g = arrayList;
                        str3 = hVar;
                        if (str3 == null) {
                            arrayList2.add(str3);
                        }
                        str5 = str2;
                        str6 = str;
                        i3 = i + 1;
                        optJSONArray = jSONArray;
                    }
                }
                jSONArray = optJSONArray;
                String str7 = str5;
                i = i3;
                str = str6;
                str2 = str7;
                str3 = str7;
                if (str3 == null) {
                }
                str5 = str2;
                str6 = str;
                i3 = i + 1;
                optJSONArray = jSONArray;
            }
        }
        eVar.b = arrayList2;
        return eVar;
    }
}
