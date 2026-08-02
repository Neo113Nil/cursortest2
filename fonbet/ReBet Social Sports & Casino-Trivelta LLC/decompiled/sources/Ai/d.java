package Ai;

import java.io.Serializable;
import zi.AbstractC7016b;
import zi.InterfaceC7015a;

/* loaded from: classes5.dex */
public abstract class d implements InterfaceC7015a, Serializable {
    private static final long serialVersionUID = 7535258609338176893L;

    @Override // zi.InterfaceC7015a
    public abstract String getName();

    public Object readResolve() {
        return AbstractC7016b.j(getName());
    }
}
