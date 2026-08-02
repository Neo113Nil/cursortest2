package jg0;

import Dj.InterfaceC2875c;
import I1.w;
import Sc.InterfaceC4008j;
import Sc.k;
import ig0.InterfaceC7075a;
import java.util.Set;
import kg0.C7677a;
import kg0.InterfaceC7678b;
import kg0.InterfaceC7679c;
import kotlin.collections.C7705l;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.m;
import lg0.C7958a;
import mg0.C8146a;
import ng0.C8593a;
import og0.C8735a;
import org.jetbrains.annotations.NotNull;
import qg0.InterfaceC9056a;
import ru.ozon.app.android.sentry.di.module.SentryPluginProvidersModule$provideSentryHelperPluginProvider$sentryHelperConfig$1;
import ug0.C10058a;
import vg0.C10319b;
import vg0.InterfaceC10318a;
import zg0.C11121a;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final C11121a f70091f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final C11121a f70092g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f70093h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f70094i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f70095j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f70096k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f70097l;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f70087b = {w.c(f.class, "config", "getConfig()Lru/ozon/ozonSentryHelper/config/OzonSentryHelperConfig;", 0), w.c(f.class, "platformDependencies", "getPlatformDependencies()Lru/ozon/ozonSentryHelper/internal/platform/PlatformDependencies;", 0)};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f70086a = new f();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f70088c = k.b(d.f70101b);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f70089d = k.b(C1149f.f70103b);

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f70090e = k.b(a.f70098b);

    static final class a extends AbstractC7737t implements Function0<Set<? extends InterfaceC9056a>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f70098b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Set<? extends InterfaceC9056a> invoke() {
            int i11 = jg0.d.f70080e;
            return e0.h(new C10058a((InterfaceC2875c) f.f70086a.i().a().d(InterfaceC2875c.class)));
        }
    }

    static final class b extends AbstractC7737t implements Function0<C7677a> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f70099b = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final C7677a invoke() {
            f fVar = f.f70086a;
            return new C7677a(f.c(fVar), f.d(fVar));
        }
    }

    static final class c extends AbstractC7737t implements Function0<InterfaceC10318a> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f70100b = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final InterfaceC10318a invoke() {
            int i11 = jg0.d.f70080e;
            return new C10319b(jg0.d.d(), jg0.d.g());
        }
    }

    static final class d extends AbstractC7737t implements Function0<C7677a> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f70101b = new d(0);

        @Override // kotlin.jvm.functions.Function0
        public final C7677a invoke() {
            return f.a(f.f70086a);
        }
    }

    static final class e extends AbstractC7737t implements Function0<Set<? extends InterfaceC7678b>> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f70102b = new e(0);

        @Override // kotlin.jvm.functions.Function0
        public final Set<? extends InterfaceC7678b> invoke() {
            f fVar = f.f70086a;
            InterfaceC7678b[] elements = {new C7958a(fVar.g().getHashCommit()), new C8735a(f.b(fVar)), new C8146a(), f.e(fVar)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return C7705l.j0(elements);
        }
    }

    /* renamed from: jg0.f$f, reason: collision with other inner class name */
    static final class C1149f extends AbstractC7737t implements Function0<C7677a> {

        /* renamed from: b, reason: collision with root package name */
        public static final C1149f f70103b = new C1149f(0);

        @Override // kotlin.jvm.functions.Function0
        public final C7677a invoke() {
            return f.a(f.f70086a);
        }
    }

    static final class g extends AbstractC7737t implements Function0<Set<? extends C8593a>> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f70104b = new g(0);

        @Override // kotlin.jvm.functions.Function0
        public final Set<? extends C8593a> invoke() {
            return e0.h(f.e(f.f70086a));
        }
    }

    static final class h extends AbstractC7737t implements Function0<C8593a> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f70105b = new h(0);

        @Override // kotlin.jvm.functions.Function0
        public final C8593a invoke() {
            return new C8593a(f.b(f.f70086a));
        }
    }

    static {
        Function0 message;
        Function0 message2;
        message = jg0.g.f70106a;
        Intrinsics.checkNotNullParameter(message, "message");
        f70091f = new C11121a(message);
        message2 = jg0.g.f70106a;
        Intrinsics.checkNotNullParameter(message2, "message");
        f70092g = new C11121a(message2);
        f70093h = k.b(b.f70099b);
        f70094i = k.b(c.f70100b);
        f70095j = k.b(e.f70102b);
        f70096k = k.b(g.f70104b);
        f70097l = k.b(h.f70105b);
    }

    private f() {
    }

    public static final C7677a a(f fVar) {
        fVar.getClass();
        return (C7677a) f70093h.getValue();
    }

    public static final InterfaceC10318a b(f fVar) {
        fVar.getClass();
        return (InterfaceC10318a) f70094i.getValue();
    }

    public static final Set c(f fVar) {
        fVar.getClass();
        return (Set) f70095j.getValue();
    }

    public static final Set d(f fVar) {
        fVar.getClass();
        return (Set) f70096k.getValue();
    }

    public static final C8593a e(f fVar) {
        fVar.getClass();
        return (C8593a) f70097l.getValue();
    }

    @NotNull
    public static Set f() {
        return (Set) f70090e.getValue();
    }

    @NotNull
    public static InterfaceC7678b h() {
        return (InterfaceC7678b) f70088c.getValue();
    }

    @NotNull
    public static InterfaceC7679c j() {
        return (InterfaceC7679c) f70089d.getValue();
    }

    @NotNull
    public final InterfaceC7075a g() {
        return (InterfaceC7075a) f70091f.getValue(this, f70087b[0]);
    }

    @NotNull
    public final ug0.b i() {
        return (ug0.b) f70092g.getValue(this, f70087b[1]);
    }

    public final void k(@NotNull SentryPluginProvidersModule$provideSentryHelperPluginProvider$sentryHelperConfig$1 config, @NotNull ug0.b platformDependencies) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(platformDependencies, "platformDependencies");
        Intrinsics.checkNotNullParameter(config, "<set-?>");
        m<?>[] mVarArr = f70087b;
        f70091f.setValue(this, mVarArr[0], config);
        Intrinsics.checkNotNullParameter(platformDependencies, "<set-?>");
        f70092g.setValue(this, mVarArr[1], platformDependencies);
    }
}
