package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.rd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2636rd implements InterfaceC2654sd, G {
    private final String a;
    private final List<String> b;
    private final int c;
    private final InterfaceC2762yd d;
    private final V0 e;
    private boolean f;
    private Function1<? super Boolean, Unit> g;
    private List<C2451h6> h;
    private int i;
    private int j;
    private Integer k;
    private boolean l;

    public C2636rd(String adUnitId, List<String> instanceNames, int i, InterfaceC2762yd fetcher, V0 adUnitTools) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(instanceNames, "instanceNames");
        Intrinsics.checkNotNullParameter(fetcher, "fetcher");
        Intrinsics.checkNotNullParameter(adUnitTools, "adUnitTools");
        this.a = adUnitId;
        this.b = instanceNames;
        this.c = i;
        this.d = fetcher;
        this.e = adUnitTools;
        this.f = true;
        this.h = CollectionsKt.emptyList();
    }

    private final void d() {
        this.j++;
        C2451h6 c2451h6 = this.h.get(this.i);
        this.i++;
        c2451h6.a(this);
    }

    @Override // com.ironsource.InterfaceC2654sd
    public boolean a() {
        return this.f;
    }

    @Override // com.ironsource.InterfaceC2654sd
    public String b() {
        return this.a;
    }

    @Override // com.ironsource.InterfaceC2654sd
    public C2451h6 c() {
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
            this.e.e().e().a();
        }
        Function1<? super Boolean, Unit> function1 = this.g;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        this.g = null;
    }

    @Override // com.ironsource.InterfaceC2654sd
    public void a(Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.e.e().e().b();
        this.f = false;
        this.g = callback;
        List<C2451h6> a = this.d.a(this.b);
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
    public void b(B instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        int a = a(instance);
        if (a == -1) {
            instance.c();
            IronLog.INTERNAL.warning("stale load success callback for adUnitId: " + b());
            return;
        }
        this.j--;
        if (this.l) {
            instance.c();
        } else {
            a(a);
            b(true);
        }
    }

    @Override // com.ironsource.InterfaceC2654sd
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
            this.h = CollectionsKt.emptyList();
            this.k = null;
        }
    }

    private final void a(int i) {
        Integer num = this.k;
        if (num == null) {
            this.e.e().e().c();
            this.k = Integer.valueOf(i);
        } else {
            int min = Math.min(i, num.intValue());
            this.h.get(Math.max(i, num.intValue())).c();
            this.k = Integer.valueOf(min);
        }
    }

    @Override // com.ironsource.G
    public void a(IronSourceError error, B instance) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (a(instance) == -1) {
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
        Iterator<C2451h6> it = this.h.iterator();
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
