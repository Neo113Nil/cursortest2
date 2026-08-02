package de;

import je.N;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9835a;
import wd.AbstractC10532s;

/* renamed from: de.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C6185d extends AbstractC6182a {

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC10532s f61608c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C6185d(@NotNull InterfaceC9835a interfaceC9835a, @NotNull N n11, InterfaceC6188g interfaceC6188g) {
        super(n11, interfaceC6188g);
        if (n11 == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "receiverType", "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver", "<init>"));
        }
        this.f61608c = (AbstractC10532s) interfaceC9835a;
    }

    public final String toString() {
        return getType() + ": Ext {" + this.f61608c + "}";
    }
}
