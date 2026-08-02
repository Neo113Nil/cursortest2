package yg;

import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class i implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final int f106614a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f106615b;

    /* renamed from: c, reason: collision with root package name */
    private final C10897a f106616c;

    public i(int i11, @NotNull String message, C10897a c10897a) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f106614a = i11;
        this.f106615b = message;
        this.f106616c = c10897a;
    }

    public final C10897a c() {
        return this.f106616c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @NotNull
    public final String d() {
        return this.f106615b;
    }

    public final int j() {
        return this.f106614a;
    }
}
