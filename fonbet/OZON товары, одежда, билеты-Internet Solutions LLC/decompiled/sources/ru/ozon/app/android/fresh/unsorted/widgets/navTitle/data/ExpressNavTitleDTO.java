package ru.ozon.app.android.fresh.unsorted.widgets.navTitle.data;

import C.o0;
import G.g;
import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/navTitle/data/ExpressNavTitleDTO;", "", "text", "", "textStyle", "textColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getTextStyle", "getTextColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ExpressNavTitleDTO {
    public static final int $stable = 0;

    @NotNull
    private final String text;

    @NotNull
    private final String textColor;

    @NotNull
    private final String textStyle;

    public ExpressNavTitleDTO(@NotNull String text, @NotNull String textStyle, @NotNull String textColor) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        this.text = text;
        this.textStyle = textStyle;
        this.textColor = textColor;
    }

    public static /* synthetic */ ExpressNavTitleDTO copy$default(ExpressNavTitleDTO expressNavTitleDTO, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = expressNavTitleDTO.text;
        }
        if ((i11 & 2) != 0) {
            str2 = expressNavTitleDTO.textStyle;
        }
        if ((i11 & 4) != 0) {
            str3 = expressNavTitleDTO.textColor;
        }
        return expressNavTitleDTO.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTextStyle() {
        return this.textStyle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    @NotNull
    public final ExpressNavTitleDTO copy(@NotNull String text, @NotNull String textStyle, @NotNull String textColor) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        return new ExpressNavTitleDTO(text, textStyle, textColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpressNavTitleDTO)) {
            return false;
        }
        ExpressNavTitleDTO expressNavTitleDTO = (ExpressNavTitleDTO) other;
        return Intrinsics.d(this.text, expressNavTitleDTO.text) && Intrinsics.d(this.textStyle, expressNavTitleDTO.textStyle) && Intrinsics.d(this.textColor, expressNavTitleDTO.textColor);
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final String getTextColor() {
        return this.textColor;
    }

    @NotNull
    public final String getTextStyle() {
        return this.textStyle;
    }

    public int hashCode() {
        return this.textColor.hashCode() + g.a(this.text.hashCode() * 31, 31, this.textStyle);
    }

    @NotNull
    public String toString() {
        String str = this.text;
        String str2 = this.textStyle;
        return o0.c(C3660k.d("ExpressNavTitleDTO(text=", str, ", textStyle=", str2, ", textColor="), this.textColor, ")");
    }
}
