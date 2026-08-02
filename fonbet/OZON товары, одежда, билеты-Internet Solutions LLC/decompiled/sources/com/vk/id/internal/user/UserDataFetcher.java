package com.vk.id.internal.user;

import Fb.b;
import Je.InterfaceC3394a;
import Je.e;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.vk.id.VKIDUser;
import com.vk.id.VKIDUserKt;
import com.vk.id.internal.auth.ServiceCredentials;
import com.vk.id.internal.concurrent.VKIDCoroutinesDispatchers;
import com.vk.id.internal.ipc.SilentAuthInfoProvider;
import com.vk.id.internal.util.TimeKt;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.I;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\u0011B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0086@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/vk/id/internal/user/UserDataFetcher;", "", "Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;", "dispatchers", "Lcom/vk/id/internal/auth/ServiceCredentials;", "serviceCredentials", "Lcom/vk/id/internal/ipc/SilentAuthInfoProvider;", "vkSilentAuthInfoProvider", "<init>", "(Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;Lcom/vk/id/internal/auth/ServiceCredentials;Lcom/vk/id/internal/ipc/SilentAuthInfoProvider;)V", "Lcom/vk/id/VKIDUser;", "fetchUserData", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;", "Lcom/vk/id/internal/auth/ServiceCredentials;", "Lcom/vk/id/internal/ipc/SilentAuthInfoProvider;", "Companion", "CachedUserWithTimeFetched", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UserDataFetcher {
    private static CachedUserWithTimeFetched cachedUserData;

    @NotNull
    private final VKIDCoroutinesDispatchers dispatchers;

    @NotNull
    private final ServiceCredentials serviceCredentials;

    @NotNull
    private final SilentAuthInfoProvider vkSilentAuthInfoProvider;

    @NotNull
    private static final InterfaceC3394a fetchUserMutex = e.a();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/vk/id/internal/user/UserDataFetcher$CachedUserWithTimeFetched;", "", "Lcom/vk/id/VKIDUser;", "data", "", "timeFetched", "<init>", "(Lcom/vk/id/VKIDUser;J)V", "Lcom/vk/id/VKIDUser;", "getData", "()Lcom/vk/id/VKIDUser;", "J", "getTimeFetched", "()J", "", "isValid", "()Z", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class CachedUserWithTimeFetched {
        private final VKIDUser data;
        private final long timeFetched;

        public CachedUserWithTimeFetched(VKIDUser vKIDUser, long j11) {
            this.data = vKIDUser;
            this.timeFetched = j11;
        }

        public final VKIDUser getData() {
            return this.data;
        }

        public final boolean isValid() {
            return TimeKt.currentTime() - this.timeFetched <= 500;
        }

        public /* synthetic */ CachedUserWithTimeFetched(VKIDUser vKIDUser, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(vKIDUser, (i11 & 2) != 0 ? TimeKt.currentTime() : j11);
        }
    }

    public UserDataFetcher(@NotNull VKIDCoroutinesDispatchers dispatchers, @NotNull ServiceCredentials serviceCredentials, @NotNull SilentAuthInfoProvider vkSilentAuthInfoProvider) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(serviceCredentials, "serviceCredentials");
        Intrinsics.checkNotNullParameter(vkSilentAuthInfoProvider, "vkSilentAuthInfoProvider");
        this.dispatchers = dispatchers;
        this.serviceCredentials = serviceCredentials;
        this.vkSilentAuthInfoProvider = vkSilentAuthInfoProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008f A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002c, B:13:0x008b, B:15:0x008f, B:16:0x0096), top: B:11:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchUserData(@NotNull d<? super VKIDUser> dVar) {
        UserDataFetcher$fetchUserData$1 userDataFetcher$fetchUserData$1;
        a aVar;
        int i11;
        InterfaceC3394a interfaceC3394a;
        UserDataFetcher userDataFetcher;
        InterfaceC3394a interfaceC3394a2;
        CachedUserWithTimeFetched cachedUserWithTimeFetched;
        Object f7;
        try {
            if (dVar instanceof UserDataFetcher$fetchUserData$1) {
                userDataFetcher$fetchUserData$1 = (UserDataFetcher$fetchUserData$1) dVar;
                int i12 = userDataFetcher$fetchUserData$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    userDataFetcher$fetchUserData$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = userDataFetcher$fetchUserData$1.result;
                    aVar = a.COROUTINE_SUSPENDED;
                    i11 = userDataFetcher$fetchUserData$1.label;
                    if (i11 != 0) {
                        s.b(obj);
                        interfaceC3394a = fetchUserMutex;
                        userDataFetcher$fetchUserData$1.L$0 = this;
                        userDataFetcher$fetchUserData$1.L$1 = interfaceC3394a;
                        userDataFetcher$fetchUserData$1.label = 1;
                        if (interfaceC3394a.a(userDataFetcher$fetchUserData$1) != aVar) {
                            userDataFetcher = this;
                        }
                        return aVar;
                    }
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC3394a2 = (InterfaceC3394a) userDataFetcher$fetchUserData$1.L$0;
                        try {
                            s.b(obj);
                            b bVar = (b) obj;
                            VKIDUser vKIDUser = bVar == null ? VKIDUserKt.toVKIDUser(bVar) : null;
                            cachedUserData = new CachedUserWithTimeFetched(vKIDUser, 0L, 2, null);
                            interfaceC3394a2.c(null);
                            return vKIDUser;
                        } catch (Throwable th2) {
                            th = th2;
                            Throwable th3 = th;
                            interfaceC3394a2.c(null);
                            throw th3;
                        }
                    }
                    InterfaceC3394a interfaceC3394a3 = (InterfaceC3394a) userDataFetcher$fetchUserData$1.L$1;
                    userDataFetcher = (UserDataFetcher) userDataFetcher$fetchUserData$1.L$0;
                    s.b(obj);
                    interfaceC3394a = interfaceC3394a3;
                    cachedUserWithTimeFetched = cachedUserData;
                    if (cachedUserWithTimeFetched == null && cachedUserWithTimeFetched.isValid()) {
                        VKIDUser data = cachedUserWithTimeFetched.getData();
                        interfaceC3394a.c(null);
                        return data;
                    }
                    I io2 = userDataFetcher.dispatchers.getIo();
                    UserDataFetcher$fetchUserData$2$info$1 userDataFetcher$fetchUserData$2$info$1 = new UserDataFetcher$fetchUserData$2$info$1(userDataFetcher, null);
                    userDataFetcher$fetchUserData$1.L$0 = interfaceC3394a;
                    userDataFetcher$fetchUserData$1.L$1 = null;
                    userDataFetcher$fetchUserData$1.label = 2;
                    f7 = C10727i.f(io2, userDataFetcher$fetchUserData$2$info$1, userDataFetcher$fetchUserData$1);
                    if (f7 != aVar) {
                        interfaceC3394a2 = interfaceC3394a;
                        obj = f7;
                        b bVar2 = (b) obj;
                        if (bVar2 == null) {
                        }
                        cachedUserData = new CachedUserWithTimeFetched(vKIDUser, 0L, 2, null);
                        interfaceC3394a2.c(null);
                        return vKIDUser;
                    }
                    return aVar;
                }
            }
            cachedUserWithTimeFetched = cachedUserData;
            if (cachedUserWithTimeFetched == null) {
            }
            I io22 = userDataFetcher.dispatchers.getIo();
            UserDataFetcher$fetchUserData$2$info$1 userDataFetcher$fetchUserData$2$info$12 = new UserDataFetcher$fetchUserData$2$info$1(userDataFetcher, null);
            userDataFetcher$fetchUserData$1.L$0 = interfaceC3394a;
            userDataFetcher$fetchUserData$1.L$1 = null;
            userDataFetcher$fetchUserData$1.label = 2;
            f7 = C10727i.f(io22, userDataFetcher$fetchUserData$2$info$12, userDataFetcher$fetchUserData$1);
            if (f7 != aVar) {
            }
            return aVar;
        } catch (Throwable th4) {
            th = th4;
            interfaceC3394a2 = interfaceC3394a;
            Throwable th32 = th;
            interfaceC3394a2.c(null);
            throw th32;
        }
        userDataFetcher$fetchUserData$1 = new UserDataFetcher$fetchUserData$1(this, dVar);
        Object obj2 = userDataFetcher$fetchUserData$1.result;
        aVar = a.COROUTINE_SUSPENDED;
        i11 = userDataFetcher$fetchUserData$1.label;
        if (i11 != 0) {
        }
    }
}
