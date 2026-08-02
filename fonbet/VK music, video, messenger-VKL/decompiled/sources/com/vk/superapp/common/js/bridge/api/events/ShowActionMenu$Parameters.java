package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import xsna.ad6;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShowActionMenu.kt */
/* loaded from: classes6.dex */
public final class ShowActionMenu$Parameters implements ad6 {

    @pmi0("disabled_actions")
    private final List<String> disabledActions;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    public ShowActionMenu$Parameters(String str, List<String> list) {
        this.requestId = str;
        this.disabledActions = list;
    }

    public static final ShowActionMenu$Parameters a(ShowActionMenu$Parameters showActionMenu$Parameters) {
        return showActionMenu$Parameters.requestId == null ? new ShowActionMenu$Parameters("default_request_id", showActionMenu$Parameters.disabledActions) : showActionMenu$Parameters;
    }

    public static final void b(ShowActionMenu$Parameters showActionMenu$Parameters) {
        if (showActionMenu$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowActionMenu$Parameters)) {
            return false;
        }
        ShowActionMenu$Parameters showActionMenu$Parameters = (ShowActionMenu$Parameters) obj;
        return epx.f(this.requestId, showActionMenu$Parameters.requestId) && epx.f(this.disabledActions, showActionMenu$Parameters.disabledActions);
    }

    public final int hashCode() {
        int hashCode = this.requestId.hashCode() * 31;
        List<String> list = this.disabledActions;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(requestId=");
        sb.append(this.requestId);
        sb.append(", disabledActions=");
        return ms9.a(')', sb, this.disabledActions);
    }

    public /* synthetic */ ShowActionMenu$Parameters(String str, List list, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : list);
    }
}
