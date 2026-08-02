package io.appmetrica.analytics.coreutils.internal.cache;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.c1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public interface CachedDataProvider {

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class CachedData<T> {

        /* renamed from: a, reason: collision with root package name */
        private final String f11691a;

        /* renamed from: b, reason: collision with root package name */
        private volatile long f11692b;

        /* renamed from: c, reason: collision with root package name */
        private volatile long f11693c;

        /* renamed from: d, reason: collision with root package name */
        private long f11694d = 0;

        /* renamed from: e, reason: collision with root package name */
        private Object f11695e = null;

        public CachedData(long j, long j6, @NonNull String str) {
            this.f11691a = c1.n("[CachedData-", str, "]");
            this.f11692b = j;
            this.f11693c = j6;
        }

        public T getData() {
            return (T) this.f11695e;
        }

        public long getExpiryTime() {
            return this.f11693c;
        }

        public long getRefreshTime() {
            return this.f11692b;
        }

        public final boolean isEmpty() {
            return this.f11695e == null;
        }

        public void setData(T t3) {
            this.f11695e = t3;
            this.f11694d = System.currentTimeMillis();
        }

        public void setExpirationPolicy(long j, long j6) {
            this.f11692b = j;
            this.f11693c = j6;
        }

        public final boolean shouldClearData() {
            if (this.f11694d == 0) {
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.f11694d;
            return currentTimeMillis > this.f11693c || currentTimeMillis < 0;
        }

        public final boolean shouldUpdateData() {
            long currentTimeMillis = System.currentTimeMillis() - this.f11694d;
            return currentTimeMillis > this.f11692b || currentTimeMillis < 0;
        }

        @NonNull
        public String toString() {
            return "CachedData{tag='" + this.f11691a + "', refreshTime=" + this.f11692b + ", expiryTime=" + this.f11693c + ", mCachedTime=" + this.f11694d + ", mCachedData=" + this.f11695e + '}';
        }
    }
}
