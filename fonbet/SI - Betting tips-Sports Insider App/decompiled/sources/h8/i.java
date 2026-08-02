package h8;

import android.content.Context;
import android.text.TextUtils;
import g6.v;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f10415a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10416b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10417c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10418d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10419e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10420f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10421g;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i5 = q6.e.f22050a;
        v.j("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f10416b = str;
        this.f10415a = str2;
        this.f10417c = str3;
        this.f10418d = str4;
        this.f10419e = str5;
        this.f10420f = str6;
        this.f10421g = str7;
    }

    public static i a(Context context) {
        x5.h hVar = new x5.h(context, 7);
        String g10 = hVar.g("google_app_id");
        if (TextUtils.isEmpty(g10)) {
            return null;
        }
        return new i(g10, hVar.g("google_api_key"), hVar.g("firebase_database_url"), hVar.g("ga_trackingId"), hVar.g("gcm_defaultSenderId"), hVar.g("google_storage_bucket"), hVar.g("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return v.k(this.f10416b, iVar.f10416b) && v.k(this.f10415a, iVar.f10415a) && v.k(this.f10417c, iVar.f10417c) && v.k(this.f10418d, iVar.f10418d) && v.k(this.f10419e, iVar.f10419e) && v.k(this.f10420f, iVar.f10420f) && v.k(this.f10421g, iVar.f10421g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10416b, this.f10415a, this.f10417c, this.f10418d, this.f10419e, this.f10420f, this.f10421g});
    }

    public final String toString() {
        l1.a aVar = new l1.a(this);
        aVar.i(this.f10416b, "applicationId");
        aVar.i(this.f10415a, "apiKey");
        aVar.i(this.f10417c, "databaseUrl");
        aVar.i(this.f10419e, "gcmSenderId");
        aVar.i(this.f10420f, "storageBucket");
        aVar.i(this.f10421g, "projectId");
        return aVar.toString();
    }
}
