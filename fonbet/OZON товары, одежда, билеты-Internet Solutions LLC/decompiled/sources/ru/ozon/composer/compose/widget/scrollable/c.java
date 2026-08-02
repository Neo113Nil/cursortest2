package ru.ozon.composer.compose.widget.scrollable;

import A00.a;
import N3.C3660k;
import S0.C3996z;
import S0.G0;
import S0.H0;
import S0.InterfaceC3967k;
import S0.InterfaceC3994y;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.Y1;
import androidx.recyclerview.widget.RecyclerView;
import c00.InterfaceC5696a;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.S;
import l20.c;
import org.jetbrains.annotations.NotNull;

@InterfaceC5696a
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b!\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001d\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b!\u0010\"J#\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00010%2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b&\u0010'J\u0015\u0010*\u001a\u00020#2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u001b\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\r2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u0004\u0018\u0001012\u0006\u0010\u001f\u001a\u00028\u0001¢\u0006\u0004\b2\u00103J\u001a\u00105\u001a\u00020\u00102\b\u00104\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b5\u0010\u0012J\u000f\u00107\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R,\u0010=\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010<R\u001c\u0010B\u001a\n\u0012\u0006\b\u0001\u0012\u00020?0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020C0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER%\u0010K\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001a0G0\r8\u0006¢\u0006\f\n\u0004\bH\u0010E\u001a\u0004\bI\u0010JR\u0019\u0010O\u001a\u0004\u0018\u0001018\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\b2\u0010N¨\u0006P"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/c;", "", "S", "Ll20/c;", "I", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/composer/compose/widget/scrollable/j;", "spec", "<init>", "(Lru/ozon/composer/compose/widget/scrollable/j;)V", "state", "Ll20/d;", "info", "", "map", "(Ljava/lang/Object;Ll20/d;)Ljava/util/List;", "", "canMap", "(Ljava/lang/Object;)Z", "Ll10/i;", "container", "Lru/ozon/composer/ui/widget/l;", "viewItem", "", "constructLayout", "(Ll10/i;Lru/ozon/composer/ui/widget/l;)V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Ll20/c;)Ll20/c;", "item", "Lru/ozon/composer/ui/widget/h;", "getWidgetSpan", "(Ljava/lang/Object;Ll20/c;)Lru/ozon/composer/ui/widget/h;", "Landroid/view/View;", "view", "Lru/ozon/composer/compose/widget/scrollable/b;", "b", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/compose/widget/scrollable/b;", "Landroid/view/ViewGroup;", "parent", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/content/Context;", "context", "Landroidx/recyclerview/widget/RecyclerView$n;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "LN10/h;", "getStickyWidgetConfig", "(Ll20/c;)LN10/h;", "other", "equals", "", "hashCode", "()I", "a", "Lru/ozon/composer/compose/widget/scrollable/j;", "Lkotlin/Function2;", "Lkotlin/jvm/functions/Function2;", "mapper", "", "Lru/ozon/composer/compose/widget/e;", "c", "[Lru/ozon/composer/compose/widget/e;", "compositionProviders", "Lru/ozon/composer/compose/widget/scrollable/a;", "d", "Ljava/util/List;", "decorator", "Ljava/lang/Class;", "e", "getSupportedUpdates", "()Ljava/util/List;", "supportedUpdates", "f", "LN10/h;", "()LN10/h;", "stickyWidgetConfig", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class c<S, I extends l20.c> extends ru.ozon.composer.ui.widget.g<S, I> {

    /* renamed from: g, reason: collision with root package name */
    public static final int f94718g = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final j<S, I> spec;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final Function2<S, l20.d, List<I>> mapper;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final ru.ozon.composer.compose.widget.e[] compositionProviders;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final List<ru.ozon.composer.compose.widget.scrollable.a> decorator;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final N10.h stickyWidgetConfig;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"ru/ozon/composer/compose/widget/scrollable/c$a", "Lru/ozon/composer/compose/widget/scrollable/b;", "item", "Ll20/d;", "info", "", "f", "(Ll20/c;Ll20/d;LS0/k;I)V", "", "toString", "()Ljava/lang/String;", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends ru.ozon.composer.compose.widget.scrollable.b<I> {

        /* renamed from: h, reason: collision with root package name */
        private final H0<?>[] f94725h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ l10.i f94726i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ c<S, I> f94727j;

        /* renamed from: ru.ozon.composer.compose.widget.scrollable.c$a$a, reason: collision with other inner class name */
        static final class C1974a extends AbstractC7737t implements Function1<InterfaceC3994y, o> {
            C1974a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final o invoke(InterfaceC3994y interfaceC3994y) {
                InterfaceC3994y providesComputed = interfaceC3994y;
                Intrinsics.checkNotNullParameter(providesComputed, "$this$providesComputed");
                return a.this.j().getValue();
            }
        }

        static final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ru.ozon.composer.ui.widget.l f94730c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ l10.i f94731d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ I f94732e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(ru.ozon.composer.ui.widget.l lVar, l10.i iVar, I i11) {
                super(2);
                this.f94730c = lVar;
                this.f94731d = iVar;
                this.f94732e = i11;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
                if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                    interfaceC3967k2.j();
                } else {
                    a aVar = a.this;
                    int adapterPosition = aVar.getAdapterPosition();
                    ru.ozon.composer.ui.widget.l lVar = this.f94730c;
                    b00.e.a(lVar, a1.c.c(-154621345, new d(aVar, this.f94731d, lVar, this.f94732e, adapterPosition), interfaceC3967k2), interfaceC3967k2, 48);
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l10.i iVar, c<S, I> cVar, View view, j<S, I> jVar) {
            super(view, iVar, jVar);
            this.f94726i = iVar;
            this.f94727j = cVar;
            this.f94725h = ru.ozon.composer.compose.widget.f.c(this, iVar, ((c) cVar).compositionProviders.length);
        }

        @Override // ru.ozon.composer.compose.widget.scrollable.b
        public void f(I item, l20.d info, InterfaceC3967k interfaceC3967k, int i11) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(info, "info");
            interfaceC3967k.o(-1763149228);
            ru.ozon.composer.ui.widget.l viewItem = getViewItem();
            if (viewItem == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            S s11 = new S(2);
            s11.b(ru.ozon.composer.compose.widget.f.a(this.f94725h, ((c) this.f94727j).compositionProviders, viewItem));
            G0<o> a11 = p.a();
            interfaceC3967k.o(-865450621);
            boolean F11 = interfaceC3967k.F(this);
            Object C11 = interfaceC3967k.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new C1974a();
                interfaceC3967k.x(C11);
            }
            interfaceC3967k.k();
            a11.getClass();
            s11.a(new H0(a11, null, false, null, (Function1) C11, false));
            C3996z.b((H0[]) s11.d(new H0[s11.c()]), a1.c.c(1682226964, new b(viewItem, this.f94726i, item), interfaceC3967k), interfaceC3967k, 56);
            interfaceC3967k.k();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.C
        public String toString() {
            String c11 = super.toString();
            String vertical = i().f().getVertical();
            String component = i().f().getComponent();
            StringBuilder d11 = C3660k.d("ComposeWidget", c11, "; vertical", vertical, "; component=");
            d11.append(component);
            return d11.toString();
        }
    }

    public c(@NotNull j<S, I> spec) {
        List<ru.ozon.composer.compose.widget.scrollable.a> a02;
        Intrinsics.checkNotNullParameter(spec, "spec");
        this.spec = spec;
        Function2<S, l20.d, List<I>> b11 = spec.b();
        if (b11 == null) {
            throw new IllegalArgumentException((spec.f() + " mapper == null").toString());
        }
        this.mapper = b11;
        this.compositionProviders = b00.d.f45587a.e();
        e offsetModifier = spec.getOffsetModifier();
        this.decorator = (offsetModifier == null || (a02 = C7714v.a0(new ru.ozon.composer.compose.widget.scrollable.a(spec, offsetModifier))) == null) ? K.f71697a : a02;
        Set<Class<? extends a.J.InterfaceC0007a>> keySet = spec.c().keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "<get-keys>(...)");
        this.supportedUpdates = C7714v.U0(keySet);
        this.stickyWidgetConfig = spec.getStickyConfig();
        if (spec.s() != null) {
            return;
        }
        throw new IllegalStateException((spec.f() + " widgetSpec is null").toString());
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final b<I> createHolder2(@NotNull l10.i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return new a(container, this, view, this.spec);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public final boolean canMap(Object state) {
        Function1<Object, Boolean> a11 = this.spec.a();
        return a11 != null ? a11.invoke(state).booleanValue() : super.canMap(state);
    }

    @Override // ru.ozon.composer.ui.widget.g
    public void constructLayout(@NotNull l10.i container, @NotNull ru.ozon.composer.ui.widget.l viewItem) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewItem, "viewItem");
        if (!(container.Q().f() instanceof b00.b)) {
            throw new IllegalStateException(container.Q().f().getClass().getSimpleName().concat(" must implements `ComposerComposeScreen`").toString());
        }
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public final View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ru.ozon.composer.compose.widget.b bVar = new ru.ozon.composer.compose.widget.b(context, null, 0, 6, null);
        bVar.setViewCompositionStrategy(Y1.a.f40785a);
        return bVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof c) && Intrinsics.d(this.spec, ((c) other).spec);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public final List<RecyclerView.n> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.decorator;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public final N10.h getStickyWidgetConfig() {
        return this.stickyWidgetConfig;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public final List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.composer.ui.widget.g, ru.ozon.composer.ui.widget.e
    @NotNull
    public ru.ozon.composer.ui.widget.h getWidgetSpan(@NotNull S state, @NotNull I item) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(item, "item");
        return this.spec.p().invoke(item);
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    public I handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull I oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return this.spec.h(update, oldItem);
    }

    public int hashCode() {
        return this.spec.hashCode();
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public final List<I> map(@NotNull S state, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.mapper.invoke(state, info);
    }

    @Override // ru.ozon.composer.ui.widget.g
    public final N10.h getStickyWidgetConfig(@NotNull I item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Function1<I, N10.h> r11 = this.spec.r();
        return r11 != null ? r11.invoke(item) : super.getStickyWidgetConfig(item);
    }
}
