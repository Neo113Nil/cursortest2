package io.sentry;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedInputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public interface g1 {
    void a(Object obj, Writer writer);

    String b(ConcurrentHashMap concurrentHashMap);

    Object c(Reader reader, Class cls);

    l1.a d(BufferedInputStream bufferedInputStream);

    void e(l1.a aVar, OutputStream outputStream);
}
