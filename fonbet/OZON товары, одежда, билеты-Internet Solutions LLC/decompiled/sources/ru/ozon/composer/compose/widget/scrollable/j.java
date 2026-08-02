package ru.ozon.composer.compose.widget.scrollable;

import I0.C3173b;
import Sc.InterfaceC4008j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import d00.C6018d;
import d00.InterfaceC6021g;
import java.util.Arrays;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m20.InterfaceC8046a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.h;

@InterfaceC6021g
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B'\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0012\u001a\u00020\u00102\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00140\u000e¢\u0006\u0004\b\u0018\u0010\u0013J\u0015\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010!\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J#\u0010%\u001a\u00020\u00102\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010#0\u000e¢\u0006\u0004\b%\u0010\u0013J\u0015\u0010(\u001a\u00020\u00102\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J!\u0010*\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0000¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\u001d2\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0006H\u0016¢\u0006\u0004\b/\u00100R6\u00105\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u0010+\"\u0004\b4\u0010\u0013R.\u0010:\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002060\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u00102\u001a\u0004\b8\u0010+\"\u0004\b9\u0010\u0013R$\u0010A\u001a\u0004\u0018\u00010#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R2\u0010E\u001a\u0012\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u00010\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bB\u00102\u001a\u0004\bC\u0010+\"\u0004\bD\u0010\u0013R$\u0010'\u001a\u0004\u0018\u00010&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010)R'\u0010P\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010K8PX\u0090\u0084\u0002¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O¨\u0006Q"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/j;", "", "S", "Ll20/c;", "I", "Lru/ozon/composer/compose/widget/c;", "", "index", "Ld00/d;", "widget", "Lk20/g;", "widgetComponentStorage", "<init>", "(ILd00/d;Lk20/g;)V", "Lkotlin/Function1;", "Lru/ozon/composer/compose/widget/scrollable/k;", "", "spec", "G", "(Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/composer/compose/widget/scrollable/m;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "F", "(Lru/ozon/composer/compose/widget/scrollable/m;)V", "E", "", "tag", "A", "(Ljava/lang/String;)V", "", "hideOnScroll", "LN10/g;", "viewPartListener", "B", "(Ljava/lang/String;ZLN10/g;)V", "LN10/h;", "updater", "D", "Lru/ozon/composer/compose/widget/scrollable/e;", "offsetModifier", "t", "(Lru/ozon/composer/compose/widget/scrollable/e;)V", "u", "()Lkotlin/jvm/functions/Function1;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "g", "Lkotlin/jvm/functions/Function1;", "s", "z", "widgetSpec", "Lru/ozon/composer/ui/widget/h;", "h", "p", "w", "span", "i", "LN10/h;", "q", "()LN10/h;", "x", "(LN10/h;)V", "stickyConfig", "j", "r", "y", "stickyConfigUpdater", "k", "Lru/ozon/composer/compose/widget/scrollable/e;", "o", "()Lru/ozon/composer/compose/widget/scrollable/e;", "v", "Lm20/a;", "l", "LSc/j;", "e", "()Lm20/a;", "viewMapper", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class j<S, I extends l20.c> extends ru.ozon.composer.compose.widget.c<S, I> {

    /* renamed from: m, reason: collision with root package name */
    public static final int f94744m = 8;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Function1<? super k<I>, Unit> widgetSpec;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private Function1<? super I, ? extends ru.ozon.composer.ui.widget.h> span;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private N10.h stickyConfig;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Function1<? super I, N10.h> stickyConfigUpdater;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private e offsetModifier;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewMapper;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ll20/c;", "I", "it", "Lru/ozon/composer/ui/widget/h$f;", "a", "(Ll20/c;)Lru/ozon/composer/ui/widget/h$f;"}, k = 3, mv = {2, 0, 0})
    static final class a extends AbstractC7737t implements Function1<I, h.f> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f94751b = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h.f invoke(I it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return h.f.f94874b;
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003*\u0001\u0004\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "S", "Ll20/c;", "I", "ru/ozon/composer/compose/widget/scrollable/j$b$a", "b", "()Lru/ozon/composer/compose/widget/scrollable/j$b$a;"}, k = 3, mv = {2, 0, 0})
    static final class b extends AbstractC7737t implements Function0<a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j<S, I> f94752b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f94753c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C6018d<S> f94754d;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ru/ozon/composer/compose/widget/scrollable/j$b$a", "Lru/ozon/composer/compose/widget/scrollable/c;", "", "toString", "()Ljava/lang/String;", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends ru.ozon.composer.compose.widget.scrollable.c<S, I> {

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f94755h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ C6018d<S> f94756i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j<S, I> jVar, int i11, C6018d<S> c6018d) {
                super(jVar);
                this.f94755h = i11;
                this.f94756i = c6018d;
            }

            public String toString() {
                int i11 = this.f94755h;
                String vertical = this.f94756i.getVertical();
                String component = this.f94756i.getComponent();
                String arrays = Arrays.toString(this.f94756i.getVersion());
                Intrinsics.checkNotNullExpressionValue(arrays, "toString(...)");
                return C3173b.c(Cm.e.g(i11, "viewMapper(index=", ", vertical=", vertical, ", component="), component, ", versions=", arrays, ")");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j<S, I> jVar, int i11, C6018d<S> c6018d) {
            super(0);
            this.f94752b = jVar;
            this.f94753c = i11;
            this.f94754d = c6018d;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a invoke() {
            return new a(this.f94752b, this.f94753c, this.f94754d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ll20/c;", "I", "it", "Lru/ozon/composer/ui/widget/h;", "a", "(Ll20/c;)Lru/ozon/composer/ui/widget/h;"}, k = 3, mv = {2, 0, 0})
    /* loaded from: classes3.dex */
    static final class c extends AbstractC7737t implements Function1<I, ru.ozon.composer.ui.widget.h> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f94757b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(m mVar) {
            super(1);
            this.f94757b = mVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ru.ozon.composer.ui.widget.h invoke(I it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f94757b.getSpan();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ll20/c;", "I", "it", "Lru/ozon/composer/ui/widget/h;", "a", "(Ll20/c;)Lru/ozon/composer/ui/widget/h;"}, k = 3, mv = {2, 0, 0})
    /* loaded from: classes3.dex */
    static final class d extends AbstractC7737t implements Function1<I, ru.ozon.composer.ui.widget.h> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<I, m> f94758b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function1<? super I, ? extends m> function1) {
            super(1);
            this.f94758b = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ru.ozon.composer.ui.widget.h invoke(I it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f94758b.invoke(it).getSpan();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i11, @NotNull C6018d<S> widget, @NotNull C7475g widgetComponentStorage) {
        super(widget, widgetComponentStorage);
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(widgetComponentStorage, "widgetComponentStorage");
        this.span = a.f94751b;
        this.viewMapper = Sc.k.b(new b(this, i11, widget));
    }

    public static /* synthetic */ void C(j jVar, String str, boolean z11, N10.g gVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            gVar = null;
        }
        jVar.B(str, z11, gVar);
    }

    public final void A(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.stickyConfig = new N10.h(tag, 6);
    }

    public final void B(@NotNull String tag, boolean hideOnScroll, N10.g viewPartListener) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.stickyConfig = new N10.h(tag, hideOnScroll);
    }

    public final void D(@NotNull Function1<? super I, N10.h> updater) {
        Intrinsics.checkNotNullParameter(updater, "updater");
        this.stickyConfigUpdater = updater;
    }

    public final void E(@NotNull Function1<? super I, ? extends m> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.span = new d(value);
    }

    public final void F(@NotNull m value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.span = new c(value);
    }

    @d00.h
    public final void G(@NotNull Function1<? super k<I>, Unit> spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        this.widgetSpec = spec;
    }

    @Override // ru.ozon.composer.compose.widget.c
    @NotNull
    public InterfaceC8046a<S, I> e() {
        return (InterfaceC8046a) this.viewMapper.getValue();
    }

    @Override // ru.ozon.composer.compose.widget.c
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!j.class.equals(other != null ? other.getClass() : null) || !super.equals(other)) {
            return false;
        }
        Intrinsics.g(other, "null cannot be cast to non-null type ru.ozon.composer.compose.widget.scrollable.ScrollableViewMapperSpec<*, *>");
        j jVar = (j) other;
        return Intrinsics.d(this.widgetSpec, jVar.widgetSpec) && Intrinsics.d(this.span, jVar.span) && Intrinsics.d(this.stickyConfig, jVar.stickyConfig) && Intrinsics.d(this.offsetModifier, jVar.offsetModifier);
    }

    @Override // ru.ozon.composer.compose.widget.c
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        Function1<? super k<I>, Unit> function1 = this.widgetSpec;
        int hashCode2 = (this.span.hashCode() + ((hashCode + (function1 != null ? function1.hashCode() : 0)) * 31)) * 31;
        N10.h hVar = this.stickyConfig;
        int hashCode3 = (hashCode2 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        e eVar = this.offsetModifier;
        return hashCode3 + (eVar != null ? eVar.hashCode() : 0);
    }

    /* renamed from: o, reason: from getter */
    public final e getOffsetModifier() {
        return this.offsetModifier;
    }

    @NotNull
    public final Function1<I, ru.ozon.composer.ui.widget.h> p() {
        return this.span;
    }

    /* renamed from: q, reason: from getter */
    public final N10.h getStickyConfig() {
        return this.stickyConfig;
    }

    public final Function1<I, N10.h> r() {
        return this.stickyConfigUpdater;
    }

    public final Function1<k<I>, Unit> s() {
        return this.widgetSpec;
    }

    public final void t(@NotNull e offsetModifier) {
        Intrinsics.checkNotNullParameter(offsetModifier, "offsetModifier");
        this.offsetModifier = offsetModifier;
    }

    @NotNull
    public final Function1<k<I>, Unit> u() {
        Function1<? super k<I>, Unit> function1 = this.widgetSpec;
        if (function1 != null) {
            return function1;
        }
        throw new IllegalArgumentException((f() + " widgetSpec is null").toString());
    }

    public final void v(e eVar) {
        this.offsetModifier = eVar;
    }

    public final void w(@NotNull Function1<? super I, ? extends ru.ozon.composer.ui.widget.h> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.span = function1;
    }

    public final void x(N10.h hVar) {
        this.stickyConfig = hVar;
    }

    public final void y(Function1<? super I, N10.h> function1) {
        this.stickyConfigUpdater = function1;
    }

    public final void z(Function1<? super k<I>, Unit> function1) {
        this.widgetSpec = function1;
    }
}
