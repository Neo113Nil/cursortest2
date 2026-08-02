package ck0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.format.b;

/* renamed from: ck0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C5841a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final b f57209a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final b f57210b;

    static {
        b b11 = org.joda.time.format.a.b("yyyy-MM-dd HH:mm:ss Z");
        Intrinsics.checkNotNullExpressionValue(b11, "forPattern(...)");
        f57209a = b11;
        b b12 = org.joda.time.format.a.b("yyyy-MM-dd HH:mm:ss.SSS Z");
        Intrinsics.checkNotNullExpressionValue(b12, "forPattern(...)");
        f57210b = b12;
    }

    @NotNull
    public static b a() {
        return f57209a;
    }

    @NotNull
    public static b b() {
        return f57210b;
    }
}
