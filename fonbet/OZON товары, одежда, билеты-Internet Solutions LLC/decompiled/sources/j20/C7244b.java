package j20;

import T00.m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: j20.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C7244b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f68919a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final T00.a f68920b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final m f68921c;

    public C7244b(@NotNull String jsonState, @NotNull T00.a composerState, @NotNull m widgetLayout) {
        Intrinsics.checkNotNullParameter(jsonState, "jsonState");
        Intrinsics.checkNotNullParameter(composerState, "composerState");
        Intrinsics.checkNotNullParameter(widgetLayout, "widgetLayout");
        this.f68919a = jsonState;
        this.f68920b = composerState;
        this.f68921c = widgetLayout;
    }

    @NotNull
    public final T00.a a() {
        return this.f68920b;
    }

    @NotNull
    public final String b() {
        return this.f68919a;
    }

    @NotNull
    public final m c() {
        return this.f68921c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C7244b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.composer.widget.config.WidgetParsedState");
        C7244b c7244b = (C7244b) obj;
        return Intrinsics.d(this.f68919a, c7244b.f68919a) && Intrinsics.d(this.f68920b, c7244b.f68920b) && Intrinsics.d(this.f68921c, c7244b.f68921c);
    }

    public final int hashCode() {
        return this.f68921c.hashCode() + ((this.f68920b.hashCode() + (this.f68919a.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "WidgetParsedState(jsonState=" + this.f68919a + ", composerState=" + this.f68920b + ", widgetLayout=" + this.f68921c + ")";
    }
}
