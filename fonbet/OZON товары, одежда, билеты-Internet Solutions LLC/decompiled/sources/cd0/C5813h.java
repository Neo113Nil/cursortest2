package cd0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import jc0.AbstractC7343f;
import kc0.InterfaceC7643a;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: cd0.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5813h implements InterfaceC2395h<InterfaceC7643a> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f56958a;

    /* renamed from: cd0.h$a */
    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i f56959a;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.pageSocialAdditional.presentation.AuthViewModel$special$$inlined$map$1$2", f = "AuthViewModel.kt", l = {223}, m = "emit")
        /* renamed from: cd0.h$a$a, reason: collision with other inner class name */
        public static final class C0862a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f56960d;

            /* renamed from: e, reason: collision with root package name */
            int f56961e;

            public C0862a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f56960d = obj;
                this.f56961e |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC2397i interfaceC2397i) {
            this.f56959a = interfaceC2397i;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
            C0862a c0862a;
            int i11;
            InterfaceC7643a c1167a;
            if (dVar instanceof C0862a) {
                c0862a = (C0862a) dVar;
                int i12 = c0862a.f56961e;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c0862a.f56961e = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = c0862a.f56960d;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c0862a.f56961e;
                    if (i11 != 0) {
                        s.b(obj2);
                        AbstractC7343f abstractC7343f = (AbstractC7343f) obj;
                        Intrinsics.checkNotNullParameter(abstractC7343f, "<this>");
                        if (abstractC7343f instanceof AbstractC7343f.b) {
                            AbstractC7343f.b bVar = (AbstractC7343f.b) abstractC7343f;
                            c1167a = new InterfaceC7643a.b(bVar.b(), bVar.c(), bVar.a());
                        } else {
                            if (!(abstractC7343f instanceof AbstractC7343f.a)) {
                                throw new Sc.o();
                            }
                            AbstractC7343f.a aVar2 = (AbstractC7343f.a) abstractC7343f;
                            c1167a = new InterfaceC7643a.C1167a(aVar2.b(), aVar2.a());
                        }
                        c0862a.f56961e = 1;
                        if (this.f56959a.emit(c1167a, c0862a) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj2);
                    }
                    return Unit.f71690a;
                }
            }
            c0862a = new C0862a(dVar);
            Object obj22 = c0862a.f56960d;
            Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c0862a.f56961e;
            if (i11 != 0) {
            }
            return Unit.f71690a;
        }
    }

    public C5813h(InterfaceC2395h interfaceC2395h) {
        this.f56958a = interfaceC2395h;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super InterfaceC7643a> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
        Object collect = this.f56958a.collect(new a(interfaceC2397i), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
