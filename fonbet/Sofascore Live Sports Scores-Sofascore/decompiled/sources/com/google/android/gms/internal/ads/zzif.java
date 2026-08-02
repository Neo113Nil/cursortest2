package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import defpackage.mz1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzif extends zzhk {
    public RandomAccessFile e;
    public Uri f;
    public long g;
    public boolean h;

    public zzif() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final long a(zzhw zzhwVar) {
        Uri uri = zzhwVar.a;
        this.f = uri;
        k(zzhwVar);
        try {
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.e = randomAccessFile;
            try {
                long j = zzhwVar.c;
                randomAccessFile.seek(j);
                long j2 = zzhwVar.d;
                if (j2 == -1) {
                    j2 = this.e.length() - j;
                }
                this.g = j2;
                if (j2 < 0) {
                    throw new zzie(2008, null, null);
                }
                this.h = true;
                l(zzhwVar);
                return this.g;
            } catch (IOException e) {
                throw new zzie(2000, e);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new zzie(((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005, e2);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder s = mz1.s("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            s.append(fragment);
            throw new zzie(1004, s.toString(), e2);
        } catch (SecurityException e3) {
            throw new zzie(2006, e3);
        } catch (RuntimeException e4) {
            throw new zzie(2000, e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int b(int i, int i2, byte[] bArr) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.e;
            String str = zzfm.a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.g -= read;
                m(read);
            }
            return read;
        } catch (IOException e) {
            throw new zzie(2000, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final Uri zzc() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void zzd() {
        this.f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.e = null;
                if (this.h) {
                    this.h = false;
                    n();
                }
            } catch (IOException e) {
                throw new zzie(2000, e);
            }
        } catch (Throwable th) {
            this.e = null;
            if (this.h) {
                this.h = false;
                n();
            }
            throw th;
        }
    }
}
