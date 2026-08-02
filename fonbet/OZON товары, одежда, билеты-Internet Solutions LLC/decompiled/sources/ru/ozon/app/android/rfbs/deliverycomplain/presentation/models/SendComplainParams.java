package ru.ozon.app.android.rfbs.deliverycomplain.presentation.models;

import Nh.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/rfbs/deliverycomplain/presentation/models/SendComplainParams;", "", "", "actionName", "", "requestParams", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getActionName", "Ljava/util/Map;", "getRequestParams", "()Ljava/util/Map;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SendComplainParams {

    @NotNull
    private final String actionName;

    @NotNull
    private final Map<String, String> requestParams;

    public SendComplainParams(@NotNull String actionName, @NotNull Map<String, String> requestParams) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        Intrinsics.checkNotNullParameter(requestParams, "requestParams");
        this.actionName = actionName;
        this.requestParams = requestParams;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendComplainParams)) {
            return false;
        }
        SendComplainParams sendComplainParams = (SendComplainParams) other;
        return Intrinsics.d(this.actionName, sendComplainParams.actionName) && Intrinsics.d(this.requestParams, sendComplainParams.requestParams);
    }

    @NotNull
    public final String getActionName() {
        return this.actionName;
    }

    @NotNull
    public final Map<String, String> getRequestParams() {
        return this.requestParams;
    }

    public int hashCode() {
        return this.requestParams.hashCode() + (this.actionName.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a.d("SendComplainParams(actionName=", this.actionName, ", requestParams=", ")", this.requestParams);
    }
}
