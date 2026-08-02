package ru.ozon.app.android.account.orders.emptyscreen.antibot.modal;

import Hj.C3143a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Outline;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.activity.L;
import androidx.activity.s;
import androidx.fragment.app.b0;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.a;
import com.google.android.material.bottomsheet.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.account.orders.barcodePopover.v1.presentation.BarcodePopoverViewModel;
import ru.ozon.app.android.account.orders.barcodePopover.v1.presentation.BarcodePopoverWidgetView;
import ru.ozon.app.android.account.orders.barcodePopover.v1.viewObject.BarcodePopoverVO;
import ru.ozon.app.android.account.orders.emptyscreen.antibot.modal.AntibotBarcodePopoverBottomSheetFragment;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;
import xe.C10727i;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0001\u0018\u0000 02\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u001c2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\u0003R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010,\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Lru/ozon/app/android/account/orders/emptyscreen/antibot/modal/AntibotBarcodePopoverBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "Lcom/google/android/material/bottomsheet/a;", "bottomSheetDialog", "", "setupBottomSheet", "(Lcom/google/android/material/bottomsheet/a;)V", "Landroid/content/Context;", "context", "createLightWrapper", "(Landroid/content/Context;)Landroid/content/Context;", "Lru/ozon/app/android/account/orders/barcodePopover/v1/presentation/BarcodePopoverWidgetView;", "view", "Lru/ozon/app/android/account/orders/barcodePopover/v1/viewObject/BarcodePopoverVO;", "item", "setBarcode", "(Lru/ozon/app/android/account/orders/barcodePopover/v1/presentation/BarcodePopoverWidgetView;Lru/ozon/app/android/account/orders/barcodePopover/v1/viewObject/BarcodePopoverVO;)V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onPause", "Lru/ozon/app/android/account/orders/barcodePopover/v1/presentation/BarcodePopoverViewModel;", "viewModel$delegate", "LSc/j;", "getViewModel", "()Lru/ozon/app/android/account/orders/barcodePopover/v1/presentation/BarcodePopoverViewModel;", "viewModel", "", "dialogMarginHorizontal", "I", "dialogMarginTop", "dialogMarginBottom", "", "dialogCornerRadius", "F", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AntibotBarcodePopoverBottomSheetFragment extends b {
    private final float dialogCornerRadius;
    private final int dialogMarginBottom;
    private final int dialogMarginHorizontal;
    private final int dialogMarginTop;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/account/orders/emptyscreen/antibot/modal/AntibotBarcodePopoverBottomSheetFragment$Companion;", "", "<init>", "()V", "BARCODE_ITEM_KEY", "", "THEME_ID_KEY", "newInstance", "Lru/ozon/app/android/account/orders/emptyscreen/antibot/modal/AntibotBarcodePopoverBottomSheetFragment;", "barcodePopover", "Lru/ozon/app/android/account/orders/barcodePopover/v1/viewObject/BarcodePopoverVO;", "themeId", "", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AntibotBarcodePopoverBottomSheetFragment newInstance(@NotNull BarcodePopoverVO barcodePopover, int themeId) {
            Intrinsics.checkNotNullParameter(barcodePopover, "barcodePopover");
            AntibotBarcodePopoverBottomSheetFragment antibotBarcodePopoverBottomSheetFragment = new AntibotBarcodePopoverBottomSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("BARCODE_ITEM_KEY", barcodePopover);
            bundle.putInt("THEME_ID_KEY", themeId);
            antibotBarcodePopoverBottomSheetFragment.setArguments(bundle);
            return antibotBarcodePopoverBottomSheetFragment;
        }

        private Companion() {
        }
    }

    public AntibotBarcodePopoverBottomSheetFragment() {
        InterfaceC4008j a11 = k.a(n.NONE, new AntibotBarcodePopoverBottomSheetFragment$special$$inlined$viewModels$default$2(new AntibotBarcodePopoverBottomSheetFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel = b0.b(this, N.b(BarcodePopoverViewModel.class), new AntibotBarcodePopoverBottomSheetFragment$special$$inlined$viewModels$default$3(a11), new AntibotBarcodePopoverBottomSheetFragment$special$$inlined$viewModels$default$4(null, a11), new AntibotBarcodePopoverBottomSheetFragment$special$$inlined$viewModels$default$5(this, a11));
        this.dialogMarginHorizontal = ResourceExtKt.toPx(8);
        this.dialogMarginTop = ResourceExtKt.toPx(20);
        this.dialogMarginBottom = ResourceExtKt.toPx(14);
        this.dialogCornerRadius = ResourceExtKt.toPxF(24);
    }

    private final Context createLightWrapper(Context context) {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return context;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, arguments.getInt("THEME_ID_KEY"));
        Configuration configuration = new Configuration();
        configuration.uiMode = 16;
        contextThemeWrapper.applyOverrideConfiguration(configuration);
        return contextThemeWrapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BarcodePopoverViewModel getViewModel() {
        return (BarcodePopoverViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateDialog$lambda$0(AntibotBarcodePopoverBottomSheetFragment antibotBarcodePopoverBottomSheetFragment, DialogInterface dialogInterface) {
        Intrinsics.g(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        antibotBarcodePopoverBottomSheetFragment.setupBottomSheet((a) dialogInterface);
    }

    private final void setBarcode(BarcodePopoverWidgetView view, BarcodePopoverVO item) {
        C10727i.c(K.a(this), null, null, new AntibotBarcodePopoverBottomSheetFragment$setBarcode$1(this, item, view, null), 3);
    }

    private final void setupBottomSheet(a bottomSheetDialog) {
        Window window;
        FrameLayout frameLayout = (FrameLayout) bottomSheetDialog.findViewById(R.id.design_bottom_sheet);
        if (frameLayout == null) {
            return;
        }
        frameLayout.setBackgroundColor(0);
        BottomSheetBehavior from = BottomSheetBehavior.from(frameLayout);
        Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.clearFlags(67108864);
            window.addFlags(LinearLayoutManager.INVALID_OFFSET);
            window.setLayout(-1, -1);
        }
        from.setState(3);
        from.setSkipCollapsed(true);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.height = -1;
        frameLayout.setLayoutParams(marginLayoutParams);
        View childAt = frameLayout.getChildAt(0);
        Intrinsics.f(childAt);
        ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        int i11 = this.dialogMarginTop;
        int i12 = this.dialogMarginHorizontal;
        marginLayoutParams2.setMargins(i12, i11, i12, this.dialogMarginBottom);
        childAt.setLayoutParams(marginLayoutParams2);
        childAt.setBackgroundColor(androidx.core.content.a.getColor(childAt.getContext(), UniColors.LAYER_FLOOR_1.getResId()));
        childAt.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.account.orders.emptyscreen.antibot.modal.AntibotBarcodePopoverBottomSheetFragment$setupBottomSheet$3$2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                float f7;
                int f11 = C3143a.f(view, "view", outline, "outline");
                int height = view.getHeight();
                f7 = AntibotBarcodePopoverBottomSheetFragment.this.dialogCornerRadius;
                outline.setRoundRect(0, 0, f11, height, f7);
            }
        });
        childAt.setClipToOutline(true);
    }

    @Override // com.google.android.material.bottomsheet.b, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getContext();
        if (context == null) {
            Dialog onCreateDialog = super.onCreateDialog(savedInstanceState);
            Intrinsics.checkNotNullExpressionValue(onCreateDialog, "onCreateDialog(...)");
            return onCreateDialog;
        }
        a aVar = new a(context, getTheme());
        Window window = aVar.getWindow();
        if (window != null) {
            window.setDimAmount(0.3f);
        }
        aVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: Mk.b
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                AntibotBarcodePopoverBottomSheetFragment.onCreateDialog$lambda$0(AntibotBarcodePopoverBottomSheetFragment.this, dialogInterface);
            }
        });
        return aVar;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context context = getContext();
        if (context == null) {
            return super.onCreateView(inflater, container, savedInstanceState);
        }
        return new BarcodePopoverWidgetView(createLightWrapper(context), null, 0, 6, null);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onPause() {
        Window window;
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setWindowAnimations(-1);
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Parcelable parcelable;
        Object parcelable2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Dialog dialog = getDialog();
        Intrinsics.g(dialog, "null cannot be cast to non-null type androidx.activity.ComponentDialog");
        L.a(((s) dialog).getOnBackPressedDispatcher(), this, new AntibotBarcodePopoverBottomSheetFragment$onViewCreated$1(this), 2);
        Bundle arguments = getArguments();
        if (arguments == null) {
            parcelable = null;
        } else if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = arguments.getParcelable("BARCODE_ITEM_KEY", Parcelable.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            parcelable = arguments.getParcelable("BARCODE_ITEM_KEY");
        }
        if (parcelable == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        BarcodePopoverVO barcodePopoverVO = (BarcodePopoverVO) parcelable;
        BarcodePopoverWidgetView barcodePopoverWidgetView = view instanceof BarcodePopoverWidgetView ? (BarcodePopoverWidgetView) view : null;
        if (barcodePopoverWidgetView != null) {
            IconButtonV3View iconButtonView = barcodePopoverWidgetView.getIconButtonView();
            IconButtonV3HolderKt.bind$default(iconButtonView, barcodePopoverVO.getCloseButton(), null, 2, null);
            iconButtonView.setOnClickListener(new BS.a(this, 4));
            TextHolderKt.bind$default(barcodePopoverWidgetView.getTitleTav(), barcodePopoverVO.getTitle(), null, 2, null);
            setBarcode(barcodePopoverWidgetView, barcodePopoverVO);
        }
    }
}
