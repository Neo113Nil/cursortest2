package com.blaze.blazesdk.features.shared.models.shared_models;

import androidx.annotation.Keep;
import com.blaze.blazesdk.features.shared.models.ui_shared.BaseLayerType;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/blaze/blazesdk/features/shared/models/shared_models/BaseLayerDto;", "", "type", "Lcom/blaze/blazesdk/features/shared/models/ui_shared/BaseLayerType;", HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT, "Lcom/blaze/blazesdk/features/shared/models/shared_models/ContentDto;", "<init>", "(Lcom/blaze/blazesdk/features/shared/models/ui_shared/BaseLayerType;Lcom/blaze/blazesdk/features/shared/models/shared_models/ContentDto;)V", "getType", "()Lcom/blaze/blazesdk/features/shared/models/ui_shared/BaseLayerType;", "getContent", "()Lcom/blaze/blazesdk/features/shared/models/shared_models/ContentDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BaseLayerDto {
    public static final int $stable = 8;

    @Nullable
    private final ContentDto content;

    @Nullable
    private final BaseLayerType type;

    public BaseLayerDto(@Nullable BaseLayerType baseLayerType, @Nullable ContentDto contentDto) {
        this.type = baseLayerType;
        this.content = contentDto;
    }

    public static /* synthetic */ BaseLayerDto copy$default(BaseLayerDto baseLayerDto, BaseLayerType baseLayerType, ContentDto contentDto, int i, Object obj) {
        if ((i & 1) != 0) {
            baseLayerType = baseLayerDto.type;
        }
        if ((i & 2) != 0) {
            contentDto = baseLayerDto.content;
        }
        return baseLayerDto.copy(baseLayerType, contentDto);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final BaseLayerType getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final ContentDto getContent() {
        return this.content;
    }

    @NotNull
    public final BaseLayerDto copy(@Nullable BaseLayerType type, @Nullable ContentDto content) {
        return new BaseLayerDto(type, content);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseLayerDto)) {
            return false;
        }
        BaseLayerDto baseLayerDto = (BaseLayerDto) other;
        return this.type == baseLayerDto.type && Intrinsics.c(this.content, baseLayerDto.content);
    }

    @Nullable
    public final ContentDto getContent() {
        return this.content;
    }

    @Nullable
    public final BaseLayerType getType() {
        return this.type;
    }

    public int hashCode() {
        BaseLayerType baseLayerType = this.type;
        int hashCode = (baseLayerType == null ? 0 : baseLayerType.hashCode()) * 31;
        ContentDto contentDto = this.content;
        return hashCode + (contentDto != null ? contentDto.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BaseLayerDto(type=" + this.type + ", content=" + this.content + ')';
    }
}
