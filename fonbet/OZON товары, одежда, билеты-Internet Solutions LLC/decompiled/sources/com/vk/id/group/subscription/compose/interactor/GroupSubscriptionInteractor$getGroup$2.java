package com.vk.id.group.subscription.compose.interactor;

import Sc.s;
import Wc.a;
import com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiContract;
import com.vk.id.network.groupsubscription.data.InternalVKIDGroupByIdData;
import com.vk.id.network.groupsubscription.data.InternalVKIDGroupData;
import com.vk.id.network.groupsubscription.data.InternalVKIDGroupMembersData;
import com.vk.id.network.groupsubscription.data.InternalVKIDMemberData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xe.C10721f;
import xe.C10727i;
import xe.M;
import xe.U;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupData;", "<anonymous>", "(Lxe/M;)Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupData;"}, k = 3, mv = {2, 0, 0})
@e(c = "com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor$getGroup$2", f = "GroupSubscriptionInteractor.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class GroupSubscriptionInteractor$getGroup$2 extends j implements Function2<M, d<? super InternalVKIDGroupData>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GroupSubscriptionInteractor this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupByIdData;", "<anonymous>", "(Lxe/M;)Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupByIdData;"}, k = 3, mv = {2, 0, 0})
    @e(c = "com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor$getGroup$2$1", f = "GroupSubscriptionInteractor.kt", l = {81}, m = "invokeSuspend")
    /* renamed from: com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor$getGroup$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super InternalVKIDGroupByIdData>, Object> {
        int label;
        final /* synthetic */ GroupSubscriptionInteractor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(GroupSubscriptionInteractor groupSubscriptionInteractor, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = groupSubscriptionInteractor;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InternalVKIDGroupSubscriptionApiContract internalVKIDGroupSubscriptionApiContract;
            String accessToken;
            String str;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            internalVKIDGroupSubscriptionApiContract = this.this$0.apiService;
            accessToken = this.this$0.getAccessToken();
            str = this.this$0.groupId;
            this.label = 1;
            Object group = internalVKIDGroupSubscriptionApiContract.getGroup(accessToken, str, this);
            return group == aVar ? aVar : group;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super InternalVKIDGroupByIdData> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupMembersData;", "<anonymous>", "(Lxe/M;)Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupMembersData;"}, k = 3, mv = {2, 0, 0})
    @e(c = "com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor$getGroup$2$2", f = "GroupSubscriptionInteractor.kt", l = {82}, m = "invokeSuspend")
    /* renamed from: com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor$getGroup$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements Function2<M, d<? super InternalVKIDGroupMembersData>, Object> {
        int label;
        final /* synthetic */ GroupSubscriptionInteractor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(GroupSubscriptionInteractor groupSubscriptionInteractor, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.this$0 = groupSubscriptionInteractor;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass2(this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InternalVKIDGroupSubscriptionApiContract internalVKIDGroupSubscriptionApiContract;
            String accessToken;
            String str;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            internalVKIDGroupSubscriptionApiContract = this.this$0.apiService;
            accessToken = this.this$0.getAccessToken();
            str = this.this$0.groupId;
            this.label = 1;
            Object members = internalVKIDGroupSubscriptionApiContract.getMembers(accessToken, str, false, this);
            return members == aVar ? aVar : members;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super InternalVKIDGroupMembersData> dVar) {
            return ((AnonymousClass2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupMembersData;", "<anonymous>", "(Lxe/M;)Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupMembersData;"}, k = 3, mv = {2, 0, 0})
    @e(c = "com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor$getGroup$2$3", f = "GroupSubscriptionInteractor.kt", l = {83}, m = "invokeSuspend")
    /* renamed from: com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor$getGroup$2$3, reason: invalid class name */
    static final class AnonymousClass3 extends j implements Function2<M, d<? super InternalVKIDGroupMembersData>, Object> {
        int label;
        final /* synthetic */ GroupSubscriptionInteractor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(GroupSubscriptionInteractor groupSubscriptionInteractor, d<? super AnonymousClass3> dVar) {
            super(2, dVar);
            this.this$0 = groupSubscriptionInteractor;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass3(this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InternalVKIDGroupSubscriptionApiContract internalVKIDGroupSubscriptionApiContract;
            String accessToken;
            String str;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return obj;
            }
            s.b(obj);
            internalVKIDGroupSubscriptionApiContract = this.this$0.apiService;
            accessToken = this.this$0.getAccessToken();
            str = this.this$0.groupId;
            this.label = 1;
            Object members = internalVKIDGroupSubscriptionApiContract.getMembers(accessToken, str, true, this);
            return members == aVar ? aVar : members;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super InternalVKIDGroupMembersData> dVar) {
            return ((AnonymousClass3) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GroupSubscriptionInteractor$getGroup$2(GroupSubscriptionInteractor groupSubscriptionInteractor, d<? super GroupSubscriptionInteractor$getGroup$2> dVar) {
        super(2, dVar);
        this.this$0 = groupSubscriptionInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        GroupSubscriptionInteractor$getGroup$2 groupSubscriptionInteractor$getGroup$2 = new GroupSubscriptionInteractor$getGroup$2(this.this$0, dVar);
        groupSubscriptionInteractor$getGroup$2.L$0 = obj;
        return groupSubscriptionInteractor$getGroup$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            M m11 = (M) this.L$0;
            U[] uArr = {C10727i.a(m11, null, null, new AnonymousClass1(this.this$0, null), 3), C10727i.a(m11, null, null, new AnonymousClass2(this.this$0, null), 3), C10727i.a(m11, null, null, new AnonymousClass3(this.this$0, null), 3)};
            this.label = 1;
            obj = C10721f.b(uArr, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        List list = (List) obj;
        Object obj2 = list.get(0);
        Object obj3 = list.get(1);
        Object obj4 = list.get(2);
        Intrinsics.g(obj2, "null cannot be cast to non-null type com.vk.id.network.groupsubscription.data.InternalVKIDGroupByIdData");
        InternalVKIDGroupByIdData internalVKIDGroupByIdData = (InternalVKIDGroupByIdData) obj2;
        Intrinsics.g(obj3, "null cannot be cast to non-null type com.vk.id.network.groupsubscription.data.InternalVKIDGroupMembersData");
        InternalVKIDGroupMembersData internalVKIDGroupMembersData = (InternalVKIDGroupMembersData) obj3;
        Intrinsics.g(obj4, "null cannot be cast to non-null type com.vk.id.network.groupsubscription.data.InternalVKIDGroupMembersData");
        InternalVKIDGroupMembersData internalVKIDGroupMembersData2 = (InternalVKIDGroupMembersData) obj4;
        String imageUrl = internalVKIDGroupByIdData.getImageUrl();
        String name = internalVKIDGroupByIdData.getName();
        String description = internalVKIDGroupByIdData.getDescription();
        ArrayList p02 = C7714v.p0(internalVKIDGroupMembersData2.getMembers(), internalVKIDGroupMembersData.getMembers());
        ArrayList arrayList = new ArrayList(C7714v.z(p02, 10));
        Iterator it = p02.iterator();
        while (it.hasNext()) {
            arrayList.add(((InternalVKIDMemberData) it.next()).getImageUrl());
        }
        return new InternalVKIDGroupData(imageUrl, name, description, C7714v.K0(arrayList, 3), internalVKIDGroupMembersData.getCount(), internalVKIDGroupMembersData2.getCount(), internalVKIDGroupByIdData.getIsVerified());
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super InternalVKIDGroupData> dVar) {
        return ((GroupSubscriptionInteractor$getGroup$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
