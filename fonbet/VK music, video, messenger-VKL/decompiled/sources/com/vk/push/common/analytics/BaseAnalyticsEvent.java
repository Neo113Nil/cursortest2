package com.vk.push.common.analytics;

import java.util.Map;
import xsna.spj;

/* compiled from: BaseAnalyticsEvent.kt */
/* loaded from: classes.dex */
public abstract class BaseAnalyticsEvent {
    public final String a;

    public BaseAnalyticsEvent(String str) {
        this.a = str;
    }

    public String getEventName() {
        return this.a;
    }

    public abstract Object getParams(spj<? super Map<String, String>> spjVar);
}
