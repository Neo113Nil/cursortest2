package com.google.android.gms.internal.auth_blockstore;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.auth.blockstore.StoreBytesData;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.exc0;
import xsna.f5o0;
import xsna.ouf0;
import xsna.wf7;

/* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.4.0 */
/* loaded from: classes.dex */
public final class zzaa extends b implements wf7 {
    private static final a.g zza;
    private static final a.AbstractC0111a zzb;
    private static final a zzc;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        zzu zzuVar = new zzu();
        zzb = zzuVar;
        zzc = new a("Blockstore.API", zzuVar, gVar);
    }

    public zzaa(@NonNull Context context) {
        super(context, (a<a.d.c>) zzc, a.d.U6, b.a.c);
    }

    @Override // xsna.wf7
    public final Task<Boolean> deleteBytes(final DeleteBytesRequest deleteBytesRequest) {
        exc0.j(deleteBytesRequest, "DeleteBytesRequest cannot be null");
        f5o0.a a = f5o0.a();
        a.d = new Feature[]{zzab.zzg};
        a.a = new ouf0() { // from class: com.google.android.gms.internal.auth_blockstore.zzp
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                ((zzg) ((zzf) obj).getService()).zza(new zzy(zzaa.this, (TaskCompletionSource) obj2), deleteBytesRequest);
            }
        };
        a.c = true;
        a.b = false;
        a.e = 1669;
        return doWrite(a.a());
    }

    @Override // xsna.wf7
    public final Task<Boolean> isEndToEndEncryptionAvailable() {
        f5o0.a a = f5o0.a();
        a.d = new Feature[]{zzab.zze};
        a.a = new ouf0() { // from class: com.google.android.gms.internal.auth_blockstore.zzr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                ((zzg) ((zzf) obj).getService()).zzb(new zzz(zzaa.this, (TaskCompletionSource) obj2));
            }
        };
        a.c = true;
        a.b = false;
        a.e = 1651;
        return doRead(a.a());
    }

    public final Task<byte[]> retrieveBytes() {
        f5o0.a a = f5o0.a();
        a.d = new Feature[]{zzab.zza};
        a.a = new ouf0() { // from class: com.google.android.gms.internal.auth_blockstore.zzt
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                ((zzg) ((zzf) obj).getService()).zzc(new zzx(zzaa.this, (TaskCompletionSource) obj2));
            }
        };
        a.c = true;
        a.b = false;
        a.e = 1570;
        return doRead(a.a());
    }

    @Override // xsna.wf7
    public final Task<Integer> storeBytes(final StoreBytesData storeBytesData) {
        f5o0.a a = f5o0.a();
        a.d = new Feature[]{zzab.zzd, zzab.zzf};
        a.a = new ouf0() { // from class: com.google.android.gms.internal.auth_blockstore.zzq
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                ((zzg) ((zzf) obj).getService()).zze(new zzv(zzaa.this, (TaskCompletionSource) obj2), storeBytesData);
            }
        };
        a.e = 1645;
        a.c = true;
        a.b = false;
        return doWrite(a.a());
    }

    @Override // xsna.wf7
    public final Task<RetrieveBytesResponse> retrieveBytes(final RetrieveBytesRequest retrieveBytesRequest) {
        exc0.j(retrieveBytesRequest, "RetrieveBytesRequest cannot be null");
        f5o0.a a = f5o0.a();
        a.d = new Feature[]{zzab.zzh};
        a.a = new ouf0() { // from class: com.google.android.gms.internal.auth_blockstore.zzs
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.ouf0
            public final void accept(Object obj, Object obj2) {
                ((zzg) ((zzf) obj).getService()).zzd(new zzw(zzaa.this, (TaskCompletionSource) obj2), retrieveBytesRequest);
            }
        };
        a.c = true;
        a.b = false;
        a.e = 1668;
        return doRead(a.a());
    }
}
