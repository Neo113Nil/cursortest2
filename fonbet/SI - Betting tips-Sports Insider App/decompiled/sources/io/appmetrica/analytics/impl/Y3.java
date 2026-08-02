package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Y3 {

    /* renamed from: c, reason: collision with root package name */
    public H5 f13206c;

    /* renamed from: a, reason: collision with root package name */
    public final X3 f13204a = new X3();

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f13205b = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f13207d = new CopyOnWriteArrayList();

    public static void a(String str, String str2, Throwable th2) {
        Qj qj = AbstractC0387oj.f14425a;
        Map b10 = kotlin.collections.m0.b(new Pair(str, kotlin.collections.m0.b(new Pair(str2, gf.d.b(th2)))));
        qj.getClass();
        qj.a(new Pj("client_module_errors", b10));
    }

    @Nullable
    public final ModuleAdRevenueProcessor b() {
        K5 k52;
        H5 h52 = this.f13206c;
        if (h52 == null || (k52 = ((K3) h52).f12456b) == null) {
            return null;
        }
        return k52.f12465a;
    }

    public final void c() {
        Iterator it = this.f13205b.iterator();
        while (it.hasNext()) {
            ModuleClientEntryPoint moduleClientEntryPoint = (ModuleClientEntryPoint) it.next();
            try {
                moduleClientEntryPoint.onActivated();
            } catch (Throwable th2) {
                a(moduleClientEntryPoint.getIdentifier(), "onActivated", th2);
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13207d;
        CopyOnWriteArrayList copyOnWriteArrayList2 = this.f13205b;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = copyOnWriteArrayList2.iterator();
        while (it2.hasNext()) {
            AdRevenueCollector adRevenueCollector = ((ModuleClientEntryPoint) it2.next()).getAdRevenueCollector();
            if (adRevenueCollector != null) {
                arrayList.add(adRevenueCollector);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (((AdRevenueCollector) next).getEnabled()) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(kotlin.collections.v.k(arrayList2, 10));
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((AdRevenueCollector) it4.next()).getSourceIdentifier());
        }
        Intrinsics.checkNotNullParameter(arrayList3, "<this>");
        copyOnWriteArrayList.addAll(CollectionsKt.W(CollectionsKt.Y(arrayList3)));
    }

    @NotNull
    public final List<String> a() {
        return this.f13207d;
    }

    public final void a(@NotNull ModuleClientEntryPoint<Object> moduleClientEntryPoint) {
        this.f13205b.add(moduleClientEntryPoint);
    }

    public final void a(@NotNull H5 h52) {
        this.f13206c = h52;
        HashSet hashSet = new HashSet();
        Iterator it = this.f13205b.iterator();
        while (it.hasNext()) {
            ModuleClientEntryPoint moduleClientEntryPoint = (ModuleClientEntryPoint) it.next();
            try {
                moduleClientEntryPoint.initClientSide(h52);
            } catch (Throwable th2) {
                a(moduleClientEntryPoint.getIdentifier(), "initClientSide", th2);
                hashSet.add(moduleClientEntryPoint);
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        this.f13205b.removeAll(hashSet);
    }

    public final void a(@Nullable Bundle bundle, @NotNull SdkIdentifiers sdkIdentifiers) {
        if (bundle == null) {
            return;
        }
        Iterator it = this.f13205b.iterator();
        while (it.hasNext()) {
            ModuleClientEntryPoint moduleClientEntryPoint = (ModuleClientEntryPoint) it.next();
            try {
                ServiceConfigExtensionConfiguration serviceConfigExtensionConfiguration = moduleClientEntryPoint.getServiceConfigExtensionConfiguration();
                if (serviceConfigExtensionConfiguration != null) {
                    ServiceConfigUpdateListener serviceConfigUpdateListener = serviceConfigExtensionConfiguration.getServiceConfigUpdateListener();
                    X3 x32 = this.f13204a;
                    String identifier = moduleClientEntryPoint.getIdentifier();
                    x32.getClass();
                    Bundle bundle2 = bundle.getBundle(identifier);
                    W3 w32 = bundle2 != null ? new W3(sdkIdentifiers, serviceConfigExtensionConfiguration.getBundleConverter().fromBundle(bundle2)) : null;
                    if (w32 != null) {
                        serviceConfigUpdateListener.onServiceConfigUpdated(w32);
                    }
                }
            } catch (Throwable th2) {
                a(moduleClientEntryPoint.getIdentifier(), "notifyModulesWithConfig", th2);
            }
        }
    }
}
