package ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder;

import C.o0;
import G.g;
import Nh.a;
import android.view.View;
import jk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001e\u0010\r¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/PrepareView;", "", "Landroid/view/View;", "view", "Ljk0/q;", "viewHolderPositionInfo", "", "json", "widgetName", "stateId", "<init>", "(Landroid/view/View;Ljk0/q;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Ljk0/q;", "getViewHolderPositionInfo", "()Ljk0/q;", "Ljava/lang/String;", "getJson", "getWidgetName", "getStateId", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* data */ class PrepareView {

    @NotNull
    private final String json;

    @NotNull
    private final String stateId;

    @NotNull
    private final View view;

    @NotNull
    private final q viewHolderPositionInfo;

    @NotNull
    private final String widgetName;

    public PrepareView(@NotNull View view, @NotNull q viewHolderPositionInfo, @NotNull String json, @NotNull String widgetName, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(viewHolderPositionInfo, "viewHolderPositionInfo");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(widgetName, "widgetName");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        this.view = view;
        this.viewHolderPositionInfo = viewHolderPositionInfo;
        this.json = json;
        this.widgetName = widgetName;
        this.stateId = stateId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrepareView)) {
            return false;
        }
        PrepareView prepareView = (PrepareView) other;
        return Intrinsics.d(this.view, prepareView.view) && Intrinsics.d(this.viewHolderPositionInfo, prepareView.viewHolderPositionInfo) && Intrinsics.d(this.json, prepareView.json) && Intrinsics.d(this.widgetName, prepareView.widgetName) && Intrinsics.d(this.stateId, prepareView.stateId);
    }

    @NotNull
    public final String getJson() {
        return this.json;
    }

    @NotNull
    public final String getStateId() {
        return this.stateId;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    @NotNull
    public final q getViewHolderPositionInfo() {
        return this.viewHolderPositionInfo;
    }

    @NotNull
    public final String getWidgetName() {
        return this.widgetName;
    }

    public int hashCode() {
        return this.stateId.hashCode() + g.a(g.a((this.viewHolderPositionInfo.hashCode() + (this.view.hashCode() * 31)) * 31, 31, this.json), 31, this.widgetName);
    }

    @NotNull
    public String toString() {
        View view = this.view;
        q qVar = this.viewHolderPositionInfo;
        String str = this.json;
        String str2 = this.widgetName;
        String str3 = this.stateId;
        StringBuilder sb2 = new StringBuilder("PrepareView(view=");
        sb2.append(view);
        sb2.append(", viewHolderPositionInfo=");
        sb2.append(qVar);
        sb2.append(", json=");
        a.h(sb2, str, ", widgetName=", str2, ", stateId=");
        return o0.c(sb2, str3, ")");
    }
}
