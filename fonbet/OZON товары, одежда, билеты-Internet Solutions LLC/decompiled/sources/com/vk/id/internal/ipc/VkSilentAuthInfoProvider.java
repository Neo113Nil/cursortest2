package com.vk.id.internal.ipc;

import Fb.InterfaceC3047a;
import Fb.b;
import Fb.c;
import Sc.s;
import Wc.a;
import android.content.Context;
import android.content.pm.Signature;
import android.os.IBinder;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.vk.id.internal.auth.app.SilentAuthInfoUtils;
import com.vk.id.internal.auth.app.SilentAuthProviderData;
import com.vk.id.internal.auth.app.SilentAuthServicesProvider;
import com.vk.id.internal.auth.device.InternalVKIDDeviceIdProvider;
import com.vk.id.logger.InternalVKIDLog;
import com.vk.id.logger.InternalVKIDLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u0000 <2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0002=<B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001d\u001a\u00020\u001c2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0011\u001a\u00020\nH\u0096@¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\"\u0010/\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u00105R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010;\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006>"}, d2 = {"Lcom/vk/id/internal/ipc/VkSilentAuthInfoProvider;", "Lcom/vk/id/internal/ipc/SilentAuthInfoProvider;", "Lcom/vk/id/internal/ipc/IPCClientBaseProvider;", "LFb/a;", "Landroid/content/Context;", "context", "Lcom/vk/id/internal/auth/app/SilentAuthServicesProvider;", "servicesProvider", "Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider;", "deviceIdProvider", "", "defaultTimeout", "<init>", "(Landroid/content/Context;Lcom/vk/id/internal/auth/app/SilentAuthServicesProvider;Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider;J)V", "Lcom/vk/id/internal/auth/app/SilentAuthProviderData;", "component", "startTime", "timeout", "Lcom/vk/id/internal/ipc/VkSilentAuthInfoProvider$SilentAuthResult;", "getSpecificAppSilentAuthInfos", "(Lcom/vk/id/internal/auth/app/SilentAuthProviderData;JJ)Lcom/vk/id/internal/ipc/VkSilentAuthInfoProvider$SilentAuthResult;", "provider", "getInfosFromAidl", "(LFb/a;Lcom/vk/id/internal/auth/app/SilentAuthProviderData;)Lcom/vk/id/internal/ipc/VkSilentAuthInfoProvider$SilentAuthResult;", "Lcom/vk/id/internal/ipc/ConnectionInfo;", "connectionInfo", "Landroid/os/IBinder;", "service", "", "setProvider", "(Lcom/vk/id/internal/ipc/ConnectionInfo;Landroid/os/IBinder;)V", "", "LFb/b;", "getSilentAuthInfos", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "", "appId", "setAppId", "(I)V", "Lcom/vk/id/internal/auth/app/SilentAuthServicesProvider;", "Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider;", "J", "getDefaultTimeout", "()J", "Lcom/vk/id/logger/InternalVKIDLogger;", "logger", "Lcom/vk/id/logger/InternalVKIDLogger;", "appContext", "Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "setAppContext", "(Landroid/content/Context;)V", "I", "", "apiVersion", "Ljava/lang/String;", "getIntentName", "()Ljava/lang/String;", "intentName", "Companion", "SilentAuthResult", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VkSilentAuthInfoProvider extends IPCClientBaseProvider<InterfaceC3047a> implements SilentAuthInfoProvider {
    private String apiVersion;

    @NotNull
    private Context appContext;
    private int appId;
    private final long defaultTimeout;

    @NotNull
    private final InternalVKIDDeviceIdProvider deviceIdProvider;

    @NotNull
    private final InternalVKIDLogger logger;

    @NotNull
    private final SilentAuthServicesProvider servicesProvider;
    public static final int $stable = 8;

    public /* synthetic */ VkSilentAuthInfoProvider(Context context, SilentAuthServicesProvider silentAuthServicesProvider, InternalVKIDDeviceIdProvider internalVKIDDeviceIdProvider, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, silentAuthServicesProvider, internalVKIDDeviceIdProvider, (i11 & 8) != 0 ? TimeUnit.SECONDS.toMillis(30L) : j11);
    }

    private final SilentAuthResult getInfosFromAidl(InterfaceC3047a provider, SilentAuthProviderData component) {
        if (provider == null) {
            return new SilentAuthResult(new NullPointerException("Provider is null"));
        }
        Signature signature = getSignature();
        if (signature == null) {
            return new SilentAuthResult(new NullPointerException("Signature is null"));
        }
        try {
            ArrayList h11 = provider.h(this.appId, getAppContext().getPackageName(), SilentAuthInfoUtils.INSTANCE.calculateDigestBase64(signature), UUID.randomUUID().toString(), this.apiVersion, this.deviceIdProvider.getDeviceId$vkid_release());
            Intrinsics.checkNotNullExpressionValue(h11, "getSilentAuthInfos(...)");
            ArrayList arrayList = new ArrayList(C7714v.z(h11, 10));
            Iterator it = h11.iterator();
            while (it.hasNext()) {
                arrayList.add(new c(b.a((b) it.next(), component.getComponentName().getPackageName(), null, 114687), component.getWeight()));
            }
            return new SilentAuthResult(arrayList);
        } catch (Exception e11) {
            return new SilentAuthResult(e11);
        }
    }

    private final SilentAuthResult getSpecificAppSilentAuthInfos(SilentAuthProviderData component, long startTime, long timeout) {
        return getInfosFromAidl(getProvider(component.getComponentName(), startTime, timeout), component);
    }

    @Override // com.vk.id.internal.ipc.IPCClientBaseProvider
    @NotNull
    public Context getAppContext() {
        return this.appContext;
    }

    @Override // com.vk.id.internal.ipc.SilentAuthInfoProvider
    public long getDefaultTimeout() {
        return this.defaultTimeout;
    }

    @Override // com.vk.id.internal.ipc.IPCClientBaseProvider
    @NotNull
    public String getIntentName() {
        return "com.vk.silentauth.action.GET_INFO";
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068 A[LOOP:0: B:11:0x0062->B:13:0x0068, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008f A[LOOP:1: B:16:0x0089->B:18:0x008f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fb A[LOOP:3: B:31:0x00f5->B:33:0x00fb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.vk.id.internal.ipc.SilentAuthInfoProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getSilentAuthInfos(long j11, @NotNull d<? super List<b>> dVar) {
        VkSilentAuthInfoProvider$getSilentAuthInfos$1 vkSilentAuthInfoProvider$getSilentAuthInfos$1;
        int i11;
        VkSilentAuthInfoProvider vkSilentAuthInfoProvider;
        long j12;
        long j13;
        Iterator it;
        Iterator it2;
        Iterator it3;
        Iterator<T> it4;
        if (dVar instanceof VkSilentAuthInfoProvider$getSilentAuthInfos$1) {
            vkSilentAuthInfoProvider$getSilentAuthInfos$1 = (VkSilentAuthInfoProvider$getSilentAuthInfos$1) dVar;
            int i12 = vkSilentAuthInfoProvider$getSilentAuthInfos$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                vkSilentAuthInfoProvider$getSilentAuthInfos$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = vkSilentAuthInfoProvider$getSilentAuthInfos$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = vkSilentAuthInfoProvider$getSilentAuthInfos$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    if (this.appId == 0) {
                        return K.f71697a;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    SilentAuthServicesProvider silentAuthServicesProvider = this.servicesProvider;
                    vkSilentAuthInfoProvider$getSilentAuthInfos$1.L$0 = this;
                    vkSilentAuthInfoProvider$getSilentAuthInfos$1.J$0 = j11;
                    vkSilentAuthInfoProvider$getSilentAuthInfos$1.J$1 = currentTimeMillis;
                    vkSilentAuthInfoProvider$getSilentAuthInfos$1.label = 1;
                    obj = silentAuthServicesProvider.getSilentAuthServices(vkSilentAuthInfoProvider$getSilentAuthInfos$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                    vkSilentAuthInfoProvider = this;
                    j12 = j11;
                    j13 = currentTimeMillis;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j14 = vkSilentAuthInfoProvider$getSilentAuthInfos$1.J$1;
                    long j15 = vkSilentAuthInfoProvider$getSilentAuthInfos$1.J$0;
                    VkSilentAuthInfoProvider vkSilentAuthInfoProvider2 = (VkSilentAuthInfoProvider) vkSilentAuthInfoProvider$getSilentAuthInfos$1.L$0;
                    s.b(obj);
                    j13 = j14;
                    vkSilentAuthInfoProvider = vkSilentAuthInfoProvider2;
                    j12 = j15;
                }
                Iterable iterable = (Iterable) obj;
                it = iterable.iterator();
                while (it.hasNext()) {
                    vkSilentAuthInfoProvider.prepareSpecificApp(((SilentAuthProviderData) it.next()).getComponentName());
                }
                List list = (List) iterable;
                ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
                it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(vkSilentAuthInfoProvider.getSpecificAppSilentAuthInfos((SilentAuthProviderData) it2.next(), j13, j12));
                }
                VkSilentInfoItemsGrouper vkSilentInfoItemsGrouper = VkSilentInfoItemsGrouper.INSTANCE;
                ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
                it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    SilentAuthResult silentAuthResult = (SilentAuthResult) it3.next();
                    if (silentAuthResult.getException() != null) {
                        vkSilentAuthInfoProvider.logger.error(Nk.a.b("Exception while fetching silent auth info: ", silentAuthResult.getException().getMessage()), silentAuthResult.getException());
                    }
                    arrayList2.add(silentAuthResult.getInfoItems());
                }
                List<c> groupByWeightAndUserHash = vkSilentInfoItemsGrouper.groupByWeightAndUserHash(C7714v.N(arrayList2));
                ArrayList arrayList3 = new ArrayList(C7714v.z(groupByWeightAndUserHash, 10));
                it4 = groupByWeightAndUserHash.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(((c) it4.next()).b());
                }
                return arrayList3;
            }
        }
        vkSilentAuthInfoProvider$getSilentAuthInfos$1 = new VkSilentAuthInfoProvider$getSilentAuthInfos$1(this, dVar);
        Object obj2 = vkSilentAuthInfoProvider$getSilentAuthInfos$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = vkSilentAuthInfoProvider$getSilentAuthInfos$1.label;
        if (i11 != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        List list2 = (List) iterable2;
        ArrayList arrayList4 = new ArrayList(C7714v.z(list2, 10));
        it2 = list2.iterator();
        while (it2.hasNext()) {
        }
        VkSilentInfoItemsGrouper vkSilentInfoItemsGrouper2 = VkSilentInfoItemsGrouper.INSTANCE;
        ArrayList arrayList22 = new ArrayList(C7714v.z(arrayList4, 10));
        it3 = arrayList4.iterator();
        while (it3.hasNext()) {
        }
        List<c> groupByWeightAndUserHash2 = vkSilentInfoItemsGrouper2.groupByWeightAndUserHash(C7714v.N(arrayList22));
        ArrayList arrayList32 = new ArrayList(C7714v.z(groupByWeightAndUserHash2, 10));
        it4 = groupByWeightAndUserHash2.iterator();
        while (it4.hasNext()) {
        }
        return arrayList32;
    }

    @Override // com.vk.id.internal.ipc.SilentAuthInfoProvider
    public void setAppId(int appId) {
        this.appId = appId;
    }

    @Override // com.vk.id.internal.ipc.IPCClientBaseProvider
    public void setProvider(ConnectionInfo<InterfaceC3047a> connectionInfo, IBinder service) {
        if (connectionInfo != null) {
            connectionInfo.setProvider(InterfaceC3047a.AbstractBinderC0194a.H(service));
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\b\u0010\tB\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\nB\u0015\b\u0016\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH×\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH×\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/vk/id/internal/ipc/VkSilentAuthInfoProvider$SilentAuthResult;", "", "", "LFb/c;", "infoItems", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Ljava/util/List;Ljava/lang/Exception;)V", "(Ljava/util/List;)V", "(Ljava/lang/Exception;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getInfoItems", "()Ljava/util/List;", "Ljava/lang/Exception;", "getException", "()Ljava/lang/Exception;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SilentAuthResult {
        private final Exception exception;

        @NotNull
        private final List<c> infoItems;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public SilentAuthResult(@NotNull Exception exception) {
            this(K.f71697a, exception);
            Intrinsics.checkNotNullParameter(exception, "exception");
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SilentAuthResult)) {
                return false;
            }
            SilentAuthResult silentAuthResult = (SilentAuthResult) other;
            return Intrinsics.d(this.infoItems, silentAuthResult.infoItems) && Intrinsics.d(this.exception, silentAuthResult.exception);
        }

        public final Exception getException() {
            return this.exception;
        }

        @NotNull
        public final List<c> getInfoItems() {
            return this.infoItems;
        }

        public int hashCode() {
            int hashCode = this.infoItems.hashCode() * 31;
            Exception exc = this.exception;
            return hashCode + (exc == null ? 0 : exc.hashCode());
        }

        @NotNull
        public String toString() {
            return "SilentAuthResult(infoItems=" + this.infoItems + ", exception=" + this.exception + ")";
        }

        public SilentAuthResult(@NotNull List<c> infoItems, Exception exc) {
            Intrinsics.checkNotNullParameter(infoItems, "infoItems");
            this.infoItems = infoItems;
            this.exception = exc;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public SilentAuthResult(@NotNull List<c> infoItems) {
            this(infoItems, null);
            Intrinsics.checkNotNullParameter(infoItems, "infoItems");
        }
    }

    public VkSilentAuthInfoProvider(@NotNull Context context, @NotNull SilentAuthServicesProvider servicesProvider, @NotNull InternalVKIDDeviceIdProvider deviceIdProvider, long j11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(servicesProvider, "servicesProvider");
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        this.servicesProvider = servicesProvider;
        this.deviceIdProvider = deviceIdProvider;
        this.defaultTimeout = j11;
        InternalVKIDLog internalVKIDLog = InternalVKIDLog.INSTANCE;
        Intrinsics.checkNotNullExpressionValue("VkSilentAuthInfoProvider", "getSimpleName(...)");
        this.logger = internalVKIDLog.createLoggerForTag("VkSilentAuthInfoProvider");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.appContext = applicationContext;
        this.apiVersion = "5.219";
    }
}
