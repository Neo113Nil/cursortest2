package ru.ozon.app.android.action.v2.models;

import G.g;
import Pk0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0006\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/action/v2/models/ActionV2Request;", "", "request", "", "actionName", "", "isLongPolling", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getRequest", "()Ljava/lang/Object;", "Ljava/lang/String;", "getActionName", "Z", "()Z", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ActionV2Request {

    @NotNull
    private final String actionName;
    private final boolean isLongPolling;
    private final Object request;

    public ActionV2Request(Object obj, @NotNull String actionName, boolean z11) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        this.request = obj;
        this.actionName = actionName;
        this.isLongPolling = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionV2Request)) {
            return false;
        }
        ActionV2Request actionV2Request = (ActionV2Request) other;
        return Intrinsics.d(this.request, actionV2Request.request) && Intrinsics.d(this.actionName, actionV2Request.actionName) && this.isLongPolling == actionV2Request.isLongPolling;
    }

    @NotNull
    public final String getActionName() {
        return this.actionName;
    }

    public final Object getRequest() {
        return this.request;
    }

    public int hashCode() {
        Object obj = this.request;
        return Boolean.hashCode(this.isLongPolling) + g.a((obj == null ? 0 : obj.hashCode()) * 31, 31, this.actionName);
    }

    /* renamed from: isLongPolling, reason: from getter */
    public final boolean getIsLongPolling() {
        return this.isLongPolling;
    }

    @NotNull
    public String toString() {
        Object obj = this.request;
        String str = this.actionName;
        boolean z11 = this.isLongPolling;
        StringBuilder sb2 = new StringBuilder("ActionV2Request(request=");
        sb2.append(obj);
        sb2.append(", actionName=");
        sb2.append(str);
        sb2.append(", isLongPolling=");
        return a.a(")", sb2, z11);
    }

    public /* synthetic */ ActionV2Request(Object obj, String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : obj, str, (i11 & 4) != 0 ? false : z11);
    }
}
