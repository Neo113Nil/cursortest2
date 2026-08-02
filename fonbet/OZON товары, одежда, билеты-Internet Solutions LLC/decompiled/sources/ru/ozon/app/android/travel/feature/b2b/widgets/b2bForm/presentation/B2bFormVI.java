package ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.presentation;

import B0.C2454a;
import De.C2859b;
import G.g;
import K00.b;
import Tz.C4055a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.travelWidgetSettings.TravelWidgetSettingsDTO;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00020\u0001:\u0003-./BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010\u0016R\u001f\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI;", "Ll20/c;", "", "id", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI$HeaderSectionVI;", "headerSection", "", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI$FormBlockVI;", "formBlockList", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI$ButtonSectionVI;", "buttonSection", "", "gap", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI$HeaderSectionVI;Ljava/util/List;Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI$ButtonSectionVI;ILWZ/t;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI$HeaderSectionVI;", "getHeaderSection", "()Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI$HeaderSectionVI;", "Ljava/util/List;", "getFormBlockList", "()Ljava/util/List;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI$ButtonSectionVI;", "getButtonSection", "()Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI$ButtonSectionVI;", "I", "getGap", "LWZ/t;", "getViewEvent", "()LWZ/t;", "HeaderSectionVI", "FormBlockVI", "ButtonSectionVI", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class B2bFormVI implements c {
    private final ButtonSectionVI buttonSection;

    @NotNull
    private final List<FormBlockVI> formBlockList;
    private final int gap;
    private final HeaderSectionVI headerSection;
    private final long id;
    private final t viewEvent;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b\f\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI$ButtonSectionVI;", "", "Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "settings", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "submitButton", "additionalButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "additionalIconButton", "Lru/ozon/uni/atoms/data/text/TextDTO;", "agreement", "", "isSticky", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "getSettings", "()Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSubmitButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getAdditionalButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getAdditionalIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getAgreement", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Z", "()Z", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonSectionVI {
        private final ButtonV3DTO additionalButton;
        private final IconButtonV3DTO additionalIconButton;
        private final TextDTO agreement;
        private final boolean isSticky;
        private final TravelWidgetSettingsDTO settings;

        @NotNull
        private final ButtonV3DTO submitButton;

        public ButtonSectionVI(TravelWidgetSettingsDTO travelWidgetSettingsDTO, @NotNull ButtonV3DTO submitButton, ButtonV3DTO buttonV3DTO, IconButtonV3DTO iconButtonV3DTO, TextDTO textDTO, boolean z11) {
            Intrinsics.checkNotNullParameter(submitButton, "submitButton");
            this.settings = travelWidgetSettingsDTO;
            this.submitButton = submitButton;
            this.additionalButton = buttonV3DTO;
            this.additionalIconButton = iconButtonV3DTO;
            this.agreement = textDTO;
            this.isSticky = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonSectionVI)) {
                return false;
            }
            ButtonSectionVI buttonSectionVI = (ButtonSectionVI) other;
            return Intrinsics.d(this.settings, buttonSectionVI.settings) && Intrinsics.d(this.submitButton, buttonSectionVI.submitButton) && Intrinsics.d(this.additionalButton, buttonSectionVI.additionalButton) && Intrinsics.d(this.additionalIconButton, buttonSectionVI.additionalIconButton) && Intrinsics.d(this.agreement, buttonSectionVI.agreement) && this.isSticky == buttonSectionVI.isSticky;
        }

        public final ButtonV3DTO getAdditionalButton() {
            return this.additionalButton;
        }

        public final IconButtonV3DTO getAdditionalIconButton() {
            return this.additionalIconButton;
        }

        public final TextDTO getAgreement() {
            return this.agreement;
        }

        public final TravelWidgetSettingsDTO getSettings() {
            return this.settings;
        }

        @NotNull
        public final ButtonV3DTO getSubmitButton() {
            return this.submitButton;
        }

        public int hashCode() {
            TravelWidgetSettingsDTO travelWidgetSettingsDTO = this.settings;
            int c11 = C2859b.c(this.submitButton, (travelWidgetSettingsDTO == null ? 0 : travelWidgetSettingsDTO.hashCode()) * 31, 31);
            ButtonV3DTO buttonV3DTO = this.additionalButton;
            int hashCode = (c11 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
            IconButtonV3DTO iconButtonV3DTO = this.additionalIconButton;
            int hashCode2 = (hashCode + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
            TextDTO textDTO = this.agreement;
            return Boolean.hashCode(this.isSticky) + ((hashCode2 + (textDTO != null ? textDTO.hashCode() : 0)) * 31);
        }

        /* renamed from: isSticky, reason: from getter */
        public final boolean getIsSticky() {
            return this.isSticky;
        }

        @NotNull
        public String toString() {
            return "ButtonSectionVI(settings=" + this.settings + ", submitButton=" + this.submitButton + ", additionalButton=" + this.additionalButton + ", additionalIconButton=" + this.additionalIconButton + ", agreement=" + this.agreement + ", isSticky=" + this.isSticky + ")";
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001:\u0001/B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b!\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b.\u0010\u0017¨\u00060"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI$FormBlockVI;", "", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "settings", "", "Lru/ozon/app/android/travel/molecules/input/v2/CommonInputV2VO;", "inputList", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI$FormBlockVI$CellListBlockVI;", "cellListBlock", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "gap", "<init>", "(ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;Ljava/util/List;Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI$FormBlockVI$CellListBlockVI;Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "getSettings", "()Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "Ljava/util/List;", "getInputList", "()Ljava/util/List;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI$FormBlockVI$CellListBlockVI;", "getCellListBlock", "()Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI$FormBlockVI$CellListBlockVI;", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "getDisclaimer", "()Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "getGap", "CellListBlockVI", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FormBlockVI {
        private final CellListBlockVI cellListBlock;
        private final DisclaimerDTO disclaimer;
        private final int gap;
        private final int id;

        @NotNull
        private final List<CommonInputV2VO> inputList;
        private final TravelWidgetSettingsDTO settings;
        private final TextDTO subtitle;
        private final TextDTO title;

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u000f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI$FormBlockVI$CellListBlockVI;", "", "Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "settings", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cellList", "", "gap", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;Ljava/util/List;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "getSettings", "()Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "Ljava/util/List;", "getCellList", "()Ljava/util/List;", "I", "getGap", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CellListBlockVI {

            @NotNull
            private final List<CellDTO> cellList;
            private final int gap;
            private final TravelWidgetSettingsDTO settings;

            public CellListBlockVI(TravelWidgetSettingsDTO travelWidgetSettingsDTO, @NotNull List<CellDTO> cellList, int i11) {
                Intrinsics.checkNotNullParameter(cellList, "cellList");
                this.settings = travelWidgetSettingsDTO;
                this.cellList = cellList;
                this.gap = i11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CellListBlockVI)) {
                    return false;
                }
                CellListBlockVI cellListBlockVI = (CellListBlockVI) other;
                return Intrinsics.d(this.settings, cellListBlockVI.settings) && Intrinsics.d(this.cellList, cellListBlockVI.cellList) && this.gap == cellListBlockVI.gap;
            }

            @NotNull
            public final List<CellDTO> getCellList() {
                return this.cellList;
            }

            public final int getGap() {
                return this.gap;
            }

            public final TravelWidgetSettingsDTO getSettings() {
                return this.settings;
            }

            public int hashCode() {
                TravelWidgetSettingsDTO travelWidgetSettingsDTO = this.settings;
                return Integer.hashCode(this.gap) + g.b((travelWidgetSettingsDTO == null ? 0 : travelWidgetSettingsDTO.hashCode()) * 31, 31, this.cellList);
            }

            @NotNull
            public String toString() {
                TravelWidgetSettingsDTO travelWidgetSettingsDTO = this.settings;
                List<CellDTO> list = this.cellList;
                int i11 = this.gap;
                StringBuilder sb2 = new StringBuilder("CellListBlockVI(settings=");
                sb2.append(travelWidgetSettingsDTO);
                sb2.append(", cellList=");
                sb2.append(list);
                sb2.append(", gap=");
                return b.e(i11, ")", sb2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FormBlockVI(int i11, TextDTO textDTO, TextDTO textDTO2, TravelWidgetSettingsDTO travelWidgetSettingsDTO, @NotNull List<? extends CommonInputV2VO> inputList, CellListBlockVI cellListBlockVI, DisclaimerDTO disclaimerDTO, int i12) {
            Intrinsics.checkNotNullParameter(inputList, "inputList");
            this.id = i11;
            this.title = textDTO;
            this.subtitle = textDTO2;
            this.settings = travelWidgetSettingsDTO;
            this.inputList = inputList;
            this.cellListBlock = cellListBlockVI;
            this.disclaimer = disclaimerDTO;
            this.gap = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FormBlockVI)) {
                return false;
            }
            FormBlockVI formBlockVI = (FormBlockVI) other;
            return this.id == formBlockVI.id && Intrinsics.d(this.title, formBlockVI.title) && Intrinsics.d(this.subtitle, formBlockVI.subtitle) && Intrinsics.d(this.settings, formBlockVI.settings) && Intrinsics.d(this.inputList, formBlockVI.inputList) && Intrinsics.d(this.cellListBlock, formBlockVI.cellListBlock) && Intrinsics.d(this.disclaimer, formBlockVI.disclaimer) && this.gap == formBlockVI.gap;
        }

        public final CellListBlockVI getCellListBlock() {
            return this.cellListBlock;
        }

        public final DisclaimerDTO getDisclaimer() {
            return this.disclaimer;
        }

        public final int getGap() {
            return this.gap;
        }

        @NotNull
        public final List<CommonInputV2VO> getInputList() {
            return this.inputList;
        }

        public final TravelWidgetSettingsDTO getSettings() {
            return this.settings;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.id) * 31;
            TextDTO textDTO = this.title;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            TextDTO textDTO2 = this.subtitle;
            int hashCode3 = (hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            TravelWidgetSettingsDTO travelWidgetSettingsDTO = this.settings;
            int b11 = g.b((hashCode3 + (travelWidgetSettingsDTO == null ? 0 : travelWidgetSettingsDTO.hashCode())) * 31, 31, this.inputList);
            CellListBlockVI cellListBlockVI = this.cellListBlock;
            int hashCode4 = (b11 + (cellListBlockVI == null ? 0 : cellListBlockVI.hashCode())) * 31;
            DisclaimerDTO disclaimerDTO = this.disclaimer;
            return Integer.hashCode(this.gap) + ((hashCode4 + (disclaimerDTO != null ? disclaimerDTO.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            TravelWidgetSettingsDTO travelWidgetSettingsDTO = this.settings;
            List<CommonInputV2VO> list = this.inputList;
            CellListBlockVI cellListBlockVI = this.cellListBlock;
            DisclaimerDTO disclaimerDTO = this.disclaimer;
            int i12 = this.gap;
            StringBuilder b11 = C4055a.b(textDTO, "FormBlockVI(id=", ", title=", ", subtitle=", i11);
            b11.append(textDTO2);
            b11.append(", settings=");
            b11.append(travelWidgetSettingsDTO);
            b11.append(", inputList=");
            b11.append(list);
            b11.append(", cellListBlock=");
            b11.append(cellListBlockVI);
            b11.append(", disclaimer=");
            b11.append(disclaimerDTO);
            b11.append(", gap=");
            b11.append(i12);
            b11.append(")");
            return b11.toString();
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI$HeaderSectionVI;", "", "Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "settings", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "getSettings", "()Lru/ozon/app/android/travel/molecules/dto/travelWidgetSettings/TravelWidgetSettingsDTO;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HeaderSectionVI {
        private final ImageDTO image;
        private final TravelWidgetSettingsDTO settings;
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        public HeaderSectionVI(TravelWidgetSettingsDTO travelWidgetSettingsDTO, ImageDTO imageDTO, @NotNull TextDTO title, TextDTO textDTO) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.settings = travelWidgetSettingsDTO;
            this.image = imageDTO;
            this.title = title;
            this.subtitle = textDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeaderSectionVI)) {
                return false;
            }
            HeaderSectionVI headerSectionVI = (HeaderSectionVI) other;
            return Intrinsics.d(this.settings, headerSectionVI.settings) && Intrinsics.d(this.image, headerSectionVI.image) && Intrinsics.d(this.title, headerSectionVI.title) && Intrinsics.d(this.subtitle, headerSectionVI.subtitle);
        }

        public final ImageDTO getImage() {
            return this.image;
        }

        public final TravelWidgetSettingsDTO getSettings() {
            return this.settings;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            TravelWidgetSettingsDTO travelWidgetSettingsDTO = this.settings;
            int hashCode = (travelWidgetSettingsDTO == null ? 0 : travelWidgetSettingsDTO.hashCode()) * 31;
            ImageDTO imageDTO = this.image;
            int a11 = Ns.b.a(this.title, (hashCode + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31, 31);
            TextDTO textDTO = this.subtitle;
            return a11 + (textDTO != null ? textDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "HeaderSectionVI(settings=" + this.settings + ", image=" + this.image + ", title=" + this.title + ", subtitle=" + this.subtitle + ")";
        }
    }

    public B2bFormVI(long j11, HeaderSectionVI headerSectionVI, @NotNull List<FormBlockVI> formBlockList, ButtonSectionVI buttonSectionVI, int i11, t tVar) {
        Intrinsics.checkNotNullParameter(formBlockList, "formBlockList");
        this.id = j11;
        this.headerSection = headerSectionVI;
        this.formBlockList = formBlockList;
        this.buttonSection = buttonSectionVI;
        this.gap = i11;
        this.viewEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof B2bFormVI)) {
            return false;
        }
        B2bFormVI b2bFormVI = (B2bFormVI) other;
        return this.id == b2bFormVI.id && Intrinsics.d(this.headerSection, b2bFormVI.headerSection) && Intrinsics.d(this.formBlockList, b2bFormVI.formBlockList) && Intrinsics.d(this.buttonSection, b2bFormVI.buttonSection) && this.gap == b2bFormVI.gap && Intrinsics.d(this.viewEvent, b2bFormVI.viewEvent);
    }

    public final ButtonSectionVI getButtonSection() {
        return this.buttonSection;
    }

    @NotNull
    public final List<FormBlockVI> getFormBlockList() {
        return this.formBlockList;
    }

    public final int getGap() {
        return this.gap;
    }

    public final HeaderSectionVI getHeaderSection() {
        return this.headerSection;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
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
        HeaderSectionVI headerSectionVI = this.headerSection;
        int b11 = g.b((hashCode + (headerSectionVI == null ? 0 : headerSectionVI.hashCode())) * 31, 31, this.formBlockList);
        ButtonSectionVI buttonSectionVI = this.buttonSection;
        int a11 = C2454a.a(this.gap, (b11 + (buttonSectionVI == null ? 0 : buttonSectionVI.hashCode())) * 31, 31);
        t tVar = this.viewEvent;
        return a11 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "B2bFormVI(id=" + this.id + ", headerSection=" + this.headerSection + ", formBlockList=" + this.formBlockList + ", buttonSection=" + this.buttonSection + ", gap=" + this.gap + ", viewEvent=" + this.viewEvent + ")";
    }
}
