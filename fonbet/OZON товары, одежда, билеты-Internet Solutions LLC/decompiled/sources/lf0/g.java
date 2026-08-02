package lf0;

import B4.A;
import B4.C2579h;
import B4.F;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gf0.AbstractC6729a;
import hf0.AbstractC6947b;
import hf0.EnumC6946a;
import if0.C7071a;
import java.util.Comparator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f73300a = 0;

        static {
            int[] iArr = new int[EnumC6946a.values().length];
            try {
                iArr[EnumC6946a.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6946a.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6946a.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC6946a.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC6946a.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static final class b extends AbstractC7737t implements Function1<F, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C7071a f73301b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C7071a c7071a) {
            super(1);
            this.f73301b = c7071a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(F f7) {
            F navDeepLink = f7;
            Intrinsics.checkNotNullParameter(navDeepLink, "$this$navDeepLink");
            this.f73301b.getClass();
            navDeepLink.d("trackerDebugMenu://trackerSDK/productTracker");
            navDeepLink.b(null);
            navDeepLink.c(null);
            return Unit.f71690a;
        }
    }

    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t2, T t11) {
            ((AbstractC6947b) t2).getClass();
            ((AbstractC6947b) t11).getClass();
            return Vc.a.b(null, null);
        }
    }

    static final class d extends AbstractC7737t implements Function1<AbstractC6947b<?>, CharSequence> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f73302b = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(AbstractC6947b<?> abstractC6947b) {
            AbstractC6947b<?> it = abstractC6947b;
            Intrinsics.checkNotNullParameter(it, "it");
            it.getClass();
            return "null={null}";
        }
    }

    @NotNull
    public static final A a(@NotNull C7071a deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        b deepLinkBuilder = new b(deeplink);
        Intrinsics.checkNotNullParameter(deepLinkBuilder, "deepLinkBuilder");
        F f7 = new F();
        deepLinkBuilder.invoke(f7);
        return f7.a();
    }

    @NotNull
    public static final void b(@NotNull AbstractC6947b argument) {
        Intrinsics.checkNotNullParameter(argument, "argument");
        argument.getClass();
        h builder = new h(argument);
        Intrinsics.checkNotNullParameter(null, AppMeasurementSdk.ConditionalUserProperty.NAME);
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.invoke(new C2579h());
        throw null;
    }

    @NotNull
    public static final String c(@NotNull AbstractC6729a abstractC6729a) {
        Intrinsics.checkNotNullParameter(abstractC6729a, "<this>");
        List I02 = C7714v.I0(new c(), abstractC6729a.a());
        return U7.d.e(abstractC6729a.e(), I02.isEmpty() ? "" : C7714v.V(I02, "&", "?", null, d.f73302b, 28));
    }
}
