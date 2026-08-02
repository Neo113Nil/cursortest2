package io.appmetrica.analytics.adrevenue.admob.v23.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements ModuleAdRevenueProcessor {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f11383a;

    public a(@NonNull b bVar, @NonNull ClientContext clientContext) {
        ArrayList arrayList = new ArrayList();
        this.f11383a = arrayList;
        arrayList.add(new d(bVar, clientContext));
        arrayList.add(new f(bVar, clientContext));
        arrayList.add(new g(bVar, clientContext));
        arrayList.add(new h(bVar, clientContext));
        arrayList.add(new i(bVar, clientContext));
        arrayList.add(new c(bVar, clientContext));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    @NonNull
    public final String getDescription() {
        return "AdMob";
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(Object... objArr) {
        Iterator it = this.f11383a.iterator();
        while (it.hasNext()) {
            if (((ModuleAdRevenueProcessor) it.next()).process(objArr)) {
                return true;
            }
        }
        return false;
    }
}
