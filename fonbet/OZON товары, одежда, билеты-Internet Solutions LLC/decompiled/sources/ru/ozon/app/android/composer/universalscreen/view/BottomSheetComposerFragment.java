package ru.ozon.app.android.composer.universalscreen.view;

import EZ.h;
import GZ.g;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.M;
import androidx.appcompat.app.w;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.J;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import i10.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.uni.android.component.sheet.SheetDialog;
import ru.ozon.uni.android.component.sheet.SheetSoftInputMode;
import uZ.AbstractC9990b;
import uZ.C9992d;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 32\u00020\u0001:\u000234B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00142\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u00020\u001e8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102¨\u00065"}, d2 = {"Lru/ozon/app/android/composer/universalscreen/view/BottomSheetComposerFragment;", "LuZ/b;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroidx/appcompat/app/w;", "onCreateDialog", "(Landroid/os/Bundle;)Landroidx/appcompat/app/w;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "screenConfig", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "getScreenConfig", "()Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "setScreenConfig", "(Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;)V", "LuZ/d$b;", "navigationMode", "LuZ/d$b;", "additionalArgs", "Landroid/os/Bundle;", "LEZ/h;", "navigatorHolder", "LEZ/h;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "LGZ/g;", "router", "LGZ/g;", "Companion", "OverrideDisplayMode", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class BottomSheetComposerFragment extends AbstractC9990b {
    private Bundle additionalArgs;
    private FeatureChecker featureChecker;
    private C9992d.b navigationMode;
    private h navigatorHolder;
    private g router;
    protected ComposerScreenConfig screenConfig;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/composer/universalscreen/view/BottomSheetComposerFragment$Companion;", "", "<init>", "()V", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;", "config", "Lru/ozon/app/android/composer/universalscreen/view/BottomSheetComposerFragment$OverrideDisplayMode;", "overrideDisplayMode", "LuZ/d$b;", "navigationMode", "Lkotlin/Function1;", "Landroid/os/Bundle;", "", "additionalArgsProvider", "Lru/ozon/app/android/composer/universalscreen/view/BottomSheetComposerFragment;", "newInstance", "(Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig;Lru/ozon/app/android/composer/universalscreen/view/BottomSheetComposerFragment$OverrideDisplayMode;LuZ/d$b;Lkotlin/jvm/functions/Function1;)Lru/ozon/app/android/composer/universalscreen/view/BottomSheetComposerFragment;", "", "ARG_CONFIG", "Ljava/lang/String;", "NAVIGATION_MODE_CONFIG", "ADDITIONAL_ARGS", "CURRENT_URL", "", "DISMISS_ACTIVITY_RESULT", "I", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BottomSheetComposerFragment newInstance(@NotNull ComposerScreenConfig config, OverrideDisplayMode overrideDisplayMode, @NotNull C9992d.b navigationMode, Function1<? super Bundle, Unit> additionalArgsProvider) {
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
            BottomSheetComposerFragment bottomSheetComposerFragment = new BottomSheetComposerFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("NAVIGATION_MODE_CONFIG", navigationMode);
            bundle.putParcelable("ARG_CONFIG", composerScreenConfig);
            if (additionalArgsProvider != null) {
                Bundle bundle2 = new Bundle();
                additionalArgsProvider.invoke(bundle2);
                bundle.putBundle("ADDITIONAL_ARGS", bundle2);
            }
            bottomSheetComposerFragment.setArguments(bundle);
            return bottomSheetComposerFragment;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/composer/universalscreen/view/BottomSheetComposerFragment$OverrideDisplayMode;", "", "Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment$DisplayMode;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment$DisplayMode;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment$DisplayMode;", "getValue", "()Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment$DisplayMode;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OverrideDisplayMode {

        @NotNull
        private final ComposerFragment.DisplayMode value;

        public OverrideDisplayMode(@NotNull ComposerFragment.DisplayMode value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OverrideDisplayMode) && this.value == ((OverrideDisplayMode) other).value;
        }

        @NotNull
        public final ComposerFragment.DisplayMode getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        @NotNull
        public String toString() {
            return "OverrideDisplayMode(value=" + this.value + ")";
        }
    }

    @NotNull
    protected final ComposerScreenConfig getScreenConfig() {
        ComposerScreenConfig composerScreenConfig = this.screenConfig;
        if (composerScreenConfig != null) {
            return composerScreenConfig;
        }
        Intrinsics.n("screenConfig");
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        NavigationComponentApi navigationComponentApi = (NavigationComponentApi) dependencyStorage.b(NavigationComponentApi.class);
        this.navigatorHolder = navigationComponentApi.getNavigatorHolder();
        this.router = navigationComponentApi.getOzonRouter();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        C6740b dependencyStorage2 = C6739a.a(context, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        this.featureChecker = ((NetworkComponentApi) dependencyStorage2.b(NetworkComponentApi.class)).getFeatureChecker();
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        ComposerScreenConfig composerScreenConfig;
        C9992d.b bVar;
        Object parcelable;
        Object parcelable2;
        Parcelable parcelable3;
        Object parcelable4;
        Parcelable parcelable5;
        Object parcelable6;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        Bundle bundle = null;
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable6 = arguments.getParcelable("ARG_CONFIG", ComposerScreenConfig.class);
                parcelable5 = (Parcelable) parcelable6;
            } else {
                parcelable5 = arguments.getParcelable("ARG_CONFIG");
            }
            composerScreenConfig = (ComposerScreenConfig) parcelable5;
        } else {
            composerScreenConfig = null;
        }
        if (composerScreenConfig == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        setScreenConfig(composerScreenConfig);
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable4 = arguments2.getParcelable("NAVIGATION_MODE_CONFIG", C9992d.b.class);
                parcelable3 = (Parcelable) parcelable4;
            } else {
                parcelable3 = arguments2.getParcelable("NAVIGATION_MODE_CONFIG");
            }
            bVar = (C9992d.b) parcelable3;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.navigationMode = bVar;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments3.getParcelable("ADDITIONAL_ARGS", Bundle.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                parcelable = arguments3.getParcelable("ADDITIONAL_ARGS");
            }
            bundle = (Bundle) parcelable;
        }
        this.additionalArgs = bundle;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(requireContext);
        fragmentContainerView.setId(R.id.fragmentContainer);
        fragmentContainerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        String c11;
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        InterfaceC5431s parentFragment = getParentFragment();
        DismissBottomSheetListener dismissBottomSheetListener = parentFragment instanceof DismissBottomSheetListener ? (DismissBottomSheetListener) parentFragment : null;
        if (dismissBottomSheetListener != null) {
            dismissBottomSheetListener.onBottomSheetDismiss();
        } else {
            M activity = getActivity();
            DismissBottomSheetListener dismissBottomSheetListener2 = activity instanceof DismissBottomSheetListener ? (DismissBottomSheetListener) activity : null;
            if (dismissBottomSheetListener2 != null) {
                dismissBottomSheetListener2.onBottomSheetDismiss();
            }
        }
        ComposerScreenConfig.BottomSheetConfig bottomSheetConfig = getScreenConfig().getBottomSheetConfig();
        if (bottomSheetConfig != null && bottomSheetConfig.getIsDismissActivityResult()) {
            h.c pageRef = getScreenConfig().getPageRef();
            h.c.a aVar = pageRef instanceof h.c.a ? (h.c.a) pageRef : null;
            if (aVar == null || (c11 = aVar.c()) == null) {
                return;
            }
            ComponentCallbacksC5392m targetFragment = getTargetFragment();
            if (targetFragment != null) {
                Intent intent = new Intent();
                intent.putExtra("CURRENT_URL", c11);
                Unit unit = Unit.f71690a;
                targetFragment.onActivityResult(1777, -1, intent);
            }
        }
        KeyboardUtilsKt.hideKeyboard(this);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        EZ.h hVar = this.navigatorHolder;
        if (hVar == null) {
            Intrinsics.n("navigatorHolder");
            throw null;
        }
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ComposerScreenConfig screenConfig = getScreenConfig();
        C9992d.b bVar = this.navigationMode;
        if (bVar != null) {
            yZ.h.b(hVar, viewLifecycleOwner, new BottomSheetDialogFragmentNavigator(this, screenConfig, bVar, this.additionalArgs));
        } else {
            Intrinsics.n("navigationMode");
            throw null;
        }
    }

    protected final void setScreenConfig(@NotNull ComposerScreenConfig composerScreenConfig) {
        Intrinsics.checkNotNullParameter(composerScreenConfig, "<set-?>");
        this.screenConfig = composerScreenConfig;
    }

    @Override // com.google.android.material.bottomsheet.b, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public w onCreateDialog(Bundle savedInstanceState) {
        SheetSoftInputMode sheetSoftInputMode;
        ComposerScreenConfig.BottomSheetConfig bottomSheetConfig = getScreenConfig().getBottomSheetConfig();
        boolean cancelable = bottomSheetConfig != null ? bottomSheetConfig.getCancelable() : true;
        setCancelable(cancelable);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        if (bottomSheetConfig == null || (sheetSoftInputMode = bottomSheetConfig.getSoftInputMode()) == null) {
            sheetSoftInputMode = SheetSoftInputMode.UNSPECIFIED;
        }
        return new SheetDialog(requireContext, 0, false, 0, (bottomSheetConfig != null ? bottomSheetConfig.getDisplayMode() : null) == ComposerFragment.DisplayMode.BOTTOM_SHEET_WRAP, false, null, null, bottomSheetConfig != null ? bottomSheetConfig.getShowHandle() : true, false, null, false, 0, cancelable, sheetSoftInputMode, 7918, null);
    }
}
