package ru.ozon.app.android.csma.orderTracking.data;

import Fm.C3051a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ2\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\r¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/csma/orderTracking/data/AnimationParamsDTO;", "", "millisecondsPerPixel", "", "startDelay", "", "restartDelay", "<init>", "(Ljava/lang/Float;Ljava/lang/Long;Ljava/lang/Long;)V", "getMillisecondsPerPixel", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getStartDelay", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRestartDelay", "component1", "component2", "component3", "copy", "(Ljava/lang/Float;Ljava/lang/Long;Ljava/lang/Long;)Lru/ozon/app/android/csma/orderTracking/data/AnimationParamsDTO;", "equals", "", "other", "hashCode", "", "toString", "", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AnimationParamsDTO {
    private final Float millisecondsPerPixel;
    private final Long restartDelay;
    private final Long startDelay;

    public AnimationParamsDTO(Float f7, Long l11, Long l12) {
        this.millisecondsPerPixel = f7;
        this.startDelay = l11;
        this.restartDelay = l12;
    }

    public static /* synthetic */ AnimationParamsDTO copy$default(AnimationParamsDTO animationParamsDTO, Float f7, Long l11, Long l12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f7 = animationParamsDTO.millisecondsPerPixel;
        }
        if ((i11 & 2) != 0) {
            l11 = animationParamsDTO.startDelay;
        }
        if ((i11 & 4) != 0) {
            l12 = animationParamsDTO.restartDelay;
        }
        return animationParamsDTO.copy(f7, l11, l12);
    }

    /* renamed from: component1, reason: from getter */
    public final Float getMillisecondsPerPixel() {
        return this.millisecondsPerPixel;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getStartDelay() {
        return this.startDelay;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getRestartDelay() {
        return this.restartDelay;
    }

    @NotNull
    public final AnimationParamsDTO copy(Float millisecondsPerPixel, Long startDelay, Long restartDelay) {
        return new AnimationParamsDTO(millisecondsPerPixel, startDelay, restartDelay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnimationParamsDTO)) {
            return false;
        }
        AnimationParamsDTO animationParamsDTO = (AnimationParamsDTO) other;
        return Intrinsics.d(this.millisecondsPerPixel, animationParamsDTO.millisecondsPerPixel) && Intrinsics.d(this.startDelay, animationParamsDTO.startDelay) && Intrinsics.d(this.restartDelay, animationParamsDTO.restartDelay);
    }

    public final Float getMillisecondsPerPixel() {
        return this.millisecondsPerPixel;
    }

    public final Long getRestartDelay() {
        return this.restartDelay;
    }

    public final Long getStartDelay() {
        return this.startDelay;
    }

    public int hashCode() {
        Float f7 = this.millisecondsPerPixel;
        int hashCode = (f7 == null ? 0 : f7.hashCode()) * 31;
        Long l11 = this.startDelay;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.restartDelay;
        return hashCode2 + (l12 != null ? l12.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Float f7 = this.millisecondsPerPixel;
        Long l11 = this.startDelay;
        Long l12 = this.restartDelay;
        StringBuilder sb2 = new StringBuilder("AnimationParamsDTO(millisecondsPerPixel=");
        sb2.append(f7);
        sb2.append(", startDelay=");
        sb2.append(l11);
        sb2.append(", restartDelay=");
        return C3051a.d(sb2, l12, ")");
    }
}
