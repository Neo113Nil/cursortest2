package com.vk.id.group.subscription.compose.interactor;

import He.b;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.vk.id.AccessToken;
import com.vk.id.VKID;
import com.vk.id.group.subscription.compose.storage.GroupSubscriptionPrefsStorage;
import com.vk.id.groupsubscription.GroupSubscriptionLimit;
import com.vk.id.network.groupsubscription.InternalVKIDGroupSubscriptionApiContract;
import com.vk.id.network.groupsubscription.data.InternalVKIDGroupData;
import com.vk.id.storage.InternalVKIDTokenStorage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0001\u0018\u0000 &2\u00020\u0001:\u0001&BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\u0016H\u0080@¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u001a\u001a\u00020\u0014H\u0080@¢\u0006\u0004\b\u0019\u0010\u0012J\u0010\u0010\u001c\u001a\u00020\u0016H\u0080@¢\u0006\u0004\b\u001b\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u001c\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\"R\u0014\u0010%\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/vk/id/group/subscription/compose/interactor/GroupSubscriptionInteractor;", "", "Lcom/vk/id/network/groupsubscription/InternalVKIDGroupSubscriptionApiContract;", "apiService", "Lcom/vk/id/storage/InternalVKIDTokenStorage;", "tokenStorage", "", "groupId", "Lkotlin/Function0;", "externalAccessTokenProvider", "Lcom/vk/id/group/subscription/compose/storage/GroupSubscriptionPrefsStorage;", "storage", "Lcom/vk/id/groupsubscription/GroupSubscriptionLimit;", "limit", "<init>", "(Lcom/vk/id/network/groupsubscription/InternalVKIDGroupSubscriptionApiContract;Lcom/vk/id/storage/InternalVKIDTokenStorage;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/vk/id/group/subscription/compose/storage/GroupSubscriptionPrefsStorage;Lcom/vk/id/groupsubscription/GroupSubscriptionLimit;)V", "", "passesRemoteLimits", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "passesLocalLimits", "Lcom/vk/id/network/groupsubscription/data/InternalVKIDGroupData;", "getGroup", "", "saveDisplay$group_subscription_compose_release", "saveDisplay", "loadGroup$group_subscription_compose_release", "loadGroup", "subscribeToGroup$group_subscription_compose_release", "subscribeToGroup", "Lcom/vk/id/network/groupsubscription/InternalVKIDGroupSubscriptionApiContract;", "Lcom/vk/id/storage/InternalVKIDTokenStorage;", "Ljava/lang/String;", "Lkotlin/jvm/functions/Function0;", "Lcom/vk/id/group/subscription/compose/storage/GroupSubscriptionPrefsStorage;", "Lcom/vk/id/groupsubscription/GroupSubscriptionLimit;", "getAccessToken", "()Ljava/lang/String;", "accessToken", "Companion", "group-subscription-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class GroupSubscriptionInteractor {

    @NotNull
    private final InternalVKIDGroupSubscriptionApiContract apiService;
    private final Function0<String> externalAccessTokenProvider;

    @NotNull
    private final String groupId;
    private final GroupSubscriptionLimit limit;

    @NotNull
    private final GroupSubscriptionPrefsStorage storage;

    @NotNull
    private final InternalVKIDTokenStorage tokenStorage;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/vk/id/group/subscription/compose/interactor/GroupSubscriptionInteractor$Companion;", "", "<init>", "()V", "IMAGE_NUMBER", "", "group-subscription-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public GroupSubscriptionInteractor(@NotNull InternalVKIDGroupSubscriptionApiContract apiService, @NotNull InternalVKIDTokenStorage tokenStorage, @NotNull String groupId, Function0<String> function0, @NotNull GroupSubscriptionPrefsStorage storage, GroupSubscriptionLimit groupSubscriptionLimit) {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        Intrinsics.checkNotNullParameter(tokenStorage, "tokenStorage");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.apiService = apiService;
        this.tokenStorage = tokenStorage;
        this.groupId = groupId;
        this.externalAccessTokenProvider = function0;
        this.storage = storage;
        this.limit = groupSubscriptionLimit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getAccessToken() {
        String invoke;
        Function0<String> function0 = this.externalAccessTokenProvider;
        if (function0 != null && (invoke = function0.invoke()) != null) {
            return invoke;
        }
        AccessToken currentAccessToken = this.tokenStorage.getCurrentAccessToken();
        if (currentAccessToken != null) {
            return currentAccessToken.getToken();
        }
        throw new NotAuthorizedException();
    }

    private final Object getGroup(d<? super InternalVKIDGroupData> dVar) {
        return C10727i.f(dVar.getContext(), new GroupSubscriptionInteractor$getGroup$2(this, null), dVar);
    }

    private final Object passesLocalLimits(d<? super Boolean> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(b.f10879b, new GroupSubscriptionInteractor$passesLocalLimits$2(this, null), dVar);
    }

    private final Object passesRemoteLimits(d<? super Boolean> dVar) {
        return this.apiService.shouldShowSubscription(getAccessToken(), dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0088, code lost:
    
        if (r8 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        if (r8 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadGroup$group_subscription_compose_release(@NotNull d<? super InternalVKIDGroupData> dVar) {
        GroupSubscriptionInteractor$loadGroup$1 groupSubscriptionInteractor$loadGroup$1;
        Object obj;
        int i11;
        GroupSubscriptionInteractor groupSubscriptionInteractor;
        if (dVar instanceof GroupSubscriptionInteractor$loadGroup$1) {
            groupSubscriptionInteractor$loadGroup$1 = (GroupSubscriptionInteractor$loadGroup$1) dVar;
            int i12 = groupSubscriptionInteractor$loadGroup$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                groupSubscriptionInteractor$loadGroup$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                obj = groupSubscriptionInteractor$loadGroup$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = groupSubscriptionInteractor$loadGroup$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    groupSubscriptionInteractor$loadGroup$1.L$0 = this;
                    groupSubscriptionInteractor$loadGroup$1.label = 1;
                    obj = passesLocalLimits(groupSubscriptionInteractor$loadGroup$1);
                    if (obj != aVar) {
                        groupSubscriptionInteractor = this;
                    }
                }
                if (i11 == 1) {
                    groupSubscriptionInteractor = (GroupSubscriptionInteractor) groupSubscriptionInteractor$loadGroup$1.L$0;
                    s.b(obj);
                } else {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s.b(obj);
                            return obj;
                        }
                        groupSubscriptionInteractor = (GroupSubscriptionInteractor) groupSubscriptionInteractor$loadGroup$1.L$0;
                        s.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                            throw new ServiceAccountException();
                        }
                        groupSubscriptionInteractor$loadGroup$1.L$0 = null;
                        groupSubscriptionInteractor$loadGroup$1.label = 4;
                        Object group = groupSubscriptionInteractor.getGroup(groupSubscriptionInteractor$loadGroup$1);
                        return group == aVar ? aVar : group;
                    }
                    groupSubscriptionInteractor = (GroupSubscriptionInteractor) groupSubscriptionInteractor$loadGroup$1.L$0;
                    s.b(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        throw new RemoteLimitReachedException();
                    }
                    InternalVKIDGroupSubscriptionApiContract internalVKIDGroupSubscriptionApiContract = groupSubscriptionInteractor.apiService;
                    String accessToken = groupSubscriptionInteractor.getAccessToken();
                    groupSubscriptionInteractor$loadGroup$1.L$0 = groupSubscriptionInteractor;
                    groupSubscriptionInteractor$loadGroup$1.label = 3;
                    obj = internalVKIDGroupSubscriptionApiContract.isServiceAccount(accessToken, groupSubscriptionInteractor$loadGroup$1);
                }
                if (((Boolean) obj).booleanValue()) {
                    throw new ClientLimitReachedException();
                }
                groupSubscriptionInteractor$loadGroup$1.L$0 = groupSubscriptionInteractor;
                groupSubscriptionInteractor$loadGroup$1.label = 2;
                obj = groupSubscriptionInteractor.passesRemoteLimits(groupSubscriptionInteractor$loadGroup$1);
            }
        }
        groupSubscriptionInteractor$loadGroup$1 = new GroupSubscriptionInteractor$loadGroup$1(this, dVar);
        obj = groupSubscriptionInteractor$loadGroup$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = groupSubscriptionInteractor$loadGroup$1.label;
        if (i11 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    public final Object saveDisplay$group_subscription_compose_release(@NotNull d<? super Unit> dVar) {
        Object runReportingCrashesSuspend = VKID.INSTANCE.getInstance().getCrashReporter().runReportingCrashesSuspend(new GroupSubscriptionInteractor$saveDisplay$2(null), new GroupSubscriptionInteractor$saveDisplay$3(this, null), dVar);
        return runReportingCrashesSuspend == a.COROUTINE_SUSPENDED ? runReportingCrashesSuspend : Unit.f71690a;
    }

    public final Object subscribeToGroup$group_subscription_compose_release(@NotNull d<? super Unit> dVar) {
        Object subscribeToGroup = this.apiService.subscribeToGroup(getAccessToken(), this.groupId, dVar);
        return subscribeToGroup == a.COROUTINE_SUSPENDED ? subscribeToGroup : Unit.f71690a;
    }
}
