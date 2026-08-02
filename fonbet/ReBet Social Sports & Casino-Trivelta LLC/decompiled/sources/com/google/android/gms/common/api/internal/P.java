package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.internal.InterfaceC3184h;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class P extends W {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f32384b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ X f32385c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(X x10, ArrayList arrayList) {
        super(x10, null);
        this.f32385c = x10;
        this.f32384b = arrayList;
    }

    @Override // com.google.android.gms.common.api.internal.W
    public final void a() {
        C3131g0 c3131g0;
        InterfaceC3184h interfaceC3184h;
        C3131g0 c3131g02;
        X x10 = this.f32385c;
        c3131g0 = x10.f32406a;
        c3131g0.f32515n.f32464p = X.y(x10);
        ArrayList arrayList = this.f32384b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C3117a.f fVar = (C3117a.f) arrayList.get(i10);
            X x11 = this.f32385c;
            interfaceC3184h = x11.f32420o;
            c3131g02 = x11.f32406a;
            fVar.getRemoteService(interfaceC3184h, c3131g02.f32515n.f32464p);
        }
    }
}
