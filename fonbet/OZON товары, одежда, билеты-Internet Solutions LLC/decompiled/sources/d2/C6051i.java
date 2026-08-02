package d2;

import B1.V;
import B1.W;
import B1.Y;
import B1.m0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* renamed from: d2.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6051i implements V {

    /* renamed from: a, reason: collision with root package name */
    public static final C6051i f61050a = new C6051i();

    /* renamed from: d2.i$a */
    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f61051b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ArrayList arrayList) {
            super(1);
            this.f61051b = arrayList;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            m0.a aVar2 = aVar;
            ArrayList arrayList = this.f61051b;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                aVar2.h((m0) arrayList.get(i11), 0, 0, 0.0f);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // B1.V
    @NotNull
    /* renamed from: measure-3p2s80s */
    public final W mo2measure3p2s80s(@NotNull Y y11, @NotNull List<? extends B1.U> list, long j11) {
        Object obj;
        W z02;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(list.get(i11).a0(j11));
        }
        int i12 = 1;
        m0 m0Var = null;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int u02 = ((m0) obj).u0();
            int P11 = C7714v.P(arrayList);
            if (1 <= P11) {
                int i13 = 1;
                while (true) {
                    Object obj2 = arrayList.get(i13);
                    int u03 = ((m0) obj2).u0();
                    if (u02 < u03) {
                        obj = obj2;
                        u02 = u03;
                    }
                    if (i13 == P11) {
                        break;
                    }
                    i13++;
                }
            }
        }
        m0 m0Var2 = (m0) obj;
        int u04 = m0Var2 != null ? m0Var2.u0() : Z1.b.m(j11);
        if (!arrayList.isEmpty()) {
            ?? r22 = arrayList.get(0);
            int l02 = ((m0) r22).l0();
            int P12 = C7714v.P(arrayList);
            boolean z11 = r22;
            if (1 <= P12) {
                while (true) {
                    Object obj3 = arrayList.get(i12);
                    int l03 = ((m0) obj3).l0();
                    r22 = z11;
                    if (l02 < l03) {
                        r22 = obj3;
                        l02 = l03;
                    }
                    if (i12 == P12) {
                        break;
                    }
                    i12++;
                    z11 = r22;
                }
            }
            m0Var = r22;
        }
        m0 m0Var3 = m0Var;
        z02 = y11.z0(u04, m0Var3 != null ? m0Var3.l0() : Z1.b.l(j11), kotlin.collections.U.c(), new a(arrayList));
        return z02;
    }
}
