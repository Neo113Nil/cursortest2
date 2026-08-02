package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbnn {
    public final zzbnm a;

    public zzbnn(zzbnm zzbnmVar) {
        Context context;
        this.a = zzbnmVar;
        try {
            context = (Context) ObjectWrapper.Z1(zzbnmVar.zzm());
        } catch (RemoteException | NullPointerException e) {
            zzo.zzg("", e);
            context = null;
        }
        if (context != null) {
            try {
                this.a.w0(new ObjectWrapper(new MediaView(context)));
            } catch (RemoteException e2) {
                zzo.zzg("", e2);
            }
        }
    }
}
