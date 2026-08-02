package com.google.android.gms.wallet;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.C3180d;
import com.google.android.gms.internal.wallet.zzy;
import com.google.android.gms.wallet.AbstractC3416d;

/* loaded from: classes2.dex */
public final class o extends C3117a.AbstractC0488a {
    @Override // com.google.android.gms.common.api.C3117a.AbstractC0488a
    public final /* bridge */ /* synthetic */ C3117a.f buildClient(Context context, Looper looper, C3180d c3180d, Object obj, f.b bVar, f.c cVar) {
        AbstractC3416d.a aVar = (AbstractC3416d.a) obj;
        if (aVar == null) {
            aVar = new AbstractC3416d.a();
        }
        return new zzy(context, looper, c3180d, bVar, cVar, aVar.f34618a, aVar.f34619b, aVar.f34621d);
    }
}
