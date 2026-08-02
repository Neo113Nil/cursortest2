package com.blaze.blazesdk.features.shared.models.shared_models;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/blaze/blazesdk/features/shared/models/shared_models/ThumbnailDto;", "", "rendition", "Lcom/blaze/blazesdk/features/shared/models/shared_models/RenditionsDto;", "renditions", "", "type", "Lcom/blaze/blazesdk/features/shared/models/shared_models/ThumbnailModelTypeDto;", "<init>", "(Lcom/blaze/blazesdk/features/shared/models/shared_models/RenditionsDto;Ljava/util/List;Lcom/blaze/blazesdk/features/shared/models/shared_models/ThumbnailModelTypeDto;)V", "getRendition", "()Lcom/blaze/blazesdk/features/shared/models/shared_models/RenditionsDto;", "getRenditions", "()Ljava/util/List;", "getType", "()Lcom/blaze/blazesdk/features/shared/models/shared_models/ThumbnailModelTypeDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ThumbnailDto {
    public static final int $stable = 8;

    @Nullable
    private final RenditionsDto rendition;

    @Nullable
    private final List<RenditionsDto> renditions;

    @Nullable
    private final ThumbnailModelTypeDto type;

    public ThumbnailDto(@Nullable RenditionsDto renditionsDto, @Nullable List<RenditionsDto> list, @Nullable ThumbnailModelTypeDto thumbnailModelTypeDto) {
        this.rendition = renditionsDto;
        this.renditions = list;
        this.type = thumbnailModelTypeDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ThumbnailDto copy$default(ThumbnailDto thumbnailDto, RenditionsDto renditionsDto, List list, ThumbnailModelTypeDto thumbnailModelTypeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            renditionsDto = thumbnailDto.rendition;
        }
        if ((i & 2) != 0) {
            list = thumbnailDto.renditions;
        }
        if ((i & 4) != 0) {
            thumbnailModelTypeDto = thumbnailDto.type;
        }
        return thumbnailDto.copy(renditionsDto, list, thumbnailModelTypeDto);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final RenditionsDto getRendition() {
        return this.rendition;
    }

    @Nullable
    public final List<RenditionsDto> component2() {
        return this.renditions;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final ThumbnailModelTypeDto getType() {
        return this.type;
    }

    @NotNull
    public final ThumbnailDto copy(@Nullable RenditionsDto rendition, @Nullable List<RenditionsDto> renditions, @Nullable ThumbnailModelTypeDto type) {
        return new ThumbnailDto(rendition, renditions, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThumbnailDto)) {
            return false;
        }
        ThumbnailDto thumbnailDto = (ThumbnailDto) other;
        return Intrinsics.c(this.rendition, thumbnailDto.rendition) && Intrinsics.c(this.renditions, thumbnailDto.renditions) && this.type == thumbnailDto.type;
    }

    @Nullable
    public final RenditionsDto getRendition() {
        return this.rendition;
    }

    @Nullable
    public final List<RenditionsDto> getRenditions() {
        return this.renditions;
    }

    @Nullable
    public final ThumbnailModelTypeDto getType() {
        return this.type;
    }

    public int hashCode() {
        RenditionsDto renditionsDto = this.rendition;
        int hashCode = (renditionsDto == null ? 0 : renditionsDto.hashCode()) * 31;
        List<RenditionsDto> list = this.renditions;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        ThumbnailModelTypeDto thumbnailModelTypeDto = this.type;
        return hashCode2 + (thumbnailModelTypeDto != null ? thumbnailModelTypeDto.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ThumbnailDto(rendition=" + this.rendition + ", renditions=" + this.renditions + ", type=" + this.type + ')';
    }
}
