package com.google.android.gms.internal.cast;

import android.content.Context;
import com.google.android.gms.cast.CastMediaControlIntent;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.SessionProvider;
import defpackage.a70;
import defpackage.gvo;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzba extends SessionProvider {
    public final CastOptions d;
    public final zzbx e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzba(Context context, CastOptions castOptions, zzbx zzbxVar) {
        super(context, r0);
        String c;
        boolean isEmpty = Collections.unmodifiableList(castOptions.b).isEmpty();
        String str = castOptions.a;
        if (isEmpty) {
            c = CastMediaControlIntent.a(str);
        } else {
            List unmodifiableList = Collections.unmodifiableList(castOptions.b);
            if (str == null) {
                a70.p("applicationId cannot be null");
                throw null;
            }
            if (unmodifiableList == null) {
                a70.p("namespaces cannot be null");
                throw null;
            }
            c = new gvo(13, str, unmodifiableList).c();
        }
        this.d = castOptions;
        this.e = zzbxVar;
    }

    @Override // com.google.android.gms.cast.framework.SessionProvider
    public final CastSession a(String str) {
        Context context = this.a;
        CastOptions castOptions = this.d;
        zzbx zzbxVar = this.e;
        return new CastSession(this.a, this.b, str, castOptions, zzbxVar, new com.google.android.gms.cast.framework.media.internal.zzs(context, castOptions, zzbxVar));
    }

    @Override // com.google.android.gms.cast.framework.SessionProvider
    public final boolean b() {
        return this.d.e;
    }
}
