package com.ironsource.environment.thread;

import com.ironsource.C4157k4;
import com.ironsource.Gf;
import com.sofascore.model.newNetwork.commentary.CommentKt;
import defpackage.ot8;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class a implements Runnable {

    @NotNull
    public static final C1200a a = new C1200a(null);

    public abstract void a() throws Exception;

    public void a(@NotNull Throwable th) {
        th.getClass();
        Gf.a(th);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Throwable th) {
            C4157k4.d().a(th);
            try {
                a(th);
            } catch (Throwable th2) {
                C4157k4.d().a(th2);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.environment.thread.a$a, reason: collision with other inner class name */
    public static final class C1200a {

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.ironsource.environment.thread.a$a$a, reason: collision with other inner class name */
        public static final class C1201a extends a {
            final /* synthetic */ Function0<Unit> b;

            public C1201a(Function0<Unit> function0) {
                this.b = function0;
            }

            @Override // com.ironsource.environment.thread.a
            public void a() {
                this.b.invoke();
            }
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.ironsource.environment.thread.a$a$b */
        public /* synthetic */ class b extends ot8 implements Function0<Unit> {
            public b(Object obj) {
                super(0, 0, Runnable.class, obj, CommentKt.AMERICAN_FOOTBALL_PLAY_TYPE_RUN, "run()V");
            }

            public final void a() {
                ((Runnable) this.receiver).run();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Unit.a;
            }
        }

        public /* synthetic */ C1200a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final a a(@NotNull Runnable runnable) {
            runnable.getClass();
            a aVar = runnable instanceof a ? (a) runnable : null;
            return aVar == null ? a.a.a(new b(runnable)) : aVar;
        }

        private C1200a() {
        }

        @NotNull
        public final a a(@NotNull Function0<Unit> function0) {
            function0.getClass();
            return new C1201a(function0);
        }
    }
}
