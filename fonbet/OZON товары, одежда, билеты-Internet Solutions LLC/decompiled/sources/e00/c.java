package e00;

import S0.InterfaceC3967k;
import S0.M;
import S0.N;
import S0.Q;
import android.annotation.SuppressLint;
import androidx.lifecycle.J;
import e3.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\"\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Le00/c;", "", "Ll10/i;", "container", "Lb20/a;", "Ll20/c;", "holder", "Lru/ozon/composer/ui/widget/l;", "viewItem", "<init>", "(Ll10/i;Lru/ozon/composer/ui/widget/k;Lru/ozon/composer/ui/widget/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "d", "(LS0/k;I)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ll10/i;", "()Ll10/i;", "b", "Lru/ozon/composer/ui/widget/k;", "()Lru/ozon/composer/ui/widget/k;", "c", "Lru/ozon/composer/ui/widget/l;", "()Lru/ozon/composer/ui/widget/l;", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final int f61736e = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final i container;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final k holder;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final l viewItem;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ru.ozon.composer.compose.widget.scrollable.b<? super l20.c> f61740d;

    static final class a extends AbstractC7737t implements Function1<N, M> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ J f61741b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f61742c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(J j11, c cVar) {
            super(1);
            this.f61741b = j11;
            this.f61742c = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final M invoke(N n11) {
            N DisposableEffect = n11;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            C6247a c6247a = new C6247a(this.f61742c, 0);
            J j11 = this.f61741b;
            j11.getLifecycle().a(c6247a);
            return new C6248b(j11, c6247a);
        }
    }

    public c(i container, k holder, l viewItem, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(viewItem, "viewItem");
        this.container = container;
        this.holder = holder;
        this.viewItem = viewItem;
        Intrinsics.g(holder, "null cannot be cast to non-null type ru.ozon.composer.compose.widget.scrollable.ComposeWidgetViewHolder<in ru.ozon.composer.widget.item.ViewItem>");
        this.f61740d = (ru.ozon.composer.compose.widget.scrollable.b) holder;
    }

    @NotNull
    /* renamed from: a, reason: from getter */
    public final i getContainer() {
        return this.container;
    }

    @NotNull
    /* renamed from: b, reason: from getter */
    public final k getHolder() {
        return this.holder;
    }

    @NotNull
    /* renamed from: c, reason: from getter */
    public final l getViewItem() {
        return this.viewItem;
    }

    @SuppressLint({"ComposableNaming"})
    public final void d(InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(1604096518);
        J j11 = (J) interfaceC3967k.m(r.a());
        interfaceC3967k.o(-277828893);
        boolean F11 = ((((i11 & 14) ^ 6) > 4 && interfaceC3967k.n(this)) || (i11 & 6) == 4) | interfaceC3967k.F(j11);
        Object C11 = interfaceC3967k.C();
        if (F11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new a(j11, this);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        Q.c(j11, (Function1) C11, interfaceC3967k);
        f viewedPond = this.container.c0();
        l widgetViewItem = this.viewItem;
        Intrinsics.checkNotNullParameter(widgetViewItem, "widgetViewItem");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        l20.c d11 = widgetViewItem.d();
        Intrinsics.g(d11, "null cannot be cast to non-null type I of ru.ozon.composer.ui.widget.nested.PlaceholderWidgetViewHolder");
        this.holder.bindData$composer_recycler_ui_release(widgetViewItem, d11, viewedPond);
        this.f61740d.f(widgetViewItem.d(), widgetViewItem.c(), interfaceC3967k, 0);
        interfaceC3967k.k();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!c.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.g(other, "null cannot be cast to non-null type ru.ozon.composer.compose.widget.nested.PlaceholderWidget");
        c cVar = (c) other;
        return Intrinsics.d(this.container, cVar.container) && Intrinsics.d(this.holder, cVar.holder) && Intrinsics.d(this.viewItem, cVar.viewItem);
    }

    public int hashCode() {
        return this.viewItem.hashCode() + ((this.holder.hashCode() + (this.container.hashCode() * 31)) * 31);
    }
}
