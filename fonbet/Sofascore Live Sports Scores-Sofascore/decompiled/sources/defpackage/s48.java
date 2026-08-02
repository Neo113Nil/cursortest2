package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;
import com.unity3d.ads.core.data.datasource.AndroidGoogleAppIdDataSource;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class s48 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public s48(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Preconditions.k("ApplicationId must be set.", !Strings.a(str));
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
    }

    public static s48 a(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String a = stringResourceValueReader.a(AndroidGoogleAppIdDataSource.GOOGLE_APP_ID_RESOURCE_NAME);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return new s48(a, stringResourceValueReader.a("google_api_key"), stringResourceValueReader.a("firebase_database_url"), stringResourceValueReader.a("ga_trackingId"), stringResourceValueReader.a("gcm_defaultSenderId"), stringResourceValueReader.a("google_storage_bucket"), stringResourceValueReader.a("recaptcha_site_key"), stringResourceValueReader.a("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s48)) {
            return false;
        }
        s48 s48Var = (s48) obj;
        return Objects.a(this.b, s48Var.b) && Objects.a(this.a, s48Var.a) && Objects.a(this.c, s48Var.c) && Objects.a(this.d, s48Var.d) && Objects.a(this.e, s48Var.e) && Objects.a(this.f, s48Var.f) && Objects.a(this.g, s48Var.g) && Objects.a(this.h, s48Var.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g, this.h});
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
        toStringHelper.a(this.b, "applicationId");
        toStringHelper.a(this.a, "apiKey");
        toStringHelper.a(this.c, "databaseUrl");
        toStringHelper.a(this.e, "gcmSenderId");
        toStringHelper.a(this.f, "storageBucket");
        toStringHelper.a(this.g, "recaptchaSiteKey");
        toStringHelper.a(this.h, "projectId");
        return toStringHelper.toString();
    }
}
