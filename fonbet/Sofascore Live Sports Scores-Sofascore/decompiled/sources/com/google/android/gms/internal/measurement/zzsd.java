package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.ironsource.U3;
import defpackage.fqj;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzsd implements zzsx {
    public zzsd() {
        new zzsh();
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final InputStream a(Uri uri) {
        File a = zzsc.a(uri);
        return new zzsl(new FileInputStream(a), a);
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final File b(Uri uri) {
        return zzsc.a(uri);
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final OutputStream c(Uri uri) {
        File a = zzsc.a(uri);
        fqj.s(a);
        return new zzsm(new FileOutputStream(a), a);
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final void d(Uri uri) {
        File a = zzsc.a(uri);
        if (a.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        }
        if (a.delete()) {
            return;
        }
        if (!a.exists()) {
            throw new FileNotFoundException(String.format("%s does not exist", uri));
        }
        throw new IOException(String.format("%s could not be deleted", uri));
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final void e(Uri uri, Uri uri2) {
        File a = zzsc.a(uri);
        File a2 = zzsc.a(uri2);
        fqj.s(a2);
        if (!a.renameTo(a2)) {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final String zzc() {
        return U3.i.b;
    }
}
