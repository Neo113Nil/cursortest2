package ru.ozon.app.android.csma.tips.widgets.tipcourierheader.presentation.simple;

import AO.a;
import android.view.View;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.csma.tips.R$layout;
import ru.ozon.app.android.csma.tips.widgets.tipcourierheader.data.TipCourierHeaderDTO;
import ru.ozon.app.android.csma.tips.widgets.tipcourierheader.di.TipCourierHeaderComponent;
import ru.ozon.app.android.csma.tips.widgets.tipcourierheader.presentation.TipCourierHeaderMapper;
import ru.ozon.app.android.csma.tips.widgets.tipcourierheader.presentation.TipCourierHeaderVO;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R<\u0010\u001c\u001a$\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u001aj\b\u0012\u0004\u0012\u00020\u0004`\u001b0\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/csma/tips/widgets/tipcourierheader/presentation/simple/TipCourierHeaderViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierheader/di/TipCourierHeaderComponent;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierheader/data/TipCourierHeaderDTO;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierheader/presentation/TipCourierHeaderVO;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/csma/tips/widgets/tipcourierheader/presentation/TipCourierHeaderMapper;", "getMapper", "()Lru/ozon/app/android/csma/tips/widgets/tipcourierheader/presentation/TipCourierHeaderMapper;", "mapper", "tips_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TipCourierHeaderViewMapper extends WidgetViewMapper2<TipCourierHeaderComponent, TipCourierHeaderDTO, TipCourierHeaderVO> {
    private final int layout = R$layout.widget_tip_courier_header_layout;

    @NotNull
    private final Function2<View, ComposerReferences, k<TipCourierHeaderVO>> holderProducer = TipCourierHeaderViewMapper$holderProducer$1.INSTANCE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final TipCourierHeaderComponent widgetComponent$lambda$0(C7475g c7475g) {
        return TipCourierHeaderComponent.INSTANCE.create(c7475g);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return !((state instanceof TipCourierHeaderDTO ? (TipCourierHeaderDTO) state : null) != null ? Intrinsics.d(r2.getShowInFullScreen(), Boolean.TRUE) : false);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<TipCourierHeaderVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<TipCourierHeaderComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(TipCourierHeaderComponent.class), new a(storage, 12));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public TipCourierHeaderMapper getMapper() {
        return component().getMapper();
    }
}
