package ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.data;

import De.C2859b;
import K1.G;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/data/SearchMercuryAddressResponse;", "", "addresses", "", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/data/SearchMercuryAddressResponse$AddressDTO;", "error", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/data/SearchMercuryAddressResponse$ErrorDTO;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/data/SearchMercuryAddressResponse$ErrorDTO;)V", "getAddresses", "()Ljava/util/List;", "getError", "()Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/data/SearchMercuryAddressResponse$ErrorDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "AddressDTO", "ErrorDTO", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SearchMercuryAddressResponse {
    public static final int $stable = 8;
    private final List<AddressDTO> addresses;
    private final ErrorDTO error;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/data/SearchMercuryAddressResponse$AddressDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "icon", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AddressDTO {
        public static final int $stable = CommonAtomIconDTO.$stable;
        private final AtomActionDTO action;
        private final CommonAtomIconDTO icon;
        private final TextDTO title;

        public AddressDTO(TextDTO textDTO, CommonAtomIconDTO commonAtomIconDTO, AtomActionDTO atomActionDTO) {
            this.title = textDTO;
            this.icon = commonAtomIconDTO;
            this.action = atomActionDTO;
        }

        public static /* synthetic */ AddressDTO copy$default(AddressDTO addressDTO, TextDTO textDTO, CommonAtomIconDTO commonAtomIconDTO, AtomActionDTO atomActionDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = addressDTO.title;
            }
            if ((i11 & 2) != 0) {
                commonAtomIconDTO = addressDTO.icon;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = addressDTO.action;
            }
            return addressDTO.copy(textDTO, commonAtomIconDTO, atomActionDTO);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final CommonAtomIconDTO getIcon() {
            return this.icon;
        }

        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final AddressDTO copy(TextDTO title, CommonAtomIconDTO icon, AtomActionDTO action) {
            return new AddressDTO(title, icon, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddressDTO)) {
                return false;
            }
            AddressDTO addressDTO = (AddressDTO) other;
            return Intrinsics.d(this.title, addressDTO.title) && Intrinsics.d(this.icon, addressDTO.icon) && Intrinsics.d(this.action, addressDTO.action);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final CommonAtomIconDTO getIcon() {
            return this.icon;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            TextDTO textDTO = this.title;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            CommonAtomIconDTO commonAtomIconDTO = this.icon;
            int hashCode2 = (hashCode + (commonAtomIconDTO == null ? 0 : commonAtomIconDTO.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            return hashCode2 + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            CommonAtomIconDTO commonAtomIconDTO = this.icon;
            AtomActionDTO atomActionDTO = this.action;
            StringBuilder sb2 = new StringBuilder("AddressDTO(title=");
            sb2.append(textDTO);
            sb2.append(", icon=");
            sb2.append(commonAtomIconDTO);
            sb2.append(", action=");
            return G.c(sb2, atomActionDTO, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/data/SearchMercuryAddressResponse$ErrorDTO;", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ErrorDTO {
        public static final int $stable = 0;
        private final AtomActionDTO action;

        public ErrorDTO(AtomActionDTO atomActionDTO) {
            this.action = atomActionDTO;
        }

        public static /* synthetic */ ErrorDTO copy$default(ErrorDTO errorDTO, AtomActionDTO atomActionDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                atomActionDTO = errorDTO.action;
            }
            return errorDTO.copy(atomActionDTO);
        }

        /* renamed from: component1, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final ErrorDTO copy(AtomActionDTO action) {
            return new ErrorDTO(action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ErrorDTO) && Intrinsics.d(this.action, ((ErrorDTO) other).action);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public int hashCode() {
            AtomActionDTO atomActionDTO = this.action;
            if (atomActionDTO == null) {
                return 0;
            }
            return atomActionDTO.hashCode();
        }

        @NotNull
        public String toString() {
            return C2859b.f("ErrorDTO(action=", ")", this.action);
        }
    }

    public SearchMercuryAddressResponse(List<AddressDTO> list, ErrorDTO errorDTO) {
        this.addresses = list;
        this.error = errorDTO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchMercuryAddressResponse copy$default(SearchMercuryAddressResponse searchMercuryAddressResponse, List list, ErrorDTO errorDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = searchMercuryAddressResponse.addresses;
        }
        if ((i11 & 2) != 0) {
            errorDTO = searchMercuryAddressResponse.error;
        }
        return searchMercuryAddressResponse.copy(list, errorDTO);
    }

    public final List<AddressDTO> component1() {
        return this.addresses;
    }

    /* renamed from: component2, reason: from getter */
    public final ErrorDTO getError() {
        return this.error;
    }

    @NotNull
    public final SearchMercuryAddressResponse copy(List<AddressDTO> addresses, ErrorDTO error) {
        return new SearchMercuryAddressResponse(addresses, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchMercuryAddressResponse)) {
            return false;
        }
        SearchMercuryAddressResponse searchMercuryAddressResponse = (SearchMercuryAddressResponse) other;
        return Intrinsics.d(this.addresses, searchMercuryAddressResponse.addresses) && Intrinsics.d(this.error, searchMercuryAddressResponse.error);
    }

    public final List<AddressDTO> getAddresses() {
        return this.addresses;
    }

    public final ErrorDTO getError() {
        return this.error;
    }

    public int hashCode() {
        List<AddressDTO> list = this.addresses;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        ErrorDTO errorDTO = this.error;
        return hashCode + (errorDTO != null ? errorDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SearchMercuryAddressResponse(addresses=" + this.addresses + ", error=" + this.error + ")";
    }
}
