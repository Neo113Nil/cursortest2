package ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.data;

import B90.C2618u;
import G.g;
import H3.c;
import Kk.C3532b;
import T7.E;
import T7.P;
import Xc.a;
import Xc.b;
import c8.C5766e;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.fresh.main.ui.molecules.header.HeaderV2DTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\b\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO;", "", "sections", "", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Section;", "<init>", "(Ljava/util/List;)V", "getSections", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Section", "DtoFieldName", "Corners", "SeparatorDTO", "Item", "PositionType", "NavigationSliderV3RowDTO", "RowType", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class NavigationSliderV3DTO {

    @NotNull
    private final List<Section> sections;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Corners;", "", "<init>", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "FULL", "WITHOUT", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Corners {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Corners[] $VALUES;

        @i(name = "TOP")
        public static final Corners TOP = new Corners("TOP", 0);

        @i(name = "BOTTOM")
        public static final Corners BOTTOM = new Corners("BOTTOM", 1);

        @i(name = "FULL")
        public static final Corners FULL = new Corners("FULL", 2);

        @i(name = "WITHOUT")
        public static final Corners WITHOUT = new Corners("WITHOUT", 3);

        private static final /* synthetic */ Corners[] $values() {
            return new Corners[]{TOP, BOTTOM, FULL, WITHOUT};
        }

        static {
            Corners[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Corners(String str, int i11) {
        }

        public static Corners valueOf(String str) {
            return (Corners) Enum.valueOf(Corners.class, str);
        }

        public static Corners[] values() {
            return (Corners[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$DtoFieldName;", "", "jsonName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJsonName", "()Ljava/lang/String;", CommentV3DTO.HEADER_NAME, "ITEMS", "BACKGROUNDS_COLOR", "SEPARATOR_HEIGHT", "CORNERS", "SECTIONS", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DtoFieldName {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ DtoFieldName[] $VALUES;

        @NotNull
        private final String jsonName;
        public static final DtoFieldName HEADER = new DtoFieldName(CommentV3DTO.HEADER_NAME, 0, CommentV3DTO.HEADER_FIELD_NAME);
        public static final DtoFieldName ITEMS = new DtoFieldName("ITEMS", 1, "items");
        public static final DtoFieldName BACKGROUNDS_COLOR = new DtoFieldName("BACKGROUNDS_COLOR", 2, "backgroundColor");
        public static final DtoFieldName SEPARATOR_HEIGHT = new DtoFieldName("SEPARATOR_HEIGHT", 3, "separatorHeight");
        public static final DtoFieldName CORNERS = new DtoFieldName("CORNERS", 4, "corners");
        public static final DtoFieldName SECTIONS = new DtoFieldName("SECTIONS", 5, "sections");

        private static final /* synthetic */ DtoFieldName[] $values() {
            return new DtoFieldName[]{HEADER, ITEMS, BACKGROUNDS_COLOR, SEPARATOR_HEIGHT, CORNERS, SECTIONS};
        }

        static {
            DtoFieldName[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private DtoFieldName(String str, int i11, String str2) {
            this.jsonName = str2;
        }

        public static DtoFieldName valueOf(String str) {
            return (DtoFieldName) Enum.valueOf(DtoFieldName.class, str);
        }

        public static DtoFieldName[] values() {
            return (DtoFieldName[]) $VALUES.clone();
        }

        @NotNull
        public final String getJsonName() {
            return this.jsonName;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Item;", "", "settings", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Item$Settings;", "data", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Item$Data;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Item$Settings;Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Item$Data;Ljava/util/Map;)V", "getSettings", "()Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Item$Settings;", "getData", "()Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Item$Data;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Settings", "Data", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    /* loaded from: classes6.dex */
    public static final /* data */ class Item {

        @NotNull
        private final Data data;

        @NotNull
        private final Settings settings;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003JM\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010 \u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Item$Data;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "image", "", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "", "backgroundColor", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "advBadgeV2", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;ZLjava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getImage", "()Ljava/lang/String;", "()Z", "getBackgroundColor", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAdvBadgeV2", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Data {
            private final AtomActionDTO action;
            private final BadgeDTO advBadgeV2;
            private final String backgroundColor;

            @NotNull
            private final String image;
            private final boolean isAdult;
            private final TextAtom title;

            public Data(TextAtom textAtom, @NotNull String image, boolean z11, String str, AtomActionDTO atomActionDTO, BadgeDTO badgeDTO) {
                Intrinsics.checkNotNullParameter(image, "image");
                this.title = textAtom;
                this.image = image;
                this.isAdult = z11;
                this.backgroundColor = str;
                this.action = atomActionDTO;
                this.advBadgeV2 = badgeDTO;
            }

            public static /* synthetic */ Data copy$default(Data data, TextAtom textAtom, String str, boolean z11, String str2, AtomActionDTO atomActionDTO, BadgeDTO badgeDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textAtom = data.title;
                }
                if ((i11 & 2) != 0) {
                    str = data.image;
                }
                if ((i11 & 4) != 0) {
                    z11 = data.isAdult;
                }
                if ((i11 & 8) != 0) {
                    str2 = data.backgroundColor;
                }
                if ((i11 & 16) != 0) {
                    atomActionDTO = data.action;
                }
                if ((i11 & 32) != 0) {
                    badgeDTO = data.advBadgeV2;
                }
                AtomActionDTO atomActionDTO2 = atomActionDTO;
                BadgeDTO badgeDTO2 = badgeDTO;
                return data.copy(textAtom, str, z11, str2, atomActionDTO2, badgeDTO2);
            }

            /* renamed from: component1, reason: from getter */
            public final TextAtom getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getImage() {
                return this.image;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getIsAdult() {
                return this.isAdult;
            }

            /* renamed from: component4, reason: from getter */
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            /* renamed from: component5, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            /* renamed from: component6, reason: from getter */
            public final BadgeDTO getAdvBadgeV2() {
                return this.advBadgeV2;
            }

            @NotNull
            public final Data copy(TextAtom title, @NotNull String image, boolean isAdult, String backgroundColor, AtomActionDTO action, BadgeDTO advBadgeV2) {
                Intrinsics.checkNotNullParameter(image, "image");
                return new Data(title, image, isAdult, backgroundColor, action, advBadgeV2);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Data)) {
                    return false;
                }
                Data data = (Data) other;
                return Intrinsics.d(this.title, data.title) && Intrinsics.d(this.image, data.image) && this.isAdult == data.isAdult && Intrinsics.d(this.backgroundColor, data.backgroundColor) && Intrinsics.d(this.action, data.action) && Intrinsics.d(this.advBadgeV2, data.advBadgeV2);
            }

            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final BadgeDTO getAdvBadgeV2() {
                return this.advBadgeV2;
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            @NotNull
            public final String getImage() {
                return this.image;
            }

            public final TextAtom getTitle() {
                return this.title;
            }

            public int hashCode() {
                TextAtom textAtom = this.title;
                int a11 = C3532b.a(g.a((textAtom == null ? 0 : textAtom.hashCode()) * 31, 31, this.image), 31, this.isAdult);
                String str = this.backgroundColor;
                int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
                AtomActionDTO atomActionDTO = this.action;
                int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                BadgeDTO badgeDTO = this.advBadgeV2;
                return hashCode2 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
            }

            public final boolean isAdult() {
                return this.isAdult;
            }

            @NotNull
            public String toString() {
                TextAtom textAtom = this.title;
                String str = this.image;
                boolean z11 = this.isAdult;
                String str2 = this.backgroundColor;
                AtomActionDTO atomActionDTO = this.action;
                BadgeDTO badgeDTO = this.advBadgeV2;
                StringBuilder d11 = Bl.b.d("Data(title=", ", image=", str, ", isAdult=", textAtom);
                C5766e.a(", backgroundColor=", str2, ", action=", d11, z11);
                d11.append(atomActionDTO);
                d11.append(", advBadgeV2=");
                d11.append(badgeDTO);
                d11.append(")");
                return d11.toString();
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Item$Settings;", "", "position", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$PositionType;", "rightIndent", "", "<init>", "(Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$PositionType;I)V", "getPosition", "()Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$PositionType;", "getRightIndent", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Settings {

            @NotNull
            private final PositionType position;
            private final int rightIndent;

            public Settings(@NotNull PositionType position, int i11) {
                Intrinsics.checkNotNullParameter(position, "position");
                this.position = position;
                this.rightIndent = i11;
            }

            public static /* synthetic */ Settings copy$default(Settings settings, PositionType positionType, int i11, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    positionType = settings.position;
                }
                if ((i12 & 2) != 0) {
                    i11 = settings.rightIndent;
                }
                return settings.copy(positionType, i11);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final PositionType getPosition() {
                return this.position;
            }

            /* renamed from: component2, reason: from getter */
            public final int getRightIndent() {
                return this.rightIndent;
            }

            @NotNull
            public final Settings copy(@NotNull PositionType position, int rightIndent) {
                Intrinsics.checkNotNullParameter(position, "position");
                return new Settings(position, rightIndent);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Settings)) {
                    return false;
                }
                Settings settings = (Settings) other;
                return this.position == settings.position && this.rightIndent == settings.rightIndent;
            }

            @NotNull
            public final PositionType getPosition() {
                return this.position;
            }

            public final int getRightIndent() {
                return this.rightIndent;
            }

            public int hashCode() {
                return Integer.hashCode(this.rightIndent) + (this.position.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "Settings(position=" + this.position + ", rightIndent=" + this.rightIndent + ")";
            }
        }

        public Item(@NotNull Settings settings, @NotNull Data data, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            Intrinsics.checkNotNullParameter(data, "data");
            this.settings = settings;
            this.data = data;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Item copy$default(Item item, Settings settings, Data data, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                settings = item.settings;
            }
            if ((i11 & 2) != 0) {
                data = item.data;
            }
            if ((i11 & 4) != 0) {
                map = item.trackingInfo;
            }
            return item.copy(settings, data, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Settings getSettings() {
            return this.settings;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Data getData() {
            return this.data;
        }

        public final Map<String, TokenizedTrackingInfo> component3() {
            return this.trackingInfo;
        }

        @NotNull
        public final Item copy(@NotNull Settings settings, @NotNull Data data, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            Intrinsics.checkNotNullParameter(data, "data");
            return new Item(settings, data, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.d(this.settings, item.settings) && Intrinsics.d(this.data, item.data) && Intrinsics.d(this.trackingInfo, item.trackingInfo);
        }

        @NotNull
        public final Data getData() {
            return this.data;
        }

        @NotNull
        public final Settings getSettings() {
            return this.settings;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = (this.data.hashCode() + (this.settings.hashCode() * 31)) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            Settings settings = this.settings;
            Data data = this.data;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("Item(settings=");
            sb2.append(settings);
            sb2.append(", data=");
            sb2.append(data);
            sb2.append(", trackingInfo=");
            return P.f(sb2, map, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$PositionType;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID", "FULL_WIDTH", "HALF_WIDTH_LEFT", "HALF_WIDTH_RIGHT", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class PositionType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ PositionType[] $VALUES;

        @i(name = "INVALID")
        public static final PositionType INVALID = new PositionType("INVALID", 0);

        @i(name = "FULL_WIDTH")
        public static final PositionType FULL_WIDTH = new PositionType("FULL_WIDTH", 1);

        @i(name = "HALF_WIDTH_LEFT")
        public static final PositionType HALF_WIDTH_LEFT = new PositionType("HALF_WIDTH_LEFT", 2);

        @i(name = "HALF_WIDTH_RIGHT")
        public static final PositionType HALF_WIDTH_RIGHT = new PositionType("HALF_WIDTH_RIGHT", 3);

        private static final /* synthetic */ PositionType[] $values() {
            return new PositionType[]{INVALID, FULL_WIDTH, HALF_WIDTH_LEFT, HALF_WIDTH_RIGHT};
        }

        static {
            PositionType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private PositionType(String str, int i11) {
        }

        public static PositionType valueOf(String str) {
            return (PositionType) Enum.valueOf(PositionType.class, str);
        }

        public static PositionType[] values() {
            return (PositionType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$RowType;", "", "<init>", "(Ljava/lang/String;I)V", "SINGLE", "FIRST", "LAST", "DEFAULT", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RowType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ RowType[] $VALUES;
        public static final RowType SINGLE = new RowType("SINGLE", 0);
        public static final RowType FIRST = new RowType("FIRST", 1);
        public static final RowType LAST = new RowType("LAST", 2);
        public static final RowType DEFAULT = new RowType("DEFAULT", 3);

        private static final /* synthetic */ RowType[] $values() {
            return new RowType[]{SINGLE, FIRST, LAST, DEFAULT};
        }

        static {
            RowType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private RowType(String str, int i11) {
        }

        public static RowType valueOf(String str) {
            return (RowType) Enum.valueOf(RowType.class, str);
        }

        public static RowType[] values() {
            return (RowType[]) $VALUES.clone();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JN\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Section;", "", "separatorHeight", "", "backgroundColor", "", "corners", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Corners;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/fresh/main/ui/molecules/header/HeaderV2DTO;", "items", "", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Item;", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Corners;Lru/ozon/app/android/fresh/main/ui/molecules/header/HeaderV2DTO;Ljava/util/List;)V", "getSeparatorHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBackgroundColor", "()Ljava/lang/String;", "getCorners", "()Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Corners;", "getHeader", "()Lru/ozon/app/android/fresh/main/ui/molecules/header/HeaderV2DTO;", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Corners;Lru/ozon/app/android/fresh/main/ui/molecules/header/HeaderV2DTO;Ljava/util/List;)Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Section;", "equals", "", "other", "hashCode", "toString", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Section {

        @NotNull
        private final String backgroundColor;
        private final Corners corners;
        private final HeaderV2DTO header;
        private final List<Item> items;
        private final Integer separatorHeight;

        public Section(Integer num, @NotNull String backgroundColor, Corners corners, HeaderV2DTO headerV2DTO, List<Item> list) {
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this.separatorHeight = num;
            this.backgroundColor = backgroundColor;
            this.corners = corners;
            this.header = headerV2DTO;
            this.items = list;
        }

        public static /* synthetic */ Section copy$default(Section section, Integer num, String str, Corners corners, HeaderV2DTO headerV2DTO, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = section.separatorHeight;
            }
            if ((i11 & 2) != 0) {
                str = section.backgroundColor;
            }
            if ((i11 & 4) != 0) {
                corners = section.corners;
            }
            if ((i11 & 8) != 0) {
                headerV2DTO = section.header;
            }
            if ((i11 & 16) != 0) {
                list = section.items;
            }
            List list2 = list;
            Corners corners2 = corners;
            return section.copy(num, str, corners2, headerV2DTO, list2);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getSeparatorHeight() {
            return this.separatorHeight;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component3, reason: from getter */
        public final Corners getCorners() {
            return this.corners;
        }

        /* renamed from: component4, reason: from getter */
        public final HeaderV2DTO getHeader() {
            return this.header;
        }

        public final List<Item> component5() {
            return this.items;
        }

        @NotNull
        public final Section copy(Integer separatorHeight, @NotNull String backgroundColor, Corners corners, HeaderV2DTO header, List<Item> items) {
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            return new Section(separatorHeight, backgroundColor, corners, header, items);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Section)) {
                return false;
            }
            Section section = (Section) other;
            return Intrinsics.d(this.separatorHeight, section.separatorHeight) && Intrinsics.d(this.backgroundColor, section.backgroundColor) && this.corners == section.corners && Intrinsics.d(this.header, section.header) && Intrinsics.d(this.items, section.items);
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Corners getCorners() {
            return this.corners;
        }

        public final HeaderV2DTO getHeader() {
            return this.header;
        }

        public final List<Item> getItems() {
            return this.items;
        }

        public final Integer getSeparatorHeight() {
            return this.separatorHeight;
        }

        public int hashCode() {
            Integer num = this.separatorHeight;
            int a11 = g.a((num == null ? 0 : num.hashCode()) * 31, 31, this.backgroundColor);
            Corners corners = this.corners;
            int hashCode = (a11 + (corners == null ? 0 : corners.hashCode())) * 31;
            HeaderV2DTO headerV2DTO = this.header;
            int hashCode2 = (hashCode + (headerV2DTO == null ? 0 : headerV2DTO.hashCode())) * 31;
            List<Item> list = this.items;
            return hashCode2 + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Integer num = this.separatorHeight;
            String str = this.backgroundColor;
            Corners corners = this.corners;
            HeaderV2DTO headerV2DTO = this.header;
            List<Item> list = this.items;
            StringBuilder sb2 = new StringBuilder("Section(separatorHeight=");
            sb2.append(num);
            sb2.append(", backgroundColor=");
            sb2.append(str);
            sb2.append(", corners=");
            sb2.append(corners);
            sb2.append(", header=");
            sb2.append(headerV2DTO);
            sb2.append(", items=");
            return C2618u.h(sb2, list, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$SeparatorDTO;", "", "separatorHeight", "", "<init>", "(I)V", "getSeparatorHeight", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeparatorDTO {
        private final int separatorHeight;

        public SeparatorDTO(int i11) {
            this.separatorHeight = i11;
        }

        public static /* synthetic */ SeparatorDTO copy$default(SeparatorDTO separatorDTO, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = separatorDTO.separatorHeight;
            }
            return separatorDTO.copy(i11);
        }

        /* renamed from: component1, reason: from getter */
        public final int getSeparatorHeight() {
            return this.separatorHeight;
        }

        @NotNull
        public final SeparatorDTO copy(int separatorHeight) {
            return new SeparatorDTO(separatorHeight);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SeparatorDTO) && this.separatorHeight == ((SeparatorDTO) other).separatorHeight;
        }

        public final int getSeparatorHeight() {
            return this.separatorHeight;
        }

        public int hashCode() {
            return Integer.hashCode(this.separatorHeight);
        }

        @NotNull
        public String toString() {
            return E.a(this.separatorHeight, "SeparatorDTO(separatorHeight=", ")");
        }
    }

    public NavigationSliderV3DTO(@NotNull List<Section> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.sections = sections;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NavigationSliderV3DTO copy$default(NavigationSliderV3DTO navigationSliderV3DTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = navigationSliderV3DTO.sections;
        }
        return navigationSliderV3DTO.copy(list);
    }

    @NotNull
    public final List<Section> component1() {
        return this.sections;
    }

    @NotNull
    public final NavigationSliderV3DTO copy(@NotNull List<Section> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        return new NavigationSliderV3DTO(sections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NavigationSliderV3DTO) && Intrinsics.d(this.sections, ((NavigationSliderV3DTO) other).sections);
    }

    @NotNull
    public final List<Section> getSections() {
        return this.sections;
    }

    public int hashCode() {
        return this.sections.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("NavigationSliderV3DTO(sections=", ")", this.sections);
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JG\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010!\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$NavigationSliderV3RowDTO;", "", "leftItem", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Item;", "rightItem", "rowType", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$RowType;", "corners", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Corners;", "hasHeader", "", "backgroundColor", "", "<init>", "(Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Item;Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Item;Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$RowType;Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Corners;ZLjava/lang/String;)V", "getLeftItem", "()Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Item;", "getRightItem", "getRowType", "()Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$RowType;", "getCorners", "()Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/data/NavigationSliderV3DTO$Corners;", "getHasHeader", "()Z", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NavigationSliderV3RowDTO {

        @NotNull
        private final String backgroundColor;

        @NotNull
        private final Corners corners;
        private final boolean hasHeader;

        @NotNull
        private final Item leftItem;
        private final Item rightItem;

        @NotNull
        private final RowType rowType;

        public NavigationSliderV3RowDTO(@NotNull Item leftItem, Item item, @NotNull RowType rowType, @NotNull Corners corners, boolean z11, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(leftItem, "leftItem");
            Intrinsics.checkNotNullParameter(rowType, "rowType");
            Intrinsics.checkNotNullParameter(corners, "corners");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this.leftItem = leftItem;
            this.rightItem = item;
            this.rowType = rowType;
            this.corners = corners;
            this.hasHeader = z11;
            this.backgroundColor = backgroundColor;
        }

        public static /* synthetic */ NavigationSliderV3RowDTO copy$default(NavigationSliderV3RowDTO navigationSliderV3RowDTO, Item item, Item item2, RowType rowType, Corners corners, boolean z11, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                item = navigationSliderV3RowDTO.leftItem;
            }
            if ((i11 & 2) != 0) {
                item2 = navigationSliderV3RowDTO.rightItem;
            }
            if ((i11 & 4) != 0) {
                rowType = navigationSliderV3RowDTO.rowType;
            }
            if ((i11 & 8) != 0) {
                corners = navigationSliderV3RowDTO.corners;
            }
            if ((i11 & 16) != 0) {
                z11 = navigationSliderV3RowDTO.hasHeader;
            }
            if ((i11 & 32) != 0) {
                str = navigationSliderV3RowDTO.backgroundColor;
            }
            boolean z12 = z11;
            String str2 = str;
            return navigationSliderV3RowDTO.copy(item, item2, rowType, corners, z12, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Item getLeftItem() {
            return this.leftItem;
        }

        /* renamed from: component2, reason: from getter */
        public final Item getRightItem() {
            return this.rightItem;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final RowType getRowType() {
            return this.rowType;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Corners getCorners() {
            return this.corners;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getHasHeader() {
            return this.hasHeader;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final NavigationSliderV3RowDTO copy(@NotNull Item leftItem, Item rightItem, @NotNull RowType rowType, @NotNull Corners corners, boolean hasHeader, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(leftItem, "leftItem");
            Intrinsics.checkNotNullParameter(rowType, "rowType");
            Intrinsics.checkNotNullParameter(corners, "corners");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            return new NavigationSliderV3RowDTO(leftItem, rightItem, rowType, corners, hasHeader, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavigationSliderV3RowDTO)) {
                return false;
            }
            NavigationSliderV3RowDTO navigationSliderV3RowDTO = (NavigationSliderV3RowDTO) other;
            return Intrinsics.d(this.leftItem, navigationSliderV3RowDTO.leftItem) && Intrinsics.d(this.rightItem, navigationSliderV3RowDTO.rightItem) && this.rowType == navigationSliderV3RowDTO.rowType && this.corners == navigationSliderV3RowDTO.corners && this.hasHeader == navigationSliderV3RowDTO.hasHeader && Intrinsics.d(this.backgroundColor, navigationSliderV3RowDTO.backgroundColor);
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final Corners getCorners() {
            return this.corners;
        }

        public final boolean getHasHeader() {
            return this.hasHeader;
        }

        @NotNull
        public final Item getLeftItem() {
            return this.leftItem;
        }

        public final Item getRightItem() {
            return this.rightItem;
        }

        @NotNull
        public final RowType getRowType() {
            return this.rowType;
        }

        public int hashCode() {
            int hashCode = this.leftItem.hashCode() * 31;
            Item item = this.rightItem;
            return this.backgroundColor.hashCode() + C3532b.a((this.corners.hashCode() + ((this.rowType.hashCode() + ((hashCode + (item == null ? 0 : item.hashCode())) * 31)) * 31)) * 31, 31, this.hasHeader);
        }

        @NotNull
        public String toString() {
            return "NavigationSliderV3RowDTO(leftItem=" + this.leftItem + ", rightItem=" + this.rightItem + ", rowType=" + this.rowType + ", corners=" + this.corners + ", hasHeader=" + this.hasHeader + ", backgroundColor=" + this.backgroundColor + ")";
        }

        public /* synthetic */ NavigationSliderV3RowDTO(Item item, Item item2, RowType rowType, Corners corners, boolean z11, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(item, (i11 & 2) != 0 ? null : item2, rowType, corners, z11, str);
        }
    }
}
