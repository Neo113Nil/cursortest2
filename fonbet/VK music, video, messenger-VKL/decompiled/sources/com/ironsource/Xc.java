package com.ironsource;

import com.ironsource.InterfaceC4509q7;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import xsna.s3q0;

/* loaded from: classes13.dex */
public final class Xc implements InterfaceC4509q7, InterfaceC4509q7.a {
    private final InterfaceC4488p4 a;
    private final J7 b;
    private final Map<String, Wc> c = new LinkedHashMap();

    public Xc(InterfaceC4488p4 interfaceC4488p4, J7 j7) {
        this.a = interfaceC4488p4;
        this.b = j7;
    }

    public final Map<String, Wc> a() {
        return this.c;
    }

    @Override // com.ironsource.InterfaceC4509q7.a
    public void b(String str) {
        if (this.c.get(str) == null) {
            return;
        }
        this.b.a(this.a.a(), str);
    }

    private final boolean a(Wc wc, String str) {
        Long a = this.b.a(str);
        return a != null && this.a.a() - a.longValue() < wc.a();
    }

    @Override // com.ironsource.InterfaceC4509q7
    public G3 a(String str) {
        Wc wc = this.c.get(str);
        if (wc == null) {
            return new G3(false, null, 2, null);
        }
        if (a(wc, str)) {
            return new G3(true, I3.Pacing);
        }
        return new G3(false, null, 2, null);
    }

    @Override // com.ironsource.InterfaceC4509q7.a
    public Object a(String str, I3 i3, InterfaceC4473o7 interfaceC4473o7) {
        Object b = interfaceC4473o7.b();
        if (!(b instanceof Result.Failure)) {
            Wc wc = (Wc) b;
            if (wc != null) {
                this.c.put(str, wc);
            }
            return s3q0.a;
        }
        Throwable a = Result.a(b);
        if (a != null) {
            return new Result.Failure(a);
        }
        return s3q0.a;
    }
}
