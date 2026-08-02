package ru.ozon.app.android.fresh.checkout.widgets.searchBankList.presentation;

import G.g;
import Lh.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.checkout.widgets.searchBankList.data.SearchBankListDTO;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BY\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00106\u001a\u0004\b7\u00108¨\u00069"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/searchBankList/presentation/SearchBankListVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "banks", "Lru/ozon/uni/atoms/data/text/TextDTO;", "emptyListPlaceholder", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", DeleteAccountApiResponse.Error.TYPE_RESTRICTION, "Lru/ozon/app/android/fresh/checkout/widgets/searchBankList/data/SearchBankListDTO$SearchBar;", "searchBar", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "closeButton", "Lru/ozon/app/android/fresh/checkout/widgets/searchBankList/data/SearchBankListDTO$SectionHeader;", "sectionHeader", "LWZ/t;", "tokenizedEvent", "<init>", "(JLjava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/app/android/fresh/checkout/widgets/searchBankList/data/SearchBankListDTO$SearchBar;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/fresh/checkout/widgets/searchBankList/data/SearchBankListDTO$SectionHeader;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getBanks", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getEmptyListPlaceholder", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getRestriction", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "Lru/ozon/app/android/fresh/checkout/widgets/searchBankList/data/SearchBankListDTO$SearchBar;", "getSearchBar", "()Lru/ozon/app/android/fresh/checkout/widgets/searchBankList/data/SearchBankListDTO$SearchBar;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getCloseButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/app/android/fresh/checkout/widgets/searchBankList/data/SearchBankListDTO$SectionHeader;", "getSectionHeader", "()Lru/ozon/app/android/fresh/checkout/widgets/searchBankList/data/SearchBankListDTO$SectionHeader;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SearchBankListVO implements c {

    @NotNull
    private final List<CellDTO> banks;
    private final IconButtonV3DTO closeButton;
    private final TextDTO emptyListPlaceholder;
    private final long id;
    private final NotificationDTO restriction;
    private final SearchBankListDTO.SearchBar searchBar;
    private final SearchBankListDTO.SectionHeader sectionHeader;
    private final t tokenizedEvent;

    public SearchBankListVO(long j11, @NotNull List<CellDTO> banks, TextDTO textDTO, NotificationDTO notificationDTO, SearchBankListDTO.SearchBar searchBar, IconButtonV3DTO iconButtonV3DTO, SearchBankListDTO.SectionHeader sectionHeader, t tVar) {
        Intrinsics.checkNotNullParameter(banks, "banks");
        this.id = j11;
        this.banks = banks;
        this.emptyListPlaceholder = textDTO;
        this.restriction = notificationDTO;
        this.searchBar = searchBar;
        this.closeButton = iconButtonV3DTO;
        this.sectionHeader = sectionHeader;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchBankListVO)) {
            return false;
        }
        SearchBankListVO searchBankListVO = (SearchBankListVO) other;
        return this.id == searchBankListVO.id && Intrinsics.d(this.banks, searchBankListVO.banks) && Intrinsics.d(this.emptyListPlaceholder, searchBankListVO.emptyListPlaceholder) && Intrinsics.d(this.restriction, searchBankListVO.restriction) && Intrinsics.d(this.searchBar, searchBankListVO.searchBar) && Intrinsics.d(this.closeButton, searchBankListVO.closeButton) && Intrinsics.d(this.sectionHeader, searchBankListVO.sectionHeader) && Intrinsics.d(this.tokenizedEvent, searchBankListVO.tokenizedEvent);
    }

    @NotNull
    public final List<CellDTO> getBanks() {
        return this.banks;
    }

    public final IconButtonV3DTO getCloseButton() {
        return this.closeButton;
    }

    public final TextDTO getEmptyListPlaceholder() {
        return this.emptyListPlaceholder;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final NotificationDTO getRestriction() {
        return this.restriction;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final SearchBankListDTO.SearchBar getSearchBar() {
        return this.searchBar;
    }

    public final SearchBankListDTO.SectionHeader getSectionHeader() {
        return this.sectionHeader;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.banks);
        TextDTO textDTO = this.emptyListPlaceholder;
        int hashCode = (b11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        NotificationDTO notificationDTO = this.restriction;
        int hashCode2 = (hashCode + (notificationDTO == null ? 0 : notificationDTO.hashCode())) * 31;
        SearchBankListDTO.SearchBar searchBar = this.searchBar;
        int hashCode3 = (hashCode2 + (searchBar == null ? 0 : searchBar.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.closeButton;
        int hashCode4 = (hashCode3 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        SearchBankListDTO.SectionHeader sectionHeader = this.sectionHeader;
        int hashCode5 = (hashCode4 + (sectionHeader == null ? 0 : sectionHeader.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode5 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<CellDTO> list = this.banks;
        TextDTO textDTO = this.emptyListPlaceholder;
        NotificationDTO notificationDTO = this.restriction;
        SearchBankListDTO.SearchBar searchBar = this.searchBar;
        IconButtonV3DTO iconButtonV3DTO = this.closeButton;
        SearchBankListDTO.SectionHeader sectionHeader = this.sectionHeader;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = b.b(j11, "SearchBankListVO(id=", ", banks=", list);
        b11.append(", emptyListPlaceholder=");
        b11.append(textDTO);
        b11.append(", restriction=");
        b11.append(notificationDTO);
        b11.append(", searchBar=");
        b11.append(searchBar);
        b11.append(", closeButton=");
        b11.append(iconButtonV3DTO);
        b11.append(", sectionHeader=");
        b11.append(sectionHeader);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(")");
        return b11.toString();
    }
}
