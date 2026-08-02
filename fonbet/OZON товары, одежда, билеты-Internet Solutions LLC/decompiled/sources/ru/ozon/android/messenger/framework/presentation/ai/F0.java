package ru.ozon.android.messenger.framework.presentation.ai;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.C7714v;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class F0 implements InterfaceC2395h<ru.ozon.android.messenger.blocks.ai.input.data.a> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f89251a;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i f89252a;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantViewModel$special$$inlined$map$2$2", f = "AiAssistantViewModel.kt", l = {223}, m = "emit")
        /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.F0$a$a, reason: collision with other inner class name */
        public static final class C1644a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f89253d;

            /* renamed from: e, reason: collision with root package name */
            int f89254e;

            public C1644a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f89253d = obj;
                this.f89254e |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC2397i interfaceC2397i) {
            this.f89252a = interfaceC2397i;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
            C1644a c1644a;
            int i11;
            ru.ozon.android.messenger.blocks.ai.input.data.a aVar;
            if (dVar instanceof C1644a) {
                c1644a = (C1644a) dVar;
                int i12 = c1644a.f89254e;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c1644a.f89254e = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = c1644a.f89253d;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c1644a.f89254e;
                    if (i11 != 0) {
                        Sc.s.b(obj2);
                        Iterator<T> it = ((ru.ozon.android.messenger.framework.presentation.models.l) obj).a().a().iterator();
                        do {
                            aVar = null;
                            if (!it.hasNext()) {
                                break;
                            }
                            ru.ozon.android.messenger.framework.presentation.models.u uVar = (ru.ozon.android.messenger.framework.presentation.models.u) C7714v.M(((ru.ozon.android.messenger.framework.presentation.models.q) it.next()).b());
                            ru.ozon.android.messenger.framework.presentation.models.g c11 = uVar != null ? uVar.c() : null;
                            ru.ozon.android.messenger.blocks.ai.input.presentation.a aVar3 = c11 instanceof ru.ozon.android.messenger.blocks.ai.input.presentation.a ? (ru.ozon.android.messenger.blocks.ai.input.presentation.a) c11 : null;
                            if (aVar3 != null) {
                                aVar = aVar3.d();
                            }
                        } while (aVar == null);
                        c1644a.f89254e = 1;
                        if (this.f89252a.emit(aVar, c1644a) == aVar2) {
                            return aVar2;
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
            c1644a = new C1644a(dVar);
            Object obj22 = c1644a.f89253d;
            Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c1644a.f89254e;
            if (i11 != 0) {
            }
            return Unit.f71690a;
        }
    }

    public F0(InterfaceC2395h interfaceC2395h) {
        this.f89251a = interfaceC2395h;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super ru.ozon.android.messenger.blocks.ai.input.data.a> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
        Object collect = this.f89251a.collect(new a(interfaceC2397i), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
