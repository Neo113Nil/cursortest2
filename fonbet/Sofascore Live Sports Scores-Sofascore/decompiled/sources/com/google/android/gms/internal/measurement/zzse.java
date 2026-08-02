package com.google.android.gms.internal.measurement;

import defpackage.jca;
import java.io.OutputStream;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzse implements zzro {
    public OutputStream a;
    public zzsm b;

    @Override // com.google.android.gms.internal.measurement.zzro
    public final void a(ArrayList arrayList) {
        OutputStream outputStream = (OutputStream) jca.H(arrayList);
        if (outputStream instanceof zzsm) {
            this.b = (zzsm) outputStream;
            this.a = (OutputStream) arrayList.get(0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzro
    public final void zzb() {
        if (this.b == null) {
            throw new zzsk("Cannot sync underlying stream");
        }
        this.a.flush();
        this.b.a.getFD().sync();
    }
}
