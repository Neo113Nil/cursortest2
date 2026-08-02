package h1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import e1.AbstractC4134a;
import e1.Z;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;

/* renamed from: h1.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4400C extends AbstractC4406b {

    /* renamed from: e, reason: collision with root package name */
    public final Context f47501e;

    /* renamed from: f, reason: collision with root package name */
    public C4418n f47502f;

    /* renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f47503g;

    /* renamed from: h, reason: collision with root package name */
    public InputStream f47504h;

    /* renamed from: i, reason: collision with root package name */
    public long f47505i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f47506j;

    /* renamed from: h1.C$a */
    public static class a extends C4415k {
        public a(String str) {
            super(str, null, 2000);
        }

        public a(String str, Throwable th2, int i10) {
            super(str, th2, i10);
        }
    }

    public C4400C(Context context) {
        super(false);
        this.f47501e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    public static AssetFileDescriptor s(Context context, C4418n c4418n) {
        Resources resourcesForApplication;
        int identifier;
        Uri normalizeScheme = c4418n.f47554a.normalizeScheme();
        if (TextUtils.equals("rawresource", normalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new a("rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            identifier = t(pathSegments.get(0));
        } else {
            if (!TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
                throw new a("Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String str = (String) AbstractC4134a.e(normalizeScheme.getPath());
            if (str.startsWith("/")) {
                str = str.substring(1);
            }
            String packageName = TextUtils.isEmpty(normalizeScheme.getHost()) ? context.getPackageName() : normalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new a("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e10, 2005);
                }
            }
            if (str.matches("\\d+")) {
                identifier = t(str);
            } else {
                identifier = resourcesForApplication.getIdentifier(packageName + ":" + str, "raw", null);
                if (identifier == 0) {
                    throw new a("Resource not found.", null, 2005);
                }
            }
        }
        try {
            AssetFileDescriptor openRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (openRawResourceFd != null) {
                return openRawResourceFd;
            }
            throw new a("Resource is compressed: " + normalizeScheme, null, 2000);
        } catch (Resources.NotFoundException e11) {
            throw new a(null, e11, 2005);
        }
    }

    public static int t(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new a("Resource identifier must be an integer.", null, 1004);
        }
    }

    @Override // h1.InterfaceC4411g
    public long b(C4418n c4418n) {
        this.f47502f = c4418n;
        q(c4418n);
        AssetFileDescriptor s10 = s(this.f47501e, c4418n);
        this.f47503g = s10;
        long length = s10.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.f47503g.getFileDescriptor());
        this.f47504h = fileInputStream;
        if (length != -1) {
            try {
                if (c4418n.f47559f > length) {
                    throw new a(null, null, 2008);
                }
            } catch (a e10) {
                throw e10;
            } catch (IOException e11) {
                throw new a(null, e11, 2000);
            }
        }
        long startOffset = this.f47503g.getStartOffset();
        long skip = fileInputStream.skip(c4418n.f47559f + startOffset) - startOffset;
        if (skip != c4418n.f47559f) {
            throw new a(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.f47505i = -1L;
            } else {
                long size = channel.size() - channel.position();
                this.f47505i = size;
                if (size < 0) {
                    throw new a(null, null, 2008);
                }
            }
        } else {
            long j10 = length - skip;
            this.f47505i = j10;
            if (j10 < 0) {
                throw new C4415k(2008);
            }
        }
        long j11 = c4418n.f47560g;
        if (j11 != -1) {
            long j12 = this.f47505i;
            if (j12 != -1) {
                j11 = Math.min(j12, j11);
            }
            this.f47505i = j11;
        }
        this.f47506j = true;
        r(c4418n);
        long j13 = c4418n.f47560g;
        return j13 != -1 ? j13 : this.f47505i;
    }

    @Override // h1.InterfaceC4411g
    public void close() {
        this.f47502f = null;
        try {
            try {
                InputStream inputStream = this.f47504h;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f47504h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f47503g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new a(null, e10, 2000);
                    }
                } finally {
                    this.f47503g = null;
                    if (this.f47506j) {
                        this.f47506j = false;
                        p();
                    }
                }
            } catch (IOException e11) {
                throw new a(null, e11, 2000);
            }
        } catch (Throwable th2) {
            this.f47504h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f47503g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f47503g = null;
                    if (this.f47506j) {
                        this.f47506j = false;
                        p();
                    }
                    throw th2;
                } catch (IOException e12) {
                    throw new a(null, e12, 2000);
                }
            } finally {
                this.f47503g = null;
                if (this.f47506j) {
                    this.f47506j = false;
                    p();
                }
            }
        }
    }

    @Override // h1.InterfaceC4411g
    public Uri getUri() {
        C4418n c4418n = this.f47502f;
        if (c4418n != null) {
            return c4418n.f47554a;
        }
        return null;
    }

    @Override // b1.InterfaceC2358l
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f47505i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(null, e10, 2000);
            }
        }
        int read = ((InputStream) Z.i(this.f47504h)).read(bArr, i10, i11);
        if (read == -1) {
            if (this.f47505i == -1) {
                return -1;
            }
            throw new a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j11 = this.f47505i;
        if (j11 != -1) {
            this.f47505i = j11 - read;
        }
        o(read);
        return read;
    }
}
