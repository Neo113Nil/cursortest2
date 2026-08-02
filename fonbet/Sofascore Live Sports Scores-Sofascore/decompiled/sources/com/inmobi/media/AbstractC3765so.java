package com.inmobi.media;

import android.os.Handler;
import android.view.View;
import com.inmobi.media.AbstractC3765so;
import defpackage.joa;
import defpackage.xtl;
import defpackage.xw3;
import defpackage.ypa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.so, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3765so {
    public final WeakHashMap a;
    public final Handler b;
    public final byte c;
    public final InterfaceC3880x9 d;
    public long f;
    public InterfaceC3688po h;
    public final joa i;
    public final joa j;
    public boolean k;
    public final ArrayList e = new ArrayList(50);
    public final AtomicBoolean g = new AtomicBoolean(true);

    public AbstractC3765so(WeakHashMap weakHashMap, Handler handler, byte b, InterfaceC3880x9 interfaceC3880x9) {
        this.a = weakHashMap;
        this.b = handler;
        this.c = b;
        this.d = interfaceC3880x9;
        final int i = 1;
        final int i2 = 0;
        this.i = ypa.b(new Function0(this) { // from class: twm
            public final /* synthetic */ AbstractC3765so b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                AbstractC3765so abstractC3765so = this.b;
                switch (i3) {
                    case 0:
                        return AbstractC3765so.a(abstractC3765so);
                    default:
                        return AbstractC3765so.b(abstractC3765so);
                }
            }
        });
        this.j = ypa.b(new Function0(this) { // from class: twm
            public final /* synthetic */ AbstractC3765so b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                AbstractC3765so abstractC3765so = this.b;
                switch (i3) {
                    case 0:
                        return AbstractC3765so.a(abstractC3765so);
                    default:
                        return AbstractC3765so.b(abstractC3765so);
                }
            }
        });
    }

    public static final void c(AbstractC3765so abstractC3765so) {
        abstractC3765so.b.post((RunnableC3662oo) abstractC3765so.i.getValue());
    }

    public final void a(View view, View view2, View view3, int i) {
        view.getClass();
        view2.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.d;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("VisibilityTracker", "add view to tracker - minPercent - " + i + "  " + this);
        }
        C3714qo c3714qo = (C3714qo) this.a.get(view2);
        if (c3714qo == null) {
            c3714qo = new C3714qo();
            this.a.put(view2, c3714qo);
            this.f++;
        }
        c3714qo.a = i;
        long j = this.f;
        c3714qo.b = j;
        c3714qo.c = view;
        if (j % 50 == 0) {
            long j2 = j - 50;
            for (Map.Entry entry : this.a.entrySet()) {
                View view4 = (View) entry.getKey();
                if (((C3714qo) entry.getValue()).b < j2) {
                    this.e.add(view4);
                }
            }
            Iterator it = this.e.iterator();
            it.getClass();
            while (it.hasNext()) {
                a((View) it.next());
            }
            this.e.clear();
        }
        if (this.a.size() == 1) {
            f();
        }
    }

    public final void b() {
        InterfaceC3880x9 interfaceC3880x9 = this.d;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("VisibilityTracker", "destroy " + this);
        }
        a();
        this.h = null;
        this.g.set(true);
    }

    public abstract int c();

    public abstract void d();

    public final void e() {
        InterfaceC3880x9 interfaceC3880x9 = this.d;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("VisibilityTracker", "pause " + this);
        }
        ((RunnableC3662oo) this.i.getValue()).run();
        this.b.removeCallbacksAndMessages(null);
        this.k = false;
        this.g.set(true);
    }

    public final void f() {
        InterfaceC3880x9 interfaceC3880x9 = this.d;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("VisibilityTracker", "resume " + this);
        }
        this.g.set(false);
        if (this.k || this.g.get()) {
            return;
        }
        this.k = true;
        xw3.L(L9.d, null, null, new C3739ro(this, null), 3);
    }

    public static final Runnable b(AbstractC3765so abstractC3765so) {
        return new xtl(abstractC3765so, 12);
    }

    public static final RunnableC3662oo a(AbstractC3765so abstractC3765so) {
        return new RunnableC3662oo(abstractC3765so, abstractC3765so.g);
    }

    public final void a(View view) {
        view.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.d;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("VisibilityTracker", "removed view from tracker " + this);
        }
        if (((C3714qo) this.a.remove(view)) != null) {
            this.f--;
            if (this.a.isEmpty()) {
                e();
            }
        }
    }

    public final void a() {
        InterfaceC3880x9 interfaceC3880x9 = this.d;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("VisibilityTracker", "clear " + this);
        }
        this.a.clear();
        this.b.removeMessages(0);
        this.k = false;
    }
}
