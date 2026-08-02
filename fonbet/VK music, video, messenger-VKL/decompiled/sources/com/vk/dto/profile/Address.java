package com.vk.dto.profile;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import com.vk.dto.profile.OpenStatus;
import com.vk.log.L;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import com.vk.superapp.api.dto.identity.WebCity;
import com.vk.superapp.api.dto.identity.WebCountry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;

/* loaded from: classes18.dex */
public class Address extends PlainAddress {
    public static final Serializer.c<Address> CREATOR = new a();
    public final String e;
    public final String f;
    public final String g;
    public WebCity h;
    public WebCountry i;
    public final int j;
    public final int k;
    public int l;
    public final int m;
    public final int n;

    @Nullable
    public final Timetable o;

    @Nullable
    public MetroStation p;

    @Nullable
    public final String q;
    public final boolean r;

    @Nullable
    public final String s;

    @Nullable
    public final OpenStatus t;
    public final int u;

    public class a extends Serializer.c<Address> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Address a(Serializer serializer) {
            return new Address(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Address[i];
        }
    }

    public Address(int i, String str, String str2, String str3, int i2, int i3, double d, double d2, int i4, @Nullable Timetable timetable, @Nullable MetroStation metroStation, @Nullable String str4, WebCity webCity, WebCountry webCountry, @Nullable String str5, boolean z, int i5, @Nullable OpenStatus openStatus, int i6) {
        this.n = Integer.MAX_VALUE;
        this.b = i;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.j = i2;
        this.k = i3;
        this.c = d;
        this.d = d2;
        this.m = i4;
        this.o = timetable;
        this.p = metroStation;
        this.q = str4;
        this.h = webCity;
        this.i = webCountry;
        this.s = str5;
        this.r = z;
        this.l = i5;
        this.t = openStatus;
        this.u = i6;
    }

    public static ArrayList<Address> Ab(JSONObject jSONObject) {
        HashMap hashMap;
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        HashMap hashMap2 = null;
        if (optJSONArray == null) {
            return null;
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("countries");
        JSONArray optJSONArray3 = jSONObject.optJSONArray("cities");
        if (optJSONArray2 != null) {
            hashMap = new HashMap();
            int length = optJSONArray2.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray2.optJSONObject(i);
                if (optJSONObject != null) {
                    WebCountry webCountry = new WebCountry(optJSONObject);
                    hashMap.put(Integer.valueOf(webCountry.b), webCountry);
                }
            }
        } else {
            hashMap = null;
        }
        if (optJSONArray3 != null) {
            hashMap2 = new HashMap();
            int length2 = optJSONArray3.length();
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject optJSONObject2 = optJSONArray3.optJSONObject(i2);
                if (optJSONObject2 != null) {
                    WebCity webCity = new WebCity(optJSONObject2);
                    hashMap2.put(Integer.valueOf(webCity.b), webCity);
                }
            }
        }
        ArrayList<Address> arrayList = new ArrayList<>(optJSONArray.length());
        int length3 = optJSONArray.length();
        for (int i3 = 0; i3 < length3; i3++) {
            JSONObject optJSONObject3 = optJSONArray.optJSONObject(i3);
            if (optJSONObject3 != null) {
                arrayList.add(new Address(optJSONObject3, hashMap, hashMap2));
            }
        }
        return arrayList;
    }

    @Override // com.vk.dto.profile.PlainAddress, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.S(this.j);
        serializer.S(this.k);
        serializer.O(this.c);
        serializer.O(this.d);
        serializer.S(this.m);
        serializer.i0(this.o);
        serializer.i0(this.p);
        serializer.j0(this.q);
        serializer.i0(this.h);
        serializer.i0(this.i);
        serializer.j0(this.s);
        serializer.L(this.r ? (byte) 1 : (byte) 0);
        serializer.S(this.l);
        serializer.i0(this.t);
        serializer.S(this.u);
    }

    public final String zb() {
        WebCountry webCountry = this.i;
        if (webCountry == null || this.h == null || TextUtils.isEmpty(webCountry.c) || TextUtils.isEmpty(this.h.c)) {
            return null;
        }
        return this.i.c + ", " + this.h.c;
    }

    public Address(String str, String str2, double d, double d2) {
        this.m = 0;
        this.n = Integer.MAX_VALUE;
        this.r = false;
        this.e = str;
        this.f = str2;
        this.c = d;
        this.d = d2;
        this.l = -1;
        this.u = -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d6, code lost:
    
        if (r9.equals("always_opened") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Address(JSONObject jSONObject, Map<Integer, WebCountry> map, Map<Integer, WebCity> map2) {
        super(jSONObject);
        boolean z = false;
        this.m = 0;
        this.n = Integer.MAX_VALUE;
        this.r = false;
        this.e = jSONObject.optString("title");
        this.f = jSONObject.optString(RTCStatsConstants.KEY_ADDRESS);
        this.g = jSONObject.optString("additional_address");
        int optInt = jSONObject.optInt(AnalyticsBaseParamsConstantsKt.COUNTRY_ID);
        this.j = optInt;
        int optInt2 = jSONObject.optInt("city_id");
        this.k = optInt2;
        this.q = jSONObject.optString("phone");
        this.n = jSONObject.optInt("time_offset", Integer.MAX_VALUE);
        if (map2 != null && optInt2 > 0) {
            this.h = map2.containsKey(Integer.valueOf(optInt2)) ? map2.get(Integer.valueOf(optInt2)) : null;
        }
        if (map != null && optInt > 0) {
            this.i = map.containsKey(Integer.valueOf(optInt)) ? map.get(Integer.valueOf(optInt)) : null;
        }
        this.c = jSONObject.optDouble("latitude");
        this.d = jSONObject.optDouble("longitude");
        String optString = jSONObject.optString("work_info_status", null);
        if (optString != null) {
            switch (optString.hashCode()) {
                case -2006084455:
                    break;
                case -1127783369:
                    if (optString.equals("temp_closed")) {
                        z = true;
                        break;
                    }
                    z = -1;
                    break;
                case -959061187:
                    if (optString.equals("temporarily_closed")) {
                        z = 2;
                        break;
                    }
                    z = -1;
                    break;
                case 55484705:
                    if (optString.equals("timetable")) {
                        z = 3;
                        break;
                    }
                    z = -1;
                    break;
                case 1076501316:
                    if (optString.equals("forever_closed")) {
                        z = 4;
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
                    this.m = 4;
                    break;
                case true:
                case true:
                    this.m = 1;
                    break;
                case true:
                    this.m = 2;
                    break;
                case true:
                    this.m = 3;
                    break;
                default:
                    this.m = 5;
                    break;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("timetable");
            if (optJSONObject != null) {
                this.o = new Timetable(optJSONObject);
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("open_status");
            if (optJSONObject2 != null) {
                Serializer.c<OpenStatus> cVar = OpenStatus.CREATOR;
                this.t = new OpenStatus(OpenStatus.a.a(optJSONObject2.optString(TtmlNode.TAG_STYLE)), optJSONObject2.optString("primary_text"), optJSONObject2.optString("secondary_text"));
            }
        }
        this.l = jSONObject.optInt("metro_station_id", -1);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("metro_station");
        if (optJSONObject3 != null) {
            try {
                this.p = new MetroStation(optJSONObject3);
            } catch (JSONException e) {
                L.i(e);
            }
        }
        this.u = jSONObject.optInt("distance", -1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b4, code lost:
    
        if (r1.equals("always_opened") == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Address(JSONObject jSONObject) {
        super(jSONObject);
        boolean z = false;
        this.m = 0;
        this.n = Integer.MAX_VALUE;
        this.r = false;
        this.e = jSONObject.optString("title");
        this.f = jSONObject.optString(RTCStatsConstants.KEY_ADDRESS);
        this.g = jSONObject.optString("additional_address");
        JSONObject optJSONObject = jSONObject.optJSONObject("country");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("city");
        if (optJSONObject != null) {
            WebCountry webCountry = new WebCountry(optJSONObject);
            this.i = webCountry;
            this.j = webCountry.b;
        }
        if (optJSONObject2 != null) {
            WebCity webCity = new WebCity(optJSONObject2);
            this.h = webCity;
            this.k = webCity.b;
        }
        this.q = jSONObject.optString("phone");
        this.n = jSONObject.optInt("time_offset", Integer.MAX_VALUE);
        this.c = jSONObject.optDouble("latitude");
        this.d = jSONObject.optDouble("longitude");
        String optString = jSONObject.optString("work_info_status", null);
        if (optString != null) {
            switch (optString.hashCode()) {
                case -2006084455:
                    break;
                case -1127783369:
                    if (optString.equals("temp_closed")) {
                        z = true;
                        break;
                    }
                    z = -1;
                    break;
                case -959061187:
                    if (optString.equals("temporarily_closed")) {
                        z = 2;
                        break;
                    }
                    z = -1;
                    break;
                case 55484705:
                    if (optString.equals("timetable")) {
                        z = 3;
                        break;
                    }
                    z = -1;
                    break;
                case 1076501316:
                    if (optString.equals("forever_closed")) {
                        z = 4;
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
                    this.m = 4;
                    break;
                case true:
                case true:
                    this.m = 1;
                    break;
                case true:
                    this.m = 2;
                    break;
                case true:
                    this.m = 3;
                    break;
                default:
                    this.m = 5;
                    break;
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("timetable");
            if (optJSONObject3 != null) {
                this.o = new Timetable(optJSONObject3);
            }
            JSONObject optJSONObject4 = jSONObject.optJSONObject("open_status");
            if (optJSONObject4 != null) {
                Serializer.c<OpenStatus> cVar = OpenStatus.CREATOR;
                this.t = new OpenStatus(OpenStatus.a.a(optJSONObject4.optString(TtmlNode.TAG_STYLE)), optJSONObject4.optString("primary_text"), optJSONObject4.optString("secondary_text"));
            }
        }
        this.l = jSONObject.optInt("metro_station_id", -1);
        this.u = jSONObject.optInt("distance", -1);
    }

    public Address(Serializer serializer) {
        this.m = 0;
        this.n = Integer.MAX_VALUE;
        this.r = false;
        this.b = serializer.u();
        this.e = serializer.H();
        this.f = serializer.H();
        this.g = serializer.H();
        this.j = serializer.u();
        this.k = serializer.u();
        this.c = serializer.r();
        this.d = serializer.r();
        this.m = serializer.u();
        this.o = (Timetable) serializer.G(Timetable.class.getClassLoader());
        this.p = (MetroStation) serializer.G(MetroStation.class.getClassLoader());
        this.q = serializer.H();
        this.h = (WebCity) serializer.G(WebCity.class.getClassLoader());
        this.i = (WebCountry) serializer.G(WebCountry.class.getClassLoader());
        this.s = serializer.H();
        this.r = serializer.m();
        this.l = serializer.u();
        this.t = (OpenStatus) serializer.G(OpenStatus.class.getClassLoader());
        this.u = serializer.u();
    }
}
