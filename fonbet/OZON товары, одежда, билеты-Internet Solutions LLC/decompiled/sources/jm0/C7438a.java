package jm0;

import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: jm0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7438a extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7438a(@NotNull String message, @NotNull Throwable... cause) {
        super(message, (Throwable) C7705l.F(cause));
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(cause, "cause");
    }
}
