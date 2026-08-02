package ru.ozon.app.android.pdp.view.crosssale;

import CG.b;
import GZ.g;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC5051a;
import androidx.core.content.a;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.pdp.R$drawable;
import ru.ozon.app.android.pdp.databinding.FragmentCrossSaleListBinding;
import ru.ozon.app.android.pdp.di.components.CrossSaleListFragmentComponent;
import ru.ozon.app.android.pdp.di.components.DaggerCrossSaleListFragmentComponent;
import ru.ozon.app.android.pdp.widgets.crosssale.data.CrossSaleDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0003R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lru/ozon/app/android/pdp/view/crosssale/CrossSaleListFragment;", "Landroidx/fragment/app/m;", "<init>", "()V", "", "initToolbar", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroy", "LGZ/g;", "router", "LGZ/g;", "getRouter", "()LGZ/g;", "setRouter", "(LGZ/g;)V", "Lru/ozon/app/android/pdp/databinding/FragmentCrossSaleListBinding;", "_binding", "Lru/ozon/app/android/pdp/databinding/FragmentCrossSaleListBinding;", "getBinding", "()Lru/ozon/app/android/pdp/databinding/FragmentCrossSaleListBinding;", "binding", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CrossSaleListFragment extends ComponentCallbacksC5392m {
    private static List<CrossSaleDTO.CrossSaleItem> crossSales;
    private FragmentCrossSaleListBinding _binding;
    public g router;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0002\b\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pdp/view/crosssale/CrossSaleListFragment$Companion;", "", "<init>", "()V", "TAG", "", "EXTRA_SCREEN_NAME", "crossSales", "", "Lru/ozon/app/android/pdp/widgets/crosssale/data/CrossSaleDTO$CrossSaleItem;", "newInstance", "Lru/ozon/app/android/pdp/view/crosssale/CrossSaleListFragment;", "screenName", "newInstance$pdp_prodGoogleAllVendorsRelease", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CrossSaleListFragment newInstance$pdp_prodGoogleAllVendorsRelease(@NotNull String screenName, @NotNull List<CrossSaleDTO.CrossSaleItem> crossSales) {
            Intrinsics.checkNotNullParameter(screenName, "screenName");
            Intrinsics.checkNotNullParameter(crossSales, "crossSales");
            CrossSaleListFragment crossSaleListFragment = new CrossSaleListFragment();
            Bundle bundle = new Bundle();
            bundle.putString("CROSS_SALE_SCREEN_NAME", screenName);
            crossSaleListFragment.setArguments(bundle);
            CrossSaleListFragment.crossSales = crossSales;
            return crossSaleListFragment;
        }

        private Companion() {
        }
    }

    private final FragmentCrossSaleListBinding getBinding() {
        FragmentCrossSaleListBinding fragmentCrossSaleListBinding = this._binding;
        Intrinsics.f(fragmentCrossSaleListBinding);
        return fragmentCrossSaleListBinding;
    }

    private final void initToolbar() {
        r activity = getActivity();
        Intrinsics.g(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        androidx.appcompat.app.g gVar = (androidx.appcompat.app.g) activity;
        gVar.setSupportActionBar(getBinding().toolbar);
        AbstractC5051a supportActionBar = gVar.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.m(true);
        }
        getBinding().toolbar.setNavigationOnClickListener(new b(gVar, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initToolbar$lambda$4$lambda$3(androidx.appcompat.app.g gVar, View view) {
        gVar.getSupportFragmentManager().P0();
    }

    @NotNull
    public final g getRouter() {
        g gVar = this.router;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.n("router");
        throw null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        CrossSaleListFragmentComponent.Factory factory = DaggerCrossSaleListFragmentComponent.factory();
        C6740b dependencyStorage = C6739a.b(this, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        factory.create((NavigationComponentApi) dependencyStorage.b(NavigationComponentApi.class)).inject(this);
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = FragmentCrossSaleListBinding.inflate(getLayoutInflater());
        return getBinding().getRoot();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroy() {
        super.onDestroy();
        this._binding = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        FragmentCrossSaleListBinding binding = getBinding();
        super.onViewCreated(view, savedInstanceState);
        initToolbar();
        TextView textView = binding.titleTv;
        Bundle arguments = getArguments();
        textView.setText(arguments != null ? arguments.getString("CROSS_SALE_SCREEN_NAME") : null);
        RecyclerView recyclerView = binding.itemsRv;
        List<CrossSaleDTO.CrossSaleItem> list = crossSales;
        if (list == null) {
            Intrinsics.n("crossSales");
            throw null;
        }
        recyclerView.setAdapter(new CrossSaleListAdapter(list, getRouter()));
        RecyclerView recyclerView2 = binding.itemsRv;
        j jVar = new j(requireContext(), 1);
        Drawable drawable = a.getDrawable(requireContext(), R$drawable.cross_sale_list_fragment_divider);
        if (drawable != null) {
            jVar.setDrawable(drawable);
        }
        recyclerView2.addItemDecoration(jVar);
    }
}
