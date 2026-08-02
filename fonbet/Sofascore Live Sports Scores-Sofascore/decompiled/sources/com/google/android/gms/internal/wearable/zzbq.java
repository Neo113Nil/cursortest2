package com.google.android.gms.internal.wearable;

import com.google.android.gms.internal.wearable.zzbq;
import com.google.android.gms.internal.wearable.zzbr;
import defpackage.b6o;
import defpackage.fn0;
import defpackage.i6o;
import defpackage.x5n;
import defpackage.yhk;
import defpackage.zrn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbq<MessageType extends zzbr<MessageType, BuilderType>, BuilderType extends zzbq<MessageType, BuilderType>> implements zzek {
    public static void b(int i, List list) {
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

    public static void h(Iterable iterable, List list) {
        iterable.getClass();
        if (iterable instanceof zzdx) {
            List zza = ((zzdx) iterable).zza();
            zzdx zzdxVar = (zzdx) list;
            int size = list.size();
            for (Object obj : zza) {
                if (obj == null) {
                    int size2 = zzdxVar.size() - size;
                    String k = fn0.k(size2, "Element at index ", " is null.", new StringBuilder(String.valueOf(size2).length() + 26));
                    int size3 = zzdxVar.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            yhk.s(k);
                            return;
                        }
                        zzdxVar.remove(size3);
                    }
                } else if (obj instanceof zzcg) {
                    zzdxVar.zzb();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    zrn zrnVar = zzcg.b;
                    if (length != 0) {
                        try {
                            zzcg.r(0, length, bArr.length);
                            byte[] bArr2 = new byte[length];
                            System.arraycopy(bArr, 0, bArr2, 0, length);
                            new zrn(bArr2);
                        } catch (zzdv e) {
                            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
                        }
                    }
                    zzdxVar.zzb();
                } else {
                    zzdxVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof b6o) {
            list.addAll((Collection) iterable);
            return;
        }
        int size4 = ((Collection) iterable).size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size4);
        } else if (list instanceof i6o) {
            i6o i6oVar = (i6o) list;
            int i = i6oVar.c + size4;
            int length2 = i6oVar.b.length;
            if (i > length2) {
                if (length2 != 0) {
                    while (length2 < i) {
                        length2 = x5n.e(length2, 3, 2, 1, 10);
                    }
                    i6oVar.b = Arrays.copyOf(i6oVar.b, length2);
                } else {
                    i6oVar.b = new Object[Math.max(i, 10)];
                }
            }
        }
        int size5 = list.size();
        if (!(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    b(size5, list);
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
                b(size5, list);
                throw null;
            }
            list.add(obj3);
        }
    }

    @Override // 
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public abstract zzdb clone();
}
