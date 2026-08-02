package ru.ozon.app.android.composer.network.prefetch;

import N3.C3660k;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.network.cache.cacheGroup.CacheGroup;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ@\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0006\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/composer/network/prefetch/FinalRequestInfo;", "", "", ImagesContract.URL, "requestUrl", "", "isLoading", "Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "cacheGroup", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;)Lru/ozon/app/android/composer/network/prefetch/FinalRequestInfo;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "getRequestUrl", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "getCacheGroup", "()Lru/ozon/app/android/composer/network/cache/cacheGroup/CacheGroup;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class FinalRequestInfo {
    private final CacheGroup cacheGroup;
    private final Boolean isLoading;
    private final String requestUrl;
    private final String url;

    public FinalRequestInfo(String str, String str2, Boolean bool, CacheGroup cacheGroup) {
        this.url = str;
        this.requestUrl = str2;
        this.isLoading = bool;
        this.cacheGroup = cacheGroup;
    }

    public static /* synthetic */ FinalRequestInfo copy$default(FinalRequestInfo finalRequestInfo, String str, String str2, Boolean bool, CacheGroup cacheGroup, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = finalRequestInfo.url;
        }
        if ((i11 & 2) != 0) {
            str2 = finalRequestInfo.requestUrl;
        }
        if ((i11 & 4) != 0) {
            bool = finalRequestInfo.isLoading;
        }
        if ((i11 & 8) != 0) {
            cacheGroup = finalRequestInfo.cacheGroup;
        }
        return finalRequestInfo.copy(str, str2, bool, cacheGroup);
    }

    @NotNull
    public final FinalRequestInfo copy(String url, String requestUrl, Boolean isLoading, CacheGroup cacheGroup) {
        return new FinalRequestInfo(url, requestUrl, isLoading, cacheGroup);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinalRequestInfo)) {
            return false;
        }
        FinalRequestInfo finalRequestInfo = (FinalRequestInfo) other;
        return Intrinsics.d(this.url, finalRequestInfo.url) && Intrinsics.d(this.requestUrl, finalRequestInfo.requestUrl) && Intrinsics.d(this.isLoading, finalRequestInfo.isLoading) && Intrinsics.d(this.cacheGroup, finalRequestInfo.cacheGroup);
    }

    public final CacheGroup getCacheGroup() {
        return this.cacheGroup;
    }

    public final String getRequestUrl() {
        return this.requestUrl;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.requestUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isLoading;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        CacheGroup cacheGroup = this.cacheGroup;
        return hashCode3 + (cacheGroup != null ? cacheGroup.hashCode() : 0);
    }

    /* renamed from: isLoading, reason: from getter */
    public final Boolean getIsLoading() {
        return this.isLoading;
    }

    @NotNull
    public String toString() {
        String str = this.url;
        String str2 = this.requestUrl;
        Boolean bool = this.isLoading;
        CacheGroup cacheGroup = this.cacheGroup;
        StringBuilder d11 = C3660k.d("FinalRequestInfo(url=", str, ", requestUrl=", str2, ", isLoading=");
        d11.append(bool);
        d11.append(", cacheGroup=");
        d11.append(cacheGroup);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ FinalRequestInfo(String str, String str2, Boolean bool, CacheGroup cacheGroup, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : bool, (i11 & 8) != 0 ? null : cacheGroup);
    }
}
