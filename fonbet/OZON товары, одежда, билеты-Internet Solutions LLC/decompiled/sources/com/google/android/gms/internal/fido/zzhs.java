package com.google.android.gms.internal.fido;

import B0.A0;
import Ej.b;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* loaded from: classes9.dex */
public final class zzhs implements Closeable {
    private final InputStream zza;
    private zzhr zzb;
    private final byte[] zzc = new byte[8];
    private final zzht zzd = zzht.zza();

    public zzhs(InputStream inputStream) {
        this.zza = inputStream;
    }

    private final long zzh() throws IOException {
        if (this.zzb.zza() < 24) {
            long zza = this.zzb.zza();
            this.zzb = null;
            return zza;
        }
        if (this.zzb.zza() == 24) {
            int read = this.zza.read();
            if (read == -1) {
                throw new EOFException();
            }
            this.zzb = null;
            return read & 255;
        }
        if (this.zzb.zza() == 25) {
            zzk(this.zzc, 2);
            byte[] bArr = this.zzc;
            return ((bArr[0] & 255) << 8) | (bArr[1] & 255);
        }
        if (this.zzb.zza() == 26) {
            zzk(this.zzc, 4);
            byte[] bArr2 = this.zzc;
            long j11 = bArr2[0];
            long j12 = bArr2[1];
            return (bArr2[3] & 255) | ((j12 & 255) << 16) | ((j11 & 255) << 24) | ((bArr2[2] & 255) << 8);
        }
        if (this.zzb.zza() != 27) {
            throw new IOException(A0.a(this.zzb.zza(), this.zzb.zzc(), "invalid additional information ", " for major type "));
        }
        zzk(this.zzc, 8);
        byte[] bArr3 = this.zzc;
        long j13 = bArr3[0];
        long j14 = bArr3[1];
        long j15 = bArr3[2];
        long j16 = bArr3[3];
        return (bArr3[7] & 255) | ((j15 & 255) << 40) | ((j13 & 255) << 56) | ((j14 & 255) << 48) | ((j16 & 255) << 32) | ((bArr3[4] & 255) << 24) | ((bArr3[5] & 255) << 16) | ((bArr3[6] & 255) << 8);
    }

    private final void zzi() throws IOException {
        zzd();
        if (this.zzb.zza() == 31) {
            throw new IllegalStateException(b.a(this.zzb.zza(), "expected definite length but found "));
        }
    }

    private final void zzj(byte b11) throws IOException {
        zzd();
        if (this.zzb.zzb() != b11) {
            throw new IllegalStateException(A0.a((b11 >> 5) & 7, this.zzb.zzc(), "expected major type ", " but found "));
        }
    }

    private final void zzk(byte[] bArr, int i11) throws IOException {
        int i12 = 0;
        while (i12 != i11) {
            int read = this.zza.read(bArr, i12, i11 - i12);
            if (read == -1) {
                throw new EOFException();
            }
            i12 += read;
        }
        this.zzb = null;
    }

    private final byte[] zzl() throws IOException {
        zzi();
        long zzh = zzh();
        if (zzh < 0 || zzh > 2147483647L) {
            throw new UnsupportedOperationException("the maximum supported byte/text string length is 2147483647 bytes");
        }
        if (this.zza.available() < zzh) {
            throw new EOFException();
        }
        int i11 = (int) zzh;
        byte[] bArr = new byte[i11];
        zzk(bArr, i11);
        return bArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza.close();
        this.zzd.zzb();
    }

    public final long zza() throws IOException {
        zzj(Byte.MIN_VALUE);
        zzi();
        long zzh = zzh();
        if (zzh < 0) {
            throw new UnsupportedOperationException("the maximum supported array length is 9223372036854775807");
        }
        if (zzh > 0) {
            this.zzd.zzg(zzh);
        }
        return zzh;
    }

    public final long zzb() throws IOException {
        boolean z11;
        zzd();
        if (this.zzb.zzb() == 0) {
            z11 = true;
        } else {
            if (this.zzb.zzb() != 32) {
                throw new IllegalStateException(b.a(this.zzb.zzc(), "expected major type 0 or 1 but found "));
            }
            z11 = false;
        }
        long zzh = zzh();
        if (zzh >= 0) {
            return z11 ? zzh : ~zzh;
        }
        throw new UnsupportedOperationException("the maximum supported unsigned/negative integer is 9223372036854775807");
    }

    public final long zzc() throws IOException {
        zzj((byte) -96);
        zzi();
        long zzh = zzh();
        if (zzh < 0 || zzh > 4611686018427387903L) {
            throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
        }
        if (zzh > 0) {
            this.zzd.zzg(zzh + zzh);
        }
        return zzh;
    }

    public final zzhr zzd() throws IOException {
        if (this.zzb == null) {
            int read = this.zza.read();
            if (read == -1) {
                this.zzd.zzb();
                return null;
            }
            zzhr zzhrVar = new zzhr(read);
            this.zzb = zzhrVar;
            byte zzb = zzhrVar.zzb();
            if (zzb != Byte.MIN_VALUE && zzb != -96 && zzb != -64) {
                if (zzb != -32) {
                    if (zzb != 0 && zzb != 32) {
                        if (zzb == 64) {
                            this.zzd.zze(-1L);
                        } else {
                            if (zzb != 96) {
                                throw new IllegalStateException(b.a(this.zzb.zzc(), "invalid major type: "));
                            }
                            this.zzd.zze(-2L);
                        }
                        this.zzd.zzf();
                    }
                } else if (this.zzb.zza() == 31) {
                    this.zzd.zzc();
                }
            }
            this.zzd.zzd();
            this.zzd.zzf();
        }
        return this.zzb;
    }

    public final String zze() throws IOException {
        zzj((byte) 96);
        return new String(zzl(), StandardCharsets.UTF_8);
    }

    public final boolean zzf() throws IOException {
        zzj((byte) -32);
        if (this.zzb.zza() > 24) {
            throw new IllegalStateException("expected simple value");
        }
        int zzh = (int) zzh();
        if (zzh == 20) {
            return false;
        }
        if (zzh == 21) {
            return true;
        }
        throw new IllegalStateException("expected FALSE or TRUE");
    }

    public final byte[] zzg() throws IOException {
        zzj((byte) 64);
        return zzl();
    }
}
