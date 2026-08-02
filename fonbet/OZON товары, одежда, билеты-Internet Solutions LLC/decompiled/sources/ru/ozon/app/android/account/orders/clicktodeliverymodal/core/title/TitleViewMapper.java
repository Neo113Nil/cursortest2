package ru.ozon.app.android.account.orders.clicktodeliverymodal.core.title;

import AO.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.data.TitleDTO;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.di.ClickToDeliveryWidgetComponent;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.presentation.title.TitleVI;
import ru.ozon.app.android.account.orders.clicktodeliverymodal.presentation.title.TitleWidgetViewHolder;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R,\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/account/orders/clicktodeliverymodal/core/title/TitleViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/account/orders/clicktodeliverymodal/di/ClickToDeliveryWidgetComponent;", "Lru/ozon/app/android/account/orders/clicktodeliverymodal/data/TitleDTO;", "Lru/ozon/app/android/account/orders/clicktodeliverymodal/presentation/title/TitleVI;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/uni/android/atom/text/TextAtomV2View;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/account/orders/clicktodeliverymodal/presentation/title/TitleWidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/account/orders/clicktodeliverymodal/core/title/TitleMapper;", "getMapper", "()Lru/ozon/app/android/account/orders/clicktodeliverymodal/core/title/TitleMapper;", "mapper", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TitleViewMapper extends WidgetViewMapper2<ClickToDeliveryWidgetComponent, TitleDTO, TitleVI> {

    @NotNull
    private final Function2<View, ComposerReferences, TitleWidgetViewHolder> holderProducer = new TitleViewMapper$holderProducer$1(this);

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClickToDeliveryWidgetComponent widgetComponent$lambda$1(C7475g c7475g) {
        return ClickToDeliveryWidgetComponent.INSTANCE.create(c7475g);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof TitleDTO;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, TitleWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ClickToDeliveryWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(ClickToDeliveryWidgetComponent.class), new a(storage, 14));
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public TextAtomV2View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setLayoutParams(new RecyclerView.p(-1, -2));
        return textAtomV2View;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public TitleMapper getMapper() {
        return component().getTitleMapper();
    }
}
