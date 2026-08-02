package ru.ozon.app.android.account.orders.emptyscreen.fintech.core;

import Nk.a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import gk0.q;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.emptyscreen.fintech.data.OfflineFintechBannerDTO;
import ru.ozon.app.android.account.orders.emptyscreen.fintech.di.OfflineFintechBannerComponent;
import ru.ozon.app.android.account.orders.emptyscreen.fintech.presentation.OfflineFintechBannerVI;
import ru.ozon.app.android.account.orders.emptyscreen.fintech.presentation.OfflineFintechBannerView;
import ru.ozon.app.android.account.orders.emptyscreen.fintech.presentation.OfflineFintechBannerViewHolder;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0013j\b\u0012\u0004\u0012\u00020\u0002`\u00142\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R,\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/account/orders/emptyscreen/fintech/core/OfflineFintechBannerViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/account/orders/emptyscreen/fintech/di/OfflineFintechBannerComponent;", "Lru/ozon/app/android/account/orders/emptyscreen/fintech/data/OfflineFintechBannerDTO;", "Lru/ozon/app/android/account/orders/emptyscreen/fintech/presentation/OfflineFintechBannerVI;", "<init>", "()V", "Landroid/content/Context;", "context", "Lru/ozon/app/android/account/orders/emptyscreen/fintech/presentation/OfflineFintechBannerView;", "createOfflineFintechBannerView", "(Landroid/content/Context;)Lru/ozon/app/android/account/orders/emptyscreen/fintech/presentation/OfflineFintechBannerView;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lk20/g;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "Ljava/lang/Void;", "getLayout", "()Ljava/lang/Void;", "Lru/ozon/app/android/account/orders/emptyscreen/fintech/core/OfflineFintechBannerMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/account/orders/emptyscreen/fintech/core/OfflineFintechBannerMapper;", "mapper", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/account/orders/emptyscreen/fintech/presentation/OfflineFintechBannerViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OfflineFintechBannerViewMapper extends WidgetViewMapper2<OfflineFintechBannerComponent, OfflineFintechBannerDTO, OfflineFintechBannerVI> {
    private final Void layout;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapper = k.b(OfflineFintechBannerViewMapper$mapper$2.INSTANCE);

    @NotNull
    private final Function2<View, ComposerReferences, OfflineFintechBannerViewHolder> holderProducer = OfflineFintechBannerViewMapper$holderProducer$1.INSTANCE;

    private final OfflineFintechBannerView createOfflineFintechBannerView(Context context) {
        OfflineFintechBannerView offlineFintechBannerView = (OfflineFintechBannerView) q.f64554a.i(N.b(OfflineFintechBannerView.class), context);
        if (offlineFintechBannerView != null) {
            return offlineFintechBannerView;
        }
        return new OfflineFintechBannerView(context, null, 0, 0, 14, null);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        return createOfflineFintechBannerView(a.a(parent, "parent", "getContext(...)"));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, OfflineFintechBannerViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public /* bridge */ /* synthetic */ Integer getLayout() {
        return (Integer) getLayout();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<OfflineFintechBannerComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return OfflineFintechBannerComponent.INSTANCE.create(storage);
    }

    public Void getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public OfflineFintechBannerMapper getMapper() {
        return (OfflineFintechBannerMapper) this.mapper.getValue();
    }
}
