package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.exception.InitializationException;
import xsna.myc0;
import xsna.ovj;
import xsna.zvj;

/* compiled from: TriggerInitializeListener.kt */
/* loaded from: classes14.dex */
public final class TriggerInitializeListener {
    private final ovj coroutineDispatcher;

    public TriggerInitializeListener(ovj ovjVar) {
        this.coroutineDispatcher = ovjVar;
    }

    public final void error(InitializationException initializationException) {
        myc0.h(zvj.a(this.coroutineDispatcher), null, null, new TriggerInitializeListener$error$1(initializationException, null), 3);
    }

    public final void success() {
        myc0.h(zvj.a(this.coroutineDispatcher), null, null, new TriggerInitializeListener$success$1(null), 3);
    }
}
