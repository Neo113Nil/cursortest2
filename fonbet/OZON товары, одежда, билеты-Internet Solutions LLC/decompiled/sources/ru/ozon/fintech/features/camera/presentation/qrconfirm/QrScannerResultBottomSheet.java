package ru.ozon.fintech.features.camera.presentation.qrconfirm;

import Ae.x0;
import O30.a;
import O30.c;
import Q90.l;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.b0;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.fintech.base.bottom.m;
import ru.ozon.fintech.features.camera.di.CameraApi;
import ru.ozon.fintech.features.camera.di.CameraComponent;
import ru.ozon.fintech.features.camera.domain.QrBottomSheetViewState;
import xe.C10727i;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 12\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u00172\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u0003R\u001a\u0010 \u001a\u00020\u001f8\u0016X\u0096D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010/¨\u00062"}, d2 = {"Lru/ozon/fintech/features/camera/presentation/qrconfirm/QrScannerResultBottomSheet;", "Lru/ozon/fintech/base/bottom/m;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "isExpanded", "()Z", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "onDestroy", "", "fragmentName", "Ljava/lang/String;", "getFragmentName", "()Ljava/lang/String;", "Lru/ozon/fintech/features/camera/presentation/qrconfirm/QrScannerResultViewModel;", "viewModel$delegate", "LSc/j;", "getViewModel", "()Lru/ozon/fintech/features/camera/presentation/qrconfirm/QrScannerResultViewModel;", "viewModel", "Landroid/widget/TextView;", "titleTv", "Landroid/widget/TextView;", "Landroid/widget/Button;", "negativeBtn", "Landroid/widget/Button;", "positiveBtn", "Companion", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QrScannerResultBottomSheet extends m {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String NEGATIVE_BTN_KEY = "NEGATIVE_BTN_KEY";

    @NotNull
    private static final String POSITIVE_BTN_KEY = "POSITIVE_BTN_KEY";

    @NotNull
    private static final String TITLE_KEY = "TITLE_KEY";

    @NotNull
    private final String fragmentName = "QrScannerResultBottomSheet";
    private Button negativeBtn;
    private Button positiveBtn;
    private TextView titleTv;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModel;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/fintech/features/camera/presentation/qrconfirm/QrScannerResultBottomSheet$Companion;", "", "<init>", "()V", QrScannerResultBottomSheet.TITLE_KEY, "", QrScannerResultBottomSheet.POSITIVE_BTN_KEY, QrScannerResultBottomSheet.NEGATIVE_BTN_KEY, "getBundle", "Landroid/os/Bundle;", SelectionItemFormDTO.TITLE_FIELD_NAME, "positiveButton", "negativeButton", "newInstance", "Lru/ozon/fintech/features/camera/presentation/qrconfirm/QrScannerResultBottomSheet;", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Bundle getBundle(@NotNull String title, @NotNull String positiveButton, @NotNull String negativeButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(positiveButton, "positiveButton");
            Intrinsics.checkNotNullParameter(negativeButton, "negativeButton");
            Bundle bundle = new Bundle();
            bundle.putString(QrScannerResultBottomSheet.TITLE_KEY, title);
            bundle.putString(QrScannerResultBottomSheet.POSITIVE_BTN_KEY, positiveButton);
            bundle.putString(QrScannerResultBottomSheet.NEGATIVE_BTN_KEY, negativeButton);
            return bundle;
        }

        @NotNull
        public final QrScannerResultBottomSheet newInstance(@NotNull String title, @NotNull String positiveButton, @NotNull String negativeButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(positiveButton, "positiveButton");
            Intrinsics.checkNotNullParameter(negativeButton, "negativeButton");
            QrScannerResultBottomSheet qrScannerResultBottomSheet = new QrScannerResultBottomSheet();
            qrScannerResultBottomSheet.setArguments(QrScannerResultBottomSheet.INSTANCE.getBundle(title, positiveButton, negativeButton));
            return qrScannerResultBottomSheet;
        }

        private Companion() {
        }
    }

    public QrScannerResultBottomSheet() {
        l lVar = new l(this, 3);
        InterfaceC4008j a11 = k.a(n.NONE, new QrScannerResultBottomSheet$special$$inlined$viewModels$default$2(new QrScannerResultBottomSheet$special$$inlined$viewModels$default$1(this)));
        this.viewModel = b0.b(this, N.b(QrScannerResultViewModel.class), new QrScannerResultBottomSheet$special$$inlined$viewModels$default$3(a11), new QrScannerResultBottomSheet$special$$inlined$viewModels$default$4(null, a11), lVar);
    }

    @NotNull
    public static final Bundle getBundle(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        return INSTANCE.getBundle(str, str2, str3);
    }

    private final QrScannerResultViewModel getViewModel() {
        return (QrScannerResultViewModel) this.viewModel.getValue();
    }

    @NotNull
    public static final QrScannerResultBottomSheet newInstance(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        return INSTANCE.newInstance(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3(QrScannerResultBottomSheet qrScannerResultBottomSheet, View view) {
        qrScannerResultBottomSheet.getViewModel().negativeButtonClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$4(QrScannerResultBottomSheet qrScannerResultBottomSheet, View view) {
        qrScannerResultBottomSheet.getViewModel().positiveButtonClicked();
    }

    @Override // ru.ozon.fintech.base.bottom.m
    @NotNull
    /* renamed from: getFragmentName, reason: from getter */
    public String getF95217a() {
        return this.fragmentName;
    }

    @Override // ru.ozon.fintech.base.bottom.m
    public boolean isExpanded() {
        return false;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((CameraComponent) a.a(c.a(requireActivity)).a(CameraApi.class)).inject(this);
        super.onAttach(context);
    }

    @Override // ru.ozon.fintech.base.bottom.h, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString(TITLE_KEY, "");
            String string2 = arguments.getString(POSITIVE_BTN_KEY, "");
            String string3 = arguments.getString(NEGATIVE_BTN_KEY, "");
            QrScannerResultViewModel viewModel = getViewModel();
            Intrinsics.f(string);
            Intrinsics.f(string2);
            Intrinsics.f(string3);
            viewModel.onCreate(string, string2, string3);
        }
    }

    @Override // ru.ozon.fintech.base.bottom.m, ru.ozon.fintech.base.bottom.h, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog onCreateDialog = super.onCreateDialog(savedInstanceState);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setDimAmount(0.3f);
        }
        return onCreateDialog;
    }

    @Override // ru.ozon.fintech.base.bottom.m, androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, container, savedInstanceState);
        View inflate = getLayoutInflater().inflate(R.layout.qr_scanner_result_fragment, container, false);
        this.titleTv = (TextView) inflate.findViewById(R.id.rules_web_bank_text);
        this.negativeBtn = (Button) inflate.findViewById(R.id.negative_btn);
        this.positiveBtn = (Button) inflate.findViewById(R.id.positive_btn);
        FrameLayout topContainer = getTopContainer();
        if (topContainer != null) {
            topContainer.setVisibility(8);
        }
        FrameLayout bottomContainer = getBottomContainer();
        if (bottomContainer != null) {
            bottomContainer.setVisibility(8);
        }
        FrameLayout mainContainer = getMainContainer();
        if (mainContainer != null) {
            mainContainer.addView(inflate);
        }
        return onCreateView;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroy() {
        super.onDestroy();
        getViewModel().closed();
    }

    @Override // ru.ozon.fintech.base.bottom.m, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        this.titleTv = null;
        this.negativeBtn = null;
        this.positiveBtn = null;
    }

    @Override // ru.ozon.fintech.base.bottom.m, androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        Button button = this.negativeBtn;
        if (button != null) {
            button.setOnClickListener(new AU.a(this, 12));
        }
        Button button2 = this.positiveBtn;
        if (button2 != null) {
            button2.setOnClickListener(new Nt.a(this, 10));
        }
        x0<QrBottomSheetViewState> viewElementsState = getViewModel().getViewElementsState();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner), null, null, new QrScannerResultBottomSheet$onViewCreated$$inlined$observe$1(this, viewElementsState, null, this), 3);
    }
}
