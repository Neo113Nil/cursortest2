package ru.ozon.app.android.partpayment.formpage.view;

import WB.b;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.databinding.WidgetNouiFormPageBinding;
import ru.ozon.app.android.partpayment.formpage.view.FormPageViewModel;
import ru.ozon.app.android.partpayment.formpage.view.vh.MeasureVH;
import ru.ozon.app.android.partpayment.formpage.view.vo.FormPageVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.screenstate.ScreenState;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.flashbar.main.Flashbar;
import ru.ozon.uni.android.flashbar.model.Action;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\"\u001a\u00020\n2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010!\u001a\u00020\r¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R6\u0010*\u001a\u0016\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R6\u00100\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R0\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\n\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R0\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\n\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u00105\u001a\u0004\b;\u00107\"\u0004\b<\u00109R<\u0010>\u001a\u001c\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n\u0018\u00010=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR0\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u00105\u001a\u0004\bE\u00107\"\u0004\bF\u00109R0\u0010G\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u00105\u001a\u0004\bH\u00107\"\u0004\bI\u00109R0\u0010J\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u00105\u001a\u0004\bK\u00107\"\u0004\bL\u00109R0\u0010M\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u00105\u001a\u0004\bN\u00107\"\u0004\bO\u00109R0\u0010P\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u00105\u001a\u0004\bQ\u00107\"\u0004\bR\u00109R\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010V\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010(¨\u0006W"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/view/FormPageView;", "", "Lru/ozon/app/android/partpayment/databinding/WidgetNouiFormPageBinding;", "binding", "Landroidx/lifecycle/J;", "viewOwner", "Lru/ozon/uni/android/flashbar/main/Flashbar;", "alertFlashbar", "<init>", "(Lru/ozon/app/android/partpayment/databinding/WidgetNouiFormPageBinding;Landroidx/lifecycle/J;Lru/ozon/uni/android/flashbar/main/Flashbar;)V", "", "hideAlerts", "()V", "", "showing", "showLoading", "(Z)V", "Lru/ozon/app/android/uikit/screenstate/ScreenState;", "screenState", "", "message", "showAlert", "(Lru/ozon/app/android/uikit/screenstate/ScreenState;Ljava/lang/String;)V", "Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$RetryInfo;", "retryInfo", "showRetrySnackBar", "(Lru/ozon/app/android/partpayment/formpage/view/FormPageViewModel$RetryInfo;)V", SelectionItemFormDTO.TITLE_FIELD_NAME, "setTitle", "(Ljava/lang/String;)V", "", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "fields", "silent", "setFields", "(Ljava/util/List;Z)V", "Lru/ozon/app/android/partpayment/databinding/WidgetNouiFormPageBinding;", "getBinding", "()Lru/ozon/app/android/partpayment/databinding/WidgetNouiFormPageBinding;", "Landroidx/lifecycle/J;", "Lru/ozon/uni/android/flashbar/main/Flashbar;", "Lkotlin/Function2;", "onFieldChanged", "Lkotlin/jvm/functions/Function2;", "getOnFieldChanged", "()Lkotlin/jvm/functions/Function2;", "setOnFieldChanged", "(Lkotlin/jvm/functions/Function2;)V", "onAddressClick", "getOnAddressClick", "setOnAddressClick", "Lkotlin/Function1;", "onPickerClick", "Lkotlin/jvm/functions/Function1;", "getOnPickerClick", "()Lkotlin/jvm/functions/Function1;", "setOnPickerClick", "(Lkotlin/jvm/functions/Function1;)V", "onButtonClick", "getOnButtonClick", "setOnButtonClick", "Lkotlin/Function3;", "onAutocompleteRequested", "Lfd/n;", "getOnAutocompleteRequested", "()Lfd/n;", "setOnAutocompleteRequested", "(Lfd/n;)V", "onNewPaymentMethodSelected", "getOnNewPaymentMethodSelected", "setOnNewPaymentMethodSelected", "onEditFormClicked", "getOnEditFormClicked", "setOnEditFormClicked", "onActionClicked", "getOnActionClicked", "setOnActionClicked", "onReportErrorClicked", "getOnReportErrorClicked", "setOnReportErrorClicked", "onRetryClick", "getOnRetryClick", "setOnRetryClick", "Lru/ozon/app/android/partpayment/formpage/view/DynamicFormFieldsAdapter;", "adapter", "Lru/ozon/app/android/partpayment/formpage/view/DynamicFormFieldsAdapter;", "shownRetryFlashbar", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FormPageView {

    @NotNull
    private final DynamicFormFieldsAdapter adapter;
    private final Flashbar alertFlashbar;

    @NotNull
    private final WidgetNouiFormPageBinding binding;
    private Function1<? super String, Unit> onActionClicked;
    private Function2<? super String, ? super String, Unit> onAddressClick;
    private InterfaceC6511n<? super String, ? super String, ? super String, Unit> onAutocompleteRequested;
    private Function1<? super FormPageVO.Field, Unit> onButtonClick;
    private Function1<? super String, Unit> onEditFormClicked;
    private Function2<? super FormPageVO.Field, ? super Boolean, Unit> onFieldChanged;
    private Function1<? super String, Unit> onNewPaymentMethodSelected;
    private Function1<? super FormPageVO.Field, Unit> onPickerClick;
    private Function1<? super String, Unit> onReportErrorClicked;
    private Function1<? super FormPageViewModel.RetryInfo, Unit> onRetryClick;
    private Flashbar shownRetryFlashbar;

    @NotNull
    private final J viewOwner;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "deeplink", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.partpayment.formpage.view.FormPageView$10, reason: invalid class name */
    static final class AnonymousClass10 extends AbstractC7737t implements Function1<String, Unit> {
        AnonymousClass10() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Function1<String, Unit> onReportErrorClicked = FormPageView.this.getOnReportErrorClicked();
            if (onReportErrorClicked != null) {
                onReportErrorClicked.invoke(deeplink);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "field", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "force", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.partpayment.formpage.view.FormPageView$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function2<FormPageVO.Field, Boolean, Unit> {
        AnonymousClass2() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(FormPageVO.Field field, Boolean bool) {
            invoke(field, bool.booleanValue());
            return Unit.f71690a;
        }

        public final void invoke(FormPageVO.Field field, boolean z11) {
            Intrinsics.checkNotNullParameter(field, "field");
            Function2<FormPageVO.Field, Boolean, Unit> onFieldChanged = FormPageView.this.getOnFieldChanged();
            if (onFieldChanged != null) {
                onFieldChanged.invoke(field, Boolean.valueOf(z11));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "targetField", "", SearchIntents.EXTRA_QUERY, "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.partpayment.formpage.view.FormPageView$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function2<String, String, Unit> {
        AnonymousClass3() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
            invoke2(str, str2);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String targetField, String query) {
            Intrinsics.checkNotNullParameter(targetField, "targetField");
            Intrinsics.checkNotNullParameter(query, "query");
            Function2<String, String, Unit> onAddressClick = FormPageView.this.getOnAddressClick();
            if (onAddressClick != null) {
                onAddressClick.invoke(targetField, query);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "field", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.partpayment.formpage.view.FormPageView$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function1<FormPageVO.Field, Unit> {
        AnonymousClass4() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FormPageVO.Field field) {
            invoke2(field);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FormPageVO.Field field) {
            Intrinsics.checkNotNullParameter(field, "field");
            Function1<FormPageVO.Field, Unit> onPickerClick = FormPageView.this.getOnPickerClick();
            if (onPickerClick != null) {
                onPickerClick.invoke(field);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "field", "Lru/ozon/app/android/partpayment/formpage/view/vo/FormPageVO$Field;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.partpayment.formpage.view.FormPageView$5, reason: invalid class name */
    static final class AnonymousClass5 extends AbstractC7737t implements Function1<FormPageVO.Field, Unit> {
        AnonymousClass5() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FormPageVO.Field field) {
            invoke2(field);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FormPageVO.Field field) {
            Intrinsics.checkNotNullParameter(field, "field");
            Function1<FormPageVO.Field, Unit> onButtonClick = FormPageView.this.getOnButtonClick();
            if (onButtonClick != null) {
                onButtonClick.invoke(field);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", ImagesContract.URL, SearchIntents.EXTRA_QUERY, "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.partpayment.formpage.view.FormPageView$6, reason: invalid class name */
    static final class AnonymousClass6 extends AbstractC7737t implements InterfaceC6511n<String, String, String, Unit> {
        AnonymousClass6() {
            super(3);
        }

        @Override // fd.InterfaceC6511n
        public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, String str3) {
            invoke2(str, str2, str3);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String name, String url, String query) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(query, "query");
            InterfaceC6511n<String, String, String, Unit> onAutocompleteRequested = FormPageView.this.getOnAutocompleteRequested();
            if (onAutocompleteRequested != null) {
                onAutocompleteRequested.invoke(name, url, query);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "deeplink", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.partpayment.formpage.view.FormPageView$7, reason: invalid class name */
    static final class AnonymousClass7 extends AbstractC7737t implements Function1<String, Unit> {
        AnonymousClass7() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Function1<String, Unit> onNewPaymentMethodSelected = FormPageView.this.getOnNewPaymentMethodSelected();
            if (onNewPaymentMethodSelected != null) {
                onNewPaymentMethodSelected.invoke(deeplink);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "deeplink", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.partpayment.formpage.view.FormPageView$8, reason: invalid class name */
    static final class AnonymousClass8 extends AbstractC7737t implements Function1<String, Unit> {
        AnonymousClass8() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Function1<String, Unit> onEditFormClicked = FormPageView.this.getOnEditFormClicked();
            if (onEditFormClicked != null) {
                onEditFormClicked.invoke(deeplink);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "deeplink", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.partpayment.formpage.view.FormPageView$9, reason: invalid class name */
    static final class AnonymousClass9 extends AbstractC7737t implements Function1<String, Unit> {
        AnonymousClass9() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Function1<String, Unit> onActionClicked = FormPageView.this.getOnActionClicked();
            if (onActionClicked != null) {
                onActionClicked.invoke(deeplink);
            }
        }
    }

    public FormPageView(@NotNull WidgetNouiFormPageBinding binding, @NotNull J viewOwner, Flashbar flashbar) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(viewOwner, "viewOwner");
        this.binding = binding;
        this.viewOwner = viewOwner;
        this.alertFlashbar = flashbar;
        DynamicFormFieldsAdapter dynamicFormFieldsAdapter = new DynamicFormFieldsAdapter();
        this.adapter = dynamicFormFieldsAdapter;
        binding.fieldsRv.addOnLayoutChangeListener(new b(this, 0));
        binding.fieldsRv.setAdapter(dynamicFormFieldsAdapter);
        dynamicFormFieldsAdapter.setOnFieldChanged(new AnonymousClass2());
        dynamicFormFieldsAdapter.setOnAddressClick(new AnonymousClass3());
        dynamicFormFieldsAdapter.setOnPickerClick(new AnonymousClass4());
        dynamicFormFieldsAdapter.setOnButtonClick(new AnonymousClass5());
        dynamicFormFieldsAdapter.setOnAutocompleteRequested(new AnonymousClass6());
        dynamicFormFieldsAdapter.setOnNewPaymentMethodSelected(new AnonymousClass7());
        dynamicFormFieldsAdapter.setOnEditFormClicked(new AnonymousClass8());
        dynamicFormFieldsAdapter.setOnActionClicked(new AnonymousClass9());
        dynamicFormFieldsAdapter.setOnReportErrorClicked(new AnonymousClass10());
        TextView formTitleTv = binding.formTitleTv;
        Intrinsics.checkNotNullExpressionValue(formTitleTv, "formTitleTv");
        ViewExtKt.show(formTitleTv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(FormPageView formPageView, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        View childAt;
        Object findContainingViewHolder;
        RecyclerView recyclerView = formPageView.binding.fieldsRv;
        if (recyclerView == null || (childAt = recyclerView.getChildAt(recyclerView.getChildCount() - 1)) == null || (findContainingViewHolder = recyclerView.findContainingViewHolder(childAt)) == null) {
            return;
        }
        MeasureVH measureVH = findContainingViewHolder instanceof MeasureVH ? (MeasureVH) findContainingViewHolder : null;
        if (measureVH != null) {
            measureVH.onViewMeasured(recyclerView);
        }
    }

    public final Function1<String, Unit> getOnActionClicked() {
        return this.onActionClicked;
    }

    public final Function2<String, String, Unit> getOnAddressClick() {
        return this.onAddressClick;
    }

    public final InterfaceC6511n<String, String, String, Unit> getOnAutocompleteRequested() {
        return this.onAutocompleteRequested;
    }

    public final Function1<FormPageVO.Field, Unit> getOnButtonClick() {
        return this.onButtonClick;
    }

    public final Function1<String, Unit> getOnEditFormClicked() {
        return this.onEditFormClicked;
    }

    public final Function2<FormPageVO.Field, Boolean, Unit> getOnFieldChanged() {
        return this.onFieldChanged;
    }

    public final Function1<String, Unit> getOnNewPaymentMethodSelected() {
        return this.onNewPaymentMethodSelected;
    }

    public final Function1<FormPageVO.Field, Unit> getOnPickerClick() {
        return this.onPickerClick;
    }

    public final Function1<String, Unit> getOnReportErrorClicked() {
        return this.onReportErrorClicked;
    }

    public final Function1<FormPageViewModel.RetryInfo, Unit> getOnRetryClick() {
        return this.onRetryClick;
    }

    public final void hideAlerts() {
        Flashbar flashbar = this.alertFlashbar;
        if (flashbar != null) {
            flashbar.dismiss();
        }
    }

    public final void setFields(@NotNull List<? extends FormPageVO.Field> fields, boolean silent) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.adapter.submitList(fields, silent);
    }

    public final void setOnActionClicked(Function1<? super String, Unit> function1) {
        this.onActionClicked = function1;
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

    public final void setOnRetryClick(Function1<? super FormPageViewModel.RetryInfo, Unit> function1) {
        this.onRetryClick = function1;
    }

    public final void setTitle(String title) {
        TextView formTitleTv = this.binding.formTitleTv;
        Intrinsics.checkNotNullExpressionValue(formTitleTv, "formTitleTv");
        TextViewExtKt.setTextOrGone(formTitleTv, title);
    }

    public final void showAlert(ScreenState screenState, String message) {
        Flashbar flashbar = this.alertFlashbar;
        if (flashbar != null) {
            if (message == null || message.length() == 0) {
                message = null;
            }
            if (message == null) {
                message = screenState instanceof ScreenState.NoConnection ? StringProvider.getString(R$string.error_common_error_no_connection_description) : StringProvider.getString(ru.ozon.app.android.platform.R$string.common_universal_network_error);
            }
            flashbar.setMessage(message);
        }
        Flashbar flashbar2 = this.alertFlashbar;
        if (flashbar2 != null) {
            flashbar2.show();
        }
    }

    public final void showLoading(boolean showing) {
        FrameLayout layoutBackgroundProgressBar = this.binding.layoutBackgroundProgressBar;
        Intrinsics.checkNotNullExpressionValue(layoutBackgroundProgressBar, "layoutBackgroundProgressBar");
        ViewExtKt.showOrGone(layoutBackgroundProgressBar, Boolean.valueOf(showing));
    }

    public final void showRetrySnackBar(@NotNull FormPageViewModel.RetryInfo retryInfo) {
        Intrinsics.checkNotNullParameter(retryInfo, "retryInfo");
        Flashbar flashbar = this.shownRetryFlashbar;
        if (flashbar != null) {
            flashbar.dismiss();
        }
        Context context = this.binding.getConstraintLayout().getContext();
        Intrinsics.g(context, "null cannot be cast to non-null type android.app.Activity");
        ViewGroup rootView = ContextExtKt.getRootView((Activity) context);
        if (rootView != null) {
            FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
            OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(ru.ozon.app.android.platform.R$string.common_message_request_problem));
            int i11 = R$drawable.ic_warning;
            Flashbar create$default = FlashbarFactory.create$default(flashbarFactory, rootView, null, ozonSpannableString, null, null, Integer.valueOf(i11), null, null, null, new Action(StringProvider.getString(ru.ozon.app.android.partpayment.R$string.retry), false, new FormPageView$showRetrySnackBar$1$1(this, retryInfo), 2, null), null, null, null, -1L, null, null, this.viewOwner, 56794, null);
            this.shownRetryFlashbar = create$default;
            create$default.show();
        }
    }
}
