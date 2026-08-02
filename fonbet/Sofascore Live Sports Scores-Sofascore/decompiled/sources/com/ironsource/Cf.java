package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.Df;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.sofascore.model.newNetwork.commentary.CommentKt;
import defpackage.ot8;
import defpackage.xd5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Cf implements Df {

    @NotNull
    public static final a d = new a(null);

    @NotNull
    private static Ff e = new J5(IronSourceThreadManager.INSTANCE.getLevelPlayThread());

    @NotNull
    private final Ff a;

    @NotNull
    private final InterfaceC4044dg b;

    @NotNull
    private final InterfaceC4044dg c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public /* synthetic */ class b extends ot8 implements Function0<Unit> {
        public b(Object obj) {
            super(0, 0, com.ironsource.environment.thread.a.class, obj, CommentKt.AMERICAN_FOOTBALL_PLAY_TYPE_RUN, "run()V");
        }

        public final void a() {
            ((com.ironsource.environment.thread.a) this.receiver).run();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.a;
        }
    }

    public /* synthetic */ Cf(Ff ff, InterfaceC4044dg interfaceC4044dg, InterfaceC4044dg interfaceC4044dg2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? e : ff, (i & 2) != 0 ? C4062eg.a(IronSourceThreadManager.INSTANCE.getLevelPlayThread()) : interfaceC4044dg, (i & 4) != 0 ? C4062eg.a(new Handler(Looper.getMainLooper())) : interfaceC4044dg2);
    }

    private final Df.a a(Runnable runnable, long j, InterfaceC4044dg interfaceC4044dg) {
        return new Df.a(this.a.a(xd5.e(j), new defpackage.r0(26, interfaceC4044dg, com.ironsource.environment.thread.a.a.a(runnable))));
    }

    @Override // com.ironsource.Df
    @NotNull
    public Df.a b(@NotNull Runnable runnable, long j) {
        runnable.getClass();
        return a(runnable, j, this.b);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull Ff ff) {
            ff.getClass();
            Cf.e = ff;
        }

        private a() {
        }

        @NotNull
        public final Ff a() {
            return Cf.e;
        }
    }

    @Override // com.ironsource.Df
    @NotNull
    public Df.a a(@NotNull Runnable runnable, long j) {
        runnable.getClass();
        return a(runnable, j, this.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterfaceC4044dg interfaceC4044dg, com.ironsource.environment.thread.a aVar) {
        interfaceC4044dg.getClass();
        aVar.getClass();
        interfaceC4044dg.a(new b(aVar));
    }

    public Cf(@NotNull Ff ff, @NotNull InterfaceC4044dg interfaceC4044dg, @NotNull InterfaceC4044dg interfaceC4044dg2) {
        ff.getClass();
        interfaceC4044dg.getClass();
        interfaceC4044dg2.getClass();
        this.a = ff;
        this.b = interfaceC4044dg;
        this.c = interfaceC4044dg2;
    }

    public Cf() {
        this(null, null, null, 7, null);
    }
}
