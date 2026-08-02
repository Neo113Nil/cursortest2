package ru.ozon.app.android.storefront.widgets.feedback.rateWidget.core;

import A00.a;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionHandler;
import ru.ozon.app.android.storefront.widgets.feedback.common.CloseFlowAndActionDoActionHandler;
import ru.ozon.app.android.storefront.widgets.feedback.npsRating.presentation.PopBackStackActionHandler;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.data.RateDTO;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.di.RateComponent;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.RateViewHolder;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.RateViewModel;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.RateViewModelImpl;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.presentation.model.RateVO;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e2\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 R(\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00110!0\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010'\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/core/RateViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/di/RateComponent;", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/data/RateDTO;", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateVO;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/data/RateDTO;Ll20/d;)Ljava/util/List;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateVO;)Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/presentation/model/RateVO;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RateViewMapper extends OverlayWidgetScreenViewItemMapper2<RateComponent, RateDTO, RateVO> {

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.a0(RateListUpdateEvent.class);

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final RateComponent widgetComponent$lambda$1(C7475g c7475g) {
        return new RateComponent(c7475g);
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof RateDTO;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<RateVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Object a11 = new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.storefront.widgets.feedback.rateWidget.core.RateViewMapper$createHolder$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                RateViewModelImpl rateViewModelImpl = RateViewMapper.this.component().getViewModelProvider().get();
                Intrinsics.g(rateViewModelImpl, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return rateViewModelImpl;
            }
        }).a(RateViewModelImpl.class);
        Intrinsics.checkNotNullExpressionValue(a11, "createViewModel(...)");
        return new RateViewHolder(container, (RateViewModel) a11, component().getCustomActionHandlersStoreFactory().create(PopBackStackActionHandler.class, ComposerActionWithActionHandler.class, CloseFlowAndActionDoActionHandler.class));
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<RateComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(RateComponent.class), new EV.a(storage, 3));
    }

    @Override // c20.r, I00.d
    public RateVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull RateVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return update instanceof RateListUpdateEvent ? RateVO.copy$default(oldItem, 0L, null, ((RateListUpdateEvent) update).getListToUpdate(), null, false, 27, null) : oldItem;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<RateVO> map(@NotNull RateDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getMapper().invoke(state, info);
    }
}
