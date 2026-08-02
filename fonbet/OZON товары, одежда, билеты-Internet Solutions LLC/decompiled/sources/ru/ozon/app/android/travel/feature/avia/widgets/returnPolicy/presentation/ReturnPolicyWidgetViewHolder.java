package ru.ozon.app.android.travel.feature.avia.widgets.returnPolicy.presentation;

import android.view.View;
import com.google.android.material.tabs.TabLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.databinding.WidgetReturnPolicyBinding;
import ru.ozon.app.android.travel.feature.avia.widgets.returnPolicy.presentation.ReturnPolicyVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000I\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001 \b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\fJ\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/presentation/ReturnPolicyWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/presentation/ReturnPolicyVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/presentation/ReturnPolicyViewModel;", "viewModel", "<init>", "(Landroid/view/View;Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/presentation/ReturnPolicyViewModel;)V", "", "observeLiveData", "()V", "", "position", "updateTabs", "(I)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/presentation/ReturnPolicyVO;Ll20/d;)V", "onAttach", "onDetach", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/presentation/ReturnPolicyViewModel;", "Lru/ozon/app/android/travel/feature/avia/databinding/WidgetReturnPolicyBinding;", "binding", "Lru/ozon/app/android/travel/feature/avia/databinding/WidgetReturnPolicyBinding;", "ru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/presentation/ReturnPolicyWidgetViewHolder$tabSelectedListener$1", "tabSelectedListener", "Lru/ozon/app/android/travel/feature/avia/widgets/returnPolicy/presentation/ReturnPolicyWidgetViewHolder$tabSelectedListener$1;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ReturnPolicyWidgetViewHolder extends k<ReturnPolicyVO> {

    @NotNull
    private final WidgetReturnPolicyBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final ReturnPolicyWidgetViewHolder$tabSelectedListener$1 tabSelectedListener;

    @NotNull
    private final ReturnPolicyViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [ru.ozon.app.android.travel.feature.avia.widgets.returnPolicy.presentation.ReturnPolicyWidgetViewHolder$tabSelectedListener$1] */
    public ReturnPolicyWidgetViewHolder(@NotNull View containerView, @NotNull ReturnPolicyViewModel viewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.containerView = containerView;
        this.viewModel = viewModel;
        WidgetReturnPolicyBinding bind = WidgetReturnPolicyBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.tabSelectedListener = new TabLayout.b() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.returnPolicy.presentation.ReturnPolicyWidgetViewHolder$tabSelectedListener$1
            @Override // com.google.android.material.tabs.TabLayout.b
            public void onTabReselected(TabLayout.e tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.b
            public void onTabSelected(TabLayout.e tab) {
                ReturnPolicyViewModel returnPolicyViewModel;
                if (tab != null) {
                    returnPolicyViewModel = ReturnPolicyWidgetViewHolder.this.viewModel;
                    returnPolicyViewModel.selectTab(tab.d());
                }
            }

            @Override // com.google.android.material.tabs.TabLayout.b
            public void onTabUnselected(TabLayout.e tab) {
            }
        };
    }

    private final void observeLiveData() {
        this.viewModel.getSelectTabLiveData().observe(this, new ReturnPolicyWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new ReturnPolicyWidgetViewHolder$observeLiveData$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTabs(int position) {
        ReturnPolicyVO boundData = getBoundData();
        if (boundData != null) {
            this.binding.returnPolicyRPV.bind(boundData.getTabs().get(position).getReturnPolicy());
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.binding.returnPolicyTabsTL.c(this.tabSelectedListener);
        observeLiveData();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        this.binding.returnPolicyTabsTL.p(this.tabSelectedListener);
        super.onDetach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ReturnPolicyVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextAtomView returnPolicyTitleTAV = this.binding.returnPolicyTitleTAV;
        Intrinsics.checkNotNullExpressionValue(returnPolicyTitleTAV, "returnPolicyTitleTAV");
        TextAtomHolderKt.bind$default(returnPolicyTitleTAV, item.getTitle(), null, 2, null);
        TabLayout tabLayout = this.binding.returnPolicyTabsTL;
        tabLayout.o();
        for (ReturnPolicyVO.TabVO tabVO : item.getTabs()) {
            TabLayout.e m11 = tabLayout.m();
            m11.n(tabVO.getTitle());
            tabLayout.d(m11);
        }
        TabLayout.e k11 = tabLayout.k(item.getSelectedPosition());
        if (k11 != null) {
            k11.i();
        }
        this.viewModel.setup(item.getSelectedPosition());
    }
}
