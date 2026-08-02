package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.bottomsheet;

import Pc.a;
import WZ.i;
import WZ.l;
import WZ.t;
import WZ.y;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k;
import androidx.lifecycle.J;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import com.google.android.material.bottomsheet.b;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import iF.RunnableC7028a;
import io.reactivex.AbstractC7094b;
import io.reactivex.p;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.NonViewFilter;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.pdp.ui.configurators.NotificationsKt;
import ru.ozon.app.android.pdp.ui.configurators.R$layout;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.ui.configurators.databinding.FragmentPdpComparisonCharateristicsPickBinding;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics.characteristicsPick.CharacteristicsPickVO;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.di.CharacteristicsPickBottomSheetFragmentComponent;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.di.DaggerCharacteristicsPickBottomSheetFragmentComponent;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.uikit.utils.NotificationBarHelperKt;
import ru.ozon.app.android.uikit.view.dialog.OzonBottomSheetDialog;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;
import sZ.c;
import z00.g;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 N2\u00020\u0001:\u0001NB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u001b\u0010\u000f\u001a\u00020\b*\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b\"\u0010#J-\u0010(\u001a\u0004\u0018\u00010\f2\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b(\u0010)J!\u0010+\u001a\u00020\b2\u0006\u0010*\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\bH\u0016¢\u0006\u0004\b-\u0010\u0003J\u0017\u00100\u001a\u00020\b2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\bH\u0016¢\u0006\u0004\b2\u0010\u0003R\"\u00104\u001a\u0002038\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R(\u0010<\u001a\b\u0012\u0004\u0012\u00020;0:8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0018\u0010B\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010I\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010M\u001a\u00020H8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006O"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/bottomsheet/CharacteristicsPickBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickVO$CellData;", "cellData", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/bottomsheet/CharacteristicsFilterAdapter;", "adapter", "", "setupView", "(Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickVO$CellData;Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/bottomsheet/CharacteristicsFilterAdapter;)V", "submitResult", "Landroid/view/View;", "", "isVisible", "setButtonVisibility", "(Landroid/view/View;Z)V", "", "error", "showError", "(Ljava/lang/Throwable;)V", "LWZ/t;", "event", "LWZ/i;", "filter", "sendAnalytics", "(LWZ/t;LWZ/i;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "onDestroyView", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "setAppType", "(Lru/ozon/app/android/utils/AppType;)V", "LPc/a;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/bottomsheet/ComparisonBottomSheetViewModel;", "provider", "LPc/a;", "getProvider", "()LPc/a;", "setProvider", "(LPc/a;)V", "viewModel", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/bottomsheet/ComparisonBottomSheetViewModel;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/bottomsheet/CharacteristicsFilterAdapter;", "LWZ/l;", "tokenizedAnalytics", "LWZ/l;", "Lru/ozon/app/android/pdp/ui/configurators/databinding/FragmentPdpComparisonCharateristicsPickBinding;", "_binding", "Lru/ozon/app/android/pdp/ui/configurators/databinding/FragmentPdpComparisonCharateristicsPickBinding;", "getBinding", "()Lru/ozon/app/android/pdp/ui/configurators/databinding/FragmentPdpComparisonCharateristicsPickBinding;", "binding", "Companion", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CharacteristicsPickBottomSheetFragment extends b {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private FragmentPdpComparisonCharateristicsPickBinding _binding;

    @NotNull
    private final CharacteristicsFilterAdapter adapter = new CharacteristicsFilterAdapter(new CharacteristicsPickBottomSheetFragment$adapter$1(this));
    public AppType appType;
    public a<ComparisonBottomSheetViewModel> provider;
    private l tokenizedAnalytics;
    private ComparisonBottomSheetViewModel viewModel;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/bottomsheet/CharacteristicsPickBottomSheetFragment$Companion;", "", "<init>", "()V", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickVO$CellData;", "cellData", "LWZ/l;", "tokenizedAnalytics", "LsZ/c;", "Landroidx/fragment/app/k;", "newInstance", "(Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/characteristicsPick/CharacteristicsPickVO$CellData;LWZ/l;)LsZ/c;", "", "TAG", "Ljava/lang/String;", "CELL_DATA", "ACTION_ID", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final c<DialogInterfaceOnCancelListenerC5390k> newInstance(@NotNull CharacteristicsPickVO.CellData cellData, @NotNull l tokenizedAnalytics) {
            Intrinsics.checkNotNullParameter(cellData, "cellData");
            Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
            CharacteristicsPickBottomSheetFragment characteristicsPickBottomSheetFragment = new CharacteristicsPickBottomSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("CELL_DATA", cellData);
            characteristicsPickBottomSheetFragment.setArguments(bundle);
            characteristicsPickBottomSheetFragment.tokenizedAnalytics = tokenizedAnalytics;
            return new c<>("CharacteristicsPickBottomSheetFragment", characteristicsPickBottomSheetFragment, 9021, false, false, null, false, false, false, 504, null);
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentPdpComparisonCharateristicsPickBinding getBinding() {
        FragmentPdpComparisonCharateristicsPickBinding fragmentPdpComparisonCharateristicsPickBinding = this._binding;
        Intrinsics.f(fragmentPdpComparisonCharateristicsPickBinding);
        return fragmentPdpComparisonCharateristicsPickBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendAnalytics(t event, i filter) {
        l lVar;
        if (event == null) {
            return;
        }
        if (filter instanceof NonViewFilter) {
            l lVar2 = this.tokenizedAnalytics;
            if (lVar2 != null) {
                TokenizedAnalyticsExtKt.processNonViewEvents(lVar2, event);
                return;
            }
            return;
        }
        if (!(filter instanceof y) || (lVar = this.tokenizedAnalytics) == null) {
            return;
        }
        TokenizedAnalyticsExtKt.processViewEvents(lVar, event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setButtonVisibility(View view, boolean z11) {
        if (!z11) {
            view.animate().alpha(0.0f).withEndAction(new RunnableC7028a(view, 0));
            return;
        }
        view.setAlpha(0.0f);
        ViewExtKt.show(view);
        view.animate().alpha(1.0f);
    }

    private final void setupView(CharacteristicsPickVO.CellData cellData, CharacteristicsFilterAdapter adapter) {
        FragmentPdpComparisonCharateristicsPickBinding binding = getBinding();
        binding.titleTV.setText(cellData.getHeader().getTitle());
        binding.searchV.q(cellData.getHeader().getSearch().getPlaceholder());
        binding.searchV.clearFocus();
        binding.characteristicsListRV.setAdapter(adapter);
        SingleAtom.bind$default(binding.buttonSA, cellData.getButton(), false, 2, null);
        binding.searchV.o(new SearchView.l() { // from class: ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.bottomsheet.CharacteristicsPickBottomSheetFragment$setupView$1$1
            @Override // androidx.appcompat.widget.SearchView.l
            public boolean onQueryTextChange(String newText) {
                ComparisonBottomSheetViewModel comparisonBottomSheetViewModel;
                comparisonBottomSheetViewModel = CharacteristicsPickBottomSheetFragment.this.viewModel;
                if (comparisonBottomSheetViewModel == null) {
                    return true;
                }
                comparisonBottomSheetViewModel.onQueryTextChange(newText);
                return true;
            }

            @Override // androidx.appcompat.widget.SearchView.l
            public boolean onQueryTextSubmit(String query) {
                ComparisonBottomSheetViewModel comparisonBottomSheetViewModel;
                comparisonBottomSheetViewModel = CharacteristicsPickBottomSheetFragment.this.viewModel;
                if (comparisonBottomSheetViewModel == null) {
                    return false;
                }
                comparisonBottomSheetViewModel.onQueryTextChange(query);
                return false;
            }
        });
        TextView clearTV = binding.clearTV;
        Intrinsics.checkNotNullExpressionValue(clearTV, "clearTV");
        ViewExtKt.setOnClickListenerThrottle$default(clearTV, 0L, new CharacteristicsPickBottomSheetFragment$setupView$1$2(this, binding), 1, null);
        ImageView backIV = binding.backIV;
        Intrinsics.checkNotNullExpressionValue(backIV, "backIV");
        ViewExtKt.setOnClickListenerThrottle$default(backIV, 0L, new CharacteristicsPickBottomSheetFragment$setupView$1$3(this), 1, null);
        binding.buttonSA.setOnAction(new CharacteristicsPickBottomSheetFragment$setupView$1$4(this));
        sendAnalytics(cellData.getTokenizedViewEvent(), y.f33404a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError(Throwable error) {
        NotificationDTO createUnknownErrorNotification;
        Lm0.a.f17149a.e(error);
        View view = getView();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            NotificationLayoutManager asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(viewGroup, null, 1, null);
            if (asNotificationLayoutManager$default == null) {
                return;
            }
            NotificationBar.Companion companion = NotificationBar.INSTANCE;
            J viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            if (g.c(error)) {
                createUnknownErrorNotification = NotificationBarHelperKt.createNetworkErrorNotificationDTO(getAppType() == AppType.SELECT);
            } else {
                createUnknownErrorNotification = NotificationsKt.createUnknownErrorNotification();
            }
            NotificationBar.Companion.make$default(companion, asNotificationLayoutManager$default, createUnknownErrorNotification, viewLifecycleOwner, null, 8, null).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void submitResult() {
        AbstractC7094b submitSelectedCharacteristics;
        ComparisonBottomSheetViewModel comparisonBottomSheetViewModel = this.viewModel;
        if (comparisonBottomSheetViewModel == null || (submitSelectedCharacteristics = comparisonBottomSheetViewModel.submitSelectedCharacteristics()) == null) {
            return;
        }
        RxExtKt.subscribe(submitSelectedCharacteristics, this, new CharacteristicsPickBottomSheetFragment$submitResult$1(this), new CharacteristicsPickBottomSheetFragment$submitResult$2(this));
    }

    @NotNull
    public final AppType getAppType() {
        AppType appType = this.appType;
        if (appType != null) {
            return appType;
        }
        Intrinsics.n("appType");
        throw null;
    }

    @NotNull
    public final a<ComparisonBottomSheetViewModel> getProvider() {
        a<ComparisonBottomSheetViewModel> aVar = this.provider;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("provider");
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        CharacteristicsPickBottomSheetFragmentComponent.Factory factory = DaggerCharacteristicsPickBottomSheetFragmentComponent.factory();
        C6740b dependencyStorage = C6739a.b(this, AndroidPlatformComponentApi.class).getDependencyStorage();
        if (AndroidPlatformComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AndroidPlatformComponentApi is not DiComponent");
        }
        AndroidPlatformComponentApi androidPlatformComponentApi = (AndroidPlatformComponentApi) dependencyStorage.b(AndroidPlatformComponentApi.class);
        C6740b dependencyStorage2 = C6739a.b(this, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        factory.create(androidPlatformComponentApi, (NetworkComponentApi) dependencyStorage2.b(NetworkComponentApi.class)).inject(this);
        super.onAttach(context);
    }

    @Override // com.google.android.material.bottomsheet.b, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return new OzonBottomSheetDialog(requireContext, 0, 0, true, null, true, false, false, null, false, 918, null);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ComparisonBottomSheetViewModel comparisonBottomSheetViewModel = (ComparisonBottomSheetViewModel) new z0(this, new z0.c() { // from class: ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.bottomsheet.CharacteristicsPickBottomSheetFragment$onCreateView$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ComparisonBottomSheetViewModel comparisonBottomSheetViewModel2 = CharacteristicsPickBottomSheetFragment.this.getProvider().get();
                Intrinsics.g(comparisonBottomSheetViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return comparisonBottomSheetViewModel2;
            }
        }).a(ComparisonBottomSheetViewModel.class);
        this.viewModel = comparisonBottomSheetViewModel;
        if (comparisonBottomSheetViewModel != null) {
            this.adapter.submitViewModel(comparisonBottomSheetViewModel);
        }
        return inflater.inflate(R$layout.fragment_pdp_comparison_charateristics_pick, container, true);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        KeyboardUtilsKt.hideKeyboard(this);
        super.onDismiss(dialog);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onStart() {
        p<Boolean> observeSecondaryButtonsState;
        p<List<CharacteristicsPickVO.CellData.CellDataValue>> observeCharacteristicsListChanges;
        super.onStart();
        ComparisonBottomSheetViewModel comparisonBottomSheetViewModel = this.viewModel;
        if (comparisonBottomSheetViewModel != null && (observeCharacteristicsListChanges = comparisonBottomSheetViewModel.observeCharacteristicsListChanges()) != null) {
            J viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            RxExtKt.subscribe$default(observeCharacteristicsListChanges, viewLifecycleOwner, new CharacteristicsPickBottomSheetFragment$onStart$1(this), new CharacteristicsPickBottomSheetFragment$onStart$2(this), null, 8, null);
        }
        ComparisonBottomSheetViewModel comparisonBottomSheetViewModel2 = this.viewModel;
        if (comparisonBottomSheetViewModel2 == null || (observeSecondaryButtonsState = comparisonBottomSheetViewModel2.observeSecondaryButtonsState()) == null) {
            return;
        }
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        RxExtKt.subscribe$default(observeSecondaryButtonsState, viewLifecycleOwner2, new CharacteristicsPickBottomSheetFragment$onStart$3(this), new CharacteristicsPickBottomSheetFragment$onStart$4(this), null, 8, null);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        ComparisonBottomSheetViewModel comparisonBottomSheetViewModel;
        Intrinsics.checkNotNullParameter(view, "view");
        this._binding = FragmentPdpComparisonCharateristicsPickBinding.bind(view);
        Parcelable parcelable = requireArguments().getParcelable("CELL_DATA");
        CharacteristicsPickVO.CellData cellData = parcelable instanceof CharacteristicsPickVO.CellData ? (CharacteristicsPickVO.CellData) parcelable : null;
        if (cellData == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        List<CharacteristicsPickVO.CellData.CellDataValue> values = cellData.getValues();
        if (values != null && (comparisonBottomSheetViewModel = this.viewModel) != null) {
            comparisonBottomSheetViewModel.submitInitialKeyCharacteristics(values);
        }
        setupView(cellData, this.adapter);
    }
}
