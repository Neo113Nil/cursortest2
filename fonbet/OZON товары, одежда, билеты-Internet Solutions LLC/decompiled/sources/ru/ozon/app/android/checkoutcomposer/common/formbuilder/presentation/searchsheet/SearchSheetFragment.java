package ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet;

import G.g;
import N3.C3660k;
import Sc.InterfaceC4008j;
import Sc.k;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.m;
import com.google.android.material.textfield.TextInputEditText;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.atoms.utils.EditTextExtKt;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.adapter.SuggestionsAdapter;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.di.DaggerSearchSheetComponent;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.di.SearchSheetComponent;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.map.databinding.FragmentSearchSheetBinding;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.uikit.view.dialog.OzonBottomSheetDialog;
import ru.ozon.app.android.utils.KeyboardUtilsKt;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 >2\u00020\u0001:\u0002>?B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00142\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u0003R(\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\"\u0010.\u001a\u00020-8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00105\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006@"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SearchSheetFragment;", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "onDestroyView", "LPc/a;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SearchSheetViewModelImpl;", "pViewModel", "LPc/a;", "getPViewModel$suggestions_search_prodGoogleAllVendorsRelease", "()LPc/a;", "setPViewModel$suggestions_search_prodGoogleAllVendorsRelease", "(LPc/a;)V", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SearchSheetViewModel;", "viewModel$delegate", "LSc/j;", "getViewModel", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SearchSheetViewModel;", "viewModel", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/adapter/SuggestionsAdapter;", "suggestionsAdapter", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/adapter/SuggestionsAdapter;", "getSuggestionsAdapter", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/adapter/SuggestionsAdapter;", "setSuggestionsAdapter", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/adapter/SuggestionsAdapter;)V", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SearchSheetBinder;", "binder", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SearchSheetBinder;", "getBinder", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SearchSheetBinder;", "setBinder", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SearchSheetBinder;)V", "Lru/ozon/app/android/map/databinding/FragmentSearchSheetBinding;", "binding", "Lru/ozon/app/android/map/databinding/FragmentSearchSheetBinding;", "Companion", "Data", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SearchSheetFragment extends com.google.android.material.bottomsheet.b {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public SearchSheetBinder binder;
    private FragmentSearchSheetBinding binding;
    public Pc.a<SearchSheetViewModelImpl> pViewModel;
    public SuggestionsAdapter suggestionsAdapter;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModel = k.b(new SearchSheetFragment$viewModel$2(this));

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SearchSheetFragment$Companion;", "", "<init>", "()V", "REQUEST_CODE_FIELD_OPTION_SEARCH", "", "EXTRA_DATA", "", "DEF_SEARCH_LENGTH", "newInstance", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SearchSheetFragment;", "initialData", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SearchSheetFragment$Data;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SearchSheetFragment newInstance(@NotNull Data initialData) {
            Intrinsics.checkNotNullParameter(initialData, "initialData");
            SearchSheetFragment searchSheetFragment = new SearchSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARG_DATA", initialData);
            searchSheetFragment.setArguments(bundle);
            return searchSheetFragment;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015JR\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SearchSheetFragment$Data;", "Landroid/os/Parcelable;", "", "fieldName", "sheetTitle", "hint", "startQuery", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SearchField$SearchOptions;", "searchOptions", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SuggestVO;", "selectedSuggest", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SearchField$SearchOptions;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SuggestVO;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SearchField$SearchOptions;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SuggestVO;)Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SearchSheetFragment$Data;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFieldName", "getSheetTitle", "getHint", "getStartQuery", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SearchField$SearchOptions;", "getSearchOptions", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO$Field$SearchField$SearchOptions;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SuggestVO;", "getSelectedSuggest", "()Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SuggestVO;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Data implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Data> CREATOR = new Creator();

        @NotNull
        private final String fieldName;

        @NotNull
        private final String hint;

        @NotNull
        private final FormBuilderBlockVO.Field.SearchField.SearchOptions searchOptions;
        private final SuggestVO selectedSuggest;
        private final String sheetTitle;
        private final String startQuery;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Data> {
            @Override // android.os.Parcelable.Creator
            public final Data createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Data(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), FormBuilderBlockVO.Field.SearchField.SearchOptions.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuggestVO.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Data[] newArray(int i11) {
                return new Data[i11];
            }
        }

        public Data(@NotNull String fieldName, String str, @NotNull String hint, String str2, @NotNull FormBuilderBlockVO.Field.SearchField.SearchOptions searchOptions, SuggestVO suggestVO) {
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            Intrinsics.checkNotNullParameter(hint, "hint");
            Intrinsics.checkNotNullParameter(searchOptions, "searchOptions");
            this.fieldName = fieldName;
            this.sheetTitle = str;
            this.hint = hint;
            this.startQuery = str2;
            this.searchOptions = searchOptions;
            this.selectedSuggest = suggestVO;
        }

        public static /* synthetic */ Data copy$default(Data data, String str, String str2, String str3, String str4, FormBuilderBlockVO.Field.SearchField.SearchOptions searchOptions, SuggestVO suggestVO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = data.fieldName;
            }
            if ((i11 & 2) != 0) {
                str2 = data.sheetTitle;
            }
            if ((i11 & 4) != 0) {
                str3 = data.hint;
            }
            if ((i11 & 8) != 0) {
                str4 = data.startQuery;
            }
            if ((i11 & 16) != 0) {
                searchOptions = data.searchOptions;
            }
            if ((i11 & 32) != 0) {
                suggestVO = data.selectedSuggest;
            }
            FormBuilderBlockVO.Field.SearchField.SearchOptions searchOptions2 = searchOptions;
            SuggestVO suggestVO2 = suggestVO;
            return data.copy(str, str2, str3, str4, searchOptions2, suggestVO2);
        }

        @NotNull
        public final Data copy(@NotNull String fieldName, String sheetTitle, @NotNull String hint, String startQuery, @NotNull FormBuilderBlockVO.Field.SearchField.SearchOptions searchOptions, SuggestVO selectedSuggest) {
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            Intrinsics.checkNotNullParameter(hint, "hint");
            Intrinsics.checkNotNullParameter(searchOptions, "searchOptions");
            return new Data(fieldName, sheetTitle, hint, startQuery, searchOptions, selectedSuggest);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return Intrinsics.d(this.fieldName, data.fieldName) && Intrinsics.d(this.sheetTitle, data.sheetTitle) && Intrinsics.d(this.hint, data.hint) && Intrinsics.d(this.startQuery, data.startQuery) && Intrinsics.d(this.searchOptions, data.searchOptions) && Intrinsics.d(this.selectedSuggest, data.selectedSuggest);
        }

        @NotNull
        public final String getHint() {
            return this.hint;
        }

        @NotNull
        public final FormBuilderBlockVO.Field.SearchField.SearchOptions getSearchOptions() {
            return this.searchOptions;
        }

        public final SuggestVO getSelectedSuggest() {
            return this.selectedSuggest;
        }

        public final String getSheetTitle() {
            return this.sheetTitle;
        }

        public final String getStartQuery() {
            return this.startQuery;
        }

        public int hashCode() {
            int hashCode = this.fieldName.hashCode() * 31;
            String str = this.sheetTitle;
            int a11 = g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.hint);
            String str2 = this.startQuery;
            int hashCode2 = (this.searchOptions.hashCode() + ((a11 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            SuggestVO suggestVO = this.selectedSuggest;
            return hashCode2 + (suggestVO != null ? suggestVO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.fieldName;
            String str2 = this.sheetTitle;
            String str3 = this.hint;
            String str4 = this.startQuery;
            FormBuilderBlockVO.Field.SearchField.SearchOptions searchOptions = this.searchOptions;
            SuggestVO suggestVO = this.selectedSuggest;
            StringBuilder d11 = C3660k.d("Data(fieldName=", str, ", sheetTitle=", str2, ", hint=");
            Nh.a.h(d11, str3, ", startQuery=", str4, ", searchOptions=");
            d11.append(searchOptions);
            d11.append(", selectedSuggest=");
            d11.append(suggestVO);
            d11.append(")");
            return d11.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.fieldName);
            dest.writeString(this.sheetTitle);
            dest.writeString(this.hint);
            dest.writeString(this.startQuery);
            this.searchOptions.writeToParcel(dest, flags);
            SuggestVO suggestVO = this.selectedSuggest;
            if (suggestVO == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                suggestVO.writeToParcel(dest, flags);
            }
        }
    }

    private final SearchSheetViewModel getViewModel() {
        Object value = this.viewModel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (SearchSheetViewModel) value;
    }

    @NotNull
    public final SearchSheetBinder getBinder() {
        SearchSheetBinder searchSheetBinder = this.binder;
        if (searchSheetBinder != null) {
            return searchSheetBinder;
        }
        Intrinsics.n("binder");
        throw null;
    }

    @NotNull
    public final Pc.a<SearchSheetViewModelImpl> getPViewModel$suggestions_search_prodGoogleAllVendorsRelease() {
        Pc.a<SearchSheetViewModelImpl> aVar = this.pViewModel;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("pViewModel");
        throw null;
    }

    @NotNull
    public final SuggestionsAdapter getSuggestionsAdapter() {
        SuggestionsAdapter suggestionsAdapter = this.suggestionsAdapter;
        if (suggestionsAdapter != null) {
            return suggestionsAdapter;
        }
        Intrinsics.n("suggestionsAdapter");
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SearchSheetComponent.Factory factory = DaggerSearchSheetComponent.factory();
        C6740b dependencyStorage = C6739a.b(this, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) dependencyStorage.b(NetworkComponentApi.class);
        C6740b dependencyStorage2 = C6739a.b(this, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        NavigationComponentApi navigationComponentApi = (NavigationComponentApi) dependencyStorage2.b(NavigationComponentApi.class);
        C6740b dependencyStorage3 = C6739a.b(this, ComposerComponentApi.class).getDependencyStorage();
        if (ComposerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerComponentApi is not DiComponent");
        }
        ComposerComponentApi composerComponentApi = (ComposerComponentApi) dependencyStorage3.b(ComposerComponentApi.class);
        C6740b dependencyStorage4 = C6739a.b(this, ActionComponentApi.class).getDependencyStorage();
        if (ActionComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ActionComponentApi is not DiComponent");
        }
        ActionComponentApi actionComponentApi = (ActionComponentApi) dependencyStorage4.b(ActionComponentApi.class);
        C6740b dependencyStorage5 = C6739a.b(this, ContextComponentDependencies.class).getDependencyStorage();
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        factory.create(networkComponentApi, navigationComponentApi, composerComponentApi, actionComponentApi, (ContextComponentDependencies) dependencyStorage5.b(ContextComponentDependencies.class)).inject(this);
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setBinder(new SearchSheetBinder(this, getViewModel()));
        SearchSheetViewModel viewModel = getViewModel();
        Bundle arguments = getArguments();
        Data data = arguments != null ? (Data) arguments.getParcelable("ARG_DATA") : null;
        if (data == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        viewModel.bindInitial(data);
    }

    @Override // com.google.android.material.bottomsheet.b, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return new OzonBottomSheetDialog(requireContext, 0, 0, true, null, true, false, false, null, false, 982, null);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentSearchSheetBinding inflate = FragmentSearchSheetBinding.inflate(inflater, null, false);
        this.binding = inflate;
        if (inflate != null) {
            return inflate.root;
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
        KeyboardUtilsKt.hideKeyboard(this);
        super.onDismiss(dialog);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentSearchSheetBinding fragmentSearchSheetBinding = this.binding;
        if (fragmentSearchSheetBinding != null) {
            getBinder().setView(new SearchSheetView(fragmentSearchSheetBinding, getSuggestionsAdapter(), m.e.DEFAULT_SWIPE_ANIMATION_DURATION));
            TextInputEditText fieldEt = fragmentSearchSheetBinding.fieldEt;
            Intrinsics.checkNotNullExpressionValue(fieldEt, "fieldEt");
            EditTextExtKt.setupBackgroundForSelect(fieldEt);
        }
    }

    public final void setBinder(@NotNull SearchSheetBinder searchSheetBinder) {
        Intrinsics.checkNotNullParameter(searchSheetBinder, "<set-?>");
        this.binder = searchSheetBinder;
    }
}
