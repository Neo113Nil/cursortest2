package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource;
import defpackage.me4;
import defpackage.wt3;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzio extends zzhk {
    public final Context e;
    public zzhw f;
    public AssetFileDescriptor g;
    public FileInputStream h;
    public long i;
    public boolean j;

    public zzio(Context context) {
        super(false);
        this.e = context.getApplicationContext();
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final long a(zzhw zzhwVar) {
        Resources resourcesForApplication;
        int parseInt;
        Resources resources;
        long j;
        this.f = zzhwVar;
        k(zzhwVar);
        Uri uri = zzhwVar.a;
        long j2 = zzhwVar.c;
        Uri normalizeScheme = uri.normalizeScheme();
        boolean equals = TextUtils.equals(RawResourceDataSource.RAW_RESOURCE_SCHEME, normalizeScheme.getScheme());
        Context context = this.e;
        if (equals) {
            resources = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                int size = pathSegments.size();
                throw new zzin(2000, me4.g(size, "rawresource:// URI must have exactly one path element, found ", new StringBuilder(String.valueOf(size).length() + 61)), null);
            }
            try {
                parseInt = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new zzin(1004, "Resource identifier must be an integer.", null);
            }
        } else {
            if (!TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
                String scheme = normalizeScheme.getScheme();
                throw new zzin(1004, wt3.m("Unsupported URI scheme (", scheme, new StringBuilder(String.valueOf(scheme).length() + 62), "). Only android.resource is supported."), null);
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
                    throw new zzin(2005, "Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    parseInt = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new zzin(1004, "Resource identifier must be an integer.", null);
                }
            } else {
                parseInt = resourcesForApplication.getIdentifier(wt3.m(packageName, ":", new StringBuilder(packageName.length() + 1 + path.length()), path), "raw", null);
                if (parseInt == 0) {
                    throw new zzin(2005, "Resource not found.", null);
                }
            }
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(parseInt);
            if (openRawResourceFd == null) {
                throw new zzin(2000, "Resource is compressed: ".concat(String.valueOf(normalizeScheme)), null);
            }
            this.g = openRawResourceFd;
            long length = openRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.g.getFileDescriptor());
            this.h = fileInputStream;
            try {
                if (length != -1 && j2 > length) {
                    throw new zzin(2008, null, null);
                }
                long startOffset = this.g.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (skip != j2) {
                    throw new zzin(2008, null, null);
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
                            throw new zzin(2008, null, null);
                        }
                    }
                } else {
                    j = length - skip;
                    this.i = j;
                    if (j < 0) {
                        throw new zzht();
                    }
                }
                long j3 = zzhwVar.d;
                if (j3 != -1) {
                    this.i = j == -1 ? j3 : Math.min(j, j3);
                }
                this.j = true;
                l(zzhwVar);
                return j3 != -1 ? j3 : this.i;
            } catch (zzin e2) {
                throw e2;
            } catch (IOException e3) {
                throw new zzin(2000, null, e3);
            }
        } catch (Resources.NotFoundException e4) {
            throw new zzin(2005, null, e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int b(int i, int i2, byte[] bArr) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.i;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new zzin(2000, null, e);
                }
            }
            FileInputStream fileInputStream = this.h;
            String str = zzfm.a;
            int read = fileInputStream.read(bArr, i, i2);
            long j2 = this.i;
            if (read != -1) {
                if (j2 != -1) {
                    this.i = j2 - read;
                }
                m(read);
                return read;
            }
            if (j2 != -1) {
                throw new zzin(2000, "End of stream reached having not read sufficient data.", new EOFException());
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final Uri zzc() {
        zzhw zzhwVar = this.f;
        if (zzhwVar != null) {
            return zzhwVar.a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void zzd() {
        this.f = null;
        try {
            try {
                try {
                    FileInputStream fileInputStream = this.h;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    this.h = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.g = null;
                        if (this.j) {
                            this.j = false;
                            n();
                        }
                    } catch (IOException e) {
                        throw new zzin(2000, null, e);
                    }
                } catch (IOException e2) {
                    throw new zzin(2000, null, e2);
                }
            } catch (Throwable th) {
                this.h = null;
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.g = null;
                    if (this.j) {
                        this.j = false;
                        n();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new zzin(2000, null, e3);
                }
            }
        } catch (Throwable th2) {
            this.g = null;
            if (this.j) {
                this.j = false;
                n();
            }
            throw th2;
        }
    }
}
