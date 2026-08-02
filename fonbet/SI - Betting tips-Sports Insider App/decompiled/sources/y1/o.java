package y1;

import hg.d1;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25596a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f25597b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f25598c;

    public /* synthetic */ o(p pVar, l lVar) {
        this.f25597b = pVar;
        this.f25598c = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f25596a) {
            case 0:
                p pVar = this.f25597b;
                l entry = this.f25598c;
                Intrinsics.checkNotNullParameter(entry, "entry");
                d1 d1Var = pVar.f25602c;
                Set set = (Set) d1Var.getValue();
                Intrinsics.checkNotNullParameter(set, "<this>");
                LinkedHashSet linkedHashSet = new LinkedHashSet(kotlin.collections.m0.a(set.size()));
                boolean z5 = false;
                for (Object obj : set) {
                    boolean z7 = true;
                    if (!z5 && Intrinsics.areEqual(obj, entry)) {
                        z5 = true;
                        z7 = false;
                    }
                    if (z7) {
                        linkedHashSet.add(obj);
                    }
                }
                d1Var.k(null, linkedHashSet);
                return Unit.f19194a;
            default:
                p pVar2 = this.f25597b;
                l popUpTo = this.f25598c;
                Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
                synchronized (pVar2.f25600a) {
                    try {
                        d1 d1Var2 = pVar2.f25601b;
                        Iterable iterable = (Iterable) d1Var2.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : iterable) {
                            if (Intrinsics.areEqual((l) obj2, popUpTo)) {
                                d1Var2.getClass();
                                d1Var2.k(null, arrayList);
                            } else {
                                arrayList.add(obj2);
                            }
                        }
                        d1Var2.getClass();
                        d1Var2.k(null, arrayList);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return Unit.f19194a;
        }
    }

    public /* synthetic */ o(p pVar, l lVar, boolean z5) {
        this.f25597b = pVar;
        this.f25598c = lVar;
    }
}
