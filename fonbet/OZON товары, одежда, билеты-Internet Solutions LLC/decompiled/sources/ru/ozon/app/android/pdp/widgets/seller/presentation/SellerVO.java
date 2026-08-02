package ru.ozon.app.android.pdp.widgets.seller.presentation;

import Ak.C2436a;
import G.g;
import Ns.b;
import WZ.t;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.InterfaceC8039a;
import m10.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.seller.sellerTag.presentation.SellerTagVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u00032\u00020\u0004B\u008d\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b.\u0010 R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b/\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\b6\u00105R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00107\u001a\u0004\b8\u00109R\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010=\u001a\u0004\b>\u0010?R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00128\u0006¢\u0006\f\n\u0004\b\u0018\u0010:\u001a\u0004\b@\u0010<R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010D\u001a\u0004\bE\u0010F¨\u0006G"}, d2 = {"Lru/ozon/app/android/pdp/widgets/seller/presentation/SellerVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lm10/a;", "Lm10/m;", "", "id", "", "banner", "logo", "logoPlaceholder", "Lru/ozon/uni/atoms/data/badge/Badge;", "premiumBadge", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "Lru/ozon/app/android/seller/sellerTag/presentation/SellerTagVO;", "tags", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "askQuestionButton", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleDefault;", "cells", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "favoriteButton", "LWZ/t;", "tokenizedEvent", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Ljava/util/List;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getBanner", "getLogo", "getLogoPlaceholder", "Lru/ozon/uni/atoms/data/badge/Badge;", "getPremiumBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getName", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getAskQuestionButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getCells", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "getFavoriteButton", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SellerVO implements c, InterfaceC8039a, m {
    private final AtomAction action;
    private final ButtonV3Atom.SmallButton askQuestionButton;
    private final String banner;

    @NotNull
    private final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault> cells;
    private final FavoriteProductMolecule favoriteButton;
    private final long id;
    private final String logo;

    @NotNull
    private final String logoPlaceholder;

    @NotNull
    private final TextDTO name;
    private final Badge premiumBadge;
    private final List<SellerTagVO> tags;
    private final TextDTO title;
    private final t tokenizedEvent;

    public SellerVO(long j11, String str, String str2, @NotNull String logoPlaceholder, Badge badge, TextDTO textDTO, @NotNull TextDTO name, AtomAction atomAction, List<SellerTagVO> list, ButtonV3Atom.SmallButton smallButton, @NotNull List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault> cells, FavoriteProductMolecule favoriteProductMolecule, t tVar) {
        Intrinsics.checkNotNullParameter(logoPlaceholder, "logoPlaceholder");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(cells, "cells");
        this.id = j11;
        this.banner = str;
        this.logo = str2;
        this.logoPlaceholder = logoPlaceholder;
        this.premiumBadge = badge;
        this.title = textDTO;
        this.name = name;
        this.action = atomAction;
        this.tags = list;
        this.askQuestionButton = smallButton;
        this.cells = cells;
        this.favoriteButton = favoriteProductMolecule;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SellerVO)) {
            return false;
        }
        SellerVO sellerVO = (SellerVO) other;
        return this.id == sellerVO.id && Intrinsics.d(this.banner, sellerVO.banner) && Intrinsics.d(this.logo, sellerVO.logo) && Intrinsics.d(this.logoPlaceholder, sellerVO.logoPlaceholder) && Intrinsics.d(this.premiumBadge, sellerVO.premiumBadge) && Intrinsics.d(this.title, sellerVO.title) && Intrinsics.d(this.name, sellerVO.name) && Intrinsics.d(this.action, sellerVO.action) && Intrinsics.d(this.tags, sellerVO.tags) && Intrinsics.d(this.askQuestionButton, sellerVO.askQuestionButton) && Intrinsics.d(this.cells, sellerVO.cells) && Intrinsics.d(this.favoriteButton, sellerVO.favoriteButton) && Intrinsics.d(this.tokenizedEvent, sellerVO.tokenizedEvent);
    }

    public final AtomAction getAction() {
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

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final String getLogo() {
        return this.logo;
    }

    @NotNull
    public final String getLogoPlaceholder() {
        return this.logoPlaceholder;
    }

    @NotNull
    public final TextDTO getName() {
        return this.name;
    }

    public final Badge getPremiumBadge() {
        return this.premiumBadge;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final List<SellerTagVO> getTags() {
        return this.tags;
    }

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
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.banner;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.logo;
        int a11 = g.a((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.logoPlaceholder);
        Badge badge = this.premiumBadge;
        int hashCode3 = (a11 + (badge == null ? 0 : badge.hashCode())) * 31;
        TextDTO textDTO = this.title;
        int a12 = b.a(this.name, (hashCode3 + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31);
        AtomAction atomAction = this.action;
        int hashCode4 = (a12 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        List<SellerTagVO> list = this.tags;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        ButtonV3Atom.SmallButton smallButton = this.askQuestionButton;
        int b11 = g.b((hashCode5 + (smallButton == null ? 0 : smallButton.hashCode())) * 31, 31, this.cells);
        FavoriteProductMolecule favoriteProductMolecule = this.favoriteButton;
        int hashCode6 = (b11 + (favoriteProductMolecule == null ? 0 : favoriteProductMolecule.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode6 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.banner;
        String str2 = this.logo;
        String str3 = this.logoPlaceholder;
        Badge badge = this.premiumBadge;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.name;
        AtomAction atomAction = this.action;
        List<SellerTagVO> list = this.tags;
        ButtonV3Atom.SmallButton smallButton = this.askQuestionButton;
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault> list2 = this.cells;
        FavoriteProductMolecule favoriteProductMolecule = this.favoriteButton;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2436a.c(j11, "SellerVO(id=", ", banner=", str);
        Nh.a.h(c11, ", logo=", str2, ", logoPlaceholder=", str3);
        c11.append(", premiumBadge=");
        c11.append(badge);
        c11.append(", title=");
        c11.append(textDTO);
        c11.append(", name=");
        c11.append(textDTO2);
        c11.append(", action=");
        c11.append(atomAction);
        c11.append(", tags=");
        c11.append(list);
        c11.append(", askQuestionButton=");
        c11.append(smallButton);
        c11.append(", cells=");
        c11.append(list2);
        c11.append(", favoriteButton=");
        c11.append(favoriteProductMolecule);
        return Lh.a.b(c11, ", tokenizedEvent=", tVar, ")");
    }
}
