package com.vk.reefton.literx;

import java.util.concurrent.atomic.AtomicBoolean;
import xsna.ign;

/* compiled from: SimpleDisposable.kt */
/* loaded from: classes5.dex */
public final class SimpleDisposable extends AtomicBoolean implements ign {
    public SimpleDisposable() {
        set(false);
    }

    @Override // xsna.ign
    public final void dispose() {
        set(false);
    }

    @Override // xsna.ign
    public final boolean h() {
        return get();
    }
}
