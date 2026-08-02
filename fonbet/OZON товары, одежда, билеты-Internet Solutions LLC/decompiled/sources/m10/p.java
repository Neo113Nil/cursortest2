package m10;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private AbstractC7737t f74058a = c.f74063b;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private AbstractC7737t f74059b = b.f74062b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private AbstractC7737t f74060c = a.f74061b;

    static final class a extends AbstractC7737t implements Function2<ru.ozon.composer.ui.widget.k<l20.c>, ru.ozon.composer.ui.widget.l, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f74061b = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(ru.ozon.composer.ui.widget.k<l20.c> kVar, ru.ozon.composer.ui.widget.l lVar) {
            ru.ozon.composer.ui.widget.l it = lVar;
            Intrinsics.checkNotNullParameter(kVar, "<this>");
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function2<ru.ozon.composer.ui.widget.k<l20.c>, ru.ozon.composer.ui.widget.l, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f74062b = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(ru.ozon.composer.ui.widget.k<l20.c> kVar, ru.ozon.composer.ui.widget.l lVar) {
            ru.ozon.composer.ui.widget.l it = lVar;
            Intrinsics.checkNotNullParameter(kVar, "<this>");
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function2<ru.ozon.composer.ui.widget.k<l20.c>, Long, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f74063b = new c(2);

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(ru.ozon.composer.ui.widget.k<l20.c> kVar, Long l11) {
            l11.longValue();
            Intrinsics.checkNotNullParameter(kVar, "<this>");
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function2<ru.ozon.composer.ui.widget.k<l20.c>, ru.ozon.composer.ui.widget.l, kotlin.Unit>, kotlin.jvm.internal.t] */
    @NotNull
    public final Function2<ru.ozon.composer.ui.widget.k<l20.c>, ru.ozon.composer.ui.widget.l, Unit> a() {
        return this.f74060c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function2<ru.ozon.composer.ui.widget.k<l20.c>, ru.ozon.composer.ui.widget.l, kotlin.Unit>, kotlin.jvm.internal.t] */
    @NotNull
    public final Function2<ru.ozon.composer.ui.widget.k<l20.c>, ru.ozon.composer.ui.widget.l, Unit> b() {
        return this.f74059b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function2<ru.ozon.composer.ui.widget.k<l20.c>, java.lang.Long, kotlin.Unit>, kotlin.jvm.internal.t] */
    @NotNull
    public final Function2<ru.ozon.composer.ui.widget.k<l20.c>, Long, Unit> c() {
        return this.f74058a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(@NotNull Function2<? super ru.ozon.composer.ui.widget.k<l20.c>, ? super ru.ozon.composer.ui.widget.l, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.f74060c = (AbstractC7737t) function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(@NotNull Function2<? super ru.ozon.composer.ui.widget.k<l20.c>, ? super ru.ozon.composer.ui.widget.l, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.f74059b = (AbstractC7737t) function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(@NotNull Function2<? super ru.ozon.composer.ui.widget.k<l20.c>, ? super Long, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.f74058a = (AbstractC7737t) function2;
    }
}
