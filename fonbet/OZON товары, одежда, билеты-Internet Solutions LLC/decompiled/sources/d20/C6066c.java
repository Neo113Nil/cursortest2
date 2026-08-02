package d20;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.J;
import androidx.lifecycle.L;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: d20.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6066c implements J {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final L f61091a = new L(this);

    public final void a(@NotNull AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f61091a.h(event);
    }

    @Override // androidx.lifecycle.J
    @NotNull
    public final AbstractC5434v getLifecycle() {
        return this.f61091a;
    }
}
