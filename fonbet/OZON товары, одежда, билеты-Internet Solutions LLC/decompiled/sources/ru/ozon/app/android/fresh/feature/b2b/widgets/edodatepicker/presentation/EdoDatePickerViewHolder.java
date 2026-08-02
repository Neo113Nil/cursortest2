package ru.ozon.app.android.fresh.feature.b2b.widgets.edodatepicker.presentation;

import T00.a;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C5402x;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetEdoDatePickerBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.edodatepicker.DateChooseDialog;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\rJ#\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\rJ\u000f\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\rJ\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edodatepicker/presentation/EdoDatePickerViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edodatepicker/presentation/EdoDatePickerVO;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetEdoDatePickerBinding;", "binding", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edodatepicker/presentation/EdoDatePickerViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetEdoDatePickerBinding;Lru/ozon/app/android/fresh/feature/b2b/widgets/edodatepicker/presentation/EdoDatePickerViewModel;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "setupClickListeners", "()V", "setupViewModelObservers", "openStartDatePicker", "openEndDatePicker", "setUnfilledState", "", "startDate", "endDate", "setDates", "(Ljava/lang/String;Ljava/lang/String;)V", "setStartDateUnfilled", "setEndDateUnfilled", "setStartDate", "(Ljava/lang/String;)V", "setEndDate", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/edodatepicker/presentation/EdoDatePickerVO;Ll20/d;)V", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetEdoDatePickerBinding;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edodatepicker/presentation/EdoDatePickerViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EdoDatePickerViewHolder extends k<EdoDatePickerVO> {

    @NotNull
    private final WidgetEdoDatePickerBinding binding;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final EdoDatePickerViewModel viewModel;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EdoDatePickerViewHolder(@NotNull WidgetEdoDatePickerBinding binding, @NotNull EdoDatePickerViewModel viewModel, @NotNull ComposerReferences refs) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(refs, "refs");
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        this.binding = binding;
        this.viewModel = viewModel;
        this.refs = refs;
        setupClickListeners();
        setupViewModelObservers();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openEndDatePicker() {
        DateChooseDialog.INSTANCE.newInstance(DateChooseDialog.Type.END, this.viewModel.getEndDate(), null).show(this.refs.getContainer().k(), (String) null);
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 != null) {
            C5402x.b(c11, "request_key_end", new EdoDatePickerViewHolder$openEndDatePicker$1(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openStartDatePicker() {
        DateChooseDialog.INSTANCE.newInstance(DateChooseDialog.Type.START, this.viewModel.getStartDate(), this.viewModel.getEndDate()).show(this.refs.getContainer().k(), (String) null);
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 != null) {
            C5402x.b(c11, "request_key_start", new EdoDatePickerViewHolder$openStartDatePicker$1(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDates(String startDate, String endDate) {
        if (startDate != null) {
            setStartDate(startDate);
        } else {
            setStartDateUnfilled();
        }
        if (endDate != null) {
            setEndDate(endDate);
        } else {
            setEndDateUnfilled();
        }
        this.viewModel.refreshPage(this.refs);
    }

    private final void setEndDate(String endDate) {
        WidgetEdoDatePickerBinding widgetEdoDatePickerBinding = this.binding;
        TextView endDateTitleInitialTV = widgetEdoDatePickerBinding.endDateTitleInitialTV;
        Intrinsics.checkNotNullExpressionValue(endDateTitleInitialTV, "endDateTitleInitialTV");
        ViewExtKt.gone(endDateTitleInitialTV);
        TextView endDateTitleTV = widgetEdoDatePickerBinding.endDateTitleTV;
        Intrinsics.checkNotNullExpressionValue(endDateTitleTV, "endDateTitleTV");
        ViewExtKt.show(endDateTitleTV);
        TextView endDateTV = widgetEdoDatePickerBinding.endDateTV;
        Intrinsics.checkNotNullExpressionValue(endDateTV, "endDateTV");
        ViewExtKt.show(endDateTV);
        widgetEdoDatePickerBinding.endDateTV.setText(endDate);
    }

    private final void setEndDateUnfilled() {
        WidgetEdoDatePickerBinding widgetEdoDatePickerBinding = this.binding;
        TextView endDateTitleInitialTV = widgetEdoDatePickerBinding.endDateTitleInitialTV;
        Intrinsics.checkNotNullExpressionValue(endDateTitleInitialTV, "endDateTitleInitialTV");
        ViewExtKt.show(endDateTitleInitialTV);
        TextView endDateTitleTV = widgetEdoDatePickerBinding.endDateTitleTV;
        Intrinsics.checkNotNullExpressionValue(endDateTitleTV, "endDateTitleTV");
        ViewExtKt.gone(endDateTitleTV);
        TextView endDateTV = widgetEdoDatePickerBinding.endDateTV;
        Intrinsics.checkNotNullExpressionValue(endDateTV, "endDateTV");
        ViewExtKt.gone(endDateTV);
    }

    private final void setStartDate(String startDate) {
        WidgetEdoDatePickerBinding widgetEdoDatePickerBinding = this.binding;
        TextView startDateTitleInitialTV = widgetEdoDatePickerBinding.startDateTitleInitialTV;
        Intrinsics.checkNotNullExpressionValue(startDateTitleInitialTV, "startDateTitleInitialTV");
        ViewExtKt.gone(startDateTitleInitialTV);
        TextView startDateTitleTV = widgetEdoDatePickerBinding.startDateTitleTV;
        Intrinsics.checkNotNullExpressionValue(startDateTitleTV, "startDateTitleTV");
        ViewExtKt.show(startDateTitleTV);
        TextView startDateTV = widgetEdoDatePickerBinding.startDateTV;
        Intrinsics.checkNotNullExpressionValue(startDateTV, "startDateTV");
        ViewExtKt.show(startDateTV);
        widgetEdoDatePickerBinding.startDateTV.setText(startDate);
    }

    private final void setStartDateUnfilled() {
        WidgetEdoDatePickerBinding widgetEdoDatePickerBinding = this.binding;
        TextView startDateTitleInitialTV = widgetEdoDatePickerBinding.startDateTitleInitialTV;
        Intrinsics.checkNotNullExpressionValue(startDateTitleInitialTV, "startDateTitleInitialTV");
        ViewExtKt.show(startDateTitleInitialTV);
        TextView startDateTitleTV = widgetEdoDatePickerBinding.startDateTitleTV;
        Intrinsics.checkNotNullExpressionValue(startDateTitleTV, "startDateTitleTV");
        ViewExtKt.gone(startDateTitleTV);
        TextView startDateTV = widgetEdoDatePickerBinding.startDateTV;
        Intrinsics.checkNotNullExpressionValue(startDateTV, "startDateTV");
        ViewExtKt.gone(startDateTV);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUnfilledState() {
        setStartDateUnfilled();
        setEndDateUnfilled();
    }

    private final void setupClickListeners() {
        WidgetEdoDatePickerBinding widgetEdoDatePickerBinding = this.binding;
        View startDateBackgroundV = widgetEdoDatePickerBinding.startDateBackgroundV;
        Intrinsics.checkNotNullExpressionValue(startDateBackgroundV, "startDateBackgroundV");
        ViewExtKt.setOnClickListenerThrottle$default(startDateBackgroundV, 0L, new EdoDatePickerViewHolder$setupClickListeners$1$1(this), 1, null);
        View endDateBackgroundV = widgetEdoDatePickerBinding.endDateBackgroundV;
        Intrinsics.checkNotNullExpressionValue(endDateBackgroundV, "endDateBackgroundV");
        ViewExtKt.setOnClickListenerThrottle$default(endDateBackgroundV, 0L, new EdoDatePickerViewHolder$setupClickListeners$1$2(this), 1, null);
    }

    private final void setupViewModelObservers() {
        this.viewModel.getFilterState().observe(this.refs.getContainer().g(), new EdoDatePickerViewHolder$sam$androidx_lifecycle_Observer$0(new EdoDatePickerViewHolder$setupViewModelObservers$1(this)));
        this.viewModel.getSingleEvents().observe(this.refs.getContainer().g(), new EdoDatePickerViewHolder$sam$androidx_lifecycle_Observer$0(new EdoDatePickerViewHolder$setupViewModelObservers$2(this)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull EdoDatePickerVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        EdoDatePickerViewModel edoDatePickerViewModel = this.viewModel;
        a b11 = info.b();
        edoDatePickerViewModel.setCurrentPage(b11 != null ? b11.c() : null);
    }
}
