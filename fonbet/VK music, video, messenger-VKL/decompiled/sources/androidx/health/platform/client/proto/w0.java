package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.d;
import java.io.IOException;

/* compiled from: Schema.java */
/* loaded from: classes12.dex */
public interface w0<T> {
    void a(T t, T t2);

    T b();

    boolean c(T t);

    void d(T t);

    void e(T t, byte[] bArr, int i, int i2, d.a aVar) throws IOException;

    int f(GeneratedMessageLite generatedMessageLite);

    void g(T t, Writer writer) throws IOException;

    int h(a aVar);

    boolean i(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2);
}
