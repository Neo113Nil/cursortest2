package defpackage;

import android.app.Application;
import com.sofascore.model.crowdsourcing.CrowdsourcingIncidentType;
import com.sofascore.model.crowdsourcing.EventSuggest;
import com.sofascore.model.crowdsourcing.SuggestStatus;
import com.sofascore.model.crowdsourcing.TeamSide;
import com.sofascore.model.mvvm.model.Player;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lq54;", "Lq8;", "q44", "p44", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class q54 extends q8 {
    public final o63 A;
    public final zn2 B;
    public final wf2 C;
    public final yf4 D;
    public final yf4 E;
    public final fp4 e;
    public final e64 f;
    public final fdi g;
    public final aeh h;
    public final fdi i;
    public final aeh j;
    public final hof k;
    public final aeh l;
    public final hof m;
    public final fdi n;
    public final fdi o;
    public final fdi p;
    public final fdi q;
    public final fdi r;
    public final fdi s;
    public final fdi t;
    public final fdi u;
    public final yf4 v;
    public final scj w;
    public final z88 x;
    public final fdi y;
    public final yf4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q54(Application application, fp4 fp4Var, e64 e64Var) {
        super(application);
        e64Var.getClass();
        this.e = fp4Var;
        this.f = e64Var;
        fdi a = gdi.a(q44.a);
        this.g = a;
        final int i = 1;
        final int i2 = 0;
        rq3 rq3Var = null;
        aeh b = beh.b(1, 0, null, 6);
        this.h = b;
        o63 o63Var = new o63(2, b, this);
        iz2 z = un0.z(this);
        km5 km5Var = km5.a;
        fdi c = j34.c(o63Var, z, new Pair(km5Var, km5Var));
        this.i = c;
        aeh b2 = beh.b(0, 0, null, 7);
        this.j = b2;
        this.k = un0.t(b2);
        aeh b3 = beh.b(0, 0, null, 7);
        this.l = b3;
        this.m = un0.t(b3);
        fdi a2 = gdi.a(null);
        this.n = a2;
        fdi a3 = gdi.a(CrowdsourcingIncidentType.Goal.REGULAR);
        this.o = a3;
        fdi a4 = gdi.a(null);
        this.p = a4;
        fdi a5 = gdi.a(null);
        this.q = a5;
        fdi a6 = gdi.a(new c0a(false, 1, null, rlh.b));
        this.r = a6;
        fdi c2 = j34.c(dy0.r(c, a2, a3, new x44(4, null)), un0.z(this), km5Var);
        this.s = c2;
        this.t = gdi.a(new scj(""));
        this.u = gdi.a(null);
        int i3 = 3;
        yf4 yf4Var = new yf4(a4, a5, new br3(i3, rq3Var, i), i);
        this.v = yf4Var;
        this.w = new scj("");
        this.x = hkg.H(sea.y(new Function0(this) { // from class: o44
            public final /* synthetic */ q54 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i2;
                q54 q54Var = this.b;
                switch (i4) {
                    case 0:
                        return q54Var.w.c().c;
                    default:
                        return ((scj) q54Var.t.getValue()).c().c;
                }
            }
        }));
        fdi a7 = gdi.a(Boolean.FALSE);
        this.y = a7;
        zn2 a8 = la8.a(new or3(b, i), new j54(rq3Var, this, i2));
        int i4 = 1;
        this.z = new yf4(hkg.H(hkg.E(sea.y(new Function0(this) { // from class: o44
            public final /* synthetic */ q54 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i42 = i;
                q54 q54Var = this.b;
                switch (i42) {
                    case 0:
                        return q54Var.w.c().c;
                    default:
                        return ((scj) q54Var.t.getValue()).c().c;
                }
            }
        }), 250L)), c2, new q41(this, rq3Var, i4), i4);
        this.A = dy0.r(b, a7, a8, new n54(this, null));
        this.B = la8.a(a, new j54(rq3Var, this, i4));
        this.C = new wf2(dy0.q(a3, a2, a6, yf4Var, b, new s44(this, null)), 1);
        this.D = new yf4(a2, b, new br3(i3, rq3Var, 2), i4);
        this.E = new yf4(a4, a3, new t44(this, null), i4);
    }

    public static List l(p44 p44Var) {
        CrowdsourcingIncidentType.Card card = p44Var.d;
        int i = p44Var.e;
        ArrayList arrayList = p44Var.b;
        int i2 = r44.a[card.ordinal()];
        if (i2 == 1) {
            return arrayList.subList(0, i + 1);
        }
        if (i2 == 2 || i2 == 3) {
            return arrayList.subList(i, arrayList.size());
        }
        zzl.b();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList m(w34 w34Var) {
        int i;
        int i2;
        ListIterator listIterator;
        hc9 hc9Var;
        String str;
        xbb b = a.b();
        IntRange intRange = new IntRange(1, 45, 1);
        ArrayList arrayList = new ArrayList();
        v6a it = intRange.iterator();
        while (it.c) {
            arrayList.add(new s54(Integer.valueOf(it.nextInt()), null));
        }
        b.addAll(arrayList);
        IntRange intRange2 = new IntRange(1, 15, 1);
        ArrayList arrayList2 = new ArrayList();
        v6a it2 = intRange2.iterator();
        while (it2.c) {
            arrayList2.add(new s54(45, Integer.valueOf(it2.nextInt())));
        }
        b.addAll(arrayList2);
        IntRange intRange3 = new IntRange(46, 90, 1);
        ArrayList arrayList3 = new ArrayList();
        v6a it3 = intRange3.iterator();
        while (it3.c) {
            arrayList3.add(new s54(Integer.valueOf(it3.nextInt()), null));
        }
        b.addAll(arrayList3);
        IntRange intRange4 = new IntRange(1, 15, 1);
        ArrayList arrayList4 = new ArrayList();
        v6a it4 = intRange4.iterator();
        while (it4.c) {
            arrayList4.add(new s54(90, Integer.valueOf(it4.nextInt())));
        }
        b.addAll(arrayList4);
        xbb a = a.a(b);
        boolean z = w34Var instanceof v34;
        if (z) {
            int c0 = CollectionsKt.c0(a, ((v34) w34Var).f);
            Integer valueOf = Integer.valueOf(c0);
            if (c0 == -1) {
                valueOf = null;
            }
            if (valueOf != null) {
                i = valueOf.intValue();
                if (z) {
                    i2 = b.i(a);
                } else {
                    int c02 = CollectionsKt.c0(a, ((v34) w34Var).g);
                    Integer valueOf2 = Integer.valueOf(c02);
                    if (c02 == -1) {
                        valueOf2 = null;
                    }
                    i2 = valueOf2 != null ? valueOf2.intValue() : a.size() - 1;
                }
                List subList = a.subList(i, i2 + 1);
                ArrayList arrayList5 = new ArrayList();
                listIterator = ((vbb) subList).listIterator(0);
                while (true) {
                    hc9Var = (hc9) listIterator;
                    if (hc9Var.hasNext()) {
                        return arrayList5;
                    }
                    s54 s54Var = (s54) hc9Var.next();
                    Integer num = s54Var.a;
                    Integer num2 = s54Var.b;
                    if (num == null) {
                        str = null;
                    } else {
                        String j = num2 != null ? ljg.j(num2.intValue(), "+") : null;
                        if (j == null) {
                            j = "";
                        }
                        str = num + "'" + j;
                    }
                    if (str != null) {
                        arrayList5.add(str);
                    }
                }
            }
        }
        i = 0;
        if (z) {
        }
        List subList2 = a.subList(i, i2 + 1);
        ArrayList arrayList52 = new ArrayList();
        listIterator = ((vbb) subList2).listIterator(0);
        while (true) {
            hc9Var = (hc9) listIterator;
            if (hc9Var.hasNext()) {
            }
        }
    }

    public static boolean w(kxe kxeVar, Player player, String str) {
        if (str != null) {
            return !Intrinsics.c(kxeVar != null ? kxeVar.b : null, str);
        }
        return !Intrinsics.c(kxeVar != null ? Integer.valueOf(kxeVar.a) : null, player != null ? Integer.valueOf(player.getId()) : null);
    }

    public static boolean y(yq3 yq3Var, kxe kxeVar) {
        int i = kxeVar.a;
        Integer valueOf = Integer.valueOf(i);
        if (i == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            Integer num = yq3Var.a;
            int intValue = valueOf.intValue();
            if (num != null && num.intValue() == intValue) {
                return true;
            }
        }
        String str = yq3Var.b;
        return str != null && str.equals(kxeVar.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(kxe kxeVar, w34 w34Var, sq3 sq3Var) {
        y44 y44Var;
        int i;
        if (sq3Var instanceof y44) {
            y44Var = (y44) sq3Var;
            int i2 = y44Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y44Var.u = i2 - Integer.MIN_VALUE;
                Object obj = y44Var.s;
                Object obj2 = lu3.a;
                i = y44Var.u;
                if (i != 0) {
                    y6a.M(obj);
                    y44Var.r = w34Var;
                    y44Var.u = 1;
                    obj = o(kxeVar, y44Var);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    w34Var = y44Var.r;
                    y6a.M(obj);
                }
                p44 p44Var = (p44) obj;
                return p44Var != null ? m(w34Var) : l(p44Var);
            }
        }
        y44Var = new y44(this, sq3Var);
        Object obj3 = y44Var.s;
        Object obj22 = lu3.a;
        i = y44Var.u;
        if (i != 0) {
        }
        p44 p44Var2 = (p44) obj3;
        if (p44Var2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(sq3 sq3Var) {
        z44 z44Var;
        int i;
        w34 w34Var;
        if (sq3Var instanceof z44) {
            z44Var = (z44) sq3Var;
            int i2 = z44Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z44Var.t = i2 - Integer.MIN_VALUE;
                Object obj = z44Var.r;
                lu3 lu3Var = lu3.a;
                i = z44Var.t;
                boolean z = true;
                if (i != 0) {
                    y6a.M(obj);
                    z44Var.t = 1;
                    obj = rd0.y(this.h, z44Var);
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
                w34Var = ((k24) obj).b;
                if (!(w34Var instanceof v34)) {
                    if (!(w34Var instanceof u34)) {
                        zzl.b();
                        return null;
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        z44Var = new z44(this, sq3Var);
        Object obj2 = z44Var.r;
        lu3 lu3Var2 = lu3.a;
        i = z44Var.t;
        boolean z2 = true;
        if (i != 0) {
        }
        w34Var = ((k24) obj2).b;
        if (!(w34Var instanceof v34)) {
        }
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(kxe kxeVar, sq3 sq3Var) {
        a54 a54Var;
        int i;
        int i2;
        Object obj;
        yq3 yq3Var;
        yq3 yq3Var2;
        String str;
        Object obj2;
        if (sq3Var instanceof a54) {
            a54Var = (a54) sq3Var;
            int i3 = a54Var.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                a54Var.u = i3 - Integer.MIN_VALUE;
                Object obj3 = a54Var.s;
                lu3 lu3Var = lu3.a;
                i = a54Var.u;
                if (i != 0) {
                    y6a.M(obj3);
                    a54Var.r = kxeVar;
                    a54Var.u = 1;
                    obj3 = rd0.y(this.h, a54Var);
                    if (obj3 == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kxeVar = a54Var.r;
                    y6a.M(obj3);
                }
                w34 w34Var = ((k24) obj3).b;
                w34Var.getClass();
                u34 u34Var = (u34) w34Var;
                Map map = u34Var.d;
                Object value = this.o.getValue();
                value.getClass();
                CrowdsourcingIncidentType.Card card = (CrowdsourcingIncidentType.Card) value;
                i2 = r44.a[card.ordinal()];
                if (i2 != 1) {
                    Collection collection = (List) map.get(CrowdsourcingIncidentType.Card.RED);
                    if (collection == null) {
                        collection = km5.a;
                    }
                    Iterable iterable = (List) map.get(CrowdsourcingIncidentType.Card.SECOND_YELLOW);
                    if (iterable == null) {
                        iterable = km5.a;
                    }
                    Iterator it = CollectionsKt.w0(iterable, collection).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (y((yq3) obj, kxeVar)) {
                            break;
                        }
                    }
                    yq3Var = (yq3) obj;
                } else {
                    if (i2 != 2 && i2 != 3) {
                        zzl.b();
                        return null;
                    }
                    Iterable iterable2 = (List) map.get(CrowdsourcingIncidentType.Card.YELLOW);
                    if (iterable2 == null) {
                        iterable2 = km5.a;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        if (y((yq3) obj2, kxeVar)) {
                            break;
                        }
                    }
                    yq3Var = (yq3) obj2;
                }
                yq3Var2 = yq3Var;
                if (yq3Var2 != null) {
                    ArrayList m = m(u34Var);
                    Integer num = yq3Var2.c;
                    Integer num2 = yq3Var2.d;
                    if (num == null) {
                        str = null;
                    } else {
                        String j = num2 != null ? ljg.j(num2.intValue(), "+") : null;
                        if (j == null) {
                            j = "";
                        }
                        str = num + "'" + j;
                    }
                    int indexOf = m.indexOf(str);
                    if (indexOf >= 0) {
                        return new p44(yq3Var2, m, card == CrowdsourcingIncidentType.Card.YELLOW ? indexOf + 1 : indexOf, card, indexOf);
                    }
                }
                return null;
            }
        }
        a54Var = new a54(this, sq3Var);
        Object obj32 = a54Var.s;
        lu3 lu3Var2 = lu3.a;
        i = a54Var.u;
        if (i != 0) {
        }
        w34 w34Var2 = ((k24) obj32).b;
        w34Var2.getClass();
        u34 u34Var2 = (u34) w34Var2;
        Map map2 = u34Var2.d;
        Object value2 = this.o.getValue();
        value2.getClass();
        CrowdsourcingIncidentType.Card card2 = (CrowdsourcingIncidentType.Card) value2;
        i2 = r44.a[card2.ordinal()];
        if (i2 != 1) {
        }
        yq3Var2 = yq3Var;
        if (yq3Var2 != null) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0158, code lost:
    
        if (r9 == r1) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0132, code lost:
    
        if (r9 == r1) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0102, code lost:
    
        if (r9 == r1) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00dc, code lost:
    
        if (r9 != r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x007f, code lost:
    
        if (r9 == r1) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable t(sq3 sq3Var) {
        b54 b54Var;
        k24 k24Var;
        int i;
        TeamSide teamSide;
        int i2;
        int i3;
        k24 k24Var2;
        TeamSide teamSide2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        TeamSide teamSide3;
        k24 k24Var3;
        if (sq3Var instanceof b54) {
            b54Var = (b54) sq3Var;
            int i10 = b54Var.x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                b54Var.x = i10 - Integer.MIN_VALUE;
                Object obj = b54Var.v;
                lu3 lu3Var = lu3.a;
                switch (b54Var.x) {
                    case 0:
                        y6a.M(obj);
                        b54Var.x = 1;
                        obj = rd0.y(this.h, b54Var);
                        break;
                    case 1:
                        y6a.M(obj);
                        k24Var = (k24) obj;
                        if (!(k24Var.b instanceof v34)) {
                            return new Pair(null, null);
                        }
                        TeamSide teamSide4 = (TeamSide) this.n.getValue();
                        EventSuggest.IncidentSuggest incidentSuggest = k24Var.b.b;
                        i = (incidentSuggest != null ? incidentSuggest.getSide() : null) != teamSide4 ? 1 : 0;
                        b54Var.r = k24Var;
                        b54Var.s = teamSide4;
                        b54Var.t = i;
                        b54Var.x = 2;
                        Object u = u(b54Var);
                        if (u != lu3Var) {
                            teamSide = teamSide4;
                            obj = u;
                            if (!((Boolean) obj).booleanValue() && teamSide == TeamSide.HOME) {
                                i2 = ((v34) k24Var.b).d;
                                i3 = i2 + 1;
                                k24Var2 = k24Var;
                                teamSide2 = teamSide;
                                i4 = i;
                                i5 = i3;
                                b54Var.r = k24Var2;
                                b54Var.s = teamSide2;
                                b54Var.t = i4;
                                b54Var.u = i5;
                                b54Var.x = 5;
                                obj = u(b54Var);
                                break;
                            } else {
                                b54Var.r = k24Var;
                                b54Var.s = teamSide;
                                b54Var.t = i;
                                b54Var.x = 3;
                                obj = v(b54Var);
                                break;
                            }
                        }
                        return lu3Var;
                    case 2:
                        i = b54Var.t;
                        teamSide = b54Var.s;
                        k24Var = b54Var.r;
                        y6a.M(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            break;
                        }
                        b54Var.r = k24Var;
                        b54Var.s = teamSide;
                        b54Var.t = i;
                        b54Var.x = 3;
                        obj = v(b54Var);
                        break;
                    case 3:
                        i = b54Var.t;
                        teamSide = b54Var.s;
                        k24Var = b54Var.r;
                        y6a.M(obj);
                        if (!((Boolean) obj).booleanValue() || i == 0 || teamSide != TeamSide.HOME) {
                            b54Var.r = k24Var;
                            b54Var.s = teamSide;
                            b54Var.t = i;
                            b54Var.x = 4;
                            obj = v(b54Var);
                            break;
                        } else {
                            i2 = ((v34) k24Var.b).d;
                            i3 = i2 + 1;
                            k24Var2 = k24Var;
                            teamSide2 = teamSide;
                            i4 = i;
                            i5 = i3;
                            b54Var.r = k24Var2;
                            b54Var.s = teamSide2;
                            b54Var.t = i4;
                            b54Var.u = i5;
                            b54Var.x = 5;
                            obj = u(b54Var);
                            break;
                        }
                    case 4:
                        i = b54Var.t;
                        teamSide = b54Var.s;
                        k24Var = b54Var.r;
                        y6a.M(obj);
                        i3 = (((Boolean) obj).booleanValue() && i != 0 && teamSide == TeamSide.AWAY) ? ((v34) k24Var.b).d - 1 : ((v34) k24Var.b).d;
                        k24Var2 = k24Var;
                        teamSide2 = teamSide;
                        i4 = i;
                        i5 = i3;
                        b54Var.r = k24Var2;
                        b54Var.s = teamSide2;
                        b54Var.t = i4;
                        b54Var.u = i5;
                        b54Var.x = 5;
                        obj = u(b54Var);
                        break;
                    case 5:
                        i5 = b54Var.u;
                        i4 = b54Var.t;
                        teamSide2 = b54Var.s;
                        k24Var2 = b54Var.r;
                        y6a.M(obj);
                        if (!((Boolean) obj).booleanValue() || teamSide2 != TeamSide.AWAY) {
                            b54Var.r = k24Var2;
                            b54Var.s = teamSide2;
                            b54Var.t = i4;
                            b54Var.u = i5;
                            b54Var.x = 6;
                            obj = v(b54Var);
                            break;
                        } else {
                            i6 = ((v34) k24Var2.b).e;
                            i7 = i6 + 1;
                            return new Pair(new Integer(i5), new Integer(i7));
                        }
                    case 6:
                        i5 = b54Var.u;
                        i4 = b54Var.t;
                        teamSide2 = b54Var.s;
                        k24Var2 = b54Var.r;
                        y6a.M(obj);
                        if (((Boolean) obj).booleanValue() && i4 != 0 && teamSide2 == TeamSide.AWAY) {
                            i6 = ((v34) k24Var2.b).e;
                            i7 = i6 + 1;
                            return new Pair(new Integer(i5), new Integer(i7));
                        }
                        b54Var.r = k24Var2;
                        b54Var.s = teamSide2;
                        b54Var.t = i4;
                        b54Var.u = i5;
                        b54Var.x = 7;
                        obj = v(b54Var);
                        if (obj != lu3Var) {
                            i8 = i5;
                            i9 = i4;
                            teamSide3 = teamSide2;
                            k24Var3 = k24Var2;
                            int i11 = (((Boolean) obj).booleanValue() || i9 == 0 || teamSide3 != TeamSide.HOME) ? ((v34) k24Var3.b).e : ((v34) k24Var3.b).e - 1;
                            i5 = i8;
                            i7 = i11;
                            return new Pair(new Integer(i5), new Integer(i7));
                        }
                        return lu3Var;
                    case 7:
                        i8 = b54Var.u;
                        i9 = b54Var.t;
                        teamSide3 = b54Var.s;
                        k24Var3 = b54Var.r;
                        y6a.M(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                        i5 = i8;
                        i7 = i11;
                        return new Pair(new Integer(i5), new Integer(i7));
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        b54Var = new b54(this, sq3Var);
        Object obj2 = b54Var.v;
        lu3 lu3Var2 = lu3.a;
        switch (b54Var.x) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(sq3 sq3Var) {
        c54 c54Var;
        int i;
        if (sq3Var instanceof c54) {
            c54Var = (c54) sq3Var;
            int i2 = c54Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c54Var.t = i2 - Integer.MIN_VALUE;
                Object obj = c54Var.r;
                lu3 lu3Var = lu3.a;
                i = c54Var.t;
                if (i != 0) {
                    y6a.M(obj);
                    c54Var.t = 1;
                    obj = rd0.y(this.h, c54Var);
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
                EventSuggest.IncidentSuggest incidentSuggest = ((k24) obj).b.b;
                return Boolean.valueOf((incidentSuggest != null ? new Integer(incidentSuggest.getId()) : null) == null);
            }
        }
        c54Var = new c54(this, sq3Var);
        Object obj2 = c54Var.r;
        lu3 lu3Var2 = lu3.a;
        i = c54Var.t;
        if (i != 0) {
        }
        EventSuggest.IncidentSuggest incidentSuggest2 = ((k24) obj2).b.b;
        return Boolean.valueOf((incidentSuggest2 != null ? new Integer(incidentSuggest2.getId()) : null) == null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(sq3 sq3Var) {
        d54 d54Var;
        int i;
        if (sq3Var instanceof d54) {
            d54Var = (d54) sq3Var;
            int i2 = d54Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d54Var.t = i2 - Integer.MIN_VALUE;
                Object obj = d54Var.r;
                lu3 lu3Var = lu3.a;
                i = d54Var.t;
                if (i != 0) {
                    y6a.M(obj);
                    d54Var.t = 1;
                    obj = rd0.y(this.h, d54Var);
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
                EventSuggest.IncidentSuggest incidentSuggest = ((k24) obj).b.b;
                return Boolean.valueOf(yid.m(incidentSuggest != null ? new Integer(incidentSuggest.getId()) : null) < 0);
            }
        }
        d54Var = new d54(this, sq3Var);
        Object obj2 = d54Var.r;
        lu3 lu3Var2 = lu3.a;
        i = d54Var.t;
        if (i != 0) {
        }
        EventSuggest.IncidentSuggest incidentSuggest2 = ((k24) obj2).b.b;
        return Boolean.valueOf(yid.m(incidentSuggest2 != null ? new Integer(incidentSuggest2.getId()) : null) < 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(k24 k24Var, CrowdsourcingIncidentType crowdsourcingIncidentType, TeamSide teamSide, c0a c0aVar, kxe kxeVar, kxe kxeVar2, sq3 sq3Var) {
        e54 e54Var;
        int i;
        w34 w34Var;
        String str;
        kxe kxeVar3;
        CrowdsourcingIncidentType crowdsourcingIncidentType2;
        TeamSide teamSide2;
        String e;
        k24 k24Var2 = k24Var;
        kxe kxeVar4 = kxeVar;
        if (sq3Var instanceof e54) {
            e54Var = (e54) sq3Var;
            int i2 = e54Var.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e54Var.A = i2 - Integer.MIN_VALUE;
                Object obj = e54Var.y;
                Serializable serializable = lu3.a;
                i = e54Var.A;
                if (i != 0) {
                    y6a.M(obj);
                    String b = c0aVar.a ? c0aVar.b() : null;
                    w34Var = k24Var2.b;
                    if (w34Var instanceof u34) {
                        EventSuggest.IncidentSuggest incidentSuggest = w34Var.b;
                        SuggestStatus status = !k24Var2.b.a ? incidentSuggest != null ? incidentSuggest.getStatus() : null : null;
                        if (kxeVar4 == null || (e = kxeVar4.b) == null) {
                            e = j34.e(crowdsourcingIncidentType, i());
                        }
                        return new ey4(status, crowdsourcingIncidentType, b, null, null, e, null, teamSide, Boolean.valueOf(Intrinsics.c(incidentSuggest != null ? incidentSuggest.getApplied() : null, Boolean.TRUE)));
                    }
                    str = b;
                    if (!(w34Var instanceof v34)) {
                        zzl.b();
                        return null;
                    }
                    e54Var.r = k24Var2;
                    e54Var.s = crowdsourcingIncidentType;
                    e54Var.t = teamSide;
                    e54Var.u = kxeVar4;
                    kxeVar3 = kxeVar2;
                    e54Var.v = kxeVar3;
                    e54Var.w = str;
                    e54Var.x = (v34) w34Var;
                    e54Var.A = 1;
                    Serializable t = t(e54Var);
                    if (t == serializable) {
                        return serializable;
                    }
                    crowdsourcingIncidentType2 = crowdsourcingIncidentType;
                    obj = t;
                    teamSide2 = teamSide;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    v34 v34Var = e54Var.x;
                    str = e54Var.w;
                    kxe kxeVar5 = e54Var.v;
                    kxe kxeVar6 = e54Var.u;
                    TeamSide teamSide3 = e54Var.t;
                    CrowdsourcingIncidentType crowdsourcingIncidentType3 = e54Var.s;
                    k24 k24Var3 = e54Var.r;
                    y6a.M(obj);
                    kxeVar3 = kxeVar5;
                    kxeVar4 = kxeVar6;
                    teamSide2 = teamSide3;
                    crowdsourcingIncidentType2 = crowdsourcingIncidentType3;
                    w34Var = v34Var;
                    k24Var2 = k24Var3;
                }
                String str2 = str;
                Pair pair = (Pair) obj;
                Integer num = (Integer) pair.a;
                Integer num2 = (Integer) pair.b;
                EventSuggest.IncidentSuggest incidentSuggest2 = w34Var.b;
                SuggestStatus status2 = incidentSuggest2 == null ? incidentSuggest2.getStatus() : null;
                if (k24Var2.b.a) {
                    status2 = null;
                }
                if (kxeVar4 != null || (r1 = kxeVar4.b) == null) {
                    String e2 = j34.e(crowdsourcingIncidentType2, i());
                }
                String str3 = e2;
                String str4 = kxeVar3 == null ? kxeVar3.b : null;
                EventSuggest.IncidentSuggest incidentSuggest3 = w34Var.b;
                return new ey4(status2, crowdsourcingIncidentType2, str2, num, num2, str3, str4, teamSide2, Boolean.valueOf(Intrinsics.c(incidentSuggest3 != null ? incidentSuggest3.getApplied() : null, Boolean.TRUE)));
            }
        }
        e54Var = new e54(this, sq3Var);
        Object obj2 = e54Var.y;
        Serializable serializable2 = lu3.a;
        i = e54Var.A;
        if (i != 0) {
        }
        String str22 = str;
        Pair pair2 = (Pair) obj2;
        Integer num3 = (Integer) pair2.a;
        Integer num22 = (Integer) pair2.b;
        EventSuggest.IncidentSuggest incidentSuggest22 = w34Var.b;
        if (incidentSuggest22 == null) {
        }
        if (k24Var2.b.a) {
        }
        if (kxeVar4 != null) {
        }
        String e22 = j34.e(crowdsourcingIncidentType2, i());
        String str32 = e22;
        if (kxeVar3 == null) {
        }
        EventSuggest.IncidentSuggest incidentSuggest32 = w34Var.b;
        return new ey4(status2, crowdsourcingIncidentType2, str22, num3, num22, str32, str4, teamSide2, Boolean.valueOf(Intrinsics.c(incidentSuggest32 != null ? incidentSuggest32.getApplied() : null, Boolean.TRUE)));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z(kxe kxeVar, sq3 sq3Var) {
        p54 p54Var;
        int i;
        p44 p44Var;
        fdi fdiVar;
        Object value;
        boolean z;
        int intValue;
        Integer num;
        if (sq3Var instanceof p54) {
            p54Var = (p54) sq3Var;
            int i2 = p54Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p54Var.t = i2 - Integer.MIN_VALUE;
                Object obj = p54Var.r;
                Object obj2 = lu3.a;
                i = p54Var.t;
                if (i != 0) {
                    y6a.M(obj);
                    p54Var.t = 1;
                    obj = o(kxeVar, p54Var);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                p44Var = (p44) obj;
                if (p44Var != null) {
                    return Unit.a;
                }
                yq3 yq3Var = p44Var.a;
                List l = l(p44Var);
                do {
                    fdiVar = this.r;
                    value = fdiVar.getValue();
                    c0a c0aVar = (c0a) value;
                    int indexOf = l.indexOf(c0aVar.b());
                    z = c0aVar.a;
                    Integer valueOf = Integer.valueOf(c0aVar.b);
                    if (indexOf == -1) {
                        valueOf = null;
                    }
                    intValue = (valueOf == null && (valueOf = yq3Var.c) == null) ? 1 : valueOf.intValue();
                    num = c0aVar.c;
                    if (indexOf == -1) {
                        num = null;
                    }
                    if (num == null) {
                        num = yq3Var.d;
                    }
                } while (!fdiVar.k(value, new c0a(z, intValue, num, l6g.W(l))));
                return Unit.a;
            }
        }
        p54Var = new p54(this, sq3Var);
        Object obj3 = p54Var.r;
        Object obj22 = lu3.a;
        i = p54Var.t;
        if (i != 0) {
        }
        p44Var = (p44) obj3;
        if (p44Var != null) {
        }
    }
}
