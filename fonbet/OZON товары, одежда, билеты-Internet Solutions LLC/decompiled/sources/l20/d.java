package l20;

import T00.m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final m f72574a;

    /* renamed from: b, reason: collision with root package name */
    private final T00.a f72575b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f72576c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f72577d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f72578e;

    public d(@NotNull m layout, T00.a aVar) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f72574a = layout;
        this.f72575b = aVar;
        this.f72576c = layout.h();
        String c11 = layout.c();
        this.f72577d = c11 == null ? layout.b() : c11;
        this.f72578e = layout.m();
    }

    @NotNull
    public final String a() {
        return this.f72576c;
    }

    public final T00.a b() {
        return this.f72575b;
    }

    @NotNull
    public final m c() {
        return this.f72574a;
    }

    @NotNull
    public final String d() {
        return this.f72577d;
    }

    public final boolean e() {
        return this.f72578e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!d.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.composer.widget.item.WidgetInfo");
        return Intrinsics.d(this.f72574a, ((d) obj).f72574a);
    }

    public final int hashCode() {
        return this.f72574a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "WidgetInfo(layout=" + this.f72574a + ", composerState=" + this.f72575b + ")";
    }
}
