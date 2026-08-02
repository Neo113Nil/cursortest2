package bo.app;

import bo.app.of;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class of extends c7 {

    /* renamed from: k, reason: collision with root package name */
    public final x7 f25895k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of(q5 dispatchDataProvider) {
        super(c9.f25337g, dispatchDataProvider);
        Intrinsics.checkNotNullParameter(dispatchDataProvider, "dispatchDataProvider");
        int k10 = dispatchDataProvider.f25944a.f25268j.k();
        this.f25895k = new x7((int) TimeUnit.MINUTES.toMillis(1L), x7.f26259g, k10, dispatchDataProvider.f25944a.f25268j.l());
    }

    public static final String b(id idVar, long j10) {
        return "Template request will not be retried. Marking as complete. " + idVar.a(j10);
    }

    public static final String c(id idVar, long j10) {
        return "Template request will expire before send time and is not eligible for a request retry. Not retrying or performing any fallback triggers. " + idVar.a(j10);
    }

    @Override // bo.app.c7
    public final x7 a() {
        return this.f25895k;
    }

    @Override // bo.app.c7
    public final void a(final long j10) {
        ArrayList arrayList = this.f25327e;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            if (((id) obj).f25574d == jd.f25624b) {
                arrayList2.add(obj);
            }
        }
        int size2 = arrayList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            final id idVar = (id) arrayList2.get(i12);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.N8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return of.b(bo.app.id.this, j10);
                }
            }, 7, (Object) null);
            idVar.a(j10, jd.f25627e);
        }
        ArrayList arrayList3 = this.f25327e;
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList3.size();
        int i13 = 0;
        while (i13 < size3) {
            Object obj2 = arrayList3.get(i13);
            i13++;
            if (((id) obj2).f25574d == jd.f25623a) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        int size4 = arrayList4.size();
        int i14 = 0;
        while (i14 < size4) {
            Object obj3 = arrayList4.get(i14);
            i14++;
            id idVar2 = (id) obj3;
            d9 d9Var = idVar2.f25571a;
            pf pfVar = d9Var instanceof pf ? (pf) d9Var : null;
            if ((pfVar != null ? ((gg) pfVar.f25913m).f25492b + pfVar.f25916p : -1L) < idVar2.f25572b) {
                arrayList5.add(obj3);
            }
        }
        int size5 = arrayList5.size();
        while (i10 < size5) {
            Object obj4 = arrayList5.get(i10);
            i10++;
            final id idVar3 = (id) obj4;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.O8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return of.c(bo.app.id.this, j10);
                }
            }, 7, (Object) null);
            idVar3.a(j10, jd.f25627e);
        }
    }
}
