package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzaca;
import com.google.android.gms.internal.measurement.zzacb;
import defpackage.fn0;
import defpackage.gdn;
import defpackage.ldn;
import defpackage.x5n;
import defpackage.yhk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzaca<MessageType extends zzacb<MessageType, BuilderType>, BuilderType extends zzaca<MessageType, BuilderType>> implements zzafb {
    public static void h(int i, List list) {
        int size = list.size() - i;
        String k = fn0.k(size, "Element at index ", " is null.", new StringBuilder(String.valueOf(size).length() + 26));
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(k);
            }
            list.remove(size2);
        }
    }

    public static void j(Iterable iterable, List list) {
        iterable.getClass();
        if (iterable instanceof zzaen) {
            List zza = ((zzaen) iterable).zza();
            zzaen zzaenVar = (zzaen) list;
            int size = list.size();
            for (Object obj : zza) {
                if (obj == null) {
                    int size2 = zzaenVar.size() - size;
                    String k = fn0.k(size2, "Element at index ", " is null.", new StringBuilder(String.valueOf(size2).length() + 26));
                    int size3 = zzaenVar.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            yhk.s(k);
                            return;
                        }
                        zzaenVar.remove(size3);
                    }
                } else if (obj instanceof zzacr) {
                    zzaenVar.zzb();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    zzacr.q(0, bArr.length, bArr);
                    zzaenVar.zzb();
                } else {
                    zzaenVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof gdn) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size4 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size4);
            } else if (list instanceof ldn) {
                ldn ldnVar = (ldn) list;
                int i = ldnVar.c + size4;
                int length = ldnVar.b.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = x5n.e(length, 3, 2, 1, 10);
                        }
                        ldnVar.b = Arrays.copyOf(ldnVar.b, length);
                    } else {
                        ldnVar.b = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size5 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    h(size5, list);
                    throw null;
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size6 = list2.size();
        for (int i2 = 0; i2 < size6; i2++) {
            Object obj3 = list2.get(i2);
            if (obj3 == null) {
                h(size5, list);
                throw null;
            }
            list.add(obj3);
        }
    }

    @Override // 
    public abstract zzadp i();
}
