package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzidq;
import com.google.android.gms.internal.ads.zzidr;
import defpackage.fn0;
import defpackage.iqo;
import defpackage.kqo;
import defpackage.x5n;
import defpackage.yhk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzidq<MessageType extends zzidr<MessageType, BuilderType>, BuilderType extends zzidq<MessageType, BuilderType>> implements zzigv {
    public static void l(Iterable iterable, List list) {
        iterable.getClass();
        if (iterable instanceof zzigh) {
            List zza = ((zzigh) iterable).zza();
            zzigh zzighVar = (zzigh) list;
            int size = list.size();
            for (Object obj : zza) {
                if (obj == null) {
                    int size2 = zzighVar.size() - size;
                    String k = fn0.k(size2, "Element at index ", " is null.", new StringBuilder(String.valueOf(size2).length() + 26));
                    int size3 = zzighVar.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            yhk.s(k);
                            return;
                        }
                        zzighVar.remove(size3);
                    }
                } else if (obj instanceof zziei) {
                    zzighVar.zzb();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    zziei.B(0, bArr.length, bArr);
                    zzighVar.zzb();
                } else {
                    zzighVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof iqo) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size4 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size4);
            } else if (list instanceof kqo) {
                kqo kqoVar = (kqo) list;
                int i = kqoVar.c + size4;
                int length = kqoVar.b.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = x5n.e(length, 3, 2, 1, 10);
                        }
                        kqoVar.b = Arrays.copyOf(kqoVar.b, length);
                    } else {
                        kqoVar.b = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size5 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    m(size5, list);
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
                m(size5, list);
                throw null;
            }
            list.add(obj3);
        }
    }

    public static void m(int i, List list) {
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

    @Override // 
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public abstract zzifg clone();
}
