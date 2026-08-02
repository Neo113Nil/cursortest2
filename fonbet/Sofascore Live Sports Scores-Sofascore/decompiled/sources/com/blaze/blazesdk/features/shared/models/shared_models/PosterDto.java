package com.blaze.blazesdk.features.shared.models.shared_models;

import androidx.annotation.Keep;
import defpackage.lnb;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/blaze/blazesdk/features/shared/models/shared_models/PosterDto;", "", "rendition", "Lcom/blaze/blazesdk/features/shared/models/shared_models/RenditionsDto;", "renditions", "", "type", "", "<init>", "(Lcom/blaze/blazesdk/features/shared/models/shared_models/RenditionsDto;Ljava/util/List;Ljava/lang/String;)V", "getRendition", "()Lcom/blaze/blazesdk/features/shared/models/shared_models/RenditionsDto;", "getRenditions", "()Ljava/util/List;", "getType", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PosterDto {
    public static final int $stable = 8;

    @Nullable
    private final RenditionsDto rendition;

    @Nullable
    private final List<RenditionsDto> renditions;

    @Nullable
    private final String type;

    public PosterDto(@Nullable RenditionsDto renditionsDto, @Nullable List<RenditionsDto> list, @Nullable String str) {
        this.rendition = renditionsDto;
        this.renditions = list;
        this.type = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PosterDto copy$default(PosterDto posterDto, RenditionsDto renditionsDto, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            renditionsDto = posterDto.rendition;
        }
        if ((i & 2) != 0) {
            list = posterDto.renditions;
        }
        if ((i & 4) != 0) {
            str = posterDto.type;
        }
        return posterDto.copy(renditionsDto, list, str);
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
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final PosterDto copy(@Nullable RenditionsDto rendition, @Nullable List<RenditionsDto> renditions, @Nullable String type) {
        return new PosterDto(rendition, renditions, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PosterDto)) {
            return false;
        }
        PosterDto posterDto = (PosterDto) other;
        return Intrinsics.c(this.rendition, posterDto.rendition) && Intrinsics.c(this.renditions, posterDto.renditions) && Intrinsics.c(this.type, posterDto.type);
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
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        RenditionsDto renditionsDto = this.rendition;
        int hashCode = (renditionsDto == null ? 0 : renditionsDto.hashCode()) * 31;
        List<RenditionsDto> list = this.renditions;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.type;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("PosterDto(rendition=");
        sb.append(this.rendition);
        sb.append(", renditions=");
        sb.append(this.renditions);
        sb.append(", type=");
        return lnb.q(sb, this.type, ')');
    }
}
