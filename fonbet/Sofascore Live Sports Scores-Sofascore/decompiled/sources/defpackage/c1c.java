package defpackage;

import com.sofascore.model.Country;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class c1c {
    public static final int a;
    public static final ltb b;
    public static final c9h c;

    static {
        Country country = zu3.u0;
        a = ((Number) CollectionsKt.Y(country.getMccList())).intValue();
        ltb ltbVar = new ltb();
        List<Integer> mccList = country.getMccList();
        ArrayList arrayList = new ArrayList(k13.r(mccList, 10));
        Iterator<T> it = mccList.iterator();
        while (it.hasNext()) {
            arrayList.add(new Pair(Integer.valueOf(((Number) it.next()).intValue()), "FRACTIONAL"));
        }
        tub.m(ltbVar, arrayList);
        List<Integer> mccList2 = zu3.I.getMccList();
        ArrayList arrayList2 = new ArrayList(k13.r(mccList2, 10));
        Iterator<T> it2 = mccList2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new Pair(Integer.valueOf(((Number) it2.next()).intValue()), "FRACTIONAL"));
        }
        tub.m(ltbVar, arrayList2);
        List<Integer> mccList3 = zu3.g.getMccList();
        ArrayList arrayList3 = new ArrayList(k13.r(mccList3, 10));
        Iterator<T> it3 = mccList3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(new Pair(Integer.valueOf(((Number) it3.next()).intValue()), "FRACTIONAL"));
        }
        tub.m(ltbVar, arrayList3);
        List<Integer> mccList4 = zu3.i.getMccList();
        ArrayList arrayList4 = new ArrayList(k13.r(mccList4, 10));
        Iterator<T> it4 = mccList4.iterator();
        while (it4.hasNext()) {
            arrayList4.add(new Pair(Integer.valueOf(((Number) it4.next()).intValue()), "FRACTIONAL"));
        }
        tub.m(ltbVar, arrayList4);
        List<Integer> mccList5 = zu3.l.getMccList();
        ArrayList arrayList5 = new ArrayList(k13.r(mccList5, 10));
        Iterator<T> it5 = mccList5.iterator();
        while (it5.hasNext()) {
            arrayList5.add(new Pair(Integer.valueOf(((Number) it5.next()).intValue()), "FRACTIONAL"));
        }
        tub.m(ltbVar, arrayList5);
        List<Integer> mccList6 = zu3.B.getMccList();
        ArrayList arrayList6 = new ArrayList(k13.r(mccList6, 10));
        Iterator<T> it6 = mccList6.iterator();
        while (it6.hasNext()) {
            arrayList6.add(new Pair(Integer.valueOf(((Number) it6.next()).intValue()), "FRACTIONAL"));
        }
        tub.m(ltbVar, arrayList6);
        List<Integer> mccList7 = zu3.x.getMccList();
        ArrayList arrayList7 = new ArrayList(k13.r(mccList7, 10));
        Iterator<T> it7 = mccList7.iterator();
        while (it7.hasNext()) {
            arrayList7.add(new Pair(Integer.valueOf(((Number) it7.next()).intValue()), "FRACTIONAL"));
        }
        tub.m(ltbVar, arrayList7);
        List<Integer> mccList8 = zu3.s0.getMccList();
        ArrayList arrayList8 = new ArrayList(k13.r(mccList8, 10));
        Iterator<T> it8 = mccList8.iterator();
        while (it8.hasNext()) {
            arrayList8.add(new Pair(Integer.valueOf(((Number) it8.next()).intValue()), "FRACTIONAL"));
        }
        tub.m(ltbVar, arrayList8);
        List<Integer> mccList9 = zu3.v0.getMccList();
        ArrayList arrayList9 = new ArrayList(k13.r(mccList9, 10));
        Iterator<T> it9 = mccList9.iterator();
        while (it9.hasNext()) {
            arrayList9.add(new Pair(Integer.valueOf(((Number) it9.next()).intValue()), "AMERICAN"));
        }
        tub.m(ltbVar, arrayList9);
        List<Integer> mccList10 = zu3.w0.getMccList();
        ArrayList arrayList10 = new ArrayList(k13.r(mccList10, 10));
        Iterator<T> it10 = mccList10.iterator();
        while (it10.hasNext()) {
            arrayList10.add(new Pair(Integer.valueOf(((Number) it10.next()).intValue()), "AMERICAN"));
        }
        tub.m(ltbVar, arrayList10);
        List<Integer> mccList11 = zu3.b.getMccList();
        ArrayList arrayList11 = new ArrayList(k13.r(mccList11, 10));
        Iterator<T> it11 = mccList11.iterator();
        while (it11.hasNext()) {
            arrayList11.add(new Pair(Integer.valueOf(((Number) it11.next()).intValue()), "AMERICAN"));
        }
        tub.m(ltbVar, arrayList11);
        List<Integer> mccList12 = zu3.D.getMccList();
        ArrayList arrayList12 = new ArrayList(k13.r(mccList12, 10));
        Iterator<T> it12 = mccList12.iterator();
        while (it12.hasNext()) {
            arrayList12.add(new Pair(Integer.valueOf(((Number) it12.next()).intValue()), "AMERICAN"));
        }
        tub.m(ltbVar, arrayList12);
        List<Integer> mccList13 = zu3.Y.getMccList();
        ArrayList arrayList13 = new ArrayList(k13.r(mccList13, 10));
        Iterator<T> it13 = mccList13.iterator();
        while (it13.hasNext()) {
            arrayList13.add(new Pair(Integer.valueOf(((Number) it13.next()).intValue()), "AMERICAN"));
        }
        tub.m(ltbVar, arrayList13);
        List<Integer> mccList14 = zu3.e0.getMccList();
        ArrayList arrayList14 = new ArrayList(k13.r(mccList14, 10));
        Iterator<T> it14 = mccList14.iterator();
        while (it14.hasNext()) {
            arrayList14.add(new Pair(Integer.valueOf(((Number) it14.next()).intValue()), "AMERICAN"));
        }
        tub.m(ltbVar, arrayList14);
        b = ltbVar.d();
        c9h c9hVar = new c9h();
        c9hVar.addAll(zu3.G.getMccList());
        c9hVar.addAll(zu3.h0.getMccList());
        c9hVar.addAll(zu3.m.getMccList());
        c9hVar.addAll(zu3.d0.getMccList());
        c9hVar.addAll(zu3.r0.getMccList());
        c9hVar.addAll(zu3.H.getMccList());
        c9hVar.addAll(zu3.X.getMccList());
        c9hVar.addAll(zu3.l0.getMccList());
        c = w9h.a(c9hVar);
    }
}
