package com.google.android.gms.common.api.internal;

import android.content.Context;
import ca.InterfaceC2905e;
import com.google.android.gms.common.C3171d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.internal.AbstractC3179c;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
public final class O extends W {

    /* renamed from: b, reason: collision with root package name */
    public final Map f32374b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ X f32375c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(X x10, Map map) {
        super(x10, null);
        this.f32375c = x10;
        this.f32374b = map;
    }

    @Override // com.google.android.gms.common.api.internal.W
    public final void a() {
        C3171d c3171d;
        Context context;
        boolean z10;
        Context context2;
        C3131g0 c3131g0;
        InterfaceC2905e interfaceC2905e;
        InterfaceC2905e interfaceC2905e2;
        C3131g0 c3131g02;
        Context context3;
        boolean z11;
        c3171d = this.f32375c.f32409d;
        com.google.android.gms.common.internal.H h10 = new com.google.android.gms.common.internal.H(c3171d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C3117a.f fVar : this.f32374b.keySet()) {
            if (fVar.requiresGooglePlayServices()) {
                z11 = ((L) this.f32374b.get(fVar)).f32367c;
                if (!z11) {
                    arrayList.add(fVar);
                }
            }
            arrayList2.add(fVar);
        }
        int i10 = 0;
        int i11 = -1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i10 < size) {
                C3117a.f fVar2 = (C3117a.f) arrayList.get(i10);
                context = this.f32375c.f32408c;
                i11 = h10.b(context, fVar2);
                i10++;
                if (i11 != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i10 < size2) {
                C3117a.f fVar3 = (C3117a.f) arrayList2.get(i10);
                context3 = this.f32375c.f32408c;
                i11 = h10.b(context3, fVar3);
                i10++;
                if (i11 == 0) {
                    break;
                }
            }
        }
        if (i11 != 0) {
            ConnectionResult connectionResult = new ConnectionResult(i11, null);
            X x10 = this.f32375c;
            c3131g02 = x10.f32406a;
            c3131g02.p(new M(this, x10, connectionResult));
            return;
        }
        X x11 = this.f32375c;
        z10 = x11.f32418m;
        if (z10) {
            interfaceC2905e = x11.f32416k;
            if (interfaceC2905e != null) {
                interfaceC2905e2 = x11.f32416k;
                interfaceC2905e2.b();
            }
        }
        for (C3117a.f fVar4 : this.f32374b.keySet()) {
            AbstractC3179c.InterfaceC0491c interfaceC0491c = (AbstractC3179c.InterfaceC0491c) this.f32374b.get(fVar4);
            if (fVar4.requiresGooglePlayServices()) {
                context2 = this.f32375c.f32408c;
                if (h10.b(context2, fVar4) != 0) {
                    X x12 = this.f32375c;
                    c3131g0 = x12.f32406a;
                    c3131g0.p(new N(this, x12, interfaceC0491c));
                }
            }
            fVar4.connect(interfaceC0491c);
        }
    }
}
