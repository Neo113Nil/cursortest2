package ru.ozon.app.android.storefront.widgets.navigationSlider.presentation;

import A00.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import gk0.q;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.storefront.ui.navslider.R$layout;
import ru.ozon.app.android.storefront.widgets.navigationSlider.data.NavigationSliderDTO;
import ru.ozon.app.android.storefront.widgets.navigationSlider.data.NavigationSliderUpdate;
import ru.ozon.app.android.storefront.widgets.navigationSlider.di.NavigationSliderWidgetComponent;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0014j\b\u0012\u0004\u0012\u00020\u0002`\u00152\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR<\u0010#\u001a$\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020 \u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040!j\b\u0012\u0004\u0012\u00020\u0004`\"0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R&\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R,\u00100\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040'0\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010&¨\u00061"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/storefront/widgets/navigationSlider/di/NavigationSliderWidgetComponent;", "Lru/ozon/app/android/storefront/widgets/navigationSlider/data/NavigationSliderDTO;", "Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderVO;)Lru/ozon/app/android/storefront/widgets/navigationSlider/presentation/NavigationSliderVO;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layoutRes", "I", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/storefront/widgets/navigationSlider/data/NavigationSliderUpdate$UpdateCurrentPage;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Ll20/d;", "getMapper", "mapper", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavigationSliderViewMapper extends WidgetViewMapper2<NavigationSliderWidgetComponent, NavigationSliderDTO, NavigationSliderVO> {
    private final Integer layout;
    private final int layoutRes = R$layout.widget_navigation_slider_layout;

    @NotNull
    private final Function2<View, ComposerReferences, k<NavigationSliderVO>> holderProducer = new NavigationSliderViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<NavigationSliderUpdate.UpdateCurrentPage>> supportedUpdates = C7714v.a0(NavigationSliderUpdate.UpdateCurrentPage.class);

    @Override // ru.ozon.composer.ui.widget.g
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View h11 = q.f64554a.h(this.layoutRes);
        if (h11 == null) {
            return LayoutInflater.from(parent.getContext()).inflate(this.layoutRes, parent, false);
        }
        h11.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return h11;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<NavigationSliderVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<NavigationSliderDTO, d, List<NavigationSliderVO>> getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<NavigationSliderUpdate.UpdateCurrentPage>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<NavigationSliderWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return NavigationSliderWidgetComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public NavigationSliderVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull NavigationSliderVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return update instanceof NavigationSliderUpdate.UpdateCurrentPage ? NavigationSliderVO.copy$default(oldItem, 0L, null, false, null, 0, 0, ((NavigationSliderUpdate.UpdateCurrentPage) update).getCurrentPage(), 0, null, 447, null) : oldItem;
    }
}
