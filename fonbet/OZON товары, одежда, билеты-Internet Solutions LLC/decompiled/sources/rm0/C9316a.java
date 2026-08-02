package rm0;

import kotlin.jvm.internal.Intrinsics;
import om0.C8754a;
import org.jetbrains.annotations.NotNull;
import pm0.C8943b;
import sm0.C9704a;

/* renamed from: rm0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9316a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C8943b f83726a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C9704a f83727b;

    public C9316a(@NotNull C8943b analyticsRepository, @NotNull C9704a eventBuilder) {
        Intrinsics.checkNotNullParameter(analyticsRepository, "analyticsRepository");
        Intrinsics.checkNotNullParameter(eventBuilder, "eventBuilder");
        this.f83726a = analyticsRepository;
        this.f83727b = eventBuilder;
    }

    public final void a(@NotNull C8754a clickstreamEvent) {
        Intrinsics.checkNotNullParameter(clickstreamEvent, "clickstreamEvent");
        this.f83726a.d(this.f83727b.a(clickstreamEvent));
    }
}
