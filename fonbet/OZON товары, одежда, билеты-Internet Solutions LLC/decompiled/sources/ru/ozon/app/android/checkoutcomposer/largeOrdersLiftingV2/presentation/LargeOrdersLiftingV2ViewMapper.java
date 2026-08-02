package ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkout.R$layout;
import ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.data.LargeOrdersLiftingV2DTO;
import ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.di.LargeOrdersLiftingV2Component;
import ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.model.LargeOrdersLiftingV2VO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R,\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR,\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001c0\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001a¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/LargeOrdersLiftingV2ViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/data/LargeOrdersLiftingV2DTO;", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/model/LargeOrdersLiftingV2VO;", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/di/LargeOrdersLiftingV2Component;", "component", "<init>", "(Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/di/LargeOrdersLiftingV2Component;)V", "oldItem", "newItem", "", "getPayload", "(Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/model/LargeOrdersLiftingV2VO;Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/model/LargeOrdersLiftingV2VO;)V", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/di/LargeOrdersLiftingV2Component;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/presentation/LargeOrdersLiftingV2ViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ll20/d;", "", "getMapper", "mapper", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LargeOrdersLiftingV2ViewMapper extends WidgetViewMapper<LargeOrdersLiftingV2DTO, LargeOrdersLiftingV2VO> {

    @NotNull
    private final LargeOrdersLiftingV2Component component;

    @NotNull
    private final Function2<View, ComposerReferences, LargeOrdersLiftingV2ViewHolder> holderProducer;
    private final int layout;

    public LargeOrdersLiftingV2ViewMapper(@NotNull LargeOrdersLiftingV2Component component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.layout = R$layout.widget_large_orders_lifting_v2;
        this.holderProducer = new LargeOrdersLiftingV2ViewMapper$holderProducer$1(this);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<LargeOrdersLiftingV2VO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<LargeOrdersLiftingV2DTO, d, List<LargeOrdersLiftingV2VO>> getMapper() {
        return this.component.getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g
    public /* bridge */ /* synthetic */ Object getPayload(c cVar, c cVar2) {
        getPayload((LargeOrdersLiftingV2VO) cVar, (LargeOrdersLiftingV2VO) cVar2);
        return Unit.f71690a;
    }

    public void getPayload(@NotNull LargeOrdersLiftingV2VO oldItem, @NotNull LargeOrdersLiftingV2VO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
    }
}
