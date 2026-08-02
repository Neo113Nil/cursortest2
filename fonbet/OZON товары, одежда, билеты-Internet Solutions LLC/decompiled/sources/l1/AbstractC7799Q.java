package l1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* renamed from: l1.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7799Q {

    @NotNull
    public static final a Companion = new a();
    private final long intrinsicSize;

    /* renamed from: l1.Q$a */
    public static final class a {
        public static C7835n0 a(a aVar, List list, float f7, float f11, int i11) {
            if ((i11 & 2) != 0) {
                f7 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            aVar.getClass();
            return new C7835n0(P9.a.a(f7, 0.0f), P9.a.a(f11, 0.0f), null, list);
        }

        public static C7835n0 b(a aVar, Pair[] pairArr) {
            aVar.getClass();
            return c((Pair[]) Arrays.copyOf(pairArr, pairArr.length), P9.a.a(0.0f, 0.0f), P9.a.a(Float.POSITIVE_INFINITY, 0.0f));
        }

        @NotNull
        public static C7835n0 c(@NotNull Pair[] pairArr, long j11, long j12) {
            ArrayList arrayList = new ArrayList(pairArr.length);
            for (Pair pair : pairArr) {
                arrayList.add(C7807Z.m(((C7807Z) pair.f()).w()));
            }
            ArrayList arrayList2 = new ArrayList(pairArr.length);
            for (Pair pair2 : pairArr) {
                arrayList2.add(Float.valueOf(((Number) pair2.e()).floatValue()));
            }
            return new C7835n0(j11, j12, arrayList2, arrayList);
        }

        public static C7835n0 d(a aVar, List list, long j11, long j12, int i11) {
            if ((i11 & 2) != 0) {
                j11 = 0;
            }
            long j13 = j11;
            if ((i11 & 4) != 0) {
                j12 = 9187343241974906880L;
            }
            aVar.getClass();
            return new C7835n0(j13, j12, null, list);
        }

        public static /* synthetic */ C7835n0 e(a aVar, Pair[] pairArr, long j11, long j12, int i11) {
            if ((i11 & 2) != 0) {
                j11 = 0;
            }
            if ((i11 & 4) != 0) {
                j12 = 9187343241974906880L;
            }
            aVar.getClass();
            return c(pairArr, j11, j12);
        }

        public static w0 f(a aVar, Pair[] pairArr, long j11, float f7) {
            aVar.getClass();
            ArrayList arrayList = new ArrayList(pairArr.length);
            for (Pair pair : pairArr) {
                arrayList.add(C7807Z.m(((C7807Z) pair.f()).w()));
            }
            ArrayList arrayList2 = new ArrayList(pairArr.length);
            for (Pair pair2 : pairArr) {
                arrayList2.add(Float.valueOf(((Number) pair2.e()).floatValue()));
            }
            return new w0(f7, j11, arrayList2, arrayList);
        }

        public static C7835n0 g(a aVar, List list) {
            aVar.getClass();
            return new C7835n0(P9.a.a(0.0f, 0.0f), P9.a.a(0.0f, Float.POSITIVE_INFINITY), null, list);
        }

        public static C7835n0 h(a aVar, Pair[] pairArr) {
            aVar.getClass();
            return c((Pair[]) Arrays.copyOf(pairArr, pairArr.length), P9.a.a(0.0f, 0.0f), P9.a.a(0.0f, Float.POSITIVE_INFINITY));
        }
    }

    public /* synthetic */ AbstractC7799Q(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: applyTo-Pq9zytI */
    public abstract void mo69applyToPq9zytI(long j11, @NotNull r0 r0Var, float f7);

    private AbstractC7799Q() {
        this.intrinsicSize = 9205357640488583168L;
    }
}
