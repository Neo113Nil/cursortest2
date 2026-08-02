package ru.ozon.android.messenger.framework.composer.action;

import WZ.l;
import WZ.m;
import WZ.t;
import WZ.x;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.h;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Vg.a f86590a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1<Tg.b, Boolean> f86591b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1<Tg.b, Boolean> f86592c;

    /* renamed from: d, reason: collision with root package name */
    private final l f86593d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final InterfaceC7851b f86594a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Tg.a f86595b;

        /* renamed from: c, reason: collision with root package name */
        private Function1<? super Tg.b, Boolean> f86596c;

        /* renamed from: d, reason: collision with root package name */
        private l f86597d;

        /* renamed from: e, reason: collision with root package name */
        private Function1<? super Tg.b, Boolean> f86598e;

        /* renamed from: ru.ozon.android.messenger.framework.composer.action.b$a$a, reason: collision with other inner class name */
        /* synthetic */ class C1537a extends C7735q implements Function1<Tg.b, Unit> {
            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Tg.b bVar) {
                Tg.b p02 = bVar;
                Intrinsics.checkNotNullParameter(p02, "p0");
                b.a((b) this.receiver, p02);
                return Unit.f71690a;
            }
        }

        public a(@NotNull InterfaceC7851b composerController, @NotNull Tg.a router) {
            Intrinsics.checkNotNullParameter(composerController, "composerController");
            Intrinsics.checkNotNullParameter(router, "router");
            this.f86594a = composerController;
            this.f86595b = router;
        }

        @NotNull
        public final void a(@NotNull l tokenizedAnalytics) {
            Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
            this.f86597d = tokenizedAnalytics;
        }

        @NotNull
        public final h<Unit> b() {
            return new C1537a(1, new b(new Vg.a(this.f86594a, this.f86595b), this.f86598e, this.f86596c, this.f86597d), b.class, "handle", "handle(Lru/ozon/android/action/AtomAction;)V", 0);
        }

        @NotNull
        public final void c(@NotNull Function1 handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            this.f86598e = handler;
        }

        @NotNull
        public final void d(@NotNull Function1 callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f86596c = callback;
        }
    }

    private b() {
        throw null;
    }

    public b(Vg.a aVar, Function1 function1, Function1 function12, l lVar) {
        this.f86590a = aVar;
        this.f86591b = function1;
        this.f86592c = function12;
        this.f86593d = lVar;
    }

    public static final void a(b bVar, Tg.b bVar2) {
        Function1<Tg.b, Boolean> function1 = bVar.f86592c;
        if (function1 != null && function1.invoke(bVar2).booleanValue()) {
            bVar.b(bVar2);
            return;
        }
        Function1<Tg.b, Boolean> function12 = bVar.f86591b;
        if (function12 == null ? false : function12.invoke(bVar2).booleanValue()) {
            return;
        }
        bVar.b(bVar2);
        bVar.f86590a.a(bVar2);
    }

    private final void b(Tg.b bVar) {
        e eVar;
        Map<String, TokenizedTrackingInfo> a11;
        t b11;
        l lVar;
        if (!(bVar instanceof e) || (a11 = (eVar = (e) bVar).a()) == null || (b11 = x.b(a11, eVar.b(), null)) == null || (lVar = this.f86593d) == null) {
            return;
        }
        m.a(lVar, b11, null);
    }
}
