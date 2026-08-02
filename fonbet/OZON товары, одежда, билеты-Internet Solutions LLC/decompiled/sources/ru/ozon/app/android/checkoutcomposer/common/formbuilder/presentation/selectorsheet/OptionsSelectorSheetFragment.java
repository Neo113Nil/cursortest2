package ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.selectorsheet;

import FK.a;
import G.g;
import N3.C3660k;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.bottomsheet.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO;
import ru.ozon.app.android.map.databinding.FragmentOptionsSelectorSheetBinding;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.view.dialog.OzonBottomSheetDialog;
import ru.ozon.app.android.uikit.view.recycler.decoration.CustomDividerDecoration;
import ru.ozon.app.android.utils.KeyboardUtilsKt;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 (2\u00020\u0001:\u0002()B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u0003R\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/selectorsheet/OptionsSelectorSheetFragment;", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SelectorField$SelectOptions$Option;", "selectedOption", "", "handleOnOptionSelected", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SelectorField$SelectOptions$Option;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lru/ozon/app/android/uikit/view/dialog/OzonBottomSheetDialog;", "onCreateDialog", "(Landroid/os/Bundle;)Lru/ozon/app/android/uikit/view/dialog/OzonBottomSheetDialog;", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/selectorsheet/OptionsSelectorSheetFragment$Config;", "config", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/selectorsheet/OptionsSelectorSheetFragment$Config;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/selectorsheet/SelectorOptionsAdapter;", "adapter", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/selectorsheet/SelectorOptionsAdapter;", "Lru/ozon/app/android/map/databinding/FragmentOptionsSelectorSheetBinding;", "binding", "Lru/ozon/app/android/map/databinding/FragmentOptionsSelectorSheetBinding;", "Companion", "Config", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OptionsSelectorSheetFragment extends b {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final SelectorOptionsAdapter adapter = new SelectorOptionsAdapter(new OptionsSelectorSheetFragment$adapter$1(this));
    private FragmentOptionsSelectorSheetBinding binding;
    private Config config;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/selectorsheet/OptionsSelectorSheetFragment$Companion;", "", "<init>", "()V", "REQUEST_CODE_FIELD_OPTION_SELECTED", "", "EXTRA_OPTION_SELECTOR_CONFIG", "", "newInstance", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/selectorsheet/OptionsSelectorSheetFragment;", "config", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/selectorsheet/OptionsSelectorSheetFragment$Config;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OptionsSelectorSheetFragment newInstance(@NotNull Config config) {
            Intrinsics.checkNotNullParameter(config, "config");
            OptionsSelectorSheetFragment optionsSelectorSheetFragment = new OptionsSelectorSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARG_CONFIG", config);
            optionsSelectorSheetFragment.setArguments(bundle);
            return optionsSelectorSheetFragment;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleOnOptionSelected(FormBuilderBlockVO.Field.SelectorField.SelectOptions.Option selectedOption) {
        ComponentCallbacksC5392m targetFragment = getTargetFragment();
        if (targetFragment != null) {
            int targetRequestCode = getTargetRequestCode();
            Intent intent = new Intent();
            Config config = this.config;
            if (config == null) {
                Intrinsics.n("config");
                throw null;
            }
            intent.putExtra("EXTRA_OPTION_SELECTOR_CONFIG", Config.copy$default(config, null, null, selectedOption.getValue(), null, selectedOption, 11, null));
            Unit unit = Unit.f71690a;
            targetFragment.onActivityResult(targetRequestCode, -1, intent);
        }
        dismiss();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        Config config = arguments != null ? (Config) arguments.getParcelable("ARG_CONFIG") : null;
        if (config == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.config = config;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentOptionsSelectorSheetBinding inflate = FragmentOptionsSelectorSheetBinding.inflate(inflater, null, false);
        this.binding = inflate;
        if (inflate != null) {
            return inflate.getConstraintLayout();
        }
        return null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        KeyboardUtilsKt.hideKeyboard(this);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentOptionsSelectorSheetBinding fragmentOptionsSelectorSheetBinding = this.binding;
        if (fragmentOptionsSelectorSheetBinding != null) {
            TextView textView = fragmentOptionsSelectorSheetBinding.titleTv;
            Config config = this.config;
            if (config == null) {
                Intrinsics.n("config");
                throw null;
            }
            textView.setText(config.getSelectOptions().getTitle());
            fragmentOptionsSelectorSheetBinding.optionsRv.setAdapter(this.adapter);
            RecyclerView recyclerView = fragmentOptionsSelectorSheetBinding.optionsRv;
            final Context requireContext = requireContext();
            recyclerView.addItemDecoration(new CustomDividerDecoration(requireContext) { // from class: ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.selectorsheet.OptionsSelectorSheetFragment$onViewCreated$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(requireContext, 1, 0, true, 4, null);
                    Intrinsics.f(requireContext);
                }

                @Override // ru.ozon.app.android.uikit.view.recycler.decoration.CustomDividerDecoration
                public boolean drawFor(RecyclerView parent, View child) {
                    Intrinsics.checkNotNullParameter(parent, "parent");
                    Intrinsics.checkNotNullParameter(child, "child");
                    int childAdapterPosition = parent.getChildAdapterPosition(child);
                    RecyclerView.g adapter = parent.getAdapter();
                    return childAdapterPosition != (adapter != null ? adapter.getCardsCount() - 1 : 0);
                }
            });
            fragmentOptionsSelectorSheetBinding.closeIv.setOnClickListener(new a(this, 14));
            SelectorOptionsAdapter selectorOptionsAdapter = this.adapter;
            Config config2 = this.config;
            if (config2 == null) {
                Intrinsics.n("config");
                throw null;
            }
            List<FormBuilderBlockVO.Field.SelectorField.SelectOptions.Option> options = config2.getSelectOptions().getOptions();
            Config config3 = this.config;
            if (config3 != null) {
                selectorOptionsAdapter.submitList(options, config3.getValue());
            } else {
                Intrinsics.n("config");
                throw null;
            }
        }
    }

    @Override // com.google.android.material.bottomsheet.b, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public OzonBottomSheetDialog onCreateDialog(Bundle savedInstanceState) {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return new OzonBottomSheetDialog(requireContext, 0, 0, true, null, true, true, false, null, false, 918, null);
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014JD\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0014J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\"\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/selectorsheet/OptionsSelectorSheetFragment$Config;", "Landroid/os/Parcelable;", "", "fieldName", SelectionItemFormDTO.TITLE_FIELD_NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SelectorField$SelectOptions;", "selectOptions", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SelectorField$SelectOptions$Option;", "selectedOption", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SelectorField$SelectOptions;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SelectorField$SelectOptions$Option;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SelectorField$SelectOptions;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SelectorField$SelectOptions$Option;)Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/selectorsheet/OptionsSelectorSheetFragment$Config;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFieldName", "getTitle", "getValue", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SelectorField$SelectOptions;", "getSelectOptions", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SelectorField$SelectOptions;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SelectorField$SelectOptions$Option;", "getSelectedOption", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SelectorField$SelectOptions$Option;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Config implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Config> CREATOR = new Creator();

        @NotNull
        private final String fieldName;

        @NotNull
        private final FormBuilderBlockVO.Field.SelectorField.SelectOptions selectOptions;
        private final FormBuilderBlockVO.Field.SelectorField.SelectOptions.Option selectedOption;

        @NotNull
        private final String title;

        @NotNull
        private final String value;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Config> {
            @Override // android.os.Parcelable.Creator
            public final Config createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Config(parcel.readString(), parcel.readString(), parcel.readString(), FormBuilderBlockVO.Field.SelectorField.SelectOptions.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FormBuilderBlockVO.Field.SelectorField.SelectOptions.Option.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Config[] newArray(int i11) {
                return new Config[i11];
            }
        }

        public Config(@NotNull String fieldName, @NotNull String title, @NotNull String value, @NotNull FormBuilderBlockVO.Field.SelectorField.SelectOptions selectOptions, FormBuilderBlockVO.Field.SelectorField.SelectOptions.Option option) {
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(selectOptions, "selectOptions");
            this.fieldName = fieldName;
            this.title = title;
            this.value = value;
            this.selectOptions = selectOptions;
            this.selectedOption = option;
        }

        public static /* synthetic */ Config copy$default(Config config, String str, String str2, String str3, FormBuilderBlockVO.Field.SelectorField.SelectOptions selectOptions, FormBuilderBlockVO.Field.SelectorField.SelectOptions.Option option, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = config.fieldName;
            }
            if ((i11 & 2) != 0) {
                str2 = config.title;
            }
            if ((i11 & 4) != 0) {
                str3 = config.value;
            }
            if ((i11 & 8) != 0) {
                selectOptions = config.selectOptions;
            }
            if ((i11 & 16) != 0) {
                option = config.selectedOption;
            }
            FormBuilderBlockVO.Field.SelectorField.SelectOptions.Option option2 = option;
            String str4 = str3;
            return config.copy(str, str2, str4, selectOptions, option2);
        }

        @NotNull
        public final Config copy(@NotNull String fieldName, @NotNull String title, @NotNull String value, @NotNull FormBuilderBlockVO.Field.SelectorField.SelectOptions selectOptions, FormBuilderBlockVO.Field.SelectorField.SelectOptions.Option selectedOption) {
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(selectOptions, "selectOptions");
            return new Config(fieldName, title, value, selectOptions, selectedOption);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return Intrinsics.d(this.fieldName, config.fieldName) && Intrinsics.d(this.title, config.title) && Intrinsics.d(this.value, config.value) && Intrinsics.d(this.selectOptions, config.selectOptions) && Intrinsics.d(this.selectedOption, config.selectedOption);
        }

        @NotNull
        public final String getFieldName() {
            return this.fieldName;
        }

        @NotNull
        public final FormBuilderBlockVO.Field.SelectorField.SelectOptions getSelectOptions() {
            return this.selectOptions;
        }

        public final FormBuilderBlockVO.Field.SelectorField.SelectOptions.Option getSelectedOption() {
            return this.selectedOption;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            int hashCode = (this.selectOptions.hashCode() + g.a(g.a(this.fieldName.hashCode() * 31, 31, this.title), 31, this.value)) * 31;
            FormBuilderBlockVO.Field.SelectorField.SelectOptions.Option option = this.selectedOption;
            return hashCode + (option == null ? 0 : option.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.fieldName;
            String str2 = this.title;
            String str3 = this.value;
            FormBuilderBlockVO.Field.SelectorField.SelectOptions selectOptions = this.selectOptions;
            FormBuilderBlockVO.Field.SelectorField.SelectOptions.Option option = this.selectedOption;
            StringBuilder d11 = C3660k.d("Config(fieldName=", str, ", title=", str2, ", value=");
            d11.append(str3);
            d11.append(", selectOptions=");
            d11.append(selectOptions);
            d11.append(", selectedOption=");
            d11.append(option);
            d11.append(")");
            return d11.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.fieldName);
            dest.writeString(this.title);
            dest.writeString(this.value);
            this.selectOptions.writeToParcel(dest, flags);
            FormBuilderBlockVO.Field.SelectorField.SelectOptions.Option option = this.selectedOption;
            if (option == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                option.writeToParcel(dest, flags);
            }
        }

        public /* synthetic */ Config(String str, String str2, String str3, FormBuilderBlockVO.Field.SelectorField.SelectOptions selectOptions, FormBuilderBlockVO.Field.SelectorField.SelectOptions.Option option, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, selectOptions, (i11 & 16) != 0 ? null : option);
        }
    }
}
