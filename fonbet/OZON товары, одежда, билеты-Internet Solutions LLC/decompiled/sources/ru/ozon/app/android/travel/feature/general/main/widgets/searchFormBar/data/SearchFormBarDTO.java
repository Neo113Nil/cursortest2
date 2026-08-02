package ru.ozon.app.android.travel.feature.general.main.widgets.searchFormBar.data;

import El.C2971a;
import Nh.a;
import Ns.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001%B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JK\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/data/SearchFormBarDTO;", "", "backgroundColor", "", "bar", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/data/SearchFormBarDTO$Bar;", "leftPatchColor", "rightPatchColor", "commonSettings", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/data/SearchFormBarDTO$Bar;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "getBackgroundColor", "()Ljava/lang/String;", "getBar", "()Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/data/SearchFormBarDTO$Bar;", "getLeftPatchColor", "getRightPatchColor", "getCommonSettings", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Bar", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SearchFormBarDTO {
    public static final int $stable = IconDTO.$stable;

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final Bar bar;
    private final CommonControlSettings commonSettings;

    @EnumNullFallback
    @NotNull
    private final CornerRadius cornerRadius;
    private final String leftPatchColor;
    private final String rightPatchColor;

    public SearchFormBarDTO(@NotNull String backgroundColor, @NotNull Bar bar, String str, String str2, CommonControlSettings commonControlSettings, @NotNull CornerRadius cornerRadius) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(bar, "bar");
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        this.backgroundColor = backgroundColor;
        this.bar = bar;
        this.leftPatchColor = str;
        this.rightPatchColor = str2;
        this.commonSettings = commonControlSettings;
        this.cornerRadius = cornerRadius;
    }

    public static /* synthetic */ SearchFormBarDTO copy$default(SearchFormBarDTO searchFormBarDTO, String str, Bar bar, String str2, String str3, CommonControlSettings commonControlSettings, CornerRadius cornerRadius, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = searchFormBarDTO.backgroundColor;
        }
        if ((i11 & 2) != 0) {
            bar = searchFormBarDTO.bar;
        }
        if ((i11 & 4) != 0) {
            str2 = searchFormBarDTO.leftPatchColor;
        }
        if ((i11 & 8) != 0) {
            str3 = searchFormBarDTO.rightPatchColor;
        }
        if ((i11 & 16) != 0) {
            commonControlSettings = searchFormBarDTO.commonSettings;
        }
        if ((i11 & 32) != 0) {
            cornerRadius = searchFormBarDTO.cornerRadius;
        }
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        CornerRadius cornerRadius2 = cornerRadius;
        return searchFormBarDTO.copy(str, bar, str2, str3, commonControlSettings2, cornerRadius2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Bar getBar() {
        return this.bar;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLeftPatchColor() {
        return this.leftPatchColor;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRightPatchColor() {
        return this.rightPatchColor;
    }

    /* renamed from: component5, reason: from getter */
    public final CommonControlSettings getCommonSettings() {
        return this.commonSettings;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final SearchFormBarDTO copy(@NotNull String backgroundColor, @NotNull Bar bar, String leftPatchColor, String rightPatchColor, CommonControlSettings commonSettings, @NotNull CornerRadius cornerRadius) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(bar, "bar");
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        return new SearchFormBarDTO(backgroundColor, bar, leftPatchColor, rightPatchColor, commonSettings, cornerRadius);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchFormBarDTO)) {
            return false;
        }
        SearchFormBarDTO searchFormBarDTO = (SearchFormBarDTO) other;
        return Intrinsics.d(this.backgroundColor, searchFormBarDTO.backgroundColor) && Intrinsics.d(this.bar, searchFormBarDTO.bar) && Intrinsics.d(this.leftPatchColor, searchFormBarDTO.leftPatchColor) && Intrinsics.d(this.rightPatchColor, searchFormBarDTO.rightPatchColor) && Intrinsics.d(this.commonSettings, searchFormBarDTO.commonSettings) && this.cornerRadius == searchFormBarDTO.cornerRadius;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final Bar getBar() {
        return this.bar;
    }

    public final CommonControlSettings getCommonSettings() {
        return this.commonSettings;
    }

    @NotNull
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    public final String getLeftPatchColor() {
        return this.leftPatchColor;
    }

    public final String getRightPatchColor() {
        return this.rightPatchColor;
    }

    public int hashCode() {
        int hashCode = (this.bar.hashCode() + (this.backgroundColor.hashCode() * 31)) * 31;
        String str = this.leftPatchColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.rightPatchColor;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.commonSettings;
        return this.cornerRadius.hashCode() + ((hashCode3 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.backgroundColor;
        Bar bar = this.bar;
        String str2 = this.leftPatchColor;
        String str3 = this.rightPatchColor;
        CommonControlSettings commonControlSettings = this.commonSettings;
        CornerRadius cornerRadius = this.cornerRadius;
        StringBuilder sb2 = new StringBuilder("SearchFormBarDTO(backgroundColor=");
        sb2.append(str);
        sb2.append(", bar=");
        sb2.append(bar);
        sb2.append(", leftPatchColor=");
        a.h(sb2, str2, ", rightPatchColor=", str3, ", commonSettings=");
        sb2.append(commonControlSettings);
        sb2.append(", cornerRadius=");
        sb2.append(cornerRadius);
        sb2.append(")");
        return sb2.toString();
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/data/SearchFormBarDTO$Bar;", "", "backgroundColor", "", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", HammersV3BodyDTO.PLACEHOLDER, "Lru/ozon/uni/atoms/data/text/TextDTO;", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "getBackgroundColor", "()Ljava/lang/String;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getPlaceholder", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Bar {
        public static final int $stable = IconDTO.$stable;

        @NotNull
        private final String backgroundColor;

        @EnumNullFallback
        @NotNull
        private final CornerRadius cornerRadius;

        @NotNull
        private final IconDTO icon;

        @NotNull
        private final TextDTO placeholder;

        public Bar(@NotNull String backgroundColor, @NotNull IconDTO icon, @NotNull TextDTO placeholder, @NotNull CornerRadius cornerRadius) {
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
            this.backgroundColor = backgroundColor;
            this.icon = icon;
            this.placeholder = placeholder;
            this.cornerRadius = cornerRadius;
        }

        public static /* synthetic */ Bar copy$default(Bar bar, String str, IconDTO iconDTO, TextDTO textDTO, CornerRadius cornerRadius, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = bar.backgroundColor;
            }
            if ((i11 & 2) != 0) {
                iconDTO = bar.icon;
            }
            if ((i11 & 4) != 0) {
                textDTO = bar.placeholder;
            }
            if ((i11 & 8) != 0) {
                cornerRadius = bar.cornerRadius;
            }
            return bar.copy(str, iconDTO, textDTO, cornerRadius);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TextDTO getPlaceholder() {
            return this.placeholder;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        @NotNull
        public final Bar copy(@NotNull String backgroundColor, @NotNull IconDTO icon, @NotNull TextDTO placeholder, @NotNull CornerRadius cornerRadius) {
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
            return new Bar(backgroundColor, icon, placeholder, cornerRadius);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Bar)) {
                return false;
            }
            Bar bar = (Bar) other;
            return Intrinsics.d(this.backgroundColor, bar.backgroundColor) && Intrinsics.d(this.icon, bar.icon) && Intrinsics.d(this.placeholder, bar.placeholder) && this.cornerRadius == bar.cornerRadius;
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final TextDTO getPlaceholder() {
            return this.placeholder;
        }

        public int hashCode() {
            return this.cornerRadius.hashCode() + b.a(this.placeholder, C2971a.a(this.icon, this.backgroundColor.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return "Bar(backgroundColor=" + this.backgroundColor + ", icon=" + this.icon + ", placeholder=" + this.placeholder + ", cornerRadius=" + this.cornerRadius + ")";
        }

        public /* synthetic */ Bar(String str, IconDTO iconDTO, TextDTO textDTO, CornerRadius cornerRadius, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, iconDTO, textDTO, (i11 & 8) != 0 ? CornerRadius.NO_RADIUS : cornerRadius);
        }
    }

    public /* synthetic */ SearchFormBarDTO(String str, Bar bar, String str2, String str3, CommonControlSettings commonControlSettings, CornerRadius cornerRadius, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bar, str2, str3, commonControlSettings, (i11 & 32) != 0 ? CornerRadius.NO_RADIUS : cornerRadius);
    }
}
