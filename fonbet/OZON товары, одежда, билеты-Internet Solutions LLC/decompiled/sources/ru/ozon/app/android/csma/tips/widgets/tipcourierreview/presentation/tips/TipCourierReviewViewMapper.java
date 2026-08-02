package ru.ozon.app.android.csma.tips.widgets.tipcourierreview.presentation.tips;

import CQ.a;
import android.view.View;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.csma.tips.R$layout;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.data.TipCourierReviewDTO;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.data.TipCourierReviewStubDO;
import ru.ozon.app.android.csma.tips.widgets.tipcourierreview.di.TipCourierReviewV2Component;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R6\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0012j\u0002`\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00140\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR<\u0010\"\u001a$\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040 j\b\u0012\u0004\u0012\u00020\u0004`!0\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0018¨\u0006$"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/presentation/tips/TipCourierReviewViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/di/TipCourierReviewV2Component;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewDTO;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewStubDO;", "<init>", "()V", "", "stateId", "toDO", "(Ljava/lang/String;)Lru/ozon/app/android/csma/tips/widgets/tipcourierreview/data/TipCourierReviewStubDO;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "getHolderProducer", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TipCourierReviewViewMapper extends WidgetViewMapper2<TipCourierReviewV2Component, TipCourierReviewDTO, TipCourierReviewStubDO> {

    @NotNull
    private final Function2<TipCourierReviewDTO, d, List<TipCourierReviewStubDO>> mapper = new TipCourierReviewViewMapper$mapper$1(this);
    private final int layout = R$layout.widget_tip_courier_review_layout;

    @NotNull
    private final Function2<View, ComposerReferences, k<TipCourierReviewStubDO>> holderProducer = new TipCourierReviewViewMapper$holderProducer$1(this);

    /* JADX INFO: Access modifiers changed from: private */
    public final TipCourierReviewStubDO toDO(String stateId) {
        return new TipCourierReviewStubDO(stateId.hashCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TipCourierReviewV2Component widgetComponent$lambda$0(C7475g c7475g) {
        return TipCourierReviewV2Component.INSTANCE.create(c7475g);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<TipCourierReviewStubDO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<TipCourierReviewDTO, d, List<TipCourierReviewStubDO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<TipCourierReviewV2Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(TipCourierReviewV2Component.class), new a(storage, 10));
    }
}
