package com.google.android.gms.internal.measurement;

import java.io.File;
import java.io.FileInputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzsl extends zzsn implements zzsf {
    public final File a;

    public zzsl(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.a = file;
    }

    @Override // com.google.android.gms.internal.measurement.zzsf
    public final File zza() {
        return this.a;
    }
}
