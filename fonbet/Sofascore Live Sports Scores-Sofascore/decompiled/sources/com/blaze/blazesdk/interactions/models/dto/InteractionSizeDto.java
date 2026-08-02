package com.blaze.blazesdk.interactions.models.dto;

import androidx.annotation.Keep;
import defpackage.b6h;
import defpackage.bf3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ>\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/blaze/blazesdk/interactions/models/dto/InteractionSizeDto;", "", "widthRatio", "", "heightRatio", "absoluteWidth", "", "absoluteHeight", "<init>", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getWidthRatio", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getHeightRatio", "getAbsoluteWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAbsoluteHeight", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/blaze/blazesdk/interactions/models/dto/InteractionSizeDto;", "equals", "", "other", "hashCode", "toString", "", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class InteractionSizeDto {
    public static final int $stable = 0;

    @b6h("absoluteHeight")
    @Nullable
    private final Integer absoluteHeight;

    @b6h("absoluteWidth")
    @Nullable
    private final Integer absoluteWidth;

    @b6h("heightRatio")
    @Nullable
    private final Float heightRatio;

    @b6h("widthRatio")
    @Nullable
    private final Float widthRatio;

    public InteractionSizeDto(@Nullable Float f, @Nullable Float f2, @Nullable Integer num, @Nullable Integer num2) {
        this.widthRatio = f;
        this.heightRatio = f2;
        this.absoluteWidth = num;
        this.absoluteHeight = num2;
    }

    public static /* synthetic */ InteractionSizeDto copy$default(InteractionSizeDto interactionSizeDto, Float f, Float f2, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = interactionSizeDto.widthRatio;
        }
        if ((i & 2) != 0) {
            f2 = interactionSizeDto.heightRatio;
        }
        if ((i & 4) != 0) {
            num = interactionSizeDto.absoluteWidth;
        }
        if ((i & 8) != 0) {
            num2 = interactionSizeDto.absoluteHeight;
        }
        return interactionSizeDto.copy(f, f2, num, num2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Float getWidthRatio() {
        return this.widthRatio;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Float getHeightRatio() {
        return this.heightRatio;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getAbsoluteWidth() {
        return this.absoluteWidth;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getAbsoluteHeight() {
        return this.absoluteHeight;
    }

    @NotNull
    public final InteractionSizeDto copy(@Nullable Float widthRatio, @Nullable Float heightRatio, @Nullable Integer absoluteWidth, @Nullable Integer absoluteHeight) {
        return new InteractionSizeDto(widthRatio, heightRatio, absoluteWidth, absoluteHeight);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InteractionSizeDto)) {
            return false;
        }
        InteractionSizeDto interactionSizeDto = (InteractionSizeDto) other;
        return Intrinsics.c(this.widthRatio, interactionSizeDto.widthRatio) && Intrinsics.c(this.heightRatio, interactionSizeDto.heightRatio) && Intrinsics.c(this.absoluteWidth, interactionSizeDto.absoluteWidth) && Intrinsics.c(this.absoluteHeight, interactionSizeDto.absoluteHeight);
    }

    @Nullable
    public final Integer getAbsoluteHeight() {
        return this.absoluteHeight;
    }

    @Nullable
    public final Integer getAbsoluteWidth() {
        return this.absoluteWidth;
    }

    @Nullable
    public final Float getHeightRatio() {
        return this.heightRatio;
    }

    @Nullable
    public final Float getWidthRatio() {
        return this.widthRatio;
    }

    public int hashCode() {
        Float f = this.widthRatio;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.heightRatio;
        int hashCode2 = (hashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num = this.absoluteWidth;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.absoluteHeight;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("InteractionSizeDto(widthRatio=");
        sb.append(this.widthRatio);
        sb.append(", heightRatio=");
        sb.append(this.heightRatio);
        sb.append(", absoluteWidth=");
        sb.append(this.absoluteWidth);
        sb.append(", absoluteHeight=");
        return bf3.n(sb, this.absoluteHeight, ')');
    }
}
