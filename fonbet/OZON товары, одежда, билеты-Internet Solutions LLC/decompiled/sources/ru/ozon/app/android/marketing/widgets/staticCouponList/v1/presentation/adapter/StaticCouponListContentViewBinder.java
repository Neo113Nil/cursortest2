package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.adapter;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListVO;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListVO.ContentItem;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\u0011J*\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\u00112\u0006\u0010\u0013\u001a\u00020\u0005J)\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\u0011H$¢\u0006\u0002\u0010\u0015J1\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\u00112\u0006\u0010\u0013\u001a\u00020\u0005H\u0014¢\u0006\u0002\u0010\u0016R\u0016\u0010\t\u001a\u00028\u0001X\u0084\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/adapter/StaticCouponListContentViewBinder;", "I", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem;", "V", "Landroid/view/View;", "", "view", "<init>", "(Landroid/view/View;)V", "currentView", "getCurrentView", "()Landroid/view/View;", "Landroid/view/View;", "bind", "", "item", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "payload", "bindTyped", "(Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem;Lkotlin/jvm/functions/Function1;)V", "(Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class StaticCouponListContentViewBinder<I extends StaticCouponListVO.ContentItem, V extends View> {

    @NotNull
    private final V currentView;

    /* JADX WARN: Multi-variable type inference failed */
    public StaticCouponListContentViewBinder(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.currentView = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void bind(@NotNull StaticCouponListVO.ContentItem item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        bindTyped(item, actionHandler);
    }

    protected abstract void bindTyped(@NotNull I item, @NotNull Function1<? super AtomAction, Unit> actionHandler);

    protected void bindTyped(@NotNull I item, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(payload, "payload");
        bindTyped(item, actionHandler);
    }

    @NotNull
    protected final V getCurrentView() {
        return this.currentView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void bind(@NotNull StaticCouponListVO.ContentItem item, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(payload, "payload");
        bindTyped(item, actionHandler, payload);
    }
}
