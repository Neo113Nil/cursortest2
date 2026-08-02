package ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.presentation;

import A00.a;
import Pc.a;
import a00.h;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
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
import ru.ozon.app.android.fresh.common.flags.FreshTilesRefactoring;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.FreshTileViewModel;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileVO;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileView;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileViewV2;
import ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.di.FreshTileGridDIComponent;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0011\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR2\u0010\"\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R2\u0010'\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030&0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%R&\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030)0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/freshTileGrid/presentation/FreshTileGridBaseViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/fresh/unsorted/widgets/freshTileGrid/di/FreshTileGridDIComponent;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileVO;", "<init>", "()V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileViewModel;", "getViewModel", "(Lru/ozon/app/android/composer/ComposerReferences;)Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileViewModel;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileVO;)Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileVO;", "Lkotlin/Function2;", "Ll20/d;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "getHolderProducer", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class FreshTileGridBaseViewMapper extends WidgetViewMapper2<FreshTileGridDIComponent, FreshTileVO, FreshTileVO> {

    @NotNull
    private final Function2<FreshTileVO, d, List<FreshTileVO>> mapper = FreshTileGridBaseViewMapper$mapper$1.INSTANCE;

    @NotNull
    private final Function2<View, ComposerReferences, k<FreshTileVO>> holderProducer = new FreshTileGridBaseViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<FreshTileVO>> supportedUpdates = C7714v.a0(FreshTileVO.class);

    /* JADX INFO: Access modifiers changed from: private */
    public final FreshTileViewModel getViewModel(ComposerReferences composerReferences) {
        h viewModelOwnerProvider = composerReferences.getViewModelOwnerProvider();
        final a<FreshTileViewModel> viewModelProvider = component().getViewModelProvider();
        w0 a11 = new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.presentation.FreshTileGridBaseViewMapper$getViewModel$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                FreshTileViewModel freshTileViewModel = (FreshTileViewModel) a.this.get();
                Intrinsics.g(freshTileViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return freshTileViewModel;
            }
        }).a(FreshTileViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        return (FreshTileViewModel) a11;
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof FreshTileVO;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (component().getFeatureChecker().isEnabled(FreshTilesRefactoring.INSTANCE)) {
            FreshTileViewV2.Companion companion = FreshTileViewV2.INSTANCE;
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return FreshTileViewV2.Companion.createHorizontal$default(companion, context, null, 2, null);
        }
        FreshTileView.Companion companion2 = FreshTileView.INSTANCE;
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return FreshTileView.Companion.createHorizontal$default(companion2, context2, null, 2, null);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<FreshTileVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<FreshTileVO, d, List<FreshTileVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<FreshTileVO>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<FreshTileGridDIComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return FreshTileGridDIComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public FreshTileVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull FreshTileVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(update instanceof FreshTileVO)) {
            return null;
        }
        FreshTileVO freshTileVO = (FreshTileVO) update;
        if (oldItem.getId() == freshTileVO.getId()) {
            return freshTileVO;
        }
        return null;
    }
}
