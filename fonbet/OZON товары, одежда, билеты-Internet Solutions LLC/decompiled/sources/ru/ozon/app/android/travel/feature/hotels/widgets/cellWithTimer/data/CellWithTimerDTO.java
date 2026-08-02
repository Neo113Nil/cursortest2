package ru.ozon.app.android.travel.feature.hotels.widgets.cellWithTimer.data;

import B90.C2619v;
import Nh.a;
import Pk0.c;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/cellWithTimer/data/CellWithTimerDTO;", "", "cell", "Lru/ozon/app/android/travel/feature/hotels/widgets/cellWithTimer/data/CellWithTimerDTO$Cell;", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/widgets/cellWithTimer/data/CellWithTimerDTO$Cell;)V", "getCell", "()Lru/ozon/app/android/travel/feature/hotels/widgets/cellWithTimer/data/CellWithTimerDTO$Cell;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Cell", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CellWithTimerDTO {
    public static final int $stable = 8;

    @NotNull
    private final Cell cell;

    public CellWithTimerDTO(@NotNull Cell cell) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        this.cell = cell;
    }

    public static /* synthetic */ CellWithTimerDTO copy$default(CellWithTimerDTO cellWithTimerDTO, Cell cell, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cell = cellWithTimerDTO.cell;
        }
        return cellWithTimerDTO.copy(cell);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Cell getCell() {
        return this.cell;
    }

    @NotNull
    public final CellWithTimerDTO copy(@NotNull Cell cell) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        return new CellWithTimerDTO(cell);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CellWithTimerDTO) && Intrinsics.d(this.cell, ((CellWithTimerDTO) other).cell);
    }

    @NotNull
    public final Cell getCell() {
        return this.cell;
    }

    public int hashCode() {
        return this.cell.hashCode();
    }

    @NotNull
    public String toString() {
        return "CellWithTimerDTO(cell=" + this.cell + ")";
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0017\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\t\u00102\u001a\u00020\u0014HÆ\u0003J\u0085\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0014HÆ\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\u0014HÖ\u0001J\t\u00108\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u00069"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/cellWithTimer/data/CellWithTimerDTO$Cell;", "", "appImage", "Lru/ozon/uni/atoms/data/image/ImageDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "seconds", "", "subtitle", "rightIcon", "Lru/ozon/uni/atoms/data/button/Icon;", "clickAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "timerColor", "", "backgroundColor", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "borderRadius", "", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/texts/TextAtom;JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;I)V", "getAppImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSeconds", "()J", "getSubtitle", "getRightIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getClickAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTimerColor", "()Ljava/lang/String;", "getBackgroundColor", "getTrackingInfo", "()Ljava/util/Map;", "getBorderRadius", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Cell {
        public static final int $stable = 8;

        @NotNull
        private final ImageDTO appImage;
        private final String backgroundColor;
        private final int borderRadius;
        private final AtomActionDTO clickAction;
        private final Icon rightIcon;
        private final long seconds;
        private final TextAtom subtitle;
        private final String timerColor;

        @NotNull
        private final TextAtom title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public Cell(@NotNull ImageDTO appImage, @NotNull TextAtom title, long j11, TextAtom textAtom, Icon icon, AtomActionDTO atomActionDTO, String str, String str2, Map<String, TokenizedTrackingInfo> map, int i11) {
            Intrinsics.checkNotNullParameter(appImage, "appImage");
            Intrinsics.checkNotNullParameter(title, "title");
            this.appImage = appImage;
            this.title = title;
            this.seconds = j11;
            this.subtitle = textAtom;
            this.rightIcon = icon;
            this.clickAction = atomActionDTO;
            this.timerColor = str;
            this.backgroundColor = str2;
            this.trackingInfo = map;
            this.borderRadius = i11;
        }

        public static /* synthetic */ Cell copy$default(Cell cell, ImageDTO imageDTO, TextAtom textAtom, long j11, TextAtom textAtom2, Icon icon, AtomActionDTO atomActionDTO, String str, String str2, Map map, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                imageDTO = cell.appImage;
            }
            if ((i12 & 2) != 0) {
                textAtom = cell.title;
            }
            if ((i12 & 4) != 0) {
                j11 = cell.seconds;
            }
            if ((i12 & 8) != 0) {
                textAtom2 = cell.subtitle;
            }
            if ((i12 & 16) != 0) {
                icon = cell.rightIcon;
            }
            if ((i12 & 32) != 0) {
                atomActionDTO = cell.clickAction;
            }
            if ((i12 & 64) != 0) {
                str = cell.timerColor;
            }
            if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                str2 = cell.backgroundColor;
            }
            if ((i12 & 256) != 0) {
                map = cell.trackingInfo;
            }
            if ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                i11 = cell.borderRadius;
            }
            Map map2 = map;
            int i13 = i11;
            String str3 = str2;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            TextAtom textAtom3 = textAtom2;
            long j12 = j11;
            return cell.copy(imageDTO, textAtom, j12, textAtom3, icon, atomActionDTO2, str, str3, map2, i13);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ImageDTO getAppImage() {
            return this.appImage;
        }

        /* renamed from: component10, reason: from getter */
        public final int getBorderRadius() {
            return this.borderRadius;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final long getSeconds() {
            return this.seconds;
        }

        /* renamed from: component4, reason: from getter */
        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component5, reason: from getter */
        public final Icon getRightIcon() {
            return this.rightIcon;
        }

        /* renamed from: component6, reason: from getter */
        public final AtomActionDTO getClickAction() {
            return this.clickAction;
        }

        /* renamed from: component7, reason: from getter */
        public final String getTimerColor() {
            return this.timerColor;
        }

        /* renamed from: component8, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Map<String, TokenizedTrackingInfo> component9() {
            return this.trackingInfo;
        }

        @NotNull
        public final Cell copy(@NotNull ImageDTO appImage, @NotNull TextAtom title, long seconds, TextAtom subtitle, Icon rightIcon, AtomActionDTO clickAction, String timerColor, String backgroundColor, Map<String, TokenizedTrackingInfo> trackingInfo, int borderRadius) {
            Intrinsics.checkNotNullParameter(appImage, "appImage");
            Intrinsics.checkNotNullParameter(title, "title");
            return new Cell(appImage, title, seconds, subtitle, rightIcon, clickAction, timerColor, backgroundColor, trackingInfo, borderRadius);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Cell)) {
                return false;
            }
            Cell cell = (Cell) other;
            return Intrinsics.d(this.appImage, cell.appImage) && Intrinsics.d(this.title, cell.title) && this.seconds == cell.seconds && Intrinsics.d(this.subtitle, cell.subtitle) && Intrinsics.d(this.rightIcon, cell.rightIcon) && Intrinsics.d(this.clickAction, cell.clickAction) && Intrinsics.d(this.timerColor, cell.timerColor) && Intrinsics.d(this.backgroundColor, cell.backgroundColor) && Intrinsics.d(this.trackingInfo, cell.trackingInfo) && this.borderRadius == cell.borderRadius;
        }

        @NotNull
        public final ImageDTO getAppImage() {
            return this.appImage;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final int getBorderRadius() {
            return this.borderRadius;
        }

        public final AtomActionDTO getClickAction() {
            return this.clickAction;
        }

        public final Icon getRightIcon() {
            return this.rightIcon;
        }

        public final long getSeconds() {
            return this.seconds;
        }

        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        public final String getTimerColor() {
            return this.timerColor;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = c.a(C2619v.b(this.appImage.hashCode() * 31, 31, this.title), 31, this.seconds);
            TextAtom textAtom = this.subtitle;
            int hashCode = (a11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
            Icon icon = this.rightIcon;
            int hashCode2 = (hashCode + (icon == null ? 0 : icon.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.clickAction;
            int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            String str = this.timerColor;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.backgroundColor;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return Integer.hashCode(this.borderRadius) + ((hashCode5 + (map != null ? map.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            ImageDTO imageDTO = this.appImage;
            TextAtom textAtom = this.title;
            long j11 = this.seconds;
            TextAtom textAtom2 = this.subtitle;
            Icon icon = this.rightIcon;
            AtomActionDTO atomActionDTO = this.clickAction;
            String str = this.timerColor;
            String str2 = this.backgroundColor;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int i11 = this.borderRadius;
            StringBuilder sb2 = new StringBuilder("Cell(appImage=");
            sb2.append(imageDTO);
            sb2.append(", title=");
            sb2.append(textAtom);
            sb2.append(", seconds=");
            sb2.append(j11);
            sb2.append(", subtitle=");
            sb2.append(textAtom2);
            sb2.append(", rightIcon=");
            sb2.append(icon);
            sb2.append(", clickAction=");
            sb2.append(atomActionDTO);
            a.h(sb2, ", timerColor=", str, ", backgroundColor=", str2);
            sb2.append(", trackingInfo=");
            sb2.append(map);
            sb2.append(", borderRadius=");
            sb2.append(i11);
            sb2.append(")");
            return sb2.toString();
        }

        public /* synthetic */ Cell(ImageDTO imageDTO, TextAtom textAtom, long j11, TextAtom textAtom2, Icon icon, AtomActionDTO atomActionDTO, String str, String str2, Map map, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(imageDTO, textAtom, j11, textAtom2, icon, atomActionDTO, str, str2, map, (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? 16 : i11);
        }
    }
}
