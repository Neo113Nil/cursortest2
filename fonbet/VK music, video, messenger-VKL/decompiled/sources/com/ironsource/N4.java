package com.ironsource;

import com.ironsource.InterfaceC4509q7;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import xsna.s3q0;

/* loaded from: classes13.dex */
public final class N4 implements InterfaceC4509q7, InterfaceC4509q7.a {
    private final ConcurrentHashMap<String, K4> a = new ConcurrentHashMap<>();

    @Override // com.ironsource.InterfaceC4509q7
    public G3 a(String str) {
        K4 k4 = this.a.get(str);
        return (k4 == null || k4.a()) ? new G3(false, null, 2, null) : new G3(true, I3.Delivery);
    }

    @Override // com.ironsource.InterfaceC4509q7.a
    public Object a(String str, I3 i3, InterfaceC4473o7 interfaceC4473o7) {
        Object a = interfaceC4473o7.a();
        if (!(a instanceof Result.Failure)) {
            K4 k4 = (K4) a;
            if (k4 != null) {
                this.a.put(str, k4);
            }
            return s3q0.a;
        }
        Throwable a2 = Result.a(a);
        if (a2 != null) {
            return new Result.Failure(a2);
        }
        return s3q0.a;
    }

    @Override // com.ironsource.InterfaceC4509q7.a
    public void b(String str) {
    }
}
