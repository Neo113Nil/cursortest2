package r0;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* renamed from: r0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9146z implements InterfaceC9143w, Z1.d {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Z1.d f82651a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f82652b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f82653c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Je.d f82654d = new Je.d(false);

    public C9146z(@NotNull Z1.d dVar) {
        this.f82651a = dVar;
    }

    @Override // Z1.d
    public final float B(int i11) {
        return this.f82651a.B(i11);
    }

    @Override // Z1.d
    public final float C(float f7) {
        return this.f82651a.C(f7);
    }

    @Override // Z1.d
    public final long D0(long j11) {
        return this.f82651a.D0(j11);
    }

    @Override // Z1.k
    public final long F(float f7) {
        return this.f82651a.F(f7);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // r0.InterfaceC9143w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object M0(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C9145y c9145y;
        int i11;
        C9146z c9146z;
        if (cVar instanceof C9145y) {
            c9145y = (C9145y) cVar;
            int i12 = c9145y.f82650g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9145y.f82650g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9145y.f82648e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9145y.f82650g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    if (this.f82652b || this.f82653c) {
                        c9146z = this;
                        return Boolean.valueOf(c9146z.f82652b);
                    }
                    c9145y.f82647d = this;
                    c9145y.f82650g = 1;
                    if (this.f82654d.a(c9145y) == aVar) {
                        return aVar;
                    }
                    c9146z = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c9146z = c9145y.f82647d;
                    Sc.s.b(obj);
                }
                c9146z.f82654d.c(null);
                return Boolean.valueOf(c9146z.f82652b);
            }
        }
        c9145y = new C9145y(this, cVar);
        Object obj2 = c9145y.f82648e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9145y.f82650g;
        if (i11 != 0) {
        }
        c9146z.f82654d.c(null);
        return Boolean.valueOf(c9146z.f82652b);
    }

    @Override // Z1.d
    public final int Y0(float f7) {
        return this.f82651a.Y0(f7);
    }

    @Override // Z1.d
    public final float Z0(long j11) {
        return this.f82651a.Z0(j11);
    }

    @Override // Z1.d
    public final float g() {
        return this.f82651a.g();
    }

    public final void m() {
        this.f82653c = true;
        this.f82654d.c(null);
    }

    @Override // Z1.d
    public final long o(long j11) {
        return this.f82651a.o(j11);
    }

    @Override // Z1.k
    public final float p(long j11) {
        return this.f82651a.p(j11);
    }

    @Override // Z1.d
    public final long r(float f7) {
        return this.f82651a.r(f7);
    }

    public final void s() {
        this.f82652b = true;
        this.f82654d.c(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C9144x c9144x;
        int i11;
        C9146z c9146z;
        if (cVar instanceof C9144x) {
            c9144x = (C9144x) cVar;
            int i12 = c9144x.f82646g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9144x.f82646g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9144x.f82644e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9144x.f82646g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    c9144x.f82643d = this;
                    c9144x.f82646g = 1;
                    if (this.f82654d.a(c9144x) == aVar) {
                        return aVar;
                    }
                    c9146z = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c9146z = c9144x.f82643d;
                    Sc.s.b(obj);
                }
                c9146z.f82652b = false;
                c9146z.f82653c = false;
                return Unit.f71690a;
            }
        }
        c9144x = new C9144x(this, cVar);
        Object obj2 = c9144x.f82644e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9144x.f82646g;
        if (i11 != 0) {
        }
        c9146z.f82652b = false;
        c9146z.f82653c = false;
        return Unit.f71690a;
    }

    @Override // Z1.k
    public final float u1() {
        return this.f82651a.u1();
    }

    @Override // Z1.d
    public final float v1(float f7) {
        return this.f82651a.v1(f7);
    }
}
