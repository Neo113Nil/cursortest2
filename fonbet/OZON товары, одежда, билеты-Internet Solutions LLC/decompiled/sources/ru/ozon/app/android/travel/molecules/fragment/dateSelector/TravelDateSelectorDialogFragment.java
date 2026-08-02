package ru.ozon.app.android.travel.molecules.fragment.dateSelector;

import Aw.ViewOnClickListenerC2448a;
import Cw.ViewOnClickListenerC2787a;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.d;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.ui.molecules.databinding.FragmentTravelDateSelectorDialogBinding;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.view.date.OzonDatePicker;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J/\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u0003J\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010%R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010%R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010(R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Lru/ozon/app/android/travel/molecules/fragment/dateSelector/TravelDateSelectorDialogFragment;", "Landroidx/fragment/app/k;", "<init>", "()V", "", "initArguments", "initViews", "", "resultCode", "selectedDay", "selectedMonth", "selectedYear", "sendResult", "(IIII)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Landroid/content/DialogInterface;", "dialog", "onCancel", "(Landroid/content/DialogInterface;)V", "Lru/ozon/app/android/travel/ui/molecules/databinding/FragmentTravelDateSelectorDialogBinding;", "_binding", "Lru/ozon/app/android/travel/ui/molecules/databinding/FragmentTravelDateSelectorDialogBinding;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Ljava/lang/String;", "Ljava/lang/Integer;", "", "minDateMillis", "Ljava/lang/Long;", "maxDateMillis", "", "isFragmentResult", "Z", "getBinding", "()Lru/ozon/app/android/travel/ui/molecules/databinding/FragmentTravelDateSelectorDialogBinding;", "binding", "Companion", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelDateSelectorDialogFragment extends DialogInterfaceOnCancelListenerC5390k {
    private FragmentTravelDateSelectorDialogBinding _binding;
    private boolean isFragmentResult;
    private Long maxDateMillis;
    private Long minDateMillis;
    private Integer selectedDay;
    private Integer selectedMonth;
    private Integer selectedYear;
    private String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J]\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u001a¢\u0006\u0002\u0010\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/molecules/fragment/dateSelector/TravelDateSelectorDialogFragment$Companion;", "", "<init>", "()V", "KEY_SELECTED_DAY", "", "KEY_SELECTED_MONTH", "KEY_SELECTED_YEAR", "KEY_FRAGMENT_RESULT", "VALUE_NOT_SELECTED", "", "ACTION_REQUEST_CODE", "KEY_MIN_DATE_MILLIS", "KEY_MAX_DATE_MILLIS", "KEY_TITLE", "DEFAULT_LONG_VALUE", "", "newInstance", "Lru/ozon/app/android/travel/molecules/fragment/dateSelector/TravelDateSelectorDialogFragment;", SelectionItemFormDTO.TITLE_FIELD_NAME, "selectedDay", "selectedMonth", "selectedYear", "minDateMillis", "maxDateMillis", "isFragmentResult", "", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Z)Lru/ozon/app/android/travel/molecules/fragment/dateSelector/TravelDateSelectorDialogFragment;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ TravelDateSelectorDialogFragment newInstance$default(Companion companion, String str, Integer num, Integer num2, Integer num3, Long l11, Long l12, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = null;
            }
            if ((i11 & 2) != 0) {
                num = null;
            }
            if ((i11 & 4) != 0) {
                num2 = null;
            }
            if ((i11 & 8) != 0) {
                num3 = null;
            }
            if ((i11 & 16) != 0) {
                l11 = null;
            }
            if ((i11 & 32) != 0) {
                l12 = null;
            }
            if ((i11 & 64) != 0) {
                z11 = false;
            }
            return companion.newInstance(str, num, num2, num3, l11, l12, z11);
        }

        @NotNull
        public final TravelDateSelectorDialogFragment newInstance(String title, Integer selectedDay, Integer selectedMonth, Integer selectedYear, Long minDateMillis, Long maxDateMillis, boolean isFragmentResult) {
            TravelDateSelectorDialogFragment travelDateSelectorDialogFragment = new TravelDateSelectorDialogFragment();
            travelDateSelectorDialogFragment.setArguments(d.b(new Pair("KEY_TITLE", title), new Pair("KEY_SELECTED_DAY", selectedDay), new Pair("KEY_SELECTED_MONTH", selectedMonth), new Pair("KEY_SELECTED_YEAR", selectedYear), new Pair("KEY_MIN_DATE_MILLIS", minDateMillis), new Pair("KEY_MAX_DATE_MILLIS", maxDateMillis), new Pair("KEY_FRAGMENT_RESULT", Boolean.valueOf(isFragmentResult))));
            return travelDateSelectorDialogFragment;
        }

        private Companion() {
        }
    }

    private final FragmentTravelDateSelectorDialogBinding getBinding() {
        FragmentTravelDateSelectorDialogBinding fragmentTravelDateSelectorDialogBinding = this._binding;
        Intrinsics.f(fragmentTravelDateSelectorDialogBinding);
        return fragmentTravelDateSelectorDialogBinding;
    }

    private final void initArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.title = arguments.getString("KEY_TITLE");
            Integer valueOf = Integer.valueOf(arguments.getInt("KEY_SELECTED_DAY", -1));
            if (!(valueOf.intValue() != -1)) {
                valueOf = null;
            }
            this.selectedDay = valueOf;
            Integer valueOf2 = Integer.valueOf(arguments.getInt("KEY_SELECTED_MONTH", -1));
            if (!(valueOf2.intValue() != -1)) {
                valueOf2 = null;
            }
            this.selectedMonth = valueOf2;
            Integer valueOf3 = Integer.valueOf(arguments.getInt("KEY_SELECTED_YEAR", -1));
            if (!(valueOf3.intValue() != -1)) {
                valueOf3 = null;
            }
            this.selectedYear = valueOf3;
            Long valueOf4 = Long.valueOf(arguments.getLong("KEY_MIN_DATE_MILLIS", -1L));
            if (!(valueOf4.longValue() != -1)) {
                valueOf4 = null;
            }
            this.minDateMillis = valueOf4;
            Long valueOf5 = Long.valueOf(arguments.getLong("KEY_MAX_DATE_MILLIS", -1L));
            this.maxDateMillis = valueOf5.longValue() != -1 ? valueOf5 : null;
            this.isFragmentResult = arguments.getBoolean("KEY_FRAGMENT_RESULT");
        }
    }

    private final void initViews() {
        TextView titleTv = getBinding().titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        TextViewExtKt.setTextOrGone(titleTv, this.title);
        getBinding().okBtn.setOnClickListener(new ViewOnClickListenerC2448a(this, 12));
        getBinding().cancelBtn.setOnClickListener(new ViewOnClickListenerC2787a(this, 9));
        OzonDatePicker ozonDatePicker = getBinding().datePicker;
        Integer num = this.selectedYear;
        int intValue = num != null ? num.intValue() : ozonDatePicker.getYear();
        Integer num2 = this.selectedMonth;
        int intValue2 = num2 != null ? num2.intValue() : ozonDatePicker.getMonth();
        Integer num3 = this.selectedDay;
        ozonDatePicker.updateDate(intValue, intValue2, num3 != null ? num3.intValue() : ozonDatePicker.getDayOfMonth());
        Long l11 = this.minDateMillis;
        if (l11 != null) {
            ozonDatePicker.setMinDate(l11.longValue());
        }
        Long l12 = this.maxDateMillis;
        if (l12 != null) {
            ozonDatePicker.setMaxDate(l12.longValue());
        }
        ozonDatePicker.setDescendantFocusability(393216);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$6(TravelDateSelectorDialogFragment travelDateSelectorDialogFragment, View view) {
        travelDateSelectorDialogFragment.sendResult(-1, travelDateSelectorDialogFragment.getBinding().datePicker.getDayOfMonth(), travelDateSelectorDialogFragment.getBinding().datePicker.getMonth(), travelDateSelectorDialogFragment.getBinding().datePicker.getYear());
        travelDateSelectorDialogFragment.dismiss();
    }

    private final void sendResult(int resultCode, int selectedDay, int selectedMonth, int selectedYear) {
        if (this.isFragmentResult && resultCode == -1) {
            getParentFragmentManager().m1(d.b(new Pair("KEY_SELECTED_DAY", Integer.valueOf(selectedDay)), new Pair("KEY_SELECTED_MONTH", Integer.valueOf(selectedMonth)), new Pair("KEY_SELECTED_YEAR", Integer.valueOf(selectedYear))), "84655");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("KEY_SELECTED_DAY", selectedDay);
        intent.putExtra("KEY_SELECTED_MONTH", selectedMonth);
        intent.putExtra("KEY_SELECTED_YEAR", selectedYear);
        ComponentCallbacksC5392m targetFragment = getTargetFragment();
        if (targetFragment != null) {
            targetFragment.onActivityResult(getTargetRequestCode(), resultCode, intent);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onCancel(dialog);
        sendResult(0, -1, -1, -1);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = FragmentTravelDateSelectorDialogBinding.inflate(inflater, container, false);
        ConstraintLayout constraintLayout = getBinding().getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        initArguments();
        initViews();
    }
}
