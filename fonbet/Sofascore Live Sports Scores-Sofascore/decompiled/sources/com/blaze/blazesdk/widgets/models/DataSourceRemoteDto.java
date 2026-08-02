package com.blaze.blazesdk.widgets.models;

import androidx.annotation.Keep;
import defpackage.b6h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/blaze/blazesdk/widgets/models/DataSourceRemoteDto;", "", "recommendationsDataSource", "Lcom/blaze/blazesdk/widgets/models/RecommendationsDataSourceRemoteDto;", "labelsDataSource", "Lcom/blaze/blazesdk/widgets/models/LabelsDataSourceRemoteDto;", "idsDataSource", "Lcom/blaze/blazesdk/widgets/models/IdsDataSourceRemoteDto;", "<init>", "(Lcom/blaze/blazesdk/widgets/models/RecommendationsDataSourceRemoteDto;Lcom/blaze/blazesdk/widgets/models/LabelsDataSourceRemoteDto;Lcom/blaze/blazesdk/widgets/models/IdsDataSourceRemoteDto;)V", "getRecommendationsDataSource", "()Lcom/blaze/blazesdk/widgets/models/RecommendationsDataSourceRemoteDto;", "getLabelsDataSource", "()Lcom/blaze/blazesdk/widgets/models/LabelsDataSourceRemoteDto;", "getIdsDataSource", "()Lcom/blaze/blazesdk/widgets/models/IdsDataSourceRemoteDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DataSourceRemoteDto {
    public static final int $stable = 8;

    @b6h("idsDataSource")
    @Nullable
    private final IdsDataSourceRemoteDto idsDataSource;

    @b6h("labelsDataSource")
    @Nullable
    private final LabelsDataSourceRemoteDto labelsDataSource;

    @b6h("recommendationsDataSource")
    @Nullable
    private final RecommendationsDataSourceRemoteDto recommendationsDataSource;

    public DataSourceRemoteDto(@Nullable RecommendationsDataSourceRemoteDto recommendationsDataSourceRemoteDto, @Nullable LabelsDataSourceRemoteDto labelsDataSourceRemoteDto, @Nullable IdsDataSourceRemoteDto idsDataSourceRemoteDto) {
        this.recommendationsDataSource = recommendationsDataSourceRemoteDto;
        this.labelsDataSource = labelsDataSourceRemoteDto;
        this.idsDataSource = idsDataSourceRemoteDto;
    }

    public static /* synthetic */ DataSourceRemoteDto copy$default(DataSourceRemoteDto dataSourceRemoteDto, RecommendationsDataSourceRemoteDto recommendationsDataSourceRemoteDto, LabelsDataSourceRemoteDto labelsDataSourceRemoteDto, IdsDataSourceRemoteDto idsDataSourceRemoteDto, int i, Object obj) {
        if ((i & 1) != 0) {
            recommendationsDataSourceRemoteDto = dataSourceRemoteDto.recommendationsDataSource;
        }
        if ((i & 2) != 0) {
            labelsDataSourceRemoteDto = dataSourceRemoteDto.labelsDataSource;
        }
        if ((i & 4) != 0) {
            idsDataSourceRemoteDto = dataSourceRemoteDto.idsDataSource;
        }
        return dataSourceRemoteDto.copy(recommendationsDataSourceRemoteDto, labelsDataSourceRemoteDto, idsDataSourceRemoteDto);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final RecommendationsDataSourceRemoteDto getRecommendationsDataSource() {
        return this.recommendationsDataSource;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final LabelsDataSourceRemoteDto getLabelsDataSource() {
        return this.labelsDataSource;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final IdsDataSourceRemoteDto getIdsDataSource() {
        return this.idsDataSource;
    }

    @NotNull
    public final DataSourceRemoteDto copy(@Nullable RecommendationsDataSourceRemoteDto recommendationsDataSource, @Nullable LabelsDataSourceRemoteDto labelsDataSource, @Nullable IdsDataSourceRemoteDto idsDataSource) {
        return new DataSourceRemoteDto(recommendationsDataSource, labelsDataSource, idsDataSource);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataSourceRemoteDto)) {
            return false;
        }
        DataSourceRemoteDto dataSourceRemoteDto = (DataSourceRemoteDto) other;
        return this.recommendationsDataSource == dataSourceRemoteDto.recommendationsDataSource && Intrinsics.c(this.labelsDataSource, dataSourceRemoteDto.labelsDataSource) && Intrinsics.c(this.idsDataSource, dataSourceRemoteDto.idsDataSource);
    }

    @Nullable
    public final IdsDataSourceRemoteDto getIdsDataSource() {
        return this.idsDataSource;
    }

    @Nullable
    public final LabelsDataSourceRemoteDto getLabelsDataSource() {
        return this.labelsDataSource;
    }

    @Nullable
    public final RecommendationsDataSourceRemoteDto getRecommendationsDataSource() {
        return this.recommendationsDataSource;
    }

    public int hashCode() {
        RecommendationsDataSourceRemoteDto recommendationsDataSourceRemoteDto = this.recommendationsDataSource;
        int hashCode = (recommendationsDataSourceRemoteDto == null ? 0 : recommendationsDataSourceRemoteDto.hashCode()) * 31;
        LabelsDataSourceRemoteDto labelsDataSourceRemoteDto = this.labelsDataSource;
        int hashCode2 = (hashCode + (labelsDataSourceRemoteDto == null ? 0 : labelsDataSourceRemoteDto.hashCode())) * 31;
        IdsDataSourceRemoteDto idsDataSourceRemoteDto = this.idsDataSource;
        return hashCode2 + (idsDataSourceRemoteDto != null ? idsDataSourceRemoteDto.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DataSourceRemoteDto(recommendationsDataSource=" + this.recommendationsDataSource + ", labelsDataSource=" + this.labelsDataSource + ", idsDataSource=" + this.idsDataSource + ')';
    }
}
