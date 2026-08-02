package ru.ozon.app.android.account.orders.barcodePopover.v1.navigation;

import Hj.C3143a;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Outline;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.w;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.account.orders.barcodePopover.v1.navigation.BarcodePopoverBottomSheetComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.core.UniColors;
import uZ.C9992d;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/account/orders/barcodePopover/v1/navigation/BarcodePopoverBottomSheetComposerFragment;", "Lru/ozon/app/android/composer/universalscreen/view/BottomSheetComposerFragment;", "<init>", "()V", "Lcom/google/android/material/bottomsheet/a;", "bottomSheetDialog", "", "setupBottomSheet", "(Lcom/google/android/material/bottomsheet/a;)V", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/appcompat/app/w;", "onCreateDialog", "(Landroid/os/Bundle;)Landroidx/appcompat/app/w;", "", "dialogMarginHorizontal", "I", "dialogMarginTop", "dialogMarginBottom", "", "dialogCornerRadius", "F", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BarcodePopoverBottomSheetComposerFragment extends BottomSheetComposerFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int dialogMarginHorizontal = ResourceExtKt.toPx(8);
    private final int dialogMarginTop = ResourceExtKt.toPx(20);
    private final int dialogMarginBottom = ResourceExtKt.toPx(14);
    private final float dialogCornerRadius = ResourceExtKt.toPxF(24);

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/account/orders/barcodePopover/v1/navigation/BarcodePopoverBottomSheetComposerFragment$Companion;", "", "<init>", "()V", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "config", "Lru/ozon/app/android/composer/universalscreen/view/BottomSheetComposerFragment$OverrideDisplayMode;", "overrideDisplayMode", "LuZ/d$b;", "navigationMode", "Lkotlin/Function1;", "Landroid/os/Bundle;", "", "additionalArgsProvider", "Lru/ozon/app/android/composer/universalscreen/view/BottomSheetComposerFragment;", "newInstance", "(Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;Lru/ozon/app/android/composer/universalscreen/view/BottomSheetComposerFragment$OverrideDisplayMode;LuZ/d$b;Lkotlin/jvm/functions/Function1;)Lru/ozon/app/android/composer/universalscreen/view/BottomSheetComposerFragment;", "", "ARG_CONFIG", "Ljava/lang/String;", "NAVIGATION_MODE_CONFIG", "ADDITIONAL_ARGS", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BottomSheetComposerFragment newInstance(@NotNull ComposerScreenConfig config, BottomSheetComposerFragment.OverrideDisplayMode overrideDisplayMode, @NotNull C9992d.b navigationMode, Function1<? super Bundle, Unit> additionalArgsProvider) {
            ComposerScreenConfig.BottomSheetConfig bottomSheetConfig;
            ComposerScreenConfig.BottomSheetConfig copy$default;
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(navigationMode, "navigationMode");
            ComposerScreenConfig.BottomSheetConfig bottomSheetConfig2 = config.getBottomSheetConfig();
            if (bottomSheetConfig2 != null) {
                if (overrideDisplayMode != null && (copy$default = ComposerScreenConfig.BottomSheetConfig.copy$default(bottomSheetConfig2, overrideDisplayMode.getValue(), false, false, null, 0, false, false, false, false, false, false, 2046, null)) != null) {
                    bottomSheetConfig2 = copy$default;
                }
                bottomSheetConfig = bottomSheetConfig2;
            } else {
                bottomSheetConfig = overrideDisplayMode != null ? new ComposerScreenConfig.BottomSheetConfig(overrideDisplayMode.getValue(), false, false, null, 0, false, false, false, false, false, false, 2046, null) : new ComposerScreenConfig.BottomSheetConfig(null, false, false, null, 0, false, false, false, false, false, false, 2047, null);
            }
            ComposerScreenConfig composerScreenConfig = Intrinsics.d(config.getBottomSheetConfig(), bottomSheetConfig) ? config : null;
            if (composerScreenConfig == null) {
                composerScreenConfig = ComposerScreenConfig.copy$default(config, null, null, false, bottomSheetConfig, false, false, false, false, null, false, false, false, null, null, null, null, false, null, null, null, false, false, null, null, 16777207, null);
            }
            BarcodePopoverBottomSheetComposerFragment barcodePopoverBottomSheetComposerFragment = new BarcodePopoverBottomSheetComposerFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("NAVIGATION_MODE_CONFIG", navigationMode);
            bundle.putParcelable("ARG_CONFIG", composerScreenConfig);
            if (additionalArgsProvider != null) {
                Bundle bundle2 = new Bundle();
                additionalArgsProvider.invoke(bundle2);
                bundle.putBundle("ADDITIONAL_ARGS", bundle2);
            }
            barcodePopoverBottomSheetComposerFragment.setArguments(bundle);
            return barcodePopoverBottomSheetComposerFragment;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateDialog$lambda$0(BarcodePopoverBottomSheetComposerFragment barcodePopoverBottomSheetComposerFragment, DialogInterface dialogInterface) {
        Intrinsics.g(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        barcodePopoverBottomSheetComposerFragment.setupBottomSheet((a) dialogInterface);
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
        childAt.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.account.orders.barcodePopover.v1.navigation.BarcodePopoverBottomSheetComposerFragment$setupBottomSheet$3$2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                float f7;
                int f11 = C3143a.f(view, "view", outline, "outline");
                int height = view.getHeight();
                f7 = BarcodePopoverBottomSheetComposerFragment.this.dialogCornerRadius;
                outline.setRoundRect(0, 0, f11, height, f7);
            }
        });
        childAt.setClipToOutline(true);
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment, com.google.android.material.bottomsheet.b, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public w onCreateDialog(Bundle savedInstanceState) {
        a aVar = new a(requireContext(), getTheme());
        Window window = aVar.getWindow();
        if (window != null) {
            window.setDimAmount(0.3f);
        }
        aVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: ik.a
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                BarcodePopoverBottomSheetComposerFragment.onCreateDialog$lambda$0(BarcodePopoverBottomSheetComposerFragment.this, dialogInterface);
            }
        });
        return aVar;
    }
}
