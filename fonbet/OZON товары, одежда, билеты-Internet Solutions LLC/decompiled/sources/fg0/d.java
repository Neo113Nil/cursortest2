package fg0;

import We.L;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* loaded from: classes7.dex */
public final class d {
    public static final Response a(Response response) {
        L raw = response.raw();
        if (!response.isSuccessful()) {
            Response error = Response.error(response.errorBody(), raw);
            Intrinsics.checkNotNullExpressionValue(error, "error(...)");
            return error;
        }
        uf0.b bVar = (uf0.b) raw.L().i(uf0.b.class);
        if (bVar == null) {
            throw new IllegalStateException("RequestMetrics tag не найден");
        }
        Response success = Response.success(new c(response, raw, bVar));
        Intrinsics.checkNotNullExpressionValue(success, "success(...)");
        return success;
    }
}
