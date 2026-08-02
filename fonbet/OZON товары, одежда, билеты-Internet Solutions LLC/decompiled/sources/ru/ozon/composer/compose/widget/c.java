package ru.ozon.composer.compose.widget;

import A00.a;
import d00.C6018d;
import d00.InterfaceC6021g;
import java.util.HashMap;
import java.util.List;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m20.InterfaceC8046a;
import org.jetbrains.annotations.NotNull;

@InterfaceC6021g
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0001:\u0001!B\u001f\b\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u0001H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJC\u0010\u0017\u001a\u00020\u00162\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00028\u00010\u0013H\u0007¢\u0006\u0004\b\u0017\u0010\u0018JI\u0010\u001a\u001a\u00020\u00162\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u001e\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00190\u0013H\u0007¢\u0006\u0004\b\u001a\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R<\u0010\u0015\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0019\u0018\u00010\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b%\u0010+\"\u0004\b,\u0010-R2\u00103\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b!\u00100\"\u0004\b1\u00102RX\u0010<\u001a:\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b05\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010604j\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b05\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000106`78\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b.\u0010;\u001a\u0004\b)\u0010:R \u0010?\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010=8 X \u0004¢\u0006\u0006\u001a\u0004\b8\u0010>¨\u0006@"}, d2 = {"Lru/ozon/composer/compose/widget/c;", "", "S", "Ll20/c;", "I", "Ld00/d;", "widget", "Lk20/g;", "widgetComponentStorage", "<init>", "(Ld00/d;Lk20/g;)V", "LA00/a$J$a;", "update", "oldItem", "h", "(LA00/a$J$a;Ll20/c;)Ll20/c;", "Lkotlin/Function1;", "", "canMap", "Lkotlin/Function2;", "Ll20/d;", "map", "", "k", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "", "i", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ld00/d;", "f", "()Ld00/d;", "b", "Lk20/g;", "g", "()Lk20/g;", "c", "Lkotlin/jvm/functions/Function2;", "()Lkotlin/jvm/functions/Function2;", "n", "(Lkotlin/jvm/functions/Function2;)V", "d", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "m", "(Lkotlin/jvm/functions/Function1;)V", "canMapFunc", "Ljava/util/HashMap;", "Ljava/lang/Class;", "Lru/ozon/composer/compose/widget/c$a;", "Lkotlin/collections/HashMap;", "e", "Ljava/util/HashMap;", "()Ljava/util/HashMap;", "()V", "updates", "Lm20/a;", "()Lm20/a;", "viewMapper", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class c<S, I extends l20.c> {

    /* renamed from: f, reason: collision with root package name */
    public static final int f94612f = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final C6018d<S> widget;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final C7475g widgetComponentStorage;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Function2<? super S, ? super l20.d, ? extends List<? extends I>> map;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Function1<Object, Boolean> canMapFunc;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final HashMap<Class<? extends a.J.InterfaceC0007a>, a<I>> updates;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bá\u0080\u0001\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0003J!\u0010\u0007\u001a\u0004\u0018\u00018\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0002H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/composer/compose/widget/c$a;", "Ll20/c;", "I", "", "LA00/a$J$a;", "update", "oldItem", "handle", "(LA00/a$J$a;Ll20/c;)Ll20/c;", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface a<I extends l20.c> {
        I handle(@NotNull a.J.InterfaceC0007a update, @NotNull I oldItem);
    }

    static final class b extends AbstractC7737t implements Function2<S, l20.d, List<? extends I>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<S, l20.d, I> f94618b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function2<? super S, ? super l20.d, ? extends I> function2) {
            super(2);
            this.f94618b = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object state, l20.d dVar) {
            l20.d info = dVar;
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(info, "info");
            return C7714v.a0(this.f94618b.invoke(state, info));
        }
    }

    public c(@NotNull C6018d<S> widget, @NotNull C7475g widgetComponentStorage) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(widgetComponentStorage, "widgetComponentStorage");
        this.widget = widget;
        this.widgetComponentStorage = widgetComponentStorage;
        this.updates = new HashMap<>();
    }

    public static /* synthetic */ void d() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void j(c cVar, Function1 function1, Function2 function2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listMapper");
        }
        if ((i11 & 1) != 0) {
            function1 = null;
        }
        cVar.i(function1, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void l(c cVar, Function1 function1, Function2 function2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: mapper");
        }
        if ((i11 & 1) != 0) {
            function1 = null;
        }
        cVar.k(function1, function2);
    }

    public final Function1<Object, Boolean> a() {
        return this.canMapFunc;
    }

    public final Function2<S, l20.d, List<I>> b() {
        return this.map;
    }

    @NotNull
    public final HashMap<Class<? extends a.J.InterfaceC0007a>, a<I>> c() {
        return this.updates;
    }

    @NotNull
    public abstract InterfaceC8046a<S, I> e();

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!getClass().equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.g(other, "null cannot be cast to non-null type ru.ozon.composer.compose.widget.ViewMapperSpec<*, *>");
        c cVar = (c) other;
        return Intrinsics.d(this.widget, cVar.widget) && Intrinsics.d(this.map, cVar.map) && Intrinsics.d(this.canMapFunc, cVar.canMapFunc) && Intrinsics.d(this.updates, cVar.updates);
    }

    @NotNull
    public final C6018d<S> f() {
        return this.widget;
    }

    @NotNull
    /* renamed from: g, reason: from getter */
    public final C7475g getWidgetComponentStorage() {
        return this.widgetComponentStorage;
    }

    public final I h(@NotNull a.J.InterfaceC0007a update, @NotNull I oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        a<I> aVar = this.updates.get(update.getClass());
        return aVar == null ? oldItem : aVar.handle(update, oldItem);
    }

    public int hashCode() {
        int hashCode = this.widget.hashCode() * 31;
        Function2<? super S, ? super l20.d, ? extends List<? extends I>> function2 = this.map;
        int hashCode2 = (hashCode + (function2 != null ? function2.hashCode() : 0)) * 31;
        Function1<Object, Boolean> function1 = this.canMapFunc;
        return this.updates.hashCode() + ((hashCode2 + (function1 != null ? function1.hashCode() : 0)) * 31);
    }

    @d00.h(group = "mapper")
    public final void i(Function1<Object, Boolean> canMap, @NotNull Function2<? super S, ? super l20.d, ? extends List<? extends I>> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.map = map;
        this.canMapFunc = canMap;
    }

    @d00.h(group = "mapper")
    public final void k(Function1<Object, Boolean> canMap, @NotNull Function2<? super S, ? super l20.d, ? extends I> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        i(canMap, new b(map));
    }

    public final void m(Function1<Object, Boolean> function1) {
        this.canMapFunc = function1;
    }

    public final void n(Function2<? super S, ? super l20.d, ? extends List<? extends I>> function2) {
        this.map = function2;
    }
}
