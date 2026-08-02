package com.google.android.gms.cast.framework.media.internal;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import com.google.android.gms.cast.framework.media.ImageHints;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzb {
    public final Context a;
    public final ImageHints b;
    public Uri c;
    public zzd d;
    public zza e;

    public zzb(Context context) {
        this(context, new ImageHints(-1, 0, 0));
    }

    public final void a(Uri uri) {
        zzd zzdVar;
        int i;
        if (uri == null) {
            b();
            return;
        }
        if (uri.equals(this.c)) {
            return;
        }
        b();
        this.c = uri;
        ImageHints imageHints = this.b;
        int i2 = imageHints.b;
        Context context = this.a;
        if (i2 == 0 || (i = imageHints.c) == 0) {
            zzdVar = new zzd(context, 0, 0, this);
            this.d = zzdVar;
        } else {
            zzdVar = new zzd(context, i2, i, this);
            this.d = zzdVar;
        }
        Uri uri2 = this.c;
        Preconditions.i(uri2);
        zzdVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
    }

    public final void b() {
        zzd zzdVar = this.d;
        if (zzdVar != null) {
            zzdVar.cancel(true);
            this.d = null;
        }
        this.c = null;
    }

    public zzb(Context context, ImageHints imageHints) {
        this.a = context;
        this.b = imageHints;
        b();
    }
}
