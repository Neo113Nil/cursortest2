package ld;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ld.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7921b extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7921b(@NotNull IllegalAccessException cause) {
        super("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", cause);
        Intrinsics.checkNotNullParameter(cause, "cause");
    }
}
