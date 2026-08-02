package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f5263a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.messaging.x f5264b;

    public u(h hVar, com.google.firebase.messaging.x xVar) {
        this.f5263a = hVar;
        this.f5264b = xVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        n nVar = (n) obj;
        n nVar2 = (n) obj2;
        if (nVar instanceof r) {
            return !(nVar2 instanceof r) ? 1 : 0;
        }
        if (nVar2 instanceof r) {
            return -1;
        }
        h hVar = this.f5263a;
        return hVar == null ? nVar.h().compareTo(nVar2.h()) : (int) ci.c.m0(hVar.j(this.f5264b, Arrays.asList(nVar, nVar2)).d().doubleValue());
    }
}
