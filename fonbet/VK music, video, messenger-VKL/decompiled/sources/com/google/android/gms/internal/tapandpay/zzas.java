package com.google.android.gms.internal.tapandpay;

import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes12.dex */
public abstract class zzas<E> extends zzao<E> implements Set<E> {

    @NullableDecl
    private transient zzan<E> zza;

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzas) && zza() && ((zzas) obj).zza() && hashCode() != obj.hashCode()) {
            return false;
        }
        return zzav.zza(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            E next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzao, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public boolean zza() {
        return false;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzao
    public final zzan<E> zzc() {
        zzan<E> zzanVar = this.zza;
        if (zzanVar != null) {
            return zzanVar;
        }
        zzan<E> zzg = zzg();
        this.zza = zzg;
        return zzg;
    }

    public zzan<E> zzg() {
        return zzan.zza(toArray());
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static <E> com.google.android.gms.internal.tapandpay.zzas<E> zza(E r13, E r14) {
        /*
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r13
            r13 = 1
            r1[r13] = r14
        L9:
            if (r0 == 0) goto L70
            if (r0 == r13) goto L68
            int r14 = zza(r0)
            java.lang.Object[] r6 = new java.lang.Object[r14]
            int r7 = r14 + (-1)
            r3 = r2
            r5 = r3
            r8 = r5
        L18:
            if (r3 >= r0) goto L43
            r4 = r1[r3]
            java.lang.Object r4 = com.google.android.gms.internal.tapandpay.zzau.zza(r4, r3)
            int r9 = r4.hashCode()
            int r10 = com.google.android.gms.internal.tapandpay.zzal.zza(r9)
        L28:
            r11 = r10 & r7
            r12 = r6[r11]
            if (r12 != 0) goto L37
            int r10 = r8 + 1
            r1[r8] = r4
            r6[r11] = r4
            int r5 = r5 + r9
            r8 = r10
            goto L40
        L37:
            boolean r11 = r12.equals(r4)
            if (r11 != 0) goto L40
            int r10 = r10 + 1
            goto L28
        L40:
            int r3 = r3 + 1
            goto L18
        L43:
            r3 = 0
            java.util.Arrays.fill(r1, r8, r0, r3)
            if (r8 != r13) goto L51
            r13 = r1[r2]
            com.google.android.gms.internal.tapandpay.zzay r14 = new com.google.android.gms.internal.tapandpay.zzay
            r14.<init>(r13, r5)
            return r14
        L51:
            int r0 = zza(r8)
            int r14 = r14 / 2
            if (r0 >= r14) goto L5b
            r0 = r8
            goto L9
        L5b:
            if (r8 >= r13) goto L61
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r8)
        L61:
            r4 = r1
            com.google.android.gms.internal.tapandpay.zzaw r3 = new com.google.android.gms.internal.tapandpay.zzaw
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L68:
            r13 = r1[r2]
            com.google.android.gms.internal.tapandpay.zzay r14 = new com.google.android.gms.internal.tapandpay.zzay
            r14.<init>(r13)
            return r14
        L70:
            com.google.android.gms.internal.tapandpay.zzaw<java.lang.Object> r13 = com.google.android.gms.internal.tapandpay.zzaw.zza
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.tapandpay.zzas.zza(java.lang.Object, java.lang.Object):com.google.android.gms.internal.tapandpay.zzas");
    }

    private static int zza(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            if (max < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }
}
