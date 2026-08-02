package com.ironsource;

import android.text.TextUtils;
import com.ironsource.C4557t2;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.go9;
import xsna.gq;
import xsna.na8;

/* renamed from: com.ironsource.t2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4557t2 extends Ng {
    private final V0 e;
    private final AbstractC4627x0 f;
    private final C4575u2 g;
    private final Vc h;
    private InterfaceC4593v2 i;

    /* renamed from: com.ironsource.t2$a */
    public static final class a implements InterfaceC4593v2 {
        final /* synthetic */ E b;
        final /* synthetic */ Og c;

        public a(E e, Og og) {
            this.b = e;
            this.c = og;
        }

        @Override // com.ironsource.InterfaceC4593v2
        public void a(final List<C4504q2> list, final Map<String, I> map, final String str, final C4504q2 c4504q2, final JSONObject jSONObject, final JSONObject jSONObject2, final int i, final long j, final int i2, final String str2, final B b) {
            V0 v0 = C4557t2.this.e;
            final C4557t2 c4557t2 = C4557t2.this;
            final E e = this.b;
            final Og og = this.c;
            v0.c(new Runnable() { // from class: xsna.ldz0
                @Override // java.lang.Runnable
                public final void run() {
                    C4557t2.a.a(C4557t2.this, e, og, list, map, str, c4504q2, jSONObject, jSONObject2, i, j, i2, str2, b);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C4557t2 c4557t2, E e, Og og, List list, Map map, String str, C4504q2 c4504q2, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2, B b) {
            c4557t2.i = null;
            c4557t2.a(e, og, list, map, str, c4504q2, jSONObject, jSONObject2, i, j, i2, str2, b);
        }

        @Override // com.ironsource.InterfaceC4593v2
        public void a(final int i, final String str, final int i2, final String str2, final long j, final B b) {
            V0 v0 = C4557t2.this.e;
            final C4557t2 c4557t2 = C4557t2.this;
            final E e = this.b;
            final Og og = this.c;
            v0.c(new Runnable() { // from class: xsna.mdz0
                @Override // java.lang.Runnable
                public final void run() {
                    C4557t2.a.a(C4557t2.this, e, og, i, str, i2, str2, j, b);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C4557t2 c4557t2, E e, Og og, int i, String str, int i2, String str2, long j, B b) {
            c4557t2.i = null;
            c4557t2.a(e, og, i, str, i2, str2, j, b);
        }

        @Override // com.ironsource.InterfaceC4593v2
        public void a(int i, String str) {
            this.c.a(i, str);
        }
    }

    public C4557t2(V0 v0, AbstractC4627x0 abstractC4627x0) {
        super(v0, abstractC4627x0);
        this.e = v0;
        this.f = abstractC4627x0;
        C4575u2 c4575u2 = new C4575u2(v0, abstractC4627x0);
        this.g = c4575u2;
        this.h = c4575u2.b();
    }

    @Override // com.ironsource.Ng
    public Vc a() {
        return this.h;
    }

    @Override // com.ironsource.Ng
    public void a(E e, Og og) {
        a aVar = new a(e, og);
        this.g.a(aVar);
        this.i = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(E e, Og og, List<C4504q2> list, Map<String, I> map, String str, C4504q2 c4504q2, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2, B b) {
        IronLog.INTERNAL.verbose(C4484p0.a(this.e, (String) null, (String) null, 3, (Object) null));
        C4450n2 c4450n2 = new C4450n2(str, jSONObject, c4504q2, i, "");
        if (!TextUtils.isEmpty(str2)) {
            this.e.d().h().a(i2, str2);
        }
        a(jSONObject2);
        Pg a2 = a(list, map, c4450n2, e, b);
        this.e.d().a(new W1(c4450n2));
        this.e.d().b().a(j, na8.a(a2.c(), this.f.v(), ";wtf="));
        this.e.d().b().c(a2.d());
        a(a2, og);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(E e, Og og, int i, String str, int i2, String str2, long j, B b) {
        IronLog.INTERNAL.verbose(C4484p0.a(this.e, gq.b(i, "Auction failed (error ", " - ", str, ")"), (String) null, 2, (Object) null));
        if (b != null) {
            c();
        }
        boolean n = this.f.e().n();
        String a2 = C4217a2.a.a(n);
        C4450n2 c4450n2 = new C4450n2(a2, null, null, i2, str2);
        C4668z5 d = this.e.d();
        d.a(new W1(c4450n2));
        d.b().a(j, i, str);
        if (n) {
            a(e, og, i2, str2, a2);
        } else {
            a(og);
        }
    }

    private final void a(Pg pg, Og og) {
        this.e.g().a(pg);
        og.a(pg);
    }

    private final void a(JSONObject jSONObject) {
        int i;
        try {
            if (jSONObject == null) {
                this.f.b(false);
                IronLog.INTERNAL.verbose(C4484p0.a(this.e, go9.b("loading configuration from auction response is null, using the following: ", this.f.v()), (String) null, 2, (Object) null));
                return;
            }
            try {
                if (jSONObject.has(com.ironsource.mediationsdk.d.x) && (i = jSONObject.getInt(com.ironsource.mediationsdk.d.x)) > 0) {
                    this.f.a(i);
                }
                if (jSONObject.has(com.ironsource.mediationsdk.d.y)) {
                    this.f.a(jSONObject.getBoolean(com.ironsource.mediationsdk.d.y));
                } else if (this.f.b().h() && Kb.u.d().h().l()) {
                    AbstractC4627x0 abstractC4627x0 = this.f;
                    abstractC4627x0.a(Math.max(2, abstractC4627x0.k()));
                }
                this.f.b(jSONObject.optBoolean(com.ironsource.mediationsdk.d.z, false));
                IronLog.INTERNAL.verbose(C4484p0.a(this.e, this.f.v(), (String) null, 2, (Object) null));
            } catch (JSONException e) {
                C4452n4.d().a(e);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("failed to update loading configuration for" + this.f.b().a() + " Error: " + e.getMessage());
                ironLog.verbose(C4484p0.a(this.e, this.f.v(), (String) null, 2, (Object) null));
            }
        } catch (Throwable th) {
            IronLog.INTERNAL.verbose(C4484p0.a(this.e, this.f.v(), (String) null, 2, (Object) null));
            throw th;
        }
    }

    private final void a(E e, Og og, int i, String str, String str2) {
        IronLog.INTERNAL.verbose(C4484p0.a(this.e, "Moving to fallback waterfall", (String) null, 2, (Object) null));
        new Ec(this.e, this.f).a(og, i, str, str2, e);
    }

    private final void a(Og og) {
        og.a(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill");
    }
}
