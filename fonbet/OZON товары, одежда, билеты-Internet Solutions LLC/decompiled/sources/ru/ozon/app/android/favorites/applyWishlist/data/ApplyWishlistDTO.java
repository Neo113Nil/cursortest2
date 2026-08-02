package ru.ozon.app.android.favorites.applyWishlist.data;

import De.C2859b;
import G.g;
import Nh.a;
import Ns.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003Jq\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017¨\u0006/"}, d2 = {"Lru/ozon/app/android/favorites/applyWishlist/data/ApplyWishlistDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "hint", "", "listTitle", "cells", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "saveButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "errorForUser", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;Ljava/lang/String;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getHint", "()Ljava/lang/String;", "getListTitle", "getCells", "()Ljava/util/List;", "getSaveButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getTrackingInfo", "()Ljava/util/Map;", "getErrorForUser", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ApplyWishlistDTO {
    private final List<CellDTO> cells;
    private final String errorForUser;

    @NotNull
    private final String hint;

    @NotNull
    private final String listTitle;

    @NotNull
    private final ButtonV3DTO saveButton;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public ApplyWishlistDTO(@NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull String hint, @NotNull String listTitle, List<CellDTO> list, @NotNull ButtonV3DTO saveButton, Map<String, TokenizedTrackingInfo> map, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(listTitle, "listTitle");
        Intrinsics.checkNotNullParameter(saveButton, "saveButton");
        this.title = title;
        this.subtitle = subtitle;
        this.hint = hint;
        this.listTitle = listTitle;
        this.cells = list;
        this.saveButton = saveButton;
        this.trackingInfo = map;
        this.errorForUser = str;
    }

    public static /* synthetic */ ApplyWishlistDTO copy$default(ApplyWishlistDTO applyWishlistDTO, TextDTO textDTO, TextDTO textDTO2, String str, String str2, List list, ButtonV3DTO buttonV3DTO, Map map, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = applyWishlistDTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = applyWishlistDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            str = applyWishlistDTO.hint;
        }
        if ((i11 & 8) != 0) {
            str2 = applyWishlistDTO.listTitle;
        }
        if ((i11 & 16) != 0) {
            list = applyWishlistDTO.cells;
        }
        if ((i11 & 32) != 0) {
            buttonV3DTO = applyWishlistDTO.saveButton;
        }
        if ((i11 & 64) != 0) {
            map = applyWishlistDTO.trackingInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str3 = applyWishlistDTO.errorForUser;
        }
        Map map2 = map;
        String str4 = str3;
        List list2 = list;
        ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
        return applyWishlistDTO.copy(textDTO, textDTO2, str, str2, list2, buttonV3DTO2, map2, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getListTitle() {
        return this.listTitle;
    }

    public final List<CellDTO> component5() {
        return this.cells;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final ButtonV3DTO getSaveButton() {
        return this.saveButton;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    /* renamed from: component8, reason: from getter */
    public final String getErrorForUser() {
        return this.errorForUser;
    }

    @NotNull
    public final ApplyWishlistDTO copy(@NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull String hint, @NotNull String listTitle, List<CellDTO> cells, @NotNull ButtonV3DTO saveButton, Map<String, TokenizedTrackingInfo> trackingInfo, String errorForUser) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(listTitle, "listTitle");
        Intrinsics.checkNotNullParameter(saveButton, "saveButton");
        return new ApplyWishlistDTO(title, subtitle, hint, listTitle, cells, saveButton, trackingInfo, errorForUser);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplyWishlistDTO)) {
            return false;
        }
        ApplyWishlistDTO applyWishlistDTO = (ApplyWishlistDTO) other;
        return Intrinsics.d(this.title, applyWishlistDTO.title) && Intrinsics.d(this.subtitle, applyWishlistDTO.subtitle) && Intrinsics.d(this.hint, applyWishlistDTO.hint) && Intrinsics.d(this.listTitle, applyWishlistDTO.listTitle) && Intrinsics.d(this.cells, applyWishlistDTO.cells) && Intrinsics.d(this.saveButton, applyWishlistDTO.saveButton) && Intrinsics.d(this.trackingInfo, applyWishlistDTO.trackingInfo) && Intrinsics.d(this.errorForUser, applyWishlistDTO.errorForUser);
    }

    public final List<CellDTO> getCells() {
        return this.cells;
    }

    public final String getErrorForUser() {
        return this.errorForUser;
    }

    @NotNull
    public final String getHint() {
        return this.hint;
    }

    @NotNull
    public final String getListTitle() {
        return this.listTitle;
    }

    @NotNull
    public final ButtonV3DTO getSaveButton() {
        return this.saveButton;
    }

    @NotNull
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = g.a(g.a(b.a(this.subtitle, this.title.hashCode() * 31, 31), 31, this.hint), 31, this.listTitle);
        List<CellDTO> list = this.cells;
        int c11 = C2859b.c(this.saveButton, (a11 + (list == null ? 0 : list.hashCode())) * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode = (c11 + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.errorForUser;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        String str = this.hint;
        String str2 = this.listTitle;
        List<CellDTO> list = this.cells;
        ButtonV3DTO buttonV3DTO = this.saveButton;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        String str3 = this.errorForUser;
        StringBuilder g10 = D3.g.g("ApplyWishlistDTO(title=", textDTO, ", subtitle=", textDTO2, ", hint=");
        a.h(g10, str, ", listTitle=", str2, ", cells=");
        g10.append(list);
        g10.append(", saveButton=");
        g10.append(buttonV3DTO);
        g10.append(", trackingInfo=");
        g10.append(map);
        g10.append(", errorForUser=");
        g10.append(str3);
        g10.append(")");
        return g10.toString();
    }
}
