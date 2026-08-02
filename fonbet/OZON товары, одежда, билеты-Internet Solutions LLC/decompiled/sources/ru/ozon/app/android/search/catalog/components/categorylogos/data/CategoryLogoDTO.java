package ru.ozon.app.android.search.catalog.components.categorylogos.data;

import D3.h;
import N3.C3660k;
import Nh.a;
import Sc.InterfaceC3999a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u00101\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0017\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J¨\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u00107J\u0013\u00108\u001a\u00020\n2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0017R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\t\u0010 R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\"\u0010 R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006="}, d2 = {"Lru/ozon/app/android/search/catalog/components/categorylogos/data/CategoryLogoDTO;", "", "type", "", "id", SelectionItemFormDTO.TITLE_FIELD_NAME, "link", "deeplink", "image", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "", "hasChildren", "parentTitle", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButton;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButton;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getType", "()Ljava/lang/String;", "getId", "getTitle", "getLink$annotations", "()V", "getLink", "getDeeplink$annotations", "getDeeplink", "getImage", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHasChildren", "getParentTitle", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButton;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButton;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)Lru/ozon/app/android/search/catalog/components/categorylogos/data/CategoryLogoDTO;", "equals", "other", "hashCode", "", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CategoryLogoDTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;
    private final ButtonV3Atom.LargeIconButton button;
    private final String deeplink;
    private final Boolean hasChildren;
    private final String id;
    private final String image;
    private final Boolean isAdult;
    private final String link;
    private final String parentTitle;
    private final String title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final String type;

    public CategoryLogoDTO(@NotNull String type, String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, String str6, ButtonV3Atom.LargeIconButton largeIconButton, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.id = str;
        this.title = str2;
        this.link = str3;
        this.deeplink = str4;
        this.image = str5;
        this.isAdult = bool;
        this.hasChildren = bool2;
        this.parentTitle = str6;
        this.button = largeIconButton;
        this.action = atomActionDTO;
        this.trackingInfo = map;
    }

    public static /* synthetic */ CategoryLogoDTO copy$default(CategoryLogoDTO categoryLogoDTO, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, ButtonV3Atom.LargeIconButton largeIconButton, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = categoryLogoDTO.type;
        }
        if ((i11 & 2) != 0) {
            str2 = categoryLogoDTO.id;
        }
        if ((i11 & 4) != 0) {
            str3 = categoryLogoDTO.title;
        }
        if ((i11 & 8) != 0) {
            str4 = categoryLogoDTO.link;
        }
        if ((i11 & 16) != 0) {
            str5 = categoryLogoDTO.deeplink;
        }
        if ((i11 & 32) != 0) {
            str6 = categoryLogoDTO.image;
        }
        if ((i11 & 64) != 0) {
            bool = categoryLogoDTO.isAdult;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            bool2 = categoryLogoDTO.hasChildren;
        }
        if ((i11 & 256) != 0) {
            str7 = categoryLogoDTO.parentTitle;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            largeIconButton = categoryLogoDTO.button;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            atomActionDTO = categoryLogoDTO.action;
        }
        if ((i11 & 2048) != 0) {
            map = categoryLogoDTO.trackingInfo;
        }
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Map map2 = map;
        String str8 = str7;
        ButtonV3Atom.LargeIconButton largeIconButton2 = largeIconButton;
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        String str9 = str5;
        String str10 = str6;
        return categoryLogoDTO.copy(str, str2, str3, str4, str9, str10, bool3, bool4, str8, largeIconButton2, atomActionDTO2, map2);
    }

    @InterfaceC3999a
    public static /* synthetic */ void getDeeplink$annotations() {
    }

    @InterfaceC3999a
    public static /* synthetic */ void getLink$annotations() {
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component10, reason: from getter */
    public final ButtonV3Atom.LargeIconButton getButton() {
        return this.button;
    }

    /* renamed from: component11, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component12() {
        return this.trackingInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component6, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getIsAdult() {
        return this.isAdult;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getHasChildren() {
        return this.hasChildren;
    }

    /* renamed from: component9, reason: from getter */
    public final String getParentTitle() {
        return this.parentTitle;
    }

    @NotNull
    public final CategoryLogoDTO copy(@NotNull String type, String id2, String title, String link, String deeplink, String image, Boolean isAdult, Boolean hasChildren, String parentTitle, ButtonV3Atom.LargeIconButton button, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new CategoryLogoDTO(type, id2, title, link, deeplink, image, isAdult, hasChildren, parentTitle, button, action, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CategoryLogoDTO)) {
            return false;
        }
        CategoryLogoDTO categoryLogoDTO = (CategoryLogoDTO) other;
        return Intrinsics.d(this.type, categoryLogoDTO.type) && Intrinsics.d(this.id, categoryLogoDTO.id) && Intrinsics.d(this.title, categoryLogoDTO.title) && Intrinsics.d(this.link, categoryLogoDTO.link) && Intrinsics.d(this.deeplink, categoryLogoDTO.deeplink) && Intrinsics.d(this.image, categoryLogoDTO.image) && Intrinsics.d(this.isAdult, categoryLogoDTO.isAdult) && Intrinsics.d(this.hasChildren, categoryLogoDTO.hasChildren) && Intrinsics.d(this.parentTitle, categoryLogoDTO.parentTitle) && Intrinsics.d(this.button, categoryLogoDTO.button) && Intrinsics.d(this.action, categoryLogoDTO.action) && Intrinsics.d(this.trackingInfo, categoryLogoDTO.trackingInfo);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final ButtonV3Atom.LargeIconButton getButton() {
        return this.button;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final Boolean getHasChildren() {
        return this.hasChildren;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getParentTitle() {
        return this.parentTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.id;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.link;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.deeplink;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.image;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.isAdult;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasChildren;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str6 = this.parentTitle;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ButtonV3Atom.LargeIconButton largeIconButton = this.button;
        int hashCode10 = (hashCode9 + (largeIconButton == null ? 0 : largeIconButton.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode11 = (hashCode10 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode11 + (map != null ? map.hashCode() : 0);
    }

    public final Boolean isAdult() {
        return this.isAdult;
    }

    @NotNull
    public String toString() {
        String str = this.type;
        String str2 = this.id;
        String str3 = this.title;
        String str4 = this.link;
        String str5 = this.deeplink;
        String str6 = this.image;
        Boolean bool = this.isAdult;
        Boolean bool2 = this.hasChildren;
        String str7 = this.parentTitle;
        ButtonV3Atom.LargeIconButton largeIconButton = this.button;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C3660k.d("CategoryLogoDTO(type=", str, ", id=", str2, ", title=");
        a.h(d11, str3, ", link=", str4, ", deeplink=");
        a.h(d11, str5, ", image=", str6, ", isAdult=");
        h.h(d11, bool, ", hasChildren=", bool2, ", parentTitle=");
        d11.append(str7);
        d11.append(", button=");
        d11.append(largeIconButton);
        d11.append(", action=");
        return D40.a.d(d11, atomActionDTO, ", trackingInfo=", map, ")");
    }
}
