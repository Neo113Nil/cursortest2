package gc0;

import Sc.InterfaceC4008j;
import Sc.k;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kc0.C7645c;
import kc0.C7659q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r.o;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f64252a = k.b(a.f64254b);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f64253b = 0;

    static final class a extends AbstractC7737t implements Function0<ExecutorService> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f64254b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final ExecutorService invoke() {
            return Executors.newSingleThreadExecutor();
        }
    }

    public static void a(@NotNull C7645c fragment, @NotNull o.d info, @NotNull o.c cryptoObject, @NotNull C7659q callback) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(cryptoObject, "cryptoObject");
        Intrinsics.checkNotNullParameter(callback, "callback");
        new o(fragment, (ExecutorService) f64252a.getValue(), callback).b(info, cryptoObject);
    }
}
