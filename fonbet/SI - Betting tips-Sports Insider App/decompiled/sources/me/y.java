package me;

import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.method.MovementMethod;
import android.webkit.MimeTypeMap;
import android.widget.TextView;
import androidx.appcompat.app.h0;
import androidx.appcompat.app.v0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k1;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.tasks.Task;
import com.sports.insider.MyApp;
import com.sports.insider.data.repository.room.metric.EventsTable;
import com.sports.insider.domain.workers.WorkerTrack;
import com.sports.insider.ui.activities.MainActivity;
import com.sports.insider.ui.faq.FaqFragment;
import com.sports.insider.ui.strip.FollowPredictionsFragment;
import com.sports.insider.ui.strip.PredictionListFragment;
import com.sports.insider.ui.subs.ListSubsFragment;
import com.sports.insider.ui.support.SupportChat;
import e3.k0;
import eg.m0;
import hg.d1;
import hg.u0;
import ic.i0;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.C0122e9;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import te.l0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20696b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f20697c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f20698d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Object obj, Object obj2, Continuation continuation, int i5) {
        super(2, continuation);
        this.f20696b = i5;
        this.f20697c = obj;
        this.f20698d = obj2;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f20696b) {
            case 0:
                return new y((c0) this.f20697c, (kc.b) this.f20698d, continuation, 0);
            case 1:
                return new y((ke.s) this.f20697c, (Context) this.f20698d, continuation, 1);
            case 2:
                y yVar = new y((oe.k) this.f20698d, continuation, 2);
                yVar.f20697c = obj;
                return yVar;
            case 3:
                return new y((pc.u) this.f20697c, (String) this.f20698d, continuation, 3);
            case 4:
                y yVar2 = new y((pd.c) this.f20698d, continuation, 4);
                yVar2.f20697c = obj;
                return yVar2;
            case 5:
                return new y((MainActivity) this.f20697c, (String) this.f20698d, continuation, 5);
            case 6:
                return new y((Intent) this.f20697c, (pd.t) this.f20698d, continuation, 6);
            case 7:
                y yVar3 = new y((pd.t) this.f20698d, continuation, 7);
                yVar3.f20697c = obj;
                return yVar3;
            case 8:
                return new y((com.sports.insider.ui.activities.a) this.f20697c, (com.google.android.play.core.appupdate.a) this.f20698d, continuation, 8);
            case 9:
                return new y((FollowPredictionsFragment) this.f20697c, (List) this.f20698d, continuation, 9);
            case 10:
                return new y((FollowPredictionsFragment) this.f20697c, (Parcelable) this.f20698d, continuation, 10);
            case 11:
                y yVar4 = new y((pe.f) this.f20698d, continuation, 11);
                yVar4.f20697c = obj;
                return yVar4;
            case 12:
                return new y((PredictionListFragment) this.f20697c, (List) this.f20698d, continuation, 12);
            case 13:
                return new y((pe.s) this.f20697c, (mc.a) this.f20698d, continuation, 13);
            case 14:
                return new y((pe.s) this.f20697c, (List) this.f20698d, continuation, 14);
            case 15:
                y yVar5 = new y((pe.s) this.f20698d, continuation, 15);
                yVar5.f20697c = obj;
                return yVar5;
            case 16:
                return new y((fb.b) this.f20697c, (ka.a) this.f20698d, continuation, 16);
            case 17:
                return new y((qd.e) this.f20697c, (t0.q) this.f20698d, continuation, 17);
            case 18:
                return new y((qd.e) this.f20697c, (eg.r) this.f20698d, continuation, 18);
            case 19:
                return new y((rc.r) this.f20697c, (String) this.f20698d, continuation, 19);
            case 20:
                return new y((rc.g) this.f20697c, (String) this.f20698d, continuation, 20);
            case 21:
                return new y((rc.b0) this.f20697c, (JSONObject) this.f20698d, continuation, 21);
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                return new y((s7.t) this.f20697c, (e3.o) this.f20698d, continuation, 22);
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                return new y((Context) this.f20697c, (sd.b) this.f20698d, continuation, 23);
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                return new y((ListSubsFragment) this.f20697c, (MovementMethod) this.f20698d, continuation, 24);
            case C0122e9.F /* 25 */:
                y yVar6 = new y((ListSubsFragment) this.f20698d, continuation, 25);
                yVar6.f20697c = obj;
                return yVar6;
            case C0122e9.G /* 26 */:
                return new y((FaqFragment) this.f20697c, (Parcelable) this.f20698d, continuation, 26);
            case C0122e9.H /* 27 */:
                return new y((SupportChat) this.f20697c, (ic.g0) this.f20698d, continuation, 27);
            case 28:
                return new y((l0) this.f20697c, (Uri) this.f20698d, continuation, 28);
            default:
                return new y((y1.c0) this.f20697c, (l0) this.f20698d, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20696b) {
            case 0:
                ((y) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
                break;
        }
        return ((y) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0848  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x085d  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0899  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x086e  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x084d  */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v1 */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        RecyclerView recyclerView;
        Task d10;
        Intent intent;
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        RecyclerView recyclerView2;
        int i5 = 12;
        int i10 = 3;
        int i11 = 4;
        int i12 = 6;
        int i13 = 2;
        int i14 = 0;
        int i15 = 1;
        g.f fVar = 0;
        String str3 = null;
        Intent intent2 = null;
        switch (this.f20696b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                c0 c0Var = (c0) this.f20697c;
                d1 d1Var = c0Var.f20630m;
                kc.b bVar = (kc.b) this.f20698d;
                Pair pair = new Pair(bVar != null ? bVar.getTeamHomeName() : null, bVar != null ? bVar.getTeamGuestName() : null);
                d1Var.getClass();
                d1Var.k(null, pair);
                d1 d1Var2 = c0Var.f20632n;
                Pair pair2 = new Pair(bVar != null ? bVar.getTeamHomeFlag() : null, bVar != null ? bVar.getTeamGuestFlag() : null);
                d1Var2.getClass();
                d1Var2.k(null, pair2);
                if ((bVar != null ? bVar.getScoreHome() : null) != null && bVar.getScoreGuest() != null) {
                    if (bVar.getScoreHomeExtra() == null) {
                        Integer scoreHome = bVar.getScoreHome();
                        if (scoreHome != null) {
                            str = String.valueOf(scoreHome.intValue());
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(bVar.getScoreHome());
                        sb2.append('(');
                        sb2.append(bVar.getScoreHomeExtra());
                        sb2.append(')');
                        str = sb2.toString();
                    }
                    if ((bVar == null ? bVar.getScoreHome() : null) != null && bVar.getScoreGuest() != null) {
                        if (bVar.getScoreGuestExtra() != null) {
                            Integer scoreGuest = bVar.getScoreGuest();
                            if (scoreGuest != null) {
                                str2 = String.valueOf(scoreGuest.intValue());
                            }
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(bVar.getScoreGuest());
                            sb3.append('(');
                            sb3.append(bVar.getScoreGuestExtra());
                            sb3.append(')');
                            str2 = sb3.toString();
                        }
                        c0Var.f20633o.j(str);
                        c0Var.f20634p.j(str2);
                        d1 d1Var3 = c0Var.f20635r;
                        if (bVar != null || (r2 = bVar.getLeague()) == null) {
                            String str4 = "";
                        }
                        d1Var3.getClass();
                        d1Var3.k(null, str4);
                        return Boolean.TRUE;
                    }
                    str2 = null;
                    c0Var.f20633o.j(str);
                    c0Var.f20634p.j(str2);
                    d1 d1Var32 = c0Var.f20635r;
                    if (bVar != null) {
                    }
                    String str42 = "";
                    d1Var32.getClass();
                    d1Var32.k(null, str42);
                    return Boolean.TRUE;
                }
                str = null;
                if ((bVar == null ? bVar.getScoreHome() : null) != null) {
                    if (bVar.getScoreGuestExtra() != null) {
                    }
                    c0Var.f20633o.j(str);
                    c0Var.f20634p.j(str2);
                    d1 d1Var322 = c0Var.f20635r;
                    if (bVar != null) {
                    }
                    String str422 = "";
                    d1Var322.getClass();
                    d1Var322.k(null, str422);
                    return Boolean.TRUE;
                }
                str2 = null;
                c0Var.f20633o.j(str);
                c0Var.f20634p.j(str2);
                d1 d1Var3222 = c0Var.f20635r;
                if (bVar != null) {
                }
                String str4222 = "";
                d1Var3222.getClass();
                d1Var3222.k(null, str4222);
                return Boolean.TRUE;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                cd.d dVar = new cd.d();
                ke.s sVar = (ke.s) this.f20697c;
                dVar.f(sVar != null ? sVar.a() : null, sVar != null ? new Integer(sVar.b()) : null, sVar != null ? sVar.e() : null);
                if (md.a.a(new WeakReference((Context) this.f20698d), null, sVar != null ? new Integer(sVar.b()) : null, sVar != null ? sVar.e() : null)) {
                    new cd.d().h();
                }
                return Unit.f19194a;
            case 2:
                gf.u uVar = (gf.u) this.f20697c;
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                oe.k kVar = (oe.k) this.f20698d;
                kVar.f21209b = new AtomicBoolean(uVar.f10039a != null);
                kVar.f21214g.j(uVar.f10039a);
                kVar.f21216i.j(uVar.f10041c);
                kVar.f21215h.j(uVar.f10040b);
                return Unit.f19194a;
            case 3:
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                ((pc.u) this.f20697c).f21717s = (String) this.f20698d;
                return Unit.f19194a;
            case 4:
                List list = (List) this.f20697c;
                lf.a aVar5 = lf.a.f20034a;
                h8.b.B(obj);
                if (!list.isEmpty()) {
                    d1 d1Var4 = ((pd.c) this.f20698d).f21732c;
                    d1Var4.getClass();
                    d1Var4.k(null, list);
                }
                return Unit.f19194a;
            case 5:
                lf.a aVar6 = lf.a.f20034a;
                h8.b.B(obj);
                f3.x.l0((MainActivity) this.f20697c, (String) this.f20698d, new o(i15), f3.x.E0());
                return Unit.f19194a;
            case 6:
                lf.a aVar7 = lf.a.f20034a;
                h8.b.B(obj);
                int intExtra = ((Intent) this.f20697c).getIntExtra("AnnouncementId", 0);
                d1 d1Var5 = ((pd.t) this.f20698d).j;
                Pair pair3 = (Pair) androidx.lifecycle.d1.a(d1Var5).d();
                if (pair3 != null && ((Number) pair3.f19192a).intValue() == intExtra) {
                    return Unit.f19194a;
                }
                Pair pair4 = new Pair(new Integer(intExtra), Boolean.FALSE);
                d1Var5.getClass();
                d1Var5.k(null, pair4);
                return Unit.f19194a;
            case 7:
                sb.c cVar = (sb.c) this.f20697c;
                lf.a aVar8 = lf.a.f20034a;
                h8.b.B(obj);
                uc.c cVar2 = ((pd.t) this.f20698d).f21793c;
                int i16 = cVar.f23406a;
                int i17 = cVar.f23407b;
                cVar2.getClass();
                try {
                    uc.c.f24220a = i16;
                    uc.c.f24221b = i17;
                } catch (Exception e7) {
                    zc.d.b(6, null, e7);
                }
                return Unit.f19194a;
            case 8:
                lf.a aVar9 = lf.a.f20034a;
                h8.b.B(obj);
                com.sports.insider.ui.activities.a aVar10 = (com.sports.insider.ui.activities.a) this.f20697c;
                if (aVar10.f3250a.f2169d.a(androidx.lifecycle.x.f2256d)) {
                    try {
                        com.google.android.play.core.appupdate.e eVar = (com.google.android.play.core.appupdate.e) aVar10.B.getValue();
                        com.google.android.play.core.appupdate.a aVar11 = (com.google.android.play.core.appupdate.a) this.f20698d;
                        g.f fVar2 = aVar10.A;
                        if (fVar2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("activityResultLauncher");
                        } else {
                            fVar = fVar2;
                        }
                        com.google.android.play.core.appupdate.n a7 = com.google.android.play.core.appupdate.n.a(1).a();
                        eVar.getClass();
                        com.google.android.play.core.appupdate.e.c(aVar11, fVar, a7);
                    } catch (Exception e9) {
                        zc.d.b(4, "checkImmediateOnResume", e9);
                    }
                }
                return Unit.f19194a;
            case 9:
                lf.a aVar12 = lf.a.f20034a;
                h8.b.B(obj);
                ((FollowPredictionsFragment) this.f20697c).f7021b.e((List) this.f20698d);
                return Unit.f19194a;
            case 10:
                lf.a aVar13 = lf.a.f20034a;
                h8.b.B(obj);
                v0 v0Var = ((FollowPredictionsFragment) this.f20697c).f7023d;
                k1 layoutManager = (v0Var == null || (recyclerView = (RecyclerView) v0Var.f366d) == null) ? null : recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    linearLayoutManager.onRestoreInstanceState((Parcelable) this.f20698d);
                }
                return Unit.f19194a;
            case 11:
                List list2 = (List) this.f20697c;
                lf.a aVar14 = lf.a.f20034a;
                h8.b.B(obj);
                pe.f fVar3 = (pe.f) this.f20698d;
                d1 d1Var6 = fVar3.f21834c;
                Boolean valueOf = Boolean.valueOf(list2.isEmpty());
                d1Var6.getClass();
                d1Var6.k(null, valueOf);
                d1 d1Var7 = fVar3.f21835d;
                d1Var7.getClass();
                d1Var7.k(null, list2);
                return Unit.f19194a;
            case 12:
                lf.a aVar15 = lf.a.f20034a;
                h8.b.B(obj);
                qe.e eVar2 = ((PredictionListFragment) this.f20697c).f7024c;
                if (eVar2 != null) {
                    eVar2.e((List) this.f20698d);
                }
                return Unit.f19194a;
            case 13:
                lf.a aVar16 = lf.a.f20034a;
                h8.b.B(obj);
                pe.s sVar2 = (pe.s) this.f20697c;
                id.x xVar = sVar2.f21863b;
                int i18 = sVar2.f21874n.get();
                mc.a sort = (mc.a) this.f20698d;
                xVar.getClass();
                Intrinsics.checkNotNullParameter(sort, "sort");
                id.x.d().getClass();
                ub.f fVar4 = ((sb.j) y3.m(sb.j.class, null, 6)).f23427b;
                id.u uVar2 = new id.u(i18 == 0 ? io.sentry.config.a.e(fVar4.f24213a, new String[]{"table_prediction_preview"}, new ub.b(i10)) : io.sentry.config.a.e(fVar4.f24213a, new String[]{"table_prediction_preview", "prediction_kind_table"}, new ub.d(i18, i12)), i12);
                lg.e eVar3 = m0.f9201a;
                lg.d dVar2 = lg.d.f20063c;
                sVar2.f21873m = u0.p(new hg.u(u0.n(new hg.u(u0.h(u0.i(u0.n(new id.p(new ge.q(u0.n(uVar2, dVar2), i15), xVar, sort, r8 ? 1 : 0), m0.f9201a)), 90L), new oe.j(sVar2, fVar, i5), 2), dVar2), new ge.o(i10, fVar, 19)), androidx.lifecycle.d1.i(sVar2));
                return Unit.f19194a;
            case 14:
                lf.a aVar17 = lf.a.f20034a;
                h8.b.B(obj);
                pe.s sVar3 = (pe.s) this.f20697c;
                d1 d1Var8 = sVar3.f21867f;
                List list3 = (List) this.f20698d;
                d1Var8.j(list3);
                if (list3 == null || list3.isEmpty()) {
                    d1 d1Var9 = sVar3.f21870i;
                    Integer num = new Integer(8);
                    d1Var9.getClass();
                    d1Var9.k(null, num);
                }
                return Unit.f19194a;
            case 15:
                eg.z zVar = (eg.z) this.f20697c;
                lf.a aVar18 = lf.a.f20034a;
                h8.b.B(obj);
                lg.e eVar4 = m0.f9201a;
                fg.e eVar5 = jg.q.f18523a;
                pe.s sVar4 = (pe.s) this.f20698d;
                eg.c0.e(zVar, eVar5, new pe.r(sVar4, fVar, r8 ? 1 : 0), 2);
                eg.c0.e(zVar, eVar5, new pe.r(sVar4, fVar, i15), 2);
                return Unit.f19194a;
            case 16:
                lf.a aVar19 = lf.a.f20034a;
                h8.b.B(obj);
                rb.g P0 = fb.b.P0();
                ka.a obj2 = (ka.a) this.f20698d;
                P0.getClass();
                Intrinsics.checkNotNullParameter(obj2, "obj");
                return new Integer(((Number) f3.x.n0(P0.f22382a.f22378a, false, true, new eb.b(obj2.f18945a, i5))).intValue());
            case 17:
                lf.a aVar20 = lf.a.f20034a;
                h8.b.B(obj);
                qd.e eVar6 = (qd.e) this.f20697c;
                t0.q qVar = (t0.q) this.f20698d;
                String str5 = eVar6.f22106b;
                h0 h0Var = qVar.f23735a;
                if (h0Var instanceof t0.n) {
                    if (Intrinsics.areEqual((String) h0Var.f257a, "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL")) {
                        return h.b.a((Bundle) ((t0.n) h0Var).f258b).f25413c;
                    }
                    qd.e.I(h0Var);
                    return str5;
                }
                if (h0Var instanceof t0.v) {
                    t0.v vVar = (t0.v) h0Var;
                    StringBuilder sb4 = new StringBuilder("PublicKeyCredential type of credential");
                    sb4.append(StringUtils.PROCESS_POSTFIX_DELIMITER.concat(t0.v.class.getSimpleName()));
                    sb4.append(" type:" + ((String) vVar.f257a));
                    sb4.append(" responseJson:" + vVar.f23738c);
                    String message = sb4.toString();
                    Intrinsics.checkNotNullExpressionValue(message, "toString(...)");
                    Intrinsics.checkNotNullParameter(message, "message");
                    jg.d dVar3 = MyApp.f6830c;
                    lg.e eVar7 = m0.f9201a;
                    eg.c0.t(dVar3, lg.d.f20063c, null, new hd.b(i13, message, fVar), 2);
                    return str5;
                }
                if (!(h0Var instanceof t0.t)) {
                    qd.e.I(h0Var);
                    return str5;
                }
                t0.t tVar = (t0.t) h0Var;
                StringBuilder sb5 = new StringBuilder("PasswordCredential type of credential");
                sb5.append(StringUtils.PROCESS_POSTFIX_DELIMITER.concat(t0.t.class.getSimpleName()));
                sb5.append(" type:" + ((String) tVar.f257a));
                sb5.append(" TYPE_PASSWORD_CREDENTIAL:android.credentials.TYPE_PASSWORD_CREDENTIAL");
                sb5.append(" username:" + tVar.f23736c);
                sb5.append(" password:" + tVar.f23737d);
                String message2 = sb5.toString();
                Intrinsics.checkNotNullExpressionValue(message2, "toString(...)");
                Intrinsics.checkNotNullParameter(message2, "message");
                jg.d dVar4 = MyApp.f6830c;
                lg.e eVar8 = m0.f9201a;
                eg.c0.t(dVar4, lg.d.f20063c, null, new hd.b(i13, message2, fVar), 2);
                return str5;
            case 18:
                eg.r rVar = (eg.r) this.f20698d;
                lf.a aVar21 = lf.a.f20034a;
                h8.b.B(obj);
                b7.f fVar5 = ((qd.e) this.f20697c).f22109e;
                if (fVar5 == null || (d10 = fVar5.d()) == null) {
                    return Boolean.valueOf(rVar.Q(Boolean.FALSE));
                }
                d10.addOnCompleteListener(new cc.b(rVar, i15));
                return d10;
            case 19:
                lf.a aVar22 = lf.a.f20034a;
                h8.b.B(obj);
                rc.r.d().d("keyIdLogRocket", (String) this.f20698d);
                return Unit.f19194a;
            case 20:
                lf.a aVar23 = lf.a.f20034a;
                h8.b.B(obj);
                za.k a10 = rc.b0.a((rc.g) this.f20697c);
                String str6 = (String) this.f20698d;
                a10.getClass();
                ac.a a11 = za.k.a();
                za.k.a().getClass();
                ((ac.d) a11).a(kotlin.collections.m0.b(new Pair("BillingCountry", str6)));
                return Unit.f19194a;
            case 21:
                lf.a aVar24 = lf.a.f20034a;
                h8.b.B(obj);
                za.k a12 = rc.b0.a((rc.b0) this.f20697c);
                JSONObject jSONObject = (JSONObject) this.f20698d;
                a12.getClass();
                ((ac.d) za.k.a()).getClass();
                if (jSONObject == null) {
                    AppMetrica.reportEvent("INFO");
                } else {
                    AppMetrica.reportEvent("INFO", jSONObject.toString());
                }
                return Unit.f19194a;
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                lf.a aVar25 = lf.a.f20034a;
                h8.b.B(obj);
                e3.y yVar = e3.y.f8572a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                e3.y networkType = e3.y.f8573b;
                Intrinsics.checkNotNullParameter(networkType, "networkType");
                e3.f fVar6 = new e3.f(new n3.i(null), networkType, false, false, false, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? CollectionsKt.Z(linkedHashSet) : kotlin.collections.g0.f19206a);
                Intrinsics.checkNotNullParameter(WorkerTrack.class, "workerClass");
                e3.z zVar2 = (e3.z) new e3.z(WorkerTrack.class).f(fVar6);
                e3.a aVar26 = e3.a.f8472b;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                return ((k0) y3.m(k0.class, null, 6)).c("WorkerTrack", (e3.o) this.f20698d, (e3.a0) ((e3.z) ((e3.z) ((e3.z) zVar2.e(aVar26, 1L, timeUnit)).g(1L, timeUnit)).a("WorkerTrack")).b());
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                Context context = (Context) this.f20697c;
                lf.a aVar27 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    try {
                        String packageName = context.getPackageName();
                        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
                        Intrinsics.checkNotNullParameter(packageName, "packageName");
                        intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse("https://play.google.com/store/account/subscriptions"));
                    } catch (Exception e10) {
                        zc.d.b(4, "openSubsManger", e10);
                        sd.b.e();
                    }
                    try {
                        Intent flags = intent.setFlags(67108864);
                        int i19 = Build.VERSION.SDK_INT;
                        if (i19 < 24 || i19 >= 28) {
                            flags.addFlags(268435456);
                        }
                        context.startActivity(flags);
                    } catch (ActivityNotFoundException e11) {
                        e = e11;
                        intent2 = intent;
                        if (intent2 == null) {
                            sd.b.e();
                            String message3 = e.getMessage();
                            if (message3 == null) {
                                message3 = "ActivityNotFoundException";
                            }
                            zc.d.c(message3, "openSubsManger");
                        } else {
                            int i20 = sd.b.f23471d;
                            try {
                                Intent addFlags = Intent.createChooser(intent2, "Open link").addFlags(67108864);
                                int i21 = Build.VERSION.SDK_INT;
                                if (i21 < 24 || i21 >= 28) {
                                    addFlags.addFlags(268435456);
                                }
                                Intrinsics.checkNotNull(addFlags);
                            } catch (ActivityNotFoundException e12) {
                                sd.b.e();
                                String message4 = e12.getMessage();
                                if (message4 == null) {
                                    message4 = "chooser ActivityNotFoundException";
                                }
                                zc.d.c(message4, "chooser");
                            }
                        }
                        return Unit.f19194a;
                    }
                } catch (ActivityNotFoundException e13) {
                    e = e13;
                }
                return Unit.f19194a;
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                MovementMethod movementMethod = (MovementMethod) this.f20698d;
                lf.a aVar28 = lf.a.f20034a;
                h8.b.B(obj);
                ListSubsFragment listSubsFragment = (ListSubsFragment) this.f20697c;
                ec.d dVar5 = (ec.d) listSubsFragment.f22459a;
                if (dVar5 != null && (textView5 = dVar5.q) != null) {
                    textView5.setMovementMethod(movementMethod);
                }
                ec.d dVar6 = (ec.d) listSubsFragment.f22459a;
                if (dVar6 != null && (textView4 = dVar6.f8912u) != null) {
                    textView4.setMovementMethod(movementMethod);
                }
                ec.d dVar7 = (ec.d) listSubsFragment.f22459a;
                if (dVar7 != null && (textView3 = dVar7.f8911t) != null) {
                    textView3.setMovementMethod(movementMethod);
                }
                ec.d dVar8 = (ec.d) listSubsFragment.f22459a;
                if (dVar8 != null && (textView2 = dVar8.f8910s) != null) {
                    textView2.setMovementMethod(movementMethod);
                }
                ec.d dVar9 = (ec.d) listSubsFragment.f22459a;
                if (dVar9 != null && (textView = dVar9.f8909r) != null) {
                    textView.setMovementMethod(movementMethod);
                }
                return Unit.f19194a;
            case C0122e9.F /* 25 */:
                eg.z zVar3 = (eg.z) this.f20697c;
                lf.a aVar29 = lf.a.f20034a;
                h8.b.B(obj);
                lg.e eVar9 = m0.f9201a;
                lg.d dVar10 = lg.d.f20063c;
                ListSubsFragment listSubsFragment2 = (ListSubsFragment) this.f20698d;
                eg.c0.e(zVar3, dVar10, new se.d(listSubsFragment2, fVar, r8 ? 1 : 0), 2);
                eg.c0.e(zVar3, dVar10, new se.d(listSubsFragment2, fVar, i15), 2);
                eg.c0.e(zVar3, dVar10, new se.d(listSubsFragment2, fVar, i13), 2);
                eg.c0.e(zVar3, dVar10, new se.d(listSubsFragment2, fVar, i10), 2);
                eg.c0.e(zVar3, dVar10, new se.d(listSubsFragment2, fVar, i11), 2);
                eg.c0.e(zVar3, dVar10, new se.d(listSubsFragment2, fVar, 5), 2);
                eg.c0.e(zVar3, dVar10, new se.d(listSubsFragment2, fVar, i12), 2);
                eg.c0.e(zVar3, dVar10, new se.d(listSubsFragment2, fVar, 7), 2);
                return Unit.f19194a;
            case C0122e9.G /* 26 */:
                lf.a aVar30 = lf.a.f20034a;
                h8.b.B(obj);
                io.sentry.internal.debugmeta.c cVar3 = ((FaqFragment) this.f20697c).f6907a;
                k1 layoutManager2 = (cVar3 == null || (recyclerView2 = (RecyclerView) cVar3.f16518c) == null) ? null : recyclerView2.getLayoutManager();
                LinearLayoutManager linearLayoutManager2 = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
                if (linearLayoutManager2 != null) {
                    linearLayoutManager2.onRestoreInstanceState((Parcelable) this.f20698d);
                }
                return Unit.f19194a;
            case C0122e9.H /* 27 */:
                lf.a aVar31 = lf.a.f20034a;
                h8.b.B(obj);
                te.q qVar2 = ((SupportChat) this.f20697c).f7049g;
                if (qVar2 == null) {
                    return null;
                }
                ic.g0 g0Var = (ic.g0) this.f20698d;
                Integer num2 = g0Var.f11117a;
                Integer num3 = g0Var.f11118b;
                if (num2 != null && num3 != null) {
                    Iterator it = ((ArrayList) qVar2.f23914b).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (!(next instanceof ka.a) || ((ka.a) next).f18945a != num2.intValue()) {
                                i14++;
                            }
                        } else {
                            i14 = -1;
                        }
                    }
                    if (i14 >= 0) {
                        qVar2.notifyItemChanged(i14, new Pair("progress", num3));
                    }
                }
                return Unit.f19194a;
            case 28:
                lf.a aVar32 = lf.a.f20034a;
                h8.b.B(obj);
                l0 l0Var = (l0) this.f20697c;
                Uri uri = (Uri) this.f20698d;
                l0Var.f23900d.getClass();
                Intrinsics.checkNotNullParameter(uri, "uri");
                gf.t b10 = gf.k.b(new id.a(13));
                gf.k.b(new id.a(14));
                Intrinsics.checkNotNullParameter(uri, "uri");
                try {
                    ((zc.k) b10.getValue()).getClass();
                    ContentResolver contentResolver = ((za.i) zc.k.e()).f25901a.getContentResolver();
                    Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
                    Intrinsics.checkNotNullParameter(uri, "uri");
                    Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
                    if (Intrinsics.areEqual(EventsTable.contentColumn, uri.getScheme())) {
                        str3 = contentResolver.getType(uri);
                    } else {
                        MimeTypeMap singleton = MimeTypeMap.getSingleton();
                        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
                        Intrinsics.checkNotNullExpressionValue(fileExtensionFromUrl, "getFileExtensionFromUrl(...)");
                        String lowerCase = fileExtensionFromUrl.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        str3 = singleton.getMimeTypeFromExtension(lowerCase);
                    }
                } catch (Exception e14) {
                    zc.d.b(4, "getMimeTypeS", e14);
                }
                return str3;
            default:
                lf.a aVar33 = lf.a.f20034a;
                h8.b.B(obj);
                ((l0) this.f20698d).f23898b.h(new i0(new ic.f((y1.c0) this.f20697c)));
                return Unit.f19194a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Object obj, Continuation continuation, int i5) {
        super(2, continuation);
        this.f20696b = i5;
        this.f20698d = obj;
    }
}
