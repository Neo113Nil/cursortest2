package defpackage;

import com.sofascore.model.database.DbEvent;
import com.sofascore.model.database.DbEventAll;
import com.sofascore.model.database.DbEventKt;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Stage;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qa6 {
    public final v76 a;

    public qa6(v76 v76Var) {
        v76Var.getClass();
        this.a = v76Var;
    }

    public static DbEventAll t(Event event) {
        DbEventAll dbEvent = DbEventKt.toDbEvent(event);
        DbEvent event2 = dbEvent.getEvent();
        event2.setLastUpdate(System.currentTimeMillis() / 1000);
        event2.setHide(event.getHide());
        Integer mute = event.getMute();
        event2.setMute(mute != null ? mute.intValue() : -1);
        return dbEvent;
    }

    public static Event y(DbEventAll dbEventAll) {
        if (dbEventAll.getTournament() == null || dbEventAll.getHomeTeam() == null || dbEventAll.getAwayTeam() == null || dbEventAll.getScore() == null) {
            s38 a = s38.a();
            if (dbEventAll.getTournament() == null) {
                a.b("No tournament. tournamentId=" + dbEventAll.getEvent().getTournamentId());
            }
            if (dbEventAll.getHomeTeam() == null) {
                a.b("No homeTeam. homeTeamId=" + dbEventAll.getEvent().getHomeTeamId());
            }
            if (dbEventAll.getAwayTeam() == null) {
                a.b("No awayTeam. awayTeamId=" + dbEventAll.getEvent().getAwayTeamId());
            }
            if (dbEventAll.getScore() == null) {
                a.b("No score.");
            }
            a.c(new IllegalStateException(ljg.j(dbEventAll.getEvent().getId(), "Invalid database state for eventId=")));
        }
        return DbEventKt.toEvent(dbEventAll);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object A(List list, sq3 sq3Var) {
        na6 na6Var;
        int i;
        if (sq3Var instanceof na6) {
            na6Var = (na6) sq3Var;
            int i2 = na6Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                na6Var.t = i2 - Integer.MIN_VALUE;
                Object obj = na6Var.r;
                lu3 lu3Var = lu3.a;
                i = na6Var.t;
                int i3 = 1;
                if (i != 0) {
                    y6a.M(obj);
                    na6Var.t = 1;
                    v76 v76Var = this.a;
                    v76Var.getClass();
                    StringBuilder sb = new StringBuilder();
                    sb.append("UPDATE my_stage_table SET isMuted = 0 WHERE id in (");
                    pea.m(list.size(), sb);
                    sb.append(")");
                    obj = gz8.U(na6Var, v76Var.a, false, true, new g76(sb.toString(), list, i3));
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Boolean.valueOf(((Number) obj).intValue() > 0);
            }
        }
        na6Var = new na6(this, sq3Var);
        Object obj2 = na6Var.r;
        lu3 lu3Var2 = lu3.a;
        i = na6Var.t;
        int i32 = 1;
        if (i != 0) {
        }
        return Boolean.valueOf(((Number) obj2).intValue() > 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0096, code lost:
    
        if (r10 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        if (r12 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B(Event event, sq3 sq3Var) {
        oa6 oa6Var;
        int i;
        DbEvent dbEvent;
        if (sq3Var instanceof oa6) {
            oa6Var = (oa6) sq3Var;
            int i2 = oa6Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oa6Var.u = i2 - Integer.MIN_VALUE;
                Object obj = oa6Var.s;
                lu3 lu3Var = lu3.a;
                i = oa6Var.u;
                v76 v76Var = this.a;
                int i3 = 1;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    int id = event.getId();
                    oa6Var.r = event;
                    oa6Var.u = 1;
                    obj = gz8.U(oa6Var, v76Var.a, true, false, new i76(id, v76Var, 0));
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    event = oa6Var.r;
                    y6a.M(obj);
                }
                dbEvent = (DbEvent) obj;
                if (dbEvent != null) {
                    return Unit.a;
                }
                DbEventAll dbEvent2 = DbEventKt.toDbEvent(event);
                dbEvent2.getEvent().setLastUpdate(System.currentTimeMillis() / 1000);
                dbEvent2.getEvent().setHide(dbEvent.getHide());
                dbEvent2.getEvent().setMute(dbEvent.getMute());
                oa6Var.r = null;
                oa6Var.u = 2;
                Object T = gz8.T(oa6Var, v76Var.a, new u76(v76Var, dbEvent2, rq3Var, i3));
                if (T != lu3Var) {
                    T = Unit.a;
                }
            }
        }
        oa6Var = new oa6(this, sq3Var);
        Object obj2 = oa6Var.s;
        lu3 lu3Var2 = lu3.a;
        i = oa6Var.u;
        v76 v76Var2 = this.a;
        int i32 = 1;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        dbEvent = (DbEvent) obj2;
        if (dbEvent != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
    
        if (r13 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        if (r13 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object C(Stage stage, sq3 sq3Var) {
        pa6 pa6Var;
        int i;
        Stage stage2;
        if (sq3Var instanceof pa6) {
            pa6Var = (pa6) sq3Var;
            int i2 = pa6Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pa6Var.u = i2 - Integer.MIN_VALUE;
                Object obj = pa6Var.s;
                lu3 lu3Var = lu3.a;
                i = pa6Var.u;
                v76 v76Var = this.a;
                int i3 = 1;
                if (i != 0) {
                    y6a.M(obj);
                    stage.setLastUpdate(System.currentTimeMillis() / 1000);
                    int id = stage.getId();
                    pa6Var.r = stage;
                    pa6Var.u = 1;
                    obj = gz8.U(pa6Var, v76Var.a, true, false, new i76(id, v76Var, i3));
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return Boolean.valueOf(((Number) obj).intValue() > 0);
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    stage = pa6Var.r;
                    y6a.M(obj);
                }
                stage2 = (Stage) obj;
                if (stage2 != null) {
                    stage.setMuted(Boolean.valueOf(stage2.getIsMuted()).equals(Boolean.TRUE));
                    stage.setHidden(stage2.getIsHidden());
                }
                pa6Var.r = null;
                pa6Var.u = 2;
                obj = gz8.U(pa6Var, v76Var.a, false, true, new xw5(18, v76Var, stage));
            }
        }
        pa6Var = new pa6(this, sq3Var);
        Object obj2 = pa6Var.s;
        lu3 lu3Var2 = lu3.a;
        i = pa6Var.u;
        v76 v76Var2 = this.a;
        int i32 = 1;
        if (i != 0) {
        }
        stage2 = (Stage) obj2;
        if (stage2 != null) {
        }
        pa6Var.r = null;
        pa6Var.u = 2;
        obj2 = gz8.U(pa6Var, v76Var2.a, false, true, new xw5(18, v76Var2, stage));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, sq3 sq3Var) {
        t96 t96Var;
        int i2;
        if (sq3Var instanceof t96) {
            t96Var = (t96) sq3Var;
            int i3 = t96Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                t96Var.t = i3 - Integer.MIN_VALUE;
                Object obj = t96Var.r;
                lu3 lu3Var = lu3.a;
                i2 = t96Var.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    t96Var.t = 1;
                    obj = gz8.U(t96Var, this.a.a, true, false, new q13(i, 11));
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Boolean.valueOf(((Number) obj).intValue() > 0);
            }
        }
        t96Var = new t96(this, sq3Var);
        Object obj2 = t96Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = t96Var.t;
        if (i2 != 0) {
        }
        return Boolean.valueOf(((Number) obj2).intValue() > 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x009a, code lost:
    
        if (r14 != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        if (r15 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(sq3 sq3Var) {
        u96 u96Var;
        Object obj;
        int i;
        long timeInMillis;
        Object U;
        if (sq3Var instanceof u96) {
            u96Var = (u96) sq3Var;
            int i2 = u96Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u96Var.u = i2 - Integer.MIN_VALUE;
                Object obj2 = u96Var.s;
                obj = lu3.a;
                i = u96Var.u;
                int i3 = 12;
                v76 v76Var = this.a;
                if (i != 0) {
                    y6a.M(obj2);
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(11, 0);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                    calendar.add(5, 56);
                    timeInMillis = calendar.getTimeInMillis() / 1000;
                    Calendar E = o1j.E();
                    E.add(5, -7);
                    long timeInMillis2 = E.getTimeInMillis() / 1000;
                    u96Var.r = timeInMillis;
                    u96Var.u = 1;
                    Object T = gz8.T(u96Var, v76Var.a, new t76(v76Var, timeInMillis2, null));
                    if (T != obj) {
                        T = Unit.a;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj2);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    timeInMillis = u96Var.r;
                    y6a.M(obj2);
                }
                u96Var.r = timeInMillis;
                u96Var.u = 2;
                U = gz8.U(u96Var, v76Var.a, false, true, new yz(timeInMillis, i3));
                if (U != obj) {
                    U = Unit.a;
                }
            }
        }
        u96Var = new u96(this, sq3Var);
        Object obj22 = u96Var.s;
        obj = lu3.a;
        i = u96Var.u;
        int i32 = 12;
        v76 v76Var2 = this.a;
        if (i != 0) {
        }
        u96Var.r = timeInMillis;
        u96Var.u = 2;
        U = gz8.U(u96Var, v76Var2.a, false, true, new yz(timeInMillis, i32));
        if (U != obj) {
        }
    }

    public final Object c(int i, mj5 mj5Var) {
        Object U = gz8.U(mj5Var, this.a.a, false, true, new q13(i, 10));
        lu3 lu3Var = lu3.a;
        if (U != lu3Var) {
            U = Unit.a;
        }
        return U == lu3Var ? U : Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable d(int i, sq3 sq3Var) {
        v96 v96Var;
        int i2;
        if (sq3Var instanceof v96) {
            v96Var = (v96) sq3Var;
            int i3 = v96Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                v96Var.t = i3 - Integer.MIN_VALUE;
                Object obj = v96Var.r;
                lu3 lu3Var = lu3.a;
                i2 = v96Var.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    v96Var.t = 1;
                    obj = gz8.U(v96Var, this.a.a, true, false, new q13(i, 14));
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return CollectionsKt.Q0((Iterable) obj);
            }
        }
        v96Var = new v96(this, sq3Var);
        Object obj2 = v96Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = v96Var.t;
        if (i2 != 0) {
        }
        return CollectionsKt.Q0((Iterable) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable e(sq3 sq3Var) {
        w96 w96Var;
        int i;
        ArrayList arrayList;
        List list;
        if (sq3Var instanceof w96) {
            w96Var = (w96) sq3Var;
            int i2 = w96Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w96Var.u = i2 - Integer.MIN_VALUE;
                Object obj = w96Var.s;
                lu3 lu3Var = lu3.a;
                i = w96Var.u;
                if (i != 0) {
                    y6a.M(obj);
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    ArrayList arrayList2 = new ArrayList();
                    Calendar E = o1j.E();
                    E.add(5, -7);
                    long timeInMillis = E.getTimeInMillis() / 1000;
                    w96Var.r = arrayList2;
                    w96Var.u = 1;
                    Object U = gz8.U(w96Var, this.a.a, true, false, new k76(timeInMillis, currentTimeMillis, 0));
                    if (U == lu3Var) {
                        return lu3Var;
                    }
                    obj = U;
                    arrayList = arrayList2;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList = w96Var.r;
                    y6a.M(obj);
                }
                list = (List) obj;
                if (list != null) {
                    arrayList.addAll(list);
                }
                return arrayList;
            }
        }
        w96Var = new w96(this, sq3Var);
        Object obj2 = w96Var.s;
        lu3 lu3Var2 = lu3.a;
        i = w96Var.u;
        if (i != 0) {
        }
        list = (List) obj2;
        if (list != null) {
        }
        return arrayList;
    }

    public final z88 f() {
        v76 v76Var = this.a;
        v76Var.getClass();
        k6g k6gVar = v76Var.a;
        return hkg.H(new yf4(zm2.s(k6gVar, false, new String[]{"my_stage_table"}, new au5(18)), zm2.s(k6gVar, false, new String[]{"my_unique_stage"}, new au5(20)), new br3(3, null, 4), 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(sq3 sq3Var) {
        x96 x96Var;
        int i;
        if (sq3Var instanceof x96) {
            x96Var = (x96) sq3Var;
            int i2 = x96Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x96Var.t = i2 - Integer.MIN_VALUE;
                Object obj = x96Var.r;
                lu3 lu3Var = lu3.a;
                i = x96Var.t;
                if (i != 0) {
                    y6a.M(obj);
                    Calendar E = o1j.E();
                    E.add(5, -7);
                    long timeInMillis = E.getTimeInMillis() / 1000;
                    x96Var.t = 1;
                    obj = gz8.U(x96Var, this.a.a, true, false, new yz(timeInMillis, 15));
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return CollectionsKt.Q0((Iterable) obj);
            }
        }
        x96Var = new x96(this, sq3Var);
        Object obj2 = x96Var.r;
        lu3 lu3Var2 = lu3.a;
        i = x96Var.t;
        if (i != 0) {
        }
        return CollectionsKt.Q0((Iterable) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable h(sq3 sq3Var) {
        z96 z96Var;
        int i;
        if (sq3Var instanceof z96) {
            z96Var = (z96) sq3Var;
            int i2 = z96Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z96Var.t = i2 - Integer.MIN_VALUE;
                Object obj = z96Var.r;
                lu3 lu3Var = lu3.a;
                i = z96Var.t;
                if (i != 0) {
                    y6a.M(obj);
                    Calendar E = o1j.E();
                    E.add(5, -7);
                    long timeInMillis = E.getTimeInMillis() / 1000;
                    z96Var.t = 1;
                    obj = gz8.U(z96Var, this.a.a, true, false, new yz(timeInMillis, 22));
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return CollectionsKt.Q0((Iterable) obj);
            }
        }
        z96Var = new z96(this, sq3Var);
        Object obj2 = z96Var.r;
        lu3 lu3Var2 = lu3.a;
        i = z96Var.t;
        if (i != 0) {
        }
        return CollectionsKt.Q0((Iterable) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable i(sq3 sq3Var) {
        aa6 aa6Var;
        int i;
        if (sq3Var instanceof aa6) {
            aa6Var = (aa6) sq3Var;
            int i2 = aa6Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aa6Var.t = i2 - Integer.MIN_VALUE;
                Object obj = aa6Var.r;
                lu3 lu3Var = lu3.a;
                i = aa6Var.t;
                if (i != 0) {
                    y6a.M(obj);
                    Calendar E = o1j.E();
                    E.add(5, -7);
                    long timeInMillis = E.getTimeInMillis() / 1000;
                    aa6Var.t = 1;
                    obj = gz8.U(aa6Var, this.a.a, true, false, new yz(timeInMillis, 17));
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return CollectionsKt.Q0((Iterable) obj);
            }
        }
        aa6Var = new aa6(this, sq3Var);
        Object obj2 = aa6Var.r;
        lu3 lu3Var2 = lu3.a;
        i = aa6Var.t;
        if (i != 0) {
        }
        return CollectionsKt.Q0((Iterable) obj2);
    }

    public final a76 j(List list) {
        list.getClass();
        Calendar E = o1j.E();
        E.add(5, -7);
        long timeInMillis = E.getTimeInMillis() / 1000;
        v76 v76Var = this.a;
        v76Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT DISTINCT t.sport_slug\n        FROM events_table e\n        JOIN teams t ON e.homeTeamId = t.id\n        WHERE startTimestamp >= ? AND hide = 0\n        UNION\n        SELECT DISTINCT stage_season_unique_stage_category_sport_slug\n        FROM my_stage_table\n        WHERE startDateTimestamp >= ? AND type in (");
        pea.m(list.size(), sb);
        sb.append(") AND isHidden = 0");
        sb.append("\n");
        sb.append("        ");
        return new a76(zm2.s(v76Var.a, false, new String[]{"events_table", "teams", "my_stage_table"}, new n76(sb.toString(), timeInMillis, list, v76Var, 1)), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable k(sq3 sq3Var) {
        ca6 ca6Var;
        int i;
        if (sq3Var instanceof ca6) {
            ca6Var = (ca6) sq3Var;
            int i2 = ca6Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ca6Var.t = i2 - Integer.MIN_VALUE;
                Object obj = ca6Var.r;
                lu3 lu3Var = lu3.a;
                i = ca6Var.t;
                if (i != 0) {
                    y6a.M(obj);
                    Calendar E = o1j.E();
                    E.add(5, -7);
                    long timeInMillis = E.getTimeInMillis() / 1000;
                    ca6Var.t = 1;
                    obj = gz8.U(ca6Var, this.a.a, true, false, new yz(timeInMillis, 20));
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return CollectionsKt.V0((Iterable) obj);
            }
        }
        ca6Var = new ca6(this, sq3Var);
        Object obj2 = ca6Var.r;
        lu3 lu3Var2 = lu3.a;
        i = ca6Var.t;
        if (i != 0) {
        }
        return CollectionsKt.V0((Iterable) obj2);
    }

    public final Object l(hoi hoiVar) {
        long timeInMillis;
        int i = 14;
        if (Calendar.getInstance().get(11) < 5) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.add(11, -24);
            timeInMillis = calendar.getTimeInMillis() / 1000;
        } else {
            Calendar calendar2 = Calendar.getInstance();
            calendar2.set(11, 0);
            calendar2.set(12, 0);
            calendar2.set(13, 0);
            calendar2.set(14, 0);
            timeInMillis = calendar2.getTimeInMillis() / 1000;
        }
        return gz8.U(hoiVar, this.a.a, true, false, new yz(timeInMillis, i));
    }

    public final Object m(int i, sq3 sq3Var) {
        return gz8.U(sq3Var, this.a.a, true, false, new q13(i, 6));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(sq3 sq3Var) {
        fa6 fa6Var;
        int i;
        if (sq3Var instanceof fa6) {
            fa6Var = (fa6) sq3Var;
            int i2 = fa6Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fa6Var.t = i2 - Integer.MIN_VALUE;
                Object obj = fa6Var.r;
                lu3 lu3Var = lu3.a;
                i = fa6Var.t;
                if (i != 0) {
                    y6a.M(obj);
                    Calendar E = o1j.E();
                    E.add(5, -7);
                    long timeInMillis = E.getTimeInMillis() / 1000;
                    fa6Var.t = 1;
                    obj = gz8.U(fa6Var, this.a.a, true, false, new yz(timeInMillis, 21));
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Boolean.valueOf(((Number) obj).intValue() > 0);
            }
        }
        fa6Var = new fa6(this, sq3Var);
        Object obj2 = fa6Var.r;
        lu3 lu3Var2 = lu3.a;
        i = fa6Var.t;
        if (i != 0) {
        }
        return Boolean.valueOf(((Number) obj2).intValue() > 0);
    }

    public final Object o(Event event, sq3 sq3Var) {
        DbEventAll t = t(event);
        v76 v76Var = this.a;
        return gz8.T(sq3Var, v76Var.a, new u76(v76Var, t, null, 0));
    }

    public final Object p(ArrayList arrayList, hoi hoiVar) {
        int i = 10;
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(t((Event) it.next()));
        }
        v76 v76Var = this.a;
        Object T = gz8.T(hoiVar, v76Var.a, new cl(v76Var, arrayList2, null, i));
        lu3 lu3Var = lu3.a;
        if (T != lu3Var) {
            T = Unit.a;
        }
        return T == lu3Var ? T : Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0109, code lost:
    
        if (r12 != r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0098, code lost:
    
        if (r14 == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dd A[LOOP:1: B:29:0x00d7->B:31:0x00dd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(ArrayList arrayList, sq3 sq3Var) {
        ga6 ga6Var;
        int i;
        Iterator it;
        Object U;
        if (sq3Var instanceof ga6) {
            ga6Var = (ga6) sq3Var;
            int i2 = ga6Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ga6Var.u = i2 - Integer.MIN_VALUE;
                Object obj = ga6Var.s;
                lu3 lu3Var = lu3.a;
                i = ga6Var.u;
                v76 v76Var = this.a;
                if (i != 0) {
                    y6a.M(obj);
                    if (arrayList.isEmpty()) {
                        return Unit.a;
                    }
                    ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        w1l.A(arrayList2, ((Stage) it2.next()).getId());
                    }
                    ga6Var.r = arrayList;
                    ga6Var.u = 1;
                    v76Var.getClass();
                    StringBuilder sb = new StringBuilder();
                    sb.append("SELECT id FROM my_stage_table WHERE id IN (");
                    pea.m(arrayList2.size(), sb);
                    sb.append(") AND isHidden = 1");
                    obj = gz8.U(ga6Var, v76Var.a, true, false, new xw5(14, sb.toString(), arrayList2));
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList = ga6Var.r;
                    y6a.M(obj);
                }
                HashSet Q0 = CollectionsKt.Q0((Iterable) obj);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (!Q0.contains(new Integer(((Stage) obj2).getId()))) {
                        arrayList3.add(obj2);
                    }
                }
                ArrayList arrayList4 = new ArrayList(k13.r(arrayList3, 10));
                it = arrayList3.iterator();
                while (it.hasNext()) {
                    Stage stage = (Stage) it.next();
                    stage.setLastUpdate(System.currentTimeMillis() / 1000);
                    arrayList4.add(stage);
                }
                ga6Var.r = null;
                ga6Var.u = 2;
                U = gz8.U(ga6Var, v76Var.a, false, true, new xw5(15, v76Var, arrayList4));
                if (U != lu3.a) {
                    U = Unit.a;
                }
            }
        }
        ga6Var = new ga6(this, sq3Var);
        Object obj3 = ga6Var.s;
        lu3 lu3Var2 = lu3.a;
        i = ga6Var.u;
        v76 v76Var2 = this.a;
        if (i != 0) {
        }
        HashSet Q02 = CollectionsKt.Q0((Iterable) obj3);
        ArrayList arrayList32 = new ArrayList();
        while (r13.hasNext()) {
        }
        ArrayList arrayList42 = new ArrayList(k13.r(arrayList32, 10));
        it = arrayList32.iterator();
        while (it.hasNext()) {
        }
        ga6Var.r = null;
        ga6Var.u = 2;
        U = gz8.U(ga6Var, v76Var2.a, false, true, new xw5(15, v76Var2, arrayList42));
        if (U != lu3.a) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        if (o(r8, r0) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
    
        if (r9 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(Event event, sq3 sq3Var) {
        ha6 ha6Var;
        Object obj;
        Object obj2;
        int i;
        if (sq3Var instanceof ha6) {
            ha6Var = (ha6) sq3Var;
            int i2 = ha6Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ha6Var.u = i2 - Integer.MIN_VALUE;
                obj = ha6Var.s;
                obj2 = lu3.a;
                i = ha6Var.u;
                if (i != 0) {
                    y6a.M(obj);
                    int id = event.getId();
                    ha6Var.r = event;
                    ha6Var.u = 1;
                    obj = m(id, ha6Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                y6a.M(obj);
                                return obj;
                            }
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        event = ha6Var.r;
                        y6a.M(obj);
                        int id2 = event.getId();
                        ha6Var.r = null;
                        ha6Var.u = 3;
                        Object u = u(id2, ha6Var);
                        return u == obj2 ? obj2 : u;
                    }
                    event = ha6Var.r;
                    y6a.M(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    ha6Var.r = event;
                    ha6Var.u = 2;
                }
                int id22 = event.getId();
                ha6Var.r = null;
                ha6Var.u = 3;
                Object u2 = u(id22, ha6Var);
                if (u2 == obj2) {
                }
            }
        }
        ha6Var = new ha6(this, sq3Var);
        obj = ha6Var.s;
        obj2 = lu3.a;
        i = ha6Var.u;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        int id222 = event.getId();
        ha6Var.r = null;
        ha6Var.u = 3;
        Object u22 = u(id222, ha6Var);
        if (u22 == obj2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(int i, sq3 sq3Var) {
        ia6 ia6Var;
        int i2;
        if (sq3Var instanceof ia6) {
            ia6Var = (ia6) sq3Var;
            int i3 = ia6Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ia6Var.t = i3 - Integer.MIN_VALUE;
                Object obj = ia6Var.r;
                lu3 lu3Var = lu3.a;
                i2 = ia6Var.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    ia6Var.t = 1;
                    obj = gz8.U(ia6Var, this.a.a, true, false, new q13(i, 8));
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Boolean.valueOf(((Number) obj).intValue() > 0);
            }
        }
        ia6Var = new ia6(this, sq3Var);
        Object obj2 = ia6Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = ia6Var.t;
        if (i2 != 0) {
        }
        return Boolean.valueOf(((Number) obj2).intValue() > 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(int i, sq3 sq3Var) {
        ja6 ja6Var;
        int i2;
        if (sq3Var instanceof ja6) {
            ja6Var = (ja6) sq3Var;
            int i3 = ja6Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ja6Var.t = i3 - Integer.MIN_VALUE;
                Object obj = ja6Var.r;
                lu3 lu3Var = lu3.a;
                i2 = ja6Var.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    ja6Var.t = 1;
                    obj = gz8.U(ja6Var, this.a.a, false, true, new q13(i, 3));
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Boolean.valueOf(((Number) obj).intValue() > 0);
            }
        }
        ja6Var = new ja6(this, sq3Var);
        Object obj2 = ja6Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = ja6Var.t;
        if (i2 != 0) {
        }
        return Boolean.valueOf(((Number) obj2).intValue() > 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(int i, sq3 sq3Var) {
        ka6 ka6Var;
        int i2;
        if (sq3Var instanceof ka6) {
            ka6Var = (ka6) sq3Var;
            int i3 = ka6Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ka6Var.t = i3 - Integer.MIN_VALUE;
                Object obj = ka6Var.r;
                lu3 lu3Var = lu3.a;
                i2 = ka6Var.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    ka6Var.t = 1;
                    obj = gz8.U(ka6Var, this.a.a, false, true, new q13(i, 12));
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Boolean.valueOf(((Number) obj).intValue() > 0);
            }
        }
        ka6Var = new ka6(this, sq3Var);
        Object obj2 = ka6Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = ka6Var.t;
        if (i2 != 0) {
        }
        return Boolean.valueOf(((Number) obj2).intValue() > 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(int i, sq3 sq3Var) {
        la6 la6Var;
        int i2;
        if (sq3Var instanceof la6) {
            la6Var = (la6) sq3Var;
            int i3 = la6Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                la6Var.t = i3 - Integer.MIN_VALUE;
                Object obj = la6Var.r;
                lu3 lu3Var = lu3.a;
                i2 = la6Var.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    la6Var.t = 1;
                    obj = gz8.U(la6Var, this.a.a, false, true, new q13(i, 7));
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Boolean.valueOf(((Number) obj).intValue() > 0);
            }
        }
        la6Var = new la6(this, sq3Var);
        Object obj2 = la6Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = la6Var.t;
        if (i2 != 0) {
        }
        return Boolean.valueOf(((Number) obj2).intValue() > 0);
    }

    public final Object x(List list, sq3 sq3Var) {
        v76 v76Var = this.a;
        v76Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM my_stage_table WHERE id in (");
        pea.m(list.size(), sb);
        sb.append(")");
        Object U = gz8.U(sq3Var, v76Var.a, false, true, new g76(sb.toString(), list, 0));
        lu3 lu3Var = lu3.a;
        if (U != lu3Var) {
            U = Unit.a;
        }
        return U == lu3Var ? U : Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z(int i, sq3 sq3Var) {
        ma6 ma6Var;
        int i2;
        if (sq3Var instanceof ma6) {
            ma6Var = (ma6) sq3Var;
            int i3 = ma6Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ma6Var.t = i3 - Integer.MIN_VALUE;
                Object obj = ma6Var.r;
                lu3 lu3Var = lu3.a;
                i2 = ma6Var.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    ma6Var.t = 1;
                    obj = gz8.U(ma6Var, this.a.a, false, true, new q13(i, 5));
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Boolean.valueOf(((Number) obj).intValue() > 0);
            }
        }
        ma6Var = new ma6(this, sq3Var);
        Object obj2 = ma6Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = ma6Var.t;
        if (i2 != 0) {
        }
        return Boolean.valueOf(((Number) obj2).intValue() > 0);
    }
}
