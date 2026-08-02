package spay.sdk.api;

import android.graphics.Typeface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lspay/sdk/api/SPayTypeface;", "", "regular", "Landroid/graphics/Typeface;", "medium", "semibold", "(Landroid/graphics/Typeface;Landroid/graphics/Typeface;Landroid/graphics/Typeface;)V", "getMedium", "()Landroid/graphics/Typeface;", "getRegular", "getSemibold", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SPayTypeface {

    @NotNull
    private final Typeface medium;

    @NotNull
    private final Typeface regular;

    @NotNull
    private final Typeface semibold;

    public SPayTypeface(@NotNull Typeface regular, @NotNull Typeface medium, @NotNull Typeface semibold) {
        Intrinsics.checkNotNullParameter(regular, "regular");
        Intrinsics.checkNotNullParameter(medium, "medium");
        Intrinsics.checkNotNullParameter(semibold, "semibold");
        this.regular = regular;
        this.medium = medium;
        this.semibold = semibold;
    }

    public static /* synthetic */ SPayTypeface copy$default(SPayTypeface sPayTypeface, Typeface typeface, Typeface typeface2, Typeface typeface3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            typeface = sPayTypeface.regular;
        }
        if ((i11 & 2) != 0) {
            typeface2 = sPayTypeface.medium;
        }
        if ((i11 & 4) != 0) {
            typeface3 = sPayTypeface.semibold;
        }
        return sPayTypeface.copy(typeface, typeface2, typeface3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Typeface getRegular() {
        return this.regular;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Typeface getMedium() {
        return this.medium;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Typeface getSemibold() {
        return this.semibold;
    }

    @NotNull
    public final SPayTypeface copy(@NotNull Typeface regular, @NotNull Typeface medium, @NotNull Typeface semibold) {
        Intrinsics.checkNotNullParameter(regular, "regular");
        Intrinsics.checkNotNullParameter(medium, "medium");
        Intrinsics.checkNotNullParameter(semibold, "semibold");
        return new SPayTypeface(regular, medium, semibold);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SPayTypeface)) {
            return false;
        }
        SPayTypeface sPayTypeface = (SPayTypeface) other;
        return Intrinsics.d(this.regular, sPayTypeface.regular) && Intrinsics.d(this.medium, sPayTypeface.medium) && Intrinsics.d(this.semibold, sPayTypeface.semibold);
    }

    @NotNull
    public final Typeface getMedium() {
        return this.medium;
    }

    @NotNull
    public final Typeface getRegular() {
        return this.regular;
    }

    @NotNull
    public final Typeface getSemibold() {
        return this.semibold;
    }

    public int hashCode() {
        return this.semibold.hashCode() + ((this.medium.hashCode() + (this.regular.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "SPayTypeface(regular=" + this.regular + ", medium=" + this.medium + ", semibold=" + this.semibold + ")";
    }
}
