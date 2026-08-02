package io.sentry;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC7126b0 {
    void a(@NotNull Writer writer, @NotNull Object obj) throws IOException;

    void b(@NotNull V1 v12, @NotNull OutputStream outputStream) throws Exception;

    <T> T c(@NotNull Reader reader, @NotNull Class<T> cls);

    V1 d(@NotNull BufferedInputStream bufferedInputStream);

    @NotNull
    String e(@NotNull Map<String, Object> map) throws Exception;
}
