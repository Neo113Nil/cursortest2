package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.viewMapper;

import A00.a;
import B0.C2454a;
import a00.h;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.domain.flags.CategoryMainPageFreshPreCreateWidgetsNewConfiguration;
import ru.ozon.app.android.fresh.common.flags.FreshCatalogueTabsPerformance;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.CatalogTabsController;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.SelectTabEvent;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.data.CatalogueTabsDTO;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.di.CatalogueTabsComponent;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.mapper.CatalogueTabsMapper;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.mapper.CatalogueTabsVO;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.presentation.CatalogueTabsDrawableCache;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.presentation.CatalogueTabsViewHolder;
import ru.ozon.app.android.fresh.navigation.CatalogTabsSharedViewModel;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 M2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001MB\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0015j\b\u0012\u0004\u0012\u00020\u0004`\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u00020!j\b\u0012\u0004\u0012\u00020\u0002`\"2\n\u0010 \u001a\u00060\u001ej\u0002`\u001fH\u0016¢\u0006\u0004\b#\u0010$J=\u0010/\u001a\u00020.2\u0006\u0010%\u001a\u00020\r2\n\u0010(\u001a\u00060&j\u0002`'2\u0006\u0010*\u001a\u00020)2\u0010\u0010-\u001a\f\u0012\u0004\u0012\u00020&0+j\u0002`,H\u0016¢\u0006\u0004\b/\u00100R\u0018\u00101\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u00107\u001a\u0004\u0018\u0001068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R(\u0010=\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00190<0;8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001e\u0010C\u001a\u00060Aj\u0002`B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020G8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010L\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010:¨\u0006N"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/viewMapper/CatalogueTabsViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/di/CatalogueTabsComponent;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/data/CatalogueTabsDTO;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/mapper/CatalogueTabsVO;", "<init>", "()V", "La00/h;", "Lru/ozon/app/android/composer/ViewModelOwnerProvider;", "viewModelOwnerProvider", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogTabsController;", "getCatalogTabsController", "(La00/h;)Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogTabsController;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Ll10/i;", "container", "view", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/mapper/CatalogueTabsVO;)Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/mapper/CatalogueTabsVO;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "composerRootView", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lj10/h;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "", "constructLayout", "(Landroid/view/ViewGroup;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)V", "catalogTabsController", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogTabsController;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/presentation/CatalogueTabsDrawableCache;", "drawableCache", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/presentation/CatalogueTabsDrawableCache;", "", "layout", "Ljava/lang/Void;", "getLayout", "()Ljava/lang/Void;", "", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "", "Lru/ozon/app/android/composer/widgets/base/StickyConfig;", "widgetStickyConfig", "Ljava/lang/String;", "getWidgetStickyConfig-H4O2Is4", "()Ljava/lang/String;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/mapper/CatalogueTabsMapper;", "getMapper", "()Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v1/mapper/CatalogueTabsMapper;", "mapper", "getHolderProducer", "holderProducer", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CatalogueTabsViewMapper extends WidgetViewMapper2<CatalogueTabsComponent, CatalogueTabsDTO, CatalogueTabsVO> {
    private CatalogTabsController catalogTabsController;
    private CatalogueTabsDrawableCache drawableCache;
    private final Void layout;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.a0(SelectTabEvent.class);

    @NotNull
    private final String widgetStickyConfig;

    public CatalogueTabsViewMapper() {
        Intrinsics.checkNotNullParameter("CATALOGUE_TABS_STICKY", "tag");
        this.widgetStickyConfig = "CATALOGUE_TABS_STICKY";
    }

    private final CatalogTabsController getCatalogTabsController(h viewModelOwnerProvider) {
        if (this.catalogTabsController == null) {
            CatalogTabsSharedViewModel catalogTabsSharedViewModel = (CatalogTabsSharedViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v1.viewMapper.CatalogueTabsViewMapper$getCatalogTabsController$$inlined$viewModel$1
                @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                public <T extends w0> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    CatalogTabsSharedViewModel catalogTabsSharedViewModel2 = CatalogueTabsViewMapper.this.component().getCatalogTabsSharedViewModelProvider().get();
                    Intrinsics.g(catalogTabsSharedViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                    return catalogTabsSharedViewModel2;
                }
            }).a(CatalogTabsSharedViewModel.class);
            Intrinsics.f(catalogTabsSharedViewModel);
            this.catalogTabsController = new CatalogTabsController(catalogTabsSharedViewModel);
        }
        return this.catalogTabsController;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    public void constructLayout(@NotNull ViewGroup composerRootView, @NotNull l viewObject, @NotNull ComposerReferences references, @NotNull j10.h<l> voHelper) {
        RecyclerView.t recyclerListener;
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        super.constructLayout(composerRootView, viewObject, references, voHelper);
        Context context = composerRootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.drawableCache = new CatalogueTabsDrawableCache(context);
        CatalogTabsController catalogTabsController = getCatalogTabsController(references.getViewModelOwnerProvider());
        if (catalogTabsController != null) {
            catalogTabsController.setComposerRefs(references);
        }
        CatalogTabsController catalogTabsController2 = this.catalogTabsController;
        if (catalogTabsController2 == null || (recyclerListener = catalogTabsController2.getRecyclerListener()) == null) {
            return;
        }
        ComposerViewExtensionKt.composerRecyclerView(composerRootView).addOnScrollListener(recyclerListener);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<CatalogueTabsVO> createHolder2(@NotNull i container, @NotNull View view) {
        Object obj;
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        RecyclerView recyclerView = (RecyclerView) view;
        CatalogTabsController catalogTabsController = getCatalogTabsController(container.b0());
        CatalogueTabsDrawableCache catalogueTabsDrawableCache = this.drawableCache;
        List m11 = kotlin.text.h.m(component().getFeatureService().getStringKey(CategoryMainPageFreshPreCreateWidgetsNewConfiguration.INSTANCE), new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList(C7714v.z(m11, 10));
        Iterator it = m11.iterator();
        while (it.hasNext()) {
            C2454a.g((String) it.next(), arrayList);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (Intrinsics.d((String) obj, "catalogueTabs")) {
                break;
            }
        }
        return new CatalogueTabsViewHolder(recyclerView, container, catalogTabsController, catalogueTabsDrawableCache, obj != null, component().getFeatureService().getBooleanKey(FreshCatalogueTabsPerformance.INSTANCE));
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        RecyclerView recyclerView = new RecyclerView(parent.getContext());
        recyclerView.setId(R$id.catalogueTabsRecyclerView);
        recyclerView.setLayoutParams(new RecyclerView.p(-1, -2));
        recyclerView.setMotionEventSplittingEnabled(false);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setClipToOutline(true);
        recyclerView.setItemAnimator(null);
        return recyclerView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    /* renamed from: getHolderProducer */
    public /* bridge */ /* synthetic */ Function2 mo614getHolderProducer() {
        return (Function2) getHolderProducer();
    }

    @Override // ru.ozon.composer.ui.widget.g
    public /* bridge */ /* synthetic */ Integer getLayout() {
        return (Integer) getLayout();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: getWidgetStickyConfig-H4O2Is4, reason: not valid java name and from getter */
    public String getWidgetStickyConfig() {
        return this.widgetStickyConfig;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<CatalogueTabsComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return CatalogueTabsComponent.INSTANCE.create(storage);
    }

    @NotNull
    public Void getHolderProducer() {
        throw new UnsupportedOperationException();
    }

    public Void getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public CatalogueTabsMapper getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public CatalogueTabsVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull CatalogueTabsVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return component().getCatalogueTabsUpdateConsumer().invoke(update, oldItem);
    }
}
