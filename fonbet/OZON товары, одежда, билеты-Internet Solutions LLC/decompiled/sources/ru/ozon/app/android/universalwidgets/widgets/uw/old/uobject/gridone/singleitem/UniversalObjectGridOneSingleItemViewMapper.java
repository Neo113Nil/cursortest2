package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.singleitem;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.universalwidgets.R$id;
import ru.ozon.app.android.universalwidgets.R$layout;
import ru.ozon.app.android.universalwidgets.flags.UwObjectInflateDisabledFlag;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.data.UniversalWidgetDTO;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.di.UniversalObjectWidgetComponent;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model.ObjectItemsVO;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 +2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0003+,-B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0014j\b\u0012\u0004\u0012\u00020\u0002`\u00152\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R0\u0010!\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u001cj\u0002`\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001e0\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u0004\u0018\u00010\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R6\u0010*\u001a$\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020&\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040'j\b\u0012\u0004\u0012\u00020\u0004`(0\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010 ¨\u0006."}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/singleitem/UniversalObjectGridOneSingleItemViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/di/UniversalObjectWidgetComponent;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemsVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "getUwObjectInflateDisabled", "()Z", "uwObjectInflateDisabled", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "getMapper", "()Lkotlin/jvm/functions/Function2;", "mapper", "", "getLayout", "()Ljava/lang/Integer;", "layout", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "getHolderProducer", "holderProducer", "Companion", "UniversalObjectGridOneSingleItemHolderProducerOptimized", "UniversalObjectGridOneSingleItemHolderProducer", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UniversalObjectGridOneSingleItemViewMapper extends WidgetViewMapper2<UniversalObjectWidgetComponent, UniversalWidgetDTO, ObjectItemsVO> {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002$\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00060\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/singleitem/UniversalObjectGridOneSingleItemViewMapper$UniversalObjectGridOneSingleItemHolderProducer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/singleitem/UniversalObjectGridOneSingleItemViewMapper;)V", "view", "ref", "invoke", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)Lru/ozon/composer/ui/widget/k;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public final class UniversalObjectGridOneSingleItemHolderProducer implements Function2<View, ComposerReferences, k<ObjectItemsVO>> {
        public UniversalObjectGridOneSingleItemHolderProducer() {
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public k<ObjectItemsVO> invoke(@NotNull View view, @NotNull ComposerReferences ref) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(ref, "ref");
            return new UniversalObjectGridOneSingleItemViewHolder(view, ref, new GridOneViewDelegateImpl((FrameLayout) view, true));
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002$\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00060\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/singleitem/UniversalObjectGridOneSingleItemViewMapper$UniversalObjectGridOneSingleItemHolderProducerOptimized;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/singleitem/UniversalObjectGridOneSingleItemViewMapper;)V", "view", "ref", "invoke", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)Lru/ozon/composer/ui/widget/k;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public final class UniversalObjectGridOneSingleItemHolderProducerOptimized implements Function2<View, ComposerReferences, k<ObjectItemsVO>> {
        public UniversalObjectGridOneSingleItemHolderProducerOptimized() {
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public k<ObjectItemsVO> invoke(@NotNull View view, @NotNull ComposerReferences ref) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(ref, "ref");
            return new UniversalObjectGridOneSingleItemViewHolderOptimized(view, ref, new GridOneViewDelegateImpl((FrameLayout) view, true));
        }
    }

    private final boolean getUwObjectInflateDisabled() {
        return component().getFeatureChecker().isEnabled(UwObjectInflateDisabledFlag.INSTANCE);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        if (!(state instanceof UniversalWidgetDTO)) {
            return false;
        }
        UniversalWidgetDTO universalWidgetDTO = (UniversalWidgetDTO) state;
        if (!Intrinsics.d(universalWidgetDTO.getDesignType().getType(), "object.grid1")) {
            return false;
        }
        UniversalWidgetDTO.DesignTypeDTO.OptionsDTO options = universalWidgetDTO.getDesignType().getOptions();
        return (Intrinsics.d(options != null ? options.getStyle() : null, "banner") || universalWidgetDTO.getItems() == null || universalWidgetDTO.getItems().size() != 1) ? false : true;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        FrameLayout frameLayout = new FrameLayout(parent.getContext());
        frameLayout.setId(R$id.rootFl);
        frameLayout.setLayoutParams(new RecyclerView.p(-1, -2));
        return frameLayout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<ObjectItemsVO>> mo614getHolderProducer() {
        return getUwObjectInflateDisabled() ? new UniversalObjectGridOneSingleItemHolderProducerOptimized() : new UniversalObjectGridOneSingleItemHolderProducer();
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        if (getUwObjectInflateDisabled()) {
            return null;
        }
        return Integer.valueOf(R$layout.item_grid_one);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<UniversalWidgetDTO, d, List<ObjectItemsVO>> getMapper() {
        return component().getGridOneMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<UniversalObjectWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return UniversalObjectWidgetComponent.INSTANCE.create(storage);
    }
}
