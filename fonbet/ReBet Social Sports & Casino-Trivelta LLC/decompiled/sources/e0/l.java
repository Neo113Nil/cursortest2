package e0;

import e0.n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class l {

    @NotNull
    private static final n[] TextUnitTypes;

    /* renamed from: a, reason: collision with root package name */
    public static final a f45458a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final long f45459b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return l.f45459b;
        }

        public a() {
        }
    }

    static {
        n.a aVar = n.f45460b;
        TextUnitTypes = new n[]{n.d(aVar.c()), n.d(aVar.b()), n.d(aVar.a())};
        f45459b = m.a(0L, Float.NaN);
    }

    public static long b(long j10) {
        return j10;
    }
}
