package ru.ozon.app.android.partpayment.formpage.view;

import Sc.o;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import fd.InterfaceC6511n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.R$layout;
import ru.ozon.app.android.partpayment.formpage.view.vh.AddressFieldVH;
import ru.ozon.app.android.partpayment.formpage.view.vh.AddressSelectorFieldVH;
import ru.ozon.app.android.partpayment.formpage.view.vh.ApproveButtonVH;
import ru.ozon.app.android.partpayment.formpage.view.vh.CheckboxFieldVH;
import ru.ozon.app.android.partpayment.formpage.view.vh.CheckerFieldVH;
import ru.ozon.app.android.partpayment.formpage.view.vh.DynamicFormFieldVH;
import ru.ozon.app.android.partpayment.formpage.view.vh.ImageFieldVH;
import ru.ozon.app.android.partpayment.formpage.view.vh.LandingFieldVH;
import ru.ozon.app.android.partpayment.formpage.view.vh.MaskFieldVH;
import ru.ozon.app.android.partpayment.formpage.view.vh.PickerFieldVH;
import ru.ozon.app.android.partpayment.formpage.view.vh.RadioFieldVH;
import ru.ozon.app.android.partpayment.formpage.view.vh.RangeFieldVH;
import ru.ozon.app.android.partpayment.formpage.view.vh.SeparatorViewHolder;
import ru.ozon.app.android.partpayment.formpage.view.vh.SummaryFieldVH;
import ru.ozon.app.android.partpayment.formpage.view.vh.TextFieldVH;
import ru.ozon.app.android.partpayment.formpage.view.vh.UploadButtonVH;
import ru.ozon.app.android.partpayment.formpage.view.vh.ValidateButtonVH;
import ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010!\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001VB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0019\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b%\u0010$J\u001f\u0010&\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b&\u0010$J\u0017\u0010'\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u0004\u0018\u00010\u0015*\u00020)H\u0002¢\u0006\u0004\b*\u0010+R6\u0010-\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0011\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R6\u00103\u001a\u0016\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0011\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010.\u001a\u0004\b4\u00100\"\u0004\b5\u00102R0\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0011\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R0\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0011\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u00108\u001a\u0004\b>\u0010:\"\u0004\b?\u0010<R<\u0010A\u001a\u001c\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0011\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR0\u0010G\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0011\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u00108\u001a\u0004\bH\u0010:\"\u0004\bI\u0010<R0\u0010J\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0011\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u00108\u001a\u0004\bK\u0010:\"\u0004\bL\u0010<R0\u0010M\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0011\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u00108\u001a\u0004\bN\u0010:\"\u0004\bO\u0010<R0\u0010P\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0011\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u00108\u001a\u0004\bQ\u0010:\"\u0004\bR\u0010<R\u001c\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00150S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006W"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/DynamicFormFieldsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/partpayment/formpage/view/vh/DynamicFormFieldVH;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/partpayment/formpage/view/vh/DynamicFormFieldVH;", "getItemCount", "()I", "position", "getItemViewType", "(I)I", "holder", "", "onBindViewHolder", "(Lru/ozon/app/android/partpayment/formpage/view/vh/DynamicFormFieldVH;I)V", "", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "items", "", "silent", "submitList", "(Ljava/util/List;Z)V", "vh", AppMeasurementSdk.ConditionalUserProperty.VALUE, "onValueChanged", "(Lru/ozon/app/android/partpayment/formpage/view/vh/DynamicFormFieldVH;Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;Z)V", "onButtonClicked", "(Lru/ozon/app/android/partpayment/formpage/view/vh/DynamicFormFieldVH;)V", "", "deeplink", "onChangeClick", "(Lru/ozon/app/android/partpayment/formpage/view/vh/DynamicFormFieldVH;Ljava/lang/String;)V", "onActionClick", "onErrorReportClick", "getItem", "(I)Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "Landroidx/recyclerview/widget/RecyclerView$C;", "getCurrentItem", "(Landroidx/recyclerview/widget/RecyclerView$C;)Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "Lkotlin/Function2;", "onFieldChanged", "Lkotlin/jvm/functions/Function2;", "getOnFieldChanged", "()Lkotlin/jvm/functions/Function2;", "setOnFieldChanged", "(Lkotlin/jvm/functions/Function2;)V", "onAddressClick", "getOnAddressClick", "setOnAddressClick", "Lkotlin/Function1;", "onPickerClick", "Lkotlin/jvm/functions/Function1;", "getOnPickerClick", "()Lkotlin/jvm/functions/Function1;", "setOnPickerClick", "(Lkotlin/jvm/functions/Function1;)V", "onButtonClick", "getOnButtonClick", "setOnButtonClick", "Lkotlin/Function3;", "onAutocompleteRequested", "Lfd/n;", "getOnAutocompleteRequested", "()Lfd/n;", "setOnAutocompleteRequested", "(Lfd/n;)V", "onNewPaymentMethodSelected", "getOnNewPaymentMethodSelected", "setOnNewPaymentMethodSelected", "onEditFormClicked", "getOnEditFormClicked", "setOnEditFormClicked", "onActionClicked", "getOnActionClicked", "setOnActionClicked", "onReportErrorClicked", "getOnReportErrorClicked", "setOnReportErrorClicked", "", "currentList", "Ljava/util/List;", "DynamicDiffUtilCallback", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DynamicFormFieldsAdapter extends RecyclerView.g<DynamicFormFieldVH> {

    @NotNull
    private List<FormPageVO.Field> currentList = new ArrayList();
    private Function1<? super String, Unit> onActionClicked;
    private Function2<? super String, ? super String, Unit> onAddressClick;
    private InterfaceC6511n<? super String, ? super String, ? super String, Unit> onAutocompleteRequested;
    private Function1<? super FormPageVO.Field, Unit> onButtonClick;
    private Function1<? super String, Unit> onEditFormClicked;
    private Function2<? super FormPageVO.Field, ? super Boolean, Unit> onFieldChanged;
    private Function1<? super String, Unit> onNewPaymentMethodSelected;
    private Function1<? super FormPageVO.Field, Unit> onPickerClick;
    private Function1<? super String, Unit> onReportErrorClicked;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/DynamicFormFieldsAdapter$DynamicDiffUtilCallback;", "Landroidx/recyclerview/widget/i$b;", "", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "oldItems", "newItems", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "getOldListSize", "()I", "getNewListSize", "oldItemPosition", "newItemPosition", "", "areItemsTheSame", "(II)Z", "areContentsTheSame", "Ljava/util/List;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class DynamicDiffUtilCallback extends i.b {

        @NotNull
        private final List<FormPageVO.Field> newItems;

        @NotNull
        private final List<FormPageVO.Field> oldItems;

        /* JADX WARN: Multi-variable type inference failed */
        public DynamicDiffUtilCallback(@NotNull List<? extends FormPageVO.Field> oldItems, @NotNull List<? extends FormPageVO.Field> newItems) {
            Intrinsics.checkNotNullParameter(oldItems, "oldItems");
            Intrinsics.checkNotNullParameter(newItems, "newItems");
            this.oldItems = oldItems;
            this.newItems = newItems;
        }

        @Override // androidx.recyclerview.widget.i.b
        public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
            return Intrinsics.d(this.oldItems.get(oldItemPosition), this.newItems.get(newItemPosition));
        }

        @Override // androidx.recyclerview.widget.i.b
        public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
            return this.oldItems.get(oldItemPosition).getClass() == this.newItems.get(newItemPosition).getClass();
        }

        @Override // androidx.recyclerview.widget.i.b
        public int getNewListSize() {
            return this.newItems.size();
        }

        @Override // androidx.recyclerview.widget.i.b
        public int getOldListSize() {
            return this.oldItems.size();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FormPageVO.Field.ViewType.values().length];
            try {
                iArr[FormPageVO.Field.ViewType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FormPageVO.Field.ViewType.MASK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FormPageVO.Field.ViewType.RANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FormPageVO.Field.ViewType.RADIO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FormPageVO.Field.ViewType.CHECKBOX.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FormPageVO.Field.ViewType.ADDRESS_SELECTOR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FormPageVO.Field.ViewType.ADDRESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[FormPageVO.Field.ViewType.LANDING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[FormPageVO.Field.ViewType.IMAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[FormPageVO.Field.ViewType.PICKER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[FormPageVO.Field.ViewType.CHECKER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[FormPageVO.Field.ViewType.SUMMARY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[FormPageVO.Field.ViewType.SEPARATOR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[FormPageVO.Field.ViewType.VALIDATE_BUTTON.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[FormPageVO.Field.ViewType.UPLOAD_PHOTO_BUTTON.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[FormPageVO.Field.ViewType.APPROVE_BUTTON.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FormPageVO.Field getCurrentItem(RecyclerView.C c11) {
        Integer valueOf = Integer.valueOf(c11.getAdapterPosition());
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            return getItem(valueOf.intValue());
        }
        return null;
    }

    private final FormPageVO.Field getItem(int position) {
        return this.currentList.get(position);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onActionClick(DynamicFormFieldVH vh2, String deeplink) {
        Function1<? super String, Unit> function1;
        if (getCurrentItem(vh2) == null || (function1 = this.onActionClicked) == null) {
            return;
        }
        function1.invoke(deeplink);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onButtonClicked(DynamicFormFieldVH vh2) {
        Function1<? super FormPageVO.Field, Unit> function1;
        FormPageVO.Field currentItem = getCurrentItem(vh2);
        if (currentItem == null || (function1 = this.onButtonClick) == null) {
            return;
        }
        function1.invoke(currentItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onChangeClick(DynamicFormFieldVH vh2, String deeplink) {
        Function1<? super String, Unit> function1;
        if (getCurrentItem(vh2) == null || (function1 = this.onEditFormClicked) == null) {
            return;
        }
        function1.invoke(deeplink);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onErrorReportClick(DynamicFormFieldVH vh2, String deeplink) {
        Function1<? super String, Unit> function1;
        if (getCurrentItem(vh2) == null || (function1 = this.onReportErrorClicked) == null) {
            return;
        }
        function1.invoke(deeplink);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onValueChanged(DynamicFormFieldVH vh2, FormPageVO.Field value, boolean silent) {
        Function2<? super FormPageVO.Field, ? super Boolean, Unit> function2;
        if (getCurrentItem(vh2) == null || (function2 = this.onFieldChanged) == null) {
            return;
        }
        function2.invoke(value, Boolean.valueOf(silent));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemCount() {
        return this.currentList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return getItem(position).getViewType().getValue();
    }

    public final Function2<String, String, Unit> getOnAddressClick() {
        return this.onAddressClick;
    }

    public final InterfaceC6511n<String, String, String, Unit> getOnAutocompleteRequested() {
        return this.onAutocompleteRequested;
    }

    public final Function1<String, Unit> getOnNewPaymentMethodSelected() {
        return this.onNewPaymentMethodSelected;
    }

    public final Function1<FormPageVO.Field, Unit> getOnPickerClick() {
        return this.onPickerClick;
    }

    public final void setOnActionClicked(Function1<? super String, Unit> function1) {
        this.onActionClicked = function1;
    }

    public final void setOnAddressClick(Function2<? super String, ? super String, Unit> function2) {
        this.onAddressClick = function2;
    }

    public final void setOnAutocompleteRequested(InterfaceC6511n<? super String, ? super String, ? super String, Unit> interfaceC6511n) {
        this.onAutocompleteRequested = interfaceC6511n;
    }

    public final void setOnButtonClick(Function1<? super FormPageVO.Field, Unit> function1) {
        this.onButtonClick = function1;
    }

    public final void setOnEditFormClicked(Function1<? super String, Unit> function1) {
        this.onEditFormClicked = function1;
    }

    public final void setOnFieldChanged(Function2<? super FormPageVO.Field, ? super Boolean, Unit> function2) {
        this.onFieldChanged = function2;
    }

    public final void setOnNewPaymentMethodSelected(Function1<? super String, Unit> function1) {
        this.onNewPaymentMethodSelected = function1;
    }

    public final void setOnPickerClick(Function1<? super FormPageVO.Field, Unit> function1) {
        this.onPickerClick = function1;
    }

    public final void setOnReportErrorClicked(Function1<? super String, Unit> function1) {
        this.onReportErrorClicked = function1;
    }

    public final void submitList(@NotNull List<? extends FormPageVO.Field> items, boolean silent) {
        Intrinsics.checkNotNullParameter(items, "items");
        if (silent) {
            this.currentList = Collections.unmodifiableList(items);
            return;
        }
        i.c a11 = i.a(new DynamicDiffUtilCallback(this.currentList, items), true);
        Intrinsics.checkNotNullExpressionValue(a11, "calculateDiff(...)");
        this.currentList = Collections.unmodifiableList(items);
        a11.c(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull DynamicFormFieldVH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(getItem(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public DynamicFormFieldVH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        for (FormPageVO.Field.ViewType viewType2 : FormPageVO.Field.ViewType.values()) {
            if (viewType2.getValue() == viewType) {
                switch (WhenMappings.$EnumSwitchMapping$0[viewType2.ordinal()]) {
                    case 1:
                        return new TextFieldVH(ViewGroupExtKt.inflate(parent, R$layout.item_dynamic_form_field_text), new DynamicFormFieldsAdapter$onCreateViewHolder$2(this));
                    case 2:
                        return new MaskFieldVH(ViewGroupExtKt.inflate(parent, R$layout.item_dynamic_form_field_mask), new DynamicFormFieldsAdapter$onCreateViewHolder$3(this), new DynamicFormFieldsAdapter$onCreateViewHolder$4(this));
                    case 3:
                        return new RangeFieldVH(ViewGroupExtKt.inflate(parent, R$layout.item_dynamic_form_field_range), new DynamicFormFieldsAdapter$onCreateViewHolder$5(this));
                    case 4:
                        return new RadioFieldVH(ViewGroupExtKt.inflate(parent, R$layout.item_dynamic_form_field_radio), new DynamicFormFieldsAdapter$onCreateViewHolder$6(this));
                    case 5:
                        return new CheckboxFieldVH(ViewGroupExtKt.inflate(parent, R$layout.item_dynamic_form_field_checkbox), new DynamicFormFieldsAdapter$onCreateViewHolder$7(this));
                    case 6:
                        return new AddressSelectorFieldVH(ViewGroupExtKt.inflate(parent, R$layout.item_dymanic_form_field_address_selector_item), new DynamicFormFieldsAdapter$onCreateViewHolder$8(this));
                    case 7:
                        return new AddressFieldVH(ViewGroupExtKt.inflate(parent, R$layout.item_dynamic_form_field_address_base), new DynamicFormFieldsAdapter$onCreateViewHolder$9(this));
                    case 8:
                        return new LandingFieldVH(ViewGroupExtKt.inflate(parent, R$layout.item_dynamic_form_field_landing));
                    case 9:
                        return new ImageFieldVH(ViewGroupExtKt.inflate(parent, R$layout.item_dynamic_form_field_image));
                    case 10:
                        return new PickerFieldVH(ViewGroupExtKt.inflate(parent, R$layout.item_dynamic_form_field_picker), new DynamicFormFieldsAdapter$onCreateViewHolder$10(this));
                    case 11:
                        return new CheckerFieldVH(ViewGroupExtKt.inflate(parent, R$layout.item_dynamic_form_field_checker_base), new DynamicFormFieldsAdapter$onCreateViewHolder$11(this), new DynamicFormFieldsAdapter$onCreateViewHolder$12(this));
                    case 12:
                        return new SummaryFieldVH(ViewGroupExtKt.inflate(parent, R$layout.item_dynamic_form_field_summary_base), new DynamicFormFieldsAdapter$onCreateViewHolder$13(this), new DynamicFormFieldsAdapter$onCreateViewHolder$14(this));
                    case 13:
                        return new SeparatorViewHolder(ViewGroupExtKt.inflate(parent, R$layout.item_dynamic_form_field_separator));
                    case 14:
                        return new ValidateButtonVH(ViewGroupExtKt.inflate(parent, R$layout.item_dynamic_form_field_button), new DynamicFormFieldsAdapter$onCreateViewHolder$15(this));
                    case 15:
                        return new UploadButtonVH(ViewGroupExtKt.inflate(parent, R$layout.item_dynamic_form_field_upload_button), new DynamicFormFieldsAdapter$onCreateViewHolder$16(this));
                    case 16:
                        return new ApproveButtonVH(ViewGroupExtKt.inflate(parent, R$layout.item_dynamic_form_field_approve_button), new DynamicFormFieldsAdapter$onCreateViewHolder$17(this), new DynamicFormFieldsAdapter$onCreateViewHolder$18(this));
                    default:
                        throw new o();
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
