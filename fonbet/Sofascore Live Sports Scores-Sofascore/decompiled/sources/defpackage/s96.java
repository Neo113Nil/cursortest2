package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.network.response.LineupsResponse;
import com.sofascore.model.newNetwork.DateResponse;
import com.sofascore.model.newNetwork.EventGraphData;
import com.sofascore.model.newNetwork.EventGraphResponse;
import com.sofascore.model.newNetwork.EventIncidentsResponse;
import com.sofascore.model.newNetwork.EventListResponse;
import com.sofascore.model.newNetwork.SeasonDaysWithEventsResponse;
import com.sofascore.network.api.NetworkCoroutineAPI;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class s96 {
    public final NetworkCoroutineAPI a;
    public final NetworkCoroutineAPI b;

    public s96(NetworkCoroutineAPI networkCoroutineAPI, NetworkCoroutineAPI networkCoroutineAPI2) {
        networkCoroutineAPI.getClass();
        networkCoroutineAPI2.getClass();
        this.a = networkCoroutineAPI;
        this.b = networkCoroutineAPI2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object A(int i, String str, sq3 sq3Var) {
        z86 z86Var;
        int i2;
        if (sq3Var instanceof z86) {
            z86Var = (z86) sq3Var;
            int i3 = z86Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                z86Var.t = i3 - Integer.MIN_VALUE;
                Object obj = z86Var.r;
                lu3 lu3Var = lu3.a;
                i2 = z86Var.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    m86 m86Var = new m86(this, i, str, (rq3) null, 1);
                    z86Var.t = 1;
                    obj = yaa.P(m86Var, z86Var);
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
                return yaa.x((x2g) obj);
            }
        }
        z86Var = new z86(this, sq3Var);
        Object obj2 = z86Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = z86Var.t;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B(int i, sq3 sq3Var) {
        a96 a96Var;
        int i2;
        if (sq3Var instanceof a96) {
            a96Var = (a96) sq3Var;
            int i3 = a96Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                a96Var.t = i3 - Integer.MIN_VALUE;
                Object obj = a96Var.r;
                lu3 lu3Var = lu3.a;
                i2 = a96Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    a86 a86Var = new a86(this, i, rq3Var, 13);
                    a96Var.t = 1;
                    obj = yaa.P(a86Var, a96Var);
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
                return yaa.x((x2g) obj);
            }
        }
        a96Var = new a96(this, sq3Var);
        Object obj2 = a96Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = a96Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object C(int i, String str, sq3 sq3Var) {
        b96 b96Var;
        int i2;
        List<Event> events;
        if (sq3Var instanceof b96) {
            b96Var = (b96) sq3Var;
            int i3 = b96Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                b96Var.t = i3 - Integer.MIN_VALUE;
                Object obj = b96Var.r;
                lu3 lu3Var = lu3.a;
                i2 = b96Var.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    m86 m86Var = new m86(this, i, str, (rq3) null, 3);
                    b96Var.t = 1;
                    obj = yaa.P(m86Var, b96Var);
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
                EventListResponse eventListResponse = (EventListResponse) yaa.x((x2g) obj);
                return (eventListResponse != null || (events = eventListResponse.getEvents()) == null) ? km5.a : events;
            }
        }
        b96Var = new b96(this, sq3Var);
        Object obj2 = b96Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = b96Var.t;
        if (i2 != 0) {
        }
        EventListResponse eventListResponse2 = (EventListResponse) yaa.x((x2g) obj2);
        if (eventListResponse2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable D(int i, boolean z, sq3 sq3Var) {
        c96 c96Var;
        int i2;
        x2g x2gVar;
        if (sq3Var instanceof c96) {
            c96Var = (c96) sq3Var;
            int i3 = c96Var.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c96Var.u = i3 - Integer.MIN_VALUE;
                Object obj = c96Var.s;
                lu3 lu3Var = lu3.a;
                i2 = c96Var.u;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    a86 a86Var = new a86(this, i, rq3Var, 14);
                    c96Var.r = z;
                    c96Var.u = 1;
                    obj = yaa.P(a86Var, c96Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = c96Var.r;
                    y6a.M(obj);
                }
                x2gVar = (x2g) obj;
                if (x2gVar instanceof v2g) {
                    return null;
                }
                EventGraphResponse eventGraphResponse = (EventGraphResponse) ((v2g) x2gVar).a;
                List<EventGraphData> graphPoints = eventGraphResponse.getGraphPoints();
                ArrayList arrayList = new ArrayList(k13.r(graphPoints, 10));
                for (EventGraphData eventGraphData : graphPoints) {
                    arrayList.add(new EventGraphData(eventGraphData.getMinute(), (eventGraphData.getValue() - 50.0d) * (z ? -1 : 1)));
                }
                return new EventGraphResponse(arrayList, eventGraphResponse.getPeriodTime(), eventGraphResponse.getPeriodCount(), null, null);
            }
        }
        c96Var = new c96(this, sq3Var);
        Object obj2 = c96Var.s;
        lu3 lu3Var2 = lu3.a;
        i2 = c96Var.u;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        x2gVar = (x2g) obj2;
        if (x2gVar instanceof v2g) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object E(int i, String str, sq3 sq3Var) {
        d96 d96Var;
        int i2;
        if (sq3Var instanceof d96) {
            d96Var = (d96) sq3Var;
            int i3 = d96Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                d96Var.t = i3 - Integer.MIN_VALUE;
                Object obj = d96Var.r;
                lu3 lu3Var = lu3.a;
                i2 = d96Var.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    m86 m86Var = new m86(str, this, i, (rq3) null, 4);
                    d96Var.t = 1;
                    obj = yaa.P(m86Var, d96Var);
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
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        d96Var = new d96(this, sq3Var);
        Object obj2 = d96Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = d96Var.t;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object F(int i, String str, sq3 sq3Var) {
        e96 e96Var;
        int i2;
        if (sq3Var instanceof e96) {
            e96Var = (e96) sq3Var;
            int i3 = e96Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                e96Var.t = i3 - Integer.MIN_VALUE;
                Object obj = e96Var.r;
                lu3 lu3Var = lu3.a;
                i2 = e96Var.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    m86 m86Var = new m86(this, i, str, (rq3) null, 5);
                    e96Var.t = 1;
                    obj = yaa.P(m86Var, e96Var);
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
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        e96Var = new e96(this, sq3Var);
        Object obj2 = e96Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = e96Var.t;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object G(int i, sq3 sq3Var) {
        f96 f96Var;
        int i2;
        if (sq3Var instanceof f96) {
            f96Var = (f96) sq3Var;
            int i3 = f96Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                f96Var.t = i3 - Integer.MIN_VALUE;
                Object obj = f96Var.r;
                lu3 lu3Var = lu3.a;
                i2 = f96Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    a86 a86Var = new a86(this, i, rq3Var, 15);
                    f96Var.t = 1;
                    obj = yaa.P(a86Var, f96Var);
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
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        f96Var = new f96(this, sq3Var);
        Object obj2 = f96Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = f96Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object H(int i, sq3 sq3Var) {
        g96 g96Var;
        int i2;
        if (sq3Var instanceof g96) {
            g96Var = (g96) sq3Var;
            int i3 = g96Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                g96Var.t = i3 - Integer.MIN_VALUE;
                Object obj = g96Var.r;
                lu3 lu3Var = lu3.a;
                i2 = g96Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    a86 a86Var = new a86(this, i, rq3Var, 16);
                    g96Var.t = 1;
                    obj = yaa.P(a86Var, g96Var);
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
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        g96Var = new g96(this, sq3Var);
        Object obj2 = g96Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = g96Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object I(int i, sq3 sq3Var) {
        h96 h96Var;
        int i2;
        if (sq3Var instanceof h96) {
            h96Var = (h96) sq3Var;
            int i3 = h96Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                h96Var.t = i3 - Integer.MIN_VALUE;
                Object obj = h96Var.r;
                lu3 lu3Var = lu3.a;
                i2 = h96Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    a86 a86Var = new a86(this, i, rq3Var, 17);
                    h96Var.t = 1;
                    obj = yaa.P(a86Var, h96Var);
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
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        h96Var = new h96(this, sq3Var);
        Object obj2 = h96Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = h96Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object J(int i, sq3 sq3Var) {
        i96 i96Var;
        int i2;
        if (sq3Var instanceof i96) {
            i96Var = (i96) sq3Var;
            int i3 = i96Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                i96Var.t = i3 - Integer.MIN_VALUE;
                Object obj = i96Var.r;
                lu3 lu3Var = lu3.a;
                i2 = i96Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    a86 a86Var = new a86(this, i, rq3Var, 18);
                    i96Var.t = 1;
                    obj = yaa.P(a86Var, i96Var);
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
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        i96Var = new i96(this, sq3Var);
        Object obj2 = i96Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = i96Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object K(int i, sq3 sq3Var) {
        j96 j96Var;
        int i2;
        if (sq3Var instanceof j96) {
            j96Var = (j96) sq3Var;
            int i3 = j96Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                j96Var.t = i3 - Integer.MIN_VALUE;
                Object obj = j96Var.r;
                lu3 lu3Var = lu3.a;
                i2 = j96Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    a86 a86Var = new a86(this, i, rq3Var, 19);
                    j96Var.t = 1;
                    obj = yaa.P(a86Var, j96Var);
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
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        j96Var = new j96(this, sq3Var);
        Object obj2 = j96Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = j96Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object L(int i, String str, sq3 sq3Var) {
        k96 k96Var;
        int i2;
        if (sq3Var instanceof k96) {
            k96Var = (k96) sq3Var;
            int i3 = k96Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                k96Var.t = i3 - Integer.MIN_VALUE;
                Object obj = k96Var.r;
                lu3 lu3Var = lu3.a;
                i2 = k96Var.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    m86 m86Var = new m86(str, this, i, (rq3) null, 6);
                    k96Var.t = 1;
                    obj = yaa.P(m86Var, k96Var);
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
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        k96Var = new k96(this, sq3Var);
        Object obj2 = k96Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = k96Var.t;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object M(int i, sq3 sq3Var) {
        l96 l96Var;
        int i2;
        if (sq3Var instanceof l96) {
            l96Var = (l96) sq3Var;
            int i3 = l96Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                l96Var.t = i3 - Integer.MIN_VALUE;
                Object obj = l96Var.r;
                lu3 lu3Var = lu3.a;
                i2 = l96Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    a86 a86Var = new a86(this, i, rq3Var, 20);
                    l96Var.t = 1;
                    obj = yaa.P(a86Var, l96Var);
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
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        l96Var = new l96(this, sq3Var);
        Object obj2 = l96Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = l96Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object N(int i, sq3 sq3Var) {
        m96 m96Var;
        int i2;
        if (sq3Var instanceof m96) {
            m96Var = (m96) sq3Var;
            int i3 = m96Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                m96Var.t = i3 - Integer.MIN_VALUE;
                Object obj = m96Var.r;
                lu3 lu3Var = lu3.a;
                i2 = m96Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    a86 a86Var = new a86(this, i, rq3Var, 21);
                    m96Var.t = 1;
                    obj = yaa.P(a86Var, m96Var);
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
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        m96Var = new m96(this, sq3Var);
        Object obj2 = m96Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = m96Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object O(int i, sq3 sq3Var) {
        n96 n96Var;
        int i2;
        if (sq3Var instanceof n96) {
            n96Var = (n96) sq3Var;
            int i3 = n96Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                n96Var.t = i3 - Integer.MIN_VALUE;
                Object obj = n96Var.r;
                lu3 lu3Var = lu3.a;
                i2 = n96Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    a86 a86Var = new a86(this, i, rq3Var, 23);
                    n96Var.t = 1;
                    obj = yaa.P(a86Var, n96Var);
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
                return yaa.x((x2g) obj);
            }
        }
        n96Var = new n96(this, sq3Var);
        Object obj2 = n96Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = n96Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object P(int i, sq3 sq3Var) {
        o96 o96Var;
        int i2;
        if (sq3Var instanceof o96) {
            o96Var = (o96) sq3Var;
            int i3 = o96Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                o96Var.t = i3 - Integer.MIN_VALUE;
                Object obj = o96Var.r;
                lu3 lu3Var = lu3.a;
                i2 = o96Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    a86 a86Var = new a86(this, i, rq3Var, 25);
                    o96Var.t = 1;
                    obj = yaa.P(a86Var, o96Var);
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
                return yaa.x((x2g) obj);
            }
        }
        o96Var = new o96(this, sq3Var);
        Object obj2 = o96Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = o96Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Q(int i, sq3 sq3Var) {
        p96 p96Var;
        int i2;
        if (sq3Var instanceof p96) {
            p96Var = (p96) sq3Var;
            int i3 = p96Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                p96Var.t = i3 - Integer.MIN_VALUE;
                Object obj = p96Var.r;
                lu3 lu3Var = lu3.a;
                i2 = p96Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    a86 a86Var = new a86(this, i, rq3Var, 26);
                    p96Var.t = 1;
                    obj = yaa.P(a86Var, p96Var);
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
                return yaa.x((x2g) obj);
            }
        }
        p96Var = new p96(this, sq3Var);
        Object obj2 = p96Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = p96Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object R(int i, sq3 sq3Var) {
        q96 q96Var;
        int i2;
        if (sq3Var instanceof q96) {
            q96Var = (q96) sq3Var;
            int i3 = q96Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                q96Var.t = i3 - Integer.MIN_VALUE;
                Object obj = q96Var.r;
                lu3 lu3Var = lu3.a;
                i2 = q96Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    a86 a86Var = new a86(this, i, rq3Var, 27);
                    q96Var.t = 1;
                    obj = yaa.P(a86Var, q96Var);
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
                return yaa.x((x2g) obj);
            }
        }
        q96Var = new q96(this, sq3Var);
        Object obj2 = q96Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = q96Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(int i, sq3 sq3Var) {
        r96 r96Var;
        int i2;
        if (sq3Var instanceof r96) {
            r96Var = (r96) sq3Var;
            int i3 = r96Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                r96Var.t = i3 - Integer.MIN_VALUE;
                Object obj = r96Var.r;
                lu3 lu3Var = lu3.a;
                i2 = r96Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    a86 a86Var = new a86(this, i, rq3Var, 28);
                    r96Var.t = 1;
                    obj = yaa.P(a86Var, r96Var);
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
                return yaa.x((x2g) obj);
            }
        }
        r96Var = new r96(this, sq3Var);
        Object obj2 = r96Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = r96Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    public final Object a(Stage stage, boolean z, sq3 sq3Var) {
        hs4 hs4Var = z45.a;
        return xw3.R(hq4.c, new w76(z, this, stage, null), sq3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i, int i2, sq3 sq3Var) {
        x76 x76Var;
        int i3;
        if (sq3Var instanceof x76) {
            x76Var = (x76) sq3Var;
            int i4 = x76Var.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                x76Var.t = i4 - Integer.MIN_VALUE;
                Object obj = x76Var.r;
                lu3 lu3Var = lu3.a;
                i3 = x76Var.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    y76 y76Var = new y76(this, i, i2, null, 0);
                    x76Var.t = 1;
                    obj = yaa.P(y76Var, x76Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            }
        }
        x76Var = new x76(this, sq3Var);
        Object obj2 = x76Var.r;
        lu3 lu3Var2 = lu3.a;
        i3 = x76Var.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i, sq3 sq3Var) {
        z76 z76Var;
        int i2;
        if (sq3Var instanceof z76) {
            z76Var = (z76) sq3Var;
            int i3 = z76Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                z76Var.t = i3 - Integer.MIN_VALUE;
                Object obj = z76Var.r;
                lu3 lu3Var = lu3.a;
                i2 = z76Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    a86 a86Var = new a86(this, i, rq3Var, 0);
                    z76Var.t = 1;
                    obj = yaa.P(a86Var, z76Var);
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
                return yaa.x((x2g) obj);
            }
        }
        z76Var = new z76(this, sq3Var);
        Object obj2 = z76Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = z76Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    public final Object d(int i, rq3 rq3Var) {
        return yaa.P(new a86(this, i, null, 2), rq3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Event event, sq3 sq3Var) {
        c86 c86Var;
        int i;
        if (sq3Var instanceof c86) {
            c86Var = (c86) sq3Var;
            int i2 = c86Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c86Var.t = i2 - Integer.MIN_VALUE;
                Object obj = c86Var.r;
                lu3 lu3Var = lu3.a;
                i = c86Var.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    d86 d86Var = new d86(this, event, rq3Var, 0);
                    c86Var.t = 1;
                    obj = yaa.P(d86Var, c86Var);
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
                return yaa.x((x2g) obj);
            }
        }
        c86Var = new c86(this, sq3Var);
        Object obj2 = c86Var.r;
        lu3 lu3Var2 = lu3.a;
        i = c86Var.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(int i, sq3 sq3Var) {
        e86 e86Var;
        int i2;
        if (sq3Var instanceof e86) {
            e86Var = (e86) sq3Var;
            int i3 = e86Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                e86Var.t = i3 - Integer.MIN_VALUE;
                Object obj = e86Var.r;
                lu3 lu3Var = lu3.a;
                i2 = e86Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    a86 a86Var = new a86(this, i, rq3Var, 3);
                    e86Var.t = 1;
                    obj = yaa.P(a86Var, e86Var);
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
                return yaa.x((x2g) obj);
            }
        }
        e86Var = new e86(this, sq3Var);
        Object obj2 = e86Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = e86Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Event event, sq3 sq3Var) {
        f86 f86Var;
        int i;
        if (sq3Var instanceof f86) {
            f86Var = (f86) sq3Var;
            int i2 = f86Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f86Var.t = i2 - Integer.MIN_VALUE;
                Object obj = f86Var.r;
                lu3 lu3Var = lu3.a;
                i = f86Var.t;
                rq3 rq3Var = null;
                int i3 = 1;
                if (i != 0) {
                    y6a.M(obj);
                    d86 d86Var = new d86(this, event, rq3Var, i3);
                    f86Var.t = 1;
                    obj = yaa.P(d86Var, f86Var);
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
                return yaa.x((x2g) obj);
            }
        }
        f86Var = new f86(this, sq3Var);
        Object obj2 = f86Var.r;
        lu3 lu3Var2 = lu3.a;
        i = f86Var.t;
        rq3 rq3Var2 = null;
        int i32 = 1;
        if (i != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(int i, sq3 sq3Var) {
        g86 g86Var;
        int i2;
        if (sq3Var instanceof g86) {
            g86Var = (g86) sq3Var;
            int i3 = g86Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                g86Var.t = i3 - Integer.MIN_VALUE;
                Object obj = g86Var.r;
                lu3 lu3Var = lu3.a;
                i2 = g86Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    a86 a86Var = new a86(this, i, rq3Var, 4);
                    g86Var.t = 1;
                    obj = yaa.P(a86Var, g86Var);
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
                return yaa.x((x2g) obj);
            }
        }
        g86Var = new g86(this, sq3Var);
        Object obj2 = g86Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = g86Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Event event, String str, sq3 sq3Var) {
        h86 h86Var;
        int i;
        if (sq3Var instanceof h86) {
            h86Var = (h86) sq3Var;
            int i2 = h86Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h86Var.t = i2 - Integer.MIN_VALUE;
                Object obj = h86Var.r;
                lu3 lu3Var = lu3.a;
                i = h86Var.t;
                if (i != 0) {
                    y6a.M(obj);
                    yw ywVar = new yw(this, event, str, null, 6);
                    h86Var.t = 1;
                    obj = yaa.P(ywVar, h86Var);
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
                return yaa.x((x2g) obj);
            }
        }
        h86Var = new h86(this, sq3Var);
        Object obj2 = h86Var.r;
        lu3 lu3Var2 = lu3.a;
        i = h86Var.t;
        if (i != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Event event, sq3 sq3Var) {
        i86 i86Var;
        int i;
        if (sq3Var instanceof i86) {
            i86Var = (i86) sq3Var;
            int i2 = i86Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i86Var.t = i2 - Integer.MIN_VALUE;
                Object obj = i86Var.r;
                lu3 lu3Var = lu3.a;
                i = i86Var.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    d86 d86Var = new d86(this, event, rq3Var, 2);
                    i86Var.t = 1;
                    obj = yaa.P(d86Var, i86Var);
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
                return yaa.x((x2g) obj);
            }
        }
        i86Var = new i86(this, sq3Var);
        Object obj2 = i86Var.r;
        lu3 lu3Var2 = lu3.a;
        i = i86Var.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable k(int i, String str, boolean z, sq3 sq3Var) {
        j86 j86Var;
        int i2;
        x2g x2gVar;
        List<EventGraphData> list;
        if (sq3Var instanceof j86) {
            j86Var = (j86) sq3Var;
            int i3 = j86Var.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                j86Var.u = i3 - Integer.MIN_VALUE;
                Object obj = j86Var.s;
                lu3 lu3Var = lu3.a;
                i2 = j86Var.u;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    Set set = wyh.a;
                    str.getClass();
                    if (!wyh.c.contains(str)) {
                        return null;
                    }
                    a86 a86Var = new a86(this, i, rq3Var, 5);
                    j86Var.r = z;
                    j86Var.u = 1;
                    obj = yaa.P(a86Var, j86Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = j86Var.r;
                    y6a.M(obj);
                }
                x2gVar = (x2g) obj;
                if (x2gVar instanceof v2g) {
                    return null;
                }
                EventGraphResponse eventGraphResponse = (EventGraphResponse) ((v2g) x2gVar).a;
                List<EventGraphData> graphPoints = eventGraphResponse.getGraphPoints();
                if (z) {
                    ArrayList arrayList = new ArrayList(k13.r(graphPoints, 10));
                    for (EventGraphData eventGraphData : graphPoints) {
                        arrayList.add(new EventGraphData(eventGraphData.getMinute(), eventGraphData.getValue() * (-1.0d)));
                    }
                    list = arrayList;
                } else {
                    list = graphPoints;
                }
                return new EventGraphResponse(list, eventGraphResponse.getPeriodTime(), eventGraphResponse.getPeriodCount(), eventGraphResponse.getOvertimeLength(), eventGraphResponse.getOvertimeCount());
            }
        }
        j86Var = new j86(this, sq3Var);
        Object obj2 = j86Var.s;
        lu3 lu3Var2 = lu3.a;
        i2 = j86Var.u;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        x2gVar = (x2g) obj2;
        if (x2gVar instanceof v2g) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Event event, sq3 sq3Var) {
        k86 k86Var;
        int i;
        if (sq3Var instanceof k86) {
            k86Var = (k86) sq3Var;
            int i2 = k86Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k86Var.t = i2 - Integer.MIN_VALUE;
                Object obj = k86Var.r;
                lu3 lu3Var = lu3.a;
                i = k86Var.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    d86 d86Var = new d86(this, event, rq3Var, 3);
                    k86Var.t = 1;
                    obj = yaa.P(d86Var, k86Var);
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
                return yaa.x((x2g) obj);
            }
        }
        k86Var = new k86(this, sq3Var);
        Object obj2 = k86Var.r;
        lu3 lu3Var2 = lu3.a;
        i = k86Var.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable m(int i, String str, sq3 sq3Var) {
        l86 l86Var;
        int i2;
        if (sq3Var instanceof l86) {
            l86Var = (l86) sq3Var;
            int i3 = l86Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                l86Var.t = i3 - Integer.MIN_VALUE;
                Object obj = l86Var.r;
                lu3 lu3Var = lu3.a;
                i2 = l86Var.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    Set set = wyh.a;
                    str.getClass();
                    rq3 rq3Var = null;
                    if (!Boolean.valueOf(wyh.s.contains(str)).equals(Boolean.TRUE)) {
                        return null;
                    }
                    m86 m86Var = new m86(this, i, str, rq3Var, 0);
                    l86Var.t = 1;
                    obj = yaa.P(m86Var, l86Var);
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
                return (EventIncidentsResponse) yaa.x((x2g) obj);
            }
        }
        l86Var = new l86(this, sq3Var);
        Object obj2 = l86Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = l86Var.t;
        if (i2 != 0) {
        }
        return (EventIncidentsResponse) yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable n(Event event, sq3 sq3Var) {
        n86 n86Var;
        int i;
        if (sq3Var instanceof n86) {
            n86Var = (n86) sq3Var;
            int i2 = n86Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n86Var.t = i2 - Integer.MIN_VALUE;
                Object obj = n86Var.r;
                lu3 lu3Var = lu3.a;
                i = n86Var.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    Set set = wyh.a;
                    String sportSlug = event.getSportSlug();
                    sportSlug.getClass();
                    if (!Boolean.valueOf(wyh.s.contains(sportSlug)).equals(Boolean.TRUE)) {
                        return null;
                    }
                    d86 d86Var = new d86(this, event, rq3Var, 4);
                    n86Var.t = 1;
                    obj = yaa.P(d86Var, n86Var);
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
                return (EventIncidentsResponse) yaa.x((x2g) obj);
            }
        }
        n86Var = new n86(this, sq3Var);
        Object obj2 = n86Var.r;
        lu3 lu3Var2 = lu3.a;
        i = n86Var.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        return (EventIncidentsResponse) yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(int i, Boolean bool, sq3 sq3Var) {
        o86 o86Var;
        int i2;
        if (sq3Var instanceof o86) {
            o86Var = (o86) sq3Var;
            int i3 = o86Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                o86Var.t = i3 - Integer.MIN_VALUE;
                Object obj = o86Var.r;
                lu3 lu3Var = lu3.a;
                i2 = o86Var.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    p86 p86Var = new p86(this, i, bool, null, 0);
                    o86Var.t = 1;
                    obj = yaa.P(p86Var, o86Var);
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
                return yaa.x((x2g) obj);
            }
        }
        o86Var = new o86(this, sq3Var);
        Object obj2 = o86Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = o86Var.t;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    public final Object p(Event event, sq3 sq3Var) {
        Set set = wyh.a;
        String sportSlug = event.getSportSlug();
        sportSlug.getClass();
        if (!Boolean.valueOf(wyh.t.contains(sportSlug)).equals(Boolean.TRUE)) {
            return null;
        }
        Object o = o(event.getId(), Boolean.valueOf(event.shouldReverseTeams()), sq3Var);
        return o == lu3.a ? o : (LineupsResponse) o;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Event event, sq3 sq3Var) {
        q86 q86Var;
        int i;
        if (sq3Var instanceof q86) {
            q86Var = (q86) sq3Var;
            int i2 = q86Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q86Var.t = i2 - Integer.MIN_VALUE;
                Object obj = q86Var.r;
                lu3 lu3Var = lu3.a;
                i = q86Var.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    d86 d86Var = new d86(this, event, rq3Var, 5);
                    q86Var.t = 1;
                    obj = yaa.P(d86Var, q86Var);
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
                return yaa.x((x2g) obj);
            }
        }
        q86Var = new q86(this, sq3Var);
        Object obj2 = q86Var.r;
        lu3 lu3Var2 = lu3.a;
        i = q86Var.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(Event event, sq3 sq3Var) {
        r86 r86Var;
        int i;
        if (sq3Var instanceof r86) {
            r86Var = (r86) sq3Var;
            int i2 = r86Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r86Var.t = i2 - Integer.MIN_VALUE;
                Object obj = r86Var.r;
                lu3 lu3Var = lu3.a;
                i = r86Var.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    d86 d86Var = new d86(this, event, rq3Var, 6);
                    r86Var.t = 1;
                    obj = yaa.P(d86Var, r86Var);
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
                return yaa.x((x2g) obj);
            }
        }
        r86Var = new r86(this, sq3Var);
        Object obj2 = r86Var.r;
        lu3 lu3Var2 = lu3.a;
        i = r86Var.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(int i, Boolean bool, sq3 sq3Var) {
        s86 s86Var;
        int i2;
        if (sq3Var instanceof s86) {
            s86Var = (s86) sq3Var;
            int i3 = s86Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                s86Var.t = i3 - Integer.MIN_VALUE;
                Object obj = s86Var.r;
                lu3 lu3Var = lu3.a;
                i2 = s86Var.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    p86 p86Var = new p86(this, i, bool, null, 1);
                    s86Var.t = 1;
                    obj = yaa.P(p86Var, s86Var);
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
                return yaa.x((x2g) obj);
            }
        }
        s86Var = new s86(this, sq3Var);
        Object obj2 = s86Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = s86Var.t;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    public final Object t(Event event, hoi hoiVar) {
        return s(event.getId(), Boolean.valueOf(event.shouldReverseTeams()), hoiVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(Event event, sq3 sq3Var) {
        t86 t86Var;
        int i;
        if (sq3Var instanceof t86) {
            t86Var = (t86) sq3Var;
            int i2 = t86Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t86Var.t = i2 - Integer.MIN_VALUE;
                Object obj = t86Var.r;
                lu3 lu3Var = lu3.a;
                i = t86Var.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    d86 d86Var = new d86(this, event, rq3Var, 7);
                    t86Var.t = 1;
                    obj = yaa.P(d86Var, t86Var);
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
                return yaa.x((x2g) obj);
            }
        }
        t86Var = new t86(this, sq3Var);
        Object obj2 = t86Var.r;
        lu3 lu3Var2 = lu3.a;
        i = t86Var.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(String str, String str2, String str3, sq3 sq3Var) {
        u86 u86Var;
        int i;
        if (sq3Var instanceof u86) {
            u86Var = (u86) sq3Var;
            int i2 = u86Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u86Var.t = i2 - Integer.MIN_VALUE;
                Object obj = u86Var.r;
                lu3 lu3Var = lu3.a;
                i = u86Var.t;
                if (i != 0) {
                    y6a.M(obj);
                    as2 as2Var = new as2(this, str, str2, str3, null, 3);
                    u86Var.t = 1;
                    obj = yaa.P(as2Var, u86Var);
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
                return yaa.x((x2g) obj);
            }
        }
        u86Var = new u86(this, sq3Var);
        Object obj2 = u86Var.r;
        lu3 lu3Var2 = lu3.a;
        i = u86Var.t;
        if (i != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(String str, sq3 sq3Var) {
        v86 v86Var;
        int i;
        if (sq3Var instanceof v86) {
            v86Var = (v86) sq3Var;
            int i2 = v86Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v86Var.t = i2 - Integer.MIN_VALUE;
                Object obj = v86Var.r;
                lu3 lu3Var = lu3.a;
                i = v86Var.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    b86 b86Var = new b86(this, str, rq3Var, 2);
                    v86Var.t = 1;
                    obj = yaa.P(b86Var, v86Var);
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
                return yaa.x((x2g) obj);
            }
        }
        v86Var = new v86(this, sq3Var);
        Object obj2 = v86Var.r;
        lu3 lu3Var2 = lu3.a;
        i = v86Var.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable x(int i, int i2, sq3 sq3Var) {
        w86 w86Var;
        int i3;
        SeasonDaysWithEventsResponse seasonDaysWithEventsResponse;
        List<DateResponse> dailySeasonEvents;
        if (sq3Var instanceof w86) {
            w86Var = (w86) sq3Var;
            int i4 = w86Var.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                w86Var.t = i4 - Integer.MIN_VALUE;
                Object obj = w86Var.r;
                lu3 lu3Var = lu3.a;
                i3 = w86Var.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    y76 y76Var = new y76(this, i, i2, null, 1);
                    w86Var.t = 1;
                    obj = yaa.P(y76Var, w86Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                seasonDaysWithEventsResponse = (SeasonDaysWithEventsResponse) yaa.x((x2g) obj);
                if (seasonDaysWithEventsResponse != null || (dailySeasonEvents = seasonDaysWithEventsResponse.getDailySeasonEvents()) == null) {
                    return km5.a;
                }
                ArrayList arrayList = new ArrayList(k13.r(dailySeasonEvents, 10));
                Iterator<T> it = dailySeasonEvents.iterator();
                while (it.hasNext()) {
                    arrayList.add(((DateResponse) it.next()).getDate());
                }
                return arrayList;
            }
        }
        w86Var = new w86(this, sq3Var);
        Object obj2 = w86Var.r;
        lu3 lu3Var2 = lu3.a;
        i3 = w86Var.t;
        if (i3 != 0) {
        }
        seasonDaysWithEventsResponse = (SeasonDaysWithEventsResponse) yaa.x((x2g) obj2);
        if (seasonDaysWithEventsResponse != null) {
        }
        return km5.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(int i, sq3 sq3Var) {
        x86 x86Var;
        int i2;
        if (sq3Var instanceof x86) {
            x86Var = (x86) sq3Var;
            int i3 = x86Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                x86Var.t = i3 - Integer.MIN_VALUE;
                Object obj = x86Var.r;
                lu3 lu3Var = lu3.a;
                i2 = x86Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    a86 a86Var = new a86(this, i, rq3Var, 11);
                    x86Var.t = 1;
                    obj = yaa.P(a86Var, x86Var);
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
                return yaa.x((x2g) obj);
            }
        }
        x86Var = new x86(this, sq3Var);
        Object obj2 = x86Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = x86Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z(int i, sq3 sq3Var) {
        y86 y86Var;
        int i2;
        if (sq3Var instanceof y86) {
            y86Var = (y86) sq3Var;
            int i3 = y86Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                y86Var.t = i3 - Integer.MIN_VALUE;
                Object obj = y86Var.r;
                lu3 lu3Var = lu3.a;
                i2 = y86Var.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    a86 a86Var = new a86(this, i, rq3Var, 12);
                    y86Var.t = 1;
                    obj = yaa.P(a86Var, y86Var);
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
                return yaa.x((x2g) obj);
            }
        }
        y86Var = new y86(this, sq3Var);
        Object obj2 = y86Var.r;
        lu3 lu3Var2 = lu3.a;
        i2 = y86Var.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }
}
