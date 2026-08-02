package ru.ozon.app.android.pdpvideomolecule.presentation.switchingimage;

import B0.C2454a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ:\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0018\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdpvideomolecule/presentation/switchingimage/SwitchingImageModel;", "", "", "isActive", "", "activeImage", "inActiveImage", "tintColor", "<init>", "(ZIILjava/lang/Integer;)V", "copy", "(ZIILjava/lang/Integer;)Lru/ozon/app/android/pdpvideomolecule/presentation/switchingimage/SwitchingImageModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "I", "getActiveImage", "getInActiveImage", "Ljava/lang/Integer;", "getTintColor", "()Ljava/lang/Integer;", "pdpvideomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SwitchingImageModel {
    private final int activeImage;
    private final int inActiveImage;
    private final boolean isActive;
    private final Integer tintColor;

    public SwitchingImageModel(boolean z11, int i11, int i12, Integer num) {
        this.isActive = z11;
        this.activeImage = i11;
        this.inActiveImage = i12;
        this.tintColor = num;
    }

    public static /* synthetic */ SwitchingImageModel copy$default(SwitchingImageModel switchingImageModel, boolean z11, int i11, int i12, Integer num, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z11 = switchingImageModel.isActive;
        }
        if ((i13 & 2) != 0) {
            i11 = switchingImageModel.activeImage;
        }
        if ((i13 & 4) != 0) {
            i12 = switchingImageModel.inActiveImage;
        }
        if ((i13 & 8) != 0) {
            num = switchingImageModel.tintColor;
        }
        return switchingImageModel.copy(z11, i11, i12, num);
    }

    @NotNull
    public final SwitchingImageModel copy(boolean isActive, int activeImage, int inActiveImage, Integer tintColor) {
        return new SwitchingImageModel(isActive, activeImage, inActiveImage, tintColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwitchingImageModel)) {
            return false;
        }
        SwitchingImageModel switchingImageModel = (SwitchingImageModel) other;
        return this.isActive == switchingImageModel.isActive && this.activeImage == switchingImageModel.activeImage && this.inActiveImage == switchingImageModel.inActiveImage && Intrinsics.d(this.tintColor, switchingImageModel.tintColor);
    }

    public final int getActiveImage() {
        return this.activeImage;
    }

    public final int getInActiveImage() {
        return this.inActiveImage;
    }

    public final Integer getTintColor() {
        return this.tintColor;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.inActiveImage, C2454a.a(this.activeImage, Boolean.hashCode(this.isActive) * 31, 31), 31);
        Integer num = this.tintColor;
        return a11 + (num == null ? 0 : num.hashCode());
    }

    /* renamed from: isActive, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    @NotNull
    public String toString() {
        return "SwitchingImageModel(isActive=" + this.isActive + ", activeImage=" + this.activeImage + ", inActiveImage=" + this.inActiveImage + ", tintColor=" + this.tintColor + ")";
    }

    public /* synthetic */ SwitchingImageModel(boolean z11, int i11, int i12, Integer num, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, i11, i12, (i13 & 8) != 0 ? null : num);
    }
}
