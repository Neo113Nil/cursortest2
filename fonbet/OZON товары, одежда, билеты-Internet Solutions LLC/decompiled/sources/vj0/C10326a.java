package vj0;

import ei0.InterfaceC6369b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uj0.C10066a;
import uj0.b;
import uj0.c;

/* renamed from: vj0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10326a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6369b f103020a;

    public C10326a(@NotNull InterfaceC6369b tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f103020a = tracker;
    }

    @NotNull
    public final C10066a a() {
        return new C10066a(this.f103020a);
    }

    @NotNull
    public final b b() {
        return new b(this.f103020a);
    }

    @NotNull
    public final c c() {
        return new c(this.f103020a);
    }
}
