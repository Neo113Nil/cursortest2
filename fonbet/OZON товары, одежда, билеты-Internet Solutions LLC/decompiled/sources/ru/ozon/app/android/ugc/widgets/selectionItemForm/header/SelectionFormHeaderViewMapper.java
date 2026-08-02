package ru.ozon.app.android.ugc.widgets.selectionItemForm.header;

import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.di.SelectionItemFormComponent;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation.SelectionFormViewModel;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u001a\u001a\f\u0012\u0004\u0012\u00020\u00020\u0018j\u0002`\u00192\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/header/SelectionFormHeaderViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/di/SelectionItemFormComponent;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/header/SelectionFormHeaderVO;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Ll10/i;", "container", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/header/SelectionFormHeaderVH;", "createHolder", "(Ll10/i;)Lru/ozon/app/android/ugc/widgets/selectionItemForm/header/SelectionFormHeaderVH;", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/ugc/widgets/selectionItemForm/header/SelectionFormHeaderVO;Ll20/d;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SelectionFormHeaderViewMapper extends OverlayWidgetScreenViewItemMapper2<SelectionItemFormComponent, SelectionFormHeaderVO, SelectionFormHeaderVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof SelectionFormHeaderVO;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<SelectionItemFormComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return SelectionItemFormComponent.INSTANCE.getInstance(storage);
    }

    @Override // c20.r
    @NotNull
    public SelectionFormHeaderVH createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new SelectionFormHeaderVH(component().getTokenizedAnalytics(), container, (SelectionFormViewModel) new z0(container.b0().a(), new z0.c() { // from class: ru.ozon.app.android.ugc.widgets.selectionItemForm.header.SelectionFormHeaderViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                SelectionFormViewModel selectionFormViewModel = SelectionFormHeaderViewMapper.this.component().getSelectionFormViewModel();
                Intrinsics.g(selectionFormViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return selectionFormViewModel;
            }
        }).a(SelectionFormViewModel.class));
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<SelectionFormHeaderVO> map(@NotNull SelectionFormHeaderVO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(state);
    }
}
