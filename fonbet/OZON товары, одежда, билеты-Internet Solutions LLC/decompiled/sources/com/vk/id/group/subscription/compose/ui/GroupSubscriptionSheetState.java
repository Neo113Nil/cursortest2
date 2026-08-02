package com.vk.id.group.subscription.compose.ui;

import P0.C3787x1;
import ja.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR.\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/vk/id/group/subscription/compose/ui/GroupSubscriptionSheetState;", "", "LP0/x1;", "materialSheetState", "<init>", "(LP0/x1;)V", "", "show", "()V", "hide", "LP0/x1;", "getMaterialSheetState$group_subscription_compose_release", "()LP0/x1;", "Lkotlin/Function1;", "", "showSheet", "Lkotlin/jvm/functions/Function1;", "getShowSheet$group_subscription_compose_release", "()Lkotlin/jvm/functions/Function1;", "setShowSheet$group_subscription_compose_release", "(Lkotlin/jvm/functions/Function1;)V", "isVisible", "()Z", "group-subscription-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class GroupSubscriptionSheetState {

    @NotNull
    private final C3787x1 materialSheetState;

    @NotNull
    private Function1<? super Boolean, Unit> showSheet;

    public GroupSubscriptionSheetState(@NotNull C3787x1 materialSheetState) {
        Intrinsics.checkNotNullParameter(materialSheetState, "materialSheetState");
        this.materialSheetState = materialSheetState;
        this.showSheet = new y(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showSheet$lambda$0(boolean z11) {
        return Unit.f71690a;
    }

    @NotNull
    /* renamed from: getMaterialSheetState$group_subscription_compose_release, reason: from getter */
    public final C3787x1 getMaterialSheetState() {
        return this.materialSheetState;
    }

    public final void hide() {
        this.showSheet.invoke(Boolean.FALSE);
    }

    public final boolean isVisible() {
        return this.materialSheetState.j();
    }

    public final void setShowSheet$group_subscription_compose_release(@NotNull Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.showSheet = function1;
    }

    public final void show() {
        this.showSheet.invoke(Boolean.TRUE);
    }
}
