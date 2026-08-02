package kf0;

import gf0.AbstractC6729a;
import jf0.AbstractC7421a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: kf0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7674a implements InterfaceC7675b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC7421a f71521a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6729a f71522b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f71523c;

    /* JADX WARN: Multi-variable type inference failed */
    public C7674a(@NotNull AbstractC7421a graph, AbstractC6729a abstractC6729a, @NotNull Function1 graphBuilder) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        Intrinsics.checkNotNullParameter(graphBuilder, "graphBuilder");
        this.f71521a = graph;
        this.f71522b = abstractC6729a;
        this.f71523c = (AbstractC7737t) graphBuilder;
    }

    @NotNull
    public final AbstractC7421a a() {
        return this.f71521a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1<kf0.c, kotlin.Unit>, kotlin.jvm.internal.t] */
    @NotNull
    public final Function1<c, Unit> b() {
        return this.f71523c;
    }

    public final AbstractC6729a c() {
        return this.f71522b;
    }
}
