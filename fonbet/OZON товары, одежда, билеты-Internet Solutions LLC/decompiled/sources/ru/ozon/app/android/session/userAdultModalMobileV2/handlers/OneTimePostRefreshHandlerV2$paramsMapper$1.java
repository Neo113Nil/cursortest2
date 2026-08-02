package ru.ozon.app.android.session.userAdultModalMobileV2.handlers;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class OneTimePostRefreshHandlerV2$paramsMapper$1 extends AbstractC7737t implements Function1<AtomAction, Map<String, ? extends Object>> {
    final /* synthetic */ OneTimePostRefreshHandlerV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OneTimePostRefreshHandlerV2$paramsMapper$1(OneTimePostRefreshHandlerV2 oneTimePostRefreshHandlerV2) {
        super(1);
        this.this$0 = oneTimePostRefreshHandlerV2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Map<String, Object> invoke(AtomAction action) {
        Map<String, String> params;
        String str;
        Map<String, Object> parseToMap;
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(action instanceof AtomAction.Click) || (params = ((AtomAction.Click) action).getParams()) == null || (str = params.get("body")) == null) {
            return null;
        }
        parseToMap = this.this$0.parseToMap(str);
        return parseToMap;
    }
}
