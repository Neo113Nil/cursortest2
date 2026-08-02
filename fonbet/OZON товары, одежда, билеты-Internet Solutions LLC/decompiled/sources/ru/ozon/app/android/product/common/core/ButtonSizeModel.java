package ru.ozon.app.android.product.common.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/product/common/core/ButtonSizeModel;", "", "", "widthButton", "", "clip", "<init>", "(IZ)V", "isWidth140", "()Z", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getWidthButton", "Z", "getClip", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ButtonSizeModel {
    private final boolean clip;
    private final int widthButton;

    public ButtonSizeModel(int i11, boolean z11) {
        this.widthButton = i11;
        this.clip = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonSizeModel)) {
            return false;
        }
        ButtonSizeModel buttonSizeModel = (ButtonSizeModel) other;
        return this.widthButton == buttonSizeModel.widthButton && this.clip == buttonSizeModel.clip;
    }

    public final boolean getClip() {
        return this.clip;
    }

    public final int getWidthButton() {
        return this.widthButton;
    }

    public int hashCode() {
        return Boolean.hashCode(this.clip) + (Integer.hashCode(this.widthButton) * 31);
    }

    public final boolean isWidth140() {
        int i11 = this.widthButton;
        return (i11 == -2 || i11 == -1) ? false : true;
    }

    @NotNull
    public String toString() {
        return "ButtonSizeModel(widthButton=" + this.widthButton + ", clip=" + this.clip + ")";
    }
}
