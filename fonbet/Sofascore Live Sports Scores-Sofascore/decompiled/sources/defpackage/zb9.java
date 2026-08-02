package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.EventListResponse;
import com.sofascore.model.newNetwork.statistics.season.player.PlayerCareerStatisticsResponse;
import com.sofascore.model.newNetwork.topperformance.TopPerformanceResponse;
import com.sofascore.model.newNetwork.topperformance.response.TopPerformanceStatistics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zb9 extends hoi implements Function2 {
    public final /* synthetic */ int r = 1;
    public int s;
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;
    public Object v;
    public Object w;
    public /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb9(koh kohVar, int i, int i2, Function0 function0, znh znhVar, e1d e1dVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.v = kohVar;
        this.t = i;
        this.u = i2;
        this.w = function0;
        this.x = znhVar;
        this.y = e1dVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.y;
        switch (i) {
            case 0:
                return new zb9((ac9) this.w, (ulj) this.x, this.t, this.u, (Context) obj2, rq3Var);
            case 1:
                zb9 zb9Var = new zb9(this.t, this.u, rq3Var, (w3b) obj2);
                zb9Var.x = obj;
                return zb9Var;
            case 2:
                return new zb9((ome) this.w, this.t, this.u, (String) this.x, (String) obj2, rq3Var);
            case 3:
                int i2 = this.u;
                zb9 zb9Var2 = new zb9((mpe) this.x, this.t, (fqe) obj2, i2, rq3Var);
                zb9Var2.w = obj;
                return zb9Var2;
            case 4:
                return new zb9((koh) this.v, this.t, this.u, (Function0) this.w, (znh) this.x, (e1d) obj2, rq3Var);
            default:
                int i3 = this.u;
                return new zb9((mwj) this.w, (onk) this.x, this.t, (t6e) obj2, i3, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((zb9) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x0280, code lost:
    
        if (r0 == r12) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02a5, code lost:
    
        if (r0 == r12) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02c9, code lost:
    
        if (r0 == r12) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0219, code lost:
    
        if (((java.lang.Boolean) r0).booleanValue() != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x020f, code lost:
    
        if (r0 == r4) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01f8, code lost:
    
        if (r5 == r4) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e1, code lost:
    
        if (r6 == r4) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [km5] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.ArrayList] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object T;
        Object V;
        Object U;
        yzc yzcVar;
        yzc yzcVar2;
        yzc yzcVar3;
        Object obj2;
        yzc yzcVar4;
        av4 t;
        zu4 t2;
        Object w;
        Object T2;
        Object T3;
        Object k;
        yzc yzcVar5;
        Object a;
        mwj mwjVar;
        Object b;
        List<Event> events;
        zb9 zb9Var = this;
        int i = zb9Var.r;
        boolean z = false;
        int i2 = zb9Var.u;
        int i3 = zb9Var.t;
        Object obj3 = zb9Var.y;
        List list = null;
        r10 = null;
        Object obj4 = null;
        list = null;
        list = null;
        switch (i) {
            case 0:
                Context context = (Context) obj3;
                ac9 ac9Var = (ac9) zb9Var.w;
                lu3 lu3Var = lu3.a;
                int i4 = zb9Var.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    yzc yzcVar6 = ac9Var.f;
                    int ordinal = ((ulj) zb9Var.x).ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal == 2) {
                                w3b w3bVar = ac9Var.e;
                                String str = ac9.l;
                                String str2 = ac9Var.k;
                                zb9Var.v = yzcVar6;
                                zb9Var.s = 3;
                                U = w3bVar.U(zb9Var.t, zb9Var.u, zb9Var, str, str2);
                                yzcVar4 = yzcVar6;
                                break;
                            } else {
                                zzl.b();
                                break;
                            }
                        } else {
                            w3b w3bVar2 = ac9Var.e;
                            String str3 = ac9.l;
                            zb9Var.v = yzcVar6;
                            zb9Var.s = 2;
                            V = w3bVar2.V(i3, i2, zb9Var, str3);
                            yzcVar2 = yzcVar6;
                            break;
                        }
                    } else {
                        w3b w3bVar3 = ac9Var.e;
                        String str4 = ac9.l;
                        String str5 = ac9Var.k;
                        zb9Var.v = yzcVar6;
                        zb9Var.s = 1;
                        T = w3bVar3.T(zb9Var.t, zb9Var.u, zb9Var, str4, str5);
                        yzcVar = yzcVar6;
                        break;
                    }
                    break;
                } else if (i4 == 1) {
                    yzc yzcVar7 = (yzc) zb9Var.v;
                    y6a.M(obj);
                    yzcVar = yzcVar7;
                    T = obj;
                    TopPerformanceResponse topPerformanceResponse = (TopPerformanceResponse) T;
                    yzcVar3 = yzcVar;
                    if (topPerformanceResponse != null) {
                        list = uic.s(context, (TopPerformanceStatistics) topPerformanceResponse.getTopPerformanceItems());
                        yzcVar3 = yzcVar;
                    }
                } else if (i4 == 2) {
                    yzc yzcVar8 = (yzc) zb9Var.v;
                    y6a.M(obj);
                    yzcVar2 = yzcVar8;
                    V = obj;
                    TopPerformanceResponse topPerformanceResponse2 = (TopPerformanceResponse) V;
                    yzcVar3 = yzcVar2;
                    if (topPerformanceResponse2 != null) {
                        list = lpj.a(context, (TopPerformanceStatistics) topPerformanceResponse2.getTopPerformanceItems());
                        yzcVar3 = yzcVar2;
                    }
                } else if (i4 != 3) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    yzc yzcVar9 = (yzc) zb9Var.v;
                    y6a.M(obj);
                    yzcVar4 = yzcVar9;
                    U = obj;
                    TopPerformanceResponse topPerformanceResponse3 = (TopPerformanceResponse) U;
                    yzcVar3 = yzcVar4;
                    if (topPerformanceResponse3 != null) {
                        list = snj.b(context, (TopPerformanceStatistics) topPerformanceResponse3.getTopPerformanceItems(), ac9Var.k);
                        yzcVar3 = yzcVar4;
                    }
                }
                if (list != null) {
                    obj2 = new ArrayList();
                    for (Object obj5 : list) {
                        if (!((rlj) obj5).f0().isEmpty()) {
                            obj2.add(obj5);
                        }
                    }
                } else {
                    obj2 = km5.a;
                }
                yzcVar3.j(obj2);
                break;
            case 1:
                w3b w3bVar4 = (w3b) obj3;
                ku3 ku3Var = (ku3) zb9Var.x;
                lu3 lu3Var2 = lu3.a;
                int i5 = zb9Var.s;
                rq3 rq3Var = null;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 == 3) {
                                y6a.M(obj);
                                T3 = obj;
                                break;
                            } else {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                break;
                            }
                        } else {
                            t2 = (zu4) zb9Var.w;
                            y6a.M(obj);
                            T2 = obj;
                            if (!((Boolean) T2).booleanValue()) {
                                zb9Var.x = null;
                                zb9Var.v = null;
                                zb9Var.w = null;
                                zb9Var.s = 3;
                                T3 = t2.T(zb9Var);
                                break;
                            }
                            z = true;
                            break;
                        }
                    } else {
                        t2 = (zu4) zb9Var.w;
                        av4 av4Var = (av4) zb9Var.v;
                        y6a.M(obj);
                        t = av4Var;
                        w = obj;
                    }
                } else {
                    y6a.M(obj);
                    int i6 = zb9Var.t;
                    int i7 = zb9Var.u;
                    av4 t3 = xw3.t(ku3Var, null, new c1b(w3bVar4, i6, i7, rq3Var, 1), 3);
                    t = xw3.t(ku3Var, null, new c1b(w3bVar4, i6, i7, rq3Var, 2), 3);
                    t2 = xw3.t(ku3Var, null, new c1b(w3bVar4, i6, i7, rq3Var, 0), 3);
                    zb9Var.x = null;
                    zb9Var.v = t;
                    zb9Var.w = t2;
                    zb9Var.s = 1;
                    w = t3.w(zb9Var);
                    break;
                }
                if (!((Boolean) w).booleanValue()) {
                    zb9Var.x = null;
                    zb9Var.v = null;
                    zb9Var.w = t2;
                    zb9Var.s = 2;
                    T2 = t.T(zb9Var);
                    break;
                }
                z = true;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i8 = zb9Var.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    ome omeVar = (ome) zb9Var.w;
                    yzc yzcVar10 = omeVar.f;
                    wve wveVar = omeVar.e;
                    String str6 = (String) zb9Var.x;
                    zb9Var.v = yzcVar10;
                    zb9Var.s = 1;
                    k = wveVar.k(i3, i2, zb9Var, str6);
                    if (k == lu3Var3) {
                        break;
                    } else {
                        yzcVar5 = yzcVar10;
                    }
                } else if (i8 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    yzcVar5 = (yzc) zb9Var.v;
                    y6a.M(obj);
                    k = obj;
                }
                PlayerCareerStatisticsResponse playerCareerStatisticsResponse = (PlayerCareerStatisticsResponse) k;
                yzcVar5.j(playerCareerStatisticsResponse != null ? jse.a(playerCareerStatisticsResponse, (String) obj3) : null);
                break;
            case 3:
                fqe fqeVar = (fqe) obj3;
                ku3 ku3Var2 = (ku3) zb9Var.w;
                lu3 lu3Var4 = lu3.a;
                int i9 = zb9Var.s;
                if (i9 != 0) {
                    if (i9 == 1) {
                        mpe mpeVar = (mpe) zb9Var.v;
                        y6a.M(obj);
                        break;
                    } else {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    y6a.M(obj);
                    mpe mpeVar2 = (mpe) zb9Var.x;
                    if (mpeVar2 == null) {
                        mpeVar2 = new mpe(i3);
                    }
                    mpe mpeVar3 = mpeVar2;
                    rq3 rq3Var2 = null;
                    List j = b.j(xw3.t(ku3Var2, null, new zpe(fqeVar, zb9Var.u, zb9Var.t, mpeVar3, rq3Var2, 0), 3), xw3.t(ku3Var2, null, new zpe(fqeVar, zb9Var.u, zb9Var.t, mpeVar3, rq3Var2, 1), 3));
                    zb9Var.w = null;
                    zb9Var.v = mpeVar3;
                    zb9Var.s = 1;
                    if (m6k.u(j, zb9Var) == lu3Var4) {
                        break;
                    } else {
                        break;
                    }
                }
            case 4:
                lu3 lu3Var5 = lu3.a;
                int i10 = zb9Var.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    q50 q50Var = (q50) ((koh) zb9Var.v).get("path_clip_progress");
                    if (q50Var != null) {
                        Float f = new Float(i3 / i2);
                        i4k h0 = s02.h0(((Number) ((Function0) zb9Var.w).invoke()).intValue(), 0, jg5.d, 2);
                        zb9Var.s = 1;
                        a = q50.a(q50Var, f, h0, null, this, 12);
                        zb9Var = this;
                        if (a == lu3Var5) {
                            break;
                        }
                    }
                    ((znh) zb9Var.x).i(i3);
                    ((e1d) obj3).setValue(Boolean.TRUE);
                    break;
                } else if (i10 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    y6a.M(obj);
                    a = obj;
                }
                ((znh) zb9Var.x).i(i3);
                ((e1d) obj3).setValue(Boolean.TRUE);
            default:
                lu3 lu3Var6 = lu3.a;
                int i11 = zb9Var.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    mwjVar = (mwj) zb9Var.w;
                    onk onkVar = (onk) zb9Var.x;
                    unk unkVar = onkVar.e;
                    String str7 = onkVar.j;
                    String t6eVar = ((t6e) obj3).toString();
                    zb9Var.v = mwjVar;
                    zb9Var.s = 1;
                    b = unkVar.b(zb9Var.t, zb9Var.u, zb9Var, str7, t6eVar);
                    if (b == lu3Var6) {
                        break;
                    }
                } else if (i11 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mwj mwjVar2 = (mwj) zb9Var.v;
                    y6a.M(obj);
                    mwjVar = mwjVar2;
                    b = obj;
                }
                EventListResponse eventListResponse = (EventListResponse) b;
                if (eventListResponse != null && (events = eventListResponse.getEvents()) != null) {
                    obj4 = CollectionsKt.B0(events);
                }
                if (obj4 == null) {
                    obj4 = km5.a;
                }
                mwjVar.invoke(obj4);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb9(ac9 ac9Var, ulj uljVar, int i, int i2, Context context, rq3 rq3Var) {
        super(2, rq3Var);
        this.w = ac9Var;
        this.x = uljVar;
        this.t = i;
        this.u = i2;
        this.y = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb9(ome omeVar, int i, int i2, String str, String str2, rq3 rq3Var) {
        super(2, rq3Var);
        this.w = omeVar;
        this.t = i;
        this.u = i2;
        this.x = str;
        this.y = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb9(mpe mpeVar, int i, fqe fqeVar, int i2, rq3 rq3Var) {
        super(2, rq3Var);
        this.x = mpeVar;
        this.t = i;
        this.y = fqeVar;
        this.u = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb9(int i, int i2, rq3 rq3Var, w3b w3bVar) {
        super(2, rq3Var);
        this.y = w3bVar;
        this.t = i;
        this.u = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb9(mwj mwjVar, onk onkVar, int i, t6e t6eVar, int i2, rq3 rq3Var) {
        super(2, rq3Var);
        this.w = mwjVar;
        this.x = onkVar;
        this.t = i;
        this.y = t6eVar;
        this.u = i2;
    }
}
