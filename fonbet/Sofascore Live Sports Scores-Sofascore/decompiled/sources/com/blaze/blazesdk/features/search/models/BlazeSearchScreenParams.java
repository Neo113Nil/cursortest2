package com.blaze.blazesdk.features.search.models;

import androidx.annotation.Keep;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/blaze/blazesdk/features/search/models/BlazeSearchScreenParams;", "", "suggestionsDataSource", "Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;", "<init>", "(Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;)V", "getSuggestionsDataSource", "()Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BlazeSearchScreenParams {
    public static final int $stable = 0;

    @NotNull
    private final BlazeDataSourceType suggestionsDataSource;

    public BlazeSearchScreenParams(@NotNull BlazeDataSourceType blazeDataSourceType) {
        blazeDataSourceType.getClass();
        this.suggestionsDataSource = blazeDataSourceType;
    }

    public static /* synthetic */ BlazeSearchScreenParams copy$default(BlazeSearchScreenParams blazeSearchScreenParams, BlazeDataSourceType blazeDataSourceType, int i, Object obj) {
        if ((i & 1) != 0) {
            blazeDataSourceType = blazeSearchScreenParams.suggestionsDataSource;
        }
        return blazeSearchScreenParams.copy(blazeDataSourceType);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BlazeDataSourceType getSuggestionsDataSource() {
        return this.suggestionsDataSource;
    }

    @NotNull
    public final BlazeSearchScreenParams copy(@NotNull BlazeDataSourceType suggestionsDataSource) {
        suggestionsDataSource.getClass();
        return new BlazeSearchScreenParams(suggestionsDataSource);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BlazeSearchScreenParams) && Intrinsics.c(this.suggestionsDataSource, ((BlazeSearchScreenParams) other).suggestionsDataSource);
    }

    @NotNull
    public final BlazeDataSourceType getSuggestionsDataSource() {
        return this.suggestionsDataSource;
    }

    public int hashCode() {
        return this.suggestionsDataSource.hashCode();
    }

    @NotNull
    public String toString() {
        return "BlazeSearchScreenParams(suggestionsDataSource=" + this.suggestionsDataSource + ')';
    }
}
