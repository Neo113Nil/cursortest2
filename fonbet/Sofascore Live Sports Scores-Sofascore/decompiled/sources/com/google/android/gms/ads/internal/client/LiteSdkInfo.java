package com.google.android.gms.ads.internal.client;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbvq;
import com.google.android.gms.internal.ads.zzbvu;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public class LiteSdkInfo extends zzcu {
    public LiteSdkInfo(@NonNull Context context) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public zzbvu getAdapterCreator() {
        return new zzbvq();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public zzez getLiteSdkVersion() {
        return new zzez(ModuleDescriptor.MODULE_VERSION, ModuleDescriptor.MODULE_VERSION, "25.4.0");
    }
}
