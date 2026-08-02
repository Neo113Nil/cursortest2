package kotlinx.coroutines.flow;

import Ph.C1469p;
import Sh.AbstractC1566d;
import androidx.lifecycle.AbstractC2177b;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.internal.AbstractC5327c;

/* loaded from: classes5.dex */
public final class O extends kotlinx.coroutines.flow.internal.d {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f54665a = new AtomicReference(null);

    @Override // kotlinx.coroutines.flow.internal.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(M m10) {
        Sh.G g10;
        if (AbstractC1566d.a(this.f54665a) != null) {
            return false;
        }
        AtomicReference atomicReference = this.f54665a;
        g10 = N.f54663a;
        AbstractC1566d.b(atomicReference, g10);
        return true;
    }

    public final Object e(Continuation continuation) {
        Sh.G g10;
        C1469p c1469p = new C1469p(IntrinsicsKt.intercepted(continuation), 1);
        c1469p.F();
        AtomicReference atomicReference = this.f54665a;
        g10 = N.f54663a;
        if (!AbstractC2177b.a(atomicReference, g10, c1469p)) {
            Result.Companion companion = Result.INSTANCE;
            c1469p.resumeWith(Result.m147constructorimpl(Unit.INSTANCE));
        }
        Object z10 = c1469p.z();
        if (z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? z10 : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Continuation[] b(M m10) {
        AbstractC1566d.b(this.f54665a, null);
        return AbstractC5327c.EMPTY_RESUMES;
    }

    public final void g() {
        Sh.G g10;
        Sh.G g11;
        Sh.G g12;
        Sh.G g13;
        AtomicReference atomicReference = this.f54665a;
        while (true) {
            Object a10 = AbstractC1566d.a(atomicReference);
            if (a10 == null) {
                return;
            }
            g10 = N.f54664b;
            if (a10 == g10) {
                return;
            }
            g11 = N.f54663a;
            if (a10 == g11) {
                AtomicReference atomicReference2 = this.f54665a;
                g12 = N.f54664b;
                if (AbstractC2177b.a(atomicReference2, a10, g12)) {
                    return;
                }
            } else {
                AtomicReference atomicReference3 = this.f54665a;
                g13 = N.f54663a;
                if (AbstractC2177b.a(atomicReference3, a10, g13)) {
                    Result.Companion companion = Result.INSTANCE;
                    ((C1469p) a10).resumeWith(Result.m147constructorimpl(Unit.INSTANCE));
                    return;
                }
            }
        }
    }

    public final boolean h() {
        Sh.G g10;
        Sh.G g11;
        AtomicReference atomicReference = this.f54665a;
        g10 = N.f54663a;
        Object andSet = atomicReference.getAndSet(g10);
        Intrinsics.checkNotNull(andSet);
        g11 = N.f54664b;
        return andSet == g11;
    }
}
