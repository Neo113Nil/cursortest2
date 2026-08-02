package de;

import je.N;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9839e;

/* renamed from: de.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C6183b extends AbstractC6182a implements InterfaceC6187f {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC9839e f61604c;

    /* renamed from: d, reason: collision with root package name */
    private final Sd.f f61605d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6183b(@NotNull InterfaceC9839e classDescriptor, @NotNull N receiverType, Sd.f fVar) {
        super(receiverType, null);
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        Intrinsics.checkNotNullParameter(receiverType, "receiverType");
        this.f61604c = classDescriptor;
        this.f61605d = fVar;
    }

    @Override // de.InterfaceC6187f
    public final Sd.f a() {
        return this.f61605d;
    }

    @NotNull
    public final String toString() {
        return getType() + ": Ctx { " + this.f61604c + " }";
    }
}
