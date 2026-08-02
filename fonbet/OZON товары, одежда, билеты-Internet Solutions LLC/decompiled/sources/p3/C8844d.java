package p3;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Objects;
import m3.N;

/* renamed from: p3.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8844d extends AbstractC8842b {

    /* renamed from: a, reason: collision with root package name */
    private final ContentResolver f80049a;

    /* renamed from: b, reason: collision with root package name */
    private Uri f80050b;

    /* renamed from: c, reason: collision with root package name */
    private AssetFileDescriptor f80051c;

    /* renamed from: d, reason: collision with root package name */
    private FileInputStream f80052d;

    /* renamed from: e, reason: collision with root package name */
    private long f80053e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f80054f;

    /* renamed from: p3.d$a */
    public static class a extends C8847g {
    }

    public C8844d(Context context) {
        super(false);
        this.f80049a = context.getContentResolver();
    }

    @Override // p3.InterfaceC8846f
    public final void close() throws a {
        this.f80050b = null;
        try {
            try {
                FileInputStream fileInputStream = this.f80052d;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f80052d = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f80051c;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e11) {
                        throw new a(2000, e11);
                    }
                } finally {
                    this.f80051c = null;
                    if (this.f80054f) {
                        this.f80054f = false;
                        transferEnded();
                    }
                }
            } catch (IOException e12) {
                throw new a(2000, e12);
            }
        } catch (Throwable th2) {
            this.f80052d = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f80051c;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f80051c = null;
                    if (this.f80054f) {
                        this.f80054f = false;
                        transferEnded();
                    }
                    throw th2;
                } catch (IOException e13) {
                    throw new a(2000, e13);
                }
            } finally {
                this.f80051c = null;
                if (this.f80054f) {
                    this.f80054f = false;
                    transferEnded();
                }
            }
        }
    }

    @Override // p3.InterfaceC8846f
    public final Uri getUri() {
        return this.f80050b;
    }

    @Override // p3.InterfaceC8846f
    public final long open(i iVar) throws a {
        int i11;
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            try {
                Uri normalizeScheme = iVar.f80066a.normalizeScheme();
                this.f80050b = normalizeScheme;
                transferInitializing(iVar);
                boolean equals = Objects.equals(normalizeScheme.getScheme(), "content");
                ContentResolver contentResolver = this.f80049a;
                if (equals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(normalizeScheme, "r");
                }
                this.f80051c = openAssetFileDescriptor;
                if (openAssetFileDescriptor == null) {
                    i11 = 2000;
                    try {
                        throw new a(2000, new IOException("Could not open file descriptor for: " + normalizeScheme));
                    } catch (IOException e11) {
                        e = e11;
                        if (e instanceof FileNotFoundException) {
                            i11 = 2005;
                        }
                        throw new a(i11, e);
                    }
                }
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.f80052d = fileInputStream;
                long j11 = iVar.f80071f;
                if (length != -1 && j11 > length) {
                    throw new a(2008, null);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j11) - startOffset;
                if (skip != j11) {
                    throw new a(2008, null);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f80053e = -1L;
                    } else {
                        long position = size - channel.position();
                        this.f80053e = position;
                        if (position < 0) {
                            throw new a(2008, null);
                        }
                    }
                } else {
                    long j12 = length - skip;
                    this.f80053e = j12;
                    if (j12 < 0) {
                        throw new a(2008, null);
                    }
                }
                long j13 = iVar.f80072g;
                if (j13 != -1) {
                    long j14 = this.f80053e;
                    this.f80053e = j14 == -1 ? j13 : Math.min(j14, j13);
                }
                this.f80054f = true;
                transferStarted(iVar);
                return j13 != -1 ? j13 : this.f80053e;
            } catch (a e12) {
                throw e12;
            }
        } catch (IOException e13) {
            e = e13;
            i11 = 2000;
        }
    }

    @Override // j3.InterfaceC7268j
    public final int read(byte[] bArr, int i11, int i12) throws a {
        if (i12 == 0) {
            return 0;
        }
        long j11 = this.f80053e;
        if (j11 != 0) {
            if (j11 != -1) {
                try {
                    i12 = (int) Math.min(j11, i12);
                } catch (IOException e11) {
                    throw new a(2000, e11);
                }
            }
            FileInputStream fileInputStream = this.f80052d;
            int i13 = N.f74289a;
            int read = fileInputStream.read(bArr, i11, i12);
            if (read != -1) {
                long j12 = this.f80053e;
                if (j12 != -1) {
                    this.f80053e = j12 - read;
                }
                bytesTransferred(read);
                return read;
            }
        }
        return -1;
    }
}
