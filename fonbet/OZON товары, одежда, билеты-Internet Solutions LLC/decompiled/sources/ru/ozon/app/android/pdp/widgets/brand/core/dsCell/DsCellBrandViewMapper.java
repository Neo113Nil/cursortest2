package ru.ozon.app.android.pdp.widgets.brand.core.dsCell;

import Kk.c;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.data.BrandDTO;
import ru.ozon.app.android.pdp.utils.PDPBackgroundColorDecorator;
import ru.ozon.app.android.pdp.widgets.brand.di.BrandWidgetComponent;
import ru.ozon.app.android.pdp.widgets.brand.presentation.DsCellBrandVO;
import ru.ozon.app.android.pdp.widgets.brand.presentation.dsCell.DsCellBrandViewHolder;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0011j\b\u0012\u0004\u0012\u00020\u0002`\u00122\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b#\u0010$R,\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010+\u001a\u0004\u0018\u00010*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R,\u00103\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u000200\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040!0/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lru/ozon/app/android/pdp/widgets/brand/core/dsCell/DsCellBrandViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/pdp/widgets/brand/di/BrandWidgetComponent;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/BrandDTO;", "Lru/ozon/app/android/pdp/widgets/brand/presentation/DsCellBrandVO;", "<init>", "()V", "Landroid/view/View;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/pdp/widgets/brand/presentation/dsCell/DsCellBrandViewHolder;", "createViewHolder", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)Lru/ozon/app/android/pdp/widgets/brand/presentation/dsCell/DsCellBrandViewHolder;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/uni/android/cell/CellView;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/uni/android/cell/CellView;", "Landroid/content/Context;", "context", "", "Lru/ozon/app/android/pdp/utils/PDPBackgroundColorDecorator;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "Lkotlin/reflect/KFunction2;", "holderProducer", "Lkotlin/reflect/h;", "getHolderProducer", "()Lkotlin/reflect/h;", "", "layout", "Ljava/lang/Void;", "getLayout", "()Ljava/lang/Void;", "Lkotlin/Function2;", "Ll20/d;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "mapper", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DsCellBrandViewMapper extends WidgetViewMapper2<BrandWidgetComponent, BrandDTO, DsCellBrandVO> {

    @NotNull
    private final h<DsCellBrandViewHolder> holderProducer = new DsCellBrandViewMapper$holderProducer$1(this);
    private final Void layout;

    /* JADX INFO: Access modifiers changed from: private */
    public final DsCellBrandViewHolder createViewHolder(View view, ComposerReferences refs) {
        Intrinsics.g(view, "null cannot be cast to non-null type ru.ozon.uni.android.cell.CellView");
        return new DsCellBrandViewHolder((CellView) view, refs, component().getViewModel(), component().getTokenizedAnalytics(), component().getWidgetImagePlaceholderAdapter());
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        BrandDTO brandDTO = state instanceof BrandDTO ? (BrandDTO) state : null;
        return (brandDTO != null ? brandDTO.getCell() : null) instanceof CellDTO;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<PDPBackgroundColorDecorator> getDecorators(@NotNull Context context) {
        return c.g(context, context, "context");
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

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<BrandDTO, d, List<DsCellBrandVO>> getMapper() {
        return component().getDsCellMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<BrandWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return BrandWidgetComponent.INSTANCE.getInstance(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public CellView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        DsCellBrandViewHolder.Companion companion = DsCellBrandViewHolder.INSTANCE;
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return companion.createView(context);
    }

    @NotNull
    public h<DsCellBrandViewHolder> getHolderProducer() {
        return this.holderProducer;
    }

    public Void getLayout() {
        return this.layout;
    }
}
