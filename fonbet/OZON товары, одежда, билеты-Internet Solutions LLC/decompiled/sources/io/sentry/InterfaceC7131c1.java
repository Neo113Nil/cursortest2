package io.sentry;

import java.io.Closeable;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC7131c1 extends Closeable {
    Float A0() throws IOException;

    Integer A1() throws IOException;

    Long D1() throws IOException;

    HashMap G1(@NotNull ILogger iLogger, @NotNull InterfaceC7174n0 interfaceC7174n0) throws IOException;

    ArrayList J0(@NotNull ILogger iLogger, @NotNull InterfaceC7174n0 interfaceC7174n0) throws IOException;

    Date M(ILogger iLogger) throws IOException;

    Boolean P() throws IOException;

    void Q0(ILogger iLogger, AbstractMap abstractMap, String str);

    <T> T S(@NotNull ILogger iLogger, @NotNull InterfaceC7174n0<T> interfaceC7174n0) throws Exception;

    Object U1() throws IOException;

    TimeZone X0(ILogger iLogger) throws IOException;

    void beginArray() throws IOException;

    void beginObject() throws IOException;

    void endArray() throws IOException;

    void endObject() throws IOException;

    Double g1() throws IOException;

    boolean hasNext() throws IOException;

    float j0() throws IOException;

    String k0() throws IOException;

    double nextDouble() throws IOException;

    int nextInt() throws IOException;

    long nextLong() throws IOException;

    @NotNull
    String nextName() throws IOException;

    String nextString() throws IOException;

    @NotNull
    io.sentry.vendor.gson.stream.b peek() throws IOException;

    void setLenient(boolean z11);

    void skipValue() throws IOException;
}
