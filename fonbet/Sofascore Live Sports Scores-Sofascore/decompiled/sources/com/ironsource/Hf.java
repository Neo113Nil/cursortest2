package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import defpackage.a70;
import defpackage.bu3;
import defpackage.cu3;
import defpackage.hoi;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.il4;
import defpackage.joa;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.xka;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.ypa;
import defpackage.z45;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Hf {

    @NotNull
    public static final Hf a = new Hf();

    @NotNull
    private static final joa b = ypa.b(c.a);

    @NotNull
    private static final joa c = ypa.b(a.a);

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a extends xka implements Function0<ku3> {
        public static final a a = new a();

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.ironsource.Hf$a$a, reason: collision with other inner class name */
        public static final class C0184a extends kotlin.coroutines.a implements cu3 {
            public C0184a(bu3 bu3Var) {
                super(bu3Var);
            }

            @Override // defpackage.cu3
            public void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th) {
                IronLog.INTERNAL.error("CoroutineExceptionHandler caught: " + th.getMessage());
            }
        }

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ku3 invoke() {
            hs4 hs4Var = z45.a;
            return s9a.c(hq4.c.plus(new C0184a(bu3.a)));
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @il4(c = "com.unity3d.mediation.internal.TempThreadManager$launchCoroutineTask$1", f = "TempThreadManager.kt", l = {}, m = "invokeSuspend")
    public static final class b extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
        int a;
        final /* synthetic */ Runnable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Runnable runnable, rq3<? super b> rq3Var) {
            super(2, rq3Var);
            this.b = runnable;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull ku3 ku3Var, @Nullable rq3<? super Unit> rq3Var) {
            return ((b) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.h21
        @NotNull
        public final rq3<Unit> create(@Nullable Object obj, @NotNull rq3<?> rq3Var) {
            return new b(this.b, rq3Var);
        }

        @Override // defpackage.h21
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            lu3 lu3Var = lu3.a;
            if (this.a != 0) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            try {
                this.b.run();
            } catch (Throwable th) {
                C4157k4.d().a(th);
                IronLog.INTERNAL.error("Exception in TempThreadManager coroutine: " + th.getMessage());
            }
            return Unit.a;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class c extends xka implements Function0<C4149je> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4149je invoke() {
            return new C4149je(16, null, 2, null);
        }
    }

    private Hf() {
    }

    private final boolean a(Runnable runnable) {
        try {
            xw3.L(a(), null, null, new b(runnable, null), 3);
            return true;
        } catch (Throwable th) {
            try {
                Gf.a(th);
            } catch (Exception e) {
                C4157k4.d().a(e);
            }
            IronLog.INTERNAL.error("Failed to launch coroutine: " + th.getMessage());
            return false;
        }
    }

    public final void b(@NotNull Runnable runnable) {
        runnable.getClass();
        if (a(runnable)) {
            return;
        }
        b().execute(runnable);
    }

    private final C4149je b() {
        return (C4149je) b.getValue();
    }

    private final ku3 a() {
        return (ku3) c.getValue();
    }
}
