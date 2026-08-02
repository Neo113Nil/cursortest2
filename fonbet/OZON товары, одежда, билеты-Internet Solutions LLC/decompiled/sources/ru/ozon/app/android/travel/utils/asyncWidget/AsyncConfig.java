package ru.ozon.app.android.travel.utils.asyncWidget;

import Nh.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/utils/asyncWidget/AsyncConfig;", "", "", "asyncData", "", "asyncParams", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAsyncData", "Ljava/util/Map;", "getAsyncParams", "()Ljava/util/Map;", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AsyncConfig {
    public static final int $stable = 8;

    @NotNull
    private final String asyncData;
    private final Map<String, String> asyncParams;

    public AsyncConfig(@NotNull String asyncData, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(asyncData, "asyncData");
        this.asyncData = asyncData;
        this.asyncParams = map;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AsyncConfig)) {
            return false;
        }
        AsyncConfig asyncConfig = (AsyncConfig) other;
        return Intrinsics.d(this.asyncData, asyncConfig.asyncData) && Intrinsics.d(this.asyncParams, asyncConfig.asyncParams);
    }

    @NotNull
    public final String getAsyncData() {
        return this.asyncData;
    }

    public final Map<String, String> getAsyncParams() {
        return this.asyncParams;
    }

    public int hashCode() {
        int hashCode = this.asyncData.hashCode() * 31;
        Map<String, String> map = this.asyncParams;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return a.d("AsyncConfig(asyncData=", this.asyncData, ", asyncParams=", ")", this.asyncParams);
    }
}
