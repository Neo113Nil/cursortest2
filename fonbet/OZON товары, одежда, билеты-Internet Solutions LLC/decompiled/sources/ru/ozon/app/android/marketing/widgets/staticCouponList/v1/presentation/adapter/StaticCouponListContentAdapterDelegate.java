package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.adapter;

import android.view.ViewGroup;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListVO;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.adapter.StaticCouponListContentAdapter;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f¢\u0006\u0004\b\u0013\u0010\u0014J9\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0015\u001a\u00020\u0001¢\u0006\u0004\b\u0013\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/adapter/StaticCouponListContentAdapterDelegate;", "", "<init>", "()V", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem;", "item", "", "canHandle", "(Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem;)Z", "Landroid/view/ViewGroup;", "parent", "Ljk0/j;", "onCreateViewHolder", "(Landroid/view/ViewGroup;)Ljk0/j;", "holder", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "onBindViewHolder", "(Ljk0/j;Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem;Lkotlin/jvm/functions/Function1;)V", "payload", "(Ljk0/j;Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class StaticCouponListContentAdapterDelegate {
    public abstract boolean canHandle(@NotNull StaticCouponListVO.ContentItem item);

    public final void onBindViewHolder(@NotNull j holder, @NotNull StaticCouponListVO.ContentItem item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        if ((holder instanceof StaticCouponListContentAdapter.ViewHolder ? (StaticCouponListContentAdapter.ViewHolder) holder : null) != null) {
            ((StaticCouponListContentAdapter.ViewHolder) holder).getViewBinder().bind(item, actionHandler);
        }
    }

    @NotNull
    public abstract j onCreateViewHolder(@NotNull ViewGroup parent);

    public final void onBindViewHolder(@NotNull j holder, @NotNull StaticCouponListVO.ContentItem item, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if ((holder instanceof StaticCouponListContentAdapter.ViewHolder ? (StaticCouponListContentAdapter.ViewHolder) holder : null) != null) {
            ((StaticCouponListContentAdapter.ViewHolder) holder).getViewBinder().bind(item, actionHandler, payload);
        }
    }
}
