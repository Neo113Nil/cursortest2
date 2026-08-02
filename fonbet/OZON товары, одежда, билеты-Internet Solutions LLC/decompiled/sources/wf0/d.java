package wf0;

import Sc.InterfaceC4008j;
import We.B;
import We.L;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zf0.k;

/* loaded from: classes7.dex */
public final class d implements B {

    /* renamed from: a, reason: collision with root package name */
    private boolean f104502a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f104503b;

    static final class a extends AbstractC7737t implements Function0<String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ L f104504b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(L l11) {
            super(0);
            this.f104504b = l11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.f104504b.L().j().h();
        }
    }

    public d() {
        throw null;
    }

    public d(InterfaceC4008j interactorLazy) {
        Intrinsics.checkNotNullParameter(interactorLazy, "interactorLazy");
        this.f104502a = true;
        this.f104503b = interactorLazy;
    }

    public final boolean a() {
        return this.f104502a;
    }

    public final void b(boolean z11) {
        this.f104502a = z11;
    }

    @Override // We.B
    @NotNull
    public final L intercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        L proceed = chain.proceed(chain.request());
        if (this.f104502a) {
            ((k) this.f104503b.getValue()).k(new a(proceed));
        }
        return proceed;
    }
}
