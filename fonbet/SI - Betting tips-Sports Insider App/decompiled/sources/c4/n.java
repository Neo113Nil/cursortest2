package c4;

import eg.m0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3596a;

    public /* synthetic */ n(int i5) {
        this.f3596a = i5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i5 = 0;
        switch (this.f3596a) {
            case 0:
                lg.e eVar = m0.f9201a;
                return jg.q.f18523a.f9624e;
            case 1:
                return (e4.a) e4.i.f8614a.getValue();
            case 2:
                List R = CollectionsKt.R((List) v4.n.f24428a.getValue(), new androidx.coordinatorlayout.widget.i(3));
                ArrayList arrayList = new ArrayList();
                int size = R.size();
                while (i5 < size) {
                    v4.d dVar = (v4.d) R.get(i5);
                    Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type coil3.util.FetcherServiceLoaderTarget<kotlin.Any>");
                    f4.g a7 = dVar.a();
                    ag.c type = dVar.type();
                    Pair pair = type == null ? null : new Pair(a7, type);
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                    i5++;
                }
                return arrayList;
            default:
                List R2 = CollectionsKt.R((List) v4.n.f24429b.getValue(), new androidx.coordinatorlayout.widget.i(4));
                ArrayList arrayList2 = new ArrayList();
                int size2 = R2.size();
                while (i5 < size2) {
                    arrayList2.add(((v4.c) R2.get(i5)).a());
                    i5++;
                }
                return arrayList2;
        }
    }
}
