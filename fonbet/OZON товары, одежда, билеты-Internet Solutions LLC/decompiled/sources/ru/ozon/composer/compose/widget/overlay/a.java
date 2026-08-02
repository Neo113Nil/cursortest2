package ru.ozon.composer.compose.widget.overlay;

import S0.InterfaceC3967k;
import a1.C4912a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.Y1;
import d20.AbstractC6065b;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b!\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0010\u0010\u000b\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0010J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0010J\u0015\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0017H'¢\u0006\u0004\b\u0019\u0010\u001aR \u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR,\u0010&\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\"\u0012\u0004\u0012\u00020\u000e0!8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010+\u001a\u00020'8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\u001c\u0010*R\u001c\u00101\u001a\u0004\u0018\u00010,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lru/ozon/composer/compose/widget/overlay/a;", "Ll20/c;", "I", "Ld20/b;", "Ll10/i;", "container", "Lru/ozon/composer/compose/widget/overlay/d;", "layout", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/composer/compose/widget/overlay/e;", "spec", "<init>", "(Ll10/i;Lru/ozon/composer/compose/widget/overlay/d;Landroid/view/ViewGroup;Lru/ozon/composer/compose/widget/overlay/e;)V", "", "onWidgetCreated", "()V", "addView", "removeView", "onWidgetDestroyed", "item", "bind", "(Ll20/c;)V", "Ll20/d;", "info", "a", "(Ll20/c;Ll20/d;LS0/k;I)V", "Lru/ozon/composer/compose/widget/overlay/f;", "c", "Lru/ozon/composer/compose/widget/overlay/f;", "d", "()Lru/ozon/composer/compose/widget/overlay/f;", "widgetSpec", "Lkotlin/Function1;", "Lru/ozon/composer/compose/widget/i;", "Lfd/n;", "b", "()Lfd/n;", "content", "Lru/ozon/composer/compose/widget/b;", "e", "Lru/ozon/composer/compose/widget/b;", "()Lru/ozon/composer/compose/widget/b;", "view", "Landroid/view/View;", "f", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "metricView", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class a<I extends l20.c> extends AbstractC6065b<I> {

    /* renamed from: g, reason: collision with root package name */
    public static final int f94646g = 8;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d f94647a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ViewGroup f94648b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final f<I> widgetSpec;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final InterfaceC6511n<i<I>, InterfaceC3967k, Integer, Unit> content;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final ru.ozon.composer.compose.widget.b view;

    /* renamed from: f, reason: collision with root package name */
    private final ru.ozon.composer.compose.widget.b f94652f;

    /* renamed from: ru.ozon.composer.compose.widget.overlay.a$a, reason: collision with other inner class name */
    static final class C1969a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a<I> f94653b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ I f94654c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1969a(a<I> aVar, I i11) {
            super(2);
            this.f94653b = aVar;
            this.f94654c = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                a<I> aVar = this.f94653b;
                l viewItem = aVar.getViewItem();
                l20.d c11 = viewItem != null ? viewItem.c() : null;
                if (c11 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                aVar.a(this.f94654c, c11, interfaceC3967k2, 0);
            }
            return Unit.f71690a;
        }
    }

    public a(@NotNull l10.i container, @NotNull d layout, @NotNull ViewGroup parent, @NotNull e<?, I> spec) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(spec, "spec");
        this.f94647a = layout;
        this.f94648b = parent;
        f<I> fVar = new f<>();
        spec.q().invoke(fVar);
        this.widgetSpec = fVar;
        InterfaceC6511n<i<I>, InterfaceC3967k, Integer, Unit> b11 = fVar.b();
        if (b11 == null) {
            throw new IllegalArgumentException((this + " content == null").toString());
        }
        this.content = b11;
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ru.ozon.composer.compose.widget.b bVar = new ru.ozon.composer.compose.widget.b(context, null, 0, 6, null);
        bVar.setViewCompositionStrategy(Y1.a.f40785a);
        bVar.setZ(fVar.getZIndex());
        this.view = bVar;
        this.f94652f = bVar;
    }

    @SuppressLint({"ComposableNaming"})
    public abstract void a(@NotNull I i11, @NotNull l20.d dVar, InterfaceC3967k interfaceC3967k, int i12);

    @Override // d20.AbstractC6065b
    public final void addView() {
        super.addView();
        this.f94647a.a(this.f94648b, this.view);
    }

    @NotNull
    public final InterfaceC6511n<i<I>, InterfaceC3967k, Integer, Unit> b() {
        return this.content;
    }

    @Override // d20.AbstractC6065b
    public final void bind(@NotNull I item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.view.b(new C4912a(true, 528222963, new C1969a(this, item)));
    }

    @NotNull
    /* renamed from: c, reason: from getter */
    public final ru.ozon.composer.compose.widget.b getView() {
        return this.view;
    }

    @NotNull
    public final f<I> d() {
        return this.widgetSpec;
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.f94652f;
    }

    @Override // d20.AbstractC6065b
    public final void onWidgetCreated() {
        super.onWidgetCreated();
        this.f94647a.d(this.f94648b, this.view);
    }

    @Override // d20.AbstractC6065b
    public final void onWidgetDestroyed() {
        super.onWidgetDestroyed();
        this.f94647a.e(this.f94648b, this.view);
    }

    @Override // d20.AbstractC6065b
    public final void removeView() {
        super.removeView();
        this.f94647a.f(this.f94648b, this.view);
    }
}
