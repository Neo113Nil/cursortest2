package androidx.media3.datasource.cache;

import androidx.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.util.NavigableSet;
import java.util.Set;
import xsna.cij;
import xsna.dij;
import xsna.qpj0;
import xsna.qx8;

/* loaded from: classes.dex */
public interface Cache {

    public static class CacheException extends IOException {
    }

    public interface a {
        void b(c cVar, qpj0 qpj0Var, qpj0 qpj0Var2);

        void c(c cVar, qx8 qx8Var);

        void e(c cVar, qpj0 qpj0Var);
    }

    qx8 a(long j, long j2, String str) throws InterruptedException, CacheException;

    long b(long j, long j2, String str);

    void c(String str);

    void d(qx8 qx8Var);

    void e(File file, long j) throws CacheException;

    void f(String str, dij dijVar) throws CacheException;

    @Nullable
    qx8 g(long j, long j2, String str) throws CacheException;

    long getCacheSpace();

    long getCachedLength(String str, long j, long j2);

    NavigableSet<qx8> getCachedSpans(String str);

    cij getContentMetadata(String str);

    Set<String> getKeys();

    boolean isCached(String str, long j, long j2);

    File startFile(String str, long j, long j2) throws CacheException;
}
