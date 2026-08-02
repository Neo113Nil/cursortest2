package x0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import x0.AbstractC10611p.a;

/* renamed from: x0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10611p<Interval extends a> {

    /* renamed from: x0.p$a */
    public interface a {

        /* renamed from: x0.p$a$a, reason: collision with other inner class name */
        /* loaded from: classes8.dex */
        static final class C2269a extends AbstractC7737t implements Function1 {

            /* renamed from: b, reason: collision with root package name */
            public static final C2269a f104784b = new C2269a(1);

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                ((Number) obj).intValue();
                return null;
            }
        }

        default Function1<Integer, Object> getKey() {
            return null;
        }

        @NotNull
        default Function1<Integer, Object> getType() {
            return C2269a.f104784b;
        }
    }

    @NotNull
    public abstract Z g();

    @NotNull
    public final Object h(int i11) {
        Object invoke;
        C10600e d11 = g().d(i11);
        int b11 = i11 - d11.b();
        Function1<Integer, Object> key = ((a) d11.c()).getKey();
        return (key == null || (invoke = key.invoke(Integer.valueOf(b11))) == null) ? new C10599d(i11) : invoke;
    }
}
