package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzck {
    public final zzgxm a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public boolean d;

    public zzck(zzgxm zzgxmVar) {
        this.a = zzgxmVar;
        zzcl zzclVar = zzcl.e;
        this.d = false;
    }

    public final zzcl a(zzcl zzclVar) {
        if (zzclVar.equals(zzcl.e)) {
            throw new zzco("Unhandled input format:", zzclVar);
        }
        int i = 0;
        while (true) {
            zzgxm zzgxmVar = this.a;
            if (i >= zzgxmVar.size()) {
                return zzclVar;
            }
            zzcp zzcpVar = (zzcp) zzgxmVar.get(i);
            zzcl d = zzcpVar.d(zzclVar);
            if (zzcpVar.zzc()) {
                zzguk.f(!d.equals(r0));
                zzclVar = d;
            }
            i++;
        }
    }

    public final boolean b() {
        return !this.b.isEmpty();
    }

    public final boolean c() {
        return this.d && ((zzcp) this.b.get(e())).zzg() && !this.c[e()].hasRemaining();
    }

    public final void d(ByteBuffer byteBuffer) {
        boolean z;
        do {
            int i = 0;
            z = false;
            while (i <= e()) {
                if (!this.c[i].hasRemaining()) {
                    ArrayList arrayList = this.b;
                    zzcp zzcpVar = (zzcp) arrayList.get(i);
                    if (!zzcpVar.zzg()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : zzcp.a;
                        long remaining = byteBuffer2.remaining();
                        zzcpVar.a(byteBuffer2);
                        this.c[i] = zzcpVar.zzf();
                        boolean z2 = true;
                        if (remaining - byteBuffer2.remaining() <= 0 && !this.c[i].hasRemaining()) {
                            z2 = false;
                        }
                        z |= z2;
                    } else if (!this.c[i].hasRemaining() && i < e()) {
                        ((zzcp) arrayList.get(i + 1)).zze();
                    }
                }
                i++;
            }
        } while (z);
    }

    public final int e() {
        return this.c.length - 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzck)) {
            return false;
        }
        zzgxm zzgxmVar = this.a;
        int size = zzgxmVar.size();
        zzgxm zzgxmVar2 = ((zzck) obj).a;
        if (size != zzgxmVar2.size()) {
            return false;
        }
        for (int i = 0; i < zzgxmVar.size(); i++) {
            if (zzgxmVar.get(i) != zzgxmVar2.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
