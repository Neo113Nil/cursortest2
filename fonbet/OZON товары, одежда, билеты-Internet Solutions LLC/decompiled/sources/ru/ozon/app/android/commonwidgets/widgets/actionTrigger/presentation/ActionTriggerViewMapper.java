package ru.ozon.app.android.commonwidgets.widgets.actionTrigger.presentation;

import Ap.C2441a;
import Vg.d;
import c20.r;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.commonwidgets.widgets.actionTrigger.data.ActionTriggerDTO;
import ru.ozon.app.android.commonwidgets.widgets.actionTrigger.di.ActionTriggerComponent;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/actionTrigger/presentation/ActionTriggerViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/commonwidgets/widgets/actionTrigger/di/ActionTriggerComponent;", "Lru/ozon/app/android/commonwidgets/widgets/actionTrigger/data/ActionTriggerDTO;", "Lru/ozon/app/android/commonwidgets/widgets/actionTrigger/presentation/ActionTriggerVO;", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/commonwidgets/widgets/actionTrigger/data/ActionTriggerDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Lru/ozon/app/android/commonwidgets/widgets/actionTrigger/presentation/ActionTriggerViewHolder;", "createHolder", "(Ll10/i;)Lru/ozon/app/android/commonwidgets/widgets/actionTrigger/presentation/ActionTriggerViewHolder;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ActionTriggerViewMapper extends OverlayWidgetScreenViewItemMapper2<ActionTriggerComponent, ActionTriggerDTO, ActionTriggerVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActionTriggerComponent widgetComponent$lambda$0(final C7475g c7475g) {
        return new ActionTriggerComponent(c7475g) { // from class: ru.ozon.app.android.commonwidgets.widgets.actionTrigger.presentation.ActionTriggerViewMapper$widgetComponent$1$1
            private final d customActionHandlersStoreFactory;

            {
                this.customActionHandlersStoreFactory = ((CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class)).getCustomActionHandlersStoreFactory();
            }

            @Override // ru.ozon.app.android.commonwidgets.widgets.actionTrigger.di.ActionTriggerComponent
            public d getCustomActionHandlersStoreFactory() {
                return this.customActionHandlersStoreFactory;
            }
        };
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ActionTriggerComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(ActionTriggerComponent.class), new C2441a(storage, 12));
    }

    @Override // c20.r
    @NotNull
    public ActionTriggerViewHolder createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new ActionTriggerViewHolder(container, component().getCustomActionHandlersStoreFactory());
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<ActionTriggerVO> map(@NotNull ActionTriggerDTO state, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(new ActionTriggerVO(info.d().hashCode(), state.getAction(), null, 4, null));
    }
}
