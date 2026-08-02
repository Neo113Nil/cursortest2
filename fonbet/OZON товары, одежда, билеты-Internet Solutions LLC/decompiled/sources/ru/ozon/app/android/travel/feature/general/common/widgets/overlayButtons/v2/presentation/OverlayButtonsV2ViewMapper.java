package ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.presentation;

import A00.a;
import DQ.a;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
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
import ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.data.OverlayButtonsV2DTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.di.OverlayButtonsV2Component;
import ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.view.OverlayButtonsV2View;
import ru.ozon.app.android.travel.utils.asyncWidget.asyncAction.AsyncActionVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001aj\b\u0012\u0004\u0012\u00020\u0002`\u001b2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR&\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/presentation/OverlayButtonsV2ViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/di/OverlayButtonsV2Component;", "Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/data/OverlayButtonsV2DTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/presentation/OverlayButtonsV2VO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/presentation/OverlayButtonsV2VO;)Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/presentation/OverlayButtonsV2VO;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/data/OverlayButtonsV2DTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Ljava/lang/Class;", "Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/presentation/OverlayButtonsV2Update;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "viewType", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OverlayButtonsV2ViewMapper extends OverlayWidgetScreenViewItemMapper2<OverlayButtonsV2Component, OverlayButtonsV2DTO, OverlayButtonsV2VO> {

    @NotNull
    private final List<Class<OverlayButtonsV2Update>> supportedUpdates = C7714v.a0(OverlayButtonsV2Update.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$2(LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.f(context);
        int px = ResourceExtKt.toPx(24, context);
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        OverlayButtonsV2View overlayButtonsV2View = new OverlayButtonsV2View(context2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, 0, px);
        layoutParams.gravity = 1;
        overlayButtonsV2View.setLayoutParams(layoutParams);
        overlayButtonsV2View.setMinimumHeight(ResourceExtKt.toPx(44, context));
        overlayButtonsV2View.setNestedScrollingEnabled(false);
        return overlayButtonsV2View;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OverlayButtonsV2Component widgetComponent$lambda$3(C7475g c7475g) {
        return new OverlayButtonsV2Component(c7475g);
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<OverlayButtonsV2VO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new OverlayButtonsV2WidgetViewHolder(container.X(), component().getAsyncActionWidgetViewModel(), container, new a(2));
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<OverlayButtonsV2Update>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return r.a.SINGLE;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<OverlayButtonsV2Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(OverlayButtonsV2Component.class), new CW.a(storage, 5));
    }

    @Override // c20.r, I00.d
    public OverlayButtonsV2VO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull OverlayButtonsV2VO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        AsyncActionVO asyncActionVO = null;
        if (!(update instanceof OverlayButtonsV2Update)) {
            return null;
        }
        OverlayButtonsV2Update overlayButtonsV2Update = (OverlayButtonsV2Update) update;
        OverlayButtonsV2State state = overlayButtonsV2Update.getState();
        AsyncActionVO asyncAction = overlayButtonsV2Update.getState().getAsyncAction();
        if (asyncAction != null) {
            AsyncActionVO asyncAction2 = oldItem.getState().getAsyncAction();
            asyncActionVO = AsyncActionVO.copy$default(asyncAction, null, asyncAction2 != null ? asyncAction2.getAsyncData() : null, null, null, 13, null);
        }
        return OverlayButtonsV2VO.copy$default(oldItem, 0L, OverlayButtonsV2State.copy$default(state, asyncActionVO, null, null, null, null, 30, null), 1, null);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<OverlayButtonsV2VO> map(@NotNull OverlayButtonsV2DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getMapper().invoke(state, info);
    }
}
