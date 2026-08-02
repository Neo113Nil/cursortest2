package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.appsflyer.sdk_base.referrer.Payload;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.dmi;
import defpackage.me4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/AccessToken;", "Landroid/os/Parcelable;", "com/facebook/appevents/g", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AccessToken implements Parcelable {
    public final Date a;
    public final Set b;
    public final Set c;
    public final Set d;
    public final String e;
    public final j f;
    public final Date g;
    public final String h;
    public final String i;
    public final Date j;
    public final String k;
    public static final Date l = new Date(Long.MAX_VALUE);
    public static final Date m = new Date();
    public static final j n = j.FACEBOOK_APPLICATION_WEB;

    @NotNull
    public static final Parcelable.Creator<AccessToken> CREATOR = new a(0);

    public AccessToken(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, j jVar, Date date, Date date2, Date date3, String str4) {
        me4.p(str, str2, str3);
        com.facebook.internal.h.h(str, "accessToken");
        com.facebook.internal.h.h(str2, "applicationId");
        com.facebook.internal.h.h(str3, "userId");
        Date date4 = l;
        this.a = date == null ? date4 : date;
        Set unmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        unmodifiableSet.getClass();
        this.b = unmodifiableSet;
        Set unmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        unmodifiableSet2.getClass();
        this.c = unmodifiableSet2;
        Set unmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        unmodifiableSet3.getClass();
        this.d = unmodifiableSet3;
        this.e = str;
        jVar = jVar == null ? n : jVar;
        if (str4 != null && str4.equals(Payload.SOURCE_INSTAGRAM)) {
            int ordinal = jVar.ordinal();
            if (ordinal == 1) {
                jVar = j.INSTAGRAM_APPLICATION_WEB;
            } else if (ordinal == 4) {
                jVar = j.INSTAGRAM_WEB_VIEW;
            } else if (ordinal == 5) {
                jVar = j.INSTAGRAM_CUSTOM_CHROME_TAB;
            }
        }
        this.f = jVar;
        this.g = date2 == null ? m : date2;
        this.h = str2;
        this.i = str3;
        this.j = (date3 == null || date3.getTime() == 0) ? date4 : date3;
        this.k = str4 == null ? Payload.SOURCE_FACEBOOK : str4;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.e);
        jSONObject.put("expires_at", this.a.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.b));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.c));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.d));
        jSONObject.put("last_refresh", this.g.getTime());
        jSONObject.put("source", this.f.name());
        jSONObject.put("application_id", this.h);
        jSONObject.put("user_id", this.i);
        jSONObject.put("data_access_expiration_time", this.j.getTime());
        String str = this.k;
        if (str != null) {
            jSONObject.put("graph_domain", str);
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
        if (!(obj instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        if (Intrinsics.c(this.a, accessToken.a) && Intrinsics.c(this.b, accessToken.b) && Intrinsics.c(this.c, accessToken.c) && Intrinsics.c(this.d, accessToken.d) && Intrinsics.c(this.e, accessToken.e) && this.f == accessToken.f && Intrinsics.c(this.g, accessToken.g) && Intrinsics.c(this.h, accessToken.h) && Intrinsics.c(this.i, accessToken.i) && Intrinsics.c(this.j, accessToken.j)) {
            String str = accessToken.k;
            String str2 = this.k;
            if (str2 == null ? str == null : Intrinsics.c(str2, str)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.j.hashCode() + dmi.c(dmi.c((this.g.hashCode() + ((this.f.hashCode() + dmi.c((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31)) * 31, 31, this.e)) * 31)) * 31, 31, this.h), 31, this.i)) * 31;
        String str = this.k;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{AccessToken token:ACCESS_TOKEN_REMOVED permissions:[");
        synchronized (w.b) {
        }
        sb.append(TextUtils.join(", ", this.b));
        sb.append("]}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.a.getTime());
        parcel.writeStringList(new ArrayList(this.b));
        parcel.writeStringList(new ArrayList(this.c));
        parcel.writeStringList(new ArrayList(this.d));
        parcel.writeString(this.e);
        parcel.writeString(this.f.name());
        parcel.writeLong(this.g.getTime());
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeLong(this.j.getTime());
        parcel.writeString(this.k);
    }

    public /* synthetic */ AccessToken(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, j jVar, Date date, Date date2, Date date3) {
        this(str, str2, str3, collection, collection2, collection3, jVar, date, date2, date3, Payload.SOURCE_FACEBOOK);
    }

    public AccessToken(Parcel parcel) {
        j jVar;
        this.a = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        unmodifiableSet.getClass();
        this.b = unmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set unmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        unmodifiableSet2.getClass();
        this.c = unmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set unmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        unmodifiableSet3.getClass();
        this.d = unmodifiableSet3;
        String readString = parcel.readString();
        com.facebook.internal.h.j(readString, "token");
        this.e = readString;
        String readString2 = parcel.readString();
        if (readString2 != null) {
            jVar = j.valueOf(readString2);
        } else {
            jVar = n;
        }
        this.f = jVar;
        this.g = new Date(parcel.readLong());
        String readString3 = parcel.readString();
        com.facebook.internal.h.j(readString3, "applicationId");
        this.h = readString3;
        String readString4 = parcel.readString();
        com.facebook.internal.h.j(readString4, "userId");
        this.i = readString4;
        this.j = new Date(parcel.readLong());
        this.k = parcel.readString();
    }
}
