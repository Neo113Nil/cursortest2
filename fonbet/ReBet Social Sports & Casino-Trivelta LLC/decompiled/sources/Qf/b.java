package Qf;

import com.google.gson.Gson;
import com.google.gson.h;
import com.zoho.livechat.android.modules.triggers.data.remote.entities.TriggerResponse;
import com.zoho.livechat.android.modules.triggers.domain.entities.Trigger;
import kotlin.jvm.internal.Intrinsics;
import og.AbstractC5895g;

/* loaded from: classes4.dex */
public abstract class b {
    public static final Trigger a(TriggerResponse triggerResponse, Gson gson) {
        Intrinsics.checkNotNullParameter(triggerResponse, "<this>");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Integer delay = triggerResponse.getDelay();
        String encryptedVisitorInfo = triggerResponse.getEncryptedVisitorInfo();
        String matchedRuleId = triggerResponse.getMatchedRuleId();
        h params = triggerResponse.getParams();
        Trigger.Params params2 = params != null ? (Trigger.Params) AbstractC5895g.a(gson, params, Trigger.Params.class) : null;
        String type = triggerResponse.getType();
        Trigger.Type type2 = type != null ? (Trigger.Type) AbstractC5895g.b(gson, type, Trigger.Type.class) : null;
        h action = triggerResponse.getAction();
        if (action != null) {
            android.support.v4.media.session.b.a(AbstractC5895g.a(gson, action, Trigger.a.class));
        }
        h visitorInfo = triggerResponse.getVisitorInfo();
        return new Trigger(delay, encryptedVisitorInfo, matchedRuleId, params2, type2, visitorInfo != null ? (Trigger.VisitorInfo) AbstractC5895g.a(gson, visitorInfo, Trigger.VisitorInfo.class) : null, null);
    }
}
