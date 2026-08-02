package xe;

import fd.InterfaceC6511n;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: xe.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C10758y<R> {

    /* renamed from: a, reason: collision with root package name */
    public final R f105504a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC10731k f105505b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC6511n<Throwable, R, CoroutineContext, Unit> f105506c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f105507d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f105508e;

    /* JADX WARN: Multi-variable type inference failed */
    public C10758y(R r11, InterfaceC10731k interfaceC10731k, InterfaceC6511n<? super Throwable, ? super R, ? super CoroutineContext, Unit> interfaceC6511n, Object obj, Throwable th2) {
        this.f105504a = r11;
        this.f105505b = interfaceC10731k;
        this.f105506c = interfaceC6511n;
        this.f105507d = obj;
        this.f105508e = th2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C10758y a(C10758y c10758y, InterfaceC10731k interfaceC10731k, CancellationException cancellationException, int i11) {
        R r11 = c10758y.f105504a;
        if ((i11 & 2) != 0) {
            interfaceC10731k = c10758y.f105505b;
        }
        InterfaceC10731k interfaceC10731k2 = interfaceC10731k;
        InterfaceC6511n<Throwable, R, CoroutineContext, Unit> interfaceC6511n = c10758y.f105506c;
        Object obj = c10758y.f105507d;
        CancellationException cancellationException2 = cancellationException;
        if ((i11 & 16) != 0) {
            cancellationException2 = c10758y.f105508e;
        }
        c10758y.getClass();
        return new C10758y(r11, interfaceC10731k2, interfaceC6511n, obj, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10758y)) {
            return false;
        }
        C10758y c10758y = (C10758y) obj;
        return Intrinsics.d(this.f105504a, c10758y.f105504a) && Intrinsics.d(this.f105505b, c10758y.f105505b) && Intrinsics.d(this.f105506c, c10758y.f105506c) && Intrinsics.d(this.f105507d, c10758y.f105507d) && Intrinsics.d(this.f105508e, c10758y.f105508e);
    }

    public final int hashCode() {
        R r11 = this.f105504a;
        int hashCode = (r11 == null ? 0 : r11.hashCode()) * 31;
        InterfaceC10731k interfaceC10731k = this.f105505b;
        int hashCode2 = (hashCode + (interfaceC10731k == null ? 0 : interfaceC10731k.hashCode())) * 31;
        InterfaceC6511n<Throwable, R, CoroutineContext, Unit> interfaceC6511n = this.f105506c;
        int hashCode3 = (hashCode2 + (interfaceC6511n == null ? 0 : interfaceC6511n.hashCode())) * 31;
        Object obj = this.f105507d;
        int hashCode4 = (hashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        Throwable th2 = this.f105508e;
        return hashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "CompletedContinuation(result=" + this.f105504a + ", cancelHandler=" + this.f105505b + ", onCancellation=" + this.f105506c + ", idempotentResume=" + this.f105507d + ", cancelCause=" + this.f105508e + ')';
    }

    public /* synthetic */ C10758y(Object obj, InterfaceC10731k interfaceC10731k, InterfaceC6511n interfaceC6511n, CancellationException cancellationException, int i11) {
        this(obj, (i11 & 2) != 0 ? null : interfaceC10731k, (InterfaceC6511n<? super Throwable, ? super Object, ? super CoroutineContext, Unit>) ((i11 & 4) != 0 ? null : interfaceC6511n), (Object) null, (i11 & 16) != 0 ? null : cancellationException);
    }
}
