package io.appmetrica.analytics.billing.impl;

import android.content.Context;
import io.appmetrica.analytics.billing.impl.m;
import io.appmetrica.analytics.billinginterface.internal.BillingType;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor;
import io.appmetrica.analytics.billinginterface.internal.monitor.DummyBillingMonitor;
import io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycleListener;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import java.lang.reflect.Field;
import java.util.concurrent.Executor;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m implements ServiceModuleReporterComponentLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final ServiceContext f11432a;

    /* renamed from: b, reason: collision with root package name */
    public B f11433b;

    /* renamed from: c, reason: collision with root package name */
    public BillingMonitor f11434c;

    public m(@NotNull ServiceContext serviceContext, @Nullable B b10) {
        this.f11432a = serviceContext;
        this.f11433b = b10;
    }

    public final void a(@Nullable B b10) {
        BillingConfig billingConfig;
        BillingMonitor billingMonitor = this.f11434c;
        if (billingMonitor != null) {
            if (b10 != null) {
                A a7 = b10.f11409b;
                billingConfig = new BillingConfig(a7.f11406a, a7.f11407b);
            } else {
                billingConfig = null;
            }
            billingMonitor.onBillingConfigChanged(billingConfig);
        }
        this.f11433b = b10;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0121 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycleListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMainReporterCreated(@NotNull ServiceModuleReporterComponentContext serviceModuleReporterComponentContext) {
        String str;
        BillingMonitor billingLibraryMonitor;
        BillingMonitor billingMonitor;
        Field field;
        if (!serviceModuleReporterComponentContext.getConfig().isRevenueAutoTrackingEnabled()) {
            return;
        }
        Context context = this.f11432a.getContext();
        IHandlerExecutor defaultExecutor = this.f11432a.getExecutorProvider().getDefaultExecutor();
        Executor uiExecutor = this.f11432a.getExecutorProvider().getUiExecutor();
        try {
            Class<?> findClass = ReflectionUtils.findClass("com.android.billingclient.BuildConfig");
            str = (String) ((findClass == null || (field = findClass.getField("VERSION_NAME")) == null) ? null : field.get(null));
        } catch (Throwable unused) {
            str = null;
        }
        BillingType billingType = (str == null || StringsKt.H(str)) ? BillingType.NONE : kotlin.text.z.o(str, "2.", false) ? BillingType.NONE : kotlin.text.z.o(str, "3.", false) ? BillingType.NONE : kotlin.text.z.o(str, "4.", false) ? BillingType.NONE : kotlin.text.z.o(str, "5.", false) ? BillingType.LIBRARY_V6 : kotlin.text.z.o(str, "6.", false) ? BillingType.LIBRARY_V6 : kotlin.text.z.o(str, "7.", false) ? BillingType.LIBRARY_V6 : kotlin.text.z.o(str, "8.", false) ? BillingType.LIBRARY_V8 : BillingType.LIBRARY_V8;
        k kVar = new k(this.f11432a.getServiceStorageProvider().createBinaryStateStorageFactory("auto_inapp_collecting_info_data", new e(), new C0001b(null, 1, null)).create(this.f11432a.getContext()));
        j jVar = new j(serviceModuleReporterComponentContext.getReporter(), this.f11432a.getExecutorProvider().getReportRunnableExecutor(), null, 4, null);
        int i5 = l.f11431a[billingType.ordinal()];
        if (i5 == 1) {
            billingLibraryMonitor = new BillingLibraryMonitor(context, defaultExecutor, uiExecutor, kVar, jVar, null, null, 96, null);
        } else {
            if (i5 != 2) {
                billingMonitor = new DummyBillingMonitor();
                this.f11434c = billingMonitor;
                a(this.f11433b);
                if (this.f11432a.getApplicationStateProvider().registerStickyObserver(new ApplicationStateObserver() { // from class: bf.a
                    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver
                    public final void onApplicationStateChanged(ApplicationState applicationState) {
                        m.a(m.this, applicationState);
                    }
                }) != ApplicationState.VISIBLE) {
                    try {
                        BillingMonitor billingMonitor2 = this.f11434c;
                        if (billingMonitor2 != null) {
                            billingMonitor2.onSessionResumed();
                            return;
                        }
                        return;
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                return;
            }
            billingLibraryMonitor = new io.appmetrica.analytics.billingv8.internal.BillingLibraryMonitor(context, defaultExecutor, uiExecutor, kVar, jVar, null, null, 96, null);
        }
        billingMonitor = billingLibraryMonitor;
        this.f11434c = billingMonitor;
        a(this.f11433b);
        if (this.f11432a.getApplicationStateProvider().registerStickyObserver(new ApplicationStateObserver() { // from class: bf.a
            @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver
            public final void onApplicationStateChanged(ApplicationState applicationState) {
                m.a(m.this, applicationState);
            }
        }) != ApplicationState.VISIBLE) {
        }
    }

    public static final void a(m mVar, ApplicationState applicationState) {
        mVar.getClass();
        if (applicationState == ApplicationState.VISIBLE) {
            try {
                BillingMonitor billingMonitor = mVar.f11434c;
                if (billingMonitor != null) {
                    billingMonitor.onSessionResumed();
                }
            } catch (Throwable unused) {
            }
        }
    }
}
