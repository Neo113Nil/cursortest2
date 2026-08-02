package ru.ozon.app.android.fresh.unsorted.widgets.bottomContainer.presentation;

import PN.a;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.fresh.common.widgets.placeholdersUtils.SinglePlaceholderController;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomContainer.data.BottomContainerDTO;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomContainer.di.BottomContainerDIComponent;
import ru.ozon.app.android.fresh.unsorted.widgets.bottomContainer.domain.BottomContainerVO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/bottomContainer/presentation/BottomContainerViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/fresh/unsorted/widgets/bottomContainer/di/BottomContainerDIComponent;", "Lru/ozon/app/android/fresh/unsorted/widgets/bottomContainer/data/BottomContainerDTO;", "Lru/ozon/app/android/fresh/unsorted/widgets/bottomContainer/domain/BottomContainerVO;", "<init>", "()V", "Ll10/i;", "container", "Lru/ozon/app/android/fresh/common/widgets/placeholdersUtils/SinglePlaceholderController;", "getPlaceholderController", "(Ll10/i;)Lru/ozon/app/android/fresh/common/widgets/placeholdersUtils/SinglePlaceholderController;", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/fresh/unsorted/widgets/bottomContainer/data/BottomContainerDTO;Ll20/d;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "placeholderController", "Lru/ozon/app/android/fresh/common/widgets/placeholdersUtils/SinglePlaceholderController;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BottomContainerViewMapper extends OverlayWidgetScreenViewItemMapper2<BottomContainerDIComponent, BottomContainerDTO, BottomContainerVO> {
    private SinglePlaceholderController placeholderController;

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$1(LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BottomContainerView bottomContainerView = new BottomContainerView(context, null, 0, 6, null);
        bottomContainerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        return bottomContainerView;
    }

    private final SinglePlaceholderController getPlaceholderController(i container) {
        SinglePlaceholderController singlePlaceholderController = this.placeholderController;
        if (singlePlaceholderController != null) {
            Intrinsics.f(singlePlaceholderController);
            return singlePlaceholderController;
        }
        SinglePlaceholderController singlePlaceholderController2 = new SinglePlaceholderController(container, "default");
        this.placeholderController = singlePlaceholderController2;
        return singlePlaceholderController2;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<BottomContainerVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        SinglePlaceholderController singlePlaceholderController = this.placeholderController;
        if (singlePlaceholderController != null) {
            singlePlaceholderController.resubscribeToComposerUpdates();
        }
        return new BottomContainerViewHolder(container, getPlaceholderController(container), new a(1));
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<BottomContainerDIComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return BottomContainerDIComponent.INSTANCE.create(storage);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<BottomContainerVO> map(@NotNull BottomContainerDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getMapper().invoke(state, info);
    }
}
