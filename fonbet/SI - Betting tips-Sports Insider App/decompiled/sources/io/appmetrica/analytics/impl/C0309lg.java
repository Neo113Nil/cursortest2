package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.lg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0309lg {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f14203a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public C0359ng f14204b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14205c;

    /* renamed from: d, reason: collision with root package name */
    public final wo f14206d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f14207e;

    public C0309lg(Context context, wo woVar) {
        this.f14207e = context;
        this.f14206d = woVar;
        this.f14204b = woVar.b();
        this.f14205c = woVar.c();
    }

    public final void a() {
        if (this.f14205c) {
            return;
        }
        Context context = this.f14207e;
        Oa a7 = C0558vg.a(context, C0353na.I.f14324d.a());
        InterfaceC0483sg interfaceC0483sg = (InterfaceC0483sg) new C0129eg(this, new C0558vg(a7), new C0652za(context), new C0583wg(context)).f13695f.getValue();
        try {
            a7.a(interfaceC0483sg);
        } catch (Throwable th2) {
            interfaceC0483sg.a(th2);
        }
    }

    public final synchronized void a(C0409pg c0409pg) {
        this.f14203a.add(c0409pg);
        if (this.f14205c) {
            c0409pg.a(this.f14204b);
        }
    }

    public final synchronized void a(C0359ng c0359ng) {
        Iterator it = this.f14203a.iterator();
        while (it.hasNext()) {
            ((C0409pg) it.next()).a(c0359ng);
        }
    }
}
