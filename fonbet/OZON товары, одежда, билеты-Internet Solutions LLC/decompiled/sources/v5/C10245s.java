package v5;

import android.view.View;
import org.jetbrains.annotations.NotNull;
import xe.U;

/* renamed from: v5.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10245s implements InterfaceC10231e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f102278a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private volatile U<? extends AbstractC10235i> f102279b;

    public C10245s(@NotNull View view, @NotNull U<? extends AbstractC10235i> u11) {
        this.f102278a = view;
        this.f102279b = u11;
    }

    public final void a(@NotNull U<? extends AbstractC10235i> u11) {
        this.f102279b = u11;
    }
}
