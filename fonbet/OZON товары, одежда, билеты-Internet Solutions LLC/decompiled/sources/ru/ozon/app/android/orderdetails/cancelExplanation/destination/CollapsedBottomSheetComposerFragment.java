package ru.ozon.app.android.orderdetails.cancelExplanation.destination;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.w;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.uikit.R$style;
import ru.ozon.uni.android.component.sheet.SheetSoftInputMode;
import uZ.C9992d;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/app/android/orderdetails/cancelExplanation/destination/CollapsedBottomSheetComposerFragment;", "Lru/ozon/app/android/composer/universalscreen/view/BottomSheetComposerFragment;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/appcompat/app/w;", "onCreateDialog", "(Landroid/os/Bundle;)Landroidx/appcompat/app/w;", "Companion", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CollapsedBottomSheetComposerFragment extends BottomSheetComposerFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/orderdetails/cancelExplanation/destination/CollapsedBottomSheetComposerFragment$Companion;", "", "<init>", "()V", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "config", "Lru/ozon/app/android/composer/universalscreen/view/BottomSheetComposerFragment$OverrideDisplayMode;", "overrideDisplayMode", "LuZ/d$b;", "navigationMode", "Lkotlin/Function1;", "Landroid/os/Bundle;", "", "additionalArgsProvider", "Lru/ozon/app/android/orderdetails/cancelExplanation/destination/CollapsedBottomSheetComposerFragment;", "newInstance", "(Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;Lru/ozon/app/android/composer/universalscreen/view/BottomSheetComposerFragment$OverrideDisplayMode;LuZ/d$b;Lkotlin/jvm/functions/Function1;)Lru/ozon/app/android/orderdetails/cancelExplanation/destination/CollapsedBottomSheetComposerFragment;", "", "ARG_CONFIG", "Ljava/lang/String;", "NAVIGATION_MODE_CONFIG", "ADDITIONAL_ARGS", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CollapsedBottomSheetComposerFragment newInstance(@NotNull ComposerScreenConfig config, BottomSheetComposerFragment.OverrideDisplayMode overrideDisplayMode, @NotNull C9992d.b navigationMode, Function1<? super Bundle, Unit> additionalArgsProvider) {
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
            CollapsedBottomSheetComposerFragment collapsedBottomSheetComposerFragment = new CollapsedBottomSheetComposerFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("NAVIGATION_MODE_CONFIG", navigationMode);
            bundle.putParcelable("ARG_CONFIG", composerScreenConfig);
            if (additionalArgsProvider != null) {
                Bundle bundle2 = new Bundle();
                additionalArgsProvider.invoke(bundle2);
                bundle.putBundle("ADDITIONAL_ARGS", bundle2);
            }
            collapsedBottomSheetComposerFragment.setArguments(bundle);
            return collapsedBottomSheetComposerFragment;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SheetSoftInputMode.values().length];
            try {
                iArr[SheetSoftInputMode.ADJUST_RESIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SheetSoftInputMode.ADJUST_PAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment, com.google.android.material.bottomsheet.b, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public w onCreateDialog(Bundle savedInstanceState) {
        ComposerScreenConfig.BottomSheetConfig bottomSheetConfig = getScreenConfig().getBottomSheetConfig();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        SheetSoftInputMode softInputMode = bottomSheetConfig != null ? bottomSheetConfig.getSoftInputMode() : null;
        int i11 = softInputMode == null ? -1 : WhenMappings.$EnumSwitchMapping$0[softInputMode.ordinal()];
        return new PeekHeightBottomSheetDialog(requireContext, i11 != 1 ? i11 != 2 ? 0 : R$style.OzonBottomSheetDialog_AdjustPan : R$style.OzonBottomSheetDialog_AdjustResize, 4, bottomSheetConfig != null ? bottomSheetConfig.getShowHandle() : true, (bottomSheetConfig != null ? bottomSheetConfig.getDisplayMode() : null) == ComposerFragment.DisplayMode.BOTTOM_SHEET_WRAP, null, bottomSheetConfig != null ? bottomSheetConfig.getCancelable() : true, Integer.valueOf(requireContext().getResources().getDisplayMetrics().heightPixels / 2), 32, null);
    }
}
