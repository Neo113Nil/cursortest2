package com.google.android.gms.internal.ads;

import defpackage.btn;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcjb {
    public long a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.google.android.gms.internal.ads.zzinn] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.android.gms.internal.ads.zzinn] */
    public final long a(ByteBuffer byteBuffer) {
        zzavg zzavgVar;
        zzavf zzavfVar;
        long j = this.a;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            zzavb zzavbVar = new zzavb(new btn(duplicate), m.c);
            ArrayList arrayList = zzavbVar.f;
            if (zzavbVar.b != null && zzavbVar.c != zzinh.g) {
                arrayList = new zzinn(arrayList, zzavbVar);
            }
            Iterator it = arrayList.iterator();
            while (true) {
                zzavgVar = null;
                if (!it.hasNext()) {
                    zzavfVar = null;
                    break;
                }
                zzavd zzavdVar = (zzavd) it.next();
                if (zzavdVar instanceof zzavf) {
                    zzavfVar = (zzavf) zzavdVar;
                    break;
                }
            }
            ArrayList arrayList2 = zzavfVar.f;
            if (zzavfVar.b != null && zzavfVar.c != zzinh.g) {
                arrayList2 = new zzinn(arrayList2, zzavfVar);
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                zzavd zzavdVar2 = (zzavd) it2.next();
                if (zzavdVar2 instanceof zzavg) {
                    zzavgVar = (zzavg) zzavdVar2;
                    break;
                }
            }
            long j2 = (zzavgVar.m * 1000) / zzavgVar.l;
            this.a = j2;
            return j2;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
