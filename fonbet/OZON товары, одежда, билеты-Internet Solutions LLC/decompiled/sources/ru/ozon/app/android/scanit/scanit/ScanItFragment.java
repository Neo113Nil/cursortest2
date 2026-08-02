package ru.ozon.app.android.scanit.scanit;

import GZ.g;
import GZ.l;
import a00.C4911f;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AbstractC5051a;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.Q;
import androidx.fragment.app.r;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.feature.scanit.R$id;
import ru.ozon.app.android.feature.scanit.R$menu;
import ru.ozon.app.android.feature.scanit.R$string;
import ru.ozon.app.android.feature.scanit.databinding.FragmentMainScanItBinding;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.navigation.newrouter.ui.fragment.FullScreenFragmentObserver;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.scanit.di.DaggerScanItFragmentComponent;
import ru.ozon.app.android.scanit.di.ScanItFragmentComponent;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.uikit.utils.DelayedVisibilityHandler;
import ru.ozon.uni.core.R$color;
import ru.ozon.uni.core.R$drawable;
import v9.C10278a;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u0003J\u001f\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010%\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0005H\u0016¢\u0006\u0004\b'\u0010\u0003J\r\u0010(\u001a\u00020\u0005¢\u0006\u0004\b(\u0010\u0003J\u0017\u0010)\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b)\u0010*J\u001d\u0010-\u001a\u00020\u00052\u0006\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020#¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u0005¢\u0006\u0004\b/\u0010\u0003R\"\u00101\u001a\u0002008\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u00108\u001a\u0002078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R(\u0010@\u001a\b\u0012\u0004\u0012\u00020?0>8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010I\u001a\u00020H8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010L\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010R\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010V\u001a\u00060Tj\u0002`U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010Z\u001a\u00020Q8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y¨\u0006["}, d2 = {"Lru/ozon/app/android/scanit/scanit/ScanItFragment;", "Landroidx/fragment/app/m;", "<init>", "()V", "fragment", "", "replaceFragment", "(Landroidx/fragment/app/m;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "onCreateOptionsMenu", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onDestroyView", "openScanItIntro", "provideBarcode", "(Landroid/content/Intent;)V", "code", "intent", "setResult", "(ILandroid/content/Intent;)V", "close", "LGZ/g;", "screenRouter", "LGZ/g;", "getScreenRouter", "()LGZ/g;", "setScreenRouter", "(LGZ/g;)V", "Lru/ozon/app/android/scanit/scanit/ScanItAnalytics;", "scanItAnalytics", "Lru/ozon/app/android/scanit/scanit/ScanItAnalytics;", "getScanItAnalytics", "()Lru/ozon/app/android/scanit/scanit/ScanItAnalytics;", "setScanItAnalytics", "(Lru/ozon/app/android/scanit/scanit/ScanItAnalytics;)V", "LPc/a;", "Lru/ozon/app/android/scanit/scanit/ScanItViewModel;", "pViewModel", "LPc/a;", "getPViewModel", "()LPc/a;", "setPViewModel", "(LPc/a;)V", "viewModel", "Lru/ozon/app/android/scanit/scanit/ScanItViewModel;", "Lru/ozon/app/android/uikit/utils/DelayedVisibilityHandler;", "delayedVisibilityHandler", "Lru/ozon/app/android/uikit/utils/DelayedVisibilityHandler;", "", "returningWithResult", "Z", "Lru/ozon/app/android/scanit/scanit/ScanItCaptureFragment;", "scanItCaptureFragment", "Lru/ozon/app/android/scanit/scanit/ScanItCaptureFragment;", "Lru/ozon/app/android/feature/scanit/databinding/FragmentMainScanItBinding;", "mBinding", "Lru/ozon/app/android/feature/scanit/databinding/FragmentMainScanItBinding;", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "ownerContainer", "La00/f;", "getBinding", "()Lru/ozon/app/android/feature/scanit/databinding/FragmentMainScanItBinding;", "binding", "scanit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScanItFragment extends ComponentCallbacksC5392m {
    private DelayedVisibilityHandler delayedVisibilityHandler;
    private FragmentMainScanItBinding mBinding;
    public Pc.a<ScanItViewModel> pViewModel;
    private boolean returningWithResult;
    public ScanItAnalytics scanItAnalytics;
    public g screenRouter;
    private ScanItViewModel viewModel;

    @NotNull
    private final ScanItCaptureFragment scanItCaptureFragment = new ScanItCaptureFragment();

    @NotNull
    private final C4911f ownerContainer = new C4911f(this);

    private final FragmentMainScanItBinding getBinding() {
        FragmentMainScanItBinding fragmentMainScanItBinding = this.mBinding;
        Intrinsics.f(fragmentMainScanItBinding);
        return fragmentMainScanItBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void replaceFragment(ComponentCallbacksC5392m fragment) {
        Q p11 = getChildFragmentManager().p();
        p11.r(R$id.contentTv, fragment, null);
        p11.i();
    }

    public final void close() {
        l.a(getScreenRouter());
    }

    @NotNull
    public final Pc.a<ScanItViewModel> getPViewModel() {
        Pc.a<ScanItViewModel> aVar = this.pViewModel;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("pViewModel");
        throw null;
    }

    @NotNull
    public final ScanItAnalytics getScanItAnalytics() {
        ScanItAnalytics scanItAnalytics = this.scanItAnalytics;
        if (scanItAnalytics != null) {
            return scanItAnalytics;
        }
        Intrinsics.n("scanItAnalytics");
        throw null;
    }

    @NotNull
    public final g getScreenRouter() {
        g gVar = this.screenRouter;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.n("screenRouter");
        throw null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode != 1373 || resultCode != -1) {
            if (requestCode != 1768 || data == null) {
                return;
            }
            l.a(getScreenRouter());
            return;
        }
        ScanItViewModel scanItViewModel = this.viewModel;
        if (scanItViewModel == null) {
            Intrinsics.n("viewModel");
            throw null;
        }
        scanItViewModel.markTutorialAsShown();
        ScanItViewModel scanItViewModel2 = this.viewModel;
        if (scanItViewModel2 != null) {
            scanItViewModel2.checkPermissions();
        } else {
            Intrinsics.n("viewModel");
            throw null;
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ScanItFragmentComponent.Factory factory = DaggerScanItFragmentComponent.factory();
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(context, ContextComponentDependencies.class).getDependencyStorage();
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        ContextComponentDependencies contextComponentDependencies = (ContextComponentDependencies) dependencyStorage.b(ContextComponentDependencies.class);
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        C6740b dependencyStorage2 = C6739a.a(context, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) dependencyStorage2.b(NetworkComponentApi.class);
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        C6740b dependencyStorage3 = C6739a.a(context, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        NavigationComponentApi navigationComponentApi = (NavigationComponentApi) dependencyStorage3.b(NavigationComponentApi.class);
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        C6740b dependencyStorage4 = C6739a.a(context, AnalyticsComponentApi.class).getDependencyStorage();
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        AnalyticsComponentApi analyticsComponentApi = (AnalyticsComponentApi) dependencyStorage4.b(AnalyticsComponentApi.class);
        if (AnalyticsScreenStorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsScreenStorageComponentApi is not DiComponent");
        }
        C6740b dependencyStorage5 = C6739a.a(context, AnalyticsScreenStorageComponentApi.class).getDependencyStorage();
        if (AnalyticsScreenStorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsScreenStorageComponentApi is not DiComponent");
        }
        factory.create(contextComponentDependencies, networkComponentApi, navigationComponentApi, analyticsComponentApi, (AnalyticsScreenStorageComponentApi) dependencyStorage5.b(AnalyticsScreenStorageComponentApi.class)).inject(this);
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        FullScreenFragmentObserver.Companion.showFullScreen$default(FullScreenFragmentObserver.INSTANCE, this, false, 0L, 6, null);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreateOptionsMenu(@NotNull Menu menu, @NotNull MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R$menu.menu_scan_it, menu);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.mBinding = FragmentMainScanItBinding.inflate(inflater, container, false);
        RelativeLayout constraintLayout = getBinding().getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        this.mBinding = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onResume() {
        super.onResume();
        if (this.returningWithResult) {
            replaceFragment(this.scanItCaptureFragment);
            this.returningWithResult = false;
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        AbstractC5051a supportActionBar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Toolbar toolbar = getBinding().toolbar;
        r requireActivity = requireActivity();
        androidx.appcompat.app.g gVar = requireActivity instanceof androidx.appcompat.app.g ? (androidx.appcompat.app.g) requireActivity : null;
        if (gVar != null) {
            gVar.setSupportActionBar(toolbar);
        }
        r requireActivity2 = requireActivity();
        androidx.appcompat.app.g gVar2 = requireActivity2 instanceof androidx.appcompat.app.g ? (androidx.appcompat.app.g) requireActivity2 : null;
        if (gVar2 != null && (supportActionBar = gVar2.getSupportActionBar()) != null) {
            supportActionBar.m(true);
            supportActionBar.p(R$drawable.ic_m_cross);
        }
        int color = requireContext().getColor(R$color.graphic_primary_on_light);
        toolbar.setTitle(StringProvider.getString(R$string.scan_it_screen_label));
        toolbar.setTitleTextColor(color);
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon != null) {
            navigationIcon.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
        }
        FrameLayout constraintLayout = getBinding().progressBg.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.delayedVisibilityHandler = new DelayedVisibilityHandler(constraintLayout, 0L, 2, null);
        getScanItAnalytics().barcodeScanView();
        ScanItViewModel scanItViewModel = (ScanItViewModel) new z0(this, new z0.c() { // from class: ru.ozon.app.android.scanit.scanit.ScanItFragment$onViewCreated$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ScanItViewModel scanItViewModel2 = ScanItFragment.this.getPViewModel().get();
                Intrinsics.g(scanItViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return scanItViewModel2;
            }
        }).a(ScanItViewModel.class);
        this.viewModel = scanItViewModel;
        if (scanItViewModel != null) {
            scanItViewModel.getLiveData().observe(getViewLifecycleOwner(), new ScanItFragmentKt$sam$androidx_lifecycle_Observer$0(new ScanItFragment$onViewCreated$3(this)));
        } else {
            Intrinsics.n("viewModel");
            throw null;
        }
    }

    public final void openScanItIntro() {
        g screenRouter = getScreenRouter();
        String uri = LinkGenerator.INSTANCE.scanItIntro().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        g.a.a(screenRouter, uri, null, null, 6);
    }

    public final void provideBarcode(Intent data) {
        v9.b a11 = C10278a.a(data);
        ScanItViewModel scanItViewModel = this.viewModel;
        if (scanItViewModel == null) {
            Intrinsics.n("viewModel");
            throw null;
        }
        String a12 = a11.a();
        Intrinsics.checkNotNullExpressionValue(a12, "getContents(...)");
        scanItViewModel.requestDeeplinkByBarcode(a12);
    }

    public final void setResult(int code, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        ComposerExtKt.setResult$default(this.ownerContainer, intent, code, null, 4, null);
    }
}
