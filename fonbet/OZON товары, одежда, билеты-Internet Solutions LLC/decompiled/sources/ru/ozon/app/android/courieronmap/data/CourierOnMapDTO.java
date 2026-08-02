package ru.ozon.app.android.courieronmap.data;

import B0.C2454a;
import B90.C2619v;
import Cm.e;
import D3.g;
import I0.C3173b;
import Ve.C4636t5;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001:\u0003ABCB\u0089\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0006HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u00103\u001a\u00020\tHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u00106\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u00108\u001a\u00020\tHÆ\u0003J\u0017\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0018HÆ\u0003J£\u0001\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\t2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÆ\u0001J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020\tHÖ\u0001J\t\u0010@\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0012\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\"R\u001f\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u0006D"}, d2 = {"Lru/ozon/app/android/courieronmap/data/CourierOnMapDTO;", "", "courier", "Lru/ozon/app/android/courieronmap/data/CourierOnMapDTO$PinInfo;", "customer", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "subtitle", "refreshInterval", "", "annotation", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "deliveryTime", "orderInfo", "", "Lru/ozon/app/android/courieronmap/data/CourierOnMapDTO$Cell;", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "pinAnimationDuration", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "courierDetails", "Lru/ozon/app/android/courieronmap/data/CourierOnMapDTO$CourierDetails;", "<init>", "(Lru/ozon/app/android/courieronmap/data/CourierOnMapDTO$PinInfo;Lru/ozon/app/android/courieronmap/data/CourierOnMapDTO$PinInfo;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;ILru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;ILjava/util/Map;Lru/ozon/app/android/courieronmap/data/CourierOnMapDTO$CourierDetails;)V", "getCourier", "()Lru/ozon/app/android/courieronmap/data/CourierOnMapDTO$PinInfo;", "getCustomer", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getRefreshInterval", "()I", "getAnnotation", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getDeliveryTime", "getOrderInfo", "()Ljava/util/List;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getPinAnimationDuration", "getTrackingInfo", "()Ljava/util/Map;", "getCourierDetails", "()Lru/ozon/app/android/courieronmap/data/CourierOnMapDTO$CourierDetails;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "toString", "PinInfo", "Cell", "CourierDetails", "courieronmap_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CourierOnMapDTO {
    private final DisclaimerAtom annotation;
    private final ButtonV3Atom.LargeButton button;
    private final PinInfo courier;
    private final CourierDetails courierDetails;

    @NotNull
    private final PinInfo customer;
    private final TextAtom deliveryTime;
    private final List<Cell> orderInfo;
    private final int pinAnimationDuration;
    private final int refreshInterval;
    private final TextAtom subtitle;

    @NotNull
    private final TextAtom title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/courieronmap/data/CourierOnMapDTO$Cell;", "", "<init>", "()V", "Companion", "courieronmap_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = Cell.WITH_SUBTITLE_ICON_PICKER, type = CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconPicker.class), @ProtoOneOfSignature(name = "cellWithSubtitle24Icon", type = CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon.class), @ProtoOneOfSignature(name = "cellRegular24IconPicker", type = CellAtom.CellRegular24IconPicker.class)})
    @ProtoOneOf(label = "type")
    public static final class Cell {

        @NotNull
        public static final String REGULAR_ICON_PICKER = "cellRegular24IconPicker";

        @NotNull
        public static final String WITH_SUBTITLE_ICON = "cellWithSubtitle24Icon";

        @NotNull
        public static final String WITH_SUBTITLE_ICON_PICKER = "cellWithSubtitle24IconPicker";
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/courieronmap/data/CourierOnMapDTO$CourierDetails;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "info", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getInfo", "()Ljava/util/List;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "courieronmap_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CourierDetails {
        private final ButtonV3DTO button;
        private final List<CellDTO> info;
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        public CourierDetails(@NotNull TextDTO title, TextDTO textDTO, List<CellDTO> list, ButtonV3DTO buttonV3DTO) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.subtitle = textDTO;
            this.info = list;
            this.button = buttonV3DTO;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CourierDetails copy$default(CourierDetails courierDetails, TextDTO textDTO, TextDTO textDTO2, List list, ButtonV3DTO buttonV3DTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = courierDetails.title;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = courierDetails.subtitle;
            }
            if ((i11 & 4) != 0) {
                list = courierDetails.info;
            }
            if ((i11 & 8) != 0) {
                buttonV3DTO = courierDetails.button;
            }
            return courierDetails.copy(textDTO, textDTO2, list, buttonV3DTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        public final List<CellDTO> component3() {
            return this.info;
        }

        /* renamed from: component4, reason: from getter */
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        @NotNull
        public final CourierDetails copy(@NotNull TextDTO title, TextDTO subtitle, List<CellDTO> info, ButtonV3DTO button) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new CourierDetails(title, subtitle, info, button);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CourierDetails)) {
                return false;
            }
            CourierDetails courierDetails = (CourierDetails) other;
            return Intrinsics.d(this.title, courierDetails.title) && Intrinsics.d(this.subtitle, courierDetails.subtitle) && Intrinsics.d(this.info, courierDetails.info) && Intrinsics.d(this.button, courierDetails.button);
        }

        public final ButtonV3DTO getButton() {
            return this.button;
        }

        public final List<CellDTO> getInfo() {
            return this.info;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            TextDTO textDTO = this.subtitle;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            List<CellDTO> list = this.info;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            ButtonV3DTO buttonV3DTO = this.button;
            return hashCode3 + (buttonV3DTO != null ? buttonV3DTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            List<CellDTO> list = this.info;
            ButtonV3DTO buttonV3DTO = this.button;
            StringBuilder g10 = g.g("CourierDetails(title=", textDTO, ", subtitle=", textDTO2, ", info=");
            g10.append(list);
            g10.append(", button=");
            g10.append(buttonV3DTO);
            g10.append(")");
            return g10.toString();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001bB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/courieronmap/data/CourierOnMapDTO$PinInfo;", "", "coordinates", "Lru/ozon/app/android/courieronmap/data/CourierOnMapDTO$PinInfo$Coordinates;", "image", "", "id", "caption", "<init>", "(Lru/ozon/app/android/courieronmap/data/CourierOnMapDTO$PinInfo$Coordinates;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCoordinates", "()Lru/ozon/app/android/courieronmap/data/CourierOnMapDTO$PinInfo$Coordinates;", "getImage", "()Ljava/lang/String;", "getId", "getCaption", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Coordinates", "courieronmap_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class PinInfo {
        private final String caption;

        @NotNull
        private final Coordinates coordinates;

        @NotNull
        private final String id;

        @NotNull
        private final String image;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/courieronmap/data/CourierOnMapDTO$PinInfo$Coordinates;", "", "longitude", "", "latitude", "<init>", "(DD)V", "getLongitude", "()D", "getLatitude", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "courieronmap_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Coordinates {
            private final double latitude;
            private final double longitude;

            public Coordinates(double d11, double d12) {
                this.longitude = d11;
                this.latitude = d12;
            }

            public static /* synthetic */ Coordinates copy$default(Coordinates coordinates, double d11, double d12, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    d11 = coordinates.longitude;
                }
                if ((i11 & 2) != 0) {
                    d12 = coordinates.latitude;
                }
                return coordinates.copy(d11, d12);
            }

            /* renamed from: component1, reason: from getter */
            public final double getLongitude() {
                return this.longitude;
            }

            /* renamed from: component2, reason: from getter */
            public final double getLatitude() {
                return this.latitude;
            }

            @NotNull
            public final Coordinates copy(double longitude, double latitude) {
                return new Coordinates(longitude, latitude);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Coordinates)) {
                    return false;
                }
                Coordinates coordinates = (Coordinates) other;
                return Double.compare(this.longitude, coordinates.longitude) == 0 && Double.compare(this.latitude, coordinates.latitude) == 0;
            }

            public final double getLatitude() {
                return this.latitude;
            }

            public final double getLongitude() {
                return this.longitude;
            }

            public int hashCode() {
                return Double.hashCode(this.latitude) + (Double.hashCode(this.longitude) * 31);
            }

            @NotNull
            public String toString() {
                double d11 = this.longitude;
                return C2619v.c(e.e(d11, "Coordinates(longitude=", ", latitude="), this.latitude, ")");
            }
        }

        public PinInfo(@NotNull Coordinates coordinates, @NotNull String image, @NotNull String id2, String str) {
            Intrinsics.checkNotNullParameter(coordinates, "coordinates");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(id2, "id");
            this.coordinates = coordinates;
            this.image = image;
            this.id = id2;
            this.caption = str;
        }

        public static /* synthetic */ PinInfo copy$default(PinInfo pinInfo, Coordinates coordinates, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                coordinates = pinInfo.coordinates;
            }
            if ((i11 & 2) != 0) {
                str = pinInfo.image;
            }
            if ((i11 & 4) != 0) {
                str2 = pinInfo.id;
            }
            if ((i11 & 8) != 0) {
                str3 = pinInfo.caption;
            }
            return pinInfo.copy(coordinates, str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Coordinates getCoordinates() {
            return this.coordinates;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component4, reason: from getter */
        public final String getCaption() {
            return this.caption;
        }

        @NotNull
        public final PinInfo copy(@NotNull Coordinates coordinates, @NotNull String image, @NotNull String id2, String caption) {
            Intrinsics.checkNotNullParameter(coordinates, "coordinates");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(id2, "id");
            return new PinInfo(coordinates, image, id2, caption);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PinInfo)) {
                return false;
            }
            PinInfo pinInfo = (PinInfo) other;
            return Intrinsics.d(this.coordinates, pinInfo.coordinates) && Intrinsics.d(this.image, pinInfo.image) && Intrinsics.d(this.id, pinInfo.id) && Intrinsics.d(this.caption, pinInfo.caption);
        }

        public final String getCaption() {
            return this.caption;
        }

        @NotNull
        public final Coordinates getCoordinates() {
            return this.coordinates;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public int hashCode() {
            int a11 = G.g.a(G.g.a(this.coordinates.hashCode() * 31, 31, this.image), 31, this.id);
            String str = this.caption;
            return a11 + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            Coordinates coordinates = this.coordinates;
            String str = this.image;
            String str2 = this.id;
            String str3 = this.caption;
            StringBuilder sb2 = new StringBuilder("PinInfo(coordinates=");
            sb2.append(coordinates);
            sb2.append(", image=");
            sb2.append(str);
            sb2.append(", id=");
            return C3173b.c(sb2, str2, ", caption=", str3, ")");
        }
    }

    public CourierOnMapDTO(PinInfo pinInfo, @NotNull PinInfo customer, @NotNull TextAtom title, TextAtom textAtom, int i11, DisclaimerAtom disclaimerAtom, TextAtom textAtom2, List<Cell> list, ButtonV3Atom.LargeButton largeButton, int i12, Map<String, TokenizedTrackingInfo> map, CourierDetails courierDetails) {
        Intrinsics.checkNotNullParameter(customer, "customer");
        Intrinsics.checkNotNullParameter(title, "title");
        this.courier = pinInfo;
        this.customer = customer;
        this.title = title;
        this.subtitle = textAtom;
        this.refreshInterval = i11;
        this.annotation = disclaimerAtom;
        this.deliveryTime = textAtom2;
        this.orderInfo = list;
        this.button = largeButton;
        this.pinAnimationDuration = i12;
        this.trackingInfo = map;
        this.courierDetails = courierDetails;
    }

    public static /* synthetic */ CourierOnMapDTO copy$default(CourierOnMapDTO courierOnMapDTO, PinInfo pinInfo, PinInfo pinInfo2, TextAtom textAtom, TextAtom textAtom2, int i11, DisclaimerAtom disclaimerAtom, TextAtom textAtom3, List list, ButtonV3Atom.LargeButton largeButton, int i12, Map map, CourierDetails courierDetails, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            pinInfo = courierOnMapDTO.courier;
        }
        if ((i13 & 2) != 0) {
            pinInfo2 = courierOnMapDTO.customer;
        }
        if ((i13 & 4) != 0) {
            textAtom = courierOnMapDTO.title;
        }
        if ((i13 & 8) != 0) {
            textAtom2 = courierOnMapDTO.subtitle;
        }
        if ((i13 & 16) != 0) {
            i11 = courierOnMapDTO.refreshInterval;
        }
        if ((i13 & 32) != 0) {
            disclaimerAtom = courierOnMapDTO.annotation;
        }
        if ((i13 & 64) != 0) {
            textAtom3 = courierOnMapDTO.deliveryTime;
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            list = courierOnMapDTO.orderInfo;
        }
        if ((i13 & 256) != 0) {
            largeButton = courierOnMapDTO.button;
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            i12 = courierOnMapDTO.pinAnimationDuration;
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            map = courierOnMapDTO.trackingInfo;
        }
        if ((i13 & 2048) != 0) {
            courierDetails = courierOnMapDTO.courierDetails;
        }
        Map map2 = map;
        CourierDetails courierDetails2 = courierDetails;
        ButtonV3Atom.LargeButton largeButton2 = largeButton;
        int i14 = i12;
        TextAtom textAtom4 = textAtom3;
        List list2 = list;
        int i15 = i11;
        DisclaimerAtom disclaimerAtom2 = disclaimerAtom;
        return courierOnMapDTO.copy(pinInfo, pinInfo2, textAtom, textAtom2, i15, disclaimerAtom2, textAtom4, list2, largeButton2, i14, map2, courierDetails2);
    }

    /* renamed from: component1, reason: from getter */
    public final PinInfo getCourier() {
        return this.courier;
    }

    /* renamed from: component10, reason: from getter */
    public final int getPinAnimationDuration() {
        return this.pinAnimationDuration;
    }

    public final Map<String, TokenizedTrackingInfo> component11() {
        return this.trackingInfo;
    }

    /* renamed from: component12, reason: from getter */
    public final CourierDetails getCourierDetails() {
        return this.courierDetails;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final PinInfo getCustomer() {
        return this.customer;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final int getRefreshInterval() {
        return this.refreshInterval;
    }

    /* renamed from: component6, reason: from getter */
    public final DisclaimerAtom getAnnotation() {
        return this.annotation;
    }

    /* renamed from: component7, reason: from getter */
    public final TextAtom getDeliveryTime() {
        return this.deliveryTime;
    }

    public final List<Cell> component8() {
        return this.orderInfo;
    }

    /* renamed from: component9, reason: from getter */
    public final ButtonV3Atom.LargeButton getButton() {
        return this.button;
    }

    @NotNull
    public final CourierOnMapDTO copy(PinInfo courier, @NotNull PinInfo customer, @NotNull TextAtom title, TextAtom subtitle, int refreshInterval, DisclaimerAtom annotation, TextAtom deliveryTime, List<Cell> orderInfo, ButtonV3Atom.LargeButton button, int pinAnimationDuration, Map<String, TokenizedTrackingInfo> trackingInfo, CourierDetails courierDetails) {
        Intrinsics.checkNotNullParameter(customer, "customer");
        Intrinsics.checkNotNullParameter(title, "title");
        return new CourierOnMapDTO(courier, customer, title, subtitle, refreshInterval, annotation, deliveryTime, orderInfo, button, pinAnimationDuration, trackingInfo, courierDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CourierOnMapDTO)) {
            return false;
        }
        CourierOnMapDTO courierOnMapDTO = (CourierOnMapDTO) other;
        return Intrinsics.d(this.courier, courierOnMapDTO.courier) && Intrinsics.d(this.customer, courierOnMapDTO.customer) && Intrinsics.d(this.title, courierOnMapDTO.title) && Intrinsics.d(this.subtitle, courierOnMapDTO.subtitle) && this.refreshInterval == courierOnMapDTO.refreshInterval && Intrinsics.d(this.annotation, courierOnMapDTO.annotation) && Intrinsics.d(this.deliveryTime, courierOnMapDTO.deliveryTime) && Intrinsics.d(this.orderInfo, courierOnMapDTO.orderInfo) && Intrinsics.d(this.button, courierOnMapDTO.button) && this.pinAnimationDuration == courierOnMapDTO.pinAnimationDuration && Intrinsics.d(this.trackingInfo, courierOnMapDTO.trackingInfo) && Intrinsics.d(this.courierDetails, courierOnMapDTO.courierDetails);
    }

    public final DisclaimerAtom getAnnotation() {
        return this.annotation;
    }

    public final ButtonV3Atom.LargeButton getButton() {
        return this.button;
    }

    public final PinInfo getCourier() {
        return this.courier;
    }

    public final CourierDetails getCourierDetails() {
        return this.courierDetails;
    }

    @NotNull
    public final PinInfo getCustomer() {
        return this.customer;
    }

    public final TextAtom getDeliveryTime() {
        return this.deliveryTime;
    }

    public final List<Cell> getOrderInfo() {
        return this.orderInfo;
    }

    public final int getPinAnimationDuration() {
        return this.pinAnimationDuration;
    }

    public final int getRefreshInterval() {
        return this.refreshInterval;
    }

    public final TextAtom getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        PinInfo pinInfo = this.courier;
        int b11 = C2619v.b((this.customer.hashCode() + ((pinInfo == null ? 0 : pinInfo.hashCode()) * 31)) * 31, 31, this.title);
        TextAtom textAtom = this.subtitle;
        int a11 = C2454a.a(this.refreshInterval, (b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31);
        DisclaimerAtom disclaimerAtom = this.annotation;
        int hashCode = (a11 + (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode())) * 31;
        TextAtom textAtom2 = this.deliveryTime;
        int hashCode2 = (hashCode + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
        List<Cell> list = this.orderInfo;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        ButtonV3Atom.LargeButton largeButton = this.button;
        int a12 = C2454a.a(this.pinAnimationDuration, (hashCode3 + (largeButton == null ? 0 : largeButton.hashCode())) * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode4 = (a12 + (map == null ? 0 : map.hashCode())) * 31;
        CourierDetails courierDetails = this.courierDetails;
        return hashCode4 + (courierDetails != null ? courierDetails.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        PinInfo pinInfo = this.courier;
        PinInfo pinInfo2 = this.customer;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subtitle;
        int i11 = this.refreshInterval;
        DisclaimerAtom disclaimerAtom = this.annotation;
        TextAtom textAtom3 = this.deliveryTime;
        List<Cell> list = this.orderInfo;
        ButtonV3Atom.LargeButton largeButton = this.button;
        int i12 = this.pinAnimationDuration;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        CourierDetails courierDetails = this.courierDetails;
        StringBuilder sb2 = new StringBuilder("CourierOnMapDTO(courier=");
        sb2.append(pinInfo);
        sb2.append(", customer=");
        sb2.append(pinInfo2);
        sb2.append(", title=");
        C4636t5.c(", subtitle=", ", refreshInterval=", sb2, textAtom, textAtom2);
        sb2.append(i11);
        sb2.append(", annotation=");
        sb2.append(disclaimerAtom);
        sb2.append(", deliveryTime=");
        sb2.append(textAtom3);
        sb2.append(", orderInfo=");
        sb2.append(list);
        sb2.append(", button=");
        sb2.append(largeButton);
        sb2.append(", pinAnimationDuration=");
        sb2.append(i12);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", courierDetails=");
        sb2.append(courierDetails);
        sb2.append(")");
        return sb2.toString();
    }
}
