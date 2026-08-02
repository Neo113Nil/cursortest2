package com.google.android.gms.internal.ads;

import android.net.Uri;
import defpackage.kep;
import defpackage.mio;
import defpackage.u0a;
import defpackage.ueo;
import defpackage.wt3;
import java.io.EOFException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzws implements zzyh {
    public final zzagn a;
    public zzagh b;
    public zzafy c;

    public zzws(zzagn zzagnVar) {
        this.a = zzagnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final void a(long j, long j2) {
        zzagh zzaghVar = this.b;
        zzaghVar.getClass();
        zzaghVar.a(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final int b(zzahh zzahhVar) {
        zzafy zzafyVar;
        zzagh zzaghVar = this.b;
        if (zzaghVar == null || (zzafyVar = this.c) == null) {
            throw null;
        }
        return zzaghVar.e(zzafyVar, zzahhVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
    
        if (r1.d != r11) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0051, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0072, code lost:
    
        if (r1.d != r11) goto L23;
     */
    @Override // com.google.android.gms.internal.ads.zzyh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(zzhs zzhsVar, Uri uri, Map map, long j, long j2, kep kepVar) {
        zzagh zzaghVar;
        zzafy zzafyVar = new zzafy(zzhsVar, j, j2);
        this.c = zzafyVar;
        if (this.b != null) {
            return;
        }
        zzagh[] d = this.a.d(uri, map);
        int length = d.length;
        mio mioVar = zzgxm.b;
        u0a.S(length, "expectedSize");
        zzgxj zzgxjVar = new zzgxj(length);
        boolean z = true;
        if (length == 1) {
            zzaghVar = d[0];
            this.b = zzaghVar;
        } else {
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                zzagh zzaghVar2 = d[i];
                try {
                } catch (EOFException unused) {
                    if (this.b == null) {
                    }
                } catch (Throwable th) {
                    if (this.b == null && zzafyVar.d != j) {
                        z = false;
                    }
                    zzguk.f(z);
                    zzafyVar.f = 0;
                    throw th;
                }
                if (zzaghVar2.c(zzafyVar)) {
                    this.b = zzaghVar2;
                    zzafyVar.f = 0;
                    break;
                }
                zzgxjVar.d(zzaghVar2.zzb());
                if (this.b == null) {
                }
                boolean z2 = true;
                zzguk.f(z2);
                zzafyVar.f = 0;
                i++;
            }
            zzagh zzaghVar3 = this.b;
            if (zzaghVar3 == null) {
                Iterator it = zzgym.b(zzgxm.y(d), ueo.e).iterator();
                StringBuilder sb = new StringBuilder();
                zzgue.a(sb, it, ", ");
                String sb2 = sb.toString();
                throw new zzzs(wt3.m("None of the available extractors (", sb2, new StringBuilder(sb2.length() + 58), ") could read the stream."), zzgxjVar.f());
            }
            zzaghVar = zzaghVar3;
        }
        zzaghVar.d(kepVar);
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final void zzb() {
        zzagh zzaghVar = this.b;
        if (zzaghVar != null) {
            zzaghVar.zzf();
            this.b = null;
        }
        this.c = null;
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final void zzc() {
        zzagh zzaghVar = this.b;
        if (zzaghVar != null && (zzaghVar instanceof zzalb)) {
            ((zzalb) zzaghVar).q = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyh
    public final long zzd() {
        zzafy zzafyVar = this.c;
        if (zzafyVar != null) {
            return zzafyVar.d;
        }
        return -1L;
    }
}
