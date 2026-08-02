package Tg;

import Wg.b;
import ah.C2027t;
import ah.InterfaceC2019k;
import ah.P;
import ch.C2924a;
import ch.InterfaceC2925b;
import fh.AbstractC4283a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zi.InterfaceC7015a;

/* loaded from: classes3.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC7015a f11886a = AbstractC4283a.a("io.ktor.client.plugins.HttpCallValidator");

    /* renamed from: b, reason: collision with root package name */
    public static final C2924a f11887b = new C2924a("ExpectSuccessAttributeKey");

    public static final class a implements Wg.b {

        /* renamed from: a, reason: collision with root package name */
        public final C2027t f11888a;

        /* renamed from: b, reason: collision with root package name */
        public final P f11889b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC2925b f11890c;

        /* renamed from: d, reason: collision with root package name */
        public final InterfaceC2019k f11891d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Wg.c f11892e;

        public a(Wg.c cVar) {
            this.f11892e = cVar;
            this.f11888a = cVar.h();
            this.f11889b = cVar.i().b();
            this.f11890c = cVar.c();
            this.f11891d = cVar.a().p();
        }

        @Override // ah.InterfaceC2025q
        public InterfaceC2019k a() {
            return this.f11891d;
        }

        @Override // Wg.b
        public InterfaceC2925b getAttributes() {
            return this.f11890c;
        }

        @Override // Wg.b, Ph.P
        public CoroutineContext getCoroutineContext() {
            return b.a.a(this);
        }

        @Override // Wg.b
        public C2027t getMethod() {
            return this.f11888a;
        }

        @Override // Wg.b
        public P getUrl() {
            return this.f11889b;
        }

        @Override // Wg.b
        public Og.b r() {
            throw new IllegalStateException("Call is not initialized");
        }
    }

    public static final a a(Wg.c cVar) {
        return new a(cVar);
    }

    public static final void b(Ng.b bVar, Function1 block) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        bVar.h(i.f11854d, block);
    }

    public static final C2924a e() {
        return f11887b;
    }
}
