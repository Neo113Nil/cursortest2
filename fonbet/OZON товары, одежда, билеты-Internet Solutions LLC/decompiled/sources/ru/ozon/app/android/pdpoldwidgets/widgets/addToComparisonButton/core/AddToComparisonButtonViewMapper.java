package ru.ozon.app.android.pdpoldwidgets.widgets.addToComparisonButton.core;

import A00.a;
import android.view.View;
import java.util.List;
import java.util.Map;
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
import ru.ozon.app.android.pdp.ui.configurators.addToComparision.AddToComparisonUpdateKey;
import ru.ozon.app.android.pdpoldwidgets.R$layout;
import ru.ozon.app.android.pdpoldwidgets.widgets.addToComparisonButton.data.AddToComparisonButtonDTO;
import ru.ozon.app.android.pdpoldwidgets.widgets.addToComparisonButton.di.AddToComparisonWidgetComponent;
import ru.ozon.app.android.pdpoldwidgets.widgets.addToComparisonButton.presentation.AddToComparisonButtonVO;
import ru.ozon.app.android.pdpoldwidgets.widgets.addToComparisonButton.presentation.AddToComparisonButtonViewHolder;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000fj\b\u0012\u0004\u0012\u00020\u0002`\u00102\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R,\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR&\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R,\u0010)\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020'\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040 0\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u001f¨\u0006*"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/addToComparisonButton/core/AddToComparisonButtonViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/pdpoldwidgets/widgets/addToComparisonButton/di/AddToComparisonWidgetComponent;", "Lru/ozon/app/android/pdpoldwidgets/widgets/addToComparisonButton/data/AddToComparisonButtonDTO;", "Lru/ozon/app/android/pdpoldwidgets/widgets/addToComparisonButton/presentation/AddToComparisonButtonVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/pdpoldwidgets/widgets/addToComparisonButton/presentation/AddToComparisonButtonVO;)Lru/ozon/app/android/pdpoldwidgets/widgets/addToComparisonButton/presentation/AddToComparisonButtonVO;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdpoldwidgets/widgets/addToComparisonButton/presentation/AddToComparisonButtonViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/pdp/ui/configurators/addToComparision/AddToComparisonUpdateKey;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Ll20/d;", "getMapper", "mapper", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AddToComparisonButtonViewMapper extends WidgetViewMapper2<AddToComparisonWidgetComponent, AddToComparisonButtonDTO, AddToComparisonButtonVO> {
    private final int layout = R$layout.pdp_widget_add_to_comparison_button;

    @NotNull
    private final Function2<View, ComposerReferences, AddToComparisonButtonViewHolder> holderProducer = new AddToComparisonButtonViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<AddToComparisonUpdateKey>> supportedUpdates = C7714v.a0(AddToComparisonUpdateKey.class);

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, AddToComparisonButtonViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<AddToComparisonButtonDTO, d, List<AddToComparisonButtonVO>> getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<AddToComparisonUpdateKey>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<AddToComparisonWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return AddToComparisonWidgetComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public AddToComparisonButtonVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull AddToComparisonButtonVO oldItem) {
        Map<String, String> params;
        String str;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        AtomActionDTO action = oldItem.getAddToComparisonCell().getAction();
        Long valueOf = (action == null || (params = action.getParams()) == null || (str = params.get("sku")) == null) ? null : Long.valueOf(Long.parseLong(str));
        if (update instanceof AddToComparisonUpdateKey) {
            AddToComparisonUpdateKey addToComparisonUpdateKey = (AddToComparisonUpdateKey) update;
            long skuId = addToComparisonUpdateKey.getSkuId();
            if (valueOf != null && skuId == valueOf.longValue()) {
                if (addToComparisonUpdateKey.getIsInComparison()) {
                    return AddToComparisonButtonVO.copy$default(oldItem, 0L, true, null, null, 13, null);
                }
                if (!addToComparisonUpdateKey.getIsInComparison() || addToComparisonUpdateKey.getWasListDeleted()) {
                    return AddToComparisonButtonVO.copy$default(oldItem, 0L, false, null, null, 13, null);
                }
            }
        }
        return null;
    }
}
