package com.google.android.gms.internal.measurement;

import java.io.File;
import java.io.FileOutputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzsm extends zzso implements zzsf {
    public final FileOutputStream a;
    public final File b;

    public zzsm(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.a = fileOutputStream;
        this.b = file;
    }

    @Override // com.google.android.gms.internal.measurement.zzsf
    public final File zza() {
        return this.b;
    }
}
