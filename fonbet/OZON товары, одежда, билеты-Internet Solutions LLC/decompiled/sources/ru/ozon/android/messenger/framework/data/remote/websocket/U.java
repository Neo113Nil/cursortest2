package ru.ozon.android.messenger.framework.data.remote.websocket;

import We.C4871m;
import We.E;
import We.G;
import android.content.res.Resources;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.core.initialization.d;
import ru.ozon.android.messenger.framework.data.remote.websocket.J;
import xe.C10727i;

/* loaded from: classes10.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final We.E f87965a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final d.f f87966b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final J.a f87967c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Resources f87968d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final xe.I f87969e;

    /* renamed from: f, reason: collision with root package name */
    private We.Q f87970f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final We.E f87971g;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.websocket.WebSocketResolver", f = "WebSocketResolver.kt", l = {46}, m = "createWebSocket")
    static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        U f87972d;

        /* renamed from: e, reason: collision with root package name */
        Function1 f87973e;

        /* renamed from: f, reason: collision with root package name */
        Function1 f87974f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f87975g;

        /* renamed from: i, reason: collision with root package name */
        int f87977i;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f87975g = obj;
            this.f87977i |= LinearLayoutManager.INVALID_OFFSET;
            return U.this.f(null, null, this);
        }
    }

    public U(@NotNull We.E okHttpClient, @NotNull d.f networkConfig, @NotNull J.a socketListenerFactory, @NotNull Resources resources, @NotNull xe.I ioDispatcher) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        Intrinsics.checkNotNullParameter(socketListenerFactory, "socketListenerFactory");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f87965a = okHttpClient;
        this.f87966b = networkConfig;
        this.f87967c = socketListenerFactory;
        this.f87968d = resources;
        this.f87969e = ioDispatcher;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        C4871m c4871m = new C4871m(3, 5L);
        okHttpClient.getClass();
        E.a aVar = new E.a(okHttpClient);
        aVar.g(c4871m);
        this.f87971g = new We.E(aVar);
    }

    public final Object c(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object f7 = C10727i.f(this.f87969e, new T(this, null), cVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    public final void d(@NotNull Function1<? super String, Unit> socketDataListener, @NotNull Function1<? super L, Unit> socketTechEventsListener) {
        Intrinsics.checkNotNullParameter(socketDataListener, "socketDataListener");
        Intrinsics.checkNotNullParameter(socketTechEventsListener, "socketTechEventsListener");
        this.f87967c.getClass();
        Intrinsics.checkNotNullParameter(socketDataListener, "socketDataListener");
        Intrinsics.checkNotNullParameter(socketTechEventsListener, "socketTechEventsListener");
        this.f87970f = new S(new J(socketDataListener, socketTechEventsListener), this.f87968d);
    }

    public final void e(@NotNull Function1<? super String, Unit> socketDataListener, @NotNull Function1<? super L, Unit> socketTechEventsListener) {
        Intrinsics.checkNotNullParameter(socketDataListener, "socketDataListener");
        Intrinsics.checkNotNullParameter(socketTechEventsListener, "socketTechEventsListener");
        this.f87967c.getClass();
        Intrinsics.checkNotNullParameter(socketDataListener, "socketDataListener");
        Intrinsics.checkNotNullParameter(socketTechEventsListener, "socketTechEventsListener");
        this.f87970f = new P(new J(socketDataListener, socketTechEventsListener), this.f87965a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(@NotNull Function1<? super String, Unit> socketDataListener, @NotNull Function1<? super L, Unit> socketTechEventsListener, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        int i11;
        U u11;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i12 = aVar.f87977i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f87977i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = aVar.f87975g;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f87977i;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    aVar.f87972d = this;
                    aVar.f87973e = socketDataListener;
                    aVar.f87974f = socketTechEventsListener;
                    aVar.f87977i = 1;
                    if (c(aVar) == aVar2) {
                        return aVar2;
                    }
                    u11 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    socketTechEventsListener = aVar.f87974f;
                    socketDataListener = aVar.f87973e;
                    u11 = aVar.f87972d;
                    Sc.s.b(obj);
                }
                u11.f87967c.getClass();
                Intrinsics.checkNotNullParameter(socketDataListener, "socketDataListener");
                Intrinsics.checkNotNullParameter(socketTechEventsListener, "socketTechEventsListener");
                J j11 = new J(socketDataListener, socketTechEventsListener);
                G.a aVar3 = new G.a();
                aVar3.k(u11.f87966b.d());
                u11.f87970f = u11.f87971g.x(aVar3.b(), j11);
                return Unit.f71690a;
            }
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f87975g;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f87977i;
        if (i11 != 0) {
        }
        u11.f87967c.getClass();
        Intrinsics.checkNotNullParameter(socketDataListener, "socketDataListener");
        Intrinsics.checkNotNullParameter(socketTechEventsListener, "socketTechEventsListener");
        J j112 = new J(socketDataListener, socketTechEventsListener);
        G.a aVar32 = new G.a();
        aVar32.k(u11.f87966b.d());
        u11.f87970f = u11.f87971g.x(aVar32.b(), j112);
        return Unit.f71690a;
    }

    public final We.Q g() {
        return this.f87970f;
    }
}
