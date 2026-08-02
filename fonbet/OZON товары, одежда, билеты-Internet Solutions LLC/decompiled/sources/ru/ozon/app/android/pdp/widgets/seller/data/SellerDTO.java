package ru.ozon.app.android.pdp.widgets.seller.data;

import B90.C2619v;
import G.g;
import N3.C3660k;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.seller.sellerTag.data.SellerTagDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00120\rHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0017\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0003J¡\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020=HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\r¢\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001f\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006?"}, d2 = {"Lru/ozon/app/android/pdp/widgets/seller/data/SellerDTO;", "", "banner", "", "logo", "premiumBadge", "Lru/ozon/uni/atoms/data/badge/Badge;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", AppMeasurementSdk.ConditionalUserProperty.NAME, "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "tags", "", "Lru/ozon/app/android/seller/sellerTag/data/SellerTagDTO;", "askQuestionButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "cells", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleDefault;", "favoriteButton", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Ljava/util/List;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Ljava/util/Map;)V", "getBanner", "()Ljava/lang/String;", "getLogo", "getPremiumBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getName", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTags", "()Ljava/util/List;", "getAskQuestionButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getCells", "getFavoriteButton", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SellerDTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;
    private final ButtonV3Atom.SmallButton askQuestionButton;
    private final String banner;

    @NotNull
    private final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault> cells;
    private final FavoriteProductMolecule favoriteButton;
    private final String logo;

    @NotNull
    private final TextAtom name;
    private final Badge premiumBadge;
    private final List<SellerTagDTO> tags;
    private final TextAtom title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public SellerDTO(String str, String str2, Badge badge, TextAtom textAtom, @NotNull TextAtom name, AtomActionDTO atomActionDTO, List<SellerTagDTO> list, ButtonV3Atom.SmallButton smallButton, @NotNull List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault> cells, FavoriteProductMolecule favoriteProductMolecule, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(cells, "cells");
        this.banner = str;
        this.logo = str2;
        this.premiumBadge = badge;
        this.title = textAtom;
        this.name = name;
        this.action = atomActionDTO;
        this.tags = list;
        this.askQuestionButton = smallButton;
        this.cells = cells;
        this.favoriteButton = favoriteProductMolecule;
        this.trackingInfo = map;
    }

    public static /* synthetic */ SellerDTO copy$default(SellerDTO sellerDTO, String str, String str2, Badge badge, TextAtom textAtom, TextAtom textAtom2, AtomActionDTO atomActionDTO, List list, ButtonV3Atom.SmallButton smallButton, List list2, FavoriteProductMolecule favoriteProductMolecule, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sellerDTO.banner;
        }
        if ((i11 & 2) != 0) {
            str2 = sellerDTO.logo;
        }
        if ((i11 & 4) != 0) {
            badge = sellerDTO.premiumBadge;
        }
        if ((i11 & 8) != 0) {
            textAtom = sellerDTO.title;
        }
        if ((i11 & 16) != 0) {
            textAtom2 = sellerDTO.name;
        }
        if ((i11 & 32) != 0) {
            atomActionDTO = sellerDTO.action;
        }
        if ((i11 & 64) != 0) {
            list = sellerDTO.tags;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            smallButton = sellerDTO.askQuestionButton;
        }
        if ((i11 & 256) != 0) {
            list2 = sellerDTO.cells;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            favoriteProductMolecule = sellerDTO.favoriteButton;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            map = sellerDTO.trackingInfo;
        }
        FavoriteProductMolecule favoriteProductMolecule2 = favoriteProductMolecule;
        Map map2 = map;
        ButtonV3Atom.SmallButton smallButton2 = smallButton;
        List list3 = list2;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        List list4 = list;
        TextAtom textAtom3 = textAtom2;
        Badge badge2 = badge;
        return sellerDTO.copy(str, str2, badge2, textAtom, textAtom3, atomActionDTO2, list4, smallButton2, list3, favoriteProductMolecule2, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBanner() {
        return this.banner;
    }

    /* renamed from: component10, reason: from getter */
    public final FavoriteProductMolecule getFavoriteButton() {
        return this.favoriteButton;
    }

    public final Map<String, TokenizedTrackingInfo> component11() {
        return this.trackingInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    /* renamed from: component3, reason: from getter */
    public final Badge getPremiumBadge() {
        return this.premiumBadge;
    }

    /* renamed from: component4, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final TextAtom getName() {
        return this.name;
    }

    /* renamed from: component6, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final List<SellerTagDTO> component7() {
        return this.tags;
    }

    /* renamed from: component8, reason: from getter */
    public final ButtonV3Atom.SmallButton getAskQuestionButton() {
        return this.askQuestionButton;
    }

    @NotNull
    public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault> component9() {
        return this.cells;
    }

    @NotNull
    public final SellerDTO copy(String banner, String logo, Badge premiumBadge, TextAtom title, @NotNull TextAtom name, AtomActionDTO action, List<SellerTagDTO> tags, ButtonV3Atom.SmallButton askQuestionButton, @NotNull List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault> cells, FavoriteProductMolecule favoriteButton, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(cells, "cells");
        return new SellerDTO(banner, logo, premiumBadge, title, name, action, tags, askQuestionButton, cells, favoriteButton, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SellerDTO)) {
            return false;
        }
        SellerDTO sellerDTO = (SellerDTO) other;
        return Intrinsics.d(this.banner, sellerDTO.banner) && Intrinsics.d(this.logo, sellerDTO.logo) && Intrinsics.d(this.premiumBadge, sellerDTO.premiumBadge) && Intrinsics.d(this.title, sellerDTO.title) && Intrinsics.d(this.name, sellerDTO.name) && Intrinsics.d(this.action, sellerDTO.action) && Intrinsics.d(this.tags, sellerDTO.tags) && Intrinsics.d(this.askQuestionButton, sellerDTO.askQuestionButton) && Intrinsics.d(this.cells, sellerDTO.cells) && Intrinsics.d(this.favoriteButton, sellerDTO.favoriteButton) && Intrinsics.d(this.trackingInfo, sellerDTO.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final ButtonV3Atom.SmallButton getAskQuestionButton() {
        return this.askQuestionButton;
    }

    public final String getBanner() {
        return this.banner;
    }

    @NotNull
    public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault> getCells() {
        return this.cells;
    }

    public final FavoriteProductMolecule getFavoriteButton() {
        return this.favoriteButton;
    }

    public final String getLogo() {
        return this.logo;
    }

    @NotNull
    public final TextAtom getName() {
        return this.name;
    }

    public final Badge getPremiumBadge() {
        return this.premiumBadge;
    }

    public final List<SellerTagDTO> getTags() {
        return this.tags;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        String str = this.banner;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.logo;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Badge badge = this.premiumBadge;
        int hashCode3 = (hashCode2 + (badge == null ? 0 : badge.hashCode())) * 31;
        TextAtom textAtom = this.title;
        int b11 = C2619v.b((hashCode3 + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31, this.name);
        AtomActionDTO atomActionDTO = this.action;
        int hashCode4 = (b11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        List<SellerTagDTO> list = this.tags;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        ButtonV3Atom.SmallButton smallButton = this.askQuestionButton;
        int b12 = g.b((hashCode5 + (smallButton == null ? 0 : smallButton.hashCode())) * 31, 31, this.cells);
        FavoriteProductMolecule favoriteProductMolecule = this.favoriteButton;
        int hashCode6 = (b12 + (favoriteProductMolecule == null ? 0 : favoriteProductMolecule.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode6 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.banner;
        String str2 = this.logo;
        Badge badge = this.premiumBadge;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.name;
        AtomActionDTO atomActionDTO = this.action;
        List<SellerTagDTO> list = this.tags;
        ButtonV3Atom.SmallButton smallButton = this.askQuestionButton;
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault> list2 = this.cells;
        FavoriteProductMolecule favoriteProductMolecule = this.favoriteButton;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C3660k.d("SellerDTO(banner=", str, ", logo=", str2, ", premiumBadge=");
        d11.append(badge);
        d11.append(", title=");
        d11.append(textAtom);
        d11.append(", name=");
        d11.append(textAtom2);
        d11.append(", action=");
        d11.append(atomActionDTO);
        d11.append(", tags=");
        d11.append(list);
        d11.append(", askQuestionButton=");
        d11.append(smallButton);
        d11.append(", cells=");
        d11.append(list2);
        d11.append(", favoriteButton=");
        d11.append(favoriteProductMolecule);
        d11.append(", trackingInfo=");
        return P.f(d11, map, ")");
    }
}
