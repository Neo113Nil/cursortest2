package ru.ozon.app.android.storefront.widgets.feedback.common;

import DU.a;
import Vg.d;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import d20.InterfaceC6068e;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionHandler;
import ru.ozon.app.android.storefront.R$layout;
import ru.ozon.app.android.storefront.databinding.CommonItemNextStepButtonBinding;
import ru.ozon.app.android.storefront.widgets.feedback.common.RateMainButtonViewMapper;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.di.RateMainButtonComponent;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.RateViewModelImpl;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0002B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u000f2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/common/RateMainButtonViewMapper;", "T", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/di/RateMainButtonComponent;", "Lru/ozon/app/android/storefront/widgets/feedback/common/RateMainButtonVO;", "<init>", "()V", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "state", "Ll20/d;", "info", "", "map", "(Ljava/lang/Object;Ll20/d;)Ljava/util/List;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RateMainButtonViewMapper<T> extends OverlayWidgetScreenViewItemMapper2<RateMainButtonComponent<T>, T, RateMainButtonVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$1(View view, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RateMainButtonComponent widgetComponent$lambda$2(C7475g c7475g) {
        return new RateMainButtonComponent(c7475g);
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<RateMainButtonVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        final View inflate = ViewGroupExtKt.inflate(container.Z(), R$layout.common_item_next_step_button);
        d customActionHandlersStoreFactory = component().getCustomActionHandlersStoreFactory();
        CommonItemNextStepButtonBinding bind = CommonItemNextStepButtonBinding.bind(inflate);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        w0 a11 = new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.storefront.widgets.feedback.common.RateMainButtonViewMapper$createHolder$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                RateViewModelImpl rateViewModelImpl = RateMainButtonViewMapper.this.component().getViewModelProvider().get();
                Intrinsics.g(rateViewModelImpl, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return rateViewModelImpl;
            }
        }).a(RateViewModelImpl.class);
        Intrinsics.checkNotNullExpressionValue(a11, "createViewModel(...)");
        return new RateMainButtonViewHolder((RateViewModelImpl) a11, bind, container, customActionHandlersStoreFactory.create(ComposerActionWithActionHandler.class, CloseFlowAndActionDoActionHandler.class), new InterfaceC6068e() { // from class: GK.a
            @Override // d20.InterfaceC6068e
            public final View create(ViewGroup viewGroup) {
                View createHolder$lambda$1;
                createHolder$lambda$1 = RateMainButtonViewMapper.createHolder$lambda$1(inflate, (LinearLayout) viewGroup);
                return createHolder$lambda$1;
            }
        });
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<RateMainButtonVO> map(T state, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getMapper().invoke2((RateMainButtonMapper<T>) state, info);
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<RateMainButtonComponent<T>> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(RateMainButtonComponent.class), new a(storage, 2));
    }
}
