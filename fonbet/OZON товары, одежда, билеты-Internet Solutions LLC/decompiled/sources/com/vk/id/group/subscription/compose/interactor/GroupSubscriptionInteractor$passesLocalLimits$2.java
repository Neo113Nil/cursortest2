package com.vk.id.group.subscription.compose.interactor;

import Sc.s;
import Wc.a;
import com.vk.id.AccessToken;
import com.vk.id.VKID;
import com.vk.id.group.subscription.compose.storage.GroupSubscriptionPrefsStorage;
import com.vk.id.groupsubscription.GroupSubscriptionLimit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)Z"}, k = 3, mv = {2, 0, 0})
@e(c = "com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor$passesLocalLimits$2", f = "GroupSubscriptionInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class GroupSubscriptionInteractor$passesLocalLimits$2 extends j implements Function2<M, d<? super Boolean>, Object> {
    int label;
    final /* synthetic */ GroupSubscriptionInteractor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GroupSubscriptionInteractor$passesLocalLimits$2(GroupSubscriptionInteractor groupSubscriptionInteractor, d<? super GroupSubscriptionInteractor$passesLocalLimits$2> dVar) {
        super(2, dVar);
        this.this$0 = groupSubscriptionInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new GroupSubscriptionInteractor$passesLocalLimits$2(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        GroupSubscriptionLimit groupSubscriptionLimit;
        GroupSubscriptionLimit groupSubscriptionLimit2;
        GroupSubscriptionPrefsStorage groupSubscriptionPrefsStorage;
        GroupSubscriptionPrefsStorage groupSubscriptionPrefsStorage2;
        GroupSubscriptionLimit groupSubscriptionLimit3;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        groupSubscriptionLimit = this.this$0.limit;
        if (groupSubscriptionLimit == null) {
            return Boolean.TRUE;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        groupSubscriptionLimit2 = this.this$0.limit;
        calendar.add(6, -groupSubscriptionLimit2.getPeriodInDays());
        AccessToken accessToken = VKID.INSTANCE.getInstance().getAccessToken();
        if (accessToken == null) {
            return Boolean.FALSE;
        }
        long userID = accessToken.getUserID();
        groupSubscriptionPrefsStorage = this.this$0.storage;
        Set<Date> displays = groupSubscriptionPrefsStorage.getDisplays(userID);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : displays) {
            if (((Date) obj2).after(calendar.getTime())) {
                arrayList.add(obj2);
            }
        }
        Set<? extends Date> Y02 = C7714v.Y0(arrayList);
        groupSubscriptionPrefsStorage2 = this.this$0.storage;
        groupSubscriptionPrefsStorage2.saveDisplays(userID, Y02);
        int size = Y02.size();
        groupSubscriptionLimit3 = this.this$0.limit;
        return Boolean.valueOf(size < groupSubscriptionLimit3.getMaxSubscriptionsToShow());
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Boolean> dVar) {
        return ((GroupSubscriptionInteractor$passesLocalLimits$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
