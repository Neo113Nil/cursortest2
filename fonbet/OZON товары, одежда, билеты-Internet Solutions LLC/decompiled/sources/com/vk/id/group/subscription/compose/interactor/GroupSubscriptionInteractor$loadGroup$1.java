package com.vk.id.group.subscription.compose.interactor;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor", f = "GroupSubscriptionInteractor.kt", l = {50, 51, 52, 52}, m = "loadGroup$group_subscription_compose_release")
/* loaded from: classes9.dex */
final class GroupSubscriptionInteractor$loadGroup$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GroupSubscriptionInteractor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GroupSubscriptionInteractor$loadGroup$1(GroupSubscriptionInteractor groupSubscriptionInteractor, d<? super GroupSubscriptionInteractor$loadGroup$1> dVar) {
        super(dVar);
        this.this$0 = groupSubscriptionInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.loadGroup$group_subscription_compose_release(this);
    }
}
