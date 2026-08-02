package Tg;

import ah.AbstractC2012d;
import ah.AbstractC2026s;
import ah.C2011c;
import ah.C2020l;
import ah.C2023o;
import bh.C2424c;
import ch.C2924a;
import gh.AbstractC4384e;
import hh.C4508a;
import io.ktor.utils.io.f;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jh.AbstractC5135a;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.math.MathKt;
import kotlin.text.Charsets;
import zi.InterfaceC7015a;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: d, reason: collision with root package name */
    public static final b f11894d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    public static final C2924a f11895e = new C2924a("HttpPlainText");

    /* renamed from: a, reason: collision with root package name */
    public final Charset f11896a;

    /* renamed from: b, reason: collision with root package name */
    public final Charset f11897b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11898c;

    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public Charset f11901c;

        /* renamed from: a, reason: collision with root package name */
        public final Set f11899a = new LinkedHashSet();

        /* renamed from: b, reason: collision with root package name */
        public final Map f11900b = new LinkedHashMap();

        /* renamed from: d, reason: collision with root package name */
        public Charset f11902d = Charsets.UTF_8;

        public final Map a() {
            return this.f11900b;
        }

        public final Set b() {
            return this.f11899a;
        }

        public final Charset c() {
            return this.f11902d;
        }

        public final Charset d() {
            return this.f11901c;
        }
    }

    public static final class b implements k {

        public static final class a extends SuspendLambda implements Function3 {

            /* renamed from: n, reason: collision with root package name */
            public int f11903n;

            /* renamed from: o, reason: collision with root package name */
            public /* synthetic */ Object f11904o;

            /* renamed from: p, reason: collision with root package name */
            public /* synthetic */ Object f11905p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ m f11906q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(m mVar, Continuation continuation) {
                super(3, continuation);
                this.f11906q = mVar;
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AbstractC4384e abstractC4384e, Object obj, Continuation continuation) {
                a aVar = new a(this.f11906q, continuation);
                aVar.f11904o = abstractC4384e;
                aVar.f11905p = obj;
                return aVar.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f11903n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    AbstractC4384e abstractC4384e = (AbstractC4384e) this.f11904o;
                    Object obj2 = this.f11905p;
                    this.f11906q.c((Wg.c) abstractC4384e.b());
                    if (!(obj2 instanceof String)) {
                        return Unit.INSTANCE;
                    }
                    C2011c d10 = AbstractC2026s.d((ah.r) abstractC4384e.b());
                    if (d10 != null && !Intrinsics.areEqual(d10.e(), C2011c.C0334c.f16038a.a().e())) {
                        return Unit.INSTANCE;
                    }
                    Object e10 = this.f11906q.e((Wg.c) abstractC4384e.b(), (String) obj2, d10);
                    this.f11904o = null;
                    this.f11903n = 1;
                    if (abstractC4384e.e(e10, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* renamed from: Tg.m$b$b, reason: collision with other inner class name */
        public static final class C0238b extends SuspendLambda implements Function3 {

            /* renamed from: n, reason: collision with root package name */
            public int f11907n;

            /* renamed from: o, reason: collision with root package name */
            public /* synthetic */ Object f11908o;

            /* renamed from: p, reason: collision with root package name */
            public /* synthetic */ Object f11909p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ m f11910q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0238b(m mVar, Continuation continuation) {
                super(3, continuation);
                this.f11910q = mVar;
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AbstractC4384e abstractC4384e, Xg.d dVar, Continuation continuation) {
                C0238b c0238b = new C0238b(this.f11910q, continuation);
                c0238b.f11908o = abstractC4384e;
                c0238b.f11909p = dVar;
                return c0238b.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0088, code lost:
            
                if (r3.e(r4, r12) == r0) goto L21;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                C0238b c0238b;
                AbstractC4384e abstractC4384e;
                C4508a c4508a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f11907n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    AbstractC4384e abstractC4384e2 = (AbstractC4384e) this.f11908o;
                    Xg.d dVar = (Xg.d) this.f11909p;
                    C4508a a10 = dVar.a();
                    Object b10 = dVar.b();
                    if (!Intrinsics.areEqual(a10.a(), Reflection.getOrCreateKotlinClass(String.class)) || !(b10 instanceof io.ktor.utils.io.f)) {
                        return Unit.INSTANCE;
                    }
                    this.f11908o = abstractC4384e2;
                    this.f11909p = a10;
                    this.f11907n = 1;
                    c0238b = this;
                    Object a11 = f.b.a((io.ktor.utils.io.f) b10, 0L, c0238b, 1, null);
                    if (a11 != coroutine_suspended) {
                        abstractC4384e = abstractC4384e2;
                        obj = a11;
                        c4508a = a10;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                c4508a = (C4508a) this.f11909p;
                abstractC4384e = (AbstractC4384e) this.f11908o;
                ResultKt.throwOnFailure(obj);
                c0238b = this;
                Xg.d dVar2 = new Xg.d(c4508a, c0238b.f11910q.d((Og.b) abstractC4384e.b(), (kh.l) obj));
                c0238b.f11908o = null;
                c0238b.f11909p = null;
                c0238b.f11907n = 2;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // Tg.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(m plugin, Ng.a scope) {
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(scope, "scope");
            scope.z0().l(Wg.f.f13260g.b(), new a(plugin, null));
            scope.A0().l(Xg.f.f13844g.c(), new C0238b(plugin, null));
        }

        @Override // Tg.k
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public m a(Function1 block) {
            Intrinsics.checkNotNullParameter(block, "block");
            a aVar = new a();
            block.invoke(aVar);
            return new m(aVar.b(), aVar.a(), aVar.d(), aVar.c());
        }

        @Override // Tg.k
        public C2924a getKey() {
            return m.f11895e;
        }

        public b() {
        }
    }

    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(AbstractC5135a.i((Charset) obj), AbstractC5135a.i((Charset) obj2));
        }
    }

    public static final class d implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues((Float) ((Pair) obj2).getSecond(), (Float) ((Pair) obj).getSecond());
        }
    }

    public m(Set charsets, Map charsetQuality, Charset charset, Charset responseCharsetFallback) {
        Intrinsics.checkNotNullParameter(charsets, "charsets");
        Intrinsics.checkNotNullParameter(charsetQuality, "charsetQuality");
        Intrinsics.checkNotNullParameter(responseCharsetFallback, "responseCharsetFallback");
        this.f11896a = responseCharsetFallback;
        List<Pair> sortedWith = CollectionsKt.sortedWith(MapsKt.toList(charsetQuality), new d());
        ArrayList arrayList = new ArrayList();
        for (Object obj : charsets) {
            if (!charsetQuality.containsKey((Charset) obj)) {
                arrayList.add(obj);
            }
        }
        List<Charset> sortedWith2 = CollectionsKt.sortedWith(arrayList, new c());
        StringBuilder sb2 = new StringBuilder();
        for (Charset charset2 : sortedWith2) {
            if (sb2.length() > 0) {
                sb2.append(",");
            }
            sb2.append(AbstractC5135a.i(charset2));
        }
        for (Pair pair : sortedWith) {
            Charset charset3 = (Charset) pair.component1();
            float floatValue = ((Number) pair.component2()).floatValue();
            if (sb2.length() > 0) {
                sb2.append(",");
            }
            double d10 = floatValue;
            if (0.0d > d10 || d10 > 1.0d) {
                throw new IllegalStateException("Check failed.");
            }
            sb2.append(AbstractC5135a.i(charset3) + ";q=" + (MathKt.roundToInt(100 * floatValue) / 100.0d));
        }
        if (sb2.length() == 0) {
            sb2.append(AbstractC5135a.i(this.f11896a));
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        this.f11898c = sb3;
        if (charset == null && (charset = (Charset) CollectionsKt.firstOrNull(sortedWith2)) == null) {
            Pair pair2 = (Pair) CollectionsKt.firstOrNull(sortedWith);
            charset = pair2 != null ? (Charset) pair2.getFirst() : null;
            if (charset == null) {
                charset = Charsets.UTF_8;
            }
        }
        this.f11897b = charset;
    }

    public final void c(Wg.c context) {
        InterfaceC7015a interfaceC7015a;
        Intrinsics.checkNotNullParameter(context, "context");
        C2020l a10 = context.a();
        C2023o c2023o = C2023o.f16113a;
        if (a10.j(c2023o.d()) != null) {
            return;
        }
        interfaceC7015a = n.f11911a;
        interfaceC7015a.b("Adding Accept-Charset=" + this.f11898c + " to " + context.i());
        context.a().m(c2023o.d(), this.f11898c);
    }

    public final String d(Og.b call, kh.n body) {
        InterfaceC7015a interfaceC7015a;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(body, "body");
        Charset a10 = AbstractC2026s.a(call.f());
        if (a10 == null) {
            a10 = this.f11896a;
        }
        interfaceC7015a = n.f11911a;
        interfaceC7015a.b("Reading response body for " + call.e().getUrl() + " as String with charset " + a10);
        return kh.u.e(body, a10, 0, 2, null);
    }

    public final Object e(Wg.c cVar, String str, C2011c c2011c) {
        Charset charset;
        InterfaceC7015a interfaceC7015a;
        C2011c a10 = c2011c == null ? C2011c.C0334c.f16038a.a() : c2011c;
        if (c2011c == null || (charset = AbstractC2012d.a(c2011c)) == null) {
            charset = this.f11897b;
        }
        interfaceC7015a = n.f11911a;
        interfaceC7015a.b("Sending request body to " + cVar.i() + " as text/plain with charset " + charset);
        return new C2424c(str, AbstractC2012d.b(a10, charset), null, 4, null);
    }
}
