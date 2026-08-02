package com.socure.docv.capturesdk.common.network.model.stepup;

import com.google.firebase.messaging.Constants;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import kotlin.Metadata;

/* compiled from: UpdateStatusRequest.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/Content;", "", Constants.ScionAnalytics.PARAM_LABEL, "", "type", "", "(Ljava/lang/String;ILjava/lang/String;I)V", "getLabel", "()Ljava/lang/String;", "getType", "()I", "TEXT", "CHECKBOX", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum Content {
    TEXT("text", 1),
    CHECKBOX(AnalyticsConstantsKt.CHECKBOX, 2);

    private final String label;
    private final int type;

    Content(String str, int i) {
        this.label = str;
        this.type = i;
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getType() {
        return this.type;
    }
}
