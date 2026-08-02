package com.blaze.blazesdk.widgets.models;

import androidx.annotation.Keep;
import defpackage.b6h;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/blaze/blazesdk/widgets/models/ObjectPositioningRemoteDto;", "", "xPosition", "Lcom/blaze/blazesdk/widgets/models/ObjectXPositionRemoteDto;", "yPosition", "Lcom/blaze/blazesdk/widgets/models/ObjectYPositionRemoteDto;", "<init>", "(Lcom/blaze/blazesdk/widgets/models/ObjectXPositionRemoteDto;Lcom/blaze/blazesdk/widgets/models/ObjectYPositionRemoteDto;)V", "getXPosition", "()Lcom/blaze/blazesdk/widgets/models/ObjectXPositionRemoteDto;", "setXPosition", "(Lcom/blaze/blazesdk/widgets/models/ObjectXPositionRemoteDto;)V", "getYPosition", "()Lcom/blaze/blazesdk/widgets/models/ObjectYPositionRemoteDto;", "setYPosition", "(Lcom/blaze/blazesdk/widgets/models/ObjectYPositionRemoteDto;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ObjectPositioningRemoteDto {
    public static final int $stable = 8;

    @b6h("xPosition")
    @Nullable
    private ObjectXPositionRemoteDto xPosition;

    @b6h("yPosition")
    @Nullable
    private ObjectYPositionRemoteDto yPosition;

    public ObjectPositioningRemoteDto(@Nullable ObjectXPositionRemoteDto objectXPositionRemoteDto, @Nullable ObjectYPositionRemoteDto objectYPositionRemoteDto) {
        this.xPosition = objectXPositionRemoteDto;
        this.yPosition = objectYPositionRemoteDto;
    }

    public static /* synthetic */ ObjectPositioningRemoteDto copy$default(ObjectPositioningRemoteDto objectPositioningRemoteDto, ObjectXPositionRemoteDto objectXPositionRemoteDto, ObjectYPositionRemoteDto objectYPositionRemoteDto, int i, Object obj) {
        if ((i & 1) != 0) {
            objectXPositionRemoteDto = objectPositioningRemoteDto.xPosition;
        }
        if ((i & 2) != 0) {
            objectYPositionRemoteDto = objectPositioningRemoteDto.yPosition;
        }
        return objectPositioningRemoteDto.copy(objectXPositionRemoteDto, objectYPositionRemoteDto);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final ObjectXPositionRemoteDto getXPosition() {
        return this.xPosition;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final ObjectYPositionRemoteDto getYPosition() {
        return this.yPosition;
    }

    @NotNull
    public final ObjectPositioningRemoteDto copy(@Nullable ObjectXPositionRemoteDto xPosition, @Nullable ObjectYPositionRemoteDto yPosition) {
        return new ObjectPositioningRemoteDto(xPosition, yPosition);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ObjectPositioningRemoteDto)) {
            return false;
        }
        ObjectPositioningRemoteDto objectPositioningRemoteDto = (ObjectPositioningRemoteDto) other;
        return this.xPosition == objectPositioningRemoteDto.xPosition && this.yPosition == objectPositioningRemoteDto.yPosition;
    }

    @Nullable
    public final ObjectXPositionRemoteDto getXPosition() {
        return this.xPosition;
    }

    @Nullable
    public final ObjectYPositionRemoteDto getYPosition() {
        return this.yPosition;
    }

    public int hashCode() {
        ObjectXPositionRemoteDto objectXPositionRemoteDto = this.xPosition;
        int hashCode = (objectXPositionRemoteDto == null ? 0 : objectXPositionRemoteDto.hashCode()) * 31;
        ObjectYPositionRemoteDto objectYPositionRemoteDto = this.yPosition;
        return hashCode + (objectYPositionRemoteDto != null ? objectYPositionRemoteDto.hashCode() : 0);
    }

    public final void setXPosition(@Nullable ObjectXPositionRemoteDto objectXPositionRemoteDto) {
        this.xPosition = objectXPositionRemoteDto;
    }

    public final void setYPosition(@Nullable ObjectYPositionRemoteDto objectYPositionRemoteDto) {
        this.yPosition = objectYPositionRemoteDto;
    }

    @NotNull
    public String toString() {
        return "ObjectPositioningRemoteDto(xPosition=" + this.xPosition + ", yPosition=" + this.yPosition + ')';
    }
}
