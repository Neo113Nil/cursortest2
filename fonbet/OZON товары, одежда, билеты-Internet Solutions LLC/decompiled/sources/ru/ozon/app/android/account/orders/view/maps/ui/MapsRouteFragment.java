package ru.ozon.app.android.account.orders.view.maps.ui;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.material.bottomsheet.b;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.view.maps.MapSelectorAnalytics;
import ru.ozon.app.android.account.orders.view.maps.MapsRouteViewModelImpl;
import ru.ozon.app.android.account.orders.view.maps.di.DaggerMapSelectorComponent;
import ru.ozon.app.android.account.orders.view.maps.di.MapSelectorComponent;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.cscore.R$layout;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.view.dialog.OzonBottomSheetDialog;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 12\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR(\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R#\u0010)\u001a\n $*\u0004\u0018\u00010\u001d0\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\"\u0010+\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00062"}, d2 = {"Lru/ozon/app/android/account/orders/view/maps/ui/MapsRouteFragment;", "Lcom/google/android/material/bottomsheet/b;", "<init>", "()V", "Landroid/content/Intent;", "intent", "", "openMapApplication", "(Landroid/content/Intent;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "LPc/a;", "Lru/ozon/app/android/account/orders/view/maps/MapsRouteViewModelImpl;", "pViewModel", "LPc/a;", "getPViewModel", "()LPc/a;", "setPViewModel", "(LPc/a;)V", "kotlin.jvm.PlatformType", "viewModel$delegate", "LSc/j;", "getViewModel", "()Lru/ozon/app/android/account/orders/view/maps/MapsRouteViewModelImpl;", "viewModel", "Lru/ozon/app/android/account/orders/view/maps/MapSelectorAnalytics;", "mapSelectorAnalytics", "Lru/ozon/app/android/account/orders/view/maps/MapSelectorAnalytics;", "getMapSelectorAnalytics", "()Lru/ozon/app/android/account/orders/view/maps/MapSelectorAnalytics;", "setMapSelectorAnalytics", "(Lru/ozon/app/android/account/orders/view/maps/MapSelectorAnalytics;)V", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MapsRouteFragment extends b {
    public MapSelectorAnalytics mapSelectorAnalytics;
    public a<MapsRouteViewModelImpl> pViewModel;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModel = k.b(new MapsRouteFragment$viewModel$2(this));

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/account/orders/view/maps/ui/MapsRouteFragment$Companion;", "", "<init>", "()V", "TAG", "", "TITLE_EXTRA", "LATLNG_EXTRA", "newInstance", "Lru/ozon/app/android/account/orders/view/maps/ui/MapsRouteFragment;", SelectionItemFormDTO.TITLE_FIELD_NAME, "latLng", "Lcom/google/android/gms/maps/model/LatLng;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MapsRouteFragment newInstance(@NotNull String title, @NotNull LatLng latLng) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(latLng, "latLng");
            MapsRouteFragment mapsRouteFragment = new MapsRouteFragment();
            Bundle bundle = new Bundle();
            bundle.putString("ru.ozon.app.android.orders.view.maps.ui.MapsRouteFragment.TITLE_EXTRA", title);
            bundle.putParcelable("ru.ozon.app.android.orders.view.maps.ui.MapsRouteFragment.LATLNG_EXTRA", latLng);
            mapsRouteFragment.setArguments(bundle);
            return mapsRouteFragment;
        }

        private Companion() {
        }
    }

    private final MapsRouteViewModelImpl getViewModel() {
        return (MapsRouteViewModelImpl) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openMapApplication(Intent intent) {
        requireActivity().startActivity(intent);
    }

    @NotNull
    public final MapSelectorAnalytics getMapSelectorAnalytics() {
        MapSelectorAnalytics mapSelectorAnalytics = this.mapSelectorAnalytics;
        if (mapSelectorAnalytics != null) {
            return mapSelectorAnalytics;
        }
        Intrinsics.n("mapSelectorAnalytics");
        throw null;
    }

    @NotNull
    public final a<MapsRouteViewModelImpl> getPViewModel() {
        a<MapsRouteViewModelImpl> aVar = this.pViewModel;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("pViewModel");
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        MapSelectorComponent.Factory factory = DaggerMapSelectorComponent.factory();
        String string = requireArguments().getString("ru.ozon.app.android.orders.view.maps.ui.MapsRouteFragment.TITLE_EXTRA");
        if (string == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Parcelable parcelable = requireArguments().getParcelable("ru.ozon.app.android.orders.view.maps.ui.MapsRouteFragment.LATLNG_EXTRA");
        if (parcelable == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        LatLng latLng = (LatLng) parcelable;
        C6740b dependencyStorage = C6739a.b(this, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) dependencyStorage.b(NetworkComponentApi.class);
        C6740b dependencyStorage2 = C6739a.b(this, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        NavigationComponentApi navigationComponentApi = (NavigationComponentApi) dependencyStorage2.b(NavigationComponentApi.class);
        C6740b dependencyStorage3 = C6739a.b(this, AnalyticsComponentApi.class).getDependencyStorage();
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        AnalyticsComponentApi analyticsComponentApi = (AnalyticsComponentApi) dependencyStorage3.b(AnalyticsComponentApi.class);
        C6740b dependencyStorage4 = C6739a.b(this, AnalyticsScreenStorageComponentApi.class).getDependencyStorage();
        if (AnalyticsScreenStorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsScreenStorageComponentApi is not DiComponent");
        }
        AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi = (AnalyticsScreenStorageComponentApi) dependencyStorage4.b(AnalyticsScreenStorageComponentApi.class);
        C6740b dependencyStorage5 = C6739a.b(this, ComposerComponentApi.class).getDependencyStorage();
        if (ComposerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerComponentApi is not DiComponent");
        }
        ComposerComponentApi composerComponentApi = (ComposerComponentApi) dependencyStorage5.b(ComposerComponentApi.class);
        C6740b dependencyStorage6 = C6739a.b(this, ContextComponentDependencies.class).getDependencyStorage();
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        factory.create(string, latLng, networkComponentApi, navigationComponentApi, analyticsComponentApi, analyticsScreenStorageComponentApi, composerComponentApi, (ContextComponentDependencies) dependencyStorage6.b(ContextComponentDependencies.class)).inject(this);
        getMapSelectorAnalytics().init(this);
    }

    @Override // com.google.android.material.bottomsheet.b, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return new OzonBottomSheetDialog(requireContext, 0, 4, false, null, true, true, false, null, false, 922, null);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.fragment_maps_route, container, false);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        MapsAdapter mapsAdapter = new MapsAdapter(new MapsRouteFragment$onViewCreated$adapter$1(this), new MapsRouteFragment$onViewCreated$adapter$2(this), getMapSelectorAnalytics());
        RecyclerView recyclerView = (RecyclerView) view;
        recyclerView.setAdapter(mapsAdapter);
        j jVar = new j(requireContext(), 1);
        Drawable drawable = androidx.core.content.a.getDrawable(requireContext(), R$drawable.line_divider);
        Intrinsics.f(drawable);
        jVar.setDrawable(drawable);
        recyclerView.addItemDecoration(jVar);
        mapsAdapter.submitList(getViewModel().getRoutes());
    }
}
