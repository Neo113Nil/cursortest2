package ru.ozon.composer.compose.widget.scrollable;

import B1.B;
import jk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/composer/compose/widget/scrollable/l;", "", "Lkotlin/Function1;", "Lru/ozon/composer/compose/widget/scrollable/h;", "", "Lru/ozon/composer/compose/widget/scrollable/ScopedOnVisibleAreaChangedCallback;", "callback", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "LB1/B;", "coordinates", "d", "(LB1/B;)V", "Ljk0/q;", "info", "c", "(Ljk0/q;)V", "b", "()V", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    public static final int f94762c = 8;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<h, Unit> f94763a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f94764b;

    static final class a extends AbstractC7737t implements Function0<i> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f94765b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final i invoke() {
            return new i();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(@NotNull Function1<? super h, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f94763a = callback;
        this.f94764b = Sc.k.a(Sc.n.NONE, a.f94765b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    private final i a() {
        return (i) this.f94764b.getValue();
    }

    public final void b() {
        q qVar;
        i a11 = a();
        a11.getClass();
        qVar = f.f94738a;
        a11.d(qVar);
        this.f94763a.invoke(a());
    }

    public final void c(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        i a11 = a();
        a11.getClass();
        Intrinsics.checkNotNullParameter(info, "info");
        a11.d(n.b(info));
        this.f94763a.invoke(a());
    }

    public final void d(@NotNull B coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        a().c(coordinates);
        this.f94763a.invoke(a());
    }
}
