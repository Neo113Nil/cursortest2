package ru.ozon.app.android.commonwidgets.widgets.logosList.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModelProviderWrapper;
import ru.ozon.app.android.cart.ui.tooltip.molecule.TooltipWithOnboardingActionDTO;
import ru.ozon.app.android.cart.ui.tooltip.molecule.TooltipWithOnboardingActionVOKt;
import ru.ozon.app.android.common.commonwidgets.R$id;
import ru.ozon.app.android.commonwidgets.widgets.logosList.data.LogosListDTO;
import ru.ozon.app.android.commonwidgets.widgets.logosList.presentation.LogosListVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 -2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001-B%\b\u0007\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u000f\u001a\u00020\u0014*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u000f\u0010\u0015J\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001fR6\u0010$\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060!j\u0002`\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030#0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R<\u0010+\u001a$\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020(\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030)j\b\u0012\u0004\u0012\u00020\u0003`*0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010'¨\u0006."}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/LogosListViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/commonwidgets/widgets/logosList/data/LogosListDTO;", "Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/LogosListVO;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModelProviderWrapper;", "asyncCartViewModelProvider", "<init>", "(LVg/d;Lru/ozon/app/android/utils/AppType;Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModelProviderWrapper;)V", "", "stateId", "toVO", "(Lru/ozon/app/android/commonwidgets/widgets/logosList/data/LogosListDTO;Ljava/lang/String;)Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/LogosListVO;", "Lru/ozon/app/android/commonwidgets/widgets/logosList/data/LogosListDTO$Item;", "", "widgetId", "Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/LogosListVO$Item;", "(Lru/ozon/app/android/commonwidgets/widgets/logosList/data/LogosListDTO$Item;J)Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/LogosListVO$Item;", "Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/LogosListVO$Onboarding;", "getOnboarding", "(Lru/ozon/app/android/commonwidgets/widgets/logosList/data/LogosListDTO;)Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/LogosListVO$Onboarding;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lru/ozon/app/android/utils/AppType;", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModelProviderWrapper;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "getHolderProducer", "Companion", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LogosListViewMapper extends WidgetViewMapper<LogosListDTO, LogosListVO> {

    @NotNull
    private final AppType appType;

    @NotNull
    private final AsyncCartViewModelProviderWrapper asyncCartViewModelProvider;

    @NotNull
    private final Function2<View, ComposerReferences, k<LogosListVO>> holderProducer;

    @NotNull
    private final Function2<LogosListDTO, d, List<LogosListVO>> mapper;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int VIEW_TOP_PADDING = UiExtKt.toPx(8);
    private static final int VIEW_BOTTOM_PADDING = UiExtKt.toPx(4);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/logosList/presentation/LogosListViewMapper$Companion;", "", "<init>", "()V", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public LogosListViewMapper(@NotNull Vg.d customActionHandlersStoreFactory, @NotNull AppType appType, @NotNull AsyncCartViewModelProviderWrapper asyncCartViewModelProvider) {
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(asyncCartViewModelProvider, "asyncCartViewModelProvider");
        this.appType = appType;
        this.asyncCartViewModelProvider = asyncCartViewModelProvider;
        this.mapper = new LogosListViewMapper$mapper$1(this);
        this.holderProducer = new LogosListViewMapper$holderProducer$1(this, customActionHandlersStoreFactory);
    }

    private final LogosListVO.Onboarding getOnboarding(LogosListDTO logosListDTO) {
        int i11 = 0;
        for (Object obj : logosListDTO.getItems()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            TooltipWithOnboardingActionDTO tooltipWithOnboardingAction = ((LogosListDTO.Item) obj).getTooltipWithOnboardingAction();
            if (tooltipWithOnboardingAction != null) {
                return new LogosListVO.Onboarding(TooltipWithOnboardingActionVOKt.toVo(tooltipWithOnboardingAction), i11);
            }
            i11 = i12;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LogosListVO toVO(LogosListDTO logosListDTO, String str) {
        long hashCode = str.hashCode();
        List<LogosListDTO.Item> items = logosListDTO.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((LogosListDTO.Item) it.next(), hashCode));
        }
        return new LogosListVO(hashCode, arrayList, getOnboarding(logosListDTO));
    }

    @Override // ru.ozon.composer.ui.widget.g
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        RecyclerView recyclerView = new RecyclerView(parent.getContext());
        recyclerView.setId(R$id.rvLogosList);
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        int i11 = this.appType == AppType.SELECT ? R$attr.bgDarkKey : R$attr.layerFloor0;
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.setBackgroundColor(ThemeExtKt.themeColor(context, i11));
        recyclerView.setPadding(0, VIEW_TOP_PADDING, 0, VIEW_BOTTOM_PADDING);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(parent.getContext());
        linearLayoutManager.setOrientation(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setNestedScrollingEnabled(false);
        return recyclerView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<LogosListVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<LogosListDTO, d, List<LogosListVO>> getMapper() {
        return this.mapper;
    }

    private final LogosListVO.Item toVO(LogosListDTO.Item item, long j11) {
        boolean isSelected = item.isSelected();
        String text = item.getText();
        String subtext = item.getSubtext();
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(item.getAction(), item.getTrackingInfo());
        Map<String, TokenizedTrackingInfo> trackingInfo = item.getTrackingInfo();
        return new LogosListVO.Item(isSelected, text, subtext, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }
}
