package yb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: yb.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C10878a extends Exception {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f106456a;

    /* renamed from: b, reason: collision with root package name */
    private final int f106457b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10878a(@NotNull String message, int i11) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        this.f106456a = message;
        this.f106457b = i11;
    }

    public final int a() {
        return this.f106457b;
    }

    @Override // java.lang.Throwable
    @NotNull
    public final String getMessage() {
        return this.f106456a;
    }
}
