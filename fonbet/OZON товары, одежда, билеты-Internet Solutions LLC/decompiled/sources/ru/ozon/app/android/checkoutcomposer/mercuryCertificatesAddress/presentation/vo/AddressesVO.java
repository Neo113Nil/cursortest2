package ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.presentation.vo;

import B6.b;
import Kk.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB%\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/vo/AddressesVO;", "", "", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/vo/AddressesVO$AddressVO;", "addresses", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/vo/AddressesVO$ErrorVO;", "error", "<init>", "(Ljava/util/List;Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/vo/AddressesVO$ErrorVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getAddresses", "()Ljava/util/List;", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/vo/AddressesVO$ErrorVO;", "getError", "()Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/vo/AddressesVO$ErrorVO;", "AddressVO", "ErrorVO", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AddressesVO {
    private final List<AddressVO> addresses;
    private final ErrorVO error;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/vo/AddressesVO$AddressVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "icon", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AddressVO {
        public static final int $stable = AtomAction.$stable | CommonAtomIconDTO.$stable;
        private final AtomAction action;
        private final CommonAtomIconDTO icon;
        private final TextDTO title;

        public AddressVO(TextDTO textDTO, CommonAtomIconDTO commonAtomIconDTO, AtomAction atomAction) {
            this.title = textDTO;
            this.icon = commonAtomIconDTO;
            this.action = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddressVO)) {
                return false;
            }
            AddressVO addressVO = (AddressVO) other;
            return Intrinsics.d(this.title, addressVO.title) && Intrinsics.d(this.icon, addressVO.icon) && Intrinsics.d(this.action, addressVO.action);
        }

        public final AtomAction getAction() {
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
            AtomAction atomAction = this.action;
            return hashCode2 + (atomAction != null ? atomAction.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            CommonAtomIconDTO commonAtomIconDTO = this.icon;
            AtomAction atomAction = this.action;
            StringBuilder sb2 = new StringBuilder("AddressVO(title=");
            sb2.append(textDTO);
            sb2.append(", icon=");
            sb2.append(commonAtomIconDTO);
            sb2.append(", action=");
            return b.b(sb2, atomAction, ")");
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/vo/AddressesVO$ErrorVO;", "", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ErrorVO {
        public static final int $stable = AtomAction.$stable;
        private final AtomAction action;

        public ErrorVO(AtomAction atomAction) {
            this.action = atomAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ErrorVO) && Intrinsics.d(this.action, ((ErrorVO) other).action);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public int hashCode() {
            AtomAction atomAction = this.action;
            if (atomAction == null) {
                return 0;
            }
            return atomAction.hashCode();
        }

        @NotNull
        public String toString() {
            return c.e("ErrorVO(action=", ")", this.action);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AddressesVO() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressesVO)) {
            return false;
        }
        AddressesVO addressesVO = (AddressesVO) other;
        return Intrinsics.d(this.addresses, addressesVO.addresses) && Intrinsics.d(this.error, addressesVO.error);
    }

    public final List<AddressVO> getAddresses() {
        return this.addresses;
    }

    public final ErrorVO getError() {
        return this.error;
    }

    public int hashCode() {
        List<AddressVO> list = this.addresses;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        ErrorVO errorVO = this.error;
        return hashCode + (errorVO != null ? errorVO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AddressesVO(addresses=" + this.addresses + ", error=" + this.error + ")";
    }

    public AddressesVO(List<AddressVO> list, ErrorVO errorVO) {
        this.addresses = list;
        this.error = errorVO;
    }

    public /* synthetic */ AddressesVO(List list, ErrorVO errorVO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : errorVO);
    }
}
