package ru.ozon.app.android.checkoutcomposer.totalExpanded.presentation;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.totalExpanded.data.TotalExpandedDTO;
import ru.ozon.app.android.checkoutcomposer.totalExpanded.di.TotalExpandedWidgetComponent;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R<\u0010\u001d\u001a$\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u001bj\b\u0012\u0004\u0012\u00020\u0003`\u001c0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/totalExpanded/presentation/TotalExpandedViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/checkoutcomposer/totalExpanded/data/TotalExpandedDTO;", "Lru/ozon/app/android/checkoutcomposer/totalExpanded/presentation/TotalExpandedVO;", "Lru/ozon/app/android/checkoutcomposer/totalExpanded/di/TotalExpandedWidgetComponent;", "component", "<init>", "(Lru/ozon/app/android/checkoutcomposer/totalExpanded/di/TotalExpandedWidgetComponent;)V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/checkoutcomposer/totalExpanded/di/TotalExpandedWidgetComponent;", "Lru/ozon/app/android/checkoutcomposer/totalExpanded/presentation/TotalExpandedMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/checkoutcomposer/totalExpanded/presentation/TotalExpandedMapper;", "mapper", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TotalExpandedViewMapper extends WidgetViewMapper<TotalExpandedDTO, TotalExpandedVO> {

    @NotNull
    private final TotalExpandedWidgetComponent component;

    @NotNull
    private final Function2<View, ComposerReferences, k<TotalExpandedVO>> holderProducer;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapper;

    public TotalExpandedViewMapper(@NotNull TotalExpandedWidgetComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.mapper = Sc.k.b(TotalExpandedViewMapper$mapper$2.INSTANCE);
        this.holderProducer = new TotalExpandedViewMapper$holderProducer$1(this);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof TotalExpandedDTO;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new TotalExpandedView(context, null, 0, 6, null);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<TotalExpandedVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<TotalExpandedDTO, d, List<TotalExpandedVO>> getMapper() {
        return (TotalExpandedMapper) this.mapper.getValue();
    }
}
