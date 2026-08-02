package ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.data;

import B90.C2619v;
import D3.h;
import G.g;
import N3.C3660k;
import Nh.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u001f B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/data/DocsDeliveryFormDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "text", "addressInput", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/data/DocsDeliveryFormDTO$InputDTO;", "deliveryVariants", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/data/DocsDeliveryFormDTO$DeliveryVariantDTO;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/data/DocsDeliveryFormDTO$InputDTO;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getText", "getAddressInput", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/data/DocsDeliveryFormDTO$InputDTO;", "getDeliveryVariants", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "InputDTO", "DeliveryVariantDTO", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DocsDeliveryFormDTO {
    public static final int $stable = 8;

    @NotNull
    private final InputDTO addressInput;

    @NotNull
    private final List<DeliveryVariantDTO> deliveryVariants;

    @NotNull
    private final TextAtom text;

    @NotNull
    private final TextAtom title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JC\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/data/DocsDeliveryFormDTO$DeliveryVariantDTO;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "annotation", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "inputs", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/data/DocsDeliveryFormDTO$InputDTO;", "submitButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Ljava/util/List;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)V", "getId", "()Ljava/lang/String;", "getTitle", "getAnnotation", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getInputs", "()Ljava/util/List;", "getSubmitButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DeliveryVariantDTO {
        public static final int $stable = 8;
        private final DisclaimerAtom annotation;

        @NotNull
        private final String id;

        @NotNull
        private final List<InputDTO> inputs;

        @NotNull
        private final ButtonV3Atom.LargeButton submitButton;

        @NotNull
        private final String title;

        public DeliveryVariantDTO(@NotNull String id2, @NotNull String title, DisclaimerAtom disclaimerAtom, @NotNull List<InputDTO> inputs, @NotNull ButtonV3Atom.LargeButton submitButton) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(inputs, "inputs");
            Intrinsics.checkNotNullParameter(submitButton, "submitButton");
            this.id = id2;
            this.title = title;
            this.annotation = disclaimerAtom;
            this.inputs = inputs;
            this.submitButton = submitButton;
        }

        public static /* synthetic */ DeliveryVariantDTO copy$default(DeliveryVariantDTO deliveryVariantDTO, String str, String str2, DisclaimerAtom disclaimerAtom, List list, ButtonV3Atom.LargeButton largeButton, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = deliveryVariantDTO.id;
            }
            if ((i11 & 2) != 0) {
                str2 = deliveryVariantDTO.title;
            }
            if ((i11 & 4) != 0) {
                disclaimerAtom = deliveryVariantDTO.annotation;
            }
            if ((i11 & 8) != 0) {
                list = deliveryVariantDTO.inputs;
            }
            if ((i11 & 16) != 0) {
                largeButton = deliveryVariantDTO.submitButton;
            }
            ButtonV3Atom.LargeButton largeButton2 = largeButton;
            DisclaimerAtom disclaimerAtom2 = disclaimerAtom;
            return deliveryVariantDTO.copy(str, str2, disclaimerAtom2, list, largeButton2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final DisclaimerAtom getAnnotation() {
            return this.annotation;
        }

        @NotNull
        public final List<InputDTO> component4() {
            return this.inputs;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final ButtonV3Atom.LargeButton getSubmitButton() {
            return this.submitButton;
        }

        @NotNull
        public final DeliveryVariantDTO copy(@NotNull String id2, @NotNull String title, DisclaimerAtom annotation, @NotNull List<InputDTO> inputs, @NotNull ButtonV3Atom.LargeButton submitButton) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(inputs, "inputs");
            Intrinsics.checkNotNullParameter(submitButton, "submitButton");
            return new DeliveryVariantDTO(id2, title, annotation, inputs, submitButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeliveryVariantDTO)) {
                return false;
            }
            DeliveryVariantDTO deliveryVariantDTO = (DeliveryVariantDTO) other;
            return Intrinsics.d(this.id, deliveryVariantDTO.id) && Intrinsics.d(this.title, deliveryVariantDTO.title) && Intrinsics.d(this.annotation, deliveryVariantDTO.annotation) && Intrinsics.d(this.inputs, deliveryVariantDTO.inputs) && Intrinsics.d(this.submitButton, deliveryVariantDTO.submitButton);
        }

        public final DisclaimerAtom getAnnotation() {
            return this.annotation;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final List<InputDTO> getInputs() {
            return this.inputs;
        }

        @NotNull
        public final ButtonV3Atom.LargeButton getSubmitButton() {
            return this.submitButton;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int a11 = g.a(this.id.hashCode() * 31, 31, this.title);
            DisclaimerAtom disclaimerAtom = this.annotation;
            return this.submitButton.hashCode() + g.b((a11 + (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode())) * 31, 31, this.inputs);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            String str2 = this.title;
            DisclaimerAtom disclaimerAtom = this.annotation;
            List<InputDTO> list = this.inputs;
            ButtonV3Atom.LargeButton largeButton = this.submitButton;
            StringBuilder d11 = C3660k.d("DeliveryVariantDTO(id=", str, ", title=", str2, ", annotation=");
            d11.append(disclaimerAtom);
            d11.append(", inputs=");
            d11.append(list);
            d11.append(", submitButton=");
            d11.append(largeButton);
            d11.append(")");
            return d11.toString();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0001-B]\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0018J\t\u0010%\u001a\u00020\rHÆ\u0003Jv\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006."}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/data/DocsDeliveryFormDTO$InputDTO;", "", "type", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "label", HammersV3BodyDTO.PLACEHOLDER, AppMeasurementSdk.ConditionalUserProperty.VALUE, FormPageDTO.Field.FIELD_TYPE_MASK, "required", "", "checked", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/TestInfo;)V", "getType", "()Ljava/lang/String;", "getName", "getLabel", "getPlaceholder", "getValue", "getMask", "getRequired", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getChecked", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/TestInfo;)Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/data/DocsDeliveryFormDTO$InputDTO;", "equals", "other", "hashCode", "", "toString", "Companion", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class InputDTO {

        @NotNull
        public static final String CHECKBOX_TYPE = "checkbox";
        private final Boolean checked;
        private final String label;
        private final String mask;

        @NotNull
        private final String name;
        private final String placeholder;
        private final Boolean required;

        @NotNull
        private final TestInfo testInfo;
        private final String type;
        private final String value;
        public static final int $stable = TestInfo.$stable;

        public InputDTO(String str, @NotNull String name, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, @NotNull TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(testInfo, "testInfo");
            this.type = str;
            this.name = name;
            this.label = str2;
            this.placeholder = str3;
            this.value = str4;
            this.mask = str5;
            this.required = bool;
            this.checked = bool2;
            this.testInfo = testInfo;
        }

        public static /* synthetic */ InputDTO copy$default(InputDTO inputDTO, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, TestInfo testInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = inputDTO.type;
            }
            if ((i11 & 2) != 0) {
                str2 = inputDTO.name;
            }
            if ((i11 & 4) != 0) {
                str3 = inputDTO.label;
            }
            if ((i11 & 8) != 0) {
                str4 = inputDTO.placeholder;
            }
            if ((i11 & 16) != 0) {
                str5 = inputDTO.value;
            }
            if ((i11 & 32) != 0) {
                str6 = inputDTO.mask;
            }
            if ((i11 & 64) != 0) {
                bool = inputDTO.required;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                bool2 = inputDTO.checked;
            }
            if ((i11 & 256) != 0) {
                testInfo = inputDTO.testInfo;
            }
            Boolean bool3 = bool2;
            TestInfo testInfo2 = testInfo;
            String str7 = str6;
            Boolean bool4 = bool;
            String str8 = str5;
            String str9 = str3;
            return inputDTO.copy(str, str2, str9, str4, str8, str7, bool4, bool3, testInfo2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        /* renamed from: component5, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* renamed from: component6, reason: from getter */
        public final String getMask() {
            return this.mask;
        }

        /* renamed from: component7, reason: from getter */
        public final Boolean getRequired() {
            return this.required;
        }

        /* renamed from: component8, reason: from getter */
        public final Boolean getChecked() {
            return this.checked;
        }

        @NotNull
        /* renamed from: component9, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final InputDTO copy(String type, @NotNull String name, String label, String placeholder, String value, String mask, Boolean required, Boolean checked, @NotNull TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(testInfo, "testInfo");
            return new InputDTO(type, name, label, placeholder, value, mask, required, checked, testInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InputDTO)) {
                return false;
            }
            InputDTO inputDTO = (InputDTO) other;
            return Intrinsics.d(this.type, inputDTO.type) && Intrinsics.d(this.name, inputDTO.name) && Intrinsics.d(this.label, inputDTO.label) && Intrinsics.d(this.placeholder, inputDTO.placeholder) && Intrinsics.d(this.value, inputDTO.value) && Intrinsics.d(this.mask, inputDTO.mask) && Intrinsics.d(this.required, inputDTO.required) && Intrinsics.d(this.checked, inputDTO.checked) && Intrinsics.d(this.testInfo, inputDTO.testInfo);
        }

        public final Boolean getChecked() {
            return this.checked;
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getMask() {
            return this.mask;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final Boolean getRequired() {
            return this.required;
        }

        @NotNull
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final String getType() {
            return this.type;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.type;
            int a11 = g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.name);
            String str2 = this.label;
            int hashCode = (a11 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.placeholder;
            int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.value;
            int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.mask;
            int hashCode4 = (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Boolean bool = this.required;
            int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.checked;
            return this.testInfo.hashCode() + ((hashCode5 + (bool2 != null ? bool2.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.type;
            String str2 = this.name;
            String str3 = this.label;
            String str4 = this.placeholder;
            String str5 = this.value;
            String str6 = this.mask;
            Boolean bool = this.required;
            Boolean bool2 = this.checked;
            TestInfo testInfo = this.testInfo;
            StringBuilder d11 = C3660k.d("InputDTO(type=", str, ", name=", str2, ", label=");
            a.h(d11, str3, ", placeholder=", str4, ", value=");
            a.h(d11, str5, ", mask=", str6, ", required=");
            h.h(d11, bool, ", checked=", bool2, ", testInfo=");
            return Pk0.h.c(d11, testInfo, ")");
        }
    }

    public DocsDeliveryFormDTO(@NotNull TextAtom title, @NotNull TextAtom text, @NotNull InputDTO addressInput, @NotNull List<DeliveryVariantDTO> deliveryVariants) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(addressInput, "addressInput");
        Intrinsics.checkNotNullParameter(deliveryVariants, "deliveryVariants");
        this.title = title;
        this.text = text;
        this.addressInput = addressInput;
        this.deliveryVariants = deliveryVariants;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DocsDeliveryFormDTO copy$default(DocsDeliveryFormDTO docsDeliveryFormDTO, TextAtom textAtom, TextAtom textAtom2, InputDTO inputDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textAtom = docsDeliveryFormDTO.title;
        }
        if ((i11 & 2) != 0) {
            textAtom2 = docsDeliveryFormDTO.text;
        }
        if ((i11 & 4) != 0) {
            inputDTO = docsDeliveryFormDTO.addressInput;
        }
        if ((i11 & 8) != 0) {
            list = docsDeliveryFormDTO.deliveryVariants;
        }
        return docsDeliveryFormDTO.copy(textAtom, textAtom2, inputDTO, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextAtom getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final InputDTO getAddressInput() {
        return this.addressInput;
    }

    @NotNull
    public final List<DeliveryVariantDTO> component4() {
        return this.deliveryVariants;
    }

    @NotNull
    public final DocsDeliveryFormDTO copy(@NotNull TextAtom title, @NotNull TextAtom text, @NotNull InputDTO addressInput, @NotNull List<DeliveryVariantDTO> deliveryVariants) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(addressInput, "addressInput");
        Intrinsics.checkNotNullParameter(deliveryVariants, "deliveryVariants");
        return new DocsDeliveryFormDTO(title, text, addressInput, deliveryVariants);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocsDeliveryFormDTO)) {
            return false;
        }
        DocsDeliveryFormDTO docsDeliveryFormDTO = (DocsDeliveryFormDTO) other;
        return Intrinsics.d(this.title, docsDeliveryFormDTO.title) && Intrinsics.d(this.text, docsDeliveryFormDTO.text) && Intrinsics.d(this.addressInput, docsDeliveryFormDTO.addressInput) && Intrinsics.d(this.deliveryVariants, docsDeliveryFormDTO.deliveryVariants);
    }

    @NotNull
    public final InputDTO getAddressInput() {
        return this.addressInput;
    }

    @NotNull
    public final List<DeliveryVariantDTO> getDeliveryVariants() {
        return this.deliveryVariants;
    }

    @NotNull
    public final TextAtom getText() {
        return this.text;
    }

    @NotNull
    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.deliveryVariants.hashCode() + ((this.addressInput.hashCode() + C2619v.b(this.title.hashCode() * 31, 31, this.text)) * 31);
    }

    @NotNull
    public String toString() {
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.text;
        InputDTO inputDTO = this.addressInput;
        List<DeliveryVariantDTO> list = this.deliveryVariants;
        StringBuilder a11 = HY.a.a("DocsDeliveryFormDTO(title=", textAtom, ", text=", textAtom2, ", addressInput=");
        a11.append(inputDTO);
        a11.append(", deliveryVariants=");
        a11.append(list);
        a11.append(")");
        return a11.toString();
    }
}
