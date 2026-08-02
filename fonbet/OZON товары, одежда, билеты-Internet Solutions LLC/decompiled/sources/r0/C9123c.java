package r0;

import Sc.r;
import java.util.concurrent.CancellationException;
import k1.C7460f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import r0.C9126f;
import xe.C10737n;
import xe.InterfaceC10733l;

/* renamed from: r0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9123c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final U0.b<C9126f.a> f82552a = new U0.b<>(new C9126f.a[16]);

    /* renamed from: r0.c$a */
    /* loaded from: classes8.dex */
    static final class a extends AbstractC7737t implements Function1<Throwable, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C9126f.a f82554c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C9126f.a aVar) {
            super(1);
            this.f82554c = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            C9123c.this.f82552a.s(this.f82554c);
            return Unit.f71690a;
        }
    }

    public final void b(CancellationException cancellationException) {
        U0.b<C9126f.a> bVar = this.f82552a;
        int m11 = bVar.m();
        InterfaceC10733l[] interfaceC10733lArr = new InterfaceC10733l[m11];
        for (int i11 = 0; i11 < m11; i11++) {
            interfaceC10733lArr[i11] = bVar.l()[i11].a();
        }
        for (int i12 = 0; i12 < m11; i12++) {
            interfaceC10733lArr[i12].A(cancellationException);
        }
        if (!bVar.o()) {
            throw new IllegalStateException("uncancelled requests present");
        }
    }

    public final boolean c(@NotNull C9126f.a aVar) {
        C7460f invoke = aVar.b().invoke();
        if (invoke == null) {
            InterfaceC10733l<Unit> a11 = aVar.a();
            r.Companion companion = Sc.r.INSTANCE;
            ((C10737n) a11).resumeWith(Unit.f71690a);
            return false;
        }
        ((C10737n) aVar.a()).q(new a(aVar));
        U0.b<C9126f.a> bVar = this.f82552a;
        IntRange intRange = new IntRange(0, bVar.m() - 1, 1);
        int f71842a = intRange.getF71842a();
        int f71843b = intRange.getF71843b();
        if (f71842a <= f71843b) {
            while (true) {
                C7460f invoke2 = bVar.l()[f71843b].b().invoke();
                if (invoke2 != null) {
                    C7460f w11 = invoke.w(invoke2);
                    if (w11.equals(invoke)) {
                        bVar.a(f71843b + 1, aVar);
                        return true;
                    }
                    if (!w11.equals(invoke2)) {
                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                        int m11 = bVar.m() - 1;
                        if (m11 <= f71843b) {
                            while (true) {
                                ((C10737n) bVar.l()[f71843b].a()).A(cancellationException);
                                if (m11 == f71843b) {
                                    break;
                                }
                                m11++;
                            }
                        }
                    }
                }
                if (f71843b == f71842a) {
                    break;
                }
                f71843b--;
            }
        }
        bVar.a(0, aVar);
        return true;
    }

    public final void d() {
        U0.b<C9126f.a> bVar = this.f82552a;
        IntRange intRange = new IntRange(0, bVar.m() - 1, 1);
        int f71842a = intRange.getF71842a();
        int f71843b = intRange.getF71843b();
        if (f71842a <= f71843b) {
            while (true) {
                InterfaceC10733l<Unit> a11 = bVar.l()[f71842a].a();
                Unit unit = Unit.f71690a;
                r.Companion companion = Sc.r.INSTANCE;
                ((C10737n) a11).resumeWith(unit);
                if (f71842a == f71843b) {
                    break;
                } else {
                    f71842a++;
                }
            }
        }
        bVar.h();
    }
}
