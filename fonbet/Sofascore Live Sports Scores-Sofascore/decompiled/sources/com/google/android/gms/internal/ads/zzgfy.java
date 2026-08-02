package com.google.android.gms.internal.ads;

import defpackage.tco;
import defpackage.xco;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgfy implements xco {
    public final byte[] a;

    public zzgfy(byte[] bArr) {
        this.a = bArr;
    }

    @Override // defpackage.xco
    public final Object a(FileInputStream fileInputStream) {
        try {
            return zzham.a(fileInputStream);
        } catch (IOException e) {
            throw new tco("Cannot read bytes.", e);
        }
    }

    @Override // defpackage.xco
    public final /* synthetic */ void b(Object obj, FileOutputStream fileOutputStream) {
        fileOutputStream.write((byte[]) obj);
    }

    @Override // defpackage.xco
    public final /* synthetic */ Object zzc() {
        return this.a;
    }
}
