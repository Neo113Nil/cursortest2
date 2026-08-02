package com.google.android.gms.internal.fido;

import C.C2702w;
import I0.C3173b;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

/* loaded from: classes9.dex */
final class zzht {
    private final Deque zza = new ArrayDeque(16);

    private zzht(boolean z11) {
    }

    public static zzht zza() {
        return new zzht(false);
    }

    private final long zzh() {
        if (this.zza.isEmpty()) {
            return 0L;
        }
        return ((Long) this.zza.peek()).longValue();
    }

    private final void zzi(long j11) {
        this.zza.pop();
        this.zza.push(Long.valueOf(j11));
    }

    public final void zzb() throws IOException {
        if (this.zza.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + this.zza.size() + " scope: " + zzh());
    }

    public final void zzc() throws IOException {
        long zzh = zzh();
        if (zzh >= 0) {
            throw new IOException(C3173b.b(zzh, "expected indefinite length scope but found "));
        }
        if (zzh == -5) {
            throw new IOException("expected a value for dangling key in indefinite-length map");
        }
        this.zza.pop();
    }

    public final void zzd() throws IOException {
        long zzh = zzh();
        if (zzh != -1) {
            if (zzh != -2) {
                return;
            } else {
                zzh = -2;
            }
        }
        throw new IOException(C3173b.b(zzh, "expected non-string scope but found "));
    }

    public final void zze(long j11) throws IOException {
        long zzh = zzh();
        if (zzh != j11) {
            if (zzh != -1) {
                if (zzh != -2) {
                    return;
                } else {
                    zzh = -2;
                }
            }
            StringBuilder d11 = C2702w.d(j11, "expected non-string scope or scope ", " but found ");
            d11.append(zzh);
            throw new IOException(d11.toString());
        }
    }

    public final void zzf() {
        long zzh = zzh();
        if (zzh == 1) {
            this.zza.pop();
            return;
        }
        if (zzh > 1) {
            zzi(zzh - 1);
        } else if (zzh == -4) {
            zzi(-5L);
        } else if (zzh == -5) {
            zzi(-4L);
        }
    }

    public final void zzg(long j11) {
        this.zza.push(Long.valueOf(j11));
    }
}
