package ru.ozon.app.android.favorites.applyWishlist.presentation;

import De.C2859b;
import G.g;
import Ns.b;
import TY.a;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002Bm\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0088\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b)\u0010(R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b,\u0010\u001aR\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b1\u00102R\u001f\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010*\u001a\u0004\b6\u0010\u001aR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u00107\u001a\u0004\b8\u00109¨\u0006:"}, d2 = {"Lru/ozon/app/android/favorites/applyWishlist/presentation/ApplyWishlistVO;", "Ll20/c;", "Lru/ozon/composer/network/widget/item/ViewItem;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "hint", "listTitle", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cells", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "saveButton", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "errorForUser", "uniqueId", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;LWZ/t;Ljava/lang/String;Ljava/lang/Long;)V", "copy", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;LWZ/t;Ljava/lang/String;Ljava/lang/Long;)Lru/ozon/app/android/favorites/applyWishlist/presentation/ApplyWishlistVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Ljava/lang/String;", "getHint", "getListTitle", "Ljava/util/List;", "getCells", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSaveButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "getErrorForUser", "Ljava/lang/Long;", "getUniqueId", "()Ljava/lang/Long;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ApplyWishlistVO implements c {
    private final List<CellDTO> cells;
    private final String errorForUser;

    @NotNull
    private final String hint;
    private final long id;

    @NotNull
    private final String listTitle;

    @NotNull
    private final ButtonV3DTO saveButton;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final t tokenizedEvent;
    private final Long uniqueId;

    public ApplyWishlistVO(long j11, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull String hint, @NotNull String listTitle, List<CellDTO> list, @NotNull ButtonV3DTO saveButton, t tVar, String str, Long l11) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(listTitle, "listTitle");
        Intrinsics.checkNotNullParameter(saveButton, "saveButton");
        this.id = j11;
        this.title = title;
        this.subtitle = subtitle;
        this.hint = hint;
        this.listTitle = listTitle;
        this.cells = list;
        this.saveButton = saveButton;
        this.tokenizedEvent = tVar;
        this.errorForUser = str;
        this.uniqueId = l11;
    }

    public static /* synthetic */ ApplyWishlistVO copy$default(ApplyWishlistVO applyWishlistVO, long j11, TextDTO textDTO, TextDTO textDTO2, String str, String str2, List list, ButtonV3DTO buttonV3DTO, t tVar, String str3, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = applyWishlistVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            textDTO = applyWishlistVO.title;
        }
        return applyWishlistVO.copy(j12, textDTO, (i11 & 4) != 0 ? applyWishlistVO.subtitle : textDTO2, (i11 & 8) != 0 ? applyWishlistVO.hint : str, (i11 & 16) != 0 ? applyWishlistVO.listTitle : str2, (i11 & 32) != 0 ? applyWishlistVO.cells : list, (i11 & 64) != 0 ? applyWishlistVO.saveButton : buttonV3DTO, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? applyWishlistVO.tokenizedEvent : tVar, (i11 & 256) != 0 ? applyWishlistVO.errorForUser : str3, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? applyWishlistVO.uniqueId : l11);
    }

    @NotNull
    public final ApplyWishlistVO copy(long id2, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull String hint, @NotNull String listTitle, List<CellDTO> cells, @NotNull ButtonV3DTO saveButton, t tokenizedEvent, String errorForUser, Long uniqueId) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(listTitle, "listTitle");
        Intrinsics.checkNotNullParameter(saveButton, "saveButton");
        return new ApplyWishlistVO(id2, title, subtitle, hint, listTitle, cells, saveButton, tokenizedEvent, errorForUser, uniqueId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplyWishlistVO)) {
            return false;
        }
        ApplyWishlistVO applyWishlistVO = (ApplyWishlistVO) other;
        return this.id == applyWishlistVO.id && Intrinsics.d(this.title, applyWishlistVO.title) && Intrinsics.d(this.subtitle, applyWishlistVO.subtitle) && Intrinsics.d(this.hint, applyWishlistVO.hint) && Intrinsics.d(this.listTitle, applyWishlistVO.listTitle) && Intrinsics.d(this.cells, applyWishlistVO.cells) && Intrinsics.d(this.saveButton, applyWishlistVO.saveButton) && Intrinsics.d(this.tokenizedEvent, applyWishlistVO.tokenizedEvent) && Intrinsics.d(this.errorForUser, applyWishlistVO.errorForUser) && Intrinsics.d(this.uniqueId, applyWishlistVO.uniqueId);
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

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getListTitle() {
        return this.listTitle;
    }

    @NotNull
    public final ButtonV3DTO getSaveButton() {
        return this.saveButton;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(g.a(b.a(this.subtitle, b.a(this.title, Long.hashCode(this.id) * 31, 31), 31), 31, this.hint), 31, this.listTitle);
        List<CellDTO> list = this.cells;
        int c11 = C2859b.c(this.saveButton, (a11 + (list == null ? 0 : list.hashCode())) * 31, 31);
        t tVar = this.tokenizedEvent;
        int hashCode = (c11 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        String str = this.errorForUser;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l11 = this.uniqueId;
        return hashCode2 + (l11 != null ? l11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        String str = this.hint;
        String str2 = this.listTitle;
        List<CellDTO> list = this.cells;
        ButtonV3DTO buttonV3DTO = this.saveButton;
        t tVar = this.tokenizedEvent;
        String str3 = this.errorForUser;
        Long l11 = this.uniqueId;
        StringBuilder b11 = a.b("ApplyWishlistVO(id=", j11, ", title=", textDTO);
        b11.append(", subtitle=");
        b11.append(textDTO2);
        b11.append(", hint=");
        b11.append(str);
        Nh.a.g(", listTitle=", str2, ", cells=", b11, list);
        b11.append(", saveButton=");
        b11.append(buttonV3DTO);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(", errorForUser=");
        b11.append(str3);
        b11.append(", uniqueId=");
        b11.append(l11);
        b11.append(")");
        return b11.toString();
    }

    public /* synthetic */ ApplyWishlistVO(long j11, TextDTO textDTO, TextDTO textDTO2, String str, String str2, List list, ButtonV3DTO buttonV3DTO, t tVar, String str3, Long l11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, textDTO, textDTO2, str, str2, list, buttonV3DTO, tVar, str3, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : l11);
    }
}
