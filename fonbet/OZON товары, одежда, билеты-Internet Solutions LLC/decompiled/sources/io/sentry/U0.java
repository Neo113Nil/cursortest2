package io.sentry;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
final class U0 implements InterfaceC7126b0 {

    /* renamed from: a, reason: collision with root package name */
    private static final U0 f66744a = new U0();

    public static U0 f() {
        return f66744a;
    }

    @Override // io.sentry.InterfaceC7126b0
    public final void a(@NotNull Writer writer, @NotNull Object obj) throws IOException {
    }

    @Override // io.sentry.InterfaceC7126b0
    public final void b(@NotNull V1 v12, @NotNull OutputStream outputStream) throws Exception {
    }

    @Override // io.sentry.InterfaceC7126b0
    public final <T> T c(@NotNull Reader reader, @NotNull Class<T> cls) {
        return null;
    }

    @Override // io.sentry.InterfaceC7126b0
    public final V1 d(@NotNull BufferedInputStream bufferedInputStream) {
        return null;
    }

    @Override // io.sentry.InterfaceC7126b0
    @NotNull
    public final String e(@NotNull Map<String, Object> map) throws Exception {
        return "";
    }
}
