package w0;

import B1.AbstractC2531a;
import B1.W;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;

/* loaded from: classes8.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C10377D f103244a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f103245b = 0;

    public static final class a implements W {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Map<AbstractC2531a, Integer> f103246a = kotlin.collections.U.c();

        a() {
        }

        @Override // B1.W
        public final int getHeight() {
            return 0;
        }

        @Override // B1.W
        public final int getWidth() {
            return 0;
        }

        @Override // B1.W
        @NotNull
        public final Map<AbstractC2531a, Integer> s() {
            return this.f103246a;
        }

        @Override // B1.W
        public final void u() {
        }
    }

    static final class b extends AbstractC7737t implements Function1<Integer, List<? extends Pair<? extends Integer, ? extends Z1.b>>> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f103247b = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final List<? extends Pair<? extends Integer, ? extends Z1.b>> invoke(Integer num) {
            num.intValue();
            return kotlin.collections.K.f71697a;
        }
    }

    static {
        a aVar = new a();
        kotlin.collections.K k11 = kotlin.collections.K.f71697a;
        EnumC9142v enumC9142v = EnumC9142v.Vertical;
        f103244a = new C10377D(null, 0, false, 0.0f, aVar, false, xe.N.a(kotlin.coroutines.g.f71771a), Z1.f.b(), 0, b.f103247b, k11, 0, 0, 0, enumC9142v, 0, 0);
    }
}
