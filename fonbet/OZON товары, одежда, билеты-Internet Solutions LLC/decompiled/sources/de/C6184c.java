package de;

import je.N;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9835a;
import wd.AbstractC10532s;

/* renamed from: de.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C6184c extends AbstractC6182a implements InterfaceC6187f {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AbstractC10532s f61606c;

    /* renamed from: d, reason: collision with root package name */
    private final Sd.f f61607d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C6184c(@NotNull InterfaceC9835a declarationDescriptor, @NotNull N receiverType, Sd.f fVar, InterfaceC6188g interfaceC6188g) {
        super(receiverType, interfaceC6188g);
        Intrinsics.checkNotNullParameter(declarationDescriptor, "declarationDescriptor");
        Intrinsics.checkNotNullParameter(receiverType, "receiverType");
        this.f61606c = (AbstractC10532s) declarationDescriptor;
        this.f61607d = fVar;
    }

    @Override // de.InterfaceC6187f
    public final Sd.f a() {
        return this.f61607d;
    }

    @NotNull
    public final String toString() {
        return "Cxt { " + this.f61606c + " }";
    }
}
