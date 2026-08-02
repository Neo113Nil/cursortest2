package ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data;

import C.o0;
import G.g;
import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/GradientTitleDTO;", "", "text", "", "leftColor", "rightColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getLeftColor", "getRightColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class GradientTitleDTO {
    public static final int $stable = 0;

    @NotNull
    private final String leftColor;

    @NotNull
    private final String rightColor;

    @NotNull
    private final String text;

    public GradientTitleDTO(@NotNull String text, @NotNull String leftColor, @NotNull String rightColor) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(leftColor, "leftColor");
        Intrinsics.checkNotNullParameter(rightColor, "rightColor");
        this.text = text;
        this.leftColor = leftColor;
        this.rightColor = rightColor;
    }

    public static /* synthetic */ GradientTitleDTO copy$default(GradientTitleDTO gradientTitleDTO, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = gradientTitleDTO.text;
        }
        if ((i11 & 2) != 0) {
            str2 = gradientTitleDTO.leftColor;
        }
        if ((i11 & 4) != 0) {
            str3 = gradientTitleDTO.rightColor;
        }
        return gradientTitleDTO.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getLeftColor() {
        return this.leftColor;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getRightColor() {
        return this.rightColor;
    }

    @NotNull
    public final GradientTitleDTO copy(@NotNull String text, @NotNull String leftColor, @NotNull String rightColor) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(leftColor, "leftColor");
        Intrinsics.checkNotNullParameter(rightColor, "rightColor");
        return new GradientTitleDTO(text, leftColor, rightColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GradientTitleDTO)) {
            return false;
        }
        GradientTitleDTO gradientTitleDTO = (GradientTitleDTO) other;
        return Intrinsics.d(this.text, gradientTitleDTO.text) && Intrinsics.d(this.leftColor, gradientTitleDTO.leftColor) && Intrinsics.d(this.rightColor, gradientTitleDTO.rightColor);
    }

    @NotNull
    public final String getLeftColor() {
        return this.leftColor;
    }

    @NotNull
    public final String getRightColor() {
        return this.rightColor;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.rightColor.hashCode() + g.a(this.text.hashCode() * 31, 31, this.leftColor);
    }

    @NotNull
    public String toString() {
        String str = this.text;
        String str2 = this.leftColor;
        return o0.c(C3660k.d("GradientTitleDTO(text=", str, ", leftColor=", str2, ", rightColor="), this.rightColor, ")");
    }
}
