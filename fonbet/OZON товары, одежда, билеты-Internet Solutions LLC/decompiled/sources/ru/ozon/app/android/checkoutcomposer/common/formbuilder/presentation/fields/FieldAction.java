package ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.fields;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/FieldAction;", "", "<init>", "()V", "Click", "TextChanged", "ChipSelected", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/FieldAction$ChipSelected;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/FieldAction$Click;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/FieldAction$TextChanged;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class FieldAction {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/FieldAction$ChipSelected;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/FieldAction;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field;", "field", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ChipsField$ChipsWithField;", "chipsWithField", "<init>", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ChipsField$ChipsWithField;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field;", "getField", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ChipsField$ChipsWithField;", "getChipsWithField", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$ChipsField$ChipsWithField;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChipSelected extends FieldAction {

        @NotNull
        private final FormBuilderBlockVO.Field.ChipsField.ChipsWithField chipsWithField;

        @NotNull
        private final FormBuilderBlockVO.Field field;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChipSelected(@NotNull FormBuilderBlockVO.Field field, @NotNull FormBuilderBlockVO.Field.ChipsField.ChipsWithField chipsWithField) {
            super(null);
            Intrinsics.checkNotNullParameter(field, "field");
            Intrinsics.checkNotNullParameter(chipsWithField, "chipsWithField");
            this.field = field;
            this.chipsWithField = chipsWithField;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChipSelected)) {
                return false;
            }
            ChipSelected chipSelected = (ChipSelected) other;
            return Intrinsics.d(this.field, chipSelected.field) && Intrinsics.d(this.chipsWithField, chipSelected.chipsWithField);
        }

        @NotNull
        public final FormBuilderBlockVO.Field.ChipsField.ChipsWithField getChipsWithField() {
            return this.chipsWithField;
        }

        @NotNull
        public FormBuilderBlockVO.Field getField() {
            return this.field;
        }

        public int hashCode() {
            return this.chipsWithField.hashCode() + (this.field.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "ChipSelected(field=" + this.field + ", chipsWithField=" + this.chipsWithField + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/FieldAction$Click;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/FieldAction;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field;", "field", "<init>", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field;", "getField", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Click extends FieldAction {

        @NotNull
        private final FormBuilderBlockVO.Field field;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Click(@NotNull FormBuilderBlockVO.Field field) {
            super(null);
            Intrinsics.checkNotNullParameter(field, "field");
            this.field = field;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Click) && Intrinsics.d(this.field, ((Click) other).field);
        }

        @NotNull
        public FormBuilderBlockVO.Field getField() {
            return this.field;
        }

        public int hashCode() {
            return this.field.hashCode();
        }

        @NotNull
        public String toString() {
            return "Click(field=" + this.field + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\t¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/FieldAction$TextChanged;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/FieldAction;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field;", "field", "", "text", "<init>", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field;", "getField", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field;", "Ljava/lang/String;", "getText", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextChanged extends FieldAction {

        @NotNull
        private final FormBuilderBlockVO.Field field;

        @NotNull
        private final String text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TextChanged(@NotNull FormBuilderBlockVO.Field field, @NotNull String text) {
            super(null);
            Intrinsics.checkNotNullParameter(field, "field");
            Intrinsics.checkNotNullParameter(text, "text");
            this.field = field;
            this.text = text;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextChanged)) {
                return false;
            }
            TextChanged textChanged = (TextChanged) other;
            return Intrinsics.d(this.field, textChanged.field) && Intrinsics.d(this.text, textChanged.text);
        }

        @NotNull
        public FormBuilderBlockVO.Field getField() {
            return this.field;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode() + (this.field.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "TextChanged(field=" + this.field + ", text=" + this.text + ")";
        }
    }

    public /* synthetic */ FieldAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private FieldAction() {
    }
}
