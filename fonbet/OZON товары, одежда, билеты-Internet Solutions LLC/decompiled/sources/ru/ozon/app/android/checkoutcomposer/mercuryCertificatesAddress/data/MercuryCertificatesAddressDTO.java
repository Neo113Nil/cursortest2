package ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/data/MercuryCertificatesAddressDTO;", "", "searchHint", "", "searchAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getSearchHint", "()Ljava/lang/String;", "getSearchAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class MercuryCertificatesAddressDTO {
    public static final int $stable = 0;
    private final AtomActionDTO searchAction;
    private final String searchHint;

    public MercuryCertificatesAddressDTO(String str, AtomActionDTO atomActionDTO) {
        this.searchHint = str;
        this.searchAction = atomActionDTO;
    }

    public static /* synthetic */ MercuryCertificatesAddressDTO copy$default(MercuryCertificatesAddressDTO mercuryCertificatesAddressDTO, String str, AtomActionDTO atomActionDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = mercuryCertificatesAddressDTO.searchHint;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = mercuryCertificatesAddressDTO.searchAction;
        }
        return mercuryCertificatesAddressDTO.copy(str, atomActionDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSearchHint() {
        return this.searchHint;
    }

    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getSearchAction() {
        return this.searchAction;
    }

    @NotNull
    public final MercuryCertificatesAddressDTO copy(String searchHint, AtomActionDTO searchAction) {
        return new MercuryCertificatesAddressDTO(searchHint, searchAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MercuryCertificatesAddressDTO)) {
            return false;
        }
        MercuryCertificatesAddressDTO mercuryCertificatesAddressDTO = (MercuryCertificatesAddressDTO) other;
        return Intrinsics.d(this.searchHint, mercuryCertificatesAddressDTO.searchHint) && Intrinsics.d(this.searchAction, mercuryCertificatesAddressDTO.searchAction);
    }

    public final AtomActionDTO getSearchAction() {
        return this.searchAction;
    }

    public final String getSearchHint() {
        return this.searchHint;
    }

    public int hashCode() {
        String str = this.searchHint;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        AtomActionDTO atomActionDTO = this.searchAction;
        return hashCode + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MercuryCertificatesAddressDTO(searchHint=" + this.searchHint + ", searchAction=" + this.searchAction + ")";
    }
}
