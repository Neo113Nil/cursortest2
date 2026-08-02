package k8;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final String f71081a;

    /* renamed from: b, reason: collision with root package name */
    private final String f71082b;

    /* renamed from: c, reason: collision with root package name */
    private final String f71083c;

    /* renamed from: d, reason: collision with root package name */
    private final String f71084d;

    /* renamed from: e, reason: collision with root package name */
    private final String f71085e;

    /* renamed from: f, reason: collision with root package name */
    private final String f71086f;

    /* renamed from: g, reason: collision with root package name */
    private final String f71087g;

    private f(@NonNull String str, @NonNull String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f71082b = str;
        this.f71081a = str2;
        this.f71083c = str3;
        this.f71084d = str4;
        this.f71085e = str5;
        this.f71086f = str6;
        this.f71087g = str7;
    }

    public static f a(@NonNull Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new f(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    @NonNull
    public final String b() {
        return this.f71081a;
    }

    @NonNull
    public final String c() {
        return this.f71082b;
    }

    public final String d() {
        return this.f71085e;
    }

    public final String e() {
        return this.f71087g;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Objects.equal(this.f71082b, fVar.f71082b) && Objects.equal(this.f71081a, fVar.f71081a) && Objects.equal(this.f71083c, fVar.f71083c) && Objects.equal(this.f71084d, fVar.f71084d) && Objects.equal(this.f71085e, fVar.f71085e) && Objects.equal(this.f71086f, fVar.f71086f) && Objects.equal(this.f71087g, fVar.f71087g);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f71082b, this.f71081a, this.f71083c, this.f71084d, this.f71085e, this.f71086f, this.f71087g);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.f71082b).add("apiKey", this.f71081a).add("databaseUrl", this.f71083c).add("gcmSenderId", this.f71085e).add("storageBucket", this.f71086f).add("projectId", this.f71087g).toString();
    }
}
