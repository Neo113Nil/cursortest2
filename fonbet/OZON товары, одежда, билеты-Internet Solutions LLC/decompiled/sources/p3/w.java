package p3;

import K1.G;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;
import m3.N;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* loaded from: classes8.dex */
public final class w extends AbstractC8842b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f80126a;

    /* renamed from: b, reason: collision with root package name */
    private i f80127b;

    /* renamed from: c, reason: collision with root package name */
    private AssetFileDescriptor f80128c;

    /* renamed from: d, reason: collision with root package name */
    private FileInputStream f80129d;

    /* renamed from: e, reason: collision with root package name */
    private long f80130e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f80131f;

    public static class a extends C8847g {
    }

    public w(Context context) {
        super(false);
        this.f80126a = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i11) {
        return Uri.parse("rawresource:///" + i11);
    }

    @Override // p3.InterfaceC8846f
    public final void close() throws a {
        this.f80127b = null;
        try {
            try {
                FileInputStream fileInputStream = this.f80129d;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f80129d = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f80128c;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e11) {
                        throw new a(2000, e11, null);
                    }
                } finally {
                    this.f80128c = null;
                    if (this.f80131f) {
                        this.f80131f = false;
                        transferEnded();
                    }
                }
            } catch (IOException e12) {
                throw new a(2000, e12, null);
            }
        } catch (Throwable th2) {
            this.f80129d = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f80128c;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f80128c = null;
                    if (this.f80131f) {
                        this.f80131f = false;
                        transferEnded();
                    }
                    throw th2;
                } catch (IOException e13) {
                    throw new a(2000, e13, null);
                }
            } finally {
                this.f80128c = null;
                if (this.f80131f) {
                    this.f80131f = false;
                    transferEnded();
                }
            }
        }
    }

    @Override // p3.InterfaceC8846f
    public final Uri getUri() {
        i iVar = this.f80127b;
        if (iVar != null) {
            return iVar.f80066a;
        }
        return null;
    }

    @Override // p3.InterfaceC8846f
    public final long open(i iVar) throws a {
        Resources resourcesForApplication;
        int parseInt;
        int i11;
        Resources resources;
        this.f80127b = iVar;
        transferInitializing(iVar);
        Uri normalizeScheme = iVar.f80066a.normalizeScheme();
        boolean equals = TextUtils.equals("rawresource", normalizeScheme.getScheme());
        Context context = this.f80126a;
        if (equals) {
            resources = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new a(2000, null, "rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            try {
                i11 = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new a(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, null, "Resource identifier must be an integer.");
            }
        } else {
            if (!TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
                throw new a(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, null, "Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only android.resource is supported.");
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
                } catch (PackageManager.NameNotFoundException e11) {
                    throw new a(2005, e11, "Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.");
                }
            }
            if (path.matches("\\d+")) {
                try {
                    parseInt = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new a(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, null, "Resource identifier must be an integer.");
                }
            } else {
                parseInt = resourcesForApplication.getIdentifier(G.g.c(packageName, ProductContainerDTO.RATIO_DELIMITER, path), "raw", null);
                if (parseInt == 0) {
                    throw new a(2005, null, "Resource not found.");
                }
            }
            i11 = parseInt;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(i11);
            if (openRawResourceFd == null) {
                throw new a(2000, null, G.b(normalizeScheme, "Resource is compressed: "));
            }
            this.f80128c = openRawResourceFd;
            long length = openRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.f80128c.getFileDescriptor());
            this.f80129d = fileInputStream;
            long j11 = iVar.f80071f;
            try {
                if (length != -1 && j11 > length) {
                    throw new a(2008, null, null);
                }
                long startOffset = this.f80128c.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j11) - startOffset;
                if (skip != j11) {
                    throw new a(2008, null, null);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.f80130e = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.f80130e = size;
                        if (size < 0) {
                            throw new a(2008, null, null);
                        }
                    }
                } else {
                    long j12 = length - skip;
                    this.f80130e = j12;
                    if (j12 < 0) {
                        throw new C8847g(2008);
                    }
                }
                long j13 = iVar.f80072g;
                if (j13 != -1) {
                    long j14 = this.f80130e;
                    this.f80130e = j14 == -1 ? j13 : Math.min(j14, j13);
                }
                this.f80131f = true;
                transferStarted(iVar);
                return j13 != -1 ? j13 : this.f80130e;
            } catch (a e12) {
                throw e12;
            } catch (IOException e13) {
                throw new a(2000, e13, null);
            }
        } catch (Resources.NotFoundException e14) {
            throw new a(2005, e14, null);
        }
    }

    @Override // j3.InterfaceC7268j
    public final int read(byte[] bArr, int i11, int i12) throws a {
        if (i12 == 0) {
            return 0;
        }
        long j11 = this.f80130e;
        if (j11 != 0) {
            if (j11 != -1) {
                try {
                    i12 = (int) Math.min(j11, i12);
                } catch (IOException e11) {
                    throw new a(2000, e11, null);
                }
            }
            FileInputStream fileInputStream = this.f80129d;
            int i13 = N.f74289a;
            int read = fileInputStream.read(bArr, i11, i12);
            if (read != -1) {
                long j12 = this.f80130e;
                if (j12 != -1) {
                    this.f80130e = j12 - read;
                }
                bytesTransferred(read);
                return read;
            }
            if (this.f80130e != -1) {
                throw new a(2000, new EOFException(), "End of stream reached having not read sufficient data.");
            }
        }
        return -1;
    }
}
