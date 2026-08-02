package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzav implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context a;

    public zzav(zzaw zzawVar, Context context) {
        this.a = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        com.google.android.gms.ads.internal.zzt.zzc();
        zzs.zzZ(this.a, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
