package com.blaze.blazesdk.features.moments.container.tabs.models;

import androidx.annotation.Keep;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.prefetch.models.BlazeCachingLevel;
import com.blaze.blazesdk.shared.BlazeSDK;
import defpackage.lnb;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/blaze/blazesdk/features/moments/container/tabs/models/BlazeMomentsContainerTabPreparableArgs;", "", "containerId", "", "dataSource", "Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;", "cachePolicyLevel", "Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;", "shouldOrderMomentsByReadStatus", "", "<init>", "(Ljava/lang/String;Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;Z)V", "getContainerId", "()Ljava/lang/String;", "getDataSource", "()Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;", "getCachePolicyLevel", "()Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;", "getShouldOrderMomentsByReadStatus", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BlazeMomentsContainerTabPreparableArgs {
    public static final int $stable = 0;

    @NotNull
    private final BlazeCachingLevel cachePolicyLevel;

    @NotNull
    private final String containerId;

    @NotNull
    private final BlazeDataSourceType dataSource;
    private final boolean shouldOrderMomentsByReadStatus;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeMomentsContainerTabPreparableArgs(@NotNull String str, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeCachingLevel blazeCachingLevel) {
        this(str, blazeDataSourceType, blazeCachingLevel, false, 8, null);
        str.getClass();
        blazeDataSourceType.getClass();
        blazeCachingLevel.getClass();
    }

    public static /* synthetic */ BlazeMomentsContainerTabPreparableArgs copy$default(BlazeMomentsContainerTabPreparableArgs blazeMomentsContainerTabPreparableArgs, String str, BlazeDataSourceType blazeDataSourceType, BlazeCachingLevel blazeCachingLevel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = blazeMomentsContainerTabPreparableArgs.containerId;
        }
        if ((i & 2) != 0) {
            blazeDataSourceType = blazeMomentsContainerTabPreparableArgs.dataSource;
        }
        if ((i & 4) != 0) {
            blazeCachingLevel = blazeMomentsContainerTabPreparableArgs.cachePolicyLevel;
        }
        if ((i & 8) != 0) {
            z = blazeMomentsContainerTabPreparableArgs.shouldOrderMomentsByReadStatus;
        }
        return blazeMomentsContainerTabPreparableArgs.copy(str, blazeDataSourceType, blazeCachingLevel, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getContainerId() {
        return this.containerId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BlazeDataSourceType getDataSource() {
        return this.dataSource;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final BlazeCachingLevel getCachePolicyLevel() {
        return this.cachePolicyLevel;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShouldOrderMomentsByReadStatus() {
        return this.shouldOrderMomentsByReadStatus;
    }

    @NotNull
    public final BlazeMomentsContainerTabPreparableArgs copy(@NotNull String containerId, @NotNull BlazeDataSourceType dataSource, @NotNull BlazeCachingLevel cachePolicyLevel, boolean shouldOrderMomentsByReadStatus) {
        containerId.getClass();
        dataSource.getClass();
        cachePolicyLevel.getClass();
        return new BlazeMomentsContainerTabPreparableArgs(containerId, dataSource, cachePolicyLevel, shouldOrderMomentsByReadStatus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeMomentsContainerTabPreparableArgs)) {
            return false;
        }
        BlazeMomentsContainerTabPreparableArgs blazeMomentsContainerTabPreparableArgs = (BlazeMomentsContainerTabPreparableArgs) other;
        return Intrinsics.c(this.containerId, blazeMomentsContainerTabPreparableArgs.containerId) && Intrinsics.c(this.dataSource, blazeMomentsContainerTabPreparableArgs.dataSource) && this.cachePolicyLevel == blazeMomentsContainerTabPreparableArgs.cachePolicyLevel && this.shouldOrderMomentsByReadStatus == blazeMomentsContainerTabPreparableArgs.shouldOrderMomentsByReadStatus;
    }

    @NotNull
    public final BlazeCachingLevel getCachePolicyLevel() {
        return this.cachePolicyLevel;
    }

    @NotNull
    public final String getContainerId() {
        return this.containerId;
    }

    @NotNull
    public final BlazeDataSourceType getDataSource() {
        return this.dataSource;
    }

    public final boolean getShouldOrderMomentsByReadStatus() {
        return this.shouldOrderMomentsByReadStatus;
    }

    public int hashCode() {
        return Boolean.hashCode(this.shouldOrderMomentsByReadStatus) + ((this.cachePolicyLevel.hashCode() + ((this.dataSource.hashCode() + (this.containerId.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BlazeMomentsContainerTabPreparableArgs(containerId=");
        sb.append(this.containerId);
        sb.append(", dataSource=");
        sb.append(this.dataSource);
        sb.append(", cachePolicyLevel=");
        sb.append(this.cachePolicyLevel);
        sb.append(", shouldOrderMomentsByReadStatus=");
        return lnb.r(sb, this.shouldOrderMomentsByReadStatus, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeMomentsContainerTabPreparableArgs(@NotNull String str, @NotNull BlazeDataSourceType blazeDataSourceType) {
        this(str, blazeDataSourceType, null, false, 12, null);
        str.getClass();
        blazeDataSourceType.getClass();
    }

    @Keep
    public BlazeMomentsContainerTabPreparableArgs(@NotNull String str, @NotNull BlazeDataSourceType blazeDataSourceType, @NotNull BlazeCachingLevel blazeCachingLevel, boolean z) {
        str.getClass();
        blazeDataSourceType.getClass();
        blazeCachingLevel.getClass();
        this.containerId = str;
        this.dataSource = blazeDataSourceType;
        this.cachePolicyLevel = blazeCachingLevel;
        this.shouldOrderMomentsByReadStatus = z;
    }

    public /* synthetic */ BlazeMomentsContainerTabPreparableArgs(String str, BlazeDataSourceType blazeDataSourceType, BlazeCachingLevel blazeCachingLevel, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, blazeDataSourceType, (i & 4) != 0 ? BlazeSDK.INSTANCE.getCachingLevel$blazesdk_release() : blazeCachingLevel, (i & 8) != 0 ? true : z);
    }
}
