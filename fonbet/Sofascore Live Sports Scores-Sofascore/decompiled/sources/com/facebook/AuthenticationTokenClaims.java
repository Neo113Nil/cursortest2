package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.a70;
import defpackage.dmi;
import defpackage.i6a;
import defpackage.ljg;
import defpackage.phi;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/AuthenticationTokenClaims;", "Landroid/os/Parcelable;", "com/facebook/appevents/n", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AuthenticationTokenClaims implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AuthenticationTokenClaims> CREATOR = new a(2);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final Set n;
    public final String o;
    public final Map p;
    public final Map q;
    public final Map r;
    public final String s;
    public final String t;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0062, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(new java.net.URL(r2).getHost(), "www.facebook.com") != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AuthenticationTokenClaims(String str, String str2) {
        Set unmodifiableSet;
        str.getClass();
        str2.getClass();
        com.facebook.internal.h.h(str, "encodedClaims");
        byte[] decode = Base64.decode(str, 8);
        decode.getClass();
        JSONObject jSONObject = new JSONObject(new String(decode, Charsets.UTF_8));
        String optString = jSONObject.optString("jti");
        optString.getClass();
        if (optString.length() != 0) {
            try {
                String optString2 = jSONObject.optString("iss");
                optString2.getClass();
                if (optString2.length() != 0) {
                    if (!Intrinsics.c(new URL(optString2).getHost(), "facebook.com")) {
                    }
                    String optString3 = jSONObject.optString("aud");
                    optString3.getClass();
                    if (optString3.length() != 0 && optString3.equals(w.b())) {
                        if (!new Date().after(new Date(jSONObject.optLong("exp") * 1000))) {
                            if (!new Date().after(new Date((jSONObject.optLong("iat") * 1000) + TTAdConstant.AD_MAX_EVENT_TIME))) {
                                String optString4 = jSONObject.optString("sub");
                                optString4.getClass();
                                if (optString4.length() != 0) {
                                    String optString5 = jSONObject.optString("nonce");
                                    optString5.getClass();
                                    if (optString5.length() != 0 && optString5.equals(str2)) {
                                        String string = jSONObject.getString("jti");
                                        string.getClass();
                                        this.a = string;
                                        String string2 = jSONObject.getString("iss");
                                        string2.getClass();
                                        this.b = string2;
                                        String string3 = jSONObject.getString("aud");
                                        string3.getClass();
                                        this.c = string3;
                                        String string4 = jSONObject.getString("nonce");
                                        string4.getClass();
                                        this.d = string4;
                                        this.e = jSONObject.getLong("exp");
                                        this.f = jSONObject.getLong("iat");
                                        String string5 = jSONObject.getString("sub");
                                        string5.getClass();
                                        this.g = string5;
                                        this.h = com.facebook.appevents.n.n("name", jSONObject);
                                        this.i = com.facebook.appevents.n.n("given_name", jSONObject);
                                        this.j = com.facebook.appevents.n.n("middle_name", jSONObject);
                                        this.k = com.facebook.appevents.n.n("family_name", jSONObject);
                                        this.l = com.facebook.appevents.n.n(NotificationCompat.CATEGORY_EMAIL, jSONObject);
                                        this.m = com.facebook.appevents.n.n("picture", jSONObject);
                                        JSONArray optJSONArray = jSONObject.optJSONArray("user_friends");
                                        if (optJSONArray == null) {
                                            unmodifiableSet = null;
                                        } else {
                                            HashSet hashSet = new HashSet();
                                            int length = optJSONArray.length();
                                            for (int i = 0; i < length; i++) {
                                                String string6 = optJSONArray.getString(i);
                                                string6.getClass();
                                                hashSet.add(string6);
                                            }
                                            unmodifiableSet = Collections.unmodifiableSet(hashSet);
                                        }
                                        this.n = unmodifiableSet;
                                        this.o = com.facebook.appevents.n.n("user_birthday", jSONObject);
                                        JSONObject optJSONObject = jSONObject.optJSONObject("user_age_range");
                                        this.p = optJSONObject == null ? null : Collections.unmodifiableMap(com.facebook.internal.k0.g(optJSONObject));
                                        JSONObject optJSONObject2 = jSONObject.optJSONObject("user_hometown");
                                        this.q = optJSONObject2 == null ? null : Collections.unmodifiableMap(com.facebook.internal.k0.h(optJSONObject2));
                                        JSONObject optJSONObject3 = jSONObject.optJSONObject("user_location");
                                        this.r = optJSONObject3 != null ? Collections.unmodifiableMap(com.facebook.internal.k0.h(optJSONObject3)) : null;
                                        this.s = com.facebook.appevents.n.n("user_gender", jSONObject);
                                        this.t = com.facebook.appevents.n.n("user_link", jSONObject);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (MalformedURLException unused) {
            }
        }
        a70.p("Invalid claims");
        throw null;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jti", this.a);
        jSONObject.put("iss", this.b);
        jSONObject.put("aud", this.c);
        jSONObject.put("nonce", this.d);
        jSONObject.put("exp", this.e);
        jSONObject.put("iat", this.f);
        String str = this.g;
        if (str != null) {
            jSONObject.put("sub", str);
        }
        String str2 = this.h;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        String str3 = this.i;
        if (str3 != null) {
            jSONObject.put("given_name", str3);
        }
        String str4 = this.j;
        if (str4 != null) {
            jSONObject.put("middle_name", str4);
        }
        String str5 = this.k;
        if (str5 != null) {
            jSONObject.put("family_name", str5);
        }
        String str6 = this.l;
        if (str6 != null) {
            jSONObject.put(NotificationCompat.CATEGORY_EMAIL, str6);
        }
        String str7 = this.m;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        Set set = this.n;
        if (set != null) {
            jSONObject.put("user_friends", new JSONArray((Collection) set));
        }
        String str8 = this.o;
        if (str8 != null) {
            jSONObject.put("user_birthday", str8);
        }
        Map map = this.p;
        if (map != null) {
            jSONObject.put("user_age_range", new JSONObject(map));
        }
        Map map2 = this.q;
        if (map2 != null) {
            jSONObject.put("user_hometown", new JSONObject(map2));
        }
        Map map3 = this.r;
        if (map3 != null) {
            jSONObject.put("user_location", new JSONObject(map3));
        }
        String str9 = this.s;
        if (str9 != null) {
            jSONObject.put("user_gender", str9);
        }
        String str10 = this.t;
        if (str10 != null) {
            jSONObject.put("user_link", str10);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationTokenClaims)) {
            return false;
        }
        AuthenticationTokenClaims authenticationTokenClaims = (AuthenticationTokenClaims) obj;
        return Intrinsics.c(this.a, authenticationTokenClaims.a) && Intrinsics.c(this.b, authenticationTokenClaims.b) && Intrinsics.c(this.c, authenticationTokenClaims.c) && Intrinsics.c(this.d, authenticationTokenClaims.d) && this.e == authenticationTokenClaims.e && this.f == authenticationTokenClaims.f && Intrinsics.c(this.g, authenticationTokenClaims.g) && Intrinsics.c(this.h, authenticationTokenClaims.h) && Intrinsics.c(this.i, authenticationTokenClaims.i) && Intrinsics.c(this.j, authenticationTokenClaims.j) && Intrinsics.c(this.k, authenticationTokenClaims.k) && Intrinsics.c(this.l, authenticationTokenClaims.l) && Intrinsics.c(this.m, authenticationTokenClaims.m) && Intrinsics.c(this.n, authenticationTokenClaims.n) && Intrinsics.c(this.o, authenticationTokenClaims.o) && Intrinsics.c(this.p, authenticationTokenClaims.p) && Intrinsics.c(this.q, authenticationTokenClaims.q) && Intrinsics.c(this.r, authenticationTokenClaims.r) && Intrinsics.c(this.s, authenticationTokenClaims.s) && Intrinsics.c(this.t, authenticationTokenClaims.t);
    }

    public final int hashCode() {
        int c = dmi.c(ljg.c(ljg.c(dmi.c(dmi.c(dmi.c(dmi.c(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.a), 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        int hashCode = (c + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.i;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.j;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.k;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.l;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.m;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Set set = this.n;
        int hashCode7 = (hashCode6 + (set != null ? set.hashCode() : 0)) * 31;
        String str7 = this.o;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Map map = this.p;
        int hashCode9 = (hashCode8 + (map != null ? map.hashCode() : 0)) * 31;
        Map map2 = this.q;
        int hashCode10 = (hashCode9 + (map2 != null ? map2.hashCode() : 0)) * 31;
        Map map3 = this.r;
        int hashCode11 = (hashCode10 + (map3 != null ? map3.hashCode() : 0)) * 31;
        String str8 = this.s;
        int hashCode12 = (hashCode11 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.t;
        return hashCode12 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        String jSONObject = a().toString();
        jSONObject.getClass();
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        Set set = this.n;
        if (set == null) {
            parcel.writeStringList(null);
        } else {
            parcel.writeStringList(new ArrayList(set));
        }
        parcel.writeString(this.o);
        parcel.writeMap(this.p);
        parcel.writeMap(this.q);
        parcel.writeMap(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
    }

    public AuthenticationTokenClaims(Parcel parcel) {
        String readString = parcel.readString();
        com.facebook.internal.h.j(readString, "jti");
        this.a = readString;
        String readString2 = parcel.readString();
        com.facebook.internal.h.j(readString2, "iss");
        this.b = readString2;
        String readString3 = parcel.readString();
        com.facebook.internal.h.j(readString3, "aud");
        this.c = readString3;
        String readString4 = parcel.readString();
        com.facebook.internal.h.j(readString4, "nonce");
        this.d = readString4;
        this.e = parcel.readLong();
        this.f = parcel.readLong();
        String readString5 = parcel.readString();
        com.facebook.internal.h.j(readString5, "sub");
        this.g = readString5;
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.j = parcel.readString();
        this.k = parcel.readString();
        this.l = parcel.readString();
        this.m = parcel.readString();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        this.n = createStringArrayList != null ? Collections.unmodifiableSet(new HashSet(createStringArrayList)) : null;
        this.o = parcel.readString();
        HashMap readHashMap = parcel.readHashMap(i6a.a.getClass().getClassLoader());
        readHashMap = readHashMap == null ? null : readHashMap;
        this.p = readHashMap != null ? Collections.unmodifiableMap(readHashMap) : null;
        HashMap readHashMap2 = parcel.readHashMap(phi.a.getClass().getClassLoader());
        readHashMap2 = readHashMap2 == null ? null : readHashMap2;
        this.q = readHashMap2 != null ? Collections.unmodifiableMap(readHashMap2) : null;
        HashMap readHashMap3 = parcel.readHashMap(phi.class.getClassLoader());
        readHashMap3 = readHashMap3 == null ? null : readHashMap3;
        this.r = readHashMap3 != null ? Collections.unmodifiableMap(readHashMap3) : null;
        this.s = parcel.readString();
        this.t = parcel.readString();
    }
}
