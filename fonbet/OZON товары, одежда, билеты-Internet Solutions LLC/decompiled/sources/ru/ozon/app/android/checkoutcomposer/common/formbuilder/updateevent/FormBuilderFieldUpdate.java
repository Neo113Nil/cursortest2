package ru.ozon.app.android.checkoutcomposer.common.formbuilder.updateevent;

import A00.a;
import C.o0;
import G.g;
import N3.C3660k;
import V.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/updateevent/FormBuilderFieldUpdate;", "LA00/a$J$a;", "<init>", "()V", "", "getFieldName", "()Ljava/lang/String;", "fieldName", "FormBuilderSelectorFieldUpdate", "FormBuilderTextFieldUpdate", "FormBuilderYandexSearchFieldUpdate", "FormBuilderChipsFieldUpdate", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/updateevent/FormBuilderFieldUpdate$FormBuilderChipsFieldUpdate;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/updateevent/FormBuilderFieldUpdate$FormBuilderSelectorFieldUpdate;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/updateevent/FormBuilderFieldUpdate$FormBuilderTextFieldUpdate;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/updateevent/FormBuilderFieldUpdate$FormBuilderYandexSearchFieldUpdate;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class FormBuilderFieldUpdate implements a.J.InterfaceC0007a {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/updateevent/FormBuilderFieldUpdate$FormBuilderChipsFieldUpdate;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/updateevent/FormBuilderFieldUpdate;", "", "fieldName", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ChipsField$ChipsWithField;", "chipsWithField", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ChipsField$ChipsWithField;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFieldName", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ChipsField$ChipsWithField;", "getChipsWithField", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ChipsField$ChipsWithField;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FormBuilderChipsFieldUpdate extends FormBuilderFieldUpdate {

        @NotNull
        private final FormBuilderBlockVO.Field.ChipsField.ChipsWithField chipsWithField;

        @NotNull
        private final String fieldName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FormBuilderChipsFieldUpdate(@NotNull String fieldName, @NotNull FormBuilderBlockVO.Field.ChipsField.ChipsWithField chipsWithField) {
            super(null);
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            Intrinsics.checkNotNullParameter(chipsWithField, "chipsWithField");
            this.fieldName = fieldName;
            this.chipsWithField = chipsWithField;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FormBuilderChipsFieldUpdate)) {
                return false;
            }
            FormBuilderChipsFieldUpdate formBuilderChipsFieldUpdate = (FormBuilderChipsFieldUpdate) other;
            return Intrinsics.d(this.fieldName, formBuilderChipsFieldUpdate.fieldName) && Intrinsics.d(this.chipsWithField, formBuilderChipsFieldUpdate.chipsWithField);
        }

        @NotNull
        public final FormBuilderBlockVO.Field.ChipsField.ChipsWithField getChipsWithField() {
            return this.chipsWithField;
        }

        @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.updateevent.FormBuilderFieldUpdate
        @NotNull
        public String getFieldName() {
            return this.fieldName;
        }

        public int hashCode() {
            return this.chipsWithField.hashCode() + (this.fieldName.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "FormBuilderChipsFieldUpdate(fieldName=" + this.fieldName + ", chipsWithField=" + this.chipsWithField + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/updateevent/FormBuilderFieldUpdate$FormBuilderSelectorFieldUpdate;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/updateevent/FormBuilderFieldUpdate;", "", "fieldName", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SelectorField$SelectOptions$Option;", "selectedOption", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SelectorField$SelectOptions$Option;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFieldName", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SelectorField$SelectOptions$Option;", "getSelectedOption", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SelectorField$SelectOptions$Option;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FormBuilderSelectorFieldUpdate extends FormBuilderFieldUpdate {

        @NotNull
        private final String fieldName;
        private final FormBuilderBlockVO.Field.SelectorField.SelectOptions.Option selectedOption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FormBuilderSelectorFieldUpdate(@NotNull String fieldName, FormBuilderBlockVO.Field.SelectorField.SelectOptions.Option option) {
            super(null);
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            this.fieldName = fieldName;
            this.selectedOption = option;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FormBuilderSelectorFieldUpdate)) {
                return false;
            }
            FormBuilderSelectorFieldUpdate formBuilderSelectorFieldUpdate = (FormBuilderSelectorFieldUpdate) other;
            return Intrinsics.d(this.fieldName, formBuilderSelectorFieldUpdate.fieldName) && Intrinsics.d(this.selectedOption, formBuilderSelectorFieldUpdate.selectedOption);
        }

        @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.updateevent.FormBuilderFieldUpdate
        @NotNull
        public String getFieldName() {
            return this.fieldName;
        }

        public final FormBuilderBlockVO.Field.SelectorField.SelectOptions.Option getSelectedOption() {
            return this.selectedOption;
        }

        public int hashCode() {
            int hashCode = this.fieldName.hashCode() * 31;
            FormBuilderBlockVO.Field.SelectorField.SelectOptions.Option option = this.selectedOption;
            return hashCode + (option == null ? 0 : option.hashCode());
        }

        @NotNull
        public String toString() {
            return "FormBuilderSelectorFieldUpdate(fieldName=" + this.fieldName + ", selectedOption=" + this.selectedOption + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/updateevent/FormBuilderFieldUpdate$FormBuilderTextFieldUpdate;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/updateevent/FormBuilderFieldUpdate;", "", "fieldName", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFieldName", "getText", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FormBuilderTextFieldUpdate extends FormBuilderFieldUpdate {

        @NotNull
        private final String fieldName;

        @NotNull
        private final String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FormBuilderTextFieldUpdate(@NotNull String fieldName, @NotNull String text) {
            super(null);
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            Intrinsics.checkNotNullParameter(text, "text");
            this.fieldName = fieldName;
            this.text = text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FormBuilderTextFieldUpdate)) {
                return false;
            }
            FormBuilderTextFieldUpdate formBuilderTextFieldUpdate = (FormBuilderTextFieldUpdate) other;
            return Intrinsics.d(this.fieldName, formBuilderTextFieldUpdate.fieldName) && Intrinsics.d(this.text, formBuilderTextFieldUpdate.text);
        }

        @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.updateevent.FormBuilderFieldUpdate
        @NotNull
        public String getFieldName() {
            return this.fieldName;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode() + (this.fieldName.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("FormBuilderTextFieldUpdate(fieldName=", this.fieldName, ", text=", this.text, ")");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/updateevent/FormBuilderFieldUpdate$FormBuilderYandexSearchFieldUpdate;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/updateevent/FormBuilderFieldUpdate;", "", "fieldName", "text", "updateLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFieldName", "getText", "getUpdateLink", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FormBuilderYandexSearchFieldUpdate extends FormBuilderFieldUpdate {

        @NotNull
        private final String fieldName;

        @NotNull
        private final String text;

        @NotNull
        private final String updateLink;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FormBuilderYandexSearchFieldUpdate(@NotNull String fieldName, @NotNull String text, @NotNull String updateLink) {
            super(null);
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(updateLink, "updateLink");
            this.fieldName = fieldName;
            this.text = text;
            this.updateLink = updateLink;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FormBuilderYandexSearchFieldUpdate)) {
                return false;
            }
            FormBuilderYandexSearchFieldUpdate formBuilderYandexSearchFieldUpdate = (FormBuilderYandexSearchFieldUpdate) other;
            return Intrinsics.d(this.fieldName, formBuilderYandexSearchFieldUpdate.fieldName) && Intrinsics.d(this.text, formBuilderYandexSearchFieldUpdate.text) && Intrinsics.d(this.updateLink, formBuilderYandexSearchFieldUpdate.updateLink);
        }

        @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.updateevent.FormBuilderFieldUpdate
        @NotNull
        public String getFieldName() {
            return this.fieldName;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final String getUpdateLink() {
            return this.updateLink;
        }

        public int hashCode() {
            return this.updateLink.hashCode() + g.a(this.fieldName.hashCode() * 31, 31, this.text);
        }

        @NotNull
        public String toString() {
            String str = this.fieldName;
            String str2 = this.text;
            return o0.c(C3660k.d("FormBuilderYandexSearchFieldUpdate(fieldName=", str, ", text=", str2, ", updateLink="), this.updateLink, ")");
        }
    }

    public /* synthetic */ FormBuilderFieldUpdate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract String getFieldName();

    private FormBuilderFieldUpdate() {
    }
}
