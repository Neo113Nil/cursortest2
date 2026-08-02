package ru.ozon.app.android.datePicker;

import Ez.ViewOnClickListenerC2978b;
import Ez.ViewOnClickListenerC2979c;
import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.d;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import java.io.Serializable;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import ru.ozon.app.android.datePicker.databinding.DatePickerLayoutBinding;
import ru.ozon.app.android.datePicker.di.DatePickerDialogFragmentComponent;
import ru.ozon.app.android.uikit.view.date.OzonDatePicker;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 +2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0003R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR(\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001d\u0010'\u001a\u0004\u0018\u00010\u001c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lru/ozon/app/android/datePicker/DatePickerDialogFragment;", "Landroidx/fragment/app/k;", "<init>", "()V", "", "initDatePicker", "initClicks", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lru/ozon/app/android/datePicker/databinding/DatePickerLayoutBinding;", "mBinding", "Lru/ozon/app/android/datePicker/databinding/DatePickerLayoutBinding;", "LPc/a;", "Lru/ozon/app/android/datePicker/DatePickerViewModel;", "pViewModel", "LPc/a;", "getPViewModel", "()LPc/a;", "setPViewModel", "(LPc/a;)V", "viewModel$delegate", "LSc/j;", "getViewModel", "()Lru/ozon/app/android/datePicker/DatePickerViewModel;", "viewModel", "getBinding", "()Lru/ozon/app/android/datePicker/databinding/DatePickerLayoutBinding;", "binding", "Companion", "date-picker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DatePickerDialogFragment extends DialogInterfaceOnCancelListenerC5390k {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private DatePickerLayoutBinding mBinding;
    public a<DatePickerViewModel> pViewModel;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModel = k.b(new DatePickerDialogFragment$viewModel$2(this));

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/datePicker/DatePickerDialogFragment$Companion;", "", "<init>", "()V", "MIN_DAY", "", "MIN_MONTH", "MIN_YEAR", "DATE_ARG", "", "newInstance", "Lru/ozon/app/android/datePicker/DatePickerDialogFragment;", "date", "Lorg/joda/time/LocalDate;", "date-picker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DatePickerDialogFragment newInstance(@NotNull LocalDate date) {
            Intrinsics.checkNotNullParameter(date, "date");
            DatePickerDialogFragment datePickerDialogFragment = new DatePickerDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("DATE_ARG", date);
            datePickerDialogFragment.setArguments(bundle);
            return datePickerDialogFragment;
        }

        private Companion() {
        }
    }

    private final DatePickerLayoutBinding getBinding() {
        DatePickerLayoutBinding datePickerLayoutBinding = this.mBinding;
        Intrinsics.f(datePickerLayoutBinding);
        return datePickerLayoutBinding;
    }

    private final void initClicks() {
        getBinding().okBtn.setOnClickListener(new ViewOnClickListenerC2978b(this, 15));
        getBinding().cancelBtn.setOnClickListener(new ViewOnClickListenerC2979c(this, 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initClicks$lambda$4(DatePickerDialogFragment datePickerDialogFragment, View view) {
        LocalDate localDate = new LocalDate(datePickerDialogFragment.getBinding().datePicker.getYear(), datePickerDialogFragment.getBinding().datePicker.getMonth() + 1, datePickerDialogFragment.getBinding().datePicker.getDayOfMonth());
        DatePickerViewModel viewModel = datePickerDialogFragment.getViewModel();
        if (viewModel != null) {
            viewModel.submitDate(localDate);
        }
        datePickerDialogFragment.getParentFragmentManager().m1(d.b(new Pair("DATE_ARG", localDate)), "DATE_ARG");
        datePickerDialogFragment.dismiss();
    }

    private final void initDatePicker() {
        OzonDatePicker ozonDatePicker = getBinding().datePicker;
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("DATE_ARG") : null;
        LocalDate localDate = serializable instanceof LocalDate ? (LocalDate) serializable : null;
        if (localDate == null) {
            localDate = DatePickerMapper.INSTANCE.getDefaultDate();
        }
        ozonDatePicker.updateDate(localDate.s(), localDate.n() - 1, localDate.i());
        Calendar calendar = Calendar.getInstance();
        calendar.set(5, 1);
        calendar.set(2, 0);
        calendar.set(1, 1900);
        ozonDatePicker.setMinDate(calendar.getTimeInMillis());
    }

    @NotNull
    public final a<DatePickerViewModel> getPViewModel() {
        a<DatePickerViewModel> aVar = this.pViewModel;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("pViewModel");
        throw null;
    }

    public final DatePickerViewModel getViewModel() {
        return (DatePickerViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (DatePickerDialogFragmentComponent.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component DatePickerDialogFragmentComponent is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, DatePickerDialogFragmentComponent.class).getDependencyStorage();
        if (DatePickerDialogFragmentComponent.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component DatePickerDialogFragmentComponent is not DiComponent");
        }
        InterfaceC6958a b11 = dependencyStorage.b(DatePickerDialogFragmentComponent.class);
        DatePickerDialogFragmentComponent datePickerDialogFragmentComponent = b11 instanceof DatePickerDialogFragmentComponent ? (DatePickerDialogFragmentComponent) b11 : null;
        if (datePickerDialogFragmentComponent != null) {
            datePickerDialogFragmentComponent.inject(this);
        }
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.mBinding = DatePickerLayoutBinding.bind(inflater.inflate(R$layout.date_picker_layout, container, false));
        return getBinding().getRoot();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        this.mBinding = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        initClicks();
        initDatePicker();
    }
}
