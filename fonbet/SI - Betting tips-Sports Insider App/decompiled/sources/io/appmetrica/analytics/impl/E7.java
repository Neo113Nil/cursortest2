package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class E7 implements ServiceComponentsInitializer {

    /* renamed from: a, reason: collision with root package name */
    public final List f12190a = kotlin.collections.u.f("io.appmetrica.analytics.remotepermissions.internal.RemotePermissionsModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudServiceModuleEntryPoint", "io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint", "io.appmetrica.analytics.billing.internal.BillingServiceModuleEntryPoint", "io.appmetrica.analytics.idsync.internal.IdSyncModuleEntryPoint");

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer
    public final void onCreate(@NotNull Context context) {
        Sc sc2 = C0353na.I.f14337s;
        List list = this.f12190a;
        ArrayList arrayList = new ArrayList(kotlin.collections.v.k(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C0423q5((String) it.next()));
        }
        Object[] array = arrayList.toArray(new C0423q5[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        C0423q5[] c0423q5Arr = (C0423q5[]) array;
        Rc[] rcArr = (Rc[]) Arrays.copyOf(c0423q5Arr, c0423q5Arr.length);
        synchronized (sc2) {
            kotlin.collections.z.o(sc2.f12871a, rcArr);
        }
        C0353na.I.f14337s.a(new Ue(context, "io.appmetrica.analytics.modules.ads", "lsm"));
    }
}
