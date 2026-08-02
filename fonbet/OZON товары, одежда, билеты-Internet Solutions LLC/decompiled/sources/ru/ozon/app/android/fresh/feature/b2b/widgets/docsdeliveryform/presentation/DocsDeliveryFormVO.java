package ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation;

import B90.C2618u;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import Ns.b;
import Pk0.a;
import c8.C5766e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002&'B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "text", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input$TextInput;", "addressInput", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$DeliveryVariantVO;", "deliveryVariant", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input$TextInput;Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$DeliveryVariantVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input$TextInput;", "getAddressInput", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input$TextInput;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$DeliveryVariantVO;", "getDeliveryVariant", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$DeliveryVariantVO;", "DeliveryVariantVO", "Input", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DocsDeliveryFormVO implements c {

    @NotNull
    private final Input.TextInput addressInput;

    @NotNull
    private final DeliveryVariantVO deliveryVariant;
    private final long id;

    @NotNull
    private final TextDTO text;

    @NotNull
    private final TextDTO title;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$DeliveryVariantVO;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "annotation", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input;", "inputs", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getAnnotation", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "Ljava/util/List;", "getInputs", "()Ljava/util/List;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DeliveryVariantVO {
        private final DisclaimerAtom annotation;

        @NotNull
        private final List<Input> inputs;

        @NotNull
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public DeliveryVariantVO(@NotNull String title, DisclaimerAtom disclaimerAtom, @NotNull List<? extends Input> inputs) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(inputs, "inputs");
            this.title = title;
            this.annotation = disclaimerAtom;
            this.inputs = inputs;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeliveryVariantVO)) {
                return false;
            }
            DeliveryVariantVO deliveryVariantVO = (DeliveryVariantVO) other;
            return Intrinsics.d(this.title, deliveryVariantVO.title) && Intrinsics.d(this.annotation, deliveryVariantVO.annotation) && Intrinsics.d(this.inputs, deliveryVariantVO.inputs);
        }

        public final DisclaimerAtom getAnnotation() {
            return this.annotation;
        }

        @NotNull
        public final List<Input> getInputs() {
            return this.inputs;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            DisclaimerAtom disclaimerAtom = this.annotation;
            return this.inputs.hashCode() + ((hashCode + (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            DisclaimerAtom disclaimerAtom = this.annotation;
            List<Input> list = this.inputs;
            StringBuilder sb2 = new StringBuilder("DeliveryVariantVO(title=");
            sb2.append(str);
            sb2.append(", annotation=");
            sb2.append(disclaimerAtom);
            sb2.append(", inputs=");
            return C2618u.h(sb2, list, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "TextInput", "CheckBoxInput", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input$CheckBoxInput;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input$TextInput;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Input {

        @NotNull
        private final String name;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input$CheckBoxInput;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "label", "", "checked", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input$CheckBoxInput;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getLabel", "Z", "getChecked", "()Z", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CheckBoxInput extends Input {
            private final boolean checked;

            @NotNull
            private final String label;

            @NotNull
            private final String name;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CheckBoxInput(@NotNull String name, @NotNull String label, boolean z11) {
                super(name, null);
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(label, "label");
                this.name = name;
                this.label = label;
                this.checked = z11;
            }

            public static /* synthetic */ CheckBoxInput copy$default(CheckBoxInput checkBoxInput, String str, String str2, boolean z11, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = checkBoxInput.name;
                }
                if ((i11 & 2) != 0) {
                    str2 = checkBoxInput.label;
                }
                if ((i11 & 4) != 0) {
                    z11 = checkBoxInput.checked;
                }
                return checkBoxInput.copy(str, str2, z11);
            }

            @NotNull
            public final CheckBoxInput copy(@NotNull String name, @NotNull String label, boolean checked) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(label, "label");
                return new CheckBoxInput(name, label, checked);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CheckBoxInput)) {
                    return false;
                }
                CheckBoxInput checkBoxInput = (CheckBoxInput) other;
                return Intrinsics.d(this.name, checkBoxInput.name) && Intrinsics.d(this.label, checkBoxInput.label) && this.checked == checkBoxInput.checked;
            }

            public final boolean getChecked() {
                return this.checked;
            }

            @NotNull
            public final String getLabel() {
                return this.label;
            }

            @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormVO.Input
            @NotNull
            public String getName() {
                return this.name;
            }

            public int hashCode() {
                return Boolean.hashCode(this.checked) + g.a(this.name.hashCode() * 31, 31, this.label);
            }

            @NotNull
            public String toString() {
                String str = this.name;
                String str2 = this.label;
                return a.a(")", C3660k.d("CheckBoxInput(name=", str, ", label=", str2, ", checked="), this.checked);
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\\\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001e\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001f\u0010\u0010R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b \u0010\u0010R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\n\u0010\u001d¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input$TextInput;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, HammersV3BodyDTO.PLACEHOLDER, "", "required", AppMeasurementSdk.ConditionalUserProperty.VALUE, FormPageDTO.Field.FIELD_TYPE_MASK, "error", "isEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input$TextInput;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getPlaceholder", "Z", "getRequired", "()Z", "getValue", "getMask", "getError", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TextInput extends Input {
            private final String error;
            private final boolean isEnabled;
            private final String mask;

            @NotNull
            private final String name;

            @NotNull
            private final String placeholder;
            private final boolean required;
            private final String value;

            public /* synthetic */ TextInput(String str, String str2, boolean z11, String str3, String str4, String str5, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, z11, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? true : z12);
            }

            public static /* synthetic */ TextInput copy$default(TextInput textInput, String str, String str2, boolean z11, String str3, String str4, String str5, boolean z12, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = textInput.name;
                }
                if ((i11 & 2) != 0) {
                    str2 = textInput.placeholder;
                }
                if ((i11 & 4) != 0) {
                    z11 = textInput.required;
                }
                if ((i11 & 8) != 0) {
                    str3 = textInput.value;
                }
                if ((i11 & 16) != 0) {
                    str4 = textInput.mask;
                }
                if ((i11 & 32) != 0) {
                    str5 = textInput.error;
                }
                if ((i11 & 64) != 0) {
                    z12 = textInput.isEnabled;
                }
                String str6 = str5;
                boolean z13 = z12;
                String str7 = str4;
                boolean z14 = z11;
                return textInput.copy(str, str2, z14, str3, str7, str6, z13);
            }

            @NotNull
            public final TextInput copy(@NotNull String name, @NotNull String placeholder, boolean required, String value, String mask, String error, boolean isEnabled) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(placeholder, "placeholder");
                return new TextInput(name, placeholder, required, value, mask, error, isEnabled);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TextInput)) {
                    return false;
                }
                TextInput textInput = (TextInput) other;
                return Intrinsics.d(this.name, textInput.name) && Intrinsics.d(this.placeholder, textInput.placeholder) && this.required == textInput.required && Intrinsics.d(this.value, textInput.value) && Intrinsics.d(this.mask, textInput.mask) && Intrinsics.d(this.error, textInput.error) && this.isEnabled == textInput.isEnabled;
            }

            public final String getError() {
                return this.error;
            }

            public final String getMask() {
                return this.mask;
            }

            @Override // ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormVO.Input
            @NotNull
            public String getName() {
                return this.name;
            }

            @NotNull
            public final String getPlaceholder() {
                return this.placeholder;
            }

            public final boolean getRequired() {
                return this.required;
            }

            public final String getValue() {
                return this.value;
            }

            public int hashCode() {
                int a11 = C3532b.a(g.a(this.name.hashCode() * 31, 31, this.placeholder), 31, this.required);
                String str = this.value;
                int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.mask;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.error;
                return Boolean.hashCode(this.isEnabled) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
            }

            /* renamed from: isEnabled, reason: from getter */
            public final boolean getIsEnabled() {
                return this.isEnabled;
            }

            @NotNull
            public String toString() {
                String str = this.name;
                String str2 = this.placeholder;
                boolean z11 = this.required;
                String str3 = this.value;
                String str4 = this.mask;
                String str5 = this.error;
                boolean z12 = this.isEnabled;
                StringBuilder d11 = C3660k.d("TextInput(name=", str, ", placeholder=", str2, ", required=");
                C5766e.a(", value=", str3, ", mask=", d11, z11);
                Nh.a.h(d11, str4, ", error=", str5, ", isEnabled=");
                return a.a(")", d11, z12);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TextInput(@NotNull String name, @NotNull String placeholder, boolean z11, String str, String str2, String str3, boolean z12) {
                super(name, null);
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(placeholder, "placeholder");
                this.name = name;
                this.placeholder = placeholder;
                this.required = z11;
                this.value = str;
                this.mask = str2;
                this.error = str3;
                this.isEnabled = z12;
            }
        }

        public /* synthetic */ Input(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        @NotNull
        public String getName() {
            return this.name;
        }

        private Input(String str) {
            this.name = str;
        }
    }

    public DocsDeliveryFormVO(long j11, @NotNull TextDTO title, @NotNull TextDTO text, @NotNull Input.TextInput addressInput, @NotNull DeliveryVariantVO deliveryVariant) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(addressInput, "addressInput");
        Intrinsics.checkNotNullParameter(deliveryVariant, "deliveryVariant");
        this.id = j11;
        this.title = title;
        this.text = text;
        this.addressInput = addressInput;
        this.deliveryVariant = deliveryVariant;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocsDeliveryFormVO)) {
            return false;
        }
        DocsDeliveryFormVO docsDeliveryFormVO = (DocsDeliveryFormVO) other;
        return this.id == docsDeliveryFormVO.id && Intrinsics.d(this.title, docsDeliveryFormVO.title) && Intrinsics.d(this.text, docsDeliveryFormVO.text) && Intrinsics.d(this.addressInput, docsDeliveryFormVO.addressInput) && Intrinsics.d(this.deliveryVariant, docsDeliveryFormVO.deliveryVariant);
    }

    @NotNull
    public final Input.TextInput getAddressInput() {
        return this.addressInput;
    }

    @NotNull
    public final DeliveryVariantVO getDeliveryVariant() {
        return this.deliveryVariant;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextDTO getText() {
        return this.text;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.deliveryVariant.hashCode() + ((this.addressInput.hashCode() + b.a(this.text, b.a(this.title, Long.hashCode(this.id) * 31, 31), 31)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.text;
        Input.TextInput textInput = this.addressInput;
        DeliveryVariantVO deliveryVariantVO = this.deliveryVariant;
        StringBuilder b11 = TY.a.b("DocsDeliveryFormVO(id=", j11, ", title=", textDTO);
        b11.append(", text=");
        b11.append(textDTO2);
        b11.append(", addressInput=");
        b11.append(textInput);
        b11.append(", deliveryVariant=");
        b11.append(deliveryVariantVO);
        b11.append(")");
        return b11.toString();
    }
}
