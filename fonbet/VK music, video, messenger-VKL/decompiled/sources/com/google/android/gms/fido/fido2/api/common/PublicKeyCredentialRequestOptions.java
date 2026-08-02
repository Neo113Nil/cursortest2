package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.fido.zzia;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.azz0;
import xsna.dq70;
import xsna.exc0;
import xsna.k46;
import xsna.mq;
import xsna.n6j;
import xsna.ozg0;
import xsna.t33;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes12.dex */
public class PublicKeyCredentialRequestOptions extends RequestOptions {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialRequestOptions> CREATOR = new azz0();

    @NonNull
    public final byte[] b;

    @Nullable
    public final Double c;

    @NonNull
    public final String d;

    @Nullable
    public final List e;

    @Nullable
    public final Integer f;

    @Nullable
    public final TokenBinding g;

    @Nullable
    public final UserVerificationRequirement h;

    @Nullable
    public final AuthenticationExtensions i;

    @Nullable
    public final Long j;

    @Nullable
    public final ResultReceiver k;

    /* JADX WARN: Removed duplicated region for block: B:12:0x007a A[Catch: zzbc -> 0x0054, JSONException -> 0x0057, TryCatch #3 {zzbc -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:10:0x006b, B:12:0x007a, B:14:0x008d, B:15:0x0093, B:17:0x0099, B:20:0x00ac, B:22:0x00b2, B:23:0x00bf, B:25:0x00c5, B:27:0x00d7, B:28:0x00dd, B:29:0x00e5, B:31:0x00eb, B:32:0x00f5, B:34:0x00fb, B:36:0x0117, B:38:0x011d, B:39:0x012a, B:42:0x0136, B:47:0x0131, B:49:0x0106, B:51:0x010c, B:58:0x007f, B:60:0x0085, B:62:0x005a, B:64:0x0060), top: B:5:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008d A[Catch: zzbc -> 0x0054, JSONException -> 0x0057, TryCatch #3 {zzbc -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:10:0x006b, B:12:0x007a, B:14:0x008d, B:15:0x0093, B:17:0x0099, B:20:0x00ac, B:22:0x00b2, B:23:0x00bf, B:25:0x00c5, B:27:0x00d7, B:28:0x00dd, B:29:0x00e5, B:31:0x00eb, B:32:0x00f5, B:34:0x00fb, B:36:0x0117, B:38:0x011d, B:39:0x012a, B:42:0x0136, B:47:0x0131, B:49:0x0106, B:51:0x010c, B:58:0x007f, B:60:0x0085, B:62:0x005a, B:64:0x0060), top: B:5:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2 A[Catch: zzbc -> 0x0054, JSONException -> 0x0057, TryCatch #3 {zzbc -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:10:0x006b, B:12:0x007a, B:14:0x008d, B:15:0x0093, B:17:0x0099, B:20:0x00ac, B:22:0x00b2, B:23:0x00bf, B:25:0x00c5, B:27:0x00d7, B:28:0x00dd, B:29:0x00e5, B:31:0x00eb, B:32:0x00f5, B:34:0x00fb, B:36:0x0117, B:38:0x011d, B:39:0x012a, B:42:0x0136, B:47:0x0131, B:49:0x0106, B:51:0x010c, B:58:0x007f, B:60:0x0085, B:62:0x005a, B:64:0x0060), top: B:5:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c5 A[Catch: zzbc -> 0x0054, JSONException -> 0x0057, TryCatch #3 {zzbc -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:10:0x006b, B:12:0x007a, B:14:0x008d, B:15:0x0093, B:17:0x0099, B:20:0x00ac, B:22:0x00b2, B:23:0x00bf, B:25:0x00c5, B:27:0x00d7, B:28:0x00dd, B:29:0x00e5, B:31:0x00eb, B:32:0x00f5, B:34:0x00fb, B:36:0x0117, B:38:0x011d, B:39:0x012a, B:42:0x0136, B:47:0x0131, B:49:0x0106, B:51:0x010c, B:58:0x007f, B:60:0x0085, B:62:0x005a, B:64:0x0060), top: B:5:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00eb A[Catch: zzbc -> 0x0054, JSONException -> 0x0057, TryCatch #3 {zzbc -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:10:0x006b, B:12:0x007a, B:14:0x008d, B:15:0x0093, B:17:0x0099, B:20:0x00ac, B:22:0x00b2, B:23:0x00bf, B:25:0x00c5, B:27:0x00d7, B:28:0x00dd, B:29:0x00e5, B:31:0x00eb, B:32:0x00f5, B:34:0x00fb, B:36:0x0117, B:38:0x011d, B:39:0x012a, B:42:0x0136, B:47:0x0131, B:49:0x0106, B:51:0x010c, B:58:0x007f, B:60:0x0085, B:62:0x005a, B:64:0x0060), top: B:5:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fb A[Catch: zzbc -> 0x0054, JSONException -> 0x0057, TryCatch #3 {zzbc -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:10:0x006b, B:12:0x007a, B:14:0x008d, B:15:0x0093, B:17:0x0099, B:20:0x00ac, B:22:0x00b2, B:23:0x00bf, B:25:0x00c5, B:27:0x00d7, B:28:0x00dd, B:29:0x00e5, B:31:0x00eb, B:32:0x00f5, B:34:0x00fb, B:36:0x0117, B:38:0x011d, B:39:0x012a, B:42:0x0136, B:47:0x0131, B:49:0x0106, B:51:0x010c, B:58:0x007f, B:60:0x0085, B:62:0x005a, B:64:0x0060), top: B:5:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011d A[Catch: zzbc -> 0x0054, JSONException -> 0x0057, TryCatch #3 {zzbc -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:10:0x006b, B:12:0x007a, B:14:0x008d, B:15:0x0093, B:17:0x0099, B:20:0x00ac, B:22:0x00b2, B:23:0x00bf, B:25:0x00c5, B:27:0x00d7, B:28:0x00dd, B:29:0x00e5, B:31:0x00eb, B:32:0x00f5, B:34:0x00fb, B:36:0x0117, B:38:0x011d, B:39:0x012a, B:42:0x0136, B:47:0x0131, B:49:0x0106, B:51:0x010c, B:58:0x007f, B:60:0x0085, B:62:0x005a, B:64:0x0060), top: B:5:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0131 A[Catch: zzbc -> 0x0054, JSONException -> 0x0057, TryCatch #3 {zzbc -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:10:0x006b, B:12:0x007a, B:14:0x008d, B:15:0x0093, B:17:0x0099, B:20:0x00ac, B:22:0x00b2, B:23:0x00bf, B:25:0x00c5, B:27:0x00d7, B:28:0x00dd, B:29:0x00e5, B:31:0x00eb, B:32:0x00f5, B:34:0x00fb, B:36:0x0117, B:38:0x011d, B:39:0x012a, B:42:0x0136, B:47:0x0131, B:49:0x0106, B:51:0x010c, B:58:0x007f, B:60:0x0085, B:62:0x005a, B:64:0x0060), top: B:5:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0106 A[Catch: zzbc -> 0x0054, JSONException -> 0x0057, TryCatch #3 {zzbc -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:10:0x006b, B:12:0x007a, B:14:0x008d, B:15:0x0093, B:17:0x0099, B:20:0x00ac, B:22:0x00b2, B:23:0x00bf, B:25:0x00c5, B:27:0x00d7, B:28:0x00dd, B:29:0x00e5, B:31:0x00eb, B:32:0x00f5, B:34:0x00fb, B:36:0x0117, B:38:0x011d, B:39:0x012a, B:42:0x0136, B:47:0x0131, B:49:0x0106, B:51:0x010c, B:58:0x007f, B:60:0x0085, B:62:0x005a, B:64:0x0060), top: B:5:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x007f A[Catch: zzbc -> 0x0054, JSONException -> 0x0057, TryCatch #3 {zzbc -> 0x0054, JSONException -> 0x0057, blocks: (B:6:0x002a, B:8:0x0042, B:10:0x006b, B:12:0x007a, B:14:0x008d, B:15:0x0093, B:17:0x0099, B:20:0x00ac, B:22:0x00b2, B:23:0x00bf, B:25:0x00c5, B:27:0x00d7, B:28:0x00dd, B:29:0x00e5, B:31:0x00eb, B:32:0x00f5, B:34:0x00fb, B:36:0x0117, B:38:0x011d, B:39:0x012a, B:42:0x0136, B:47:0x0131, B:49:0x0106, B:51:0x010c, B:58:0x007f, B:60:0x0085, B:62:0x005a, B:64:0x0060), top: B:5:0x002a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PublicKeyCredentialRequestOptions(@NonNull byte[] bArr, @Nullable Double d, @NonNull String str, @Nullable ArrayList arrayList, @Nullable Integer num, @Nullable TokenBinding tokenBinding, @Nullable String str2, @Nullable AuthenticationExtensions authenticationExtensions, @Nullable Long l, @Nullable String str3, @Nullable ResultReceiver resultReceiver) {
        Double d2;
        Double valueOf;
        JSONArray jSONArray;
        ArrayList arrayList2;
        TokenBinding tokenBinding2;
        AuthenticationExtensions authenticationExtensions2;
        AuthenticationExtensions b;
        this.k = resultReceiver;
        if (str3 == null || !zzia.zzc()) {
            exc0.i(bArr);
            this.b = bArr;
            this.c = d;
            exc0.i(str);
            this.d = str;
            this.e = arrayList;
            this.f = num;
            this.g = tokenBinding;
            this.j = l;
            if (str2 != null) {
                try {
                    this.h = UserVerificationRequirement.a(str2);
                } catch (zzbc e) {
                    throw new IllegalArgumentException(e);
                }
            } else {
                this.h = null;
            }
            this.i = authenticationExtensions;
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str3);
            byte[] b2 = k46.b(jSONObject.getString("challenge"));
            exc0.i(b2);
            if (jSONObject.has("timeout")) {
                valueOf = Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d);
            } else {
                if (!jSONObject.has("timeoutSeconds")) {
                    d2 = null;
                    String string = jSONObject.getString("rpId");
                    exc0.i(string);
                    jSONArray = !jSONObject.has("allowList") ? jSONObject.getJSONArray("allowList") : jSONObject.has("allowCredentials") ? jSONObject.getJSONArray("allowCredentials") : null;
                    if (jSONArray == null) {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i = 0; i < jSONArray.length(); i++) {
                            arrayList3.add(PublicKeyCredentialDescriptor.b(jSONArray.getJSONObject(i)));
                        }
                        arrayList2 = arrayList3;
                    } else {
                        arrayList2 = null;
                    }
                    Integer valueOf2 = !jSONObject.has("requestId") ? Integer.valueOf(jSONObject.getInt("requestId")) : null;
                    if (jSONObject.has("tokenBinding")) {
                        tokenBinding2 = null;
                    } else {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("tokenBinding");
                        tokenBinding2 = new TokenBinding(jSONObject2.getString("status"), jSONObject2.has("id") ? jSONObject2.getString("id") : null);
                    }
                    UserVerificationRequirement a = !jSONObject.has("userVerification") ? UserVerificationRequirement.a(jSONObject.getString("userVerification")) : null;
                    if (!jSONObject.has("authenticationExtensions")) {
                        b = AuthenticationExtensions.b(jSONObject.getJSONObject("authenticationExtensions"));
                    } else {
                        if (!jSONObject.has("extensions")) {
                            authenticationExtensions2 = null;
                            PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = new PublicKeyCredentialRequestOptions(b2, d2, string, arrayList2, valueOf2, tokenBinding2, a != null ? a.toString() : null, authenticationExtensions2, jSONObject.has("longRequestId") ? Long.valueOf(jSONObject.getLong("longRequestId")) : null, null, null);
                            this.b = publicKeyCredentialRequestOptions.b;
                            this.c = publicKeyCredentialRequestOptions.c;
                            this.d = publicKeyCredentialRequestOptions.d;
                            this.e = publicKeyCredentialRequestOptions.e;
                            this.f = publicKeyCredentialRequestOptions.f;
                            this.g = publicKeyCredentialRequestOptions.g;
                            this.h = publicKeyCredentialRequestOptions.h;
                            this.i = publicKeyCredentialRequestOptions.i;
                            this.j = publicKeyCredentialRequestOptions.j;
                        }
                        b = AuthenticationExtensions.b(jSONObject.getJSONObject("extensions"));
                    }
                    authenticationExtensions2 = b;
                    PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions2 = new PublicKeyCredentialRequestOptions(b2, d2, string, arrayList2, valueOf2, tokenBinding2, a != null ? a.toString() : null, authenticationExtensions2, jSONObject.has("longRequestId") ? Long.valueOf(jSONObject.getLong("longRequestId")) : null, null, null);
                    this.b = publicKeyCredentialRequestOptions2.b;
                    this.c = publicKeyCredentialRequestOptions2.c;
                    this.d = publicKeyCredentialRequestOptions2.d;
                    this.e = publicKeyCredentialRequestOptions2.e;
                    this.f = publicKeyCredentialRequestOptions2.f;
                    this.g = publicKeyCredentialRequestOptions2.g;
                    this.h = publicKeyCredentialRequestOptions2.h;
                    this.i = publicKeyCredentialRequestOptions2.i;
                    this.j = publicKeyCredentialRequestOptions2.j;
                }
                valueOf = Double.valueOf(jSONObject.getDouble("timeoutSeconds"));
            }
            d2 = valueOf;
            String string2 = jSONObject.getString("rpId");
            exc0.i(string2);
            if (!jSONObject.has("allowList")) {
            }
            if (jSONArray == null) {
            }
            if (!jSONObject.has("requestId")) {
            }
            if (jSONObject.has("tokenBinding")) {
            }
            if (!jSONObject.has("userVerification")) {
            }
            if (!jSONObject.has("authenticationExtensions")) {
            }
            authenticationExtensions2 = b;
            PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions22 = new PublicKeyCredentialRequestOptions(b2, d2, string2, arrayList2, valueOf2, tokenBinding2, a != null ? a.toString() : null, authenticationExtensions2, jSONObject.has("longRequestId") ? Long.valueOf(jSONObject.getLong("longRequestId")) : null, null, null);
            this.b = publicKeyCredentialRequestOptions22.b;
            this.c = publicKeyCredentialRequestOptions22.c;
            this.d = publicKeyCredentialRequestOptions22.d;
            this.e = publicKeyCredentialRequestOptions22.e;
            this.f = publicKeyCredentialRequestOptions22.f;
            this.g = publicKeyCredentialRequestOptions22.g;
            this.h = publicKeyCredentialRequestOptions22.h;
            this.i = publicKeyCredentialRequestOptions22.i;
            this.j = publicKeyCredentialRequestOptions22.j;
        } catch (zzbc e2) {
            e = e2;
            throw new IllegalArgumentException(e);
        } catch (JSONException e3) {
            e = e3;
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(@NonNull Object obj) {
        List list;
        if (!(obj instanceof PublicKeyCredentialRequestOptions)) {
            return false;
        }
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) obj;
        byte[] bArr = publicKeyCredentialRequestOptions.b;
        List list2 = publicKeyCredentialRequestOptions.e;
        return Arrays.equals(this.b, bArr) && dq70.b(this.c, publicKeyCredentialRequestOptions.c) && dq70.b(this.d, publicKeyCredentialRequestOptions.d) && (((list = this.e) == null && list2 == null) || (list != null && list2 != null && list.containsAll(list2) && list2.containsAll(list))) && dq70.b(this.f, publicKeyCredentialRequestOptions.f) && dq70.b(this.g, publicKeyCredentialRequestOptions.g) && dq70.b(this.h, publicKeyCredentialRequestOptions.h) && dq70.b(this.i, publicKeyCredentialRequestOptions.i) && dq70.b(this.j, publicKeyCredentialRequestOptions.j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.b)), this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j});
    }

    @NonNull
    public final String toString() {
        String c = k46.c(this.b);
        String valueOf = String.valueOf(this.e);
        String valueOf2 = String.valueOf(this.g);
        String valueOf3 = String.valueOf(this.h);
        String valueOf4 = String.valueOf(this.i);
        StringBuilder a = t33.a("PublicKeyCredentialRequestOptions{\n challenge=", c, ", \n timeoutSeconds=");
        a.append(this.c);
        a.append(", \n rpId='");
        n6j.b(a, this.d, "', \n allowList=", valueOf, ", \n requestId=");
        mq.b(this.f, ", \n tokenBinding=", valueOf2, ", \n userVerification=", a);
        n6j.b(a, valueOf3, ", \n authenticationExtensions=", valueOf4, ", \n longRequestId=");
        a.append(this.j);
        a.append("}");
        return a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.e(parcel, 2, this.b, false);
        ozg0.f(parcel, 3, this.c);
        ozg0.q(parcel, 4, this.d, false);
        ozg0.u(parcel, 5, this.e, false);
        ozg0.k(parcel, 6, this.f);
        ozg0.p(parcel, 7, this.g, i, false);
        UserVerificationRequirement userVerificationRequirement = this.h;
        ozg0.q(parcel, 8, userVerificationRequirement == null ? null : userVerificationRequirement.toString(), false);
        ozg0.p(parcel, 9, this.i, i, false);
        ozg0.o(parcel, 10, this.j);
        ozg0.p(parcel, 12, this.k, i, false);
        ozg0.x(w, parcel);
    }
}
