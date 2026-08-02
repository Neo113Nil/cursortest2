package androidx.media3.datasource;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;
import xsna.evk;
import xsna.gc6;
import xsna.i6n0;
import xsna.pzl;
import xsna.y2r0;

/* loaded from: classes12.dex */
public final class RawResourceDataSource extends gc6 {
    public final Context r;

    @Nullable
    public evk s;

    @Nullable
    public AssetFileDescriptor t;

    @Nullable
    public FileInputStream u;
    public long v;
    public boolean w;

    public static class RawResourceDataSourceException extends DataSourceException {
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.r = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // androidx.media3.datasource.a
    public final void close() throws RawResourceDataSourceException {
        this.s = null;
        try {
            try {
                FileInputStream fileInputStream = this.u;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.u = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.t;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new RawResourceDataSourceException(null, e, 2000);
                    }
                } finally {
                    this.t = null;
                    if (this.w) {
                        this.w = false;
                        transferEnded();
                    }
                }
            } catch (IOException e2) {
                throw new RawResourceDataSourceException(null, e2, 2000);
            }
        } catch (Throwable th) {
            this.u = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.t;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.t = null;
                    if (this.w) {
                        this.w = false;
                        transferEnded();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new RawResourceDataSourceException(null, e3, 2000);
                }
            } finally {
                this.t = null;
                if (this.w) {
                    this.w = false;
                    transferEnded();
                }
            }
        }
    }

    @Override // androidx.media3.datasource.a
    @Nullable
    public final Uri getUri() {
        evk evkVar = this.s;
        if (evkVar != null) {
            return evkVar.a;
        }
        return null;
    }

    @Override // androidx.media3.datasource.a
    public final long open(evk evkVar) throws RawResourceDataSourceException {
        Resources resourcesForApplication;
        int parseInt;
        int i;
        Resources resources;
        this.s = evkVar;
        transferInitializing(evkVar);
        Uri uri = evkVar.a;
        long j = evkVar.h;
        long j2 = evkVar.g;
        Uri normalizeScheme = uri.normalizeScheme();
        boolean equals = TextUtils.equals(com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource.RAW_RESOURCE_SCHEME, normalizeScheme.getScheme());
        Context context = this.r;
        if (equals) {
            resources = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new RawResourceDataSourceException("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
            }
            try {
                i = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
                throw new RawResourceDataSourceException("Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String path = normalizeScheme.getPath();
            path.getClass();
            if (path.startsWith(DomExceptionUtils.SEPARATOR)) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(normalizeScheme.getHost()) ? context.getPackageName() : normalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new RawResourceDataSourceException("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    parseInt = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                parseInt = resourcesForApplication.getIdentifier(pzl.b(packageName, StringUtils.PROCESS_POSTFIX_DELIMITER, path), "raw", null);
                if (parseInt == 0) {
                    throw new RawResourceDataSourceException("Resource not found.", null, 2005);
                }
            }
            i = parseInt;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(i);
            if (openRawResourceFd == null) {
                throw new RawResourceDataSourceException(i6n0.a(normalizeScheme, "Resource is compressed: "), null, 2000);
            }
            this.t = openRawResourceFd;
            long length = openRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.t.getFileDescriptor());
            this.u = fileInputStream;
            try {
                if (length != -1 && j2 > length) {
                    throw new RawResourceDataSourceException(null, null, 2008);
                }
                long startOffset = this.t.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (skip != j2) {
                    throw new RawResourceDataSourceException(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.v = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.v = size;
                        if (size < 0) {
                            throw new RawResourceDataSourceException(null, null, 2008);
                        }
                    }
                } else {
                    long j3 = length - skip;
                    this.v = j3;
                    if (j3 < 0) {
                        throw new DataSourceException(2008);
                    }
                }
                if (j != -1) {
                    long j4 = this.v;
                    this.v = j4 == -1 ? j : Math.min(j4, j);
                }
                this.w = true;
                transferStarted(evkVar);
                return j != -1 ? j : this.v;
            } catch (RawResourceDataSourceException e2) {
                throw e2;
            } catch (IOException e3) {
                throw new RawResourceDataSourceException(null, e3, 2000);
            }
        } catch (Resources.NotFoundException e4) {
            throw new RawResourceDataSourceException(null, e4, 2005);
        }
    }

    @Override // xsna.suk
    public final int read(byte[] bArr, int i, int i2) throws RawResourceDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.v;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new RawResourceDataSourceException(null, e, 2000);
                }
            }
            FileInputStream fileInputStream = this.u;
            String str = y2r0.a;
            int read = fileInputStream.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.v;
                if (j2 != -1) {
                    this.v = j2 - read;
                }
                bytesTransferred(read);
                return read;
            }
            if (this.v != -1) {
                throw new RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
        }
        return -1;
    }
}
