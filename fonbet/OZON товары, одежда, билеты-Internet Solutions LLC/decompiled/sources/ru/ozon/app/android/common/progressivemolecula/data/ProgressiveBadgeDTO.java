package ru.ozon.app.android.common.progressivemolecula.data;

import G.g;
import K00.b;
import Nh.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\tHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveBadgeDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "backgroundColor", "", "progressBackgroundColor", "borderColor", "fillPercentage", "", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getProgressBackgroundColor", "getBorderColor", "getFillPercentage", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "progressive-molecula_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProgressiveBadgeDTO {

    @NotNull
    private final String backgroundColor;
    private final String borderColor;
    private final int fillPercentage;

    @NotNull
    private final String progressBackgroundColor;

    @NotNull
    private final TextDTO title;

    public ProgressiveBadgeDTO(@NotNull TextDTO title, @NotNull String backgroundColor, @NotNull String progressBackgroundColor, String str, int i11) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(progressBackgroundColor, "progressBackgroundColor");
        this.title = title;
        this.backgroundColor = backgroundColor;
        this.progressBackgroundColor = progressBackgroundColor;
        this.borderColor = str;
        this.fillPercentage = i11;
    }

    public static /* synthetic */ ProgressiveBadgeDTO copy$default(ProgressiveBadgeDTO progressiveBadgeDTO, TextDTO textDTO, String str, String str2, String str3, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            textDTO = progressiveBadgeDTO.title;
        }
        if ((i12 & 2) != 0) {
            str = progressiveBadgeDTO.backgroundColor;
        }
        if ((i12 & 4) != 0) {
            str2 = progressiveBadgeDTO.progressBackgroundColor;
        }
        if ((i12 & 8) != 0) {
            str3 = progressiveBadgeDTO.borderColor;
        }
        if ((i12 & 16) != 0) {
            i11 = progressiveBadgeDTO.fillPercentage;
        }
        int i13 = i11;
        String str4 = str2;
        return progressiveBadgeDTO.copy(textDTO, str, str4, str3, i13);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getProgressBackgroundColor() {
        return this.progressBackgroundColor;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBorderColor() {
        return this.borderColor;
    }

    /* renamed from: component5, reason: from getter */
    public final int getFillPercentage() {
        return this.fillPercentage;
    }

    @NotNull
    public final ProgressiveBadgeDTO copy(@NotNull TextDTO title, @NotNull String backgroundColor, @NotNull String progressBackgroundColor, String borderColor, int fillPercentage) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(progressBackgroundColor, "progressBackgroundColor");
        return new ProgressiveBadgeDTO(title, backgroundColor, progressBackgroundColor, borderColor, fillPercentage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressiveBadgeDTO)) {
            return false;
        }
        ProgressiveBadgeDTO progressiveBadgeDTO = (ProgressiveBadgeDTO) other;
        return Intrinsics.d(this.title, progressiveBadgeDTO.title) && Intrinsics.d(this.backgroundColor, progressiveBadgeDTO.backgroundColor) && Intrinsics.d(this.progressBackgroundColor, progressiveBadgeDTO.progressBackgroundColor) && Intrinsics.d(this.borderColor, progressiveBadgeDTO.borderColor) && this.fillPercentage == progressiveBadgeDTO.fillPercentage;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    public final int getFillPercentage() {
        return this.fillPercentage;
    }

    @NotNull
    public final String getProgressBackgroundColor() {
        return this.progressBackgroundColor;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        int a11 = g.a(g.a(this.title.hashCode() * 31, 31, this.backgroundColor), 31, this.progressBackgroundColor);
        String str = this.borderColor;
        return Integer.hashCode(this.fillPercentage) + ((a11 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        String str = this.backgroundColor;
        String str2 = this.progressBackgroundColor;
        String str3 = this.borderColor;
        int i11 = this.fillPercentage;
        StringBuilder f7 = D3.g.f("ProgressiveBadgeDTO(title=", textDTO, ", backgroundColor=", str, ", progressBackgroundColor=");
        a.h(f7, str2, ", borderColor=", str3, ", fillPercentage=");
        return b.e(i11, ")", f7);
    }
}
