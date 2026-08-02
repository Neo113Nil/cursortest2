package Wj;

import Wj.j;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* loaded from: classes5.dex */
public final class g {
    public final j a(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.isSuccessful()) {
            Object body = response.body();
            Intrinsics.checkNotNull(body);
            android.support.v4.media.session.b.a(body);
            return b(null);
        }
        if (Xj.h.a(response)) {
            return j.a.C0275a.f13343a;
        }
        if (Xj.h.b(response)) {
            Tj.a.a("Access token retrieval failed due to not authorised");
            return j.a.b.f13344a;
        }
        Tj.a.a("Access token retrieval failed with " + response.raw());
        Tj.a.a("Access token retrieval failed due to " + response.message());
        return j.a.b.f13344a;
    }

    public final j.b b(f fVar) {
        throw null;
    }
}
