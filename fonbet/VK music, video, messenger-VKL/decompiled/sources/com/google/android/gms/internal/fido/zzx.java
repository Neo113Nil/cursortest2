package com.google.android.gms.internal.fido;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import xsna.olc;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes12.dex */
public final class zzx extends a.AbstractC0111a {
    @Override // com.google.android.gms.common.api.a.AbstractC0111a
    public final /* synthetic */ a.f buildClient(Context context, Looper looper, olc olcVar, Object obj, c.b bVar, c.InterfaceC0114c interfaceC0114c) {
        return new zzy(context, looper, olcVar, bVar, interfaceC0114c);
    }
}
