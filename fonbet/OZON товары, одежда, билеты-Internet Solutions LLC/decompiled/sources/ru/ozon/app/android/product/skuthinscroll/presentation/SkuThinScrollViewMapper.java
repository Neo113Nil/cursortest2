package ru.ozon.app.android.product.skuthinscroll.presentation;

import android.view.View;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.product.R$layout;
import ru.ozon.app.android.product.skuthinscroll.data.SkuThinScrollDTO;
import ru.ozon.app.android.product.skuthinscroll.di.DaggerSkuThinScrollComponent;
import ru.ozon.app.android.product.skuthinscroll.di.SkuThinScrollComponent;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;
import ru.ozon.app.android.video.di.VideoComponentApi;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0013j\b\u0012\u0004\u0012\u00020\u0002`\u00142\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR<\u0010!\u001a$\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u001fj\b\u0012\u0004\u0012\u00020\u0004` 0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R0\u0010)\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060%j\u0002`&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040'0\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010$¨\u0006*"}, d2 = {"Lru/ozon/app/android/product/skuthinscroll/presentation/SkuThinScrollViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/product/skuthinscroll/di/SkuThinScrollComponent;", "Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollDTO;", "Lru/ozon/app/android/product/skuthinscroll/presentation/SkuThinScrollVO;", "<init>", "()V", "oldItem", "newItem", "", "getPayload", "(Lru/ozon/app/android/product/skuthinscroll/presentation/SkuThinScrollVO;Lru/ozon/app/android/product/skuthinscroll/presentation/SkuThinScrollVO;)Ljava/lang/Object;", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "getMapper", "mapper", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SkuThinScrollViewMapper extends WidgetViewMapper2<SkuThinScrollComponent, SkuThinScrollDTO, SkuThinScrollVO> {
    private final int layout = R$layout.widget_sku_thin_scroll;

    @NotNull
    private final Function2<View, ComposerReferences, k<SkuThinScrollVO>> holderProducer = new SkuThinScrollViewMapper$holderProducer$1(this);

    /* JADX INFO: Access modifiers changed from: private */
    public static final SkuThinScrollComponent widgetComponent$lambda$0(C7475g c7475g) {
        return DaggerSkuThinScrollComponent.factory().create((AccountComponentApi) c7475g.getComponent(AccountComponentApi.class), (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class), (CartServiceApi) c7475g.getComponent(CartServiceApi.class), (CoroutineDispatchersComponentApi) c7475g.getComponent(CoroutineDispatchersComponentApi.class), (VideoComponentApi) c7475g.getComponent(VideoComponentApi.class), (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class));
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof SkuThinScrollDTO;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<SkuThinScrollVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<SkuThinScrollDTO, l20.d, List<SkuThinScrollVO>> getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<SkuThinScrollComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(SkuThinScrollComponent.class), new GN.a(storage, 2));
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull SkuThinScrollVO oldItem, @NotNull SkuThinScrollVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        return Unit.f71690a;
    }
}
