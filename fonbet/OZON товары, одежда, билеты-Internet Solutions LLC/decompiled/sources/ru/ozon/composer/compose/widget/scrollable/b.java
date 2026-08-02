package ru.ozon.composer.compose.widget.scrollable;

import S0.InterfaceC3967k;
import Sc.InterfaceC4008j;
import a1.C4912a;
import android.annotation.SuppressLint;
import android.view.View;
import fd.InterfaceC6512o;
import jk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.compose.widget.g;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0010\u0010\t\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR$\u0010\t\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R2\u0010,\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u000f0%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u00102\u001a\b\u0012\u0004\u0012\u00020.0-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010/\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/b;", "Ll20/c;", "I", "Lru/ozon/composer/ui/widget/k;", "Landroid/view/View;", "view", "Ll10/i;", "container", "Lru/ozon/composer/compose/widget/scrollable/j;", "spec", "<init>", "(Landroid/view/View;Ll10/i;Lru/ozon/composer/compose/widget/scrollable/j;)V", "item", "Ll20/d;", "info", "", "bind", "(Ll20/c;Ll20/d;)V", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "f", "(Ll20/c;Ll20/d;LS0/k;I)V", "a", "Ll10/i;", "g", "()Ll10/i;", "b", "Lru/ozon/composer/compose/widget/scrollable/j;", "i", "()Lru/ozon/composer/compose/widget/scrollable/j;", "Lru/ozon/composer/compose/widget/scrollable/k;", "d", "Lru/ozon/composer/compose/widget/scrollable/k;", "k", "()Lru/ozon/composer/compose/widget/scrollable/k;", "widgetSpec", "Lkotlin/Function2;", "Lru/ozon/composer/compose/widget/i;", "Lru/ozon/composer/compose/widget/g$a;", "e", "Lfd/o;", "h", "()Lfd/o;", "content", "LSc/j;", "Lru/ozon/composer/compose/widget/scrollable/o;", "LSc/j;", "j", "()LSc/j;", "visibleAreaChangedCallbacksLazy", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class b<I extends l20.c> extends ru.ozon.composer.ui.widget.k<I> {

    /* renamed from: g, reason: collision with root package name */
    public static final int f94707g = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final l10.i container;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final j<?, I> spec;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.composer.compose.widget.b f94710c;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final k<I> widgetSpec;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final InterfaceC6512o<ru.ozon.composer.compose.widget.i<I>, g.a, InterfaceC3967k, Integer, Unit> content;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final InterfaceC4008j<o> visibleAreaChangedCallbacksLazy;

    static final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b<I> f94714b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ I f94715c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ l20.d f94716d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b<I> bVar, I i11, l20.d dVar) {
            super(2);
            this.f94714b = bVar;
            this.f94715c = i11;
            this.f94716d = dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                this.f94714b.f(this.f94715c, this.f94716d, interfaceC3967k2, 0);
            }
            return Unit.f71690a;
        }
    }

    /* renamed from: ru.ozon.composer.compose.widget.scrollable.b$b, reason: collision with other inner class name */
    static final class C1973b extends AbstractC7737t implements Function0<o> {

        /* renamed from: b, reason: collision with root package name */
        public static final C1973b f94717b = new C1973b(0);

        @Override // kotlin.jvm.functions.Function0
        public final o invoke() {
            return new o();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull View view, @NotNull l10.i container, @NotNull j<?, I> spec) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(spec, "spec");
        this.container = container;
        this.spec = spec;
        View view2 = this.itemView;
        Intrinsics.g(view2, "null cannot be cast to non-null type ru.ozon.composer.compose.widget.ComposerComposeView");
        this.f94710c = (ru.ozon.composer.compose.widget.b) view2;
        k<I> kVar = new k<>();
        spec.u().invoke(kVar);
        this.widgetSpec = kVar;
        InterfaceC6512o<ru.ozon.composer.compose.widget.i<I>, g.a, InterfaceC3967k, Integer, Unit> b11 = kVar.b();
        if (b11 != null) {
            this.content = b11;
            this.visibleAreaChangedCallbacksLazy = Sc.k.b(C1973b.f94717b);
            view.setZ(kVar.getZIndex());
        } else {
            throw new IllegalArgumentException((this + " content == null").toString());
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected final void bind(@NotNull I item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.f94710c.b(new C4912a(true, -805185688, new a(this, item, info)));
    }

    @SuppressLint({"ComposableNaming"})
    public abstract void f(@NotNull I i11, @NotNull l20.d dVar, InterfaceC3967k interfaceC3967k, int i12);

    @NotNull
    /* renamed from: g, reason: from getter */
    public final l10.i getContainer() {
        return this.container;
    }

    @NotNull
    public final InterfaceC6512o<ru.ozon.composer.compose.widget.i<I>, g.a, InterfaceC3967k, Integer, Unit> h() {
        return this.content;
    }

    @NotNull
    public final j<?, I> i() {
        return this.spec;
    }

    @NotNull
    public final InterfaceC4008j<o> j() {
        return this.visibleAreaChangedCallbacksLazy;
    }

    @NotNull
    public final k<I> k() {
        return this.widgetSpec;
    }

    @Override // jk0.j, jk0.n
    public final void onVisibleAreaChanged(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        InterfaceC4008j<o> interfaceC4008j = this.visibleAreaChangedCallbacksLazy;
        if (interfaceC4008j.isInitialized()) {
            interfaceC4008j.getValue().b(info);
        }
    }
}
