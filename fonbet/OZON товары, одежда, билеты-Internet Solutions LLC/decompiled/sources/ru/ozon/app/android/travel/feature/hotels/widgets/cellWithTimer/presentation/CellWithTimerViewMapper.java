package ru.ozon.app.android.travel.feature.hotels.widgets.cellWithTimer.presentation;

import A00.a;
import android.R;
import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.a;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.travel.feature.hotels.widgets.cellWithTimer.data.CellWithTimerDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.cellWithTimer.data.CellWithTimerMapper;
import ru.ozon.app.android.travel.feature.hotels.widgets.cellWithTimer.di.CellWithTimerComponent;
import ru.ozon.app.android.travel.molecules.view.cellWithTimer.CellWithTimerView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001f2\n\u0010\u001e\u001a\u00060\u001cj\u0002`\u001dH\u0016¢\u0006\u0004\b \u0010!R\u001c\u0010#\u001a\u0004\u0018\u00010\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R&\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040'0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R,\u0010/\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.0,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00106\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/cellWithTimer/presentation/CellWithTimerViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/cellWithTimer/di/CellWithTimerComponent;", "Lru/ozon/app/android/travel/feature/hotels/widgets/cellWithTimer/data/CellWithTimerDTO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/cellWithTimer/presentation/CellWithTimerWrapperVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/hotels/widgets/cellWithTimer/presentation/CellWithTimerWrapperVO;)Lru/ozon/app/android/travel/feature/hotels/widgets/cellWithTimer/presentation/CellWithTimerWrapperVO;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/content/Context;", "context", "", "Landroidx/recyclerview/widget/RecyclerView$n;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "Ljava/lang/Void;", "getLayout", "()Ljava/lang/Void;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/hotels/widgets/cellWithTimer/presentation/CellWithTimerWidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/cellWithTimer/data/CellWithTimerMapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/hotels/widgets/cellWithTimer/data/CellWithTimerMapper;", "mapper", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CellWithTimerViewMapper extends WidgetViewMapper2<CellWithTimerComponent, CellWithTimerDTO, CellWithTimerWrapperVO> {
    private final Void layout;

    @NotNull
    private final List<Class<CellWithTimerWrapperVO>> supportedUpdates = C7714v.a0(CellWithTimerWrapperVO.class);

    @NotNull
    private final Function2<View, ComposerReferences, CellWithTimerWidgetViewHolder> holderProducer = new CellWithTimerViewMapper$holderProducer$1(this);

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof CellWithTimerDTO) && ((CellWithTimerDTO) state).getCell().getSeconds() > 0;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CellWithTimerView cellWithTimerView = new CellWithTimerView(context, null, 2, null);
        cellWithTimerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        TypedValue typedValue = new TypedValue();
        cellWithTimerView.getContext().getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        cellWithTimerView.setForeground(a.getDrawable(cellWithTimerView.getContext(), typedValue.resourceId));
        Context context2 = cellWithTimerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px = ResourceExtKt.toPx(16, context2);
        Context context3 = cellWithTimerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int px2 = ResourceExtKt.toPx(12, context3);
        cellWithTimerView.setPadding(px, px2, px, px2);
        return cellWithTimerView;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<RecyclerView.n> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new CellWithTimerItemDecoration(ResourceExtKt.toPx(16, context)));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, CellWithTimerWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public /* bridge */ /* synthetic */ Integer getLayout() {
        return (Integer) getLayout();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<CellWithTimerWrapperVO>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<CellWithTimerComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return CellWithTimerComponent.INSTANCE.create(storage);
    }

    public Void getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public CellWithTimerMapper getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public CellWithTimerWrapperVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull CellWithTimerWrapperVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof CellWithTimerWrapperVO) {
            return (CellWithTimerWrapperVO) update;
        }
        return null;
    }
}
