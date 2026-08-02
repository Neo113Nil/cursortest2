package ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.presentation;

import Ns.b;
import TY.a;
import WZ.t;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b \b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0083\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011\u0012\u000e\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ \u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00112\u0010\b\u0002\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b0\u0010/R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u00103R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b4\u00103R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00108\u001a\u0004\b9\u0010:R%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0014\u0010;\u001a\u0004\b<\u0010=R\u001f\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010A\u001a\u0004\b\u0019\u0010B¨\u0006C"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "phoneNumber", Scopes.EMAIL, "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "cellInfo", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "Lru/ozon/uni/atoms/af/AtomAction;", "checkboxAction", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "checkboxTrackingInfo", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "", "isLocalUpdate", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/af/AtomAction;Ljava/util/Map;LWZ/t;Z)V", "copy", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/af/AtomAction;Ljava/util/Map;LWZ/t;Z)Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3VO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "getPhoneNumber", "()Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "getEmail", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCellInfo", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getCheckboxAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/util/Map;", "getCheckboxTrackingInfo", "()Ljava/util/Map;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "Z", "()Z", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CustomerContactsV3VO implements c {
    private final ButtonV3DTO button;
    private final CellDTO cell;
    private final CellDTO cellInfo;
    private final AtomAction checkboxAction;
    private final Map<String, TokenizedTrackingInfo> checkboxTrackingInfo;
    private final CommonInputV2VO.TextInputV2 email;
    private final long id;
    private final boolean isLocalUpdate;
    private final CommonInputV2VO.TextInputV2 phoneNumber;

    @NotNull
    private final TextDTO title;
    private final t viewEvent;

    public CustomerContactsV3VO(long j11, @NotNull TextDTO title, CommonInputV2VO.TextInputV2 textInputV2, CommonInputV2VO.TextInputV2 textInputV22, CellDTO cellDTO, CellDTO cellDTO2, ButtonV3DTO buttonV3DTO, AtomAction atomAction, Map<String, TokenizedTrackingInfo> map, t tVar, boolean z11) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = j11;
        this.title = title;
        this.phoneNumber = textInputV2;
        this.email = textInputV22;
        this.cell = cellDTO;
        this.cellInfo = cellDTO2;
        this.button = buttonV3DTO;
        this.checkboxAction = atomAction;
        this.checkboxTrackingInfo = map;
        this.viewEvent = tVar;
        this.isLocalUpdate = z11;
    }

    public static /* synthetic */ CustomerContactsV3VO copy$default(CustomerContactsV3VO customerContactsV3VO, long j11, TextDTO textDTO, CommonInputV2VO.TextInputV2 textInputV2, CommonInputV2VO.TextInputV2 textInputV22, CellDTO cellDTO, CellDTO cellDTO2, ButtonV3DTO buttonV3DTO, AtomAction atomAction, Map map, t tVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = customerContactsV3VO.id;
        }
        return customerContactsV3VO.copy(j11, (i11 & 2) != 0 ? customerContactsV3VO.title : textDTO, (i11 & 4) != 0 ? customerContactsV3VO.phoneNumber : textInputV2, (i11 & 8) != 0 ? customerContactsV3VO.email : textInputV22, (i11 & 16) != 0 ? customerContactsV3VO.cell : cellDTO, (i11 & 32) != 0 ? customerContactsV3VO.cellInfo : cellDTO2, (i11 & 64) != 0 ? customerContactsV3VO.button : buttonV3DTO, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? customerContactsV3VO.checkboxAction : atomAction, (i11 & 256) != 0 ? customerContactsV3VO.checkboxTrackingInfo : map, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? customerContactsV3VO.viewEvent : tVar, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? customerContactsV3VO.isLocalUpdate : z11);
    }

    @NotNull
    public final CustomerContactsV3VO copy(long id2, @NotNull TextDTO title, CommonInputV2VO.TextInputV2 phoneNumber, CommonInputV2VO.TextInputV2 email, CellDTO cell, CellDTO cellInfo, ButtonV3DTO button, AtomAction checkboxAction, Map<String, TokenizedTrackingInfo> checkboxTrackingInfo, t viewEvent, boolean isLocalUpdate) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new CustomerContactsV3VO(id2, title, phoneNumber, email, cell, cellInfo, button, checkboxAction, checkboxTrackingInfo, viewEvent, isLocalUpdate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerContactsV3VO)) {
            return false;
        }
        CustomerContactsV3VO customerContactsV3VO = (CustomerContactsV3VO) other;
        return this.id == customerContactsV3VO.id && Intrinsics.d(this.title, customerContactsV3VO.title) && Intrinsics.d(this.phoneNumber, customerContactsV3VO.phoneNumber) && Intrinsics.d(this.email, customerContactsV3VO.email) && Intrinsics.d(this.cell, customerContactsV3VO.cell) && Intrinsics.d(this.cellInfo, customerContactsV3VO.cellInfo) && Intrinsics.d(this.button, customerContactsV3VO.button) && Intrinsics.d(this.checkboxAction, customerContactsV3VO.checkboxAction) && Intrinsics.d(this.checkboxTrackingInfo, customerContactsV3VO.checkboxTrackingInfo) && Intrinsics.d(this.viewEvent, customerContactsV3VO.viewEvent) && this.isLocalUpdate == customerContactsV3VO.isLocalUpdate;
    }

    public final ButtonV3DTO getButton() {
        return this.button;
    }

    public final CellDTO getCell() {
        return this.cell;
    }

    public final CellDTO getCellInfo() {
        return this.cellInfo;
    }

    public final AtomAction getCheckboxAction() {
        return this.checkboxAction;
    }

    public final Map<String, TokenizedTrackingInfo> getCheckboxTrackingInfo() {
        return this.checkboxTrackingInfo;
    }

    public final CommonInputV2VO.TextInputV2 getEmail() {
        return this.email;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final CommonInputV2VO.TextInputV2 getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.title, Long.hashCode(this.id) * 31, 31);
        CommonInputV2VO.TextInputV2 textInputV2 = this.phoneNumber;
        int hashCode = (a11 + (textInputV2 == null ? 0 : textInputV2.hashCode())) * 31;
        CommonInputV2VO.TextInputV2 textInputV22 = this.email;
        int hashCode2 = (hashCode + (textInputV22 == null ? 0 : textInputV22.hashCode())) * 31;
        CellDTO cellDTO = this.cell;
        int hashCode3 = (hashCode2 + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
        CellDTO cellDTO2 = this.cellInfo;
        int hashCode4 = (hashCode3 + (cellDTO2 == null ? 0 : cellDTO2.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.button;
        int hashCode5 = (hashCode4 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        AtomAction atomAction = this.checkboxAction;
        int hashCode6 = (hashCode5 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.checkboxTrackingInfo;
        int hashCode7 = (hashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        t tVar = this.viewEvent;
        return Boolean.hashCode(this.isLocalUpdate) + ((hashCode7 + (tVar != null ? tVar.hashCode() : 0)) * 31);
    }

    /* renamed from: isLocalUpdate, reason: from getter */
    public final boolean getIsLocalUpdate() {
        return this.isLocalUpdate;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        CommonInputV2VO.TextInputV2 textInputV2 = this.phoneNumber;
        CommonInputV2VO.TextInputV2 textInputV22 = this.email;
        CellDTO cellDTO = this.cell;
        CellDTO cellDTO2 = this.cellInfo;
        ButtonV3DTO buttonV3DTO = this.button;
        AtomAction atomAction = this.checkboxAction;
        Map<String, TokenizedTrackingInfo> map = this.checkboxTrackingInfo;
        t tVar = this.viewEvent;
        boolean z11 = this.isLocalUpdate;
        StringBuilder b11 = a.b("CustomerContactsV3VO(id=", j11, ", title=", textDTO);
        b11.append(", phoneNumber=");
        b11.append(textInputV2);
        b11.append(", email=");
        b11.append(textInputV22);
        b11.append(", cell=");
        b11.append(cellDTO);
        b11.append(", cellInfo=");
        b11.append(cellDTO2);
        b11.append(", button=");
        b11.append(buttonV3DTO);
        b11.append(", checkboxAction=");
        b11.append(atomAction);
        b11.append(", checkboxTrackingInfo=");
        b11.append(map);
        b11.append(", viewEvent=");
        b11.append(tVar);
        return Bi.b.f(b11, ", isLocalUpdate=", z11, ")");
    }

    public /* synthetic */ CustomerContactsV3VO(long j11, TextDTO textDTO, CommonInputV2VO.TextInputV2 textInputV2, CommonInputV2VO.TextInputV2 textInputV22, CellDTO cellDTO, CellDTO cellDTO2, ButtonV3DTO buttonV3DTO, AtomAction atomAction, Map map, t tVar, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, textDTO, textInputV2, textInputV22, cellDTO, cellDTO2, buttonV3DTO, atomAction, map, tVar, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? false : z11);
    }
}
