package ru.ozon.android.messenger.framework.domain.usecases;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalTime;
import ru.ozon.android.messenger.framework.presentation.models.C9515b;
import ru.ozon.android.messenger.framework.presentation.models.t;

/* loaded from: classes10.dex */
public final class K {
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(int i11, int i12, @NotNull List allItems) {
        C9515b e11;
        C9515b e12;
        boolean z11;
        boolean z12;
        Intrinsics.checkNotNullParameter(allItems, "allItems");
        if (allItems.isEmpty()) {
            return;
        }
        int f7 = kotlin.ranges.h.f(i11, new IntRange(0, C7714v.P(allItems), 1));
        int f11 = kotlin.ranges.h.f(i12, new IntRange(0, C7714v.P(allItems), 1));
        int i13 = f7 - 1;
        if (i13 < 0) {
            i13 = 0;
        }
        if (i13 <= f11) {
            while (true) {
                ru.ozon.android.messenger.framework.presentation.models.q qVar = (ru.ozon.android.messenger.framework.presentation.models.q) allItems.get(i13);
                if ((qVar.c() instanceof ru.ozon.android.messenger.framework.presentation.models.s) && (((ru.ozon.android.messenger.framework.presentation.models.s) qVar.c()).j() instanceof t.a)) {
                    ru.ozon.android.messenger.framework.presentation.models.q qVar2 = (ru.ozon.android.messenger.framework.presentation.models.q) ru.ozon.android.messenger.utils.b.b(allItems, i13 + 1, allItems.size(), J.f88986b);
                    ru.ozon.android.messenger.framework.presentation.models.s sVar = (ru.ozon.android.messenger.framework.presentation.models.s) qVar.c();
                    ru.ozon.android.messenger.framework.presentation.models.p c11 = qVar2 != null ? qVar2.c() : null;
                    ru.ozon.android.messenger.framework.presentation.models.s sVar2 = c11 instanceof ru.ozon.android.messenger.framework.presentation.models.s ? (ru.ozon.android.messenger.framework.presentation.models.s) c11 : null;
                    if (!sVar.p() && (sVar.j() instanceof t.a)) {
                        if ((sVar2 != null ? sVar2.j() : null) instanceof t.a) {
                            C9515b e13 = sVar.e();
                            String id2 = e13 != null ? e13.getId() : null;
                            C9515b e14 = sVar2.e();
                            if (Intrinsics.d(id2, e14 != null ? e14.getId() : null)) {
                                z12 = true;
                                int n11 = sVar2 == null ? Days.A(sVar.h(), sVar2.h()).n() : 0;
                                if (z12 || n11 > 0) {
                                    z11 = true;
                                    allItems.set(i13, ru.ozon.android.messenger.framework.presentation.models.q.a(qVar, null, ru.ozon.android.messenger.framework.presentation.models.s.d((ru.ozon.android.messenger.framework.presentation.models.s) qVar.c(), null, new t.a(z11), null, 0.0d, false, false, 0, null, 262139), 1));
                                }
                            }
                        }
                        z12 = false;
                        if (sVar2 == null) {
                        }
                        if (z12) {
                        }
                        z11 = true;
                        allItems.set(i13, ru.ozon.android.messenger.framework.presentation.models.q.a(qVar, null, ru.ozon.android.messenger.framework.presentation.models.s.d((ru.ozon.android.messenger.framework.presentation.models.s) qVar.c(), null, new t.a(z11), null, 0.0d, false, false, 0, null, 262139), 1));
                    }
                    z11 = false;
                    allItems.set(i13, ru.ozon.android.messenger.framework.presentation.models.q.a(qVar, null, ru.ozon.android.messenger.framework.presentation.models.s.d((ru.ozon.android.messenger.framework.presentation.models.s) qVar.c(), null, new t.a(z11), null, 0.0d, false, false, 0, null, 262139), 1));
                }
                if (i13 == f11) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        int i14 = f11 + 1;
        int P11 = C7714v.P(allItems);
        if (i14 <= P11) {
            P11 = i14;
        }
        if (f7 <= P11) {
            int i15 = f7;
            while (true) {
                ru.ozon.android.messenger.framework.presentation.models.q qVar3 = (ru.ozon.android.messenger.framework.presentation.models.q) allItems.get(i15);
                if (qVar3.c() instanceof ru.ozon.android.messenger.framework.presentation.models.s) {
                    ru.ozon.android.messenger.framework.presentation.models.q qVar4 = (ru.ozon.android.messenger.framework.presentation.models.q) ru.ozon.android.messenger.utils.b.c(allItems, i15, I.f88985b);
                    ru.ozon.android.messenger.framework.presentation.models.p c12 = qVar4 != null ? qVar4.c() : null;
                    ru.ozon.android.messenger.framework.presentation.models.s sVar3 = c12 instanceof ru.ozon.android.messenger.framework.presentation.models.s ? (ru.ozon.android.messenger.framework.presentation.models.s) c12 : null;
                    String id3 = (sVar3 == null || (e12 = sVar3.e()) == null) ? null : e12.getId();
                    ru.ozon.android.messenger.framework.presentation.models.s f12 = ru.ozon.android.messenger.framework.presentation.models.r.f(qVar3);
                    boolean d11 = Intrinsics.d(id3, (f12 == null || (e11 = f12.e()) == null) ? null : e11.getId());
                    boolean z13 = !d11;
                    if (!d11) {
                        ru.ozon.android.messenger.framework.presentation.models.s sVar4 = (ru.ozon.android.messenger.framework.presentation.models.s) qVar3.c();
                        Iterator<T> it = qVar3.b().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ru.ozon.android.messenger.framework.presentation.models.g c13 = ((ru.ozon.android.messenger.framework.presentation.models.u) it.next()).c();
                            ru.ozon.android.messenger.framework.presentation.models.i iVar = c13 instanceof ru.ozon.android.messenger.framework.presentation.models.i ? (ru.ozon.android.messenger.framework.presentation.models.i) c13 : null;
                            if (iVar != null) {
                                C9515b e15 = sVar4.e();
                                iVar.b(e15 != null ? e15.getName() : null);
                            }
                        }
                    }
                    allItems.set(i15, ru.ozon.android.messenger.framework.presentation.models.q.a(qVar3, null, ru.ozon.android.messenger.framework.presentation.models.s.d((ru.ozon.android.messenger.framework.presentation.models.s) qVar3.c(), null, null, null, 0.0d, z13, false, 0, null, 261119), 1));
                }
                if (i15 == P11) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        for (ru.ozon.android.messenger.framework.presentation.models.q qVar5 : allItems.subList(f7, i14)) {
            if (qVar5.c() instanceof ru.ozon.android.messenger.framework.presentation.models.s) {
                Iterator it2 = C7714v.z0(qVar5.b()).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        ru.ozon.android.messenger.framework.presentation.models.g c14 = ((ru.ozon.android.messenger.framework.presentation.models.u) it2.next()).c();
                        ru.ozon.android.messenger.framework.presentation.models.j jVar = c14 instanceof ru.ozon.android.messenger.framework.presentation.models.j ? (ru.ozon.android.messenger.framework.presentation.models.j) c14 : null;
                        if (jVar != null) {
                            ru.ozon.android.messenger.framework.presentation.models.s sVar5 = (ru.ozon.android.messenger.framework.presentation.models.s) qVar5.c();
                            Intrinsics.checkNotNullParameter(sVar5, "<this>");
                            DateTime h11 = sVar5.h();
                            h11.getClass();
                            String h12 = org.joda.time.format.a.b("HH:mm").h(new LocalTime(h11.getMillis(), h11.getChronology()));
                            Intrinsics.checkNotNullExpressionValue(h12, "toString(...)");
                            jVar.setSendTime(h12);
                            break;
                        }
                    }
                }
            }
        }
    }
}
