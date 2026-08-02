package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ec extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ec(@NotNull Exception exc) {
        super("Missing Headers", exc);
        exc.getClass();
    }
}
