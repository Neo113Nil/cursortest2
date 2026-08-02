package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.n;
import com.sofascore.model.database.DbMediaLike;
import com.sofascore.model.database.DbMediaShare;
import com.sofascore.model.database.DbMmaOrganizationViewCount;
import com.sofascore.model.database.DbNatsEvent;
import com.sofascore.model.database.DbPendingNotification;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.util.MarketValueUserVote;
import com.sofascore.results.manager.matches.ManagerEventsFragment;
import com.sofascore.results.mma.fighter.editfighter.MmaEditFighterDialog;
import com.sofascore.results.mma.fighter.matches.MmaFighterEventsFragment;
import com.sofascore.results.mma.mainScreen.MmaEventsWeekFragment;
import com.sofascore.results.view.follownotification.NotificationsActionButton;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class lsb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lsb(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04c5  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        LinearLayoutManager linearLayoutManager;
        s6d c;
        SharedPreferences d;
        int i = -1;
        int i2 = 8;
        int i3 = 2;
        int i4 = 0;
        Object[] objArr = 0;
        switch (this.a) {
            case 0:
                ManagerEventsFragment managerEventsFragment = (ManagerEventsFragment) this.b;
                s6e s6eVar = (s6e) this.c;
                vsb vsbVar = (vsb) obj;
                vsbVar.getClass();
                kda.p(wca.x(managerEventsFragment.getLifecycle()), new n50(managerEventsFragment, vsbVar, objArr == true ? 1 : 0, 9), new owa(s6eVar, 1));
                return Unit.a;
            case 1:
                dvb dvbVar = (dvb) this.b;
                MarketValueUserVote marketValueUserVote = (MarketValueUserVote) this.c;
                glg glgVar = (glg) obj;
                glgVar.getClass();
                dvbVar.b.a0(glgVar, marketValueUserVote);
                return Unit.a;
            case 2:
                ewb ewbVar = (ewb) this.b;
                w3f w3fVar = (w3f) this.c;
                rwb rwbVar = (rwb) obj;
                rwbVar.getClass();
                String str = ewbVar.a;
                str.getClass();
                return rwb.a(rwbVar, new ewb(str, w3fVar));
            case 3:
                x8c x8cVar = (x8c) this.b;
                DbMediaLike dbMediaLike = (DbMediaLike) this.c;
                glg glgVar2 = (glg) obj;
                glgVar2.getClass();
                x8cVar.b.K(glgVar2, dbMediaLike);
                return Unit.a;
            case 4:
                x8c x8cVar2 = (x8c) this.b;
                DbMediaShare dbMediaShare = (DbMediaShare) this.c;
                glg glgVar3 = (glg) obj;
                glgVar3.getClass();
                x8cVar2.c.K(glgVar3, dbMediaShare);
                return Unit.a;
            case 5:
                MmaEditFighterDialog mmaEditFighterDialog = (MmaEditFighterDialog) this.b;
                i15 i15Var = (i15) this.c;
                long longValue = ((Long) obj).longValue() / 1000;
                mmaEditFighterDialog.v().i.setDateOfBirthTimestamp(Long.valueOf(longValue));
                bi4 bi4Var = bi4.PATTERN_DMY;
                Locale d2 = dla.d();
                ZoneId of = ZoneId.of("GMT");
                of.getClass();
                i15Var.b.setText(fc6.i(longValue, DateTimeFormatter.ofPattern(bi4Var.d(), d2).withZone(of).withDecimalStyle(DecimalStyle.of(d2))));
                return Unit.a;
            case 6:
                MmaEventsWeekFragment mmaEventsWeekFragment = (MmaEventsWeekFragment) this.b;
                String str2 = (String) this.c;
                List list = (List) obj;
                list.getClass();
                mmaEventsWeekFragment.D(str2, list);
                return Unit.a;
            case 7:
                MmaFighterEventsFragment mmaFighterEventsFragment = (MmaFighterEventsFragment) this.b;
                u6e u6eVar = (u6e) this.c;
                List list2 = (List) obj;
                mmaFighterEventsFragment.n();
                list2.getClass();
                if (list2.isEmpty()) {
                    mmaFighterEventsFragment.C().F(a.c((j29) mmaFighterEventsFragment.u.getValue()));
                } else {
                    mmaFighterEventsFragment.C().H(list2);
                    if (mmaFighterEventsFragment.v) {
                        mmaFighterEventsFragment.v = false;
                        u6eVar.e = true;
                        u6eVar.f = true;
                        ArrayList arrayList = mmaFighterEventsFragment.C().i;
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (next instanceof Event) {
                                Event event = (Event) next;
                                if (Intrinsics.c(event.getTournament().isLive(), Boolean.TRUE) || (Intrinsics.c(event.getStatusType(), StatusKt.STATUS_FINISHED) && event.getStartTimestamp() < currentTimeMillis)) {
                                    i = i4;
                                    if (i < 0) {
                                        i = arrayList.size() - 1;
                                    }
                                    krk krkVar = mmaFighterEventsFragment.l;
                                    krkVar.getClass();
                                    int measuredHeight = ((oo8) krkVar).d.getMeasuredHeight() / 2;
                                    Context requireContext = mmaFighterEventsFragment.requireContext();
                                    requireContext.getClass();
                                    int s = measuredHeight - ao2.s(84, requireContext);
                                    krk krkVar2 = mmaFighterEventsFragment.l;
                                    krkVar2.getClass();
                                    n layoutManager = ((oo8) krkVar2).d.getLayoutManager();
                                    linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                                    if (linearLayoutManager != null) {
                                        linearLayoutManager.scrollToPositionWithOffset(i, s);
                                    }
                                }
                            }
                            i4++;
                        }
                        if (i < 0) {
                        }
                        krk krkVar3 = mmaFighterEventsFragment.l;
                        krkVar3.getClass();
                        int measuredHeight2 = ((oo8) krkVar3).d.getMeasuredHeight() / 2;
                        Context requireContext2 = mmaFighterEventsFragment.requireContext();
                        requireContext2.getClass();
                        int s2 = measuredHeight2 - ao2.s(84, requireContext2);
                        krk krkVar22 = mmaFighterEventsFragment.l;
                        krkVar22.getClass();
                        n layoutManager2 = ((oo8) krkVar22).d.getLayoutManager();
                        if (layoutManager2 instanceof LinearLayoutManager) {
                        }
                        if (linearLayoutManager != null) {
                        }
                    }
                }
                return Unit.a;
            case 8:
                dqc dqcVar = (dqc) this.b;
                DbMmaOrganizationViewCount dbMmaOrganizationViewCount = (DbMmaOrganizationViewCount) this.c;
                glg glgVar4 = (glg) obj;
                glgVar4.getClass();
                dqcVar.b.K(glgVar4, dbMmaOrganizationViewCount);
                return Unit.a;
            case 9:
                String str3 = (String) this.b;
                Function0 function0 = (Function0) this.c;
                b4h b4hVar = (b4h) obj;
                KProperty[] kPropertyArr = y3h.a;
                a4h a4hVar = w3h.u;
                KProperty kProperty = y3h.a[11];
                b4hVar.a(a4hVar, Float.valueOf(1.0f));
                y3h.e(b4hVar, str3);
                b4hVar.a(k3h.b, new m9(null, new ve7(22, function0)));
                return Unit.a;
            case 10:
                dfh dfhVar = (dfh) this.b;
                q50 q50Var = (q50) this.c;
                f4g f4gVar = (f4g) obj;
                float h = ((xnh) dfhVar.d.f).h();
                float intBitsToFloat = Float.intBitsToFloat((int) (f4gVar.r & 4294967295L));
                if (!Float.isNaN(h) && !Float.isNaN(intBitsToFloat) && intBitsToFloat != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    float floatValue = ((Number) q50Var.d()).floatValue();
                    f4gVar.k(ctc.e(f4gVar, floatValue));
                    f4gVar.l(ctc.f(f4gVar, floatValue));
                    f4gVar.s(uaa.h(0.5f, (h + intBitsToFloat) / intBitsToFloat));
                }
                return Unit.a;
            case 11:
                ((tyc) this.b).d.add(new qyc((l4h) this.c, obj));
                return Unit.a;
            case 12:
                Set set = (Set) this.b;
                tyc tycVar = (tyc) this.c;
                if (set.contains(obj)) {
                    x0d x0dVar = tycVar.c;
                    y0d y0dVar = tycVar.e;
                    Object g = x0dVar.g(obj);
                    if (g != null) {
                        if (g instanceof y0d) {
                            y0d y0dVar2 = (y0d) g;
                            Object[] objArr2 = y0dVar2.b;
                            long[] jArr = y0dVar2.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i5 = 0;
                                while (true) {
                                    long j = jArr[i5];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                                        for (int i7 = 0; i7 < i6; i7++) {
                                            if ((255 & j) < 128) {
                                                y0dVar.a((l4h) objArr2[(i5 << 3) + i7]);
                                            }
                                            j >>= 8;
                                        }
                                        if (i6 != 8) {
                                        }
                                    }
                                    if (i5 != length) {
                                        i5++;
                                    }
                                }
                            }
                        } else {
                            y0dVar.a((l4h) g);
                        }
                    }
                }
                return Unit.a;
            case 13:
                File file = (File) this.b;
                k8f k8fVar = (k8f) this.c;
                if (Intrinsics.c((String) obj, file.getName())) {
                    l98.m0(k8fVar, Unit.a);
                }
                return Unit.a;
            case 14:
                a5d a5dVar = (a5d) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                glg glgVar5 = (glg) obj;
                glgVar5.getClass();
                a5dVar.c.f0(glgVar5, arrayList2);
                return Unit.a;
            case 15:
                a5d a5dVar2 = (a5d) this.b;
                DbNatsEvent dbNatsEvent = (DbNatsEvent) this.c;
                glg glgVar6 = (glg) obj;
                glgVar6.getClass();
                a5dVar2.b.a0(glgVar6, dbNatsEvent);
                return Unit.a;
            case 16:
                s6d s6dVar = (s6d) this.b;
                k6d k6dVar = ((k7d) this.c).b;
                v7d v7dVar = (v7d) obj;
                v7dVar.getClass();
                Unit unit = Unit.a;
                t7d t7dVar = v7dVar.a;
                t7dVar.f = 0;
                t7dVar.g = 0;
                t7dVar.h = -1;
                t7dVar.i = -1;
                if (s6dVar instanceof g7d) {
                    int i8 = s6d.f;
                    Iterator it2 = l4a.t(s6dVar).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            s6d s6dVar2 = (s6d) it2.next();
                            s6d f = k6dVar.f();
                            if (Intrinsics.c(s6dVar2, f != null ? f.c : null)) {
                            }
                        } else {
                            int i9 = g7d.h;
                            v7dVar.b = ((s6d) i5h.m(e5h.e(k6dVar.g(), new a7d(i3)))).b.b;
                            v7dVar.c = false;
                            Unit unit2 = Unit.a;
                            v7dVar.c = false;
                            v7dVar.d = true;
                        }
                    }
                }
                return Unit.a;
            case 17:
                return new vx0(i2, (cdi) this.b, (oe3) this.c);
            case 18:
                ((k7d) this.b).g((u6b) this.c);
                return new o20(3);
            case 19:
                y8d y8dVar = (y8d) this.b;
                u7d u7dVar = (u7d) this.c;
                d6d d6dVar = (d6d) obj;
                d6dVar.getClass();
                s6d s6dVar3 = d6dVar.b;
                f6d f6dVar = d6dVar.h;
                if (s6dVar3 == null) {
                    s6dVar3 = null;
                }
                if (s6dVar3 == null || (c = y8dVar.c(s6dVar3, f6dVar.a(), u7dVar)) == null) {
                    return null;
                }
                return c.equals(s6dVar3) ? d6dVar : y8dVar.b().b(c, c.c(f6dVar.a()));
            case 20:
                g9i g9iVar = (g9i) this.b;
                k8f k8fVar2 = (k8f) this.c;
                g9iVar.e(null);
                ((j8f) k8fVar2).d((jn3) obj);
                return Unit.a;
            case 21:
                yfd yfdVar = (yfd) this.b;
                nfd nfdVar = (nfd) this.c;
                vfd vfdVar = (vfd) obj;
                vfdVar.getClass();
                gv9<ghd> gv9Var = vfdVar.a;
                ArrayList arrayList3 = new ArrayList(k13.r(gv9Var, 10));
                for (ghd ghdVar : gv9Var) {
                    if (Intrinsics.c(ghdVar, ((mfd) nfdVar).a)) {
                        ghdVar = ghd.a(ghdVar, !ghdVar.e, false, 47);
                    }
                    arrayList3.add(ghdVar);
                }
                gv9 W = l6g.W(arrayList3);
                return vfd.a(vfdVar, W, yfd.u(yfdVar.n, W), false, false, 0L, 28);
            case 22:
                NotificationsActionButton notificationsActionButton = (NotificationsActionButton) this.b;
                Team team = (Team) this.c;
                ((Boolean) obj).getClass();
                int i10 = NotificationsActionButton.g;
                Context context = notificationsActionButton.getContext();
                context.getClass();
                zic.T(context, team);
                return Unit.a;
            case 23:
                NotificationsActionButton notificationsActionButton2 = (NotificationsActionButton) this.b;
                Player player = (Player) this.c;
                ((Boolean) obj).getClass();
                int i11 = NotificationsActionButton.g;
                Context context2 = notificationsActionButton2.getContext();
                context2.getClass();
                zic.S(context2, player);
                return Unit.a;
            case 24:
                NotificationsActionButton notificationsActionButton3 = (NotificationsActionButton) this.b;
                z21 z21Var = (z21) this.c;
                ((Boolean) obj).getClass();
                int i12 = NotificationsActionButton.g;
                Context context3 = notificationsActionButton3.getContext();
                context3.getClass();
                int i13 = z21Var.a;
                String str4 = z21Var.b;
                if (str4 == null) {
                    str4 = "";
                }
                zic.R(context3, str4, z21Var.c.getSport().getSlug(), i13);
                return Unit.a;
            case 25:
                NotificationsActionButton notificationsActionButton4 = (NotificationsActionButton) this.b;
                Stage stage = (Stage) this.c;
                ((Boolean) obj).getClass();
                int i14 = NotificationsActionButton.g;
                Context context4 = notificationsActionButton4.getContext();
                context4.getClass();
                nv.y(context4, vu.ADD_FAVORITE, xu.STAGE, stage.getId(), notificationsActionButton4.getFollowSource());
                Context context5 = notificationsActionButton4.getContext();
                context5.getClass();
                if (f6a.G(context5)) {
                    Context context6 = notificationsActionButton4.getContext();
                    context6.getClass();
                    zic.W(context6);
                }
                return Unit.a;
            case 26:
                NotificationsActionButton notificationsActionButton5 = (NotificationsActionButton) this.b;
                UniqueStage uniqueStage = (UniqueStage) this.c;
                ((Boolean) obj).getClass();
                int i15 = NotificationsActionButton.g;
                Context context7 = notificationsActionButton5.getContext();
                context7.getClass();
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = context7.getApplicationContext();
                    synchronized (uic.i) {
                        d = a5f.d(applicationContext);
                        uic.j = d;
                    }
                    d.getClass();
                    sharedPreferences = d;
                }
                if (sharedPreferences.getBoolean("PREF_SHOW_FOLLOW_UNIQUE_STAGE_INFO", true)) {
                    Context context8 = notificationsActionButton5.getContext();
                    context8.getClass();
                    if (zic.B(context8)) {
                        zic.E(context8, new h0(4, context8, uniqueStage));
                    } else {
                        zic.a0(context8, uniqueStage);
                    }
                }
                return Unit.a;
            case 27:
                thd thdVar = (thd) this.b;
                DbPendingNotification dbPendingNotification = (DbPendingNotification) this.c;
                glg glgVar7 = (glg) obj;
                glgVar7.getClass();
                thdVar.d.a0(glgVar7, dbPendingNotification);
                return Unit.a;
            case 28:
                ond ondVar = (ond) this.b;
                qhe qheVar = (qhe) this.c;
                phe pheVar = (phe) obj;
                boolean z = ondVar.q;
                float f2 = ondVar.o;
                if (z) {
                    phe.h(pheVar, qheVar, pheVar.e0(f2), pheVar.e0(ondVar.p));
                } else {
                    pheVar.e(qheVar, pheVar.e0(f2), pheVar.e0(ondVar.p), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                return Unit.a;
            default:
                rnd rndVar = (rnd) this.b;
                qhe qheVar2 = (qhe) this.c;
                phe pheVar2 = (phe) obj;
                long j2 = ((r6a) rndVar.o.invoke(pheVar2)).a;
                if (rndVar.p) {
                    phe.i(pheVar2, qheVar2, (int) (j2 >> 32), (int) (j2 & 4294967295L));
                } else {
                    phe.m(pheVar2, qheVar2, (int) (j2 >> 32), (int) (j2 & 4294967295L), null, 12);
                }
                return Unit.a;
        }
    }
}
