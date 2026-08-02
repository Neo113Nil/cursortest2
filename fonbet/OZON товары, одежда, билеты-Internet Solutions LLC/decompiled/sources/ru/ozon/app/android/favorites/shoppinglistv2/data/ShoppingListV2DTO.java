package ru.ozon.app.android.favorites.shoppinglistv2.data;

import G.g;
import Ih.a;
import N3.C3660k;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003Jr\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u000b\u0010\u001bR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006."}, d2 = {"Lru/ozon/app/android/favorites/shoppinglistv2/data/ShoppingListV2DTO;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "icon", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "optionsButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "isPinned", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Ljava/lang/Boolean;Ljava/util/Map;)V", "getId", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getIcon", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getOptionsButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Ljava/lang/Boolean;Ljava/util/Map;)Lru/ozon/app/android/favorites/shoppinglistv2/data/ShoppingListV2DTO;", "equals", "other", "hashCode", "", "toString", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ShoppingListV2DTO {

    @NotNull
    private final AtomActionDTO action;

    @NotNull
    private final String icon;

    @NotNull
    private final String id;
    private final Boolean isPinned;
    private final ButtonV3Atom.SmallIconButton optionsButton;
    private final String subtitle;

    @NotNull
    private final String title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public ShoppingListV2DTO(@NotNull String id2, @NotNull String title, String str, @NotNull String icon, @NotNull AtomActionDTO action, ButtonV3Atom.SmallIconButton smallIconButton, Boolean bool, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(action, "action");
        this.id = id2;
        this.title = title;
        this.subtitle = str;
        this.icon = icon;
        this.action = action;
        this.optionsButton = smallIconButton;
        this.isPinned = bool;
        this.trackingInfo = map;
    }

    public static /* synthetic */ ShoppingListV2DTO copy$default(ShoppingListV2DTO shoppingListV2DTO, String str, String str2, String str3, String str4, AtomActionDTO atomActionDTO, ButtonV3Atom.SmallIconButton smallIconButton, Boolean bool, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = shoppingListV2DTO.id;
        }
        if ((i11 & 2) != 0) {
            str2 = shoppingListV2DTO.title;
        }
        if ((i11 & 4) != 0) {
            str3 = shoppingListV2DTO.subtitle;
        }
        if ((i11 & 8) != 0) {
            str4 = shoppingListV2DTO.icon;
        }
        if ((i11 & 16) != 0) {
            atomActionDTO = shoppingListV2DTO.action;
        }
        if ((i11 & 32) != 0) {
            smallIconButton = shoppingListV2DTO.optionsButton;
        }
        if ((i11 & 64) != 0) {
            bool = shoppingListV2DTO.isPinned;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map = shoppingListV2DTO.trackingInfo;
        }
        Boolean bool2 = bool;
        Map map2 = map;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        ButtonV3Atom.SmallIconButton smallIconButton2 = smallIconButton;
        return shoppingListV2DTO.copy(str, str2, str3, str4, atomActionDTO2, smallIconButton2, bool2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component6, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getOptionsButton() {
        return this.optionsButton;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getIsPinned() {
        return this.isPinned;
    }

    public final Map<String, TokenizedTrackingInfo> component8() {
        return this.trackingInfo;
    }

    @NotNull
    public final ShoppingListV2DTO copy(@NotNull String id2, @NotNull String title, String subtitle, @NotNull String icon, @NotNull AtomActionDTO action, ButtonV3Atom.SmallIconButton optionsButton, Boolean isPinned, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(action, "action");
        return new ShoppingListV2DTO(id2, title, subtitle, icon, action, optionsButton, isPinned, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShoppingListV2DTO)) {
            return false;
        }
        ShoppingListV2DTO shoppingListV2DTO = (ShoppingListV2DTO) other;
        return Intrinsics.d(this.id, shoppingListV2DTO.id) && Intrinsics.d(this.title, shoppingListV2DTO.title) && Intrinsics.d(this.subtitle, shoppingListV2DTO.subtitle) && Intrinsics.d(this.icon, shoppingListV2DTO.icon) && Intrinsics.d(this.action, shoppingListV2DTO.action) && Intrinsics.d(this.optionsButton, shoppingListV2DTO.optionsButton) && Intrinsics.d(this.isPinned, shoppingListV2DTO.isPinned) && Intrinsics.d(this.trackingInfo, shoppingListV2DTO.trackingInfo);
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final ButtonV3Atom.SmallIconButton getOptionsButton() {
        return this.optionsButton;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = g.a(this.id.hashCode() * 31, 31, this.title);
        String str = this.subtitle;
        int b11 = a.b(this.action, g.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.icon), 31);
        ButtonV3Atom.SmallIconButton smallIconButton = this.optionsButton;
        int hashCode = (b11 + (smallIconButton == null ? 0 : smallIconButton.hashCode())) * 31;
        Boolean bool = this.isPinned;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final Boolean isPinned() {
        return this.isPinned;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.subtitle;
        String str4 = this.icon;
        AtomActionDTO atomActionDTO = this.action;
        ButtonV3Atom.SmallIconButton smallIconButton = this.optionsButton;
        Boolean bool = this.isPinned;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C3660k.d("ShoppingListV2DTO(id=", str, ", title=", str2, ", subtitle=");
        Nh.a.h(d11, str3, ", icon=", str4, ", action=");
        d11.append(atomActionDTO);
        d11.append(", optionsButton=");
        d11.append(smallIconButton);
        d11.append(", isPinned=");
        d11.append(bool);
        d11.append(", trackingInfo=");
        d11.append(map);
        d11.append(")");
        return d11.toString();
    }
}
