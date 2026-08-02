package com.vk.superapp.common.js.bridge.api.events;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import xsna.ad6;
import xsna.b9y;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: Alert.kt */
/* loaded from: classes6.dex */
public final class Alert$Parameters implements ad6 {

    @pmi0("actions")
    private final List<Actions> actions;

    @pmi0("message")
    private final String message;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0(TtmlNode.TAG_STYLE)
    private final String style;

    @pmi0("title")
    private final String title;

    public Alert$Parameters(String str, String str2, String str3, String str4, List<Actions> list) {
        this.requestId = str;
        this.title = str2;
        this.message = str3;
        this.style = str4;
        this.actions = list;
    }

    public static final Alert$Parameters a(Alert$Parameters alert$Parameters) {
        return alert$Parameters.requestId == null ? new Alert$Parameters("default_request_id", alert$Parameters.title, alert$Parameters.message, alert$Parameters.style, alert$Parameters.actions) : alert$Parameters;
    }

    public static final void b(Alert$Parameters alert$Parameters) {
        if (alert$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final List<Actions> c() {
        return this.actions;
    }

    public final String d() {
        return this.message;
    }

    public final String e() {
        return this.requestId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Alert$Parameters)) {
            return false;
        }
        Alert$Parameters alert$Parameters = (Alert$Parameters) obj;
        return epx.f(this.requestId, alert$Parameters.requestId) && epx.f(this.title, alert$Parameters.title) && epx.f(this.message, alert$Parameters.message) && epx.f(this.style, alert$Parameters.style) && epx.f(this.actions, alert$Parameters.actions);
    }

    public final String f() {
        return this.style;
    }

    public final String g() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = this.requestId.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.style;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<Actions> list = this.actions;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(requestId=");
        sb.append(this.requestId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", style=");
        sb.append(this.style);
        sb.append(", actions=");
        return ms9.a(')', sb, this.actions);
    }

    /* compiled from: Alert.kt */
    public static final class Actions {

        @pmi0("handler")
        private final b9y handler;

        @pmi0(TtmlNode.TAG_STYLE)
        private final String style;

        @pmi0("title")
        private final String title;

        public Actions(String str, String str2, b9y b9yVar) {
            this.title = str;
            this.style = str2;
            this.handler = b9yVar;
        }

        public final b9y a() {
            return this.handler;
        }

        public final String b() {
            return this.title;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Actions)) {
                return false;
            }
            Actions actions = (Actions) obj;
            return epx.f(this.title, actions.title) && epx.f(this.style, actions.style) && epx.f(this.handler, actions.handler);
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.style;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            b9y b9yVar = this.handler;
            return hashCode2 + (b9yVar != null ? b9yVar.hashCode() : 0);
        }

        public final String toString() {
            return "Actions(title=" + this.title + ", style=" + this.style + ", handler=" + this.handler + ')';
        }

        public /* synthetic */ Actions(String str, String str2, b9y b9yVar, int i, zcl zclVar) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : b9yVar);
        }
    }

    public /* synthetic */ Alert$Parameters(String str, String str2, String str3, String str4, List list, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : list);
    }
}
