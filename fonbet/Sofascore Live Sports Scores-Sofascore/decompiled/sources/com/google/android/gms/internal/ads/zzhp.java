package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhp extends zzhk {
    public final ContentResolver e;
    public Uri f;
    public AssetFileDescriptor g;
    public FileInputStream h;
    public long i;
    public boolean j;

    public zzhp(Context context) {
        super(false);
        this.e = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final long a(zzhw zzhwVar) {
        int i;
        AssetFileDescriptor openAssetFileDescriptor;
        long j;
        try {
            try {
                Uri uri = zzhwVar.a;
                long j2 = zzhwVar.c;
                Uri normalizeScheme = uri.normalizeScheme();
                this.f = normalizeScheme;
                k(zzhwVar);
                boolean equals = Objects.equals(normalizeScheme.getScheme(), HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT);
                ContentResolver contentResolver = this.e;
                if (equals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(normalizeScheme, "r");
                }
                this.g = openAssetFileDescriptor;
                if (openAssetFileDescriptor == null) {
                    String valueOf = String.valueOf(normalizeScheme);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 36);
                    sb.append("Could not open file descriptor for: ");
                    sb.append(valueOf);
                    i = 2000;
                    try {
                        throw new zzho(2000, new IOException(sb.toString()));
                    } catch (IOException e) {
                        e = e;
                        throw new zzho(true != (e instanceof FileNotFoundException) ? i : 2005, e);
                    }
                }
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.h = fileInputStream;
                if (length != -1 && j2 > length) {
                    throw new zzho(2008, null);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (skip != j2) {
                    throw new zzho(2008, null);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.i = -1L;
                        j = -1;
                    } else {
                        j = size - channel.position();
                        this.i = j;
                        if (j < 0) {
                            throw new zzho(2008, null);
                        }
                    }
                } else {
                    j = length - skip;
                    this.i = j;
                    if (j < 0) {
                        throw new zzho(2008, null);
                    }
                }
                long j3 = zzhwVar.d;
                if (j3 != -1) {
                    this.i = j == -1 ? j3 : Math.min(j, j3);
                }
                this.j = true;
                l(zzhwVar);
                return j3 != -1 ? j3 : this.i;
            } catch (IOException e2) {
                e = e2;
                i = 2000;
            }
        } catch (zzho e3) {
            throw e3;
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
                    throw new zzho(2000, e);
                }
            }
            FileInputStream fileInputStream = this.h;
            String str = zzfm.a;
            int read = fileInputStream.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.i;
                if (j2 != -1) {
                    this.i = j2 - read;
                }
                m(read);
                return read;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final Uri zzc() {
        return this.f;
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
                        throw new zzho(2000, e);
                    }
                } catch (IOException e2) {
                    throw new zzho(2000, e2);
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
                    throw new zzho(2000, e3);
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
