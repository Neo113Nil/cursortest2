package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.io.OutputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzsy implements zzsx {
    @Override // com.google.android.gms.internal.measurement.zzsx
    public final OutputStream c(Uri uri) {
        return f().c(g(uri));
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final void d(Uri uri) {
        f().d(g(uri));
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final void e(Uri uri, Uri uri2) {
        f().e(g(uri), g(uri2));
    }

    public abstract zzsd f();

    public Uri g(Uri uri) {
        throw null;
    }
}
