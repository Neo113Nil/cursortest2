package w00;

import Sc.InterfaceC4008j;
import Sc.k;
import i00.InterfaceC6980a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f103323a = k.b(a.f103324b);

    static final class a extends AbstractC7737t implements Function0<C10405a> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f103324b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final C10405a invoke() {
            return new C10405a();
        }
    }

    @NotNull
    public static final InterfaceC6980a a() {
        return (InterfaceC6980a) f103323a.getValue();
    }
}
