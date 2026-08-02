package l0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7807Z;
import m0.C8013s;
import m0.U0;
import m0.W0;
import m1.AbstractC8032c;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Function1<AbstractC8032c, U0<C7807Z, C8013s>> f72027a = a.f72028b;

    static final class a extends AbstractC7737t implements Function1<AbstractC8032c, U0<C7807Z, C8013s>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f72028b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final U0<C7807Z, C8013s> invoke(AbstractC8032c abstractC8032c) {
            return W0.a(K.f72025b, new L(abstractC8032c));
        }
    }

    @NotNull
    public static final Function1 a() {
        return f72027a;
    }
}
