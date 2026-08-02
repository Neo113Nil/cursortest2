package com.google.android.play.core.splitinstall.internal;

import android.content.pm.PackageManager;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes13.dex */
public final class zzbh extends RuntimeException {
    public zzbh(PackageManager.NameNotFoundException nameNotFoundException) {
        super("Failed to initialize FileStorage", nameNotFoundException);
    }
}
