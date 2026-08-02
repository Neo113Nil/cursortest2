package h0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.GestureDetector;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: h0.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6765b {
    @SuppressLint({"ExecutorRegistration"})
    public C6765b(@NotNull Context context, @NotNull TY.a listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        ViewConfiguration.get(context).getScaledTouchSlop();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        new GestureDetector(context, new C6764a(this));
    }
}
