package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.km5;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@InterfaceC4307sb
/* renamed from: com.ironsource.qd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4274qd implements InterfaceC4291rd, G {

    @NotNull
    private final String a;

    @NotNull
    private final List<String> b;
    private final int c;

    @NotNull
    private final InterfaceC4399xd d;

    @NotNull
    private final T0 e;
    private boolean f;

    @Nullable
    private Function1<? super Boolean, Unit> g;

    @NotNull
    private List<C4088g6> h;
    private int i;
    private int j;

    @Nullable
    private Integer k;
    private boolean l;

    public C4274qd(@NotNull String str, @NotNull List<String> list, int i, @NotNull InterfaceC4399xd interfaceC4399xd, @NotNull T0 t0) {
        str.getClass();
        list.getClass();
        interfaceC4399xd.getClass();
        t0.getClass();
        this.a = str;
        this.b = list;
        this.c = i;
        this.d = interfaceC4399xd;
        this.e = t0;
        this.f = true;
        this.h = km5.a;
    }

    private final void d() {
        if (this.i >= this.h.size()) {
            return;
        }
        this.j++;
        C4088g6 c4088g6 = this.h.get(this.i);
        this.i++;
        c4088g6.a(this);
    }

    @Override // com.ironsource.G
    public void a(@NotNull IronSourceError ironSourceError, @NotNull B b) {
        ironSourceError.getClass();
        b.getClass();
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

    @Override // com.ironsource.G
    public void b(@NotNull B b) {
        b.getClass();
        int a = a(b);
        if (a != -1) {
            this.j--;
            if (this.l) {
                b.c();
            } else {
                a(a);
            }
            b(true);
            return;
        }
        b.c();
        IronLog.INTERNAL.warning("stale load success callback for adUnitId: " + b());
    }

    @Override // com.ironsource.InterfaceC4291rd
    @Nullable
    public C4088g6 c() {
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
            this.e.f().e().a();
        }
        Function1<? super Boolean, Unit> function1 = this.g;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        this.g = null;
    }

    @Override // com.ironsource.InterfaceC4291rd
    @NotNull
    public String b() {
        return this.a;
    }

    @Override // com.ironsource.InterfaceC4291rd
    public void a(@NotNull Function1<? super Boolean, Unit> function1) {
        function1.getClass();
        this.e.f().e().b();
        this.f = false;
        this.g = function1;
        List<C4088g6> a = this.d.a(this.b);
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

    @Override // com.ironsource.InterfaceC4291rd
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
            this.h = km5.a;
            this.k = null;
        }
    }

    private final void a(int i) {
        Integer num = this.k;
        if (num == null) {
            this.e.f().e().c();
            this.k = Integer.valueOf(i);
        } else {
            int min = Math.min(i, num.intValue());
            this.h.get(Math.max(i, num.intValue())).c();
            this.k = Integer.valueOf(min);
        }
    }

    @Override // com.ironsource.InterfaceC4291rd
    public boolean a() {
        return this.f;
    }

    private final int a(B b) {
        Iterator<C4088g6> it = this.h.iterator();
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
