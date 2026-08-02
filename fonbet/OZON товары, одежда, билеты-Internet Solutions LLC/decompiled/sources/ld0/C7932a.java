package ld0;

import Ae.InterfaceC2397i;
import Ib0.b;
import Ib0.h;
import Ib0.i;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.ozonLimb.debug.OzonIdDebugActivity;

/* renamed from: ld0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7932a<T> implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2397i f73201a;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.ozonLimb.debug.OzonIdDebugActivity$subscribeToAuthEvents$$inlined$map$1$2", f = "OzonIdDebugActivity.kt", l = {223}, m = "emit")
    /* renamed from: ld0.a$a, reason: collision with other inner class name */
    public static final class C1232a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f73202d;

        /* renamed from: e, reason: collision with root package name */
        int f73203e;

        public C1232a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f73202d = obj;
            this.f73203e |= LinearLayoutManager.INVALID_OFFSET;
            return C7932a.this.emit(null, this);
        }
    }

    public C7932a(InterfaceC2397i interfaceC2397i) {
        this.f73201a = interfaceC2397i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // Ae.InterfaceC2397i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
        C1232a c1232a;
        int i11;
        String b11;
        String str;
        String str2;
        if (dVar instanceof C1232a) {
            c1232a = (C1232a) dVar;
            int i12 = c1232a.f73203e;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c1232a.f73203e = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = c1232a.f73202d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c1232a.f73203e;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    if (obj instanceof Ib0.i) {
                        Ib0.i iVar = (Ib0.i) obj;
                        int i13 = OzonIdDebugActivity.a.f97519a[iVar.a().ordinal()];
                        if (i13 == 1) {
                            str2 = "LOGIN";
                        } else if (i13 == 2) {
                            str2 = "FORCE_LOGIN";
                        } else if (i13 == 3) {
                            str2 = "INSTANT_LOGIN";
                        } else {
                            if (i13 != 4) {
                                throw new Sc.o();
                            }
                            str2 = "CROSS_APP";
                        }
                        if (iVar instanceof i.c) {
                            b11 = str2.concat(": Success");
                        } else if (iVar instanceof i.a) {
                            b11 = str2.concat(": AlreadySignedIn");
                        } else {
                            if (!(iVar instanceof i.b)) {
                                throw new Sc.o();
                            }
                            b11 = str2.concat(": Cancel");
                        }
                    } else if (obj instanceof Ib0.h) {
                        Ib0.h hVar = (Ib0.h) obj;
                        int i14 = OzonIdDebugActivity.a.f97520b[hVar.a().ordinal()];
                        if (i14 == 1) {
                            str = "LOGOUT";
                        } else {
                            if (i14 != 2) {
                                throw new Sc.o();
                            }
                            str = "FORCE_LOGOUT";
                        }
                        if (hVar instanceof h.c) {
                            b11 = str.concat(": Success");
                        } else if (hVar instanceof h.a) {
                            b11 = str.concat(": AlreadySignedIn");
                        } else {
                            if (!(hVar instanceof h.b)) {
                                throw new Sc.o();
                            }
                            b11 = str.concat(": Cancel");
                        }
                    } else {
                        b11 = obj instanceof b.a ? "VK ID: Success" : obj instanceof Ib0.a ? Nk.a.b("Account Recovery: Success", Nk.a.b("\nredirect: ", ((Ib0.a) obj).a())) : "Unknown Auth Event!";
                    }
                    c1232a.f73203e = 1;
                    if (this.f73201a.emit(b11, c1232a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj2);
                }
                return Unit.f71690a;
            }
        }
        c1232a = new C1232a(dVar);
        Object obj22 = c1232a.f73202d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c1232a.f73203e;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }
}
