package ru.ozon.app.android.common.serviceCarousel.core;

import A00.a;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/common/serviceCarousel/core/LMStateSaveUpdate;", "LA00/a$J$a;", "", "carouselId", "Landroid/os/Parcelable;", "layoutManagerState", "<init>", "(Ljava/lang/Long;Landroid/os/Parcelable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getCarouselId", "()Ljava/lang/Long;", "Landroid/os/Parcelable;", "getLayoutManagerState", "()Landroid/os/Parcelable;", "service-carousel_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class LMStateSaveUpdate implements a.J.InterfaceC0007a {
    private final Long carouselId;
    private final Parcelable layoutManagerState;

    public LMStateSaveUpdate(Long l11, Parcelable parcelable) {
        this.carouselId = l11;
        this.layoutManagerState = parcelable;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LMStateSaveUpdate)) {
            return false;
        }
        LMStateSaveUpdate lMStateSaveUpdate = (LMStateSaveUpdate) other;
        return Intrinsics.d(this.carouselId, lMStateSaveUpdate.carouselId) && Intrinsics.d(this.layoutManagerState, lMStateSaveUpdate.layoutManagerState);
    }

    public final Long getCarouselId() {
        return this.carouselId;
    }

    public final Parcelable getLayoutManagerState() {
        return this.layoutManagerState;
    }

    public int hashCode() {
        Long l11 = this.carouselId;
        int hashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        Parcelable parcelable = this.layoutManagerState;
        return hashCode + (parcelable != null ? parcelable.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LMStateSaveUpdate(carouselId=" + this.carouselId + ", layoutManagerState=" + this.layoutManagerState + ")";
    }
}
