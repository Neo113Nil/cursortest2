package sh0;

import android.util.Log;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: sh0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C9697a {
    public final void a(@NotNull String message, Throwable th2) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.d("OzonPushSdkLogger", message, th2);
    }
}
