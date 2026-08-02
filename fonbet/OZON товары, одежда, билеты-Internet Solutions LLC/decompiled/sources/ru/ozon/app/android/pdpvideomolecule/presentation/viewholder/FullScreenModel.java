package ru.ozon.app.android.pdpvideomolecule.presentation.viewholder;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/FullScreenModel;", "", "", "screenOrientation", "", "isFullScreen", "<init>", "(IZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getScreenOrientation", "Z", "()Z", "pdpvideomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FullScreenModel {
    private final boolean isFullScreen;
    private final int screenOrientation;

    public FullScreenModel(int i11, boolean z11) {
        this.screenOrientation = i11;
        this.isFullScreen = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FullScreenModel)) {
            return false;
        }
        FullScreenModel fullScreenModel = (FullScreenModel) other;
        return this.screenOrientation == fullScreenModel.screenOrientation && this.isFullScreen == fullScreenModel.isFullScreen;
    }

    public final int getScreenOrientation() {
        return this.screenOrientation;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isFullScreen) + (Integer.hashCode(this.screenOrientation) * 31);
    }

    /* renamed from: isFullScreen, reason: from getter */
    public final boolean getIsFullScreen() {
        return this.isFullScreen;
    }

    @NotNull
    public String toString() {
        return "FullScreenModel(screenOrientation=" + this.screenOrientation + ", isFullScreen=" + this.isFullScreen + ")";
    }
}
