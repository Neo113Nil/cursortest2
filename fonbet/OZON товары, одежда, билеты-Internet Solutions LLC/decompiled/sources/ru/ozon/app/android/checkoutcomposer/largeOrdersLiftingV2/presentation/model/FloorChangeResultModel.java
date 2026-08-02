package ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.model;

import Nh.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/model/FloorChangeResultModel;", "", "", "refreshUrl", "", "queryParams", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRefreshUrl", "Ljava/util/Map;", "getQueryParams", "()Ljava/util/Map;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FloorChangeResultModel {

    @NotNull
    private final Map<String, String> queryParams;

    @NotNull
    private final String refreshUrl;

    public FloorChangeResultModel(@NotNull String refreshUrl, @NotNull Map<String, String> queryParams) {
        Intrinsics.checkNotNullParameter(refreshUrl, "refreshUrl");
        Intrinsics.checkNotNullParameter(queryParams, "queryParams");
        this.refreshUrl = refreshUrl;
        this.queryParams = queryParams;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FloorChangeResultModel)) {
            return false;
        }
        FloorChangeResultModel floorChangeResultModel = (FloorChangeResultModel) other;
        return Intrinsics.d(this.refreshUrl, floorChangeResultModel.refreshUrl) && Intrinsics.d(this.queryParams, floorChangeResultModel.queryParams);
    }

    @NotNull
    public final Map<String, String> getQueryParams() {
        return this.queryParams;
    }

    @NotNull
    public final String getRefreshUrl() {
        return this.refreshUrl;
    }

    public int hashCode() {
        return this.queryParams.hashCode() + (this.refreshUrl.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a.d("FloorChangeResultModel(refreshUrl=", this.refreshUrl, ", queryParams=", ")", this.queryParams);
    }
}
