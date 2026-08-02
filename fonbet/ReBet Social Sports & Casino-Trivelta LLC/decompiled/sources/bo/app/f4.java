package bo.app;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f4 extends c7 {

    /* renamed from: k, reason: collision with root package name */
    public static final String f25451k = BrazeLogger.getBrazeLogTag((Class<?>) f4.class);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(q5 dispatchDataProvider) {
        super(c9.f25336f, dispatchDataProvider);
        Intrinsics.checkNotNullParameter(dispatchDataProvider, "dispatchDataProvider");
    }

    public final void a(final long j10, final id idVar, List list) {
        l1 l1Var;
        l1 l1Var2;
        d9 d9Var = idVar != null ? idVar.f25571a : null;
        l4 l4Var = d9Var instanceof l4 ? (l4) d9Var : null;
        if (l4Var == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final id idVar2 = (id) it.next();
            d9 d9Var2 = idVar2.f25571a;
            final l4 l4Var2 = d9Var2 instanceof l4 ? (l4) d9Var2 : null;
            if (l4Var2 != null && ((l4Var.f25696n == null || l4Var2.f25696n == null) && (((l1Var = l4Var.f25697o) == null || l1Var.f25681b) && ((l1Var2 = l4Var2.f25697o) == null || l1Var2.f25681b)))) {
                lb lbVar = l4Var2.f25694l;
                Boolean bool = (l4Var.f25694l.b() || lbVar.b()) ? Boolean.TRUE : null;
                jb outboundConfigParams = l4Var.f25694l.f25729c;
                if (outboundConfigParams != null) {
                    Intrinsics.checkNotNullParameter(outboundConfigParams, "outboundConfigParams");
                } else {
                    outboundConfigParams = null;
                }
                jb outboundConfigParams2 = lbVar.f25729c;
                if (outboundConfigParams2 != null) {
                    Intrinsics.checkNotNullParameter(outboundConfigParams2, "outboundConfigParams");
                    outboundConfigParams = outboundConfigParams2;
                }
                String str = l4Var.f25694l.f25727a;
                if (str == null) {
                    str = null;
                }
                String str2 = lbVar.f25727a;
                if (str2 != null) {
                    str = str2;
                }
                l4Var.f25694l = new lb(str, bool, outboundConfigParams);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f25451k, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.C1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.f4.a(bo.app.id.this, j10, idVar);
                    }
                }, 14, (Object) null);
                idVar2.a(j10, jd.f25626d);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.B1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.f4.a(bo.app.l4.this, idVar);
                    }
                }, 7, (Object) null);
            }
        }
    }

    @Override // bo.app.c7
    public final void a(long j10) {
        ArrayList arrayList = this.f25327e;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            jd jdVar = ((id) obj).f25574d;
            jdVar.getClass();
            if (jdVar == jd.f25623a || jdVar == jd.f25624b) {
                arrayList2.add(obj);
            }
        }
        List sortedWith = CollectionsKt.sortedWith(arrayList2, new e4());
        int size2 = sortedWith.size();
        if (size2 < 2) {
            return;
        }
        a(j10, (id) CollectionsKt.first(sortedWith), sortedWith.subList(1, size2));
    }

    public static final String a(id idVar, long j10, id idVar2) {
        return "Batched request " + idVar.a(j10) + " and combined into " + idVar2.a(j10);
    }

    public static final String a(l4 l4Var, id idVar) {
        return "Could not merge other request: " + l4Var + " into parent: " + idVar;
    }
}
