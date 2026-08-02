package com.ironsource;

import android.text.TextUtils;
import com.ironsource.C4280r2;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.dmi;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@InterfaceC4307sb
/* renamed from: com.ironsource.r2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4280r2 extends Kg {

    @NotNull
    private final T0 e;

    @NotNull
    private final AbstractC4386x0 f;

    @NotNull
    private final C4298s2 g;

    @NotNull
    private final Uc h;

    @Nullable
    private InterfaceC4316t2 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4280r2(@NotNull T0 t0, @NotNull AbstractC4386x0 abstractC4386x0) {
        super(t0, abstractC4386x0);
        t0.getClass();
        abstractC4386x0.getClass();
        this.e = t0;
        this.f = abstractC4386x0;
        C4298s2 c4298s2 = new C4298s2(t0, abstractC4386x0);
        this.g = c4298s2;
        this.h = c4298s2.b();
    }

    private final void a(JSONObject jSONObject) {
        int i;
        try {
            if (jSONObject == null) {
                this.f.b(false);
                IronLog.INTERNAL.verbose(C4243p0.a(this.e, dmi.q("loading configuration from auction response is null, using the following: ", this.f.v()), (String) null, 2, (Object) null));
                return;
            }
            try {
                if (jSONObject.has(com.ironsource.mediationsdk.d.x) && (i = jSONObject.getInt(com.ironsource.mediationsdk.d.x)) > 0) {
                    this.f.a(i);
                }
                if (jSONObject.has(com.ironsource.mediationsdk.d.y)) {
                    this.f.a(jSONObject.getBoolean(com.ironsource.mediationsdk.d.y));
                } else if (this.f.b().h() && Ib.v.d().h().m()) {
                    AbstractC4386x0 abstractC4386x0 = this.f;
                    abstractC4386x0.a(Math.max(2, abstractC4386x0.k()));
                }
                this.f.b(jSONObject.optBoolean(com.ironsource.mediationsdk.d.z, false));
                IronLog.INTERNAL.verbose(C4243p0.a(this.e, this.f.v(), (String) null, 2, (Object) null));
            } catch (JSONException e) {
                C4157k4.d().a(e);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("failed to update loading configuration for" + this.f.b().a() + " Error: " + e.getMessage());
                ironLog.verbose(C4243p0.a(this.e, this.f.v(), (String) null, 2, (Object) null));
            }
        } catch (Throwable th) {
            IronLog.INTERNAL.verbose(C4243p0.a(this.e, this.f.v(), (String) null, 2, (Object) null));
            throw th;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.r2$a */
    public static final class a implements InterfaceC4316t2 {
        final /* synthetic */ E b;
        final /* synthetic */ Lg c;

        public a(E e, Lg lg) {
            this.b = e;
            this.c = lg;
        }

        @Override // com.ironsource.InterfaceC4316t2
        public void a(@NotNull final List<C4227o2> list, @NotNull final Map<String, I> map, @NotNull final String str, @Nullable final C4227o2 c4227o2, @Nullable final JSONObject jSONObject, @Nullable final JSONObject jSONObject2, final int i, final long j, final int i2, @Nullable final String str2, @Nullable final B b) {
            list.getClass();
            map.getClass();
            str.getClass();
            T0 t0 = C4280r2.this.e;
            final C4280r2 c4280r2 = C4280r2.this;
            final E e = this.b;
            final Lg lg = this.c;
            t0.a(new Runnable() { // from class: yum
                @Override // java.lang.Runnable
                public final void run() {
                    C4280r2.a.a(C4280r2.this, e, lg, list, map, str, c4227o2, jSONObject, jSONObject2, i, j, i2, str2, b);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C4280r2 c4280r2, E e, Lg lg, List list, Map map, String str, C4227o2 c4227o2, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2, B b) {
            c4280r2.getClass();
            e.getClass();
            lg.getClass();
            list.getClass();
            map.getClass();
            str.getClass();
            c4280r2.i = null;
            c4280r2.a(e, lg, list, map, str, c4227o2, jSONObject, jSONObject2, i, j, i2, str2, b);
        }

        @Override // com.ironsource.InterfaceC4316t2
        public void a(final int i, @Nullable final String str, final int i2, @NotNull final String str2, final long j, @Nullable final B b) {
            str2.getClass();
            T0 t0 = C4280r2.this.e;
            final C4280r2 c4280r2 = C4280r2.this;
            final E e = this.b;
            final Lg lg = this.c;
            t0.a(new Runnable() { // from class: xum
                @Override // java.lang.Runnable
                public final void run() {
                    C4280r2.a.a(C4280r2.this, e, lg, i, str, i2, str2, j, b);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C4280r2 c4280r2, E e, Lg lg, int i, String str, int i2, String str2, long j, B b) {
            c4280r2.getClass();
            e.getClass();
            lg.getClass();
            str2.getClass();
            c4280r2.i = null;
            c4280r2.a(e, lg, i, str, i2, str2, j, b);
        }

        @Override // com.ironsource.InterfaceC4316t2
        public void a(int i, @NotNull String str) {
            str.getClass();
            this.c.a(i, str);
        }
    }

    @Override // com.ironsource.Kg
    @NotNull
    public Uc a() {
        return this.h;
    }

    @Override // com.ironsource.Kg
    public void a(@NotNull E e, @NotNull Lg lg) {
        e.getClass();
        lg.getClass();
        a aVar = new a(e, lg);
        this.g.a(aVar);
        this.i = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(E e, Lg lg, List<C4227o2> list, Map<String, I> map, String str, C4227o2 c4227o2, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2, B b) {
        IronLog.INTERNAL.verbose(C4243p0.a(this.e, (String) null, (String) null, 3, (Object) null));
        C4173l2 c4173l2 = new C4173l2(str, jSONObject, c4227o2, i, "");
        if (!TextUtils.isEmpty(str2)) {
            this.e.f().h().a(i2, str2);
        }
        a(jSONObject2);
        Mg a2 = a(list, map, c4173l2, e, b);
        this.e.f().a(new U1(c4173l2));
        this.e.f().b().a(j, this.f.v() + ";wtf=" + a2.c());
        this.e.f().b().c(a2.d());
        a(a2, lg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(E e, Lg lg, int i, String str, int i2, String str2, long j, B b) {
        IronLog.INTERNAL.verbose(C4243p0.a(this.e, com.appsflyer.internal.i.g(i, "Auction failed (error ", " - ", str, ")"), (String) null, 2, (Object) null));
        if (b != null) {
            c();
        }
        boolean n = this.f.e().n();
        String a2 = Y1.a.a(n);
        C4173l2 c4173l2 = new C4173l2(a2, null, null, i2, str2);
        C4391x5 f = this.e.f();
        f.a(new U1(c4173l2));
        f.b().a(j, i, str);
        if (n) {
            a(e, lg, i2, str2, a2);
        } else {
            a(lg);
        }
    }

    private final void a(Mg mg, Lg lg) {
        this.e.h().a(mg);
        lg.a(mg);
    }

    private final void a(E e, Lg lg, int i, String str, String str2) {
        IronLog.INTERNAL.verbose(C4243p0.a(this.e, "Moving to fallback waterfall", (String) null, 2, (Object) null));
        new Dc(this.e, this.f).a(lg, i, str, str2, e);
    }

    private final void a(Lg lg) {
        lg.a(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill");
    }
}
