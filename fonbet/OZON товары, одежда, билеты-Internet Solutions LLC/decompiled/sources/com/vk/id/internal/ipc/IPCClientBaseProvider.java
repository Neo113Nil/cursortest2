package com.vk.id.internal.ipc;

import Pf.k;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.Signature;
import android.os.IBinder;
import com.vk.id.internal.ipc.IPCClientBaseProvider;
import com.vk.id.logger.InternalVKIDLog;
import com.vk.id.logger.InternalVKIDLogger;
import java.util.Comparator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b!\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\u000b\u001a\u00020\n\"\u0004\b\u0001\u0010\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0012\u001a\u00020\u00112\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0016\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0004¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b \u0010\u0004R*\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\"0!j\b\u0012\u0004\u0012\u00020\"`#8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010(\u001a\b\u0012\u0004\u0012\u00020\u00140!8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R,\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050*8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\"\u00100\u001a\u00020/8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0014\u00108\u001a\u00020\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Lcom/vk/id/internal/ipc/IPCClientBaseProvider;", "T", "", "<init>", "()V", "Lcom/vk/id/internal/ipc/ConnectionInfo;", "connectionInfo", "", "startTime", "timeout", "", "waitForConnection", "(Lcom/vk/id/internal/ipc/ConnectionInfo;JJ)Z", "calculateActualTimeout", "(JJ)J", "Landroid/os/IBinder;", "service", "", "setProvider", "(Lcom/vk/id/internal/ipc/ConnectionInfo;Landroid/os/IBinder;)V", "Landroid/content/ComponentName;", "component", "getProvider", "(Landroid/content/ComponentName;JJ)Ljava/lang/Object;", "Landroid/content/pm/Signature;", "getSignature", "()Landroid/content/pm/Signature;", "prepareSpecificApp", "(Landroid/content/ComponentName;)Lcom/vk/id/internal/ipc/ConnectionInfo;", "Lcom/vk/id/logger/InternalVKIDLogger;", "logger", "Lcom/vk/id/logger/InternalVKIDLogger;", "getLogger$annotations", "Ljava/util/Comparator;", "", "Lkotlin/Comparator;", "providerComparator", "Ljava/util/Comparator;", "getProviderComparator", "()Ljava/util/Comparator;", "componentComparator", "getComponentComparator", "Ljava/util/concurrent/ConcurrentHashMap;", "connectionsMap", "Ljava/util/concurrent/ConcurrentHashMap;", "getConnectionsMap", "()Ljava/util/concurrent/ConcurrentHashMap;", "Landroid/content/Context;", "appContext", "Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "setAppContext", "(Landroid/content/Context;)V", "getIntentName", "()Ljava/lang/String;", "intentName", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class IPCClientBaseProvider<T> {

    @NotNull
    private final Comparator<ComponentName> componentComparator;

    @NotNull
    private final ConcurrentHashMap<ComponentName, ConnectionInfo<T>> connectionsMap;

    @NotNull
    private final InternalVKIDLogger logger;

    @NotNull
    private final Comparator<String> providerComparator;

    public IPCClientBaseProvider() {
        InternalVKIDLog internalVKIDLog = InternalVKIDLog.INSTANCE;
        Intrinsics.checkNotNullExpressionValue("IPCClientBaseProvider", "getSimpleName(...)");
        this.logger = internalVKIDLog.createLoggerForTag("IPCClientBaseProvider");
        this.providerComparator = new k(1);
        this.componentComparator = new Comparator() { // from class: qa.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int componentComparator$lambda$1;
                componentComparator$lambda$1 = IPCClientBaseProvider.componentComparator$lambda$1(IPCClientBaseProvider.this, (ComponentName) obj, (ComponentName) obj2);
                return componentComparator$lambda$1;
            }
        };
        this.connectionsMap = new ConcurrentHashMap<>();
    }

    private final long calculateActualTimeout(long startTime, long timeout) {
        return Math.max(timeout - (System.currentTimeMillis() - startTime), 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int componentComparator$lambda$1(IPCClientBaseProvider iPCClientBaseProvider, ComponentName componentName, ComponentName componentName2) {
        return iPCClientBaseProvider.providerComparator.compare(componentName != null ? componentName.getPackageName() : null, componentName2 != null ? componentName2.getPackageName() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int providerComparator$lambda$0(String str, String str2) {
        Intrinsics.f(str2);
        return str.compareTo(str2);
    }

    private final <T> boolean waitForConnection(ConnectionInfo<T> connectionInfo, long startTime, long timeout) {
        try {
            return connectionInfo.getLatch().await(calculateActualTimeout(startTime, timeout), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e11) {
            this.logger.error("Interrupted wait for connection", e11);
            return false;
        }
    }

    @NotNull
    public abstract Context getAppContext();

    @NotNull
    protected final ConcurrentHashMap<ComponentName, ConnectionInfo<T>> getConnectionsMap() {
        return this.connectionsMap;
    }

    @NotNull
    public abstract String getIntentName();

    protected final T getProvider(@NotNull ComponentName component, long startTime, long timeout) {
        Intrinsics.checkNotNullParameter(component, "component");
        int i11 = 3;
        T t2 = null;
        while (t2 == null) {
            int i12 = i11 - 1;
            if (i11 <= 0) {
                break;
            }
            ConnectionInfo<T> prepareSpecificApp = prepareSpecificApp(component);
            if (prepareSpecificApp != null) {
                T provider = prepareSpecificApp.getProvider();
                if (provider != null) {
                    return provider;
                }
                long j11 = startTime;
                long j12 = timeout;
                if (!waitForConnection(prepareSpecificApp, j11, j12)) {
                    return null;
                }
                T provider2 = prepareSpecificApp.getProvider();
                if (provider2 == null) {
                    ConnectionInfo<T> connectionInfo = this.connectionsMap.get(component);
                    if (connectionInfo != null) {
                        provider2 = connectionInfo.getProvider();
                    } else {
                        t2 = null;
                        i11 = i12;
                        startTime = j11;
                        timeout = j12;
                    }
                }
                t2 = provider2;
                i11 = i12;
                startTime = j11;
                timeout = j12;
            } else {
                i11 = i12;
            }
        }
        return t2;
    }

    protected final Signature getSignature() {
        Signature[] signatures = getAppContext().getPackageManager().getPackageInfo(getAppContext().getPackageName(), 64).signatures;
        Intrinsics.checkNotNullExpressionValue(signatures, "signatures");
        return (Signature) C7705l.F(signatures);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final ConnectionInfo<T> prepareSpecificApp(@NotNull final ComponentName component) {
        boolean z11;
        Intrinsics.checkNotNullParameter(component, "component");
        final M m11 = new M();
        ConnectionInfo<T> connectionInfo = this.connectionsMap.get(component);
        m11.f71787a = connectionInfo;
        ConnectionInfo<T> connectionInfo2 = connectionInfo;
        if ((connectionInfo2 != null ? connectionInfo2.getProvider() : null) != null) {
            return (ConnectionInfo) m11.f71787a;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        T t2 = m11.f71787a;
        if (t2 == null) {
            T t11 = (T) new ConnectionInfo(countDownLatch, new ServiceConnection(this) { // from class: com.vk.id.internal.ipc.IPCClientBaseProvider$prepareSpecificApp$connection$1
                final /* synthetic */ IPCClientBaseProvider<T> this$0;

                {
                    this.this$0 = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.content.ServiceConnection
                public void onServiceConnected(ComponentName name, IBinder service) {
                    ConnectionInfo connectionInfo3 = (ConnectionInfo) this.this$0.getConnectionsMap().get(component);
                    if (connectionInfo3 != null) {
                        IPCClientBaseProvider<T> iPCClientBaseProvider = this.this$0;
                        M<ConnectionInfo<T>> m12 = m11;
                        synchronized (connectionInfo3.getLock()) {
                            iPCClientBaseProvider.setProvider((ConnectionInfo) m12.f71787a, service);
                            connectionInfo3.setConnectionState(1);
                            connectionInfo3.getLatch().countDown();
                            Unit unit = Unit.f71690a;
                        }
                    }
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName name) {
                    ConnectionInfo connectionInfo3 = (ConnectionInfo) this.this$0.getConnectionsMap().get(component);
                    if (connectionInfo3 != null) {
                        synchronized (connectionInfo3.getLock()) {
                            connectionInfo3.setProvider(null);
                            connectionInfo3.setConnectionState(2);
                            Unit unit = Unit.f71690a;
                        }
                    }
                }
            });
            m11.f71787a = t11;
            this.connectionsMap.put(component, t11);
        } else {
            synchronized (((ConnectionInfo) t2).getLock()) {
                try {
                    if (((ConnectionInfo) m11.f71787a).getConnectionState() != 0 && ((ConnectionInfo) m11.f71787a).getConnectionState() != 1 && ((ConnectionInfo) m11.f71787a).getConnectionState() == 2) {
                        ((ConnectionInfo) m11.f71787a).getLatch().countDown();
                        ((ConnectionInfo) m11.f71787a).setLatch(countDownLatch);
                    }
                    Unit unit = Unit.f71690a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        synchronized (((ConnectionInfo) m11.f71787a).getLock()) {
            z11 = false;
            ((ConnectionInfo) m11.f71787a).setConnectionState(0);
            Unit unit2 = Unit.f71690a;
        }
        Intent component2 = new Intent(getIntentName()).setComponent(component);
        Intrinsics.checkNotNullExpressionValue(component2, "setComponent(...)");
        try {
            z11 = getAppContext().bindService(component2, ((ConnectionInfo) m11.f71787a).getConnection(), 1);
        } catch (Exception e11) {
            this.logger.error("Error while binding to " + component.getPackageName(), e11);
        }
        if (z11) {
            return (ConnectionInfo) m11.f71787a;
        }
        return null;
    }

    public abstract void setProvider(ConnectionInfo<T> connectionInfo, IBinder service);
}
