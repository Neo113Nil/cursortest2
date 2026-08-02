package ru.ozon.app.android.common.progressivemolecula.data;

import Bl.C2639a;
import D3.g;
import Ef0.c;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveTextWidgetDTO;", "", "progressiveText", "Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveTextWidgetDTO$ProgressiveTextDTO;", "horizontalPadding", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "isSticky", "", "<init>", "(Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveTextWidgetDTO$ProgressiveTextDTO;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Ljava/lang/Boolean;)V", "getProgressiveText", "()Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveTextWidgetDTO$ProgressiveTextDTO;", "getHorizontalPadding", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveTextWidgetDTO$ProgressiveTextDTO;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Ljava/lang/Boolean;)Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveTextWidgetDTO;", "equals", "other", "hashCode", "", "toString", "", "ProgressiveTextDTO", "Paddings", "progressive-molecula_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ProgressiveTextWidgetDTO {
    private final CommonCellSettings.LayoutPadding horizontalPadding;
    private final Boolean isSticky;

    @NotNull
    private final ProgressiveTextDTO progressiveText;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveTextWidgetDTO$Paddings;", "", "leftPadding", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "rightPadding", "topPadding", "bottomPadding", "<init>", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)V", "getLeftPadding", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getRightPadding", "getTopPadding", "getBottomPadding", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "progressive-molecula_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final /* data */ class Paddings {

        @NotNull
        private final CommonCellSettings.LayoutPadding bottomPadding;

        @NotNull
        private final CommonCellSettings.LayoutPadding leftPadding;

        @NotNull
        private final CommonCellSettings.LayoutPadding rightPadding;

        @NotNull
        private final CommonCellSettings.LayoutPadding topPadding;

        public Paddings(@NotNull CommonCellSettings.LayoutPadding leftPadding, @NotNull CommonCellSettings.LayoutPadding rightPadding, @NotNull CommonCellSettings.LayoutPadding topPadding, @NotNull CommonCellSettings.LayoutPadding bottomPadding) {
            Intrinsics.checkNotNullParameter(leftPadding, "leftPadding");
            Intrinsics.checkNotNullParameter(rightPadding, "rightPadding");
            Intrinsics.checkNotNullParameter(topPadding, "topPadding");
            Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
            this.leftPadding = leftPadding;
            this.rightPadding = rightPadding;
            this.topPadding = topPadding;
            this.bottomPadding = bottomPadding;
        }

        public static /* synthetic */ Paddings copy$default(Paddings paddings, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                layoutPadding = paddings.leftPadding;
            }
            if ((i11 & 2) != 0) {
                layoutPadding2 = paddings.rightPadding;
            }
            if ((i11 & 4) != 0) {
                layoutPadding3 = paddings.topPadding;
            }
            if ((i11 & 8) != 0) {
                layoutPadding4 = paddings.bottomPadding;
            }
            return paddings.copy(layoutPadding, layoutPadding2, layoutPadding3, layoutPadding4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CommonCellSettings.LayoutPadding getLeftPadding() {
            return this.leftPadding;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CommonCellSettings.LayoutPadding getRightPadding() {
            return this.rightPadding;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final CommonCellSettings.LayoutPadding getTopPadding() {
            return this.topPadding;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final CommonCellSettings.LayoutPadding getBottomPadding() {
            return this.bottomPadding;
        }

        @NotNull
        public final Paddings copy(@NotNull CommonCellSettings.LayoutPadding leftPadding, @NotNull CommonCellSettings.LayoutPadding rightPadding, @NotNull CommonCellSettings.LayoutPadding topPadding, @NotNull CommonCellSettings.LayoutPadding bottomPadding) {
            Intrinsics.checkNotNullParameter(leftPadding, "leftPadding");
            Intrinsics.checkNotNullParameter(rightPadding, "rightPadding");
            Intrinsics.checkNotNullParameter(topPadding, "topPadding");
            Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
            return new Paddings(leftPadding, rightPadding, topPadding, bottomPadding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Paddings)) {
                return false;
            }
            Paddings paddings = (Paddings) other;
            return this.leftPadding == paddings.leftPadding && this.rightPadding == paddings.rightPadding && this.topPadding == paddings.topPadding && this.bottomPadding == paddings.bottomPadding;
        }

        @NotNull
        public final CommonCellSettings.LayoutPadding getBottomPadding() {
            return this.bottomPadding;
        }

        @NotNull
        public final CommonCellSettings.LayoutPadding getLeftPadding() {
            return this.leftPadding;
        }

        @NotNull
        public final CommonCellSettings.LayoutPadding getRightPadding() {
            return this.rightPadding;
        }

        @NotNull
        public final CommonCellSettings.LayoutPadding getTopPadding() {
            return this.topPadding;
        }

        public int hashCode() {
            return this.bottomPadding.hashCode() + c.a(this.topPadding, c.a(this.rightPadding, this.leftPadding.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return "Paddings(leftPadding=" + this.leftPadding + ", rightPadding=" + this.rightPadding + ", topPadding=" + this.topPadding + ", bottomPadding=" + this.bottomPadding + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u0010/\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0017\u00100\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J\u0084\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u000eHÖ\u0001J\t\u00107\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u00068"}, d2 = {"Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveTextWidgetDTO$ProgressiveTextDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "badge", "Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveBadgeDTO;", "backgroundColor", "", "borderColor", "paddings", "Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveTextWidgetDTO$Paddings;", "cornerRadius", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveBadgeDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveTextWidgetDTO$Paddings;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getBadge", "()Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveBadgeDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getBorderColor", "getPaddings", "()Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveTextWidgetDTO$Paddings;", "getCornerRadius", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveBadgeDTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveTextWidgetDTO$Paddings;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)Lru/ozon/app/android/common/progressivemolecula/data/ProgressiveTextWidgetDTO$ProgressiveTextDTO;", "equals", "", "other", "hashCode", "toString", "progressive-molecula_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProgressiveTextDTO {
        private final AtomActionDTO action;
        private final String backgroundColor;
        private final ProgressiveBadgeDTO badge;
        private final String borderColor;
        private final Integer cornerRadius;
        private final IconDTO icon;
        private final Paddings paddings;

        @NotNull
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public ProgressiveTextDTO(@NotNull TextDTO title, IconDTO iconDTO, ProgressiveBadgeDTO progressiveBadgeDTO, String str, String str2, Paddings paddings, Integer num, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.icon = iconDTO;
            this.badge = progressiveBadgeDTO;
            this.backgroundColor = str;
            this.borderColor = str2;
            this.paddings = paddings;
            this.cornerRadius = num;
            this.action = atomActionDTO;
            this.trackingInfo = map;
        }

        public static /* synthetic */ ProgressiveTextDTO copy$default(ProgressiveTextDTO progressiveTextDTO, TextDTO textDTO, IconDTO iconDTO, ProgressiveBadgeDTO progressiveBadgeDTO, String str, String str2, Paddings paddings, Integer num, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = progressiveTextDTO.title;
            }
            if ((i11 & 2) != 0) {
                iconDTO = progressiveTextDTO.icon;
            }
            if ((i11 & 4) != 0) {
                progressiveBadgeDTO = progressiveTextDTO.badge;
            }
            if ((i11 & 8) != 0) {
                str = progressiveTextDTO.backgroundColor;
            }
            if ((i11 & 16) != 0) {
                str2 = progressiveTextDTO.borderColor;
            }
            if ((i11 & 32) != 0) {
                paddings = progressiveTextDTO.paddings;
            }
            if ((i11 & 64) != 0) {
                num = progressiveTextDTO.cornerRadius;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                atomActionDTO = progressiveTextDTO.action;
            }
            if ((i11 & 256) != 0) {
                map = progressiveTextDTO.trackingInfo;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Map map2 = map;
            Paddings paddings2 = paddings;
            Integer num2 = num;
            String str3 = str2;
            ProgressiveBadgeDTO progressiveBadgeDTO2 = progressiveBadgeDTO;
            return progressiveTextDTO.copy(textDTO, iconDTO, progressiveBadgeDTO2, str, str3, paddings2, num2, atomActionDTO2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        /* renamed from: component3, reason: from getter */
        public final ProgressiveBadgeDTO getBadge() {
            return this.badge;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component5, reason: from getter */
        public final String getBorderColor() {
            return this.borderColor;
        }

        /* renamed from: component6, reason: from getter */
        public final Paddings getPaddings() {
            return this.paddings;
        }

        /* renamed from: component7, reason: from getter */
        public final Integer getCornerRadius() {
            return this.cornerRadius;
        }

        /* renamed from: component8, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component9() {
            return this.trackingInfo;
        }

        @NotNull
        public final ProgressiveTextDTO copy(@NotNull TextDTO title, IconDTO icon, ProgressiveBadgeDTO badge, String backgroundColor, String borderColor, Paddings paddings, Integer cornerRadius, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new ProgressiveTextDTO(title, icon, badge, backgroundColor, borderColor, paddings, cornerRadius, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProgressiveTextDTO)) {
                return false;
            }
            ProgressiveTextDTO progressiveTextDTO = (ProgressiveTextDTO) other;
            return Intrinsics.d(this.title, progressiveTextDTO.title) && Intrinsics.d(this.icon, progressiveTextDTO.icon) && Intrinsics.d(this.badge, progressiveTextDTO.badge) && Intrinsics.d(this.backgroundColor, progressiveTextDTO.backgroundColor) && Intrinsics.d(this.borderColor, progressiveTextDTO.borderColor) && Intrinsics.d(this.paddings, progressiveTextDTO.paddings) && Intrinsics.d(this.cornerRadius, progressiveTextDTO.cornerRadius) && Intrinsics.d(this.action, progressiveTextDTO.action) && Intrinsics.d(this.trackingInfo, progressiveTextDTO.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final ProgressiveBadgeDTO getBadge() {
            return this.badge;
        }

        public final String getBorderColor() {
            return this.borderColor;
        }

        public final Integer getCornerRadius() {
            return this.cornerRadius;
        }

        public final IconDTO getIcon() {
            return this.icon;
        }

        public final Paddings getPaddings() {
            return this.paddings;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            IconDTO iconDTO = this.icon;
            int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            ProgressiveBadgeDTO progressiveBadgeDTO = this.badge;
            int hashCode3 = (hashCode2 + (progressiveBadgeDTO == null ? 0 : progressiveBadgeDTO.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.borderColor;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Paddings paddings = this.paddings;
            int hashCode6 = (hashCode5 + (paddings == null ? 0 : paddings.hashCode())) * 31;
            Integer num = this.cornerRadius;
            int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode8 = (hashCode7 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode8 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            IconDTO iconDTO = this.icon;
            ProgressiveBadgeDTO progressiveBadgeDTO = this.badge;
            String str = this.backgroundColor;
            String str2 = this.borderColor;
            Paddings paddings = this.paddings;
            Integer num = this.cornerRadius;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder d11 = C2639a.d("ProgressiveTextDTO(title=", ", icon=", ", badge=", iconDTO, textDTO);
            d11.append(progressiveBadgeDTO);
            d11.append(", backgroundColor=");
            d11.append(str);
            d11.append(", borderColor=");
            d11.append(str2);
            d11.append(", paddings=");
            d11.append(paddings);
            d11.append(", cornerRadius=");
            d11.append(num);
            d11.append(", action=");
            d11.append(atomActionDTO);
            d11.append(", trackingInfo=");
            return P.f(d11, map, ")");
        }
    }

    public ProgressiveTextWidgetDTO(@NotNull ProgressiveTextDTO progressiveText, CommonCellSettings.LayoutPadding layoutPadding, Boolean bool) {
        Intrinsics.checkNotNullParameter(progressiveText, "progressiveText");
        this.progressiveText = progressiveText;
        this.horizontalPadding = layoutPadding;
        this.isSticky = bool;
    }

    public static /* synthetic */ ProgressiveTextWidgetDTO copy$default(ProgressiveTextWidgetDTO progressiveTextWidgetDTO, ProgressiveTextDTO progressiveTextDTO, CommonCellSettings.LayoutPadding layoutPadding, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            progressiveTextDTO = progressiveTextWidgetDTO.progressiveText;
        }
        if ((i11 & 2) != 0) {
            layoutPadding = progressiveTextWidgetDTO.horizontalPadding;
        }
        if ((i11 & 4) != 0) {
            bool = progressiveTextWidgetDTO.isSticky;
        }
        return progressiveTextWidgetDTO.copy(progressiveTextDTO, layoutPadding, bool);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ProgressiveTextDTO getProgressiveText() {
        return this.progressiveText;
    }

    /* renamed from: component2, reason: from getter */
    public final CommonCellSettings.LayoutPadding getHorizontalPadding() {
        return this.horizontalPadding;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getIsSticky() {
        return this.isSticky;
    }

    @NotNull
    public final ProgressiveTextWidgetDTO copy(@NotNull ProgressiveTextDTO progressiveText, CommonCellSettings.LayoutPadding horizontalPadding, Boolean isSticky) {
        Intrinsics.checkNotNullParameter(progressiveText, "progressiveText");
        return new ProgressiveTextWidgetDTO(progressiveText, horizontalPadding, isSticky);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressiveTextWidgetDTO)) {
            return false;
        }
        ProgressiveTextWidgetDTO progressiveTextWidgetDTO = (ProgressiveTextWidgetDTO) other;
        return Intrinsics.d(this.progressiveText, progressiveTextWidgetDTO.progressiveText) && this.horizontalPadding == progressiveTextWidgetDTO.horizontalPadding && Intrinsics.d(this.isSticky, progressiveTextWidgetDTO.isSticky);
    }

    public final CommonCellSettings.LayoutPadding getHorizontalPadding() {
        return this.horizontalPadding;
    }

    @NotNull
    public final ProgressiveTextDTO getProgressiveText() {
        return this.progressiveText;
    }

    public int hashCode() {
        int hashCode = this.progressiveText.hashCode() * 31;
        CommonCellSettings.LayoutPadding layoutPadding = this.horizontalPadding;
        int hashCode2 = (hashCode + (layoutPadding == null ? 0 : layoutPadding.hashCode())) * 31;
        Boolean bool = this.isSticky;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isSticky() {
        return this.isSticky;
    }

    @NotNull
    public String toString() {
        ProgressiveTextDTO progressiveTextDTO = this.progressiveText;
        CommonCellSettings.LayoutPadding layoutPadding = this.horizontalPadding;
        Boolean bool = this.isSticky;
        StringBuilder sb2 = new StringBuilder("ProgressiveTextWidgetDTO(progressiveText=");
        sb2.append(progressiveTextDTO);
        sb2.append(", horizontalPadding=");
        sb2.append(layoutPadding);
        sb2.append(", isSticky=");
        return g.d(sb2, bool, ")");
    }
}
