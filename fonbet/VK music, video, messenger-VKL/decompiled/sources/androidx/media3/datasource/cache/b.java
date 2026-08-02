package androidx.media3.datasource.cache;

import androidx.media3.datasource.cache.Cache;

/* compiled from: CacheEvictor.java */
/* loaded from: classes.dex */
public interface b extends Cache.a {
    boolean a();

    void d(c cVar, String str, long j, long j2);

    void onCacheInitialized();
}
