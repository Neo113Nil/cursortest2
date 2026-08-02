package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m extends h {

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f5135c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f5136d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.firebase.messaging.x f5137e;

    public m(m mVar) {
        super(mVar.f5067a);
        ArrayList arrayList = new ArrayList(mVar.f5135c.size());
        this.f5135c = arrayList;
        arrayList.addAll(mVar.f5135c);
        ArrayList arrayList2 = new ArrayList(mVar.f5136d.size());
        this.f5136d = arrayList2;
        arrayList2.addAll(mVar.f5136d);
        this.f5137e = mVar.f5137e;
    }

    @Override // com.google.android.gms.internal.measurement.h, com.google.android.gms.internal.measurement.n
    public final n i() {
        return new m(this);
    }

    @Override // com.google.android.gms.internal.measurement.h
    public final n j(com.google.firebase.messaging.x xVar, List list) {
        r rVar;
        com.google.firebase.messaging.x W = this.f5137e.W();
        t tVar = (t) W.f6183b;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.f5135c;
            int size = arrayList.size();
            rVar = n.S;
            if (i5 >= size) {
                break;
            }
            if (i5 < list.size()) {
                W.Z((String) arrayList.get(i5), ((t) xVar.f6183b).c(xVar, (n) list.get(i5)));
            } else {
                W.Z((String) arrayList.get(i5), rVar);
            }
            i5++;
        }
        Iterator it = this.f5136d.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            n c2 = tVar.c(W, nVar);
            if (c2 instanceof o) {
                c2 = tVar.c(W, nVar);
            }
            if (c2 instanceof f) {
                return ((f) c2).f5036a;
            }
        }
        return rVar;
    }

    public m(String str, ArrayList arrayList, List list, com.google.firebase.messaging.x xVar) {
        super(str);
        this.f5135c = new ArrayList();
        this.f5137e = xVar;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f5135c.add(((n) it.next()).h());
            }
        }
        this.f5136d = new ArrayList(list);
    }
}
