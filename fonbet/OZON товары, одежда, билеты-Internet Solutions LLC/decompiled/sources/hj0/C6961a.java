package hj0;

import Je.InterfaceC3394a;
import R2.InterfaceC3917k;
import Sc.s;
import W2.f;
import W2.i;
import W2.j;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import gj0.InterfaceC6744a;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: hj0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6961a implements InterfaceC6744a {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final C1072a f65570d = new C1072a();

    /* renamed from: e, reason: collision with root package name */
    private static volatile C6961a f65571e;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC3917k<W2.f> f65572a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Je.d f65573b = new Je.d(false);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f65574c = new LinkedHashMap();

    /* renamed from: hj0.a$a, reason: collision with other inner class name */
    public static final class C1072a {
    }

    public C6961a(Context context) {
        this.f65572a = C6967g.a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(f.a aVar, Object obj, kotlin.coroutines.jvm.internal.c cVar) {
        C6965e c6965e;
        Wc.a aVar2;
        int i11;
        Je.d dVar;
        C6961a c6961a;
        InterfaceC3394a interfaceC3394a;
        Object a11;
        try {
            if (cVar instanceof C6965e) {
                c6965e = (C6965e) cVar;
                int i12 = c6965e.f65620j;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c6965e.f65620j = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = c6965e.f65618h;
                    aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c6965e.f65620j;
                    if (i11 != 0) {
                        s.b(obj2);
                        c6965e.f65614d = this;
                        c6965e.f65615e = aVar;
                        c6965e.f65616f = obj;
                        dVar = this.f65573b;
                        c6965e.f65617g = dVar;
                        c6965e.f65620j = 1;
                        if (dVar.a(c6965e) != aVar2) {
                            c6961a = this;
                        }
                        return aVar2;
                    }
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC3394a = (InterfaceC3394a) c6965e.f65614d;
                        try {
                            s.b(obj2);
                            interfaceC3394a.c(null);
                            return Unit.f71690a;
                        } catch (Throwable th2) {
                            th = th2;
                            interfaceC3394a.c(null);
                            throw th;
                        }
                    }
                    Je.d dVar2 = c6965e.f65617g;
                    obj = c6965e.f65616f;
                    f.a aVar3 = c6965e.f65615e;
                    c6961a = (C6961a) c6965e.f65614d;
                    s.b(obj2);
                    dVar = dVar2;
                    aVar = aVar3;
                    InterfaceC3917k<W2.f> interfaceC3917k = c6961a.f65572a;
                    C6966f c6966f = new C6966f(aVar, obj, c6961a, null);
                    c6965e.f65614d = dVar;
                    c6965e.f65615e = null;
                    c6965e.f65616f = null;
                    c6965e.f65617g = null;
                    c6965e.f65620j = 2;
                    a11 = j.a(interfaceC3917k, c6966f, c6965e);
                    if (a11 != aVar2) {
                        Je.d dVar3 = dVar;
                        obj2 = a11;
                        interfaceC3394a = dVar3;
                        interfaceC3394a.c(null);
                        return Unit.f71690a;
                    }
                    return aVar2;
                }
            }
            InterfaceC3917k<W2.f> interfaceC3917k2 = c6961a.f65572a;
            C6966f c6966f2 = new C6966f(aVar, obj, c6961a, null);
            c6965e.f65614d = dVar;
            c6965e.f65615e = null;
            c6965e.f65616f = null;
            c6965e.f65617g = null;
            c6965e.f65620j = 2;
            a11 = j.a(interfaceC3917k2, c6966f2, c6965e);
            if (a11 != aVar2) {
            }
            return aVar2;
        } catch (Throwable th3) {
            th = th3;
            interfaceC3394a = dVar;
            interfaceC3394a.c(null);
            throw th;
        }
        c6965e = new C6965e(this, cVar);
        Object obj22 = c6965e.f65618h;
        aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c6965e.f65620j;
        if (i11 != 0) {
        }
    }

    @Override // gj0.InterfaceC6744a
    @NotNull
    public final C6964d a(@NotNull fj0.d param) {
        Intrinsics.checkNotNullParameter(param, "param");
        return new C6964d(new C6963c(this.f65572a.getData(), i.b(param.getKey())), param, this);
    }

    @Override // gj0.InterfaceC6744a
    @NotNull
    public final C6963c b(@NotNull fj0.d param) {
        Intrinsics.checkNotNullParameter(param, "param");
        return new C6963c(this.f65572a.getData(), i.b(param.getKey()));
    }

    @Override // gj0.InterfaceC6744a
    public final Object c(int i11, @NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object l11 = l(i.b(str), new Integer(i11), cVar);
        return l11 == Wc.a.COROUTINE_SUSPENDED ? l11 : Unit.f71690a;
    }

    @Override // gj0.InterfaceC6744a
    @NotNull
    public final C6962b d(@NotNull fj0.d param) {
        Intrinsics.checkNotNullParameter(param, "param");
        return new C6962b(new C6963c(this.f65572a.getData(), i.a(param.getKey())), param, this);
    }

    @Override // gj0.InterfaceC6744a
    @NotNull
    public final C6963c e(@NotNull fj0.d param) {
        Intrinsics.checkNotNullParameter(param, "param");
        return new C6963c(this.f65572a.getData(), i.a(param.getKey()));
    }

    @Override // gj0.InterfaceC6744a
    public final Object f(@NotNull String str, boolean z11, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object l11 = l(i.a(str), Boolean.valueOf(z11), cVar);
        return l11 == Wc.a.COROUTINE_SUSPENDED ? l11 : Unit.f71690a;
    }
}
