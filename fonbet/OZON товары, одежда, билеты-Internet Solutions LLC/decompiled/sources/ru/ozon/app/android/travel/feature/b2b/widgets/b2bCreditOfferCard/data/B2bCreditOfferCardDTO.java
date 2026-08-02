package ru.ozon.app.android.travel.feature.b2b.widgets.b2bCreditOfferCard.data;

import Cm.e;
import G.g;
import K1.G;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001.Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fHÆ\u0003Jo\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bCreditOfferCard/data/B2bCreditOfferCardDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "bottomBadgeList", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "description", "progressBar", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bCreditOfferCard/data/B2bCreditOfferCardDTO$ProgressBarDTO;", "buttonList", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/feature/b2b/widgets/b2bCreditOfferCard/data/B2bCreditOfferCardDTO$ProgressBarDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBottomBadgeList", "()Ljava/util/List;", "getDescription", "getProgressBar", "()Lru/ozon/app/android/travel/feature/b2b/widgets/b2bCreditOfferCard/data/B2bCreditOfferCardDTO$ProgressBarDTO;", "getButtonList", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "ProgressBarDTO", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class B2bCreditOfferCardDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<BadgeDTO> bottomBadgeList;

    @NotNull
    private final List<ButtonV3DTO> buttonList;
    private final CommonControlSettings common;
    private final TextDTO description;
    private final ProgressBarDTO progressBar;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J<\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bCreditOfferCard/data/B2bCreditOfferCardDTO$ProgressBarDTO;", "", "percent", "", "color", "", "backgroundColor", "height", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getPercent", "()I", "getColor", "()Ljava/lang/String;", "getBackgroundColor", "getHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lru/ozon/app/android/travel/feature/b2b/widgets/b2bCreditOfferCard/data/B2bCreditOfferCardDTO$ProgressBarDTO;", "equals", "", "other", "hashCode", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProgressBarDTO {
        public static final int $stable = 0;
        private final String backgroundColor;
        private final String color;
        private final Integer height;
        private final int percent;

        public ProgressBarDTO(int i11, String str, String str2, Integer num) {
            this.percent = i11;
            this.color = str;
            this.backgroundColor = str2;
            this.height = num;
        }

        public static /* synthetic */ ProgressBarDTO copy$default(ProgressBarDTO progressBarDTO, int i11, String str, String str2, Integer num, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = progressBarDTO.percent;
            }
            if ((i12 & 2) != 0) {
                str = progressBarDTO.color;
            }
            if ((i12 & 4) != 0) {
                str2 = progressBarDTO.backgroundColor;
            }
            if ((i12 & 8) != 0) {
                num = progressBarDTO.height;
            }
            return progressBarDTO.copy(i11, str, str2, num);
        }

        /* renamed from: component1, reason: from getter */
        public final int getPercent() {
            return this.percent;
        }

        /* renamed from: component2, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getHeight() {
            return this.height;
        }

        @NotNull
        public final ProgressBarDTO copy(int percent, String color, String backgroundColor, Integer height) {
            return new ProgressBarDTO(percent, color, backgroundColor, height);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProgressBarDTO)) {
                return false;
            }
            ProgressBarDTO progressBarDTO = (ProgressBarDTO) other;
            return this.percent == progressBarDTO.percent && Intrinsics.d(this.color, progressBarDTO.color) && Intrinsics.d(this.backgroundColor, progressBarDTO.backgroundColor) && Intrinsics.d(this.height, progressBarDTO.height);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getColor() {
            return this.color;
        }

        public final Integer getHeight() {
            return this.height;
        }

        public final int getPercent() {
            return this.percent;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.percent) * 31;
            String str = this.color;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.backgroundColor;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.height;
            return hashCode3 + (num != null ? num.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            int i11 = this.percent;
            String str = this.color;
            String str2 = this.backgroundColor;
            Integer num = this.height;
            StringBuilder g10 = e.g(i11, "ProgressBarDTO(percent=", ", color=", str, ", backgroundColor=");
            g10.append(str2);
            g10.append(", height=");
            g10.append(num);
            g10.append(")");
            return g10.toString();
        }
    }

    public B2bCreditOfferCardDTO(@NotNull TextDTO title, @NotNull List<BadgeDTO> bottomBadgeList, TextDTO textDTO, ProgressBarDTO progressBarDTO, @NotNull List<ButtonV3DTO> buttonList, CommonControlSettings commonControlSettings, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(bottomBadgeList, "bottomBadgeList");
        Intrinsics.checkNotNullParameter(buttonList, "buttonList");
        this.title = title;
        this.bottomBadgeList = bottomBadgeList;
        this.description = textDTO;
        this.progressBar = progressBarDTO;
        this.buttonList = buttonList;
        this.common = commonControlSettings;
        this.trackingInfo = map;
    }

    public static /* synthetic */ B2bCreditOfferCardDTO copy$default(B2bCreditOfferCardDTO b2bCreditOfferCardDTO, TextDTO textDTO, List list, TextDTO textDTO2, ProgressBarDTO progressBarDTO, List list2, CommonControlSettings commonControlSettings, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = b2bCreditOfferCardDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = b2bCreditOfferCardDTO.bottomBadgeList;
        }
        if ((i11 & 4) != 0) {
            textDTO2 = b2bCreditOfferCardDTO.description;
        }
        if ((i11 & 8) != 0) {
            progressBarDTO = b2bCreditOfferCardDTO.progressBar;
        }
        if ((i11 & 16) != 0) {
            list2 = b2bCreditOfferCardDTO.buttonList;
        }
        if ((i11 & 32) != 0) {
            commonControlSettings = b2bCreditOfferCardDTO.common;
        }
        if ((i11 & 64) != 0) {
            map = b2bCreditOfferCardDTO.trackingInfo;
        }
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        Map map2 = map;
        List list3 = list2;
        TextDTO textDTO3 = textDTO2;
        return b2bCreditOfferCardDTO.copy(textDTO, list, textDTO3, progressBarDTO, list3, commonControlSettings2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    public final List<BadgeDTO> component2() {
        return this.bottomBadgeList;
    }

    /* renamed from: component3, reason: from getter */
    public final TextDTO getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final ProgressBarDTO getProgressBar() {
        return this.progressBar;
    }

    @NotNull
    public final List<ButtonV3DTO> component5() {
        return this.buttonList;
    }

    /* renamed from: component6, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final B2bCreditOfferCardDTO copy(@NotNull TextDTO title, @NotNull List<BadgeDTO> bottomBadgeList, TextDTO description, ProgressBarDTO progressBar, @NotNull List<ButtonV3DTO> buttonList, CommonControlSettings common, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(bottomBadgeList, "bottomBadgeList");
        Intrinsics.checkNotNullParameter(buttonList, "buttonList");
        return new B2bCreditOfferCardDTO(title, bottomBadgeList, description, progressBar, buttonList, common, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof B2bCreditOfferCardDTO)) {
            return false;
        }
        B2bCreditOfferCardDTO b2bCreditOfferCardDTO = (B2bCreditOfferCardDTO) other;
        return Intrinsics.d(this.title, b2bCreditOfferCardDTO.title) && Intrinsics.d(this.bottomBadgeList, b2bCreditOfferCardDTO.bottomBadgeList) && Intrinsics.d(this.description, b2bCreditOfferCardDTO.description) && Intrinsics.d(this.progressBar, b2bCreditOfferCardDTO.progressBar) && Intrinsics.d(this.buttonList, b2bCreditOfferCardDTO.buttonList) && Intrinsics.d(this.common, b2bCreditOfferCardDTO.common) && Intrinsics.d(this.trackingInfo, b2bCreditOfferCardDTO.trackingInfo);
    }

    @NotNull
    public final List<BadgeDTO> getBottomBadgeList() {
        return this.bottomBadgeList;
    }

    @NotNull
    public final List<ButtonV3DTO> getButtonList() {
        return this.buttonList;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    public final TextDTO getDescription() {
        return this.description;
    }

    public final ProgressBarDTO getProgressBar() {
        return this.progressBar;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = g.b(this.title.hashCode() * 31, 31, this.bottomBadgeList);
        TextDTO textDTO = this.description;
        int hashCode = (b11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        ProgressBarDTO progressBarDTO = this.progressBar;
        int b12 = g.b((hashCode + (progressBarDTO == null ? 0 : progressBarDTO.hashCode())) * 31, 31, this.buttonList);
        CommonControlSettings commonControlSettings = this.common;
        int hashCode2 = (b12 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        List<BadgeDTO> list = this.bottomBadgeList;
        TextDTO textDTO2 = this.description;
        ProgressBarDTO progressBarDTO = this.progressBar;
        List<ButtonV3DTO> list2 = this.buttonList;
        CommonControlSettings commonControlSettings = this.common;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder e11 = G.e("B2bCreditOfferCardDTO(title=", textDTO, ", bottomBadgeList=", list, ", description=");
        e11.append(textDTO2);
        e11.append(", progressBar=");
        e11.append(progressBarDTO);
        e11.append(", buttonList=");
        e11.append(list2);
        e11.append(", common=");
        e11.append(commonControlSettings);
        e11.append(", trackingInfo=");
        return P.f(e11, map, ")");
    }

    public B2bCreditOfferCardDTO(TextDTO textDTO, List list, TextDTO textDTO2, ProgressBarDTO progressBarDTO, List list2, CommonControlSettings commonControlSettings, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textDTO, (i11 & 2) != 0 ? K.f71697a : list, textDTO2, progressBarDTO, (i11 & 16) != 0 ? K.f71697a : list2, commonControlSettings, map);
    }
}
