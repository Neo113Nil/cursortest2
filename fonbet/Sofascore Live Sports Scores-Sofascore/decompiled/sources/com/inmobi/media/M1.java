package com.inmobi.media;

import defpackage.xnf;
import defpackage.xw3;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class M1 implements xnf {
    public final Function0 a;
    public final boolean b;
    public volatile Object c;
    public final AtomicBoolean d;
    public boolean e;

    public M1(Object obj, Function0 function0, boolean z, boolean z2) {
        function0.getClass();
        this.a = function0;
        this.b = z;
        this.c = obj;
        this.d = new AtomicBoolean(false);
        if (z2) {
            a();
        }
    }

    public final void a() {
        if (this.d.compareAndSet(false, true)) {
            this.e = true;
            xw3.L(L9.c, null, null, new L1(this, null), 3);
        }
    }

    @Override // defpackage.xnf
    public final Object getValue(Object obj, KProperty kProperty) {
        kProperty.getClass();
        if (this.b || !this.e) {
            a();
        }
        return this.c;
    }

    public /* synthetic */ M1(Integer num, Function0 function0, int i) {
        this(num, function0, (i & 4) == 0, false);
    }
}
