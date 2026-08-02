package ue0;

import android.util.Log;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ue0.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C10047d implements InterfaceC10046c {
    @Override // ue0.InterfaceC10046c
    public final void a(@NotNull String tag, @NotNull String message, Throwable th2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Log.e(tag, message, th2);
    }

    @Override // ue0.InterfaceC10046c
    public final void b(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Log.d(tag, message);
    }

    @Override // ue0.InterfaceC10046c
    public final void c(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Log.i(tag, message);
    }

    @NotNull
    public final String toString() {
        return "Logger to logcat";
    }
}
