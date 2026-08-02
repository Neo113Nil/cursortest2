package ru.ozon.app.android.pdp.widgets.brand.core.button;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderViewFactory;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.data.BrandDTO;
import ru.ozon.app.android.pdp.widgets.brand.di.BrandWidgetComponent;
import ru.ozon.app.android.pdp.widgets.brand.presentation.SimpleBrandVO;
import ru.ozon.app.android.pdp.widgets.brand.presentation.simple.SimpleBrandWidgetPlaceholderViewHolder;
import ru.ozon.uni.atoms.data.controls.button.UncontainedIconLabelButtonDTO;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001aj\b\u0012\u0004\u0012\u00020\u0002`\u001b2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR,\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/pdp/widgets/brand/core/button/SimpleBrandWidgetPlaceholderViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/pdp/widgets/brand/di/BrandWidgetComponent;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/BrandDTO;", "Lru/ozon/app/android/pdp/widgets/brand/presentation/SimpleBrandVO;", "<init>", "()V", "Landroid/view/View;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/pdp/widgets/brand/presentation/simple/SimpleBrandWidgetPlaceholderViewHolder;", "createViewHolder", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)Lru/ozon/app/android/pdp/widgets/brand/presentation/simple/SimpleBrandWidgetPlaceholderViewHolder;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "parent", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/reflect/KFunction2;", "holderProducer", "Lkotlin/reflect/h;", "getHolderProducer", "()Lkotlin/reflect/h;", "Lru/ozon/uni/atoms/data/controls/button/UncontainedIconLabelButtonDTO;", "uncontainedButton", "Lru/ozon/uni/atoms/data/controls/button/UncontainedIconLabelButtonDTO;", "Lru/ozon/app/android/pdp/widgets/brand/core/button/SimpleBrandMapper;", "getMapper", "()Lru/ozon/app/android/pdp/widgets/brand/core/button/SimpleBrandMapper;", "mapper", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SimpleBrandWidgetPlaceholderViewMapper extends WidgetViewMapper2<BrandWidgetComponent, BrandDTO, SimpleBrandVO> {

    @NotNull
    private final h<SimpleBrandWidgetPlaceholderViewHolder> holderProducer = new SimpleBrandWidgetPlaceholderViewMapper$holderProducer$1(this);
    private UncontainedIconLabelButtonDTO uncontainedButton;

    /* JADX INFO: Access modifiers changed from: private */
    public final SimpleBrandWidgetPlaceholderViewHolder createViewHolder(View view, ComposerReferences refs) {
        Intrinsics.g(view, "null cannot be cast to non-null type android.widget.FrameLayout");
        return new SimpleBrandWidgetPlaceholderViewHolder((FrameLayout) view, refs, component().getWidgetImagePlaceholderAdapter(), component().getTokenizedAnalytics());
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        BrandDTO brandDTO = state instanceof BrandDTO ? (BrandDTO) state : null;
        Parcelable cell = brandDTO != null ? brandDTO.getCell() : null;
        UncontainedIconLabelButtonDTO uncontainedIconLabelButtonDTO = cell instanceof UncontainedIconLabelButtonDTO ? (UncontainedIconLabelButtonDTO) cell : null;
        if (uncontainedIconLabelButtonDTO == null) {
            return false;
        }
        this.uncontainedButton = uncontainedIconLabelButtonDTO;
        return WidgetImagePlaceholderAdapter.canMapPlaceholderWidget$default(component().getWidgetImagePlaceholderAdapter(), "SimpleBrandWidget", state, false, 4, null);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        WidgetImagePlaceholderViewFactory widgetImagePlaceholderViewFactory = WidgetImagePlaceholderViewFactory.INSTANCE;
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return WidgetImagePlaceholderViewFactory.createView$default(widgetImagePlaceholderViewFactory, context, R$id.simpleBrandImagePlaceholderFl, R$id.simpleBrandImagePlaceholderIv, 0, 0, 24, null);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    /* renamed from: getHolderProducer */
    public /* bridge */ /* synthetic */ Function2 mo614getHolderProducer() {
        return (Function2) getHolderProducer();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<BrandWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return BrandWidgetComponent.INSTANCE.getInstance(storage);
    }

    @NotNull
    public h<SimpleBrandWidgetPlaceholderViewHolder> getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public SimpleBrandMapper getMapper() {
        return new SimpleBrandMapper(this.uncontainedButton);
    }
}
