package ru.ozon.composer.compose.widget.overlay;

import A00.a;
import N3.C3660k;
import S0.C3996z;
import S0.H0;
import S0.InterfaceC3967k;
import android.annotation.SuppressLint;
import android.view.ViewGroup;
import c00.InterfaceC5696a;
import c20.r;
import d20.AbstractC6065b;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.l;

@InterfaceC5696a
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b!\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00028\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u0012J\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R,\u0010'\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001c\u00100\u001a\n\u0012\u0006\b\u0001\u0012\u00020-0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0017\u00106\u001a\u0002018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R%\u0010<\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u0013070\r8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Lru/ozon/composer/compose/widget/overlay/c;", "", "S", "Ll20/c;", "I", "Lc20/r;", "Lru/ozon/composer/compose/widget/overlay/e;", "spec", "<init>", "(Lru/ozon/composer/compose/widget/overlay/e;)V", "state", "Ll20/d;", "info", "", "map", "(Ljava/lang/Object;Ll20/d;)Ljava/util/List;", "", "canMap", "(Ljava/lang/Object;)Z", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Ll20/c;)Ll20/c;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "other", "equals", "", "hashCode", "()I", "a", "Lru/ozon/composer/compose/widget/overlay/e;", "Lkotlin/Function2;", "b", "Lkotlin/jvm/functions/Function2;", "mapper", "Lru/ozon/composer/compose/widget/overlay/d;", "c", "Lru/ozon/composer/compose/widget/overlay/d;", "layout", "", "Lru/ozon/composer/compose/widget/e;", "d", "[Lru/ozon/composer/compose/widget/e;", "compositionProviders", "Lc20/r$a;", "e", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "viewType", "Ljava/lang/Class;", "f", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "supportedUpdates", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class c<S, I extends l20.c> extends r<S, I> {

    /* renamed from: g, reason: collision with root package name */
    public static final int f94659g = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final e<S, I> spec;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final Function2<S, l20.d, List<I>> mapper;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final d layout;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final ru.ozon.composer.compose.widget.e[] compositionProviders;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final r.a viewType;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"ru/ozon/composer/compose/widget/overlay/c$a", "Lru/ozon/composer/compose/widget/overlay/a;", "item", "Ll20/d;", "info", "", "a", "(Ll20/c;Ll20/d;LS0/k;I)V", "", "toString", "()Ljava/lang/String;", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ru.ozon.composer.compose.widget.overlay.a<I> {

        /* renamed from: h, reason: collision with root package name */
        private final H0<?>[] f94666h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ i f94667i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ c<S, I> f94668j;

        /* renamed from: ru.ozon.composer.compose.widget.overlay.c$a$a, reason: collision with other inner class name */
        static final class C1970a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f94669b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f94670c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ i f94671d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ I f94672e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1970a(i iVar, l20.c cVar, a aVar, l lVar) {
                super(2);
                this.f94669b = lVar;
                this.f94670c = aVar;
                this.f94671d = iVar;
                this.f94672e = cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
                InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
                if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                    interfaceC3967k2.j();
                } else {
                    a aVar = this.f94670c;
                    i iVar = this.f94671d;
                    l lVar = this.f94669b;
                    b00.e.a(lVar, a1.c.c(-1495388342, new b(iVar, this.f94672e, aVar, lVar), interfaceC3967k2), interfaceC3967k2, 48);
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i iVar, c<S, I> cVar, ViewGroup viewGroup, d dVar, e<S, I> eVar) {
            super(iVar, dVar, viewGroup, eVar);
            this.f94667i = iVar;
            this.f94668j = cVar;
            this.f94666h = ru.ozon.composer.compose.widget.f.c(this, iVar, ((c) cVar).compositionProviders.length);
        }

        @Override // ru.ozon.composer.compose.widget.overlay.a
        @SuppressLint({"ComposableNaming"})
        public void a(I item, l20.d info, InterfaceC3967k interfaceC3967k, int i11) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(info, "info");
            interfaceC3967k.o(-1102457345);
            l viewItem = getViewItem();
            if (viewItem == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            H0<?>[] a11 = ru.ozon.composer.compose.widget.f.a(this.f94666h, ((c) this.f94668j).compositionProviders, viewItem);
            C3996z.b((H0[]) Arrays.copyOf(a11, a11.length), a1.c.c(-1515722049, new C1970a(this.f94667i, item, this, viewItem), interfaceC3967k), interfaceC3967k, 56);
            interfaceC3967k.k();
        }

        public String toString() {
            c<S, I> cVar = this.f94668j;
            String vertical = ((c) cVar).spec.f().getVertical();
            String component = ((c) cVar).spec.f().getComponent();
            d dVar = ((c) cVar).layout;
            StringBuilder d11 = C3660k.d("ComposeOverlayWidgetHolder(vertical=", vertical, ", component=", component, ", layout=");
            d11.append(dVar);
            d11.append(")");
            return d11.toString();
        }
    }

    public c(@NotNull e<S, I> spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        this.spec = spec;
        Function2<S, l20.d, List<I>> b11 = spec.b();
        if (b11 == null) {
            throw new IllegalArgumentException((spec.f() + " mapper == null").toString());
        }
        this.mapper = b11;
        d layout = spec.getLayout();
        this.layout = layout;
        this.compositionProviders = b00.d.f45587a.e();
        this.viewType = layout.getViewType();
        Set<Class<? extends a.J.InterfaceC0007a>> keySet = spec.c().keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "<get-keys>(...)");
        this.supportedUpdates = C7714v.U0(keySet);
        if (spec.p() != null) {
            return;
        }
        throw new IllegalStateException((spec.f() + " widgetSpec is null").toString());
    }

    @Override // c20.r, m20.InterfaceC8046a
    public final boolean canMap(Object state) {
        Function1<Object, Boolean> a11 = this.spec.a();
        return a11 != null ? a11.invoke(state).booleanValue() : super.canMap(state);
    }

    @Override // c20.r
    @NotNull
    public final AbstractC6065b<I> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        if (!(container.Q().f() instanceof b00.b)) {
            throw new IllegalStateException(container.Q().f().getClass().getSimpleName().concat(" must implements `ComposerComposeScreen`").toString());
        }
        ViewGroup b11 = this.layout.b(container);
        if (b11 != null) {
            return new a(container, this, b11, this.layout, this.spec);
        }
        AbstractC6065b.INSTANCE.getClass();
        return AbstractC6065b.Companion.a();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof c) && Intrinsics.d(this.spec, ((c) other).spec);
    }

    @Override // c20.r, I00.d
    @NotNull
    public final List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public final r.a getViewType() {
        return this.viewType;
    }

    @Override // c20.r, I00.d
    public final I handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull I oldItem) {
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
}
