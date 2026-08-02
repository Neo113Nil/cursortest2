package yg;

import java.io.Closeable;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: yg.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C10897a implements h, Closeable {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f106598a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final byte[] f106599b;

    public C10897a(@NotNull String contentType, @NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f106598a = contentType;
        this.f106599b = bytes;
    }

    @Override // yg.h
    @NotNull
    public final String c() {
        return this.f106598a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // yg.h
    public final long d() {
        return this.f106599b.length;
    }

    @NotNull
    public final byte[] j() {
        return this.f106599b;
    }

    @Override // yg.h
    public final void writeTo(@NotNull OutputStream stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        stream.write(this.f106599b);
    }
}
