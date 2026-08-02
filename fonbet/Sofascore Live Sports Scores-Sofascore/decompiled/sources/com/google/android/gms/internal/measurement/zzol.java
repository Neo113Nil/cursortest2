package com.google.android.gms.internal.measurement;

import defpackage.g0p;
import defpackage.pff;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzol implements zzoh {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final ConcurrentHashMap b;
    public final ConcurrentHashMap c;

    public zzol() {
        new ConcurrentHashMap();
        this.b = new ConcurrentHashMap();
        new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(zzacr zzacrVar, Set set, String str) {
        g0p[] g0pVarArr;
        g0p[] g0pVarArr2;
        byte b = 0;
        if (!set.isEmpty() && !this.a.getAndSet(true)) {
            zzbu.a().a.add(0, new pff(b, 25));
        }
        final byte[] s = zzacrVar.s();
        this.b.compute(str, new BiFunction() { // from class: f0p
            @Override // java.util.function.BiFunction
            public final /* synthetic */ Object apply(Object obj, Object obj2) {
                byte[] bArr = (byte[]) obj2;
                byte[] bArr2 = s;
                return Arrays.equals(bArr, bArr2) ? bArr : bArr2;
            }
        });
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AtomicReference atomicReference = (AtomicReference) this.c.putIfAbsent((String) it.next(), new AtomicReference(new g0p(str, s)));
            if (atomicReference != null) {
                while (true) {
                    Object obj = atomicReference.get();
                    if (obj instanceof g0p) {
                        g0p g0pVar = (g0p) obj;
                        String str2 = g0pVar.a;
                        if (str.equals(str2)) {
                            g0pVar.a(s);
                            break;
                        }
                        g0p g0pVar2 = new g0p(str, s);
                        g0pVarArr2 = str.compareTo(str2) < 0 ? new g0p[]{g0pVar2, g0pVar} : new g0p[]{g0pVar, g0pVar2};
                        while (!atomicReference.compareAndSet(obj, g0pVarArr2)) {
                            if (atomicReference.get() != obj) {
                                break;
                            }
                        }
                    } else {
                        g0p[] g0pVarArr3 = (g0p[]) obj;
                        int binarySearch = Arrays.binarySearch(g0pVarArr3, str);
                        if (binarySearch >= 0) {
                            g0pVarArr3[binarySearch].a(s);
                            break;
                        }
                        int i = ~binarySearch;
                        int length = g0pVarArr3.length;
                        int i2 = length + 1;
                        int i3 = length - i;
                        if (i3 == 0) {
                            g0pVarArr = (g0p[]) Arrays.copyOf(g0pVarArr3, i2);
                        } else {
                            g0p[] g0pVarArr4 = new g0p[i2];
                            System.arraycopy(g0pVarArr3, 0, g0pVarArr4, 0, i);
                            System.arraycopy(g0pVarArr3, i, g0pVarArr4, i + 1, i3);
                            g0pVarArr = g0pVarArr4;
                        }
                        g0pVarArr[i] = new g0p(str, s);
                        g0pVarArr2 = g0pVarArr;
                        while (!atomicReference.compareAndSet(obj, g0pVarArr2)) {
                        }
                    }
                }
            }
        }
    }
}
