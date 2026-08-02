package com.unity3d.services.core.di;

import com.ironsource.C4227o2;
import com.ironsource.C4435zd;
import com.ironsource.U3;
import defpackage.i3c;
import defpackage.joa;
import defpackage.yhk;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\n\u001a\u00020\t\"\u0006\b\u0000\u0010\u0004\u0018\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\f\u001a\u00020\t\"\u0006\b\u0000\u0010\u0004\u0018\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000bJ+\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u00042\u0006\u0010\r\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0012\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0004\u0018\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0004\u0018\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0013J\u001d\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u0019R$\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR$\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, d2 = {"Lcom/unity3d/services/core/di/ServicesRegistry;", "Lcom/unity3d/services/core/di/IServicesRegistry;", "<init>", "()V", "T", "", "named", "Lkotlin/Function0;", C4227o2.p, "Lcom/unity3d/services/core/di/ServiceKey;", C4435zd.d, "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lcom/unity3d/services/core/di/ServiceKey;", "factory", U3.i.W, "Ljoa;", "", "updateService", "(Lcom/unity3d/services/core/di/ServiceKey;Ljoa;)V", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "Lkotlin/reflect/KClass;", "getService", "(Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/lang/Object;", "getOrNull", "resolveService", "(Lcom/unity3d/services/core/di/ServiceKey;)Ljava/lang/Object;", "resolveServiceOrNull", "Ljava/util/concurrent/ConcurrentHashMap;", "_services", "Ljava/util/concurrent/ConcurrentHashMap;", "", "getServices", "()Ljava/util/Map;", "services", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ServicesRegistry implements IServicesRegistry {

    @NotNull
    private final ConcurrentHashMap<ServiceKey, joa> _services = new ConcurrentHashMap<>();

    public static ServiceKey factory$default(ServicesRegistry servicesRegistry, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        str.getClass();
        function0.getClass();
        Intrinsics.h();
        throw null;
    }

    public static Object get$default(ServicesRegistry servicesRegistry, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        str.getClass();
        Intrinsics.h();
        throw null;
    }

    public static Object getOrNull$default(ServicesRegistry servicesRegistry, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        str.getClass();
        Intrinsics.h();
        throw null;
    }

    public static ServiceKey single$default(ServicesRegistry servicesRegistry, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        str.getClass();
        function0.getClass();
        Intrinsics.h();
        throw null;
    }

    public final <T> ServiceKey factory(String named, Function0<? extends T> instance) {
        named.getClass();
        instance.getClass();
        Intrinsics.h();
        throw null;
    }

    public final <T> T get(String named) {
        named.getClass();
        Intrinsics.h();
        throw null;
    }

    public final <T> T getOrNull(String named) {
        named.getClass();
        Intrinsics.h();
        throw null;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T getService(@NotNull String named, @NotNull KClass<?> instance) {
        named.getClass();
        instance.getClass();
        return (T) resolveService(new ServiceKey(named, instance));
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    @NotNull
    public Map<ServiceKey, joa> getServices() {
        return this._services;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T resolveService(@NotNull ServiceKey key) {
        key.getClass();
        joa joaVar = getServices().get(key);
        if (joaVar != null) {
            return (T) joaVar.getValue();
        }
        yhk.r(key, "No service instance found for ");
        return null;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    @Nullable
    public <T> T resolveServiceOrNull(@NotNull ServiceKey key) {
        key.getClass();
        joa joaVar = getServices().get(key);
        if (joaVar == null) {
            return null;
        }
        return (T) joaVar.getValue();
    }

    public final <T> ServiceKey single(String named, Function0<? extends T> instance) {
        named.getClass();
        instance.getClass();
        Intrinsics.h();
        throw null;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> void updateService(@NotNull ServiceKey key, @NotNull joa instance) {
        key.getClass();
        instance.getClass();
        if (getServices().containsKey(key)) {
            i3c.i(key, "Cannot have multiple identical services: ");
        } else {
            this._services.put(key, instance);
        }
    }
}
