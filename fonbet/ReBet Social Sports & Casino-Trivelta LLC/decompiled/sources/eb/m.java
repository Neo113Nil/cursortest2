package eb;

import K9.r;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.C3193q;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f45887a;

    /* renamed from: b, reason: collision with root package name */
    public final String f45888b;

    /* renamed from: c, reason: collision with root package name */
    public final String f45889c;

    /* renamed from: d, reason: collision with root package name */
    public final String f45890d;

    /* renamed from: e, reason: collision with root package name */
    public final String f45891e;

    /* renamed from: f, reason: collision with root package name */
    public final String f45892f;

    /* renamed from: g, reason: collision with root package name */
    public final String f45893g;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public String f45894a;

        /* renamed from: b, reason: collision with root package name */
        public String f45895b;

        /* renamed from: c, reason: collision with root package name */
        public String f45896c;

        /* renamed from: d, reason: collision with root package name */
        public String f45897d;

        /* renamed from: e, reason: collision with root package name */
        public String f45898e;

        /* renamed from: f, reason: collision with root package name */
        public String f45899f;

        /* renamed from: g, reason: collision with root package name */
        public String f45900g;

        public m a() {
            return new m(this.f45895b, this.f45894a, this.f45896c, this.f45897d, this.f45898e, this.f45899f, this.f45900g);
        }

        public b b(String str) {
            this.f45894a = AbstractC3191o.h(str, "ApiKey must be set.");
            return this;
        }

        public b c(String str) {
            this.f45895b = AbstractC3191o.h(str, "ApplicationId must be set.");
            return this;
        }

        public b d(String str) {
            this.f45896c = str;
            return this;
        }

        public b e(String str) {
            this.f45897d = str;
            return this;
        }

        public b f(String str) {
            this.f45898e = str;
            return this;
        }

        public b g(String str) {
            this.f45900g = str;
            return this;
        }

        public b h(String str) {
            this.f45899f = str;
            return this;
        }
    }

    public static m a(Context context) {
        C3193q c3193q = new C3193q(context);
        String a10 = c3193q.a("google_app_id");
        if (TextUtils.isEmpty(a10)) {
            return null;
        }
        return new m(a10, c3193q.a("google_api_key"), c3193q.a("firebase_database_url"), c3193q.a("ga_trackingId"), c3193q.a("gcm_defaultSenderId"), c3193q.a("google_storage_bucket"), c3193q.a("project_id"));
    }

    public String b() {
        return this.f45887a;
    }

    public String c() {
        return this.f45888b;
    }

    public String d() {
        return this.f45889c;
    }

    public String e() {
        return this.f45890d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return AbstractC3189m.b(this.f45888b, mVar.f45888b) && AbstractC3189m.b(this.f45887a, mVar.f45887a) && AbstractC3189m.b(this.f45889c, mVar.f45889c) && AbstractC3189m.b(this.f45890d, mVar.f45890d) && AbstractC3189m.b(this.f45891e, mVar.f45891e) && AbstractC3189m.b(this.f45892f, mVar.f45892f) && AbstractC3189m.b(this.f45893g, mVar.f45893g);
    }

    public String f() {
        return this.f45891e;
    }

    public String g() {
        return this.f45893g;
    }

    public String h() {
        return this.f45892f;
    }

    public int hashCode() {
        return AbstractC3189m.c(this.f45888b, this.f45887a, this.f45889c, this.f45890d, this.f45891e, this.f45892f, this.f45893g);
    }

    public String toString() {
        return AbstractC3189m.d(this).a("applicationId", this.f45888b).a("apiKey", this.f45887a).a("databaseUrl", this.f45889c).a("gcmSenderId", this.f45891e).a("storageBucket", this.f45892f).a("projectId", this.f45893g).toString();
    }

    public m(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC3191o.q(!r.b(str), "ApplicationId must be set.");
        this.f45888b = str;
        this.f45887a = str2;
        this.f45889c = str3;
        this.f45890d = str4;
        this.f45891e = str5;
        this.f45892f = str6;
        this.f45893g = str7;
    }
}
