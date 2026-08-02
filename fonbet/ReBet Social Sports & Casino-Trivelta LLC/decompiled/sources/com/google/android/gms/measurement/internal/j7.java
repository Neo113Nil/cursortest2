package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzhf;
import com.google.android.gms.internal.measurement.zzhg;
import com.google.android.gms.internal.measurement.zzhp;
import com.google.android.gms.internal.measurement.zzhq;
import com.google.android.gms.internal.measurement.zzih;
import com.google.android.gms.internal.measurement.zzii;
import com.google.android.gms.internal.measurement.zzij;
import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzpu;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import z.C6900a;

/* loaded from: classes2.dex */
public final class j7 {

    /* renamed from: a, reason: collision with root package name */
    public String f34066a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f34067b;

    /* renamed from: c, reason: collision with root package name */
    public zzii f34068c;

    /* renamed from: d, reason: collision with root package name */
    public BitSet f34069d;

    /* renamed from: e, reason: collision with root package name */
    public BitSet f34070e;

    /* renamed from: f, reason: collision with root package name */
    public Map f34071f;

    /* renamed from: g, reason: collision with root package name */
    public Map f34072g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C3238e f34073h;

    public /* synthetic */ j7(C3238e c3238e, String str, zzii zziiVar, BitSet bitSet, BitSet bitSet2, Map map, Map map2, byte[] bArr) {
        Objects.requireNonNull(c3238e);
        this.f34073h = c3238e;
        this.f34066a = str;
        this.f34069d = bitSet;
        this.f34070e = bitSet2;
        this.f34071f = map;
        this.f34072g = new C6900a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f34072g.put(num, arrayList);
        }
        this.f34067b = false;
        this.f34068c = zziiVar;
    }

    public final void a(AbstractC3222c abstractC3222c) {
        int a10 = abstractC3222c.a();
        if (abstractC3222c.f33951c != null) {
            this.f34070e.set(a10, true);
        }
        Boolean bool = abstractC3222c.f33952d;
        if (bool != null) {
            this.f34069d.set(a10, bool.booleanValue());
        }
        if (abstractC3222c.f33953e != null) {
            Map map = this.f34071f;
            Integer valueOf = Integer.valueOf(a10);
            Long l10 = (Long) map.get(valueOf);
            long longValue = abstractC3222c.f33953e.longValue() / 1000;
            if (l10 == null || longValue > l10.longValue()) {
                this.f34071f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (abstractC3222c.f33954f != null) {
            Map map2 = this.f34072g;
            Integer valueOf2 = Integer.valueOf(a10);
            List list = (List) map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.f34072g.put(valueOf2, list);
            }
            if (abstractC3222c.b()) {
                list.clear();
            }
            zzpu.zza();
            C3298l3 c3298l3 = this.f34073h.f33578a;
            C3286k w10 = c3298l3.w();
            String str = this.f34066a;
            Z1 z12 = AbstractC3209a2.f33813G0;
            if (w10.H(str, z12) && abstractC3222c.c()) {
                list.clear();
            }
            zzpu.zza();
            if (!c3298l3.w().H(this.f34066a, z12)) {
                list.add(Long.valueOf(abstractC3222c.f33954f.longValue() / 1000));
                return;
            }
            Long valueOf3 = Long.valueOf(abstractC3222c.f33954f.longValue() / 1000);
            if (list.contains(valueOf3)) {
                return;
            }
            list.add(valueOf3);
        }
    }

    public final zzhg b(int i10) {
        ArrayList arrayList;
        List list;
        zzhf zzh = zzhg.zzh();
        zzh.zza(i10);
        zzh.zzd(this.f34067b);
        zzii zziiVar = this.f34068c;
        if (zziiVar != null) {
            zzh.zzc(zziiVar);
        }
        zzih zzi = zzii.zzi();
        zzi.zzc(X6.Q(this.f34069d));
        zzi.zza(X6.Q(this.f34070e));
        Map map = this.f34071f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : this.f34071f.keySet()) {
                int intValue = num.intValue();
                Long l10 = (Long) this.f34071f.get(num);
                if (l10 != null) {
                    zzhp zze = zzhq.zze();
                    zze.zza(intValue);
                    zze.zzb(l10.longValue());
                    arrayList2.add((zzhq) zze.zzbc());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            zzi.zze(arrayList);
        }
        Map map2 = this.f34072g;
        if (map2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.f34072g.keySet()) {
                zzij zzf = zzik.zzf();
                zzf.zza(num2.intValue());
                List list2 = (List) this.f34072g.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    zzf.zzb(list2);
                }
                arrayList3.add((zzik) zzf.zzbc());
            }
            list = arrayList3;
        }
        zzi.zzg(list);
        zzh.zzb(zzi);
        return (zzhg) zzh.zzbc();
    }

    public final /* synthetic */ BitSet c() {
        return this.f34069d;
    }

    public /* synthetic */ j7(C3238e c3238e, String str, byte[] bArr) {
        Objects.requireNonNull(c3238e);
        this.f34073h = c3238e;
        this.f34066a = str;
        this.f34067b = true;
        this.f34069d = new BitSet();
        this.f34070e = new BitSet();
        this.f34071f = new C6900a();
        this.f34072g = new C6900a();
    }
}
