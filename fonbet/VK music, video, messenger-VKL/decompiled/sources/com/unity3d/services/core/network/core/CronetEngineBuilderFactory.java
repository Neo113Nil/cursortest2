package com.unity3d.services.core.network.core;

import android.content.Context;
import org.chromium.net.CronetEngine;

/* compiled from: CronetEngineBuilderFactory.kt */
/* loaded from: classes14.dex */
public final class CronetEngineBuilderFactory {
    public final CronetEngine.Builder createCronetEngineBuilder(Context context) {
        return new CronetEngine.Builder(context);
    }
}
