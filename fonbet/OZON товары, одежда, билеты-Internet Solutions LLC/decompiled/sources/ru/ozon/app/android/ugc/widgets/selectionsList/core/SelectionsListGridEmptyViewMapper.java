package ru.ozon.app.android.ugc.widgets.selectionsList.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.ugc.widgets.selectionsList.data.SelectionsListDTO;
import ru.ozon.app.android.ugc.widgets.selectionsList.data.SelectionsListVI;
import ru.ozon.app.android.ugc.widgets.selectionsList.di.SelectionsListComponent;
import ru.ozon.app.android.ugc.widgets.selectionsList.presentation.EmptyView;
import ru.ozon.composer.ui.widget.h;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 .2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001.B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000fj\b\u0012\u0004\u0012\u00020\u0002`\u00102\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u001f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!R2\u0010&\u001a\u001a\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040%0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006/"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/core/SelectionsListGridEmptyViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/ugc/widgets/selectionsList/di/SelectionsListComponent;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListDTO;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionsListItemVI$EmptyItem;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/ugc/widgets/selectionsList/presentation/EmptyView;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/ugc/widgets/selectionsList/presentation/EmptyView;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Landroid/content/Context;", "context", "", "Lru/ozon/app/android/ugc/widgets/selectionsList/core/SelectionsListDecoration;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "state", "item", "Lru/ozon/composer/ui/widget/h$b;", "getWidgetSpan", "(Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListDTO;Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionsListItemVI$EmptyItem;)Lru/ozon/composer/ui/widget/h$b;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/ugc/widgets/selectionsList/core/SelectionsListGridEmptyMapper;", "getMapper", "()Lru/ozon/app/android/ugc/widgets/selectionsList/core/SelectionsListGridEmptyMapper;", "mapper", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SelectionsListGridEmptyViewMapper extends WidgetViewMapper2<SelectionsListComponent, SelectionsListDTO, SelectionsListVI.SelectionsListItemVI.EmptyItem> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function2<View, ComposerReferences, k<SelectionsListVI.SelectionsListItemVI.EmptyItem>> holderProducer = new SelectionsListGridEmptyViewMapper$holderProducer$1(this);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/core/SelectionsListGridEmptyViewMapper$Companion;", "", "<init>", "()V", "WIDTH_DIVIDER", "", "HEIGHT_MULTIPLIER", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof SelectionsListDTO) && ((SelectionsListDTO) state).getLayout() == SelectionsListDTO.LayoutType.LAYOUT_GRID_2;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<SelectionsListDecoration> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new SelectionsListDecoration(context, getMapper().getBackgroundColor()));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<SelectionsListVI.SelectionsListItemVI.EmptyItem>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<SelectionsListComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return SelectionsListComponent.INSTANCE.getInstance(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public EmptyView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        int i11 = parent.getContext().getResources().getDisplayMetrics().widthPixels / 2;
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        EmptyView emptyView = new EmptyView(context);
        emptyView.setLayoutParams(new ConstraintLayout.b(i11, (int) (i11 * 1.5d)));
        return emptyView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public SelectionsListGridEmptyMapper getMapper() {
        return component().getSelectionsListGridEmptyMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, ru.ozon.composer.ui.widget.e
    @NotNull
    public h.b getWidgetSpan(@NotNull SelectionsListDTO state, @NotNull SelectionsListVI.SelectionsListItemVI.EmptyItem item) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(item, "item");
        return h.b.f94870b;
    }
}
