package com.google.android.gms.internal.ads;

import defpackage.m6n;
import defpackage.yhk;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzinn extends AbstractList {
    public static final zzino c = zzino.b(zzinn.class);
    public final List a;
    public final zzinh b;

    public zzinn(ArrayList arrayList, zzinh zzinhVar) {
        this.a = arrayList;
        this.b = zzinhVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        List list = this.a;
        if (list.size() > i) {
            return list.get(i);
        }
        zzinh zzinhVar = this.b;
        if (zzinhVar.hasNext()) {
            list.add(zzinhVar.next());
            return get(i);
        }
        yhk.d();
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new m6n(this, 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        zzino zzinoVar = c;
        zzinoVar.a("potentially expensive size() call");
        zzinoVar.a("blowup running");
        while (true) {
            zzinh zzinhVar = this.b;
            boolean hasNext = zzinhVar.hasNext();
            List list = this.a;
            if (!hasNext) {
                return list.size();
            }
            list.add(zzinhVar.next());
        }
    }
}
