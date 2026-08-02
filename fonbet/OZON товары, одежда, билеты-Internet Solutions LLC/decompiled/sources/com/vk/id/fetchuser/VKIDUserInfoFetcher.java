package com.vk.id.fetchuser;

import Sc.r;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.vk.id.VKIDUser;
import com.vk.id.internal.api.VKIDApiService;
import com.vk.id.internal.api.dto.VKIDUserInfoPayload;
import com.vk.id.internal.auth.ServiceCredentials;
import com.vk.id.internal.auth.device.InternalVKIDDeviceIdProvider;
import com.vk.id.internal.concurrent.VKIDCoroutinesDispatchers;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.I;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJP\u0010\u0016\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/vk/id/fetchuser/VKIDUserInfoFetcher;", "", "Lcom/vk/id/internal/api/VKIDApiService;", "api", "Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider;", "deviceIdProvider", "Lcom/vk/id/internal/auth/ServiceCredentials;", "serviceCredentials", "Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;", "dispatchers", "<init>", "(Lcom/vk/id/internal/api/VKIDApiService;Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider;Lcom/vk/id/internal/auth/ServiceCredentials;Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;)V", "", "accessToken", "Lkotlin/Function2;", "Lcom/vk/id/VKIDUser;", "Lkotlin/coroutines/d;", "", "onSuccess", "Lkotlin/Function1;", "", "onFailedApiCall", "fetch", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/vk/id/internal/api/VKIDApiService;", "Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider;", "Lcom/vk/id/internal/auth/ServiceCredentials;", "Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VKIDUserInfoFetcher {

    @NotNull
    private final VKIDApiService api;

    @NotNull
    private final InternalVKIDDeviceIdProvider deviceIdProvider;

    @NotNull
    private final VKIDCoroutinesDispatchers dispatchers;

    @NotNull
    private final ServiceCredentials serviceCredentials;

    public VKIDUserInfoFetcher(@NotNull VKIDApiService api, @NotNull InternalVKIDDeviceIdProvider deviceIdProvider, @NotNull ServiceCredentials serviceCredentials, @NotNull VKIDCoroutinesDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        Intrinsics.checkNotNullParameter(serviceCredentials, "serviceCredentials");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.api = api;
        this.deviceIdProvider = deviceIdProvider;
        this.serviceCredentials = serviceCredentials;
        this.dispatchers = dispatchers;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00fe, code lost:
    
        if (r6.invoke(r9, r2) == r3) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetch(@NotNull String str, @NotNull Function2<? super VKIDUser, ? super d<? super Unit>, ? extends Object> function2, @NotNull Function1<? super Throwable, Unit> function1, @NotNull d<? super Unit> dVar) {
        VKIDUserInfoFetcher$fetch$1 vKIDUserInfoFetcher$fetch$1;
        a aVar;
        int i11;
        Function1<? super Throwable, Unit> function12;
        String str2;
        Object obj;
        Function2<? super VKIDUser, ? super d<? super Unit>, ? extends Object> function22;
        String str3;
        VKIDUserInfoFetcher vKIDUserInfoFetcher;
        Object f7;
        Function2<? super VKIDUser, ? super d<? super Unit>, ? extends Object> function23;
        Function1<? super Throwable, Unit> function13;
        Object f26106a;
        Throwable b11;
        if (dVar instanceof VKIDUserInfoFetcher$fetch$1) {
            vKIDUserInfoFetcher$fetch$1 = (VKIDUserInfoFetcher$fetch$1) dVar;
            int i12 = vKIDUserInfoFetcher$fetch$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                vKIDUserInfoFetcher$fetch$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = vKIDUserInfoFetcher$fetch$1.result;
                aVar = a.COROUTINE_SUSPENDED;
                i11 = vKIDUserInfoFetcher$fetch$1.label;
                if (i11 != 0) {
                    s.b(obj2);
                    String clientID = this.serviceCredentials.getClientID();
                    I io2 = this.dispatchers.getIo();
                    VKIDUserInfoFetcher$fetch$deviceId$1 vKIDUserInfoFetcher$fetch$deviceId$1 = new VKIDUserInfoFetcher$fetch$deviceId$1(this, null);
                    vKIDUserInfoFetcher$fetch$1.L$0 = this;
                    vKIDUserInfoFetcher$fetch$1.L$1 = str;
                    vKIDUserInfoFetcher$fetch$1.L$2 = function2;
                    vKIDUserInfoFetcher$fetch$1.L$3 = function1;
                    vKIDUserInfoFetcher$fetch$1.L$4 = clientID;
                    vKIDUserInfoFetcher$fetch$1.label = 1;
                    Object f11 = C10727i.f(io2, vKIDUserInfoFetcher$fetch$deviceId$1, vKIDUserInfoFetcher$fetch$1);
                    if (f11 != aVar) {
                        function12 = function1;
                        str2 = clientID;
                        obj = f11;
                        function22 = function2;
                        str3 = str;
                        vKIDUserInfoFetcher = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj2);
                        return Unit.f71690a;
                    }
                    function13 = (Function1) vKIDUserInfoFetcher$fetch$1.L$1;
                    function23 = (Function2) vKIDUserInfoFetcher$fetch$1.L$0;
                    s.b(obj2);
                    f26106a = ((r) obj2).getF26106a();
                    b11 = r.b(f26106a);
                    if (b11 != null) {
                        function13.invoke(b11);
                    }
                    if (!(f26106a instanceof r.b)) {
                        VKIDUserInfoPayload vKIDUserInfoPayload = (VKIDUserInfoPayload) f26106a;
                        VKIDUser vKIDUser = new VKIDUser(vKIDUserInfoPayload.getFirstName(), vKIDUserInfoPayload.getLastName(), vKIDUserInfoPayload.getPhone(), null, null, vKIDUserInfoPayload.getAvatar(), vKIDUserInfoPayload.getEmail(), 24, null);
                        vKIDUserInfoFetcher$fetch$1.L$0 = f26106a;
                        vKIDUserInfoFetcher$fetch$1.L$1 = null;
                        vKIDUserInfoFetcher$fetch$1.label = 3;
                    }
                    return Unit.f71690a;
                }
                String str4 = (String) vKIDUserInfoFetcher$fetch$1.L$4;
                function12 = (Function1) vKIDUserInfoFetcher$fetch$1.L$3;
                Function2<? super VKIDUser, ? super d<? super Unit>, ? extends Object> function24 = (Function2) vKIDUserInfoFetcher$fetch$1.L$2;
                String str5 = (String) vKIDUserInfoFetcher$fetch$1.L$1;
                VKIDUserInfoFetcher vKIDUserInfoFetcher2 = (VKIDUserInfoFetcher) vKIDUserInfoFetcher$fetch$1.L$0;
                s.b(obj2);
                str3 = str5;
                vKIDUserInfoFetcher = vKIDUserInfoFetcher2;
                str2 = str4;
                obj = obj2;
                function22 = function24;
                String str6 = (String) obj;
                I io3 = vKIDUserInfoFetcher.dispatchers.getIo();
                VKIDUserInfoFetcher$fetch$userInfoResult$1 vKIDUserInfoFetcher$fetch$userInfoResult$1 = new VKIDUserInfoFetcher$fetch$userInfoResult$1(vKIDUserInfoFetcher, str3, str2, str6, null);
                vKIDUserInfoFetcher$fetch$1.L$0 = function22;
                vKIDUserInfoFetcher$fetch$1.L$1 = function12;
                vKIDUserInfoFetcher$fetch$1.L$2 = null;
                vKIDUserInfoFetcher$fetch$1.L$3 = null;
                vKIDUserInfoFetcher$fetch$1.L$4 = null;
                vKIDUserInfoFetcher$fetch$1.label = 2;
                f7 = C10727i.f(io3, vKIDUserInfoFetcher$fetch$userInfoResult$1, vKIDUserInfoFetcher$fetch$1);
                if (f7 != aVar) {
                    function23 = function22;
                    obj2 = f7;
                    function13 = function12;
                    f26106a = ((r) obj2).getF26106a();
                    b11 = r.b(f26106a);
                    if (b11 != null) {
                    }
                    if (!(f26106a instanceof r.b)) {
                    }
                    return Unit.f71690a;
                }
                return aVar;
            }
        }
        vKIDUserInfoFetcher$fetch$1 = new VKIDUserInfoFetcher$fetch$1(this, dVar);
        Object obj22 = vKIDUserInfoFetcher$fetch$1.result;
        aVar = a.COROUTINE_SUSPENDED;
        i11 = vKIDUserInfoFetcher$fetch$1.label;
        if (i11 != 0) {
        }
        String str62 = (String) obj;
        I io32 = vKIDUserInfoFetcher.dispatchers.getIo();
        VKIDUserInfoFetcher$fetch$userInfoResult$1 vKIDUserInfoFetcher$fetch$userInfoResult$12 = new VKIDUserInfoFetcher$fetch$userInfoResult$1(vKIDUserInfoFetcher, str3, str2, str62, null);
        vKIDUserInfoFetcher$fetch$1.L$0 = function22;
        vKIDUserInfoFetcher$fetch$1.L$1 = function12;
        vKIDUserInfoFetcher$fetch$1.L$2 = null;
        vKIDUserInfoFetcher$fetch$1.L$3 = null;
        vKIDUserInfoFetcher$fetch$1.L$4 = null;
        vKIDUserInfoFetcher$fetch$1.label = 2;
        f7 = C10727i.f(io32, vKIDUserInfoFetcher$fetch$userInfoResult$12, vKIDUserInfoFetcher$fetch$1);
        if (f7 != aVar) {
        }
        return aVar;
    }
}
