package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pnf extends k21 {
    public final Context e;
    public xe4 f;
    public AssetFileDescriptor g;
    public FileInputStream h;
    public long i;
    public boolean j;

    public pnf(Context context) {
        super(false);
        this.e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // defpackage.re4
    public final long b(xe4 xe4Var) {
        Resources resourcesForApplication;
        int parseInt;
        int i;
        Resources resources;
        long j;
        this.f = xe4Var;
        e();
        Uri uri = xe4Var.a;
        long j2 = xe4Var.g;
        long j3 = xe4Var.f;
        Uri normalizeScheme = uri.normalizeScheme();
        boolean equals = TextUtils.equals(RawResourceDataSource.RAW_RESOURCE_SCHEME, normalizeScheme.getScheme());
        Context context = this.e;
        if (equals) {
            resources = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new nnf(2000, "rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null);
            }
            try {
                i = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new nnf(1004, "Resource identifier must be an integer.", null);
            }
        } else {
            if (!TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
                throw new nnf(1004, "Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only android.resource is supported.", null);
            }
            String path = normalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(normalizeScheme.getHost()) ? context.getPackageName() : normalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new nnf(2005, "Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    parseInt = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new nnf(1004, "Resource identifier must be an integer.", null);
                }
            } else {
                parseInt = resourcesForApplication.getIdentifier(lnb.o(packageName, ":", path), "raw", null);
                if (parseInt == 0) {
                    throw new nnf(2005, "Resource not found.", null);
                }
            }
            i = parseInt;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(i);
            if (openRawResourceFd == null) {
                throw new nnf(2000, dmi.m(normalizeScheme, "Resource is compressed: "), null);
            }
            this.g = openRawResourceFd;
            long length = openRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.g.getFileDescriptor());
            this.h = fileInputStream;
            try {
                if (length != -1 && j3 > length) {
                    throw new nnf(2008, null, null);
                }
                long startOffset = this.g.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j3) - startOffset;
                if (skip != j3) {
                    throw new nnf(2008, null, null);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.i = -1L;
                        j = -1;
                    } else {
                        j = channel.size() - channel.position();
                        this.i = j;
                        if (j < 0) {
                            throw new nnf(2008, null, null);
                        }
                    }
                } else {
                    j = length - skip;
                    this.i = j;
                    if (j < 0) {
                        throw new te4(2008);
                    }
                }
                if (j2 != -1) {
                    this.i = j == -1 ? j2 : Math.min(j, j2);
                }
                this.j = true;
                g(xe4Var);
                return j2 != -1 ? j2 : this.i;
            } catch (nnf e2) {
                throw e2;
            } catch (IOException e3) {
                throw new nnf(2000, null, e3);
            }
        } catch (Resources.NotFoundException e4) {
            throw new nnf(2005, null, e4);
        }
    }

    @Override // defpackage.re4
    public final void close() {
        this.f = null;
        try {
            try {
                FileInputStream fileInputStream = this.h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new nnf(2000, null, e);
                    }
                } finally {
                    this.g = null;
                    if (this.j) {
                        this.j = false;
                        d();
                    }
                }
            } catch (IOException e2) {
                throw new nnf(2000, null, e2);
            }
        } catch (Throwable th) {
            this.h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.g = null;
                    if (this.j) {
                        this.j = false;
                        d();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new nnf(2000, null, e3);
                }
            } finally {
                this.g = null;
                if (this.j) {
                    this.j = false;
                    d();
                }
            }
        }
    }

    @Override // defpackage.re4
    public final Uri getUri() {
        xe4 xe4Var = this.f;
        if (xe4Var != null) {
            return xe4Var.a;
        }
        return null;
    }

    @Override // defpackage.ge4
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.i;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new nnf(2000, null, e);
                }
            }
            FileInputStream fileInputStream = this.h;
            String str = nik.a;
            int read = fileInputStream.read(bArr, i, i2);
            long j2 = this.i;
            if (read != -1) {
                if (j2 != -1) {
                    this.i = j2 - read;
                }
                c(read);
                return read;
            }
            if (j2 != -1) {
                throw new nnf(2000, "End of stream reached having not read sufficient data.", new EOFException());
            }
        }
        return -1;
    }
}
