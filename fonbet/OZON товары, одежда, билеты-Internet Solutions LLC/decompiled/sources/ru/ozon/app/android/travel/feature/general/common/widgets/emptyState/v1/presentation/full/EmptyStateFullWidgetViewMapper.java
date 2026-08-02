package ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v1.presentation.full;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v1.data.EmptyStateWidgetDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v1.di.EmptyStateComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v1.presentation.EmptyStateWidgetVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v1.presentation.EmptyStateWidgetViewHolder;
import ru.ozon.app.android.travel.molecules.view.emptyState.v1.EmptyStateView;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0014j\b\u0012\u0004\u0012\u00020\u0002`\u00152\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR,\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R0\u0010)\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060%j\u0002`&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040'0\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010$¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v1/presentation/full/EmptyStateFullWidgetViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v1/di/EmptyStateComponent;", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v1/data/EmptyStateWidgetDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v1/presentation/EmptyStateWidgetVO;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateView;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateView;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v1/presentation/EmptyStateWidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "getMapper", "mapper", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EmptyStateFullWidgetViewMapper extends WidgetViewMapper2<EmptyStateComponent, EmptyStateWidgetDTO, EmptyStateWidgetVO> {

    @NotNull
    private final Function2<View, ComposerReferences, EmptyStateWidgetViewHolder> holderProducer = EmptyStateFullWidgetViewMapper$holderProducer$1.INSTANCE;
    private final Integer layout;

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        if (!(state instanceof EmptyStateWidgetDTO)) {
            return false;
        }
        EmptyStateWidgetDTO emptyStateWidgetDTO = (EmptyStateWidgetDTO) state;
        return emptyStateWidgetDTO.getAppearance() == EmptyStateWidgetDTO.ViewAppearance.VIEW_APPEARANCE_FULL && emptyStateWidgetDTO.getButtonsPosition() != EmptyStateWidgetDTO.ButtonsPosition.AT_BOTTOM;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, EmptyStateWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<EmptyStateWidgetDTO, d, List<EmptyStateWidgetVO>> getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<EmptyStateComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return EmptyStateComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public EmptyStateView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        EmptyStateView emptyStateView = new EmptyStateView(context, null, 0, 0, 14, null);
        Context context2 = emptyStateView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px = ResourceExtKt.toPx(16, context2);
        Context context3 = emptyStateView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        emptyStateView.setPadding(px, ResourceExtKt.toPx(32, context3), px, 0);
        Context context4 = emptyStateView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        emptyStateView.setBackgroundColor(ThemeExtKt.themeColor(context4, R$attr.layerFloor1));
        emptyStateView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return emptyStateView;
    }
}
