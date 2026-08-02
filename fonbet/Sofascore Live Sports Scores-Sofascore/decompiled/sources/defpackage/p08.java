package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class p08 extends j21 {
    public RandomAccessFile e;
    public Uri f;
    public long g;
    public boolean h;

    @Override // defpackage.qe4
    public final void close() {
        this.f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new n08(2000, e);
            }
        } finally {
            this.e = null;
            if (this.h) {
                this.h = false;
                d();
            }
        }
    }

    @Override // defpackage.qe4
    public final Uri getUri() {
        return this.f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        if (r0 != false) goto L39;
     */
    @Override // defpackage.qe4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long k(we4 we4Var) {
        boolean b;
        Uri uri = we4Var.a;
        long j = we4Var.e;
        this.f = uri;
        e();
        int i = 2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.e = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long j2 = we4Var.f;
                if (j2 == -1) {
                    j2 = this.e.length() - j;
                }
                this.g = j2;
                if (j2 < 0) {
                    throw new n08(2008, null, null);
                }
                this.h = true;
                f(we4Var);
                return this.g;
            } catch (IOException e) {
                throw new n08(2000, e);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                if (lik.a >= 21) {
                    b = l08.b(e2.getCause());
                }
                i = 2005;
                throw new n08(i, e2);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder s = mz1.s("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            s.append(fragment);
            throw new n08(1004, s.toString(), e2);
        } catch (SecurityException e3) {
            throw new n08(2006, e3);
        } catch (RuntimeException e4) {
            throw new n08(2000, e4);
        }
    }

    @Override // defpackage.fe4, defpackage.ge4
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
            int i3 = lik.a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.g -= read;
                b(read);
            }
            return read;
        } catch (IOException e) {
            throw new n08(2000, e);
        }
    }
}
