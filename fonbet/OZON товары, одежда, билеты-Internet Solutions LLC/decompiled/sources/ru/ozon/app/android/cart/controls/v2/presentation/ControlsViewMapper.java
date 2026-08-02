package ru.ozon.app.android.cart.controls.v2.presentation;

import Cn.C2782a;
import N10.h;
import Sc.InterfaceC4008j;
import Vg.c;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.cart.controls.v2.data.ControlsDTO;
import ru.ozon.app.android.cart.controls.v2.di.ControlsWidgetComponent;
import ru.ozon.app.android.cart.controls.v2.di.DaggerControlsWidgetComponent;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R<\u0010&\u001a$\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020#\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040$j\b\u0012\u0004\u0012\u00020\u0004`%0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/cart/controls/v2/presentation/ControlsViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/cart/controls/v2/di/ControlsWidgetComponent;", "Lru/ozon/app/android/cart/controls/v2/data/ControlsDTO;", "Lru/ozon/app/android/cart/controls/v2/presentation/ControlsVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "LVg/c;", "customActionHandlersStore$delegate", "LSc/j;", "getCustomActionHandlersStore", "()LVg/c;", "customActionHandlersStore", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "LN10/h;", "stickyWidgetConfig", "LN10/h;", "getStickyWidgetConfig", "()LN10/h;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/cart/controls/v2/presentation/ControlsMapper;", "getMapper", "()Lru/ozon/app/android/cart/controls/v2/presentation/ControlsMapper;", "mapper", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ControlsViewMapper extends WidgetViewMapper2<ControlsWidgetComponent, ControlsDTO, ControlsVO> {

    /* renamed from: customActionHandlersStore$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j customActionHandlersStore = LazyUtilsKt.unsafeLazy(new ControlsViewMapper$customActionHandlersStore$2(this));

    @NotNull
    private final Function2<View, ComposerReferences, k<ControlsVO>> holderProducer;
    private final Integer layout;

    @NotNull
    private final h stickyWidgetConfig;

    public ControlsViewMapper() {
        Intrinsics.checkNotNullParameter("STICKY_TAG", "tag");
        this.stickyWidgetConfig = new h("STICKY_TAG", 6);
        this.holderProducer = new ControlsViewMapper$holderProducer$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c getCustomActionHandlersStore() {
        return (c) this.customActionHandlersStore.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ControlsWidgetComponent widgetComponent$lambda$0(C7475g c7475g) {
        return DaggerControlsWidgetComponent.factory().create((CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class), (ComposerComponentApi) c7475g.getComponent(ComposerComponentApi.class));
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new ControlsView(context, null, 0, 6, null);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<ControlsVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public h getStickyWidgetConfig() {
        return this.stickyWidgetConfig;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ControlsWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(ControlsWidgetComponent.class), new C2782a(storage, 0));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public ControlsMapper getMapper() {
        return component().getMapper();
    }
}
