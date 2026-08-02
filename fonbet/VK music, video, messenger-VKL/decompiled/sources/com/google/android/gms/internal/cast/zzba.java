package com.google.android.gms.internal.cast;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.framework.CastOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xsna.g0a;
import xsna.hp01;
import xsna.hr80;
import xsna.lui0;
import xsna.ssi0;
import xsna.xp01;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzba extends lui0 {
    private final CastOptions zza;
    private final zzbx zzb;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzba(Context context, CastOptions castOptions, zzbx zzbxVar) {
        super(context, r0);
        String a;
        ArrayList arrayList = castOptions.c;
        String str = castOptions.b;
        if (Collections.unmodifiableList(arrayList).isEmpty()) {
            a = hr80.p(str);
        } else {
            List unmodifiableList = Collections.unmodifiableList(castOptions.c);
            if (str == null) {
                throw new IllegalArgumentException("applicationId cannot be null");
            }
            if (unmodifiableList == null) {
                throw new IllegalArgumentException("namespaces cannot be null");
            }
            a = new xp01(str, unmodifiableList).a();
        }
        this.zza = castOptions;
        this.zzb = zzbxVar;
    }

    @Override // xsna.lui0
    public final ssi0 createSession(@Nullable String str) {
        Context context = getContext();
        String category = getCategory();
        Context context2 = getContext();
        CastOptions castOptions = this.zza;
        zzbx zzbxVar = this.zzb;
        return new g0a(context, category, str, castOptions, zzbxVar, new hp01(context2, castOptions, zzbxVar));
    }

    @Override // xsna.lui0
    public final boolean isSessionRecoverable() {
        return this.zza.f;
    }
}
