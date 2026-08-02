package com.blaze.blazesdk.features.shared.models.shared_models;

import androidx.annotation.Keep;
import com.ironsource.U3;
import defpackage.b6h;
import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/blaze/blazesdk/features/shared/models/shared_models/CTAEnhancementsDto;", "", "animationType", "Lcom/blaze/blazesdk/features/shared/models/shared_models/CTAEnhancementsDto$AnimationType;", "hasSwipeUp", "", "<init>", "(Lcom/blaze/blazesdk/features/shared/models/shared_models/CTAEnhancementsDto$AnimationType;Ljava/lang/Boolean;)V", "getAnimationType", "()Lcom/blaze/blazesdk/features/shared/models/shared_models/CTAEnhancementsDto$AnimationType;", "getHasSwipeUp", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Lcom/blaze/blazesdk/features/shared/models/shared_models/CTAEnhancementsDto$AnimationType;Ljava/lang/Boolean;)Lcom/blaze/blazesdk/features/shared/models/shared_models/CTAEnhancementsDto;", "equals", "other", "hashCode", "", "toString", "", "AnimationType", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CTAEnhancementsDto {
    public static final int $stable = 0;

    @b6h("animationType")
    @Nullable
    private final AnimationType animationType;

    @b6h("hasSwipeUp")
    @Nullable
    private final Boolean hasSwipeUp;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/blaze/blazesdk/features/shared/models/shared_models/CTAEnhancementsDto$AnimationType;", "", U3.i.X, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "GROWING", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnimationType {
        private static final /* synthetic */ jp5 $ENTRIES;
        private static final /* synthetic */ AnimationType[] $VALUES;

        @b6h("Growing")
        public static final AnimationType GROWING = new AnimationType("GROWING", 0, "Growing");

        @NotNull
        private final String value;

        private static final /* synthetic */ AnimationType[] $values() {
            return new AnimationType[]{GROWING};
        }

        static {
            AnimationType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = gz8.G($values);
        }

        private AnimationType(String str, int i, String str2) {
            this.value = str2;
        }

        @NotNull
        public static jp5 getEntries() {
            return $ENTRIES;
        }

        public static AnimationType valueOf(String str) {
            return (AnimationType) Enum.valueOf(AnimationType.class, str);
        }

        public static AnimationType[] values() {
            return (AnimationType[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public CTAEnhancementsDto(@Nullable AnimationType animationType, @Nullable Boolean bool) {
        this.animationType = animationType;
        this.hasSwipeUp = bool;
    }

    public static /* synthetic */ CTAEnhancementsDto copy$default(CTAEnhancementsDto cTAEnhancementsDto, AnimationType animationType, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            animationType = cTAEnhancementsDto.animationType;
        }
        if ((i & 2) != 0) {
            bool = cTAEnhancementsDto.hasSwipeUp;
        }
        return cTAEnhancementsDto.copy(animationType, bool);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final AnimationType getAnimationType() {
        return this.animationType;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Boolean getHasSwipeUp() {
        return this.hasSwipeUp;
    }

    @NotNull
    public final CTAEnhancementsDto copy(@Nullable AnimationType animationType, @Nullable Boolean hasSwipeUp) {
        return new CTAEnhancementsDto(animationType, hasSwipeUp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CTAEnhancementsDto)) {
            return false;
        }
        CTAEnhancementsDto cTAEnhancementsDto = (CTAEnhancementsDto) other;
        return this.animationType == cTAEnhancementsDto.animationType && Intrinsics.c(this.hasSwipeUp, cTAEnhancementsDto.hasSwipeUp);
    }

    @Nullable
    public final AnimationType getAnimationType() {
        return this.animationType;
    }

    @Nullable
    public final Boolean getHasSwipeUp() {
        return this.hasSwipeUp;
    }

    public int hashCode() {
        AnimationType animationType = this.animationType;
        int hashCode = (animationType == null ? 0 : animationType.hashCode()) * 31;
        Boolean bool = this.hasSwipeUp;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CTAEnhancementsDto(animationType=" + this.animationType + ", hasSwipeUp=" + this.hasSwipeUp + ')';
    }
}
