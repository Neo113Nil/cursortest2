package bo.app;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ie {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.storage.o f25579a;

    public ie(Context context, String userId, String apiKey) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f25579a = new com.braze.storage.o(context, userId, apiKey);
    }
}
