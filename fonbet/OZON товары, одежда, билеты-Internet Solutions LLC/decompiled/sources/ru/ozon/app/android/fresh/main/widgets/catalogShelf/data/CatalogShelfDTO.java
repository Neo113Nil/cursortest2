package ru.ozon.app.android.fresh.main.widgets.catalogShelf.data;

import B3.p;
import C.o0;
import Cm.e;
import G.g;
import H3.c;
import Kk.C3532b;
import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.main.ui.molecules.header.HeaderV2DTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfDTO;", "Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfModel;", "sections", "", "Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfDTO$CatalogShelfSection;", "<init>", "(Ljava/util/List;)V", "getSections", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "CatalogShelfSection", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CatalogShelfDTO implements CatalogShelfModel {

    @NotNull
    private final List<CatalogShelfSection> sections;

    public CatalogShelfDTO(@NotNull List<CatalogShelfSection> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.sections = sections;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CatalogShelfDTO copy$default(CatalogShelfDTO catalogShelfDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = catalogShelfDTO.sections;
        }
        return catalogShelfDTO.copy(list);
    }

    @NotNull
    public final List<CatalogShelfSection> component1() {
        return this.sections;
    }

    @NotNull
    public final CatalogShelfDTO copy(@NotNull List<CatalogShelfSection> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        return new CatalogShelfDTO(sections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CatalogShelfDTO) && Intrinsics.d(this.sections, ((CatalogShelfDTO) other).sections);
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.catalogShelf.data.CatalogShelfModel
    @NotNull
    public List<CatalogShelfSection> getSections() {
        return this.sections;
    }

    public int hashCode() {
        return this.sections.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("CatalogShelfDTO(sections=", ")", this.sections);
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0004 !\"#B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\nHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006$"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfDTO$CatalogShelfSection;", "", "roundedCorners", "Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfDTO$CatalogShelfSection$RoundedCorners;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/fresh/main/ui/molecules/header/HeaderV2DTO;", "items", "", "Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfDTO$CatalogShelfSection$CatalogShelfItem;", "sectionScrollKey", "", "<init>", "(Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfDTO$CatalogShelfSection$RoundedCorners;Lru/ozon/app/android/fresh/main/ui/molecules/header/HeaderV2DTO;Ljava/util/List;Ljava/lang/String;)V", "getRoundedCorners", "()Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfDTO$CatalogShelfSection$RoundedCorners;", "getHeader", "()Lru/ozon/app/android/fresh/main/ui/molecules/header/HeaderV2DTO;", "getItems", "()Ljava/util/List;", "getSectionScrollKey", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "RoundedCorners", "CatalogShelfHeader", "CatalogShelfRow", "CatalogShelfItem", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class CatalogShelfSection {
        private final HeaderV2DTO header;

        @NotNull
        private final List<CatalogShelfItem> items;
        private final RoundedCorners roundedCorners;
        private final String sectionScrollKey;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfDTO$CatalogShelfSection$CatalogShelfHeader;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/fresh/main/ui/molecules/header/HeaderV2DTO;", "catalogueTabsConnectionTag", "", "<init>", "(Lru/ozon/app/android/fresh/main/ui/molecules/header/HeaderV2DTO;Ljava/lang/String;)V", "getHeader", "()Lru/ozon/app/android/fresh/main/ui/molecules/header/HeaderV2DTO;", "getCatalogueTabsConnectionTag", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CatalogShelfHeader {
            private final String catalogueTabsConnectionTag;

            @NotNull
            private final HeaderV2DTO header;

            public CatalogShelfHeader(@NotNull HeaderV2DTO header, String str) {
                Intrinsics.checkNotNullParameter(header, "header");
                this.header = header;
                this.catalogueTabsConnectionTag = str;
            }

            public static /* synthetic */ CatalogShelfHeader copy$default(CatalogShelfHeader catalogShelfHeader, HeaderV2DTO headerV2DTO, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    headerV2DTO = catalogShelfHeader.header;
                }
                if ((i11 & 2) != 0) {
                    str = catalogShelfHeader.catalogueTabsConnectionTag;
                }
                return catalogShelfHeader.copy(headerV2DTO, str);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final HeaderV2DTO getHeader() {
                return this.header;
            }

            /* renamed from: component2, reason: from getter */
            public final String getCatalogueTabsConnectionTag() {
                return this.catalogueTabsConnectionTag;
            }

            @NotNull
            public final CatalogShelfHeader copy(@NotNull HeaderV2DTO header, String catalogueTabsConnectionTag) {
                Intrinsics.checkNotNullParameter(header, "header");
                return new CatalogShelfHeader(header, catalogueTabsConnectionTag);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CatalogShelfHeader)) {
                    return false;
                }
                CatalogShelfHeader catalogShelfHeader = (CatalogShelfHeader) other;
                return Intrinsics.d(this.header, catalogShelfHeader.header) && Intrinsics.d(this.catalogueTabsConnectionTag, catalogShelfHeader.catalogueTabsConnectionTag);
            }

            public final String getCatalogueTabsConnectionTag() {
                return this.catalogueTabsConnectionTag;
            }

            @NotNull
            public final HeaderV2DTO getHeader() {
                return this.header;
            }

            public int hashCode() {
                int hashCode = this.header.hashCode() * 31;
                String str = this.catalogueTabsConnectionTag;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                return "CatalogShelfHeader(header=" + this.header + ", catalogueTabsConnectionTag=" + this.catalogueTabsConnectionTag + ")";
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003JY\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006*"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfDTO$CatalogShelfSection$CatalogShelfItem;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "soldOut", "Lru/ozon/uni/atoms/data/badge/Badge;", "image", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "advBadgeV2", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/badge/Badge;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSoldOut", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getImage", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAdvBadgeV2", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CatalogShelfItem {
            private final AtomActionDTO action;
            private final BadgeDTO advBadgeV2;

            @NotNull
            private final String image;
            private final Badge soldOut;

            @NotNull
            private final TextAtom title;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            public CatalogShelfItem(@NotNull TextAtom title, Badge badge, @NotNull String image, AtomActionDTO atomActionDTO, BadgeDTO badgeDTO, Map<String, TokenizedTrackingInfo> map) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(image, "image");
                this.title = title;
                this.soldOut = badge;
                this.image = image;
                this.action = atomActionDTO;
                this.advBadgeV2 = badgeDTO;
                this.trackingInfo = map;
            }

            public static /* synthetic */ CatalogShelfItem copy$default(CatalogShelfItem catalogShelfItem, TextAtom textAtom, Badge badge, String str, AtomActionDTO atomActionDTO, BadgeDTO badgeDTO, Map map, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textAtom = catalogShelfItem.title;
                }
                if ((i11 & 2) != 0) {
                    badge = catalogShelfItem.soldOut;
                }
                if ((i11 & 4) != 0) {
                    str = catalogShelfItem.image;
                }
                if ((i11 & 8) != 0) {
                    atomActionDTO = catalogShelfItem.action;
                }
                if ((i11 & 16) != 0) {
                    badgeDTO = catalogShelfItem.advBadgeV2;
                }
                if ((i11 & 32) != 0) {
                    map = catalogShelfItem.trackingInfo;
                }
                BadgeDTO badgeDTO2 = badgeDTO;
                Map map2 = map;
                return catalogShelfItem.copy(textAtom, badge, str, atomActionDTO, badgeDTO2, map2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TextAtom getTitle() {
                return this.title;
            }

            /* renamed from: component2, reason: from getter */
            public final Badge getSoldOut() {
                return this.soldOut;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getImage() {
                return this.image;
            }

            /* renamed from: component4, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            /* renamed from: component5, reason: from getter */
            public final BadgeDTO getAdvBadgeV2() {
                return this.advBadgeV2;
            }

            public final Map<String, TokenizedTrackingInfo> component6() {
                return this.trackingInfo;
            }

            @NotNull
            public final CatalogShelfItem copy(@NotNull TextAtom title, Badge soldOut, @NotNull String image, AtomActionDTO action, BadgeDTO advBadgeV2, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(image, "image");
                return new CatalogShelfItem(title, soldOut, image, action, advBadgeV2, trackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CatalogShelfItem)) {
                    return false;
                }
                CatalogShelfItem catalogShelfItem = (CatalogShelfItem) other;
                return Intrinsics.d(this.title, catalogShelfItem.title) && Intrinsics.d(this.soldOut, catalogShelfItem.soldOut) && Intrinsics.d(this.image, catalogShelfItem.image) && Intrinsics.d(this.action, catalogShelfItem.action) && Intrinsics.d(this.advBadgeV2, catalogShelfItem.advBadgeV2) && Intrinsics.d(this.trackingInfo, catalogShelfItem.trackingInfo);
            }

            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final BadgeDTO getAdvBadgeV2() {
                return this.advBadgeV2;
            }

            @NotNull
            public final String getImage() {
                return this.image;
            }

            public final Badge getSoldOut() {
                return this.soldOut;
            }

            @NotNull
            public final TextAtom getTitle() {
                return this.title;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                Badge badge = this.soldOut;
                int a11 = g.a((hashCode + (badge == null ? 0 : badge.hashCode())) * 31, 31, this.image);
                AtomActionDTO atomActionDTO = this.action;
                int hashCode2 = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                BadgeDTO badgeDTO = this.advBadgeV2;
                int hashCode3 = (hashCode2 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return hashCode3 + (map != null ? map.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                TextAtom textAtom = this.title;
                Badge badge = this.soldOut;
                String str = this.image;
                AtomActionDTO atomActionDTO = this.action;
                BadgeDTO badgeDTO = this.advBadgeV2;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder sb2 = new StringBuilder("CatalogShelfItem(title=");
                sb2.append(textAtom);
                sb2.append(", soldOut=");
                sb2.append(badge);
                sb2.append(", image=");
                p.c(str, ", action=", ", advBadgeV2=", sb2, atomActionDTO);
                sb2.append(badgeDTO);
                sb2.append(", trackingInfo=");
                sb2.append(map);
                sb2.append(")");
                return sb2.toString();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfDTO$CatalogShelfSection$RoundedCorners;", "", "<init>", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "FULL", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class RoundedCorners {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ RoundedCorners[] $VALUES;

            @i(name = "TOP")
            public static final RoundedCorners TOP = new RoundedCorners("TOP", 0);

            @i(name = "BOTTOM")
            public static final RoundedCorners BOTTOM = new RoundedCorners("BOTTOM", 1);

            @i(name = "FULL")
            public static final RoundedCorners FULL = new RoundedCorners("FULL", 2);

            private static final /* synthetic */ RoundedCorners[] $values() {
                return new RoundedCorners[]{TOP, BOTTOM, FULL};
            }

            static {
                RoundedCorners[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private RoundedCorners(String str, int i11) {
            }

            public static RoundedCorners valueOf(String str) {
                return (RoundedCorners) Enum.valueOf(RoundedCorners.class, str);
            }

            public static RoundedCorners[] values() {
                return (RoundedCorners[]) $VALUES.clone();
            }
        }

        public CatalogShelfSection(RoundedCorners roundedCorners, HeaderV2DTO headerV2DTO, @NotNull List<CatalogShelfItem> items, String str) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.roundedCorners = roundedCorners;
            this.header = headerV2DTO;
            this.items = items;
            this.sectionScrollKey = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CatalogShelfSection copy$default(CatalogShelfSection catalogShelfSection, RoundedCorners roundedCorners, HeaderV2DTO headerV2DTO, List list, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                roundedCorners = catalogShelfSection.roundedCorners;
            }
            if ((i11 & 2) != 0) {
                headerV2DTO = catalogShelfSection.header;
            }
            if ((i11 & 4) != 0) {
                list = catalogShelfSection.items;
            }
            if ((i11 & 8) != 0) {
                str = catalogShelfSection.sectionScrollKey;
            }
            return catalogShelfSection.copy(roundedCorners, headerV2DTO, list, str);
        }

        /* renamed from: component1, reason: from getter */
        public final RoundedCorners getRoundedCorners() {
            return this.roundedCorners;
        }

        /* renamed from: component2, reason: from getter */
        public final HeaderV2DTO getHeader() {
            return this.header;
        }

        @NotNull
        public final List<CatalogShelfItem> component3() {
            return this.items;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSectionScrollKey() {
            return this.sectionScrollKey;
        }

        @NotNull
        public final CatalogShelfSection copy(RoundedCorners roundedCorners, HeaderV2DTO header, @NotNull List<CatalogShelfItem> items, String sectionScrollKey) {
            Intrinsics.checkNotNullParameter(items, "items");
            return new CatalogShelfSection(roundedCorners, header, items, sectionScrollKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CatalogShelfSection)) {
                return false;
            }
            CatalogShelfSection catalogShelfSection = (CatalogShelfSection) other;
            return this.roundedCorners == catalogShelfSection.roundedCorners && Intrinsics.d(this.header, catalogShelfSection.header) && Intrinsics.d(this.items, catalogShelfSection.items) && Intrinsics.d(this.sectionScrollKey, catalogShelfSection.sectionScrollKey);
        }

        public final HeaderV2DTO getHeader() {
            return this.header;
        }

        @NotNull
        public final List<CatalogShelfItem> getItems() {
            return this.items;
        }

        public final RoundedCorners getRoundedCorners() {
            return this.roundedCorners;
        }

        public final String getSectionScrollKey() {
            return this.sectionScrollKey;
        }

        public int hashCode() {
            RoundedCorners roundedCorners = this.roundedCorners;
            int hashCode = (roundedCorners == null ? 0 : roundedCorners.hashCode()) * 31;
            HeaderV2DTO headerV2DTO = this.header;
            int b11 = g.b((hashCode + (headerV2DTO == null ? 0 : headerV2DTO.hashCode())) * 31, 31, this.items);
            String str = this.sectionScrollKey;
            return b11 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "CatalogShelfSection(roundedCorners=" + this.roundedCorners + ", header=" + this.header + ", items=" + this.items + ", sectionScrollKey=" + this.sectionScrollKey + ")";
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfDTO$CatalogShelfSection$CatalogShelfRow;", "", "topCorners", "", "bottomCorners", "list", "", "Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfDTO$CatalogShelfSection$CatalogShelfItem;", "scrollKey", "", "catalogueTabsConnectionTag", "<init>", "(ZZLjava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getTopCorners", "()Z", "getBottomCorners", "getList", "()Ljava/util/List;", "getScrollKey", "()Ljava/lang/String;", "getCatalogueTabsConnectionTag", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CatalogShelfRow {
            private final boolean bottomCorners;
            private final String catalogueTabsConnectionTag;

            @NotNull
            private final List<CatalogShelfItem> list;
            private final String scrollKey;
            private final boolean topCorners;

            public CatalogShelfRow(boolean z11, boolean z12, @NotNull List<CatalogShelfItem> list, String str, String str2) {
                Intrinsics.checkNotNullParameter(list, "list");
                this.topCorners = z11;
                this.bottomCorners = z12;
                this.list = list;
                this.scrollKey = str;
                this.catalogueTabsConnectionTag = str2;
            }

            public static /* synthetic */ CatalogShelfRow copy$default(CatalogShelfRow catalogShelfRow, boolean z11, boolean z12, List list, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    z11 = catalogShelfRow.topCorners;
                }
                if ((i11 & 2) != 0) {
                    z12 = catalogShelfRow.bottomCorners;
                }
                if ((i11 & 4) != 0) {
                    list = catalogShelfRow.list;
                }
                if ((i11 & 8) != 0) {
                    str = catalogShelfRow.scrollKey;
                }
                if ((i11 & 16) != 0) {
                    str2 = catalogShelfRow.catalogueTabsConnectionTag;
                }
                String str3 = str2;
                List list2 = list;
                return catalogShelfRow.copy(z11, z12, list2, str, str3);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getTopCorners() {
                return this.topCorners;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getBottomCorners() {
                return this.bottomCorners;
            }

            @NotNull
            public final List<CatalogShelfItem> component3() {
                return this.list;
            }

            /* renamed from: component4, reason: from getter */
            public final String getScrollKey() {
                return this.scrollKey;
            }

            /* renamed from: component5, reason: from getter */
            public final String getCatalogueTabsConnectionTag() {
                return this.catalogueTabsConnectionTag;
            }

            @NotNull
            public final CatalogShelfRow copy(boolean topCorners, boolean bottomCorners, @NotNull List<CatalogShelfItem> list, String scrollKey, String catalogueTabsConnectionTag) {
                Intrinsics.checkNotNullParameter(list, "list");
                return new CatalogShelfRow(topCorners, bottomCorners, list, scrollKey, catalogueTabsConnectionTag);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CatalogShelfRow)) {
                    return false;
                }
                CatalogShelfRow catalogShelfRow = (CatalogShelfRow) other;
                return this.topCorners == catalogShelfRow.topCorners && this.bottomCorners == catalogShelfRow.bottomCorners && Intrinsics.d(this.list, catalogShelfRow.list) && Intrinsics.d(this.scrollKey, catalogShelfRow.scrollKey) && Intrinsics.d(this.catalogueTabsConnectionTag, catalogShelfRow.catalogueTabsConnectionTag);
            }

            public final boolean getBottomCorners() {
                return this.bottomCorners;
            }

            public final String getCatalogueTabsConnectionTag() {
                return this.catalogueTabsConnectionTag;
            }

            @NotNull
            public final List<CatalogShelfItem> getList() {
                return this.list;
            }

            public final String getScrollKey() {
                return this.scrollKey;
            }

            public final boolean getTopCorners() {
                return this.topCorners;
            }

            public int hashCode() {
                int b11 = g.b(C3532b.a(Boolean.hashCode(this.topCorners) * 31, 31, this.bottomCorners), 31, this.list);
                String str = this.scrollKey;
                int hashCode = (b11 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.catalogueTabsConnectionTag;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                boolean z11 = this.topCorners;
                boolean z12 = this.bottomCorners;
                List<CatalogShelfItem> list = this.list;
                String str = this.scrollKey;
                String str2 = this.catalogueTabsConnectionTag;
                StringBuilder d11 = Lh.a.d("CatalogShelfRow(topCorners=", ", bottomCorners=", ", list=", z11, z12);
                e.i(", scrollKey=", str, ", catalogueTabsConnectionTag=", d11, list);
                return o0.c(d11, str2, ")");
            }

            public /* synthetic */ CatalogShelfRow(boolean z11, boolean z12, List list, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(z11, z12, list, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? null : str2);
            }
        }
    }
}
