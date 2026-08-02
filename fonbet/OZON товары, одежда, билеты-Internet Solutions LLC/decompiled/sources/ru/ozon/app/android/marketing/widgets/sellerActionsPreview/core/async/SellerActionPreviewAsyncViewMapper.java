package ru.ozon.app.android.marketing.widgets.sellerActionsPreview.core.async;

import android.view.View;
import android.view.ViewGroup;
import gk0.q;
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
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.data.SellerActionsPreviewDtoWrapper;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.di.SellerActionsPreviewComponent;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.SellerActionsPreviewVO;
import ru.ozon.app.android.marketing.widgets.sellerActionsPreview.presentation.async.SellerActionsPreviewAsyncViewHolder;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R2\u0010\u001a\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00190\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR,\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001d¨\u0006\""}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/core/async/SellerActionPreviewAsyncViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/di/SellerActionsPreviewComponent;", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/data/SellerActionsPreviewDtoWrapper$Async;", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/SellerActionsPreviewVO$Async;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lkotlin/Function2;", "Ll20/d;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/marketing/widgets/sellerActionsPreview/presentation/async/SellerActionsPreviewAsyncViewHolder;", "holderProducer", "getHolderProducer", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SellerActionPreviewAsyncViewMapper extends WidgetViewMapper2<SellerActionsPreviewComponent, SellerActionsPreviewDtoWrapper.Async, SellerActionsPreviewVO.Async> {

    @NotNull
    private final Function2<SellerActionsPreviewDtoWrapper.Async, d, List<SellerActionsPreviewVO.Async>> mapper = SellerActionPreviewAsyncViewMapper$mapper$1.INSTANCE;

    @NotNull
    private final Function2<View, ComposerReferences, SellerActionsPreviewAsyncViewHolder> holderProducer = new SellerActionPreviewAsyncViewMapper$holderProducer$1(this);

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof SellerActionsPreviewDtoWrapper.Async;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View i11 = q.f64554a.i(N.b(View.class), parent.getContext());
        return i11 == null ? new View(parent.getContext()) : i11;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, SellerActionsPreviewAsyncViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<SellerActionsPreviewDtoWrapper.Async, d, List<SellerActionsPreviewVO.Async>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<SellerActionsPreviewComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return SellerActionsPreviewComponent.INSTANCE.create(storage);
    }
}
