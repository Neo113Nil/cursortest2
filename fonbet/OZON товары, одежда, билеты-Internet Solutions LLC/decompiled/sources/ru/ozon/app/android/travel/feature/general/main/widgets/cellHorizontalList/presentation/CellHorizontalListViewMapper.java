package ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.presentation;

import A00.a;
import Bl.b;
import Pc.a;
import a00.h;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import gk0.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.data.CellHorizontalListDTO;
import ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.di.CellHorizontalListComponent;
import ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.view.CellHorizontalListView;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00030\fj\b\u0012\u0004\u0012\u00020\u0003`\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c2\u0006\u0010\u0015\u001a\u00020\u00022\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\"\u001a\u0004\u0018\u00010\u00032\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010%\u001a\u0004\u0018\u00010\u00142\u0006\u0010!\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R&\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/data/CellHorizontalListDTO;", "Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListVI;", "Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/di/CellHorizontalListComponent;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/di/CellHorizontalListComponent;)V", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "Landroid/view/ViewGroup;", "parent", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/data/CellHorizontalListDTO;Ll20/d;)Ljava/util/List;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListVI;)Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListVI;", "newItem", "getPayload", "(Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListVI;Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListVI;)Ljava/lang/Object;", "Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/di/CellHorizontalListComponent;", "Ljava/lang/Class;", "Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListUpdate;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CellHorizontalListViewMapper extends g<CellHorizontalListDTO, CellHorizontalListVI> {

    @NotNull
    private final CellHorizontalListComponent component;

    @NotNull
    private final List<Class<CellHorizontalListUpdate>> supportedUpdates;

    public CellHorizontalListViewMapper(@NotNull CellHorizontalListComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.supportedUpdates = C7714v.a0(CellHorizontalListUpdate.class);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof CellHorizontalListDTO;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<CellHorizontalListVI> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        h a02 = container.a0();
        final a<CellHorizontalListViewModel> viewModelProvider = this.component.getViewModelProvider();
        w0 a11 = new z0(a02.a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.presentation.CellHorizontalListViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                CellHorizontalListViewModel cellHorizontalListViewModel = (CellHorizontalListViewModel) a.this.get();
                Intrinsics.g(cellHorizontalListViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return cellHorizontalListViewModel;
            }
        }).a(CellHorizontalListViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        return new CellHorizontalListWidgetViewHolder((CellHorizontalListView) view, container, (CellHorizontalListViewModel) a11);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        CellHorizontalListView cellHorizontalListView = (CellHorizontalListView) b.a(CellHorizontalListView.class, "type", q.f64554a, null);
        if (cellHorizontalListView == null) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            cellHorizontalListView = new CellHorizontalListView(context);
        }
        cellHorizontalListView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return cellHorizontalListView;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<CellHorizontalListUpdate>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Object getPayload(@NotNull CellHorizontalListVI oldItem, @NotNull CellHorizontalListVI newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Tc.b builder = C7714v.B();
        if (!Intrinsics.d(oldItem.getTitle(), newItem.getTitle())) {
            builder.add(CellHorizontalListPayload.TITLE);
        }
        if (!Intrinsics.d(oldItem.getCells(), newItem.getCells())) {
            builder.add(CellHorizontalListPayload.CELLS);
        }
        if (oldItem.getCellGap() != newItem.getCellGap()) {
            builder.add(CellHorizontalListPayload.CELL_GAP);
        }
        if (!Intrinsics.d(oldItem.getSettings(), newItem.getSettings())) {
            builder.add(CellHorizontalListPayload.SETTINGS);
        }
        if (!Intrinsics.d(oldItem.getCellSettings(), newItem.getCellSettings())) {
            builder.add(CellHorizontalListPayload.CELL_SETTINGS);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        Tc.b B11 = builder.B();
        if (B11.isEmpty()) {
            return null;
        }
        return B11;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    public CellHorizontalListVI handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull CellHorizontalListVI oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(update instanceof CellHorizontalListUpdate)) {
            return null;
        }
        CellHorizontalListUpdate cellHorizontalListUpdate = (CellHorizontalListUpdate) update;
        if (cellHorizontalListUpdate.getId() == oldItem.getId()) {
            return CellHorizontalListVI.copy$default(oldItem, 0L, null, cellHorizontalListUpdate.getCells(), 0, null, null, 59, null);
        }
        return null;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<CellHorizontalListVI> map(@NotNull CellHorizontalListDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
