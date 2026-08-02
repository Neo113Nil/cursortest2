package com.google.protobuf;

import com.google.protobuf.b;
import java.io.IOException;

/* compiled from: Schema.java */
/* loaded from: classes.dex */
public interface v<T> {
    void a(T t, T t2);

    T b();

    boolean c(T t);

    void d(T t);

    int e(GeneratedMessageLite generatedMessageLite);

    void f(MessageLite messageLite, Writer writer) throws IOException;

    int g(AbstractMessageLite abstractMessageLite);

    void h(T t, byte[] bArr, int i, int i2, b.C0151b c0151b) throws IOException;

    void i(Object obj, d dVar, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    boolean j(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2);
}
