package cd;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.k1;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.MyApp;
import com.sports.insider.R;
import com.sports.insider.ui.activities.MainActivity;
import com.sports.insider.ui.pays.VipAccessFragment;
import ec.d0;
import eg.c0;
import eg.m0;
import eg.y;
import eg.z;
import hg.d1;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import la.j1;
import la.w;
import org.json.JSONObject;
import pd.x;
import rc.b0;
import te.l0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3779b;

    /* renamed from: c, reason: collision with root package name */
    public int f3780c;

    /* renamed from: d, reason: collision with root package name */
    public int f3781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3782e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i5, int i10, Object obj, Continuation continuation) {
        super(2, continuation);
        this.f3779b = i10;
        this.f3782e = obj;
        this.f3781d = i5;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f3779b) {
            case 0:
                return new k(this.f3781d, 0, (d) this.f3782e, continuation);
            case 1:
                return new k(this.f3781d, 1, (n) this.f3782e, continuation);
            case 2:
                return new k((fb.b) this.f3782e, this.f3780c, this.f3781d, continuation, 2);
            case 3:
                return new k(this.f3781d, 3, (id.e) this.f3782e, continuation);
            case 4:
                return new k(this.f3781d, 4, (vc.a) this.f3782e, continuation);
            case 5:
                return new k(this.f3781d, 5, (JSONObject) this.f3782e, continuation);
            case 6:
                return new k(this.f3780c, this.f3781d, (w) this.f3782e, continuation);
            case 7:
                return new k((VipAccessFragment) this.f3782e, this.f3780c, this.f3781d, continuation, 7);
            case 8:
                return new k((io.sentry.util.network.b) this.f3782e, continuation, 8);
            case 9:
                return new k(this.f3781d, 9, (oc.a) this.f3782e, continuation);
            case 10:
                return new k((m7.b) this.f3782e, continuation, 10);
            case 11:
                return new k(this.f3781d, (pd.c) this.f3782e, continuation, 11);
            case 12:
                return new k(this.f3781d, 12, (MainActivity) this.f3782e, continuation);
            case 13:
                return new k((pd.t) this.f3782e, continuation, 13);
            case 14:
                return new k(this.f3781d, (x) this.f3782e, continuation, 14);
            case 15:
                return new k((fb.b) this.f3782e, this.f3780c, this.f3781d, continuation, 15);
            case 16:
                return new k(this.f3781d, (l0) this.f3782e, continuation, 16);
            default:
                return new k(this.f3781d, 17, (ue.h) this.f3782e, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f3779b) {
        }
        return ((k) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        FrameLayout frameLayout4;
        int i5;
        Object a7;
        Object c2;
        Object a10;
        int intValue;
        Object f6;
        Object tVar;
        int intValue2;
        Object A;
        Object c8;
        Pair pair;
        Object A2;
        int intValue3;
        Object A3;
        Integer num;
        Object obj2;
        Object obj3;
        int i10 = this.f3779b;
        int i11 = R.drawable.ic_setting;
        int i12 = 3;
        int i13 = 2;
        int i14 = 6;
        boolean z5 = false;
        boolean z7 = false;
        String str5 = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        Object obj4 = this.f3782e;
        final int i15 = 1;
        switch (i10) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i16 = this.f3780c;
                if (i16 == 0) {
                    h8.b.B(obj);
                    JSONObject put = new JSONObject().put("id", this.f3781d);
                    this.f3780c = 1;
                    if (((d) obj4).e("read_news", put, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                int i17 = this.f3780c;
                if (i17 == 0) {
                    h8.b.B(obj);
                    JSONObject put2 = new JSONObject().put("onReLoadPreviewAwaitingResultGame", String.valueOf(this.f3781d));
                    Intrinsics.checkNotNullExpressionValue(put2, "put(...)");
                    this.f3780c = 1;
                    if (((n) obj4).d(put2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                ((Number) f3.x.n0(f3.x.e0().f23426a.f23832a, false, true, new tb.b(this.f3780c, this.f3781d, z5 ? 1 : 0))).intValue();
                return Unit.f19194a;
            case 3:
                id.e eVar = (id.e) obj4;
                lf.a aVar4 = lf.a.f20034a;
                int i18 = this.f3780c;
                if (i18 == 0) {
                    h8.b.B(obj);
                    Context context = eVar.f11149a;
                    ag.u[] uVarArr = id.d.f11147a;
                    Intrinsics.checkNotNullParameter(context, "<this>");
                    c1.i iVar = (c1.i) id.d.f11148b.a(context, id.d.f11147a[0]);
                    androidx.lifecycle.c cVar = new androidx.lifecycle.c(eVar, this.f3781d, (Continuation) null);
                    this.f3780c = 1;
                    if (iVar.h(new g1.b(cVar, null, 1), this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 4:
                lf.a aVar5 = lf.a.f20034a;
                int i19 = this.f3780c;
                if (i19 == 0) {
                    h8.b.B(obj);
                    int i20 = this.f3781d;
                    this.f3780c = 1;
                    s7.t tVar2 = new s7.t(20);
                    lg.e eVar2 = m0.f9201a;
                    if (c0.A(lg.d.f20063c, new androidx.lifecycle.b(i20, 25, tVar2, z10 ? 1 : 0), this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 5:
                JSONObject jSONObject = (JSONObject) obj4;
                Object obj5 = lf.a.f20034a;
                int i21 = this.f3780c;
                if (i21 == 0) {
                    h8.b.B(obj);
                    try {
                        str = jSONObject.getString("body");
                    } catch (Exception unused) {
                        str = null;
                    }
                    try {
                        str2 = jSONObject.getString("buttonText");
                    } catch (Exception unused2) {
                        str2 = null;
                    }
                    try {
                        str3 = jSONObject.getString("buttonUrl");
                    } catch (Exception unused3) {
                        str3 = null;
                    }
                    try {
                        str4 = jSONObject.getString("file");
                    } catch (Exception unused4) {
                        str4 = null;
                    }
                    try {
                        str5 = jSONObject.getString("title");
                    } catch (Exception unused5) {
                    }
                    String str6 = str5;
                    String optString = jSONObject.optString("created_at", "nil");
                    long currentTimeMillis = optString.equals("nil") ? System.currentTimeMillis() / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT : ZonedDateTime.parse(optString, DateTimeFormatter.ISO_DATE_TIME).withZoneSameInstant(ZoneId.systemDefault()).toEpochSecond();
                    bd.j jVar = new bd.j();
                    int i22 = this.f3781d;
                    this.f3780c = 1;
                    lg.e eVar3 = m0.f9201a;
                    Object A4 = c0.A(lg.d.f20063c, new bd.a(i22, jVar, currentTimeMillis, str4, str6, str, str3, str2, null), this);
                    Object obj6 = A4;
                    if (A4 != obj5) {
                        obj6 = Unit.f19194a;
                    }
                    if (obj6 == obj5) {
                        return obj5;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 6:
                lf.a aVar6 = lf.a.f20034a;
                h8.b.B(obj);
                final int i23 = this.f3780c;
                final int i24 = this.f3781d;
                hb.d dVar = fb.b.N0().f10481b;
                final int epochSecond = (int) Instant.now().getEpochSecond();
                k2.w wVar = dVar.f10475a;
                final boolean z16 = z7 ? 1 : 0;
                return new Long(((Number) f3.x.n0(wVar, false, true, new Function1() { // from class: hb.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        s2.c r02;
                        switch (z16) {
                            case 0:
                                int i25 = i23;
                                int i26 = i24;
                                int i27 = epochSecond;
                                s2.a _connection = (s2.a) obj7;
                                Intrinsics.checkNotNullParameter(_connection, "_connection");
                                r02 = _connection.r0("INSERT INTO push_metrics_table (pushId, type, dateCreate) VALUES (?, ?, ?)");
                                try {
                                    r02.f(1, i25);
                                    r02.f(2, i26);
                                    r02.f(3, i27);
                                    r02.n0();
                                    long p10 = io.sentry.config.a.p(_connection);
                                    r02.close();
                                    return Long.valueOf(p10);
                                } finally {
                                }
                            default:
                                int i28 = i23;
                                int i29 = i24;
                                int i30 = epochSecond;
                                s2.a _connection2 = (s2.a) obj7;
                                Intrinsics.checkNotNullParameter(_connection2, "_connection");
                                r02 = _connection2.r0("UPDATE support_table SET stateRead = ?, sendDate = ? WHERE id == ?");
                                try {
                                    r02.f(1, i28);
                                    r02.f(2, i29);
                                    r02.f(3, i30);
                                    r02.n0();
                                    int q = io.sentry.config.a.q(_connection2);
                                    r02.close();
                                    return Integer.valueOf(q);
                                } finally {
                                }
                        }
                    }
                })).longValue());
            case 7:
                lf.a aVar7 = lf.a.f20034a;
                h8.b.B(obj);
                VipAccessFragment vipAccessFragment = (VipAccessFragment) obj4;
                d0 d0Var = (d0) vipAccessFragment.f22459a;
                ViewGroup.LayoutParams layoutParams = (d0Var == null || (frameLayout4 = d0Var.f8921d) == null) ? null : frameLayout4.getLayoutParams();
                androidx.constraintlayout.widget.d dVar2 = layoutParams instanceof androidx.constraintlayout.widget.d ? (androidx.constraintlayout.widget.d) layoutParams : null;
                if (dVar2 != null) {
                    int i25 = this.f3780c;
                    d0 d0Var2 = (d0) vipAccessFragment.f22459a;
                    if (d0Var2 != null && (frameLayout3 = d0Var2.f8921d) != null) {
                        ((ViewGroup.MarginLayoutParams) dVar2).height = i25;
                        frameLayout3.setLayoutParams(dVar2);
                    }
                }
                d0 d0Var3 = (d0) vipAccessFragment.f22459a;
                ViewGroup.LayoutParams layoutParams2 = (d0Var3 == null || (frameLayout2 = d0Var3.j) == null) ? null : frameLayout2.getLayoutParams();
                androidx.constraintlayout.widget.d dVar3 = layoutParams2 instanceof androidx.constraintlayout.widget.d ? (androidx.constraintlayout.widget.d) layoutParams2 : null;
                if (dVar3 == null) {
                    return null;
                }
                int i26 = this.f3781d;
                d0 d0Var4 = (d0) vipAccessFragment.f22459a;
                if (d0Var4 != null && (frameLayout = d0Var4.j) != null) {
                    ((ViewGroup.MarginLayoutParams) dVar3).height = i26;
                    frameLayout.setLayoutParams(dVar3);
                }
                return Unit.f19194a;
            case 8:
                io.sentry.util.network.b bVar = (io.sentry.util.network.b) obj4;
                lf.a aVar8 = lf.a.f20034a;
                int i27 = this.f3781d;
                if (i27 == 0) {
                    h8.b.B(obj);
                    try {
                        fa.a aVar9 = (fa.a) y3.m(fa.a.class, null, 6);
                        aVar9.getClass();
                        Intrinsics.checkNotNullParameter("DEPRECATED_VERSION_CODE", "key");
                        i5 = aVar9.f9542b.getInt("DEPRECATED_VERSION_CODE", 0);
                    } catch (Exception e7) {
                        c4.w wVar2 = zc.a.f25907a;
                        zc.a.a(((y) bVar.f17176b).f9242b, e7);
                        i5 = 0;
                    }
                    md.o oVar = (md.o) bVar.f17177c;
                    this.f3780c = i5;
                    this.f3781d = 1;
                    oVar.getClass();
                    md.o.c().getClass();
                    a7 = za.h.a("rc_version_deprecated", this);
                    if (a7 == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i5 = this.f3780c;
                    h8.b.B(obj);
                    a7 = obj;
                }
                return Boolean.valueOf(Math.max(i5, (int) ((Number) a7).longValue()) > 123);
            case 9:
                oc.a aVar10 = (oc.a) obj4;
                Context context2 = aVar10.f21154a;
                lf.a aVar11 = lf.a.f20034a;
                int i28 = this.f3780c;
                try {
                    if (i28 == 0) {
                        h8.b.B(obj);
                        q4.e eVar4 = new q4.e(context2);
                        eVar4.f21940c = new Integer(this.f3781d);
                        q4.b bVar2 = q4.b.f21930c;
                        eVar4.f21946i = bVar2;
                        eVar4.f21945h = bVar2;
                        eVar4.j = q4.b.f21931d;
                        eVar4.f21950n = new r4.e(ci.c.c(oc.a.a(aVar10), oc.a.a(aVar10)));
                        q4.h a11 = eVar4.a();
                        c4.o a12 = c4.y.a(context2);
                        this.f3780c = 1;
                        c2 = ((c4.v) a12).c(a11, this);
                        if (c2 == aVar11) {
                            return aVar11;
                        }
                    } else {
                        if (i28 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        c2 = obj;
                    }
                    c4.m image = ((q4.k) c2).getImage();
                    if (image == null) {
                        return null;
                    }
                    Resources resources = context2.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    Drawable b10 = c4.p.b(image, resources);
                    if (b10 != null) {
                        return y3.A(b10, 0, 0, 7);
                    }
                    return null;
                } catch (Exception unused6) {
                    return null;
                }
            case 10:
                lf.a aVar12 = lf.a.f20034a;
                int i29 = this.f3781d;
                int i30 = 16;
                try {
                } catch (Exception e9) {
                    zc.d.b(4, "WorkerTestPush", e9);
                    s7.s sVar = new s7.s(i30);
                    this.f3781d = 4;
                    if (sVar.f(this) == aVar12) {
                        return aVar12;
                    }
                }
                if (i29 == 0) {
                    h8.b.B(obj);
                    j1 j1Var = (j1) y3.m(j1.class, null, 6);
                    this.f3781d = 1;
                    a10 = j1Var.a(this);
                    if (a10 == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i29 != 1) {
                        if (i29 != 2) {
                            if (i29 == 3) {
                                h8.b.B(obj);
                                tVar = new e3.u();
                                return tVar;
                            }
                            if (i29 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj);
                            return new e3.t();
                        }
                        intValue = this.f3780c;
                        h8.b.B(obj);
                        f6 = obj;
                        intValue2 = ((Number) f6).intValue();
                        if (200 <= intValue2 || intValue2 >= 300) {
                            tVar = new e3.s();
                            return tVar;
                        }
                        j1 j1Var2 = (j1) y3.m(j1.class, null, 6);
                        this.f3780c = intValue;
                        this.f3781d = 3;
                        if (j1Var2.a(this) == aVar12) {
                            return aVar12;
                        }
                        tVar = new e3.u();
                        return tVar;
                    }
                    h8.b.B(obj);
                    a10 = obj;
                }
                intValue = ((Number) a10).intValue();
                if (200 > intValue || intValue >= 300) {
                    if (intValue != 401 && intValue != 418) {
                        tVar = (500 > intValue || intValue >= 600) ? new e3.t() : new e3.t();
                    }
                    s7.s sVar2 = new s7.s(i30);
                    this.f3780c = intValue;
                    this.f3781d = 2;
                    f6 = sVar2.f(this);
                    if (f6 == aVar12) {
                        return aVar12;
                    }
                    intValue2 = ((Number) f6).intValue();
                    if (200 <= intValue2) {
                    }
                    tVar = new e3.s();
                } else {
                    tVar = new e3.u();
                }
                return tVar;
            case 11:
                int i31 = this.f3781d;
                lf.a aVar13 = lf.a.f20034a;
                int i32 = this.f3780c;
                if (i32 == 0) {
                    h8.b.B(obj);
                    int i33 = R.drawable.ic_apps;
                    if (i31 != R.drawable.ic_apps) {
                        i33 = R.drawable.ic_archive;
                        if (i31 != R.drawable.ic_archive) {
                            i33 = R.drawable.ic_tarif;
                            if (i31 != R.drawable.ic_tarif) {
                                i33 = R.drawable.ic_support;
                                if (i31 != R.drawable.ic_support) {
                                    if (i31 != R.drawable.ic_setting) {
                                        i11 = R.drawable.ic_bonus;
                                        if (i31 != R.drawable.ic_bonus) {
                                            if (i31 == R.drawable.ic_monetization) {
                                                i11 = R.drawable.ic_monetization;
                                            } else {
                                                i11 = R.drawable.ic_si_academy;
                                                if (i31 != R.drawable.ic_si_academy) {
                                                    i11 = R.drawable.ic_live;
                                                    if (i31 != R.drawable.ic_live) {
                                                        i11 = R.drawable.ic_category201;
                                                        if (i31 != R.drawable.ic_category201) {
                                                            i11 = R.drawable.ic_news;
                                                            if (i31 != R.drawable.ic_news) {
                                                                i11 = R.drawable.ic_faq;
                                                                if (i31 != R.drawable.ic_faq) {
                                                                    return Unit.f19194a;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    Integer num2 = new Integer(i11);
                                    this.f3780c = 1;
                                    oc.a aVar14 = (oc.a) y3.m(oc.a.class, null, 6);
                                    int intValue4 = num2.intValue();
                                    aVar14.getClass();
                                    lg.e eVar5 = m0.f9201a;
                                    A = c0.A(lg.d.f20063c, new k(intValue4, 9, (Object) aVar14, (Continuation) (z11 ? 1 : 0)), this);
                                    if (A == aVar13) {
                                        return aVar13;
                                    }
                                }
                            }
                        }
                    }
                    i11 = i33;
                    Integer num22 = new Integer(i11);
                    this.f3780c = 1;
                    oc.a aVar142 = (oc.a) y3.m(oc.a.class, null, 6);
                    int intValue42 = num22.intValue();
                    aVar142.getClass();
                    lg.e eVar52 = m0.f9201a;
                    A = c0.A(lg.d.f20063c, new k(intValue42, 9, (Object) aVar142, (Continuation) (z11 ? 1 : 0)), this);
                    if (A == aVar13) {
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    A = obj;
                }
                Bitmap bitmap = (Bitmap) A;
                if (bitmap != null) {
                    pd.c cVar2 = (pd.c) obj4;
                    pd.b bVar3 = cVar2.f21735f;
                    bVar3.put(new Integer(i31), bitmap);
                    cVar2.f21734e.j(CollectionsKt.W(bVar3.snapshot().keySet()));
                }
                return Unit.f19194a;
            case 12:
                int i34 = this.f3781d;
                MainActivity mainActivity = (MainActivity) obj4;
                lf.a aVar15 = lf.a.f20034a;
                int i35 = this.f3780c;
                try {
                    if (i35 == 0) {
                        h8.b.B(obj);
                        sd.b bVar4 = new sd.b(mainActivity, 0);
                        Resources resources2 = mainActivity.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                        Bundle n9 = y3.n(i34, resources2);
                        this.f3780c = 1;
                        c8 = bVar4.c(n9, this);
                        if (c8 == aVar15) {
                            return aVar15;
                        }
                    } else {
                        if (i35 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        c8 = obj;
                    }
                    pair = (Pair) c8;
                } catch (Exception e10) {
                    rc.g gVar = new rc.g();
                    Intrinsics.checkNotNullParameter(e10, "e");
                    if (!(e10 instanceof CancellationException) && !(e10 instanceof nh.a) && !(e10 instanceof nh.d0) && !(e10 instanceof ConnectException) && !(e10 instanceof SocketException) && !(e10 instanceof SSLPeerUnverifiedException) && !(e10 instanceof SSLHandshakeException) && !(e10 instanceof SSLException) && !(e10 instanceof TimeoutException) && !(e10 instanceof SocketTimeoutException) && !(e10 instanceof UnknownHostException) && !(e10 instanceof IOException)) {
                        c0.t(MyApp.f6830c, b0.b(), null, new qb.a(gVar, "ShowErrorCodeMess", e10, (String) null, (Continuation) null), 2);
                    }
                }
                if (pair == null) {
                    return Unit.f19194a;
                }
                if (!((Boolean) pair.f19192a).booleanValue()) {
                    return Unit.f19194a;
                }
                Set set = MainActivity.J0;
                mainActivity.Y(i34);
                new d().i("ErrorAlert");
                return Unit.f19194a;
            case 13:
                pd.t tVar3 = (pd.t) obj4;
                gf.t tVar4 = tVar3.f21799i;
                lf.a aVar16 = lf.a.f20034a;
                int i36 = this.f3781d;
                if (i36 == 0) {
                    h8.b.B(obj);
                    vc.a aVar17 = (vc.a) tVar4.getValue();
                    this.f3781d = 1;
                    aVar17.getClass();
                    la.d dVar4 = (la.d) y3.m(la.d.class, null, 6);
                    dVar4.getClass();
                    lg.e eVar6 = m0.f9201a;
                    A2 = c0.A(lg.d.f20063c, new la.c(dVar4, z12 ? 1 : 0, i15), this);
                    if (A2 == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i36 != 1) {
                        if (i36 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i37 = this.f3780c;
                        h8.b.B(obj);
                        intValue3 = i37;
                        A3 = obj;
                        Boolean bool = (Boolean) A3;
                        bool.booleanValue();
                        Pair pair2 = new Pair(new Integer(intValue3), bool);
                        d1 d1Var = tVar3.j;
                        d1Var.getClass();
                        d1Var.k(null, pair2);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                    A2 = obj;
                }
                intValue3 = ((Number) A2).intValue();
                vc.a aVar18 = (vc.a) tVar4.getValue();
                this.f3780c = intValue3;
                this.f3781d = 2;
                aVar18.getClass();
                la.d dVar5 = (la.d) y3.m(la.d.class, null, 6);
                dVar5.getClass();
                lg.e eVar7 = m0.f9201a;
                A3 = c0.A(lg.d.f20063c, new la.c(dVar5, z13 ? 1 : 0, i13), this);
                if (A3 == aVar16) {
                    return aVar16;
                }
                Boolean bool2 = (Boolean) A3;
                bool2.booleanValue();
                Pair pair22 = new Pair(new Integer(intValue3), bool2);
                d1 d1Var2 = tVar3.j;
                d1Var2.getClass();
                d1Var2.k(null, pair22);
                return Unit.f19194a;
            case 14:
                int i38 = this.f3781d;
                lf.a aVar19 = lf.a.f20034a;
                int i39 = this.f3780c;
                if (i39 == 0) {
                    h8.b.B(obj);
                    switch (i38) {
                        case 1:
                            num = new Integer(R.drawable.gift);
                            break;
                        case 2:
                            num = new Integer(R.drawable.ic_setting);
                            break;
                        case 3:
                            num = new Integer(R.drawable.ic_more);
                            break;
                        case 4:
                            num = new Integer(R.drawable.ic_un_saved_24);
                            break;
                        case 5:
                            num = new Integer(R.drawable.ic_saved_24);
                            break;
                        case 6:
                            num = new Integer(R.drawable.ic_refresh);
                            break;
                        case 7:
                            num = new Integer(R.drawable.ic_notification);
                            break;
                        case 8:
                            num = new Integer(R.drawable.ic_monetization);
                            break;
                        case 9:
                            num = new Integer(R.drawable.tgbannericon);
                            break;
                        default:
                            num = null;
                            break;
                    }
                    this.f3780c = 1;
                    if (num != null) {
                        oc.a aVar20 = (oc.a) y3.m(oc.a.class, null, 6);
                        int intValue5 = num.intValue();
                        aVar20.getClass();
                        lg.e eVar8 = m0.f9201a;
                        obj2 = c0.A(lg.d.f20063c, new k(intValue5, 9, (Object) aVar20, (Continuation) (z14 ? 1 : 0)), this);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i39 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    obj2 = obj;
                }
                Bitmap bitmap2 = (Bitmap) obj2;
                if (bitmap2 != null) {
                    x xVar = (x) obj4;
                    pd.b bVar5 = xVar.f21805b;
                    bVar5.put(new Integer(i38), bitmap2);
                    xVar.f21806c.j(CollectionsKt.W(bVar5.snapshot().keySet()));
                }
                return Unit.f19194a;
            case 15:
                lf.a aVar21 = lf.a.f20034a;
                h8.b.B(obj);
                rb.g P0 = fb.b.P0();
                final int i40 = this.f3780c;
                final int i41 = this.f3781d;
                rb.e eVar9 = P0.f22382a;
                final int currentTimeMillis2 = (int) (System.currentTimeMillis() / 1000);
                return new Integer(((Number) f3.x.n0(eVar9.f22378a, false, true, new Function1() { // from class: hb.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        s2.c r02;
                        switch (i15) {
                            case 0:
                                int i252 = i41;
                                int i262 = currentTimeMillis2;
                                int i272 = i40;
                                s2.a _connection = (s2.a) obj7;
                                Intrinsics.checkNotNullParameter(_connection, "_connection");
                                r02 = _connection.r0("INSERT INTO push_metrics_table (pushId, type, dateCreate) VALUES (?, ?, ?)");
                                try {
                                    r02.f(1, i252);
                                    r02.f(2, i262);
                                    r02.f(3, i272);
                                    r02.n0();
                                    long p10 = io.sentry.config.a.p(_connection);
                                    r02.close();
                                    return Long.valueOf(p10);
                                } finally {
                                }
                            default:
                                int i282 = i41;
                                int i292 = currentTimeMillis2;
                                int i302 = i40;
                                s2.a _connection2 = (s2.a) obj7;
                                Intrinsics.checkNotNullParameter(_connection2, "_connection");
                                r02 = _connection2.r0("UPDATE support_table SET stateRead = ?, sendDate = ? WHERE id == ?");
                                try {
                                    r02.f(1, i282);
                                    r02.f(2, i292);
                                    r02.f(3, i302);
                                    r02.n0();
                                    int q = io.sentry.config.a.q(_connection2);
                                    r02.close();
                                    return Integer.valueOf(q);
                                } finally {
                                }
                        }
                    }
                })).intValue());
            case 16:
                l0 l0Var = (l0) obj4;
                int i42 = this.f3781d;
                Object obj7 = lf.a.f20034a;
                int i43 = this.f3780c;
                Continuation continuation = null;
                if (i43 == 0) {
                    h8.b.B(obj);
                    if (i42 <= 0) {
                        l0Var.f23908m.h(Boolean.TRUE);
                        c0.t(MyApp.f6830c, b0.b(), null, new androidx.lifecycle.c(new d(), "AnotherQuestion", continuation, 10, false), 2);
                        return Unit.f19194a;
                    }
                    md.m mVar = l0Var.f23900d;
                    this.f3780c = 1;
                    mVar.getClass();
                    if (i42 < 1) {
                        obj3 = Unit.f19194a;
                    } else {
                        lg.e eVar10 = m0.f9201a;
                        Object A5 = c0.A(lg.d.f20063c, new md.j(i42, null, mVar), this);
                        obj3 = A5;
                        if (A5 != obj7) {
                            obj3 = Unit.f19194a;
                        }
                    }
                    if (obj3 == obj7) {
                        return obj7;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                c0.t(MyApp.f6830c, b0.b(), null, new androidx.lifecycle.c(new d(), Integer.valueOf(i42), continuation, 10, false), 2);
                return Unit.f19194a;
            default:
                vc.a aVar22 = ((ue.h) obj4).f24259d;
                lf.a aVar23 = lf.a.f20034a;
                int i44 = this.f3780c;
                if (i44 == 0) {
                    h8.b.B(obj);
                    this.f3780c = 1;
                    aVar22.getClass();
                    la.d dVar6 = (la.d) y3.m(la.d.class, null, 6);
                    dVar6.getClass();
                    lg.e eVar11 = m0.f9201a;
                    Object A6 = c0.A(lg.d.f20063c, new la.c(dVar6, z15 ? 1 : 0, i12), this);
                    Object obj8 = A6;
                    if (A6 != aVar23) {
                        obj8 = Unit.f19194a;
                    }
                    if (obj8 != aVar23) {
                        obj8 = Unit.f19194a;
                    }
                    if (obj8 == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i44 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                int i45 = this.f3781d;
                if (i45 > 0) {
                    aVar22.getClass();
                    b bVar6 = new b(i14);
                    new b0().c("open_announcement", new JSONObject().put("id", i45));
                    bVar6.g("viewedAnnouncement", String.valueOf(i45));
                }
                return Unit.f19194a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i5, int i10, w wVar, Continuation continuation) {
        super(2, continuation);
        this.f3779b = 6;
        this.f3780c = i5;
        this.f3781d = i10;
        this.f3782e = wVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i5, k1 k1Var, Continuation continuation, int i10) {
        super(2, continuation);
        this.f3779b = i10;
        this.f3781d = i5;
        this.f3782e = k1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, int i5, int i10, Continuation continuation, int i11) {
        super(2, continuation);
        this.f3779b = i11;
        this.f3782e = obj;
        this.f3780c = i5;
        this.f3781d = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, Continuation continuation, int i5) {
        super(2, continuation);
        this.f3779b = i5;
        this.f3782e = obj;
    }
}
