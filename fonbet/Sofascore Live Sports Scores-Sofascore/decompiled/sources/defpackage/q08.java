package defpackage;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class q08 extends k21 {
    public RandomAccessFile e;
    public Uri f;
    public long g;
    public boolean h;

    @Override // defpackage.re4
    public final long b(xe4 xe4Var) {
        Uri uri = xe4Var.a;
        long j = xe4Var.f;
        this.f = uri;
        e();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.e = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long j2 = xe4Var.g;
                if (j2 == -1) {
                    j2 = this.e.length() - j;
                }
                this.g = j2;
                if (j2 < 0) {
                    throw new o08(2008, null, null);
                }
                this.h = true;
                g(xe4Var);
                return this.g;
            } catch (IOException e) {
                throw new o08(2000, e);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new o08(((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005, e2);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder s = mz1.s("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            s.append(fragment);
            throw new o08(1004, s.toString(), e2);
        } catch (SecurityException e3) {
            throw new o08(2006, e3);
        } catch (RuntimeException e4) {
            throw new o08(2000, e4);
        }
    }

    @Override // defpackage.re4
    public final void close() {
        this.f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new o08(2000, e);
            }
        } finally {
            this.e = null;
            if (this.h) {
                this.h = false;
                d();
            }
        }
    }

    @Override // defpackage.re4
    public final Uri getUri() {
        return this.f;
    }

    @Override // defpackage.ge4
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.e;
            String str = nik.a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.g -= read;
                c(read);
            }
            return read;
        } catch (IOException e) {
            throw new o08(2000, e);
        }
    }
}
