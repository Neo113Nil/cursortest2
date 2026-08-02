package com.facebook.drawee.backends.pipeline;

import B6.i;
import C7.C1055t;
import C7.y;
import D6.n;
import android.content.Context;
import java.util.Set;

/* loaded from: classes2.dex */
public class g implements n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f30388a;

    /* renamed from: b, reason: collision with root package name */
    public final C1055t f30389b;

    /* renamed from: c, reason: collision with root package name */
    public final h f30390c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f30391d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f30392e;

    public g(Context context, b bVar) {
        this(context, y.l(), bVar);
    }

    @Override // D6.n
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public f get() {
        return new f(this.f30388a, this.f30390c, this.f30389b, this.f30391d, this.f30392e).N(null);
    }

    public g(Context context, y yVar, b bVar) {
        this(context, yVar, null, null, bVar);
    }

    public g(Context context, y yVar, Set set, Set set2, b bVar) {
        this.f30388a = context;
        C1055t j10 = yVar.j();
        this.f30389b = j10;
        if (bVar != null && bVar.d() != null) {
            this.f30390c = bVar.d();
        } else {
            this.f30390c = new h();
        }
        this.f30390c.a(context.getResources(), V6.a.b(), yVar.b(context), yVar.q(), i.D0(), j10.q(), bVar != null ? bVar.a() : null, bVar != null ? bVar.b() : null);
        this.f30391d = set;
        this.f30392e = set2;
        if (bVar != null) {
            bVar.c();
        }
    }
}
