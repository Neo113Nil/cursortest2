package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.presentation;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import j10.h;
import java.util.List;
import java.util.Set;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.delivery.customActionsHandlers.gocheckout.GoCheckoutActionHandler;
import ru.ozon.app.android.platform.customActionHandlers.composerActionAndRedirect.handler.ComposerActionAndRedirectActionHandler;
import ru.ozon.app.android.platform.customActionHandlers.openDeeplinkForResult.OpenDeeplinkForRefreshResultActionHandler;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.view.SmallTileMoleculeView;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.di.TileGrid3WidgetComponent;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.presentation.data.TileGrid3VO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.presentation.decorator.TileGrid3Decorator;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.h;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J=\u0010 \u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\u000b2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0010\u0010\u001e\u001a\f\u0012\u0004\u0012\u00020\u00170\u001cj\u0002`\u001dH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010$\u001a\u00020#2\b\u0010\u0006\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J+\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u00020)j\b\u0012\u0004\u0012\u00020\u0002`*2\n\u0010(\u001a\u00060&j\u0002`'H\u0016¢\u0006\u0004\b+\u0010,R6\u00100\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060.j\u0002`/\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00120-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\"\u00107\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020605048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001b\u0010;\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001b\u0010A\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010:\u001a\u0004\b?\u0010@R<\u0010E\u001a$\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030Cj\b\u0012\u0004\u0012\u00020\u0003`D0-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u00101\u001a\u0004\bF\u00103¨\u0006G"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/presentation/TileGrid3ViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/di/TileGrid3WidgetComponent;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/presentation/data/TileGrid3VO;", "<init>", "()V", "state", "item", "Lru/ozon/composer/ui/widget/h$c;", "getWidgetSpan", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/presentation/data/TileGrid3VO;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/presentation/data/TileGrid3VO;)Lru/ozon/composer/ui/widget/h$c;", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/view/SmallTileMoleculeView;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/view/SmallTileMoleculeView;", "Landroid/content/Context;", "context", "", "Landroidx/recyclerview/widget/RecyclerView$n;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "composerRootView", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "viewItemHelper", "", "constructLayout", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)V", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "customActionHandlers", "Ljava/util/Set;", "isPdpOfflineModeEnabled$delegate", "LSc/j;", "isPdpOfflineModeEnabled", "()Z", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/presentation/decorator/TileGrid3Decorator;", "decorator$delegate", "getDecorator", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/presentation/decorator/TileGrid3Decorator;", "decorator", "Landroid/view/View;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "getHolderProducer", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileGrid3ViewMapper extends WidgetViewMapper2<TileGrid3WidgetComponent, TileGrid3VO, TileGrid3VO> {

    @NotNull
    private final Set<Class<? extends CustomActionHandler>> customActionHandlers;

    /* renamed from: decorator$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j decorator;

    @NotNull
    private final Function2<View, ComposerReferences, k<TileGrid3VO>> holderProducer;

    /* renamed from: isPdpOfflineModeEnabled$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isPdpOfflineModeEnabled;

    @NotNull
    private final Function2<TileGrid3VO, d, List<TileGrid3VO>> mapper = new TileGrid3ViewMapper$mapper$1(this);

    public TileGrid3ViewMapper() {
        Class[] elements = {GoCheckoutActionHandler.class, OpenDeeplinkForRefreshResultActionHandler.class, ComposerActionAndRedirectActionHandler.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.customActionHandlers = C7705l.j0(elements);
        this.isPdpOfflineModeEnabled = LazyUtilsKt.unsafeLazy(new TileGrid3ViewMapper$isPdpOfflineModeEnabled$2(this));
        this.decorator = LazyUtilsKt.unsafeLazy(TileGrid3ViewMapper$decorator$2.INSTANCE);
        this.holderProducer = new TileGrid3ViewMapper$holderProducer$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TileGrid3Decorator getDecorator() {
        return (TileGrid3Decorator) this.decorator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPdpOfflineModeEnabled() {
        return ((Boolean) this.isPdpOfflineModeEnabled.getValue()).booleanValue();
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof TileGrid3VO;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references, @NotNull h<l> viewItemHelper) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewItemHelper, "viewItemHelper");
        component().getImagePrefetchInfoProviderStorage().addProvider(N.b(TileGrid3VO.class), component().getPrefetchInfoProvider());
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<RecyclerView.n> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(getDecorator());
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<TileGrid3VO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<TileGrid3VO, d, List<TileGrid3VO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<TileGrid3WidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return TileGrid3WidgetComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public SmallTileMoleculeView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        SmallTileMoleculeView smallTileMoleculeView = new SmallTileMoleculeView(context);
        smallTileMoleculeView.setId(View.generateViewId());
        smallTileMoleculeView.setLayoutParams(new RecyclerView.p(-1, -2));
        return smallTileMoleculeView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, ru.ozon.composer.ui.widget.e
    @NotNull
    public h.c getWidgetSpan(@NotNull TileGrid3VO state, @NotNull TileGrid3VO item) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(item, "item");
        return h.c.f94871b;
    }
}
