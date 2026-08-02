package Vj;

import Dj.e;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* loaded from: classes5.dex */
public final class f {
    public final Dj.e a(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.isSuccessful()) {
            Object body = response.body();
            Intrinsics.checkNotNull(body);
            android.support.v4.media.session.b.a(body);
            return b(null);
        }
        if (Xj.h.a(response)) {
            return e.a.C0060a.f2826a;
        }
        Tj.a.a("LineStatus failed due to " + response.message());
        return e.a.b.f2827a;
    }

    public final e.b b(e eVar) {
        throw null;
    }
}
