package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import defpackage.a70;
import defpackage.dmi;
import defpackage.q5a;
import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/AuthenticationToken;", "Landroid/os/Parcelable;", "com/facebook/appevents/j", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AuthenticationToken implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AuthenticationToken> CREATOR = new a(1);
    public final String a;
    public final String b;
    public final AuthenticationTokenHeader c;
    public final AuthenticationTokenClaims d;
    public final String e;

    public AuthenticationToken(String str, String str2) {
        List split$default;
        str2.getClass();
        com.facebook.internal.h.h(str, "token");
        com.facebook.internal.h.h(str2, "expectedNonce");
        boolean z = false;
        split$default = StringsKt__StringsKt.split$default(str, new String[]{"."}, false, 0, 6, null);
        if (split$default.size() != 3) {
            a70.p("Invalid IdToken string");
            throw null;
        }
        String str3 = (String) split$default.get(0);
        String str4 = (String) split$default.get(1);
        String str5 = (String) split$default.get(2);
        this.a = str;
        this.b = str2;
        AuthenticationTokenHeader authenticationTokenHeader = new AuthenticationTokenHeader(str3);
        this.c = authenticationTokenHeader;
        this.d = new AuthenticationTokenClaims(str4, str2);
        try {
            String F = q5a.F(authenticationTokenHeader.c);
            if (F != null) {
                z = q5a.P(q5a.E(F), str3 + '.' + str4, str5);
            }
        } catch (IOException | InvalidKeySpecException unused) {
        }
        if (z) {
            this.e = str5;
        } else {
            a70.p("Invalid Signature");
            throw null;
        }
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token_string", this.a);
        jSONObject.put("expected_nonce", this.b);
        AuthenticationTokenHeader authenticationTokenHeader = this.c;
        authenticationTokenHeader.getClass();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("alg", authenticationTokenHeader.a);
        jSONObject2.put("typ", authenticationTokenHeader.b);
        jSONObject2.put("kid", authenticationTokenHeader.c);
        jSONObject.put("header", jSONObject2);
        jSONObject.put("claims", this.d.a());
        jSONObject.put(InAppPurchaseMetaData.KEY_SIGNATURE, this.e);
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
        if (!(obj instanceof AuthenticationToken)) {
            return false;
        }
        AuthenticationToken authenticationToken = (AuthenticationToken) obj;
        return Intrinsics.c(this.a, authenticationToken.a) && Intrinsics.c(this.b, authenticationToken.b) && Intrinsics.c(this.c, authenticationToken.c) && Intrinsics.c(this.d, authenticationToken.d) && Intrinsics.c(this.e, authenticationToken.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + dmi.c(dmi.c(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.a), 31, this.b)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
    }

    public AuthenticationToken(Parcel parcel) {
        String readString = parcel.readString();
        com.facebook.internal.h.j(readString, "token");
        this.a = readString;
        String readString2 = parcel.readString();
        com.facebook.internal.h.j(readString2, "expectedNonce");
        this.b = readString2;
        Parcelable readParcelable = parcel.readParcelable(AuthenticationTokenHeader.class.getClassLoader());
        if (readParcelable != null) {
            this.c = (AuthenticationTokenHeader) readParcelable;
            Parcelable readParcelable2 = parcel.readParcelable(AuthenticationTokenClaims.class.getClassLoader());
            if (readParcelable2 != null) {
                this.d = (AuthenticationTokenClaims) readParcelable2;
                String readString3 = parcel.readString();
                com.facebook.internal.h.j(readString3, InAppPurchaseMetaData.KEY_SIGNATURE);
                this.e = readString3;
                return;
            }
            a70.r("Required value was null.");
            throw null;
        }
        a70.r("Required value was null.");
        throw null;
    }
}
