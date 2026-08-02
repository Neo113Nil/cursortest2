package vh0;

import Sc.r;
import Sc.s;
import eh0.InterfaceC6367a;
import eh0.c;
import fh0.C6568c;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C7747g;
import org.jetbrains.annotations.NotNull;
import ru.ozon.push.sdk.external.service.RemoteMessage;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Set<eh0.d> f102944a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Set<eh0.b> f102945b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Set<InterfaceC6367a> f102946c;

    /* loaded from: classes3.dex */
    static final class a extends AbstractC7737t implements Function1<eh0.d, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6568c f102947b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C6568c c6568c) {
            super(1);
            this.f102947b = c6568c;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(eh0.d dVar) {
            eh0.d handler = dVar;
            Intrinsics.checkNotNullParameter(handler, "handler");
            return Boolean.valueOf(handler.shouldHandle(this.f102947b));
        }
    }

    /* loaded from: classes3.dex */
    static final class b extends AbstractC7737t implements Function1<InterfaceC6367a, Boolean> {
        b(RemoteMessage remoteMessage) {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(InterfaceC6367a interfaceC6367a) {
            InterfaceC6367a handler = interfaceC6367a;
            Intrinsics.checkNotNullParameter(handler, "handler");
            return Boolean.valueOf(handler.b());
        }
    }

    /* loaded from: classes3.dex */
    static final class c extends AbstractC7737t implements Function1<eh0.b, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ RemoteMessage f102948b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f102949c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(RemoteMessage remoteMessage, boolean z11) {
            super(1);
            this.f102948b = remoteMessage;
            this.f102949c = z11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(eh0.b bVar) {
            eh0.b handler = bVar;
            Intrinsics.checkNotNullParameter(handler, "handler");
            return Boolean.valueOf(handler.shouldHandle(this.f102948b, this.f102949c));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@NotNull Set<? extends eh0.d> preShowingHandlers, @NotNull Set<? extends eh0.b> postShowingHandlers, @NotNull Set<? extends InterfaceC6367a> postOpeningHandlers) {
        Intrinsics.checkNotNullParameter(preShowingHandlers, "preShowingHandlers");
        Intrinsics.checkNotNullParameter(postShowingHandlers, "postShowingHandlers");
        Intrinsics.checkNotNullParameter(postOpeningHandlers, "postOpeningHandlers");
        this.f102944a = preShowingHandlers;
        this.f102945b = postShowingHandlers;
        this.f102946c = postOpeningHandlers;
    }

    @NotNull
    public final eh0.c a(@NotNull C6568c message, @NotNull RemoteMessage remoteMessage) {
        Object a11;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        C7747g h11 = kotlin.sequences.l.h(C7714v.w(this.f102944a), new e(new a(message), remoteMessage));
        eh0.c bVar = new c.b(message);
        Iterator it = h11.iterator();
        while (true) {
            C7747g.a aVar = (C7747g.a) it;
            if (!aVar.hasNext()) {
                return bVar;
            }
            eh0.d dVar = (eh0.d) aVar.next();
            try {
                r.Companion companion = r.INSTANCE;
                a11 = dVar.handle(bVar.getModel());
            } catch (Throwable th2) {
                r.Companion companion2 = r.INSTANCE;
                a11 = s.a(th2);
            }
            if (a11 instanceof r.b) {
                a11 = null;
            }
            bVar = bVar.a((eh0.c) a11);
        }
    }

    public final void b(@NotNull RemoteMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Iterator it = kotlin.sequences.l.h(C7714v.w(this.f102946c), new e(new b(message), message)).iterator();
        while (true) {
            C7747g.a aVar = (C7747g.a) it;
            if (!aVar.hasNext()) {
                return;
            }
            try {
                ((InterfaceC6367a) aVar.next()).a();
            } catch (Throwable th2) {
                Lm0.a.f17149a.e(th2);
                int i11 = sh0.b.f98783c;
                sh0.b.b("OzonPushProcessorInteractor", message, th2, null, new f(th2), 8);
            }
        }
    }

    public final void c(@NotNull RemoteMessage message, boolean z11) {
        Intrinsics.checkNotNullParameter(message, "message");
        Iterator it = kotlin.sequences.l.h(C7714v.w(this.f102945b), new e(new c(message, z11), message)).iterator();
        while (true) {
            C7747g.a aVar = (C7747g.a) it;
            if (!aVar.hasNext()) {
                return;
            }
            try {
                ((eh0.b) aVar.next()).handle(message);
            } catch (Throwable th2) {
                Lm0.a.f17149a.e(th2);
                int i11 = sh0.b.f98783c;
                sh0.b.b("OzonPushProcessorInteractor", message, th2, null, new f(th2), 8);
            }
        }
    }
}
