package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class onf extends j21 {
    public final Resources e;
    public final String f;
    public Uri g;
    public AssetFileDescriptor h;
    public FileInputStream i;
    public long j;
    public boolean k;

    public onf(Context context) {
        super(false);
        this.e = context.getResources();
        this.f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // defpackage.qe4
    public final void close() {
        this.g = null;
        try {
            try {
                FileInputStream fileInputStream = this.i;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new mnf(2000, null, e);
                    }
                } finally {
                    this.h = null;
                    if (this.k) {
                        this.k = false;
                        d();
                    }
                }
            } catch (IOException e2) {
                throw new mnf(2000, null, e2);
            }
        } catch (Throwable th) {
            this.i = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.h;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.h = null;
                    if (this.k) {
                        this.k = false;
                        d();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new mnf(2000, null, e3);
                }
            } finally {
                this.h = null;
                if (this.k) {
                    this.k = false;
                    d();
                }
            }
        }
    }

    @Override // defpackage.qe4
    public final Uri getUri() {
        return this.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0043, code lost:
    
        if (r7.matches("\\d+") != false) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014c  */
    @Override // defpackage.qe4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long k(we4 we4Var) {
        int parseInt;
        AssetFileDescriptor openRawResourceFd;
        long j;
        Uri uri = we4Var.a;
        long j2 = we4Var.f;
        long j3 = we4Var.e;
        this.g = uri;
        boolean equals = TextUtils.equals(RawResourceDataSource.RAW_RESOURCE_SCHEME, uri.getScheme());
        Resources resources = this.e;
        try {
            try {
                if (!equals) {
                    if (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1) {
                        String lastPathSegment = uri.getLastPathSegment();
                        lastPathSegment.getClass();
                    }
                    if (!TextUtils.equals("android.resource", uri.getScheme())) {
                        throw new mnf(1004, "URI must either use scheme rawresource or android.resource", null);
                    }
                    String path = uri.getPath();
                    path.getClass();
                    if (path.startsWith("/")) {
                        path = path.substring(1);
                    }
                    String host = uri.getHost();
                    parseInt = resources.getIdentifier((TextUtils.isEmpty(host) ? "" : dmi.y(host, ":")).concat(path), "raw", this.f);
                    if (parseInt == 0) {
                        throw new mnf(2005, "Resource not found.", null);
                    }
                    e();
                    openRawResourceFd = resources.openRawResourceFd(parseInt);
                    this.h = openRawResourceFd;
                    if (openRawResourceFd != null) {
                        throw new mnf(2000, dmi.m(uri, "Resource is compressed: "), null);
                    }
                    long length = openRawResourceFd.getLength();
                    FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                    this.i = fileInputStream;
                    try {
                        if (length != -1 && j3 > length) {
                            throw new mnf(2008, null, null);
                        }
                        long startOffset = openRawResourceFd.getStartOffset();
                        long skip = fileInputStream.skip(startOffset + j3) - startOffset;
                        if (skip != j3) {
                            throw new mnf(2008, null, null);
                        }
                        if (length == -1) {
                            FileChannel channel = fileInputStream.getChannel();
                            if (channel.size() == 0) {
                                this.j = -1L;
                                j = -1;
                            } else {
                                j = channel.size() - channel.position();
                                this.j = j;
                                if (j < 0) {
                                    throw new mnf(2008, null, null);
                                }
                            }
                        } else {
                            j = length - skip;
                            this.j = j;
                            if (j < 0) {
                                throw new se4(2008);
                            }
                        }
                        if (j2 != -1) {
                            this.j = j == -1 ? j2 : Math.min(j, j2);
                        }
                        this.k = true;
                        f(we4Var);
                        return j2 != -1 ? j2 : this.j;
                    } catch (mnf e) {
                        throw e;
                    } catch (IOException e2) {
                        throw new mnf(2000, null, e2);
                    }
                }
                openRawResourceFd = resources.openRawResourceFd(parseInt);
                this.h = openRawResourceFd;
                if (openRawResourceFd != null) {
                }
            } catch (Resources.NotFoundException e3) {
                throw new mnf(2005, null, e3);
            }
            String lastPathSegment2 = uri.getLastPathSegment();
            lastPathSegment2.getClass();
            parseInt = Integer.parseInt(lastPathSegment2);
            e();
        } catch (NumberFormatException unused) {
            throw new mnf(1004, "Resource identifier must be an integer.", null);
        }
    }

    @Override // defpackage.fe4, defpackage.ge4
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.j;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new mnf(2000, null, e);
                }
            }
            FileInputStream fileInputStream = this.i;
            int i3 = lik.a;
            int read = fileInputStream.read(bArr, i, i2);
            long j2 = this.j;
            if (read != -1) {
                if (j2 != -1) {
                    this.j = j2 - read;
                }
                b(read);
                return read;
            }
            if (j2 != -1) {
                throw new mnf(2000, "End of stream reached having not read sufficient data.", new EOFException());
            }
        }
        return -1;
    }
}
