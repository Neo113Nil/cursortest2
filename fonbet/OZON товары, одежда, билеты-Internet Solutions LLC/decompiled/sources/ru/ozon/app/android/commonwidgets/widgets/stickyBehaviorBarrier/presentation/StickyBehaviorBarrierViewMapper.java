package ru.ozon.app.android.commonwidgets.widgets.stickyBehaviorBarrier.presentation;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.commonwidgets.R$layout;
import ru.ozon.app.android.commonwidgets.widgets.stickyBehaviorBarrier.data.StickyBehaviorBarrierDTO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001e\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR6\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0011j\u0002`\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00130\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR<\u0010!\u001a$\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u001fj\b\u0012\u0004\u0012\u00020\u0003` 0\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u0015\u001a\u0004\b\"\u0010\u0017¨\u0006#"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/stickyBehaviorBarrier/presentation/StickyBehaviorBarrierViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/commonwidgets/widgets/stickyBehaviorBarrier/data/StickyBehaviorBarrierDTO;", "Lru/ozon/app/android/commonwidgets/widgets/stickyBehaviorBarrier/presentation/StickyBehaviorBarrierVO;", "<init>", "()V", "", "stateId", "toVO", "(Lru/ozon/app/android/commonwidgets/widgets/stickyBehaviorBarrier/data/StickyBehaviorBarrierDTO;Ljava/lang/String;)Lru/ozon/app/android/commonwidgets/widgets/stickyBehaviorBarrier/presentation/StickyBehaviorBarrierVO;", "", "Lru/ozon/app/android/composer/widgets/base/StickyConfig;", "widgetStickyConfig", "Ljava/lang/String;", "getWidgetStickyConfig-H4O2Is4", "()Ljava/lang/String;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "getHolderProducer", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StickyBehaviorBarrierViewMapper extends WidgetViewMapper<StickyBehaviorBarrierDTO, StickyBehaviorBarrierVO> {

    @NotNull
    private final Function2<View, ComposerReferences, k<StickyBehaviorBarrierVO>> holderProducer;
    private final int layout;

    @NotNull
    private final Function2<StickyBehaviorBarrierDTO, d, List<StickyBehaviorBarrierVO>> mapper;

    @NotNull
    private final String widgetStickyConfig;

    public StickyBehaviorBarrierViewMapper() {
        Intrinsics.checkNotNullExpressionValue("StickyBehaviorBarrierViewMapper", "getSimpleName(...)");
        Intrinsics.checkNotNullParameter("StickyBehaviorBarrierViewMapper", "tag");
        this.widgetStickyConfig = "StickyBehaviorBarrierViewMapper";
        this.mapper = new StickyBehaviorBarrierViewMapper$mapper$1(this);
        this.layout = R$layout.widget_sticky_behavior_barrier_layout;
        this.holderProducer = StickyBehaviorBarrierViewMapper$holderProducer$1.INSTANCE;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<StickyBehaviorBarrierVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<StickyBehaviorBarrierDTO, d, List<StickyBehaviorBarrierVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: getWidgetStickyConfig-H4O2Is4, reason: not valid java name and from getter */
    public String getWidgetStickyConfig() {
        return this.widgetStickyConfig;
    }

    @NotNull
    public final StickyBehaviorBarrierVO toVO(@NotNull StickyBehaviorBarrierDTO stickyBehaviorBarrierDTO, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(stickyBehaviorBarrierDTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        return new StickyBehaviorBarrierVO(stateId.hashCode());
    }
}
