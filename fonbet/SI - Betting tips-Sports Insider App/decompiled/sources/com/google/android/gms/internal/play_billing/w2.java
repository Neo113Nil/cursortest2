package com.google.android.gms.internal.play_billing;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w2 {

    /* renamed from: b, reason: collision with root package name */
    public static final w2 f5614b;

    /* renamed from: c, reason: collision with root package name */
    public static final w2 f5615c;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f5616a;

    static {
        if (r5.f5559d) {
            f5615c = null;
            f5614b = null;
        } else {
            f5615c = new w2(null);
            f5614b = new w2(null);
        }
    }

    public w2(CancellationException cancellationException) {
        this.f5616a = cancellationException;
    }
}
