package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;

/* renamed from: com.ironsource.dd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2386dd extends AbstractC2519l3 {
    public static final C2386dd P;

    static {
        C2386dd c2386dd = new C2386dd();
        P = c2386dd;
        c2386dd.H = "outcome";
        c2386dd.G = 0;
        c2386dd.I = IronSourceConstants.PIXEL_EVENT_TYPE;
        c2386dd.e();
    }

    private C2386dd() {
    }

    @Override // com.ironsource.AbstractC2519l3
    protected void a(ArrayList<C2736x5> arrayList) {
    }

    @Override // com.ironsource.AbstractC2519l3
    protected int c(C2736x5 c2736x5) {
        return 1;
    }

    @Override // com.ironsource.AbstractC2519l3
    protected void d() {
    }

    @Override // com.ironsource.AbstractC2519l3
    protected boolean d(C2736x5 c2736x5) {
        return true;
    }

    @Override // com.ironsource.AbstractC2519l3
    protected String e(int i) {
        return "";
    }

    @Override // com.ironsource.AbstractC2519l3
    protected void f(C2736x5 c2736x5) {
    }

    @Override // com.ironsource.AbstractC2519l3
    protected boolean g(C2736x5 c2736x5) {
        return false;
    }

    @Override // com.ironsource.AbstractC2519l3
    protected boolean h(C2736x5 c2736x5) {
        return false;
    }

    public final void i() {
        new T9().b(ContextProvider.getInstance().getApplicationContext());
        a(new C2736x5(EnumC2754y5.INIT_DEFERRED_DATA, new Z8().a()));
    }

    @Override // com.ironsource.AbstractC2519l3
    protected boolean j(C2736x5 c2736x5) {
        return false;
    }
}
