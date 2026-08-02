package com.vk.reefton.literx;

import java.util.concurrent.atomic.AtomicReference;
import xsna.ign;

/* compiled from: DisposableContainer.kt */
/* loaded from: classes5.dex */
public final class DisposableContainer extends AtomicReference<ign> implements ign {
    @Override // xsna.ign
    public final void dispose() {
        ign ignVar = get();
        if (ignVar != null) {
            ignVar.dispose();
        }
    }

    @Override // xsna.ign
    public final boolean h() {
        ign ignVar = get();
        if (ignVar != null) {
            return ignVar.h();
        }
        return false;
    }
}
