package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation;

import D40.d;
import De.C2859b;
import G.g;
import Kk.C3532b;
import Ns.b;
import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u00017Bc\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0005¢\u0006\u0004\b\u0015\u0010\u0016Jz\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b\u000f\u00102R\u001f\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\b4\u00105R\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010%\u001a\u0004\b6\u0010'¨\u00068"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO;", "inputs", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "saveButton", "Lru/ozon/uni/atoms/data/text/TextDTO;", "agreementText", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "useBankDetails", "", "isInputChangedByClient", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "", "actionNamesToSkip", "<init>", "(JLjava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;ZLWZ/t;Ljava/util/List;)V", "copy", "(JLjava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;ZLWZ/t;Ljava/util/List;)Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getInputs", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSaveButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getAgreementText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getUseBankDetails", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Z", "()Z", "LWZ/t;", "getViewEvent", "()LWZ/t;", "getActionNamesToSkip", "InputItemVO", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TravelAddNewPassengerFormV3VO implements c {
    private final List<String> actionNamesToSkip;
    private final TextDTO agreementText;
    private final long id;

    @NotNull
    private final List<InputItemVO> inputs;
    private final boolean isInputChangedByClient;

    @NotNull
    private final ButtonV3DTO saveButton;
    private final CellDTO useBankDetails;
    private final t viewEvent;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\f\r\u000e\u000f\u0010B\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0005\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO;", "", "id", "", "input", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO;", "<init>", "(ILru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO;)V", "getId", "()I", "getInput", "()Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO;", "TextInputItem", "DateInputItem", "SelectorInputItem", "CheckboxInputItem", "BirthCertificateInputItem", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO$BirthCertificateInputItem;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO$CheckboxInputItem;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO$DateInputItem;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO$SelectorInputItem;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO$TextInputItem;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class InputItemVO {
        private final int id;

        @NotNull
        private final CommonInputV2VO input;

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO$BirthCertificateInputItem;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO;", "", "id", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$SelectorV2;", "input", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "seriesTextInput", "<init>", "(ILru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$SelectorV2;Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;)V", "copy", "(ILru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$SelectorV2;Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;)Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO$BirthCertificateInputItem;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$SelectorV2;", "getInput", "()Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$SelectorV2;", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "getSeriesTextInput", "()Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BirthCertificateInputItem extends InputItemVO {
            private final int id;

            @NotNull
            private final CommonInputV2VO.SelectorV2 input;

            @NotNull
            private final CommonInputV2VO.TextInputV2 seriesTextInput;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BirthCertificateInputItem(int i11, @NotNull CommonInputV2VO.SelectorV2 input, @NotNull CommonInputV2VO.TextInputV2 seriesTextInput) {
                super(i11, input, null);
                Intrinsics.checkNotNullParameter(input, "input");
                Intrinsics.checkNotNullParameter(seriesTextInput, "seriesTextInput");
                this.id = i11;
                this.input = input;
                this.seriesTextInput = seriesTextInput;
            }

            public static /* synthetic */ BirthCertificateInputItem copy$default(BirthCertificateInputItem birthCertificateInputItem, int i11, CommonInputV2VO.SelectorV2 selectorV2, CommonInputV2VO.TextInputV2 textInputV2, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    i11 = birthCertificateInputItem.id;
                }
                if ((i12 & 2) != 0) {
                    selectorV2 = birthCertificateInputItem.input;
                }
                if ((i12 & 4) != 0) {
                    textInputV2 = birthCertificateInputItem.seriesTextInput;
                }
                return birthCertificateInputItem.copy(i11, selectorV2, textInputV2);
            }

            @NotNull
            public final BirthCertificateInputItem copy(int id2, @NotNull CommonInputV2VO.SelectorV2 input, @NotNull CommonInputV2VO.TextInputV2 seriesTextInput) {
                Intrinsics.checkNotNullParameter(input, "input");
                Intrinsics.checkNotNullParameter(seriesTextInput, "seriesTextInput");
                return new BirthCertificateInputItem(id2, input, seriesTextInput);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BirthCertificateInputItem)) {
                    return false;
                }
                BirthCertificateInputItem birthCertificateInputItem = (BirthCertificateInputItem) other;
                return this.id == birthCertificateInputItem.id && Intrinsics.d(this.input, birthCertificateInputItem.input) && Intrinsics.d(this.seriesTextInput, birthCertificateInputItem.seriesTextInput);
            }

            @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.TravelAddNewPassengerFormV3VO.InputItemVO
            public int getId() {
                return this.id;
            }

            @NotNull
            public final CommonInputV2VO.TextInputV2 getSeriesTextInput() {
                return this.seriesTextInput;
            }

            public int hashCode() {
                return this.seriesTextInput.hashCode() + ((this.input.hashCode() + (Integer.hashCode(this.id) * 31)) * 31);
            }

            @NotNull
            public String toString() {
                return "BirthCertificateInputItem(id=" + this.id + ", input=" + this.input + ", seriesTextInput=" + this.seriesTextInput + ")";
            }

            @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.TravelAddNewPassengerFormV3VO.InputItemVO
            @NotNull
            public CommonInputV2VO.SelectorV2 getInput() {
                return this.input;
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO$CheckboxInputItem;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO;", "", "id", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$CheckboxV2;", "input", "<init>", "(ILru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$CheckboxV2;)V", "copy", "(ILru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$CheckboxV2;)Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO$CheckboxInputItem;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$CheckboxV2;", "getInput", "()Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$CheckboxV2;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CheckboxInputItem extends InputItemVO {
            private final int id;

            @NotNull
            private final CommonInputV2VO.CheckboxV2 input;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CheckboxInputItem(int i11, @NotNull CommonInputV2VO.CheckboxV2 input) {
                super(i11, input, null);
                Intrinsics.checkNotNullParameter(input, "input");
                this.id = i11;
                this.input = input;
            }

            public static /* synthetic */ CheckboxInputItem copy$default(CheckboxInputItem checkboxInputItem, int i11, CommonInputV2VO.CheckboxV2 checkboxV2, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    i11 = checkboxInputItem.id;
                }
                if ((i12 & 2) != 0) {
                    checkboxV2 = checkboxInputItem.input;
                }
                return checkboxInputItem.copy(i11, checkboxV2);
            }

            @NotNull
            public final CheckboxInputItem copy(int id2, @NotNull CommonInputV2VO.CheckboxV2 input) {
                Intrinsics.checkNotNullParameter(input, "input");
                return new CheckboxInputItem(id2, input);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CheckboxInputItem)) {
                    return false;
                }
                CheckboxInputItem checkboxInputItem = (CheckboxInputItem) other;
                return this.id == checkboxInputItem.id && Intrinsics.d(this.input, checkboxInputItem.input);
            }

            @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.TravelAddNewPassengerFormV3VO.InputItemVO
            public int getId() {
                return this.id;
            }

            public int hashCode() {
                return this.input.hashCode() + (Integer.hashCode(this.id) * 31);
            }

            @NotNull
            public String toString() {
                return "CheckboxInputItem(id=" + this.id + ", input=" + this.input + ")";
            }

            @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.TravelAddNewPassengerFormV3VO.InputItemVO
            @NotNull
            public CommonInputV2VO.CheckboxV2 getInput() {
                return this.input;
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO$DateInputItem;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO;", "", "id", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$DateInputV2;", "input", "<init>", "(ILru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$DateInputV2;)V", "copy", "(ILru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$DateInputV2;)Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO$DateInputItem;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$DateInputV2;", "getInput", "()Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$DateInputV2;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class DateInputItem extends InputItemVO {
            private final int id;

            @NotNull
            private final CommonInputV2VO.DateInputV2 input;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DateInputItem(int i11, @NotNull CommonInputV2VO.DateInputV2 input) {
                super(i11, input, null);
                Intrinsics.checkNotNullParameter(input, "input");
                this.id = i11;
                this.input = input;
            }

            public static /* synthetic */ DateInputItem copy$default(DateInputItem dateInputItem, int i11, CommonInputV2VO.DateInputV2 dateInputV2, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    i11 = dateInputItem.id;
                }
                if ((i12 & 2) != 0) {
                    dateInputV2 = dateInputItem.input;
                }
                return dateInputItem.copy(i11, dateInputV2);
            }

            @NotNull
            public final DateInputItem copy(int id2, @NotNull CommonInputV2VO.DateInputV2 input) {
                Intrinsics.checkNotNullParameter(input, "input");
                return new DateInputItem(id2, input);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DateInputItem)) {
                    return false;
                }
                DateInputItem dateInputItem = (DateInputItem) other;
                return this.id == dateInputItem.id && Intrinsics.d(this.input, dateInputItem.input);
            }

            @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.TravelAddNewPassengerFormV3VO.InputItemVO
            public int getId() {
                return this.id;
            }

            public int hashCode() {
                return this.input.hashCode() + (Integer.hashCode(this.id) * 31);
            }

            @NotNull
            public String toString() {
                return "DateInputItem(id=" + this.id + ", input=" + this.input + ")";
            }

            @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.TravelAddNewPassengerFormV3VO.InputItemVO
            @NotNull
            public CommonInputV2VO.DateInputV2 getInput() {
                return this.input;
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO$SelectorInputItem;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO;", "", "id", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$SelectorV2;", "input", "<init>", "(ILru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$SelectorV2;)V", "copy", "(ILru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$SelectorV2;)Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO$SelectorInputItem;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$SelectorV2;", "getInput", "()Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$SelectorV2;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SelectorInputItem extends InputItemVO {
            private final int id;

            @NotNull
            private final CommonInputV2VO.SelectorV2 input;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SelectorInputItem(int i11, @NotNull CommonInputV2VO.SelectorV2 input) {
                super(i11, input, null);
                Intrinsics.checkNotNullParameter(input, "input");
                this.id = i11;
                this.input = input;
            }

            public static /* synthetic */ SelectorInputItem copy$default(SelectorInputItem selectorInputItem, int i11, CommonInputV2VO.SelectorV2 selectorV2, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    i11 = selectorInputItem.id;
                }
                if ((i12 & 2) != 0) {
                    selectorV2 = selectorInputItem.input;
                }
                return selectorInputItem.copy(i11, selectorV2);
            }

            @NotNull
            public final SelectorInputItem copy(int id2, @NotNull CommonInputV2VO.SelectorV2 input) {
                Intrinsics.checkNotNullParameter(input, "input");
                return new SelectorInputItem(id2, input);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SelectorInputItem)) {
                    return false;
                }
                SelectorInputItem selectorInputItem = (SelectorInputItem) other;
                return this.id == selectorInputItem.id && Intrinsics.d(this.input, selectorInputItem.input);
            }

            @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.TravelAddNewPassengerFormV3VO.InputItemVO
            public int getId() {
                return this.id;
            }

            public int hashCode() {
                return this.input.hashCode() + (Integer.hashCode(this.id) * 31);
            }

            @NotNull
            public String toString() {
                return "SelectorInputItem(id=" + this.id + ", input=" + this.input + ")";
            }

            @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.TravelAddNewPassengerFormV3VO.InputItemVO
            @NotNull
            public CommonInputV2VO.SelectorV2 getInput() {
                return this.input;
            }
        }

        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001:\u0001)B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJL\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO$TextInputItem;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO;", "", "id", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "input", "Lru/ozon/uni/atoms/data/text/TextDTO;", "infoText", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "hintBadges", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO$TextInputItem$DisclaimerVO;", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "<init>", "(ILru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO$TextInputItem$DisclaimerVO;)V", "copy", "(ILru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO$TextInputItem$DisclaimerVO;)Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO$TextInputItem;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "getInput", "()Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO$TextInputV2;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getInfoText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getHintBadges", "()Ljava/util/List;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO$TextInputItem$DisclaimerVO;", "getDisclaimer", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO$TextInputItem$DisclaimerVO;", "DisclaimerVO", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TextInputItem extends InputItemVO {
            private final DisclaimerVO disclaimer;

            @NotNull
            private final List<BadgeDTO> hintBadges;
            private final int id;
            private final TextDTO infoText;

            @NotNull
            private final CommonInputV2VO.TextInputV2 input;

            @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b$\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b+\u0010*R%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO$TextInputItem$DisclaimerVO;", "", "", "backgroundColor", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "icon", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "closeButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "yesButton", "noButton", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getCloseButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getYesButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getNoButton", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class DisclaimerVO {
                private final String backgroundColor;
                private final IconButtonV3DTO closeButton;
                private final CommonAtomIconDTO icon;
                private final ButtonV3DTO noButton;
                private final TextDTO subtitle;

                @NotNull
                private final TextDTO title;
                private final Map<String, TokenizedTrackingInfo> trackingInfo;
                private final ButtonV3DTO yesButton;

                public DisclaimerVO(String str, CommonAtomIconDTO commonAtomIconDTO, @NotNull TextDTO title, TextDTO textDTO, IconButtonV3DTO iconButtonV3DTO, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, Map<String, TokenizedTrackingInfo> map) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    this.backgroundColor = str;
                    this.icon = commonAtomIconDTO;
                    this.title = title;
                    this.subtitle = textDTO;
                    this.closeButton = iconButtonV3DTO;
                    this.yesButton = buttonV3DTO;
                    this.noButton = buttonV3DTO2;
                    this.trackingInfo = map;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof DisclaimerVO)) {
                        return false;
                    }
                    DisclaimerVO disclaimerVO = (DisclaimerVO) other;
                    return Intrinsics.d(this.backgroundColor, disclaimerVO.backgroundColor) && Intrinsics.d(this.icon, disclaimerVO.icon) && Intrinsics.d(this.title, disclaimerVO.title) && Intrinsics.d(this.subtitle, disclaimerVO.subtitle) && Intrinsics.d(this.closeButton, disclaimerVO.closeButton) && Intrinsics.d(this.yesButton, disclaimerVO.yesButton) && Intrinsics.d(this.noButton, disclaimerVO.noButton) && Intrinsics.d(this.trackingInfo, disclaimerVO.trackingInfo);
                }

                public final String getBackgroundColor() {
                    return this.backgroundColor;
                }

                public final IconButtonV3DTO getCloseButton() {
                    return this.closeButton;
                }

                public final CommonAtomIconDTO getIcon() {
                    return this.icon;
                }

                public final ButtonV3DTO getNoButton() {
                    return this.noButton;
                }

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

                public final ButtonV3DTO getYesButton() {
                    return this.yesButton;
                }

                public int hashCode() {
                    String str = this.backgroundColor;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    CommonAtomIconDTO commonAtomIconDTO = this.icon;
                    int a11 = b.a(this.title, (hashCode + (commonAtomIconDTO == null ? 0 : commonAtomIconDTO.hashCode())) * 31, 31);
                    TextDTO textDTO = this.subtitle;
                    int hashCode2 = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
                    IconButtonV3DTO iconButtonV3DTO = this.closeButton;
                    int hashCode3 = (hashCode2 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
                    ButtonV3DTO buttonV3DTO = this.yesButton;
                    int hashCode4 = (hashCode3 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
                    ButtonV3DTO buttonV3DTO2 = this.noButton;
                    int hashCode5 = (hashCode4 + (buttonV3DTO2 == null ? 0 : buttonV3DTO2.hashCode())) * 31;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    return hashCode5 + (map != null ? map.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    String str = this.backgroundColor;
                    CommonAtomIconDTO commonAtomIconDTO = this.icon;
                    TextDTO textDTO = this.title;
                    TextDTO textDTO2 = this.subtitle;
                    IconButtonV3DTO iconButtonV3DTO = this.closeButton;
                    ButtonV3DTO buttonV3DTO = this.yesButton;
                    ButtonV3DTO buttonV3DTO2 = this.noButton;
                    Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                    StringBuilder sb2 = new StringBuilder("DisclaimerVO(backgroundColor=");
                    sb2.append(str);
                    sb2.append(", icon=");
                    sb2.append(commonAtomIconDTO);
                    sb2.append(", title=");
                    d.e(", subtitle=", ", closeButton=", sb2, textDTO, textDTO2);
                    sb2.append(iconButtonV3DTO);
                    sb2.append(", yesButton=");
                    sb2.append(buttonV3DTO);
                    sb2.append(", noButton=");
                    sb2.append(buttonV3DTO2);
                    sb2.append(", trackingInfo=");
                    sb2.append(map);
                    sb2.append(")");
                    return sb2.toString();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TextInputItem(int i11, @NotNull CommonInputV2VO.TextInputV2 input, TextDTO textDTO, @NotNull List<BadgeDTO> hintBadges, DisclaimerVO disclaimerVO) {
                super(i11, input, null);
                Intrinsics.checkNotNullParameter(input, "input");
                Intrinsics.checkNotNullParameter(hintBadges, "hintBadges");
                this.id = i11;
                this.input = input;
                this.infoText = textDTO;
                this.hintBadges = hintBadges;
                this.disclaimer = disclaimerVO;
            }

            public static /* synthetic */ TextInputItem copy$default(TextInputItem textInputItem, int i11, CommonInputV2VO.TextInputV2 textInputV2, TextDTO textDTO, List list, DisclaimerVO disclaimerVO, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    i11 = textInputItem.id;
                }
                if ((i12 & 2) != 0) {
                    textInputV2 = textInputItem.input;
                }
                if ((i12 & 4) != 0) {
                    textDTO = textInputItem.infoText;
                }
                if ((i12 & 8) != 0) {
                    list = textInputItem.hintBadges;
                }
                if ((i12 & 16) != 0) {
                    disclaimerVO = textInputItem.disclaimer;
                }
                DisclaimerVO disclaimerVO2 = disclaimerVO;
                TextDTO textDTO2 = textDTO;
                return textInputItem.copy(i11, textInputV2, textDTO2, list, disclaimerVO2);
            }

            @NotNull
            public final TextInputItem copy(int id2, @NotNull CommonInputV2VO.TextInputV2 input, TextDTO infoText, @NotNull List<BadgeDTO> hintBadges, DisclaimerVO disclaimer) {
                Intrinsics.checkNotNullParameter(input, "input");
                Intrinsics.checkNotNullParameter(hintBadges, "hintBadges");
                return new TextInputItem(id2, input, infoText, hintBadges, disclaimer);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TextInputItem)) {
                    return false;
                }
                TextInputItem textInputItem = (TextInputItem) other;
                return this.id == textInputItem.id && Intrinsics.d(this.input, textInputItem.input) && Intrinsics.d(this.infoText, textInputItem.infoText) && Intrinsics.d(this.hintBadges, textInputItem.hintBadges) && Intrinsics.d(this.disclaimer, textInputItem.disclaimer);
            }

            public final DisclaimerVO getDisclaimer() {
                return this.disclaimer;
            }

            @NotNull
            public final List<BadgeDTO> getHintBadges() {
                return this.hintBadges;
            }

            @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.TravelAddNewPassengerFormV3VO.InputItemVO
            public int getId() {
                return this.id;
            }

            public final TextDTO getInfoText() {
                return this.infoText;
            }

            public int hashCode() {
                int hashCode = (this.input.hashCode() + (Integer.hashCode(this.id) * 31)) * 31;
                TextDTO textDTO = this.infoText;
                int b11 = g.b((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.hintBadges);
                DisclaimerVO disclaimerVO = this.disclaimer;
                return b11 + (disclaimerVO != null ? disclaimerVO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                int i11 = this.id;
                CommonInputV2VO.TextInputV2 textInputV2 = this.input;
                TextDTO textDTO = this.infoText;
                List<BadgeDTO> list = this.hintBadges;
                DisclaimerVO disclaimerVO = this.disclaimer;
                StringBuilder sb2 = new StringBuilder("TextInputItem(id=");
                sb2.append(i11);
                sb2.append(", input=");
                sb2.append(textInputV2);
                sb2.append(", infoText=");
                Tl.a.e(sb2, textDTO, ", hintBadges=", list, ", disclaimer=");
                sb2.append(disclaimerVO);
                sb2.append(")");
                return sb2.toString();
            }

            @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.TravelAddNewPassengerFormV3VO.InputItemVO
            @NotNull
            public CommonInputV2VO.TextInputV2 getInput() {
                return this.input;
            }
        }

        public /* synthetic */ InputItemVO(int i11, CommonInputV2VO commonInputV2VO, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, commonInputV2VO);
        }

        public int getId() {
            return this.id;
        }

        @NotNull
        public CommonInputV2VO getInput() {
            return this.input;
        }

        private InputItemVO(int i11, CommonInputV2VO commonInputV2VO) {
            this.id = i11;
            this.input = commonInputV2VO;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TravelAddNewPassengerFormV3VO(long j11, @NotNull List<? extends InputItemVO> inputs, @NotNull ButtonV3DTO saveButton, TextDTO textDTO, CellDTO cellDTO, boolean z11, t tVar, List<String> list) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Intrinsics.checkNotNullParameter(saveButton, "saveButton");
        this.id = j11;
        this.inputs = inputs;
        this.saveButton = saveButton;
        this.agreementText = textDTO;
        this.useBankDetails = cellDTO;
        this.isInputChangedByClient = z11;
        this.viewEvent = tVar;
        this.actionNamesToSkip = list;
    }

    public static /* synthetic */ TravelAddNewPassengerFormV3VO copy$default(TravelAddNewPassengerFormV3VO travelAddNewPassengerFormV3VO, long j11, List list, ButtonV3DTO buttonV3DTO, TextDTO textDTO, CellDTO cellDTO, boolean z11, t tVar, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = travelAddNewPassengerFormV3VO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            list = travelAddNewPassengerFormV3VO.inputs;
        }
        List list3 = list;
        if ((i11 & 4) != 0) {
            buttonV3DTO = travelAddNewPassengerFormV3VO.saveButton;
        }
        ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
        if ((i11 & 8) != 0) {
            textDTO = travelAddNewPassengerFormV3VO.agreementText;
        }
        return travelAddNewPassengerFormV3VO.copy(j12, list3, buttonV3DTO2, textDTO, (i11 & 16) != 0 ? travelAddNewPassengerFormV3VO.useBankDetails : cellDTO, (i11 & 32) != 0 ? travelAddNewPassengerFormV3VO.isInputChangedByClient : z11, (i11 & 64) != 0 ? travelAddNewPassengerFormV3VO.viewEvent : tVar, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? travelAddNewPassengerFormV3VO.actionNamesToSkip : list2);
    }

    @NotNull
    public final TravelAddNewPassengerFormV3VO copy(long id2, @NotNull List<? extends InputItemVO> inputs, @NotNull ButtonV3DTO saveButton, TextDTO agreementText, CellDTO useBankDetails, boolean isInputChangedByClient, t viewEvent, List<String> actionNamesToSkip) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        Intrinsics.checkNotNullParameter(saveButton, "saveButton");
        return new TravelAddNewPassengerFormV3VO(id2, inputs, saveButton, agreementText, useBankDetails, isInputChangedByClient, viewEvent, actionNamesToSkip);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelAddNewPassengerFormV3VO)) {
            return false;
        }
        TravelAddNewPassengerFormV3VO travelAddNewPassengerFormV3VO = (TravelAddNewPassengerFormV3VO) other;
        return this.id == travelAddNewPassengerFormV3VO.id && Intrinsics.d(this.inputs, travelAddNewPassengerFormV3VO.inputs) && Intrinsics.d(this.saveButton, travelAddNewPassengerFormV3VO.saveButton) && Intrinsics.d(this.agreementText, travelAddNewPassengerFormV3VO.agreementText) && Intrinsics.d(this.useBankDetails, travelAddNewPassengerFormV3VO.useBankDetails) && this.isInputChangedByClient == travelAddNewPassengerFormV3VO.isInputChangedByClient && Intrinsics.d(this.viewEvent, travelAddNewPassengerFormV3VO.viewEvent) && Intrinsics.d(this.actionNamesToSkip, travelAddNewPassengerFormV3VO.actionNamesToSkip);
    }

    public final List<String> getActionNamesToSkip() {
        return this.actionNamesToSkip;
    }

    public final TextDTO getAgreementText() {
        return this.agreementText;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<InputItemVO> getInputs() {
        return this.inputs;
    }

    @NotNull
    public final ButtonV3DTO getSaveButton() {
        return this.saveButton;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final CellDTO getUseBankDetails() {
        return this.useBankDetails;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int c11 = C2859b.c(this.saveButton, g.b(Long.hashCode(this.id) * 31, 31, this.inputs), 31);
        TextDTO textDTO = this.agreementText;
        int hashCode = (c11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        CellDTO cellDTO = this.useBankDetails;
        int a11 = C3532b.a((hashCode + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31, 31, this.isInputChangedByClient);
        t tVar = this.viewEvent;
        int hashCode2 = (a11 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        List<String> list = this.actionNamesToSkip;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    /* renamed from: isInputChangedByClient, reason: from getter */
    public final boolean getIsInputChangedByClient() {
        return this.isInputChangedByClient;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<InputItemVO> list = this.inputs;
        ButtonV3DTO buttonV3DTO = this.saveButton;
        TextDTO textDTO = this.agreementText;
        CellDTO cellDTO = this.useBankDetails;
        boolean z11 = this.isInputChangedByClient;
        t tVar = this.viewEvent;
        List<String> list2 = this.actionNamesToSkip;
        StringBuilder b11 = Lh.b.b(j11, "TravelAddNewPassengerFormV3VO(id=", ", inputs=", list);
        b11.append(", saveButton=");
        b11.append(buttonV3DTO);
        b11.append(", agreementText=");
        b11.append(textDTO);
        b11.append(", useBankDetails=");
        b11.append(cellDTO);
        b11.append(", isInputChangedByClient=");
        b11.append(z11);
        b11.append(", viewEvent=");
        b11.append(tVar);
        b11.append(", actionNamesToSkip=");
        b11.append(list2);
        b11.append(")");
        return b11.toString();
    }

    public /* synthetic */ TravelAddNewPassengerFormV3VO(long j11, List list, ButtonV3DTO buttonV3DTO, TextDTO textDTO, CellDTO cellDTO, boolean z11, t tVar, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, list, buttonV3DTO, textDTO, cellDTO, (i11 & 32) != 0 ? false : z11, tVar, list2);
    }
}
