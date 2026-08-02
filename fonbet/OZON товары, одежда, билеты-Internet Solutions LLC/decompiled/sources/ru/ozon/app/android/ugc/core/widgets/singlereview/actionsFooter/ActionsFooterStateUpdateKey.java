package ru.ozon.app.android.ugc.core.widgets.singlereview.actionsFooter;

import A00.a;
import C.o0;
import Kk.C3532b;
import Ve.C4636t5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0016\u0010\n¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/actionsFooter/ActionsFooterStateUpdateKey;", "LA00/a$J$a;", "", "reviewUuid", "", "isSelected", "actionId", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getReviewUuid", "Z", "()Z", "getActionId", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ActionsFooterStateUpdateKey implements a.J.InterfaceC0007a {
    private final String actionId;
    private final boolean isSelected;

    @NotNull
    private final String reviewUuid;

    public ActionsFooterStateUpdateKey(@NotNull String reviewUuid, boolean z11, String str) {
        Intrinsics.checkNotNullParameter(reviewUuid, "reviewUuid");
        this.reviewUuid = reviewUuid;
        this.isSelected = z11;
        this.actionId = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionsFooterStateUpdateKey)) {
            return false;
        }
        ActionsFooterStateUpdateKey actionsFooterStateUpdateKey = (ActionsFooterStateUpdateKey) other;
        return Intrinsics.d(this.reviewUuid, actionsFooterStateUpdateKey.reviewUuid) && this.isSelected == actionsFooterStateUpdateKey.isSelected && Intrinsics.d(this.actionId, actionsFooterStateUpdateKey.actionId);
    }

    public final String getActionId() {
        return this.actionId;
    }

    @NotNull
    public final String getReviewUuid() {
        return this.reviewUuid;
    }

    public int hashCode() {
        int a11 = C3532b.a(this.reviewUuid.hashCode() * 31, 31, this.isSelected);
        String str = this.actionId;
        return a11 + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        String str = this.reviewUuid;
        boolean z11 = this.isSelected;
        return o0.c(C4636t5.b("ActionsFooterStateUpdateKey(reviewUuid=", str, ", isSelected=", ", actionId=", z11), this.actionId, ")");
    }
}
