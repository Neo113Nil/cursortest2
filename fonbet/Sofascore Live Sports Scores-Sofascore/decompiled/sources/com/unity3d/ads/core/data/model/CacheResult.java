package com.unity3d.ads.core.data.model;

import com.inmobi.unification.sdk.InitializationStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/data/model/CacheResult;", "", "<init>", "()V", InitializationStatus.SUCCESS, "Failure", "Lcom/unity3d/ads/core/data/model/CacheResult$Failure;", "Lcom/unity3d/ads/core/data/model/CacheResult$Success;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class CacheResult {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/unity3d/ads/core/data/model/CacheResult$Success;", "Lcom/unity3d/ads/core/data/model/CacheResult;", "cachedFile", "Lcom/unity3d/ads/core/data/model/CachedFile;", "source", "Lcom/unity3d/ads/core/data/model/CacheSource;", "<init>", "(Lcom/unity3d/ads/core/data/model/CachedFile;Lcom/unity3d/ads/core/data/model/CacheSource;)V", "getCachedFile", "()Lcom/unity3d/ads/core/data/model/CachedFile;", "getSource", "()Lcom/unity3d/ads/core/data/model/CacheSource;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Success extends CacheResult {

        @NotNull
        private final CachedFile cachedFile;

        @NotNull
        private final CacheSource source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull CachedFile cachedFile, @NotNull CacheSource cacheSource) {
            super(null);
            cachedFile.getClass();
            cacheSource.getClass();
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

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CachedFile getCachedFile() {
            return this.cachedFile;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CacheSource getSource() {
            return this.source;
        }

        @NotNull
        public final Success copy(@NotNull CachedFile cachedFile, @NotNull CacheSource source) {
            cachedFile.getClass();
            source.getClass();
            return new Success(cachedFile, source);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.c(this.cachedFile, success.cachedFile) && this.source == success.source;
        }

        @NotNull
        public final CachedFile getCachedFile() {
            return this.cachedFile;
        }

        @NotNull
        public final CacheSource getSource() {
            return this.source;
        }

        public int hashCode() {
            return this.source.hashCode() + (this.cachedFile.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Success(cachedFile=" + this.cachedFile + ", source=" + this.source + ')';
        }
    }

    public /* synthetic */ CacheResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CacheResult() {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/unity3d/ads/core/data/model/CacheResult$Failure;", "Lcom/unity3d/ads/core/data/model/CacheResult;", "error", "Lcom/unity3d/ads/core/data/model/CacheError;", "source", "Lcom/unity3d/ads/core/data/model/CacheSource;", "reason", "", "<init>", "(Lcom/unity3d/ads/core/data/model/CacheError;Lcom/unity3d/ads/core/data/model/CacheSource;Ljava/lang/Throwable;)V", "getError", "()Lcom/unity3d/ads/core/data/model/CacheError;", "getSource", "()Lcom/unity3d/ads/core/data/model/CacheSource;", "getReason", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Failure extends CacheResult {

        @NotNull
        private final CacheError error;

        @Nullable
        private final Throwable reason;

        @NotNull
        private final CacheSource source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(@NotNull CacheError cacheError, @NotNull CacheSource cacheSource, @Nullable Throwable th) {
            super(null);
            cacheError.getClass();
            cacheSource.getClass();
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

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CacheError getError() {
            return this.error;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CacheSource getSource() {
            return this.source;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final Throwable getReason() {
            return this.reason;
        }

        @NotNull
        public final Failure copy(@NotNull CacheError error, @NotNull CacheSource source, @Nullable Throwable reason) {
            error.getClass();
            source.getClass();
            return new Failure(error, source, reason);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) other;
            return this.error == failure.error && this.source == failure.source && Intrinsics.c(this.reason, failure.reason);
        }

        @NotNull
        public final CacheError getError() {
            return this.error;
        }

        @Nullable
        public final Throwable getReason() {
            return this.reason;
        }

        @NotNull
        public final CacheSource getSource() {
            return this.source;
        }

        public int hashCode() {
            int hashCode = (this.source.hashCode() + (this.error.hashCode() * 31)) * 31;
            Throwable th = this.reason;
            return hashCode + (th == null ? 0 : th.hashCode());
        }

        @NotNull
        public String toString() {
            return "Failure(error=" + this.error + ", source=" + this.source + ", reason=" + this.reason + ')';
        }

        public /* synthetic */ Failure(CacheError cacheError, CacheSource cacheSource, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(cacheError, (i & 2) != 0 ? CacheSource.LOCAL : cacheSource, (i & 4) != 0 ? null : th);
        }
    }
}
