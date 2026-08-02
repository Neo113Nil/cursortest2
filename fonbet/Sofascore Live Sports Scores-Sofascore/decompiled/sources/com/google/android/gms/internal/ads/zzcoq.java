package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzez;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcoq implements zzinw {
    public final zzcok a;

    public zzcoq(zzcok zzcokVar) {
        this.a = zzcokVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zziol
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String zzb() {
        zzez liteSdkVersion;
        com.google.android.gms.ads.internal.client.zzcv zzcvVar = zzfms.a(this.a.a()).b;
        if (zzcvVar != null) {
            try {
                liteSdkVersion = zzcvVar.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
            if (liteSdkVersion == null) {
                return liteSdkVersion.zzb();
            }
            return null;
        }
        liteSdkVersion = null;
        if (liteSdkVersion == null) {
        }
    }
}
