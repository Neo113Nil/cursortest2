package com.google.android.gms.ads.internal.client.hsdp;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.fg9;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zza implements fg9 {
    public final /* synthetic */ IHsdpPrewarmServiceCallback a;

    public zza(HsdpDeepLinkServiceWrapper hsdpDeepLinkServiceWrapper, IHsdpPrewarmServiceCallback iHsdpPrewarmServiceCallback) {
        this.a = iHsdpPrewarmServiceCallback;
    }

    @Override // defpackage.fg9
    public final void onCompleted(Bundle bundle) {
        IHsdpPrewarmServiceCallback iHsdpPrewarmServiceCallback = this.a;
        if (iHsdpPrewarmServiceCallback != null) {
            try {
                iHsdpPrewarmServiceCallback.onPrewarmCompleted(bundle);
            } catch (RemoteException e) {
                zzo.zzg("RemoteException in HsdpPrewarmListener.onCompleted", e);
            }
        }
    }

    @Override // defpackage.fg9
    public final void onError(Bundle bundle) {
        IHsdpPrewarmServiceCallback iHsdpPrewarmServiceCallback = this.a;
        if (iHsdpPrewarmServiceCallback != null) {
            try {
                iHsdpPrewarmServiceCallback.onError(bundle);
            } catch (RemoteException e) {
                zzo.zzg("RemoteException in HsdpPrewarmListener.onError", e);
            }
        }
    }
}
