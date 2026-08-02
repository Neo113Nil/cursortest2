package com.vk.id.group.subscription.compose.interactor;

import He.b;
import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.vk.id.AccessToken;
import com.vk.id.VKID;
import com.vk.id.group.subscription.compose.storage.GroupSubscriptionPrefsStorage;
import java.util.Date;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor$saveDisplay$3", f = "GroupSubscriptionInteractor.kt", l = {DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class GroupSubscriptionInteractor$saveDisplay$3 extends j implements Function1<d<? super Unit>, Object> {
    int label;
    final /* synthetic */ GroupSubscriptionInteractor this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor$saveDisplay$3$1", f = "GroupSubscriptionInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor$saveDisplay$3$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
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
            GroupSubscriptionPrefsStorage groupSubscriptionPrefsStorage;
            GroupSubscriptionPrefsStorage groupSubscriptionPrefsStorage2;
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            AccessToken accessToken = VKID.INSTANCE.getInstance().getAccessToken();
            if (accessToken == null) {
                return Unit.f71690a;
            }
            long userID = accessToken.getUserID();
            groupSubscriptionPrefsStorage = this.this$0.storage;
            LinkedHashSet g10 = e0.g(groupSubscriptionPrefsStorage.getDisplays(userID), new Date());
            groupSubscriptionPrefsStorage2 = this.this$0.storage;
            groupSubscriptionPrefsStorage2.saveDisplays(userID, g10);
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GroupSubscriptionInteractor$saveDisplay$3(GroupSubscriptionInteractor groupSubscriptionInteractor, d<? super GroupSubscriptionInteractor$saveDisplay$3> dVar) {
        super(1, dVar);
        this.this$0 = groupSubscriptionInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(d<?> dVar) {
        return new GroupSubscriptionInteractor$saveDisplay$3(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            C10720e0 c10720e0 = C10720e0.f105451a;
            b bVar = b.f10879b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (C10727i.f(bVar, anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(d<? super Unit> dVar) {
        return ((GroupSubscriptionInteractor$saveDisplay$3) create(dVar)).invokeSuspend(Unit.f71690a);
    }
}
