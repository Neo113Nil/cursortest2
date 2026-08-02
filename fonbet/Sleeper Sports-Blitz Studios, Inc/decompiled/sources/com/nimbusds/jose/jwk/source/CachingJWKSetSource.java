package com.nimbusds.jose.jwk.source;

import com.nimbusds.jose.KeySourceException;
import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.proc.SecurityContext;
import com.nimbusds.jose.util.cache.CachedObject;
import com.nimbusds.jose.util.events.EventListener;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import net.jcip.annotations.ThreadSafe;

@ThreadSafe
/* loaded from: classes8.dex */
public class CachingJWKSetSource<C extends SecurityContext> extends AbstractCachingJWKSetSource<C> {
    private final long cacheRefreshTimeout;
    private final EventListener<CachingJWKSetSource<C>, C> eventListener;
    private final ReentrantLock lock;

    @Override // com.nimbusds.jose.jwk.source.AbstractCachingJWKSetSource
    public /* bridge */ /* synthetic */ long getTimeToLive() {
        return super.getTimeToLive();
    }

    static class AbstractCachingJWKSetSourceEvent<C extends SecurityContext> extends AbstractJWKSetSourceEvent<CachingJWKSetSource<C>, C> {
        private final int threadQueueLength;

        public AbstractCachingJWKSetSourceEvent(CachingJWKSetSource<C> cachingJWKSetSource, int i, C c) {
            super(cachingJWKSetSource, c);
            this.threadQueueLength = i;
        }

        public int getThreadQueueLength() {
            return this.threadQueueLength;
        }
    }

    public static class RefreshInitiatedEvent<C extends SecurityContext> extends AbstractCachingJWKSetSourceEvent<C> {
        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ SecurityContext getContext() {
            return super.getContext();
        }

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ JWKSetSource getSource() {
            return super.getSource();
        }

        @Override // com.nimbusds.jose.jwk.source.CachingJWKSetSource.AbstractCachingJWKSetSourceEvent
        public /* bridge */ /* synthetic */ int getThreadQueueLength() {
            return super.getThreadQueueLength();
        }

        private RefreshInitiatedEvent(CachingJWKSetSource<C> cachingJWKSetSource, int i, C c) {
            super(cachingJWKSetSource, i, c);
        }
    }

    public static class RefreshCompletedEvent<C extends SecurityContext> extends AbstractCachingJWKSetSourceEvent<C> {
        private final JWKSet jwkSet;

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ SecurityContext getContext() {
            return super.getContext();
        }

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ JWKSetSource getSource() {
            return super.getSource();
        }

        @Override // com.nimbusds.jose.jwk.source.CachingJWKSetSource.AbstractCachingJWKSetSourceEvent
        public /* bridge */ /* synthetic */ int getThreadQueueLength() {
            return super.getThreadQueueLength();
        }

        private RefreshCompletedEvent(CachingJWKSetSource<C> cachingJWKSetSource, JWKSet jWKSet, int i, C c) {
            super(cachingJWKSetSource, i, c);
            Objects.requireNonNull(jWKSet);
            this.jwkSet = jWKSet;
        }

        public JWKSet getJWKSet() {
            return this.jwkSet;
        }
    }

    public static class WaitingForRefreshEvent<C extends SecurityContext> extends AbstractCachingJWKSetSourceEvent<C> {
        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ SecurityContext getContext() {
            return super.getContext();
        }

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ JWKSetSource getSource() {
            return super.getSource();
        }

        @Override // com.nimbusds.jose.jwk.source.CachingJWKSetSource.AbstractCachingJWKSetSourceEvent
        public /* bridge */ /* synthetic */ int getThreadQueueLength() {
            return super.getThreadQueueLength();
        }

        private WaitingForRefreshEvent(CachingJWKSetSource<C> cachingJWKSetSource, int i, C c) {
            super(cachingJWKSetSource, i, c);
        }
    }

    public static class UnableToRefreshEvent<C extends SecurityContext> extends AbstractJWKSetSourceEvent<CachingJWKSetSource<C>, C> {
        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ SecurityContext getContext() {
            return super.getContext();
        }

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ JWKSetSource getSource() {
            return super.getSource();
        }

        private UnableToRefreshEvent(CachingJWKSetSource<C> cachingJWKSetSource, C c) {
            super(cachingJWKSetSource, c);
        }
    }

    public static class RefreshTimedOutEvent<C extends SecurityContext> extends AbstractCachingJWKSetSourceEvent<C> {
        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ SecurityContext getContext() {
            return super.getContext();
        }

        @Override // com.nimbusds.jose.jwk.source.AbstractJWKSetSourceEvent, com.nimbusds.jose.util.events.Event
        public /* bridge */ /* synthetic */ JWKSetSource getSource() {
            return super.getSource();
        }

        @Override // com.nimbusds.jose.jwk.source.CachingJWKSetSource.AbstractCachingJWKSetSourceEvent
        public /* bridge */ /* synthetic */ int getThreadQueueLength() {
            return super.getThreadQueueLength();
        }

        private RefreshTimedOutEvent(CachingJWKSetSource<C> cachingJWKSetSource, int i, C c) {
            super(cachingJWKSetSource, i, c);
        }
    }

    public CachingJWKSetSource(JWKSetSource<C> jWKSetSource, long j, long j2, EventListener<CachingJWKSetSource<C>, C> eventListener) {
        super(jWKSetSource, j);
        this.lock = new ReentrantLock();
        this.cacheRefreshTimeout = j2;
        this.eventListener = eventListener;
    }

    @Override // com.nimbusds.jose.jwk.source.JWKSetSource
    public JWKSet getJWKSet(JWKSetCacheRefreshEvaluator jWKSetCacheRefreshEvaluator, long j, C c) throws KeySourceException {
        CachedObject<JWKSet> cachedJWKSet = getCachedJWKSet();
        if (cachedJWKSet == null) {
            return loadJWKSetBlocking(JWKSetCacheRefreshEvaluator.noRefresh(), j, c);
        }
        JWKSet jWKSet = cachedJWKSet.get();
        if (jWKSetCacheRefreshEvaluator.requiresRefresh(jWKSet)) {
            return loadJWKSetBlocking(jWKSetCacheRefreshEvaluator, j, c);
        }
        if (cachedJWKSet.isExpired(j)) {
            return loadJWKSetBlocking(JWKSetCacheRefreshEvaluator.referenceComparison(jWKSet), j, c);
        }
        return cachedJWKSet.get();
    }

    public long getCacheRefreshTimeout() {
        return this.cacheRefreshTimeout;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d8 A[Catch: InterruptedException -> 0x011a, TryCatch #2 {InterruptedException -> 0x011a, blocks: (B:3:0x0002, B:49:0x004f, B:24:0x00c7, B:26:0x00cd, B:28:0x00d4, B:30:0x00d8, B:31:0x00e0, B:32:0x00e7, B:6:0x005c, B:8:0x0060, B:9:0x006e, B:22:0x00c0, B:11:0x00ef, B:13:0x00f3, B:14:0x0101, B:15:0x0119, B:42:0x00e9, B:43:0x00ee, B:59:0x0056, B:60:0x005b, B:45:0x000b, B:47:0x0011, B:50:0x001d, B:52:0x0021, B:53:0x002f, B:55:0x0037, B:18:0x007c, B:20:0x0082, B:33:0x008e, B:35:0x0092, B:36:0x00a0, B:38:0x00a8), top: B:2:0x0002, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    JWKSet loadJWKSetBlocking(JWKSetCacheRefreshEvaluator jWKSetCacheRefreshEvaluator, long j, C c) throws KeySourceException {
        CachedObject<JWKSet> cachedJWKSet;
        EventListener<CachingJWKSetSource<C>, C> eventListener;
        try {
            if (this.lock.tryLock()) {
                try {
                    cachedJWKSet = getCachedJWKSet();
                    if (cachedJWKSet == null || jWKSetCacheRefreshEvaluator.requiresRefresh(cachedJWKSet.get())) {
                        EventListener<CachingJWKSetSource<C>, C> eventListener2 = this.eventListener;
                        if (eventListener2 != null) {
                            eventListener2.notify(new RefreshInitiatedEvent(this.lock.getQueueLength(), c));
                        }
                        CachedObject<JWKSet> loadJWKSetNotThreadSafe = loadJWKSetNotThreadSafe(jWKSetCacheRefreshEvaluator, j, c);
                        EventListener<CachingJWKSetSource<C>, C> eventListener3 = this.eventListener;
                        if (eventListener3 != null) {
                            eventListener3.notify(new RefreshCompletedEvent(loadJWKSetNotThreadSafe.get(), this.lock.getQueueLength(), c));
                        }
                        cachedJWKSet = loadJWKSetNotThreadSafe;
                    }
                    this.lock.unlock();
                    if (cachedJWKSet == null && cachedJWKSet.isValid(j)) {
                        return cachedJWKSet.get();
                    }
                    eventListener = this.eventListener;
                    if (eventListener != null) {
                        eventListener.notify(new UnableToRefreshEvent(c));
                    }
                    throw new JWKSetUnavailableException("Unable to refresh cache");
                } finally {
                }
            }
            EventListener<CachingJWKSetSource<C>, C> eventListener4 = this.eventListener;
            if (eventListener4 != null) {
                eventListener4.notify(new WaitingForRefreshEvent(this.lock.getQueueLength(), c));
            }
            if (this.lock.tryLock(getCacheRefreshTimeout(), TimeUnit.MILLISECONDS)) {
                try {
                    cachedJWKSet = getCachedJWKSet();
                    if (cachedJWKSet == null || jWKSetCacheRefreshEvaluator.requiresRefresh(cachedJWKSet.get())) {
                        EventListener<CachingJWKSetSource<C>, C> eventListener5 = this.eventListener;
                        if (eventListener5 != null) {
                            eventListener5.notify(new RefreshInitiatedEvent(this.lock.getQueueLength(), c));
                        }
                        CachedObject<JWKSet> loadJWKSetNotThreadSafe2 = loadJWKSetNotThreadSafe(jWKSetCacheRefreshEvaluator, j, c);
                        EventListener<CachingJWKSetSource<C>, C> eventListener6 = this.eventListener;
                        if (eventListener6 != null) {
                            eventListener6.notify(new RefreshCompletedEvent(loadJWKSetNotThreadSafe2.get(), this.lock.getQueueLength(), c));
                        }
                        cachedJWKSet = loadJWKSetNotThreadSafe2;
                    }
                    if (cachedJWKSet == null) {
                    }
                    eventListener = this.eventListener;
                    if (eventListener != null) {
                    }
                    throw new JWKSetUnavailableException("Unable to refresh cache");
                } finally {
                }
            }
            EventListener<CachingJWKSetSource<C>, C> eventListener7 = this.eventListener;
            if (eventListener7 != null) {
                eventListener7.notify(new RefreshTimedOutEvent(this.lock.getQueueLength(), c));
            }
            throw new JWKSetUnavailableException("Timeout while waiting for cache refresh (" + this.cacheRefreshTimeout + "ms exceeded)");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new JWKSetUnavailableException("Interrupted while waiting for cache refresh", e);
        }
    }

    CachedObject<JWKSet> loadJWKSetNotThreadSafe(JWKSetCacheRefreshEvaluator jWKSetCacheRefreshEvaluator, long j, C c) throws KeySourceException {
        return cacheJWKSet(getSource().getJWKSet(jWKSetCacheRefreshEvaluator, j, c), j);
    }

    ReentrantLock getLock() {
        return this.lock;
    }
}
