package com.blaze.blazesdk.interactions.models.dto;

import androidx.annotation.Keep;
import defpackage.b6h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003JV\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0005HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0017\u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014¨\u0006'"}, d2 = {"Lcom/blaze/blazesdk/interactions/models/dto/InteractionPositionDto;", "", "xPosition", "Lcom/blaze/blazesdk/interactions/models/dto/InteractionObjectXPositionDto;", "xOffset", "", "xRelativeTo", "Lcom/blaze/blazesdk/interactions/models/dto/InteractionRelativeToDto;", "yPosition", "Lcom/blaze/blazesdk/interactions/models/dto/InteractionObjectYPositionDto;", "yOffset", "yRelativeTo", "<init>", "(Lcom/blaze/blazesdk/interactions/models/dto/InteractionObjectXPositionDto;Ljava/lang/Integer;Lcom/blaze/blazesdk/interactions/models/dto/InteractionRelativeToDto;Lcom/blaze/blazesdk/interactions/models/dto/InteractionObjectYPositionDto;Ljava/lang/Integer;Lcom/blaze/blazesdk/interactions/models/dto/InteractionRelativeToDto;)V", "getXPosition", "()Lcom/blaze/blazesdk/interactions/models/dto/InteractionObjectXPositionDto;", "getXOffset", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getXRelativeTo", "()Lcom/blaze/blazesdk/interactions/models/dto/InteractionRelativeToDto;", "getYPosition", "()Lcom/blaze/blazesdk/interactions/models/dto/InteractionObjectYPositionDto;", "getYOffset", "getYRelativeTo", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/blaze/blazesdk/interactions/models/dto/InteractionObjectXPositionDto;Ljava/lang/Integer;Lcom/blaze/blazesdk/interactions/models/dto/InteractionRelativeToDto;Lcom/blaze/blazesdk/interactions/models/dto/InteractionObjectYPositionDto;Ljava/lang/Integer;Lcom/blaze/blazesdk/interactions/models/dto/InteractionRelativeToDto;)Lcom/blaze/blazesdk/interactions/models/dto/InteractionPositionDto;", "equals", "", "other", "hashCode", "toString", "", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class InteractionPositionDto {
    public static final int $stable = 0;

    @b6h("xOffset")
    @Nullable
    private final Integer xOffset;

    @b6h("xPosition")
    @Nullable
    private final InteractionObjectXPositionDto xPosition;

    @b6h("xRelativeTo")
    @Nullable
    private final InteractionRelativeToDto xRelativeTo;

    @b6h("yOffset")
    @Nullable
    private final Integer yOffset;

    @b6h("yPosition")
    @Nullable
    private final InteractionObjectYPositionDto yPosition;

    @b6h("yRelativeTo")
    @Nullable
    private final InteractionRelativeToDto yRelativeTo;

    public InteractionPositionDto(@Nullable InteractionObjectXPositionDto interactionObjectXPositionDto, @Nullable Integer num, @Nullable InteractionRelativeToDto interactionRelativeToDto, @Nullable InteractionObjectYPositionDto interactionObjectYPositionDto, @Nullable Integer num2, @Nullable InteractionRelativeToDto interactionRelativeToDto2) {
        this.xPosition = interactionObjectXPositionDto;
        this.xOffset = num;
        this.xRelativeTo = interactionRelativeToDto;
        this.yPosition = interactionObjectYPositionDto;
        this.yOffset = num2;
        this.yRelativeTo = interactionRelativeToDto2;
    }

    public static /* synthetic */ InteractionPositionDto copy$default(InteractionPositionDto interactionPositionDto, InteractionObjectXPositionDto interactionObjectXPositionDto, Integer num, InteractionRelativeToDto interactionRelativeToDto, InteractionObjectYPositionDto interactionObjectYPositionDto, Integer num2, InteractionRelativeToDto interactionRelativeToDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            interactionObjectXPositionDto = interactionPositionDto.xPosition;
        }
        if ((i & 2) != 0) {
            num = interactionPositionDto.xOffset;
        }
        if ((i & 4) != 0) {
            interactionRelativeToDto = interactionPositionDto.xRelativeTo;
        }
        if ((i & 8) != 0) {
            interactionObjectYPositionDto = interactionPositionDto.yPosition;
        }
        if ((i & 16) != 0) {
            num2 = interactionPositionDto.yOffset;
        }
        if ((i & 32) != 0) {
            interactionRelativeToDto2 = interactionPositionDto.yRelativeTo;
        }
        Integer num3 = num2;
        InteractionRelativeToDto interactionRelativeToDto3 = interactionRelativeToDto2;
        return interactionPositionDto.copy(interactionObjectXPositionDto, num, interactionRelativeToDto, interactionObjectYPositionDto, num3, interactionRelativeToDto3);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final InteractionObjectXPositionDto getXPosition() {
        return this.xPosition;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getXOffset() {
        return this.xOffset;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final InteractionRelativeToDto getXRelativeTo() {
        return this.xRelativeTo;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final InteractionObjectYPositionDto getYPosition() {
        return this.yPosition;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getYOffset() {
        return this.yOffset;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final InteractionRelativeToDto getYRelativeTo() {
        return this.yRelativeTo;
    }

    @NotNull
    public final InteractionPositionDto copy(@Nullable InteractionObjectXPositionDto xPosition, @Nullable Integer xOffset, @Nullable InteractionRelativeToDto xRelativeTo, @Nullable InteractionObjectYPositionDto yPosition, @Nullable Integer yOffset, @Nullable InteractionRelativeToDto yRelativeTo) {
        return new InteractionPositionDto(xPosition, xOffset, xRelativeTo, yPosition, yOffset, yRelativeTo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InteractionPositionDto)) {
            return false;
        }
        InteractionPositionDto interactionPositionDto = (InteractionPositionDto) other;
        return this.xPosition == interactionPositionDto.xPosition && Intrinsics.c(this.xOffset, interactionPositionDto.xOffset) && this.xRelativeTo == interactionPositionDto.xRelativeTo && this.yPosition == interactionPositionDto.yPosition && Intrinsics.c(this.yOffset, interactionPositionDto.yOffset) && this.yRelativeTo == interactionPositionDto.yRelativeTo;
    }

    @Nullable
    public final Integer getXOffset() {
        return this.xOffset;
    }

    @Nullable
    public final InteractionObjectXPositionDto getXPosition() {
        return this.xPosition;
    }

    @Nullable
    public final InteractionRelativeToDto getXRelativeTo() {
        return this.xRelativeTo;
    }

    @Nullable
    public final Integer getYOffset() {
        return this.yOffset;
    }

    @Nullable
    public final InteractionObjectYPositionDto getYPosition() {
        return this.yPosition;
    }

    @Nullable
    public final InteractionRelativeToDto getYRelativeTo() {
        return this.yRelativeTo;
    }

    public int hashCode() {
        InteractionObjectXPositionDto interactionObjectXPositionDto = this.xPosition;
        int hashCode = (interactionObjectXPositionDto == null ? 0 : interactionObjectXPositionDto.hashCode()) * 31;
        Integer num = this.xOffset;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        InteractionRelativeToDto interactionRelativeToDto = this.xRelativeTo;
        int hashCode3 = (hashCode2 + (interactionRelativeToDto == null ? 0 : interactionRelativeToDto.hashCode())) * 31;
        InteractionObjectYPositionDto interactionObjectYPositionDto = this.yPosition;
        int hashCode4 = (hashCode3 + (interactionObjectYPositionDto == null ? 0 : interactionObjectYPositionDto.hashCode())) * 31;
        Integer num2 = this.yOffset;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        InteractionRelativeToDto interactionRelativeToDto2 = this.yRelativeTo;
        return hashCode5 + (interactionRelativeToDto2 != null ? interactionRelativeToDto2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "InteractionPositionDto(xPosition=" + this.xPosition + ", xOffset=" + this.xOffset + ", xRelativeTo=" + this.xRelativeTo + ", yPosition=" + this.yPosition + ", yOffset=" + this.yOffset + ", yRelativeTo=" + this.yRelativeTo + ')';
    }
}
