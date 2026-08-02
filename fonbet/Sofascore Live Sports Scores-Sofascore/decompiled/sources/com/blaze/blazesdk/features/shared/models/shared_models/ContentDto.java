package com.blaze.blazesdk.features.shared.models.shared_models;

import androidx.annotation.Keep;
import defpackage.fc6;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001b\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/blaze/blazesdk/features/shared/models/shared_models/ContentDto;", "", "renditions", "", "Lcom/blaze/blazesdk/features/shared/models/shared_models/RenditionsDto;", "<init>", "(Ljava/util/List;)V", "getRenditions", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ContentDto {
    public static final int $stable = 8;

    @Nullable
    private final List<RenditionsDto> renditions;

    public ContentDto(@Nullable List<RenditionsDto> list) {
        this.renditions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContentDto copy$default(ContentDto contentDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = contentDto.renditions;
        }
        return contentDto.copy(list);
    }

    @Nullable
    public final List<RenditionsDto> component1() {
        return this.renditions;
    }

    @NotNull
    public final ContentDto copy(@Nullable List<RenditionsDto> renditions) {
        return new ContentDto(renditions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ContentDto) && Intrinsics.c(this.renditions, ((ContentDto) other).renditions);
    }

    @Nullable
    public final List<RenditionsDto> getRenditions() {
        return this.renditions;
    }

    public int hashCode() {
        List<RenditionsDto> list = this.renditions;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return fc6.p(new StringBuilder("ContentDto(renditions="), this.renditions, ')');
    }
}
