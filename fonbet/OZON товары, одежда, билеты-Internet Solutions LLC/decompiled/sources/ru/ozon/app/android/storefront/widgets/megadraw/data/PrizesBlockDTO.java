package ru.ozon.app.android.storefront.widgets.megadraw.data;

import B90.C2618u;
import Co.a;
import Pk0.b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003JC\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lru/ozon/app/android/storefront/widgets/megadraw/data/PrizesBlockDTO;", "", "backgroundColor", "", "countTitle", "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "progress", "", "gradientColors", "", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;FLjava/util/List;)V", "getBackgroundColor", "()Ljava/lang/String;", "getCountTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getProgress", "()F", "getGradientColors", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PrizesBlockDTO {
    public static final int $stable = 8;

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final TextDTO countTitle;
    private final List<String> gradientColors;
    private final float progress;

    @NotNull
    private final TextDTO subtitle;

    public PrizesBlockDTO(@NotNull String backgroundColor, @NotNull TextDTO countTitle, @NotNull TextDTO subtitle, float f7, List<String> list) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(countTitle, "countTitle");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.backgroundColor = backgroundColor;
        this.countTitle = countTitle;
        this.subtitle = subtitle;
        this.progress = f7;
        this.gradientColors = list;
    }

    public static /* synthetic */ PrizesBlockDTO copy$default(PrizesBlockDTO prizesBlockDTO, String str, TextDTO textDTO, TextDTO textDTO2, float f7, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = prizesBlockDTO.backgroundColor;
        }
        if ((i11 & 2) != 0) {
            textDTO = prizesBlockDTO.countTitle;
        }
        if ((i11 & 4) != 0) {
            textDTO2 = prizesBlockDTO.subtitle;
        }
        if ((i11 & 8) != 0) {
            f7 = prizesBlockDTO.progress;
        }
        if ((i11 & 16) != 0) {
            list = prizesBlockDTO.gradientColors;
        }
        List list2 = list;
        TextDTO textDTO3 = textDTO2;
        return prizesBlockDTO.copy(str, textDTO, textDTO3, f7, list2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getCountTitle() {
        return this.countTitle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final float getProgress() {
        return this.progress;
    }

    public final List<String> component5() {
        return this.gradientColors;
    }

    @NotNull
    public final PrizesBlockDTO copy(@NotNull String backgroundColor, @NotNull TextDTO countTitle, @NotNull TextDTO subtitle, float progress, List<String> gradientColors) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(countTitle, "countTitle");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        return new PrizesBlockDTO(backgroundColor, countTitle, subtitle, progress, gradientColors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrizesBlockDTO)) {
            return false;
        }
        PrizesBlockDTO prizesBlockDTO = (PrizesBlockDTO) other;
        return Intrinsics.d(this.backgroundColor, prizesBlockDTO.backgroundColor) && Intrinsics.d(this.countTitle, prizesBlockDTO.countTitle) && Intrinsics.d(this.subtitle, prizesBlockDTO.subtitle) && Float.compare(this.progress, prizesBlockDTO.progress) == 0 && Intrinsics.d(this.gradientColors, prizesBlockDTO.gradientColors);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final TextDTO getCountTitle() {
        return this.countTitle;
    }

    public final List<String> getGradientColors() {
        return this.gradientColors;
    }

    public final float getProgress() {
        return this.progress;
    }

    @NotNull
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        int a11 = b.a(this.progress, Ns.b.a(this.subtitle, Ns.b.a(this.countTitle, this.backgroundColor.hashCode() * 31, 31), 31), 31);
        List<String> list = this.gradientColors;
        return a11 + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.backgroundColor;
        TextDTO textDTO = this.countTitle;
        TextDTO textDTO2 = this.subtitle;
        float f7 = this.progress;
        List<String> list = this.gradientColors;
        StringBuilder b11 = a.b("PrizesBlockDTO(backgroundColor=", textDTO, str, ", countTitle=", ", subtitle=");
        b11.append(textDTO2);
        b11.append(", progress=");
        b11.append(f7);
        b11.append(", gradientColors=");
        return C2618u.h(b11, list, ")");
    }
}
