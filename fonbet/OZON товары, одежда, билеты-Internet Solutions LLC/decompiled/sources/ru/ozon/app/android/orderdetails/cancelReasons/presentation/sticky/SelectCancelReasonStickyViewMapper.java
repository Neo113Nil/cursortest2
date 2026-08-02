package ru.ozon.app.android.orderdetails.cancelReasons.presentation.sticky;

import BZ.f;
import GU.a;
import android.content.Context;
import android.content.res.Configuration;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.orderdetails.cancelReasons.data.SelectCancelReasonDTO;
import ru.ozon.app.android.orderdetails.cancelReasons.di.SelectCancelReasonComponent;
import ru.ozon.app.android.orderdetails.cancelReasons.presentation.models.SelectCancelReasonVO;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001dj\b\u0012\u0004\u0012\u00020\u0002`\u001e2\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001bH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/orderdetails/cancelReasons/presentation/sticky/SelectCancelReasonStickyViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/orderdetails/cancelReasons/di/SelectCancelReasonComponent;", "Lru/ozon/app/android/orderdetails/cancelReasons/data/SelectCancelReasonDTO$StickyDTO;", "Lru/ozon/app/android/orderdetails/cancelReasons/presentation/models/SelectCancelReasonVO$StickyVO;", "<init>", "()V", "Landroid/content/Context;", "context", "createNightWrapper", "(Landroid/content/Context;)Landroid/content/Context;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/orderdetails/cancelReasons/data/SelectCancelReasonDTO$StickyDTO;Ll20/d;)Ljava/util/List;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SelectCancelReasonStickyViewMapper extends OverlayWidgetScreenViewItemMapper2<SelectCancelReasonComponent, SelectCancelReasonDTO.StickyDTO, SelectCancelReasonVO.StickyVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$1(Object obj, LinearLayout it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (View) obj;
    }

    private final Context createNightWrapper(Context context) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, f.b(component().getMiniAppConfigHolder()));
        Configuration configuration = new Configuration();
        configuration.uiMode = 32;
        contextThemeWrapper.applyOverrideConfiguration(configuration);
        return contextThemeWrapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SelectCancelReasonComponent widgetComponent$lambda$2(C7475g c7475g) {
        return SelectCancelReasonComponent.INSTANCE.create(c7475g);
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof SelectCancelReasonDTO.StickyDTO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c20.r
    @NotNull
    public AbstractC6065b<SelectCancelReasonVO.StickyVO> createHolder(@NotNull i container) {
        SelectCancelReasonStickyCommonView selectCancelReasonStickyCommonView;
        Intrinsics.checkNotNullParameter(container, "container");
        if (component().getTeensModeStorage().isTeensModeEnabled()) {
            Context L11 = container.L();
            Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
            Context createNightWrapper = createNightWrapper(L11);
            Context L12 = container.L();
            Intrinsics.checkNotNullExpressionValue(L12, "<get-context>(...)");
            SelectCancelReasonStickyTeenView selectCancelReasonStickyTeenView = new SelectCancelReasonStickyTeenView(L12, null, 0, 0, 14, null);
            selectCancelReasonStickyTeenView.createButtonAndCaption(createNightWrapper);
            selectCancelReasonStickyCommonView = selectCancelReasonStickyTeenView;
        } else {
            Context L13 = container.L();
            Intrinsics.checkNotNullExpressionValue(L13, "<get-context>(...)");
            selectCancelReasonStickyCommonView = new SelectCancelReasonStickyCommonView(L13, null, 0, 0, 14, null);
        }
        return new SelectCancelReasonStickyViewHolder(selectCancelReasonStickyCommonView, container, component().getCustomActionHandlersStoreFactory(), component().getCommentProvider(), component().getHandlersInhibitor(), new a(selectCancelReasonStickyCommonView, 2));
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<SelectCancelReasonComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(SelectCancelReasonComponent.class), new EV.a(storage, 7));
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<SelectCancelReasonVO.StickyVO> map(@NotNull SelectCancelReasonDTO.StickyDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getStickyMapper().invoke(state, info);
    }
}
