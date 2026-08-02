package ru.ozon.app.android.checkoutcomposer.total.sticky.v2.presentation;

import A00.a;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import j10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;
import ru.ozon.app.android.checkout.R$layout;
import ru.ozon.app.android.checkout.databinding.WidgetTotalStickyV2Binding;
import ru.ozon.app.android.checkoutcomposer.total.sticky.v2.data.TotalStickyV2DTO;
import ru.ozon.app.android.checkoutcomposer.total.sticky.v2.di.TotalStickyV2Component;
import ru.ozon.app.android.checkoutcomposer.total.sticky.v2.presentation.viewholders.TotalStickyV2ViewHolder;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.widgets.base.ComposerInflater;
import ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.BottomContainerViewMapper;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J=\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\r2\u0010\u0010\u0016\u001a\f\u0012\u0004\u0012\u00020\u00140\u0013j\u0002`\u00152\n\u0010\u0018\u001a\u00060\u0014j\u0002`\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\u001c\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0010\u0010\u0016\u001a\f\u0012\u0004\u0012\u00020\u00140\u0013j\u0002`\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00022\n\u0010\u0018\u001a\u00060\u0014j\u0002`\u00172\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R&\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R.\u0010+\u001a\u0016\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R,\u00104\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u000202\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\"0)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010.¨\u00065"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/TotalStickyV2ViewMapper;", "Lru/ozon/app/android/composer/widgets/base/view/mapper/overlay/BottomContainerViewMapper;", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/viewholders/TotalStickyV2ViewHolder;", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/data/TotalStickyV2DTO;", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/TotalStickyV2VO;", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/di/TotalStickyV2Component;", "component", "<init>", "(Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/di/TotalStickyV2Component;)V", "Lru/ozon/app/android/composer/widgets/base/ComposerInflater;", "composerInflater", "Landroid/view/ViewGroup;", "rootView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "inflateViewHolder", "(Lru/ozon/app/android/composer/widgets/base/ComposerInflater;Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;)Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/viewholders/TotalStickyV2ViewHolder;", "composerRootView", "refs", "Lj10/h;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "", "onContainerInitialized", "(Landroid/view/ViewGroup;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;Lru/ozon/composer/ui/widget/l;)V", "createHolder", "(Lru/ozon/app/android/composer/widgets/base/ComposerInflater;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/viewholders/TotalStickyV2ViewHolder;", "holder", "bind", "(Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/viewholders/TotalStickyV2ViewHolder;Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/di/TotalStickyV2Component;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/TotalStickyV2StateUpdate;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lkotlin/Function2;", "LA00/a$J$a;", "updateConsumer", "Lkotlin/jvm/functions/Function2;", "getUpdateConsumer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/TotalStickyV2ViewModel;", "viewModel", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v2/presentation/TotalStickyV2ViewModel;", "Ll20/d;", "getMapper", "mapper", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TotalStickyV2ViewMapper extends BottomContainerViewMapper<TotalStickyV2ViewHolder, TotalStickyV2DTO, TotalStickyV2VO> {

    @NotNull
    private final TotalStickyV2Component component;

    @NotNull
    private final List<Class<TotalStickyV2StateUpdate>> supportedUpdates;

    @NotNull
    private final Function2<a.J.InterfaceC0007a, TotalStickyV2VO, TotalStickyV2VO> updateConsumer;
    private TotalStickyV2ViewModel viewModel;

    public TotalStickyV2ViewMapper(@NotNull TotalStickyV2Component component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.supportedUpdates = C7714v.a0(TotalStickyV2StateUpdate.class);
        this.updateConsumer = TotalStickyV2ViewMapper$updateConsumer$1.INSTANCE;
    }

    private final TotalStickyV2ViewHolder inflateViewHolder(ComposerInflater composerInflater, ViewGroup rootView, ComposerReferences references) {
        WidgetTotalStickyV2Binding bind = WidgetTotalStickyV2Binding.bind(composerInflater.inflate(R$layout.widget_total_sticky_v2));
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        return new TotalStickyV2ViewHolder(rootView, bind, references, this.viewModel, (TotalVisibilityViewModel) new z0(references.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.checkoutcomposer.total.sticky.v2.presentation.TotalStickyV2ViewMapper$inflateViewHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                TotalStickyV2Component totalStickyV2Component;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                totalStickyV2Component = TotalStickyV2ViewMapper.this.component;
                TotalVisibilityViewModel totalVisibilityViewModel = totalStickyV2Component.getTotalVisibilityViewModel();
                Intrinsics.g(totalVisibilityViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return totalVisibilityViewModel;
            }
        }).a(TotalVisibilityViewModel.class), this.component.getGetReferrerValueController(), this.component.getCartEventController(), this.component.getCustomActionHandlersStoreFactory(), this.component.getTokenizedAnalytics(), this.component.getAsyncCartViewModelProvider().get(references));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.BottomContainerViewMapper
    public /* bridge */ /* synthetic */ TotalStickyV2ViewHolder createHolder(ComposerInflater composerInflater, ComposerReferences composerReferences, h hVar) {
        return createHolder(composerInflater, composerReferences, (h<l>) hVar);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper
    @NotNull
    public Function2<TotalStickyV2DTO, d, List<TotalStickyV2VO>> getMapper() {
        return this.component.getMapper();
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<TotalStickyV2StateUpdate>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.NoUIViewMapper
    @NotNull
    public Function2<a.J.InterfaceC0007a, TotalStickyV2VO, TotalStickyV2VO> getUpdateConsumer() {
        return this.updateConsumer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.MultiplyNoUIViewMapper
    public void onContainerInitialized(@NotNull ViewGroup composerRootView, @NotNull ComposerReferences refs, @NotNull h<l> voHelper, @NotNull l viewObject) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        super.onContainerInitialized(composerRootView, refs, voHelper, viewObject);
        this.viewModel = (TotalStickyV2ViewModel) new z0(refs.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.checkoutcomposer.total.sticky.v2.presentation.TotalStickyV2ViewMapper$onContainerInitialized$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                TotalStickyV2Component totalStickyV2Component;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                totalStickyV2Component = TotalStickyV2ViewMapper.this.component;
                TotalStickyV2ViewModel viewModel = totalStickyV2Component.getViewModel();
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(TotalStickyV2ViewModel.class);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.MultiplyNoUIViewMapper
    public void bind(@NotNull TotalStickyV2ViewHolder holder, @NotNull l viewObject, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(references, "references");
        TotalStickyV2VO totalStickyV2VO = (TotalStickyV2VO) viewObject.e();
        if (totalStickyV2VO == null) {
            return;
        }
        holder.bindTrackingData(viewObject, viewObject.n(), this.component.getViewedPond());
        k.bindItem$default(holder, totalStickyV2VO, viewObject.c(), null, 4, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.BottomContainerViewMapper
    @NotNull
    public TotalStickyV2ViewHolder createHolder(@NotNull ComposerInflater composerInflater, @NotNull ComposerReferences references, @NotNull h<l> voHelper) {
        View view;
        ViewGroup composerContainer;
        Intrinsics.checkNotNullParameter(composerInflater, "composerInflater");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        ComponentCallbacksC5392m c11 = references.getContainer().c();
        if (c11 == null || (view = c11.getView()) == null || (composerContainer = ComposerViewExtensionKt.composerContainer(view)) == null) {
            throw new IllegalStateException("RootView is null");
        }
        return inflateViewHolder(composerInflater, composerContainer, references);
    }
}
