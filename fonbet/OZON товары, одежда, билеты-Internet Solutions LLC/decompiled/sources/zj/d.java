package zj;

import Sc.InterfaceC4008j;
import Sc.k;
import Sd0.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class d extends Xd0.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f109302a = k.b(a.f109303b);

    static final class a extends AbstractC7737t implements Function0<c> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f109303b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final c invoke() {
            return new c();
        }
    }

    @Override // Sd0.d
    @NotNull
    public final g getSharedOutput() {
        return (g) this.f109302a.getValue();
    }
}
