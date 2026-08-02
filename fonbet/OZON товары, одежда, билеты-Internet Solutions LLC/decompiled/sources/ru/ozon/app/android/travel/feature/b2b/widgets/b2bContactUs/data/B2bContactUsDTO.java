package ru.ozon.app.android.travel.feature.b2b.widgets.b2bContactUs.data;

import B90.C2618u;
import C.o0;
import HY.a;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.travel.molecules.dto.themeImage.v1.ThemeImageV1DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.core.UniColors;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001cB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bContactUs/data/B2bContactUsDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "banner", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bContactUs/data/B2bContactUsDTO$BannerDTO;", "cells", "", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleDefault;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/travel/feature/b2b/widgets/b2bContactUs/data/B2bContactUsDTO$BannerDTO;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getBanner", "()Lru/ozon/app/android/travel/feature/b2b/widgets/b2bContactUs/data/B2bContactUsDTO$BannerDTO;", "getCells", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "BannerDTO", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class B2bContactUsDTO {
    public static final int $stable = 8;
    private final BannerDTO banner;

    @NotNull
    private final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault> cells;

    @NotNull
    private final TextAtom title;

    public B2bContactUsDTO(@NotNull TextAtom title, BannerDTO bannerDTO, @NotNull List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault> cells) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cells, "cells");
        this.title = title;
        this.banner = bannerDTO;
        this.cells = cells;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ B2bContactUsDTO copy$default(B2bContactUsDTO b2bContactUsDTO, TextAtom textAtom, BannerDTO bannerDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = b2bContactUsDTO.title;
        }
        if ((i11 & 2) != 0) {
            bannerDTO = b2bContactUsDTO.banner;
        }
        if ((i11 & 4) != 0) {
            list = b2bContactUsDTO.cells;
        }
        return b2bContactUsDTO.copy(textAtom, bannerDTO, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final BannerDTO getBanner() {
        return this.banner;
    }

    @NotNull
    public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault> component3() {
        return this.cells;
    }

    @NotNull
    public final B2bContactUsDTO copy(@NotNull TextAtom title, BannerDTO banner, @NotNull List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault> cells) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cells, "cells");
        return new B2bContactUsDTO(title, banner, cells);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof B2bContactUsDTO)) {
            return false;
        }
        B2bContactUsDTO b2bContactUsDTO = (B2bContactUsDTO) other;
        return Intrinsics.d(this.title, b2bContactUsDTO.title) && Intrinsics.d(this.banner, b2bContactUsDTO.banner) && Intrinsics.d(this.cells, b2bContactUsDTO.cells);
    }

    public final BannerDTO getBanner() {
        return this.banner;
    }

    @NotNull
    public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault> getCells() {
        return this.cells;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        BannerDTO bannerDTO = this.banner;
        return this.cells.hashCode() + ((hashCode + (bannerDTO == null ? 0 : bannerDTO.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        BannerDTO bannerDTO = this.banner;
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault> list = this.cells;
        StringBuilder sb2 = new StringBuilder("B2bContactUsDTO(title=");
        sb2.append(textAtom);
        sb2.append(", banner=");
        sb2.append(bannerDTO);
        sb2.append(", cells=");
        return C2618u.h(sb2, list, ")");
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J?\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bContactUs/data/B2bContactUsDTO$BannerDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "imageUrl", "Lru/ozon/app/android/travel/molecules/dto/themeImage/v1/ThemeImageV1DTO;", "backgroundColor", "", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/travel/molecules/dto/themeImage/v1/ThemeImageV1DTO;Ljava/lang/String;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getImageUrl", "()Lru/ozon/app/android/travel/molecules/dto/themeImage/v1/ThemeImageV1DTO;", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BannerDTO {
        public static final int $stable = 8;
        private final AtomActionDTO action;

        @NotNull
        private final String backgroundColor;

        @NotNull
        private final ThemeImageV1DTO imageUrl;
        private final TextAtom subtitle;

        @NotNull
        private final TextAtom title;

        public BannerDTO(@NotNull TextAtom title, TextAtom textAtom, AtomActionDTO atomActionDTO, @NotNull ThemeImageV1DTO imageUrl, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            this.title = title;
            this.subtitle = textAtom;
            this.action = atomActionDTO;
            this.imageUrl = imageUrl;
            this.backgroundColor = backgroundColor;
        }

        public static /* synthetic */ BannerDTO copy$default(BannerDTO bannerDTO, TextAtom textAtom, TextAtom textAtom2, AtomActionDTO atomActionDTO, ThemeImageV1DTO themeImageV1DTO, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = bannerDTO.title;
            }
            if ((i11 & 2) != 0) {
                textAtom2 = bannerDTO.subtitle;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = bannerDTO.action;
            }
            if ((i11 & 8) != 0) {
                themeImageV1DTO = bannerDTO.imageUrl;
            }
            if ((i11 & 16) != 0) {
                str = bannerDTO.backgroundColor;
            }
            String str2 = str;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            return bannerDTO.copy(textAtom, textAtom2, atomActionDTO2, themeImageV1DTO, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final ThemeImageV1DTO getImageUrl() {
            return this.imageUrl;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final BannerDTO copy(@NotNull TextAtom title, TextAtom subtitle, AtomActionDTO action, @NotNull ThemeImageV1DTO imageUrl, @NotNull String backgroundColor) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            return new BannerDTO(title, subtitle, action, imageUrl, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BannerDTO)) {
                return false;
            }
            BannerDTO bannerDTO = (BannerDTO) other;
            return Intrinsics.d(this.title, bannerDTO.title) && Intrinsics.d(this.subtitle, bannerDTO.subtitle) && Intrinsics.d(this.action, bannerDTO.action) && Intrinsics.d(this.imageUrl, bannerDTO.imageUrl) && Intrinsics.d(this.backgroundColor, bannerDTO.backgroundColor);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final ThemeImageV1DTO getImageUrl() {
            return this.imageUrl;
        }

        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            TextAtom textAtom = this.subtitle;
            int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            return this.backgroundColor.hashCode() + ((this.imageUrl.hashCode() + ((hashCode2 + (atomActionDTO != null ? atomActionDTO.hashCode() : 0)) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.title;
            TextAtom textAtom2 = this.subtitle;
            AtomActionDTO atomActionDTO = this.action;
            ThemeImageV1DTO themeImageV1DTO = this.imageUrl;
            String str = this.backgroundColor;
            StringBuilder a11 = a.a("BannerDTO(title=", textAtom, ", subtitle=", textAtom2, ", action=");
            a11.append(atomActionDTO);
            a11.append(", imageUrl=");
            a11.append(themeImageV1DTO);
            a11.append(", backgroundColor=");
            return o0.c(a11, str, ")");
        }

        public /* synthetic */ BannerDTO(TextAtom textAtom, TextAtom textAtom2, AtomActionDTO atomActionDTO, ThemeImageV1DTO themeImageV1DTO, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(textAtom, textAtom2, atomActionDTO, themeImageV1DTO, (i11 & 16) != 0 ? UniColors.BG_MARKETING_PRIMARY.getToken() : str);
        }
    }
}
