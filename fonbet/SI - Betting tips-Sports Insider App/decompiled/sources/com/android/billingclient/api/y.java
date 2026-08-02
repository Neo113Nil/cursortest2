package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public com.google.android.gms.internal.play_billing.d0 f4121a;

    public y a() {
        if (this.f4121a == null) {
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        }
        y yVar = new y();
        yVar.f4121a = this.f4121a;
        return yVar;
    }

    public void b(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Product list cannot be empty.");
        }
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            z zVar = (z) it.next();
            if (!"play_pass_subs".equals(zVar.f4126b)) {
                hashSet.add(zVar.f4126b);
            }
        }
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("All products should be of the same product type.");
        }
        this.f4121a = com.google.android.gms.internal.play_billing.d0.j(arrayList);
    }
}
