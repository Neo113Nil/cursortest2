package ru.ozon.app.android.cart.controls.v3.presentation;

import A00.a;
import N10.h;
import Sc.InterfaceC4008j;
import Vg.c;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.ProductUpdateKey;
import ru.ozon.app.android.cart.configurator.StartAsyncProcessing;
import ru.ozon.app.android.cart.controls.v3.data.ControlsV3DTO;
import ru.ozon.app.android.cart.controls.v3.di.ControlsV3WidgetComponent;
import ru.ozon.app.android.cart.controls.v3.presentation.ControlsV3VO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 52\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00015B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0014j\b\u0012\u0004\u0012\u00020\u0002`\u00152\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R<\u0010'\u001a$\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020$\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040%j\b\u0012\u0004\u0012\u00020\u0004`&0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R(\u0010-\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070,0+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0014\u00104\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00066"}, d2 = {"Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3ViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/cart/controls/v3/di/ControlsV3WidgetComponent;", "Lru/ozon/app/android/cart/controls/v3/data/ControlsV3DTO;", "Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3VO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3VO;)Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3VO;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "LVg/c;", "customActionHandlersStore$delegate", "LSc/j;", "getCustomActionHandlersStore", "()LVg/c;", "customActionHandlersStore", "LN10/h;", "stickyWidgetConfig", "LN10/h;", "getStickyWidgetConfig", "()LN10/h;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3Mapper;", "getMapper", "()Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3Mapper;", "mapper", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ControlsV3ViewMapper extends WidgetViewMapper2<ControlsV3WidgetComponent, ControlsV3DTO, ControlsV3VO> {

    @NotNull
    private static final String STICKY_GROUP_TAG;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: customActionHandlersStore$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j customActionHandlersStore = LazyUtilsKt.unsafeLazy(new ControlsV3ViewMapper$customActionHandlersStore$2(this));

    @NotNull
    private final h stickyWidgetConfig = new h(STICKY_GROUP_TAG, 6);

    @NotNull
    private final Function2<View, ComposerReferences, k<ControlsV3VO>> holderProducer = new ControlsV3ViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(UpdateControl.class, ProductUpdateKey.class, StartAsyncProcessing.class);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3ViewMapper$Companion;", "", "<init>", "()V", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Intrinsics.checkNotNullParameter("cartControl", "tag");
        STICKY_GROUP_TAG = "cartControl";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c getCustomActionHandlersStore() {
        return (c) this.customActionHandlersStore.getValue();
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new ControlsV3View(context, null, 0, 6, null);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<ControlsV3VO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public h getStickyWidgetConfig() {
        return this.stickyWidgetConfig;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ControlsV3WidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return ControlsV3WidgetComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public ControlsV3Mapper getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public ControlsV3VO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull ControlsV3VO oldItem) {
        CheckBoxDTO checkbox;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof ProductUpdateKey) {
            ControlsV3VO.SelectAll selectAll = oldItem.getSelectAll();
            if (selectAll == null || (checkbox = selectAll.getCheckbox()) == null) {
                return null;
            }
            return ControlsV3VO.copy$default(oldItem, 0L, ControlsV3VO.SelectAll.copy$default(oldItem.getSelectAll(), null, null, null, CheckBoxDTO.copy$default(checkbox, null, CheckBoxDTO.CheckboxStatus.INDETERMINATE, CheckBoxDTO.CheckboxState.DISABLED, null, null, null, null, null, null, null, 1017, null), 7, null), null, null, 0, false, null, false, false, 509, null);
        }
        if (update instanceof StartAsyncProcessing) {
            return ControlsV3VO.copy$default(oldItem, 0L, null, null, null, 0, false, null, false, true, 255, null);
        }
        if (update instanceof UpdateControl) {
            ControlsV3VO controlsV3VO = ((UpdateControl) update).getControlsV3VO();
            if (controlsV3VO.getId() == oldItem.getId()) {
                return controlsV3VO;
            }
        }
        return null;
    }
}
