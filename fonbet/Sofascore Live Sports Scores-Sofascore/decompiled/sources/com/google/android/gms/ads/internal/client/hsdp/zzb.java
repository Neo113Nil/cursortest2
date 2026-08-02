package com.google.android.gms.ads.internal.client.hsdp;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.eg9;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzb implements eg9 {
    public final /* synthetic */ IHsdpServiceCallback a;

    public zzb(HsdpDeepLinkServiceWrapper hsdpDeepLinkServiceWrapper, IHsdpServiceCallback iHsdpServiceCallback) {
        this.a = iHsdpServiceCallback;
    }

    @Override // defpackage.eg9
    public final void onDismissed(Bundle bundle) {
        IHsdpServiceCallback iHsdpServiceCallback = this.a;
        if (iHsdpServiceCallback != null) {
            try {
                iHsdpServiceCallback.onDismissed(bundle);
            } catch (RemoteException e) {
                zzo.zzg("RemoteException in onDismissed", e);
            }
        }
    }

    @Override // defpackage.eg9
    public final void onError(Bundle bundle) {
        IHsdpServiceCallback iHsdpServiceCallback = this.a;
        if (iHsdpServiceCallback != null) {
            try {
                iHsdpServiceCallback.onError(bundle);
            } catch (RemoteException e) {
                zzo.zzg("RemoteException in onError", e);
            }
        }
    }

    @Override // defpackage.eg9
    public final void onShown(Bundle bundle) {
        IHsdpServiceCallback iHsdpServiceCallback = this.a;
        if (iHsdpServiceCallback != null) {
            try {
                iHsdpServiceCallback.onShown(bundle);
            } catch (RemoteException e) {
                zzo.zzg("RemoteException in onShown", e);
            }
        }
    }

    @Override // defpackage.eg9
    public final void onAffordanceEnded() {
    }

    @Override // defpackage.eg9
    public final void onAffordanceStarted() {
    }

    @Override // defpackage.eg9
    public final void onDeepLinkStarted() {
    }
}
