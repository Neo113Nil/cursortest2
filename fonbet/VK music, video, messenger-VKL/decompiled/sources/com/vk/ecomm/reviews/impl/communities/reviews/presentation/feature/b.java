package com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature;

import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.e;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.a7f0;
import xsna.big0;
import xsna.c5g;
import xsna.epx;
import xsna.ezh;
import xsna.f4z;
import xsna.fzh;
import xsna.gzh;
import xsna.hib;
import xsna.izh;
import xsna.izs;
import xsna.k4g0;
import xsna.kj50;
import xsna.km50;
import xsna.kyh;
import xsna.nj50;
import xsna.np5;
import xsna.oa;
import xsna.oj50;
import xsna.pq20;
import xsna.q45;
import xsna.qt5;
import xsna.tlo0;
import xsna.tq;
import xsna.txh;
import xsna.up2;
import xsna.vyh;
import xsna.vzh;
import xsna.wj50;
import xsna.wk50;
import xsna.xxh;
import xsna.yb3;
import xsna.yf7;
import xsna.yig0;
import xsna.zig0;

/* compiled from: CommunityReviewRepliesActionDelegate.kt */
/* loaded from: classes18.dex */
public final class b implements oj50<vzh, c, e> {
    public final gzh a;
    public final wj50<vyh> b;
    public final wj50<kyh> c;
    public final wj50<izh> d;

    public b(gzh gzhVar, f4z f4zVar, f4z f4zVar2, f4z f4zVar3) {
        this.a = gzhVar;
        this.b = f4zVar;
        this.c = f4zVar2;
        this.d = f4zVar3;
    }

    public static k4g0 b(int i, int i2, Map map) {
        List<k4g0> list;
        txh txhVar = (txh) map.get(Integer.valueOf(i));
        Object obj = null;
        if (txhVar == null || (list = txhVar.q) == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((k4g0) next).a == i2) {
                obj = next;
                break;
            }
        }
        return (k4g0) obj;
    }

    public static void d(nj50 nj50Var, boolean z, vzh vzhVar) {
        if (z && !vzhVar.s) {
            nj50Var.b(new e.q(true));
        } else {
            if (z || !vzhVar.s) {
                return;
            }
            nj50Var.b(new e.q(false));
        }
    }

    public static void e(wk50.a aVar, vzh vzhVar, int i, int i2, izs izsVar) {
        txh txhVar = vzhVar.n.get(Integer.valueOf(i));
        if (txhVar == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(txhVar.q);
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k4g0 k4g0Var = (k4g0) it.next();
            if (k4g0Var.a == i2) {
                k4g0Var = (k4g0) izsVar.invoke(k4g0Var);
            }
            arrayList2.add(k4g0Var);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(vzhVar.n);
        linkedHashMap.put(Integer.valueOf(i), txh.a(txhVar, 0, false, false, false, arrayList2, false, 2031615));
        aVar.b(new e.s(linkedHashMap));
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        UserId userId;
        UserId userId2;
        ListBuilder k;
        int i;
        int i2;
        k4g0 b;
        vzh vzhVar = (vzh) km50Var;
        c cVar = (c) kj50Var;
        boolean z = vzhVar.c;
        zig0 zig0Var = vzhVar.A;
        UserId userId3 = vzhVar.b;
        yig0 yig0Var = vzhVar.y;
        Map<Integer, txh> map = vzhVar.n;
        if (cVar instanceof c.u) {
            c.u uVar = (c.u) cVar;
            if (uVar instanceof c.u.j) {
                c.u.j jVar = (c.u.j) cVar;
                e(aVar, vzhVar, jVar.c, jVar.b, new oa(16));
                return;
            }
            boolean z2 = uVar instanceof c.u.h;
            int i3 = 0;
            wj50<vyh> wj50Var = this.b;
            int i4 = 1;
            gzh gzhVar = this.a;
            if (z2) {
                c.u.h hVar = (c.u.h) cVar;
                String str = hVar.b;
                List<Attachment> list = hVar.c;
                int i5 = 6;
                if (zig0Var == null) {
                    Integer num = yig0Var.a;
                    if (num != null) {
                        int intValue = num.intValue();
                        Integer num2 = yig0Var.b;
                        d(aVar, true, vzhVar);
                        UserId userId4 = yig0Var.d;
                        if (userId4 == null) {
                            return;
                        }
                        a7f0.a.f(aVar, gzhVar.b.c(intValue, userId4, num2, str, list != null ? pq20.c(gzhVar.f, list) : null).l(new ezh(fzh.b, 0)), new np5(i5, this, aVar), new qt5(7, aVar, this), 1);
                        return;
                    }
                    return;
                }
                if (zig0Var == null || (b = b((i = zig0Var.a), (i2 = zig0Var.b), map)) == null) {
                    return;
                }
                CharSequence charSequence = b.f;
                List<Attachment> list2 = b.j;
                if (str.equals(charSequence) && epx.f(list2, list)) {
                    aVar.b(e.p.a.b);
                    wj50Var.b(new vyh.d("", EmptyList.b));
                    return;
                } else {
                    d(aVar, true, vzhVar);
                    a7f0.a.f(aVar, gzhVar.b.e(i, i2, str, list != null ? pq20.c(gzhVar.f, list) : null), new com.vk.movika.sdk.base.logic.processor.d(i5, this, aVar), new q45(this, aVar, vzhVar, 4), 1);
                    return;
                }
            }
            if (uVar instanceof c.u.a) {
                c.u.a aVar2 = (c.u.a) cVar;
                int i6 = aVar2.c;
                UserId userId5 = yig0Var.d;
                if (userId5 == null) {
                    userId5 = vzhVar.g;
                }
                if (!z) {
                    userId3 = userId5;
                }
                Integer num3 = aVar2.b;
                aVar.b(new e.p.b(Integer.valueOf(i6), num3, aVar2.d, userId3));
                c(i6, num3, vzhVar);
                return;
            }
            boolean z3 = uVar instanceof c.u.i;
            wj50<izh> wj50Var2 = this.d;
            if (z3) {
                wj50Var2.b(new izh.d(userId3, ((c.u.i) cVar).b));
                return;
            }
            if (uVar instanceof c.u.f) {
                aVar.b(e.p.a.b);
                return;
            }
            if (uVar instanceof c.u.e) {
                if (zig0Var != null) {
                    wj50Var.b(new vyh.d("", EmptyList.b));
                    aVar.b(e.p.a.b);
                    return;
                } else {
                    Integer num4 = yig0Var.a;
                    if (num4 != null) {
                        c(num4.intValue(), yig0Var.b, vzhVar);
                        return;
                    }
                    return;
                }
            }
            if (uVar instanceof c.u.b) {
                UserId userId6 = yig0Var.d;
                if (userId6 == null) {
                    userId6 = UserId.d;
                }
                wj50Var2.b(new izh.g(userId3, userId6));
                return;
            }
            if (uVar instanceof c.u.C1016c) {
                aVar.b(new e.p.d(((c.u.C1016c) cVar).b));
                return;
            }
            if (uVar instanceof c.u.d) {
                c.u.d dVar = (c.u.d) cVar;
                int i7 = dVar.c;
                int i8 = dVar.b;
                k4g0 b2 = b(i7, i8, map);
                if (b2 == null || (k = up2.k(b2.f.toString(), b2.g, b2.i, b2.e)) == null) {
                    return;
                }
                this.c.b(new kyh.h(i8, i7, k));
                return;
            }
            if (uVar instanceof c.u.g) {
                c.u.g gVar = (c.u.g) cVar;
                d(aVar, true, vzhVar);
                a7f0.a.d(aVar, gzhVar.b.d(gVar.b, gVar.c), null, new yf7(this, aVar, vzhVar, i4), new yb3(this, aVar, vzhVar, gVar), 1);
                return;
            }
            if (!(uVar instanceof c.u.k)) {
                throw new NoWhenBranchMatchedException();
            }
            c.u.k kVar = (c.u.k) cVar;
            if (kVar instanceof c.u.k.a) {
                c.u.k.a aVar3 = (c.u.k.a) kVar;
                k4g0 b3 = b(aVar3.c, aVar3.b, map);
                wj50Var.b(new vyh.a(String.valueOf(b3 != null ? b3.f : null)));
                wj50Var.b(new vyh.f(tq.h(tlo0.Companion, R.string.text_copied)));
                return;
            }
            if (!(kVar instanceof c.u.k.d)) {
                if (kVar instanceof c.u.k.b) {
                    c.u.k.b bVar = (c.u.k.b) kVar;
                    d(aVar, true, vzhVar);
                    a7f0.a.d(aVar, gzhVar.b.a(bVar.c, bVar.b), null, new xxh(this, aVar, vzhVar, i3), new hib(this, aVar, vzhVar, bVar), 1);
                    return;
                } else {
                    if (!(kVar instanceof c.u.k.C1017c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c.u.k.C1017c c1017c = (c.u.k.C1017c) kVar;
                    int i9 = c1017c.c;
                    int i10 = c1017c.b;
                    k4g0 b4 = b(i9, i10, map);
                    if (b4 == null) {
                        return;
                    }
                    aVar.b(new e.p.c(new zig0(b4.b, b4.a)));
                    wj50Var.b(new vyh.d(b4.f.toString(), b4.j));
                    c(i9, Integer.valueOf(i10), vzhVar);
                    return;
                }
            }
            c.u.k.d dVar2 = (c.u.k.d) kVar;
            int i11 = dVar2.c;
            int i12 = dVar2.b;
            k4g0 b5 = b(i11, i12, map);
            if (b5 == null) {
                return;
            }
            big0 big0Var = b5.c;
            if (z) {
                Integer valueOf = Integer.valueOf(i11);
                Integer valueOf2 = Integer.valueOf(i12);
                if (big0Var == null || (userId2 = big0Var.a) == null) {
                    userId2 = UserId.d;
                }
                aVar.b(new e.p.b(valueOf, valueOf2, userId2, userId3));
            } else {
                if (big0Var == null || (userId = big0Var.a) == null) {
                    userId = UserId.d;
                }
                aVar.a(new c.u.a(i11, Integer.valueOf(i12), userId));
            }
            c(i11, Integer.valueOf(i12), vzhVar);
        }
    }

    public final void c(int i, Integer num, vzh vzhVar) {
        k4g0 k4g0Var;
        boolean z;
        Integer num2;
        List<k4g0> list;
        Object obj;
        if (num == null) {
            num2 = Integer.valueOf(i);
            z = true;
        } else {
            txh txhVar = vzhVar.n.get(Integer.valueOf(i));
            if (txhVar == null || (list = txhVar.q) == null) {
                k4g0Var = null;
            } else {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((k4g0) obj).a == num.intValue()) {
                            break;
                        }
                    }
                }
                k4g0Var = (k4g0) obj;
            }
            if (k4g0Var != null) {
                z = false;
                num2 = Integer.valueOf(k4g0Var.k);
            } else {
                z = false;
                num2 = null;
            }
        }
        this.b.b(new vyh.c(num2, z, true));
    }

    public final void f(wk50.a aVar) {
        aVar.b(e.p.a.b);
        this.b.b(new vyh.d("", EmptyList.b));
        aVar.a(c.t.b);
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
