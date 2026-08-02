package Ai;

import zi.InterfaceC7015a;

/* loaded from: classes5.dex */
public abstract class a extends d implements InterfaceC7015a {
    private static final long serialVersionUID = 9044267456635152283L;

    @Override // Ai.d, zi.InterfaceC7015a
    public abstract /* bridge */ /* synthetic */ String getName();

    public String toString() {
        return getClass().getName() + "(" + getName() + ")";
    }
}
