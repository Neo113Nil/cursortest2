package com.vk.clips.interests.impl.feature;

import com.vk.clips.interests.impl.feature.ClipsInterestsState;
import com.vk.clips.interests.impl.feature.b;
import com.vk.clips.interests.impl.ui.ClipsInterestsViewState;
import com.vk.clips.interests.impl.ui.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptySet;
import xsna.a7f0;
import xsna.c5g;
import xsna.cie;
import xsna.ed;
import xsna.f4z;
import xsna.fie;
import xsna.fld;
import xsna.fr5;
import xsna.ghe;
import xsna.gzs;
import xsna.izi0;
import xsna.j5g;
import xsna.jge;
import xsna.k00;
import xsna.khe;
import xsna.l00;
import xsna.nw5;
import xsna.qhe;
import xsna.qm1;
import xsna.sd4;
import xsna.wk50;
import xsna.yge;

/* compiled from: ClipsInterestsFeature.kt */
/* loaded from: classes16.dex */
public final class a extends wk50<ClipsInterestsViewState, ClipsInterestsState, com.vk.clips.interests.impl.ui.a, b> {
    public final qhe f;
    public final fr5 g;
    public final cie h;
    public final f4z<ghe> i;
    public final f4z<fie> j;

    /* compiled from: ClipsInterestsFeature.kt */
    /* renamed from: com.vk.clips.interests.impl.feature.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0619a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ClipsInterestsState.Content.Step.values().length];
            try {
                iArr[ClipsInterestsState.Content.Step.MAIN_CATEGORIES_CHOICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsInterestsState.Content.Step.SUB_CATEGORIES_CHOICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ClipsInterestsState.Content.FlowCompletedType.values().length];
            try {
                iArr2[ClipsInterestsState.Content.FlowCompletedType.FLOW_FINISHED_CONTENT_VISIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ClipsInterestsState.Content.FlowCompletedType.FLOW_FINISHED_CONTENT_HIDDEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ClipsInterestsState.Content.FlowCompletedType.FLOW_IN_PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public a(qhe qheVar, fr5 fr5Var, c cVar, cie cieVar) {
        super(a.C0621a.b, cVar);
        this.f = qheVar;
        this.g = fr5Var;
        this.h = cieVar;
        this.i = new f4z<>();
        this.j = new f4z<>();
        cieVar.a();
    }

    @Override // xsna.wk50
    public final void N(ClipsInterestsState clipsInterestsState, com.vk.clips.interests.impl.ui.a aVar) {
        boolean z;
        Iterable iterable;
        Set k;
        ClipsInterestsState clipsInterestsState2 = clipsInterestsState;
        com.vk.clips.interests.impl.ui.a aVar2 = aVar;
        Object obj = null;
        if (aVar2 instanceof a.C0621a) {
            if (clipsInterestsState2 instanceof ClipsInterestsState.Content) {
                return;
            }
            T(khe.b);
            X();
            a7f0.a.f(this, this.g.i(), new qm1(this, 28), null, 5);
            return;
        }
        if (aVar2 instanceof a.b) {
            a.b bVar = (a.b) aVar2;
            if (clipsInterestsState2 instanceof ClipsInterestsState.Content) {
                ClipsInterestsState.Content content = (ClipsInterestsState.Content) clipsInterestsState2;
                List<jge.b> list = content.e;
                Set<fld> set = content.f;
                fld fldVar = bVar.b;
                boolean contains = set.contains(fldVar);
                Iterator<T> it = content.d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((jge.a) next).a.equals(fldVar)) {
                        obj = next;
                        break;
                    }
                }
                jge.a aVar3 = (jge.a) obj;
                if (aVar3 == null || (iterable = j5g.S0(aVar3.d)) == null) {
                    iterable = EmptySet.b;
                }
                if (contains) {
                    Set i = izi0.i(fldVar);
                    Iterable iterable2 = iterable;
                    ArrayList arrayList = new ArrayList(c5g.u(iterable2, 10));
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((jge.b) it2.next()).a);
                    }
                    k = izi0.g(set, izi0.j(i, arrayList));
                } else {
                    k = izi0.k(set, fldVar);
                }
                T(new b.e(k, contains ? j5g.t0(list, iterable) : j5g.u0(iterable, list)));
                return;
            }
            return;
        }
        boolean z2 = aVar2 instanceof a.c.C0622a;
        cie cieVar = this.h;
        if (z2) {
            ClipsInterestsState.Content content2 = clipsInterestsState2 instanceof ClipsInterestsState.Content ? (ClipsInterestsState.Content) clipsInterestsState2 : null;
            if ((content2 != null ? content2.c : null) != ClipsInterestsState.Content.Step.SUB_CATEGORIES_CHOICE) {
                cieVar.f();
                U(true, false);
                return;
            } else {
                cieVar.e();
                this.j.b(fie.a);
                T(b.a.b);
                return;
            }
        }
        if (!(aVar2 instanceof a.d)) {
            if (aVar2 instanceof a.f) {
                if (clipsInterestsState2 instanceof ClipsInterestsState.Content) {
                    return;
                }
                T(khe.b);
                X();
                return;
            }
            if (!(aVar2 instanceof a.e)) {
                if (!(aVar2 instanceof a.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                U(false, false);
                return;
            }
            ClipsInterestsState.Content content3 = clipsInterestsState2 instanceof ClipsInterestsState.Content ? (ClipsInterestsState.Content) clipsInterestsState2 : null;
            ClipsInterestsState.Content.FlowCompletedType flowCompletedType = content3 != null ? content3.g : null;
            int i2 = flowCompletedType == null ? -1 : C0619a.$EnumSwitchMapping$1[flowCompletedType.ordinal()];
            if (i2 != -1) {
                if (i2 == 1) {
                    T(b.d.b);
                    return;
                } else if (i2 == 2) {
                    T(b.d.b);
                    return;
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
            }
            return;
        }
        if (clipsInterestsState2 instanceof ClipsInterestsState.Content) {
            ClipsInterestsState.Content content4 = (ClipsInterestsState.Content) clipsInterestsState2;
            ClipsInterestsState.Content.Step step = content4.c;
            List<jge.b> list2 = content4.e;
            Set<fld> set2 = content4.f;
            int i3 = C0619a.$EnumSwitchMapping$0[step.ordinal()];
            if (i3 == 1) {
                List<jge.a> list3 = content4.d;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator<T> it3 = list3.iterator();
                    while (it3.hasNext()) {
                        if (set2.contains(((jge.a) it3.next()).a)) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                List<jge.b> list4 = list2;
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    Iterator<T> it4 = list4.iterator();
                    while (it4.hasNext()) {
                        if (set2.contains(((jge.b) it4.next()).a)) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
            }
            int i4 = C0619a.$EnumSwitchMapping$0[content4.c.ordinal()];
            qhe qheVar = this.f;
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                cieVar.e();
                qheVar.g(set2);
                U(false, z);
                return;
            }
            cieVar.f();
            if (!list2.isEmpty()) {
                T(new b.c(j5g.D0(new nw5(set2, 1), list2)));
            } else {
                qheVar.g(set2);
                U(false, z);
            }
        }
    }

    @Override // xsna.wk50
    public final List<com.vk.clips.interests.impl.ui.a> Q(ClipsInterestsState clipsInterestsState, ClipsInterestsState clipsInterestsState2, b bVar) {
        ClipsInterestsState clipsInterestsState3 = clipsInterestsState;
        ClipsInterestsState clipsInterestsState4 = clipsInterestsState2;
        b bVar2 = bVar;
        boolean z = clipsInterestsState4 instanceof ClipsInterestsState.Content;
        if (z) {
            ClipsInterestsState.Content content = (ClipsInterestsState.Content) clipsInterestsState4;
            if (content.g == ClipsInterestsState.Content.FlowCompletedType.FLOW_IN_PROGRESS) {
                ClipsInterestsState.Content content2 = z ? content : null;
                ClipsInterestsState.Content.Step step = content2 != null ? content2.c : null;
                ClipsInterestsState.Content content3 = clipsInterestsState3 instanceof ClipsInterestsState.Content ? (ClipsInterestsState.Content) clipsInterestsState3 : null;
                if (step != (content3 != null ? content3.c : null)) {
                    int i = C0619a.$EnumSwitchMapping$0[content.c.ordinal()];
                    cie cieVar = this.h;
                    if (i == 1) {
                        cieVar.d();
                    } else {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cieVar.c();
                    }
                }
            }
        }
        super.Q(clipsInterestsState3, clipsInterestsState4, bVar2);
        return null;
    }

    public final void U(final boolean z, final boolean z2) {
        a7f0.a.d(this, this.f.b(), null, null, new gzs() { // from class: xsna.kge
            @Override // xsna.gzs
            public final Object invoke() {
                boolean z3 = z;
                com.vk.clips.interests.impl.feature.a aVar = this;
                if (z3) {
                    aVar.i.b(ghe.a.a);
                } else {
                    aVar.T(new b.C0620b(z2));
                }
                aVar.h.b();
                return s3q0.a;
            }
        }, 3);
    }

    public final f4z<fie> V() {
        return this.j;
    }

    public final f4z<ghe> W() {
        return this.i;
    }

    public final void X() {
        a7f0.a.f(this, this.f.h(yge.a.a).l(new ed(new sd4(this, 10), 10)), new k00(this, 28), new l00(this, 21), 1);
    }
}
