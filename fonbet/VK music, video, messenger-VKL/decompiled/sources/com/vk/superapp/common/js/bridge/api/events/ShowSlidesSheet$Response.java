package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ShowSlidesSheet.kt */
/* loaded from: classes6.dex */
public final class ShowSlidesSheet$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    public ShowSlidesSheet$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new ShowSlidesSheet$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowSlidesSheet$Response)) {
            return false;
        }
        ShowSlidesSheet$Response showSlidesSheet$Response = (ShowSlidesSheet$Response) obj;
        return epx.f(this.type, showSlidesSheet$Response.type) && epx.f(this.data, showSlidesSheet$Response.data) && epx.f(this.requestId, showSlidesSheet$Response.requestId);
    }

    public final int hashCode() {
        int hashCode = (this.data.hashCode() + (this.type.hashCode() * 31)) * 31;
        String str = this.requestId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(type=");
        sb.append(this.type);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(", requestId=");
        return ho8.a(sb, this.requestId, ')');
    }

    /* compiled from: ShowSlidesSheet.kt */
    public static final class Data {

        @pmi0("action")
        private final Action action;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        @pmi0("result")
        private final boolean result;

        @pmi0("slide_index")
        private final Integer slideIndex;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ShowSlidesSheet.kt */
        public static final class Action {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Action[] $VALUES;

            @pmi0("cancel")
            public static final Action CANCEL;

            @pmi0("confirm")
            public static final Action CONFIRM;

            @pmi0(SignalingProtocol.KEY_REJECT)
            public static final Action REJECT;

            static {
                Action action = new Action("CONFIRM", 0);
                CONFIRM = action;
                Action action2 = new Action("REJECT", 1);
                REJECT = action2;
                Action action3 = new Action("CANCEL", 2);
                CANCEL = action3;
                Action[] actionArr = {action, action2, action3};
                $VALUES = actionArr;
                $ENTRIES = new asp(actionArr);
            }

            private Action(String str, int i) {
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) $VALUES.clone();
            }
        }

        public Data(boolean z, Action action, Integer num, String str) {
            this.result = z;
            this.action = action;
            this.slideIndex = num;
            this.requestId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return this.result == data.result && this.action == data.action && epx.f(this.slideIndex, data.slideIndex) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int hashCode = (this.action.hashCode() + (Boolean.hashCode(this.result) * 31)) * 31;
            Integer num = this.slideIndex;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.requestId;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(result=");
            sb.append(this.result);
            sb.append(", action=");
            sb.append(this.action);
            sb.append(", slideIndex=");
            sb.append(this.slideIndex);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }

        public /* synthetic */ Data(boolean z, Action action, Integer num, String str, int i, zcl zclVar) {
            this(z, action, (i & 4) != 0 ? null : num, str);
        }
    }

    public /* synthetic */ ShowSlidesSheet$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppShowSlidesSheetResult" : str, data, str2);
    }
}
