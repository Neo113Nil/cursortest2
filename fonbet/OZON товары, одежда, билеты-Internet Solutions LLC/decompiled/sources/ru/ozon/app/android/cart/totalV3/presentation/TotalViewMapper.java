package ru.ozon.app.android.cart.totalV3.presentation;

import A00.a;
import AH.a;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.RecyclerView;
import j10.h;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.c;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.totalV3.data.TotalDTO;
import ru.ozon.app.android.cart.totalV3.data.TotalMapperKt;
import ru.ozon.app.android.cart.totalV3.di.TotalV3Component;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.ComposerInflater;
import ru.ozon.app.android.composer.widgets.v2.overlay.BottomContainerViewMapper2;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001B\t\b\u0007¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ=\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0010\u0010\u0014\u001a\f\u0012\u0004\u0012\u00020\u00120\u0011j\u0002`\u00132\n\u0010\u0016\u001a\u00060\u0012j\u0002`\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000f2\u0010\u0010\u0014\u001a\f\u0012\u0004\u0012\u00020\u00120\u0011j\u0002`\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010 \u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u00032\n\u0010\u0016\u001a\u00060\u0012j\u0002`\u00152\u0006\u0010\u001c\u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010!J+\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\u00020%j\b\u0012\u0004\u0012\u00020\u0002`&2\n\u0010$\u001a\u00060\"j\u0002`#H\u0016¢\u0006\u0004\b'\u0010(R&\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*0)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R0\u00108\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u000604j\u0002`5\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050)038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Lru/ozon/app/android/cart/totalV3/presentation/TotalViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/BottomContainerViewMapper2;", "Lru/ozon/app/android/cart/totalV3/di/TotalV3Component;", "Lru/ozon/app/android/cart/totalV3/presentation/TotalViewHolder;", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO;", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/cart/totalV3/presentation/TotalVO;)Lru/ozon/app/android/cart/totalV3/presentation/TotalVO;", "Landroid/view/ViewGroup;", "composerRootView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lj10/h;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "", "onContainerInitialized", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;Lru/ozon/composer/ui/widget/l;)V", "Lru/ozon/app/android/composer/widgets/base/ComposerInflater;", "composerInflater", "references", "createHolder", "(Lru/ozon/app/android/composer/widgets/base/ComposerInflater;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)Lru/ozon/app/android/cart/totalV3/presentation/TotalViewHolder;", "holder", "bind", "(Lru/ozon/app/android/cart/totalV3/presentation/TotalViewHolder;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/cart/totalV3/presentation/TotalV3StateUpdate;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lru/ozon/app/android/cart/totalV3/presentation/TotalViewModel;", "viewModel", "Lru/ozon/app/android/cart/totalV3/presentation/TotalViewModel;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "mapper", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TotalViewMapper extends BottomContainerViewMapper2<TotalV3Component, TotalViewHolder, TotalDTO, TotalVO> {

    @NotNull
    private final List<Class<TotalV3StateUpdate>> supportedUpdates = C7714v.a0(TotalV3StateUpdate.class);
    private TotalViewModel viewModel;

    /* JADX INFO: Access modifiers changed from: private */
    public static final TotalV3Component widgetComponent$lambda$3(C7475g c7475g) {
        return TotalV3Component.INSTANCE.createComponent(c7475g);
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.overlay.BottomContainerViewMapper2
    public /* bridge */ /* synthetic */ TotalViewHolder createHolder(ComposerInflater composerInflater, ComposerReferences composerReferences, h hVar) {
        return createHolder(composerInflater, composerReferences, (h<l>) hVar);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper
    @NotNull
    public Function2<TotalDTO, d, List<TotalVO>> getMapper() {
        return ((TotalV3Component) component()).getMapper();
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<TotalV3StateUpdate>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.overlay.MultiplyNoUIViewMapper2
    public void onContainerInitialized(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences refs, @NotNull h<l> voHelper, @NotNull l viewObject) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        super.onContainerInitialized(composerRootView, refs, voHelper, viewObject);
        this.viewModel = (TotalViewModel) new z0(refs.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.cart.totalV3.presentation.TotalViewMapper$onContainerInitialized$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                TotalViewModel viewModel = ((TotalV3Component) TotalViewMapper.this.component()).getViewModel();
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(TotalViewModel.class);
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<TotalV3Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(TotalV3Component.class), new a(storage, 9));
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.overlay.MultiplyNoUIViewMapper2
    public void bind(@NotNull TotalViewHolder holder, @NotNull l viewObject, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        c d11 = viewObject.d();
        TotalVO totalVO = d11 instanceof TotalVO ? (TotalVO) d11 : null;
        if (totalVO == null) {
            return;
        }
        holder.bindTrackingData(viewObject, viewObject.n(), ((TotalV3Component) component()).getViewedPond());
        k.bindItem$default(holder, totalVO, viewObject.c(), null, 4, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.ozon.app.android.composer.widgets.v2.overlay.BottomContainerViewMapper2
    @NotNull
    public TotalViewHolder createHolder(@NotNull ComposerInflater composerInflater, @NotNull ComposerReferences references, @NotNull h<l> voHelper) {
        Intrinsics.checkNotNullParameter(composerInflater, "composerInflater");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        Context context = composerInflater.getContext();
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setPadding(0, ResourceExtKt.toPx(16, context), 0, 0);
        recyclerView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return new TotalViewHolder(recyclerView, references, this.viewModel, ((TotalV3Component) component()).getRefererValueController(), ((TotalV3Component) component()).getCustomActionHandlersStoreFactory());
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper, c20.r, I00.d
    public TotalVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull TotalVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof TotalV3StateUpdate) {
            return TotalVO.copy$default(oldItem, 0L, TotalMapperKt.toVO(((TotalV3StateUpdate) update).getUpdatedDTO().getItems()), false, null, 13, null);
        }
        return null;
    }
}
