package com.vk.superapp.common.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.bd6;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: SelectSbpBank.kt */
/* loaded from: classes6.dex */
public final class SelectSbpBank$Response implements bd6 {

    @pmi0("data")
    private final Data data;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("type")
    private final String type;

    /* compiled from: SelectSbpBank.kt */
    public static final class Data {

        @pmi0("bank_icon")
        private final String bankIcon;

        @pmi0("bank_launch_extra")
        private final String bankLaunchExtra;

        @pmi0("bank_title")
        private final String bankTitle;

        @pmi0(CommonUrlParts.REQUEST_ID)
        private final String requestId;

        public Data(String str, String str2, String str3, String str4) {
            this.bankTitle = str;
            this.bankIcon = str2;
            this.bankLaunchExtra = str3;
            this.requestId = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return epx.f(this.bankTitle, data.bankTitle) && epx.f(this.bankIcon, data.bankIcon) && epx.f(this.bankLaunchExtra, data.bankLaunchExtra) && epx.f(this.requestId, data.requestId);
        }

        public final int hashCode() {
            int a = urd0.a(urd0.a(this.bankTitle.hashCode() * 31, 31, this.bankIcon), 31, this.bankLaunchExtra);
            String str = this.requestId;
            return a + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(bankTitle=");
            sb.append(this.bankTitle);
            sb.append(", bankIcon=");
            sb.append(this.bankIcon);
            sb.append(", bankLaunchExtra=");
            sb.append(this.bankLaunchExtra);
            sb.append(", requestId=");
            return ho8.a(sb, this.requestId, ')');
        }
    }

    public SelectSbpBank$Response(String str, Data data, String str2) {
        this.type = str;
        this.data = data;
        this.requestId = str2;
    }

    @Override // xsna.bd6
    public final bd6 a(String str) {
        return new SelectSbpBank$Response(this.type, this.data, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectSbpBank$Response)) {
            return false;
        }
        SelectSbpBank$Response selectSbpBank$Response = (SelectSbpBank$Response) obj;
        return epx.f(this.type, selectSbpBank$Response.type) && epx.f(this.data, selectSbpBank$Response.data) && epx.f(this.requestId, selectSbpBank$Response.requestId);
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

    public /* synthetic */ SelectSbpBank$Response(String str, Data data, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "VKWebAppSelectSbpBankResult" : str, data, str2);
    }
}
