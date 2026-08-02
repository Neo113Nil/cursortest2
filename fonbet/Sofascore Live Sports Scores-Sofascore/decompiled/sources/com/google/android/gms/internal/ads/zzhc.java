package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.dko;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhc {
    public final zzhb a;
    public final ArrayDeque b = new ArrayDeque();
    public final ArrayDeque c = new ArrayDeque();
    public final PriorityQueue d = new PriorityQueue();
    public int e = -1;
    public dko f;

    public zzhc(zzhb zzhbVar) {
        this.a = zzhbVar;
    }

    public final void a(int i) {
        zzguk.f(i >= 0);
        this.e = i;
        c(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r8 < r0.b) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(long j, zzeu zzeuVar) {
        if (j != C.TIME_UNSET) {
            int i = this.e;
            if (i != 0) {
                PriorityQueue priorityQueue = this.d;
                if (i != -1 && priorityQueue.size() >= this.e) {
                    dko dkoVar = (dko) priorityQueue.peek();
                    String str = zzfm.a;
                }
                ArrayDeque arrayDeque = this.b;
                zzeu zzeuVar2 = arrayDeque.isEmpty() ? new zzeu() : (zzeu) arrayDeque.pop();
                zzeuVar2.y(zzeuVar.B());
                System.arraycopy(zzeuVar.a, zzeuVar.b, zzeuVar2.a, 0, zzeuVar2.B());
                dko dkoVar2 = this.f;
                if (dkoVar2 != null && j == dkoVar2.b) {
                    dkoVar2.a.add(zzeuVar2);
                    return;
                }
                ArrayDeque arrayDeque2 = this.c;
                dko dkoVar3 = arrayDeque2.isEmpty() ? new dko() : (dko) arrayDeque2.pop();
                ArrayList arrayList = dkoVar3.a;
                zzguk.f(arrayList.isEmpty());
                dkoVar3.b = j;
                arrayList.add(zzeuVar2);
                priorityQueue.add(dkoVar3);
                this.f = dkoVar3;
                int i2 = this.e;
                if (i2 != -1) {
                    c(i2);
                    return;
                }
                return;
            }
        } else {
            j = -9223372036854775807L;
        }
        this.a.g(j, zzeuVar);
    }

    public final void c(int i) {
        ArrayList arrayList;
        while (true) {
            PriorityQueue priorityQueue = this.d;
            if (priorityQueue.size() <= i) {
                return;
            }
            dko dkoVar = (dko) priorityQueue.poll();
            String str = zzfm.a;
            int i2 = 0;
            while (true) {
                arrayList = dkoVar.a;
                if (i2 >= arrayList.size()) {
                    break;
                }
                this.a.g(dkoVar.b, (zzeu) arrayList.get(i2));
                this.b.push((zzeu) arrayList.get(i2));
                i2++;
            }
            arrayList.clear();
            dko dkoVar2 = this.f;
            if (dkoVar2 != null && dkoVar2.b == dkoVar.b) {
                this.f = null;
            }
            this.c.push(dkoVar);
        }
    }
}
