package com.blaze.blazesdk.features.moments.container.tabs.models;

import androidx.annotation.Keep;
import com.blaze.blazesdk.ads.models.ui.BlazeMomentsAdsConfigType;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.prefetch.models.BlazeCachingLevel;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.players.BlazePlayerButtonCustomImageStates;
import com.ironsource.C4018c8;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import defpackage.o6a;
import defpackage.u0a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\nHÆ\u0003J\t\u00101\u001a\u00020\fHÆ\u0003J\t\u00102\u001a\u00020\bHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000fHÆ\u0003J[\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u00105\u001a\u00020\b2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0013\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\r\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u001c\"\u0004\b'\u0010\u001eR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006:"}, d2 = {"Lcom/blaze/blazesdk/features/moments/container/tabs/models/BlazeMomentsContainerTabItem;", "", "containerId", "", "title", "dataSource", "Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;", "shouldOrderMomentsByReadStatus", "", "cachePolicyLevel", "Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;", "momentsAdsConfigType", "Lcom/blaze/blazesdk/ads/models/ui/BlazeMomentsAdsConfigType;", C4018c8.k, "icon", "Lcom/blaze/blazesdk/style/players/BlazePlayerButtonCustomImageStates;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;ZLcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;Lcom/blaze/blazesdk/ads/models/ui/BlazeMomentsAdsConfigType;ZLcom/blaze/blazesdk/style/players/BlazePlayerButtonCustomImageStates;)V", "getContainerId", "()Ljava/lang/String;", "getTitle", "setTitle", "(Ljava/lang/String;)V", "getDataSource", "()Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;", "setDataSource", "(Lcom/blaze/blazesdk/data_source/BlazeDataSourceType;)V", "getShouldOrderMomentsByReadStatus", "()Z", "setShouldOrderMomentsByReadStatus", "(Z)V", "getCachePolicyLevel", "()Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;", "setCachePolicyLevel", "(Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;)V", "getMomentsAdsConfigType", "()Lcom/blaze/blazesdk/ads/models/ui/BlazeMomentsAdsConfigType;", "setMomentsAdsConfigType", "(Lcom/blaze/blazesdk/ads/models/ui/BlazeMomentsAdsConfigType;)V", "setVisible", "getIcon", "()Lcom/blaze/blazesdk/style/players/BlazePlayerButtonCustomImageStates;", "setIcon", "(Lcom/blaze/blazesdk/style/players/BlazePlayerButtonCustomImageStates;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BlazeMomentsContainerTabItem {
    public static final int $stable = 8;

    @NotNull
    private BlazeCachingLevel cachePolicyLevel;

    @NotNull
    private final String containerId;

    @NotNull
    private BlazeDataSourceType dataSource;

    @Nullable
    private BlazePlayerButtonCustomImageStates icon;
    private boolean isVisible;

    @NotNull
    private BlazeMomentsAdsConfigType momentsAdsConfigType;
    private boolean shouldOrderMomentsByReadStatus;

    @NotNull
    private String title;

    public /* synthetic */ BlazeMomentsContainerTabItem(String str, String str2, BlazeDataSourceType blazeDataSourceType, boolean z, BlazeCachingLevel blazeCachingLevel, BlazeMomentsAdsConfigType blazeMomentsAdsConfigType, boolean z2, BlazePlayerButtonCustomImageStates blazePlayerButtonCustomImageStates, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, blazeDataSourceType, (i & 8) != 0 ? true : z, (i & 16) != 0 ? BlazeSDK.INSTANCE.getCachingLevel$blazesdk_release() : blazeCachingLevel, (i & 32) != 0 ? BlazeMomentsAdsConfigType.FIRST_AVAILABLE_ADS_CONFIG : blazeMomentsAdsConfigType, (i & 64) != 0 ? true : z2, (i & 128) != 0 ? null : blazePlayerButtonCustomImageStates);
    }

    public static /* synthetic */ BlazeMomentsContainerTabItem copy$default(BlazeMomentsContainerTabItem blazeMomentsContainerTabItem, String str, String str2, BlazeDataSourceType blazeDataSourceType, boolean z, BlazeCachingLevel blazeCachingLevel, BlazeMomentsAdsConfigType blazeMomentsAdsConfigType, boolean z2, BlazePlayerButtonCustomImageStates blazePlayerButtonCustomImageStates, int i, Object obj) {
        if ((i & 1) != 0) {
            str = blazeMomentsContainerTabItem.containerId;
        }
        if ((i & 2) != 0) {
            str2 = blazeMomentsContainerTabItem.title;
        }
        if ((i & 4) != 0) {
            blazeDataSourceType = blazeMomentsContainerTabItem.dataSource;
        }
        if ((i & 8) != 0) {
            z = blazeMomentsContainerTabItem.shouldOrderMomentsByReadStatus;
        }
        if ((i & 16) != 0) {
            blazeCachingLevel = blazeMomentsContainerTabItem.cachePolicyLevel;
        }
        if ((i & 32) != 0) {
            blazeMomentsAdsConfigType = blazeMomentsContainerTabItem.momentsAdsConfigType;
        }
        if ((i & 64) != 0) {
            z2 = blazeMomentsContainerTabItem.isVisible;
        }
        if ((i & 128) != 0) {
            blazePlayerButtonCustomImageStates = blazeMomentsContainerTabItem.icon;
        }
        boolean z3 = z2;
        BlazePlayerButtonCustomImageStates blazePlayerButtonCustomImageStates2 = blazePlayerButtonCustomImageStates;
        BlazeCachingLevel blazeCachingLevel2 = blazeCachingLevel;
        BlazeMomentsAdsConfigType blazeMomentsAdsConfigType2 = blazeMomentsAdsConfigType;
        return blazeMomentsContainerTabItem.copy(str, str2, blazeDataSourceType, z, blazeCachingLevel2, blazeMomentsAdsConfigType2, z3, blazePlayerButtonCustomImageStates2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getContainerId() {
        return this.containerId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final BlazeDataSourceType getDataSource() {
        return this.dataSource;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShouldOrderMomentsByReadStatus() {
        return this.shouldOrderMomentsByReadStatus;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final BlazeCachingLevel getCachePolicyLevel() {
        return this.cachePolicyLevel;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final BlazeMomentsAdsConfigType getMomentsAdsConfigType() {
        return this.momentsAdsConfigType;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final BlazePlayerButtonCustomImageStates getIcon() {
        return this.icon;
    }

    @NotNull
    public final BlazeMomentsContainerTabItem copy(@NotNull String containerId, @NotNull String title, @NotNull BlazeDataSourceType dataSource, boolean shouldOrderMomentsByReadStatus, @NotNull BlazeCachingLevel cachePolicyLevel, @NotNull BlazeMomentsAdsConfigType momentsAdsConfigType, boolean isVisible, @Nullable BlazePlayerButtonCustomImageStates icon) {
        containerId.getClass();
        title.getClass();
        dataSource.getClass();
        cachePolicyLevel.getClass();
        momentsAdsConfigType.getClass();
        return new BlazeMomentsContainerTabItem(containerId, title, dataSource, shouldOrderMomentsByReadStatus, cachePolicyLevel, momentsAdsConfigType, isVisible, icon);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlazeMomentsContainerTabItem)) {
            return false;
        }
        BlazeMomentsContainerTabItem blazeMomentsContainerTabItem = (BlazeMomentsContainerTabItem) other;
        return Intrinsics.c(this.containerId, blazeMomentsContainerTabItem.containerId) && Intrinsics.c(this.title, blazeMomentsContainerTabItem.title) && Intrinsics.c(this.dataSource, blazeMomentsContainerTabItem.dataSource) && this.shouldOrderMomentsByReadStatus == blazeMomentsContainerTabItem.shouldOrderMomentsByReadStatus && this.cachePolicyLevel == blazeMomentsContainerTabItem.cachePolicyLevel && this.momentsAdsConfigType == blazeMomentsContainerTabItem.momentsAdsConfigType && this.isVisible == blazeMomentsContainerTabItem.isVisible && Intrinsics.c(this.icon, blazeMomentsContainerTabItem.icon);
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

    @Nullable
    public final BlazePlayerButtonCustomImageStates getIcon() {
        return this.icon;
    }

    @NotNull
    public final BlazeMomentsAdsConfigType getMomentsAdsConfigType() {
        return this.momentsAdsConfigType;
    }

    public final boolean getShouldOrderMomentsByReadStatus() {
        return this.shouldOrderMomentsByReadStatus;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int t = u0a.t((this.momentsAdsConfigType.hashCode() + ((this.cachePolicyLevel.hashCode() + u0a.t((this.dataSource.hashCode() + o6a.k(this.title, this.containerId.hashCode() * 31)) * 31, this.shouldOrderMomentsByReadStatus)) * 31)) * 31, this.isVisible);
        BlazePlayerButtonCustomImageStates blazePlayerButtonCustomImageStates = this.icon;
        return t + (blazePlayerButtonCustomImageStates == null ? 0 : blazePlayerButtonCustomImageStates.hashCode());
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public final void setCachePolicyLevel(@NotNull BlazeCachingLevel blazeCachingLevel) {
        blazeCachingLevel.getClass();
        this.cachePolicyLevel = blazeCachingLevel;
    }

    public final void setDataSource(@NotNull BlazeDataSourceType blazeDataSourceType) {
        blazeDataSourceType.getClass();
        this.dataSource = blazeDataSourceType;
    }

    public final void setIcon(@Nullable BlazePlayerButtonCustomImageStates blazePlayerButtonCustomImageStates) {
        this.icon = blazePlayerButtonCustomImageStates;
    }

    public final void setMomentsAdsConfigType(@NotNull BlazeMomentsAdsConfigType blazeMomentsAdsConfigType) {
        blazeMomentsAdsConfigType.getClass();
        this.momentsAdsConfigType = blazeMomentsAdsConfigType;
    }

    public final void setShouldOrderMomentsByReadStatus(boolean z) {
        this.shouldOrderMomentsByReadStatus = z;
    }

    public final void setTitle(@NotNull String str) {
        str.getClass();
        this.title = str;
    }

    public final void setVisible(boolean z) {
        this.isVisible = z;
    }

    @NotNull
    public String toString() {
        return "BlazeMomentsContainerTabItem(containerId=" + this.containerId + ", title=" + this.title + ", dataSource=" + this.dataSource + ", shouldOrderMomentsByReadStatus=" + this.shouldOrderMomentsByReadStatus + ", cachePolicyLevel=" + this.cachePolicyLevel + ", momentsAdsConfigType=" + this.momentsAdsConfigType + ", isVisible=" + this.isVisible + ", icon=" + this.icon + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeMomentsContainerTabItem(@NotNull String str, @NotNull String str2, @NotNull BlazeDataSourceType blazeDataSourceType, boolean z) {
        this(str, str2, blazeDataSourceType, z, null, null, false, null, 240, null);
        str.getClass();
        str2.getClass();
        blazeDataSourceType.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeMomentsContainerTabItem(@NotNull String str, @NotNull String str2, @NotNull BlazeDataSourceType blazeDataSourceType, boolean z, @NotNull BlazeCachingLevel blazeCachingLevel) {
        this(str, str2, blazeDataSourceType, z, blazeCachingLevel, null, false, null, 224, null);
        str.getClass();
        str2.getClass();
        blazeDataSourceType.getClass();
        blazeCachingLevel.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeMomentsContainerTabItem(@NotNull String str, @NotNull String str2, @NotNull BlazeDataSourceType blazeDataSourceType, boolean z, @NotNull BlazeCachingLevel blazeCachingLevel, @NotNull BlazeMomentsAdsConfigType blazeMomentsAdsConfigType) {
        this(str, str2, blazeDataSourceType, z, blazeCachingLevel, blazeMomentsAdsConfigType, false, null, PsExtractor.AUDIO_STREAM, null);
        str.getClass();
        str2.getClass();
        blazeDataSourceType.getClass();
        blazeCachingLevel.getClass();
        blazeMomentsAdsConfigType.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeMomentsContainerTabItem(@NotNull String str, @NotNull String str2, @NotNull BlazeDataSourceType blazeDataSourceType, boolean z, @NotNull BlazeCachingLevel blazeCachingLevel, @NotNull BlazeMomentsAdsConfigType blazeMomentsAdsConfigType, boolean z2) {
        this(str, str2, blazeDataSourceType, z, blazeCachingLevel, blazeMomentsAdsConfigType, z2, null, 128, null);
        str.getClass();
        str2.getClass();
        blazeDataSourceType.getClass();
        blazeCachingLevel.getClass();
        blazeMomentsAdsConfigType.getClass();
    }

    @Keep
    public BlazeMomentsContainerTabItem(@NotNull String str, @NotNull String str2, @NotNull BlazeDataSourceType blazeDataSourceType, boolean z, @NotNull BlazeCachingLevel blazeCachingLevel, @NotNull BlazeMomentsAdsConfigType blazeMomentsAdsConfigType, boolean z2, @Nullable BlazePlayerButtonCustomImageStates blazePlayerButtonCustomImageStates) {
        str.getClass();
        str2.getClass();
        blazeDataSourceType.getClass();
        blazeCachingLevel.getClass();
        blazeMomentsAdsConfigType.getClass();
        this.containerId = str;
        this.title = str2;
        this.dataSource = blazeDataSourceType;
        this.shouldOrderMomentsByReadStatus = z;
        this.cachePolicyLevel = blazeCachingLevel;
        this.momentsAdsConfigType = blazeMomentsAdsConfigType;
        this.isVisible = z2;
        this.icon = blazePlayerButtonCustomImageStates;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Keep
    public BlazeMomentsContainerTabItem(@NotNull String str, @NotNull String str2, @NotNull BlazeDataSourceType blazeDataSourceType) {
        this(str, str2, blazeDataSourceType, false, null, null, false, null, 248, null);
        str.getClass();
        str2.getClass();
        blazeDataSourceType.getClass();
    }
}
