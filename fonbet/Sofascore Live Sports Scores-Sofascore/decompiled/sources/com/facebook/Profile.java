package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/Profile;", "Landroid/os/Parcelable;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Profile implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Profile> CREATOR = new a(6);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Uri f;
    public final Uri g;

    public Profile(JSONObject jSONObject) {
        this.a = jSONObject.optString("id", null);
        this.b = jSONObject.optString("first_name", null);
        this.c = jSONObject.optString("middle_name", null);
        this.d = jSONObject.optString("last_name", null);
        this.e = jSONObject.optString("name", null);
        String optString = jSONObject.optString("link_uri", null);
        this.f = optString == null ? null : Uri.parse(optString);
        String optString2 = jSONObject.optString("picture_uri", null);
        this.g = optString2 != null ? Uri.parse(optString2) : null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        Uri uri2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        String str5 = this.a;
        return ((str5 == null && ((Profile) obj).a == null) || Intrinsics.c(str5, ((Profile) obj).a)) && (((str = this.b) == null && ((Profile) obj).b == null) || Intrinsics.c(str, ((Profile) obj).b)) && ((((str2 = this.c) == null && ((Profile) obj).c == null) || Intrinsics.c(str2, ((Profile) obj).c)) && ((((str3 = this.d) == null && ((Profile) obj).d == null) || Intrinsics.c(str3, ((Profile) obj).d)) && ((((str4 = this.e) == null && ((Profile) obj).e == null) || Intrinsics.c(str4, ((Profile) obj).e)) && ((((uri = this.f) == null && ((Profile) obj).f == null) || Intrinsics.c(uri, ((Profile) obj).f)) && (((uri2 = this.g) == null && ((Profile) obj).g == null) || Intrinsics.c(uri2, ((Profile) obj).g))))));
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0);
        String str2 = this.b;
        if (str2 != null) {
            hashCode = (hashCode * 31) + str2.hashCode();
        }
        String str3 = this.c;
        if (str3 != null) {
            hashCode = (hashCode * 31) + str3.hashCode();
        }
        String str4 = this.d;
        if (str4 != null) {
            hashCode = (hashCode * 31) + str4.hashCode();
        }
        String str5 = this.e;
        if (str5 != null) {
            hashCode = (hashCode * 31) + str5.hashCode();
        }
        Uri uri = this.f;
        if (uri != null) {
            hashCode = (hashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.g;
        if (uri2 != null) {
            return uri2.hashCode() + (hashCode * 31);
        }
        return hashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        Uri uri = this.f;
        parcel.writeString(uri != null ? uri.toString() : null);
        Uri uri2 = this.g;
        parcel.writeString(uri2 != null ? uri2.toString() : null);
    }

    public Profile(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2) {
        com.facebook.internal.h.j(str, "id");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = uri;
        this.g = uri2;
    }

    public Profile(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        String readString = parcel.readString();
        this.f = readString == null ? null : Uri.parse(readString);
        String readString2 = parcel.readString();
        this.g = readString2 != null ? Uri.parse(readString2) : null;
    }
}
