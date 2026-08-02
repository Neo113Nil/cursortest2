package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.viewmapper;

import A00.a;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import At.C2445a;
import Sc.s;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.K;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j10.h;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.data.TileGrid2BannerVO;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.di.TileGrid2BannerComponent;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BannerViewModel;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BannerViewModelImpl;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.decorator.TileGrid2Decoration;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.decorator.TileGrid2MarginsDecoration;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.TileGrid2BannerView;
import ru.ozon.composer.ui.widget.h;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;
import xe.B0;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00182\b\u0010\u0012\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020#2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%J5\u0010,\u001a\u00020+2\u0006\u0010&\u001a\u00020\r2\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010*\u001a\b\u0012\u0004\u0012\u00020'0)H\u0016¢\u0006\u0004\b,\u0010-R2\u00100\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020/\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001d0.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R<\u00107\u001a$\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000305j\b\u0012\u0004\u0012\u00020\u0003`60.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00101\u001a\u0004\b8\u00103¨\u00069"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/viewmapper/TileGrid2BannerViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/di/TileGrid2BannerComponent;", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2BannerVO;", "<init>", "()V", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2BannerViewModel;", "viewModel", "Lxe/B0;", "observeSwipeRefresh", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/TileGrid2BannerViewModel;)Lxe/B0;", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/TileGrid2BannerView;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/TileGrid2BannerView;", "state", "item", "Lru/ozon/composer/ui/widget/h$b;", "getWidgetSpan", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2BannerVO;Lru/ozon/app/android/product/tiles/tilegrid2/presentation/data/TileGrid2BannerVO;)Lru/ozon/composer/ui/widget/h$b;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Landroid/content/Context;", "context", "", "Landroidx/recyclerview/widget/RecyclerView$n;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "Lk20/g;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "composerRootView", "Lru/ozon/composer/ui/widget/l;", "viewObject", "Lj10/h;", "viewItemHelper", "", "constructLayout", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)V", "Lkotlin/Function2;", "Ll20/d;", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Landroid/view/View;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "getHolderProducer", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileGrid2BannerViewMapper extends WidgetViewMapper2<TileGrid2BannerComponent, TileGrid2BannerVO, TileGrid2BannerVO> {

    @NotNull
    private final Function2<TileGrid2BannerVO, d, List<TileGrid2BannerVO>> mapper = TileGrid2BannerViewMapper$mapper$1.INSTANCE;

    @NotNull
    private final Function2<View, ComposerReferences, k<TileGrid2BannerVO>> holderProducer = new TileGrid2BannerViewMapper$holderProducer$1(this);

    private final B0 observeSwipeRefresh(ComposerReferences references, TileGrid2BannerViewModel viewModel) {
        final InterfaceC2395h<a> eventsFlow = references.getController().getEventsFlow();
        return C2399j.C(new C2408n0(new InterfaceC2395h<a>() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.viewmapper.TileGrid2BannerViewMapper$observeSwipeRefresh$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.viewmapper.TileGrid2BannerViewMapper$observeSwipeRefresh$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.viewmapper.TileGrid2BannerViewMapper$observeSwipeRefresh$$inlined$filter$1$2", f = "TileGrid2BannerViewMapper.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.viewmapper.TileGrid2BannerViewMapper$observeSwipeRefresh$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                    this.$this_unsafeFlow = interfaceC2397i;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                a aVar2 = (a) obj;
                                if ((aVar2 instanceof a.u.b) || (aVar2 instanceof a.u.c)) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super a> interfaceC2397i, kotlin.coroutines.d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new TileGrid2BannerViewMapper$observeSwipeRefresh$2(viewModel, null)), K.a(references.getContainer().e()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TileGrid2BannerComponent widgetComponent$lambda$0(C7475g c7475g) {
        return new TileGrid2BannerComponent(c7475g);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof TileGrid2BannerVO;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references, @NotNull h<l> viewItemHelper) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewItemHelper, "viewItemHelper");
        TileGrid2BannerViewModelImpl tileGrid2BannerViewModelImpl = (TileGrid2BannerViewModelImpl) new z0(references.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.viewmapper.TileGrid2BannerViewMapper$constructLayout$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                TileGrid2BannerViewModelImpl tileGrid2BannerViewModelImpl2 = TileGrid2BannerViewMapper.this.component().getViewModelProvider().get();
                Intrinsics.g(tileGrid2BannerViewModelImpl2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return tileGrid2BannerViewModelImpl2;
            }
        }).a(TileGrid2BannerViewModelImpl.class);
        Intrinsics.f(tileGrid2BannerViewModelImpl);
        observeSwipeRefresh(references, tileGrid2BannerViewModelImpl);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<RecyclerView.n> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.b0(TileGrid2MarginsDecoration.INSTANCE, new TileGrid2Decoration(context, component().getTileGrid2RootBgColorCache(), component().getFeatureChecker()));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<TileGrid2BannerVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<TileGrid2BannerVO, d, List<TileGrid2BannerVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<TileGrid2BannerComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(TileGrid2BannerComponent.class), new C2445a(storage, 6));
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public TileGrid2BannerView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        TileGrid2BannerView.Companion companion = TileGrid2BannerView.INSTANCE;
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return companion.create(context);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, ru.ozon.composer.ui.widget.e
    @NotNull
    public h.b getWidgetSpan(@NotNull TileGrid2BannerVO state, @NotNull TileGrid2BannerVO item) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(item, "item");
        return h.b.f94870b;
    }
}
