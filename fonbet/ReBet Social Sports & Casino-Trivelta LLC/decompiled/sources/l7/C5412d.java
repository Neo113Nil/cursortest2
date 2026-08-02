package l7;

import A7.n;
import D6.k;
import D6.o;
import H7.e;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import d7.C4014c;
import d7.InterfaceC4012a;
import e7.C4183a;
import e7.InterfaceC4184b;
import f7.C4263a;
import f7.C4264b;
import f7.C4265c;
import f7.C4266d;
import g7.InterfaceC4364a;
import g7.f;
import j7.C5096a;
import j7.C5097b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import k7.C5205b;
import k7.C5209f;
import v7.C6650e;
import v7.InterfaceC6646a;
import v7.InterfaceC6648c;
import z7.AbstractC6940d;

/* renamed from: l7.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5412d implements G7.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.facebook.imagepipeline.animated.impl.b f55649a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f55650b;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f55651c;

    /* renamed from: d, reason: collision with root package name */
    public final K6.b f55652d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC6940d f55653e;

    /* renamed from: f, reason: collision with root package name */
    public final n f55654f;

    /* renamed from: g, reason: collision with root package name */
    public final D6.n f55655g;

    /* renamed from: h, reason: collision with root package name */
    public final D6.n f55656h;

    /* renamed from: i, reason: collision with root package name */
    public final D6.n f55657i;

    /* renamed from: j, reason: collision with root package name */
    public final D6.n f55658j;

    /* renamed from: k, reason: collision with root package name */
    public final D6.n f55659k;

    /* renamed from: l, reason: collision with root package name */
    public final D6.n f55660l;

    /* renamed from: m, reason: collision with root package name */
    public final D6.n f55661m;

    /* renamed from: n, reason: collision with root package name */
    public final D6.n f55662n = o.f2570b;

    public C5412d(com.facebook.imagepipeline.animated.impl.b bVar, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, K6.b bVar2, AbstractC6940d abstractC6940d, n nVar, D6.n nVar2, D6.n nVar3, D6.n nVar4, D6.n nVar5, D6.n nVar6, D6.n nVar7, D6.n nVar8) {
        this.f55649a = bVar;
        this.f55650b = scheduledExecutorService;
        this.f55651c = executorService;
        this.f55652d = bVar2;
        this.f55653e = abstractC6940d;
        this.f55654f = nVar;
        this.f55655g = nVar2;
        this.f55656h = nVar3;
        this.f55657i = nVar4;
        this.f55658j = nVar5;
        this.f55660l = nVar7;
        this.f55659k = nVar6;
        this.f55661m = nVar8;
    }

    @Override // G7.a
    public Drawable a(e eVar) {
        H7.c cVar = (H7.c) eVar;
        InterfaceC6648c Y12 = cVar.Y1();
        InterfaceC4012a e10 = e((C6650e) k.g(cVar.Z1()), Y12 != null ? Y12.g() : null, null);
        return ((Boolean) this.f55662n.get()).booleanValue() ? new C5209f(e10) : new C5205b(e10);
    }

    @Override // G7.a
    public boolean b(e eVar) {
        return eVar instanceof H7.c;
    }

    public final InterfaceC6646a c(C6650e c6650e) {
        InterfaceC6648c d10 = c6650e.d();
        return this.f55649a.a(c6650e, new Rect(0, 0, d10.getWidth(), d10.getHeight()));
    }

    public final com.facebook.imagepipeline.animated.impl.c d(C6650e c6650e) {
        return new com.facebook.imagepipeline.animated.impl.c(new C4263a(c6650e.hashCode(), ((Boolean) this.f55657i.get()).booleanValue()), this.f55654f);
    }

    public final InterfaceC4012a e(C6650e c6650e, Bitmap.Config config, q7.c cVar) {
        InterfaceC4364a interfaceC4364a;
        g7.b bVar;
        InterfaceC6646a c10 = c(c6650e);
        C5096a c5096a = new C5096a(c10);
        InterfaceC4184b f10 = f(c6650e);
        C5097b c5097b = new C5097b(f10, c10, ((Boolean) this.f55658j.get()).booleanValue());
        int intValue = ((Integer) this.f55656h.get()).intValue();
        if (intValue > 0) {
            interfaceC4364a = new g7.d(intValue);
            bVar = g(c5097b, config);
        } else {
            interfaceC4364a = null;
            bVar = null;
        }
        if (((Boolean) this.f55658j.get()).booleanValue()) {
            interfaceC4364a = new f(c6650e.e(), c5096a, c5097b, new i7.k(this.f55653e, ((Integer) this.f55660l.get()).intValue(), ((Integer) this.f55661m.get()).intValue()), ((Boolean) this.f55659k.get()).booleanValue());
        }
        return C4014c.r(new C4183a(this.f55653e, f10, c5096a, c5097b, ((Boolean) this.f55658j.get()).booleanValue(), interfaceC4364a, bVar, null), this.f55652d, this.f55650b);
    }

    public final InterfaceC4184b f(C6650e c6650e) {
        int intValue = ((Integer) this.f55655g.get()).intValue();
        return intValue != 1 ? intValue != 2 ? intValue != 3 ? new C4266d() : new C4265c() : new C4264b(d(c6650e), false) : new C4264b(d(c6650e), true);
    }

    public final g7.b g(e7.c cVar, Bitmap.Config config) {
        AbstractC6940d abstractC6940d = this.f55653e;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        return new g7.c(abstractC6940d, cVar, config, this.f55651c);
    }
}
