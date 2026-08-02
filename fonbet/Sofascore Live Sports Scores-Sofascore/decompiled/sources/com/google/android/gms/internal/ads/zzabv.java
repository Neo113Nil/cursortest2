package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzabv implements zzabp {
    public int a;
    public int b;
    public int c = 0;
    public zzabn[] d = new zzabn[100];

    @Override // com.google.android.gms.internal.ads.zzabp
    public final synchronized void a(zzabn zzabnVar) {
        zzabn[] zzabnVarArr = this.d;
        int i = this.c;
        this.c = i + 1;
        zzabnVarArr[i] = zzabnVar;
        this.b--;
    }

    public final synchronized void b(int i) {
        int i2 = this.a;
        this.a = i;
        if (i < i2) {
            zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final synchronized void c(zzabo zzaboVar) {
        while (zzaboVar != null) {
            zzabn[] zzabnVarArr = this.d;
            int i = this.c;
            this.c = i + 1;
            zzabnVarArr[i] = zzaboVar.zzd();
            this.b--;
            zzaboVar = zzaboVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final synchronized zzabn zza() {
        zzabn zzabnVar;
        try {
            int i = this.b + 1;
            this.b = i;
            int i2 = this.c;
            if (i2 > 0) {
                zzabn[] zzabnVarArr = this.d;
                int i3 = i2 - 1;
                this.c = i3;
                zzabnVar = zzabnVarArr[i3];
                if (zzabnVar == null) {
                    throw null;
                }
                zzabnVarArr[i3] = null;
            } else {
                zzabnVar = new zzabn(new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE]);
                zzabn[] zzabnVarArr2 = this.d;
                int length = zzabnVarArr2.length;
                if (i > length) {
                    this.d = (zzabn[]) Arrays.copyOf(zzabnVarArr2, length + length);
                    return zzabnVar;
                }
            }
            return zzabnVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabp
    public final synchronized void zzd() {
        int i = this.a;
        String str = zzfm.a;
        int max = Math.max(0, ((i + 65535) / C.DEFAULT_BUFFER_SEGMENT_SIZE) - this.b);
        int i2 = this.c;
        if (max >= i2) {
            return;
        }
        Arrays.fill(this.d, max, i2, (Object) null);
        this.c = max;
    }
}
