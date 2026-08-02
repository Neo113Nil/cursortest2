package ru.ozon.uni.android.flashbar.factory;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.flashbar.callback.OnActionClickListener;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.android.flashbar.model.RestrictionAction;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class RestrictionsFactory$prepareAction$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Boolean $isRefreshParamsEnabled;
    final /* synthetic */ Restriction.Action $it;
    final /* synthetic */ OnActionClickListener $onActionClickListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RestrictionsFactory$prepareAction$1$1(Restriction.Action action, OnActionClickListener onActionClickListener, Boolean bool) {
        super(0);
        this.$it = action;
        this.$onActionClickListener = onActionClickListener;
        this.$isRefreshParamsEnabled = bool;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String deeplink;
        OnActionClickListener onActionClickListener;
        OnActionClickListener onActionClickListener2;
        String type = this.$it.getType();
        if (Intrinsics.d(type, Restriction.ActionType.REFRESH.getValue())) {
            OnActionClickListener onActionClickListener3 = this.$onActionClickListener;
            if (onActionClickListener3 != null) {
                onActionClickListener3.onAction(new RestrictionAction.RefreshAction(this.$it.getDeeplink(), Intrinsics.d(this.$isRefreshParamsEnabled, Boolean.TRUE) ? this.$it.getRefreshParams() : null));
                return;
            }
            return;
        }
        if (Intrinsics.d(type, Restriction.ActionType.SCROLL.getValue())) {
            String widgetName = this.$it.getWidgetName();
            if (widgetName == null || (onActionClickListener2 = this.$onActionClickListener) == null) {
                return;
            }
            onActionClickListener2.onAction(new RestrictionAction.ScrollAction(widgetName));
            return;
        }
        if (!Intrinsics.d(type, Restriction.ActionType.OPEN.getValue()) || (deeplink = this.$it.getDeeplink()) == null || (onActionClickListener = this.$onActionClickListener) == null) {
            return;
        }
        onActionClickListener.onAction(new RestrictionAction.OpenDeeplinkAction(deeplink));
    }
}
