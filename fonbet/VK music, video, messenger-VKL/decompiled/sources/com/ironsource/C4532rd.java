package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.izs;
import xsna.s3q0;

/* renamed from: com.ironsource.rd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4532rd implements InterfaceC4550sd, G {
    private final String a;
    private final List<String> b;
    private final int c;
    private final InterfaceC4658yd d;
    private final V0 e;
    private izs<? super Boolean, s3q0> g;
    private int i;
    private int j;
    private Integer k;
    private boolean l;
    private boolean f = true;
    private List<C4382j6> h = EmptyList.b;

    public C4532rd(String str, List<String> list, int i, InterfaceC4658yd interfaceC4658yd, V0 v0) {
        this.a = str;
        this.b = list;
        this.c = i;
        this.d = interfaceC4658yd;
        this.e = v0;
    }

    private final void d() {
        if (this.i >= this.h.size()) {
            return;
        }
        this.j++;
        C4382j6 c4382j6 = this.h.get(this.i);
        this.i++;
        c4382j6.a(this);
    }

    @Override // com.ironsource.InterfaceC4550sd
    public boolean a() {
        return this.f;
    }

    @Override // com.ironsource.InterfaceC4550sd
    public String b() {
        return this.a;
    }

    @Override // com.ironsource.InterfaceC4550sd
    public C4382j6 c() {
        Integer num = this.k;
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (this.l) {
            return null;
        }
        this.l = true;
        return this.h.get(intValue);
    }

    private final void b(boolean z) {
        if (this.j > 0) {
            return;
        }
        if (!z) {
            this.e.d().e().a();
        }
        izs<? super Boolean, s3q0> izsVar = this.g;
        if (izsVar != null) {
            izsVar.invoke(Boolean.valueOf(z));
        }
        this.g = null;
    }

    @Override // com.ironsource.InterfaceC4550sd
    public void a(izs<? super Boolean, s3q0> izsVar) {
        this.e.d().e().b();
        this.f = false;
        this.g = izsVar;
        List<C4382j6> a = this.d.a(this.b);
        if (a.isEmpty()) {
            b(false);
            return;
        }
        this.h = a;
        int min = Math.min(this.c, a.size());
        for (int i = 0; i < min; i++) {
            d();
        }
    }

    @Override // com.ironsource.G
    public void b(B b) {
        int a = a(b);
        if (a == -1) {
            b.c();
            IronLog.INTERNAL.warning("stale load success callback for adUnitId: " + b());
            return;
        }
        this.j--;
        if (this.l) {
            b.c();
        } else {
            a(a);
            b(true);
        }
    }

    @Override // com.ironsource.InterfaceC4550sd
    public void a(boolean z) {
        if (!this.l) {
            IronLog.INTERNAL.warning("reset before getting instance for adUnitId: " + b());
            return;
        }
        this.l = false;
        this.i = 0;
        this.j = 0;
        this.g = null;
        this.f = z;
        if (z) {
            this.h = EmptyList.b;
            this.k = null;
        }
    }

    private final void a(int i) {
        Integer num = this.k;
        if (num == null) {
            this.e.d().e().c();
            this.k = Integer.valueOf(i);
        } else {
            int min = Math.min(i, num.intValue());
            this.h.get(Math.max(i, num.intValue())).c();
            this.k = Integer.valueOf(min);
        }
    }

    @Override // com.ironsource.G
    public void a(IronSourceError ironSourceError, B b) {
        if (a(b) == -1) {
            IronLog.INTERNAL.warning("stale load failure callback for adUnitId: " + b());
            return;
        }
        this.j--;
        if (this.k != null) {
            b(true);
        } else if (this.i < this.h.size()) {
            d();
        } else {
            b(false);
        }
    }

    private final int a(B b) {
        Iterator<C4382j6> it = this.h.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next() == b) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
