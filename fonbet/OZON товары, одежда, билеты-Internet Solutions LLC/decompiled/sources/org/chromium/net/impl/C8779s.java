package org.chromium.net.impl;

import android.util.Log;
import org.chromium.net.y;

/* renamed from: org.chromium.net.impl.s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C8779s extends a0 {

    /* renamed from: e, reason: collision with root package name */
    private static final String f78939e = a0.class.getSimpleName();

    /* renamed from: f, reason: collision with root package name */
    private static boolean f78940f;

    @Override // org.chromium.net.impl.a0
    public final y.b c() {
        if (!f78940f) {
            Log.i(f78939e, "RequestFinishedInfo.getMetrics() is unsupported when HttpEngineNativeProvider is used. The Metrics object will return null values.");
            f78940f = true;
        }
        return super.c();
    }
}
