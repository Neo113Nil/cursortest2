package defpackage;

import android.content.Context;
import android.icu.text.DateTimePatternGenerator;
import android.text.format.DateFormat;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.TvChannel;
import com.sofascore.model.newNetwork.BaseTvEvent;
import com.sofascore.model.newNetwork.TvEvent;
import com.sofascore.model.newNetwork.TvStageEvent;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class e4k implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b98 b;
    public final /* synthetic */ g4k c;

    public /* synthetic */ e4k(b98 b98Var, g4k g4kVar, int i) {
        this.a = i;
        this.b = b98Var;
        this.c = g4kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0390, code lost:
    
        if (r13.emit(r5, r2) != r1) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0409, code lost:
    
        if (r4.emit(r0, r2) != r1) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x03f5, code lost:
    
        if (r0 == r1) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d5  */
    /* JADX WARN: Type inference failed for: r0v22, types: [b98, g4k] */
    @Override // defpackage.b98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, rq3 rq3Var) {
        d4k d4kVar;
        int i;
        int i2;
        Object obj2;
        int i3;
        b98 b98Var;
        Object obj3;
        f4k f4kVar;
        Object obj4;
        lu3 lu3Var;
        int i4;
        g4k g4kVar;
        g4k g4kVar2;
        g4k g4kVar3;
        b98 b98Var2;
        int i5;
        int i6;
        char c;
        int i7;
        g4k g4kVar4;
        g4k g4kVar5;
        g4k g4kVar6;
        b98 b98Var3;
        Iterator it;
        List list;
        char c2;
        int i8;
        int i9 = this.a;
        g4k g4kVar7 = this.c;
        b98 b98Var4 = this.b;
        char c3 = 2;
        rq3 rq3Var2 = null;
        int i10 = 1;
        switch (i9) {
            case 0:
                if (rq3Var instanceof d4k) {
                    d4kVar = (d4k) rq3Var;
                    int i11 = d4kVar.s;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        d4kVar.s = i11 - Integer.MIN_VALUE;
                        Object obj5 = d4kVar.r;
                        lu3 lu3Var2 = lu3.a;
                        i = d4kVar.s;
                        if (i == 0) {
                            if (i != 1) {
                                if (i == 2) {
                                    y6a.M(obj5);
                                    break;
                                } else {
                                    a70.r("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                }
                            } else {
                                i3 = d4kVar.u;
                                b98 b98Var5 = d4kVar.t;
                                y6a.M(obj5);
                                obj3 = obj5;
                                b98Var = b98Var5;
                            }
                        } else {
                            y6a.M(obj5);
                            List list2 = (List) obj;
                            if (list2.isEmpty() && g4kVar7.g.a.getBoolean("PREF_TV_SCHEDULE_FIRST_LOAD", true)) {
                                d4kVar.t = b98Var4;
                                i2 = 0;
                                d4kVar.u = 0;
                                d4kVar.s = 1;
                                Object k = g4kVar7.k(d4kVar);
                                obj2 = k;
                                break;
                            } else {
                                i2 = 0;
                                obj2 = list2;
                            }
                            i3 = i2;
                            obj3 = obj2;
                            b98Var = b98Var4;
                        }
                        d4kVar.t = null;
                        d4kVar.u = i3;
                        d4kVar.s = 2;
                        break;
                    }
                }
                d4kVar = new d4k(this, rq3Var);
                Object obj52 = d4kVar.r;
                lu3 lu3Var22 = lu3.a;
                i = d4kVar.s;
                if (i == 0) {
                }
                d4kVar.t = null;
                d4kVar.u = i3;
                d4kVar.s = 2;
                break;
            default:
                if (rq3Var instanceof f4k) {
                    f4kVar = (f4k) rq3Var;
                    int i12 = f4kVar.s;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        f4kVar.s = i12 - Integer.MIN_VALUE;
                        obj4 = f4kVar.r;
                        lu3Var = lu3.a;
                        i4 = f4kVar.s;
                        int i13 = 5;
                        int i14 = 3;
                        if (i4 == 0) {
                            if (i4 != 1) {
                                if (i4 != 2) {
                                    if (i4 == 3) {
                                        y6a.M(obj4);
                                        break;
                                    } else {
                                        a70.r("call to 'resume' before 'invoke' with coroutine");
                                        break;
                                    }
                                } else {
                                    i7 = f4kVar.u;
                                    g4kVar4 = f4kVar.y;
                                    g4kVar5 = f4kVar.x;
                                    g4kVar6 = f4kVar.w;
                                    b98Var3 = f4kVar.t;
                                    y6a.M(obj4);
                                    c = 0;
                                    g4kVar6.getClass();
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj6 : (Collection) obj4) {
                                        Object obj7 = ((Pair) obj6).b;
                                        Calendar calendar = (Calendar) CollectionsKt.h0(g4k.l());
                                        calendar.add(i13, 1);
                                        long timeInMillis = calendar.getTimeInMillis();
                                        if (obj7 instanceof Event) {
                                            if (((Event) obj7).getStartTimestamp() * 1000 <= timeInMillis) {
                                                c2 = c3;
                                                i8 = i14;
                                                arrayList.add(obj6);
                                            }
                                            c2 = c3;
                                            i8 = i14;
                                        } else {
                                            if (obj7 instanceof Stage) {
                                                c2 = c3;
                                                i8 = i14;
                                                Stage stage = (Stage) obj7;
                                                boolean R = CollectionsKt.R(ph0.a0(new ServerType[]{ServerType.PRACTICE, ServerType.RACE, ServerType.QUALIFYING, ServerType.SPRINT}), stage.getType());
                                                if (stage.getStartDateTimestamp() * 1000 <= timeInMillis) {
                                                    if (!R) {
                                                    }
                                                    arrayList.add(obj6);
                                                }
                                            }
                                            c2 = c3;
                                            i8 = i14;
                                        }
                                        c3 = c2;
                                        i14 = i8;
                                        i13 = 5;
                                    }
                                    char c4 = c3;
                                    int i15 = i14;
                                    g4kVar5.getClass();
                                    m39 m39Var = new m39(16);
                                    crj crjVar = new crj(19);
                                    crj crjVar2 = new crj(20);
                                    crj crjVar3 = new crj(21);
                                    crj crjVar4 = new crj(22);
                                    Function1[] function1Arr = new Function1[4];
                                    function1Arr[c] = crjVar;
                                    function1Arr[1] = crjVar2;
                                    function1Arr[c4] = crjVar3;
                                    function1Arr[i15] = crjVar4;
                                    List<Pair> H0 = CollectionsKt.H0(arrayList, new xl2(o93.a(function1Arr), m39Var, i10));
                                    g4kVar4.getClass();
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    it = g4k.l().iterator();
                                    while (it.hasNext()) {
                                        Calendar calendar2 = (Calendar) it.next();
                                        ArrayList arrayList2 = new ArrayList();
                                        int i16 = -1;
                                        int i17 = -1;
                                        for (Pair pair : H0) {
                                            Object obj8 = pair.b;
                                            Object obj9 = pair.a;
                                            if (obj8 instanceof Event) {
                                                Event event = (Event) obj8;
                                                list = H0;
                                                if (ug5.D(calendar2.getTimeInMillis() / 1000).isEqual(ug5.D(event.getStartTimestamp())) || (ug5.u(calendar2.getTimeInMillis() / 1000) && ug5.w(event.getStartTimestamp()))) {
                                                    if (event.getId() != i16) {
                                                        TvEvent tvEvent = new TvEvent((TvChannel) obj9, event);
                                                        tvEvent.setShowCountryFlag(g4kVar4.h);
                                                        arrayList2.add(tvEvent);
                                                        i16 = event.getId();
                                                    } else {
                                                        ((BaseTvEvent) CollectionsKt.h0(arrayList2)).addChannel((TvChannel) obj9);
                                                    }
                                                }
                                            } else {
                                                list = H0;
                                                if (obj8 instanceof Stage) {
                                                    Stage stage2 = (Stage) obj8;
                                                    if (ug5.D(calendar2.getTimeInMillis() / 1000).isEqual(ug5.D(stage2.getStartDateTimestamp())) || (ug5.u(calendar2.getTimeInMillis() / 1000) && ug5.w(stage2.getStartDateTimestamp()))) {
                                                        if (stage2.getId() != i17) {
                                                            TvStageEvent tvStageEvent = new TvStageEvent((TvChannel) obj9, stage2);
                                                            tvStageEvent.setShowCountryFlag(g4kVar4.h);
                                                            arrayList2.add(tvStageEvent);
                                                            i17 = stage2.getId();
                                                        } else {
                                                            ((BaseTvEvent) CollectionsKt.h0(arrayList2)).addChannel((TvChannel) obj9);
                                                        }
                                                    }
                                                }
                                            }
                                            H0 = list;
                                        }
                                        List list3 = H0;
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator it2 = arrayList2.iterator();
                                        long j = 0;
                                        while (it2.hasNext()) {
                                            BaseTvEvent baseTvEvent = (BaseTvEvent) it2.next();
                                            if (baseTvEvent instanceof TvEvent) {
                                                TvEvent tvEvent2 = (TvEvent) baseTvEvent;
                                                if (j != tvEvent2.getEvent().getStartTimestamp()) {
                                                    Context i18 = g4kVar4.i();
                                                    long startTimestamp = tvEvent2.getEvent().getStartTimestamp();
                                                    DateTimePatternGenerator b = hk4.b();
                                                    String bestPattern = DateFormat.is24HourFormat(i18) ? b.getBestPattern("Hm") : b.getBestPattern("hm");
                                                    bestPattern.getClass();
                                                    String format = hk4.a(bestPattern).format(Instant.ofEpochSecond(startTimestamp));
                                                    format.getClass();
                                                    arrayList3.add(format);
                                                    j = tvEvent2.getEvent().getStartTimestamp();
                                                }
                                            } else if (baseTvEvent instanceof TvStageEvent) {
                                                TvStageEvent tvStageEvent2 = (TvStageEvent) baseTvEvent;
                                                if (j != tvStageEvent2.getStage().getStartDateTimestamp()) {
                                                    Context i19 = g4kVar4.i();
                                                    long startDateTimestamp = tvStageEvent2.getStage().getStartDateTimestamp();
                                                    DateTimePatternGenerator b2 = hk4.b();
                                                    String bestPattern2 = DateFormat.is24HourFormat(i19) ? b2.getBestPattern("Hm") : b2.getBestPattern("hm");
                                                    bestPattern2.getClass();
                                                    String format2 = hk4.a(bestPattern2).format(Instant.ofEpochSecond(startDateTimestamp));
                                                    format2.getClass();
                                                    arrayList3.add(format2);
                                                    j = tvStageEvent2.getStage().getStartDateTimestamp();
                                                }
                                            }
                                            arrayList3.add(baseTvEvent);
                                        }
                                        linkedHashMap.put(calendar2, arrayList3);
                                        H0 = list3;
                                        rq3Var2 = null;
                                    }
                                    ?? r0 = rq3Var2;
                                    f4kVar.t = r0;
                                    f4kVar.w = r0;
                                    f4kVar.x = r0;
                                    f4kVar.y = r0;
                                    f4kVar.u = i7;
                                    f4kVar.s = i15;
                                    break;
                                }
                            } else {
                                int i20 = f4kVar.A;
                                i5 = f4kVar.u;
                                g4k g4kVar8 = f4kVar.z;
                                g4kVar = f4kVar.y;
                                g4kVar2 = f4kVar.x;
                                g4kVar3 = f4kVar.w;
                                b98Var2 = f4kVar.t;
                                y6a.M(obj4);
                                i6 = i20;
                                g4kVar7 = g4kVar8;
                            }
                        } else {
                            y6a.M(obj4);
                            List list4 = (List) obj;
                            ArrayList arrayList4 = new ArrayList(k13.r(list4, 10));
                            Iterator it3 = list4.iterator();
                            while (it3.hasNext()) {
                                arrayList4.add(((TvChannel) it3.next()).getCountryCode());
                            }
                            g4kVar7.h = CollectionsKt.W0(arrayList4).size() > 1;
                            f4kVar.t = b98Var4;
                            f4kVar.w = g4kVar7;
                            f4kVar.x = g4kVar7;
                            f4kVar.y = g4kVar7;
                            f4kVar.z = g4kVar7;
                            f4kVar.u = 0;
                            f4kVar.A = 0;
                            f4kVar.s = 1;
                            obj4 = xw3.R(z45.a, new kuj(list4, g4kVar7, rq3Var2, i13), f4kVar);
                            if (obj4 != lu3Var) {
                                g4kVar = g4kVar7;
                                g4kVar2 = g4kVar;
                                g4kVar3 = g4kVar2;
                                b98Var2 = b98Var4;
                                i5 = 0;
                                i6 = 0;
                            }
                            break;
                        }
                        f4kVar.t = b98Var2;
                        f4kVar.w = g4kVar3;
                        f4kVar.x = g4kVar2;
                        f4kVar.y = g4kVar;
                        f4kVar.z = null;
                        f4kVar.u = i5;
                        f4kVar.A = i6;
                        f4kVar.s = 2;
                        g4kVar7.getClass();
                        c = 0;
                        obj4 = xw3.R(z45.a, new b4k((Collection) obj4, g4kVar7, null), f4kVar);
                        if (obj4 != lu3Var) {
                            i7 = i5;
                            g4kVar4 = g4kVar;
                            g4kVar5 = g4kVar2;
                            g4kVar6 = g4kVar3;
                            b98Var3 = b98Var2;
                            g4kVar6.getClass();
                            ArrayList arrayList5 = new ArrayList();
                            while (r0.hasNext()) {
                            }
                            char c42 = c3;
                            int i152 = i14;
                            g4kVar5.getClass();
                            m39 m39Var2 = new m39(16);
                            crj crjVar5 = new crj(19);
                            crj crjVar22 = new crj(20);
                            crj crjVar32 = new crj(21);
                            crj crjVar42 = new crj(22);
                            Function1[] function1Arr2 = new Function1[4];
                            function1Arr2[c] = crjVar5;
                            function1Arr2[1] = crjVar22;
                            function1Arr2[c42] = crjVar32;
                            function1Arr2[i152] = crjVar42;
                            List<Pair> H02 = CollectionsKt.H0(arrayList5, new xl2(o93.a(function1Arr2), m39Var2, i10));
                            g4kVar4.getClass();
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            it = g4k.l().iterator();
                            while (it.hasNext()) {
                            }
                            ?? r02 = rq3Var2;
                            f4kVar.t = r02;
                            f4kVar.w = r02;
                            f4kVar.x = r02;
                            f4kVar.y = r02;
                            f4kVar.u = i7;
                            f4kVar.s = i152;
                        }
                    }
                }
                f4kVar = new f4k(this, rq3Var);
                obj4 = f4kVar.r;
                lu3Var = lu3.a;
                i4 = f4kVar.s;
                int i132 = 5;
                int i142 = 3;
                if (i4 == 0) {
                }
                f4kVar.t = b98Var2;
                f4kVar.w = g4kVar3;
                f4kVar.x = g4kVar2;
                f4kVar.y = g4kVar;
                f4kVar.z = null;
                f4kVar.u = i5;
                f4kVar.A = i6;
                f4kVar.s = 2;
                g4kVar7.getClass();
                c = 0;
                obj4 = xw3.R(z45.a, new b4k((Collection) obj4, g4kVar7, null), f4kVar);
                if (obj4 != lu3Var) {
                }
                break;
        }
        return Unit.a;
    }
}
