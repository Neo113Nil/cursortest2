package ru.ozon.app.android.travel.feature.avia.widgets.travelServicePackageIndMobileAddToOrder.v3.presentation;

import BP.a;
import Vg.d;
import WZ.l;
import WZ.t;
import android.view.View;
import android.view.ViewParent;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.avia.databinding.WidgetServicePackSelectionV3Binding;
import ru.ozon.app.android.travel.feature.avia.widgets.travelServicePackageIndMobileAddToOrder.v3.presentation.ServicePackSelectionV3VO;
import ru.ozon.app.android.travel.feature.avia.widgets.travelServicePackageIndMobileAddToOrder.v3.presentation.ServicePackSelectionV3WidgetViewHolder;
import ru.ozon.app.android.travel.feature.avia.widgets.travelServicePackageIndMobileAddToOrder.v3.presentation.adapter.ServicePackSelectionV3Adapter;
import ru.ozon.app.android.travel.feature.avia.widgets.travelServicePackageIndMobileAddToOrder.v3.view.ServicePackViewV3;
import ru.ozon.app.android.travel.utils.extensions.RecyclerViewExtensionsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.LargeBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeBorderlessButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u00152\u000e\u0010\u001a\u001a\n\u0018\u00010\u0018j\u0004\u0018\u0001`\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0019\u0010#\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b#\u0010\"J!\u0010(\u001a\u00020\u00152\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020$2\u0006\u0010*\u001a\u00020&H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0015H\u0002¢\u0006\u0004\b-\u0010\u001eJ#\u00102\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u00022\n\u00101\u001a\u00060/j\u0002`0H\u0014¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0015H\u0016¢\u0006\u0004\b4\u0010\u001eR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00105R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00106R\u0018\u0010\u000f\u001a\u00060\rj\u0002`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010<R\u0014\u0010>\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<R\u0016\u0010?\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010@R\u001c\u0010B\u001a\b\u0012\u0004\u0012\u00020A0\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010<R\u0016\u0010F\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR \u0010M\u001a\u000e\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020\u00150K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006O"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3ViewModel;", "viewModelService", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;LVg/d;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3ViewModel;LWZ/l;)V", "", "Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3VO$PackageTabVO;", "servicePacks", "", "bindServicePacks", "(Ljava/util/List;)V", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "trackView", "(LWZ/t;)V", "updateButton", "()V", "Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3VO$PushSMSVO;", "smsBlock", "setupSmsBlock", "(Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3VO$PushSMSVO;)V", "bindOrInvisibleSmsBlock", "Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/view/ServicePackViewV3;", "newSelectedTabView", "", "selectedTabIndex", "switchTab", "(Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/view/ServicePackViewV3;I)V", "endMargin", "newServicePackView", "(I)Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/view/ServicePackViewV3;", "observeAction", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3VO;Ll20/d;)V", "onAttach", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3ViewModel;", "LWZ/l;", "Lru/ozon/app/android/travel/feature/avia/databinding/WidgetServicePackSelectionV3Binding;", "binding", "Lru/ozon/app/android/travel/feature/avia/databinding/WidgetServicePackSelectionV3Binding;", "margin", "I", "packHeight", "packWidth", "currentSelectedTabView", "Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/view/ServicePackViewV3;", "Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3VO$PackageOptionVO;", "packageOptions", "Ljava/util/List;", "selectedPackInd", "", "isSmsBlockSelected", "Z", "Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/adapter/ServicePackSelectionV3Adapter;", "benefitsAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/adapter/ServicePackSelectionV3Adapter;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ServicePackSelectionV3WidgetViewHolder extends k<ServicePackSelectionV3VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ServicePackSelectionV3Adapter benefitsAdapter;

    @NotNull
    private final WidgetServicePackSelectionV3Binding binding;
    private ServicePackViewV3 currentSelectedTabView;
    private boolean isSmsBlockSelected;
    private final int margin;
    private final int packHeight;
    private final int packWidth;
    private List<ServicePackSelectionV3VO.PackageOptionVO> packageOptions;

    @NotNull
    private final ComposerReferences ref;
    private int selectedPackInd;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final ServicePackSelectionV3ViewModel viewModelService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServicePackSelectionV3WidgetViewHolder(@NotNull View containerView, @NotNull d customActionHandlersStoreFactory, @NotNull ComposerReferences ref, @NotNull ServicePackSelectionV3ViewModel viewModelService, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(viewModelService, "viewModelService");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.ref = ref;
        this.viewModelService = viewModelService;
        this.tokenizedAnalytics = tokenizedAnalytics;
        WidgetServicePackSelectionV3Binding bind = WidgetServicePackSelectionV3Binding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.margin = ResourceExtKt.toPx(8, getContext());
        this.packHeight = ResourceExtKt.toPx(84, getContext());
        this.packWidth = ResourceExtKt.toPx(109, getContext());
        ServicePackSelectionV3Adapter servicePackSelectionV3Adapter = new ServicePackSelectionV3Adapter();
        this.benefitsAdapter = servicePackSelectionV3Adapter;
        this.actionHandler = new ActionHandler.Builder(ref, this).customActionHandlers(new ServicePackSelectionV3WidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).onComposerAction(new ServicePackSelectionV3WidgetViewHolder$actionHandler$2(this)).buildHandler();
        bind.benefitsListRV.setAdapter(servicePackSelectionV3Adapter);
        bind.benefitsListRV.setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView benefitsListRV = bind.benefitsListRV;
        Intrinsics.checkNotNullExpressionValue(benefitsListRV, "benefitsListRV");
        RecyclerViewExtensionsKt.addParentTouchesInterceptor$default(benefitsListRV, false, 1, null);
    }

    private final void bindOrInvisibleSmsBlock(ServicePackSelectionV3VO.PushSMSVO smsBlock) {
        ConstraintLayout smsBlockCL = this.binding.smsBlockCL;
        Intrinsics.checkNotNullExpressionValue(smsBlockCL, "smsBlockCL");
        smsBlockCL.setVisibility(smsBlock != null ? 0 : 8);
        if (smsBlock != null) {
            TextAtomView smsTitleTAV = this.binding.smsTitleTAV;
            Intrinsics.checkNotNullExpressionValue(smsTitleTAV, "smsTitleTAV");
            TextAtomHolderKt.bind$default(smsTitleTAV, smsBlock.getTitle(), null, 2, null);
            this.binding.smsTitleTAV.setTextSize(1, 16.0f);
            BadgeView smsSaleBadgeBV = this.binding.smsSaleBadgeBV;
            Intrinsics.checkNotNullExpressionValue(smsSaleBadgeBV, "smsSaleBadgeBV");
            BadgeHolderKt.bindOrGone$default(smsSaleBadgeBV, smsBlock.getDiscountBadge(), (Function1) null, 2, (Object) null);
            PriceView smsPriceV = this.binding.smsPriceV;
            Intrinsics.checkNotNullExpressionValue(smsPriceV, "smsPriceV");
            PriceHolderKt.bind$default(smsPriceV, smsBlock.getPrice(), null, 2, null);
            TextAtomView smsDescriptionTAV = this.binding.smsDescriptionTAV;
            Intrinsics.checkNotNullExpressionValue(smsDescriptionTAV, "smsDescriptionTAV");
            TextAtomHolderKt.bind$default(smsDescriptionTAV, smsBlock.getDescription(), null, 2, null);
            this.binding.smsDescriptionTAV.setTextSize(1, 14.0f);
        }
    }

    private final void bindServicePacks(List<ServicePackSelectionV3VO.PackageTabVO> servicePacks) {
        this.binding.travelServicePackV3GroupLayout.removeAllViews();
        int i11 = 0;
        for (Object obj : servicePacks) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            ServicePackSelectionV3VO.PackageTabVO packageTabVO = (ServicePackSelectionV3VO.PackageTabVO) obj;
            ServicePackViewV3 newServicePackView = newServicePackView(i11 == C7714v.P(servicePacks) ? 0 : this.margin);
            newServicePackView.setOnClickListener(new a(4, this, newServicePackView));
            newServicePackView.bind(packageTabVO);
            this.binding.travelServicePackV3GroupLayout.addView(newServicePackView);
            if (packageTabVO.getIsSelected()) {
                this.currentSelectedTabView = newServicePackView;
                this.selectedPackInd = i11;
            }
            i11 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindServicePacks$lambda$5$lambda$4$lambda$3(ServicePackSelectionV3WidgetViewHolder servicePackSelectionV3WidgetViewHolder, ServicePackViewV3 servicePackViewV3, View view) {
        ViewParent parent = view.getParent();
        FlexboxLayout flexboxLayout = parent instanceof FlexboxLayout ? (FlexboxLayout) parent : null;
        if (flexboxLayout != null) {
            int indexOfChild = flexboxLayout.indexOfChild(view);
            servicePackSelectionV3WidgetViewHolder.selectedPackInd = indexOfChild;
            servicePackSelectionV3WidgetViewHolder.switchTab(view instanceof ServicePackViewV3 ? (ServicePackViewV3) view : null, indexOfChild);
            List<ServicePackSelectionV3VO.PackageOptionVO> list = servicePackSelectionV3WidgetViewHolder.packageOptions;
            if (list == null) {
                Intrinsics.n("packageOptions");
                throw null;
            }
            servicePackSelectionV3WidgetViewHolder.bindOrInvisibleSmsBlock(list.get(servicePackSelectionV3WidgetViewHolder.selectedPackInd).getSmsBlock());
            servicePackSelectionV3WidgetViewHolder.updateButton();
            List<ServicePackSelectionV3VO.PackageOptionVO> list2 = servicePackSelectionV3WidgetViewHolder.packageOptions;
            if (list2 != null) {
                servicePackSelectionV3WidgetViewHolder.trackView(list2.get(servicePackSelectionV3WidgetViewHolder.selectedPackInd).getTrackingInfo());
            } else {
                Intrinsics.n("packageOptions");
                throw null;
            }
        }
    }

    private final ServicePackViewV3 newServicePackView(int endMargin) {
        ServicePackViewV3 servicePackViewV3 = new ServicePackViewV3(getContext(), null, 0, 0, 14, null);
        FlexboxLayout.a aVar = new FlexboxLayout.a(this.packWidth, this.packHeight);
        aVar.a();
        aVar.setMarginEnd(endMargin);
        servicePackViewV3.setLayoutParams(aVar);
        return servicePackViewV3;
    }

    private final void observeAction() {
        this.viewModelService.actionLiveData().observe(this, new ServicePackSelectionV3WidgetViewHolderKt$sam$androidx_lifecycle_Observer$0(new ServicePackSelectionV3WidgetViewHolder$observeAction$1(this)));
        this.viewModelService.progressLiveData().observe(this, new ServicePackSelectionV3WidgetViewHolderKt$sam$androidx_lifecycle_Observer$0(new ServicePackSelectionV3WidgetViewHolder$observeAction$2(this)));
    }

    private final void setupSmsBlock(ServicePackSelectionV3VO.PushSMSVO smsBlock) {
        if (smsBlock != null) {
            trackView(smsBlock.getViewTrackingInfo());
            this.isSmsBlockSelected = smsBlock.getIsSMSSelected();
            this.binding.smsCheckBoxCB.setChecked(smsBlock.getIsSMSSelected());
            this.binding.smsCheckBoxCB.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: kN.b
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    ServicePackSelectionV3WidgetViewHolder.setupSmsBlock$lambda$9$lambda$8(ServicePackSelectionV3WidgetViewHolder.this, compoundButton, z11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupSmsBlock$lambda$9$lambda$8(ServicePackSelectionV3WidgetViewHolder servicePackSelectionV3WidgetViewHolder, CompoundButton compoundButton, boolean z11) {
        List<ServicePackSelectionV3VO.PackageOptionVO> list = servicePackSelectionV3WidgetViewHolder.packageOptions;
        if (list == null) {
            Intrinsics.n("packageOptions");
            throw null;
        }
        ServicePackSelectionV3VO.PushSMSVO smsBlock = list.get(servicePackSelectionV3WidgetViewHolder.selectedPackInd).getSmsBlock();
        if (smsBlock != null) {
            servicePackSelectionV3WidgetViewHolder.trackView(z11 ? smsBlock.getSetTrackingInfo() : smsBlock.getUnsetTrackingInfo());
        }
        servicePackSelectionV3WidgetViewHolder.isSmsBlockSelected = z11;
        servicePackSelectionV3WidgetViewHolder.updateButton();
    }

    private final void switchTab(ServicePackViewV3 newSelectedTabView, int selectedTabIndex) {
        if (newSelectedTabView == null) {
            return;
        }
        ServicePackViewV3 servicePackViewV3 = this.currentSelectedTabView;
        if (servicePackViewV3 == null) {
            Intrinsics.n("currentSelectedTabView");
            throw null;
        }
        servicePackViewV3.setSelected(false);
        newSelectedTabView.setSelected(true);
        this.currentSelectedTabView = newSelectedTabView;
        ServicePackSelectionV3Adapter servicePackSelectionV3Adapter = this.benefitsAdapter;
        List<ServicePackSelectionV3VO.PackageOptionVO> list = this.packageOptions;
        if (list != null) {
            servicePackSelectionV3Adapter.setItems(list.get(selectedTabIndex).getBenefits());
        } else {
            Intrinsics.n("packageOptions");
            throw null;
        }
    }

    private final void trackView(t trackingInfo) {
        if (trackingInfo != null) {
            TokenizedAnalyticsExtensionsKt.processAnyEvents$default(this.tokenizedAnalytics, trackingInfo, null, 2, null);
        }
    }

    private final void updateButton() {
        List<ServicePackSelectionV3VO.PackageOptionVO> list = this.packageOptions;
        if (list == null) {
            Intrinsics.n("packageOptions");
            throw null;
        }
        ServicePackSelectionV3VO.PackageOptionVO packageOptionVO = list.get(this.selectedPackInd);
        ButtonV3Atom.LargeButton selectButtonDefault = (!this.isSmsBlockSelected || packageOptionVO.getSmsBlock() == null) ? packageOptionVO.getSelectButtonDefault() : packageOptionVO.getSmsBlock().getSelectButtonSMS();
        LargeButtonView largeButtonLBV = this.binding.largeButtonLBV;
        Intrinsics.checkNotNullExpressionValue(largeButtonLBV, "largeButtonLBV");
        LargeButtonHolderKt.bind(largeButtonLBV, selectButtonDefault, this.actionHandler);
        LargeButtonView largeButtonLBV2 = this.binding.largeButtonLBV;
        Intrinsics.checkNotNullExpressionValue(largeButtonLBV2, "largeButtonLBV");
        ViewExtKt.setOnClickListenerThrottle$default(largeButtonLBV2, 0L, new ServicePackSelectionV3WidgetViewHolder$updateButton$1$1(selectButtonDefault, this), 1, null);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeAction();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ServicePackSelectionV3VO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.packageOptions = item.getOptions();
        TextAtomView travelServicePackSelectionV3TitleTAV = this.binding.travelServicePackSelectionV3TitleTAV;
        Intrinsics.checkNotNullExpressionValue(travelServicePackSelectionV3TitleTAV, "travelServicePackSelectionV3TitleTAV");
        TextAtomHolderKt.bind$default(travelServicePackSelectionV3TitleTAV, item.getTitle(), null, 2, null);
        TextAtomView priceDescriptionTAV = this.binding.priceDescriptionTAV;
        Intrinsics.checkNotNullExpressionValue(priceDescriptionTAV, "priceDescriptionTAV");
        TextAtomHolderKt.bind$default(priceDescriptionTAV, item.getPriceDescription(), null, 2, null);
        List<ServicePackSelectionV3VO.PackageOptionVO> options = item.getOptions();
        ArrayList arrayList = new ArrayList(C7714v.z(options, 10));
        Iterator<T> it = options.iterator();
        while (it.hasNext()) {
            arrayList.add(((ServicePackSelectionV3VO.PackageOptionVO) it.next()).getPackageTab());
        }
        bindServicePacks(arrayList);
        ServicePackSelectionV3VO.PackageOptionVO packageOptionVO = item.getOptions().get(this.selectedPackInd);
        this.benefitsAdapter.setItems(packageOptionVO.getBenefits());
        bindOrInvisibleSmsBlock(packageOptionVO.getSmsBlock());
        setupSmsBlock(packageOptionVO.getSmsBlock());
        updateButton();
        LargeBorderlessButtonView declineButtonLbbv = this.binding.declineButtonLbbv;
        Intrinsics.checkNotNullExpressionValue(declineButtonLbbv, "declineButtonLbbv");
        LargeBorderlessButtonHolderKt.bindOrGone(declineButtonLbbv, item.getDeclineButton(), this.actionHandler);
    }
}
