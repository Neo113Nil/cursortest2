package com.vk.voip.ui.groupcalls;

import android.util.LruCache;
import com.vk.voip.dto.call_member.CallMember;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.members.VoipDataProvider;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import io.reactivex.rxjava3.internal.operators.observable.y;
import io.reactivex.rxjava3.subjects.d;
import io.reactivex.rxjava3.subjects.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import xsna.a69;
import xsna.asp;
import xsna.asu0;
import xsna.c4r;
import xsna.c5g;
import xsna.ci7;
import xsna.ciu;
import xsna.epx;
import xsna.f39;
import xsna.fw3;
import xsna.fxj0;
import xsna.g5g;
import xsna.gzs;
import xsna.il90;
import xsna.io3;
import xsna.it80;
import xsna.j5g;
import xsna.j9k;
import xsna.jqt;
import xsna.jzi0;
import xsna.kiu;
import xsna.liu;
import xsna.mau;
import xsna.mj1;
import xsna.np1;
import xsna.ox0;
import xsna.p4g;
import xsna.rx0;
import xsna.sew0;
import xsna.tcu;
import xsna.uiu;
import xsna.ulp;
import xsna.viu;
import xsna.whr0;
import xsna.wiu;
import xsna.yza;
import xsna.z6u;
import xsna.z8f;
import xsna.zrp;

/* compiled from: GroupCallViewModel.kt */
/* loaded from: classes7.dex */
public final class GroupCallViewModel implements il90, f39 {
    public static final GroupCallViewModel b;
    public static c c;
    public static final d<GroupCallViewMode> d;
    public static GroupCallViewMode e;
    public static final ciu f;
    public static final ArrayList<kiu> g;
    public static final HashMap<CallMemberId, kiu> h;
    public static final jzi0 i;
    public static final f<b> j;
    public static final HashSet<String> k;
    public static final f<CallMemberId> l;
    public static final d<a> m;
    public static final jqt n;
    public static final uiu o;
    public static ArrayList p;
    public static Integer q;
    public static final liu r;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupCallViewModel.kt */
    public static final class GroupCallViewMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ GroupCallViewMode[] $VALUES;
        public static final GroupCallViewMode GridViewMode;
        public static final GroupCallViewMode MainSpeakerAndThumbsViewMode;

        static {
            GroupCallViewMode groupCallViewMode = new GroupCallViewMode("GridViewMode", 0);
            GridViewMode = groupCallViewMode;
            GroupCallViewMode groupCallViewMode2 = new GroupCallViewMode("MainSpeakerAndThumbsViewMode", 1);
            MainSpeakerAndThumbsViewMode = groupCallViewMode2;
            GroupCallViewMode[] groupCallViewModeArr = {groupCallViewMode, groupCallViewMode2};
            $VALUES = groupCallViewModeArr;
            $ENTRIES = new asp(groupCallViewModeArr);
        }

        public GroupCallViewMode() {
            throw null;
        }

        public static GroupCallViewMode valueOf(String str) {
            return (GroupCallViewMode) Enum.valueOf(GroupCallViewMode.class, str);
        }

        public static GroupCallViewMode[] values() {
            return (GroupCallViewMode[]) $VALUES.clone();
        }
    }

    /* compiled from: GroupCallViewModel.kt */
    public static final class a {
        public final List<CallMemberId> a;
        public final List<kiu> b;
        public final CallMemberId c;

        public a(List<CallMemberId> list, List<kiu> list2, CallMemberId callMemberId) {
            this.a = list;
            this.b = list2;
            this.c = callMemberId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            int a = fw3.a(this.a.hashCode() * 31, 31, this.b);
            CallMemberId callMemberId = this.c;
            return a + (callMemberId == null ? 0 : callMemberId.hashCode());
        }

        public final String toString() {
            return "ParticipantList(participantIds=" + this.a + ", participants=" + this.b + ", ownId=" + this.c + ')';
        }
    }

    /* compiled from: GroupCallViewModel.kt */
    public static final class b {
        public final LinkedHashSet a;
        public final LinkedHashSet b;
        public final LinkedHashSet c;
        public final LinkedHashSet d;

        public b(LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, LinkedHashSet linkedHashSet3, LinkedHashSet linkedHashSet4) {
            this.a = linkedHashSet;
            this.b = linkedHashSet2;
            this.c = linkedHashSet3;
            this.d = linkedHashSet4;
        }
    }

    static {
        GroupCallViewModel groupCallViewModel = new GroupCallViewModel();
        b = groupCallViewModel;
        GroupCallViewMode groupCallViewMode = GroupCallViewMode.GridViewMode;
        d = d.O0(groupCallViewMode);
        e = groupCallViewMode;
        f = new ciu(groupCallViewModel);
        g = new ArrayList<>();
        h = new HashMap<>();
        i = new jzi0(2);
        j = new f<>();
        k = new HashSet<>();
        l = new f<>();
        EmptyList emptyList = EmptyList.b;
        m = d.O0(new a(emptyList, emptyList, null));
        com.vk.voip.ui.c cVar = com.vk.voip.ui.c.b;
        cVar.getClass();
        n = new jqt(com.vk.voip.ui.c.j, new z6u(1));
        o = new uiu();
        p = new ArrayList();
        r = new liu(cVar);
    }

    public static boolean a(CallMember callMember, kiu kiuVar) {
        CallMember callMember2 = kiuVar.a;
        if (callMember2.n) {
            return false;
        }
        if (callMember.i != callMember2.i || !epx.f(callMember.s, callMember2.s)) {
            return true;
        }
        boolean z = callMember.g;
        CallMember callMember3 = kiuVar.a;
        if (z == callMember3.g && callMember.h == callMember3.h) {
            return k.contains(callMember.a.b) != kiuVar.m;
        }
        return true;
    }

    public static kiu b(CallMemberId callMemberId) {
        return h.get(callMemberId);
    }

    public static void e() {
        ArrayList arrayList = p;
        com.vk.voip.ui.c.b.getClass();
        m.onNext(new a(arrayList, g, com.vk.voip.ui.c.r.a()));
    }

    public static j1 f(gzs gzsVar) {
        ox0 ox0Var = new ox0(new j9k(gzsVar, 20), 21);
        f<CallMemberId> fVar = l;
        fVar.getClass();
        q o0 = new i0(fVar, ox0Var).a0(asu0.a.d()).U(new rx0(new yza(1, gzsVar), 26)).o0(x.k(new it80(h.get(gzsVar.invoke()))));
        np1 np1Var = new np1(new c4r(8), 21);
        o0.getClass();
        return new i0(o0, np1Var).U(new mau(new ci7(27), 1));
    }

    public static j1 g() {
        return m.U(new mj1(new viu(0), 24));
    }

    public static y i() {
        d<GroupCallViewMode> dVar = d;
        dVar.getClass();
        return new y(dVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
    }

    public static void l(whr0 whr0Var) {
        Iterable iterable = (Set) ((HashMap) i.a).get(whr0Var.a);
        if (iterable == null) {
            iterable = EmptySet.b;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            kiu kiuVar = h.get((CallMemberId) it.next());
            if (kiuVar != null) {
                kiuVar.d(whr0Var);
            }
        }
        e();
    }

    public static void m(List list) {
        List<CallMemberId> list2 = list;
        for (CallMemberId callMemberId : list2) {
            h.remove(callMemberId);
            k.remove(callMemberId.b);
        }
        Iterator<kiu> it = g.iterator();
        Set R0 = j5g.R0(list2);
        boolean z = false;
        while (it.hasNext() && !R0.isEmpty()) {
            kiu next = it.next();
            if (R0.contains(next.a.a)) {
                it.remove();
                R0.remove(next.a.a);
                z = true;
            }
        }
        if (z) {
            r();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void o() {
        boolean z;
        boolean z2;
        GroupCallViewMode groupCallViewMode;
        ciu ciuVar = f;
        GroupCallViewModel groupCallViewModel = ciuVar.a;
        ArrayList arrayList = p;
        int size = arrayList.size();
        Iterator it = arrayList.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            kiu b2 = b((CallMemberId) it.next());
            if (b2 != null && b2.a.i) {
                z2 = true;
                break;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            kiu b3 = b((CallMemberId) it2.next());
            if (b3 != null && !b3.a.s.isEmpty()) {
                z = true;
                break;
            }
        }
        ciu.a aVar = new ciu.a(size, z2, z);
        if (size > 1 && ciuVar.b.a == 1) {
            b.getClass();
            if (r.e == null) {
                groupCallViewMode = GroupCallViewMode.GridViewMode;
                if ((z2 && !ciuVar.b.b) || (z && !ciuVar.b.c)) {
                    groupCallViewMode = GroupCallViewMode.MainSpeakerAndThumbsViewMode;
                }
                ciuVar.b = aVar;
                if (groupCallViewMode != null) {
                    p(groupCallViewMode);
                    return;
                }
                return;
            }
        }
        groupCallViewMode = null;
        if (z2) {
            groupCallViewMode = GroupCallViewMode.MainSpeakerAndThumbsViewMode;
            ciuVar.b = aVar;
            if (groupCallViewMode != null) {
            }
        }
        groupCallViewMode = GroupCallViewMode.MainSpeakerAndThumbsViewMode;
        ciuVar.b = aVar;
        if (groupCallViewMode != null) {
        }
    }

    public static void p(GroupCallViewMode groupCallViewMode) {
        if (e == groupCallViewMode) {
            return;
        }
        e = groupCallViewMode;
        d.onNext(groupCallViewMode);
        com.vk.voip.ui.c.b.getClass();
        com.vk.voip.ui.c.D0();
    }

    public static void q(List list) {
        int i2;
        jqt jqtVar = n;
        if (jqtVar.a.c()) {
            jqtVar.c = list;
            return;
        }
        com.vk.voip.ui.c.b.getClass();
        if (com.vk.voip.ui.c.w0()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(((CallMember) it.next()).a);
            }
            z8f z8fVar = new z8f(hashSet, 18);
            ArrayList<kiu> arrayList = g;
            int i3 = 0;
            boolean D = g5g.D(arrayList, false, z8fVar);
            HashMap<CallMemberId, kiu> hashMap = h;
            if (D) {
                p4g.o(hashSet, hashMap);
                r();
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = list.iterator();
            boolean z = false;
            while (true) {
                i2 = 1;
                if (!it2.hasNext()) {
                    break;
                }
                CallMember callMember = (CallMember) it2.next();
                CallMemberId callMemberId = callMember.a;
                String str = callMemberId.b;
                kiu b2 = b(callMemberId);
                if (b2 == null) {
                    b2 = new kiu();
                    b2.a = callMember;
                    b2.c = "";
                    b2.d = "";
                    b2.e = "";
                    b2.f = "";
                    b2.g = "";
                    LruCache<String, fxj0> lruCache = sew0.a;
                    b2.h = sew0.a.b("", false, false);
                    jzi0 jzi0Var = i;
                    whr0 whr0Var = (whr0) ((HashMap) jzi0Var.b).get(str);
                    if (whr0Var != null) {
                        b2.d(whr0Var);
                    }
                    arrayList.add(b2);
                    hashMap.put(callMemberId, b2);
                    HashMap hashMap2 = (HashMap) jzi0Var.a;
                    Object obj = hashMap2.get(str);
                    if (obj == null) {
                        obj = new HashSet();
                        hashMap2.put(str, obj);
                    }
                    ((Set) obj).add(callMemberId);
                    linkedHashSet.add(callMemberId);
                } else if (a(callMember, b2)) {
                    b2.c(callMember);
                } else {
                    b2.m = k.contains(str);
                    CallMemberId callMemberId2 = b2.a.a;
                    b.getClass();
                    l.onNext(callMemberId2);
                }
                z = true;
                b2.m = k.contains(str);
                CallMemberId callMemberId22 = b2.a.a;
                b.getClass();
                l.onNext(callMemberId22);
            }
            if (!linkedHashSet.isEmpty()) {
                r();
            }
            if (z) {
                if (arrayList.size() > 1) {
                    g5g.L(arrayList, new wiu(i3));
                }
                r();
            }
            if (!linkedHashSet.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                Iterator<kiu> it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    kiu next = it3.next();
                    if (linkedHashSet.contains(next.a.a)) {
                        arrayList2.add(next.a.a);
                    }
                }
                com.vk.voip.ui.c.b.getClass();
                VoipDataProvider voipDataProvider = com.vk.voip.ui.c.d0;
                if (voipDataProvider == null) {
                    voipDataProvider = null;
                }
                io.reactivex.rxjava3.kotlin.c.e(voipDataProvider.j(arrayList2), new io3(21), new tcu(i2));
            }
            e();
        }
    }

    public static void r() {
        ArrayList<kiu> arrayList = g;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator<kiu> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().a.a);
        }
        p = arrayList2;
    }

    @Override // xsna.il90
    public final void d(il90.a aVar) {
        q(aVar.c);
    }

    @Override // xsna.il90
    public final void h(il90.c cVar) {
        m(j5g.O0(cVar.c.values()));
        q(cVar.d);
        e();
    }

    @Override // xsna.f39
    public final void j(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            kiu b2 = b(((a69) it.next()).b);
            if (b2 != null) {
                b2.k = null;
                CallMemberId callMemberId = b2.a.a;
                b.getClass();
                l.onNext(callMemberId);
            }
        }
    }

    public final void k(com.vk.voip.b bVar, boolean z) {
        ulp h2 = bVar.h();
        uiu uiuVar = o;
        if (z) {
            h2.h(this);
            h2.f(this);
            h2.g(uiuVar);
        } else {
            h2.l(this);
            h2.j(this);
            h2.k(uiuVar);
            q = null;
        }
    }

    @Override // xsna.f39
    public final void n(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a69 a69Var = (a69) it.next();
            kiu b2 = b(a69Var.b);
            if (b2 != null) {
                b2.k = a69Var.a;
                CallMemberId callMemberId = b2.a.a;
                b.getClass();
                l.onNext(callMemberId);
            }
        }
    }

    @Override // xsna.il90
    public final void s(il90.d dVar) {
        List<CallMember> list = dVar.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((CallMember) it.next()).a);
        }
        m(arrayList);
        e();
    }

    @Override // xsna.il90
    public final void t(il90.e eVar) {
        q(eVar.b);
    }

    @Override // xsna.il90
    public final void x(il90.b bVar) {
        List<CallMember> list = bVar.b;
        ArrayList arrayList = bVar.c;
        boolean z = false;
        for (CallMember callMember : list) {
            kiu b2 = b(callMember.a);
            if (b2 != null) {
                b.getClass();
                if (a(callMember, b2)) {
                    z = true;
                }
            }
        }
        if (z) {
            q(arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        for (CallMember callMember2 : list) {
            kiu b3 = b(callMember2.a);
            CallMemberId callMemberId = callMember2.a;
            if (!epx.f(callMember2.s, b3 != null ? b3.a.s : null)) {
                linkedHashSet3.add(callMemberId);
            }
            if (b3 == null || callMember2.i != b3.a.i) {
                linkedHashSet2.add(callMemberId);
            }
            if (b3 == null || callMember2.g != b3.a.g) {
                linkedHashSet.add(callMemberId);
            }
            if (b3 == null || callMember2.h != b3.a.h) {
                linkedHashSet4.add(callMemberId);
            }
        }
        j.onNext(new b(linkedHashSet, linkedHashSet2, linkedHashSet3, linkedHashSet4));
        for (CallMember callMember3 : list) {
            kiu b4 = b(callMember3.a);
            if (b4 != null) {
                b4.c(callMember3);
            }
        }
    }

    @Override // xsna.f39
    public final void c(String str) {
    }

    @Override // xsna.f39
    public final void onFeedbackEnabledChanged(boolean z) {
    }
}
