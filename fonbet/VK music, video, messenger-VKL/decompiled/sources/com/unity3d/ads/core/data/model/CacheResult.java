package com.unity3d.ads.core.data.model;

import xsna.epx;
import xsna.oq;
import xsna.zcl;

/* compiled from: CacheResult.kt */
/* loaded from: classes14.dex */
public abstract class CacheResult {

    /* compiled from: CacheResult.kt */
    public static final class Failure extends CacheResult {
        private final CacheError error;
        private final Throwable reason;
        private final CacheSource source;

        public Failure(CacheError cacheError, CacheSource cacheSource, Throwable th) {
            super(null);
            this.error = cacheError;
            this.source = cacheSource;
            this.reason = th;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, CacheError cacheError, CacheSource cacheSource, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                cacheError = failure.error;
            }
            if ((i & 2) != 0) {
                cacheSource = failure.source;
            }
            if ((i & 4) != 0) {
                th = failure.reason;
            }
            return failure.copy(cacheError, cacheSource, th);
        }

        public final CacheError component1() {
            return this.error;
        }

        public final CacheSource component2() {
            return this.source;
        }

        public final Throwable component3() {
            return this.reason;
        }

        public final Failure copy(CacheError cacheError, CacheSource cacheSource, Throwable th) {
            return new Failure(cacheError, cacheSource, th);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return this.error == failure.error && this.source == failure.source && epx.f(this.reason, failure.reason);
        }

        public final CacheError getError() {
            return this.error;
        }

        public final Throwable getReason() {
            return this.reason;
        }

        public final CacheSource getSource() {
            return this.source;
        }

        public int hashCode() {
            int hashCode = (this.source.hashCode() + (this.error.hashCode() * 31)) * 31;
            Throwable th = this.reason;
            return hashCode + (th == null ? 0 : th.hashCode());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Failure(error=");
            sb.append(this.error);
            sb.append(", source=");
            sb.append(this.source);
            sb.append(", reason=");
            return oq.c(sb, this.reason, ')');
        }

        public /* synthetic */ Failure(CacheError cacheError, CacheSource cacheSource, Throwable th, int i, zcl zclVar) {
            this(cacheError, (i & 2) != 0 ? CacheSource.LOCAL : cacheSource, (i & 4) != 0 ? null : th);
        }
    }

    /* compiled from: CacheResult.kt */
    public static final class Success extends CacheResult {
        private final CachedFile cachedFile;
        private final CacheSource source;

        public Success(CachedFile cachedFile, CacheSource cacheSource) {
            super(null);
            this.cachedFile = cachedFile;
            this.source = cacheSource;
        }

        public static /* synthetic */ Success copy$default(Success success, CachedFile cachedFile, CacheSource cacheSource, int i, Object obj) {
            if ((i & 1) != 0) {
                cachedFile = success.cachedFile;
            }
            if ((i & 2) != 0) {
                cacheSource = success.source;
            }
            return success.copy(cachedFile, cacheSource);
        }

        public final CachedFile component1() {
            return this.cachedFile;
        }

        public final CacheSource component2() {
            return this.source;
        }

        public final Success copy(CachedFile cachedFile, CacheSource cacheSource) {
            return new Success(cachedFile, cacheSource);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return epx.f(this.cachedFile, success.cachedFile) && this.source == success.source;
        }

        public final CachedFile getCachedFile() {
            return this.cachedFile;
        }

        public final CacheSource getSource() {
            return this.source;
        }

        public int hashCode() {
            return this.source.hashCode() + (this.cachedFile.hashCode() * 31);
        }

        public String toString() {
            return "Success(cachedFile=" + this.cachedFile + ", source=" + this.source + ')';
        }
    }

    public /* synthetic */ CacheResult(zcl zclVar) {
        this();
    }

    private CacheResult() {
    }
}
