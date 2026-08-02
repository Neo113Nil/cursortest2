package com.unity3d.services.core.di;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a!\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function1;", "Lcom/unity3d/services/core/di/ServicesRegistry;", "", "registry", "(Lkotlin/jvm/functions/Function1;)Lcom/unity3d/services/core/di/ServicesRegistry;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ServicesRegistryKt {
    @NotNull
    public static final ServicesRegistry registry(@NotNull Function1<? super ServicesRegistry, Unit> function1) {
        function1.getClass();
        ServicesRegistry servicesRegistry = new ServicesRegistry();
        function1.invoke(servicesRegistry);
        return servicesRegistry;
    }
}
