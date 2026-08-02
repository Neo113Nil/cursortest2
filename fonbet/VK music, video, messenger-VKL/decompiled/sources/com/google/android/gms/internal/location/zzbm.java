package com.google.android.gms.internal.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import xsna.i380;
import xsna.olc;
import xsna.x3j;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes.dex */
final class zzbm extends a.AbstractC0111a {
    @Override // com.google.android.gms.common.api.a.AbstractC0111a
    public final /* synthetic */ a.f buildClient(Context context, Looper looper, olc olcVar, Object obj, x3j x3jVar, i380 i380Var) {
        return new zzda(context, looper, olcVar, x3jVar, i380Var);
    }
}
