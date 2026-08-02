package ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.data;

import B0.C2454a;
import C.o0;
import Co.a;
import D40.c;
import De.C2859b;
import G.g;
import GR.b;
import V.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0004!\"#$B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J7\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006%"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/ReconciliationActsDeclinerDTO;", "", "attachField", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/ReconciliationActsDeclinerDTO$AttachField;", "textFields", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/ReconciliationActsDeclinerDTO$TextField;", "submitButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "policyField", "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/ReconciliationActsDeclinerDTO$AttachField;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getAttachField", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/ReconciliationActsDeclinerDTO$AttachField;", "getTextFields", "()Ljava/util/List;", "getSubmitButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getPolicyField", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "AttachField", "ButtonStates", "ColoredButton", "TextField", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ReconciliationActsDeclinerDTO {
    public static final int $stable = 8;

    @NotNull
    private final AttachField attachField;

    @NotNull
    private final TextDTO policyField;

    @NotNull
    private final ButtonV3DTO submitButton;

    @NotNull
    private final List<TextField> textFields;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\u0015\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\tHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006("}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/ReconciliationActsDeclinerDTO$AttachField;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "label", "Lru/ozon/uni/atoms/data/text/TextDTO;", "formats", "", "maxSize", "", "lexemes", "", "buttonsStates", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/ReconciliationActsDeclinerDTO$ButtonStates;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;ILjava/util/Map;Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/ReconciliationActsDeclinerDTO$ButtonStates;)V", "getName", "()Ljava/lang/String;", "getLabel", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getFormats", "()Ljava/util/List;", "getMaxSize", "()I", "getLexemes", "()Ljava/util/Map;", "getButtonsStates", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/ReconciliationActsDeclinerDTO$ButtonStates;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AttachField {
        public static final int $stable = 8;

        @NotNull
        private final ButtonStates buttonsStates;

        @NotNull
        private final List<String> formats;
        private final TextDTO label;

        @NotNull
        private final Map<String, String> lexemes;
        private final int maxSize;

        @NotNull
        private final String name;

        public AttachField(@NotNull String name, TextDTO textDTO, @NotNull List<String> formats, int i11, @NotNull Map<String, String> lexemes, @NotNull ButtonStates buttonsStates) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(formats, "formats");
            Intrinsics.checkNotNullParameter(lexemes, "lexemes");
            Intrinsics.checkNotNullParameter(buttonsStates, "buttonsStates");
            this.name = name;
            this.label = textDTO;
            this.formats = formats;
            this.maxSize = i11;
            this.lexemes = lexemes;
            this.buttonsStates = buttonsStates;
        }

        public static /* synthetic */ AttachField copy$default(AttachField attachField, String str, TextDTO textDTO, List list, int i11, Map map, ButtonStates buttonStates, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = attachField.name;
            }
            if ((i12 & 2) != 0) {
                textDTO = attachField.label;
            }
            if ((i12 & 4) != 0) {
                list = attachField.formats;
            }
            if ((i12 & 8) != 0) {
                i11 = attachField.maxSize;
            }
            if ((i12 & 16) != 0) {
                map = attachField.lexemes;
            }
            if ((i12 & 32) != 0) {
                buttonStates = attachField.buttonsStates;
            }
            Map map2 = map;
            ButtonStates buttonStates2 = buttonStates;
            return attachField.copy(str, textDTO, list, i11, map2, buttonStates2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getLabel() {
            return this.label;
        }

        @NotNull
        public final List<String> component3() {
            return this.formats;
        }

        /* renamed from: component4, reason: from getter */
        public final int getMaxSize() {
            return this.maxSize;
        }

        @NotNull
        public final Map<String, String> component5() {
            return this.lexemes;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final ButtonStates getButtonsStates() {
            return this.buttonsStates;
        }

        @NotNull
        public final AttachField copy(@NotNull String name, TextDTO label, @NotNull List<String> formats, int maxSize, @NotNull Map<String, String> lexemes, @NotNull ButtonStates buttonsStates) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(formats, "formats");
            Intrinsics.checkNotNullParameter(lexemes, "lexemes");
            Intrinsics.checkNotNullParameter(buttonsStates, "buttonsStates");
            return new AttachField(name, label, formats, maxSize, lexemes, buttonsStates);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AttachField)) {
                return false;
            }
            AttachField attachField = (AttachField) other;
            return Intrinsics.d(this.name, attachField.name) && Intrinsics.d(this.label, attachField.label) && Intrinsics.d(this.formats, attachField.formats) && this.maxSize == attachField.maxSize && Intrinsics.d(this.lexemes, attachField.lexemes) && Intrinsics.d(this.buttonsStates, attachField.buttonsStates);
        }

        @NotNull
        public final ButtonStates getButtonsStates() {
            return this.buttonsStates;
        }

        @NotNull
        public final List<String> getFormats() {
            return this.formats;
        }

        public final TextDTO getLabel() {
            return this.label;
        }

        @NotNull
        public final Map<String, String> getLexemes() {
            return this.lexemes;
        }

        public final int getMaxSize() {
            return this.maxSize;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            TextDTO textDTO = this.label;
            return this.buttonsStates.hashCode() + c.a(this.lexemes, C2454a.a(this.maxSize, g.b((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.formats), 31), 31);
        }

        @NotNull
        public String toString() {
            String str = this.name;
            TextDTO textDTO = this.label;
            List<String> list = this.formats;
            int i11 = this.maxSize;
            Map<String, String> map = this.lexemes;
            ButtonStates buttonStates = this.buttonsStates;
            StringBuilder b11 = a.b("AttachField(name=", textDTO, str, ", label=", ", formats=");
            b11.append(list);
            b11.append(", maxSize=");
            b11.append(i11);
            b11.append(", lexemes=");
            b11.append(map);
            b11.append(", buttonsStates=");
            b11.append(buttonStates);
            b11.append(")");
            return b11.toString();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/ReconciliationActsDeclinerDTO$ButtonStates;", "", "defaultState", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "successState", "errorState", "loadingState", "Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/ReconciliationActsDeclinerDTO$ColoredButton;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/ReconciliationActsDeclinerDTO$ColoredButton;)V", "getDefaultState", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getSuccessState", "getErrorState", "getLoadingState", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/ReconciliationActsDeclinerDTO$ColoredButton;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonStates {
        public static final int $stable = IconButtonV3DTO.$stable;

        @NotNull
        private final IconButtonV3DTO defaultState;

        @NotNull
        private final IconButtonV3DTO errorState;

        @NotNull
        private final ColoredButton loadingState;

        @NotNull
        private final IconButtonV3DTO successState;

        public ButtonStates(@NotNull IconButtonV3DTO defaultState, @NotNull IconButtonV3DTO successState, @NotNull IconButtonV3DTO errorState, @NotNull ColoredButton loadingState) {
            Intrinsics.checkNotNullParameter(defaultState, "defaultState");
            Intrinsics.checkNotNullParameter(successState, "successState");
            Intrinsics.checkNotNullParameter(errorState, "errorState");
            Intrinsics.checkNotNullParameter(loadingState, "loadingState");
            this.defaultState = defaultState;
            this.successState = successState;
            this.errorState = errorState;
            this.loadingState = loadingState;
        }

        public static /* synthetic */ ButtonStates copy$default(ButtonStates buttonStates, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, IconButtonV3DTO iconButtonV3DTO3, ColoredButton coloredButton, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iconButtonV3DTO = buttonStates.defaultState;
            }
            if ((i11 & 2) != 0) {
                iconButtonV3DTO2 = buttonStates.successState;
            }
            if ((i11 & 4) != 0) {
                iconButtonV3DTO3 = buttonStates.errorState;
            }
            if ((i11 & 8) != 0) {
                coloredButton = buttonStates.loadingState;
            }
            return buttonStates.copy(iconButtonV3DTO, iconButtonV3DTO2, iconButtonV3DTO3, coloredButton);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IconButtonV3DTO getDefaultState() {
            return this.defaultState;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final IconButtonV3DTO getSuccessState() {
            return this.successState;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final IconButtonV3DTO getErrorState() {
            return this.errorState;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final ColoredButton getLoadingState() {
            return this.loadingState;
        }

        @NotNull
        public final ButtonStates copy(@NotNull IconButtonV3DTO defaultState, @NotNull IconButtonV3DTO successState, @NotNull IconButtonV3DTO errorState, @NotNull ColoredButton loadingState) {
            Intrinsics.checkNotNullParameter(defaultState, "defaultState");
            Intrinsics.checkNotNullParameter(successState, "successState");
            Intrinsics.checkNotNullParameter(errorState, "errorState");
            Intrinsics.checkNotNullParameter(loadingState, "loadingState");
            return new ButtonStates(defaultState, successState, errorState, loadingState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonStates)) {
                return false;
            }
            ButtonStates buttonStates = (ButtonStates) other;
            return Intrinsics.d(this.defaultState, buttonStates.defaultState) && Intrinsics.d(this.successState, buttonStates.successState) && Intrinsics.d(this.errorState, buttonStates.errorState) && Intrinsics.d(this.loadingState, buttonStates.loadingState);
        }

        @NotNull
        public final IconButtonV3DTO getDefaultState() {
            return this.defaultState;
        }

        @NotNull
        public final IconButtonV3DTO getErrorState() {
            return this.errorState;
        }

        @NotNull
        public final ColoredButton getLoadingState() {
            return this.loadingState;
        }

        @NotNull
        public final IconButtonV3DTO getSuccessState() {
            return this.successState;
        }

        public int hashCode() {
            return this.loadingState.hashCode() + b.c(this.errorState, b.c(this.successState, this.defaultState.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return "ButtonStates(defaultState=" + this.defaultState + ", successState=" + this.successState + ", errorState=" + this.errorState + ", loadingState=" + this.loadingState + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/ReconciliationActsDeclinerDTO$ColoredButton;", "", "backgroundColor", "", "loaderColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getBackgroundColor", "()Ljava/lang/String;", "getLoaderColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ColoredButton {
        public static final int $stable = 0;

        @NotNull
        private final String backgroundColor;

        @NotNull
        private final String loaderColor;

        public ColoredButton(@NotNull String backgroundColor, @NotNull String loaderColor) {
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(loaderColor, "loaderColor");
            this.backgroundColor = backgroundColor;
            this.loaderColor = loaderColor;
        }

        public static /* synthetic */ ColoredButton copy$default(ColoredButton coloredButton, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = coloredButton.backgroundColor;
            }
            if ((i11 & 2) != 0) {
                str2 = coloredButton.loaderColor;
            }
            return coloredButton.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getLoaderColor() {
            return this.loaderColor;
        }

        @NotNull
        public final ColoredButton copy(@NotNull String backgroundColor, @NotNull String loaderColor) {
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            Intrinsics.checkNotNullParameter(loaderColor, "loaderColor");
            return new ColoredButton(backgroundColor, loaderColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ColoredButton)) {
                return false;
            }
            ColoredButton coloredButton = (ColoredButton) other;
            return Intrinsics.d(this.backgroundColor, coloredButton.backgroundColor) && Intrinsics.d(this.loaderColor, coloredButton.loaderColor);
        }

        @NotNull
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final String getLoaderColor() {
            return this.loaderColor;
        }

        public int hashCode() {
            return this.loaderColor.hashCode() + (this.backgroundColor.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("ColoredButton(backgroundColor=", this.backgroundColor, ", loaderColor=", this.loaderColor, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/reconciliationActsDecliner/data/ReconciliationActsDeclinerDTO$TextField;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", HammersV3BodyDTO.PLACEHOLDER, "errorRequiredText", "defaultValue", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPlaceholder", "getErrorRequiredText", "getDefaultValue", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextField {
        public static final int $stable = 0;
        private final String defaultValue;

        @NotNull
        private final String errorRequiredText;
        private final String name;

        @NotNull
        private final String placeholder;

        @NotNull
        private final TextDTO title;

        public TextField(String str, @NotNull TextDTO title, @NotNull String placeholder, @NotNull String errorRequiredText, String str2) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(errorRequiredText, "errorRequiredText");
            this.name = str;
            this.title = title;
            this.placeholder = placeholder;
            this.errorRequiredText = errorRequiredText;
            this.defaultValue = str2;
        }

        public static /* synthetic */ TextField copy$default(TextField textField, String str, TextDTO textDTO, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = textField.name;
            }
            if ((i11 & 2) != 0) {
                textDTO = textField.title;
            }
            if ((i11 & 4) != 0) {
                str2 = textField.placeholder;
            }
            if ((i11 & 8) != 0) {
                str3 = textField.errorRequiredText;
            }
            if ((i11 & 16) != 0) {
                str4 = textField.defaultValue;
            }
            String str5 = str4;
            String str6 = str2;
            return textField.copy(str, textDTO, str6, str3, str5);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getErrorRequiredText() {
            return this.errorRequiredText;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDefaultValue() {
            return this.defaultValue;
        }

        @NotNull
        public final TextField copy(String name, @NotNull TextDTO title, @NotNull String placeholder, @NotNull String errorRequiredText, String defaultValue) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(errorRequiredText, "errorRequiredText");
            return new TextField(name, title, placeholder, errorRequiredText, defaultValue);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextField)) {
                return false;
            }
            TextField textField = (TextField) other;
            return Intrinsics.d(this.name, textField.name) && Intrinsics.d(this.title, textField.title) && Intrinsics.d(this.placeholder, textField.placeholder) && Intrinsics.d(this.errorRequiredText, textField.errorRequiredText) && Intrinsics.d(this.defaultValue, textField.defaultValue);
        }

        public final String getDefaultValue() {
            return this.defaultValue;
        }

        @NotNull
        public final String getErrorRequiredText() {
            return this.errorRequiredText;
        }

        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.name;
            int a11 = g.a(g.a(Ns.b.a(this.title, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.placeholder), 31, this.errorRequiredText);
            String str2 = this.defaultValue;
            return a11 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.name;
            TextDTO textDTO = this.title;
            String str2 = this.placeholder;
            String str3 = this.errorRequiredText;
            String str4 = this.defaultValue;
            StringBuilder b11 = a.b("TextField(name=", textDTO, str, ", title=", ", placeholder=");
            Nh.a.h(b11, str2, ", errorRequiredText=", str3, ", defaultValue=");
            return o0.c(b11, str4, ")");
        }
    }

    public ReconciliationActsDeclinerDTO(@NotNull AttachField attachField, @NotNull List<TextField> textFields, @NotNull ButtonV3DTO submitButton, @NotNull TextDTO policyField) {
        Intrinsics.checkNotNullParameter(attachField, "attachField");
        Intrinsics.checkNotNullParameter(textFields, "textFields");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        Intrinsics.checkNotNullParameter(policyField, "policyField");
        this.attachField = attachField;
        this.textFields = textFields;
        this.submitButton = submitButton;
        this.policyField = policyField;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReconciliationActsDeclinerDTO copy$default(ReconciliationActsDeclinerDTO reconciliationActsDeclinerDTO, AttachField attachField, List list, ButtonV3DTO buttonV3DTO, TextDTO textDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            attachField = reconciliationActsDeclinerDTO.attachField;
        }
        if ((i11 & 2) != 0) {
            list = reconciliationActsDeclinerDTO.textFields;
        }
        if ((i11 & 4) != 0) {
            buttonV3DTO = reconciliationActsDeclinerDTO.submitButton;
        }
        if ((i11 & 8) != 0) {
            textDTO = reconciliationActsDeclinerDTO.policyField;
        }
        return reconciliationActsDeclinerDTO.copy(attachField, list, buttonV3DTO, textDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AttachField getAttachField() {
        return this.attachField;
    }

    @NotNull
    public final List<TextField> component2() {
        return this.textFields;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ButtonV3DTO getSubmitButton() {
        return this.submitButton;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TextDTO getPolicyField() {
        return this.policyField;
    }

    @NotNull
    public final ReconciliationActsDeclinerDTO copy(@NotNull AttachField attachField, @NotNull List<TextField> textFields, @NotNull ButtonV3DTO submitButton, @NotNull TextDTO policyField) {
        Intrinsics.checkNotNullParameter(attachField, "attachField");
        Intrinsics.checkNotNullParameter(textFields, "textFields");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        Intrinsics.checkNotNullParameter(policyField, "policyField");
        return new ReconciliationActsDeclinerDTO(attachField, textFields, submitButton, policyField);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReconciliationActsDeclinerDTO)) {
            return false;
        }
        ReconciliationActsDeclinerDTO reconciliationActsDeclinerDTO = (ReconciliationActsDeclinerDTO) other;
        return Intrinsics.d(this.attachField, reconciliationActsDeclinerDTO.attachField) && Intrinsics.d(this.textFields, reconciliationActsDeclinerDTO.textFields) && Intrinsics.d(this.submitButton, reconciliationActsDeclinerDTO.submitButton) && Intrinsics.d(this.policyField, reconciliationActsDeclinerDTO.policyField);
    }

    @NotNull
    public final AttachField getAttachField() {
        return this.attachField;
    }

    @NotNull
    public final TextDTO getPolicyField() {
        return this.policyField;
    }

    @NotNull
    public final ButtonV3DTO getSubmitButton() {
        return this.submitButton;
    }

    @NotNull
    public final List<TextField> getTextFields() {
        return this.textFields;
    }

    public int hashCode() {
        return this.policyField.hashCode() + C2859b.c(this.submitButton, g.b(this.attachField.hashCode() * 31, 31, this.textFields), 31);
    }

    @NotNull
    public String toString() {
        return "ReconciliationActsDeclinerDTO(attachField=" + this.attachField + ", textFields=" + this.textFields + ", submitButton=" + this.submitButton + ", policyField=" + this.policyField + ")";
    }
}
