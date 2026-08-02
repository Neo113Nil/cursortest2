package td0;

import We.L;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import retrofit2.Response;
import spay.sdk.api.ErrorCode;

/* loaded from: classes3.dex */
public final class j {
    @NotNull
    public static final String a(@NotNull L l11) {
        Intrinsics.checkNotNullParameter(l11, "<this>");
        String c11 = l11.r().c("x-o3-trace-id");
        return c11 == null ? ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE : c11;
    }

    public static final String b(@NotNull Throwable th2) {
        Response<?> response;
        L raw;
        Intrinsics.checkNotNullParameter(th2, "<this>");
        if (!(th2 instanceof HttpException) || (response = ((HttpException) th2).response()) == null || (raw = response.raw()) == null) {
            return null;
        }
        return a(raw);
    }
}
