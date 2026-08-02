package ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.data.model;

import Am.C2438a;
import B0.C2454a;
import C.o0;
import El.C2971a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u00015Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003J}\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#¨\u00066"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/CounterDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "circlesConfig", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/CounterDTO$CirclesConfigDTO;", "titleFooter", "tracking", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "paddings", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorPaddings;", "topGradientColor", "backgroundColor", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/CounterDTO$CirclesConfigDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorPaddings;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCirclesConfig", "()Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/CounterDTO$CirclesConfigDTO;", "getTitleFooter", "getTracking", "()Ljava/util/Map;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getPaddings", "()Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorPaddings;", "getTopGradientColor", "()Ljava/lang/String;", "getBackgroundColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "CirclesConfigDTO", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CounterDTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;
    private final String backgroundColor;
    private final CellDTO cell;

    @NotNull
    private final CirclesConfigDTO circlesConfig;
    private final TopAuthorPaddings paddings;

    @NotNull
    private final TextDTO title;
    private final TextDTO titleFooter;
    private final String topGradientColor;
    private final Map<String, TokenizedTrackingInfo> tracking;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/CounterDTO$CirclesConfigDTO;", "", "totalCount", "", "progressCount", "activeIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "inactiveIcon", "activeLineGradientColor", "", "", "inactiveLineBackgroundColor", "<init>", "(IILru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Ljava/util/List;Ljava/lang/String;)V", "getTotalCount", "()I", "getProgressCount", "getActiveIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getInactiveIcon", "getActiveLineGradientColor", "()Ljava/util/List;", "getInactiveLineBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CirclesConfigDTO {
        public static final int $stable = 8;

        @NotNull
        private final IconDTO activeIcon;
        private final List<String> activeLineGradientColor;

        @NotNull
        private final IconDTO inactiveIcon;
        private final String inactiveLineBackgroundColor;
        private final int progressCount;
        private final int totalCount;

        public CirclesConfigDTO(int i11, int i12, @NotNull IconDTO activeIcon, @NotNull IconDTO inactiveIcon, List<String> list, String str) {
            Intrinsics.checkNotNullParameter(activeIcon, "activeIcon");
            Intrinsics.checkNotNullParameter(inactiveIcon, "inactiveIcon");
            this.totalCount = i11;
            this.progressCount = i12;
            this.activeIcon = activeIcon;
            this.inactiveIcon = inactiveIcon;
            this.activeLineGradientColor = list;
            this.inactiveLineBackgroundColor = str;
        }

        public static /* synthetic */ CirclesConfigDTO copy$default(CirclesConfigDTO circlesConfigDTO, int i11, int i12, IconDTO iconDTO, IconDTO iconDTO2, List list, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = circlesConfigDTO.totalCount;
            }
            if ((i13 & 2) != 0) {
                i12 = circlesConfigDTO.progressCount;
            }
            if ((i13 & 4) != 0) {
                iconDTO = circlesConfigDTO.activeIcon;
            }
            if ((i13 & 8) != 0) {
                iconDTO2 = circlesConfigDTO.inactiveIcon;
            }
            if ((i13 & 16) != 0) {
                list = circlesConfigDTO.activeLineGradientColor;
            }
            if ((i13 & 32) != 0) {
                str = circlesConfigDTO.inactiveLineBackgroundColor;
            }
            List list2 = list;
            String str2 = str;
            return circlesConfigDTO.copy(i11, i12, iconDTO, iconDTO2, list2, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getTotalCount() {
            return this.totalCount;
        }

        /* renamed from: component2, reason: from getter */
        public final int getProgressCount() {
            return this.progressCount;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final IconDTO getActiveIcon() {
            return this.activeIcon;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final IconDTO getInactiveIcon() {
            return this.inactiveIcon;
        }

        public final List<String> component5() {
            return this.activeLineGradientColor;
        }

        /* renamed from: component6, reason: from getter */
        public final String getInactiveLineBackgroundColor() {
            return this.inactiveLineBackgroundColor;
        }

        @NotNull
        public final CirclesConfigDTO copy(int totalCount, int progressCount, @NotNull IconDTO activeIcon, @NotNull IconDTO inactiveIcon, List<String> activeLineGradientColor, String inactiveLineBackgroundColor) {
            Intrinsics.checkNotNullParameter(activeIcon, "activeIcon");
            Intrinsics.checkNotNullParameter(inactiveIcon, "inactiveIcon");
            return new CirclesConfigDTO(totalCount, progressCount, activeIcon, inactiveIcon, activeLineGradientColor, inactiveLineBackgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CirclesConfigDTO)) {
                return false;
            }
            CirclesConfigDTO circlesConfigDTO = (CirclesConfigDTO) other;
            return this.totalCount == circlesConfigDTO.totalCount && this.progressCount == circlesConfigDTO.progressCount && Intrinsics.d(this.activeIcon, circlesConfigDTO.activeIcon) && Intrinsics.d(this.inactiveIcon, circlesConfigDTO.inactiveIcon) && Intrinsics.d(this.activeLineGradientColor, circlesConfigDTO.activeLineGradientColor) && Intrinsics.d(this.inactiveLineBackgroundColor, circlesConfigDTO.inactiveLineBackgroundColor);
        }

        @NotNull
        public final IconDTO getActiveIcon() {
            return this.activeIcon;
        }

        public final List<String> getActiveLineGradientColor() {
            return this.activeLineGradientColor;
        }

        @NotNull
        public final IconDTO getInactiveIcon() {
            return this.inactiveIcon;
        }

        public final String getInactiveLineBackgroundColor() {
            return this.inactiveLineBackgroundColor;
        }

        public final int getProgressCount() {
            return this.progressCount;
        }

        public final int getTotalCount() {
            return this.totalCount;
        }

        public int hashCode() {
            int a11 = C2971a.a(this.inactiveIcon, C2971a.a(this.activeIcon, C2454a.a(this.progressCount, Integer.hashCode(this.totalCount) * 31, 31), 31), 31);
            List<String> list = this.activeLineGradientColor;
            int hashCode = (a11 + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.inactiveLineBackgroundColor;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            int i11 = this.totalCount;
            int i12 = this.progressCount;
            IconDTO iconDTO = this.activeIcon;
            IconDTO iconDTO2 = this.inactiveIcon;
            List<String> list = this.activeLineGradientColor;
            String str = this.inactiveLineBackgroundColor;
            StringBuilder a11 = C2438a.a("CirclesConfigDTO(totalCount=", i11, ", progressCount=", ", activeIcon=", i12);
            a11.append(iconDTO);
            a11.append(", inactiveIcon=");
            a11.append(iconDTO2);
            a11.append(", activeLineGradientColor=");
            a11.append(list);
            a11.append(", inactiveLineBackgroundColor=");
            a11.append(str);
            a11.append(")");
            return a11.toString();
        }
    }

    public CounterDTO(@NotNull TextDTO title, CellDTO cellDTO, @NotNull CirclesConfigDTO circlesConfig, TextDTO textDTO, Map<String, TokenizedTrackingInfo> map, AtomActionDTO atomActionDTO, TopAuthorPaddings topAuthorPaddings, String str, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(circlesConfig, "circlesConfig");
        this.title = title;
        this.cell = cellDTO;
        this.circlesConfig = circlesConfig;
        this.titleFooter = textDTO;
        this.tracking = map;
        this.action = atomActionDTO;
        this.paddings = topAuthorPaddings;
        this.topGradientColor = str;
        this.backgroundColor = str2;
    }

    public static /* synthetic */ CounterDTO copy$default(CounterDTO counterDTO, TextDTO textDTO, CellDTO cellDTO, CirclesConfigDTO circlesConfigDTO, TextDTO textDTO2, Map map, AtomActionDTO atomActionDTO, TopAuthorPaddings topAuthorPaddings, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = counterDTO.title;
        }
        if ((i11 & 2) != 0) {
            cellDTO = counterDTO.cell;
        }
        if ((i11 & 4) != 0) {
            circlesConfigDTO = counterDTO.circlesConfig;
        }
        if ((i11 & 8) != 0) {
            textDTO2 = counterDTO.titleFooter;
        }
        if ((i11 & 16) != 0) {
            map = counterDTO.tracking;
        }
        if ((i11 & 32) != 0) {
            atomActionDTO = counterDTO.action;
        }
        if ((i11 & 64) != 0) {
            topAuthorPaddings = counterDTO.paddings;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str = counterDTO.topGradientColor;
        }
        if ((i11 & 256) != 0) {
            str2 = counterDTO.backgroundColor;
        }
        String str3 = str;
        String str4 = str2;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        TopAuthorPaddings topAuthorPaddings2 = topAuthorPaddings;
        Map map2 = map;
        CirclesConfigDTO circlesConfigDTO2 = circlesConfigDTO;
        return counterDTO.copy(textDTO, cellDTO, circlesConfigDTO2, textDTO2, map2, atomActionDTO2, topAuthorPaddings2, str3, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final CellDTO getCell() {
        return this.cell;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final CirclesConfigDTO getCirclesConfig() {
        return this.circlesConfig;
    }

    /* renamed from: component4, reason: from getter */
    public final TextDTO getTitleFooter() {
        return this.titleFooter;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.tracking;
    }

    /* renamed from: component6, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component7, reason: from getter */
    public final TopAuthorPaddings getPaddings() {
        return this.paddings;
    }

    /* renamed from: component8, reason: from getter */
    public final String getTopGradientColor() {
        return this.topGradientColor;
    }

    /* renamed from: component9, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final CounterDTO copy(@NotNull TextDTO title, CellDTO cell, @NotNull CirclesConfigDTO circlesConfig, TextDTO titleFooter, Map<String, TokenizedTrackingInfo> tracking, AtomActionDTO action, TopAuthorPaddings paddings, String topGradientColor, String backgroundColor) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(circlesConfig, "circlesConfig");
        return new CounterDTO(title, cell, circlesConfig, titleFooter, tracking, action, paddings, topGradientColor, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CounterDTO)) {
            return false;
        }
        CounterDTO counterDTO = (CounterDTO) other;
        return Intrinsics.d(this.title, counterDTO.title) && Intrinsics.d(this.cell, counterDTO.cell) && Intrinsics.d(this.circlesConfig, counterDTO.circlesConfig) && Intrinsics.d(this.titleFooter, counterDTO.titleFooter) && Intrinsics.d(this.tracking, counterDTO.tracking) && Intrinsics.d(this.action, counterDTO.action) && Intrinsics.d(this.paddings, counterDTO.paddings) && Intrinsics.d(this.topGradientColor, counterDTO.topGradientColor) && Intrinsics.d(this.backgroundColor, counterDTO.backgroundColor);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final CellDTO getCell() {
        return this.cell;
    }

    @NotNull
    public final CirclesConfigDTO getCirclesConfig() {
        return this.circlesConfig;
    }

    public final TopAuthorPaddings getPaddings() {
        return this.paddings;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final TextDTO getTitleFooter() {
        return this.titleFooter;
    }

    public final String getTopGradientColor() {
        return this.topGradientColor;
    }

    public final Map<String, TokenizedTrackingInfo> getTracking() {
        return this.tracking;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        CellDTO cellDTO = this.cell;
        int hashCode2 = (this.circlesConfig.hashCode() + ((hashCode + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31)) * 31;
        TextDTO textDTO = this.titleFooter;
        int hashCode3 = (hashCode2 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.tracking;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode5 = (hashCode4 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        TopAuthorPaddings topAuthorPaddings = this.paddings;
        int hashCode6 = (hashCode5 + (topAuthorPaddings == null ? 0 : topAuthorPaddings.hashCode())) * 31;
        String str = this.topGradientColor;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColor;
        return hashCode7 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        CellDTO cellDTO = this.cell;
        CirclesConfigDTO circlesConfigDTO = this.circlesConfig;
        TextDTO textDTO2 = this.titleFooter;
        Map<String, TokenizedTrackingInfo> map = this.tracking;
        AtomActionDTO atomActionDTO = this.action;
        TopAuthorPaddings topAuthorPaddings = this.paddings;
        String str = this.topGradientColor;
        String str2 = this.backgroundColor;
        StringBuilder sb2 = new StringBuilder("CounterDTO(title=");
        sb2.append(textDTO);
        sb2.append(", cell=");
        sb2.append(cellDTO);
        sb2.append(", circlesConfig=");
        sb2.append(circlesConfigDTO);
        sb2.append(", titleFooter=");
        sb2.append(textDTO2);
        sb2.append(", tracking=");
        sb2.append(map);
        sb2.append(", action=");
        sb2.append(atomActionDTO);
        sb2.append(", paddings=");
        sb2.append(topAuthorPaddings);
        sb2.append(", topGradientColor=");
        sb2.append(str);
        sb2.append(", backgroundColor=");
        return o0.c(sb2, str2, ")");
    }
}
