package d00;

import I0.C3173b;
import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import j20.InterfaceC7243a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m20.InterfaceC8046a;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.compose.widget.scrollable.j;

@InterfaceC6021g
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u0019B%\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ9\u0010\u0012\u001a\u00020\u0011\"\b\b\u0001\u0010\f*\u00020\u000b2\u001a\b\u0004\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f0\rH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0016\u001a\u00020\u00112\u001a\b\u0004\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\rH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0013J'\u0010\u0019\u001a\u00020\u00112\u0018\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0017\u0012\u0004\u0012\u00020\u00110\r¢\u0006\u0004\b\u0019\u0010\u0013J?\u0010\u001e\u001a\u00020\u0011\"\b\b\u0001\u0010\u001b*\u00020\u001a2 \b\u0004\u0010\u001d\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c0\rH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0013J7\u0010 \u001a\u00020\u0011\"\b\b\u0001\u0010\u001b*\u00020\u001a2\u001e\u0010\u0018\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001f\u0012\u0004\u0012\u00020\u00110\r¢\u0006\u0004\b \u0010\u0013J7\u0010\"\u001a\u00020\u0011\"\b\b\u0001\u0010\u001b*\u00020\u001a2\u001e\u0010\u0018\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!\u0012\u0004\u0012\u00020\u00110\r¢\u0006\u0004\b\"\u0010\u0013J\u000f\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010%\u001a\u0004\b&\u0010$R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b'\u0010$R\u001b\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R8\u0010\u0015\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0014\u0018\u00010,8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b-\u0010.\u0012\u0004\b-\u00102\u001a\u0004\b(\u0010/\"\u0004\b0\u00101R4\u00108\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u000f0,038\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b*\u00104\u0012\u0004\b7\u00102\u001a\u0004\b5\u00106R<\u0010;\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0006\b\u0001\u0012\u00020\u001a0\u001c0,038\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b&\u00104\u0012\u0004\b:\u00102\u001a\u0004\b9\u00106R\u001b\u0010@\u001a\u00020<8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b9\u0010=\u001a\u0004\b>\u0010?\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006A"}, d2 = {"Ld00/d;", "", "S", "", "vertical", "component", "", "Lru/ozon/composer/compose/widget/WidgetVersion;", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;[J)V", "Lhi/a;", "C", "Lkotlin/Function1;", "Lk20/g;", "Lk20/e;", "provider", "", "q", "(Lkotlin/jvm/functions/Function1;)V", "Lj20/a;", "config", "m", "Lru/ozon/composer/compose/widget/config/b;", "init", "a", "Ll20/c;", "I", "Lm20/a;", "viewMapper", "n", "Lru/ozon/composer/compose/widget/scrollable/j;", "p", "Lru/ozon/composer/compose/widget/overlay/e;", "l", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "f", "b", "c", "[J", "e", "()[J", "Ld00/d$a;", "d", "Ld00/d$a;", "()Ld00/d$a;", "o", "(Ld00/d$a;)V", "()V", "", "Ljava/util/List;", "j", "()Ljava/util/List;", "k", "widgetComponentProvider", "g", "h", "viewMappers", "Ln20/i;", "LSc/j;", "i", "()Ln20/i;", "widget", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: d00.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6018d<S> {

    /* renamed from: h, reason: collision with root package name */
    public static final int f60956h = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final String vertical;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final String component;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final long[] version;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private a<InterfaceC7243a<? extends Object>> config;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ArrayList f60961e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ArrayList f60962f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final InterfaceC4008j widget;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bá\u0080\u0001\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ld00/d$a;", "T", "", "Lk20/g;", "storage", "get", "(Lk20/g;)Ljava/lang/Object;", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: d00.d$a */
    public interface a<T> {
        T get(@NotNull C7475g storage);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk20/g;", "it", "Lj20/a;", "", "a", "(Lk20/g;)Lj20/a;"}, k = 3, mv = {2, 0, 0})
    /* renamed from: d00.d$b */
    /* loaded from: classes3.dex */
    public static final class b<T> implements a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<C7475g, InterfaceC7243a<S>> f60964a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super C7475g, ? extends InterfaceC7243a<S>> function1) {
            this.f60964a = function1;
        }

        @Override // d00.C6018d.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC7243a<? extends Object> get(C7475g it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f60964a.invoke(it);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0012\u0012\u0006\b\u0001\u0012\u00020\u0003\u0012\u0006\b\u0001\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk20/g;", "it", "Lm20/a;", "", "Ll20/c;", "a", "(Lk20/g;)Lm20/a;"}, k = 3, mv = {2, 0, 0})
    /* renamed from: d00.d$c */
    /* loaded from: classes3.dex */
    public static final class c<T> implements a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<C7475g, InterfaceC8046a<S, I>> f60965a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Function1<? super C7475g, ? extends InterfaceC8046a<S, I>> function1) {
            this.f60965a = function1;
        }

        @Override // d00.C6018d.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC8046a<? extends Object, ? extends l20.c> get(C7475g it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return (InterfaceC8046a) this.f60965a.invoke(it);
        }
    }

    /* renamed from: d00.d$d, reason: collision with other inner class name */
    static final class C0937d extends AbstractC7737t implements Function0<C6019e> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6018d<S> f60966b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0937d(C6018d<S> c6018d) {
            super(0);
            this.f60966b = c6018d;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C6019e invoke() {
            C6018d<S> c6018d = this.f60966b;
            a<InterfaceC7243a<? extends Object>> c11 = c6018d.c();
            if (c11 != null) {
                return new C6019e(c11, c6018d, c6018d.getVertical(), c6018d.getComponent(), c6018d.getVersion());
            }
            throw new IllegalArgumentException((c6018d + " config == null").toString());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk20/g;", "it", "Lk20/e;", "Lhi/a;", "a", "(Lk20/g;)Lk20/e;"}, k = 3, mv = {2, 0, 0})
    /* renamed from: d00.d$e */
    /* loaded from: classes3.dex */
    public static final class e<T> implements a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<C7475g, C7473e<C>> f60967a;

        /* JADX WARN: Multi-variable type inference failed */
        public e(Function1<? super C7475g, ? extends C7473e<C>> function1) {
            this.f60967a = function1;
        }

        @Override // d00.C6018d.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7473e<? extends InterfaceC6958a> get(C7475g it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return (C7473e) this.f60967a.invoke(it);
        }
    }

    public C6018d(@NotNull String vertical, @NotNull String component, @NotNull long[] version) {
        Intrinsics.checkNotNullParameter(vertical, "vertical");
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(version, "version");
        this.vertical = vertical;
        this.component = component;
        this.version = version;
        this.f60961e = new ArrayList();
        this.f60962f = new ArrayList();
        this.widget = k.b(new C0937d(this));
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void h() {
    }

    public static /* synthetic */ void k() {
    }

    public final void a(@NotNull final Function1<? super ru.ozon.composer.compose.widget.config.b<S>, Unit> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        this.config = new a() { // from class: d00.a
            @Override // d00.C6018d.a
            public final Object get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ru.ozon.composer.compose.widget.config.b bVar = new ru.ozon.composer.compose.widget.config.b(C6018d.this, it);
                init.invoke(bVar);
                return bVar.b();
            }
        };
    }

    @NotNull
    /* renamed from: b, reason: from getter */
    public final String getComponent() {
        return this.component;
    }

    public final a<InterfaceC7243a<? extends Object>> c() {
        return this.config;
    }

    @NotNull
    /* renamed from: e, reason: from getter */
    public final long[] getVersion() {
        return this.version;
    }

    @NotNull
    /* renamed from: f, reason: from getter */
    public final String getVertical() {
        return this.vertical;
    }

    @NotNull
    public final List<a<InterfaceC8046a<? extends Object, ? extends l20.c>>> g() {
        return this.f60962f;
    }

    @NotNull
    public final i i() {
        return (i) this.widget.getValue();
    }

    @NotNull
    public final List<a<C7473e<? extends InterfaceC6958a>>> j() {
        return this.f60961e;
    }

    public final <I extends l20.c> void l(@NotNull final Function1<? super ru.ozon.composer.compose.widget.overlay.e<S, I>, Unit> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        ArrayList arrayList = this.f60962f;
        final int P11 = C7714v.P(arrayList) + 1;
        arrayList.add(new a() { // from class: d00.b
            @Override // d00.C6018d.a
            public final Object get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ru.ozon.composer.compose.widget.overlay.e eVar = new ru.ozon.composer.compose.widget.overlay.e(P11, this, it);
                init.invoke(eVar);
                return eVar.e();
            }
        });
    }

    public final void m(@NotNull Function1<? super C7475g, ? extends InterfaceC7243a<S>> config) {
        Intrinsics.checkNotNullParameter(config, "config");
        o(new b(config));
    }

    public final <I extends l20.c> void n(@NotNull Function1<? super C7475g, ? extends InterfaceC8046a<S, I>> viewMapper) {
        Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
        g().add(new c(viewMapper));
    }

    public final void o(a<InterfaceC7243a<? extends Object>> aVar) {
        this.config = aVar;
    }

    public final <I extends l20.c> void p(@NotNull final Function1<? super j<S, I>, Unit> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        ArrayList arrayList = this.f60962f;
        final int P11 = C7714v.P(arrayList) + 1;
        arrayList.add(new a() { // from class: d00.c
            @Override // d00.C6018d.a
            public final Object get(C7475g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                j jVar = new j(P11, this, it);
                init.invoke(jVar);
                return jVar.e();
            }
        });
    }

    public final <C extends InterfaceC6958a> void q(@NotNull Function1<? super C7475g, ? extends C7473e<C>> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        j().add(new e(provider));
    }

    @NotNull
    public String toString() {
        String arrays = Arrays.toString(this.version);
        StringBuilder e11 = Pk0.h.e(arrays, "toString(...)");
        e11.append(this.vertical);
        e11.append(".");
        return C3173b.c(e11, this.component, " version(", arrays, ")");
    }
}
