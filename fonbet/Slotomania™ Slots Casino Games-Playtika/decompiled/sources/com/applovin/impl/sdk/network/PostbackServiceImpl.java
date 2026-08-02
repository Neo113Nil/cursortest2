package com.applovin.impl.sdk.network;

import com.applovin.impl.f6;
import com.applovin.impl.k5;
import com.applovin.impl.s5;
import com.applovin.impl.sdk.EventServiceImpl;
import com.applovin.impl.sdk.l;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinPostbackService;
import java.util.Map;

/* loaded from: classes6.dex */
public class PostbackServiceImpl implements AppLovinPostbackService {
    private final l a;

    public PostbackServiceImpl(l lVar) {
        this.a = lVar;
    }

    private boolean a(e eVar) {
        Map i = eVar.i();
        if (i == null) {
            return false;
        }
        Object obj = i.get("event");
        if ("postinstall".equals(obj)) {
            obj = i.get("sub_event");
        }
        return EventServiceImpl.ALLOW_PRE_INIT_EVENT_TYPES.contains(obj);
    }

    @Override // com.applovin.sdk.AppLovinPostbackService
    public void dispatchPostbackAsync(String str, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(e.b(this.a).b(str).a(false).a(), appLovinPostbackListener);
    }

    public void dispatchPostbackRequest(e eVar, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(eVar, f6.b.OTHER, appLovinPostbackListener);
    }

    public String toString() {
        return "PostbackService{}";
    }

    public void dispatchPostbackRequest(e eVar, f6.b bVar, AppLovinPostbackListener appLovinPostbackListener) {
        s5 s5Var = new s5(eVar, bVar, this.a, appLovinPostbackListener);
        s5Var.a(a(eVar));
        this.a.s0().a((k5) s5Var, bVar);
    }
}
