package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;

/* renamed from: com.ironsource.dd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4282dd extends AbstractC4415l3 {
    public static final C4282dd P;

    static {
        C4282dd c4282dd = new C4282dd();
        P = c4282dd;
        c4282dd.H = "outcome";
        c4282dd.G = 0;
        c4282dd.I = IronSourceConstants.PIXEL_EVENT_TYPE;
        c4282dd.e();
    }

    private C4282dd() {
    }

    @Override // com.ironsource.AbstractC4415l3
    public int c(C4632x5 c4632x5) {
        return 1;
    }

    @Override // com.ironsource.AbstractC4415l3
    public void d() {
    }

    @Override // com.ironsource.AbstractC4415l3
    public String e(int i) {
        return "";
    }

    @Override // com.ironsource.AbstractC4415l3
    public boolean g(C4632x5 c4632x5) {
        return false;
    }

    @Override // com.ironsource.AbstractC4415l3
    public boolean h(C4632x5 c4632x5) {
        return false;
    }

    public final void i() {
        new U9().b(ContextProvider.getInstance().getApplicationContext());
        a(new C4632x5(EnumC4650y5.INIT_DEFERRED_DATA, new C4224a9().a()));
    }

    @Override // com.ironsource.AbstractC4415l3
    public boolean j(C4632x5 c4632x5) {
        return false;
    }

    @Override // com.ironsource.AbstractC4415l3
    public boolean d(C4632x5 c4632x5) {
        return true;
    }

    @Override // com.ironsource.AbstractC4415l3
    public void a(ArrayList<C4632x5> arrayList) {
    }

    @Override // com.ironsource.AbstractC4415l3
    public void f(C4632x5 c4632x5) {
    }
}
