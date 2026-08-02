package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.a70;
import defpackage.dmi;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/AuthenticationTokenHeader;", "Landroid/os/Parcelable;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AuthenticationTokenHeader implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AuthenticationTokenHeader> CREATOR = new a(3);
    public final String a;
    public final String b;
    public final String c;

    public AuthenticationTokenHeader(String str) {
        str.getClass();
        com.facebook.internal.h.h(str, "encodedHeaderString");
        byte[] decode = Base64.decode(str, 0);
        decode.getClass();
        Charset charset = Charsets.UTF_8;
        try {
            JSONObject jSONObject = new JSONObject(new String(decode, charset));
            String optString = jSONObject.optString("alg");
            optString.getClass();
            boolean z = optString.length() > 0 && optString.equals("RS256");
            String optString2 = jSONObject.optString("kid");
            optString2.getClass();
            boolean z2 = optString2.length() > 0;
            String optString3 = jSONObject.optString("typ");
            optString3.getClass();
            boolean z3 = optString3.length() > 0;
            if (z && z2 && z3) {
                byte[] decode2 = Base64.decode(str, 0);
                decode2.getClass();
                JSONObject jSONObject2 = new JSONObject(new String(decode2, charset));
                String string = jSONObject2.getString("alg");
                string.getClass();
                this.a = string;
                String string2 = jSONObject2.getString("typ");
                string2.getClass();
                this.b = string2;
                String string3 = jSONObject2.getString("kid");
                string3.getClass();
                this.c = string3;
                return;
            }
        } catch (JSONException unused) {
        }
        a70.p("Invalid Header");
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationTokenHeader)) {
            return false;
        }
        AuthenticationTokenHeader authenticationTokenHeader = (AuthenticationTokenHeader) obj;
        return Intrinsics.c(this.a, authenticationTokenHeader.a) && Intrinsics.c(this.b, authenticationTokenHeader.b) && Intrinsics.c(this.c, authenticationTokenHeader.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dmi.c(dmi.c(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.a), 31, this.b);
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.a);
        jSONObject.put("typ", this.b);
        jSONObject.put("kid", this.c);
        String jSONObject2 = jSONObject.toString();
        jSONObject2.getClass();
        return jSONObject2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public AuthenticationTokenHeader(Parcel parcel) {
        String readString = parcel.readString();
        com.facebook.internal.h.j(readString, "alg");
        this.a = readString;
        String readString2 = parcel.readString();
        com.facebook.internal.h.j(readString2, "typ");
        this.b = readString2;
        String readString3 = parcel.readString();
        com.facebook.internal.h.j(readString3, "kid");
        this.c = readString3;
    }
}
