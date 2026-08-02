package Xj;

import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* loaded from: classes5.dex */
public abstract class h {
    public static final boolean a(Response response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        return response.code() == 404;
    }

    public static final boolean b(Response response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        return response.code() == 401;
    }
}
