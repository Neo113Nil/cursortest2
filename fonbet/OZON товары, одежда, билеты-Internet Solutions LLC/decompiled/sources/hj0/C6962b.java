package hj0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.LinkedHashMap;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* renamed from: hj0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6962b implements InterfaceC2395h<fj0.c<Boolean>> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C6963c f65575a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ fj0.d f65576b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C6961a f65577c;

    /* renamed from: hj0.b$a */
    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i f65578a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ fj0.d f65579b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C6961a f65580c;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.debug.menu.shared.configuration.domain.repository.impl.ConfigurationRepositoryImpl$getBooleanConfiguration$$inlined$map$1$2", f = "ConfigurationRepositoryImpl.kt", l = {237, 223}, m = "emit")
        /* renamed from: hj0.b$a$a, reason: collision with other inner class name */
        public static final class C1073a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f65581d;

            /* renamed from: e, reason: collision with root package name */
            int f65582e;

            /* renamed from: f, reason: collision with root package name */
            a f65583f;

            /* renamed from: h, reason: collision with root package name */
            InterfaceC2397i f65585h;

            /* renamed from: i, reason: collision with root package name */
            String f65586i;

            /* renamed from: j, reason: collision with root package name */
            Je.d f65587j;

            /* renamed from: k, reason: collision with root package name */
            Object f65588k;

            /* renamed from: l, reason: collision with root package name */
            Boolean f65589l;

            /* renamed from: m, reason: collision with root package name */
            String f65590m;

            public C1073a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f65581d = obj;
                this.f65582e |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC2397i interfaceC2397i, fj0.d dVar, C6961a c6961a) {
            this.f65578a = interfaceC2397i;
            this.f65579b = dVar;
            this.f65580c = c6961a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x00b3, code lost:
        
            if (r8.emit(r6, r0) == r1) goto L30;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
            C1073a c1073a;
            int i11;
            Boolean bool;
            InterfaceC2397i interfaceC2397i;
            fj0.c cVar;
            String key;
            Je.d dVar2;
            a<T> aVar;
            Object obj2;
            String str;
            LinkedHashMap linkedHashMap;
            try {
                if (dVar instanceof C1073a) {
                    c1073a = (C1073a) dVar;
                    int i12 = c1073a.f65582e;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c1073a.f65582e = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj3 = c1073a.f65581d;
                        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c1073a.f65582e;
                        if (i11 != 0) {
                            s.b(obj3);
                            bool = (Boolean) obj;
                            interfaceC2397i = this.f65578a;
                            if (bool != null) {
                                fj0.d dVar3 = this.f65579b;
                                key = dVar3.getKey();
                                String key2 = dVar3.getKey();
                                Object a11 = dVar3.a();
                                dVar2 = this.f65580c.f65573b;
                                c1073a.f65583f = this;
                                c1073a.f65585h = interfaceC2397i;
                                c1073a.f65586i = key;
                                c1073a.f65587j = dVar2;
                                c1073a.f65588k = a11;
                                c1073a.f65589l = bool;
                                c1073a.f65590m = key2;
                                c1073a.f65582e = 1;
                                if (dVar2.a(c1073a) != aVar2) {
                                    aVar = this;
                                    obj2 = a11;
                                    str = key2;
                                }
                                return aVar2;
                            }
                            cVar = null;
                            c1073a.f65583f = null;
                            c1073a.f65585h = null;
                            c1073a.f65586i = null;
                            c1073a.f65587j = null;
                            c1073a.f65588k = null;
                            c1073a.f65589l = null;
                            c1073a.f65590m = null;
                            c1073a.f65582e = 2;
                        } else {
                            if (i11 != 1) {
                                if (i11 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj3);
                                return Unit.f71690a;
                            }
                            str = c1073a.f65590m;
                            bool = c1073a.f65589l;
                            obj2 = c1073a.f65588k;
                            dVar2 = c1073a.f65587j;
                            key = c1073a.f65586i;
                            interfaceC2397i = c1073a.f65585h;
                            aVar = c1073a.f65583f;
                            s.b(obj3);
                        }
                        linkedHashMap = aVar.f65580c.f65574c;
                        boolean booleanValue = ((Boolean) linkedHashMap.getOrDefault(key, Boolean.FALSE)).booleanValue();
                        dVar2.c(null);
                        cVar = new fj0.c(str, bool, obj2, booleanValue);
                        c1073a.f65583f = null;
                        c1073a.f65585h = null;
                        c1073a.f65586i = null;
                        c1073a.f65587j = null;
                        c1073a.f65588k = null;
                        c1073a.f65589l = null;
                        c1073a.f65590m = null;
                        c1073a.f65582e = 2;
                    }
                }
                linkedHashMap = aVar.f65580c.f65574c;
                boolean booleanValue2 = ((Boolean) linkedHashMap.getOrDefault(key, Boolean.FALSE)).booleanValue();
                dVar2.c(null);
                cVar = new fj0.c(str, bool, obj2, booleanValue2);
                c1073a.f65583f = null;
                c1073a.f65585h = null;
                c1073a.f65586i = null;
                c1073a.f65587j = null;
                c1073a.f65588k = null;
                c1073a.f65589l = null;
                c1073a.f65590m = null;
                c1073a.f65582e = 2;
            } catch (Throwable th2) {
                dVar2.c(null);
                throw th2;
            }
            c1073a = new C1073a(dVar);
            Object obj32 = c1073a.f65581d;
            Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c1073a.f65582e;
            if (i11 != 0) {
            }
        }
    }

    public C6962b(C6963c c6963c, fj0.d dVar, C6961a c6961a) {
        this.f65575a = c6963c;
        this.f65576b = dVar;
        this.f65577c = c6961a;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super fj0.c<Boolean>> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
        Object collect = this.f65575a.collect(new a(interfaceC2397i, this.f65576b, this.f65577c), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
