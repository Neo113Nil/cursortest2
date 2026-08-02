package j30;

import Sc.s;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.work.d;
import androidx.work.e;
import androidx.work.g;
import androidx.work.impl.C;
import androidx.work.p;
import androidx.work.q;
import i30.C7004a;
import java.time.Duration;
import java.util.Collections;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q30.C8982b;
import ru.ozon.fintech.analytic.worker.GraylogSendWorker;
import xe.C10727i;
import xe.J;
import xe.M;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f69370a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C8982b f69371b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C7004a f69372c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final R30.a f69373d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final O30.b f69374e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final S30.a f69375f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final b f69376g;

    /* renamed from: h, reason: collision with root package name */
    private String f69377h;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.analytic.domain.graylog.GraylogInteractor$init$1", f = "GraylogInteractor.kt", l = {48, 51, 58}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f69378d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
        
            if (r1.a(r7, r6) == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
        
            if (r7 == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x002e, code lost:
        
            if (r7 == r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f69378d;
            c cVar = c.this;
            if (i11 == 0) {
                s.b(obj);
                this.f69378d = 1;
                obj = cVar.g(3, this);
            } else {
                if (i11 != 1) {
                    if (i11 == 2) {
                        s.b(obj);
                        cVar.i(3, false, true);
                        return Unit.f71690a;
                    }
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        cVar.i(1, false, true);
                    }
                    return Unit.f71690a;
                }
                s.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                int b11 = cVar.f69372c.b() * 3;
                C8982b c8982b = cVar.f69371b;
                this.f69378d = 2;
            } else {
                this.f69378d = 3;
                obj = c.h(cVar, this);
            }
            return aVar;
        }
    }

    public static final class b extends kotlin.coroutines.a implements J {
        @Override // xe.J
        public final void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
            L80.a.c("GraylogInteractor", "coroutineExceptionHandler", th2);
            th2.printStackTrace();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.analytic.domain.graylog.GraylogInteractor$updateUserId$1", f = "GraylogInteractor.kt", l = {262}, m = "invokeSuspend")
    /* renamed from: j30.c$c, reason: collision with other inner class name */
    static final class C1131c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f69380d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f69382f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1131c(String str, kotlin.coroutines.d<? super C1131c> dVar) {
            super(2, dVar);
            this.f69382f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return c.this.new C1131c(this.f69382f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C1131c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f69380d;
            if (i11 == 0) {
                s.b(obj);
                C8982b c8982b = c.this.f69371b;
                this.f69380d = 1;
                if (c8982b.g(this.f69382f, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    public c(@NotNull Context context, @NotNull C8982b repository, @NotNull C7004a config, @NotNull R30.a scopes, @NotNull O30.b fintechLibType, @NotNull S30.a applicationInfoDataSource) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        Intrinsics.checkNotNullParameter(fintechLibType, "fintechLibType");
        Intrinsics.checkNotNullParameter(applicationInfoDataSource, "applicationInfoDataSource");
        this.f69370a = context;
        this.f69371b = repository;
        this.f69372c = config;
        this.f69373d = scopes;
        this.f69374e = fintechLibType;
        this.f69375f = applicationInfoDataSource;
        this.f69376g = new b(J.f105405n0);
    }

    public static void f(c cVar, int i11) {
        C10727i.c(cVar.f69373d.b(), cVar.f69376g, null, new C7276a(cVar, (i11 & 1) == 0, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(int i11, kotlin.coroutines.jvm.internal.c cVar) {
        j30.b bVar;
        int i12;
        c cVar2;
        if (cVar instanceof j30.b) {
            bVar = (j30.b) cVar;
            int i13 = bVar.f69369h;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                bVar.f69369h = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = bVar.f69367f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i12 = bVar.f69369h;
                if (i12 != 0) {
                    s.b(obj);
                    bVar.f69365d = this;
                    bVar.f69366e = i11;
                    bVar.f69369h = 1;
                    obj = this.f69371b.d(bVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                    cVar2 = this;
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i11 = bVar.f69366e;
                    cVar2 = bVar.f69365d;
                    s.b(obj);
                }
                return Boolean.valueOf(((Number) obj).intValue() >= cVar2.f69372c.b() * i11);
            }
        }
        bVar = new j30.b(this, cVar);
        Object obj2 = bVar.f69367f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i12 = bVar.f69369h;
        if (i12 != 0) {
        }
        return Boolean.valueOf(((Number) obj2).intValue() >= cVar2.f69372c.b() * i11);
    }

    static /* synthetic */ Object h(c cVar, j jVar) {
        return cVar.g(1, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(int i11, boolean z11, boolean z12) {
        d.a aVar = new d.a();
        aVar.b(p.CONNECTED);
        androidx.work.d a11 = aVar.a();
        q.a a12 = new q.a(GraylogSendWorker.class).a("GraylogInteractor");
        O30.b bVar = this.f69374e;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        e.a aVar2 = new e.a();
        aVar2.e(bVar.ordinal(), "FINTECH_ACTIVITY_LIB_TYPE_KEY");
        Intrinsics.checkNotNullExpressionValue(aVar2, "putInt(...)");
        aVar2.d(z11);
        aVar2.e(i11, "WORKER_PARAM_BATCH_MULT");
        androidx.work.e a13 = aVar2.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        q.a j11 = a12.m(a13).j(a11);
        if (z12) {
            Duration ofMinutes = Duration.ofMinutes(5L);
            Intrinsics.checkNotNullExpressionValue(ofMinutes, "ofMinutes(...)");
            j11.l(ofMinutes);
        }
        C i12 = C.i(this.f69370a);
        g gVar = g.KEEP;
        q b11 = j11.b();
        i12.getClass();
        i12.c("SendLogs", gVar, Collections.singletonList(b11)).t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, Integer num2, String str9, Boolean bool, String str10, String str11, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, String str12, Boolean bool7, String str13, String str14, String str15, String str16, Boolean bool8, String str17, String str18, String str19, String str20, Integer num3, String str21, Integer num4, String str22, Boolean bool9, String str23, String str24, String str25, String str26, kotlin.coroutines.jvm.internal.c cVar) {
        e eVar;
        int i11;
        c cVar2;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i12 = eVar.f69427g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                eVar.f69427g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = eVar.f69425e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = eVar.f69427g;
                if (i11 != 0) {
                    s.b(obj);
                    String uniqueApplicationId = this.f69375f.getUniqueApplicationId();
                    String str27 = this.f69377h;
                    if (str27 == null) {
                        str27 = "";
                    }
                    String str28 = str27;
                    String a11 = this.f69372c.a();
                    eVar.f69424d = this;
                    eVar.f69427g = 1;
                    if (this.f69371b.e(str, uniqueApplicationId, str28, str2, str3, num, str4, str5, str6, str7, str8, num2, str9, bool, str10, str11, bool2, bool3, bool4, bool5, bool6, str12, bool7, str13, str14, str15, str16, bool8, str17, str18, str19, str20, num3, str21, num4, a11, str22, bool9, str23, str24, str25, str26, eVar) == aVar) {
                        return aVar;
                    }
                    cVar2 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar2 = eVar.f69424d;
                    s.b(obj);
                }
                f(cVar2, 3);
                return Unit.f71690a;
            }
        }
        eVar = new e(this, cVar);
        Object obj2 = eVar.f69425e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = eVar.f69427g;
        if (i11 != 0) {
        }
        f(cVar2, 3);
        return Unit.f71690a;
    }

    public static Object n(c cVar, String str, String str2, String str3, kotlin.coroutines.d dVar) {
        Object m11 = cVar.m("fintech_mobile_health_network_error", null, str, null, null, null, str2, null, str3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (kotlin.coroutines.jvm.internal.c) dVar);
        return m11 == Wc.a.COROUTINE_SUSPENDED ? m11 : Unit.f71690a;
    }

    public final void k() {
        C10727i.c(this.f69373d.b(), this.f69376g, null, new a(null), 2);
    }

    public final void l(@NotNull String message, String str, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, Integer num2, String str8, Boolean bool, String str9, String str10, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, String str11, Boolean bool7, String str12, String str13, String str14, String str15, Boolean bool8, String str16, String str17, String str18, String str19, Integer num3, String str20, Integer num4, String str21, Boolean bool9, String str22, String str23, String str24, String str25) {
        Intrinsics.checkNotNullParameter(message, "message");
        C10727i.c(this.f69373d.b(), this.f69376g, null, new d(this, message, str, str2, num, str3, str4, str5, str6, str7, num2, str8, bool, str9, str10, bool2, bool3, bool4, bool5, bool6, str11, bool7, str12, str13, str14, str15, bool8, str16, str17, str18, str19, num3, str20, num4, str21, bool9, str22, str23, str24, str25, null), 2);
    }

    public final void o(String str) {
        this.f69377h = str;
    }

    public final void p(String str) {
        C10727i.c(this.f69373d.b(), null, null, new C1131c(str, null), 3);
    }
}
