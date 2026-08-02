package ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v2.presentation;

import Bl.C2639a;
import G.g;
import Lh.a;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002Bu\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011\u0012\u000e\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0090\u0001\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00112\u0010\b\u0002\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b.\u0010-R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00105\u001a\u0004\b6\u00107R%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0014\u00108\u001a\u0004\b9\u0010:R\u001f\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010;\u001a\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "scrollWidgetKey", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;", "inputs", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cellInfo", "Lru/ozon/uni/atoms/af/AtomAction;", "checkboxAction", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "checkboxTrackingInfo", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLjava/lang/Integer;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/af/AtomAction;Ljava/util/Map;LWZ/t;)V", "copy", "(JLjava/lang/Integer;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/af/AtomAction;Ljava/util/Map;LWZ/t;)Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsV2VO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/Integer;", "getScrollWidgetKey", "()Ljava/lang/Integer;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "Ljava/util/List;", "getInputs", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCellInfo", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getCheckboxAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/util/Map;", "getCheckboxTrackingInfo", "()Ljava/util/Map;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CustomerContactsV2VO implements c {
    private final CellDTO cellInfo;
    private final AtomAction checkboxAction;
    private final Map<String, TokenizedTrackingInfo> checkboxTrackingInfo;
    private final long id;

    @NotNull
    private final List<CommonInputVO.TextCommonInputVO> inputs;
    private final Integer scrollWidgetKey;
    private final TextAtom subtitle;
    private final TextAtom title;
    private final t viewEvent;

    public CustomerContactsV2VO(long j11, Integer num, TextAtom textAtom, TextAtom textAtom2, @NotNull List<CommonInputVO.TextCommonInputVO> inputs, CellDTO cellDTO, AtomAction atomAction, Map<String, TokenizedTrackingInfo> map, t tVar) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        this.id = j11;
        this.scrollWidgetKey = num;
        this.title = textAtom;
        this.subtitle = textAtom2;
        this.inputs = inputs;
        this.cellInfo = cellDTO;
        this.checkboxAction = atomAction;
        this.checkboxTrackingInfo = map;
        this.viewEvent = tVar;
    }

    public static /* synthetic */ CustomerContactsV2VO copy$default(CustomerContactsV2VO customerContactsV2VO, long j11, Integer num, TextAtom textAtom, TextAtom textAtom2, List list, CellDTO cellDTO, AtomAction atomAction, Map map, t tVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = customerContactsV2VO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            num = customerContactsV2VO.scrollWidgetKey;
        }
        Integer num2 = num;
        if ((i11 & 4) != 0) {
            textAtom = customerContactsV2VO.title;
        }
        return customerContactsV2VO.copy(j12, num2, textAtom, (i11 & 8) != 0 ? customerContactsV2VO.subtitle : textAtom2, (i11 & 16) != 0 ? customerContactsV2VO.inputs : list, (i11 & 32) != 0 ? customerContactsV2VO.cellInfo : cellDTO, (i11 & 64) != 0 ? customerContactsV2VO.checkboxAction : atomAction, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? customerContactsV2VO.checkboxTrackingInfo : map, (i11 & 256) != 0 ? customerContactsV2VO.viewEvent : tVar);
    }

    @NotNull
    public final CustomerContactsV2VO copy(long id2, Integer scrollWidgetKey, TextAtom title, TextAtom subtitle, @NotNull List<CommonInputVO.TextCommonInputVO> inputs, CellDTO cellInfo, AtomAction checkboxAction, Map<String, TokenizedTrackingInfo> checkboxTrackingInfo, t viewEvent) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        return new CustomerContactsV2VO(id2, scrollWidgetKey, title, subtitle, inputs, cellInfo, checkboxAction, checkboxTrackingInfo, viewEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerContactsV2VO)) {
            return false;
        }
        CustomerContactsV2VO customerContactsV2VO = (CustomerContactsV2VO) other;
        return this.id == customerContactsV2VO.id && Intrinsics.d(this.scrollWidgetKey, customerContactsV2VO.scrollWidgetKey) && Intrinsics.d(this.title, customerContactsV2VO.title) && Intrinsics.d(this.subtitle, customerContactsV2VO.subtitle) && Intrinsics.d(this.inputs, customerContactsV2VO.inputs) && Intrinsics.d(this.cellInfo, customerContactsV2VO.cellInfo) && Intrinsics.d(this.checkboxAction, customerContactsV2VO.checkboxAction) && Intrinsics.d(this.checkboxTrackingInfo, customerContactsV2VO.checkboxTrackingInfo) && Intrinsics.d(this.viewEvent, customerContactsV2VO.viewEvent);
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

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<CommonInputVO.TextCommonInputVO> getInputs() {
        return this.inputs;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return this.scrollWidgetKey;
    }

    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    public final TextAtom getTitle() {
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
        int hashCode = Long.hashCode(this.id) * 31;
        Integer num = this.scrollWidgetKey;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        TextAtom textAtom = this.title;
        int hashCode3 = (hashCode2 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        TextAtom textAtom2 = this.subtitle;
        int b11 = g.b((hashCode3 + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31, 31, this.inputs);
        CellDTO cellDTO = this.cellInfo;
        int hashCode4 = (b11 + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
        AtomAction atomAction = this.checkboxAction;
        int hashCode5 = (hashCode4 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.checkboxTrackingInfo;
        int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        t tVar = this.viewEvent;
        return hashCode6 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Integer num = this.scrollWidgetKey;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        List<CommonInputVO.TextCommonInputVO> list = this.inputs;
        CellDTO cellDTO = this.cellInfo;
        AtomAction atomAction = this.checkboxAction;
        Map<String, TokenizedTrackingInfo> map = this.checkboxTrackingInfo;
        t tVar = this.viewEvent;
        StringBuilder c11 = a.c("CustomerContactsV2VO(id=", j11, ", scrollWidgetKey=", num);
        C2639a.e(", title=", ", subtitle=", c11, textAtom, textAtom2);
        c11.append(", inputs=");
        c11.append(list);
        c11.append(", cellInfo=");
        c11.append(cellDTO);
        c11.append(", checkboxAction=");
        c11.append(atomAction);
        c11.append(", checkboxTrackingInfo=");
        c11.append(map);
        return a.b(c11, ", viewEvent=", tVar, ")");
    }
}
