package ru.ozon.app.android.ugc.widgets.ugccounters.presentation;

import Am.C2438a;
import B0.C2454a;
import B4.V;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersImagesPreCreationConfig;", "", "", "imagesCount", "imagesWithLabelCount", "", "cornerRadius", "<init>", "(IIF)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getImagesCount", "getImagesWithLabelCount", "F", "getCornerRadius", "()F", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UgcCountersImagesPreCreationConfig {
    private final float cornerRadius;
    private final int imagesCount;
    private final int imagesWithLabelCount;

    public UgcCountersImagesPreCreationConfig(int i11, int i12, float f7) {
        this.imagesCount = i11;
        this.imagesWithLabelCount = i12;
        this.cornerRadius = f7;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UgcCountersImagesPreCreationConfig)) {
            return false;
        }
        UgcCountersImagesPreCreationConfig ugcCountersImagesPreCreationConfig = (UgcCountersImagesPreCreationConfig) other;
        return this.imagesCount == ugcCountersImagesPreCreationConfig.imagesCount && this.imagesWithLabelCount == ugcCountersImagesPreCreationConfig.imagesWithLabelCount && Float.compare(this.cornerRadius, ugcCountersImagesPreCreationConfig.cornerRadius) == 0;
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    public final int getImagesCount() {
        return this.imagesCount;
    }

    public final int getImagesWithLabelCount() {
        return this.imagesWithLabelCount;
    }

    public int hashCode() {
        return Float.hashCode(this.cornerRadius) + C2454a.a(this.imagesWithLabelCount, Integer.hashCode(this.imagesCount) * 31, 31);
    }

    @NotNull
    public String toString() {
        return V.b(this.cornerRadius, ")", C2438a.a("UgcCountersImagesPreCreationConfig(imagesCount=", this.imagesCount, ", imagesWithLabelCount=", ", cornerRadius=", this.imagesWithLabelCount));
    }
}
