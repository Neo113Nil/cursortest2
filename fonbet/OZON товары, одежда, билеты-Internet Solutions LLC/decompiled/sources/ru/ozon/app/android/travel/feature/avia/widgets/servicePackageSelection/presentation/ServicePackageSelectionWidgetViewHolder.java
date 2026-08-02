package ru.ozon.app.android.travel.feature.avia.widgets.servicePackageSelection.presentation;

import Lw.ViewOnClickListenerC3598a;
import Vg.d;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.flexbox.FlexboxLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.travel.feature.avia.databinding.WidgetServicePackageSelectionBinding;
import ru.ozon.app.android.travel.feature.avia.widgets.servicePackageSelection.presentation.ServicePackageSelectionVO;
import ru.ozon.app.android.travel.feature.avia.widgets.servicePackageSelection.view.ServicePackageView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0015\u001a\u00020\u00142\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00022\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00140&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/servicePackageSelection/presentation/ServicePackageSelectionWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/avia/widgets/servicePackageSelection/presentation/ServicePackageSelectionVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;LVg/d;)V", "", "Lru/ozon/app/android/travel/feature/avia/widgets/servicePackageSelection/presentation/ServicePackageSelectionVO$PackageTabVO;", DynamicElementDTO.TABS, "", "paddingTop", "", "bindTabs", "(Ljava/util/List;I)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/servicePackageSelection/presentation/ServicePackageSelectionVO;Ll20/d;)V", "Lru/ozon/app/android/travel/feature/avia/databinding/WidgetServicePackageSelectionBinding;", "binding", "Lru/ozon/app/android/travel/feature/avia/databinding/WidgetServicePackageSelectionBinding;", "tabMargin", "I", "badgeTopPadding", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "cellsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ServicePackageSelectionWidgetViewHolder extends k<ServicePackageSelectionVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final int badgeTopPadding;

    @NotNull
    private final WidgetServicePackageSelectionBinding binding;

    @NotNull
    private final AtomsAdapter cellsAdapter;
    private final int tabMargin;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServicePackageSelectionWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences ref, @NotNull HandlersInhibitor handlersInhibitor, @NotNull d customActionHandlersStoreFactory) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        WidgetServicePackageSelectionBinding bind = WidgetServicePackageSelectionBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.tabMargin = ResourceExtKt.toPx(8, getContext());
        this.badgeTopPadding = ResourceExtKt.toPx(8, getContext());
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.cellsAdapter = atomsAdapter;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(ref, this).customActionHandlers(new ServicePackageSelectionWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).enableClickThrottling(handlersInhibitor).buildHandler();
        this.actionHandler = buildHandler;
        atomsAdapter.setOnAction(buildHandler);
        bind.servicePackageSelectionCellsVAL.setAdapter(atomsAdapter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindTabs(List<ServicePackageSelectionVO.PackageTabVO> tabs, int paddingTop) {
        FlexboxLayout flexboxLayout = this.binding.servicePackageSelectionTabsFL;
        Intrinsics.f(flexboxLayout);
        int i11 = 0;
        ViewExtKt.updatePadding$default(flexboxLayout, 0, paddingTop, 0, 0, 13, null);
        AttributeSet attributeSet = null;
        Object[] objArr = 0;
        if (tabs.size() != flexboxLayout.getChildCount()) {
            if (flexboxLayout.getChildCount() != 0) {
                flexboxLayout.removeAllViews();
            }
            int P11 = C7714v.P(tabs);
            if (P11 >= 0) {
                int i12 = 0;
                while (true) {
                    Context context = flexboxLayout.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    ServicePackageView servicePackageView = new ServicePackageView(context, attributeSet, 2, objArr == true ? 1 : 0);
                    FlexboxLayout.a aVar = new FlexboxLayout.a(-1, -2);
                    aVar.setMarginEnd(i12 == C7714v.P(tabs) ? 0 : this.tabMargin);
                    servicePackageView.setLayoutParams(aVar);
                    flexboxLayout.addView(servicePackageView);
                    if (i12 == P11) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
        }
        for (Object obj : tabs) {
            int i13 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            ServicePackageSelectionVO.PackageTabVO packageTabVO = (ServicePackageSelectionVO.PackageTabVO) obj;
            View childAt = flexboxLayout.getChildAt(i11);
            ServicePackageView servicePackageView2 = childAt instanceof ServicePackageView ? (ServicePackageView) childAt : null;
            if (servicePackageView2 != null) {
                servicePackageView2.bind(packageTabVO);
                servicePackageView2.setOnClickListener(new ViewOnClickListenerC3598a(2, packageTabVO, this));
            }
            i11 = i13;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindTabs$lambda$8$lambda$7$lambda$6$lambda$5(ServicePackageSelectionVO.PackageTabVO packageTabVO, ServicePackageSelectionWidgetViewHolder servicePackageSelectionWidgetViewHolder, View view) {
        AtomAction action = packageTabVO.getAction();
        if (action != null) {
            servicePackageSelectionWidgetViewHolder.actionHandler.invoke(action);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ServicePackageSelectionVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextAtomV2View servicePackageSelectionTitleTAV = this.binding.servicePackageSelectionTitleTAV;
        Intrinsics.checkNotNullExpressionValue(servicePackageSelectionTitleTAV, "servicePackageSelectionTitleTAV");
        TextHolderKt.bind$default(servicePackageSelectionTitleTAV, item.getTitle(), null, 2, null);
        bindTabs(item.getPackageTabs(), item.getHasExtraTopPadding() ? this.badgeTopPadding : 0);
        TextAtomV2View servicePackageSelectionDescriptionTAV = this.binding.servicePackageSelectionDescriptionTAV;
        Intrinsics.checkNotNullExpressionValue(servicePackageSelectionDescriptionTAV, "servicePackageSelectionDescriptionTAV");
        TextHolderKt.bind$default(servicePackageSelectionDescriptionTAV, item.getDescription(), null, 2, null);
        this.cellsAdapter.bind(getContext(), item.getCells());
    }
}
