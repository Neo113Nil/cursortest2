package com.vk.id.logout;

import Sc.r;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.vk.id.VKIDInvalidTokenException;
import com.vk.id.internal.api.VKIDApiService;
import com.vk.id.internal.auth.ServiceCredentials;
import com.vk.id.internal.auth.device.InternalVKIDDeviceIdProvider;
import com.vk.id.internal.concurrent.VKIDCoroutinesDispatchers;
import com.vk.id.logout.VKIDLogoutFail;
import com.vk.id.logout.VKIDLogoutParams;
import com.vk.id.storage.InternalVKIDTokenStorage;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.I;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ8\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/vk/id/logout/VKIDLoggerOut;", "", "Lcom/vk/id/internal/api/VKIDApiService;", "api", "Lcom/vk/id/storage/InternalVKIDTokenStorage;", "tokenStorage", "Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider;", "deviceIdProvider", "Lcom/vk/id/internal/auth/ServiceCredentials;", "serviceCredentials", "Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;", "dispatchers", "<init>", "(Lcom/vk/id/internal/api/VKIDApiService;Lcom/vk/id/storage/InternalVKIDTokenStorage;Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider;Lcom/vk/id/internal/auth/ServiceCredentials;Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;)V", "Lcom/vk/id/logout/VKIDLogoutCallback;", "callback", "", "accessToken", "", "clearTokenStorage", "Lcom/vk/id/logout/VKIDLogoutParams;", "params", "", "logout", "(Lcom/vk/id/logout/VKIDLogoutCallback;Ljava/lang/String;ZLcom/vk/id/logout/VKIDLogoutParams;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/vk/id/internal/api/VKIDApiService;", "Lcom/vk/id/storage/InternalVKIDTokenStorage;", "Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider;", "Lcom/vk/id/internal/auth/ServiceCredentials;", "Lcom/vk/id/internal/concurrent/VKIDCoroutinesDispatchers;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VKIDLoggerOut {

    @NotNull
    private final VKIDApiService api;

    @NotNull
    private final InternalVKIDDeviceIdProvider deviceIdProvider;

    @NotNull
    private final VKIDCoroutinesDispatchers dispatchers;

    @NotNull
    private final ServiceCredentials serviceCredentials;

    @NotNull
    private final InternalVKIDTokenStorage tokenStorage;

    public VKIDLoggerOut(@NotNull VKIDApiService api, @NotNull InternalVKIDTokenStorage tokenStorage, @NotNull InternalVKIDDeviceIdProvider deviceIdProvider, @NotNull ServiceCredentials serviceCredentials, @NotNull VKIDCoroutinesDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(tokenStorage, "tokenStorage");
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        Intrinsics.checkNotNullParameter(serviceCredentials, "serviceCredentials");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.api = api;
        this.tokenStorage = tokenStorage;
        this.deviceIdProvider = deviceIdProvider;
        this.serviceCredentials = serviceCredentials;
        this.dispatchers = dispatchers;
    }

    public static /* synthetic */ Object logout$default(VKIDLoggerOut vKIDLoggerOut, VKIDLogoutCallback vKIDLogoutCallback, String str, boolean z11, VKIDLogoutParams vKIDLogoutParams, d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        boolean z12 = z11;
        if ((i11 & 8) != 0) {
            vKIDLogoutParams = new VKIDLogoutParams.Builder().build();
        }
        return vKIDLoggerOut.logout(vKIDLogoutCallback, str2, z12, vKIDLogoutParams, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object logout(@NotNull VKIDLogoutCallback vKIDLogoutCallback, String str, boolean z11, @NotNull VKIDLogoutParams vKIDLogoutParams, @NotNull d<? super Unit> dVar) {
        VKIDLoggerOut$logout$1 vKIDLoggerOut$logout$1;
        int i11;
        VKIDLogoutCallback vKIDLogoutCallback2;
        boolean z12;
        VKIDLoggerOut vKIDLoggerOut;
        String str2;
        VKIDLogoutCallback vKIDLogoutCallback3;
        boolean z13;
        VKIDLoggerOut vKIDLoggerOut2;
        VKIDLogoutCallback vKIDLogoutCallback4;
        Object f26106a;
        Throwable b11;
        Object obj;
        VKIDLogoutCallback vKIDLogoutCallback5;
        if (dVar instanceof VKIDLoggerOut$logout$1) {
            vKIDLoggerOut$logout$1 = (VKIDLoggerOut$logout$1) dVar;
            int i12 = vKIDLoggerOut$logout$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                vKIDLoggerOut$logout$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = vKIDLoggerOut$logout$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = vKIDLoggerOut$logout$1.label;
                if (i11 != 0) {
                    s.b(obj2);
                    I io2 = this.dispatchers.getIo();
                    VKIDLoggerOut$logout$3 vKIDLoggerOut$logout$3 = new VKIDLoggerOut$logout$3(str, this, null);
                    vKIDLoggerOut$logout$1.L$0 = this;
                    vKIDLogoutCallback2 = vKIDLogoutCallback;
                    vKIDLoggerOut$logout$1.L$1 = vKIDLogoutCallback2;
                    z12 = z11;
                    vKIDLoggerOut$logout$1.Z$0 = z12;
                    vKIDLoggerOut$logout$1.label = 1;
                    obj2 = C10727i.f(io2, vKIDLoggerOut$logout$3, vKIDLoggerOut$logout$1);
                    if (obj2 != aVar) {
                        vKIDLoggerOut = this;
                    }
                    return aVar;
                }
                if (i11 != 1) {
                    if (i11 == 2) {
                        vKIDLogoutCallback4 = (VKIDLogoutCallback) vKIDLoggerOut$logout$1.L$0;
                        s.b(obj2);
                        vKIDLogoutCallback2 = vKIDLogoutCallback4;
                        vKIDLogoutCallback2.onFail(new VKIDLogoutFail.NotAuthenticated("Not authorized, can't logout"));
                        return Unit.f71690a;
                    }
                    if (i11 == 3) {
                        z13 = vKIDLoggerOut$logout$1.Z$0;
                        vKIDLogoutCallback3 = (VKIDLogoutCallback) vKIDLoggerOut$logout$1.L$1;
                        vKIDLoggerOut2 = (VKIDLoggerOut) vKIDLoggerOut$logout$1.L$0;
                        s.b(obj2);
                        f26106a = ((r) obj2).getF26106a();
                        b11 = r.b(f26106a);
                        if (b11 != null) {
                            if (b11 instanceof VKIDInvalidTokenException) {
                                if (z13) {
                                    I io3 = vKIDLoggerOut2.dispatchers.getIo();
                                    VKIDLoggerOut$logout$6$1 vKIDLoggerOut$logout$6$1 = new VKIDLoggerOut$logout$6$1(vKIDLoggerOut2, null);
                                    vKIDLoggerOut$logout$1.L$0 = vKIDLoggerOut2;
                                    vKIDLoggerOut$logout$1.L$1 = vKIDLogoutCallback3;
                                    vKIDLoggerOut$logout$1.L$2 = f26106a;
                                    vKIDLoggerOut$logout$1.Z$0 = z13;
                                    vKIDLoggerOut$logout$1.label = 4;
                                    if (C10727i.f(io3, vKIDLoggerOut$logout$6$1, vKIDLoggerOut$logout$1) != aVar) {
                                        obj = f26106a;
                                        f26106a = obj;
                                    }
                                    return aVar;
                                }
                                vKIDLogoutCallback3.onSuccess();
                            } else {
                                vKIDLogoutCallback3.onFail(new VKIDLogoutFail.FailedApiCall(Nk.a.b("Failed to logout due to ", b11.getMessage()), b11));
                            }
                        }
                        r.Companion companion = r.INSTANCE;
                        if (!(f26106a instanceof r.b)) {
                        }
                        return Unit.f71690a;
                    }
                    if (i11 != 4) {
                        if (i11 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        vKIDLogoutCallback5 = (VKIDLogoutCallback) vKIDLoggerOut$logout$1.L$0;
                        s.b(obj2);
                        vKIDLogoutCallback3 = vKIDLogoutCallback5;
                        vKIDLogoutCallback3.onSuccess();
                        return Unit.f71690a;
                    }
                    z13 = vKIDLoggerOut$logout$1.Z$0;
                    obj = vKIDLoggerOut$logout$1.L$2;
                    vKIDLogoutCallback3 = (VKIDLogoutCallback) vKIDLoggerOut$logout$1.L$1;
                    vKIDLoggerOut2 = (VKIDLoggerOut) vKIDLoggerOut$logout$1.L$0;
                    s.b(obj2);
                    f26106a = obj;
                    vKIDLogoutCallback3.onSuccess();
                    r.Companion companion2 = r.INSTANCE;
                    if (!(f26106a instanceof r.b)) {
                        if (z13) {
                            I io4 = vKIDLoggerOut2.dispatchers.getIo();
                            VKIDLoggerOut$logout$7$1 vKIDLoggerOut$logout$7$1 = new VKIDLoggerOut$logout$7$1(vKIDLoggerOut2, null);
                            vKIDLoggerOut$logout$1.L$0 = vKIDLogoutCallback3;
                            vKIDLoggerOut$logout$1.L$1 = f26106a;
                            vKIDLoggerOut$logout$1.L$2 = null;
                            vKIDLoggerOut$logout$1.label = 5;
                            if (C10727i.f(io4, vKIDLoggerOut$logout$7$1, vKIDLoggerOut$logout$1) != aVar) {
                                vKIDLogoutCallback5 = vKIDLogoutCallback3;
                                vKIDLogoutCallback3 = vKIDLogoutCallback5;
                            }
                            return aVar;
                        }
                        vKIDLogoutCallback3.onSuccess();
                    }
                    return Unit.f71690a;
                }
                boolean z14 = vKIDLoggerOut$logout$1.Z$0;
                VKIDLogoutCallback vKIDLogoutCallback6 = (VKIDLogoutCallback) vKIDLoggerOut$logout$1.L$1;
                VKIDLoggerOut vKIDLoggerOut3 = (VKIDLoggerOut) vKIDLoggerOut$logout$1.L$0;
                s.b(obj2);
                z12 = z14;
                vKIDLoggerOut = vKIDLoggerOut3;
                vKIDLogoutCallback2 = vKIDLogoutCallback6;
                Pair pair = (Pair) obj2;
                str2 = (String) pair.a();
                String str3 = (String) pair.b();
                if (str2 != null) {
                    if (z12) {
                        I io5 = vKIDLoggerOut.dispatchers.getIo();
                        VKIDLoggerOut$logout$4$1 vKIDLoggerOut$logout$4$1 = new VKIDLoggerOut$logout$4$1(vKIDLoggerOut, null);
                        vKIDLoggerOut$logout$1.L$0 = vKIDLogoutCallback2;
                        vKIDLoggerOut$logout$1.L$1 = null;
                        vKIDLoggerOut$logout$1.label = 2;
                        if (C10727i.f(io5, vKIDLoggerOut$logout$4$1, vKIDLoggerOut$logout$1) != aVar) {
                            vKIDLogoutCallback4 = vKIDLogoutCallback2;
                            vKIDLogoutCallback2 = vKIDLogoutCallback4;
                        }
                    }
                    vKIDLogoutCallback2.onFail(new VKIDLogoutFail.NotAuthenticated("Not authorized, can't logout"));
                    return Unit.f71690a;
                }
                String clientID = vKIDLoggerOut.serviceCredentials.getClientID();
                I io6 = vKIDLoggerOut.dispatchers.getIo();
                VKIDLoggerOut$logout$5 vKIDLoggerOut$logout$5 = new VKIDLoggerOut$logout$5(vKIDLoggerOut, str2, clientID, str3, null);
                vKIDLoggerOut$logout$1.L$0 = vKIDLoggerOut;
                vKIDLoggerOut$logout$1.L$1 = vKIDLogoutCallback2;
                vKIDLoggerOut$logout$1.Z$0 = z12;
                vKIDLoggerOut$logout$1.label = 3;
                obj2 = C10727i.f(io6, vKIDLoggerOut$logout$5, vKIDLoggerOut$logout$1);
                if (obj2 != aVar) {
                    vKIDLogoutCallback3 = vKIDLogoutCallback2;
                    z13 = z12;
                    vKIDLoggerOut2 = vKIDLoggerOut;
                    f26106a = ((r) obj2).getF26106a();
                    b11 = r.b(f26106a);
                    if (b11 != null) {
                    }
                    r.Companion companion22 = r.INSTANCE;
                    if (!(f26106a instanceof r.b)) {
                    }
                    return Unit.f71690a;
                }
                return aVar;
            }
        }
        vKIDLoggerOut$logout$1 = new VKIDLoggerOut$logout$1(this, dVar);
        Object obj22 = vKIDLoggerOut$logout$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = vKIDLoggerOut$logout$1.label;
        if (i11 != 0) {
        }
        Pair pair2 = (Pair) obj22;
        str2 = (String) pair2.a();
        String str32 = (String) pair2.b();
        if (str2 != null) {
        }
        return aVar2;
    }
}
