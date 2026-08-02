package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import androidx.fragment.app.Fragment;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.EventBestPlayer;
import com.sofascore.model.newNetwork.mediaposts.MediaPost;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.OddsProvider;
import com.sofascore.results.event.dialog.PlayerEventStatisticsModal;
import com.sofascore.results.mma.fightNight.MmaFightNightFragment;
import com.sofascore.results.mma.fighter.matches.MmaFighterEventsFragment;
import com.sofascore.results.mma.mainScreen.MmaEventsWeekFragment;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.c;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class j8c extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public Object t;
    public /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8c(rq3 rq3Var, u8c u8cVar, Event event, MediaPost mediaPost) {
        super(2, rq3Var);
        this.r = 2;
        this.t = u8cVar;
        this.v = mediaPost;
        this.u = event;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x01c7, code lost:
    
        if (r13.c(r14, r9) != r0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00cd, code lost:
    
        if (r13.c(r14, r9) != r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0066, code lost:
    
        if (r4.b(r5, 0, 0, false, null, null, r11, r13) == r0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0095, code lost:
    
        if (r13.b(r2, r3, r4, true, r6, r7, r8, r9) == r0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00b4, code lost:
    
        if (defpackage.cga.U(r9) == r0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01af, code lost:
    
        if (defpackage.cga.U(r9) == r0) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0210 A[LOOP:0: B:38:0x020a->B:40:0x0210, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object e(Object obj) {
        j8c j8cVar;
        e4e e4eVar;
        Iterator it;
        lu3 lu3Var = lu3.a;
        boolean z = true;
        switch (this.s) {
            case 0:
                y6a.M(obj);
                e4e e4eVar2 = (e4e) this.t;
                if (!(e4eVar2 instanceof d4e)) {
                    j8cVar = this;
                    boolean z2 = e4eVar2 instanceof z3e;
                    if (z2) {
                        z3e z3eVar = (z3e) e4eVar2;
                        if (z3eVar.a == sfb.a) {
                            lk0 lk0Var = (lk0) j8cVar.u;
                            List list = z3eVar.b;
                            int i = z3eVar.c;
                            int i2 = z3eVar.d;
                            rfb rfbVar = z3eVar.e;
                            rfb rfbVar2 = z3eVar.f;
                            fb9 fb9Var = ((f6e) j8cVar.v).c;
                            j8cVar.s = 2;
                            break;
                        }
                    }
                    if (z2) {
                        if (((Boolean) ((lk0) j8cVar.u).j.getValue()).booleanValue()) {
                            j8cVar.s = 3;
                            break;
                        }
                        lk0 lk0Var2 = (lk0) j8cVar.u;
                        d7a g = lk0Var2.d.g((e4e) j8cVar.t);
                        j8cVar.s = 4;
                        break;
                    } else {
                        if (!(e4eVar2 instanceof w3e)) {
                            if (e4eVar2 instanceof a4e) {
                                a4e a4eVar = (a4e) e4eVar2;
                                ((lk0) j8cVar.u).e.W(a4eVar.a, a4eVar.b);
                            }
                            e4eVar = (e4e) j8cVar.t;
                            if (!(e4eVar instanceof z3e) || (e4eVar instanceof w3e) || (e4eVar instanceof d4e)) {
                                it = ((lk0) j8cVar.u).f.iterator();
                                while (it.hasNext()) {
                                    ((Function0) it.next()).invoke();
                                }
                            }
                            return Unit.a;
                        }
                        if (((Boolean) ((lk0) j8cVar.u).j.getValue()).booleanValue()) {
                            j8cVar.s = 5;
                            break;
                        }
                        lk0 lk0Var3 = (lk0) j8cVar.u;
                        d7a g2 = lk0Var3.d.g((e4e) j8cVar.t);
                        j8cVar.s = 6;
                        break;
                    }
                    return lu3Var;
                }
                lk0 lk0Var4 = (lk0) this.u;
                List c = a.c(new zvj(0, ((d4e) e4eVar2).a));
                ((d4e) ((e4e) this.t)).getClass();
                fb9 fb9Var2 = ((f6e) this.v).c;
                this.s = 1;
                j8cVar = this;
                break;
                break;
            case 1:
            case 2:
                y6a.M(obj);
                j8cVar = this;
                e4eVar = (e4e) j8cVar.t;
                if (!(e4eVar instanceof z3e)) {
                    break;
                }
                it = ((lk0) j8cVar.u).f.iterator();
                while (it.hasNext()) {
                }
                return Unit.a;
            case 3:
                y6a.M(obj);
                j8cVar = this;
                lk0 lk0Var22 = (lk0) j8cVar.u;
                d7a g3 = lk0Var22.d.g((e4e) j8cVar.t);
                j8cVar.s = 4;
                break;
            case 4:
                y6a.M(obj);
                j8cVar = this;
                hcc hccVar = ((lk0) j8cVar.u).e;
                z3e z3eVar2 = (z3e) ((e4e) j8cVar.t);
                hccVar.W(z3eVar2.e, z3eVar2.f);
                p33 p33Var = (p33) ((jof) ((lk0) j8cVar.u).e.d).a.getValue();
                rfb rfbVar3 = p33Var != null ? p33Var.d : null;
                if (rfbVar3 == null) {
                    a70.r("PagingDataPresenter.combinedLoadStatesCollection.stateFlow should not hold null CombinedLoadStates after Insert event.");
                    return null;
                }
                boolean z3 = rfbVar3.b.a;
                boolean z4 = rfbVar3.c.a;
                z3e z3eVar3 = (z3e) ((e4e) j8cVar.t);
                sfb sfbVar = z3eVar3.a;
                boolean z5 = ((sfbVar == sfb.b && z3) || (sfbVar == sfb.c && z4)) ? false : true;
                List list2 = z3eVar3.b;
                if (list2 == null || !list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!((zvj) it2.next()).b.isEmpty()) {
                                z = false;
                            }
                        }
                    }
                }
                lk0 lk0Var5 = (lk0) j8cVar.u;
                if (!z5) {
                    lk0Var5.h = false;
                } else if (lk0Var5.h || z) {
                    if (!z) {
                        int i3 = ((lk0) j8cVar.u).i;
                        lk0 lk0Var6 = (lk0) j8cVar.u;
                        if (i3 >= lk0Var6.d.c) {
                            int i4 = lk0Var6.i;
                            lk0 lk0Var7 = (lk0) j8cVar.u;
                            f5e f5eVar = lk0Var7.d;
                            if (i4 <= f5eVar.c + f5eVar.b) {
                                lk0Var7.h = false;
                            }
                        }
                    }
                    lk0 lk0Var8 = (lk0) j8cVar.u;
                    fb9 fb9Var3 = lk0Var8.b;
                    if (fb9Var3 != null) {
                        fb9Var3.g(lk0Var8.d.a(lk0Var8.i));
                    }
                }
                e4eVar = (e4e) j8cVar.t;
                if (!(e4eVar instanceof z3e)) {
                }
                it = ((lk0) j8cVar.u).f.iterator();
                while (it.hasNext()) {
                }
                return Unit.a;
            case 5:
                y6a.M(obj);
                j8cVar = this;
                lk0 lk0Var32 = (lk0) j8cVar.u;
                d7a g22 = lk0Var32.d.g((e4e) j8cVar.t);
                j8cVar.s = 6;
                break;
            case 6:
                y6a.M(obj);
                j8cVar = this;
                hcc hccVar2 = ((lk0) j8cVar.u).e;
                ((w3e) ((e4e) j8cVar.t)).getClass();
                hccVar2.getClass();
                throw null;
            default:
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.v;
        switch (i) {
            case 0:
                return new j8c((u8c) this.t, (Event) this.u, (Team) obj2, rq3Var, 0);
            case 1:
                return new j8c((u8c) this.t, (Event) this.u, (EventBestPlayer) obj2, rq3Var, 1);
            case 2:
                return new j8c(rq3Var, (u8c) this.t, (Event) this.u, (MediaPost) obj2);
            case 3:
                return new j8c((b1d) this.t, (MmaEventsWeekFragment) this.u, rq3Var, (MmaEventsWeekFragment) obj2, 3);
            case 4:
                j8c j8cVar = new j8c((nmc) this.u, (String) obj2, rq3Var, 4);
                j8cVar.t = obj;
                return j8cVar;
            case 5:
                return new j8c((b1d) this.t, (MmaFightNightFragment) this.u, rq3Var, (MmaFightNightFragment) obj2, 5);
            case 6:
                return new j8c((b1d) this.t, (MmaFighterEventsFragment) this.u, rq3Var, (MmaFighterEventsFragment) obj2, 6);
            case 7:
                return new j8c((String[]) this.u, (rqa) obj2, rq3Var, 7);
            case 8:
                j8c j8cVar2 = new j8c((File) obj2, rq3Var, 8);
                j8cVar2.u = obj;
                return j8cVar2;
            case 9:
                j8c j8cVar3 = new j8c((fc2) this.u, (yu3) obj2, rq3Var, 9);
                j8cVar3.t = obj;
                return j8cVar3;
            case 10:
                j8c j8cVar4 = new j8c((s5d) obj2, rq3Var, 10);
                j8cVar4.u = obj;
                return j8cVar4;
            case 11:
                j8c j8cVar5 = new j8c((afb) this.u, (s5d) obj2, rq3Var, 11);
                j8cVar5.t = obj;
                return j8cVar5;
            case 12:
                j8c j8cVar6 = new j8c((s5d) this.u, (String) obj2, rq3Var, 12);
                j8cVar6.t = obj;
                return j8cVar6;
            case 13:
                return new j8c((axj) this.t, (koh) this.u, (g0d) obj2, rq3Var, 13);
            case 14:
                return new j8c((o0h) this.t, (e1d) this.u, (xnh) obj2, rq3Var, 14);
            case 15:
                j8c j8cVar7 = new j8c((zm3) this.u, (oad) obj2, rq3Var, 15);
                j8cVar7.t = obj;
                return j8cVar7;
            case 16:
                j8c j8cVar8 = new j8c((Context) this.u, (jid) obj2, rq3Var, 16);
                j8cVar8.t = obj;
                return j8cVar8;
            case 17:
                return new j8c((OddsCountryProvider) this.t, (umd) this.u, (String) obj2, rq3Var, 17);
            case 18:
                return new j8c((fsf) this.t, (IOException) this.u, (g62) obj2, rq3Var, 18);
            case 19:
                j8c j8cVar9 = new j8c((b7) this.u, (znh) obj2, rq3Var, 19);
                j8cVar9.t = obj;
                return j8cVar9;
            case 20:
                return new j8c((e1d) this.t, (e1d) this.u, (e1d) obj2, rq3Var, 20);
            case 21:
                j8c j8cVar10 = new j8c((g62) this.u, (x4e) obj2, rq3Var, 21);
                j8cVar10.t = obj;
                return j8cVar10;
            case 22:
                return new j8c((e4e) this.t, (lk0) this.u, (f6e) obj2, rq3Var, 22);
            case 23:
                return new j8c((roe) this.t, (String) this.u, (Player) obj2, rq3Var, 23);
            case 24:
                return new j8c((b1d) this.t, (PlayerEventStatisticsModal) this.u, rq3Var, (PlayerEventStatisticsModal) obj2, 24);
            case 25:
                return new j8c((fqe) this.t, (Integer) this.u, (Integer) obj2, rq3Var, 25);
            case 26:
                return new j8c((ale) this.t, (uke) this.u, (Function2) obj2, rq3Var, 26);
            case 27:
                return new j8c((fsf) this.u, (g0f) obj2, rq3Var, 27);
            case 28:
                j8c j8cVar11 = new j8c((p1f) this.u, (Activity) obj2, rq3Var, 28);
                j8cVar11.t = obj;
                return j8cVar11;
            default:
                j8c j8cVar12 = new j8c((p1f) this.u, (KClass) obj2, rq3Var, 29);
                j8cVar12.t = obj;
                return j8cVar12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 3:
                ((j8c) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                break;
            case 5:
                ((j8c) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                break;
            case 6:
                ((j8c) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                break;
            case 24:
                ((j8c) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                break;
            case 26:
                ((j8c) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return ((j8c) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0211, code lost:
    
        if (defpackage.xw3.R(r8, r2, r16) == r0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01f8, code lost:
    
        if (r2 == r0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x028f, code lost:
    
        if (defpackage.n4o.y(2000, r16) == r2) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x027b, code lost:
    
        if (defpackage.n4o.y(500, r16) == r2) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x048d, code lost:
    
        if (r0 == r2) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x03c9, code lost:
    
        if (r3 == r2) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0730, code lost:
    
        if (defpackage.v7a.i(r2, r5, r16) == r3) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x070c, code lost:
    
        if (r4 == r3) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0881, code lost:
    
        if (r2.e(r16) == r0) goto L369;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0874, code lost:
    
        if (new defpackage.za2(r5, r6, r7, 8193).d(true, r16) == r0) goto L369;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x0925, code lost:
    
        if (defpackage.v7a.i(r3, r4, r16) == r0) goto L397;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02f3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x02d9 -> B:123:0x02dd). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Set set;
        k8f k8fVar;
        int i;
        q69 q69Var;
        kml kmlVar;
        Object P;
        s5d s5dVar;
        Object R;
        Object R2;
        Function0 l97Var;
        Object e;
        SharedPreferences d;
        Object u;
        Object P2;
        Object P3;
        Object a;
        fsf fsfVar;
        Object w;
        int i2 = 20;
        int i3 = 13;
        int i4 = 11;
        int i5 = 18;
        int i6 = 15;
        int i7 = 0;
        int i8 = 3;
        int i9 = 2;
        int i10 = 1;
        rq3 rq3Var = null;
        switch (this.r) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i11 = this.s;
                if (i11 != 0) {
                    if (i11 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                g39 g39Var = ((u8c) this.t).f;
                int id = ((Event) this.u).getId();
                int id2 = ((Team) this.v).getId();
                this.s = 1;
                g39Var.getClass();
                Object P4 = yaa.P(new w29(g39Var, id, id2, null, 0), this);
                return P4 == lu3Var ? lu3Var : P4;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i12 = this.s;
                if (i12 != 0) {
                    if (i12 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                wve wveVar = ((u8c) this.t).g;
                int id3 = ((Event) this.u).getId();
                int id4 = ((EventBestPlayer) this.v).getPlayer().getId();
                this.s = 1;
                Object j = wveVar.j(id3, id4, this);
                return j == lu3Var2 ? lu3Var2 : j;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i13 = this.s;
                if (i13 != 0) {
                    if (i13 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                u8c u8cVar = (u8c) this.t;
                MediaPost mediaPost = (MediaPost) this.v;
                Event event = (Event) this.u;
                hm7 hm7Var = new hm7(mediaPost, u8cVar, rq3Var, i9);
                this.s = 1;
                Object r = s9a.r(new lua(mediaPost, hm7Var, event, u8cVar, null), this);
                return r == lu3Var3 ? lu3Var3 : r;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i14 = this.s;
                if (i14 == 0) {
                    y6a.M(obj);
                    b1d b1dVar = (b1d) this.t;
                    nk0 nk0Var = new nk0(i5, (MmaEventsWeekFragment) this.u, (MmaEventsWeekFragment) this.v);
                    this.s = 1;
                    if (b1dVar.collect(nk0Var, this) == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i14 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                pvd.x();
                return null;
            case 4:
                nmc nmcVar = (nmc) this.u;
                ku3 ku3Var = (ku3) this.t;
                lu3 lu3Var5 = lu3.a;
                int i15 = this.s;
                if (i15 != 0) {
                    if (i15 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                dl dlVar = new dl(nmcVar, (String) this.v, xw3.t(ku3Var, null, new ppa(nmcVar, rq3Var, i6), 3), null);
                this.t = null;
                this.s = 1;
                Object P5 = yaa.P(dlVar, this);
                return P5 == lu3Var5 ? lu3Var5 : P5;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i16 = this.s;
                if (i16 == 0) {
                    y6a.M(obj);
                    b1d b1dVar2 = (b1d) this.t;
                    nk0 nk0Var2 = new nk0(19, (MmaFightNightFragment) this.u, (MmaFightNightFragment) this.v);
                    this.s = 1;
                    if (b1dVar2.collect(nk0Var2, this) == lu3Var6) {
                        return lu3Var6;
                    }
                } else {
                    if (i16 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                pvd.x();
                return null;
            case 6:
                lu3 lu3Var7 = lu3.a;
                int i17 = this.s;
                if (i17 == 0) {
                    y6a.M(obj);
                    b1d b1dVar3 = (b1d) this.t;
                    nk0 nk0Var3 = new nk0(i2, (MmaFighterEventsFragment) this.u, (MmaFighterEventsFragment) this.v);
                    this.s = 1;
                    if (b1dVar3.collect(nk0Var3, this) == lu3Var7) {
                        return lu3Var7;
                    }
                } else {
                    if (i17 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                pvd.x();
                return null;
            case 7:
                rqa rqaVar = (rqa) this.v;
                lu3 lu3Var8 = lu3.a;
                int i18 = this.s;
                if (i18 == 0) {
                    y6a.M(obj);
                    String[] strArr = (String[]) this.u;
                    Set a0 = ph0.a0(Arrays.copyOf(strArr, strArr.length));
                    aeh aehVar = (aeh) rqaVar.h;
                    this.t = a0;
                    this.s = 1;
                    if (aehVar.emit(a0, this) == lu3Var8) {
                        return lu3Var8;
                    }
                    set = a0;
                } else {
                    if (i18 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    set = (Set) this.t;
                    y6a.M(obj);
                }
                taa taaVar = (taa) rqaVar.c;
                set.getClass();
                ReentrantLock reentrantLock = taaVar.e;
                reentrantLock.lock();
                try {
                    List S0 = CollectionsKt.S0(taaVar.d.values());
                    reentrantLock.unlock();
                    Iterator it = S0.iterator();
                    while (it.hasNext()) {
                        ((vkd) it.next()).a.getClass();
                    }
                    return Unit.a;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 8:
                lu3 lu3Var9 = lu3.a;
                int i19 = this.s;
                if (i19 == 0) {
                    y6a.M(obj);
                    k8fVar = (k8f) this.u;
                    File file = (File) this.v;
                    lsb lsbVar = new lsb(i3, file, k8fVar);
                    Object obj2 = xyc.b;
                    File parentFile = file.getParentFile();
                    parentFile.getClass();
                    String path = parentFile.getCanonicalFile().getPath();
                    synchronized (xyc.b) {
                        try {
                            LinkedHashMap linkedHashMap = xyc.c;
                            Object obj3 = linkedHashMap.get(path);
                            if (obj3 == null) {
                                path.getClass();
                                obj3 = new xyc(path);
                                linkedHashMap.put(path, obj3);
                            }
                            xyc xycVar = (xyc) obj3;
                            xycVar.a.add(lsbVar);
                            i = 1;
                            if (xycVar.a.size() == 1) {
                                xycVar.startWatching();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    q69 q69Var2 = new q69(i, path, lsbVar);
                    Unit unit = Unit.a;
                    this.u = k8fVar;
                    this.t = q69Var2;
                    this.s = 1;
                    if (((j8f) k8fVar).e.q(this, unit) != lu3Var9) {
                        q69Var = q69Var2;
                    }
                    return lu3Var9;
                }
                if (i19 != 1) {
                    if (i19 == 2) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                q69Var = (q69) this.t;
                k8fVar = (k8f) this.u;
                y6a.M(obj);
                xxb xxbVar = new xxb(q69Var, 9);
                this.u = null;
                this.t = null;
                this.s = 2;
                break;
            case 9:
                lu3 lu3Var10 = lu3.a;
                int i20 = this.s;
                if (i20 == 0) {
                    y6a.M(obj);
                    kmlVar = (kml) this.t;
                    fc2 fc2Var = (fc2) this.u;
                    yu3 yu3Var = (yu3) this.v;
                    hc2 hc2Var = kmlVar.a;
                    this.t = kmlVar;
                    this.s = 1;
                    fc2 fc2Var2 = jzc.a;
                    break;
                } else {
                    if (i20 != 1) {
                        if (i20 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kmlVar = (kml) this.t;
                    y6a.M(obj);
                }
                hc2 hc2Var2 = kmlVar.a;
                this.t = null;
                this.s = 2;
                break;
            case 10:
                ku3 ku3Var2 = (ku3) this.u;
                lu3 lu3Var11 = lu3.a;
                int i21 = this.s;
                if (i21 == 0) {
                    y6a.M(obj);
                    p4d p4dVar = ((s5d) this.v).e;
                    if (p4dVar != null && p4dVar.U != 3) {
                        return p4dVar;
                    }
                    qvd qvdVar = new qvd();
                    qvdVar.c = dmi.y(((s5d) this.v).a.getPackageName(), " 26.07.20");
                    s5d s5dVar2 = (s5d) this.v;
                    qvdVar.r = new i1(s5dVar2, 1);
                    k5d k5dVar = new k5d(ku3Var2, qvdVar, s5dVar2, null, 0);
                    this.u = null;
                    this.t = s5dVar2;
                    this.s = 1;
                    P = yaa.P(k5dVar, this);
                    if (P == lu3Var11) {
                        return lu3Var11;
                    }
                    s5dVar = s5dVar2;
                } else {
                    if (i21 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    s5dVar = (s5d) this.t;
                    y6a.M(obj);
                    P = obj;
                }
                x2g x2gVar = (x2g) P;
                if (x2gVar instanceof t2g) {
                    s38 a2 = s38.a();
                    Throwable th3 = ((t2g) x2gVar).a;
                    th3.getClass();
                    a2.c(new t5d(th3));
                }
                s5dVar.e = (p4d) yaa.x(x2gVar);
                return ((s5d) this.v).e;
            case 11:
                afb afbVar = (afb) this.u;
                ArrayList arrayList = afbVar.i;
                JSONObject jSONObject = (JSONObject) this.t;
                lu3 lu3Var12 = lu3.a;
                int i22 = this.s;
                if (i22 == 0) {
                    y6a.M(obj);
                    hs4 hs4Var = z45.a;
                    k50 k50Var = new k50(jSONObject, (s5d) this.v, arrayList, null, 13);
                    this.t = null;
                    this.s = 1;
                    R = xw3.R(hs4Var, k50Var, this);
                    if (R == lu3Var12) {
                        return lu3Var12;
                    }
                } else {
                    if (i22 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    R = obj;
                }
                Pair pair = (Pair) R;
                if (pair != null) {
                    int intValue = ((Number) pair.a).intValue();
                    Object obj4 = pair.b;
                    Integer M = z8e.M(arrayList, new bvb(intValue, 5));
                    if (M != null) {
                        afbVar.notifyItemChanged(M.intValue() + afbVar.g.size(), obj4);
                    }
                }
                return Unit.a;
            case 12:
                String str = (String) this.v;
                k8f k8fVar2 = (k8f) this.t;
                lu3 lu3Var13 = lu3.a;
                int i23 = this.s;
                if (i23 == 0) {
                    y6a.M(obj);
                    s5d s5dVar3 = (s5d) this.u;
                    this.t = k8fVar2;
                    this.s = 1;
                    hs4 hs4Var2 = z45.a;
                    R2 = xw3.R(hq4.c, new mj5(s5dVar3, rq3Var, 8), this);
                    break;
                } else {
                    if (i23 != 1) {
                        if (i23 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    R2 = obj;
                }
                x4d x4dVar = (x4d) R2;
                ugj.a.getClass();
                if (x4dVar != null) {
                    try {
                        x4dVar.b(str, new o5d(k8fVar2));
                    } catch (CancellationException e2) {
                        throw e2;
                    } catch (Throwable unused) {
                    }
                }
                ixa ixaVar = new ixa(i5, str, x4dVar);
                this.t = null;
                this.s = 2;
                break;
            case 13:
                axj axjVar = (axj) this.t;
                lu3 lu3Var14 = lu3.a;
                int i24 = this.s;
                if (i24 == 0) {
                    y6a.M(obj);
                    pog y = sea.y(new c7d(axjVar, i7));
                    m70 m70Var = new m70(axjVar, (koh) this.u, (g0d) this.v);
                    this.s = 1;
                    Object collect = y.collect(new vj0(m70Var, 27), this);
                    if (collect != lu3Var14) {
                        collect = Unit.a;
                    }
                    if (collect == lu3Var14) {
                        return lu3Var14;
                    }
                } else {
                    if (i24 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 14:
                e1d e1dVar = (e1d) this.u;
                lu3 lu3Var15 = lu3.a;
                int i25 = this.s;
                if (i25 == 0) {
                    y6a.M(obj);
                    if (((List) e1dVar.getValue()).size() > 1) {
                        d6d d6dVar = (d6d) ((List) e1dVar.getValue()).get(((List) e1dVar.getValue()).size() - 2);
                        o0h o0hVar = (o0h) this.t;
                        float h = ((xnh) this.v).h();
                        this.s = 1;
                        if (o0hVar.X(h, d6dVar, this) == lu3Var15) {
                            return lu3Var15;
                        }
                    }
                } else {
                    if (i25 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 15:
                lu3 lu3Var16 = lu3.a;
                int i26 = this.s;
                if (i26 == 0) {
                    y6a.M(obj);
                    k8f k8fVar3 = (k8f) this.t;
                    NetworkRequest a3 = ((zm3) this.u).a();
                    if (a3 == null) {
                        jbd jbdVar = ((zm3) this.u).a;
                        if (jbdVar == jbd.a) {
                            a3 = null;
                        } else {
                            NetworkRequest.Builder removeCapability = new NetworkRequest.Builder().addCapability(12).addCapability(16).removeCapability(15).removeCapability(13);
                            if (Build.VERSION.SDK_INT < 30 || jbdVar != jbd.f) {
                                int ordinal = jbdVar.ordinal();
                                if (ordinal == 2) {
                                    removeCapability = removeCapability.addCapability(11);
                                } else if (ordinal == 3) {
                                    removeCapability = removeCapability.addCapability(18);
                                } else if (ordinal == 4) {
                                    removeCapability = removeCapability.addTransportType(0);
                                }
                                a3 = removeCapability.build();
                            } else {
                                a3 = removeCapability.addCapability(25).build();
                            }
                        }
                    }
                    if (a3 == null) {
                        j8f j8fVar = (j8f) k8fVar3;
                        j8fVar.getClass();
                        j8fVar.r(null);
                        return Unit.a;
                    }
                    lsb lsbVar2 = new lsb(i2, xw3.L(k8fVar3, null, null, new gjb((oad) this.v, k8fVar3, rq3Var, i6), 3), k8fVar3);
                    if (Build.VERSION.SDK_INT >= 30) {
                        eeh eehVar = eeh.a;
                        ConnectivityManager connectivityManager = ((oad) this.v).a;
                        eehVar.getClass();
                        synchronized (eeh.b) {
                            try {
                                LinkedHashMap linkedHashMap2 = eeh.c;
                                boolean isEmpty = linkedHashMap2.isEmpty();
                                linkedHashMap2.put(lsbVar2, a3);
                                if (isEmpty) {
                                    rik o = rik.o();
                                    int i27 = kbl.a;
                                    o.getClass();
                                    connectivityManager.registerDefaultNetworkCallback(eehVar);
                                } else if (eeh.e && eeh.f != null) {
                                    rik o2 = rik.o();
                                    int i28 = kbl.a;
                                    o2.getClass();
                                    lsbVar2.invoke(eeh.a(a3, eeh.d) ? hn3.a : new in3(7));
                                }
                                Unit unit2 = Unit.a;
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                        l97Var = new deh(i7, lsbVar2, connectivityManager);
                    } else {
                        int i29 = c2a.c;
                        ConnectivityManager connectivityManager2 = ((oad) this.v).a;
                        c2a c2aVar = new c2a(lsbVar2);
                        asf asfVar = new asf();
                        try {
                            rik o3 = rik.o();
                            int i30 = kbl.a;
                            o3.getClass();
                            connectivityManager2.registerNetworkCallback(a3, c2aVar);
                            asfVar.a = true;
                        } catch (RuntimeException e3) {
                            if (!c.n(e3.getClass().getName(), "TooManyRequestsException", false)) {
                                throw e3;
                            }
                            rik o4 = rik.o();
                            int i31 = kbl.a;
                            o4.getClass();
                            lsbVar2.invoke(new in3(7));
                        }
                        l97Var = new l97(9, asfVar, connectivityManager2, c2aVar);
                    }
                    ve7 ve7Var = new ve7(24, l97Var);
                    this.s = 1;
                    if (v7a.i(k8fVar3, ve7Var, this) == lu3Var16) {
                        return lu3Var16;
                    }
                } else {
                    if (i26 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 16:
                ku3 ku3Var3 = (ku3) this.t;
                lu3 lu3Var17 = lu3.a;
                int i32 = this.s;
                if (i32 == 0) {
                    y6a.M(obj);
                    Context context = (Context) this.u;
                    context.getClass();
                    SharedPreferences sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                        Context applicationContext = context.getApplicationContext();
                        synchronized (uic.i) {
                            d = a5f.d(applicationContext);
                            uic.j = d;
                        }
                        d.getClass();
                        sharedPreferences = d;
                    }
                    if (sharedPreferences.getBoolean("INIT_DONE", false)) {
                        wve wveVar2 = ((jid) this.v).d;
                        this.t = ku3Var3;
                        this.s = 1;
                        e = wveVar2.e(this);
                        break;
                    }
                    return Unit.a;
                }
                if (i32 != 1) {
                    if (i32 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    u = obj;
                    Iterable iterable = (Iterable) u;
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it2 = iterable.iterator();
                        while (it2.hasNext()) {
                            if (!((Boolean) it2.next()).booleanValue()) {
                                SharedPreferences.Editor edit = ((jid) this.v).i.edit();
                                edit.getClass();
                                edit.putBoolean("RETRY_PLAYERS", i7 ^ 1);
                                edit.apply();
                                return Unit.a;
                            }
                        }
                    }
                    i7 = 1;
                    SharedPreferences.Editor edit2 = ((jid) this.v).i.edit();
                    edit2.getClass();
                    edit2.putBoolean("RETRY_PLAYERS", i7 ^ 1);
                    edit2.apply();
                    return Unit.a;
                }
                y6a.M(obj);
                e = obj;
                Map map = (Map) e;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (((Boolean) entry.getValue()).booleanValue()) {
                        linkedHashMap3.put(entry.getKey(), entry.getValue());
                    }
                }
                ArrayList arrayList2 = new ArrayList(linkedHashMap3.size());
                Iterator it3 = linkedHashMap3.entrySet().iterator();
                while (it3.hasNext()) {
                    w1l.A(arrayList2, ((Number) ((Map.Entry) it3.next()).getKey()).intValue());
                }
                HashSet Q0 = CollectionsKt.Q0(arrayList2);
                ArrayList arrayList3 = new ArrayList(map.size());
                Iterator it4 = map.entrySet().iterator();
                while (it4.hasNext()) {
                    w1l.A(arrayList3, ((Number) ((Map.Entry) it4.next()).getKey()).intValue());
                }
                HashSet Q02 = CollectionsKt.Q0(arrayList3);
                Q02.removeAll(Q0);
                List j2 = b.j(xw3.t(ku3Var3, null, new did((jid) this.v, Q0, rq3Var, i9), 3), xw3.t(ku3Var3, null, new did((jid) this.v, Q02, rq3Var, i8), 3));
                this.t = null;
                this.s = 2;
                u = m6k.u(j2, this);
                break;
            case 17:
                lu3 lu3Var18 = lu3.a;
                int i33 = this.s;
                if (i33 == 0) {
                    y6a.M(obj);
                    dmd dmdVar = new dmd((umd) this.u, (String) this.v, OddsProvider.getOddsDisplayProviderId$default(((OddsCountryProvider) this.t).getProvider(), null, 1, null), (rq3) null, 2);
                    this.s = 1;
                    P2 = yaa.P(dmdVar, this);
                    if (P2 == lu3Var18) {
                        return lu3Var18;
                    }
                } else {
                    if (i33 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    P2 = obj;
                }
                return yaa.x((x2g) P2);
            case 18:
                lu3 lu3Var19 = lu3.a;
                int i34 = this.s;
                if (i34 == 0) {
                    y6a.M(obj);
                    ((fsf) this.t).a = (IOException) this.u;
                    g62 g62Var = (g62) this.v;
                    Unit unit3 = Unit.a;
                    this.s = 1;
                    if (g62Var.q(this, unit3) == lu3Var19) {
                        return lu3Var19;
                    }
                } else {
                    if (i34 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 19:
                ku3 ku3Var4 = (ku3) this.t;
                lu3 lu3Var20 = lu3.a;
                int i35 = this.s;
                if (i35 == 0) {
                    y6a.M(obj);
                    if (s9a.w(ku3Var4)) {
                    }
                } else {
                    if (i35 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    znh znhVar = (znh) this.v;
                    znhVar.i((znhVar.h() + 1) % ((b7) this.u).size());
                    if (s9a.w(ku3Var4)) {
                        this.t = ku3Var4;
                        this.s = 1;
                        if (n4o.y(1677L, this) == lu3Var20) {
                            return lu3Var20;
                        }
                        znh znhVar2 = (znh) this.v;
                        znhVar2.i((znhVar2.h() + 1) % ((b7) this.u).size());
                        if (s9a.w(ku3Var4)) {
                            return Unit.a;
                        }
                    }
                }
            case 20:
                e1d e1dVar2 = (e1d) this.u;
                lu3 lu3Var21 = lu3.a;
                int i36 = this.s;
                if (i36 == 0) {
                    y6a.M(obj);
                    this.s = 1;
                    break;
                } else {
                    if (i36 != 1) {
                        if (i36 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        if (!((Boolean) e1dVar2.getValue()).booleanValue()) {
                            ((e1d) this.v).setValue(Boolean.TRUE);
                            e1dVar2.setValue(Boolean.FALSE);
                        }
                        return Unit.a;
                    }
                    y6a.M(obj);
                }
                ((e1d) this.t).setValue(Boolean.TRUE);
                this.s = 2;
                break;
            case 21:
                lu3 lu3Var22 = lu3.a;
                int i37 = this.s;
                if (i37 == 0) {
                    y6a.M(obj);
                    ku3 ku3Var5 = (ku3) this.t;
                    nn2 x = f5p.x((g62) this.u);
                    f10 f10Var = new f10((x4e) this.v, ku3Var5);
                    this.s = 1;
                    if (x.collect(f10Var, this) == lu3Var22) {
                        return lu3Var22;
                    }
                } else {
                    if (i37 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 22:
                return e(obj);
            case 23:
                roe roeVar = (roe) this.t;
                lu3 lu3Var23 = lu3.a;
                int i38 = this.s;
                rq3 rq3Var2 = null;
                if (i38 == 0) {
                    y6a.M(obj);
                    e64 e64Var = roeVar.g;
                    String str2 = (String) this.u;
                    this.s = 1;
                    e64Var.getClass();
                    P3 = yaa.P(new d64(e64Var, str2, rq3Var2, i10), this);
                    break;
                } else {
                    if (i38 != 1) {
                        if (i38 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    P3 = obj;
                }
                hs4 hs4Var3 = z45.a;
                k50 k50Var2 = new k50((x2g) P3, roeVar, (Player) this.v, rq3Var2, 16);
                this.s = 2;
                break;
            case 24:
                lu3 lu3Var24 = lu3.a;
                int i39 = this.s;
                if (i39 == 0) {
                    y6a.M(obj);
                    b1d b1dVar4 = (b1d) this.t;
                    nk0 nk0Var4 = new nk0(28, (PlayerEventStatisticsModal) this.u, (PlayerEventStatisticsModal) this.v);
                    this.s = 1;
                    if (b1dVar4.collect(nk0Var4, this) == lu3Var24) {
                        return lu3Var24;
                    }
                } else {
                    if (i39 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                pvd.x();
                return null;
            case 25:
                lu3 lu3Var25 = lu3.a;
                int i40 = this.s;
                if (i40 != 0) {
                    if (i40 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                fqe fqeVar = (fqe) this.t;
                int intValue2 = ((Integer) this.u).intValue();
                int intValue3 = ((Integer) this.v).intValue();
                this.s = 1;
                yzd yzdVar = fqe.B;
                Serializable o5 = fqeVar.o(intValue2, intValue3, this);
                return o5 == lu3Var25 ? lu3Var25 : o5;
            case 26:
                lu3 lu3Var26 = lu3.a;
                int i41 = this.s;
                if (i41 != 0) {
                    if (i41 == 1) {
                        throw wt3.i(obj);
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                ale aleVar = (ale) this.t;
                uke ukeVar = (uke) this.u;
                Function2 function2 = (Function2) this.v;
                this.s = 1;
                t6a.z(aleVar, ukeVar, function2, this);
                return lu3Var26;
            case 27:
                lu3 lu3Var27 = lu3.a;
                int i42 = this.s;
                if (i42 == 0) {
                    y6a.M(obj);
                    fsf fsfVar2 = (fsf) this.u;
                    g0f g0fVar = (g0f) this.v;
                    this.t = fsfVar2;
                    this.s = 1;
                    a = g0fVar.a(this);
                    if (a == lu3Var27) {
                        return lu3Var27;
                    }
                    fsfVar = fsfVar2;
                } else {
                    if (i42 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fsfVar = (fsf) this.t;
                    y6a.M(obj);
                    a = obj;
                }
                fsfVar.a = a;
                return Unit.a;
            case 28:
                p1f p1fVar = (p1f) this.u;
                yzc yzcVar = p1fVar.c;
                ku3 ku3Var6 = (ku3) this.t;
                lu3 lu3Var28 = lu3.a;
                int i43 = this.s;
                if (i43 == 0) {
                    y6a.M(obj);
                    av4 t = xw3.t(ku3Var6, null, new n1f(p1fVar, (Activity) this.v, null), 3);
                    this.t = null;
                    this.s = 1;
                    w = t.w(this);
                    if (w == lu3Var28) {
                        return lu3Var28;
                    }
                } else {
                    if (i43 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    w = obj;
                }
                b7 b7Var = (b7) w;
                b7 b7Var2 = p1fVar.f;
                b7Var2.getClass();
                b7Var.getClass();
                p1fVar.f = b7Var2.c(b7Var);
                if (yzcVar.d() == null) {
                    yzcVar.k(CollectionsKt.firstOrNull(p1fVar.f));
                }
                return Unit.a;
            default:
                p1f p1fVar2 = (p1f) this.u;
                yzc yzcVar2 = p1fVar2.c;
                ku3 ku3Var7 = (ku3) this.t;
                lu3 lu3Var29 = lu3.a;
                int i44 = this.s;
                if (i44 == 0) {
                    y6a.M(obj);
                    p1fVar2.h = xw3.L(ku3Var7, null, null, new u41(i9, rq3Var, i4), 3);
                    b7 b7Var3 = p1fVar2.f;
                    KClass kClass = (KClass) this.v;
                    ArrayList arrayList4 = new ArrayList();
                    ListIterator<Object> listIterator = b7Var3.listIterator(0);
                    while (listIterator.hasNext()) {
                        Object next = listIterator.next();
                        if (!Intrinsics.c(duf.a.getOrCreateKotlinClass(((j1f) next).getClass()), kClass)) {
                            arrayList4.add(next);
                        }
                    }
                    p1fVar2.f = l6g.Z(arrayList4);
                    g9i g9iVar = p1fVar2.h;
                    if (g9iVar != null) {
                        this.t = null;
                        this.s = 1;
                        if (g9iVar.Z(this) == lu3Var29) {
                            return lu3Var29;
                        }
                    }
                } else {
                    if (i44 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                if (yzcVar2.d() == null) {
                    yzcVar2.k(CollectionsKt.firstOrNull(p1fVar2.f));
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j8c(b1d b1dVar, Fragment fragment, rq3 rq3Var, Fragment fragment2, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = b1dVar;
        this.u = fragment;
        this.v = fragment2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j8c(Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.v = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j8c(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = obj;
        this.v = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j8c(Object obj, Object obj2, Object obj3, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
        this.u = obj2;
        this.v = obj3;
    }
}
