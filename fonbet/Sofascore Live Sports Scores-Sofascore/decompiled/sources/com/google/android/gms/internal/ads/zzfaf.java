package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfaf implements zzfdg {
    public final String a;
    public final boolean b;

    public zzfaf(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("gct", this.a);
        if (this.b) {
            bundle.putString(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "1");
        }
    }
}
