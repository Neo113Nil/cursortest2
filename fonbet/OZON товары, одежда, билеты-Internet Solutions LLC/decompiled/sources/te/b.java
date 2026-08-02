package te;

import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class b {

    /* JADX INFO: Add missing generic type declarations: [N] */
    static class a<N> extends AbstractC2189b<N, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f99443a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean[] f99444b;

        a(Function1 function1, boolean[] zArr) {
            this.f99443a = function1;
            this.f99444b = zArr;
        }

        @Override // te.b.d
        public final Object a() {
            return Boolean.valueOf(this.f99444b[0]);
        }

        @Override // te.b.d
        public final boolean b(N n11) {
            boolean booleanValue = ((Boolean) this.f99443a.invoke(n11)).booleanValue();
            boolean[] zArr = this.f99444b;
            if (booleanValue) {
                zArr[0] = true;
            }
            return !zArr[0];
        }
    }

    /* renamed from: te.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC2189b<N, R> implements d<N, R> {
        @Override // te.b.d
        public void c(N n11) {
        }
    }

    public interface c<N> {
        @NotNull
        Iterable<? extends N> a(N n11);
    }

    public interface d<N, R> {
        R a();

        boolean b(N n11);

        void c(N n11);
    }

    public static class e<N> {

        /* renamed from: a, reason: collision with root package name */
        private final HashSet f99445a = new HashSet();

        public final boolean a(N n11) {
            return this.f99445a.add(n11);
        }
    }

    private static /* synthetic */ void a(int i11) {
        Object[] objArr = new Object[3];
        switch (i11) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i11) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static Object b(@NotNull Collection collection, @NotNull c cVar, @NotNull AbstractC2189b abstractC2189b) {
        if (collection == null) {
            a(4);
            throw null;
        }
        e eVar = new e();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c(it.next(), cVar, eVar, abstractC2189b);
        }
        return abstractC2189b.a();
    }

    public static void c(@NotNull Object obj, @NotNull c cVar, @NotNull e eVar, @NotNull AbstractC2189b abstractC2189b) {
        if (obj == null) {
            a(22);
            throw null;
        }
        if (eVar.a(obj) && abstractC2189b.b(obj)) {
            Iterator it = cVar.a(obj).iterator();
            while (it.hasNext()) {
                c(it.next(), cVar, eVar, abstractC2189b);
            }
            abstractC2189b.c(obj);
        }
    }

    public static <N> Boolean d(@NotNull Collection<N> collection, @NotNull c<N> cVar, @NotNull Function1<N, Boolean> function1) {
        if (collection == null) {
            a(7);
            throw null;
        }
        if (function1 != null) {
            return (Boolean) b(collection, cVar, new a(function1, new boolean[1]));
        }
        a(9);
        throw null;
    }
}
