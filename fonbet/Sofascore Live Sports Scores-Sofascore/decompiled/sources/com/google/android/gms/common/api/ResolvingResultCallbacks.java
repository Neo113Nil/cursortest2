package com.google.android.gms.common.api;

import android.content.IntentSender;
import com.google.android.gms.common.api.Result;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class ResolvingResultCallbacks<R extends Result> extends ResultCallbacks<R> {
    @Override // com.google.android.gms.common.api.ResultCallbacks
    public final void b(Status status) {
        if (status.c == null) {
            d();
            return;
        }
        try {
            status.Z0();
        } catch (IntentSender.SendIntentException unused) {
            new Status(8, null, null, null);
            d();
        }
    }

    public abstract void d();
}
