package com.facebook;

import T7.Y;
import T7.Z;
import W9.d;
import X9.m;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.bumptech.glide.gifdecoder.e;
import com.google.android.material.shape.i;
import com.google.crypto.tink.integration.android.b;
import g6.C4331C;
import i3.C4527h;
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
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0013\u0018\u0000 d2\u00020\u0001:\u0001\u001eB\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u001aJ\u000f\u0010\u001e\u001a\u00020\nH\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\u001cR\u0017\u0010$\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b#\u0010\u001cR\u0017\u0010'\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\u001cR\u0017\u0010*\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\u001cR\u0017\u00100\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u00103\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u0010/R\u0017\u00106\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010 \u001a\u0004\b5\u0010\u001cR\u0019\u00109\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u0010 \u001a\u0004\b8\u0010\u001cR\u0019\u0010<\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b:\u0010 \u001a\u0004\b;\u0010\u001cR\u0019\u0010?\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b=\u0010 \u001a\u0004\b>\u0010\u001cR\u0019\u0010B\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b@\u0010 \u001a\u0004\bA\u0010\u001cR\u0019\u0010E\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bC\u0010 \u001a\u0004\bD\u0010\u001cR\u0019\u0010H\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bF\u0010 \u001a\u0004\bG\u0010\u001cR\u001f\u0010N\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010I8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0019\u0010Q\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bO\u0010 \u001a\u0004\bP\u0010\u001cR%\u0010W\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010R8\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR%\u0010Z\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010R8\u0006¢\u0006\f\n\u0004\bX\u0010T\u001a\u0004\bY\u0010VR%\u0010]\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010R8\u0006¢\u0006\f\n\u0004\b[\u0010T\u001a\u0004\b\\\u0010VR\u0019\u0010`\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b^\u0010 \u001a\u0004\b_\u0010\u001cR\u0019\u0010c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\ba\u0010 \u001a\u0004\bb\u0010\u001c¨\u0006e"}, d2 = {"Lcom/facebook/AuthenticationTokenClaims;", "Landroid/os/Parcelable;", "", "encodedClaims", "expectedNonce", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "Lorg/json/JSONObject;", "claimsJson", "", "a", "(Lorg/json/JSONObject;Ljava/lang/String;)Z", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "describeContents", b.f37029b, "()Lorg/json/JSONObject;", "Ljava/lang/String;", "getJti", "jti", "getIss", "iss", "c", "getAud", "aud", d.f13160a, "getNonce", "nonce", "", e.f29601m, "J", "getExp", "()J", "exp", "f", "getIat", "iat", "g", "getSub", "sub", C4527h.f48087o, "getName", "name", i.f35755A, "getGivenName", "givenName", "j", "getMiddleName", "middleName", "k", "getFamilyName", "familyName", "l", "getEmail", "email", m.f13664a, "getPicture", "picture", "", "n", "Ljava/util/Set;", "getUserFriends", "()Ljava/util/Set;", "userFriends", "o", "getUserBirthday", "userBirthday", "", "p", "Ljava/util/Map;", "getUserAgeRange", "()Ljava/util/Map;", "userAgeRange", "q", "getUserHometown", "userHometown", "r", "getUserLocation", "userLocation", "s", "getUserGender", "userGender", "t", "getUserLink", "userLink", "u", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AuthenticationTokenClaims implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String jti;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String iss;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String aud;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final String nonce;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final long exp;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final long iat;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final String sub;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final String name;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final String givenName;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final String middleName;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final String familyName;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final String email;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final String picture;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final Set userFriends;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final String userBirthday;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final Map userAgeRange;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final Map userHometown;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final Map userLocation;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final String userGender;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final String userLink;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<AuthenticationTokenClaims> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AuthenticationTokenClaims createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new AuthenticationTokenClaims(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AuthenticationTokenClaims[] newArray(int i10) {
            return new AuthenticationTokenClaims[i10];
        }
    }

    /* renamed from: com.facebook.AuthenticationTokenClaims$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(JSONObject jSONObject, String name) {
            Intrinsics.checkNotNullParameter(jSONObject, "<this>");
            Intrinsics.checkNotNullParameter(name, "name");
            if (jSONObject.has(name)) {
                return jSONObject.getString(name);
            }
            return null;
        }

        public Companion() {
        }
    }

    public AuthenticationTokenClaims(String encodedClaims, String expectedNonce) {
        Intrinsics.checkNotNullParameter(encodedClaims, "encodedClaims");
        Intrinsics.checkNotNullParameter(expectedNonce, "expectedNonce");
        Z.j(encodedClaims, "encodedClaims");
        byte[] decodedBytes = Base64.decode(encodedClaims, 8);
        Intrinsics.checkNotNullExpressionValue(decodedBytes, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decodedBytes, Charsets.UTF_8));
        if (!a(jSONObject, expectedNonce)) {
            throw new IllegalArgumentException("Invalid claims");
        }
        String string = jSONObject.getString("jti");
        Intrinsics.checkNotNullExpressionValue(string, "jsonObj.getString(JSON_KEY_JIT)");
        this.jti = string;
        String string2 = jSONObject.getString("iss");
        Intrinsics.checkNotNullExpressionValue(string2, "jsonObj.getString(JSON_KEY_ISS)");
        this.iss = string2;
        String string3 = jSONObject.getString("aud");
        Intrinsics.checkNotNullExpressionValue(string3, "jsonObj.getString(JSON_KEY_AUD)");
        this.aud = string3;
        String string4 = jSONObject.getString("nonce");
        Intrinsics.checkNotNullExpressionValue(string4, "jsonObj.getString(JSON_KEY_NONCE)");
        this.nonce = string4;
        this.exp = jSONObject.getLong("exp");
        this.iat = jSONObject.getLong("iat");
        String string5 = jSONObject.getString("sub");
        Intrinsics.checkNotNullExpressionValue(string5, "jsonObj.getString(JSON_KEY_SUB)");
        this.sub = string5;
        Companion companion = INSTANCE;
        this.name = companion.a(jSONObject, "name");
        this.givenName = companion.a(jSONObject, "given_name");
        this.middleName = companion.a(jSONObject, "middle_name");
        this.familyName = companion.a(jSONObject, "family_name");
        this.email = companion.a(jSONObject, "email");
        this.picture = companion.a(jSONObject, "picture");
        JSONArray optJSONArray = jSONObject.optJSONArray("user_friends");
        this.userFriends = optJSONArray == null ? null : Collections.unmodifiableSet(Y.g0(optJSONArray));
        this.userBirthday = companion.a(jSONObject, "user_birthday");
        JSONObject optJSONObject = jSONObject.optJSONObject("user_age_range");
        this.userAgeRange = optJSONObject == null ? null : Collections.unmodifiableMap(Y.n(optJSONObject));
        JSONObject optJSONObject2 = jSONObject.optJSONObject("user_hometown");
        this.userHometown = optJSONObject2 == null ? null : Collections.unmodifiableMap(Y.o(optJSONObject2));
        JSONObject optJSONObject3 = jSONObject.optJSONObject("user_location");
        this.userLocation = optJSONObject3 != null ? Collections.unmodifiableMap(Y.o(optJSONObject3)) : null;
        this.userGender = companion.a(jSONObject, "user_gender");
        this.userLink = companion.a(jSONObject, "user_link");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(new java.net.URL(r2).getHost(), "www.facebook.com") == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(JSONObject claimsJson, String expectedNonce) {
        if (claimsJson == null) {
            return false;
        }
        String jti = claimsJson.optString("jti");
        Intrinsics.checkNotNullExpressionValue(jti, "jti");
        if (jti.length() == 0) {
            return false;
        }
        try {
            String iss = claimsJson.optString("iss");
            Intrinsics.checkNotNullExpressionValue(iss, "iss");
            if (iss.length() != 0) {
                if (!Intrinsics.areEqual(new URL(iss).getHost(), "facebook.com")) {
                }
                String aud = claimsJson.optString("aud");
                Intrinsics.checkNotNullExpressionValue(aud, "aud");
                if (aud.length() == 0 || !Intrinsics.areEqual(aud, C4331C.m())) {
                    return false;
                }
                long j10 = 1000;
                if (new Date().after(new Date(claimsJson.optLong("exp") * j10))) {
                    return false;
                }
                if (new Date().after(new Date((claimsJson.optLong("iat") * j10) + 600000))) {
                    return false;
                }
                String sub = claimsJson.optString("sub");
                Intrinsics.checkNotNullExpressionValue(sub, "sub");
                if (sub.length() == 0) {
                    return false;
                }
                String nonce = claimsJson.optString("nonce");
                Intrinsics.checkNotNullExpressionValue(nonce, "nonce");
                return nonce.length() != 0 && Intrinsics.areEqual(nonce, expectedNonce);
            }
            return false;
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jti", this.jti);
        jSONObject.put("iss", this.iss);
        jSONObject.put("aud", this.aud);
        jSONObject.put("nonce", this.nonce);
        jSONObject.put("exp", this.exp);
        jSONObject.put("iat", this.iat);
        String str = this.sub;
        if (str != null) {
            jSONObject.put("sub", str);
        }
        String str2 = this.name;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        String str3 = this.givenName;
        if (str3 != null) {
            jSONObject.put("given_name", str3);
        }
        String str4 = this.middleName;
        if (str4 != null) {
            jSONObject.put("middle_name", str4);
        }
        String str5 = this.familyName;
        if (str5 != null) {
            jSONObject.put("family_name", str5);
        }
        String str6 = this.email;
        if (str6 != null) {
            jSONObject.put("email", str6);
        }
        String str7 = this.picture;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        if (this.userFriends != null) {
            jSONObject.put("user_friends", new JSONArray((Collection) this.userFriends));
        }
        String str8 = this.userBirthday;
        if (str8 != null) {
            jSONObject.put("user_birthday", str8);
        }
        if (this.userAgeRange != null) {
            jSONObject.put("user_age_range", new JSONObject(this.userAgeRange));
        }
        if (this.userHometown != null) {
            jSONObject.put("user_hometown", new JSONObject(this.userHometown));
        }
        if (this.userLocation != null) {
            jSONObject.put("user_location", new JSONObject(this.userLocation));
        }
        String str9 = this.userGender;
        if (str9 != null) {
            jSONObject.put("user_gender", str9);
        }
        String str10 = this.userLink;
        if (str10 != null) {
            jSONObject.put("user_link", str10);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthenticationTokenClaims)) {
            return false;
        }
        AuthenticationTokenClaims authenticationTokenClaims = (AuthenticationTokenClaims) other;
        return Intrinsics.areEqual(this.jti, authenticationTokenClaims.jti) && Intrinsics.areEqual(this.iss, authenticationTokenClaims.iss) && Intrinsics.areEqual(this.aud, authenticationTokenClaims.aud) && Intrinsics.areEqual(this.nonce, authenticationTokenClaims.nonce) && this.exp == authenticationTokenClaims.exp && this.iat == authenticationTokenClaims.iat && Intrinsics.areEqual(this.sub, authenticationTokenClaims.sub) && Intrinsics.areEqual(this.name, authenticationTokenClaims.name) && Intrinsics.areEqual(this.givenName, authenticationTokenClaims.givenName) && Intrinsics.areEqual(this.middleName, authenticationTokenClaims.middleName) && Intrinsics.areEqual(this.familyName, authenticationTokenClaims.familyName) && Intrinsics.areEqual(this.email, authenticationTokenClaims.email) && Intrinsics.areEqual(this.picture, authenticationTokenClaims.picture) && Intrinsics.areEqual(this.userFriends, authenticationTokenClaims.userFriends) && Intrinsics.areEqual(this.userBirthday, authenticationTokenClaims.userBirthday) && Intrinsics.areEqual(this.userAgeRange, authenticationTokenClaims.userAgeRange) && Intrinsics.areEqual(this.userHometown, authenticationTokenClaims.userHometown) && Intrinsics.areEqual(this.userLocation, authenticationTokenClaims.userLocation) && Intrinsics.areEqual(this.userGender, authenticationTokenClaims.userGender) && Intrinsics.areEqual(this.userLink, authenticationTokenClaims.userLink);
    }

    public int hashCode() {
        int hashCode = (((((((((((((527 + this.jti.hashCode()) * 31) + this.iss.hashCode()) * 31) + this.aud.hashCode()) * 31) + this.nonce.hashCode()) * 31) + Long.hashCode(this.exp)) * 31) + Long.hashCode(this.iat)) * 31) + this.sub.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.givenName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.middleName;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.familyName;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.email;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.picture;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Set set = this.userFriends;
        int hashCode8 = (hashCode7 + (set == null ? 0 : set.hashCode())) * 31;
        String str7 = this.userBirthday;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Map map = this.userAgeRange;
        int hashCode10 = (hashCode9 + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.userHometown;
        int hashCode11 = (hashCode10 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map map3 = this.userLocation;
        int hashCode12 = (hashCode11 + (map3 == null ? 0 : map3.hashCode())) * 31;
        String str8 = this.userGender;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.userLink;
        return hashCode13 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        String jSONObject = b().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "claimsJsonObject.toString()");
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.jti);
        dest.writeString(this.iss);
        dest.writeString(this.aud);
        dest.writeString(this.nonce);
        dest.writeLong(this.exp);
        dest.writeLong(this.iat);
        dest.writeString(this.sub);
        dest.writeString(this.name);
        dest.writeString(this.givenName);
        dest.writeString(this.middleName);
        dest.writeString(this.familyName);
        dest.writeString(this.email);
        dest.writeString(this.picture);
        if (this.userFriends == null) {
            dest.writeStringList(null);
        } else {
            dest.writeStringList(new ArrayList(this.userFriends));
        }
        dest.writeString(this.userBirthday);
        dest.writeMap(this.userAgeRange);
        dest.writeMap(this.userHometown);
        dest.writeMap(this.userLocation);
        dest.writeString(this.userGender);
        dest.writeString(this.userLink);
    }

    public AuthenticationTokenClaims(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.jti = Z.n(parcel.readString(), "jti");
        this.iss = Z.n(parcel.readString(), "iss");
        this.aud = Z.n(parcel.readString(), "aud");
        this.nonce = Z.n(parcel.readString(), "nonce");
        this.exp = parcel.readLong();
        this.iat = parcel.readLong();
        this.sub = Z.n(parcel.readString(), "sub");
        this.name = parcel.readString();
        this.givenName = parcel.readString();
        this.middleName = parcel.readString();
        this.familyName = parcel.readString();
        this.email = parcel.readString();
        this.picture = parcel.readString();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        this.userFriends = createStringArrayList != null ? Collections.unmodifiableSet(new HashSet(createStringArrayList)) : null;
        this.userBirthday = parcel.readString();
        HashMap readHashMap = parcel.readHashMap(IntCompanionObject.INSTANCE.getClass().getClassLoader());
        readHashMap = readHashMap == null ? null : readHashMap;
        this.userAgeRange = readHashMap != null ? Collections.unmodifiableMap(readHashMap) : null;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        HashMap readHashMap2 = parcel.readHashMap(stringCompanionObject.getClass().getClassLoader());
        readHashMap2 = readHashMap2 == null ? null : readHashMap2;
        this.userHometown = readHashMap2 != null ? Collections.unmodifiableMap(readHashMap2) : null;
        HashMap readHashMap3 = parcel.readHashMap(stringCompanionObject.getClass().getClassLoader());
        readHashMap3 = readHashMap3 == null ? null : readHashMap3;
        this.userLocation = readHashMap3 != null ? Collections.unmodifiableMap(readHashMap3) : null;
        this.userGender = parcel.readString();
        this.userLink = parcel.readString();
    }
}
