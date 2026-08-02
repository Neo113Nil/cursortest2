package h1;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import e1.AbstractC4134a;
import e1.Z;
import h1.InterfaceC4411g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: h1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4423s extends AbstractC4406b {

    /* renamed from: e, reason: collision with root package name */
    public RandomAccessFile f47613e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f47614f;

    /* renamed from: g, reason: collision with root package name */
    public long f47615g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f47616h;

    /* renamed from: h1.s$a */
    public static final class a implements InterfaceC4411g.a {

        /* renamed from: a, reason: collision with root package name */
        public InterfaceC4403F f47617a;

        @Override // h1.InterfaceC4411g.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4423s a() {
            C4423s c4423s = new C4423s();
            InterfaceC4403F interfaceC4403F = this.f47617a;
            if (interfaceC4403F != null) {
                c4423s.c(interfaceC4403F);
            }
            return c4423s;
        }
    }

    /* renamed from: h1.s$b */
    public static class b extends C4415k {
        public b(Throwable th2, int i10) {
            super(th2, i10);
        }

        public b(String str, Throwable th2, int i10) {
            super(str, th2, i10);
        }
    }

    public C4423s() {
        super(false);
    }

    public static RandomAccessFile s(Uri uri) {
        try {
            return new RandomAccessFile((String) AbstractC4134a.e(uri.getPath()), "r");
        } catch (FileNotFoundException e10) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new b(e10, ((e10.getCause() instanceof ErrnoException) && ((ErrnoException) e10.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new b(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e10, 1004);
        } catch (SecurityException e11) {
            throw new b(e11, 2006);
        } catch (RuntimeException e12) {
            throw new b(e12, 2000);
        }
    }

    @Override // h1.InterfaceC4411g
    public long b(C4418n c4418n) {
        Uri uri = c4418n.f47554a;
        this.f47614f = uri;
        q(c4418n);
        RandomAccessFile s10 = s(uri);
        this.f47613e = s10;
        try {
            s10.seek(c4418n.f47559f);
            long j10 = c4418n.f47560g;
            if (j10 == -1) {
                j10 = this.f47613e.length() - c4418n.f47559f;
            }
            this.f47615g = j10;
            if (j10 < 0) {
                throw new b(null, null, 2008);
            }
            this.f47616h = true;
            r(c4418n);
            return this.f47615g;
        } catch (IOException e10) {
            throw new b(e10, 2000);
        }
    }

    @Override // h1.InterfaceC4411g
    public void close() {
        this.f47614f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f47613e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new b(e10, 2000);
            }
        } finally {
            this.f47613e = null;
            if (this.f47616h) {
                this.f47616h = false;
                p();
            }
        }
    }

    @Override // h1.InterfaceC4411g
    public Uri getUri() {
        return this.f47614f;
    }

    @Override // b1.InterfaceC2358l
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (this.f47615g == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) Z.i(this.f47613e)).read(bArr, i10, (int) Math.min(this.f47615g, i11));
            if (read > 0) {
                this.f47615g -= read;
                o(read);
            }
            return read;
        } catch (IOException e10) {
            throw new b(e10, 2000);
        }
    }
}
