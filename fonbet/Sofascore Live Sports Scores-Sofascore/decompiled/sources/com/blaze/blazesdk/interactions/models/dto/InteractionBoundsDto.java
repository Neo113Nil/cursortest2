package com.blaze.blazesdk.interactions.models.dto;

import androidx.annotation.Keep;
import defpackage.b6h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/blaze/blazesdk/interactions/models/dto/InteractionBoundsDto;", "", "position", "Lcom/blaze/blazesdk/interactions/models/dto/InteractionPositionDto;", "size", "Lcom/blaze/blazesdk/interactions/models/dto/InteractionSizeDto;", "<init>", "(Lcom/blaze/blazesdk/interactions/models/dto/InteractionPositionDto;Lcom/blaze/blazesdk/interactions/models/dto/InteractionSizeDto;)V", "getPosition", "()Lcom/blaze/blazesdk/interactions/models/dto/InteractionPositionDto;", "getSize", "()Lcom/blaze/blazesdk/interactions/models/dto/InteractionSizeDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class InteractionBoundsDto {
    public static final int $stable = 0;

    @b6h("position")
    @Nullable
    private final InteractionPositionDto position;

    @b6h("size")
    @Nullable
    private final InteractionSizeDto size;

    public InteractionBoundsDto(@Nullable InteractionPositionDto interactionPositionDto, @Nullable InteractionSizeDto interactionSizeDto) {
        this.position = interactionPositionDto;
        this.size = interactionSizeDto;
    }

    public static /* synthetic */ InteractionBoundsDto copy$default(InteractionBoundsDto interactionBoundsDto, InteractionPositionDto interactionPositionDto, InteractionSizeDto interactionSizeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            interactionPositionDto = interactionBoundsDto.position;
        }
        if ((i & 2) != 0) {
            interactionSizeDto = interactionBoundsDto.size;
        }
        return interactionBoundsDto.copy(interactionPositionDto, interactionSizeDto);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final InteractionPositionDto getPosition() {
        return this.position;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final InteractionSizeDto getSize() {
        return this.size;
    }

    @NotNull
    public final InteractionBoundsDto copy(@Nullable InteractionPositionDto position, @Nullable InteractionSizeDto size) {
        return new InteractionBoundsDto(position, size);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InteractionBoundsDto)) {
            return false;
        }
        InteractionBoundsDto interactionBoundsDto = (InteractionBoundsDto) other;
        return Intrinsics.c(this.position, interactionBoundsDto.position) && Intrinsics.c(this.size, interactionBoundsDto.size);
    }

    @Nullable
    public final InteractionPositionDto getPosition() {
        return this.position;
    }

    @Nullable
    public final InteractionSizeDto getSize() {
        return this.size;
    }

    public int hashCode() {
        InteractionPositionDto interactionPositionDto = this.position;
        int hashCode = (interactionPositionDto == null ? 0 : interactionPositionDto.hashCode()) * 31;
        InteractionSizeDto interactionSizeDto = this.size;
        return hashCode + (interactionSizeDto != null ? interactionSizeDto.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "InteractionBoundsDto(position=" + this.position + ", size=" + this.size + ')';
    }
}
