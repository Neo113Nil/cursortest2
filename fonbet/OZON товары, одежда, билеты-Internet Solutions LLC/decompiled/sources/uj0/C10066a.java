package uj0;

import ei0.InterfaceC6369b;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tj0.InterfaceC9881a;

/* renamed from: uj0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10066a implements InterfaceC9881a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6369b f100832a;

    public C10066a(@NotNull InterfaceC6369b tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f100832a = tracker;
    }

    @Override // tj0.InterfaceC9881a
    public final Unit invoke() {
        this.f100832a.c(null);
        return Unit.f71690a;
    }
}
