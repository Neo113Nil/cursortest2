package ru.ozon.app.android.travel.feature.avia.widgets.luggageRequirements.v2.presentation;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.databinding.WidgetLuggageRequirementsV2Binding;
import ru.ozon.app.android.travel.feature.avia.widgets.luggageRequirements.v2.presentation.LuggageRequirementsV2VO;
import ru.ozon.app.android.travel.feature.avia.widgets.luggageRequirements.v2.presentation.adapter.LuggageRequirementsAdapter;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/luggageRequirements/v2/presentation/LuggageRequirementsV2WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/avia/widgets/luggageRequirements/v2/presentation/LuggageRequirementsV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/travel/feature/avia/widgets/luggageRequirements/v2/presentation/LuggageRequirementsV2ViewModel;", "viewModel", "<init>", "(Landroid/view/View;Lru/ozon/app/android/travel/feature/avia/widgets/luggageRequirements/v2/presentation/LuggageRequirementsV2ViewModel;)V", "", "observeLiveData", "()V", "", "position", "updateTabs", "(I)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/luggageRequirements/v2/presentation/LuggageRequirementsV2VO;Ll20/d;)V", "onAttach", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/travel/feature/avia/widgets/luggageRequirements/v2/presentation/LuggageRequirementsV2ViewModel;", "Lru/ozon/app/android/travel/feature/avia/databinding/WidgetLuggageRequirementsV2Binding;", "binding", "Lru/ozon/app/android/travel/feature/avia/databinding/WidgetLuggageRequirementsV2Binding;", "Lru/ozon/app/android/travel/feature/avia/widgets/luggageRequirements/v2/presentation/adapter/LuggageRequirementsAdapter;", "luggageRequirementsAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/luggageRequirements/v2/presentation/adapter/LuggageRequirementsAdapter;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LuggageRequirementsV2WidgetViewHolder extends k<LuggageRequirementsV2VO> {

    @NotNull
    private final WidgetLuggageRequirementsV2Binding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final LuggageRequirementsAdapter luggageRequirementsAdapter;

    @NotNull
    private final LuggageRequirementsV2ViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LuggageRequirementsV2WidgetViewHolder(@NotNull View containerView, @NotNull LuggageRequirementsV2ViewModel viewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.containerView = containerView;
        this.viewModel = viewModel;
        WidgetLuggageRequirementsV2Binding bind = WidgetLuggageRequirementsV2Binding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        LuggageRequirementsAdapter luggageRequirementsAdapter = new LuggageRequirementsAdapter();
        this.luggageRequirementsAdapter = luggageRequirementsAdapter;
        RecyclerView recyclerView = bind.luggageRequirementsV2RV;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(luggageRequirementsAdapter);
    }

    private final void observeLiveData() {
        this.viewModel.getSelectTabLiveData().observe(this, new LuggageRequirementsV2WidgetViewHolder$sam$androidx_lifecycle_Observer$0(new LuggageRequirementsV2WidgetViewHolder$observeLiveData$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTabs(int position) {
        LuggageRequirementsV2VO boundData = getBoundData();
        if (boundData != null) {
            LuggageRequirementsAdapter luggageRequirementsAdapter = this.luggageRequirementsAdapter;
            LuggageRequirementsV2VO.TabVO tabVO = (LuggageRequirementsV2VO.TabVO) C7714v.Q(position, boundData.getTabs());
            luggageRequirementsAdapter.setItems(tabVO != null ? tabVO.getRequirements() : null);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeLiveData();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull LuggageRequirementsV2VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextAtomView luggageRequirementsV2TitleTAV = this.binding.luggageRequirementsV2TitleTAV;
        Intrinsics.checkNotNullExpressionValue(luggageRequirementsV2TitleTAV, "luggageRequirementsV2TitleTAV");
        TextAtomHolderKt.bindOrGone$default(luggageRequirementsV2TitleTAV, item.getTitle(), null, 2, null);
        TabLayout tabLayout = this.binding.luggageRequirementsV2TabsTL;
        tabLayout.o();
        for (LuggageRequirementsV2VO.TabVO tabVO : item.getTabs()) {
            TabLayout.e m11 = tabLayout.m();
            m11.n(tabVO.getTitle());
            tabLayout.d(m11);
        }
        tabLayout.c(new TabLayout.b() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.luggageRequirements.v2.presentation.LuggageRequirementsV2WidgetViewHolder$bind$1$2
            @Override // com.google.android.material.tabs.TabLayout.b
            public void onTabReselected(TabLayout.e tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.b
            public void onTabSelected(TabLayout.e tab) {
                LuggageRequirementsV2ViewModel luggageRequirementsV2ViewModel;
                if (tab != null) {
                    luggageRequirementsV2ViewModel = LuggageRequirementsV2WidgetViewHolder.this.viewModel;
                    luggageRequirementsV2ViewModel.selectTab(tab.d());
                }
            }

            @Override // com.google.android.material.tabs.TabLayout.b
            public void onTabUnselected(TabLayout.e tab) {
            }
        });
        this.viewModel.setup();
    }
}
