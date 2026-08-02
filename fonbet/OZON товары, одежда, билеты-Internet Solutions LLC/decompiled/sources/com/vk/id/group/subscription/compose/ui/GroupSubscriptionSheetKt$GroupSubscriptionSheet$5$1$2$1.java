package com.vk.id.group.subscription.compose.ui;

import S0.A1;
import S0.InterfaceC3978p0;
import Sc.s;
import com.vk.id.group.subscription.common.fail.VKIDGroupSubscriptionFail;
import com.vk.id.group.subscription.compose.interactor.ClientLimitReachedException;
import com.vk.id.group.subscription.compose.interactor.GroupSubscriptionInteractor;
import com.vk.id.group.subscription.compose.interactor.RemoteLimitReachedException;
import com.vk.id.group.subscription.compose.interactor.ServiceAccountException;
import com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetStatus;
import com.vk.id.network.groupsubscription.data.InternalVKIDGroupData;
import com.vk.id.network.groupsubscription.exception.InternalVKIDAlreadyGroupMemberException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "com.vk.id.group.subscription.compose.ui.GroupSubscriptionSheetKt$GroupSubscriptionSheet$5$1$2$1", f = "GroupSubscriptionSheet.kt", l = {225}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class GroupSubscriptionSheetKt$GroupSubscriptionSheet$5$1$2$1 extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ GroupSubscriptionInteractor $interactor;
    final /* synthetic */ A1<Function1<VKIDGroupSubscriptionFail, Unit>> $rememberedOnFail$delegate;
    final /* synthetic */ InterfaceC3978p0<Boolean> $showBottomSheet$delegate;
    final /* synthetic */ GroupSubscriptionSheetState $state;
    final /* synthetic */ InterfaceC3978p0<GroupSubscriptionSheetStatus> $status;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    GroupSubscriptionSheetKt$GroupSubscriptionSheet$5$1$2$1(GroupSubscriptionInteractor groupSubscriptionInteractor, GroupSubscriptionSheetState groupSubscriptionSheetState, InterfaceC3978p0<GroupSubscriptionSheetStatus> interfaceC3978p0, InterfaceC3978p0<Boolean> interfaceC3978p02, A1<? extends Function1<? super VKIDGroupSubscriptionFail, Unit>> a12, kotlin.coroutines.d<? super GroupSubscriptionSheetKt$GroupSubscriptionSheet$5$1$2$1> dVar) {
        super(2, dVar);
        this.$interactor = groupSubscriptionInteractor;
        this.$state = groupSubscriptionSheetState;
        this.$status = interfaceC3978p0;
        this.$showBottomSheet$delegate = interfaceC3978p02;
        this.$rememberedOnFail$delegate = a12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new GroupSubscriptionSheetKt$GroupSubscriptionSheet$5$1$2$1(this.$interactor, this.$state, this.$status, this.$showBottomSheet$delegate, this.$rememberedOnFail$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Function1 GroupSubscriptionSheet$lambda$12;
        Function1 GroupSubscriptionSheet$lambda$122;
        Function1 GroupSubscriptionSheet$lambda$123;
        Function1 GroupSubscriptionSheet$lambda$124;
        Function1 GroupSubscriptionSheet$lambda$125;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                GroupSubscriptionInteractor groupSubscriptionInteractor = this.$interactor;
                this.label = 1;
                obj = groupSubscriptionInteractor.loadGroup$group_subscription_compose_release(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            InterfaceC3978p0<GroupSubscriptionSheetStatus> interfaceC3978p0 = this.$status;
            InterfaceC3978p0<Boolean> interfaceC3978p02 = this.$showBottomSheet$delegate;
            InternalVKIDGroupData internalVKIDGroupData = (InternalVKIDGroupData) obj;
            String imageUrl = internalVKIDGroupData.getImageUrl();
            String name = internalVKIDGroupData.getName();
            interfaceC3978p0.setValue(new GroupSubscriptionSheetStatus.Loaded(new GroupSubscriptionSheetStatusData(imageUrl, internalVKIDGroupData.getDescription(), name, internalVKIDGroupData.getUserImageUrls(), internalVKIDGroupData.getSubscriberCount(), internalVKIDGroupData.getFriendsCount(), internalVKIDGroupData.getIsVerified())));
            GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$11(interfaceC3978p02, true);
        } catch (ClientLimitReachedException unused) {
            this.$state.hide();
            GroupSubscriptionSheet$lambda$125 = GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$12(this.$rememberedOnFail$delegate);
            GroupSubscriptionSheet$lambda$125.invoke(new VKIDGroupSubscriptionFail.ClientLimitReached());
            GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$11(this.$showBottomSheet$delegate, false);
        } catch (RemoteLimitReachedException unused2) {
            this.$state.hide();
            GroupSubscriptionSheet$lambda$124 = GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$12(this.$rememberedOnFail$delegate);
            GroupSubscriptionSheet$lambda$124.invoke(new VKIDGroupSubscriptionFail.RemoteLimitReached());
            GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$11(this.$showBottomSheet$delegate, false);
        } catch (ServiceAccountException unused3) {
            this.$state.hide();
            GroupSubscriptionSheet$lambda$123 = GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$12(this.$rememberedOnFail$delegate);
            GroupSubscriptionSheet$lambda$123.invoke(new VKIDGroupSubscriptionFail.ServiceAccount());
            GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$11(this.$showBottomSheet$delegate, false);
        } catch (InternalVKIDAlreadyGroupMemberException unused4) {
            this.$state.hide();
            GroupSubscriptionSheet$lambda$122 = GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$12(this.$rememberedOnFail$delegate);
            GroupSubscriptionSheet$lambda$122.invoke(new VKIDGroupSubscriptionFail.AlreadyGroupMember());
            GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$11(this.$showBottomSheet$delegate, false);
        } catch (Throwable th2) {
            this.$state.hide();
            GroupSubscriptionSheet$lambda$12 = GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$12(this.$rememberedOnFail$delegate);
            GroupSubscriptionSheet$lambda$12.invoke(new VKIDGroupSubscriptionFail.Other(th2));
            GroupSubscriptionSheetKt.GroupSubscriptionSheet$lambda$11(this.$showBottomSheet$delegate, false);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((GroupSubscriptionSheetKt$GroupSubscriptionSheet$5$1$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
