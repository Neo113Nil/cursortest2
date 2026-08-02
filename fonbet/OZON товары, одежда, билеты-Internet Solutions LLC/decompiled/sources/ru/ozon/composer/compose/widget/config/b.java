package ru.ozon.composer.compose.widget.config;

import Sc.InterfaceC4008j;
import Sc.k;
import d00.C6018d;
import d00.InterfaceC6021g;
import d00.h;
import j20.C7244b;
import j20.InterfaceC7243a;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC6021g
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u001f\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ=\u0010\u000f\u001a\u00020\u000e2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010JC\u0010\u0012\u001a\u00020\u000e2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00110\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0010J\u001f\u0010\u0017\u001a\u00020\u000e2\u0010\u0010\u0016\u001a\f\u0012\u0004\u0012\u00020\u00140\u0013j\u0002`\u0015¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\u000e2\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0019\"\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R2\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,\"\u0004\b-\u0010.R0\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u0010+\u001a\u0004\b\"\u0010,\"\u0004\b0\u0010.R,\u0010\u0016\u001a\f\u0012\u0004\u0012\u00020\u00140\u0013j\u0002`\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u00101\u001a\u0004\b/\u00102\"\u0004\b3\u0010\u0018R#\u00107\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u0001048@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b(\u00105\u001a\u0004\b&\u00106¨\u00068"}, d2 = {"Lru/ozon/composer/compose/widget/config/b;", "", "S", "Ld00/d;", "widget", "Lk20/g;", "widgetComponentStorage", "<init>", "(Ld00/d;Lk20/g;)V", "Lkotlin/Function1;", "Lj20/b;", "", "canParse", "parser", "", "i", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "g", "", "", "Lru/ozon/composer/compose/widget/WidgetPlaceholder;", "placeholders", "k", "(Ljava/util/Set;)V", "", "l", "([Ljava/lang/String;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ld00/d;", "e", "()Ld00/d;", "b", "Lk20/g;", "f", "()Lk20/g;", "c", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "n", "(Lkotlin/jvm/functions/Function1;)V", "d", "m", "Ljava/util/Set;", "()Ljava/util/Set;", "o", "Lj20/a;", "LSc/j;", "()Lj20/a;", "config", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b<S> {

    /* renamed from: g, reason: collision with root package name */
    public static final int f94624g = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final C6018d<S> widget;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final C7475g widgetComponentStorage;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Function1<? super C7244b, ? extends Object> parser;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Function1<? super C7244b, Boolean> canParse;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private Set<String> placeholders;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final InterfaceC4008j config;

    @Metadata(d1 = {"\u0000\r\n\u0002\u0010\u0000\n\u0000\n\u0002\b\u0003*\u0001\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "S", "ru/ozon/composer/compose/widget/config/b$a$a", "b", "()Lru/ozon/composer/compose/widget/config/b$a$a;"}, k = 3, mv = {2, 0, 0})
    static final class a extends AbstractC7737t implements Function0<C1968a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b<S> f94631b;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"ru/ozon/composer/compose/widget/config/b$a$a", "Lru/ozon/composer/compose/widget/config/a;", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.composer.compose.widget.config.b$a$a, reason: collision with other inner class name */
        public static final class C1968a extends ru.ozon.composer.compose.widget.config.a<S> {
            C1968a(b<S> bVar) {
                super(bVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b<S> bVar) {
            super(0);
            this.f94631b = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1968a invoke() {
            return new C1968a(this.f94631b);
        }
    }

    public b(@NotNull C6018d<S> widget, @NotNull C7475g widgetComponentStorage) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(widgetComponentStorage, "widgetComponentStorage");
        this.widget = widget;
        this.widgetComponentStorage = widgetComponentStorage;
        this.placeholders = M.f71699a;
        this.config = k.b(new a(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void h(b bVar, Function1 function1, Function1 function12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            function1 = null;
        }
        bVar.g(function1, function12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void j(b bVar, Function1 function1, Function1 function12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            function1 = null;
        }
        bVar.i(function1, function12);
    }

    public final Function1<C7244b, Boolean> a() {
        return this.canParse;
    }

    @NotNull
    public final InterfaceC7243a<? extends Object> b() {
        return (InterfaceC7243a) this.config.getValue();
    }

    public final Function1<C7244b, Object> c() {
        return this.parser;
    }

    @NotNull
    public final Set<String> d() {
        return this.placeholders;
    }

    @NotNull
    public final C6018d<S> e() {
        return this.widget;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return Intrinsics.d(this.widget, bVar.widget) && Intrinsics.d(this.parser, bVar.parser) && Intrinsics.d(this.canParse, bVar.canParse) && Intrinsics.d(this.placeholders, bVar.placeholders);
    }

    @NotNull
    /* renamed from: f, reason: from getter */
    public final C7475g getWidgetComponentStorage() {
        return this.widgetComponentStorage;
    }

    @h(group = "parser")
    public final void g(Function1<? super C7244b, Boolean> canParse, @NotNull Function1<? super C7244b, ? extends List<? extends S>> parser) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.parser = parser;
        this.canParse = canParse;
    }

    public int hashCode() {
        int hashCode = this.widget.hashCode() * 31;
        Function1<? super C7244b, ? extends Object> function1 = this.parser;
        int hashCode2 = (hashCode + (function1 != null ? function1.hashCode() : 0)) * 31;
        Function1<? super C7244b, Boolean> function12 = this.canParse;
        return this.placeholders.hashCode() + ((hashCode2 + (function12 != null ? function12.hashCode() : 0)) * 31);
    }

    @h(group = "parser")
    public final void i(Function1<? super C7244b, Boolean> canParse, @NotNull Function1<? super C7244b, ? extends S> parser) {
        Intrinsics.checkNotNullParameter(parser, "parser");
        this.parser = parser;
        this.canParse = canParse;
    }

    public final void k(@NotNull Set<String> placeholders) {
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        this.placeholders = placeholders;
    }

    public final void l(@NotNull String... placeholders) {
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        this.placeholders = ru.ozon.composer.compose.widget.h.a((String[]) Arrays.copyOf(placeholders, placeholders.length));
    }

    public final void m(Function1<? super C7244b, Boolean> function1) {
        this.canParse = function1;
    }

    public final void n(Function1<? super C7244b, ? extends Object> function1) {
        this.parser = function1;
    }

    public final void o(@NotNull Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.placeholders = set;
    }
}
