package qj0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: qj0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9071a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f82207a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f82208b;

    public C9071a(boolean z11, @NotNull String testTag) {
        Intrinsics.checkNotNullParameter(testTag, "testTag");
        this.f82207a = z11;
        this.f82208b = testTag;
    }

    public final boolean a() {
        return this.f82207a;
    }

    @NotNull
    public final String b() {
        return this.f82208b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C9071a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.tracker.debug.menu.shared.configuration.ui.component.BadgeInfo");
        C9071a c9071a = (C9071a) obj;
        return this.f82207a == c9071a.f82207a && Intrinsics.d(this.f82208b, c9071a.f82208b);
    }

    public final int hashCode() {
        return (this.f82208b.hashCode() * 31) + (Boolean.hashCode(this.f82207a) * 31);
    }
}
